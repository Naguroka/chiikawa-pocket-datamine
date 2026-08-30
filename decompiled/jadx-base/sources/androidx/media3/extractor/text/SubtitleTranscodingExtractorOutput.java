package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleTranscodingExtractorOutput implements androidx.media3.extractor.ExtractorOutput {
    private final androidx.media3.extractor.ExtractorOutput delegate;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private final android.util.SparseArray<androidx.media3.extractor.text.SubtitleTranscodingTrackOutput> textTrackOutputs = new android.util.SparseArray<>();

    public SubtitleTranscodingExtractorOutput(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this.delegate = extractorOutput;
        this.subtitleParserFactory = factory;
    }

    public void resetSubtitleParsers() {
        for (int i = 0; i < this.textTrackOutputs.size(); i++) {
            this.textTrackOutputs.valueAt(i).resetSubtitleParser();
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public androidx.media3.extractor.TrackOutput track(int i, int i2) {
        if (i2 != 3) {
            return this.delegate.track(i, i2);
        }
        androidx.media3.extractor.text.SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = this.textTrackOutputs.get(i);
        if (subtitleTranscodingTrackOutput != null) {
            return subtitleTranscodingTrackOutput;
        }
        androidx.media3.extractor.text.SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput2 = new androidx.media3.extractor.text.SubtitleTranscodingTrackOutput(this.delegate.track(i, i2), this.subtitleParserFactory);
        this.textTrackOutputs.put(i, subtitleTranscodingTrackOutput2);
        return subtitleTranscodingTrackOutput2;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.delegate.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
        this.delegate.seekMap(seekMap);
    }
}
