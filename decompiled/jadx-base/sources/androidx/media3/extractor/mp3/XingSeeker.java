package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class XingSeeker implements androidx.media3.extractor.mp3.Seeker {
    private static final java.lang.String TAG = "XingSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] tableOfContents;
    private final int xingFrameSize;

    public static androidx.media3.extractor.mp3.XingSeeker create(androidx.media3.extractor.mp3.XingFrame xingFrame, long j) {
        long jComputeDurationUs = xingFrame.computeDurationUs();
        if (jComputeDurationUs == androidx.media3.common.C.TIME_UNSET) {
            return null;
        }
        if (xingFrame.dataSize == -1 || xingFrame.tableOfContents == null) {
            return new androidx.media3.extractor.mp3.XingSeeker(j, xingFrame.header.frameSize, jComputeDurationUs, xingFrame.header.bitrate);
        }
        return new androidx.media3.extractor.mp3.XingSeeker(j, xingFrame.header.frameSize, jComputeDurationUs, xingFrame.header.bitrate, xingFrame.dataSize, xingFrame.tableOfContents);
    }

    private XingSeeker(long j, int i, long j2, int i2) {
        this(j, i, j2, i2, -1L, null);
    }

    private XingSeeker(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.dataStartPosition = j;
        this.xingFrameSize = i;
        this.durationUs = j2;
        this.bitrate = i2;
        this.dataSize = j3;
        this.tableOfContents = jArr;
        this.dataEndPosition = j3 != -1 ? j + j3 : -1L;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        if (!isSeekable()) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(0L, this.dataStartPosition + ((long) this.xingFrameSize)));
        }
        long jConstrainValue = androidx.media3.common.util.Util.constrainValue(j, 0L, this.durationUs);
        double d = (jConstrainValue * 100.0d) / this.durationUs;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = (long[]) androidx.media3.common.util.Assertions.checkStateNotNull(this.tableOfContents);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(jConstrainValue, this.dataStartPosition + androidx.media3.common.util.Util.constrainValue(java.lang.Math.round((d2 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        long j2 = j - this.dataStartPosition;
        if (!isSeekable() || j2 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = (long[]) androidx.media3.common.util.Assertions.checkStateNotNull(this.tableOfContents);
        double d = (j2 * 256.0d) / this.dataSize;
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(jArr, (long) d, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j3 = jArr[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i);
        long j4 = iBinarySearchFloor == 99 ? 256L : jArr[i];
        return timeUsForTableIndex + java.lang.Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (timeUsForTableIndex2 - timeUsForTableIndex));
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    private long getTimeUsForTableIndex(int i) {
        return (this.durationUs * ((long) i)) / 100;
    }
}
