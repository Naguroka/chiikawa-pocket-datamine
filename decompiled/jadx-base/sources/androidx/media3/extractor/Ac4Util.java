package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i, int i2, int i3, int i4, int i5) {
            this.bitstreamVersion = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.frameSize = i4;
            this.sampleCount = i5;
        }
    }

    public static androidx.media3.common.Format parseAc4AnnexEFormat(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.String str, java.lang.String str2, androidx.media3.common.DrmInitData drmInitData) {
        parsableByteArray.skipBytes(1);
        return new androidx.media3.common.Format.Builder().setId(str).setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_AC4).setChannelCount(2).setSampleRate(((parsableByteArray.readUnsignedByte() & 32) >> 5) == 1 ? androidx.media3.extractor.OpusUtil.SAMPLE_RATE : 44100).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    public static androidx.media3.extractor.Ac4Util.SyncFrameInfo parseAc4SyncframeInfo(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int bits = parsableBitArray.readBits(16);
        int bits2 = parsableBitArray.readBits(16);
        if (bits2 == 65535) {
            bits2 = parsableBitArray.readBits(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = bits2 + i;
        if (bits == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int bits3 = parsableBitArray.readBits(2);
        if (bits3 == 3) {
            bits3 += readVariableBits(parsableBitArray, 2);
        }
        int i5 = bits3;
        int bits4 = parsableBitArray.readBits(10);
        if (parsableBitArray.readBit() && parsableBitArray.readBits(3) > 0) {
            parsableBitArray.skipBits(2);
        }
        int i6 = parsableBitArray.readBit() ? 48000 : 44100;
        int bits5 = parsableBitArray.readBits(4);
        if (i6 == 44100 && bits5 == 13) {
            i2 = SAMPLE_COUNT[bits5];
        } else if (i6 == 48000) {
            int[] iArr = SAMPLE_COUNT;
            if (bits5 < iArr.length) {
                int i7 = iArr[bits5];
                int i8 = bits4 % 5;
                if (i8 == 1) {
                    if (bits5 != 3 || bits5 == 8) {
                        i7++;
                    }
                } else if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4 && (bits5 == 3 || bits5 == 8 || bits5 == 11)) {
                            i7++;
                        }
                    } else if (bits5 != 3) {
                        i7++;
                    } else {
                        i7++;
                    }
                } else if (bits5 == 8 || bits5 == 11) {
                    i7++;
                }
                i2 = i7;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        return new androidx.media3.extractor.Ac4Util.SyncFrameInfo(i5, 2, i6, i4, i2);
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    public static int parseAc4SyncframeAudioSampleCount(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new androidx.media3.common.util.ParsableBitArray(bArr)).sampleCount;
    }

    public static void getAc4SampleHeader(int i, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] data = parsableByteArray.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i >> 16) & 255);
        data[5] = (byte) ((i >> 8) & 255);
        data[6] = (byte) (i & 255);
    }

    private static int readVariableBits(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i) {
        int i2 = 0;
        while (true) {
            int bits = i2 + parsableBitArray.readBits(i);
            if (!parsableBitArray.readBit()) {
                return bits;
            }
            i2 = (bits + 1) << i;
        }
    }

    private Ac4Util() {
    }
}
