package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class HlsSampleStream implements androidx.media3.exoplayer.source.SampleStream {
    private int sampleQueueIndex = -1;
    private final androidx.media3.exoplayer.hls.HlsSampleStreamWrapper sampleStreamWrapper;
    private final int trackGroupIndex;

    public HlsSampleStream(androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper, int i) {
        this.sampleStreamWrapper = hlsSampleStreamWrapper;
        this.trackGroupIndex = i;
    }

    public void bindSampleQueue() {
        androidx.media3.common.util.Assertions.checkArgument(this.sampleQueueIndex == -1);
        this.sampleQueueIndex = this.sampleStreamWrapper.bindSampleQueueToSampleStream(this.trackGroupIndex);
    }

    public void unbindSampleQueue() {
        if (this.sampleQueueIndex != -1) {
            this.sampleStreamWrapper.unbindSampleQueue(this.trackGroupIndex);
            this.sampleQueueIndex = -1;
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return this.sampleQueueIndex == -3 || (hasValidSampleQueueIndex() && this.sampleStreamWrapper.isReady(this.sampleQueueIndex));
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() throws java.io.IOException {
        int i = this.sampleQueueIndex;
        if (i == -2) {
            throw new androidx.media3.exoplayer.hls.SampleQueueMappingException(this.sampleStreamWrapper.getTrackGroups().get(this.trackGroupIndex).getFormat(0).sampleMimeType);
        }
        if (i == -1) {
            this.sampleStreamWrapper.maybeThrowError();
        } else if (i != -3) {
            this.sampleStreamWrapper.maybeThrowError(i);
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
        if (this.sampleQueueIndex == -3) {
            decoderInputBuffer.addFlag(4);
            return -4;
        }
        if (hasValidSampleQueueIndex()) {
            return this.sampleStreamWrapper.readData(this.sampleQueueIndex, formatHolder, decoderInputBuffer, i);
        }
        return -3;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j) {
        if (hasValidSampleQueueIndex()) {
            return this.sampleStreamWrapper.skipData(this.sampleQueueIndex, j);
        }
        return 0;
    }

    private boolean hasValidSampleQueueIndex() {
        int i = this.sampleQueueIndex;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }
}
