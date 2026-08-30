package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectFragmentationSniffFailure implements androidx.media3.extractor.SniffFailure {
    public static final androidx.media3.extractor.mp4.IncorrectFragmentationSniffFailure FILE_FRAGMENTED = new androidx.media3.extractor.mp4.IncorrectFragmentationSniffFailure(true);
    public static final androidx.media3.extractor.mp4.IncorrectFragmentationSniffFailure FILE_NOT_FRAGMENTED = new androidx.media3.extractor.mp4.IncorrectFragmentationSniffFailure(false);
    public final boolean fileIsFragmented;

    private IncorrectFragmentationSniffFailure(boolean z) {
        this.fileIsFragmented = z;
    }
}
