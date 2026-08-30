package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class DvbSubtitleReader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private int bytesToCheck;
    private final androidx.media3.extractor.TrackOutput[] outputs;
    private int sampleBytesWritten;
    private long sampleTimeUs = androidx.media3.common.C.TIME_UNSET;
    private final java.util.List<androidx.media3.extractor.ts.TsPayloadReader.DvbSubtitleInfo> subtitleInfos;
    private boolean writingSample;

    public DvbSubtitleReader(java.util.List<androidx.media3.extractor.ts.TsPayloadReader.DvbSubtitleInfo> list) {
        this.subtitleInfos = list;
        this.outputs = new androidx.media3.extractor.TrackOutput[list.size()];
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.writingSample = false;
        this.sampleTimeUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i = 0; i < this.outputs.length; i++) {
            androidx.media3.extractor.ts.TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = this.subtitleInfos.get(i);
            trackIdGenerator.generateNewId();
            androidx.media3.extractor.TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            trackOutputTrack.format(new androidx.media3.common.Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS).setInitializationData(java.util.Collections.singletonList(dvbSubtitleInfo.initializationData)).setLanguage(dvbSubtitleInfo.language).build());
            this.outputs[i] = trackOutputTrack;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.writingSample = true;
        this.sampleTimeUs = j;
        this.sampleBytesWritten = 0;
        this.bytesToCheck = 2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
        if (this.writingSample) {
            androidx.media3.common.util.Assertions.checkState(this.sampleTimeUs != androidx.media3.common.C.TIME_UNSET);
            for (androidx.media3.extractor.TrackOutput trackOutput : this.outputs) {
                trackOutput.sampleMetadata(this.sampleTimeUs, 1, this.sampleBytesWritten, 0, null);
            }
            this.writingSample = false;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (this.writingSample) {
            if (this.bytesToCheck != 2 || checkNextByte(parsableByteArray, 32)) {
                if (this.bytesToCheck != 1 || checkNextByte(parsableByteArray, 0)) {
                    int position = parsableByteArray.getPosition();
                    int iBytesLeft = parsableByteArray.bytesLeft();
                    for (androidx.media3.extractor.TrackOutput trackOutput : this.outputs) {
                        parsableByteArray.setPosition(position);
                        trackOutput.sampleData(parsableByteArray, iBytesLeft);
                    }
                    this.sampleBytesWritten += iBytesLeft;
                }
            }
        }
    }

    private boolean checkNextByte(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        if (parsableByteArray.bytesLeft() == 0) {
            return false;
        }
        if (parsableByteArray.readUnsignedByte() != i) {
            this.writingSample = false;
        }
        this.bytesToCheck--;
        return this.writingSample;
    }
}
