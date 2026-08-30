package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class CodecSpecificDataUtil {
    private static final int EXTENDED_PAR = 15;
    private static final int RECTANGULAR = 0;
    private static final int VISUAL_OBJECT_LAYER = 1;
    private static final int VISUAL_OBJECT_LAYER_START = 32;
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final java.lang.String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        parsableByteArray.setPosition(9);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return android.util.Pair.create(java.lang.Integer.valueOf(parsableByteArray.readUnsignedIntToInt()), java.lang.Integer.valueOf(unsignedByte));
    }

    public static java.util.List<byte[]> buildCea708InitializationData(boolean z) {
        return java.util.Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static boolean parseCea708InitializationData(java.util.List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 >= bArr.length) {
                z = false;
                break;
            }
            if (parsableByteArray.readUnsignedInt24() == 1 && (bArr[i3] & 240) == 32) {
                z = true;
                break;
            }
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 2);
            i2++;
        }
        androidx.media3.common.util.Assertions.checkArgument(z, "Invalid input: VOL not found.");
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(bArr);
        parsableBitArray.skipBits((i2 + 4) * 8);
        parsableBitArray.skipBits(1);
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        if (parsableBitArray.readBits(4) == 15) {
            parsableBitArray.skipBits(8);
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(79);
            }
        }
        androidx.media3.common.util.Assertions.checkArgument(parsableBitArray.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        androidx.media3.common.util.Assertions.checkArgument(parsableBitArray.readBit());
        int bits = parsableBitArray.readBits(16);
        androidx.media3.common.util.Assertions.checkArgument(parsableBitArray.readBit());
        if (parsableBitArray.readBit()) {
            androidx.media3.common.util.Assertions.checkArgument(bits > 0);
            for (int i4 = bits - 1; i4 > 0; i4 >>= 1) {
                i++;
            }
            parsableBitArray.skipBits(i);
        }
        androidx.media3.common.util.Assertions.checkArgument(parsableBitArray.readBit());
        int bits2 = parsableBitArray.readBits(13);
        androidx.media3.common.util.Assertions.checkArgument(parsableBitArray.readBit());
        int bits3 = parsableBitArray.readBits(13);
        androidx.media3.common.util.Assertions.checkArgument(parsableBitArray.readBit());
        parsableBitArray.skipBits(1);
        return android.util.Pair.create(java.lang.Integer.valueOf(bits2), java.lang.Integer.valueOf(bits3));
    }

    public static java.lang.String buildAvcCodecString(int i, int i2, int i3) {
        return java.lang.String.format("avc1.%02X%02X%02X", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
    }

    public static java.lang.String buildHevcCodecString(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = HEVC_GENERAL_PROFILE_SPACE_STRINGS[i];
        objArr[1] = java.lang.Integer.valueOf(i2);
        objArr[2] = java.lang.Integer.valueOf(i3);
        objArr[3] = java.lang.Character.valueOf(z ? 'H' : 'L');
        objArr[4] = java.lang.Integer.valueOf(i4);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.media3.common.util.Util.formatInvariant("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(java.lang.String.format(".%02X", java.lang.Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] buildNalUnit(byte[] bArr, int i, int i2) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i2];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        java.lang.System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iFindNalStartCode = 0;
        do {
            arrayList.add(java.lang.Integer.valueOf(iFindNalStartCode));
            iFindNalStartCode = findNalStartCode(bArr, iFindNalStartCode + NAL_START_CODE.length);
        } while (iFindNalStartCode != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i = 0;
        while (i < arrayList.size()) {
            int iIntValue = ((java.lang.Integer) arrayList.get(i)).intValue();
            int iIntValue2 = (i < arrayList.size() + (-1) ? ((java.lang.Integer) arrayList.get(i + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            java.lang.System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i] = bArr3;
            i++;
        }
        return bArr2;
    }

    private static int findNalStartCode(byte[] bArr, int i) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i <= length) {
            if (isNalStartCode(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static boolean isNalStartCode(byte[] bArr, int i) {
        if (bArr.length - i <= NAL_START_CODE.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private CodecSpecificDataUtil() {
    }
}
