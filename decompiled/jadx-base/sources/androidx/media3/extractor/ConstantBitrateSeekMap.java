package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public class ConstantBitrateSeekMap implements androidx.media3.extractor.SeekMap {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;

    public ConstantBitrateSeekMap(long j, long j2, int i, int i2) {
        this(j, j2, i, i2, false);
    }

    public ConstantBitrateSeekMap(long j, long j2, int i, int i2, boolean z) {
        this.inputLength = j;
        this.firstFrameBytePosition = j2;
        this.frameSize = i2 == -1 ? 1 : i2;
        this.bitrate = i;
        this.allowSeeksIfLengthUnknown = z;
        if (j == -1) {
            this.dataSize = -1L;
            this.durationUs = androidx.media3.common.C.TIME_UNSET;
        } else {
            this.dataSize = j - j2;
            this.durationUs = getTimeUsAtPosition(j, j2, i);
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1 || this.allowSeeksIfLengthUnknown;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        if (this.dataSize == -1 && !this.allowSeeksIfLengthUnknown) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(0L, this.firstFrameBytePosition));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        androidx.media3.extractor.SeekPoint seekPoint = new androidx.media3.extractor.SeekPoint(timeUsAtPosition, framePositionForTimeUs);
        if (this.dataSize != -1 && timeUsAtPosition < j) {
            int i = this.frameSize;
            if (((long) i) + framePositionForTimeUs < this.inputLength) {
                long j2 = framePositionForTimeUs + ((long) i);
                return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(getTimeUsAtPosition(j2), j2));
            }
        }
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    public long getTimeUsAtPosition(long j) {
        return getTimeUsAtPosition(j, this.firstFrameBytePosition, this.bitrate);
    }

    private static long getTimeUsAtPosition(long j, long j2, int i) {
        return ((java.lang.Math.max(0L, j - j2) * 8) * 1000000) / ((long) i);
    }

    private long getFramePositionForTimeUs(long j) {
        long j2 = (j * ((long) this.bitrate)) / 8000000;
        int i = this.frameSize;
        long jMin = (j2 / ((long) i)) * ((long) i);
        long j3 = this.dataSize;
        if (j3 != -1) {
            jMin = java.lang.Math.min(jMin, j3 - ((long) i));
        }
        return this.firstFrameBytePosition + java.lang.Math.max(jMin, 0L);
    }
}
