package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class DtsReader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private static final int CORE_HEADER_SIZE = 18;
    static final int EXTSS_HEADER_SIZE_MAX = 4096;
    static final int FTOC_MAX_HEADER_SIZE = 5408;
    private static final int STATE_FINDING_EXTSS_HEADER_SIZE = 2;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_FINDING_UHD_HEADER_SIZE = 4;
    private static final int STATE_READING_CORE_HEADER = 1;
    private static final int STATE_READING_EXTSS_HEADER = 3;
    private static final int STATE_READING_SAMPLE = 6;
    private static final int STATE_READING_UHD_HEADER = 5;
    private int bytesRead;
    private androidx.media3.common.Format format;
    private java.lang.String formatId;
    private int frameType;
    private final androidx.media3.common.util.ParsableByteArray headerScratchBytes;
    private final java.lang.String language;
    private androidx.media3.extractor.TrackOutput output;
    private final int roleFlags;
    private long sampleDurationUs;
    private int sampleSize;
    private int syncBytes;
    private int state = 0;
    private long timeUs = androidx.media3.common.C.TIME_UNSET;
    private final java.util.concurrent.atomic.AtomicInteger uhdAudioChunkId = new java.util.concurrent.atomic.AtomicInteger();
    private int extensionSubstreamHeaderSize = -1;
    private int uhdHeaderSize = -1;

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
    }

    public DtsReader(java.lang.String str, int i, int i2) {
        this.headerScratchBytes = new androidx.media3.common.util.ParsableByteArray(new byte[i2]);
        this.language = str;
        this.roleFlags = i;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.syncBytes = 0;
        this.timeUs = androidx.media3.common.C.TIME_UNSET;
        this.uhdAudioChunkId.set(0);
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
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            switch (this.state) {
                case 0:
                    if (skipToNextSyncWord(parsableByteArray)) {
                        int i = this.frameType;
                        if (i == 3 || i == 4) {
                            this.state = 4;
                        } else if (i == 1) {
                            this.state = 1;
                        } else {
                            this.state = 2;
                        }
                    }
                    break;
                case 1:
                    if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 18)) {
                        parseCoreHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, 18);
                        this.state = 6;
                    }
                    break;
                case 2:
                    if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 7)) {
                        this.extensionSubstreamHeaderSize = androidx.media3.extractor.DtsUtil.parseDtsHdHeaderSize(this.headerScratchBytes.getData());
                        this.state = 3;
                    }
                    break;
                case 3:
                    if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), this.extensionSubstreamHeaderSize)) {
                        parseExtensionSubstreamHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, this.extensionSubstreamHeaderSize);
                        this.state = 6;
                    }
                    break;
                case 4:
                    if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 6)) {
                        int dtsUhdHeaderSize = androidx.media3.extractor.DtsUtil.parseDtsUhdHeaderSize(this.headerScratchBytes.getData());
                        this.uhdHeaderSize = dtsUhdHeaderSize;
                        int i2 = this.bytesRead;
                        if (i2 > dtsUhdHeaderSize) {
                            int i3 = i2 - dtsUhdHeaderSize;
                            this.bytesRead = i2 - i3;
                            parsableByteArray.setPosition(parsableByteArray.getPosition() - i3);
                        }
                        this.state = 5;
                    }
                    break;
                case 5:
                    if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), this.uhdHeaderSize)) {
                        parseUhdHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, this.uhdHeaderSize);
                        this.state = 6;
                    }
                    break;
                case 6:
                    int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    this.output.sampleData(parsableByteArray, iMin);
                    int i4 = this.bytesRead + iMin;
                    this.bytesRead = i4;
                    if (i4 == this.sampleSize) {
                        androidx.media3.common.util.Assertions.checkState(this.timeUs != androidx.media3.common.C.TIME_UNSET);
                        this.output.sampleMetadata(this.timeUs, this.frameType == 4 ? 0 : 1, this.sampleSize, 0, null);
                        this.timeUs += this.sampleDurationUs;
                        this.state = 0;
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException();
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

    private boolean skipToNextSyncWord(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.syncBytes << 8;
            this.syncBytes = i;
            int unsignedByte = i | parsableByteArray.readUnsignedByte();
            this.syncBytes = unsignedByte;
            int frameType = androidx.media3.extractor.DtsUtil.getFrameType(unsignedByte);
            this.frameType = frameType;
            if (frameType != 0) {
                byte[] data = this.headerScratchBytes.getData();
                int i2 = this.syncBytes;
                data[0] = (byte) ((i2 >> 24) & 255);
                data[1] = (byte) ((i2 >> 16) & 255);
                data[2] = (byte) ((i2 >> 8) & 255);
                data[3] = (byte) (i2 & 255);
                this.bytesRead = 4;
                this.syncBytes = 0;
                return true;
            }
        }
        return false;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void parseCoreHeader() {
        byte[] data = this.headerScratchBytes.getData();
        if (this.format == null) {
            androidx.media3.common.Format dtsFormat = androidx.media3.extractor.DtsUtil.parseDtsFormat(data, this.formatId, this.language, this.roleFlags, null);
            this.format = dtsFormat;
            this.output.format(dtsFormat);
        }
        this.sampleSize = androidx.media3.extractor.DtsUtil.getDtsFrameSize(data);
        this.sampleDurationUs = com.google.common.primitives.Ints.checkedCast(androidx.media3.common.util.Util.sampleCountToDurationUs(androidx.media3.extractor.DtsUtil.parseDtsAudioSampleCount(data), this.format.sampleRate));
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void parseExtensionSubstreamHeader() throws androidx.media3.common.ParserException {
        androidx.media3.extractor.DtsUtil.DtsHeader dtsHdHeader = androidx.media3.extractor.DtsUtil.parseDtsHdHeader(this.headerScratchBytes.getData());
        updateFormatWithDtsHeaderInfo(dtsHdHeader);
        this.sampleSize = dtsHdHeader.frameSize;
        this.sampleDurationUs = dtsHdHeader.frameDurationUs == androidx.media3.common.C.TIME_UNSET ? 0L : dtsHdHeader.frameDurationUs;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void parseUhdHeader() throws androidx.media3.common.ParserException {
        androidx.media3.extractor.DtsUtil.DtsHeader dtsUhdHeader = androidx.media3.extractor.DtsUtil.parseDtsUhdHeader(this.headerScratchBytes.getData(), this.uhdAudioChunkId);
        if (this.frameType == 3) {
            updateFormatWithDtsHeaderInfo(dtsUhdHeader);
        }
        this.sampleSize = dtsUhdHeader.frameSize;
        this.sampleDurationUs = dtsUhdHeader.frameDurationUs == androidx.media3.common.C.TIME_UNSET ? 0L : dtsUhdHeader.frameDurationUs;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void updateFormatWithDtsHeaderInfo(androidx.media3.extractor.DtsUtil.DtsHeader dtsHeader) {
        if (dtsHeader.sampleRate == -2147483647 || dtsHeader.channelCount == -1) {
            return;
        }
        if (this.format != null && dtsHeader.channelCount == this.format.channelCount && dtsHeader.sampleRate == this.format.sampleRate && androidx.media3.common.util.Util.areEqual(dtsHeader.mimeType, this.format.sampleMimeType)) {
            return;
        }
        androidx.media3.common.Format format = this.format;
        androidx.media3.common.Format formatBuild = (format == null ? new androidx.media3.common.Format.Builder() : format.buildUpon()).setId(this.formatId).setSampleMimeType(dtsHeader.mimeType).setChannelCount(dtsHeader.channelCount).setSampleRate(dtsHeader.sampleRate).setLanguage(this.language).setRoleFlags(this.roleFlags).build();
        this.format = formatBuild;
        this.output.format(formatBuild);
    }
}
