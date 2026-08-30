package androidx.media3.extractor.jpeg;

/* JADX INFO: loaded from: classes.dex */
public final class StartOffsetExtractorOutput implements androidx.media3.extractor.ExtractorOutput {
    private final androidx.media3.extractor.ExtractorOutput extractorOutput;
    private final long startOffset;

    public StartOffsetExtractorOutput(long j, androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.startOffset = j;
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public androidx.media3.extractor.TrackOutput track(int i, int i2) {
        return this.extractorOutput.track(i, i2);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(final androidx.media3.extractor.SeekMap seekMap) {
        this.extractorOutput.seekMap(new androidx.media3.extractor.ForwardingSeekMap(seekMap) { // from class: androidx.media3.extractor.jpeg.StartOffsetExtractorOutput.1
            @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
            public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
                androidx.media3.extractor.SeekMap.SeekPoints seekPoints = seekMap.getSeekPoints(j);
                return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(seekPoints.first.timeUs, seekPoints.first.position + androidx.media3.extractor.jpeg.StartOffsetExtractorOutput.this.startOffset), new androidx.media3.extractor.SeekPoint(seekPoints.second.timeUs, seekPoints.second.position + androidx.media3.extractor.jpeg.StartOffsetExtractorOutput.this.startOffset));
            }
        });
    }
}
