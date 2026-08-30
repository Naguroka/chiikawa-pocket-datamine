package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class AacUtil {
    public static final int AAC_ELD_MAX_RATE_BYTES_PER_SECOND = 8000;
    public static final int AAC_HE_AUDIO_SAMPLE_COUNT = 2048;
    public static final int AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND = 7000;
    public static final int AAC_LC_AUDIO_SAMPLE_COUNT = 1024;
    public static final int AAC_LC_MAX_RATE_BYTES_PER_SECOND = 100000;
    public static final int AAC_LD_AUDIO_SAMPLE_COUNT = 512;
    public static final int AAC_XHE_AUDIO_SAMPLE_COUNT = 1024;
    public static final int AAC_XHE_MAX_RATE_BYTES_PER_SECOND = 256000;
    public static final int AUDIO_OBJECT_TYPE_AAC_ELD = 23;
    public static final int AUDIO_OBJECT_TYPE_AAC_ER_BSAC = 22;
    public static final int AUDIO_OBJECT_TYPE_AAC_LC = 2;
    public static final int AUDIO_OBJECT_TYPE_AAC_PS = 29;
    public static final int AUDIO_OBJECT_TYPE_AAC_SBR = 5;
    public static final int AUDIO_OBJECT_TYPE_AAC_XHE = 42;
    private static final int AUDIO_OBJECT_TYPE_ESCAPE = 31;
    private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_CONFIGURATION_INVALID = -1;
    private static final int AUDIO_SPECIFIC_CONFIG_FREQUENCY_INDEX_ARBITRARY = 15;
    private static final java.lang.String CODECS_STRING_PREFIX = "mp4a.40.";
    private static final java.lang.String TAG = "AacUtil";
    public static final int AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND = 16000;
    private static final int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = {96000, 88200, 64000, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};
    private static final int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AacAudioObjectType {
    }

    public static byte[] buildAudioSpecificConfig(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static final class Config {
        public final int channelCount;
        public final java.lang.String codecs;
        public final int sampleRateHz;

        private Config(int i, int i2, java.lang.String str) {
            this.sampleRateHz = i;
            this.channelCount = i2;
            this.codecs = str;
        }
    }

    public static androidx.media3.extractor.AacUtil.Config parseAudioSpecificConfig(byte[] bArr) throws androidx.media3.common.ParserException {
        return parseAudioSpecificConfig(new androidx.media3.common.util.ParsableBitArray(bArr), false);
    }

    public static androidx.media3.extractor.AacUtil.Config parseAudioSpecificConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray, boolean z) throws androidx.media3.common.ParserException {
        int audioObjectType = getAudioObjectType(parsableBitArray);
        int samplingFrequency = getSamplingFrequency(parsableBitArray);
        int bits = parsableBitArray.readBits(4);
        java.lang.String str = CODECS_STRING_PREFIX + audioObjectType;
        if (audioObjectType == 5 || audioObjectType == 29) {
            samplingFrequency = getSamplingFrequency(parsableBitArray);
            audioObjectType = getAudioObjectType(parsableBitArray);
            if (audioObjectType == 22) {
                bits = parsableBitArray.readBits(4);
            }
        }
        if (z) {
            if (audioObjectType != 1 && audioObjectType != 2 && audioObjectType != 3 && audioObjectType != 4 && audioObjectType != 6 && audioObjectType != 7 && audioObjectType != 17) {
                switch (audioObjectType) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported audio object type: " + audioObjectType);
                }
            }
            parseGaSpecificConfig(parsableBitArray, audioObjectType, bits);
            switch (audioObjectType) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int bits2 = parsableBitArray.readBits(2);
                    if (bits2 == 2 || bits2 == 3) {
                        throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported epConfig: " + bits2);
                    }
                    break;
            }
        }
        int i = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[bits];
        if (i == -1) {
            throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
        }
        return new androidx.media3.extractor.AacUtil.Config(samplingFrequency, i, str);
    }

    public static byte[] buildAacLcAudioSpecificConfig(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE;
            if (i5 >= iArr.length) {
                break;
            }
            if (i == iArr[i5]) {
                i4 = i5;
            }
            i5++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i == -1 || i6 == -1) {
            throw new java.lang.IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
        }
        return buildAudioSpecificConfig(2, i4, i6);
    }

    private static int getAudioObjectType(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int bits = parsableBitArray.readBits(5);
        return bits == 31 ? parsableBitArray.readBits(6) + 32 : bits;
    }

    private static int getSamplingFrequency(androidx.media3.common.util.ParsableBitArray parsableBitArray) throws androidx.media3.common.ParserException {
        int bits = parsableBitArray.readBits(4);
        if (bits == 15) {
            if (parsableBitArray.bitsLeft() < 24) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("AAC header insufficient data", null);
            }
            return parsableBitArray.readBits(24);
        }
        if (bits < 13) {
            return AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[bits];
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    private static void parseGaSpecificConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i, int i2) {
        if (parsableBitArray.readBit()) {
            androidx.media3.common.util.Log.w(TAG, "Unexpected frameLengthFlag = 1");
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(14);
        }
        boolean bit = parsableBitArray.readBit();
        if (i2 == 0) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            parsableBitArray.skipBits(3);
        }
        if (bit) {
            if (i == 22) {
                parsableBitArray.skipBits(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                parsableBitArray.skipBits(3);
            }
            parsableBitArray.skipBits(1);
        }
    }

    private AacUtil() {
    }
}
