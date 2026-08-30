package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class DecoderCounters {
    public int decoderInitCount;
    public int decoderReleaseCount;
    public int droppedBufferCount;
    public int droppedInputBufferCount;
    public int droppedToKeyframeCount;
    public int maxConsecutiveDroppedBufferCount;
    public int queuedInputBufferCount;
    public int renderedOutputBufferCount;
    public int skippedInputBufferCount;
    public int skippedOutputBufferCount;
    public long totalVideoFrameProcessingOffsetUs;
    public int videoFrameProcessingOffsetCount;

    public synchronized void ensureUpdated() {
    }

    public void merge(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        this.decoderInitCount += decoderCounters.decoderInitCount;
        this.decoderReleaseCount += decoderCounters.decoderReleaseCount;
        this.queuedInputBufferCount += decoderCounters.queuedInputBufferCount;
        this.skippedInputBufferCount += decoderCounters.skippedInputBufferCount;
        this.renderedOutputBufferCount += decoderCounters.renderedOutputBufferCount;
        this.skippedOutputBufferCount += decoderCounters.skippedOutputBufferCount;
        this.droppedBufferCount += decoderCounters.droppedBufferCount;
        this.droppedInputBufferCount += decoderCounters.droppedInputBufferCount;
        this.maxConsecutiveDroppedBufferCount = java.lang.Math.max(this.maxConsecutiveDroppedBufferCount, decoderCounters.maxConsecutiveDroppedBufferCount);
        this.droppedToKeyframeCount += decoderCounters.droppedToKeyframeCount;
        addVideoFrameProcessingOffsets(decoderCounters.totalVideoFrameProcessingOffsetUs, decoderCounters.videoFrameProcessingOffsetCount);
    }

    public void addVideoFrameProcessingOffset(long j) {
        addVideoFrameProcessingOffsets(j, 1);
    }

    private void addVideoFrameProcessingOffsets(long j, int i) {
        this.totalVideoFrameProcessingOffsetUs += j;
        this.videoFrameProcessingOffsetCount += i;
    }

    public java.lang.String toString() {
        return androidx.media3.common.util.Util.formatInvariant("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", java.lang.Integer.valueOf(this.decoderInitCount), java.lang.Integer.valueOf(this.decoderReleaseCount), java.lang.Integer.valueOf(this.queuedInputBufferCount), java.lang.Integer.valueOf(this.skippedInputBufferCount), java.lang.Integer.valueOf(this.renderedOutputBufferCount), java.lang.Integer.valueOf(this.skippedOutputBufferCount), java.lang.Integer.valueOf(this.droppedBufferCount), java.lang.Integer.valueOf(this.droppedInputBufferCount), java.lang.Integer.valueOf(this.maxConsecutiveDroppedBufferCount), java.lang.Integer.valueOf(this.droppedToKeyframeCount), java.lang.Long.valueOf(this.totalVideoFrameProcessingOffsetUs), java.lang.Integer.valueOf(this.videoFrameProcessingOffsetCount));
    }
}
