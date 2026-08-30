package androidx.media3.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
public interface EbmlProcessor {
    public static final int ELEMENT_TYPE_BINARY = 4;
    public static final int ELEMENT_TYPE_FLOAT = 5;
    public static final int ELEMENT_TYPE_MASTER = 1;
    public static final int ELEMENT_TYPE_STRING = 3;
    public static final int ELEMENT_TYPE_UNKNOWN = 0;
    public static final int ELEMENT_TYPE_UNSIGNED_INT = 2;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ElementType {
    }

    void binaryElement(int i, int i2, androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException;

    void endMasterElement(int i) throws androidx.media3.common.ParserException;

    void floatElement(int i, double d) throws androidx.media3.common.ParserException;

    int getElementType(int i);

    void integerElement(int i, long j) throws androidx.media3.common.ParserException;

    boolean isLevel1Element(int i);

    void startMasterElement(int i, long j, long j2) throws androidx.media3.common.ParserException;

    void stringElement(int i, java.lang.String str) throws androidx.media3.common.ParserException;
}
