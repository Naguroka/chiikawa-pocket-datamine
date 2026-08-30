package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class MlltSeeker implements androidx.media3.extractor.mp3.Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return androidx.media3.common.C.RATE_UNSET_INT;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public static androidx.media3.extractor.mp3.MlltSeeker create(long j, androidx.media3.extractor.metadata.id3.MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.bytesDeviations.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i3]);
            j3 += (long) (mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new androidx.media3.extractor.mp3.MlltSeeker(jArr, jArr2, j2);
    }

    private MlltSeeker(long[] jArr, long[] jArr2, long j) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.durationUs = j == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.util.Util.msToUs(jArr2[jArr2.length - 1]) : j;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        android.util.Pair<java.lang.Long, java.lang.Long> pairLinearlyInterpolate = linearlyInterpolate(androidx.media3.common.util.Util.usToMs(androidx.media3.common.util.Util.constrainValue(j, 0L, this.durationUs)), this.referenceTimesMs, this.referencePositions);
        return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(androidx.media3.common.util.Util.msToUs(((java.lang.Long) pairLinearlyInterpolate.first).longValue()), ((java.lang.Long) pairLinearlyInterpolate.second).longValue()));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return androidx.media3.common.util.Util.msToUs(((java.lang.Long) linearlyInterpolate(j, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    private static android.util.Pair<java.lang.Long, java.lang.Long> linearlyInterpolate(long j, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(jArr, j, true, true);
        long j2 = jArr[iBinarySearchFloor];
        long j3 = jArr2[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        if (i == jArr.length) {
            return android.util.Pair.create(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
