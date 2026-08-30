package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class DolbyVisionConfig {
    public final java.lang.String codecs;
    public final int level;
    public final int profile;

    public static androidx.media3.extractor.DolbyVisionConfig parse(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.lang.String str;
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte >> 1;
        int unsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        return new androidx.media3.extractor.DolbyVisionConfig(i, unsignedByte2, str + ".0" + i + (unsignedByte2 >= 10 ? "." : ".0") + unsignedByte2);
    }

    private DolbyVisionConfig(int i, int i2, java.lang.String str) {
        this.profile = i;
        this.level = i2;
        this.codecs = str;
    }
}
