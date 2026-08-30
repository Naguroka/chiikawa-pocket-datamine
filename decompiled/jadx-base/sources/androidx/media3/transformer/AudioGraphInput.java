package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class AudioGraphInput implements androidx.media3.transformer.GraphInput {
    private static final long MAX_AUDIO_DRIFT_ALLOWED_US = 2000;
    private static final int MAX_INPUT_BUFFER_COUNT = 10;
    private androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline;
    private final java.util.Queue<androidx.media3.decoder.DecoderInputBuffer> availableInputBuffers;
    private androidx.media3.decoder.DecoderInputBuffer currentInputBufferBeingOutput;
    private long currentItemExpectedInputDurationUs;
    private long currentItemInputBytesRead;
    private boolean currentItemSilenceAppended;
    private boolean inputBlocked;
    private boolean isCurrentItemLast;
    private final androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat;
    private final java.util.Queue<androidx.media3.decoder.DecoderInputBuffer> pendingInputBuffers;
    private final java.util.Queue<androidx.media3.transformer.AudioGraphInput.MediaItemChange> pendingMediaItemChanges;
    private boolean processedFirstMediaItemChange;
    private boolean queueEndOfStreamAfterSilence;
    private boolean receivedEndOfStreamFromInput;
    private androidx.media3.transformer.SilentAudioGenerator silentAudioGenerator;
    private final java.util.concurrent.atomic.AtomicLong startTimeUs;

    public AudioGraphInput(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.common.Format format) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2 = new androidx.media3.common.audio.AudioProcessor.AudioFormat(format);
        androidx.media3.common.util.Assertions.checkArgument(androidx.media3.transformer.AudioGraph.isInputAudioFormatValid(audioFormat2), audioFormat2);
        this.availableInputBuffers = new java.util.concurrent.ConcurrentLinkedQueue();
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(0).order(java.nio.ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer = new androidx.media3.decoder.DecoderInputBuffer(2);
            decoderInputBuffer.data = byteBufferOrder;
            this.availableInputBuffers.add(decoderInputBuffer);
        }
        this.pendingInputBuffers = new java.util.concurrent.ConcurrentLinkedQueue();
        this.pendingMediaItemChanges = new java.util.concurrent.ConcurrentLinkedQueue();
        this.silentAudioGenerator = new androidx.media3.transformer.SilentAudioGenerator(audioFormat2);
        androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipelineConfigureProcessing = configureProcessing(editedMediaItem, format, audioFormat2, audioFormat);
        this.audioProcessingPipeline = audioProcessingPipelineConfigureProcessing;
        audioProcessingPipelineConfigureProcessing.flush();
        androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat = this.audioProcessingPipeline.getOutputAudioFormat();
        this.outputAudioFormat = outputAudioFormat;
        androidx.media3.common.util.Assertions.checkArgument(outputAudioFormat.encoding == 2, outputAudioFormat);
        this.startTimeUs = new java.util.concurrent.atomic.AtomicLong(androidx.media3.common.C.TIME_UNSET);
        this.currentItemExpectedInputDurationUs = androidx.media3.common.C.TIME_UNSET;
    }

    public androidx.media3.common.audio.AudioProcessor.AudioFormat getOutputAudioFormat() {
        return this.outputAudioFormat;
    }

    public java.nio.ByteBuffer getOutput() throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        java.nio.ByteBuffer outputInternal = getOutputInternal();
        if (outputInternal.hasRemaining()) {
            return outputInternal;
        }
        if (!hasDataToOutput() && !this.pendingMediaItemChanges.isEmpty()) {
            configureForPendingMediaItemChange();
        }
        return androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
    }

    @Override // androidx.media3.transformer.OnMediaItemChangedListener
    public void onMediaItemChanged(androidx.media3.transformer.EditedMediaItem editedMediaItem, long j, androidx.media3.common.Format format, boolean z) {
        if (format == null) {
            androidx.media3.common.util.Assertions.checkState(j != androidx.media3.common.C.TIME_UNSET, "Could not generate silent audio because duration is unknown.");
        } else {
            androidx.media3.common.util.Assertions.checkState(androidx.media3.common.MimeTypes.isAudio(format.sampleMimeType));
            androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat = new androidx.media3.common.audio.AudioProcessor.AudioFormat(format);
            androidx.media3.common.util.Assertions.checkState(androidx.media3.transformer.AudioGraph.isInputAudioFormatValid(audioFormat), audioFormat);
        }
        this.pendingMediaItemChanges.add(new androidx.media3.transformer.AudioGraphInput.MediaItemChange(editedMediaItem, j, format, z));
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public androidx.media3.decoder.DecoderInputBuffer getInputBuffer() {
        if (this.inputBlocked || !this.pendingMediaItemChanges.isEmpty()) {
            return null;
        }
        return this.availableInputBuffers.peek();
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public boolean queueInputBuffer() {
        if (this.inputBlocked) {
            return false;
        }
        androidx.media3.common.util.Assertions.checkState(this.pendingMediaItemChanges.isEmpty());
        androidx.media3.decoder.DecoderInputBuffer decoderInputBufferRemove = this.availableInputBuffers.remove();
        this.pendingInputBuffers.add(decoderInputBufferRemove);
        this.startTimeUs.compareAndSet(androidx.media3.common.C.TIME_UNSET, decoderInputBufferRemove.timeUs);
        return true;
    }

    public long getStartTimeUs() {
        return this.startTimeUs.get();
    }

    public void blockInput() {
        this.inputBlocked = true;
    }

    public void unblockInput() {
        this.inputBlocked = false;
    }

    public void flush() {
        this.pendingMediaItemChanges.clear();
        this.processedFirstMediaItemChange = true;
        if (!this.availableInputBuffers.isEmpty()) {
            clearAndAddToAvailableBuffers(this.availableInputBuffers.remove());
        }
        androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer = this.currentInputBufferBeingOutput;
        if (decoderInputBuffer != null) {
            clearAndAddToAvailableBuffers(decoderInputBuffer);
            this.currentInputBufferBeingOutput = null;
        }
        while (!this.pendingInputBuffers.isEmpty()) {
            clearAndAddToAvailableBuffers(this.pendingInputBuffers.remove());
        }
        androidx.media3.common.util.Assertions.checkState(this.availableInputBuffers.size() == 10);
        this.silentAudioGenerator.flush();
        this.audioProcessingPipeline.flush();
        this.receivedEndOfStreamFromInput = false;
        this.queueEndOfStreamAfterSilence = false;
        this.startTimeUs.set(androidx.media3.common.C.TIME_UNSET);
        this.currentItemExpectedInputDurationUs = androidx.media3.common.C.TIME_UNSET;
        this.currentItemInputBytesRead = 0L;
        this.currentItemSilenceAppended = false;
        this.isCurrentItemLast = false;
    }

    public void release() {
        this.audioProcessingPipeline.reset();
    }

    public boolean isEnded() {
        if (hasDataToOutput() || !this.pendingMediaItemChanges.isEmpty()) {
            return false;
        }
        if (this.currentItemExpectedInputDurationUs == androidx.media3.common.C.TIME_UNSET) {
            return this.receivedEndOfStreamFromInput || this.queueEndOfStreamAfterSilence;
        }
        if (this.isCurrentItemLast) {
            return this.receivedEndOfStreamFromInput || this.queueEndOfStreamAfterSilence;
        }
        return false;
    }

    private java.nio.ByteBuffer getOutputInternal() {
        if (!this.processedFirstMediaItemChange) {
            return androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        }
        if (!this.audioProcessingPipeline.isOperational()) {
            return feedOutputFromInput();
        }
        while (feedProcessingPipelineFromInput()) {
        }
        return this.audioProcessingPipeline.getOutput();
    }

    private boolean feedProcessingPipelineFromInput() {
        if (this.silentAudioGenerator.hasRemaining()) {
            java.nio.ByteBuffer buffer = this.silentAudioGenerator.getBuffer();
            this.audioProcessingPipeline.queueInput(buffer);
            if (buffer.hasRemaining()) {
                return false;
            }
            if (this.silentAudioGenerator.hasRemaining()) {
                return true;
            }
            this.audioProcessingPipeline.queueEndOfStream();
            return false;
        }
        androidx.media3.decoder.DecoderInputBuffer decoderInputBufferPeek = this.pendingInputBuffers.peek();
        if (decoderInputBufferPeek == null) {
            if (!this.pendingMediaItemChanges.isEmpty()) {
                if (shouldAppendSilence()) {
                    appendSilence();
                    return true;
                }
                this.audioProcessingPipeline.queueEndOfStream();
            }
            return false;
        }
        if (decoderInputBufferPeek.isEndOfStream()) {
            if (shouldAppendSilence()) {
                appendSilence();
                clearAndAddToAvailableBuffers(this.pendingInputBuffers.remove());
                return true;
            }
            this.audioProcessingPipeline.queueEndOfStream();
            this.receivedEndOfStreamFromInput = true;
            clearAndAddToAvailableBuffers(this.pendingInputBuffers.remove());
            return false;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(decoderInputBufferPeek.data);
        long jRemaining = byteBuffer.remaining();
        this.audioProcessingPipeline.queueInput(byteBuffer);
        this.currentItemInputBytesRead += jRemaining - ((long) byteBuffer.remaining());
        if (byteBuffer.hasRemaining()) {
            return false;
        }
        clearAndAddToAvailableBuffers(this.pendingInputBuffers.remove());
        return true;
    }

    private java.nio.ByteBuffer feedOutputFromInput() {
        if (this.silentAudioGenerator.hasRemaining()) {
            return this.silentAudioGenerator.getBuffer();
        }
        androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer = this.currentInputBufferBeingOutput;
        if (decoderInputBuffer != null) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(decoderInputBuffer.data);
            if (byteBuffer.hasRemaining()) {
                return byteBuffer;
            }
            clearAndAddToAvailableBuffers((androidx.media3.decoder.DecoderInputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(this.currentInputBufferBeingOutput));
            this.currentInputBufferBeingOutput = null;
        }
        androidx.media3.decoder.DecoderInputBuffer decoderInputBufferPoll = this.pendingInputBuffers.poll();
        if (decoderInputBufferPoll == null) {
            if (!this.pendingMediaItemChanges.isEmpty() && shouldAppendSilence()) {
                appendSilence();
            }
            return androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        }
        java.nio.ByteBuffer byteBuffer2 = decoderInputBufferPoll.data;
        this.receivedEndOfStreamFromInput = decoderInputBufferPoll.isEndOfStream();
        if (byteBuffer2 == null || !byteBuffer2.hasRemaining() || this.receivedEndOfStreamFromInput) {
            clearAndAddToAvailableBuffers(decoderInputBufferPoll);
            if (this.receivedEndOfStreamFromInput && shouldAppendSilence()) {
                appendSilence();
            }
            return androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        }
        this.currentInputBufferBeingOutput = decoderInputBufferPoll;
        this.currentItemInputBytesRead += (long) byteBuffer2.remaining();
        return byteBuffer2;
    }

    private boolean hasDataToOutput() {
        if (!this.processedFirstMediaItemChange) {
            return false;
        }
        androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer = this.currentInputBufferBeingOutput;
        if ((decoderInputBuffer == null || decoderInputBuffer.data == null || !this.currentInputBufferBeingOutput.data.hasRemaining()) && !this.silentAudioGenerator.hasRemaining() && this.pendingInputBuffers.isEmpty()) {
            return this.audioProcessingPipeline.isOperational() && !this.audioProcessingPipeline.isEnded();
        }
        return true;
    }

    private void clearAndAddToAvailableBuffers(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        decoderInputBuffer.clear();
        decoderInputBuffer.timeUs = 0L;
        this.availableInputBuffers.add(decoderInputBuffer);
    }

    private void configureForPendingMediaItemChange() throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat;
        androidx.media3.transformer.AudioGraphInput.MediaItemChange mediaItemChange = (androidx.media3.transformer.AudioGraphInput.MediaItemChange) androidx.media3.common.util.Assertions.checkStateNotNull(this.pendingMediaItemChanges.poll());
        this.currentItemInputBytesRead = 0L;
        this.isCurrentItemLast = mediaItemChange.isLast;
        this.currentItemSilenceAppended = false;
        if (mediaItemChange.format != null) {
            this.currentItemExpectedInputDurationUs = mediaItemChange.durationUs;
            audioFormat = new androidx.media3.common.audio.AudioProcessor.AudioFormat(mediaItemChange.format);
            this.silentAudioGenerator = new androidx.media3.transformer.SilentAudioGenerator(audioFormat);
        } else {
            if (mediaItemChange.editedMediaItem.effects.audioProcessors.isEmpty()) {
                this.currentItemExpectedInputDurationUs = mediaItemChange.editedMediaItem.getDurationAfterEffectsApplied(mediaItemChange.durationUs);
            } else {
                this.currentItemExpectedInputDurationUs = mediaItemChange.durationUs;
            }
            androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2 = this.silentAudioGenerator.audioFormat;
            this.startTimeUs.compareAndSet(androidx.media3.common.C.TIME_UNSET, 0L);
            appendSilence();
            audioFormat = audioFormat2;
        }
        if (this.processedFirstMediaItemChange) {
            this.audioProcessingPipeline = configureProcessing(mediaItemChange.editedMediaItem, mediaItemChange.format, audioFormat, this.outputAudioFormat);
        }
        this.audioProcessingPipeline.flush();
        this.receivedEndOfStreamFromInput = false;
        this.processedFirstMediaItemChange = true;
    }

    private boolean shouldAppendSilence() {
        if (!this.currentItemSilenceAppended) {
            long j = this.currentItemExpectedInputDurationUs;
            if (j != androidx.media3.common.C.TIME_UNSET && j - currentItemActualInputDurationUs() > 2000) {
                return true;
            }
        }
        return false;
    }

    private void appendSilence() {
        this.silentAudioGenerator.addSilence(this.currentItemExpectedInputDurationUs - currentItemActualInputDurationUs());
        this.currentItemSilenceAppended = true;
        if (this.isCurrentItemLast) {
            this.queueEndOfStreamAfterSilence = true;
        }
    }

    private long currentItemActualInputDurationUs() {
        return androidx.media3.common.util.Util.sampleCountToDurationUs(this.currentItemInputBytesRead / ((long) this.silentAudioGenerator.audioFormat.bytesPerFrame), this.silentAudioGenerator.audioFormat.sampleRate);
    }

    private static androidx.media3.common.audio.AudioProcessingPipeline configureProcessing(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.common.Format format, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        if (editedMediaItem.flattenForSlowMotion && format != null && format.metadata != null) {
            builder.add(new androidx.media3.common.audio.SpeedChangingAudioProcessor(new androidx.media3.transformer.SegmentSpeedProvider(format.metadata)));
        }
        builder.addAll((java.lang.Iterable) editedMediaItem.effects.audioProcessors);
        if (audioFormat2.sampleRate != -1) {
            androidx.media3.common.audio.SonicAudioProcessor sonicAudioProcessor = new androidx.media3.common.audio.SonicAudioProcessor();
            sonicAudioProcessor.setOutputSampleRateHz(audioFormat2.sampleRate);
            builder.add(sonicAudioProcessor);
        }
        if (audioFormat2.channelCount == 1 || audioFormat2.channelCount == 2) {
            androidx.media3.common.audio.ChannelMixingAudioProcessor channelMixingAudioProcessor = new androidx.media3.common.audio.ChannelMixingAudioProcessor();
            channelMixingAudioProcessor.putChannelMixingMatrix(androidx.media3.common.audio.ChannelMixingMatrix.create(1, audioFormat2.channelCount));
            channelMixingAudioProcessor.putChannelMixingMatrix(androidx.media3.common.audio.ChannelMixingMatrix.create(2, audioFormat2.channelCount));
            builder.add(channelMixingAudioProcessor);
        }
        androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline = new androidx.media3.common.audio.AudioProcessingPipeline(builder.build());
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormatConfigure = audioProcessingPipeline.configure(audioFormat);
        if ((audioFormat2.sampleRate == -1 || audioFormat2.sampleRate == audioFormatConfigure.sampleRate) && ((audioFormat2.channelCount == -1 || audioFormat2.channelCount == audioFormatConfigure.channelCount) && (audioFormat2.encoding == -1 || audioFormat2.encoding == audioFormatConfigure.encoding))) {
            return audioProcessingPipeline;
        }
        throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException("Audio can not be modified to match downstream format", audioFormat);
    }

    private static final class MediaItemChange {
        public final long durationUs;
        public final androidx.media3.transformer.EditedMediaItem editedMediaItem;
        public final androidx.media3.common.Format format;
        public final boolean isLast;

        public MediaItemChange(androidx.media3.transformer.EditedMediaItem editedMediaItem, long j, androidx.media3.common.Format format, boolean z) {
            this.editedMediaItem = editedMediaItem;
            this.durationUs = j;
            this.format = format;
            this.isLast = z;
        }
    }
}
