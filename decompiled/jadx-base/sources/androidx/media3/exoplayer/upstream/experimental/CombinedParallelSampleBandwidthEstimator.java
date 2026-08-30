package androidx.media3.exoplayer.upstream.experimental;

/* JADX INFO: loaded from: classes.dex */
public class CombinedParallelSampleBandwidthEstimator implements androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator {
    private long bandwidthEstimate;
    private final androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic bandwidthStatistic;
    private final androidx.media3.common.util.Clock clock;
    private final androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private long lastReportedBandwidthEstimate;
    private final long minBytesTransferred;
    private final int minSamples;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private int streamCount;
    private long totalBytesTransferred;
    private int totalSamplesAdded;

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void onTransferInitializing(androidx.media3.datasource.DataSource dataSource) {
    }

    public static class Builder {
        private androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic bandwidthStatistic = new androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic();
        private androidx.media3.common.util.Clock clock = androidx.media3.common.util.Clock.DEFAULT;
        private long minBytesTransferred;
        private int minSamples;

        public androidx.media3.exoplayer.upstream.experimental.CombinedParallelSampleBandwidthEstimator.Builder setBandwidthStatistic(androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic bandwidthStatistic) {
            androidx.media3.common.util.Assertions.checkNotNull(bandwidthStatistic);
            this.bandwidthStatistic = bandwidthStatistic;
            return this;
        }

        public androidx.media3.exoplayer.upstream.experimental.CombinedParallelSampleBandwidthEstimator.Builder setMinSamples(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            this.minSamples = i;
            return this;
        }

        public androidx.media3.exoplayer.upstream.experimental.CombinedParallelSampleBandwidthEstimator.Builder setMinBytesTransferred(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j >= 0);
            this.minBytesTransferred = j;
            return this;
        }

        androidx.media3.exoplayer.upstream.experimental.CombinedParallelSampleBandwidthEstimator.Builder setClock(androidx.media3.common.util.Clock clock) {
            this.clock = clock;
            return this;
        }

        public androidx.media3.exoplayer.upstream.experimental.CombinedParallelSampleBandwidthEstimator build() {
            return new androidx.media3.exoplayer.upstream.experimental.CombinedParallelSampleBandwidthEstimator(this);
        }
    }

    private CombinedParallelSampleBandwidthEstimator(androidx.media3.exoplayer.upstream.experimental.CombinedParallelSampleBandwidthEstimator.Builder builder) {
        this.bandwidthStatistic = builder.bandwidthStatistic;
        this.minSamples = builder.minSamples;
        this.minBytesTransferred = builder.minBytesTransferred;
        this.clock = builder.clock;
        this.eventDispatcher = new androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher();
        this.bandwidthEstimate = Long.MIN_VALUE;
        this.lastReportedBandwidthEstimate = Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void removeEventListener(androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void onTransferStart(androidx.media3.datasource.DataSource dataSource) {
        if (this.streamCount == 0) {
            this.sampleStartTimeMs = this.clock.elapsedRealtime();
        }
        this.streamCount++;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void onBytesTransferred(androidx.media3.datasource.DataSource dataSource, int i) {
        long j = i;
        this.sampleBytesTransferred += j;
        this.totalBytesTransferred += j;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void onTransferEnd(androidx.media3.datasource.DataSource dataSource) {
        androidx.media3.common.util.Assertions.checkState(this.streamCount > 0);
        int i = this.streamCount - 1;
        this.streamCount = i;
        if (i > 0) {
            return;
        }
        long jElapsedRealtime = (int) (this.clock.elapsedRealtime() - this.sampleStartTimeMs);
        if (jElapsedRealtime > 0) {
            this.bandwidthStatistic.addSample(this.sampleBytesTransferred, 1000 * jElapsedRealtime);
            int i2 = this.totalSamplesAdded + 1;
            this.totalSamplesAdded = i2;
            if (i2 > this.minSamples && this.totalBytesTransferred > this.minBytesTransferred) {
                this.bandwidthEstimate = this.bandwidthStatistic.getBandwidthEstimate();
            }
            maybeNotifyBandwidthSample((int) jElapsedRealtime, this.sampleBytesTransferred, this.bandwidthEstimate);
            this.sampleBytesTransferred = 0L;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public long getBandwidthEstimate() {
        return this.bandwidthEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void onNetworkTypeChange(long j) {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (jElapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, j);
        this.bandwidthStatistic.reset();
        this.bandwidthEstimate = Long.MIN_VALUE;
        this.sampleStartTimeMs = jElapsedRealtime;
        this.sampleBytesTransferred = 0L;
        this.totalSamplesAdded = 0;
        this.totalBytesTransferred = 0L;
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            if (i == 0 && j == 0 && j2 == this.lastReportedBandwidthEstimate) {
                return;
            }
            this.lastReportedBandwidthEstimate = j2;
            this.eventDispatcher.bandwidthSample(i, j, j2);
        }
    }
}
