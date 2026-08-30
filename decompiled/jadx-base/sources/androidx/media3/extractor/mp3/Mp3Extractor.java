package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
public final class Mp3Extractor implements androidx.media3.extractor.Extractor {
    public static final int FLAG_DISABLE_ID3_METADATA = 8;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 4;
    private static final int MAX_SNIFF_BYTES = 32768;
    private static final int MAX_SYNC_BYTES = 131072;
    private static final int MPEG_AUDIO_HEADER_MASK = -128000;
    private static final int SCRATCH_LENGTH = 10;
    private static final int SEEK_HEADER_INFO = 1231971951;
    private static final int SEEK_HEADER_UNSET = 0;
    private static final int SEEK_HEADER_VBRI = 1447187017;
    private static final int SEEK_HEADER_XING = 1483304551;
    private static final java.lang.String TAG = "Mp3Extractor";
    private long basisTimeUs;
    private androidx.media3.extractor.TrackOutput currentTrackOutput;
    private boolean disableSeeking;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final androidx.media3.extractor.GaplessInfoHolder gaplessInfoHolder;
    private final androidx.media3.extractor.Id3Peeker id3Peeker;
    private boolean isSeekInProgress;
    private androidx.media3.common.Metadata metadata;
    private androidx.media3.extractor.TrackOutput realTrackOutput;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final androidx.media3.common.util.ParsableByteArray scratch;
    private long seekTimeUs;
    private androidx.media3.extractor.mp3.Seeker seeker;
    private final androidx.media3.extractor.TrackOutput skippingTrackOutput;
    private final androidx.media3.extractor.MpegAudioUtil.Header synchronizedHeader;
    private int synchronizedHeaderData;
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.mp3.Mp3Extractor.lambda$static$0();
        }
    };
    private static final androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate REQUIRED_ID3_FRAME_PREDICATE = new androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return androidx.media3.extractor.mp3.Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
        }
    };

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static boolean headersMatch(int i, long j) {
        return ((long) (i & MPEG_AUDIO_HEADER_MASK)) == (j & (-128000));
    }

    static /* synthetic */ boolean lambda$static$1(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.mp3.Mp3Extractor()};
    }

    public Mp3Extractor() {
        this(0);
    }

    public Mp3Extractor(int i) {
        this(i, androidx.media3.common.C.TIME_UNSET);
    }

    public Mp3Extractor(int i, long j) {
        this.flags = (i & 2) != 0 ? i | 1 : i;
        this.forcedFirstSampleTimestampUs = j;
        this.scratch = new androidx.media3.common.util.ParsableByteArray(10);
        this.synchronizedHeader = new androidx.media3.extractor.MpegAudioUtil.Header();
        this.gaplessInfoHolder = new androidx.media3.extractor.GaplessInfoHolder();
        this.basisTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.id3Peeker = new androidx.media3.extractor.Id3Peeker();
        androidx.media3.extractor.DiscardingTrackOutput discardingTrackOutput = new androidx.media3.extractor.DiscardingTrackOutput();
        this.skippingTrackOutput = discardingTrackOutput;
        this.currentTrackOutput = discardingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return synchronize(extractorInput, true);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        androidx.media3.extractor.TrackOutput trackOutputTrack = extractorOutput.track(0, 1);
        this.realTrackOutput = trackOutputTrack;
        this.currentTrackOutput = trackOutputTrack;
        this.extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
        this.seekTimeUs = j2;
        androidx.media3.extractor.mp3.Seeker seeker = this.seeker;
        if (!(seeker instanceof androidx.media3.extractor.mp3.IndexSeeker) || ((androidx.media3.extractor.mp3.IndexSeeker) seeker).isTimeUsInIndex(j2)) {
            return;
        }
        this.isSeekInProgress = true;
        this.currentTrackOutput = this.skippingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        assertInitialized();
        int internal = readInternal(extractorInput);
        if (internal == -1 && (this.seeker instanceof androidx.media3.extractor.mp3.IndexSeeker)) {
            long jComputeTimeUs = computeTimeUs(this.samplesRead);
            if (this.seeker.getDurationUs() != jComputeTimeUs) {
                ((androidx.media3.extractor.mp3.IndexSeeker) this.seeker).setDurationUs(jComputeTimeUs);
                this.extractorOutput.seekMap(this.seeker);
            }
        }
        return internal;
    }

    public void disableSeeking() {
        this.disableSeeking = true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int readInternal(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (this.synchronizedHeaderData == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        if (this.seeker == null) {
            androidx.media3.extractor.mp3.Seeker seekerComputeSeeker = computeSeeker(extractorInput);
            this.seeker = seekerComputeSeeker;
            this.extractorOutput.seekMap(seekerComputeSeeker);
            androidx.media3.common.Format.Builder metadata = new androidx.media3.common.Format.Builder().setSampleMimeType(this.synchronizedHeader.mimeType).setMaxInputSize(4096).setChannelCount(this.synchronizedHeader.channels).setSampleRate(this.synchronizedHeader.sampleRate).setEncoderDelay(this.gaplessInfoHolder.encoderDelay).setEncoderPadding(this.gaplessInfoHolder.encoderPadding).setMetadata((this.flags & 8) != 0 ? null : this.metadata);
            if (this.seeker.getAverageBitrate() != -2147483647) {
                metadata.setAverageBitrate(this.seeker.getAverageBitrate());
            }
            this.currentTrackOutput.format(metadata.build());
            this.firstSamplePosition = extractorInput.getPosition();
        } else if (this.firstSamplePosition != 0) {
            long position = extractorInput.getPosition();
            long j = this.firstSamplePosition;
            if (position < j) {
                extractorInput.skipFully((int) (j - position));
            }
        }
        return readSample(extractorInput);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"realTrackOutput", "seeker"})
    private int readSample(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (peekEndOfStreamOrHeader(extractorInput)) {
                return -1;
            }
            this.scratch.setPosition(0);
            int i = this.scratch.readInt();
            if (!headersMatch(i, this.synchronizedHeaderData) || androidx.media3.extractor.MpegAudioUtil.getFrameSize(i) == -1) {
                extractorInput.skipFully(1);
                this.synchronizedHeaderData = 0;
                return 0;
            }
            this.synchronizedHeader.setForHeaderData(i);
            if (this.basisTimeUs == androidx.media3.common.C.TIME_UNSET) {
                this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                if (this.forcedFirstSampleTimestampUs != androidx.media3.common.C.TIME_UNSET) {
                    this.basisTimeUs += this.forcedFirstSampleTimestampUs - this.seeker.getTimeUs(0L);
                }
            }
            this.sampleBytesRemaining = this.synchronizedHeader.frameSize;
            androidx.media3.extractor.mp3.Seeker seeker = this.seeker;
            if (seeker instanceof androidx.media3.extractor.mp3.IndexSeeker) {
                androidx.media3.extractor.mp3.IndexSeeker indexSeeker = (androidx.media3.extractor.mp3.IndexSeeker) seeker;
                indexSeeker.maybeAddSeekPoint(computeTimeUs(this.samplesRead + ((long) this.synchronizedHeader.samplesPerFrame)), extractorInput.getPosition() + ((long) this.synchronizedHeader.frameSize));
                if (this.isSeekInProgress && indexSeeker.isTimeUsInIndex(this.seekTimeUs)) {
                    this.isSeekInProgress = false;
                    this.currentTrackOutput = this.realTrackOutput;
                }
            }
        }
        int iSampleData = this.currentTrackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, this.sampleBytesRemaining, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i2 = this.sampleBytesRemaining - iSampleData;
        this.sampleBytesRemaining = i2;
        if (i2 > 0) {
            return 0;
        }
        this.currentTrackOutput.sampleMetadata(computeTimeUs(this.samplesRead), 1, this.synchronizedHeader.frameSize, 0, null);
        this.samplesRead += (long) this.synchronizedHeader.samplesPerFrame;
        this.sampleBytesRemaining = 0;
        return 0;
    }

    private long computeTimeUs(long j) {
        return this.basisTimeUs + ((j * 1000000) / ((long) this.synchronizedHeader.sampleRate));
    }

    private boolean synchronize(androidx.media3.extractor.ExtractorInput extractorInput, boolean z) throws java.io.IOException {
        int peekPosition;
        int i;
        int frameSize;
        int i2 = z ? 32768 : 131072;
        extractorInput.resetPeekPosition();
        if (extractorInput.getPosition() == 0) {
            androidx.media3.common.Metadata metadataPeekId3Data = this.id3Peeker.peekId3Data(extractorInput, (this.flags & 8) == 0 ? null : REQUIRED_ID3_FRAME_PREDICATE);
            this.metadata = metadataPeekId3Data;
            if (metadataPeekId3Data != null) {
                this.gaplessInfoHolder.setFromMetadata(metadataPeekId3Data);
            }
            peekPosition = (int) extractorInput.getPeekPosition();
            if (!z) {
                extractorInput.skipFully(peekPosition);
            }
            i = 0;
        } else {
            peekPosition = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (peekEndOfStreamOrHeader(extractorInput)) {
                if (i3 > 0) {
                    break;
                }
                throw new java.io.EOFException();
            }
            this.scratch.setPosition(0);
            int i5 = this.scratch.readInt();
            if ((i == 0 || headersMatch(i5, i)) && (frameSize = androidx.media3.extractor.MpegAudioUtil.getFrameSize(i5)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.synchronizedHeader.setForHeaderData(i5);
                    i = i5;
                }
                extractorInput.advancePeekPosition(frameSize - 4);
            } else {
                int i6 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Searched too many bytes.", null);
                }
                if (z) {
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(peekPosition + i6);
                } else {
                    extractorInput.skipFully(1);
                }
                i3 = 0;
                i4 = i6;
                i = 0;
            }
        }
        if (z) {
            extractorInput.skipFully(peekPosition + i4);
        } else {
            extractorInput.resetPeekPosition();
        }
        this.synchronizedHeaderData = i;
        return true;
    }

    private boolean peekEndOfStreamOrHeader(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.mp3.Seeker seeker = this.seeker;
        if (seeker != null) {
            long dataEndPosition = seeker.getDataEndPosition();
            if (dataEndPosition != -1 && extractorInput.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.peekFully(this.scratch.getData(), 0, 4, true);
        } catch (java.io.EOFException unused) {
            return true;
        }
    }

    private androidx.media3.extractor.mp3.Seeker computeSeeker(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        long id3TlenUs;
        long dataEndPosition;
        androidx.media3.extractor.mp3.Seeker seekerMaybeReadSeekFrame = maybeReadSeekFrame(extractorInput);
        androidx.media3.extractor.mp3.MlltSeeker mlltSeekerMaybeHandleSeekMetadata = maybeHandleSeekMetadata(this.metadata, extractorInput.getPosition());
        if (this.disableSeeking) {
            return new androidx.media3.extractor.mp3.Seeker.UnseekableSeeker();
        }
        if ((this.flags & 4) != 0) {
            if (mlltSeekerMaybeHandleSeekMetadata != null) {
                id3TlenUs = mlltSeekerMaybeHandleSeekMetadata.getDurationUs();
                dataEndPosition = mlltSeekerMaybeHandleSeekMetadata.getDataEndPosition();
            } else if (seekerMaybeReadSeekFrame != null) {
                id3TlenUs = seekerMaybeReadSeekFrame.getDurationUs();
                dataEndPosition = seekerMaybeReadSeekFrame.getDataEndPosition();
            } else {
                id3TlenUs = getId3TlenUs(this.metadata);
                dataEndPosition = -1;
            }
            seekerMaybeReadSeekFrame = new androidx.media3.extractor.mp3.IndexSeeker(id3TlenUs, extractorInput.getPosition(), dataEndPosition);
        } else if (mlltSeekerMaybeHandleSeekMetadata != null) {
            seekerMaybeReadSeekFrame = mlltSeekerMaybeHandleSeekMetadata;
        } else if (seekerMaybeReadSeekFrame == null) {
            seekerMaybeReadSeekFrame = null;
        }
        if (seekerMaybeReadSeekFrame == null || !(seekerMaybeReadSeekFrame.isSeekable() || (this.flags & 1) == 0)) {
            return getConstantBitrateSeeker(extractorInput, (this.flags & 2) != 0);
        }
        return seekerMaybeReadSeekFrame;
    }

    private androidx.media3.extractor.mp3.Seeker maybeReadSeekFrame(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(this.synchronizedHeader.frameSize);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.synchronizedHeader.frameSize);
        int i = 21;
        if ((this.synchronizedHeader.version & 1) != 0) {
            if (this.synchronizedHeader.channels != 1) {
                i = 36;
            }
        } else if (this.synchronizedHeader.channels == 1) {
            i = 13;
        }
        int seekFrameHeader = getSeekFrameHeader(parsableByteArray, i);
        if (seekFrameHeader != SEEK_HEADER_INFO) {
            if (seekFrameHeader == SEEK_HEADER_VBRI) {
                androidx.media3.extractor.mp3.VbriSeeker vbriSeekerCreate = androidx.media3.extractor.mp3.VbriSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
                extractorInput.skipFully(this.synchronizedHeader.frameSize);
                return vbriSeekerCreate;
            }
            if (seekFrameHeader != SEEK_HEADER_XING) {
                extractorInput.resetPeekPosition();
                return null;
            }
        }
        androidx.media3.extractor.mp3.XingFrame xingFrame = androidx.media3.extractor.mp3.XingFrame.parse(this.synchronizedHeader, parsableByteArray);
        if (!this.gaplessInfoHolder.hasGaplessInfo() && xingFrame.encoderDelay != -1 && xingFrame.encoderPadding != -1) {
            this.gaplessInfoHolder.encoderDelay = xingFrame.encoderDelay;
            this.gaplessInfoHolder.encoderPadding = xingFrame.encoderPadding;
        }
        long position = extractorInput.getPosition();
        if (extractorInput.getLength() != -1 && xingFrame.dataSize != -1 && extractorInput.getLength() != xingFrame.dataSize + position) {
            androidx.media3.common.util.Log.i(TAG, "Data size mismatch between stream (" + extractorInput.getLength() + ") and Xing frame (" + (xingFrame.dataSize + position) + "), using Xing value.");
        }
        extractorInput.skipFully(this.synchronizedHeader.frameSize);
        if (seekFrameHeader == SEEK_HEADER_XING) {
            return androidx.media3.extractor.mp3.XingSeeker.create(xingFrame, position);
        }
        return getConstantBitrateSeeker(position, xingFrame, extractorInput.getLength());
    }

    private androidx.media3.extractor.mp3.Seeker getConstantBitrateSeeker(androidx.media3.extractor.ExtractorInput extractorInput, boolean z) throws java.io.IOException {
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        this.synchronizedHeader.setForHeaderData(this.scratch.readInt());
        return new androidx.media3.extractor.mp3.ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, z);
    }

    private androidx.media3.extractor.mp3.Seeker getConstantBitrateSeeker(long j, androidx.media3.extractor.mp3.XingFrame xingFrame, long j2) {
        long j3;
        long j4;
        long jComputeDurationUs = xingFrame.computeDurationUs();
        if (jComputeDurationUs == androidx.media3.common.C.TIME_UNSET) {
            return null;
        }
        if (xingFrame.dataSize != -1) {
            long j5 = j + xingFrame.dataSize;
            j3 = xingFrame.dataSize - ((long) xingFrame.header.frameSize);
            j4 = j5;
        } else {
            if (j2 == -1) {
                return null;
            }
            j3 = (j2 - j) - ((long) xingFrame.header.frameSize);
            j4 = j2;
        }
        long j6 = j3;
        return new androidx.media3.extractor.mp3.ConstantBitrateSeeker(j4, j + ((long) xingFrame.header.frameSize), com.google.common.primitives.Ints.checkedCast(androidx.media3.common.util.Util.scaleLargeValue(j6, 8000000L, jComputeDurationUs, java.math.RoundingMode.HALF_UP)), com.google.common.primitives.Ints.checkedCast(com.google.common.math.LongMath.divide(j6, xingFrame.frameCount, java.math.RoundingMode.HALF_UP)), false);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void assertInitialized() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.realTrackOutput);
        androidx.media3.common.util.Util.castNonNull(this.extractorOutput);
    }

    private static int getSeekFrameHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        if (parsableByteArray.limit() >= i + 4) {
            parsableByteArray.setPosition(i);
            int i2 = parsableByteArray.readInt();
            if (i2 == SEEK_HEADER_XING || i2 == SEEK_HEADER_INFO) {
                return i2;
            }
        }
        if (parsableByteArray.limit() < 40) {
            return 0;
        }
        parsableByteArray.setPosition(36);
        if (parsableByteArray.readInt() == SEEK_HEADER_VBRI) {
            return SEEK_HEADER_VBRI;
        }
        return 0;
    }

    private static androidx.media3.extractor.mp3.MlltSeeker maybeHandleSeekMetadata(androidx.media3.common.Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            androidx.media3.common.Metadata.Entry entry = metadata.get(i);
            if (entry instanceof androidx.media3.extractor.metadata.id3.MlltFrame) {
                return androidx.media3.extractor.mp3.MlltSeeker.create(j, (androidx.media3.extractor.metadata.id3.MlltFrame) entry, getId3TlenUs(metadata));
            }
        }
        return null;
    }

    private static long getId3TlenUs(androidx.media3.common.Metadata metadata) {
        if (metadata == null) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            androidx.media3.common.Metadata.Entry entry = metadata.get(i);
            if (entry instanceof androidx.media3.extractor.metadata.id3.TextInformationFrame) {
                androidx.media3.extractor.metadata.id3.TextInformationFrame textInformationFrame = (androidx.media3.extractor.metadata.id3.TextInformationFrame) entry;
                if (textInformationFrame.id.equals("TLEN")) {
                    return androidx.media3.common.util.Util.msToUs(java.lang.Long.parseLong(textInformationFrame.values.get(0)));
                }
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }
}
