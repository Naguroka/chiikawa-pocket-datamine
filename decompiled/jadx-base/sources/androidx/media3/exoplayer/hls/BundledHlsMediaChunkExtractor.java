package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class BundledHlsMediaChunkExtractor implements androidx.media3.exoplayer.hls.HlsMediaChunkExtractor {
    private static final androidx.media3.extractor.PositionHolder POSITION_HOLDER = new androidx.media3.extractor.PositionHolder();
    final androidx.media3.extractor.Extractor extractor;
    private final androidx.media3.common.Format multivariantPlaylistFormat;
    private final boolean parseSubtitlesDuringExtraction;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private final androidx.media3.common.util.TimestampAdjuster timestampAdjuster;

    public BundledHlsMediaChunkExtractor(androidx.media3.extractor.Extractor extractor, androidx.media3.common.Format format, androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
        this(extractor, format, timestampAdjuster, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, false);
    }

    BundledHlsMediaChunkExtractor(androidx.media3.extractor.Extractor extractor, androidx.media3.common.Format format, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.text.SubtitleParser.Factory factory, boolean z) {
        this.extractor = extractor;
        this.multivariantPlaylistFormat = format;
        this.timestampAdjuster = timestampAdjuster;
        this.subtitleParserFactory = factory;
        this.parseSubtitlesDuringExtraction = z;
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean read(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return this.extractor.read(extractorInput, POSITION_HOLDER) == 0;
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isPackedAudioExtractor() {
        androidx.media3.extractor.Extractor underlyingImplementation = this.extractor.getUnderlyingImplementation();
        return (underlyingImplementation instanceof androidx.media3.extractor.ts.AdtsExtractor) || (underlyingImplementation instanceof androidx.media3.extractor.ts.Ac3Extractor) || (underlyingImplementation instanceof androidx.media3.extractor.ts.Ac4Extractor) || (underlyingImplementation instanceof androidx.media3.extractor.mp3.Mp3Extractor);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isReusable() {
        androidx.media3.extractor.Extractor underlyingImplementation = this.extractor.getUnderlyingImplementation();
        return (underlyingImplementation instanceof androidx.media3.extractor.ts.TsExtractor) || (underlyingImplementation instanceof androidx.media3.extractor.mp4.FragmentedMp4Extractor);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public androidx.media3.exoplayer.hls.HlsMediaChunkExtractor recreate() {
        androidx.media3.extractor.Extractor mp3Extractor;
        androidx.media3.common.util.Assertions.checkState(!isReusable());
        androidx.media3.common.util.Assertions.checkState(this.extractor.getUnderlyingImplementation() == this.extractor, "Can't recreate wrapped extractors. Outer type: " + this.extractor.getClass());
        androidx.media3.extractor.Extractor extractor = this.extractor;
        if (extractor instanceof androidx.media3.exoplayer.hls.WebvttExtractor) {
            mp3Extractor = new androidx.media3.exoplayer.hls.WebvttExtractor(this.multivariantPlaylistFormat.language, this.timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
        } else if (extractor instanceof androidx.media3.extractor.ts.AdtsExtractor) {
            mp3Extractor = new androidx.media3.extractor.ts.AdtsExtractor();
        } else if (extractor instanceof androidx.media3.extractor.ts.Ac3Extractor) {
            mp3Extractor = new androidx.media3.extractor.ts.Ac3Extractor();
        } else if (extractor instanceof androidx.media3.extractor.ts.Ac4Extractor) {
            mp3Extractor = new androidx.media3.extractor.ts.Ac4Extractor();
        } else if (extractor instanceof androidx.media3.extractor.mp3.Mp3Extractor) {
            mp3Extractor = new androidx.media3.extractor.mp3.Mp3Extractor();
        } else {
            throw new java.lang.IllegalStateException("Unexpected extractor type for recreation: " + this.extractor.getClass().getSimpleName());
        }
        return new androidx.media3.exoplayer.hls.BundledHlsMediaChunkExtractor(mp3Extractor, this.multivariantPlaylistFormat, this.timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void onTruncatedSegmentParsed() {
        this.extractor.seek(0L, 0L);
    }
}
