package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class TransformerMediaClock implements androidx.media3.exoplayer.MediaClock {
    private long minTrackTimeUs;
    private final android.util.SparseLongArray trackTypeToTimeUs = new android.util.SparseLongArray();

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
    }

    public void updateTimeForTrackType(int i, long j) {
        long j2 = this.trackTypeToTimeUs.get(i, androidx.media3.common.C.TIME_UNSET);
        if (j2 == androidx.media3.common.C.TIME_UNSET || j > j2) {
            this.trackTypeToTimeUs.put(i, j);
            if (j2 == androidx.media3.common.C.TIME_UNSET || j2 == this.minTrackTimeUs) {
                this.minTrackTimeUs = androidx.media3.common.util.Util.minValue(this.trackTypeToTimeUs);
            }
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        return this.minTrackTimeUs;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return androidx.media3.common.PlaybackParameters.DEFAULT;
    }
}
