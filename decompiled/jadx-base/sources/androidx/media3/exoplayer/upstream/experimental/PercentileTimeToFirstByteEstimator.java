package androidx.media3.exoplayer.upstream.experimental;

/* JADX INFO: loaded from: classes.dex */
public final class PercentileTimeToFirstByteEstimator implements androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final float DEFAULT_PERCENTILE = 0.5f;
    private static final int MAX_DATA_SPECS = 10;
    private final androidx.media3.common.util.Clock clock;
    private final java.util.LinkedHashMap<androidx.media3.datasource.DataSpec, java.lang.Long> initializedDataSpecs;
    private boolean isEmpty;
    private final float percentile;
    private final androidx.media3.exoplayer.upstream.SlidingPercentile slidingPercentile;

    public PercentileTimeToFirstByteEstimator() {
        this(10, 0.5f);
    }

    public PercentileTimeToFirstByteEstimator(int i, float f) {
        this(i, f, androidx.media3.common.util.Clock.DEFAULT);
    }

    PercentileTimeToFirstByteEstimator(int i, float f, androidx.media3.common.util.Clock clock) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0 && f > 0.0f && f <= 1.0f);
        this.percentile = f;
        this.clock = clock;
        this.initializedDataSpecs = new androidx.media3.exoplayer.upstream.experimental.PercentileTimeToFirstByteEstimator.FixedSizeLinkedHashMap(10);
        this.slidingPercentile = new androidx.media3.exoplayer.upstream.SlidingPercentile(i);
        this.isEmpty = true;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long getTimeToFirstByteEstimateUs() {
        return !this.isEmpty ? (long) this.slidingPercentile.getPercentile(this.percentile) : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.slidingPercentile.reset();
        this.isEmpty = true;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferInitializing(androidx.media3.datasource.DataSpec dataSpec) {
        this.initializedDataSpecs.remove(dataSpec);
        this.initializedDataSpecs.put(dataSpec, java.lang.Long.valueOf(androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime())));
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferStart(androidx.media3.datasource.DataSpec dataSpec) {
        java.lang.Long lRemove = this.initializedDataSpecs.remove(dataSpec);
        if (lRemove == null) {
            return;
        }
        this.slidingPercentile.addSample(1, androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime()) - lRemove.longValue());
        this.isEmpty = false;
    }

    private static class FixedSizeLinkedHashMap<K, V> extends java.util.LinkedHashMap<K, V> {
        private final int maxSize;

        public FixedSizeLinkedHashMap(int i) {
            this.maxSize = i;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(java.util.Map.Entry<K, V> entry) {
            return size() > this.maxSize;
        }
    }
}
