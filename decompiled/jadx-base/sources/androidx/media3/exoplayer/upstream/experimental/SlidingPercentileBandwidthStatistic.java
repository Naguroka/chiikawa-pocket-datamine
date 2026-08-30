package androidx.media3.exoplayer.upstream.experimental;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPercentileBandwidthStatistic implements androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final double DEFAULT_PERCENTILE = 0.5d;
    private long bitrateEstimate;
    private final int maxSampleCount;
    private final double percentile;
    private final java.util.ArrayDeque<androidx.media3.exoplayer.upstream.experimental.SlidingPercentileBandwidthStatistic.Sample> samples;
    private final java.util.TreeSet<androidx.media3.exoplayer.upstream.experimental.SlidingPercentileBandwidthStatistic.Sample> sortedSamples;
    private double weightSum;

    public SlidingPercentileBandwidthStatistic() {
        this(10, 0.5d);
    }

    public SlidingPercentileBandwidthStatistic(int i, double d) {
        androidx.media3.common.util.Assertions.checkArgument(d >= 0.0d && d <= 1.0d);
        this.maxSampleCount = i;
        this.percentile = d;
        this.samples = new java.util.ArrayDeque<>();
        this.sortedSamples = new java.util.TreeSet<>();
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j2) {
        while (this.samples.size() >= this.maxSampleCount) {
            androidx.media3.exoplayer.upstream.experimental.SlidingPercentileBandwidthStatistic.Sample sampleRemove = this.samples.remove();
            this.sortedSamples.remove(sampleRemove);
            this.weightSum -= sampleRemove.weight;
        }
        double dSqrt = java.lang.Math.sqrt(j);
        androidx.media3.exoplayer.upstream.experimental.SlidingPercentileBandwidthStatistic.Sample sample = new androidx.media3.exoplayer.upstream.experimental.SlidingPercentileBandwidthStatistic.Sample((j * 8000000) / j2, dSqrt);
        this.samples.add(sample);
        this.sortedSamples.add(sample);
        this.weightSum += dSqrt;
        this.bitrateEstimate = calculateBitrateEstimate();
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.sortedSamples.clear();
        this.weightSum = 0.0d;
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    private long calculateBitrateEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d = this.weightSum * this.percentile;
        double d2 = 0.0d;
        long j = 0;
        double d3 = 0.0d;
        for (androidx.media3.exoplayer.upstream.experimental.SlidingPercentileBandwidthStatistic.Sample sample : this.sortedSamples) {
            double d4 = d2 + (sample.weight / 2.0d);
            if (d4 >= d) {
                return j == 0 ? sample.bitrate : j + ((long) (((sample.bitrate - j) * (d - d3)) / (d4 - d3)));
            }
            j = sample.bitrate;
            d2 = (sample.weight / 2.0d) + d4;
            d3 = d4;
        }
        return j;
    }

    private static class Sample implements java.lang.Comparable<androidx.media3.exoplayer.upstream.experimental.SlidingPercentileBandwidthStatistic.Sample> {
        private final long bitrate;
        private final double weight;

        public Sample(long j, double d) {
            this.bitrate = j;
            this.weight = d;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.upstream.experimental.SlidingPercentileBandwidthStatistic.Sample sample) {
            return androidx.media3.common.util.Util.compareLong(this.bitrate, sample.bitrate);
        }
    }
}
