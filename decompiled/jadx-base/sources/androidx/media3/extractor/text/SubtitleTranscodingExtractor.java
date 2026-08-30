package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public class SubtitleTranscodingExtractor implements androidx.media3.extractor.Extractor {
    private final androidx.media3.extractor.Extractor delegate;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput transcodingExtractorOutput;

    public SubtitleTranscodingExtractor(androidx.media3.extractor.Extractor extractor, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this.delegate = extractor;
        this.subtitleParserFactory = factory;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return this.delegate.sniff(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput = new androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        this.transcodingExtractorOutput = subtitleTranscodingExtractorOutput;
        this.delegate.init(subtitleTranscodingExtractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        return this.delegate.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput = this.transcodingExtractorOutput;
        if (subtitleTranscodingExtractorOutput != null) {
            subtitleTranscodingExtractorOutput.resetSubtitleParsers();
        }
        this.delegate.seek(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        this.delegate.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public androidx.media3.extractor.Extractor getUnderlyingImplementation() {
        return this.delegate;
    }
}
