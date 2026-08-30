package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class PassthroughSectionPayloadReader implements androidx.media3.extractor.ts.SectionPayloadReader {
    private androidx.media3.common.Format format;
    private androidx.media3.extractor.TrackOutput output;
    private androidx.media3.common.util.TimestampAdjuster timestampAdjuster;

    public PassthroughSectionPayloadReader(java.lang.String str) {
        this.format = new androidx.media3.common.Format.Builder().setSampleMimeType(str).build();
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void init(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        trackIdGenerator.generateNewId();
        androidx.media3.extractor.TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.output = trackOutputTrack;
        trackOutputTrack.format(this.format);
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        assertInitialized();
        long lastAdjustedTimestampUs = this.timestampAdjuster.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.timestampAdjuster.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == androidx.media3.common.C.TIME_UNSET || timestampOffsetUs == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        if (timestampOffsetUs != this.format.subsampleOffsetUs) {
            androidx.media3.common.Format formatBuild = this.format.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.format = formatBuild;
            this.output.format(formatBuild);
        }
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, iBytesLeft);
        this.output.sampleMetadata(lastAdjustedTimestampUs, 1, iBytesLeft, 0, null);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"timestampAdjuster", org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void assertInitialized() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.timestampAdjuster);
        androidx.media3.common.util.Util.castNonNull(this.output);
    }
}
