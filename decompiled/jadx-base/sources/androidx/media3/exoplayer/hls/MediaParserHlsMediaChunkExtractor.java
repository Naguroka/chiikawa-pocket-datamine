package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParserHlsMediaChunkExtractor implements androidx.media3.exoplayer.hls.HlsMediaChunkExtractor {
    public static final androidx.media3.exoplayer.hls.HlsExtractorFactory FACTORY = new androidx.media3.exoplayer.hls.HlsExtractorFactory() { // from class: androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
        public final androidx.media3.exoplayer.hls.HlsMediaChunkExtractor createExtractor(android.net.Uri uri, androidx.media3.common.Format format, java.util.List list, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, java.util.Map map, androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.exoplayer.analytics.PlayerId playerId) {
            return androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput, playerId);
        }
    };
    private final androidx.media3.common.Format format;
    private final androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30 inputReaderAdapter = new androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30();
    private final android.media.MediaParser mediaParser;
    private final com.google.common.collect.ImmutableList<android.media.MediaFormat> muxedCaptionMediaFormats;
    private final androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapter;
    private final boolean overrideInBandCaptionDeclarations;
    private int pendingSkipBytes;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.media3.exoplayer.hls.HlsMediaChunkExtractor lambda$static$0(android.net.Uri uri, androidx.media3.common.Format format, java.util.List list, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, java.util.Map map, androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.exoplayer.analytics.PlayerId playerId) throws java.io.IOException {
        if (androidx.media3.common.FileTypes.inferFileTypeFromMimeType(format.sampleMimeType) == 13) {
            return new androidx.media3.exoplayer.hls.BundledHlsMediaChunkExtractor(new androidx.media3.exoplayer.hls.WebvttExtractor(format.language, timestampAdjuster, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, false), format, timestampAdjuster);
        }
        boolean z = list != null;
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                builder.add(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.toCaptionsMediaFormat((androidx.media3.common.Format) list.get(i)));
            }
        } else {
            builder.add(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.toCaptionsMediaFormat(new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_CEA608).build()));
        }
        com.google.common.collect.ImmutableList immutableListBuild = builder.build();
        androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapterV30 = new androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30();
        if (list == null) {
            list = com.google.common.collect.ImmutableList.of();
        }
        outputConsumerAdapterV30.setMuxedCaptionFormats(list);
        outputConsumerAdapterV30.setTimestampAdjuster(timestampAdjuster);
        android.media.MediaParser mediaParserCreateMediaParserInstance = createMediaParserInstance(outputConsumerAdapterV30, format, z, immutableListBuild, playerId, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor.PeekingInputReader peekingInputReader = new androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor.PeekingInputReader(extractorInput);
        mediaParserCreateMediaParserInstance.advance(peekingInputReader);
        outputConsumerAdapterV30.setSelectedParserName(mediaParserCreateMediaParserInstance.getParserName());
        return new androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor(mediaParserCreateMediaParserInstance, outputConsumerAdapterV30, format, z, immutableListBuild, peekingInputReader.totalPeekedBytes, playerId);
    }

    public MediaParserHlsMediaChunkExtractor(android.media.MediaParser mediaParser, androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapterV30, androidx.media3.common.Format format, boolean z, com.google.common.collect.ImmutableList<android.media.MediaFormat> immutableList, int i, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this.mediaParser = mediaParser;
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.overrideInBandCaptionDeclarations = z;
        this.muxedCaptionMediaFormats = immutableList;
        this.format = format;
        this.playerId = playerId;
        this.pendingSkipBytes = i;
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean read(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        extractorInput.skipFully(this.pendingSkipBytes);
        this.pendingSkipBytes = 0;
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        return this.mediaParser.advance(this.inputReaderAdapter);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isPackedAudioExtractor() {
        java.lang.String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isReusable() {
        java.lang.String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public androidx.media3.exoplayer.hls.HlsMediaChunkExtractor recreate() {
        androidx.media3.common.util.Assertions.checkState(!isReusable());
        return new androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor(createMediaParserInstance(this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, this.playerId, this.mediaParser.getParserName()), this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, 0, this.playerId);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void onTruncatedSegmentParsed() {
        this.mediaParser.seek(android.media.MediaParser.SeekPoint.START);
    }

    private static android.media.MediaParser createMediaParserInstance(android.media.MediaParser.OutputConsumer outputConsumer, androidx.media3.common.Format format, boolean z, com.google.common.collect.ImmutableList<android.media.MediaFormat> immutableList, androidx.media3.exoplayer.analytics.PlayerId playerId, java.lang.String... strArr) {
        android.media.MediaParser mediaParserCreate;
        if (strArr.length == 1) {
            mediaParserCreate = android.media.MediaParser.createByName(strArr[0], outputConsumer);
        } else {
            mediaParserCreate = android.media.MediaParser.create(outputConsumer, strArr);
        }
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_EXPOSE_CAPTION_FORMATS, immutableList);
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS, java.lang.Boolean.valueOf(z));
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, true);
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, true);
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_IGNORE_TIMESTAMP_OFFSET, true);
        mediaParserCreate.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", true);
        mediaParserCreate.setParameter("android.media.mediaparser.ts.mode", "hls");
        java.lang.String str = format.codecs;
        if (!android.text.TextUtils.isEmpty(str)) {
            if (!androidx.media3.common.MimeTypes.AUDIO_AAC.equals(androidx.media3.common.MimeTypes.getAudioMediaMimeType(str))) {
                mediaParserCreate.setParameter("android.media.mediaparser.ts.ignoreAacStream", true);
            }
            if (!"video/avc".equals(androidx.media3.common.MimeTypes.getVideoMediaMimeType(str))) {
                mediaParserCreate.setParameter("android.media.mediaparser.ts.ignoreAvcStream", true);
            }
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.setLogSessionIdOnMediaParser(mediaParserCreate, playerId);
        }
        return mediaParserCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class PeekingInputReader implements android.media.MediaParser.SeekableInputReader {
        private final androidx.media3.extractor.ExtractorInput extractorInput;
        private int totalPeekedBytes;

        private PeekingInputReader(androidx.media3.extractor.ExtractorInput extractorInput) {
            this.extractorInput = extractorInput;
        }

        @Override // android.media.MediaParser.InputReader
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            int iPeek = this.extractorInput.peek(bArr, i, i2);
            this.totalPeekedBytes += iPeek;
            return iPeek;
        }

        @Override // android.media.MediaParser.InputReader
        public long getPosition() {
            return this.extractorInput.getPeekPosition();
        }

        @Override // android.media.MediaParser.InputReader
        public long getLength() {
            return this.extractorInput.getLength();
        }

        @Override // android.media.MediaParser.SeekableInputReader
        public void seekToPosition(long j) {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
