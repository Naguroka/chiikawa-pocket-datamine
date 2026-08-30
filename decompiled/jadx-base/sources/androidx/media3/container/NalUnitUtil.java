package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int NAL_UNIT_TYPE_AUD = 9;
    public static final int NAL_UNIT_TYPE_IDR = 5;
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int NAL_UNIT_TYPE_PPS = 8;
    public static final int NAL_UNIT_TYPE_PREFIX = 14;
    public static final int NAL_UNIT_TYPE_SEI = 6;
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final java.lang.String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final java.lang.Object scratchEscapePositionsLock = new java.lang.Object();
    private static int[] scratchEscapePositions = new int[10];

    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, boolean z, boolean z2, int i10, int i11, int i12, boolean z3, int i13, int i14, int i15, int i16) {
            this.profileIdc = i;
            this.constraintsFlagsAndReservedZero2Bits = i2;
            this.levelIdc = i3;
            this.seqParameterSetId = i4;
            this.maxNumRefFrames = i5;
            this.width = i6;
            this.height = i7;
            this.pixelWidthHeightRatio = f;
            this.bitDepthLumaMinus8 = i8;
            this.bitDepthChromaMinus8 = i9;
            this.separateColorPlaneFlag = z;
            this.frameMbsOnlyFlag = z2;
            this.frameNumLength = i10;
            this.picOrderCountType = i11;
            this.picOrderCntLsbLength = i12;
            this.deltaPicOrderAlwaysZeroFlag = z3;
            this.colorSpace = i13;
            this.colorRange = i14;
            this.colorTransfer = i15;
            this.maxNumReorderFrames = i16;
        }
    }

    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;
        public final int height;
        public final int maxNumReorderPics;
        public final float pixelWidthHeightRatio;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int[] iArr, int i7, int i8, int i9, int i10, float f, int i11, int i12, int i13, int i14) {
            this.generalProfileSpace = i;
            this.generalTierFlag = z;
            this.generalProfileIdc = i2;
            this.generalProfileCompatibilityFlags = i3;
            this.chromaFormatIdc = i4;
            this.bitDepthLumaMinus8 = i5;
            this.bitDepthChromaMinus8 = i6;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i7;
            this.seqParameterSetId = i8;
            this.width = i9;
            this.height = i10;
            this.pixelWidthHeightRatio = f;
            this.maxNumReorderPics = i11;
            this.colorSpace = i12;
            this.colorRange = i13;
            this.colorTransfer = i14;
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i, int i2, boolean z) {
            this.picParameterSetId = i;
            this.seqParameterSetId = i2;
            this.bottomFieldPicOrderInFramePresentFlag = z;
        }
    }

    public static int unescapeStream(byte[] bArr, int i) {
        int i2;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i3 = 0;
            while (iFindNextUnescapeIndex < i) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i);
                    if (iFindNextUnescapeIndex < i) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i3) {
                            scratchEscapePositions = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i3] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i3++;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            i2 = i - i3;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = scratchEscapePositions[i6] - i5;
                java.lang.System.arraycopy(bArr, i5, bArr, i4, i7);
                int i8 = i4 + i7;
                int i9 = i8 + 1;
                bArr[i8] = 0;
                i4 = i9 + 1;
                bArr[i9] = 0;
                i5 += i7 + 3;
            }
            java.lang.System.arraycopy(bArr, i5, bArr, i4, i2 - i4);
        }
        return i2;
    }

    public static void discardToSps(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < iPosition) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        byteBufferDuplicate.position(i - 3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean isNalUnitSei(java.lang.String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b & 126) >> 1) == 39;
    }

    public static int getNalUnitType(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int getH265NalUnitType(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnit(byte[] bArr, int i, int i2) {
        return parseSpsNalUnitPayload(bArr, i + 1, i2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:125:0x0209  */
    /* JADX WARN: Code duplicated, block: B:127:0x0228  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0157  */
    /* JADX WARN: Code duplicated, block: B:84:0x015d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:90:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0180  */
    /* JADX WARN: Code duplicated, block: B:96:0x019a  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3  */
    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnitPayload(byte[] bArr, int i, int i2) {
        int unsignedExpGolombCodedInt;
        boolean bit;
        int unsignedExpGolombCodedInt2;
        int unsignedExpGolombCodedInt3;
        int unsignedExpGolombCodedInt4;
        boolean z;
        boolean bit2;
        int i3;
        int i4;
        int unsignedExpGolombCodedInt5;
        int iIsoColorPrimariesToColorSpace;
        float f;
        int i5;
        int i6;
        float f2;
        int i7;
        int iIsoTransferCharacteristicsToColorTransfer;
        int i8;
        boolean bit3;
        boolean bit4;
        int bits;
        float[] fArr;
        int bits2;
        int bits3;
        int i9;
        int i10;
        int i11;
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i, i2);
        int bits4 = parsableNalUnitBitArray.readBits(8);
        int bits5 = parsableNalUnitBitArray.readBits(8);
        int bits6 = parsableNalUnitBitArray.readBits(8);
        int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (bits4 == 100 || bits4 == 110 || bits4 == 122 || bits4 == 244 || bits4 == 44 || bits4 == 83 || bits4 == 86 || bits4 == 118 || bits4 == 128 || bits4 == 138) {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bit = unsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i12 = unsignedExpGolombCodedInt == 3 ? 12 : 8;
                int i13 = 0;
                while (i13 < i12) {
                    if (parsableNalUnitBitArray.readBit()) {
                        skipScalingList(parsableNalUnitBitArray, i13 < 6 ? 16 : 64);
                    }
                    i13++;
                }
            }
        } else {
            unsignedExpGolombCodedInt = 1;
            bit = false;
            unsignedExpGolombCodedInt2 = 0;
            unsignedExpGolombCodedInt3 = 0;
        }
        int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt8 == 0) {
            unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        } else {
            if (unsignedExpGolombCodedInt8 == 1) {
                boolean bit5 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                bits4 = bits4;
                long unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i14 = 0; i14 < unsignedExpGolombCodedInt9; i14++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z = bit5;
                unsignedExpGolombCodedInt4 = 0;
            } else {
                unsignedExpGolombCodedInt4 = 0;
            }
            int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
            bit2 = parsableNalUnitBitArray.readBit();
            int i15 = (2 - (bit2 ? 1 : 0)) * unsignedExpGolombCodedInt12;
            if (!bit2) {
                parsableNalUnitBitArray.skipBit();
            }
            parsableNalUnitBitArray.skipBit();
            i3 = unsignedExpGolombCodedInt11 * 16;
            i4 = i15 * 16;
            if (parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt13 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt14 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt15 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt16 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (unsignedExpGolombCodedInt == 0) {
                    i11 = 2 - (bit2 ? 1 : 0);
                    i9 = 1;
                } else {
                    if (unsignedExpGolombCodedInt == 3) {
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    if (unsignedExpGolombCodedInt == 1) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    i11 = i10 * (2 - (bit2 ? 1 : 0));
                }
                i3 -= (unsignedExpGolombCodedInt13 + unsignedExpGolombCodedInt14) * i9;
                i4 -= (unsignedExpGolombCodedInt15 + unsignedExpGolombCodedInt16) * i11;
            }
            int i16 = i4;
            int i17 = bits4;
            int i18 = i3;
            unsignedExpGolombCodedInt5 = ((i17 != 44 || i17 == 86 || i17 == 100 || i17 == 110 || i17 == 122 || i17 == 244) && (bits5 & 16) != 0) ? 0 : 16;
            iIsoColorPrimariesToColorSpace = -1;
            f = 1.0f;
            if (parsableNalUnitBitArray.readBit()) {
                if (parsableNalUnitBitArray.readBit()) {
                    bits = parsableNalUnitBitArray.readBits(8);
                    if (bits == 255) {
                        bits2 = parsableNalUnitBitArray.readBits(16);
                        bits3 = parsableNalUnitBitArray.readBits(16);
                        if (bits2 != 0 && bits3 != 0) {
                            f = bits2 / bits3;
                        }
                    } else {
                        fArr = ASPECT_RATIO_IDC_VALUES;
                        if (bits < fArr.length) {
                            f = fArr[bits];
                        } else {
                            androidx.media3.common.util.Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits);
                        }
                    }
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBit();
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(3);
                    i8 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                    if (parsableNalUnitBitArray.readBit()) {
                        int bits7 = parsableNalUnitBitArray.readBits(8);
                        int bits8 = parsableNalUnitBitArray.readBits(8);
                        parsableNalUnitBitArray.skipBits(8);
                        iIsoColorPrimariesToColorSpace = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(bits7);
                        iIsoTransferCharacteristicsToColorTransfer = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8);
                    } else {
                        iIsoTransferCharacteristicsToColorTransfer = -1;
                    }
                } else {
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                    i8 = -1;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(65);
                }
                bit3 = parsableNalUnitBitArray.readBit();
                if (bit3) {
                    skipHrdParameters(parsableNalUnitBitArray);
                }
                bit4 = parsableNalUnitBitArray.readBit();
                if (bit4) {
                    skipHrdParameters(parsableNalUnitBitArray);
                }
                if (!bit3 || bit4) {
                    parsableNalUnitBitArray.skipBit();
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBit();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i5 = unsignedExpGolombCodedInt5;
                i6 = iIsoTransferCharacteristicsToColorTransfer;
                f2 = f;
                i7 = i8;
            } else {
                i5 = unsignedExpGolombCodedInt5;
                i6 = -1;
                f2 = 1.0f;
                i7 = -1;
            }
            return new androidx.media3.container.NalUnitUtil.SpsData(i17, bits5, bits6, unsignedExpGolombCodedInt6, unsignedExpGolombCodedInt10, i18, i16, f2, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3, bit, bit2, unsignedExpGolombCodedInt7, unsignedExpGolombCodedInt8, unsignedExpGolombCodedInt4, z, iIsoColorPrimariesToColorSpace, i7, i6, i5);
        }
        z = false;
        int unsignedExpGolombCodedInt17 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt18 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int unsignedExpGolombCodedInt19 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        bit2 = parsableNalUnitBitArray.readBit();
        int i19 = (2 - (bit2 ? 1 : 0)) * unsignedExpGolombCodedInt19;
        if (!bit2) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        i3 = unsignedExpGolombCodedInt18 * 16;
        i4 = i19 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt110 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt111 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt112 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt113 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt == 0) {
                i11 = 2 - (bit2 ? 1 : 0);
                i9 = 1;
            } else {
                if (unsignedExpGolombCodedInt == 3) {
                    i9 = 1;
                } else {
                    i9 = 2;
                }
                if (unsignedExpGolombCodedInt == 1) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                i11 = i10 * (2 - (bit2 ? 1 : 0));
            }
            i3 -= (unsignedExpGolombCodedInt110 + unsignedExpGolombCodedInt111) * i9;
            i4 -= (unsignedExpGolombCodedInt112 + unsignedExpGolombCodedInt113) * i11;
        }
        int i110 = i4;
        int i111 = bits4;
        int i112 = i3;
        if (i111 != 44) {
        }
        iIsoColorPrimariesToColorSpace = -1;
        f = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                bits = parsableNalUnitBitArray.readBits(8);
                if (bits == 255) {
                    bits2 = parsableNalUnitBitArray.readBits(16);
                    bits3 = parsableNalUnitBitArray.readBits(16);
                    if (bits2 != 0) {
                        f = bits2 / bits3;
                    }
                } else {
                    fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits < fArr.length) {
                        f = fArr[bits];
                    } else {
                        androidx.media3.common.util.Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                if (parsableNalUnitBitArray.readBit()) {
                }
                if (parsableNalUnitBitArray.readBit()) {
                    int bits9 = parsableNalUnitBitArray.readBits(8);
                    int bits10 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    iIsoColorPrimariesToColorSpace = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(bits9);
                    iIsoTransferCharacteristicsToColorTransfer = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(bits10);
                } else {
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                }
            } else {
                iIsoTransferCharacteristicsToColorTransfer = -1;
                i8 = -1;
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(65);
            }
            bit3 = parsableNalUnitBitArray.readBit();
            if (bit3) {
                skipHrdParameters(parsableNalUnitBitArray);
            }
            bit4 = parsableNalUnitBitArray.readBit();
            if (bit4) {
                skipHrdParameters(parsableNalUnitBitArray);
            }
            if (!bit3) {
                parsableNalUnitBitArray.skipBit();
            } else {
                parsableNalUnitBitArray.skipBit();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            i5 = unsignedExpGolombCodedInt5;
            i6 = iIsoTransferCharacteristicsToColorTransfer;
            f2 = f;
            i7 = i8;
        } else {
            i5 = unsignedExpGolombCodedInt5;
            i6 = -1;
            f2 = 1.0f;
            i7 = -1;
        }
        return new androidx.media3.container.NalUnitUtil.SpsData(i111, bits5, bits6, unsignedExpGolombCodedInt6, unsignedExpGolombCodedInt17, i112, i110, f2, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3, bit, bit2, unsignedExpGolombCodedInt7, unsignedExpGolombCodedInt8, unsignedExpGolombCodedInt4, z, iIsoColorPrimariesToColorSpace, i7, i6, i5);
    }

    public static androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnit(byte[] bArr, int i, int i2) {
        return parseH265SpsNalUnitPayload(bArr, i + 2, i2);
    }

    public static androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnitPayload(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iIsoTransferCharacteristicsToColorTransfer;
        int i6;
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i, i2);
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        int bits2 = parsableNalUnitBitArray.readBits(2);
        boolean bit = parsableNalUnitBitArray.readBit();
        int bits3 = parsableNalUnitBitArray.readBits(5);
        int i7 = 0;
        for (int i8 = 0; i8 < 32; i8++) {
            if (parsableNalUnitBitArray.readBit()) {
                i7 |= 1 << i8;
            }
        }
        int[] iArr = new int[6];
        for (int i9 = 0; i9 < 6; i9++) {
            iArr[i9] = parsableNalUnitBitArray.readBits(8);
        }
        int bits4 = parsableNalUnitBitArray.readBits(8);
        int i10 = 0;
        for (int i11 = 0; i11 < bits; i11++) {
            if (parsableNalUnitBitArray.readBit()) {
                i10 += 89;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i10 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i10);
        if (bits > 0) {
            parsableNalUnitBitArray.skipBits((8 - bits) * 2);
        }
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt2 == 3) {
            parsableNalUnitBitArray.skipBit();
        }
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt3 -= ((unsignedExpGolombCodedInt2 == 1 || unsignedExpGolombCodedInt2 == 2) ? 2 : 1) * (unsignedExpGolombCodedInt5 + unsignedExpGolombCodedInt6);
            unsignedExpGolombCodedInt4 -= (unsignedExpGolombCodedInt2 == 1 ? 2 : 1) * (unsignedExpGolombCodedInt7 + unsignedExpGolombCodedInt8);
        }
        int i12 = unsignedExpGolombCodedInt4;
        int i13 = unsignedExpGolombCodedInt3;
        int i14 = i12;
        int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int iIsoColorPrimariesToColorSpace = -1;
        int iMax = -1;
        for (int i15 = parsableNalUnitBitArray.readBit() ? 0 : bits; i15 <= bits; i15++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            iMax = java.lang.Math.max(parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(), iMax);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            skipH265ScalingList(parsableNalUnitBitArray);
        }
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipShortTermReferencePictureSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            for (int i16 = 0; i16 < unsignedExpGolombCodedInt12; i16++) {
                parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt11 + 4 + 1);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        float f = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits5 = parsableNalUnitBitArray.readBits(8);
                if (bits5 == 255) {
                    int bits6 = parsableNalUnitBitArray.readBits(16);
                    int bits7 = parsableNalUnitBitArray.readBits(16);
                    if (bits6 != 0 && bits7 != 0) {
                        f = bits6 / bits7;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits5 < fArr.length) {
                        f = fArr[bits5];
                    } else {
                        androidx.media3.common.util.Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits5);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i6 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int bits8 = parsableNalUnitBitArray.readBits(8);
                    int bits9 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    iIsoColorPrimariesToColorSpace = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(bits8);
                    iIsoTransferCharacteristicsToColorTransfer = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(bits9);
                } else {
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                }
            } else {
                iIsoTransferCharacteristicsToColorTransfer = -1;
                i6 = -1;
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                i14 *= 2;
            }
            i5 = i6;
            i3 = i14;
            i4 = iIsoColorPrimariesToColorSpace;
            iIsoColorPrimariesToColorSpace = iIsoTransferCharacteristicsToColorTransfer;
        } else {
            i3 = i14;
            i4 = -1;
            i5 = -1;
        }
        return new androidx.media3.container.NalUnitUtil.H265SpsData(bits2, bit, bits3, i7, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt9, unsignedExpGolombCodedInt10, iArr, bits4, unsignedExpGolombCodedInt, i13, i3, f, iMax, i4, i5, iIsoColorPrimariesToColorSpace);
    }

    public static androidx.media3.container.NalUnitUtil.PpsData parsePpsNalUnit(byte[] bArr, int i, int i2) {
        return parsePpsNalUnitPayload(bArr, i + 1, i2);
    }

    public static androidx.media3.container.NalUnitUtil.PpsData parsePpsNalUnitPayload(byte[] bArr, int i, int i2) {
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i, i2);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new androidx.media3.container.NalUnitUtil.PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static int findNalUnit(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        androidx.media3.common.util.Assertions.checkState(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            clearPrefixFlags(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            clearPrefixFlags(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    clearPrefixFlags(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static void skipScalingList(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray, int i) {
        int signedExpGolombCodedInt = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i2) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i2 = signedExpGolombCodedInt;
            }
        }
    }

    private static void skipHrdParameters(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i = 0; i < unsignedExpGolombCodedInt; i++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static void skipH265ScalingList(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                } else {
                    int iMin = java.lang.Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void skipShortTermReferencePictureSets(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i = -1;
        int i2 = 0;
        int i3 = -1;
        while (i2 < unsignedExpGolombCodedInt) {
            if ((i2 != 0 && parsableNalUnitBitArray.readBit()) != false) {
                int i4 = i + i3;
                int unsignedExpGolombCodedInt2 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i5 = i4 + 1;
                boolean[] zArr = new boolean[i5];
                for (int i6 = 0; i6 <= i4; i6++) {
                    if (!parsableNalUnitBitArray.readBit()) {
                        zArr[i6] = parsableNalUnitBitArray.readBit();
                    } else {
                        zArr[i6] = true;
                    }
                }
                int[] iArr2 = new int[i5];
                int[] iArr3 = new int[i5];
                int i7 = 0;
                for (int i8 = i3 - 1; i8 >= 0; i8--) {
                    int i9 = iArrCopyOf[i8] + unsignedExpGolombCodedInt2;
                    if (i9 < 0 && zArr[i + i8]) {
                        iArr2[i7] = i9;
                        i7++;
                    }
                }
                if (unsignedExpGolombCodedInt2 < 0 && zArr[i4]) {
                    iArr2[i7] = unsignedExpGolombCodedInt2;
                    i7++;
                }
                for (int i10 = 0; i10 < i; i10++) {
                    int i11 = iArr[i10] + unsignedExpGolombCodedInt2;
                    if (i11 < 0 && zArr[i10]) {
                        iArr2[i7] = i11;
                        i7++;
                    }
                }
                int[] iArrCopyOf2 = java.util.Arrays.copyOf(iArr2, i7);
                int i12 = 0;
                for (int i13 = i - 1; i13 >= 0; i13--) {
                    int i14 = iArr[i13] + unsignedExpGolombCodedInt2;
                    if (i14 > 0 && zArr[i13]) {
                        iArr3[i12] = i14;
                        i12++;
                    }
                }
                if (unsignedExpGolombCodedInt2 > 0 && zArr[i4]) {
                    iArr3[i12] = unsignedExpGolombCodedInt2;
                    i12++;
                }
                for (int i15 = 0; i15 < i3; i15++) {
                    int i16 = iArrCopyOf[i15] + unsignedExpGolombCodedInt2;
                    if (i16 > 0 && zArr[i + i15]) {
                        iArr3[i12] = i16;
                        i12++;
                    }
                }
                iArrCopyOf = java.util.Arrays.copyOf(iArr3, i12);
                iArr = iArrCopyOf2;
                i = i7;
                i3 = i12;
            } else {
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr4 = new int[unsignedExpGolombCodedInt3];
                int i17 = 0;
                while (i17 < unsignedExpGolombCodedInt3) {
                    iArr4[i17] = (i17 > 0 ? iArr4[i17 - 1] : 0) - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                    i17++;
                }
                int[] iArr5 = new int[unsignedExpGolombCodedInt4];
                int i18 = 0;
                while (i18 < unsignedExpGolombCodedInt4) {
                    iArr5[i18] = (i18 > 0 ? iArr5[i18 - 1] : 0) + parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                    i18++;
                }
                i = unsignedExpGolombCodedInt3;
                iArr = iArr4;
                i3 = unsignedExpGolombCodedInt4;
                iArrCopyOf = iArr5;
            }
            i2++;
        }
    }

    private NalUnitUtil() {
    }
}
