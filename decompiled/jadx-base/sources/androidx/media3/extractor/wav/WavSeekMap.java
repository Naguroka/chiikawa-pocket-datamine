package androidx.media3.extractor.wav;

/* JADX INFO: loaded from: classes.dex */
final class WavSeekMap implements androidx.media3.extractor.SeekMap {
    private final long blockCount;
    private final long durationUs;
    private final long firstBlockPosition;
    private final int framesPerBlock;
    private final androidx.media3.extractor.wav.WavFormat wavFormat;

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public WavSeekMap(androidx.media3.extractor.wav.WavFormat wavFormat, int i, long j, long j2) {
        this.wavFormat = wavFormat;
        this.framesPerBlock = i;
        this.firstBlockPosition = j;
        long j3 = (j2 - j) / ((long) wavFormat.blockSize);
        this.blockCount = j3;
        this.durationUs = blockIndexToTimeUs(j3);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        long jConstrainValue = androidx.media3.common.util.Util.constrainValue((((long) this.wavFormat.frameRateHz) * j) / (((long) this.framesPerBlock) * 1000000), 0L, this.blockCount - 1);
        long j2 = this.firstBlockPosition + (((long) this.wavFormat.blockSize) * jConstrainValue);
        long jBlockIndexToTimeUs = blockIndexToTimeUs(jConstrainValue);
        androidx.media3.extractor.SeekPoint seekPoint = new androidx.media3.extractor.SeekPoint(jBlockIndexToTimeUs, j2);
        if (jBlockIndexToTimeUs >= j || jConstrainValue == this.blockCount - 1) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        long j3 = jConstrainValue + 1;
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(blockIndexToTimeUs(j3), this.firstBlockPosition + (((long) this.wavFormat.blockSize) * j3)));
    }

    private long blockIndexToTimeUs(long j) {
        return androidx.media3.common.util.Util.scaleLargeTimestamp(j * ((long) this.framesPerBlock), 1000000L, this.wavFormat.frameRateHz);
    }
}
