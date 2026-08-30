package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface ExtractorOutput {
    public static final androidx.media3.extractor.ExtractorOutput PLACEHOLDER = new androidx.media3.extractor.ExtractorOutput() { // from class: androidx.media3.extractor.ExtractorOutput.1
        @Override // androidx.media3.extractor.ExtractorOutput
        public androidx.media3.extractor.TrackOutput track(int i, int i2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
            throw new java.lang.UnsupportedOperationException();
        }
    };

    void endTracks();

    void seekMap(androidx.media3.extractor.SeekMap seekMap);

    androidx.media3.extractor.TrackOutput track(int i, int i2);
}
