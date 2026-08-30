package androidx.media3.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
final class VorbisReader extends androidx.media3.extractor.ogg.StreamReader {
    private androidx.media3.extractor.VorbisUtil.CommentHeader commentHeader;
    private int previousPacketBlockSize;
    private boolean seenFirstAudioPacket;
    private androidx.media3.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader;
    private androidx.media3.extractor.ogg.VorbisReader.VorbisSetup vorbisSetup;

    static int readBits(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    VorbisReader() {
    }

    public static boolean verifyBitstreamType(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        try {
            return androidx.media3.extractor.VorbisUtil.verifyVorbisHeaderCapturePattern(1, parsableByteArray, true);
        } catch (androidx.media3.common.ParserException unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.vorbisSetup = null;
            this.vorbisIdHeader = null;
            this.commentHeader = null;
        }
        this.previousPacketBlockSize = 0;
        this.seenFirstAudioPacket = false;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected void onSeekEnd(long j) {
        super.onSeekEnd(j);
        this.seenFirstAudioPacket = j != 0;
        androidx.media3.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        this.previousPacketBlockSize = vorbisIdHeader != null ? vorbisIdHeader.blockSize0 : 0;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    protected long preparePayload(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if ((parsableByteArray.getData()[0] & 1) == 1) {
            return -1L;
        }
        int iDecodeBlockSize = decodeBlockSize(parsableByteArray.getData()[0], (androidx.media3.extractor.ogg.VorbisReader.VorbisSetup) androidx.media3.common.util.Assertions.checkStateNotNull(this.vorbisSetup));
        long j = this.seenFirstAudioPacket ? (this.previousPacketBlockSize + iDecodeBlockSize) / 4 : 0;
        appendNumberOfSamples(parsableByteArray, j);
        this.seenFirstAudioPacket = true;
        this.previousPacketBlockSize = iDecodeBlockSize;
        return j;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean readHeaders(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, androidx.media3.extractor.ogg.StreamReader.SetupData setupData) throws java.io.IOException {
        if (this.vorbisSetup != null) {
            androidx.media3.common.util.Assertions.checkNotNull(setupData.format);
            return false;
        }
        androidx.media3.extractor.ogg.VorbisReader.VorbisSetup setupHeaders = readSetupHeaders(parsableByteArray);
        this.vorbisSetup = setupHeaders;
        if (setupHeaders == null) {
            return true;
        }
        androidx.media3.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader = setupHeaders.idHeader;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(vorbisIdHeader.data);
        arrayList.add(setupHeaders.setupHeaderData);
        setupData.format = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_VORBIS).setAverageBitrate(vorbisIdHeader.bitrateNominal).setPeakBitrate(vorbisIdHeader.bitrateMaximum).setChannelCount(vorbisIdHeader.channels).setSampleRate(vorbisIdHeader.sampleRate).setInitializationData(arrayList).setMetadata(androidx.media3.extractor.VorbisUtil.parseVorbisComments(com.google.common.collect.ImmutableList.copyOf(setupHeaders.commentHeader.comments))).build();
        return true;
    }

    androidx.media3.extractor.ogg.VorbisReader.VorbisSetup readSetupHeaders(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws java.io.IOException {
        androidx.media3.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        if (vorbisIdHeader == null) {
            this.vorbisIdHeader = androidx.media3.extractor.VorbisUtil.readVorbisIdentificationHeader(parsableByteArray);
            return null;
        }
        androidx.media3.extractor.VorbisUtil.CommentHeader commentHeader = this.commentHeader;
        if (commentHeader == null) {
            this.commentHeader = androidx.media3.extractor.VorbisUtil.readVorbisCommentHeader(parsableByteArray);
            return null;
        }
        byte[] bArr = new byte[parsableByteArray.limit()];
        java.lang.System.arraycopy(parsableByteArray.getData(), 0, bArr, 0, parsableByteArray.limit());
        androidx.media3.extractor.VorbisUtil.Mode[] vorbisModes = androidx.media3.extractor.VorbisUtil.readVorbisModes(parsableByteArray, vorbisIdHeader.channels);
        return new androidx.media3.extractor.ogg.VorbisReader.VorbisSetup(vorbisIdHeader, commentHeader, bArr, vorbisModes, androidx.media3.extractor.VorbisUtil.iLog(vorbisModes.length - 1));
    }

    static void appendNumberOfSamples(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j) {
        if (parsableByteArray.capacity() < parsableByteArray.limit() + 4) {
            parsableByteArray.reset(java.util.Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit() + 4));
        } else {
            parsableByteArray.setLimit(parsableByteArray.limit() + 4);
        }
        byte[] data = parsableByteArray.getData();
        data[parsableByteArray.limit() - 4] = (byte) (j & 255);
        data[parsableByteArray.limit() - 3] = (byte) ((j >>> 8) & 255);
        data[parsableByteArray.limit() - 2] = (byte) ((j >>> 16) & 255);
        data[parsableByteArray.limit() - 1] = (byte) ((j >>> 24) & 255);
    }

    private static int decodeBlockSize(byte b, androidx.media3.extractor.ogg.VorbisReader.VorbisSetup vorbisSetup) {
        if (!vorbisSetup.modes[readBits(b, vorbisSetup.iLogModes, 1)].blockFlag) {
            return vorbisSetup.idHeader.blockSize0;
        }
        return vorbisSetup.idHeader.blockSize1;
    }

    static final class VorbisSetup {
        public final androidx.media3.extractor.VorbisUtil.CommentHeader commentHeader;
        public final int iLogModes;
        public final androidx.media3.extractor.VorbisUtil.VorbisIdHeader idHeader;
        public final androidx.media3.extractor.VorbisUtil.Mode[] modes;
        public final byte[] setupHeaderData;

        public VorbisSetup(androidx.media3.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader, androidx.media3.extractor.VorbisUtil.CommentHeader commentHeader, byte[] bArr, androidx.media3.extractor.VorbisUtil.Mode[] modeArr, int i) {
            this.idHeader = vorbisIdHeader;
            this.commentHeader = commentHeader;
            this.setupHeaderData = bArr;
            this.modes = modeArr;
            this.iLogModes = i;
        }
    }
}
