package androidx.media3.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
final class OpusReader extends androidx.media3.extractor.ogg.StreamReader {
    private boolean firstCommentHeaderSeen;
    private static final byte[] OPUS_ID_HEADER_SIGNATURE = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] OPUS_COMMENT_HEADER_SIGNATURE = {79, 112, 117, 115, 84, 97, 103, 115};

    OpusReader() {
    }

    public static boolean verifyBitstreamType(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        return peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE);
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.firstCommentHeaderSeen = false;
        }
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected long preparePayload(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        return convertTimeToGranule(androidx.media3.extractor.OpusUtil.getPacketDurationUs(parsableByteArray.getData()));
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean readHeaders(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, androidx.media3.extractor.ogg.StreamReader.SetupData setupData) throws androidx.media3.common.ParserException {
        if (peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE)) {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit());
            int channelCount = androidx.media3.extractor.OpusUtil.getChannelCount(bArrCopyOf);
            java.util.List<byte[]> listBuildInitializationData = androidx.media3.extractor.OpusUtil.buildInitializationData(bArrCopyOf);
            if (setupData.format != null) {
                return true;
            }
            setupData.format = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_OPUS).setChannelCount(channelCount).setSampleRate(androidx.media3.extractor.OpusUtil.SAMPLE_RATE).setInitializationData(listBuildInitializationData).build();
            return true;
        }
        byte[] bArr = OPUS_COMMENT_HEADER_SIGNATURE;
        if (peekPacketStartsWith(parsableByteArray, bArr)) {
            androidx.media3.common.util.Assertions.checkStateNotNull(setupData.format);
            if (this.firstCommentHeaderSeen) {
                return true;
            }
            this.firstCommentHeaderSeen = true;
            parsableByteArray.skipBytes(bArr.length);
            androidx.media3.common.Metadata vorbisComments = androidx.media3.extractor.VorbisUtil.parseVorbisComments(com.google.common.collect.ImmutableList.copyOf(androidx.media3.extractor.VorbisUtil.readVorbisCommentHeader(parsableByteArray, false, false).comments));
            if (vorbisComments == null) {
                return true;
            }
            setupData.format = setupData.format.buildUpon().setMetadata(vorbisComments.copyWithAppendedEntriesFrom(setupData.format.metadata)).build();
            return true;
        }
        androidx.media3.common.util.Assertions.checkStateNotNull(setupData.format);
        return false;
    }

    private static boolean peekPacketStartsWith(androidx.media3.common.util.ParsableByteArray parsableByteArray, byte[] bArr) {
        if (parsableByteArray.bytesLeft() < bArr.length) {
            return false;
        }
        int position = parsableByteArray.getPosition();
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.readBytes(bArr2, 0, bArr.length);
        parsableByteArray.setPosition(position);
        return java.util.Arrays.equals(bArr2, bArr);
    }
}
