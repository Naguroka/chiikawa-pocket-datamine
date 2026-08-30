package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
final class SingleSegmentIndex implements androidx.media3.exoplayer.dash.DashSegmentIndex {
    private final androidx.media3.exoplayer.dash.manifest.RangedUri uri;

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j, long j2) {
        return 1L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getDurationUs(long j, long j2) {
        return j2;
    }

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
    public long getSegmentCount(long j) {
        return 1L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getSegmentNum(long j, long j2) {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long getTimeUs(long j) {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }

    public SingleSegmentIndex(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri) {
        this.uri = rangedUri;
    }

    @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
    public androidx.media3.exoplayer.dash.manifest.RangedUri getSegmentUrl(long j) {
        return this.uri;
    }
}
