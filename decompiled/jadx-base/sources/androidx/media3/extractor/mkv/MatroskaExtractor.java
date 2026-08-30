package androidx.media3.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
public class MatroskaExtractor implements androidx.media3.extractor.Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final java.lang.String CODEC_ID_AAC = "A_AAC";
    private static final java.lang.String CODEC_ID_AC3 = "A_AC3";
    private static final java.lang.String CODEC_ID_ACM = "A_MS/ACM";
    private static final java.lang.String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final java.lang.String CODEC_ID_AV1 = "V_AV1";
    private static final java.lang.String CODEC_ID_DTS = "A_DTS";
    private static final java.lang.String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final java.lang.String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final java.lang.String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final java.lang.String CODEC_ID_E_AC3 = "A_EAC3";
    private static final java.lang.String CODEC_ID_FLAC = "A_FLAC";
    private static final java.lang.String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final java.lang.String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final java.lang.String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final java.lang.String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final java.lang.String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final java.lang.String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final java.lang.String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final java.lang.String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final java.lang.String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final java.lang.String CODEC_ID_OPUS = "A_OPUS";
    private static final java.lang.String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final java.lang.String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final java.lang.String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final java.lang.String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final java.lang.String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final java.lang.String CODEC_ID_THEORA = "V_THEORA";
    private static final java.lang.String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final java.lang.String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final java.lang.String CODEC_ID_VORBIS = "A_VORBIS";
    private static final java.lang.String CODEC_ID_VP8 = "V_VP8";
    private static final java.lang.String CODEC_ID_VP9 = "V_VP9";
    private static final java.lang.String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    private static final java.lang.String DOC_TYPE_MATROSKA = "matroska";
    private static final java.lang.String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 2;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_BITS_PER_CHANNEL = 21938;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISCARD_PADDING = 30114;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final java.lang.String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final java.lang.String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final java.lang.String TAG = "MatroskaExtractor";
    private static final java.util.Map<java.lang.String, java.lang.Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    private static final java.lang.String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    private static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;
    private androidx.media3.common.util.LongArray cueClusterPositions;
    private androidx.media3.common.util.LongArray cueTimesUs;
    private long cuesContentPosition;
    private androidx.media3.extractor.mkv.MatroskaExtractor.Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final androidx.media3.common.util.ParsableByteArray encryptionInitializationVector;
    private final androidx.media3.common.util.ParsableByteArray encryptionSubsampleData;
    private java.nio.ByteBuffer encryptionSubsampleDataBuffer;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final androidx.media3.common.util.ParsableByteArray nalLength;
    private final androidx.media3.common.util.ParsableByteArray nalStartCode;
    private final boolean parseSubtitlesDuringExtraction;
    private final androidx.media3.extractor.mkv.EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final androidx.media3.common.util.ParsableByteArray sampleStrippedBytes;
    private final androidx.media3.common.util.ParsableByteArray scratch;
    private int seekEntryId;
    private final androidx.media3.common.util.ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private final androidx.media3.common.util.ParsableByteArray subtitleSample;
    private final androidx.media3.common.util.ParsableByteArray supplementalData;
    private long timecodeScale;
    private final android.util.SparseArray<androidx.media3.extractor.mkv.MatroskaExtractor.Track> tracks;
    private final androidx.media3.extractor.mkv.VarintReader varintReader;
    private final androidx.media3.common.util.ParsableByteArray vorbisNumPageSamples;

    @java.lang.Deprecated
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.MatroskaExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.mkv.MatroskaExtractor.lambda$static$1();
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = androidx.media3.common.util.Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final java.util.UUID WAVE_SUBFORMAT_PCM = new java.util.UUID(72057594037932032L, -9223371306706625679L);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    protected int getElementType(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case ID_TRACK_NUMBER /* 215 */:
            case ID_TIME_CODE /* 231 */:
            case ID_BLOCK_ADD_ID /* 238 */:
            case ID_CUE_CLUSTER_POSITION /* 241 */:
            case ID_REFERENCE_BLOCK /* 251 */:
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
            case ID_EBML_READ_VERSION /* 17143 */:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case ID_SEEK_POSITION /* 21420 */:
            case ID_STEREO_MODE /* 21432 */:
            case ID_DISPLAY_WIDTH /* 21680 */:
            case ID_DISPLAY_UNIT /* 21682 */:
            case ID_DISPLAY_HEIGHT /* 21690 */:
            case ID_FLAG_FORCED /* 21930 */:
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_DISCARD_PADDING /* 30114 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case ID_AUDIO /* 225 */:
            case ID_BLOCK_ADDITION_MAPPING /* 16868 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case ID_SEEK /* 19899 */:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case ID_COLOUR /* 21936 */:
            case ID_MASTERING_METADATA /* 21968 */:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case ID_BLOCK_ADDITIONS /* 30113 */:
            case ID_PROJECTION /* 30320 */:
            case ID_SEEK_HEAD /* 290298740 */:
            case 357149030:
            case ID_TRACKS /* 374648427 */:
            case ID_SEGMENT /* 408125543 */:
            case ID_EBML /* 440786851 */:
            case ID_CUES /* 475249515 */:
            case ID_CLUSTER /* 524531317 */:
                return 1;
            case 161:
            case 163:
            case 165:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /* 16877 */:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case ID_SEEK_ID /* 21419 */:
            case ID_CODEC_PRIVATE /* 25506 */:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case 181:
            case ID_DURATION /* 17545 */:
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
            case ID_LUMNINANCE_MAX /* 21977 */:
            case ID_LUMNINANCE_MIN /* 21978 */:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    protected boolean isLevel1Element(int i) {
        return i == 357149030 || i == ID_CLUSTER || i == ID_CUES || i == ID_TRACKS;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$newFactory$0(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.mkv.MatroskaExtractor(factory)};
    }

    public static androidx.media3.extractor.ExtractorsFactory newFactory(final androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.MatroskaExtractor$$ExternalSyntheticLambda1
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final androidx.media3.extractor.Extractor[] createExtractors() {
                return androidx.media3.extractor.mkv.MatroskaExtractor.lambda$newFactory$0(factory);
            }
        };
    }

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", java.lang.Integer.valueOf(org.objectweb.asm.Opcodes.GETFIELD));
        map.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = java.util.Collections.unmodifiableMap(map);
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$1() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.mkv.MatroskaExtractor(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 2)};
    }

    @java.lang.Deprecated
    public MatroskaExtractor() {
        this(new androidx.media3.extractor.mkv.DefaultEbmlReader(), 2, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED);
    }

    @java.lang.Deprecated
    public MatroskaExtractor(int i) {
        this(new androidx.media3.extractor.mkv.DefaultEbmlReader(), i | 2, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED);
    }

    public MatroskaExtractor(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this(new androidx.media3.extractor.mkv.DefaultEbmlReader(), 0, factory);
    }

    public MatroskaExtractor(androidx.media3.extractor.text.SubtitleParser.Factory factory, int i) {
        this(new androidx.media3.extractor.mkv.DefaultEbmlReader(), i, factory);
    }

    MatroskaExtractor(androidx.media3.extractor.mkv.EbmlReader ebmlReader, int i, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = androidx.media3.common.C.TIME_UNSET;
        this.durationTimecode = androidx.media3.common.C.TIME_UNSET;
        this.durationUs = androidx.media3.common.C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = androidx.media3.common.C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new androidx.media3.extractor.mkv.MatroskaExtractor.InnerEbmlProcessor());
        this.subtitleParserFactory = factory;
        this.seekForCuesEnabled = (i & 1) == 0;
        this.parseSubtitlesDuringExtraction = (i & 2) == 0;
        this.varintReader = new androidx.media3.extractor.mkv.VarintReader();
        this.tracks = new android.util.SparseArray<>();
        this.scratch = new androidx.media3.common.util.ParsableByteArray(4);
        this.vorbisNumPageSamples = new androidx.media3.common.util.ParsableByteArray(java.nio.ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new androidx.media3.common.util.ParsableByteArray(4);
        this.nalStartCode = new androidx.media3.common.util.ParsableByteArray(androidx.media3.container.NalUnitUtil.NAL_START_CODE);
        this.nalLength = new androidx.media3.common.util.ParsableByteArray(4);
        this.sampleStrippedBytes = new androidx.media3.common.util.ParsableByteArray();
        this.subtitleSample = new androidx.media3.common.util.ParsableByteArray();
        this.encryptionInitializationVector = new androidx.media3.common.util.ParsableByteArray(8);
        this.encryptionSubsampleData = new androidx.media3.common.util.ParsableByteArray();
        this.supplementalData = new androidx.media3.common.util.ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return new androidx.media3.extractor.mkv.Sniffer().sniff(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.clusterTimecodeUs = androidx.media3.common.C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        this.haveOutputSample = false;
        boolean z = true;
        while (z && !this.haveOutputSample) {
            z = this.reader.read(extractorInput);
            if (z && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            androidx.media3.extractor.mkv.MatroskaExtractor.Track trackValueAt = this.tracks.valueAt(i);
            trackValueAt.assertOutputInitialized();
            trackValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    protected void startMasterElement(int i, long j, long j2) throws androidx.media3.common.ParserException {
        assertInitialized();
        if (i == 160) {
            this.blockHasReferenceBlock = false;
            this.blockGroupDiscardPaddingNs = 0L;
            return;
        }
        if (i == 174) {
            this.currentTrack = new androidx.media3.extractor.mkv.MatroskaExtractor.Track();
            return;
        }
        if (i == 187) {
            this.seenClusterPositionForCurrentCuePoint = false;
            return;
        }
        if (i == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i == ID_CONTENT_ENCRYPTION) {
            getCurrentTrack(i).hasContentEncryption = true;
            return;
        }
        if (i == ID_MASTERING_METADATA) {
            getCurrentTrack(i).hasColorInfo = true;
            return;
        }
        if (i == ID_SEGMENT) {
            long j3 = this.segmentContentPosition;
            if (j3 != -1 && j3 != j) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.segmentContentPosition = j;
            this.segmentContentSize = j2;
            return;
        }
        if (i == ID_CUES) {
            this.cueTimesUs = new androidx.media3.common.util.LongArray();
            this.cueClusterPositions = new androidx.media3.common.util.LongArray();
        } else if (i == ID_CLUSTER && !this.sentSeekMap) {
            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                this.seekForCues = true;
            } else {
                this.extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
            }
        }
    }

    protected void endMasterElement(int i) throws androidx.media3.common.ParserException {
        assertInitialized();
        if (i == 160) {
            if (this.blockState != 2) {
                return;
            }
            androidx.media3.extractor.mkv.MatroskaExtractor.Track track = this.tracks.get(this.blockTrackNumber);
            track.assertOutputInitialized();
            if (this.blockGroupDiscardPaddingNs > 0 && CODEC_ID_OPUS.equals(track.codecId)) {
                this.supplementalData.reset(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.blockSampleCount; i3++) {
                i2 += this.blockSampleSizes[i3];
            }
            int i4 = 0;
            while (i4 < this.blockSampleCount) {
                long j = this.blockTimeUs + ((long) ((track.defaultSampleDurationNs * i4) / 1000));
                int i5 = this.blockFlags;
                if (i4 == 0 && !this.blockHasReferenceBlock) {
                    i5 |= 1;
                }
                int i6 = this.blockSampleSizes[i4];
                int i7 = i2 - i6;
                commitSampleToOutput(track, j, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.blockState = 0;
            return;
        }
        if (i == 174) {
            androidx.media3.extractor.mkv.MatroskaExtractor.Track track2 = (androidx.media3.extractor.mkv.MatroskaExtractor.Track) androidx.media3.common.util.Assertions.checkStateNotNull(this.currentTrack);
            if (track2.codecId == null) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(track2.codecId)) {
                track2.initializeOutput(this.extractorOutput, track2.number);
                this.tracks.put(track2.number, track2);
            }
            this.currentTrack = null;
            return;
        }
        if (i == ID_SEEK) {
            int i8 = this.seekEntryId;
            if (i8 != -1) {
                long j2 = this.seekEntryPosition;
                if (j2 != -1) {
                    if (i8 == ID_CUES) {
                        this.cuesContentPosition = j2;
                        return;
                    }
                    return;
                }
            }
            throw androidx.media3.common.ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == ID_CONTENT_ENCODING) {
            assertInTrackEntry(i);
            if (this.currentTrack.hasContentEncryption) {
                if (this.currentTrack.cryptoData == null) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                this.currentTrack.drmInitData = new androidx.media3.common.DrmInitData(new androidx.media3.common.DrmInitData.SchemeData(androidx.media3.common.C.UUID_NIL, "video/webm", this.currentTrack.cryptoData.encryptionKey));
                return;
            }
            return;
        }
        if (i == ID_CONTENT_ENCODINGS) {
            assertInTrackEntry(i);
            if (this.currentTrack.hasContentEncryption && this.currentTrack.sampleStrippedBytes != null) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.timecodeScale == androidx.media3.common.C.TIME_UNSET) {
                this.timecodeScale = 1000000L;
            }
            long j3 = this.durationTimecode;
            if (j3 != androidx.media3.common.C.TIME_UNSET) {
                this.durationUs = scaleTimecodeToUs(j3);
                return;
            }
            return;
        }
        if (i != ID_TRACKS) {
            if (i != ID_CUES) {
                return;
            }
            if (!this.sentSeekMap) {
                this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                this.sentSeekMap = true;
            }
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
        } else {
            if (this.tracks.size() == 0) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.extractorOutput.endTracks();
        }
    }

    protected void integerElement(int i, long j) throws androidx.media3.common.ParserException {
        if (i == ID_CONTENT_ENCODING_ORDER) {
            if (j != 0) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("ContentEncodingOrder " + j + " not supported", null);
            }
            return;
        }
        if (i == ID_CONTENT_ENCODING_SCOPE) {
            if (j != 1) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("ContentEncodingScope " + j + " not supported", null);
            }
            return;
        }
        switch (i) {
            case 131:
                getCurrentTrack(i).type = (int) j;
                return;
            case 136:
                getCurrentTrack(i).flagDefault = j == 1;
                return;
            case 155:
                this.blockDurationUs = scaleTimecodeToUs(j);
                return;
            case 159:
                getCurrentTrack(i).channelCount = (int) j;
                return;
            case 176:
                getCurrentTrack(i).width = (int) j;
                return;
            case 179:
                assertInCues(i);
                this.cueTimesUs.add(scaleTimecodeToUs(j));
                return;
            case 186:
                getCurrentTrack(i).height = (int) j;
                return;
            case ID_TRACK_NUMBER /* 215 */:
                getCurrentTrack(i).number = (int) j;
                return;
            case ID_TIME_CODE /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j);
                return;
            case ID_BLOCK_ADD_ID /* 238 */:
                this.blockAdditionalId = (int) j;
                return;
            case ID_CUE_CLUSTER_POSITION /* 241 */:
                if (this.seenClusterPositionForCurrentCuePoint) {
                    return;
                }
                assertInCues(i);
                this.cueClusterPositions.add(j);
                this.seenClusterPositionForCurrentCuePoint = true;
                return;
            case ID_REFERENCE_BLOCK /* 251 */:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i).blockAddIdType = (int) j;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j != 3) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("ContentCompAlgo " + j + " not supported", null);
                }
                return;
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j < 1 || j > 2) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j != 1) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("EBMLReadVersion " + j + " not supported", null);
                }
                return;
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j != 5) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("ContentEncAlgo " + j + " not supported", null);
                }
                return;
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j != 1) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("AESSettingsCipherMode " + j + " not supported", null);
                }
                return;
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i2 = (int) j;
                assertInTrackEntry(i);
                if (i2 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i2 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i2 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                getCurrentTrack(i).displayWidth = (int) j;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                getCurrentTrack(i).displayUnit = (int) j;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                getCurrentTrack(i).displayHeight = (int) j;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                getCurrentTrack(i).flagForced = j == 1;
                return;
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
                assertInTrackEntry(i);
                this.currentTrack.hasColorInfo = true;
                this.currentTrack.bitsPerChannel = (int) j;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                getCurrentTrack(i).maxBlockAdditionId = (int) j;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i).codecDelayNs = j;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i).seekPreRollNs = j;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                getCurrentTrack(i).audioBitDepth = (int) j;
                return;
            case ID_DISCARD_PADDING /* 30114 */:
                this.blockGroupDiscardPaddingNs = j;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                assertInTrackEntry(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i3 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i3 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                getCurrentTrack(i).defaultSampleDurationNs = (int) j;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j;
                return;
            default:
                switch (i) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        assertInTrackEntry(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        assertInTrackEntry(i);
                        int iIsoTransferCharacteristicsToColorTransfer = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.colorTransfer = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        assertInTrackEntry(i);
                        this.currentTrack.hasColorInfo = true;
                        int iIsoColorPrimariesToColorSpace = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace((int) j);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.colorSpace = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case ID_MAX_CLL /* 21948 */:
                        getCurrentTrack(i).maxContentLuminance = (int) j;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        getCurrentTrack(i).maxFrameAverageLuminance = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    protected void floatElement(int i, double d) throws androidx.media3.common.ParserException {
        if (i == 181) {
            getCurrentTrack(i).sampleRate = (int) d;
        }
        if (i == ID_DURATION) {
            this.durationTimecode = (long) d;
            return;
        }
        switch (i) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                getCurrentTrack(i).primaryRChromaticityX = (float) d;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                getCurrentTrack(i).primaryRChromaticityY = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                getCurrentTrack(i).primaryGChromaticityX = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                getCurrentTrack(i).primaryGChromaticityY = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                getCurrentTrack(i).primaryBChromaticityX = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                getCurrentTrack(i).primaryBChromaticityY = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                getCurrentTrack(i).whitePointChromaticityX = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                getCurrentTrack(i).whitePointChromaticityY = (float) d;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                getCurrentTrack(i).maxMasteringLuminance = (float) d;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                getCurrentTrack(i).minMasteringLuminance = (float) d;
                break;
            default:
                switch (i) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i).projectionPoseYaw = (float) d;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i).projectionPosePitch = (float) d;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i).projectionPoseRoll = (float) d;
                        break;
                }
                break;
        }
    }

    protected void stringElement(int i, java.lang.String str) throws androidx.media3.common.ParserException {
        if (i == 134) {
            getCurrentTrack(i).codecId = str;
            return;
        }
        if (i == 17026) {
            if (!DOC_TYPE_WEBM.equals(str) && !DOC_TYPE_MATROSKA.equals(str)) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
            }
        } else if (i == ID_NAME) {
            getCurrentTrack(i).name = str;
        } else {
            if (i != ID_LANGUAGE) {
                return;
            }
            getCurrentTrack(i).language = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0292  */
    protected void binaryElement(int i, int i2, androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.mkv.MatroskaExtractor.Track track;
        int i3;
        androidx.media3.extractor.mkv.MatroskaExtractor.Track track2;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput, i2);
                return;
            }
            if (i == ID_BLOCK_ADD_ID_EXTRA_DATA) {
                handleBlockAddIDExtraData(getCurrentTrack(i), extractorInput, i2);
                return;
            }
            if (i == ID_CONTENT_COMPRESSION_SETTINGS) {
                assertInTrackEntry(i);
                this.currentTrack.sampleStrippedBytes = new byte[i2];
                extractorInput.readFully(this.currentTrack.sampleStrippedBytes, 0, i2);
                return;
            }
            if (i == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr = new byte[i2];
                extractorInput.readFully(bArr, 0, i2);
                getCurrentTrack(i).cryptoData = new androidx.media3.extractor.TrackOutput.CryptoData(1, bArr, 0, 0);
                return;
            }
            if (i == ID_SEEK_ID) {
                java.util.Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput.readFully(this.seekEntryIdBytes.getData(), 4 - i2, i2);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i == ID_CODEC_PRIVATE) {
                assertInTrackEntry(i);
                this.currentTrack.codecPrivate = new byte[i2];
                extractorInput.readFully(this.currentTrack.codecPrivate, 0, i2);
                return;
            }
            if (i == ID_PROJECTION_PRIVATE) {
                assertInTrackEntry(i);
                this.currentTrack.projectionData = new byte[i2];
                extractorInput.readFully(this.currentTrack.projectionData, 0, i2);
                return;
            }
            throw androidx.media3.common.ParserException.createForMalformedContainer("Unexpected id: " + i, null);
        }
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = androidx.media3.common.C.TIME_UNSET;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        androidx.media3.extractor.mkv.MatroskaExtractor.Track track3 = this.tracks.get(this.blockTrackNumber);
        if (track3 == null) {
            extractorInput.skipFully(i2 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track3.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i10 = (this.scratch.getData()[2] & 6) >> 1;
            byte b = 255;
            if (i10 == 0) {
                this.blockSampleCount = 1;
                int[] iArrEnsureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = iArrEnsureArrayCapacity;
                iArrEnsureArrayCapacity[0] = (i2 - this.blockTrackNumberLength) - 3;
            } else {
                int i11 = 4;
                readScratch(extractorInput, 4);
                int i12 = (this.scratch.getData()[3] & 255) + 1;
                this.blockSampleCount = i12;
                int[] iArrEnsureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i12);
                this.blockSampleSizes = iArrEnsureArrayCapacity2;
                if (i10 == 2) {
                    int i13 = (i2 - this.blockTrackNumberLength) - 4;
                    int i14 = this.blockSampleCount;
                    java.util.Arrays.fill(iArrEnsureArrayCapacity2, 0, i14, i13 / i14);
                } else {
                    if (i10 == 1) {
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i4 = this.blockSampleCount;
                            if (i15 >= i4 - 1) {
                                break;
                            }
                            this.blockSampleSizes[i15] = 0;
                            do {
                                i11++;
                                readScratch(extractorInput, i11);
                                i5 = this.scratch.getData()[i11 - 1] & 255;
                                int[] iArr = this.blockSampleSizes;
                                i6 = iArr[i15] + i5;
                                iArr[i15] = i6;
                            } while (i5 == 255);
                            i16 += i6;
                            i15++;
                        }
                        this.blockSampleSizes[i4 - 1] = ((i2 - this.blockTrackNumberLength) - i11) - i16;
                    } else {
                        if (i10 != 3) {
                            throw androidx.media3.common.ParserException.createForMalformedContainer("Unexpected lacing value: " + i10, null);
                        }
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            int i19 = this.blockSampleCount;
                            if (i17 < i19 - 1) {
                                this.blockSampleSizes[i17] = i8;
                                i11++;
                                readScratch(extractorInput, i11);
                                int i20 = i11 - 1;
                                if (this.scratch.getData()[i20] == 0) {
                                    throw androidx.media3.common.ParserException.createForMalformedContainer("No valid varint length mask found", null);
                                }
                                int i21 = i8;
                                while (true) {
                                    if (i21 >= 8) {
                                        j = 0;
                                        break;
                                    }
                                    int i22 = i9 << (7 - i21);
                                    if ((this.scratch.getData()[i20] & i22) != 0) {
                                        int i23 = i11 + i21;
                                        readScratch(extractorInput, i23);
                                        j = (~i22) & this.scratch.getData()[i20] & b;
                                        int i24 = i20 + 1;
                                        while (i24 < i23) {
                                            j = (j << 8) | ((long) (this.scratch.getData()[i24] & b));
                                            i24++;
                                            i23 = i23;
                                            b = 255;
                                        }
                                        int i25 = i23;
                                        if (i17 > 0) {
                                            j -= (1 << ((i21 * 7) + 6)) - 1;
                                        }
                                        i11 = i25;
                                        break;
                                    }
                                    i21++;
                                    i9 = 1;
                                    b = 255;
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    throw androidx.media3.common.ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                                }
                                int i26 = (int) j;
                                int[] iArr2 = this.blockSampleSizes;
                                if (i17 != 0) {
                                    i26 += iArr2[i17 - 1];
                                }
                                iArr2[i17] = i26;
                                i18 += i26;
                                i17++;
                                track3 = track3;
                                i8 = 0;
                                i9 = 1;
                                b = 255;
                            } else {
                                track2 = track3;
                                this.blockSampleSizes[i19 - 1] = ((i2 - this.blockTrackNumberLength) - i11) - i18;
                                break;
                            }
                        }
                    }
                    this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[0] << 8) | (this.scratch.getData()[1] & 255));
                    track = track2;
                    if (track.type != 2 || (i == 163 && (this.scratch.getData()[2] & 128) == 128)) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    this.blockFlags = i7;
                    this.blockState = 2;
                    this.blockSampleIndex = 0;
                    i3 = 163;
                }
            }
            track2 = track3;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[0] << 8) | (this.scratch.getData()[1] & 255));
            track = track2;
            if (track.type != 2) {
                i7 = 1;
            } else {
                i7 = 1;
            }
            this.blockFlags = i7;
            this.blockState = 2;
            this.blockSampleIndex = 0;
            i3 = 163;
        } else {
            track = track3;
            i3 = 163;
        }
        if (i == i3) {
            while (true) {
                int i27 = this.blockSampleIndex;
                if (i27 < this.blockSampleCount) {
                    commitSampleToOutput(track, ((long) ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000)) + this.blockTimeUs, this.blockFlags, writeSampleData(extractorInput, track, this.blockSampleSizes[i27], false), 0);
                    this.blockSampleIndex++;
                } else {
                    this.blockState = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i28 = this.blockSampleIndex;
                if (i28 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                iArr3[i28] = writeSampleData(extractorInput, track, iArr3[i28], true);
                this.blockSampleIndex++;
            }
        }
    }

    protected void handleBlockAddIDExtraData(androidx.media3.extractor.mkv.MatroskaExtractor.Track track, androidx.media3.extractor.ExtractorInput extractorInput, int i) throws java.io.IOException {
        if (track.blockAddIdType == 1685485123 || track.blockAddIdType == 1685480259) {
            track.dolbyVisionConfigBytes = new byte[i];
            extractorInput.readFully(track.dolbyVisionConfigBytes, 0, i);
        } else {
            extractorInput.skipFully(i);
        }
    }

    protected void handleBlockAdditionalData(androidx.media3.extractor.mkv.MatroskaExtractor.Track track, int i, androidx.media3.extractor.ExtractorInput extractorInput, int i2) throws java.io.IOException {
        if (i == 4 && CODEC_ID_VP9.equals(track.codecId)) {
            this.supplementalData.reset(i2);
            extractorInput.readFully(this.supplementalData.getData(), 0, i2);
        } else {
            extractorInput.skipFully(i2);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"currentTrack"})
    private void assertInTrackEntry(int i) throws androidx.media3.common.ParserException {
        if (this.currentTrack == null) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void assertInCues(int i) throws androidx.media3.common.ParserException {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Element " + i + " must be in a Cues", null);
        }
    }

    protected androidx.media3.extractor.mkv.MatroskaExtractor.Track getCurrentTrack(int i) throws androidx.media3.common.ParserException {
        assertInTrackEntry(i);
        return this.currentTrack;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    private void commitSampleToOutput(androidx.media3.extractor.mkv.MatroskaExtractor.Track track, long j, int i, int i2, int i3) {
        int iLimit;
        if (track.trueHdSampleRechunker != null) {
            track.trueHdSampleRechunker.sampleMetadata(track.output, j, i, i2, i3, track.cryptoData);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId) || CODEC_ID_VTT.equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    androidx.media3.common.util.Log.w(TAG, "Skipping subtitle sample in laced block.");
                } else if (this.blockDurationUs == androidx.media3.common.C.TIME_UNSET) {
                    androidx.media3.common.util.Log.w(TAG, "Skipping subtitle sample with no duration.");
                } else {
                    setSubtitleEndTime(track.codecId, this.blockDurationUs, this.subtitleSample.getData());
                    for (int position = this.subtitleSample.getPosition(); position < this.subtitleSample.limit(); position++) {
                        if (this.subtitleSample.getData()[position] == 0) {
                            this.subtitleSample.setLimit(position);
                            break;
                        }
                    }
                    androidx.media3.extractor.TrackOutput trackOutput = track.output;
                    androidx.media3.common.util.ParsableByteArray parsableByteArray = this.subtitleSample;
                    trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                    iLimit = i2 + this.subtitleSample.limit();
                }
                iLimit = i2;
            } else {
                iLimit = i2;
            }
            if ((i & 268435456) != 0) {
                if (this.blockSampleCount > 1) {
                    this.supplementalData.reset(0);
                } else {
                    int iLimit2 = this.supplementalData.limit();
                    track.output.sampleData(this.supplementalData, iLimit2, 2);
                    iLimit += iLimit2;
                }
            }
            track.output.sampleMetadata(j, i, iLimit, i3, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private void readScratch(androidx.media3.extractor.ExtractorInput extractorInput, int i) throws java.io.IOException {
        if (this.scratch.limit() >= i) {
            return;
        }
        if (this.scratch.capacity() < i) {
            androidx.media3.common.util.ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(java.lang.Math.max(parsableByteArray.capacity() * 2, i));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i - this.scratch.limit());
        this.scratch.setLimit(i);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.output"})
    private int writeSampleData(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.mkv.MatroskaExtractor.Track track, int i, boolean z) throws java.io.IOException {
        int i2;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i);
            return finishWriteSampleData();
        }
        androidx.media3.extractor.TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & 128) == 128) {
                        throw androidx.media3.common.ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b = this.sampleSignalByte;
                if ((b & 1) == 1) {
                    boolean z2 = (b & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z2) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i3 = this.samplePartitionCount * 4;
                        this.scratch.reset(i3);
                        extractorInput.readFully(this.scratch.getData(), 0, i3);
                        this.sampleBytesRead += i3;
                        short s = (short) ((this.samplePartitionCount / 2) + 1);
                        int i4 = (s * 6) + 2;
                        java.nio.ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.encryptionSubsampleDataBuffer = java.nio.ByteBuffer.allocate(i4);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.samplePartitionCount;
                            if (i5 >= i2) {
                                break;
                            }
                            int unsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i5 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (unsignedIntToInt - i6));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(unsignedIntToInt - i6);
                            }
                            i5++;
                            i6 = unsignedIntToInt;
                        }
                        int i7 = (i - this.sampleBytesRead) - i6;
                        if (i2 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i7);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i7);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i4);
                        trackOutput.sampleData(this.encryptionSubsampleData, i4, 1);
                        this.sampleBytesWritten += i4;
                    }
                }
            } else if (track.sampleStrippedBytes != null) {
                this.sampleStrippedBytes.reset(track.sampleStrippedBytes, track.sampleStrippedBytes.length);
            }
            if (track.samplesHaveSupplementalData(z)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int iLimit = (this.sampleStrippedBytes.limit() + i) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((iLimit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((iLimit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((iLimit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (iLimit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int iLimit2 = i + this.sampleStrippedBytes.limit();
        if (CODEC_ID_H264.equals(track.codecId) || CODEC_ID_H265.equals(track.codecId)) {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i8 = track.nalUnitLengthFieldLength;
            int i9 = 4 - track.nalUnitLengthFieldLength;
            while (this.sampleBytesRead < iLimit2) {
                int i10 = this.sampleCurrentNalBytesRemaining;
                if (i10 == 0) {
                    writeToTarget(extractorInput, data, i9, i8);
                    this.sampleBytesRead += i8;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int iWriteToOutput = writeToOutput(extractorInput, trackOutput, i10);
                    this.sampleBytesRead += iWriteToOutput;
                    this.sampleBytesWritten += iWriteToOutput;
                    this.sampleCurrentNalBytesRemaining -= iWriteToOutput;
                }
            }
        } else {
            if (track.trueHdSampleRechunker != null) {
                androidx.media3.common.util.Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i11 = this.sampleBytesRead;
                if (i11 >= iLimit2) {
                    break;
                }
                int iWriteToOutput2 = writeToOutput(extractorInput, trackOutput, iLimit2 - i11);
                this.sampleBytesRead += iWriteToOutput2;
                this.sampleBytesWritten += iWriteToOutput2;
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private int finishWriteSampleData() {
        int i = this.sampleBytesWritten;
        resetWriteSampleData();
        return i;
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private void writeSubtitleSampleData(androidx.media3.extractor.ExtractorInput extractorInput, byte[] bArr, int i) throws java.io.IOException {
        int length = bArr.length + i;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(java.util.Arrays.copyOf(bArr, length + i));
        } else {
            java.lang.System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    private static void setSubtitleEndTime(java.lang.String str, long j, byte[] bArr) {
        byte[] subtitleTimecode;
        int i;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                subtitleTimecode = formatSubtitleTimecode(j, SSA_TIMECODE_FORMAT, 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                subtitleTimecode = formatSubtitleTimecode(j, VTT_TIMECODE_FORMAT, 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                subtitleTimecode = formatSubtitleTimecode(j, SUBRIP_TIMECODE_FORMAT, 1000L);
                i = 19;
                break;
            default:
                throw new java.lang.IllegalArgumentException();
        }
        java.lang.System.arraycopy(subtitleTimecode, 0, bArr, i, subtitleTimecode.length);
    }

    private static byte[] formatSubtitleTimecode(long j, java.lang.String str, long j2) {
        androidx.media3.common.util.Assertions.checkArgument(j != androidx.media3.common.C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((((long) i) * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((((long) i2) * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return androidx.media3.common.util.Util.getUtf8Bytes(java.lang.String.format(java.util.Locale.US, str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    private void writeToTarget(androidx.media3.extractor.ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws java.io.IOException {
        int iMin = java.lang.Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, iMin);
        }
    }

    private int writeToOutput(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.TrackOutput trackOutput, int i) throws java.io.IOException {
        int iBytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (iBytesLeft > 0) {
            int iMin = java.lang.Math.min(i, iBytesLeft);
            trackOutput.sampleData(this.sampleStrippedBytes, iMin);
            return iMin;
        }
        return trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, i, false);
    }

    private androidx.media3.extractor.SeekMap buildSeekMap(androidx.media3.common.util.LongArray longArray, androidx.media3.common.util.LongArray longArray2) {
        int i;
        if (this.segmentContentPosition == -1 || this.durationUs == androidx.media3.common.C.TIME_UNSET || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new androidx.media3.extractor.SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jArrCopyOf3[i3] = longArray.get(i3);
            jArrCopyOf[i3] = this.segmentContentPosition + longArray2.get(i3);
        }
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
            jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
            i2 = i4;
        }
        iArrCopyOf[i] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArrCopyOf[i]);
        long j = this.durationUs - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            androidx.media3.common.util.Log.w(TAG, "Discarding last cue point with unexpected duration: " + j);
            iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = java.util.Arrays.copyOf(jArrCopyOf3, i);
        }
        return new androidx.media3.extractor.ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private boolean maybeSeekForCues(androidx.media3.extractor.PositionHolder positionHolder, long j) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j2 = this.seekPositionAfterBuildingCues;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private long scaleTimecodeToUs(long j) throws androidx.media3.common.ParserException {
        long j2 = this.timecodeScale;
        if (j2 == androidx.media3.common.C.TIME_UNSET) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return androidx.media3.common.util.Util.scaleLargeTimestamp(j, j2, 1000L);
    }

    private static boolean isCodecSupported(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[java.lang.Math.max(iArr.length * 2, i)];
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput"})
    private void assertInitialized() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.extractorOutput);
    }

    private final class InnerEbmlProcessor implements androidx.media3.extractor.mkv.EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public int getElementType(int i) {
            return androidx.media3.extractor.mkv.MatroskaExtractor.this.getElementType(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i) {
            return androidx.media3.extractor.mkv.MatroskaExtractor.this.isLevel1Element(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i, long j, long j2) throws androidx.media3.common.ParserException {
            androidx.media3.extractor.mkv.MatroskaExtractor.this.startMasterElement(i, j, j2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i) throws androidx.media3.common.ParserException {
            androidx.media3.extractor.mkv.MatroskaExtractor.this.endMasterElement(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void integerElement(int i, long j) throws androidx.media3.common.ParserException {
            androidx.media3.extractor.mkv.MatroskaExtractor.this.integerElement(i, j);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void floatElement(int i, double d) throws androidx.media3.common.ParserException {
            androidx.media3.extractor.mkv.MatroskaExtractor.this.floatElement(i, d);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void stringElement(int i, java.lang.String str) throws androidx.media3.common.ParserException {
            androidx.media3.extractor.mkv.MatroskaExtractor.this.stringElement(i, str);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void binaryElement(int i, int i2, androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
            androidx.media3.extractor.mkv.MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }
    }

    protected static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        private int blockAddIdType;
        public java.lang.String codecId;
        public byte[] codecPrivate;
        public androidx.media3.extractor.TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public androidx.media3.common.DrmInitData drmInitData;
        public boolean flagForced;
        public boolean hasContentEncryption;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public java.lang.String name;
        public int number;
        public androidx.media3.extractor.TrackOutput output;
        public byte[] sampleStrippedBytes;
        public androidx.media3.extractor.TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public int width = -1;
        public int height = -1;
        public int bitsPerChannel = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public boolean hasColorInfo = false;
        public int colorSpace = -1;
        public int colorTransfer = -1;
        public int colorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean flagDefault = true;
        private java.lang.String language = "eng";

        protected Track() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:152:0x029b A[PHI: r9
  0x029b: PHI (r9v6 int) = (r9v1 int), (r9v0 int), (r9v2 int), (r9v3 int), (r9v4 int), (r9v5 int), (r9v7 int) binds: [B:195:0x03c4, B:164:0x02d1, B:161:0x02b2, B:159:0x02ad, B:157:0x02a8, B:155:0x02a4, B:150:0x027f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:206:0x03fb  */
        /* JADX WARN: Code duplicated, block: B:211:0x0416  */
        /* JADX WARN: Code duplicated, block: B:212:0x0418  */
        /* JADX WARN: Code duplicated, block: B:215:0x0425  */
        /* JADX WARN: Code duplicated, block: B:216:0x0437  */
        /* JADX WARN: Code duplicated, block: B:218:0x043d  */
        /* JADX WARN: Code duplicated, block: B:220:0x0441  */
        /* JADX WARN: Code duplicated, block: B:222:0x0446  */
        /* JADX WARN: Code duplicated, block: B:225:0x044e  */
        /* JADX WARN: Code duplicated, block: B:227:0x0453  */
        /* JADX WARN: Code duplicated, block: B:230:0x0458  */
        /* JADX WARN: Code duplicated, block: B:233:0x0466  */
        /* JADX WARN: Code duplicated, block: B:236:0x046c  */
        /* JADX WARN: Code duplicated, block: B:239:0x049f  */
        /* JADX WARN: Code duplicated, block: B:244:0x04bf  */
        /* JADX WARN: Code duplicated, block: B:250:0x04d8  */
        /* JADX WARN: Code duplicated, block: B:251:0x04da  */
        /* JADX WARN: Code duplicated, block: B:253:0x04e4  */
        /* JADX WARN: Code duplicated, block: B:254:0x04e7  */
        /* JADX WARN: Code duplicated, block: B:256:0x04f1  */
        /* JADX WARN: Code duplicated, block: B:262:0x0509  */
        /* JADX WARN: Code duplicated, block: B:264:0x0530  */
        /* JADX WARN: Code duplicated, block: B:266:0x0536  */
        /* JADX WARN: Code duplicated, block: B:282:0x0563  */
        /* JADX WARN: Code duplicated, block: B:4:0x0018  */
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        public void initializeOutput(androidx.media3.extractor.ExtractorOutput extractorOutput, int i) throws androidx.media3.common.ParserException {
            byte b;
            java.util.List<byte[]> listSingletonList;
            java.lang.String str;
            java.util.List<byte[]> list;
            java.lang.String str2;
            int i2;
            java.lang.String str3;
            int i3;
            androidx.media3.common.Format.Builder builder;
            int i4;
            int iIntValue;
            int i5;
            float f;
            int i6;
            int i7;
            int i8;
            androidx.media3.extractor.DolbyVisionConfig dolbyVisionConfig;
            java.lang.String str4 = this.codecId;
            str4.hashCode();
            int pcmEncoding = 4;
            switch (str4) {
                case "V_MPEG4/ISO/AP":
                    b = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b = 1;
                    break;
                case "A_MS/ACM":
                    b = 2;
                    break;
                case "A_TRUEHD":
                    b = 3;
                    break;
                case "A_VORBIS":
                    b = 4;
                    break;
                case "A_MPEG/L2":
                    b = 5;
                    break;
                case "A_MPEG/L3":
                    b = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b = 7;
                    break;
                case "S_DVBSUB":
                    b = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b = 10;
                    break;
                case "S_VOBSUB":
                    b = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b = 12;
                    break;
                case "A_AAC":
                    b = 13;
                    break;
                case "A_AC3":
                    b = 14;
                    break;
                case "A_DTS":
                    b = 15;
                    break;
                case "V_AV1":
                    b = 16;
                    break;
                case "V_VP8":
                    b = 17;
                    break;
                case "V_VP9":
                    b = 18;
                    break;
                case "S_HDMV/PGS":
                    b = 19;
                    break;
                case "V_THEORA":
                    b = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b = 24;
                    break;
                case "S_TEXT/ASS":
                    b = 25;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b = 26;
                    break;
                case "S_TEXT/WEBVTT":
                    b = 27;
                    break;
                case "S_TEXT/UTF8":
                    b = 28;
                    break;
                case "V_MPEG2":
                    b = 29;
                    break;
                case "A_EAC3":
                    b = 30;
                    break;
                case "A_FLAC":
                    b = 31;
                    break;
                case "A_OPUS":
                    b = 32;
                    break;
                default:
                    b = -1;
                    break;
            }
            int i9 = 4096;
            java.lang.String str5 = androidx.media3.common.MimeTypes.AUDIO_RAW;
            switch (b) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.codecPrivate;
                    listSingletonList = bArr == null ? null : java.util.Collections.singletonList(bArr);
                    str5 = androidx.media3.common.MimeTypes.VIDEO_MP4V;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null && (dolbyVisionConfig = androidx.media3.extractor.DolbyVisionConfig.parse(new androidx.media3.common.util.ParsableByteArray(this.dolbyVisionConfigBytes))) != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i10 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11 = i10 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                        if (this.displayUnit == 0) {
                            i7 = this.displayWidth;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.width;
                            }
                            this.displayWidth = i7;
                            i8 = this.displayHeight;
                            if (i8 == -1) {
                                i8 = this.height;
                            }
                            this.displayHeight = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.displayWidth;
                        if (i5 != iIntValue || (i6 = this.displayHeight) == iIntValue) {
                            f = -1.0f;
                        } else {
                            f = (this.height * i5) / (this.width * i6);
                        }
                        androidx.media3.common.ColorInfo colorInfoBuild = this.hasColorInfo ? new androidx.media3.common.ColorInfo.Builder().setColorSpace(this.colorSpace).setColorRange(this.colorRange).setColorTransfer(this.colorTransfer).setHdrStaticInfo(getHdrStaticInfo()).setLumaBitdepth(this.bitsPerChannel).setChromaBitdepth(this.bitsPerChannel).build() : null;
                        if (this.name != null && androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                            iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                        }
                        if (this.projectionType == 0 && java.lang.Float.compare(this.projectionPoseYaw, 0.0f) == 0 && java.lang.Float.compare(this.projectionPosePitch, 0.0f) == 0) {
                            if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0 || java.lang.Float.compare(this.projectionPoseRoll, 180.0f) == 0) {
                                iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                            } else if (java.lang.Float.compare(this.projectionPoseRoll, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                        i4 = 2;
                    } else {
                        if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3) && !androidx.media3.common.MimeTypes.TEXT_SSA.equals(str3) && !androidx.media3.common.MimeTypes.TEXT_VTT.equals(str3) && !androidx.media3.common.MimeTypes.APPLICATION_VOBSUB.equals(str3) && !androidx.media3.common.MimeTypes.APPLICATION_PGS.equals(str3) && !androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                            throw androidx.media3.common.ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        i4 = 3;
                    }
                    if (this.name != null && !androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i11).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack;
                    trackOutputTrack.format(formatBuild);
                    return;
                case 2:
                    if (parseMsAcmCodecPrivate(new androidx.media3.common.util.ParsableByteArray(getCodecPrivate(this.codecId)))) {
                        pcmEncoding = androidx.media3.common.util.Util.getPcmEncoding(this.audioBitDepth);
                        if (pcmEncoding == 0) {
                            androidx.media3.common.util.Log.w(androidx.media3.extractor.mkv.MatroskaExtractor.TAG, "Unsupported PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        } else {
                            listSingletonList = null;
                            str = null;
                            i2 = -1;
                        }
                        if (this.dolbyVisionConfigBytes != null) {
                            str = dolbyVisionConfig.codecs;
                            str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                        }
                        str3 = str5;
                        int i12 = (this.flagDefault ? 1 : 0) | 0;
                        if (this.flagForced) {
                            i3 = 2;
                        } else {
                            i3 = 0;
                        }
                        int i13 = i12 | i3;
                        builder = new androidx.media3.common.Format.Builder();
                        if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                            builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                            i4 = 1;
                        } else {
                            if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                                if (this.displayUnit == 0) {
                                    i7 = this.displayWidth;
                                    iIntValue = -1;
                                    if (i7 == -1) {
                                        i7 = this.width;
                                    }
                                    this.displayWidth = i7;
                                    i8 = this.displayHeight;
                                    if (i8 == -1) {
                                        i8 = this.height;
                                    }
                                    this.displayHeight = i8;
                                } else {
                                    iIntValue = -1;
                                }
                                i5 = this.displayWidth;
                                if (i5 != iIntValue) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.hasColorInfo) {
                                }
                                if (this.name != null) {
                                    iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                                }
                                if (this.projectionType == 0) {
                                    if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                        iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                    } else {
                                        iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                    }
                                }
                                builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                                i4 = 2;
                            } else {
                                if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                }
                                i4 = 3;
                            }
                            break;
                        }
                        if (this.name != null) {
                            builder.setLabel(this.name);
                        }
                        androidx.media3.common.Format formatBuild2 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i13).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        androidx.media3.extractor.TrackOutput trackOutputTrack2 = extractorOutput.track(this.number, i4);
                        this.output = trackOutputTrack2;
                        trackOutputTrack2.format(formatBuild2);
                        return;
                    }
                    androidx.media3.common.util.Log.w(androidx.media3.extractor.mkv.MatroskaExtractor.TAG, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str5 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i14 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i15 = i14 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild3 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i15).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack3 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack3;
                    trackOutputTrack3.format(formatBuild3);
                    return;
                case 3:
                    this.trueHdSampleRechunker = new androidx.media3.extractor.TrueHdSampleRechunker();
                    str5 = androidx.media3.common.MimeTypes.AUDIO_TRUEHD;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i16 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i17 = i16 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild4 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i17).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack4 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack4;
                    trackOutputTrack4.format(formatBuild4);
                    return;
                case 4:
                    listSingletonList = parseVorbisCodecPrivate(getCodecPrivate(this.codecId));
                    str5 = androidx.media3.common.MimeTypes.AUDIO_VORBIS;
                    i9 = 8192;
                    str = null;
                    i2 = i9;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i18 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i19 = i18 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild5 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i19).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack5 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack5;
                    trackOutputTrack5.format(formatBuild5);
                    return;
                case 5:
                    str5 = androidx.media3.common.MimeTypes.AUDIO_MPEG_L2;
                    listSingletonList = null;
                    str = null;
                    i2 = i9;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i110 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111 = i110 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild6 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i111).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack6 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack6;
                    trackOutputTrack6.format(formatBuild6);
                    return;
                case 6:
                    str5 = androidx.media3.common.MimeTypes.AUDIO_MPEG;
                    listSingletonList = null;
                    str = null;
                    i2 = i9;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i112 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i113 = i112 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild7 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i113).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack7 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack7;
                    trackOutputTrack7.format(formatBuild7);
                    return;
                case 7:
                    android.util.Pair<java.lang.String, java.util.List<byte[]>> fourCcPrivate = parseFourCcPrivate(new androidx.media3.common.util.ParsableByteArray(getCodecPrivate(this.codecId)));
                    str5 = (java.lang.String) fourCcPrivate.first;
                    listSingletonList = (java.util.List) fourCcPrivate.second;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i114 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i115 = i114 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild8 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i115).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack8 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack8;
                    trackOutputTrack8.format(formatBuild8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    java.lang.System.arraycopy(getCodecPrivate(this.codecId), 0, bArr2, 0, 4);
                    listSingletonList = com.google.common.collect.ImmutableList.of(bArr2);
                    str5 = androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i116 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i117 = i116 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild9 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i117).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack9 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack9;
                    trackOutputTrack9.format(formatBuild9);
                    return;
                case 10:
                    androidx.media3.extractor.AvcConfig avcConfig = androidx.media3.extractor.AvcConfig.parse(new androidx.media3.common.util.ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = avcConfig.initializationData;
                    this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                    str2 = avcConfig.codecs;
                    str5 = "video/avc";
                    i2 = -1;
                    pcmEncoding = -1;
                    java.util.List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i118 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i119 = i118 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild10 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i119).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack10 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack10;
                    trackOutputTrack10.format(formatBuild10);
                    return;
                case 11:
                    listSingletonList = com.google.common.collect.ImmutableList.of(getCodecPrivate(this.codecId));
                    str = null;
                    str5 = androidx.media3.common.MimeTypes.APPLICATION_VOBSUB;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i1110 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111 = i1110 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild11 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i1111).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack11 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack11;
                    trackOutputTrack11.format(formatBuild11);
                    return;
                case 12:
                    str5 = androidx.media3.common.MimeTypes.AUDIO_DTS_HD;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i1112 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1113 = i1112 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild12 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i1113).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack12 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack12;
                    trackOutputTrack12.format(formatBuild12);
                    return;
                case 13:
                    listSingletonList = java.util.Collections.singletonList(getCodecPrivate(this.codecId));
                    androidx.media3.extractor.AacUtil.Config audioSpecificConfig = androidx.media3.extractor.AacUtil.parseAudioSpecificConfig(this.codecPrivate);
                    this.sampleRate = audioSpecificConfig.sampleRateHz;
                    this.channelCount = audioSpecificConfig.channelCount;
                    str = audioSpecificConfig.codecs;
                    str5 = androidx.media3.common.MimeTypes.AUDIO_AAC;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i1114 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1115 = i1114 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild13 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i1115).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack13 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack13;
                    trackOutputTrack13.format(formatBuild13);
                    return;
                case 14:
                    str5 = androidx.media3.common.MimeTypes.AUDIO_AC3;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i1116 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1117 = i1116 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild14 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i1117).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack14 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack14;
                    trackOutputTrack14.format(formatBuild14);
                    return;
                case 15:
                case 21:
                    str5 = androidx.media3.common.MimeTypes.AUDIO_DTS;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i1118 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1119 = i1118 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild15 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i1119).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack15 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack15;
                    trackOutputTrack15.format(formatBuild15);
                    return;
                case 16:
                    str5 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i11110 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11111 = i11110 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild16 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i11111).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack16 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack16;
                    trackOutputTrack16.format(formatBuild16);
                    return;
                case 17:
                    str5 = androidx.media3.common.MimeTypes.VIDEO_VP8;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i11112 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11113 = i11112 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild17 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i11113).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack17 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack17;
                    trackOutputTrack17.format(formatBuild17);
                    return;
                case 18:
                    str5 = androidx.media3.common.MimeTypes.VIDEO_VP9;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i11114 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11115 = i11114 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild18 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i11115).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack18 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack18;
                    trackOutputTrack18.format(formatBuild18);
                    return;
                case 19:
                    str5 = androidx.media3.common.MimeTypes.APPLICATION_PGS;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i11116 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11117 = i11116 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild19 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i11117).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack19 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack19;
                    trackOutputTrack19.format(formatBuild19);
                    return;
                case 20:
                    str5 = androidx.media3.common.MimeTypes.VIDEO_UNKNOWN;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i11118 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11119 = i11118 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild110 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i11119).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack110 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack110;
                    trackOutputTrack110.format(formatBuild110);
                    return;
                case 22:
                    if (this.audioBitDepth == 32) {
                        listSingletonList = null;
                        str = null;
                        i2 = -1;
                    } else {
                        androidx.media3.common.util.Log.w(androidx.media3.extractor.mkv.MatroskaExtractor.TAG, "Unsupported floating point PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                        i2 = -1;
                        pcmEncoding = -1;
                    }
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i111110 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111111 = i111110 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild111 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i111111).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack111 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack111;
                    trackOutputTrack111.format(formatBuild111);
                    return;
                case 23:
                    int i20 = this.audioBitDepth;
                    if (i20 == 8) {
                        pcmEncoding = 3;
                    } else if (i20 == 16) {
                        pcmEncoding = 268435456;
                    } else if (i20 == 24) {
                        pcmEncoding = androidx.media3.common.C.ENCODING_PCM_24BIT_BIG_ENDIAN;
                    } else {
                        if (i20 != 32) {
                            androidx.media3.common.util.Log.w(androidx.media3.extractor.mkv.MatroskaExtractor.TAG, "Unsupported big endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                            listSingletonList = null;
                            str = null;
                            str5 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                            i2 = -1;
                            pcmEncoding = -1;
                            if (this.dolbyVisionConfigBytes != null) {
                                str = dolbyVisionConfig.codecs;
                                str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                            }
                            str3 = str5;
                            int i111112 = (this.flagDefault ? 1 : 0) | 0;
                            if (this.flagForced) {
                                i3 = 2;
                            } else {
                                i3 = 0;
                            }
                            int i111113 = i111112 | i3;
                            builder = new androidx.media3.common.Format.Builder();
                            if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                                builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                                i4 = 1;
                            } else {
                                if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                                    if (this.displayUnit == 0) {
                                        i7 = this.displayWidth;
                                        iIntValue = -1;
                                        if (i7 == -1) {
                                            i7 = this.width;
                                        }
                                        this.displayWidth = i7;
                                        i8 = this.displayHeight;
                                        if (i8 == -1) {
                                            i8 = this.height;
                                        }
                                        this.displayHeight = i8;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    i5 = this.displayWidth;
                                    if (i5 != iIntValue) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.hasColorInfo) {
                                    }
                                    if (this.name != null) {
                                        iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                                    }
                                    if (this.projectionType == 0) {
                                        if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                            iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                        } else {
                                            iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                        }
                                    }
                                    builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                                    i4 = 2;
                                } else {
                                    if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                    }
                                    i4 = 3;
                                }
                                break;
                            }
                            if (this.name != null) {
                                builder.setLabel(this.name);
                            }
                            androidx.media3.common.Format formatBuild112 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i111113).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                            androidx.media3.extractor.TrackOutput trackOutputTrack112 = extractorOutput.track(this.number, i4);
                            this.output = trackOutputTrack112;
                            trackOutputTrack112.format(formatBuild112);
                            return;
                        }
                        pcmEncoding = androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN;
                    }
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i111114 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111115 = i111114 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild113 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i111115).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack113 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack113;
                    trackOutputTrack113.format(formatBuild113);
                    return;
                case 24:
                    pcmEncoding = androidx.media3.common.util.Util.getPcmEncoding(this.audioBitDepth);
                    if (pcmEncoding == 0) {
                        androidx.media3.common.util.Log.w(androidx.media3.extractor.mkv.MatroskaExtractor.TAG, "Unsupported little endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                        i2 = -1;
                        pcmEncoding = -1;
                    } else {
                        listSingletonList = null;
                        str = null;
                        i2 = -1;
                    }
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i111116 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111117 = i111116 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild114 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i111117).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack114 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack114;
                    trackOutputTrack114.format(formatBuild114);
                    return;
                case 25:
                    listSingletonList = com.google.common.collect.ImmutableList.of(androidx.media3.extractor.mkv.MatroskaExtractor.SSA_DIALOGUE_FORMAT, getCodecPrivate(this.codecId));
                    str = null;
                    str5 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i111118 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111119 = i111118 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild115 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i111119).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack115 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack115;
                    trackOutputTrack115.format(formatBuild115);
                    return;
                case 26:
                    androidx.media3.extractor.HevcConfig hevcConfig = androidx.media3.extractor.HevcConfig.parse(new androidx.media3.common.util.ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = hevcConfig.initializationData;
                    this.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    str2 = hevcConfig.codecs;
                    str5 = "video/hevc";
                    i2 = -1;
                    pcmEncoding = -1;
                    java.util.List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i1111110 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111111 = i1111110 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild116 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i1111111).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack116 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack116;
                    trackOutputTrack116.format(formatBuild116);
                    return;
                case 27:
                    listSingletonList = null;
                    str = null;
                    str5 = androidx.media3.common.MimeTypes.TEXT_VTT;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i1111112 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111113 = i1111112 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild117 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i1111113).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack117 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack117;
                    trackOutputTrack117.format(formatBuild117);
                    return;
                case 28:
                    str5 = androidx.media3.common.MimeTypes.APPLICATION_SUBRIP;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i1111114 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111115 = i1111114 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild118 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i1111115).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack118 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack118;
                    trackOutputTrack118.format(formatBuild118);
                    return;
                case 29:
                    str5 = androidx.media3.common.MimeTypes.VIDEO_MPEG2;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i1111116 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111117 = i1111116 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild119 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i1111117).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack119 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack119;
                    trackOutputTrack119.format(formatBuild119);
                    return;
                case 30:
                    str5 = androidx.media3.common.MimeTypes.AUDIO_E_AC3;
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i1111118 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1111119 = i1111118 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild1110 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i1111119).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack1110 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack1110;
                    trackOutputTrack1110.format(formatBuild1110);
                    return;
                case 31:
                    listSingletonList = java.util.Collections.singletonList(getCodecPrivate(this.codecId));
                    str5 = androidx.media3.common.MimeTypes.AUDIO_FLAC;
                    str = null;
                    i2 = -1;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i11111110 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11111111 = i11111110 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild1111 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i11111111).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack1111 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack1111;
                    trackOutputTrack1111.format(formatBuild1111);
                    return;
                case 32:
                    listSingletonList = new java.util.ArrayList<>(3);
                    listSingletonList.add(getCodecPrivate(this.codecId));
                    listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.codecDelayNs).array());
                    listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(this.seekPreRollNs).array());
                    str5 = androidx.media3.common.MimeTypes.AUDIO_OPUS;
                    i9 = androidx.media3.extractor.mkv.MatroskaExtractor.OPUS_MAX_INPUT_SIZE;
                    str = null;
                    i2 = i9;
                    pcmEncoding = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    int i11111112 = (this.flagDefault ? 1 : 0) | 0;
                    if (this.flagForced) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11111113 = i11111112 | i3;
                    builder = new androidx.media3.common.Format.Builder();
                    if (androidx.media3.common.MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(pcmEncoding);
                        i4 = 1;
                    } else {
                        if (androidx.media3.common.MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i7 = this.displayWidth;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.width;
                                }
                                this.displayWidth = i7;
                                i8 = this.displayHeight;
                                if (i8 == -1) {
                                    i8 = this.height;
                                }
                                this.displayHeight = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.displayWidth;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((java.lang.Integer) androidx.media3.extractor.mkv.MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (java.lang.Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (java.lang.Float.compare(this.projectionPoseRoll, -180.0f) != 0) {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                } else {
                                    iIntValue = org.objectweb.asm.Opcodes.GETFIELD;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i4 = 2;
                        } else {
                            if (androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    androidx.media3.common.Format formatBuild1112 = builder.setId(i).setSampleMimeType(str3).setMaxInputSize(i2).setLanguage(this.language).setSelectionFlags(i11111113).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    androidx.media3.extractor.TrackOutput trackOutputTrack1112 = extractorOutput.track(this.number, i4);
                    this.output = trackOutputTrack1112;
                    trackOutputTrack1112.format(formatBuild1112);
                    return;
                default:
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
        public void outputPendingSampleMetadata() {
            androidx.media3.extractor.TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            androidx.media3.extractor.TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z) {
            if (androidx.media3.extractor.mkv.MatroskaExtractor.CODEC_ID_OPUS.equals(this.codecId)) {
                return z;
            }
            return this.maxBlockAdditionId > 0;
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.maxMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) (this.minMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) this.maxContentLuminance);
            byteBufferOrder.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static android.util.Pair<java.lang.String, java.util.List<byte[]>> parseFourCcPrivate(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new android.util.Pair<>(androidx.media3.common.MimeTypes.VIDEO_DIVX, null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new android.util.Pair<>(androidx.media3.common.MimeTypes.VIDEO_H263, null);
                }
                if (littleEndianUnsignedInt == 826496599) {
                    byte[] data = parsableByteArray.getData();
                    for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                        if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                            return new android.util.Pair<>(androidx.media3.common.MimeTypes.VIDEO_VC1, java.util.Collections.singletonList(java.util.Arrays.copyOfRange(data, position, data.length)));
                        }
                    }
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
                }
                androidx.media3.common.util.Log.w(androidx.media3.extractor.mkv.MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new android.util.Pair<>(androidx.media3.common.MimeTypes.VIDEO_UNKNOWN, null);
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static java.util.List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws androidx.media3.common.ParserException {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i3 += 255;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + (i & 255);
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + (i2 & 255);
                if (bArr[i8] != 1) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                java.lang.System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                java.lang.System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                java.util.ArrayList arrayList = new java.util.ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        private static boolean parseMsAcmCodecPrivate(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
            try {
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort != 65534) {
                    return false;
                }
                parsableByteArray.setPosition(24);
                return parsableByteArray.readLong() == androidx.media3.extractor.mkv.MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits() && parsableByteArray.readLong() == androidx.media3.extractor.mkv.MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits();
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
        public void assertOutputInitialized() {
            androidx.media3.common.util.Assertions.checkNotNull(this.output);
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"codecPrivate"})
        private byte[] getCodecPrivate(java.lang.String str) throws androidx.media3.common.ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw androidx.media3.common.ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }
    }
}
