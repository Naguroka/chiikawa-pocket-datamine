package androidx.media3.extractor.wav;

/* JADX INFO: loaded from: classes.dex */
public final class WavExtractor implements androidx.media3.extractor.Extractor {
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.wav.WavExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.wav.WavExtractor.lambda$static$0();
        }
    };
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final java.lang.String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private androidx.media3.extractor.wav.WavExtractor.OutputWriter outputWriter;
    private androidx.media3.extractor.TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    private interface OutputWriter {
        void init(int i, long j) throws androidx.media3.common.ParserException;

        void reset(long j);

        boolean sampleData(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.wav.WavExtractor()};
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return androidx.media3.extractor.wav.WavHeaderReader.checkFileType(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.state = j == 0 ? 0 : 4;
        androidx.media3.extractor.wav.WavExtractor.OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j2);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        assertInitialized();
        int i = this.state;
        if (i == 0) {
            readFileType(extractorInput);
            return 0;
        }
        if (i == 1) {
            readRf64SampleDataSize(extractorInput);
            return 0;
        }
        if (i == 2) {
            readFormat(extractorInput);
            return 0;
        }
        if (i == 3) {
            skipToSampleData(extractorInput);
            return 0;
        }
        if (i == 4) {
            return readSampleData(extractorInput);
        }
        throw new java.lang.IllegalStateException();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.trackOutput);
        androidx.media3.common.util.Util.castNonNull(this.extractorOutput);
    }

    private void readFileType(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkState(extractorInput.getPosition() == 0);
        int i = this.dataStartPosition;
        if (i != -1) {
            extractorInput.skipFully(i);
            this.state = 4;
        } else {
            if (!androidx.media3.extractor.wav.WavHeaderReader.checkFileType(extractorInput)) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
            this.state = 1;
        }
    }

    private void readRf64SampleDataSize(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.rf64SampleDataSize = androidx.media3.extractor.wav.WavHeaderReader.readRf64SampleDataSize(extractorInput);
        this.state = 2;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "trackOutput"})
    private void readFormat(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.wav.WavFormat format = androidx.media3.extractor.wav.WavHeaderReader.readFormat(extractorInput);
        if (format.formatType == 17) {
            this.outputWriter = new androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, format);
        } else if (format.formatType == 6) {
            this.outputWriter = new androidx.media3.extractor.wav.WavExtractor.PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, androidx.media3.common.MimeTypes.AUDIO_ALAW, -1);
        } else if (format.formatType == 7) {
            this.outputWriter = new androidx.media3.extractor.wav.WavExtractor.PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, androidx.media3.common.MimeTypes.AUDIO_MLAW, -1);
        } else {
            int pcmEncodingForType = androidx.media3.extractor.WavUtil.getPcmEncodingForType(format.formatType, format.bitsPerSample);
            if (pcmEncodingForType == 0) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + format.formatType);
            }
            this.outputWriter = new androidx.media3.extractor.wav.WavExtractor.PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, androidx.media3.common.MimeTypes.AUDIO_RAW, pcmEncodingForType);
        }
        this.state = 3;
    }

    private void skipToSampleData(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        android.util.Pair<java.lang.Long, java.lang.Long> pairSkipToSampleData = androidx.media3.extractor.wav.WavHeaderReader.skipToSampleData(extractorInput);
        this.dataStartPosition = ((java.lang.Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((java.lang.Long) pairSkipToSampleData.second).longValue();
        long j = this.rf64SampleDataSize;
        if (j != -1 && jLongValue == androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
            jLongValue = j;
        }
        this.dataEndPosition = ((long) this.dataStartPosition) + jLongValue;
        long length = extractorInput.getLength();
        if (length != -1 && this.dataEndPosition > length) {
            androidx.media3.common.util.Log.w(TAG, "Data exceeds input length: " + this.dataEndPosition + ", " + length);
            this.dataEndPosition = length;
        }
        ((androidx.media3.extractor.wav.WavExtractor.OutputWriter) androidx.media3.common.util.Assertions.checkNotNull(this.outputWriter)).init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
    }

    private int readSampleData(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkState(this.dataEndPosition != -1);
        return ((androidx.media3.extractor.wav.WavExtractor.OutputWriter) androidx.media3.common.util.Assertions.checkNotNull(this.outputWriter)).sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    private static final class PassthroughOutputWriter implements androidx.media3.extractor.wav.WavExtractor.OutputWriter {
        private final androidx.media3.extractor.ExtractorOutput extractorOutput;
        private final androidx.media3.common.Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final androidx.media3.extractor.TrackOutput trackOutput;
        private final androidx.media3.extractor.wav.WavFormat wavFormat;

        public PassthroughOutputWriter(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.extractor.wav.WavFormat wavFormat, java.lang.String str, int i) throws androidx.media3.common.ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i2 = (wavFormat.numChannels * wavFormat.bitsPerSample) / 8;
            if (wavFormat.blockSize != i2) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Expected block size: " + i2 + "; got: " + wavFormat.blockSize, null);
            }
            int i3 = wavFormat.frameRateHz * i2 * 8;
            int iMax = java.lang.Math.max(i2, (wavFormat.frameRateHz * i2) / 10);
            this.targetSampleSizeBytes = iMax;
            this.format = new androidx.media3.common.Format.Builder().setSampleMimeType(str).setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(iMax).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(i).build();
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j) {
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int i, long j) {
            this.extractorOutput.seekMap(new androidx.media3.extractor.wav.WavSeekMap(this.wavFormat, 1, i, j));
            this.trackOutput.format(this.format);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.pendingOutputBytes) < (i2 = this.targetSampleSizeBytes)) {
                int iSampleData = this.trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, (int) java.lang.Math.min(i2 - i, j2), true);
                if (iSampleData == -1) {
                    j2 = 0;
                } else {
                    this.pendingOutputBytes += iSampleData;
                    j2 -= (long) iSampleData;
                }
            }
            int i3 = this.wavFormat.blockSize;
            int i4 = this.pendingOutputBytes / i3;
            if (i4 > 0) {
                long jScaleLargeTimestamp = this.startTimeUs + androidx.media3.common.util.Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
                int i5 = i4 * i3;
                int i6 = this.pendingOutputBytes - i5;
                this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, i5, i6, null);
                this.outputFrameCount += (long) i4;
                this.pendingOutputBytes = i6;
            }
            return j2 <= 0;
        }
    }

    private static final class ImaAdPcmOutputWriter implements androidx.media3.extractor.wav.WavExtractor.OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, org.objectweb.asm.Opcodes.D2L, 157, org.objectweb.asm.Opcodes.LRETURN, org.objectweb.asm.Opcodes.ARRAYLENGTH, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final androidx.media3.common.util.ParsableByteArray decodedData;
        private final androidx.media3.extractor.ExtractorOutput extractorOutput;
        private final androidx.media3.common.Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final androidx.media3.extractor.TrackOutput trackOutput;
        private final androidx.media3.extractor.wav.WavFormat wavFormat;

        private static int numOutputFramesToBytes(int i, int i2) {
            return i * 2 * i2;
        }

        public ImaAdPcmOutputWriter(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.extractor.wav.WavFormat wavFormat) throws androidx.media3.common.ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int iMax = java.lang.Math.max(1, wavFormat.frameRateHz / 10);
            this.targetSampleSizeFrames = iMax;
            androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(wavFormat.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = littleEndianUnsignedShort;
            int i = wavFormat.numChannels;
            int i2 = (((wavFormat.blockSize - (i * 4)) * 8) / (wavFormat.bitsPerSample * i)) + 1;
            if (littleEndianUnsignedShort != i2) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Expected frames per block: " + i2 + "; got: " + littleEndianUnsignedShort, null);
            }
            int iCeilDivide = androidx.media3.common.util.Util.ceilDivide(iMax, littleEndianUnsignedShort);
            this.inputData = new byte[wavFormat.blockSize * iCeilDivide];
            this.decodedData = new androidx.media3.common.util.ParsableByteArray(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i));
            int i3 = ((wavFormat.frameRateHz * wavFormat.blockSize) * 8) / littleEndianUnsignedShort;
            this.format = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_RAW).setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(numOutputFramesToBytes(iMax, i)).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(2).build();
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int i, long j) {
            this.extractorOutput.seekMap(new androidx.media3.extractor.wav.WavSeekMap(this.wavFormat, this.framesPerBlock, i, j));
            this.trackOutput.format(this.format);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(androidx.media3.extractor.ExtractorInput r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.targetSampleSizeFrames
                int r1 = r6.pendingOutputBytes
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.framesPerBlock
                int r0 = androidx.media3.common.util.Util.ceilDivide(r0, r1)
                androidx.media3.extractor.wav.WavFormat r1 = r6.wavFormat
                int r1 = r1.blockSize
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.pendingInputBytes
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.inputData
                int r5 = r6.pendingInputBytes
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.pendingInputBytes
                int r4 = r4 + r3
                r6.pendingInputBytes = r4
                goto L1e
            L3e:
                int r7 = r6.pendingInputBytes
                androidx.media3.extractor.wav.WavFormat r8 = r6.wavFormat
                int r8 = r8.blockSize
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.inputData
                androidx.media3.common.util.ParsableByteArray r9 = r6.decodedData
                r6.decode(r8, r7, r9)
                int r8 = r6.pendingInputBytes
                androidx.media3.extractor.wav.WavFormat r9 = r6.wavFormat
                int r9 = r9.blockSize
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.pendingInputBytes = r8
                androidx.media3.common.util.ParsableByteArray r7 = r6.decodedData
                int r7 = r7.limit()
                androidx.media3.extractor.TrackOutput r8 = r6.trackOutput
                androidx.media3.common.util.ParsableByteArray r9 = r6.decodedData
                r8.sampleData(r9, r7)
                int r8 = r6.pendingOutputBytes
                int r8 = r8 + r7
                r6.pendingOutputBytes = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.targetSampleSizeFrames
                if (r7 < r8) goto L75
                r6.writeSampleMetadata(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.pendingOutputBytes
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L82
                r6.writeSampleMetadata(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.sampleData(androidx.media3.extractor.ExtractorInput, long):boolean");
        }

        private void writeSampleMetadata(int i) {
            long jScaleLargeTimestamp = this.startTimeUs + androidx.media3.common.util.Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
            int iNumOutputFramesToBytes = numOutputFramesToBytes(i);
            this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.pendingOutputBytes - iNumOutputFramesToBytes, null);
            this.outputFrameCount += (long) i;
            this.pendingOutputBytes -= iNumOutputFramesToBytes;
        }

        private void decode(byte[] bArr, int i, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.wavFormat.numChannels; i3++) {
                    decodeBlockForChannel(bArr, i2, i3, parsableByteArray.getData());
                }
            }
            int iNumOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(iNumOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3 = this.wavFormat.blockSize;
            int i4 = this.wavFormat.numChannels;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iConstrainValue = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = java.lang.Math.min(bArr[i5 + 2] & 255, 88);
            int i8 = STEP_TABLE[iMin];
            int i9 = ((i * this.framesPerBlock * i4) + i2) * 2;
            bArr2[i9] = (byte) (iConstrainValue & 255);
            bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                int i11 = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)] & 255;
                int i12 = i10 % 2 == 0 ? i11 & 15 : i11 >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i8) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                iConstrainValue = androidx.media3.common.util.Util.constrainValue(iConstrainValue + i13, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iConstrainValue & 255);
                bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
                int i14 = iMin + INDEX_TABLE[i12];
                int[] iArr = STEP_TABLE;
                iMin = androidx.media3.common.util.Util.constrainValue(i14, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        private int numOutputBytesToFrames(int i) {
            return i / (this.wavFormat.numChannels * 2);
        }

        private int numOutputFramesToBytes(int i) {
            return numOutputFramesToBytes(i, this.wavFormat.numChannels);
        }
    }
}
