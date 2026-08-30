package androidx.media3.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
public class OggExtractor implements androidx.media3.extractor.Extractor {
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.ogg.OggExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.ogg.OggExtractor.lambda$static$0();
        }
    };
    private static final int MAX_VERIFICATION_BYTES = 8;
    private androidx.media3.extractor.ExtractorOutput output;
    private androidx.media3.extractor.ogg.StreamReader streamReader;
    private boolean streamReaderInitialized;

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.ogg.OggExtractor()};
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        try {
            return sniffInternal(extractorInput);
        } catch (androidx.media3.common.ParserException unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        androidx.media3.extractor.ogg.StreamReader streamReader = this.streamReader;
        if (streamReader != null) {
            streamReader.seek(j, j2);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
        if (this.streamReader == null) {
            if (!sniffInternal(extractorInput)) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            extractorInput.resetPeekPosition();
        }
        if (!this.streamReaderInitialized) {
            androidx.media3.extractor.TrackOutput trackOutputTrack = this.output.track(0, 1);
            this.output.endTracks();
            this.streamReader.init(this.output, trackOutputTrack);
            this.streamReaderInitialized = true;
        }
        return this.streamReader.read(extractorInput, positionHolder);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean sniffInternal(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.ogg.OggPageHeader oggPageHeader = new androidx.media3.extractor.ogg.OggPageHeader();
        if (oggPageHeader.populate(extractorInput, true) && (oggPageHeader.type & 2) == 2) {
            int iMin = java.lang.Math.min(oggPageHeader.bodySize, 8);
            androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(iMin);
            extractorInput.peekFully(parsableByteArray.getData(), 0, iMin);
            if (androidx.media3.extractor.ogg.FlacReader.verifyBitstreamType(resetPosition(parsableByteArray))) {
                this.streamReader = new androidx.media3.extractor.ogg.FlacReader();
            } else if (androidx.media3.extractor.ogg.VorbisReader.verifyBitstreamType(resetPosition(parsableByteArray))) {
                this.streamReader = new androidx.media3.extractor.ogg.VorbisReader();
            } else if (androidx.media3.extractor.ogg.OpusReader.verifyBitstreamType(resetPosition(parsableByteArray))) {
                this.streamReader = new androidx.media3.extractor.ogg.OpusReader();
            }
            return true;
        }
        return false;
    }

    private static androidx.media3.common.util.ParsableByteArray resetPosition(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(0);
        return parsableByteArray;
    }
}
