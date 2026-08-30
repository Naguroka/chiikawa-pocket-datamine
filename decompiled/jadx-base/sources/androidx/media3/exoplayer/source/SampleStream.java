package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public interface SampleStream {
    public static final int FLAG_OMIT_SAMPLE_DATA = 4;
    public static final int FLAG_PEEK = 1;
    public static final int FLAG_REQUIRE_FORMAT = 2;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ReadDataResult {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ReadFlags {
    }

    boolean isReady();

    void maybeThrowError() throws java.io.IOException;

    int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i);

    int skipData(long j);
}
