package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface Extractor {
    public static final int RESULT_CONTINUE = 0;
    public static final int RESULT_END_OF_INPUT = -1;
    public static final int RESULT_SEEK = 1;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    default androidx.media3.extractor.Extractor getUnderlyingImplementation() {
        return this;
    }

    void init(androidx.media3.extractor.ExtractorOutput extractorOutput);

    int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException;

    void release();

    void seek(long j, long j2);

    boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException;

    default java.util.List<androidx.media3.extractor.SniffFailure> getSniffFailureDetails() {
        return com.google.common.collect.ImmutableList.of();
    }
}
