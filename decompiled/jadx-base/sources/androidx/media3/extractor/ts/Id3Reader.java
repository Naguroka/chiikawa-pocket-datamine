package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class Id3Reader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private static final java.lang.String TAG = "Id3Reader";
    private androidx.media3.extractor.TrackOutput output;
    private int sampleBytesRead;
    private int sampleSize;
    private boolean writingSample;
    private final androidx.media3.common.util.ParsableByteArray id3Header = new androidx.media3.common.util.ParsableByteArray(10);
    private long sampleTimeUs = androidx.media3.common.C.TIME_UNSET;

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.writingSample = false;
        this.sampleTimeUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        androidx.media3.extractor.TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.output = trackOutputTrack;
        trackOutputTrack.format(new androidx.media3.common.Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_ID3).build());
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.writingSample = true;
        this.sampleTimeUs = j;
        this.sampleSize = 0;
        this.sampleBytesRead = 0;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
        if (this.writingSample) {
            int iBytesLeft = parsableByteArray.bytesLeft();
            int i = this.sampleBytesRead;
            if (i < 10) {
                int iMin = java.lang.Math.min(iBytesLeft, 10 - i);
                java.lang.System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), this.id3Header.getData(), this.sampleBytesRead, iMin);
                if (this.sampleBytesRead + iMin == 10) {
                    this.id3Header.setPosition(0);
                    if (73 != this.id3Header.readUnsignedByte() || 68 != this.id3Header.readUnsignedByte() || 51 != this.id3Header.readUnsignedByte()) {
                        androidx.media3.common.util.Log.w(TAG, "Discarding invalid ID3 tag");
                        this.writingSample = false;
                        return;
                    } else {
                        this.id3Header.skipBytes(3);
                        this.sampleSize = this.id3Header.readSynchSafeInt() + 10;
                    }
                }
            }
            int iMin2 = java.lang.Math.min(iBytesLeft, this.sampleSize - this.sampleBytesRead);
            this.output.sampleData(parsableByteArray, iMin2);
            this.sampleBytesRead += iMin2;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
        int i;
        androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
        if (this.writingSample && (i = this.sampleSize) != 0 && this.sampleBytesRead == i) {
            androidx.media3.common.util.Assertions.checkState(this.sampleTimeUs != androidx.media3.common.C.TIME_UNSET);
            this.output.sampleMetadata(this.sampleTimeUs, 1, this.sampleSize, 0, null);
            this.writingSample = false;
        }
    }
}
