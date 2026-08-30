package androidx.media3.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
abstract class StreamReader {
    private static final int STATE_END_OF_INPUT = 3;
    private static final int STATE_READ_HEADERS = 0;
    private static final int STATE_READ_PAYLOAD = 2;
    private static final int STATE_SKIP_HEADERS = 1;
    private long currentGranule;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private boolean formatSet;
    private long lengthOfReadPacket;
    private androidx.media3.extractor.ogg.OggSeeker oggSeeker;
    private long payloadStartPosition;
    private int sampleRate;
    private boolean seekMapSet;
    private int state;
    private long targetGranule;
    private androidx.media3.extractor.TrackOutput trackOutput;
    private final androidx.media3.extractor.ogg.OggPacket oggPacket = new androidx.media3.extractor.ogg.OggPacket();
    private androidx.media3.extractor.ogg.StreamReader.SetupData setupData = new androidx.media3.extractor.ogg.StreamReader.SetupData();

    protected abstract long preparePayload(androidx.media3.common.util.ParsableByteArray parsableByteArray);

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean readHeaders(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, androidx.media3.extractor.ogg.StreamReader.SetupData setupData) throws java.io.IOException;

    static class SetupData {
        androidx.media3.common.Format format;
        androidx.media3.extractor.ogg.OggSeeker oggSeeker;

        SetupData() {
        }
    }

    void init(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.TrackOutput trackOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = trackOutput;
        reset(true);
    }

    protected void reset(boolean z) {
        if (z) {
            this.setupData = new androidx.media3.extractor.ogg.StreamReader.SetupData();
            this.payloadStartPosition = 0L;
            this.state = 0;
        } else {
            this.state = 1;
        }
        this.targetGranule = -1L;
        this.currentGranule = 0L;
    }

    final void seek(long j, long j2) {
        this.oggPacket.reset();
        if (j == 0) {
            reset(!this.seekMapSet);
        } else if (this.state != 0) {
            this.targetGranule = convertTimeToGranule(j2);
            ((androidx.media3.extractor.ogg.OggSeeker) androidx.media3.common.util.Util.castNonNull(this.oggSeeker)).startSeek(this.targetGranule);
            this.state = 2;
        }
    }

    final int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        assertInitialized();
        int i = this.state;
        if (i == 0) {
            return readHeadersAndUpdateState(extractorInput);
        }
        if (i == 1) {
            extractorInput.skipFully((int) this.payloadStartPosition);
            this.state = 2;
            return 0;
        }
        if (i == 2) {
            androidx.media3.common.util.Util.castNonNull(this.oggSeeker);
            return readPayload(extractorInput, positionHolder);
        }
        if (i == 3) {
            return -1;
        }
        throw new java.lang.IllegalStateException();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void assertInitialized() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.trackOutput);
        androidx.media3.common.util.Util.castNonNull(this.extractorOutput);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean readHeaders(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        while (this.oggPacket.populate(extractorInput)) {
            this.lengthOfReadPacket = extractorInput.getPosition() - this.payloadStartPosition;
            if (!readHeaders(this.oggPacket.getPayload(), this.payloadStartPosition, this.setupData)) {
                return true;
            }
            this.payloadStartPosition = extractorInput.getPosition();
        }
        this.state = 3;
        return false;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    private int readHeadersAndUpdateState(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (!readHeaders(extractorInput)) {
            return -1;
        }
        this.sampleRate = this.setupData.format.sampleRate;
        if (!this.formatSet) {
            this.trackOutput.format(this.setupData.format);
            this.formatSet = true;
        }
        if (this.setupData.oggSeeker != null) {
            this.oggSeeker = this.setupData.oggSeeker;
        } else if (extractorInput.getLength() == -1) {
            this.oggSeeker = new androidx.media3.extractor.ogg.StreamReader.UnseekableOggSeeker();
        } else {
            androidx.media3.extractor.ogg.OggPageHeader pageHeader = this.oggPacket.getPageHeader();
            this.oggSeeker = new androidx.media3.extractor.ogg.DefaultOggSeeker(this, this.payloadStartPosition, extractorInput.getLength(), pageHeader.headerSize + pageHeader.bodySize, pageHeader.granulePosition, (pageHeader.type & 4) != 0);
        }
        this.state = 2;
        this.oggPacket.trimPayload();
        return 0;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int readPayload(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        long j = this.oggSeeker.read(extractorInput);
        if (j >= 0) {
            positionHolder.position = j;
            return 1;
        }
        if (j < -1) {
            onSeekEnd(-(j + 2));
        }
        if (!this.seekMapSet) {
            this.extractorOutput.seekMap((androidx.media3.extractor.SeekMap) androidx.media3.common.util.Assertions.checkStateNotNull(this.oggSeeker.createSeekMap()));
            this.seekMapSet = true;
        }
        if (this.lengthOfReadPacket > 0 || this.oggPacket.populate(extractorInput)) {
            this.lengthOfReadPacket = 0L;
            androidx.media3.common.util.ParsableByteArray payload = this.oggPacket.getPayload();
            long jPreparePayload = preparePayload(payload);
            if (jPreparePayload >= 0) {
                long j2 = this.currentGranule;
                if (j2 + jPreparePayload >= this.targetGranule) {
                    long jConvertGranuleToTime = convertGranuleToTime(j2);
                    this.trackOutput.sampleData(payload, payload.limit());
                    this.trackOutput.sampleMetadata(jConvertGranuleToTime, 1, payload.limit(), 0, null);
                    this.targetGranule = -1L;
                }
            }
            this.currentGranule += jPreparePayload;
            return 0;
        }
        this.state = 3;
        return -1;
    }

    protected long convertGranuleToTime(long j) {
        return (j * 1000000) / ((long) this.sampleRate);
    }

    protected long convertTimeToGranule(long j) {
        return (((long) this.sampleRate) * j) / 1000000;
    }

    protected void onSeekEnd(long j) {
        this.currentGranule = j;
    }

    private static final class UnseekableOggSeeker implements androidx.media3.extractor.ogg.OggSeeker {
        @Override // androidx.media3.extractor.ogg.OggSeeker
        public long read(androidx.media3.extractor.ExtractorInput extractorInput) {
            return -1L;
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public void startSeek(long j) {
        }

        private UnseekableOggSeeker() {
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public androidx.media3.extractor.SeekMap createSeekMap() {
            return new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET);
        }
    }
}
