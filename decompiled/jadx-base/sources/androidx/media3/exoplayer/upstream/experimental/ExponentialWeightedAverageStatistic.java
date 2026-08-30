package androidx.media3.exoplayer.upstream.experimental;

/* JADX INFO: loaded from: classes.dex */
public class ExponentialWeightedAverageStatistic implements androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.9999d;
    private long bitrateEstimate;
    private final double smoothingFactor;

    public ExponentialWeightedAverageStatistic() {
        this(0.9999d);
    }

    public ExponentialWeightedAverageStatistic(double d) {
        this.smoothingFactor = d;
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j2) {
        long j3 = (8000000 * j) / j2;
        if (this.bitrateEstimate == Long.MIN_VALUE) {
            this.bitrateEstimate = j3;
        } else {
            double dPow = java.lang.Math.pow(this.smoothingFactor, java.lang.Math.sqrt(j));
            this.bitrateEstimate = (long) ((this.bitrateEstimate * dPow) + ((1.0d - dPow) * j3));
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.bitrateEstimate = Long.MIN_VALUE;
    }
}
