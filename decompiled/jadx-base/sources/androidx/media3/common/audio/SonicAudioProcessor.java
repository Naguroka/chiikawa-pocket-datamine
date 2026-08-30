package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public class SonicAudioProcessor implements androidx.media3.common.audio.AudioProcessor {
    private static final float CLOSE_THRESHOLD = 1.0E-4f;
    private static final int MIN_BYTES_FOR_DURATION_SCALING_CALCULATION = 1024;
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private java.nio.ByteBuffer buffer;
    private long inputBytes;
    private boolean inputEnded;
    private java.nio.ByteBuffer outputBuffer;
    private long outputBytes;
    private int pendingOutputSampleRate;
    private boolean pendingSonicRecreation;
    private java.nio.ShortBuffer shortBuffer;
    private androidx.media3.common.audio.Sonic sonic;
    private float speed = 1.0f;
    private float pitch = 1.0f;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat pendingInputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat pendingOutputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat inputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;

    public SonicAudioProcessor() {
        java.nio.ByteBuffer byteBuffer = EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = EMPTY_BUFFER;
        this.pendingOutputSampleRate = -1;
    }

    public final void setSpeed(float f) {
        if (this.speed != f) {
            this.speed = f;
            this.pendingSonicRecreation = true;
        }
    }

    public final void setPitch(float f) {
        if (this.pitch != f) {
            this.pitch = f;
            this.pendingSonicRecreation = true;
        }
    }

    public final void setOutputSampleRateHz(int i) {
        this.pendingOutputSampleRate = i;
    }

    public final long getMediaDuration(long j) {
        if (this.outputBytes >= 1024) {
            long pendingInputBytes = this.inputBytes - ((long) ((androidx.media3.common.audio.Sonic) androidx.media3.common.util.Assertions.checkNotNull(this.sonic)).getPendingInputBytes());
            if (this.outputAudioFormat.sampleRate == this.inputAudioFormat.sampleRate) {
                return androidx.media3.common.util.Util.scaleLargeTimestamp(j, pendingInputBytes, this.outputBytes);
            }
            return androidx.media3.common.util.Util.scaleLargeTimestamp(j, pendingInputBytes * ((long) this.outputAudioFormat.sampleRate), this.outputBytes * ((long) this.inputAudioFormat.sampleRate));
        }
        return (long) (((double) this.speed) * j);
    }

    public final long getPlayoutDuration(long j) {
        if (this.outputBytes >= 1024) {
            long pendingInputBytes = this.inputBytes - ((long) ((androidx.media3.common.audio.Sonic) androidx.media3.common.util.Assertions.checkNotNull(this.sonic)).getPendingInputBytes());
            if (this.outputAudioFormat.sampleRate == this.inputAudioFormat.sampleRate) {
                return androidx.media3.common.util.Util.scaleLargeTimestamp(j, this.outputBytes, pendingInputBytes);
            }
            return androidx.media3.common.util.Util.scaleLargeTimestamp(j, this.outputBytes * ((long) this.inputAudioFormat.sampleRate), pendingInputBytes * ((long) this.outputAudioFormat.sampleRate));
        }
        return (long) (j / ((double) this.speed));
    }

    public final long getProcessedInputBytes() {
        return this.inputBytes - ((long) ((androidx.media3.common.audio.Sonic) androidx.media3.common.util.Assertions.checkNotNull(this.sonic)).getPendingInputBytes());
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return getPlayoutDuration(j);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i = this.pendingOutputSampleRate;
        if (i == -1) {
            i = audioFormat.sampleRate;
        }
        this.pendingInputAudioFormat = audioFormat;
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2 = new androidx.media3.common.audio.AudioProcessor.AudioFormat(i, audioFormat.channelCount, 2);
        this.pendingOutputAudioFormat = audioFormat2;
        this.pendingSonicRecreation = true;
        return audioFormat2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return this.pendingOutputAudioFormat.sampleRate != -1 && (java.lang.Math.abs(this.speed - 1.0f) >= 1.0E-4f || java.lang.Math.abs(this.pitch - 1.0f) >= 1.0E-4f || this.pendingOutputAudioFormat.sampleRate != this.pendingInputAudioFormat.sampleRate);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            androidx.media3.common.audio.Sonic sonic = (androidx.media3.common.audio.Sonic) androidx.media3.common.util.Assertions.checkNotNull(this.sonic);
            java.nio.ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.inputBytes += (long) iRemaining;
            sonic.queueInput(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        androidx.media3.common.audio.Sonic sonic = this.sonic;
        if (sonic != null) {
            sonic.queueEndOfStream();
        }
        this.inputEnded = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final java.nio.ByteBuffer getOutput() {
        int outputSize;
        androidx.media3.common.audio.Sonic sonic = this.sonic;
        if (sonic != null && (outputSize = sonic.getOutputSize()) > 0) {
            if (this.buffer.capacity() < outputSize) {
                java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(outputSize).order(java.nio.ByteOrder.nativeOrder());
                this.buffer = byteBufferOrder;
                this.shortBuffer = byteBufferOrder.asShortBuffer();
            } else {
                this.buffer.clear();
                this.shortBuffer.clear();
            }
            sonic.getOutput(this.shortBuffer);
            this.outputBytes += (long) outputSize;
            this.buffer.limit(outputSize);
            this.outputBuffer = this.buffer;
        }
        java.nio.ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        androidx.media3.common.audio.Sonic sonic;
        return this.inputEnded && ((sonic = this.sonic) == null || sonic.getOutputSize() == 0);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            this.inputAudioFormat = this.pendingInputAudioFormat;
            this.outputAudioFormat = this.pendingOutputAudioFormat;
            if (this.pendingSonicRecreation) {
                this.sonic = new androidx.media3.common.audio.Sonic(this.inputAudioFormat.sampleRate, this.inputAudioFormat.channelCount, this.speed, this.pitch, this.outputAudioFormat.sampleRate);
            } else {
                androidx.media3.common.audio.Sonic sonic = this.sonic;
                if (sonic != null) {
                    sonic.flush();
                }
            }
        }
        this.outputBuffer = EMPTY_BUFFER;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        this.pendingInputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.pendingOutputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.inputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        java.nio.ByteBuffer byteBuffer = EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = EMPTY_BUFFER;
        this.pendingOutputSampleRate = -1;
        this.pendingSonicRecreation = false;
        this.sonic = null;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }
}
