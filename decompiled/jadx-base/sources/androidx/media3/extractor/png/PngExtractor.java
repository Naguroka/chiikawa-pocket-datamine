package androidx.media3.extractor.png;

/* JADX INFO: loaded from: classes.dex */
public final class PngExtractor implements androidx.media3.extractor.Extractor {
    private static final int PNG_FILE_SIGNATURE = 35152;
    private static final int PNG_FILE_SIGNATURE_LENGTH = 2;
    private final androidx.media3.extractor.SingleSampleExtractor imageExtractor = new androidx.media3.extractor.SingleSampleExtractor(PNG_FILE_SIGNATURE, 2, androidx.media3.common.MimeTypes.IMAGE_PNG);

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return this.imageExtractor.sniff(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.imageExtractor.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        return this.imageExtractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.imageExtractor.seek(j, j2);
    }
}
