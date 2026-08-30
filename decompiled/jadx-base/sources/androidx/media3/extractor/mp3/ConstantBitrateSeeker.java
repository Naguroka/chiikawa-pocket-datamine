package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class ConstantBitrateSeeker extends androidx.media3.extractor.ConstantBitrateSeekMap implements androidx.media3.extractor.mp3.Seeker {
    private final int bitrate;

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    public ConstantBitrateSeeker(long j, long j2, androidx.media3.extractor.MpegAudioUtil.Header header, boolean z) {
        this(j, j2, header.bitrate, header.frameSize, z);
    }

    public ConstantBitrateSeeker(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.bitrate = i;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }
}
