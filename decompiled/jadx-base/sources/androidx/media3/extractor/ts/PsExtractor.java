package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class PsExtractor implements androidx.media3.extractor.Extractor {
    public static final int AUDIO_STREAM = 192;
    public static final int AUDIO_STREAM_MASK = 224;
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.ts.PsExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.ts.PsExtractor.lambda$static$0();
        }
    };
    private static final long MAX_SEARCH_LENGTH = 1048576;
    private static final long MAX_SEARCH_LENGTH_AFTER_AUDIO_AND_VIDEO_FOUND = 8192;
    private static final int MAX_STREAM_ID_PLUS_ONE = 256;
    static final int MPEG_PROGRAM_END_CODE = 441;
    static final int PACKET_START_CODE_PREFIX = 1;
    static final int PACK_START_CODE = 442;
    public static final int PRIVATE_STREAM_1 = 189;
    static final int SYSTEM_HEADER_START_CODE = 443;
    public static final int VIDEO_STREAM = 224;
    public static final int VIDEO_STREAM_MASK = 240;
    private final androidx.media3.extractor.ts.PsDurationReader durationReader;
    private boolean foundAllTracks;
    private boolean foundAudioTrack;
    private boolean foundVideoTrack;
    private boolean hasOutputSeekMap;
    private long lastTrackPosition;
    private androidx.media3.extractor.ExtractorOutput output;
    private androidx.media3.extractor.ts.PsBinarySearchSeeker psBinarySearchSeeker;
    private final androidx.media3.common.util.ParsableByteArray psPacketBuffer;
    private final android.util.SparseArray<androidx.media3.extractor.ts.PsExtractor.PesReader> psPayloadReaders;
    private final androidx.media3.common.util.TimestampAdjuster timestampAdjuster;

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.ts.PsExtractor()};
    }

    public PsExtractor() {
        this(new androidx.media3.common.util.TimestampAdjuster(0L));
    }

    public PsExtractor(androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
        this.psPacketBuffer = new androidx.media3.common.util.ParsableByteArray(4096);
        this.psPayloadReaders = new android.util.SparseArray<>();
        this.durationReader = new androidx.media3.extractor.ts.PsDurationReader();
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        byte[] bArr = new byte[14];
        extractorInput.peekFully(bArr, 0, 14);
        if (PACK_START_CODE != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        extractorInput.advancePeekPosition(bArr[13] & 7);
        extractorInput.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        boolean z = this.timestampAdjuster.getTimestampOffsetUs() == androidx.media3.common.C.TIME_UNSET;
        if (!z) {
            long firstSampleTimestampUs = this.timestampAdjuster.getFirstSampleTimestampUs();
            z = (firstSampleTimestampUs == androidx.media3.common.C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j2) ? false : true;
        }
        if (z) {
            this.timestampAdjuster.reset(j2);
        }
        androidx.media3.extractor.ts.PsBinarySearchSeeker psBinarySearchSeeker = this.psBinarySearchSeeker;
        if (psBinarySearchSeeker != null) {
            psBinarySearchSeeker.setSeekTargetUs(j2);
        }
        for (int i = 0; i < this.psPayloadReaders.size(); i++) {
            this.psPayloadReaders.valueAt(i).seek();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        androidx.media3.extractor.ts.ElementaryStreamReader h262Reader;
        androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
        long length = extractorInput.getLength();
        if ((length != -1) && !this.durationReader.isDurationReadFinished()) {
            return this.durationReader.readDuration(extractorInput, positionHolder);
        }
        maybeOutputSeekMap(length);
        androidx.media3.extractor.ts.PsBinarySearchSeeker psBinarySearchSeeker = this.psBinarySearchSeeker;
        if (psBinarySearchSeeker != null && psBinarySearchSeeker.isSeeking()) {
            return this.psBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
        }
        extractorInput.resetPeekPosition();
        long peekPosition = length != -1 ? length - extractorInput.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 4, true)) {
            return -1;
        }
        this.psPacketBuffer.setPosition(0);
        int i = this.psPacketBuffer.readInt();
        if (i == MPEG_PROGRAM_END_CODE) {
            return -1;
        }
        if (i == PACK_START_CODE) {
            extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 10);
            this.psPacketBuffer.setPosition(9);
            extractorInput.skipFully((this.psPacketBuffer.readUnsignedByte() & 7) + 14);
            return 0;
        }
        if (i == 443) {
            extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 2);
            this.psPacketBuffer.setPosition(0);
            extractorInput.skipFully(this.psPacketBuffer.readUnsignedShort() + 6);
            return 0;
        }
        if (((i & androidx.core.view.InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            extractorInput.skipFully(1);
            return 0;
        }
        int i2 = i & 255;
        androidx.media3.extractor.ts.PsExtractor.PesReader pesReader = this.psPayloadReaders.get(i2);
        if (!this.foundAllTracks) {
            if (pesReader == null) {
                if (i2 == 189) {
                    h262Reader = new androidx.media3.extractor.ts.Ac3Reader();
                    this.foundAudioTrack = true;
                    this.lastTrackPosition = extractorInput.getPosition();
                } else if ((i2 & 224) == 192) {
                    h262Reader = new androidx.media3.extractor.ts.MpegAudioReader();
                    this.foundAudioTrack = true;
                    this.lastTrackPosition = extractorInput.getPosition();
                } else if ((i2 & VIDEO_STREAM_MASK) == 224) {
                    h262Reader = new androidx.media3.extractor.ts.H262Reader();
                    this.foundVideoTrack = true;
                    this.lastTrackPosition = extractorInput.getPosition();
                } else {
                    h262Reader = null;
                }
                if (h262Reader != null) {
                    h262Reader.createTracks(this.output, new androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator(i2, 256));
                    pesReader = new androidx.media3.extractor.ts.PsExtractor.PesReader(h262Reader, this.timestampAdjuster);
                    this.psPayloadReaders.put(i2, pesReader);
                }
            }
            if (extractorInput.getPosition() > ((this.foundAudioTrack && this.foundVideoTrack) ? this.lastTrackPosition + 8192 : 1048576L)) {
                this.foundAllTracks = true;
                this.output.endTracks();
            }
        }
        extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 2);
        this.psPacketBuffer.setPosition(0);
        int unsignedShort = this.psPacketBuffer.readUnsignedShort() + 6;
        if (pesReader == null) {
            extractorInput.skipFully(unsignedShort);
        } else {
            this.psPacketBuffer.reset(unsignedShort);
            extractorInput.readFully(this.psPacketBuffer.getData(), 0, unsignedShort);
            this.psPacketBuffer.setPosition(6);
            pesReader.consume(this.psPacketBuffer);
            androidx.media3.common.util.ParsableByteArray parsableByteArray = this.psPacketBuffer;
            parsableByteArray.setLimit(parsableByteArray.capacity());
        }
        return 0;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void maybeOutputSeekMap(long j) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.getDurationUs() != androidx.media3.common.C.TIME_UNSET) {
            androidx.media3.extractor.ts.PsBinarySearchSeeker psBinarySearchSeeker = new androidx.media3.extractor.ts.PsBinarySearchSeeker(this.durationReader.getScrTimestampAdjuster(), this.durationReader.getDurationUs(), j);
            this.psBinarySearchSeeker = psBinarySearchSeeker;
            this.output.seekMap(psBinarySearchSeeker.getSeekMap());
            return;
        }
        this.output.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(this.durationReader.getDurationUs()));
    }

    private static final class PesReader {
        private static final int PES_SCRATCH_SIZE = 64;
        private boolean dtsFlag;
        private int extendedHeaderLength;
        private final androidx.media3.extractor.ts.ElementaryStreamReader pesPayloadReader;
        private final androidx.media3.common.util.ParsableBitArray pesScratch = new androidx.media3.common.util.ParsableBitArray(new byte[64]);
        private boolean ptsFlag;
        private boolean seenFirstDts;
        private long timeUs;
        private final androidx.media3.common.util.TimestampAdjuster timestampAdjuster;

        public PesReader(androidx.media3.extractor.ts.ElementaryStreamReader elementaryStreamReader, androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
            this.pesPayloadReader = elementaryStreamReader;
            this.timestampAdjuster = timestampAdjuster;
        }

        public void seek() {
            this.seenFirstDts = false;
            this.pesPayloadReader.seek();
        }

        public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
            parsableByteArray.readBytes(this.pesScratch.data, 0, 3);
            this.pesScratch.setPosition(0);
            parseHeader();
            parsableByteArray.readBytes(this.pesScratch.data, 0, this.extendedHeaderLength);
            this.pesScratch.setPosition(0);
            parseHeaderExtension();
            this.pesPayloadReader.packetStarted(this.timeUs, 4);
            this.pesPayloadReader.consume(parsableByteArray);
            this.pesPayloadReader.packetFinished(false);
        }

        private void parseHeader() {
            this.pesScratch.skipBits(8);
            this.ptsFlag = this.pesScratch.readBit();
            this.dtsFlag = this.pesScratch.readBit();
            this.pesScratch.skipBits(6);
            this.extendedHeaderLength = this.pesScratch.readBits(8);
        }

        private void parseHeaderExtension() {
            this.timeUs = 0L;
            if (this.ptsFlag) {
                this.pesScratch.skipBits(4);
                long bits = ((long) this.pesScratch.readBits(3)) << 30;
                this.pesScratch.skipBits(1);
                long bits2 = bits | ((long) (this.pesScratch.readBits(15) << 15));
                this.pesScratch.skipBits(1);
                long bits3 = bits2 | ((long) this.pesScratch.readBits(15));
                this.pesScratch.skipBits(1);
                if (!this.seenFirstDts && this.dtsFlag) {
                    this.pesScratch.skipBits(4);
                    long bits4 = ((long) this.pesScratch.readBits(3)) << 30;
                    this.pesScratch.skipBits(1);
                    long bits5 = bits4 | ((long) (this.pesScratch.readBits(15) << 15));
                    this.pesScratch.skipBits(1);
                    long bits6 = bits5 | ((long) this.pesScratch.readBits(15));
                    this.pesScratch.skipBits(1);
                    this.timestampAdjuster.adjustTsTimestamp(bits6);
                    this.seenFirstDts = true;
                }
                this.timeUs = this.timestampAdjuster.adjustTsTimestamp(bits3);
            }
        }
    }
}
