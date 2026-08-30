package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class ConstantRateTimestampIterator implements androidx.media3.common.util.TimestampIterator {
    private final long endPositionUs;
    private final float frameRate;
    private int framesAdded;
    private final double framesDurationUs;
    private final long startPositionUs;
    private final int totalNumberOfFramesToAdd;

    public ConstantRateTimestampIterator(long j, float f) {
        this(0L, j, f);
    }

    public ConstantRateTimestampIterator(long j, long j2, float f) {
        androidx.media3.common.util.Assertions.checkArgument(j2 > 0);
        androidx.media3.common.util.Assertions.checkArgument(f > 0.0f);
        androidx.media3.common.util.Assertions.checkArgument(0 <= j && j < j2);
        this.startPositionUs = j;
        this.endPositionUs = j2;
        this.frameRate = f;
        this.totalNumberOfFramesToAdd = java.lang.Math.round(((j2 - j) / 1000000.0f) * f);
        this.framesDurationUs = 1000000.0f / f;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        return this.framesAdded < this.totalNumberOfFramesToAdd;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long next() {
        androidx.media3.common.util.Assertions.checkState(hasNext());
        int i = this.framesAdded;
        this.framesAdded = i + 1;
        return getTimestampUsAfter(i);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public androidx.media3.common.util.ConstantRateTimestampIterator copyOf() {
        return new androidx.media3.common.util.ConstantRateTimestampIterator(this.startPositionUs, this.endPositionUs, this.frameRate);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long getLastTimestampUs() {
        int i = this.totalNumberOfFramesToAdd;
        return i == 0 ? androidx.media3.common.C.TIME_UNSET : getTimestampUsAfter(i - 1);
    }

    private long getTimestampUsAfter(int i) {
        long jRound = this.startPositionUs + java.lang.Math.round(this.framesDurationUs * ((double) i));
        androidx.media3.common.util.Assertions.checkState(jRound >= 0);
        return jRound;
    }
}
