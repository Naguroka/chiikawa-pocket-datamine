package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class Ac3Reader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private static final int HEADER_SIZE = 128;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private int bytesRead;
    private androidx.media3.common.Format format;
    private java.lang.String formatId;
    private final androidx.media3.common.util.ParsableBitArray headerScratchBits;
    private final androidx.media3.common.util.ParsableByteArray headerScratchBytes;
    private final java.lang.String language;
    private boolean lastByteWas0B;
    private androidx.media3.extractor.TrackOutput output;
    private final int roleFlags;
    private long sampleDurationUs;
    private int sampleSize;
    private int state;
    private long timeUs;

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
    }

    public Ac3Reader() {
        this(null, 0);
    }

    public Ac3Reader(java.lang.String str, int i) {
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(new byte[128]);
        this.headerScratchBits = parsableBitArray;
        this.headerScratchBytes = new androidx.media3.common.util.ParsableByteArray(parsableBitArray.data);
        this.state = 0;
        this.timeUs = androidx.media3.common.C.TIME_UNSET;
        this.language = str;
        this.roleFlags = i;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.lastByteWas0B = false;
        this.timeUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.timeUs = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.state;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                        this.output.sampleData(parsableByteArray, iMin);
                        int i2 = this.bytesRead + iMin;
                        this.bytesRead = i2;
                        if (i2 == this.sampleSize) {
                            androidx.media3.common.util.Assertions.checkState(this.timeUs != androidx.media3.common.C.TIME_UNSET);
                            this.output.sampleMetadata(this.timeUs, 1, this.sampleSize, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            this.state = 0;
                        }
                    }
                } else if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 128)) {
                    parseHeader();
                    this.headerScratchBytes.setPosition(0);
                    this.output.sampleData(this.headerScratchBytes, 128);
                    this.state = 2;
                }
            } else if (skipToNextSync(parsableByteArray)) {
                this.state = 1;
                this.headerScratchBytes.getData()[0] = 11;
                this.headerScratchBytes.getData()[1] = 119;
                this.bytesRead = 2;
            }
        }
    }

    private boolean continueRead(androidx.media3.common.util.ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), i - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        int i2 = this.bytesRead + iMin;
        this.bytesRead = i2;
        return i2 == i;
    }

    private boolean skipToNextSync(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        while (true) {
            if (parsableByteArray.bytesLeft() <= 0) {
                return false;
            }
            if (!this.lastByteWas0B) {
                this.lastByteWas0B = parsableByteArray.readUnsignedByte() == 11;
            } else {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                if (unsignedByte == 119) {
                    this.lastByteWas0B = false;
                    return true;
                }
                this.lastByteWas0B = unsignedByte == 11;
            }
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void parseHeader() {
        this.headerScratchBits.setPosition(0);
        androidx.media3.extractor.Ac3Util.SyncFrameInfo ac3SyncframeInfo = androidx.media3.extractor.Ac3Util.parseAc3SyncframeInfo(this.headerScratchBits);
        if (this.format == null || ac3SyncframeInfo.channelCount != this.format.channelCount || ac3SyncframeInfo.sampleRate != this.format.sampleRate || !androidx.media3.common.util.Util.areEqual(ac3SyncframeInfo.mimeType, this.format.sampleMimeType)) {
            androidx.media3.common.Format.Builder peakBitrate = new androidx.media3.common.Format.Builder().setId(this.formatId).setSampleMimeType(ac3SyncframeInfo.mimeType).setChannelCount(ac3SyncframeInfo.channelCount).setSampleRate(ac3SyncframeInfo.sampleRate).setLanguage(this.language).setRoleFlags(this.roleFlags).setPeakBitrate(ac3SyncframeInfo.bitrate);
            if (androidx.media3.common.MimeTypes.AUDIO_AC3.equals(ac3SyncframeInfo.mimeType)) {
                peakBitrate.setAverageBitrate(ac3SyncframeInfo.bitrate);
            }
            androidx.media3.common.Format formatBuild = peakBitrate.build();
            this.format = formatBuild;
            this.output.format(formatBuild);
        }
        this.sampleSize = ac3SyncframeInfo.frameSize;
        this.sampleDurationUs = (((long) ac3SyncframeInfo.sampleCount) * 1000000) / ((long) this.format.sampleRate);
    }
}
