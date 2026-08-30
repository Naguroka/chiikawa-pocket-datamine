package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class AdtsExtractor implements androidx.media3.extractor.Extractor {
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.ts.AdtsExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.ts.AdtsExtractor.lambda$static$0();
        }
    };
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_PACKET_SIZE = 2048;
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int NUM_FRAMES_FOR_AVERAGE_FRAME_SIZE = 1000;
    private int averageFrameSize;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private long firstFramePosition;
    private long firstSampleTimestampUs;
    private final int flags;
    private boolean hasCalculatedAverageFrameSize;
    private boolean hasOutputSeekMap;
    private final androidx.media3.common.util.ParsableByteArray packetBuffer;
    private final androidx.media3.extractor.ts.AdtsReader reader;
    private final androidx.media3.common.util.ParsableByteArray scratch;
    private final androidx.media3.common.util.ParsableBitArray scratchBits;
    private boolean startedPacket;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.ts.AdtsExtractor()};
    }

    public AdtsExtractor() {
        this(0);
    }

    public AdtsExtractor(int i) {
        this.flags = (i & 2) != 0 ? i | 1 : i;
        this.reader = new androidx.media3.extractor.ts.AdtsReader(true);
        this.packetBuffer = new androidx.media3.common.util.ParsableByteArray(2048);
        this.averageFrameSize = -1;
        this.firstFramePosition = -1L;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(10);
        this.scratch = parsableByteArray;
        this.scratchBits = new androidx.media3.common.util.ParsableBitArray(parsableByteArray.getData());
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int iPeekId3Header = peekId3Header(extractorInput);
        int i = iPeekId3Header;
        int i2 = 0;
        int i3 = 0;
        do {
            extractorInput.peekFully(this.scratch.getData(), 0, 2);
            this.scratch.setPosition(0);
            if (androidx.media3.extractor.ts.AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 4);
                this.scratchBits.setPosition(14);
                int bits = this.scratchBits.readBits(13);
                if (bits <= 6) {
                    i++;
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(i);
                } else {
                    extractorInput.advancePeekPosition(bits - 6);
                    i3 += bits;
                }
            } else {
                i++;
                extractorInput.resetPeekPosition();
                extractorInput.advancePeekPosition(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iPeekId3Header < 8192);
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.reader.createTracks(extractorOutput, new androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.startedPacket = false;
        this.reader.seek();
        this.firstSampleTimestampUs = j2;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.extractorOutput);
        long length = extractorInput.getLength();
        int i = this.flags;
        if (((i & 2) == 0 && ((i & 1) == 0 || length == -1)) ? false : true) {
            calculateAverageFrameSize(extractorInput);
        }
        int i2 = extractorInput.read(this.packetBuffer.getData(), 0, 2048);
        boolean z = i2 == -1;
        maybeOutputSeekMap(length, z);
        if (z) {
            return -1;
        }
        this.packetBuffer.setPosition(0);
        this.packetBuffer.setLimit(i2);
        if (!this.startedPacket) {
            this.reader.packetStarted(this.firstSampleTimestampUs, 4);
            this.startedPacket = true;
        }
        this.reader.consume(this.packetBuffer);
        return 0;
    }

    private int peekId3Header(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int i = 0;
        while (true) {
            extractorInput.peekFully(this.scratch.getData(), 0, 10);
            this.scratch.setPosition(0);
            if (this.scratch.readUnsignedInt24() != 4801587) {
                break;
            }
            this.scratch.skipBytes(3);
            int synchSafeInt = this.scratch.readSynchSafeInt();
            i += synchSafeInt + 10;
            extractorInput.advancePeekPosition(synchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i);
        if (this.firstFramePosition == -1) {
            this.firstFramePosition = i;
        }
        return i;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private void maybeOutputSeekMap(long j, boolean z) {
        if (this.hasOutputSeekMap) {
            return;
        }
        boolean z2 = (this.flags & 1) != 0 && this.averageFrameSize > 0;
        if (z2 && this.reader.getSampleDurationUs() == androidx.media3.common.C.TIME_UNSET && !z) {
            return;
        }
        if (z2 && this.reader.getSampleDurationUs() != androidx.media3.common.C.TIME_UNSET) {
            this.extractorOutput.seekMap(getConstantBitrateSeekMap(j, (this.flags & 2) != 0));
        } else {
            this.extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET));
        }
        this.hasOutputSeekMap = true;
    }

    private void calculateAverageFrameSize(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (this.hasCalculatedAverageFrameSize) {
            return;
        }
        this.averageFrameSize = -1;
        extractorInput.resetPeekPosition();
        long j = 0;
        if (extractorInput.getPosition() == 0) {
            peekId3Header(extractorInput);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                if (extractorInput.peekFully(this.scratch.getData(), 0, 2, true)) {
                    this.scratch.setPosition(0);
                    if (!androidx.media3.extractor.ts.AdtsReader.isAdtsSyncWord(this.scratch.readUnsignedShort())) {
                        break;
                    }
                    if (extractorInput.peekFully(this.scratch.getData(), 0, 4, true)) {
                        this.scratchBits.setPosition(14);
                        int bits = this.scratchBits.readBits(13);
                        if (bits <= 6) {
                            this.hasCalculatedAverageFrameSize = true;
                            throw androidx.media3.common.ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                        }
                        j += (long) bits;
                        i2++;
                        if (i2 != 1000 && extractorInput.advancePeekPosition(bits - 6, true)) {
                        }
                    }
                }
            } catch (java.io.EOFException unused) {
            }
            i = i2;
            break;
        }
        extractorInput.resetPeekPosition();
        if (i > 0) {
            this.averageFrameSize = (int) (j / ((long) i));
        } else {
            this.averageFrameSize = -1;
        }
        this.hasCalculatedAverageFrameSize = true;
    }

    private androidx.media3.extractor.SeekMap getConstantBitrateSeekMap(long j, boolean z) {
        return new androidx.media3.extractor.ConstantBitrateSeekMap(j, this.firstFramePosition, getBitrateFromFrameSize(this.averageFrameSize, this.reader.getSampleDurationUs()), this.averageFrameSize, z);
    }

    private static int getBitrateFromFrameSize(int i, long j) {
        return (int) (((((long) i) * 8) * 1000000) / j);
    }
}
