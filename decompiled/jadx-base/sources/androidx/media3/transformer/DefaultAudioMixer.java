package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultAudioMixer implements androidx.media3.transformer.AudioMixer {
    private static final int DEFAULT_BUFFER_SIZE_MS = 500;
    private int bufferSizeFrames;
    private final boolean clipFloatOutput;
    private long endPosition;
    private long inputLimit;
    private long maxPositionOfRemovedSources;
    private long mixerStartTimeUs;
    private androidx.media3.transformer.DefaultAudioMixer.MixingBuffer[] mixingBuffers;
    private int nextSourceId;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat;
    private long outputPosition;
    private final boolean outputSilenceWithNoSources;
    private final android.util.SparseArray<androidx.media3.transformer.DefaultAudioMixer.SourceInfo> sources;

    public static final class Factory implements androidx.media3.transformer.AudioMixer.Factory {
        private final boolean clipFloatOutput;
        private final boolean outputSilenceWithNoSources;

        public Factory() {
            this(false, true);
        }

        public Factory(boolean z, boolean z2) {
            this.outputSilenceWithNoSources = z;
            this.clipFloatOutput = z2;
        }

        @Override // androidx.media3.transformer.AudioMixer.Factory
        public androidx.media3.transformer.DefaultAudioMixer create() {
            return new androidx.media3.transformer.DefaultAudioMixer(this.outputSilenceWithNoSources, this.clipFloatOutput);
        }
    }

    private DefaultAudioMixer(boolean z, boolean z2) {
        this.outputSilenceWithNoSources = z;
        this.clipFloatOutput = z2;
        this.sources = new android.util.SparseArray<>();
        this.outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.bufferSizeFrames = -1;
        this.mixingBuffers = new androidx.media3.transformer.DefaultAudioMixer.MixingBuffer[0];
        this.mixerStartTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.inputLimit = -1L;
        this.endPosition = Long.MAX_VALUE;
        if (z) {
            this.maxPositionOfRemovedSources = Long.MAX_VALUE;
        }
    }

    @Override // androidx.media3.transformer.AudioMixer
    public void configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, int i, long j) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        androidx.media3.common.util.Assertions.checkState(this.outputAudioFormat.equals(androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET), "Audio mixer already configured.");
        if (i == -1) {
            i = 500;
        }
        androidx.media3.common.util.Assertions.checkArgument(i > 0);
        if (!androidx.media3.common.audio.AudioMixingUtil.canMix(audioFormat)) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException("Can not mix to this AudioFormat.", audioFormat);
        }
        this.outputAudioFormat = audioFormat;
        this.bufferSizeFrames = (i * audioFormat.sampleRate) / 1000;
        this.mixerStartTimeUs = j;
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_AUDIO_MIXER, androidx.media3.effect.DebugTraceUtil.EVENT_OUTPUT_FORMAT, j, "%s", audioFormat);
        this.mixingBuffers = new androidx.media3.transformer.DefaultAudioMixer.MixingBuffer[]{allocateMixingBuffer(0L), allocateMixingBuffer(this.bufferSizeFrames)};
        updateInputFrameLimit();
    }

    @Override // androidx.media3.transformer.AudioMixer
    public void setEndTimeUs(long j) {
        checkStateIsConfigured();
        androidx.media3.common.util.Assertions.checkArgument(j >= this.mixerStartTimeUs, "End time must be at least the configured start time.");
        this.endPosition = androidx.media3.common.util.Util.durationUsToSampleCount(j - this.mixerStartTimeUs, this.outputAudioFormat.sampleRate);
        updateInputFrameLimit();
    }

    @Override // androidx.media3.transformer.AudioMixer
    public boolean supportsSourceAudioFormat(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        checkStateIsConfigured();
        return androidx.media3.common.audio.AudioMixingUtil.canMix(audioFormat, this.outputAudioFormat);
    }

    @Override // androidx.media3.transformer.AudioMixer
    public int addSource(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, long j) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        checkStateIsConfigured();
        if (!supportsSourceAudioFormat(audioFormat)) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException("Can not add source. MixerFormat=" + this.outputAudioFormat, audioFormat);
        }
        long jDurationUsToSampleCount = androidx.media3.common.util.Util.durationUsToSampleCount(j - this.mixerStartTimeUs, audioFormat.sampleRate);
        int i = this.nextSourceId;
        this.nextSourceId = i + 1;
        this.sources.append(i, new androidx.media3.transformer.DefaultAudioMixer.SourceInfo(audioFormat, androidx.media3.common.audio.ChannelMixingMatrix.create(audioFormat.channelCount, this.outputAudioFormat.channelCount), jDurationUsToSampleCount));
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_AUDIO_MIXER, androidx.media3.effect.DebugTraceUtil.EVENT_REGISTER_NEW_INPUT_STREAM, j, "source(%s):%s", java.lang.Integer.valueOf(i), audioFormat);
        return i;
    }

    @Override // androidx.media3.transformer.AudioMixer
    public boolean hasSource(int i) {
        checkStateIsConfigured();
        return androidx.media3.common.util.Util.contains(this.sources, i);
    }

    @Override // androidx.media3.transformer.AudioMixer
    public void setSourceVolume(int i, float f) {
        checkStateIsConfigured();
        androidx.media3.common.util.Assertions.checkArgument(f >= 0.0f, "Volume must be non-negative.");
        getSourceById(i).setVolume(f);
    }

    @Override // androidx.media3.transformer.AudioMixer
    public void removeSource(int i) {
        checkStateIsConfigured();
        this.maxPositionOfRemovedSources = java.lang.Math.max(this.maxPositionOfRemovedSources, getSourceById(i).position);
        this.sources.delete(i);
    }

    @Override // androidx.media3.transformer.AudioMixer
    public void queueInput(int i, java.nio.ByteBuffer byteBuffer) {
        checkStateIsConfigured();
        if (byteBuffer.hasRemaining()) {
            androidx.media3.transformer.DefaultAudioMixer.SourceInfo sourceById = getSourceById(i);
            if (sourceById.position >= this.inputLimit) {
                return;
            }
            long jMin = java.lang.Math.min(sourceById.getPositionAfterBuffer(byteBuffer), this.inputLimit);
            if (sourceById.getChannelMixingMatrix().isZero()) {
                sourceById.discardTo(byteBuffer, jMin);
                return;
            }
            long j = sourceById.position;
            long j2 = this.outputPosition;
            if (j < j2) {
                sourceById.discardTo(byteBuffer, java.lang.Math.min(jMin, j2));
                if (sourceById.position == jMin) {
                    return;
                }
            }
            for (androidx.media3.transformer.DefaultAudioMixer.MixingBuffer mixingBuffer : this.mixingBuffers) {
                if (sourceById.position < mixingBuffer.limit) {
                    mixingBuffer.buffer.position(mixingBuffer.buffer.position() + (((int) (sourceById.position - mixingBuffer.position)) * this.outputAudioFormat.bytesPerFrame));
                    sourceById.mixTo(byteBuffer, java.lang.Math.min(jMin, mixingBuffer.limit), mixingBuffer.buffer, this.outputAudioFormat);
                    mixingBuffer.buffer.reset();
                    if (sourceById.position == jMin) {
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.media3.transformer.AudioMixer
    public java.nio.ByteBuffer getOutput() {
        checkStateIsConfigured();
        if (isEnded()) {
            return androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        }
        long jMin = this.endPosition;
        if (this.sources.size() == 0) {
            jMin = java.lang.Math.min(jMin, this.maxPositionOfRemovedSources);
        }
        for (int i = 0; i < this.sources.size(); i++) {
            jMin = java.lang.Math.min(jMin, this.sources.valueAt(i).position);
        }
        if (jMin <= this.outputPosition) {
            return androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        }
        androidx.media3.transformer.DefaultAudioMixer.MixingBuffer mixingBuffer = this.mixingBuffers[0];
        long jMin2 = java.lang.Math.min(jMin, mixingBuffer.limit);
        java.nio.ByteBuffer byteBufferDuplicate = mixingBuffer.buffer.duplicate();
        byteBufferDuplicate.position(((int) (this.outputPosition - mixingBuffer.position)) * this.outputAudioFormat.bytesPerFrame).limit(((int) (jMin2 - mixingBuffer.position)) * this.outputAudioFormat.bytesPerFrame);
        java.nio.ByteBuffer byteBufferOrder = byteBufferDuplicate.slice().order(java.nio.ByteOrder.nativeOrder());
        if (jMin2 == mixingBuffer.limit) {
            androidx.media3.transformer.DefaultAudioMixer.MixingBuffer[] mixingBufferArr = this.mixingBuffers;
            androidx.media3.transformer.DefaultAudioMixer.MixingBuffer mixingBuffer2 = mixingBufferArr[1];
            mixingBufferArr[0] = mixingBuffer2;
            mixingBufferArr[1] = allocateMixingBuffer(mixingBuffer2.limit);
        }
        this.outputPosition = jMin2;
        updateInputFrameLimit();
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_AUDIO_MIXER, androidx.media3.effect.DebugTraceUtil.EVENT_PRODUCED_OUTPUT, androidx.media3.common.C.TIME_UNSET, "bytesOutput=%s", java.lang.Integer.valueOf(byteBufferOrder.remaining()));
        return byteBufferOrder;
    }

    @Override // androidx.media3.transformer.AudioMixer
    public boolean isEnded() {
        checkStateIsConfigured();
        long j = this.outputPosition;
        return j >= this.endPosition || (j >= this.maxPositionOfRemovedSources && this.sources.size() == 0);
    }

    @Override // androidx.media3.transformer.AudioMixer
    public void reset() {
        this.sources.clear();
        this.nextSourceId = 0;
        this.outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.bufferSizeFrames = -1;
        this.mixingBuffers = new androidx.media3.transformer.DefaultAudioMixer.MixingBuffer[0];
        this.mixerStartTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.inputLimit = -1L;
        this.outputPosition = 0L;
        this.endPosition = Long.MAX_VALUE;
        this.maxPositionOfRemovedSources = this.outputSilenceWithNoSources ? Long.MAX_VALUE : 0L;
    }

    private void checkStateIsConfigured() {
        androidx.media3.common.util.Assertions.checkState(!this.outputAudioFormat.equals(androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET), "Audio mixer is not configured.");
    }

    private androidx.media3.transformer.DefaultAudioMixer.MixingBuffer allocateMixingBuffer(long j) {
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(this.bufferSizeFrames * this.outputAudioFormat.bytesPerFrame).order(java.nio.ByteOrder.nativeOrder());
        byteBufferOrder.mark();
        return new androidx.media3.transformer.DefaultAudioMixer.MixingBuffer(byteBufferOrder, j, j + ((long) this.bufferSizeFrames));
    }

    private void updateInputFrameLimit() {
        this.inputLimit = java.lang.Math.min(this.endPosition, this.outputPosition + ((long) this.bufferSizeFrames));
    }

    private androidx.media3.transformer.DefaultAudioMixer.SourceInfo getSourceById(int i) {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.sources, i), "Source not found.");
        return this.sources.get(i);
    }

    private static class MixingBuffer {
        public final java.nio.ByteBuffer buffer;
        public final long limit;
        public final long position;

        public MixingBuffer(java.nio.ByteBuffer byteBuffer, long j, long j2) {
            this.buffer = byteBuffer;
            this.position = j;
            this.limit = j2;
        }
    }

    private final class SourceInfo {
        private final androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat;
        private final androidx.media3.common.audio.ChannelMixingMatrix baseChannelMixingMatrix;
        private androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix;
        public long position;

        public SourceInfo(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix, long j) {
            this.audioFormat = audioFormat;
            this.baseChannelMixingMatrix = channelMixingMatrix;
            this.position = j;
            this.channelMixingMatrix = channelMixingMatrix;
        }

        public androidx.media3.common.audio.ChannelMixingMatrix getChannelMixingMatrix() {
            return this.channelMixingMatrix;
        }

        public void setVolume(float f) {
            this.channelMixingMatrix = this.baseChannelMixingMatrix.scaleBy(f);
        }

        public long getPositionAfterBuffer(java.nio.ByteBuffer byteBuffer) {
            return this.position + ((long) (byteBuffer.remaining() / this.audioFormat.bytesPerFrame));
        }

        public void discardTo(java.nio.ByteBuffer byteBuffer, long j) {
            androidx.media3.common.util.Assertions.checkArgument(j >= this.position);
            byteBuffer.position(byteBuffer.position() + (((int) (j - this.position)) * this.audioFormat.bytesPerFrame));
            this.position = j;
        }

        public void mixTo(java.nio.ByteBuffer byteBuffer, long j, java.nio.ByteBuffer byteBuffer2, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
            androidx.media3.common.util.Assertions.checkArgument(j >= this.position);
            androidx.media3.common.audio.AudioMixingUtil.mix(byteBuffer, this.audioFormat, byteBuffer2, audioFormat, this.channelMixingMatrix, (int) (j - this.position), true, androidx.media3.transformer.DefaultAudioMixer.this.clipFloatOutput);
            this.position = j;
        }
    }
}
