package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class TsExtractor implements androidx.media3.extractor.Extractor {
    private static final long AC3_FORMAT_IDENTIFIER = 1094921523;
    private static final long AC4_FORMAT_IDENTIFIER = 1094921524;
    private static final int BUFFER_SIZE = 9400;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    private static final long E_AC3_FORMAT_IDENTIFIER = 1161904947;

    @java.lang.Deprecated
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.ts.TsExtractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.ts.TsExtractor.lambda$static$1();
        }
    };
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 1;
    private static final long HEVC_FORMAT_IDENTIFIER = 1212503619;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    public static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DC2_H262 = 128;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DTS_HD = 136;
    public static final int TS_STREAM_TYPE_DTS_UHD = 139;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MHAS = 45;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final android.util.SparseIntArray continuityCounters;
    private final androidx.media3.extractor.ts.TsDurationReader durationReader;
    private final int extractorFlags;
    private boolean hasOutputSeekMap;
    private androidx.media3.extractor.ts.TsPayloadReader id3Reader;
    private final int mode;
    private androidx.media3.extractor.ExtractorOutput output;
    private final androidx.media3.extractor.ts.TsPayloadReader.Factory payloadReaderFactory;
    private int pcrPid;
    private boolean pendingSeekToStart;
    private int remainingPmts;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private final java.util.List<androidx.media3.common.util.TimestampAdjuster> timestampAdjusters;
    private final int timestampSearchBytes;
    private final android.util.SparseBooleanArray trackIds;
    private final android.util.SparseBooleanArray trackPids;
    private boolean tracksEnded;
    private androidx.media3.extractor.ts.TsBinarySearchSeeker tsBinarySearchSeeker;
    private final androidx.media3.common.util.ParsableByteArray tsPacketBuffer;
    private final android.util.SparseArray<androidx.media3.extractor.ts.TsPayloadReader> tsPayloadReaders;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ int access$108(androidx.media3.extractor.ts.TsExtractor tsExtractor) {
        int i = tsExtractor.remainingPmts;
        tsExtractor.remainingPmts = i + 1;
        return i;
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$newFactory$0(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.ts.TsExtractor(factory)};
    }

    public static androidx.media3.extractor.ExtractorsFactory newFactory(final androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.ts.TsExtractor$$ExternalSyntheticLambda0
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final androidx.media3.extractor.Extractor[] createExtractors() {
                return androidx.media3.extractor.ts.TsExtractor.lambda$newFactory$0(factory);
            }
        };
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$1() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.ts.TsExtractor(1, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED)};
    }

    @java.lang.Deprecated
    public TsExtractor() {
        this(1, 1, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, new androidx.media3.common.util.TimestampAdjuster(0L), new androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public TsExtractor(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this(1, 0, factory, new androidx.media3.common.util.TimestampAdjuster(0L), new androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public TsExtractor(int i, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this(1, i, factory, new androidx.media3.common.util.TimestampAdjuster(0L), new androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory(0), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @java.lang.Deprecated
    public TsExtractor(int i) {
        this(1, 1, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, new androidx.media3.common.util.TimestampAdjuster(0L), new androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory(i), DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @java.lang.Deprecated
    public TsExtractor(int i, int i2, int i3) {
        this(i, 1, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, new androidx.media3.common.util.TimestampAdjuster(0L), new androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory(i2), i3);
    }

    @java.lang.Deprecated
    public TsExtractor(int i, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ts.TsPayloadReader.Factory factory) {
        this(i, 1, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, timestampAdjuster, factory, DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    @java.lang.Deprecated
    public TsExtractor(int i, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ts.TsPayloadReader.Factory factory, int i2) {
        this(i, 1, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, timestampAdjuster, factory, i2);
    }

    public TsExtractor(int i, int i2, androidx.media3.extractor.text.SubtitleParser.Factory factory, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ts.TsPayloadReader.Factory factory2, int i3) {
        this.payloadReaderFactory = (androidx.media3.extractor.ts.TsPayloadReader.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory2);
        this.timestampSearchBytes = i3;
        this.mode = i;
        this.extractorFlags = i2;
        this.subtitleParserFactory = factory;
        if (i == 1 || i == 2) {
            this.timestampAdjusters = java.util.Collections.singletonList(timestampAdjuster);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.timestampAdjusters = arrayList;
            arrayList.add(timestampAdjuster);
        }
        this.tsPacketBuffer = new androidx.media3.common.util.ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new android.util.SparseBooleanArray();
        this.trackPids = new android.util.SparseBooleanArray();
        this.tsPayloadReaders = new android.util.SparseArray<>();
        this.continuityCounters = new android.util.SparseIntArray();
        this.durationReader = new androidx.media3.extractor.ts.TsDurationReader(i3);
        this.output = androidx.media3.extractor.ExtractorOutput.PLACEHOLDER;
        this.pcrPid = -1;
        resetPayloadReaders();
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        boolean z;
        byte[] data = this.tsPacketBuffer.getData();
        extractorInput.peekFully(data, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                }
                if (data[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                extractorInput.skipFully(i);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        if ((this.extractorFlags & 1) == 0) {
            extractorOutput = new androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        androidx.media3.extractor.ts.TsBinarySearchSeeker tsBinarySearchSeeker;
        androidx.media3.common.util.Assertions.checkState(this.mode != 2);
        int size = this.timestampAdjusters.size();
        for (int i = 0; i < size; i++) {
            androidx.media3.common.util.TimestampAdjuster timestampAdjuster = this.timestampAdjusters.get(i);
            boolean z = timestampAdjuster.getTimestampOffsetUs() == androidx.media3.common.C.TIME_UNSET;
            if (!z) {
                long firstSampleTimestampUs = timestampAdjuster.getFirstSampleTimestampUs();
                z = (firstSampleTimestampUs == androidx.media3.common.C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j2) ? false : true;
            }
            if (z) {
                timestampAdjuster.reset(j2);
            }
        }
        if (j2 != 0 && (tsBinarySearchSeeker = this.tsBinarySearchSeeker) != null) {
            tsBinarySearchSeeker.setSeekTargetUs(j2);
        }
        this.tsPacketBuffer.reset(0);
        this.continuityCounters.clear();
        for (int i2 = 0; i2 < this.tsPayloadReaders.size(); i2++) {
            this.tsPayloadReaders.valueAt(i2).seek();
        }
        this.bytesSinceLastSync = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        long length = extractorInput.getLength();
        boolean z = this.mode == 2;
        if (this.tracksEnded) {
            if (((length == -1 || z) ? false : true) && !this.durationReader.isDurationReadFinished()) {
                return this.durationReader.readDuration(extractorInput, positionHolder, this.pcrPid);
            }
            maybeOutputSeekMap(length);
            if (this.pendingSeekToStart) {
                this.pendingSeekToStart = false;
                seek(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    positionHolder.position = 0L;
                    return 1;
                }
            }
            androidx.media3.extractor.ts.TsBinarySearchSeeker tsBinarySearchSeeker = this.tsBinarySearchSeeker;
            if (tsBinarySearchSeeker != null && tsBinarySearchSeeker.isSeeking()) {
                return this.tsBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
            }
        }
        if (!fillBufferWithAtLeastOnePacket(extractorInput)) {
            for (int i = 0; i < this.tsPayloadReaders.size(); i++) {
                androidx.media3.extractor.ts.TsPayloadReader tsPayloadReaderValueAt = this.tsPayloadReaders.valueAt(i);
                if (tsPayloadReaderValueAt instanceof androidx.media3.extractor.ts.PesReader) {
                    androidx.media3.extractor.ts.PesReader pesReader = (androidx.media3.extractor.ts.PesReader) tsPayloadReaderValueAt;
                    if (pesReader.canConsumeSynthesizedEmptyPusi(z)) {
                        pesReader.consume(new androidx.media3.common.util.ParsableByteArray(), 1);
                    }
                }
            }
            return -1;
        }
        int iFindEndOfFirstTsPacketInBuffer = findEndOfFirstTsPacketInBuffer();
        int iLimit = this.tsPacketBuffer.limit();
        if (iFindEndOfFirstTsPacketInBuffer > iLimit) {
            return 0;
        }
        int i2 = this.tsPacketBuffer.readInt();
        if ((8388608 & i2) != 0) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        int i3 = ((4194304 & i2) != 0 ? 1 : 0) | 0;
        int i4 = (2096896 & i2) >> 8;
        boolean z2 = (i2 & 32) != 0;
        androidx.media3.extractor.ts.TsPayloadReader tsPayloadReader = (i2 & 16) != 0 ? this.tsPayloadReaders.get(i4) : null;
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        if (this.mode != 2) {
            int i5 = i2 & 15;
            int i6 = this.continuityCounters.get(i4, i5 - 1);
            this.continuityCounters.put(i4, i5);
            if (i6 == i5) {
                this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
                return 0;
            }
            if (i5 != ((i6 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        }
        if (z2) {
            int unsignedByte = this.tsPacketBuffer.readUnsignedByte();
            i3 |= (this.tsPacketBuffer.readUnsignedByte() & 64) != 0 ? 2 : 0;
            this.tsPacketBuffer.skipBytes(unsignedByte - 1);
        }
        boolean z3 = this.tracksEnded;
        if (shouldConsumePacketPayload(i4)) {
            this.tsPacketBuffer.setLimit(iFindEndOfFirstTsPacketInBuffer);
            tsPayloadReader.consume(this.tsPacketBuffer, i3);
            this.tsPacketBuffer.setLimit(iLimit);
        }
        if (this.mode != 2 && !z3 && this.tracksEnded && length != -1) {
            this.pendingSeekToStart = true;
        }
        this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
        return 0;
    }

    private void maybeOutputSeekMap(long j) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.getDurationUs() != androidx.media3.common.C.TIME_UNSET) {
            androidx.media3.extractor.ts.TsBinarySearchSeeker tsBinarySearchSeeker = new androidx.media3.extractor.ts.TsBinarySearchSeeker(this.durationReader.getPcrTimestampAdjuster(), this.durationReader.getDurationUs(), j, this.pcrPid, this.timestampSearchBytes);
            this.tsBinarySearchSeeker = tsBinarySearchSeeker;
            this.output.seekMap(tsBinarySearchSeeker.getSeekMap());
            return;
        }
        this.output.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(this.durationReader.getDurationUs()));
    }

    private boolean fillBufferWithAtLeastOnePacket(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        byte[] data = this.tsPacketBuffer.getData();
        if (9400 - this.tsPacketBuffer.getPosition() < 188) {
            int iBytesLeft = this.tsPacketBuffer.bytesLeft();
            if (iBytesLeft > 0) {
                java.lang.System.arraycopy(data, this.tsPacketBuffer.getPosition(), data, 0, iBytesLeft);
            }
            this.tsPacketBuffer.reset(data, iBytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < 188) {
            int iLimit = this.tsPacketBuffer.limit();
            int i = extractorInput.read(data, iLimit, 9400 - iLimit);
            if (i == -1) {
                return false;
            }
            this.tsPacketBuffer.setLimit(iLimit + i);
        }
        return true;
    }

    private int findEndOfFirstTsPacketInBuffer() throws androidx.media3.common.ParserException {
        int position = this.tsPacketBuffer.getPosition();
        int iLimit = this.tsPacketBuffer.limit();
        int iFindSyncBytePosition = androidx.media3.extractor.ts.TsUtil.findSyncBytePosition(this.tsPacketBuffer.getData(), position, iLimit);
        this.tsPacketBuffer.setPosition(iFindSyncBytePosition);
        int i = iFindSyncBytePosition + 188;
        if (i > iLimit) {
            int i2 = this.bytesSinceLastSync + (iFindSyncBytePosition - position);
            this.bytesSinceLastSync = i2;
            if (this.mode == 2 && i2 > 376) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.bytesSinceLastSync = 0;
        }
        return i;
    }

    private boolean shouldConsumePacketPayload(int i) {
        return this.mode == 2 || this.tracksEnded || !this.trackPids.get(i, false);
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        android.util.SparseArray<androidx.media3.extractor.ts.TsPayloadReader> sparseArrayCreateInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i = 0; i < size; i++) {
            this.tsPayloadReaders.put(sparseArrayCreateInitialPayloadReaders.keyAt(i), sparseArrayCreateInitialPayloadReaders.valueAt(i));
        }
        this.tsPayloadReaders.put(0, new androidx.media3.extractor.ts.SectionReader(new androidx.media3.extractor.ts.TsExtractor.PatReader()));
        this.id3Reader = null;
    }

    private class PatReader implements androidx.media3.extractor.ts.SectionPayloadReader {
        private final androidx.media3.common.util.ParsableBitArray patScratch = new androidx.media3.common.util.ParsableBitArray(new byte[4]);

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void init(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }

        public PatReader() {
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            if (parsableByteArray.readUnsignedByte() == 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
                parsableByteArray.skipBytes(6);
                int iBytesLeft = parsableByteArray.bytesLeft() / 4;
                for (int i = 0; i < iBytesLeft; i++) {
                    parsableByteArray.readBytes(this.patScratch, 4);
                    int bits = this.patScratch.readBits(16);
                    this.patScratch.skipBits(3);
                    if (bits == 0) {
                        this.patScratch.skipBits(13);
                    } else {
                        int bits2 = this.patScratch.readBits(13);
                        if (androidx.media3.extractor.ts.TsExtractor.this.tsPayloadReaders.get(bits2) == null) {
                            androidx.media3.extractor.ts.TsExtractor.this.tsPayloadReaders.put(bits2, new androidx.media3.extractor.ts.SectionReader(androidx.media3.extractor.ts.TsExtractor.this.new PmtReader(bits2)));
                            androidx.media3.extractor.ts.TsExtractor.access$108(androidx.media3.extractor.ts.TsExtractor.this);
                        }
                    }
                }
                if (androidx.media3.extractor.ts.TsExtractor.this.mode != 2) {
                    androidx.media3.extractor.ts.TsExtractor.this.tsPayloadReaders.remove(0);
                }
            }
        }
    }

    private class PmtReader implements androidx.media3.extractor.ts.SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_AIT = 111;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_DVB_EXT = 127;
        private static final int TS_PMT_DESC_DVB_EXT_AC4 = 21;
        private static final int TS_PMT_DESC_DVB_EXT_DTS_HD = 14;
        private static final int TS_PMT_DESC_DVB_EXT_DTS_UHD = 33;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final androidx.media3.common.util.ParsableBitArray pmtScratch = new androidx.media3.common.util.ParsableBitArray(new byte[5]);
        private final android.util.SparseArray<androidx.media3.extractor.ts.TsPayloadReader> trackIdToReaderScratch = new android.util.SparseArray<>();
        private final android.util.SparseIntArray trackIdToPidScratch = new android.util.SparseIntArray();

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void init(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }

        public PmtReader(int i) {
            this.pid = i;
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            androidx.media3.common.util.TimestampAdjuster timestampAdjuster;
            if (parsableByteArray.readUnsignedByte() != 2) {
                return;
            }
            if (androidx.media3.extractor.ts.TsExtractor.this.mode == 1 || androidx.media3.extractor.ts.TsExtractor.this.mode == 2 || androidx.media3.extractor.ts.TsExtractor.this.remainingPmts == 1) {
                timestampAdjuster = (androidx.media3.common.util.TimestampAdjuster) androidx.media3.extractor.ts.TsExtractor.this.timestampAdjusters.get(0);
            } else {
                timestampAdjuster = new androidx.media3.common.util.TimestampAdjuster(((androidx.media3.common.util.TimestampAdjuster) androidx.media3.extractor.ts.TsExtractor.this.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
                androidx.media3.extractor.ts.TsExtractor.this.timestampAdjusters.add(timestampAdjuster);
            }
            if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
                return;
            }
            parsableByteArray.skipBytes(1);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            int i = 3;
            parsableByteArray.skipBytes(3);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            this.pmtScratch.skipBits(3);
            int i2 = 13;
            androidx.media3.extractor.ts.TsExtractor.this.pcrPid = this.pmtScratch.readBits(13);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            int i3 = 4;
            this.pmtScratch.skipBits(4);
            parsableByteArray.skipBytes(this.pmtScratch.readBits(12));
            if (androidx.media3.extractor.ts.TsExtractor.this.mode == 2 && androidx.media3.extractor.ts.TsExtractor.this.id3Reader == null) {
                androidx.media3.extractor.ts.TsPayloadReader.EsInfo esInfo = new androidx.media3.extractor.ts.TsPayloadReader.EsInfo(21, null, 0, null, androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY);
                androidx.media3.extractor.ts.TsExtractor tsExtractor = androidx.media3.extractor.ts.TsExtractor.this;
                tsExtractor.id3Reader = tsExtractor.payloadReaderFactory.createPayloadReader(21, esInfo);
                if (androidx.media3.extractor.ts.TsExtractor.this.id3Reader != null) {
                    androidx.media3.extractor.ts.TsExtractor.this.id3Reader.init(timestampAdjuster, androidx.media3.extractor.ts.TsExtractor.this.output, new androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator(unsignedShort, 21, 8192));
                }
            }
            this.trackIdToReaderScratch.clear();
            this.trackIdToPidScratch.clear();
            int iBytesLeft = parsableByteArray.bytesLeft();
            while (iBytesLeft > 0) {
                parsableByteArray.readBytes(this.pmtScratch, 5);
                int bits = this.pmtScratch.readBits(8);
                this.pmtScratch.skipBits(i);
                int bits2 = this.pmtScratch.readBits(i2);
                this.pmtScratch.skipBits(i3);
                int bits3 = this.pmtScratch.readBits(12);
                androidx.media3.extractor.ts.TsPayloadReader.EsInfo esInfo2 = readEsInfo(parsableByteArray, bits3);
                if (bits == 6 || bits == 5) {
                    bits = esInfo2.streamType;
                }
                iBytesLeft -= bits3 + 5;
                int i4 = androidx.media3.extractor.ts.TsExtractor.this.mode == 2 ? bits : bits2;
                if (!androidx.media3.extractor.ts.TsExtractor.this.trackIds.get(i4)) {
                    androidx.media3.extractor.ts.TsPayloadReader tsPayloadReaderCreatePayloadReader = (androidx.media3.extractor.ts.TsExtractor.this.mode == 2 && bits == 21) ? androidx.media3.extractor.ts.TsExtractor.this.id3Reader : androidx.media3.extractor.ts.TsExtractor.this.payloadReaderFactory.createPayloadReader(bits, esInfo2);
                    if (androidx.media3.extractor.ts.TsExtractor.this.mode != 2 || bits2 < this.trackIdToPidScratch.get(i4, 8192)) {
                        this.trackIdToPidScratch.put(i4, bits2);
                        this.trackIdToReaderScratch.put(i4, tsPayloadReaderCreatePayloadReader);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.trackIdToPidScratch.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.trackIdToPidScratch.keyAt(i5);
                int iValueAt = this.trackIdToPidScratch.valueAt(i5);
                androidx.media3.extractor.ts.TsExtractor.this.trackIds.put(iKeyAt, true);
                androidx.media3.extractor.ts.TsExtractor.this.trackPids.put(iValueAt, true);
                androidx.media3.extractor.ts.TsPayloadReader tsPayloadReaderValueAt = this.trackIdToReaderScratch.valueAt(i5);
                if (tsPayloadReaderValueAt != null) {
                    if (tsPayloadReaderValueAt != androidx.media3.extractor.ts.TsExtractor.this.id3Reader) {
                        tsPayloadReaderValueAt.init(timestampAdjuster, androidx.media3.extractor.ts.TsExtractor.this.output, new androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator(unsignedShort, iKeyAt, 8192));
                    }
                    androidx.media3.extractor.ts.TsExtractor.this.tsPayloadReaders.put(iValueAt, tsPayloadReaderValueAt);
                }
            }
            if (androidx.media3.extractor.ts.TsExtractor.this.mode == 2) {
                if (androidx.media3.extractor.ts.TsExtractor.this.tracksEnded) {
                    return;
                }
                androidx.media3.extractor.ts.TsExtractor.this.output.endTracks();
                androidx.media3.extractor.ts.TsExtractor.this.remainingPmts = 0;
                androidx.media3.extractor.ts.TsExtractor.this.tracksEnded = true;
                return;
            }
            androidx.media3.extractor.ts.TsExtractor.this.tsPayloadReaders.remove(this.pid);
            androidx.media3.extractor.ts.TsExtractor tsExtractor2 = androidx.media3.extractor.ts.TsExtractor.this;
            tsExtractor2.remainingPmts = tsExtractor2.mode == 1 ? 0 : androidx.media3.extractor.ts.TsExtractor.this.remainingPmts - 1;
            if (androidx.media3.extractor.ts.TsExtractor.this.remainingPmts == 0) {
                androidx.media3.extractor.ts.TsExtractor.this.output.endTracks();
                androidx.media3.extractor.ts.TsExtractor.this.tracksEnded = true;
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        private androidx.media3.extractor.ts.TsPayloadReader.EsInfo readEsInfo(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
            int i2;
            int position = parsableByteArray.getPosition();
            int i3 = position + i;
            int i4 = -1;
            java.lang.String str = null;
            java.util.ArrayList arrayList = null;
            int unsignedByte = 0;
            while (parsableByteArray.getPosition() < i3) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                int position2 = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
                if (position2 > i3) {
                    break;
                }
                if (unsignedByte2 == 5) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    if (unsignedInt == androidx.media3.extractor.ts.TsExtractor.AC3_FORMAT_IDENTIFIER) {
                        i4 = 129;
                    } else if (unsignedInt == androidx.media3.extractor.ts.TsExtractor.E_AC3_FORMAT_IDENTIFIER) {
                        i4 = 135;
                    } else if (unsignedInt == androidx.media3.extractor.ts.TsExtractor.AC4_FORMAT_IDENTIFIER) {
                        i4 = 172;
                    } else if (unsignedInt == androidx.media3.extractor.ts.TsExtractor.HEVC_FORMAT_IDENTIFIER) {
                        i4 = 36;
                    }
                } else if (unsignedByte2 == 106) {
                    i4 = 129;
                } else if (unsignedByte2 == 122) {
                    i4 = 135;
                } else if (unsignedByte2 == 127) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte3 == 21) {
                        i4 = 172;
                    } else if (unsignedByte3 == 14) {
                        i4 = 136;
                    } else if (unsignedByte3 == 33) {
                        i4 = 139;
                    }
                } else {
                    if (unsignedByte2 == 123) {
                        i2 = 138;
                    } else if (unsignedByte2 == 10) {
                        java.lang.String strTrim = parsableByteArray.readString(3).trim();
                        unsignedByte = parsableByteArray.readUnsignedByte();
                        str = strTrim;
                    } else if (unsignedByte2 == 89) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        while (parsableByteArray.getPosition() < position2) {
                            java.lang.String strTrim2 = parsableByteArray.readString(3).trim();
                            int unsignedByte4 = parsableByteArray.readUnsignedByte();
                            byte[] bArr = new byte[4];
                            parsableByteArray.readBytes(bArr, 0, 4);
                            arrayList2.add(new androidx.media3.extractor.ts.TsPayloadReader.DvbSubtitleInfo(strTrim2, unsignedByte4, bArr));
                        }
                        arrayList = arrayList2;
                        i4 = 89;
                    } else if (unsignedByte2 == 111) {
                        i2 = 257;
                    }
                    i4 = i2;
                }
                parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
            }
            parsableByteArray.setPosition(i3);
            return new androidx.media3.extractor.ts.TsPayloadReader.EsInfo(i4, str, unsignedByte, arrayList, java.util.Arrays.copyOfRange(parsableByteArray.getData(), position, i3));
        }
    }
}
