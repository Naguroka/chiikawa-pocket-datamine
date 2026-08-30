package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParserExtractorAdapter implements androidx.media3.exoplayer.source.ProgressiveMediaExtractor {

    @java.lang.Deprecated
    public static final androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory FACTORY = new androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory() { // from class: androidx.media3.exoplayer.source.MediaParserExtractorAdapter$$ExternalSyntheticLambda0
        @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
        public final androidx.media3.exoplayer.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(androidx.media3.exoplayer.analytics.PlayerId playerId) {
            return androidx.media3.exoplayer.source.MediaParserExtractorAdapter.lambda$static$0(playerId);
        }
    };
    private final androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30 inputReaderAdapter;
    private final android.media.MediaParser mediaParser;
    private final androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapter;
    private java.lang.String parserName;

    static /* synthetic */ androidx.media3.exoplayer.source.ProgressiveMediaExtractor lambda$static$0(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return new androidx.media3.exoplayer.source.MediaParserExtractorAdapter(playerId, com.google.common.collect.ImmutableMap.of());
    }

    public static final class Factory implements androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory {
        private static final java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap();

        public void setConstantBitrateSeekingEnabled(boolean z) {
            if (z) {
                java.util.Map<java.lang.String, java.lang.Object> map = parameters;
                map.put("android.media.mediaparser.adts.enableCbrSeeking", true);
                map.put("android.media.mediaparser.amr.enableCbrSeeking", true);
                map.put("android.media.mediaparser.mp3.enableCbrSeeking", true);
                return;
            }
            java.util.Map<java.lang.String, java.lang.Object> map2 = parameters;
            map2.remove("android.media.mediaparser.adts.enableCbrSeeking");
            map2.remove("android.media.mediaparser.amr.enableCbrSeeking");
            map2.remove("android.media.mediaparser.mp3.enableCbrSeeking");
        }

        @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
        public androidx.media3.exoplayer.source.MediaParserExtractorAdapter createProgressiveMediaExtractor(androidx.media3.exoplayer.analytics.PlayerId playerId) {
            return new androidx.media3.exoplayer.source.MediaParserExtractorAdapter(playerId, parameters);
        }
    }

    @java.lang.Deprecated
    public MediaParserExtractorAdapter(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this(playerId, com.google.common.collect.ImmutableMap.of());
    }

    private MediaParserExtractorAdapter(androidx.media3.exoplayer.analytics.PlayerId playerId, java.util.Map<java.lang.String, java.lang.Object> map) {
        androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapterV30 = new androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30();
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30();
        android.media.MediaParser mediaParserCreate = android.media.MediaParser.create(outputConsumerAdapterV30, new java.lang.String[0]);
        this.mediaParser = mediaParserCreate;
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, true);
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, true);
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_INCLUDE_SUPPLEMENTAL_DATA, true);
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            this.mediaParser.setParameter(entry.getKey(), entry.getValue());
        }
        this.parserName = "android.media.mediaparser.UNKNOWN";
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.setLogSessionIdOnMediaParser(this.mediaParser, playerId);
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(androidx.media3.common.DataReader dataReader, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, long j2, androidx.media3.extractor.ExtractorOutput extractorOutput) throws java.io.IOException {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
        this.inputReaderAdapter.setDataReader(dataReader, j2);
        this.inputReaderAdapter.setCurrentPosition(j);
        java.lang.String parserName = this.mediaParser.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.mediaParser.advance(this.inputReaderAdapter);
            java.lang.String parserName2 = this.mediaParser.getParserName();
            this.parserName = parserName2;
            this.outputConsumerAdapter.setSelectedParserName(parserName2);
            return;
        }
        if (parserName.equals(this.parserName)) {
            return;
        }
        java.lang.String parserName3 = this.mediaParser.getParserName();
        this.parserName = parserName3;
        this.outputConsumerAdapter.setSelectedParserName(parserName3);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        this.mediaParser.release();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.parserName)) {
            this.outputConsumerAdapter.disableSeeking();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        return this.inputReaderAdapter.getPosition();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j, long j2) {
        this.inputReaderAdapter.setCurrentPosition(j);
        android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> seekPoints = this.outputConsumerAdapter.getSeekPoints(j2);
        this.mediaParser.seek((android.media.MediaParser.SeekPoint) (((android.media.MediaParser.SeekPoint) seekPoints.second).position == j ? seekPoints.second : seekPoints.first));
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        boolean zAdvance = this.mediaParser.advance(this.inputReaderAdapter);
        positionHolder.position = this.inputReaderAdapter.getAndResetSeekPosition();
        if (zAdvance) {
            return positionHolder.position != -1 ? 1 : 0;
        }
        return -1;
    }
}
