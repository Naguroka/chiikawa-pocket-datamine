package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
public final class DashWrappingSegmentIndex implements androidx.media3.exoplayer.dash.DashSegmentIndex {
    private final androidx.media3.extractor.ChunkIndex chunkIndex;
    private final long timeOffsetUs;

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long j, long j2) {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j, long j2) {
        return androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }

    public DashWrappingSegmentIndex(androidx.media3.extractor.ChunkIndex chunkIndex, long j) {
        this.chunkIndex = chunkIndex;
        this.timeOffsetUs = j;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentCount(long j) {
        return this.chunkIndex.length;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j, long j2) {
        return this.chunkIndex.length;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j) {
        return this.chunkIndex.timesUs[(int) j] - this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j, long j2) {
        return this.chunkIndex.durationsUs[(int) j];
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public androidx.media3.exoplayer.dash.manifest.RangedUri getSegmentUrl(long j) {
        int i = (int) j;
        return new androidx.media3.exoplayer.dash.manifest.RangedUri(null, this.chunkIndex.offsets[i], this.chunkIndex.sizes[i]);
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j, long j2) {
        return this.chunkIndex.getChunkIndex(j + this.timeOffsetUs);
    }
}
