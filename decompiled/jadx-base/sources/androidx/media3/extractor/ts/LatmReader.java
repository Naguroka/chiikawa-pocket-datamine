package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class LatmReader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private static final int INITIAL_BUFFER_SIZE = 1024;
    private static final int STATE_FINDING_SYNC_1 = 0;
    private static final int STATE_FINDING_SYNC_2 = 1;
    private static final int STATE_READING_HEADER = 2;
    private static final int STATE_READING_SAMPLE = 3;
    private static final int SYNC_BYTE_FIRST = 86;
    private static final int SYNC_BYTE_SECOND = 224;
    private int audioMuxVersionA;
    private int bytesRead;
    private int channelCount;
    private java.lang.String codecs;
    private androidx.media3.common.Format format;
    private java.lang.String formatId;
    private int frameLengthType;
    private final java.lang.String language;
    private int numSubframes;
    private long otherDataLenBits;
    private boolean otherDataPresent;
    private androidx.media3.extractor.TrackOutput output;
    private final int roleFlags;
    private final androidx.media3.common.util.ParsableBitArray sampleBitArray;
    private final androidx.media3.common.util.ParsableByteArray sampleDataBuffer;
    private long sampleDurationUs;
    private int sampleRateHz;
    private int sampleSize;
    private int secondHeaderByte;
    private int state;
    private boolean streamMuxRead;
    private long timeUs;

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
    }

    public LatmReader(java.lang.String str, int i) {
        this.language = str;
        this.roleFlags = i;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(1024);
        this.sampleDataBuffer = parsableByteArray;
        this.sampleBitArray = new androidx.media3.common.util.ParsableBitArray(parsableByteArray.getData());
        this.timeUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.timeUs = androidx.media3.common.C.TIME_UNSET;
        this.streamMuxRead = false;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
        this.formatId = trackIdGenerator.getFormatId();
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.timeUs = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.state;
            if (i != 0) {
                if (i == 1) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    if ((unsignedByte & 224) == 224) {
                        this.secondHeaderByte = unsignedByte;
                        this.state = 2;
                    } else if (unsignedByte != 86) {
                        this.state = 0;
                    }
                } else if (i == 2) {
                    int unsignedByte2 = ((this.secondHeaderByte & (-225)) << 8) | parsableByteArray.readUnsignedByte();
                    this.sampleSize = unsignedByte2;
                    if (unsignedByte2 > this.sampleDataBuffer.getData().length) {
                        resetBufferForSize(this.sampleSize);
                    }
                    this.bytesRead = 0;
                    this.state = 3;
                } else if (i == 3) {
                    int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    parsableByteArray.readBytes(this.sampleBitArray.data, this.bytesRead, iMin);
                    int i2 = this.bytesRead + iMin;
                    this.bytesRead = i2;
                    if (i2 == this.sampleSize) {
                        this.sampleBitArray.setPosition(0);
                        parseAudioMuxElement(this.sampleBitArray);
                        this.state = 0;
                    }
                } else {
                    throw new java.lang.IllegalStateException();
                }
            } else if (parsableByteArray.readUnsignedByte() == 86) {
                this.state = 1;
            }
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void parseAudioMuxElement(androidx.media3.common.util.ParsableBitArray parsableBitArray) throws androidx.media3.common.ParserException {
        if (!parsableBitArray.readBit()) {
            this.streamMuxRead = true;
            parseStreamMuxConfig(parsableBitArray);
        } else if (!this.streamMuxRead) {
            return;
        }
        if (this.audioMuxVersionA == 0) {
            if (this.numSubframes != 0) {
                throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
            }
            parsePayloadMux(parsableBitArray, parsePayloadLengthInfo(parsableBitArray));
            if (this.otherDataPresent) {
                parsableBitArray.skipBits((int) this.otherDataLenBits);
                return;
            }
            return;
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void parseStreamMuxConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray) throws androidx.media3.common.ParserException {
        boolean bit;
        int bits = parsableBitArray.readBits(1);
        int bits2 = bits == 1 ? parsableBitArray.readBits(1) : 0;
        this.audioMuxVersionA = bits2;
        if (bits2 == 0) {
            if (bits == 1) {
                latmGetValue(parsableBitArray);
            }
            if (!parsableBitArray.readBit()) {
                throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
            }
            this.numSubframes = parsableBitArray.readBits(6);
            int bits3 = parsableBitArray.readBits(4);
            int bits4 = parsableBitArray.readBits(3);
            if (bits3 != 0 || bits4 != 0) {
                throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
            }
            if (bits == 0) {
                int position = parsableBitArray.getPosition();
                int audioSpecificConfig = parseAudioSpecificConfig(parsableBitArray);
                parsableBitArray.setPosition(position);
                byte[] bArr = new byte[(audioSpecificConfig + 7) / 8];
                parsableBitArray.readBits(bArr, 0, audioSpecificConfig);
                androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setId(this.formatId).setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_AAC).setCodecs(this.codecs).setChannelCount(this.channelCount).setSampleRate(this.sampleRateHz).setInitializationData(java.util.Collections.singletonList(bArr)).setLanguage(this.language).setRoleFlags(this.roleFlags).build();
                if (!formatBuild.equals(this.format)) {
                    this.format = formatBuild;
                    this.sampleDurationUs = 1024000000 / ((long) formatBuild.sampleRate);
                    this.output.format(formatBuild);
                }
            } else {
                parsableBitArray.skipBits(((int) latmGetValue(parsableBitArray)) - parseAudioSpecificConfig(parsableBitArray));
            }
            parseFrameLength(parsableBitArray);
            boolean bit2 = parsableBitArray.readBit();
            this.otherDataPresent = bit2;
            this.otherDataLenBits = 0L;
            if (bit2) {
                if (bits == 1) {
                    this.otherDataLenBits = latmGetValue(parsableBitArray);
                } else {
                    do {
                        bit = parsableBitArray.readBit();
                        this.otherDataLenBits = (this.otherDataLenBits << 8) + ((long) parsableBitArray.readBits(8));
                    } while (bit);
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
                return;
            }
            return;
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
    }

    private void parseFrameLength(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int bits = parsableBitArray.readBits(3);
        this.frameLengthType = bits;
        if (bits == 0) {
            parsableBitArray.skipBits(8);
            return;
        }
        if (bits == 1) {
            parsableBitArray.skipBits(9);
            return;
        }
        if (bits == 3 || bits == 4 || bits == 5) {
            parsableBitArray.skipBits(6);
        } else {
            if (bits == 6 || bits == 7) {
                parsableBitArray.skipBits(1);
                return;
            }
            throw new java.lang.IllegalStateException();
        }
    }

    private int parseAudioSpecificConfig(androidx.media3.common.util.ParsableBitArray parsableBitArray) throws androidx.media3.common.ParserException {
        int iBitsLeft = parsableBitArray.bitsLeft();
        androidx.media3.extractor.AacUtil.Config audioSpecificConfig = androidx.media3.extractor.AacUtil.parseAudioSpecificConfig(parsableBitArray, true);
        this.codecs = audioSpecificConfig.codecs;
        this.sampleRateHz = audioSpecificConfig.sampleRateHz;
        this.channelCount = audioSpecificConfig.channelCount;
        return iBitsLeft - parsableBitArray.bitsLeft();
    }

    private int parsePayloadLengthInfo(androidx.media3.common.util.ParsableBitArray parsableBitArray) throws androidx.media3.common.ParserException {
        int bits;
        if (this.frameLengthType != 0) {
            throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
        }
        int i = 0;
        do {
            bits = parsableBitArray.readBits(8);
            i += bits;
        } while (bits == 255);
        return i;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void parsePayloadMux(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i) {
        int position = parsableBitArray.getPosition();
        if ((position & 7) == 0) {
            this.sampleDataBuffer.setPosition(position >> 3);
        } else {
            parsableBitArray.readBits(this.sampleDataBuffer.getData(), 0, i * 8);
            this.sampleDataBuffer.setPosition(0);
        }
        this.output.sampleData(this.sampleDataBuffer, i);
        androidx.media3.common.util.Assertions.checkState(this.timeUs != androidx.media3.common.C.TIME_UNSET);
        this.output.sampleMetadata(this.timeUs, 1, i, 0, null);
        this.timeUs += this.sampleDurationUs;
    }

    private void resetBufferForSize(int i) {
        this.sampleDataBuffer.reset(i);
        this.sampleBitArray.reset(this.sampleDataBuffer.getData());
    }

    private static long latmGetValue(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        return parsableBitArray.readBits((parsableBitArray.readBits(2) + 1) * 8);
    }
}
