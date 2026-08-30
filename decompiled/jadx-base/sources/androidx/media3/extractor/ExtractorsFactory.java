package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface ExtractorsFactory {
    public static final androidx.media3.extractor.ExtractorsFactory EMPTY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.ExtractorsFactory$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.ExtractorsFactory.lambda$static$0();
        }
    };

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[0];
    }

    androidx.media3.extractor.Extractor[] createExtractors();

    @java.lang.Deprecated
    default androidx.media3.extractor.ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return this;
    }

    default androidx.media3.extractor.ExtractorsFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return this;
    }

    default androidx.media3.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        return createExtractors();
    }
}
