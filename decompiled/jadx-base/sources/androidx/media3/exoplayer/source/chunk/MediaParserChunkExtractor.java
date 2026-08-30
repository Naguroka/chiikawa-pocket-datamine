package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParserChunkExtractor implements androidx.media3.exoplayer.source.chunk.ChunkExtractor {
    public static final androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory FACTORY = new androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory() { // from class: androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public final androidx.media3.exoplayer.source.chunk.ChunkExtractor createProgressiveMediaExtractor(int i, androidx.media3.common.Format format, boolean z, java.util.List list, androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.exoplayer.analytics.PlayerId playerId) {
            return androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor.lambda$static$0(i, format, z, list, trackOutput, playerId);
        }
    };
    private static final java.lang.String TAG = "MediaPrsrChunkExtractor";
    private final androidx.media3.extractor.DiscardingTrackOutput discardingTrackOutput;
    private final androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30 inputReaderAdapter;
    private final android.media.MediaParser mediaParser;
    private final androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapter;
    private long pendingSeekUs;
    private androidx.media3.common.Format[] sampleFormats;
    private androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider;
    private final androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor.TrackOutputProviderAdapter trackOutputProviderAdapter;

    static /* synthetic */ androidx.media3.exoplayer.source.chunk.ChunkExtractor lambda$static$0(int i, androidx.media3.common.Format format, boolean z, java.util.List list, androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        if (androidx.media3.common.MimeTypes.isText(format.containerMimeType)) {
            return null;
        }
        return new androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor(i, format, list, playerId);
    }

    public MediaParserChunkExtractor(int i, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapterV30 = new androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30(format, i, true);
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30();
        java.lang.String str = androidx.media3.common.MimeTypes.isMatroska((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.containerMimeType)) ? "android.media.mediaparser.MatroskaParser" : "android.media.mediaparser.FragmentedMp4Parser";
        outputConsumerAdapterV30.setSelectedParserName(str);
        android.media.MediaParser mediaParserCreateByName = android.media.MediaParser.createByName(str, outputConsumerAdapterV30);
        this.mediaParser = mediaParserCreateByName;
        mediaParserCreateByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", true);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, true);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_INCLUDE_SUPPLEMENTAL_DATA, true);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, true);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_EXPOSE_DUMMY_SEEK_MAP, true);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_EXPOSE_CHUNK_INDEX_AS_MEDIA_FORMAT, true);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS, true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.toCaptionsMediaFormat(list.get(i2)));
        }
        this.mediaParser.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_EXPOSE_CAPTION_FORMATS, arrayList);
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.setLogSessionIdOnMediaParser(this.mediaParser, playerId);
        }
        this.outputConsumerAdapter.setMuxedCaptionFormats(list);
        this.trackOutputProviderAdapter = new androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor.TrackOutputProviderAdapter();
        this.discardingTrackOutput = new androidx.media3.extractor.DiscardingTrackOutput();
        this.pendingSeekUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void init(androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider, long j, long j2) {
        this.trackOutputProvider = trackOutputProvider;
        this.outputConsumerAdapter.setSampleTimestampUpperLimitFilterUs(j2);
        this.outputConsumerAdapter.setExtractorOutput(this.trackOutputProviderAdapter);
        this.pendingSeekUs = j;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.mediaParser.release();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean read(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        maybeExecutePendingSeek();
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        return this.mediaParser.advance(this.inputReaderAdapter);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public androidx.media3.extractor.ChunkIndex getChunkIndex() {
        return this.outputConsumerAdapter.getChunkIndex();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public androidx.media3.common.Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    private void maybeExecutePendingSeek() {
        android.media.MediaParser.SeekMap dummySeekMap = this.outputConsumerAdapter.getDummySeekMap();
        long j = this.pendingSeekUs;
        if (j == androidx.media3.common.C.TIME_UNSET || dummySeekMap == null) {
            return;
        }
        this.mediaParser.seek((android.media.MediaParser.SeekPoint) dummySeekMap.getSeekPoints(j).first);
        this.pendingSeekUs = androidx.media3.common.C.TIME_UNSET;
    }

    private class TrackOutputProviderAdapter implements androidx.media3.extractor.ExtractorOutput {
        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
        }

        private TrackOutputProviderAdapter() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public androidx.media3.extractor.TrackOutput track(int i, int i2) {
            return androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor.this.trackOutputProvider != null ? androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor.this.trackOutputProvider.track(i, i2) : androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor.this.discardingTrackOutput;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor mediaParserChunkExtractor = androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor.this;
            mediaParserChunkExtractor.sampleFormats = mediaParserChunkExtractor.outputConsumerAdapter.getSampleFormats();
        }
    }
}
