package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final androidx.media3.extractor.MpegAudioUtil.Header header;
    public final long[] tableOfContents;

    private XingFrame(androidx.media3.extractor.MpegAudioUtil.Header header, long j, long j2, long[] jArr, int i, int i2) {
        this.header = new androidx.media3.extractor.MpegAudioUtil.Header(header);
        this.frameCount = j;
        this.dataSize = j2;
        this.tableOfContents = jArr;
        this.encoderDelay = i;
        this.encoderPadding = i2;
    }

    public static androidx.media3.extractor.mp3.XingFrame parse(androidx.media3.extractor.MpegAudioUtil.Header header, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        long[] jArr;
        int i;
        int i2;
        int i3 = parsableByteArray.readInt();
        int unsignedIntToInt = (i3 & 1) != 0 ? parsableByteArray.readUnsignedIntToInt() : -1;
        long unsignedInt = (i3 & 2) != 0 ? parsableByteArray.readUnsignedInt() : -1L;
        if ((i3 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                jArr2[i4] = parsableByteArray.readUnsignedByte();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((i3 & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(21);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i2 = unsignedInt24 & 4095;
            i = (16773120 & unsignedInt24) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new androidx.media3.extractor.mp3.XingFrame(header, unsignedIntToInt, unsignedInt, jArr, i, i2);
    }

    public long computeDurationUs() {
        long j = this.frameCount;
        return (j == -1 || j == 0) ? androidx.media3.common.C.TIME_UNSET : androidx.media3.common.util.Util.sampleCountToDurationUs((j * ((long) this.header.samplesPerFrame)) - 1, this.header.sampleRate);
    }
}
