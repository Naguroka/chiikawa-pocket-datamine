package androidx.media3.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
public final class AviExtractor implements androidx.media3.extractor.Extractor {
    private static final int AVIIF_KEYFRAME = 16;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 1;
    public static final int FOURCC_AVI_ = 541677121;
    public static final int FOURCC_JUNK = 1263424842;
    public static final int FOURCC_LIST = 1414744396;
    public static final int FOURCC_RIFF = 1179011410;
    public static final int FOURCC_auds = 1935963489;
    public static final int FOURCC_avih = 1751742049;
    public static final int FOURCC_hdrl = 1819436136;
    public static final int FOURCC_idx1 = 829973609;
    public static final int FOURCC_movi = 1769369453;
    public static final int FOURCC_strf = 1718776947;
    public static final int FOURCC_strh = 1752331379;
    public static final int FOURCC_strl = 1819440243;
    public static final int FOURCC_strn = 1852994675;
    public static final int FOURCC_txts = 1937012852;
    public static final int FOURCC_vids = 1935960438;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_FINDING_IDX1_HEADER = 4;
    private static final int STATE_FINDING_MOVI_HEADER = 3;
    private static final int STATE_READING_HDRL_BODY = 2;
    private static final int STATE_READING_HDRL_HEADER = 1;
    private static final int STATE_READING_IDX1_BODY = 5;
    private static final int STATE_READING_SAMPLES = 6;
    private static final int STATE_SKIPPING_TO_HDRL = 0;
    private static final java.lang.String TAG = "AviExtractor";
    private androidx.media3.extractor.avi.AviMainHeaderChunk aviHeader;
    private final androidx.media3.extractor.avi.AviExtractor.ChunkHeaderHolder chunkHeaderHolder;
    private androidx.media3.extractor.avi.ChunkReader[] chunkReaders;
    private androidx.media3.extractor.avi.ChunkReader currentChunkReader;
    private long durationUs;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private int hdrlSize;
    private int idx1BodySize;
    private long moviEnd;
    private long moviStart;
    private final boolean parseSubtitlesDuringExtraction;
    private long pendingReposition;
    private final androidx.media3.common.util.ParsableByteArray scratch;
    private boolean seekMapHasBeenOutput;
    private int state;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @java.lang.Deprecated
    public AviExtractor() {
        this(1, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED);
    }

