package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class SingleSampleExtractor implements androidx.media3.extractor.Extractor {
    private static final int FIXED_READ_LENGTH = 1024;
    public static final int IMAGE_TRACK_ID = 1024;
    private static final int STATE_ENDED = 2;
    private static final int STATE_READING = 1;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private final int fileSignature;
    private final int fileSignatureLength;
    private final java.lang.String sampleMimeType;
    private int size;
    private int state;
    private androidx.media3.extractor.TrackOutput trackOutput;

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    public SingleSampleExtractor(int i, int i2, java.lang.String str) {
        this.fileSignature = i;
        this.fileSignatureLength = i2;
        this.sampleMimeType = str;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkState((this.fileSignature == -1 || this.fileSignatureLength == -1) ? false : true);
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(this.fileSignatureLength);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.fileSignatureLength);
        return parsableByteArray.readUnsignedShort() == this.fileSignature;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        outputImageTrackAndSeekMap(this.sampleMimeType);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int i = this.state;
        if (i == 1) {
            readSegment(extractorInput);
            return 0;
        }
        if (i == 2) {
            return -1;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        if (j == 0 || this.state == 1) {
            this.state = 1;
            this.size = 0;
        }
    }

    private void readSegment(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int iSampleData = ((androidx.media3.extractor.TrackOutput) androidx.media3.common.util.Assertions.checkNotNull(this.trackOutput)).sampleData((androidx.media3.common.DataReader) extractorInput, 1024, true);
        if (iSampleData == -1) {
            this.state = 2;
            this.trackOutput.sampleMetadata(0L, 1, this.size, 0, null);
            this.size = 0;
            return;
        }
        this.size += iSampleData;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"this.extractorOutput"})
    private void outputImageTrackAndSeekMap(java.lang.String str) {
        androidx.media3.extractor.TrackOutput trackOutputTrack = this.extractorOutput.track(1024, 4);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(new androidx.media3.common.Format.Builder().setSampleMimeType(str).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new androidx.media3.extractor.SingleSampleSeekMap(androidx.media3.common.C.TIME_UNSET));
        this.state = 1;
    }
}
