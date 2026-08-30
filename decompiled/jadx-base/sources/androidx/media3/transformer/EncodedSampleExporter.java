package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class EncodedSampleExporter extends androidx.media3.transformer.SampleExporter implements androidx.media3.transformer.GraphInput {
    static final long ALLOCATION_SIZE_TARGET_BYTES = 2097152;
    private static final java.nio.ByteBuffer EMPTY_BUFFER = java.nio.ByteBuffer.allocateDirect(0).order(java.nio.ByteOrder.nativeOrder());
    static final int MAX_INPUT_BUFFER_COUNT = 200;
    static final int MIN_INPUT_BUFFER_COUNT = 10;
    private final java.util.Queue<androidx.media3.decoder.DecoderInputBuffer> availableInputBuffers;
    private final androidx.media3.common.Format format;
    private boolean hasReachedAllocationTarget;
    private final long initialTimestampOffsetUs;
    private volatile boolean inputEnded;
    private long mediaItemOffsetUs;
    private androidx.media3.decoder.DecoderInputBuffer nextInputBuffer;
    private final java.util.concurrent.atomic.AtomicLong nextMediaItemOffsetUs;
    private final java.util.Queue<androidx.media3.decoder.DecoderInputBuffer> pendingInputBuffers;
    private long totalBufferSizeBytes;

    @Override // androidx.media3.transformer.SampleExporter
    public androidx.media3.transformer.GraphInput getInput(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.common.Format format, int i) {
        return this;
    }

    @Override // androidx.media3.transformer.SampleExporter
    public void release() {
    }

    public EncodedSampleExporter(androidx.media3.common.Format format, androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.transformer.MuxerWrapper muxerWrapper, androidx.media3.transformer.FallbackListener fallbackListener, long j) {
        super(format, muxerWrapper);
        this.format = format;
        this.initialTimestampOffsetUs = j;
        this.nextMediaItemOffsetUs = new java.util.concurrent.atomic.AtomicLong();
        this.availableInputBuffers = new java.util.concurrent.ConcurrentLinkedQueue();
        this.pendingInputBuffers = new java.util.concurrent.ConcurrentLinkedQueue();
        fallbackListener.onTransformationRequestFinalized(transformationRequest);
    }

    @Override // androidx.media3.transformer.OnMediaItemChangedListener
    public void onMediaItemChanged(androidx.media3.transformer.EditedMediaItem editedMediaItem, long j, androidx.media3.common.Format format, boolean z) {
        this.mediaItemOffsetUs = this.nextMediaItemOffsetUs.get();
        this.nextMediaItemOffsetUs.addAndGet(j);
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public androidx.media3.decoder.DecoderInputBuffer getInputBuffer() {
        if (this.nextInputBuffer == null) {
            androidx.media3.decoder.DecoderInputBuffer decoderInputBufferPoll = this.availableInputBuffers.poll();
            this.nextInputBuffer = decoderInputBufferPoll;
            if (!this.hasReachedAllocationTarget) {
                if (decoderInputBufferPoll == null) {
                    androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer = new androidx.media3.decoder.DecoderInputBuffer(2);
                    this.nextInputBuffer = decoderInputBuffer;
                    decoderInputBuffer.data = EMPTY_BUFFER;
                } else {
                    this.totalBufferSizeBytes -= (long) ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(decoderInputBufferPoll.data)).capacity();
                }
            }
        }
        return this.nextInputBuffer;
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public boolean queueInputBuffer() {
        androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer = (androidx.media3.decoder.DecoderInputBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.nextInputBuffer);
        this.nextInputBuffer = null;
        if (decoderInputBuffer.isEndOfStream()) {
            this.inputEnded = true;
        } else {
            decoderInputBuffer.timeUs += this.mediaItemOffsetUs + this.initialTimestampOffsetUs;
            this.pendingInputBuffers.add(decoderInputBuffer);
        }
        if (!this.hasReachedAllocationTarget) {
            int size = this.availableInputBuffers.size() + this.pendingInputBuffers.size();
            long jCapacity = this.totalBufferSizeBytes + ((long) ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(decoderInputBuffer.data)).capacity());
            this.totalBufferSizeBytes = jCapacity;
            this.hasReachedAllocationTarget = size >= 10 && (size >= 200 || jCapacity >= 2097152);
        }
        return true;
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected androidx.media3.common.Format getMuxerInputFormat() {
        return this.format;
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected androidx.media3.decoder.DecoderInputBuffer getMuxerInputBuffer() {
        return this.pendingInputBuffers.peek();
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected void releaseMuxerInputBuffer() {
        androidx.media3.decoder.DecoderInputBuffer decoderInputBufferRemove = this.pendingInputBuffers.remove();
        decoderInputBufferRemove.clear();
        decoderInputBufferRemove.timeUs = 0L;
        this.availableInputBuffers.add(decoderInputBufferRemove);
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected boolean isMuxerInputEnded() {
        return this.inputEnded && this.pendingInputBuffers.isEmpty();
    }
}