    public AviExtractor(int i, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this.subtitleParserFactory = factory;
        this.parseSubtitlesDuringExtraction = (i & 1) == 0;
        this.scratch = new androidx.media3.common.util.ParsableByteArray(12);
        this.chunkHeaderHolder = new androidx.media3.extractor.avi.AviExtractor.ChunkHeaderHolder();
        this.extractorOutput = new androidx.media3.extractor.NoOpExtractorOutput();
        this.chunkReaders = new androidx.media3.extractor.avi.ChunkReader[0];
        this.moviStart = -1L;
        this.moviEnd = -1L;
        this.hdrlSize = -1;
        this.durationUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.state = 0;
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
        this.pendingReposition = -1L;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        extractorInput.peekFully(this.scratch.getData(), 0, 12);
        this.scratch.setPosition(0);
        if (this.scratch.readLittleEndianInt() != 1179011410) {
            return false;
        }
        this.scratch.skipBytes(4);
        return this.scratch.readLittleEndianInt() == 541677121;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        if (resolvePendingReposition(extractorInput, positionHolder)) {
            return 1;
        }
        switch (this.state) {
            case 0:
                if (sniff(extractorInput)) {
                    extractorInput.skipFully(12);
                    this.state = 1;
                    return 0;
                }
                throw androidx.media3.common.ParserException.createForMalformedContainer("AVI Header List not found", null);
            case 1:
                extractorInput.readFully(this.scratch.getData(), 0, 12);
                this.scratch.setPosition(0);
                this.chunkHeaderHolder.populateWithListHeaderFrom(this.scratch);
                if (this.chunkHeaderHolder.listType != 1819436136) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("hdrl expected, found: " + this.chunkHeaderHolder.listType, null);
                }
                this.hdrlSize = this.chunkHeaderHolder.size;
                this.state = 2;
                return 0;
            case 2:
                int i = this.hdrlSize - 4;
                androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(i);
                extractorInput.readFully(parsableByteArray.getData(), 0, i);
                parseHdrlBody(parsableByteArray);
                this.state = 3;
                return 0;
            case 3:
                if (this.moviStart != -1) {
                    long position = extractorInput.getPosition();
                    long j = this.moviStart;
                    if (position != j) {
                        this.pendingReposition = j;
                        return 0;
                    }
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 12);
                extractorInput.resetPeekPosition();
                this.scratch.setPosition(0);
                this.chunkHeaderHolder.populateFrom(this.scratch);
                int littleEndianInt = this.scratch.readLittleEndianInt();
                if (this.chunkHeaderHolder.chunkType == 1179011410) {
                    extractorInput.skipFully(12);
                    return 0;
                }
                if (this.chunkHeaderHolder.chunkType != 1414744396 || littleEndianInt != 1769369453) {
                    this.pendingReposition = extractorInput.getPosition() + ((long) this.chunkHeaderHolder.size) + 8;
                    return 0;
                }
                long position2 = extractorInput.getPosition();
                this.moviStart = position2;
                this.moviEnd = position2 + ((long) this.chunkHeaderHolder.size) + 8;
                if (!this.seekMapHasBeenOutput) {
                    if (((androidx.media3.extractor.avi.AviMainHeaderChunk) androidx.media3.common.util.Assertions.checkNotNull(this.aviHeader)).hasIndex()) {
                        this.state = 4;
                        this.pendingReposition = this.moviEnd;
                        return 0;
                    }
                    this.extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(this.durationUs));
                    this.seekMapHasBeenOutput = true;
                }
                this.pendingReposition = extractorInput.getPosition() + 12;
                this.state = 6;
                return 0;
            case 4:
                extractorInput.readFully(this.scratch.getData(), 0, 8);
                this.scratch.setPosition(0);
                int littleEndianInt2 = this.scratch.readLittleEndianInt();
                int littleEndianInt3 = this.scratch.readLittleEndianInt();
                if (littleEndianInt2 == 829973609) {
                    this.state = 5;
                    this.idx1BodySize = littleEndianInt3;
                } else {
                    this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt3);
                }
                return 0;
            case 5:
                androidx.media3.common.util.ParsableByteArray parsableByteArray2 = new androidx.media3.common.util.ParsableByteArray(this.idx1BodySize);
                extractorInput.readFully(parsableByteArray2.getData(), 0, this.idx1BodySize);
                parseIdx1Body(parsableByteArray2);
                this.state = 6;
                this.pendingReposition = this.moviStart;
                return 0;
            case 6:
                return readMoviChunks(extractorInput);
            default:
                throw new java.lang.AssertionError();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.pendingReposition = -1L;
        this.currentChunkReader = null;
        for (androidx.media3.extractor.avi.ChunkReader chunkReader : this.chunkReaders) {
            chunkReader.seekToPosition(j);
        }
        if (j == 0) {
            if (this.chunkReaders.length == 0) {
                this.state = 0;
                return;
            } else {
                this.state = 3;
                return;
            }
        }
        this.state = 6;
    }

    private boolean resolvePendingReposition(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        boolean z;
        if (this.pendingReposition != -1) {
            long position = extractorInput.getPosition();
            long j = this.pendingReposition;
            if (j < position || j > 262144 + position) {
                positionHolder.position = j;
                z = true;
            } else {
                extractorInput.skipFully((int) (j - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.pendingReposition = -1L;
        return z;
    }

    private void parseHdrlBody(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws java.io.IOException {
        androidx.media3.extractor.avi.ListChunk from = androidx.media3.extractor.avi.ListChunk.parseFrom(FOURCC_hdrl, parsableByteArray);
        if (from.getType() != 1819436136) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Unexpected header list type " + from.getType(), null);
        }
        androidx.media3.extractor.avi.AviMainHeaderChunk aviMainHeaderChunk = (androidx.media3.extractor.avi.AviMainHeaderChunk) from.getChild(androidx.media3.extractor.avi.AviMainHeaderChunk.class);
        if (aviMainHeaderChunk == null) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("AviHeader not found", null);
        }
        this.aviHeader = aviMainHeaderChunk;
        this.durationUs = ((long) aviMainHeaderChunk.totalFrames) * ((long) aviMainHeaderChunk.frameDurationUs);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.common.collect.UnmodifiableIterator<androidx.media3.extractor.avi.AviChunk> it = from.children.iterator();
        int i = 0;
        while (it.hasNext()) {
            androidx.media3.extractor.avi.AviChunk next = it.next();
            if (next.getType() == 1819440243) {
                int i2 = i + 1;
                androidx.media3.extractor.avi.ChunkReader chunkReaderProcessStreamList = processStreamList((androidx.media3.extractor.avi.ListChunk) next, i);
                if (chunkReaderProcessStreamList != null) {
                    arrayList.add(chunkReaderProcessStreamList);
                }
                i = i2;
            }
        }
        this.chunkReaders = (androidx.media3.extractor.avi.ChunkReader[]) arrayList.toArray(new androidx.media3.extractor.avi.ChunkReader[0]);
        this.extractorOutput.endTracks();
    }

    private void parseIdx1Body(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        long jPeekSeekOffset = peekSeekOffset(parsableByteArray);
        while (parsableByteArray.bytesLeft() >= 16) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
            long littleEndianInt3 = ((long) parsableByteArray.readLittleEndianInt()) + jPeekSeekOffset;
            parsableByteArray.readLittleEndianInt();
            androidx.media3.extractor.avi.ChunkReader chunkReader = getChunkReader(littleEndianInt);
            if (chunkReader != null) {
                if ((littleEndianInt2 & 16) == 16) {
                    chunkReader.appendKeyFrameToIndex(littleEndianInt3);
                }
                chunkReader.incrementIndexChunkCount();
            }
        }
        for (androidx.media3.extractor.avi.ChunkReader chunkReader2 : this.chunkReaders) {
            chunkReader2.compactIndex();
        }
        this.seekMapHasBeenOutput = true;
        this.extractorOutput.seekMap(new androidx.media3.extractor.avi.AviExtractor.AviSeekMap(this.durationUs));
    }

    private long peekSeekOffset(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 16) {
            return 0L;
        }
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(8);
        long littleEndianInt = parsableByteArray.readLittleEndianInt();
        long j = this.moviStart;
        long j2 = littleEndianInt <= j ? j + 8 : 0L;
        parsableByteArray.setPosition(position);
        return j2;
    }

    private androidx.media3.extractor.avi.ChunkReader getChunkReader(int i) {
        for (androidx.media3.extractor.avi.ChunkReader chunkReader : this.chunkReaders) {
            if (chunkReader.handlesChunkId(i)) {
                return chunkReader;
            }
        }
        return null;
    }

    private int readMoviChunks(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (extractorInput.getPosition() >= this.moviEnd) {
            return -1;
        }
        androidx.media3.extractor.avi.ChunkReader chunkReader = this.currentChunkReader;
        if (chunkReader != null) {
            if (chunkReader.onChunkData(extractorInput)) {
                this.currentChunkReader = null;
            }
        } else {
            alignInputToEvenPosition(extractorInput);
            extractorInput.peekFully(this.scratch.getData(), 0, 12);
            this.scratch.setPosition(0);
            int littleEndianInt = this.scratch.readLittleEndianInt();
            if (littleEndianInt == 1414744396) {
                this.scratch.setPosition(8);
                extractorInput.skipFully(this.scratch.readLittleEndianInt() != 1769369453 ? 8 : 12);
                extractorInput.resetPeekPosition();
                return 0;
            }
            int littleEndianInt2 = this.scratch.readLittleEndianInt();
            if (littleEndianInt == 1263424842) {
                this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt2) + 8;
                return 0;
            }
            extractorInput.skipFully(8);
            extractorInput.resetPeekPosition();
            androidx.media3.extractor.avi.ChunkReader chunkReader2 = getChunkReader(littleEndianInt);
            if (chunkReader2 == null) {
                this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt2);
                return 0;
            }
            chunkReader2.onChunkStart(littleEndianInt2);
            this.currentChunkReader = chunkReader2;
        }
        return 0;
    }

    private androidx.media3.extractor.avi.ChunkReader processStreamList(androidx.media3.extractor.avi.ListChunk listChunk, int i) {
        androidx.media3.extractor.avi.AviStreamHeaderChunk aviStreamHeaderChunk = (androidx.media3.extractor.avi.AviStreamHeaderChunk) listChunk.getChild(androidx.media3.extractor.avi.AviStreamHeaderChunk.class);
        androidx.media3.extractor.avi.StreamFormatChunk streamFormatChunk = (androidx.media3.extractor.avi.StreamFormatChunk) listChunk.getChild(androidx.media3.extractor.avi.StreamFormatChunk.class);
        if (aviStreamHeaderChunk == null) {
            androidx.media3.common.util.Log.w(TAG, "Missing Stream Header");
            return null;
        }
        if (streamFormatChunk == null) {
            androidx.media3.common.util.Log.w(TAG, "Missing Stream Format");
            return null;
        }
        long durationUs = aviStreamHeaderChunk.getDurationUs();
        androidx.media3.common.Format format = streamFormatChunk.format;
        androidx.media3.common.Format.Builder builderBuildUpon = format.buildUpon();
        builderBuildUpon.setId(i);
        int i2 = aviStreamHeaderChunk.suggestedBufferSize;
        if (i2 != 0) {
            builderBuildUpon.setMaxInputSize(i2);
        }
        androidx.media3.extractor.avi.StreamNameChunk streamNameChunk = (androidx.media3.extractor.avi.StreamNameChunk) listChunk.getChild(androidx.media3.extractor.avi.StreamNameChunk.class);
        if (streamNameChunk != null) {
            builderBuildUpon.setLabel(streamNameChunk.name);
        }
        int trackType = androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != 1 && trackType != 2) {
            return null;
        }
        androidx.media3.extractor.TrackOutput trackOutputTrack = this.extractorOutput.track(i, trackType);
        trackOutputTrack.format(builderBuildUpon.build());
        androidx.media3.extractor.avi.ChunkReader chunkReader = new androidx.media3.extractor.avi.ChunkReader(i, trackType, durationUs, aviStreamHeaderChunk.length, trackOutputTrack);
        this.durationUs = durationUs;
        return chunkReader;
    }

    private static void alignInputToEvenPosition(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if ((extractorInput.getPosition() & 1) == 1) {
            extractorInput.skipFully(1);
        }
    }

    private class AviSeekMap implements androidx.media3.extractor.SeekMap {
        private final long durationUs;

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public AviSeekMap(long j) {
            this.durationUs = j;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.SeekMap
        public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
            androidx.media3.extractor.SeekMap.SeekPoints seekPoints = androidx.media3.extractor.avi.AviExtractor.this.chunkReaders[0].getSeekPoints(j);
            for (int i = 1; i < androidx.media3.extractor.avi.AviExtractor.this.chunkReaders.length; i++) {
                androidx.media3.extractor.SeekMap.SeekPoints seekPoints2 = androidx.media3.extractor.avi.AviExtractor.this.chunkReaders[i].getSeekPoints(j);
                if (seekPoints2.first.position < seekPoints.first.position) {
                    seekPoints = seekPoints2;
                }
            }
            return seekPoints;
        }
    }

    private static class ChunkHeaderHolder {
        public int chunkType;
        public int listType;
        public int size;

        private ChunkHeaderHolder() {
        }

        public void populateWithListHeaderFrom(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
            populateFrom(parsableByteArray);
            if (this.chunkType != 1414744396) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("LIST expected, found: " + this.chunkType, null);
            }
            this.listType = parsableByteArray.readLittleEndianInt();
        }

        public void populateFrom(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            this.chunkType = parsableByteArray.readLittleEndianInt();
            this.size = parsableByteArray.readLittleEndianInt();
            this.listType = 0;
        }
    }
}
