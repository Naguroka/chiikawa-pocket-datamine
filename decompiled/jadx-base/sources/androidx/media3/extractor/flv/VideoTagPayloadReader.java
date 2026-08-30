package androidx.media3.extractor.flv;

/* JADX INFO: loaded from: classes.dex */
final class VideoTagPayloadReader extends androidx.media3.extractor.flv.TagPayloadReader {
    private static final int AVC_PACKET_TYPE_AVC_NALU = 1;
    private static final int AVC_PACKET_TYPE_SEQUENCE_HEADER = 0;
    private static final int VIDEO_CODEC_AVC = 7;
    private static final int VIDEO_FRAME_KEYFRAME = 1;
    private static final int VIDEO_FRAME_VIDEO_INFO = 5;
    private int frameType;
    private boolean hasOutputFormat;
    private boolean hasOutputKeyframe;
    private final androidx.media3.common.util.ParsableByteArray nalLength;
    private final androidx.media3.common.util.ParsableByteArray nalStartCode;
    private int nalUnitLengthFieldLength;

    public VideoTagPayloadReader(androidx.media3.extractor.TrackOutput trackOutput) {
        super(trackOutput);
        this.nalStartCode = new androidx.media3.common.util.ParsableByteArray(androidx.media3.container.NalUnitUtil.NAL_START_CODE);
        this.nalLength = new androidx.media3.common.util.ParsableByteArray(4);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public void seek() {
        this.hasOutputKeyframe = false;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean parseHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.extractor.flv.TagPayloadReader.UnsupportedFormatException {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = (unsignedByte >> 4) & 15;
        int i2 = unsignedByte & 15;
        if (i2 != 7) {
            throw new androidx.media3.extractor.flv.TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i2);
        }
        this.frameType = i;
        return i != 5;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean parsePayload(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j) throws androidx.media3.common.ParserException {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        long int24 = j + (((long) parsableByteArray.readInt24()) * 1000);
        if (unsignedByte == 0 && !this.hasOutputFormat) {
            androidx.media3.common.util.ParsableByteArray parsableByteArray2 = new androidx.media3.common.util.ParsableByteArray(new byte[parsableByteArray.bytesLeft()]);
            parsableByteArray.readBytes(parsableByteArray2.getData(), 0, parsableByteArray.bytesLeft());
            androidx.media3.extractor.AvcConfig avcConfig = androidx.media3.extractor.AvcConfig.parse(parsableByteArray2);
            this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
            this.output.format(new androidx.media3.common.Format.Builder().setSampleMimeType("video/avc").setCodecs(avcConfig.codecs).setWidth(avcConfig.width).setHeight(avcConfig.height).setPixelWidthHeightRatio(avcConfig.pixelWidthHeightRatio).setInitializationData(avcConfig.initializationData).build());
            this.hasOutputFormat = true;
            return false;
        }
        if (unsignedByte != 1 || !this.hasOutputFormat) {
            return false;
        }
        int i = this.frameType == 1 ? 1 : 0;
        if (!this.hasOutputKeyframe && i == 0) {
            return false;
        }
        byte[] data = this.nalLength.getData();
        data[0] = 0;
        data[1] = 0;
        data[2] = 0;
        int i2 = 4 - this.nalUnitLengthFieldLength;
        int i3 = 0;
        while (parsableByteArray.bytesLeft() > 0) {
            parsableByteArray.readBytes(this.nalLength.getData(), i2, this.nalUnitLengthFieldLength);
            this.nalLength.setPosition(0);
            int unsignedIntToInt = this.nalLength.readUnsignedIntToInt();
            this.nalStartCode.setPosition(0);
            this.output.sampleData(this.nalStartCode, 4);
            this.output.sampleData(parsableByteArray, unsignedIntToInt);
            i3 = i3 + 4 + unsignedIntToInt;
        }
        this.output.sampleMetadata(int24, i, i3, 0, null);
        this.hasOutputKeyframe = true;
        return true;
    }
}
