package androidx.media3.extractor.flac;

/* JADX INFO: loaded from: classes.dex */
public final class FlacExtractor implements androidx.media3.extractor.Extractor {
    private static final int BUFFER_LENGTH = 32768;
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.flac.FlacExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.flac.FlacExtractor.lambda$static$0();
        }
    };
    public static final int FLAG_DISABLE_ID3_METADATA = 1;
    private static final int SAMPLE_NUMBER_UNKNOWN = -1;
    private static final int STATE_GET_FRAME_START_MARKER = 4;
    private static final int STATE_GET_STREAM_MARKER_AND_INFO_BLOCK_BYTES = 1;
    private static final int STATE_READ_FRAMES = 5;
    private static final int STATE_READ_ID3_METADATA = 0;
    private static final int STATE_READ_METADATA_BLOCKS = 3;
    private static final int STATE_READ_STREAM_MARKER = 2;
    private androidx.media3.extractor.flac.FlacBinarySearchSeeker binarySearchSeeker;
    private final androidx.media3.common.util.ParsableByteArray buffer;
    private int currentFrameBytesWritten;
    private long currentFrameFirstSampleNumber;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata;
    private int frameStartMarker;
    private androidx.media3.common.Metadata id3Metadata;
    private final boolean id3MetadataDisabled;
    private int minFrameSize;
    private final androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder;
    private int state;
    private final byte[] streamMarkerAndInfoBlock;
    private androidx.media3.extractor.TrackOutput trackOutput;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.flac.FlacExtractor()};
    }

    public FlacExtractor() {
        this(0);
    }

    public FlacExtractor(int i) {
        this.streamMarkerAndInfoBlock = new byte[42];
        this.buffer = new androidx.media3.common.util.ParsableByteArray(new byte[32768], 0);
        this.id3MetadataDisabled = (i & 1) != 0;
        this.sampleNumberHolder = new androidx.media3.extractor.FlacFrameReader.SampleNumberHolder();
        this.state = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.FlacMetadataReader.peekId3Metadata(extractorInput, false);
        return androidx.media3.extractor.FlacMetadataReader.checkAndPeekStreamMarker(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int i = this.state;
        if (i == 0) {
            readId3Metadata(extractorInput);
            return 0;
        }
        if (i == 1) {
            getStreamMarkerAndInfoBlockBytes(extractorInput);
            return 0;
        }
        if (i == 2) {
            readStreamMarker(extractorInput);
            return 0;
        }
        if (i == 3) {
            readMetadataBlocks(extractorInput);
            return 0;
        }
        if (i == 4) {
            getFrameStartMarker(extractorInput);
            return 0;
        }
        if (i == 5) {
            return readFrames(extractorInput, positionHolder);
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        if (j == 0) {
            this.state = 0;
        } else {
            androidx.media3.extractor.flac.FlacBinarySearchSeeker flacBinarySearchSeeker = this.binarySearchSeeker;
            if (flacBinarySearchSeeker != null) {
                flacBinarySearchSeeker.setSeekTargetUs(j2);
            }
        }
        this.currentFrameFirstSampleNumber = j2 != 0 ? -1L : 0L;
        this.currentFrameBytesWritten = 0;
        this.buffer.reset(0);
    }

    private void readId3Metadata(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.id3Metadata = androidx.media3.extractor.FlacMetadataReader.readId3Metadata(extractorInput, !this.id3MetadataDisabled);
        this.state = 1;
    }

    private void getStreamMarkerAndInfoBlockBytes(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        byte[] bArr = this.streamMarkerAndInfoBlock;
        extractorInput.peekFully(bArr, 0, bArr.length);
        extractorInput.resetPeekPosition();
        this.state = 2;
    }

    private void readStreamMarker(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.FlacMetadataReader.readStreamMarker(extractorInput);
        this.state = 3;
    }

    private void readMetadataBlocks(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.FlacMetadataReader.FlacStreamMetadataHolder flacStreamMetadataHolder = new androidx.media3.extractor.FlacMetadataReader.FlacStreamMetadataHolder(this.flacStreamMetadata);
        boolean metadataBlock = false;
        while (!metadataBlock) {
            metadataBlock = androidx.media3.extractor.FlacMetadataReader.readMetadataBlock(extractorInput, flacStreamMetadataHolder);
            this.flacStreamMetadata = (androidx.media3.extractor.FlacStreamMetadata) androidx.media3.common.util.Util.castNonNull(flacStreamMetadataHolder.flacStreamMetadata);
        }
        androidx.media3.common.util.Assertions.checkNotNull(this.flacStreamMetadata);
        this.minFrameSize = java.lang.Math.max(this.flacStreamMetadata.minFrameSize, 6);
        ((androidx.media3.extractor.TrackOutput) androidx.media3.common.util.Util.castNonNull(this.trackOutput)).format(this.flacStreamMetadata.getFormat(this.streamMarkerAndInfoBlock, this.id3Metadata));
        this.state = 4;
    }

    private void getFrameStartMarker(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.frameStartMarker = androidx.media3.extractor.FlacMetadataReader.getFrameStartMarker(extractorInput);
        ((androidx.media3.extractor.ExtractorOutput) androidx.media3.common.util.Util.castNonNull(this.extractorOutput)).seekMap(getSeekMap(extractorInput.getPosition(), extractorInput.getLength()));
        this.state = 5;
    }

    private int readFrames(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        boolean z;
        androidx.media3.common.util.Assertions.checkNotNull(this.trackOutput);
        androidx.media3.common.util.Assertions.checkNotNull(this.flacStreamMetadata);
        androidx.media3.extractor.flac.FlacBinarySearchSeeker flacBinarySearchSeeker = this.binarySearchSeeker;
        if (flacBinarySearchSeeker != null && flacBinarySearchSeeker.isSeeking()) {
            return this.binarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
        }
        if (this.currentFrameFirstSampleNumber == -1) {
            this.currentFrameFirstSampleNumber = androidx.media3.extractor.FlacFrameReader.getFirstSampleNumber(extractorInput, this.flacStreamMetadata);
            return 0;
        }
        int iLimit = this.buffer.limit();
        if (iLimit < 32768) {
            int i = extractorInput.read(this.buffer.getData(), iLimit, 32768 - iLimit);
            z = i == -1;
            if (!z) {
                this.buffer.setLimit(iLimit + i);
            } else if (this.buffer.bytesLeft() == 0) {
                outputSampleMetadata();
                return -1;
            }
        } else {
            z = false;
        }
        int position = this.buffer.getPosition();
        int i2 = this.currentFrameBytesWritten;
        int i3 = this.minFrameSize;
        if (i2 < i3) {
            androidx.media3.common.util.ParsableByteArray parsableByteArray = this.buffer;
            parsableByteArray.skipBytes(java.lang.Math.min(i3 - i2, parsableByteArray.bytesLeft()));
        }
        long jFindFrame = findFrame(this.buffer, z);
        int position2 = this.buffer.getPosition() - position;
        this.buffer.setPosition(position);
        this.trackOutput.sampleData(this.buffer, position2);
        this.currentFrameBytesWritten += position2;
        if (jFindFrame != -1) {
            outputSampleMetadata();
            this.currentFrameBytesWritten = 0;
            this.currentFrameFirstSampleNumber = jFindFrame;
        }
        if (this.buffer.bytesLeft() < 16) {
            int iBytesLeft = this.buffer.bytesLeft();
            java.lang.System.arraycopy(this.buffer.getData(), this.buffer.getPosition(), this.buffer.getData(), 0, iBytesLeft);
            this.buffer.setPosition(0);
            this.buffer.setLimit(iBytesLeft);
        }
        return 0;
    }

    private androidx.media3.extractor.SeekMap getSeekMap(long j, long j2) {
        androidx.media3.common.util.Assertions.checkNotNull(this.flacStreamMetadata);
        if (this.flacStreamMetadata.seekTable != null) {
            return new androidx.media3.extractor.FlacSeekTableSeekMap(this.flacStreamMetadata, j);
        }
        if (j2 != -1 && this.flacStreamMetadata.totalSamples > 0) {
            androidx.media3.extractor.flac.FlacBinarySearchSeeker flacBinarySearchSeeker = new androidx.media3.extractor.flac.FlacBinarySearchSeeker(this.flacStreamMetadata, this.frameStartMarker, j, j2);
            this.binarySearchSeeker = flacBinarySearchSeeker;
            return flacBinarySearchSeeker.getSeekMap();
        }
        return new androidx.media3.extractor.SeekMap.Unseekable(this.flacStreamMetadata.getDurationUs());
    }

    private long findFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z) {
        boolean zCheckAndReadFrameHeader;
        androidx.media3.common.util.Assertions.checkNotNull(this.flacStreamMetadata);
        int position = parsableByteArray.getPosition();
        while (position <= parsableByteArray.limit() - 16) {
            parsableByteArray.setPosition(position);
            if (androidx.media3.extractor.FlacFrameReader.checkAndReadFrameHeader(parsableByteArray, this.flacStreamMetadata, this.frameStartMarker, this.sampleNumberHolder)) {
                parsableByteArray.setPosition(position);
                return this.sampleNumberHolder.sampleNumber;
            }
            position++;
        }
        if (z) {
            while (position <= parsableByteArray.limit() - this.minFrameSize) {
                parsableByteArray.setPosition(position);
                try {
                    zCheckAndReadFrameHeader = androidx.media3.extractor.FlacFrameReader.checkAndReadFrameHeader(parsableByteArray, this.flacStreamMetadata, this.frameStartMarker, this.sampleNumberHolder);
                } catch (java.lang.IndexOutOfBoundsException unused) {
                    zCheckAndReadFrameHeader = false;
                }
                if (parsableByteArray.getPosition() <= parsableByteArray.limit() ? zCheckAndReadFrameHeader : false) {
                    parsableByteArray.setPosition(position);
                    return this.sampleNumberHolder.sampleNumber;
                }
                position++;
            }
            parsableByteArray.setPosition(parsableByteArray.limit());
            return -1L;
        }
        parsableByteArray.setPosition(position);
        return -1L;
    }

    private void outputSampleMetadata() {
        ((androidx.media3.extractor.TrackOutput) androidx.media3.common.util.Util.castNonNull(this.trackOutput)).sampleMetadata((this.currentFrameFirstSampleNumber * 1000000) / ((long) ((androidx.media3.extractor.FlacStreamMetadata) androidx.media3.common.util.Util.castNonNull(this.flacStreamMetadata)).sampleRate), 1, this.currentFrameBytesWritten, 0, null);
    }
}
