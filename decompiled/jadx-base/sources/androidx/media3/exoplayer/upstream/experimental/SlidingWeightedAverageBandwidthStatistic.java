package androidx.media3.exoplayer.upstream.experimental;

/* JADX INFO: loaded from: classes.dex */
public class SlidingWeightedAverageBandwidthStatistic implements androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    private double bitrateWeightProductSum;
    private final androidx.media3.common.util.Clock clock;
    private final androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction sampleEvictionFunction;
    private final java.util.ArrayDeque<androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample> samples;
    private double weightSum;

    public interface SampleEvictionFunction {
        boolean shouldEvictSample(java.util.Deque<androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample> deque);
    }

    public static class Sample {
        public final long bitrate;
        public final long timeAddedMs;
        public final double weight;

        public Sample(long j, double d, long j2) {
            this.bitrate = j;
            this.weight = d;
            this.timeAddedMs = j2;
        }
    }

    public static androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction getMaxCountEvictionFunction(final long j) {
        return new androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(java.util.Deque deque) {
                return androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(j, deque);
            }
        };
    }

    static /* synthetic */ boolean lambda$getMaxCountEvictionFunction$0(long j, java.util.Deque deque) {
        return ((long) deque.size()) >= j;
    }

    public static androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction getAgeBasedEvictionFunction(long j) {
        return getAgeBasedEvictionFunction(j, androidx.media3.common.util.Clock.DEFAULT);
    }

    static androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction getAgeBasedEvictionFunction(final long j, final androidx.media3.common.util.Clock clock) {
        return new androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic$$ExternalSyntheticLambda1
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(java.util.Deque deque) {
                return androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(j, clock, deque);
            }
        };
    }

    static /* synthetic */ boolean lambda$getAgeBasedEvictionFunction$1(long j, androidx.media3.common.util.Clock clock, java.util.Deque deque) {
        return !deque.isEmpty() && ((androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample) androidx.media3.common.util.Util.castNonNull((androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample) deque.peek())).timeAddedMs + j < clock.elapsedRealtime();
    }

    public SlidingWeightedAverageBandwidthStatistic() {
        this(getMaxCountEvictionFunction(10L));
    }

    public SlidingWeightedAverageBandwidthStatistic(androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction sampleEvictionFunction) {
        this(sampleEvictionFunction, androidx.media3.common.util.Clock.DEFAULT);
    }

    SlidingWeightedAverageBandwidthStatistic(androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction sampleEvictionFunction, androidx.media3.common.util.Clock clock) {
        this.samples = new java.util.ArrayDeque<>();
        this.sampleEvictionFunction = sampleEvictionFunction;
        this.clock = clock;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j2) {
        while (this.sampleEvictionFunction.shouldEvictSample(this.samples)) {
            androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample sampleRemove = this.samples.remove();
            this.bitrateWeightProductSum -= sampleRemove.bitrate * sampleRemove.weight;
            this.weightSum -= sampleRemove.weight;
        }
        androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample sample = new androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.Sample((j * 8000000) / j2, java.lang.Math.sqrt(j), this.clock.elapsedRealtime());
        this.samples.add(sample);
        this.bitrateWeightProductSum += sample.bitrate * sample.weight;
        this.weightSum += sample.weight;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.bitrateWeightProductSum / this.weightSum);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.bitrateWeightProductSum = 0.0d;
        this.weightSum = 0.0d;
    }
}
