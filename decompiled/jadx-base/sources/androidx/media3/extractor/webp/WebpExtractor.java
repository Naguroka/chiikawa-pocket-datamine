package androidx.media3.extractor.webp;

/* JADX INFO: loaded from: classes.dex */
public final class WebpExtractor implements androidx.media3.extractor.Extractor {
    private static final int FILE_SIGNATURE_SEGMENT_LENGTH = 4;
    private static final int RIFF_FILE_SIGNATURE = 1380533830;
    private static final int WEBP_FILE_SIGNATURE = 1464156752;
    private final androidx.media3.common.util.ParsableByteArray scratch = new androidx.media3.common.util.ParsableByteArray(4);
    private final androidx.media3.extractor.SingleSampleExtractor imageExtractor = new androidx.media3.extractor.SingleSampleExtractor(-1, -1, androidx.media3.common.MimeTypes.IMAGE_WEBP);

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.scratch.reset(4);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        if (this.scratch.readUnsignedInt() != 1380533830) {
            return false;
        }
        extractorInput.advancePeekPosition(4);
        this.scratch.reset(4);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        return this.scratch.readUnsignedInt() == 1464156752;
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
