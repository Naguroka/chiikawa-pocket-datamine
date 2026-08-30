package androidx.media3.extractor.text.cea;

/* JADX INFO: loaded from: classes.dex */
abstract class CeaDecoder implements androidx.media3.extractor.text.SubtitleDecoder {
    private static final int NUM_INPUT_BUFFERS = 10;
    private static final int NUM_OUTPUT_BUFFERS = 2;
    private final java.util.ArrayDeque<androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer> availableInputBuffers = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<androidx.media3.extractor.text.SubtitleOutputBuffer> availableOutputBuffers;
    private androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer dequeuedInputBuffer;
    private long outputStartTimeUs;
    private long playbackPositionUs;
    private long queuedInputBufferCount;
    private final java.util.PriorityQueue<androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer> queuedInputBuffers;

    protected abstract androidx.media3.extractor.text.Subtitle createSubtitle();

    protected abstract void decode(androidx.media3.extractor.text.SubtitleInputBuffer subtitleInputBuffer);

    @Override // androidx.media3.decoder.Decoder
    public abstract java.lang.String getName();

    protected abstract boolean isNewSubtitleDataAvailable();

    @Override // androidx.media3.decoder.Decoder
    public void release() {
    }

    public CeaDecoder() {
        for (int i = 0; i < 10; i++) {
            this.availableInputBuffers.add(new androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer());
        }
        this.availableOutputBuffers = new java.util.ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.availableOutputBuffers.add(new androidx.media3.extractor.text.cea.CeaDecoder.CeaOutputBuffer(new androidx.media3.decoder.DecoderOutputBuffer.Owner() { // from class: androidx.media3.extractor.text.cea.CeaDecoder$$ExternalSyntheticLambda0
                @Override // androidx.media3.decoder.DecoderOutputBuffer.Owner
                public final void releaseOutputBuffer(androidx.media3.decoder.DecoderOutputBuffer decoderOutputBuffer) {
                    this.f$0.releaseOutputBuffer((androidx.media3.extractor.text.cea.CeaDecoder.CeaOutputBuffer) decoderOutputBuffer);
                }
            }));
        }
        this.queuedInputBuffers = new java.util.PriorityQueue<>();
        this.outputStartTimeUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setOutputStartTimeUs(long j) {
        this.outputStartTimeUs = j;
    }

