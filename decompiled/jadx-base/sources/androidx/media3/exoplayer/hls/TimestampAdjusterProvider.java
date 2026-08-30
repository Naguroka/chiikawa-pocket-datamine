package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class TimestampAdjusterProvider {
    private final android.util.SparseArray<androidx.media3.common.util.TimestampAdjuster> timestampAdjusters = new android.util.SparseArray<>();

    public androidx.media3.common.util.TimestampAdjuster getAdjuster(int i) {
        androidx.media3.common.util.TimestampAdjuster timestampAdjuster = this.timestampAdjusters.get(i);
        if (timestampAdjuster != null) {
            return timestampAdjuster;
        }
        androidx.media3.common.util.TimestampAdjuster timestampAdjuster2 = new androidx.media3.common.util.TimestampAdjuster(androidx.media3.common.util.TimestampAdjuster.MODE_SHARED);
        this.timestampAdjusters.put(i, timestampAdjuster2);
        return timestampAdjuster2;
    }

    public void reset() {
        this.timestampAdjusters.clear();
    }
}
