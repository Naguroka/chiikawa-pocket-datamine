package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final java.lang.String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final java.util.List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static androidx.media3.extractor.HevcConfig parse(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        try {
            parsableByteArray.skipBytes(21);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i = 0;
            for (int i2 = 0; i2 < unsignedByte2; i2++) {
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i3 = 0; i3 < unsignedShort; i3++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i];
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            float f = 1.0f;
            java.lang.String strBuildHevcCodecString = null;
            int i12 = 0;
            for (int i13 = 0; i13 < unsignedByte2; i13++) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int i14 = 0;
                for (int unsignedShort3 = parsableByteArray.readUnsignedShort(); i14 < unsignedShort3; unsignedShort3 = unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    int i15 = unsignedByte2;
                    java.lang.System.arraycopy(androidx.media3.container.NalUnitUtil.NAL_START_CODE, 0, bArr, i12, androidx.media3.container.NalUnitUtil.NAL_START_CODE.length);
                    int length = i12 + androidx.media3.container.NalUnitUtil.NAL_START_CODE.length;
                    java.lang.System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i14 == 0) {
                        androidx.media3.container.NalUnitUtil.H265SpsData h265SpsNalUnit = androidx.media3.container.NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        int i16 = h265SpsNalUnit.width;
                        i5 = h265SpsNalUnit.height;
                        i6 = h265SpsNalUnit.bitDepthLumaMinus8 + 8;
                        i7 = h265SpsNalUnit.bitDepthChromaMinus8 + 8;
                        int i17 = h265SpsNalUnit.colorSpace;
                        int i18 = h265SpsNalUnit.colorRange;
                        int i19 = h265SpsNalUnit.colorTransfer;
                        float f2 = h265SpsNalUnit.pixelWidthHeightRatio;
                        int i20 = h265SpsNalUnit.maxNumReorderPics;
                        i4 = i16;
                        strBuildHevcCodecString = androidx.media3.common.util.CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc);
                        i9 = i18;
                        i8 = i17;
                        i11 = i20;
                        f = f2;
                        i10 = i19;
                    }
                    i12 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i14++;
                    unsignedByte2 = i15;
                    unsignedByte3 = unsignedByte3;
                }
            }
            return new androidx.media3.extractor.HevcConfig(i == 0 ? java.util.Collections.emptyList() : java.util.Collections.singletonList(bArr), unsignedByte + 1, i4, i5, i6, i7, i8, i9, i10, f, i11, strBuildHevcCodecString);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }

    private HevcConfig(java.util.List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, java.lang.String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.width = i2;
        this.height = i3;
        this.bitdepthLuma = i4;
        this.bitdepthChroma = i5;
        this.colorSpace = i6;
        this.colorRange = i7;
        this.colorTransfer = i8;
        this.pixelWidthHeightRatio = f;
        this.maxNumReorderPics = i9;
        this.codecs = str;
    }
}
