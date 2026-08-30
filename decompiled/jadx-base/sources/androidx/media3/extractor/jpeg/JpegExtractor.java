package androidx.media3.extractor.jpeg;

/* JADX INFO: loaded from: classes.dex */
public final class JpegExtractor implements androidx.media3.extractor.Extractor {
    public static final int FLAG_READ_IMAGE = 1;
    private static final int JPEG_FILE_SIGNATURE = 65496;
    private static final int JPEG_FILE_SIGNATURE_LENGTH = 2;
    private final androidx.media3.extractor.Extractor extractor;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public JpegExtractor() {
        this(0);
    }

    public JpegExtractor(int i) {
        if ((i & 1) != 0) {
            this.extractor = new androidx.media3.extractor.SingleSampleExtractor(JPEG_FILE_SIGNATURE, 2, androidx.media3.common.MimeTypes.IMAGE_JPEG);
        } else {
            this.extractor = new androidx.media3.extractor.jpeg.JpegMotionPhotoExtractor();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return this.extractor.sniff(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        return this.extractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.extractor.seek(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        this.extractor.release();
    }
}
