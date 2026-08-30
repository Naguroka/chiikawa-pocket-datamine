package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class FlacSeekTableSeekMap implements androidx.media3.extractor.SeekMap {
    private final long firstFrameOffset;
    private final androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata;

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public FlacSeekTableSeekMap(androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, long j) {
        this.flacStreamMetadata = flacStreamMetadata;
        this.firstFrameOffset = j;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.flacStreamMetadata.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.flacStreamMetadata.seekTable);
        long[] jArr = this.flacStreamMetadata.seekTable.pointSampleNumbers;
        long[] jArr2 = this.flacStreamMetadata.seekTable.pointOffsets;
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(jArr, this.flacStreamMetadata.getSampleNumber(j), true, false);
        androidx.media3.extractor.SeekPoint seekPoint = getSeekPoint(iBinarySearchFloor == -1 ? 0L : jArr[iBinarySearchFloor], iBinarySearchFloor != -1 ? jArr2[iBinarySearchFloor] : 0L);
        if (seekPoint.timeUs == j || iBinarySearchFloor == jArr.length - 1) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, getSeekPoint(jArr[i], jArr2[i]));
    }

    private androidx.media3.extractor.SeekPoint getSeekPoint(long j, long j2) {
        return new androidx.media3.extractor.SeekPoint((j * 1000000) / ((long) this.flacStreamMetadata.sampleRate), this.firstFrameOffset + j2);
    }
}
