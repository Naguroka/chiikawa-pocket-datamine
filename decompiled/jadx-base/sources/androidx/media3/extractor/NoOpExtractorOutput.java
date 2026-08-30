package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class NoOpExtractorOutput implements androidx.media3.extractor.ExtractorOutput {
    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public androidx.media3.extractor.TrackOutput track(int i, int i2) {
        return new androidx.media3.extractor.DiscardingTrackOutput();
    }
}