    @Override // androidx.media3.extractor.text.SubtitleDecoder
    public void setPositionUs(long j) {
        this.playbackPositionUs = j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    public androidx.media3.extractor.text.SubtitleInputBuffer dequeueInputBuffer() throws androidx.media3.extractor.text.SubtitleDecoderException {
        androidx.media3.common.util.Assertions.checkState(this.dequeuedInputBuffer == null);
        if (this.availableInputBuffers.isEmpty()) {
            return null;
        }
        androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer ceaInputBufferPollFirst = this.availableInputBuffers.pollFirst();
        this.dequeuedInputBuffer = ceaInputBufferPollFirst;
        return ceaInputBufferPollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    public void queueInputBuffer(androidx.media3.extractor.text.SubtitleInputBuffer subtitleInputBuffer) throws androidx.media3.extractor.text.SubtitleDecoderException {
        androidx.media3.common.util.Assertions.checkArgument(subtitleInputBuffer == this.dequeuedInputBuffer);
        androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer ceaInputBuffer = (androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer) subtitleInputBuffer;
        if (this.outputStartTimeUs != androidx.media3.common.C.TIME_UNSET && ceaInputBuffer.timeUs < this.outputStartTimeUs) {
            releaseInputBuffer(ceaInputBuffer);
        } else {
            long j = this.queuedInputBufferCount;
            this.queuedInputBufferCount = 1 + j;
            ceaInputBuffer.queuedInputBufferCount = j;
            this.queuedInputBuffers.add(ceaInputBuffer);
        }
        this.dequeuedInputBuffer = null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    public androidx.media3.extractor.text.SubtitleOutputBuffer dequeueOutputBuffer() throws androidx.media3.extractor.text.SubtitleDecoderException {
        if (this.availableOutputBuffers.isEmpty()) {
            return null;
        }
        while (!this.queuedInputBuffers.isEmpty() && ((androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer) androidx.media3.common.util.Util.castNonNull(this.queuedInputBuffers.peek())).timeUs <= this.playbackPositionUs) {
            androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer ceaInputBuffer = (androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer) androidx.media3.common.util.Util.castNonNull(this.queuedInputBuffers.poll());
            if (ceaInputBuffer.isEndOfStream()) {
                androidx.media3.extractor.text.SubtitleOutputBuffer subtitleOutputBuffer = (androidx.media3.extractor.text.SubtitleOutputBuffer) androidx.media3.common.util.Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer.addFlag(4);
                releaseInputBuffer(ceaInputBuffer);
                return subtitleOutputBuffer;
            }
            decode(ceaInputBuffer);
            if (isNewSubtitleDataAvailable()) {
                androidx.media3.extractor.text.Subtitle subtitleCreateSubtitle = createSubtitle();
                androidx.media3.extractor.text.SubtitleOutputBuffer subtitleOutputBuffer2 = (androidx.media3.extractor.text.SubtitleOutputBuffer) androidx.media3.common.util.Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer2.setContent(ceaInputBuffer.timeUs, subtitleCreateSubtitle, Long.MAX_VALUE);
                releaseInputBuffer(ceaInputBuffer);
                return subtitleOutputBuffer2;
            }
            releaseInputBuffer(ceaInputBuffer);
        }
        return null;
    }

    private void releaseInputBuffer(androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer ceaInputBuffer) {
        ceaInputBuffer.clear();
        this.availableInputBuffers.add(ceaInputBuffer);
    }

    protected void releaseOutputBuffer(androidx.media3.extractor.text.SubtitleOutputBuffer subtitleOutputBuffer) {
        subtitleOutputBuffer.clear();
        this.availableOutputBuffers.add(subtitleOutputBuffer);
    }

    @Override // androidx.media3.decoder.Decoder
    public void flush() {
        this.queuedInputBufferCount = 0L;
        this.playbackPositionUs = 0L;
        while (!this.queuedInputBuffers.isEmpty()) {
            releaseInputBuffer((androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer) androidx.media3.common.util.Util.castNonNull(this.queuedInputBuffers.poll()));
        }
        androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer ceaInputBuffer = this.dequeuedInputBuffer;
        if (ceaInputBuffer != null) {
            releaseInputBuffer(ceaInputBuffer);
            this.dequeuedInputBuffer = null;
        }
    }

    protected final androidx.media3.extractor.text.SubtitleOutputBuffer getAvailableOutputBuffer() {
        return this.availableOutputBuffers.pollFirst();
    }

    protected final long getPositionUs() {
        return this.playbackPositionUs;
    }

    private static final class CeaInputBuffer extends androidx.media3.extractor.text.SubtitleInputBuffer implements java.lang.Comparable<androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer> {
        private long queuedInputBufferCount;

        private CeaInputBuffer() {
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.extractor.text.cea.CeaDecoder.CeaInputBuffer ceaInputBuffer) {
            if (isEndOfStream() != ceaInputBuffer.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j = this.timeUs - ceaInputBuffer.timeUs;
            if (j == 0) {
                j = this.queuedInputBufferCount - ceaInputBuffer.queuedInputBufferCount;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class CeaOutputBuffer extends androidx.media3.extractor.text.SubtitleOutputBuffer {
        private androidx.media3.decoder.DecoderOutputBuffer.Owner<androidx.media3.extractor.text.cea.CeaDecoder.CeaOutputBuffer> owner;

        public CeaOutputBuffer(androidx.media3.decoder.DecoderOutputBuffer.Owner<androidx.media3.extractor.text.cea.CeaDecoder.CeaOutputBuffer> owner) {
            this.owner = owner;
        }

        @Override // androidx.media3.decoder.DecoderOutputBuffer
        public final void release() {
            this.owner.releaseOutputBuffer(this);
        }
    }
}
