package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class VorbisUtil {
    private static final java.lang.String TAG = "VorbisUtil";

    public static int iLog(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final class CommentHeader {
        public final java.lang.String[] comments;
        public final int length;
        public final java.lang.String vendor;

        public CommentHeader(java.lang.String str, java.lang.String[] strArr, int i) {
            this.vendor = str;
            this.comments = strArr;
            this.length = i;
        }
    }

    public static final class VorbisIdHeader {
        public final int bitrateMaximum;
        public final int bitrateMinimum;
        public final int bitrateNominal;
        public final int blockSize0;
        public final int blockSize1;
        public final int channels;
        public final byte[] data;
        public final boolean framingFlag;
        public final int sampleRate;
        public final int version;

        public VorbisIdHeader(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.version = i;
            this.channels = i2;
            this.sampleRate = i3;
            this.bitrateMaximum = i4;
            this.bitrateNominal = i5;
            this.bitrateMinimum = i6;
            this.blockSize0 = i7;
            this.blockSize1 = i8;
            this.framingFlag = z;
            this.data = bArr;
        }
    }

    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean z, int i, int i2, int i3) {
            this.blockFlag = z;
            this.windowType = i;
            this.transformType = i2;
            this.mapping = i3;
        }
    }

    public static int[] getVorbisToAndroidChannelLayoutMapping(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static com.google.common.collect.ImmutableList<byte[]> parseVorbisCsdFromEsdsInitializationData(byte[] bArr) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        parsableByteArray.skipBytes(1);
        int i = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            i += 255;
            parsableByteArray.skipBytes(1);
        }
        int unsignedByte = i + parsableByteArray.readUnsignedByte();
        int i2 = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            i2 += 255;
            parsableByteArray.skipBytes(1);
        }
        int unsignedByte2 = i2 + parsableByteArray.readUnsignedByte();
        byte[] bArr2 = new byte[unsignedByte];
        int position = parsableByteArray.getPosition();
        java.lang.System.arraycopy(bArr, position, bArr2, 0, unsignedByte);
        int i3 = position + unsignedByte + unsignedByte2;
        int length = bArr.length - i3;
        byte[] bArr3 = new byte[length];
        java.lang.System.arraycopy(bArr, i3, bArr3, 0, length);
        return com.google.common.collect.ImmutableList.of(bArr2, bArr3);
    }

    public static androidx.media3.extractor.VorbisUtil.VorbisIdHeader readVorbisIdentificationHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        verifyVorbisHeaderCapturePattern(1, parsableByteArray, false);
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt <= 0) {
            littleEndianInt = -1;
        }
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt2 <= 0) {
            littleEndianInt2 = -1;
        }
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt3 <= 0) {
            littleEndianInt3 = -1;
        }
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        return new androidx.media3.extractor.VorbisUtil.VorbisIdHeader(littleEndianUnsignedIntToInt, unsignedByte, littleEndianUnsignedIntToInt2, littleEndianInt, littleEndianInt2, littleEndianInt3, (int) java.lang.Math.pow(2.0d, unsignedByte2 & 15), (int) java.lang.Math.pow(2.0d, (unsignedByte2 & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4), (parsableByteArray.readUnsignedByte() & 1) > 0, java.util.Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit()));
    }

    public static androidx.media3.extractor.VorbisUtil.CommentHeader readVorbisCommentHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        return readVorbisCommentHeader(parsableByteArray, true, true);
    }

    public static androidx.media3.extractor.VorbisUtil.CommentHeader readVorbisCommentHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z, boolean z2) throws androidx.media3.common.ParserException {
        if (z) {
            verifyVorbisHeaderCapturePattern(3, parsableByteArray, false);
        }
        java.lang.String string = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
        int length = 11 + string.length();
        long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
        java.lang.String[] strArr = new java.lang.String[(int) littleEndianUnsignedInt];
        int length2 = length + 4;
        for (int i = 0; i < littleEndianUnsignedInt; i++) {
            java.lang.String string2 = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
            strArr[i] = string2;
            length2 = length2 + 4 + string2.length();
        }
        if (z2 && (parsableByteArray.readUnsignedByte() & 1) == 0) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new androidx.media3.extractor.VorbisUtil.CommentHeader(string, strArr, length2 + 1);
    }

    public static androidx.media3.common.Metadata parseVorbisComments(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = list.get(i);
            java.lang.String[] strArrSplitAtFirst = androidx.media3.common.util.Util.splitAtFirst(str, com.ironsource.y8.i.b);
            if (strArrSplitAtFirst.length != 2) {
                androidx.media3.common.util.Log.w(TAG, "Failed to parse Vorbis comment: " + str);
            } else if (strArrSplitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(androidx.media3.extractor.metadata.flac.PictureFrame.fromPictureBlock(new androidx.media3.common.util.ParsableByteArray(android.util.Base64.decode(strArrSplitAtFirst[1], 0))));
                } catch (java.lang.RuntimeException e) {
                    androidx.media3.common.util.Log.w(TAG, "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new androidx.media3.extractor.metadata.vorbis.VorbisComment(strArrSplitAtFirst[0], strArrSplitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i, androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z) throws androidx.media3.common.ParserException {
        if (parsableByteArray.bytesLeft() < 7) {
            if (z) {
                return false;
            }
            throw androidx.media3.common.ParserException.createForMalformedContainer("too short header: " + parsableByteArray.bytesLeft(), null);
        }
        if (parsableByteArray.readUnsignedByte() != i) {
            if (z) {
                return false;
            }
            throw androidx.media3.common.ParserException.createForMalformedContainer("expected header type " + java.lang.Integer.toHexString(i), null);
        }
        if (parsableByteArray.readUnsignedByte() == 118 && parsableByteArray.readUnsignedByte() == 111 && parsableByteArray.readUnsignedByte() == 114 && parsableByteArray.readUnsignedByte() == 98 && parsableByteArray.readUnsignedByte() == 105 && parsableByteArray.readUnsignedByte() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static androidx.media3.extractor.VorbisUtil.Mode[] readVorbisModes(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) throws androidx.media3.common.ParserException {
        verifyVorbisHeaderCapturePattern(5, parsableByteArray, false);
        int unsignedByte = parsableByteArray.readUnsignedByte() + 1;
        androidx.media3.extractor.VorbisBitArray vorbisBitArray = new androidx.media3.extractor.VorbisBitArray(parsableByteArray.getData());
        vorbisBitArray.skipBits(parsableByteArray.getPosition() * 8);
        for (int i2 = 0; i2 < unsignedByte; i2++) {
            skipBook(vorbisBitArray);
        }
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i3 = 0; i3 < bits; i3++) {
            if (vorbisBitArray.readBits(16) != 0) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        readFloors(vorbisBitArray);
        readResidues(vorbisBitArray);
        readMappings(i, vorbisBitArray);
        androidx.media3.extractor.VorbisUtil.Mode[] modes = readModes(vorbisBitArray);
        if (vorbisBitArray.readBit()) {
            return modes;
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    private static androidx.media3.extractor.VorbisUtil.Mode[] readModes(androidx.media3.extractor.VorbisBitArray vorbisBitArray) {
        int bits = vorbisBitArray.readBits(6) + 1;
        androidx.media3.extractor.VorbisUtil.Mode[] modeArr = new androidx.media3.extractor.VorbisUtil.Mode[bits];
        for (int i = 0; i < bits; i++) {
            modeArr[i] = new androidx.media3.extractor.VorbisUtil.Mode(vorbisBitArray.readBit(), vorbisBitArray.readBits(16), vorbisBitArray.readBits(16), vorbisBitArray.readBits(8));
        }
        return modeArr;
    }

    private static void readMappings(int i, androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i2 = 0; i2 < bits; i2++) {
            int bits2 = vorbisBitArray.readBits(16);
            if (bits2 != 0) {
                androidx.media3.common.util.Log.e(TAG, "mapping type other than 0 not supported: " + bits2);
            } else {
                int bits3 = vorbisBitArray.readBit() ? vorbisBitArray.readBits(4) + 1 : 1;
                if (vorbisBitArray.readBit()) {
                    int bits4 = vorbisBitArray.readBits(8) + 1;
                    for (int i3 = 0; i3 < bits4; i3++) {
                        int i4 = i - 1;
                        vorbisBitArray.skipBits(iLog(i4));
                        vorbisBitArray.skipBits(iLog(i4));
                    }
                }
                if (vorbisBitArray.readBits(2) != 0) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (bits3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        vorbisBitArray.skipBits(4);
                    }
                }
                for (int i6 = 0; i6 < bits3; i6++) {
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                }
            }
        }
    }

    private static void readResidues(androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i = 0; i < bits; i++) {
            if (vorbisBitArray.readBits(16) > 2) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            int bits2 = vorbisBitArray.readBits(6) + 1;
            vorbisBitArray.skipBits(8);
            int[] iArr = new int[bits2];
            for (int i2 = 0; i2 < bits2; i2++) {
                iArr[i2] = ((vorbisBitArray.readBit() ? vorbisBitArray.readBits(5) : 0) * 8) + vorbisBitArray.readBits(3);
            }
            for (int i3 = 0; i3 < bits2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        vorbisBitArray.skipBits(8);
                    }
                }
            }
        }
    }

    private static void readFloors(androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        int bits = vorbisBitArray.readBits(6) + 1;
        for (int i = 0; i < bits; i++) {
            int bits2 = vorbisBitArray.readBits(16);
            if (bits2 == 0) {
                vorbisBitArray.skipBits(8);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(6);
                vorbisBitArray.skipBits(8);
                int bits3 = vorbisBitArray.readBits(4) + 1;
                for (int i2 = 0; i2 < bits3; i2++) {
                    vorbisBitArray.skipBits(8);
                }
            } else if (bits2 == 1) {
                int bits4 = vorbisBitArray.readBits(5);
                int[] iArr = new int[bits4];
                int i3 = -1;
                for (int i4 = 0; i4 < bits4; i4++) {
                    int bits5 = vorbisBitArray.readBits(4);
                    iArr[i4] = bits5;
                    if (bits5 > i3) {
                        i3 = bits5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = vorbisBitArray.readBits(3) + 1;
                    int bits6 = vorbisBitArray.readBits(2);
                    if (bits6 > 0) {
                        vorbisBitArray.skipBits(8);
                    }
                    for (int i7 = 0; i7 < (1 << bits6); i7++) {
                        vorbisBitArray.skipBits(8);
                    }
                }
                vorbisBitArray.skipBits(2);
                int bits7 = vorbisBitArray.readBits(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < bits4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        vorbisBitArray.skipBits(bits7);
                        i9++;
                    }
                }
            } else {
                throw androidx.media3.common.ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + bits2, null);
            }
        }
    }

    private static void skipBook(androidx.media3.extractor.VorbisBitArray vorbisBitArray) throws androidx.media3.common.ParserException {
        long jMapType1QuantValues;
        if (vorbisBitArray.readBits(24) != 5653314) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + vorbisBitArray.getPosition(), null);
        }
        int bits = vorbisBitArray.readBits(16);
        int bits2 = vorbisBitArray.readBits(24);
        int bits3 = 0;
        if (!vorbisBitArray.readBit()) {
            boolean bit = vorbisBitArray.readBit();
            while (bits3 < bits2) {
                if (bit) {
                    if (vorbisBitArray.readBit()) {
                        vorbisBitArray.skipBits(5);
                    }
                } else {
                    vorbisBitArray.skipBits(5);
                }
                bits3++;
            }
        } else {
            vorbisBitArray.skipBits(5);
            while (bits3 < bits2) {
                bits3 += vorbisBitArray.readBits(iLog(bits2 - bits3));
            }
        }
        int bits4 = vorbisBitArray.readBits(4);
        if (bits4 > 2) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + bits4, null);
        }
        if (bits4 == 1 || bits4 == 2) {
            vorbisBitArray.skipBits(32);
            vorbisBitArray.skipBits(32);
            int bits5 = vorbisBitArray.readBits(4) + 1;
            vorbisBitArray.skipBits(1);
            if (bits4 == 1) {
                jMapType1QuantValues = bits != 0 ? mapType1QuantValues(bits2, bits) : 0L;
            } else {
                jMapType1QuantValues = ((long) bits) * ((long) bits2);
            }
            vorbisBitArray.skipBits((int) (jMapType1QuantValues * ((long) bits5)));
        }
    }

    private static long mapType1QuantValues(long j, long j2) {
        return (long) java.lang.Math.floor(java.lang.Math.pow(j, 1.0d / j2));
    }

    private VorbisUtil() {
    }
}
