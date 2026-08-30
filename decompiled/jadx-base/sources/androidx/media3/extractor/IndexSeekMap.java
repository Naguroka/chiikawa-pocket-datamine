package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class IndexSeekMap implements androidx.media3.extractor.SeekMap {
    private final long durationUs;
    private final boolean isSeekable;
    private final long[] positions;
    private final long[] timesUs;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j) {
        androidx.media3.common.util.Assertions.checkArgument(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.isSeekable = z;
        if (z && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.positions = jArr3;
            long[] jArr4 = new long[i];
            this.timesUs = jArr4;
            java.lang.System.arraycopy(jArr, 0, jArr3, 1, length);
            java.lang.System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.positions = jArr;
            this.timesUs = jArr2;
        }
        this.durationUs = j;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.isSeekable;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        if (!this.isSeekable) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(androidx.media3.extractor.SeekPoint.START);
        }
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(this.timesUs, j, true, true);
        androidx.media3.extractor.SeekPoint seekPoint = new androidx.media3.extractor.SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs == j || iBinarySearchFloor == this.timesUs.length - 1) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(this.timesUs[i], this.positions[i]));
    }
}
