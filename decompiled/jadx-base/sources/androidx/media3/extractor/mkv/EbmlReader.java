package androidx.media3.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
interface EbmlReader {
    void init(androidx.media3.extractor.mkv.EbmlProcessor ebmlProcessor);

    boolean read(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException;

    void reset();
}
