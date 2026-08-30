package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class IndexSeeker implements androidx.media3.extractor.mp3.Seeker {
    static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    private final int averageBitrate;
    private final long dataEndPosition;
    private long durationUs;
    private final androidx.media3.common.util.LongArray positions;
    private final androidx.media3.common.util.LongArray timesUs;

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public IndexSeeker(long j, long j2, long j3) {
        this.durationUs = j;
        this.dataEndPosition = j3;
        androidx.media3.common.util.LongArray longArray = new androidx.media3.common.util.LongArray();
        this.timesUs = longArray;
        androidx.media3.common.util.LongArray longArray2 = new androidx.media3.common.util.LongArray();
        this.positions = longArray2;
        longArray.add(0L);
        longArray2.add(j2);
        int i = androidx.media3.common.C.RATE_UNSET_INT;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            long jScaleLargeValue = androidx.media3.common.util.Util.scaleLargeValue(j2 - j3, 8L, j, java.math.RoundingMode.HALF_UP);
            if (jScaleLargeValue > 0 && jScaleLargeValue <= 2147483647L) {
                i = (int) jScaleLargeValue;
            }
            this.averageBitrate = i;
            return;
        }
        this.averageBitrate = androidx.media3.common.C.RATE_UNSET_INT;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.timesUs.get(androidx.media3.common.util.Util.binarySearchFloor(this.positions, j, true, true));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(this.timesUs, j, true, true);
        androidx.media3.extractor.SeekPoint seekPoint = new androidx.media3.extractor.SeekPoint(this.timesUs.get(iBinarySearchFloor), this.positions.get(iBinarySearchFloor));
        if (seekPoint.timeUs == j || iBinarySearchFloor == this.timesUs.size() - 1) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(this.timesUs.get(i), this.positions.get(i)));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.averageBitrate;
    }

    public void maybeAddSeekPoint(long j, long j2) {
        if (isTimeUsInIndex(j)) {
            return;
        }
        this.timesUs.add(j);
        this.positions.add(j2);
    }

    public boolean isTimeUsInIndex(long j) {
        androidx.media3.common.util.LongArray longArray = this.timesUs;
        return j - longArray.get(longArray.size() - 1) < 100000;
    }

    void setDurationUs(long j) {
        this.durationUs = j;
    }
}
