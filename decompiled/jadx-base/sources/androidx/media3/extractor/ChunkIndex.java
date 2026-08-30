package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class ChunkIndex implements androidx.media3.extractor.SeekMap {
    private final long durationUs;
    public final long[] durationsUs;
    public final int length;
    public final long[] offsets;
    public final int[] sizes;
    public final long[] timesUs;

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.sizes = iArr;
        this.offsets = jArr;
        this.durationsUs = jArr2;
        this.timesUs = jArr3;
        int length = iArr.length;
        this.length = length;
        if (length > 0) {
            this.durationUs = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.durationUs = 0L;
        }
    }

    public int getChunkIndex(long j) {
        return androidx.media3.common.util.Util.binarySearchFloor(this.timesUs, j, true, true);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        int chunkIndex = getChunkIndex(j);
        androidx.media3.extractor.SeekPoint seekPoint = new androidx.media3.extractor.SeekPoint(this.timesUs[chunkIndex], this.offsets[chunkIndex]);
        if (seekPoint.timeUs >= j || chunkIndex == this.length - 1) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i = chunkIndex + 1;
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(this.timesUs[i], this.offsets[i]));
    }

    public java.lang.String toString() {
        return "ChunkIndex(length=" + this.length + ", sizes=" + java.util.Arrays.toString(this.sizes) + ", offsets=" + java.util.Arrays.toString(this.offsets) + ", timeUs=" + java.util.Arrays.toString(this.timesUs) + ", durationsUs=" + java.util.Arrays.toString(this.durationsUs) + ")";
    }
}
