package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public class FragmentedMp4Extractor implements androidx.media3.extractor.Extractor {
    private static final int EXTRA_TRACKS_BASE_ID = 100;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 32;
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int SAMPLE_GROUP_TYPE_seig = 1936025959;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final java.lang.String TAG = "FragmentedMp4Extractor";
    private final androidx.media3.extractor.TrackOutput additionalEmsgTrackOutput;
    private androidx.media3.common.util.ParsableByteArray atomData;
    private final androidx.media3.common.util.ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private androidx.media3.extractor.TrackOutput[] ceaTrackOutputs;
    private final java.util.List<androidx.media3.common.Format> closedCaptionFormats;
    private final java.util.ArrayDeque<androidx.media3.extractor.mp4.Atom.ContainerAtom> containerAtoms;
    private androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle currentTrackBundle;
    private long durationUs;
    private androidx.media3.extractor.TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final androidx.media3.extractor.metadata.emsg.EventMessageEncoder eventMessageEncoder;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private com.google.common.collect.ImmutableList<androidx.media3.extractor.SniffFailure> lastSniffFailures;
    private final androidx.media3.common.util.ParsableByteArray nalBuffer;
    private final androidx.media3.common.util.ParsableByteArray nalPrefix;
    private final androidx.media3.common.util.ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final java.util.ArrayDeque<androidx.media3.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final androidx.media3.common.util.ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long segmentIndexEarliestPresentationTimeUs;
    private final androidx.media3.extractor.mp4.Track sideloadedTrack;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private final androidx.media3.common.util.TimestampAdjuster timestampAdjuster;
    private final android.util.SparseArray<androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle> trackBundles;

    @java.lang.Deprecated
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.mp4.FragmentedMp4Extractor.lambda$static$1();
        }
    };
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final androidx.media3.common.Format EMSG_FORMAT = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_EMSG).build();

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    protected androidx.media3.extractor.mp4.Track modifyTrack(androidx.media3.extractor.mp4.Track track) {
        return track;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$newFactory$0(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.mp4.FragmentedMp4Extractor(factory)};
    }

    public static androidx.media3.extractor.ExtractorsFactory newFactory(final androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda1
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final androidx.media3.extractor.Extractor[] createExtractors() {
                return androidx.media3.extractor.mp4.FragmentedMp4Extractor.lambda$newFactory$0(factory);
            }
        };
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$1() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.mp4.FragmentedMp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 32)};
    }

    @java.lang.Deprecated
    public FragmentedMp4Extractor() {
        this(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 32, null, null, com.google.common.collect.ImmutableList.of(), null);
    }

    public FragmentedMp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this(factory, 0, null, null, com.google.common.collect.ImmutableList.of(), null);
    }

    @java.lang.Deprecated
    public FragmentedMp4Extractor(int i) {
        this(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, i | 32, null, null, com.google.common.collect.ImmutableList.of(), null);
    }

    public FragmentedMp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory factory, int i) {
        this(factory, i, null, null, com.google.common.collect.ImmutableList.of(), null);
    }

    @java.lang.Deprecated
    public FragmentedMp4Extractor(int i, androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
        this(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, i | 32, timestampAdjuster, null, com.google.common.collect.ImmutableList.of(), null);
    }

    @java.lang.Deprecated
    public FragmentedMp4Extractor(int i, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.mp4.Track track) {
        this(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, i | 32, timestampAdjuster, track, com.google.common.collect.ImmutableList.of(), null);
    }

    @java.lang.Deprecated
    public FragmentedMp4Extractor(int i, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.mp4.Track track, java.util.List<androidx.media3.common.Format> list) {
        this(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, i | 32, timestampAdjuster, track, list, null);
    }

    @java.lang.Deprecated
    public FragmentedMp4Extractor(int i, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.mp4.Track track, java.util.List<androidx.media3.common.Format> list, androidx.media3.extractor.TrackOutput trackOutput) {
        this(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, i | 32, timestampAdjuster, track, list, trackOutput);
    }

    public FragmentedMp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory factory, int i, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.mp4.Track track, java.util.List<androidx.media3.common.Format> list, androidx.media3.extractor.TrackOutput trackOutput) {
        this.subtitleParserFactory = factory;
        this.flags = i;
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.closedCaptionFormats = java.util.Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.eventMessageEncoder = new androidx.media3.extractor.metadata.emsg.EventMessageEncoder();
        this.atomHeader = new androidx.media3.common.util.ParsableByteArray(16);
        this.nalStartCode = new androidx.media3.common.util.ParsableByteArray(androidx.media3.container.NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new androidx.media3.common.util.ParsableByteArray(5);
        this.nalBuffer = new androidx.media3.common.util.ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new androidx.media3.common.util.ParsableByteArray(bArr);
        this.containerAtoms = new java.util.ArrayDeque<>();
        this.pendingMetadataSampleInfos = new java.util.ArrayDeque<>();
        this.trackBundles = new android.util.SparseArray<>();
        this.lastSniffFailures = com.google.common.collect.ImmutableList.of();
        this.durationUs = androidx.media3.common.C.TIME_UNSET;
        this.pendingSeekTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.segmentIndexEarliestPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.extractorOutput = androidx.media3.extractor.ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new androidx.media3.extractor.TrackOutput[0];
        this.ceaTrackOutputs = new androidx.media3.extractor.TrackOutput[0];
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.SniffFailure sniffFailureSniffFragmented = androidx.media3.extractor.mp4.Sniffer.sniffFragmented(extractorInput);
        this.lastSniffFailures = sniffFailureSniffFragmented != null ? com.google.common.collect.ImmutableList.of(sniffFailureSniffFragmented) : com.google.common.collect.ImmutableList.of();
        return sniffFailureSniffFragmented == null;
    }

    @Override // androidx.media3.extractor.Extractor
    public com.google.common.collect.ImmutableList<androidx.media3.extractor.SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = (this.flags & 32) == 0 ? new androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory) : extractorOutput;
        enterReadingAtomHeaderState();
        initExtraTracks();
        if (this.sideloadedTrack != null) {
            this.trackBundles.put(0, new androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle(extractorOutput.track(0, this.sideloadedTrack.type), new androidx.media3.extractor.mp4.TrackSampleTable(this.sideloadedTrack, new long[0], new int[0], 0, new long[0], new int[0], 0L), new androidx.media3.extractor.mp4.DefaultSampleValues(0, 0, 0, 0)));
            this.extractorOutput.endTracks();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        int size = this.trackBundles.size();
        for (int i = 0; i < size; i++) {
            this.trackBundles.valueAt(i).resetFragmentInfo();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.pendingSeekTimeUs = j2;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        while (true) {
            int i = this.parserState;
            if (i != 0) {
                if (i == 1) {
                    readAtomPayload(extractorInput);
                } else if (i == 2) {
                    readEncryptionData(extractorInput);
                } else if (readSample(extractorInput)) {
                    return 0;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private boolean readAtomHeader(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j = this.atomSize;
        if (j == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - ((long) this.atomHeaderBytesRead);
        int i = this.atomType;
        if ((i == 1836019558 || i == 1835295092) && !this.haveOutputSeekMap) {
            this.extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(this.durationUs, position));
            this.haveOutputSeekMap = true;
        }
        if (this.atomType == 1836019558) {
            int size = this.trackBundles.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.media3.extractor.mp4.TrackFragment trackFragment = this.trackBundles.valueAt(i2).fragment;
                trackFragment.atomPosition = position;
                trackFragment.auxiliaryDataPosition = position;
                trackFragment.dataPosition = position;
            }
        }
        int i3 = this.atomType;
        if (i3 == 1835295092) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = position + this.atomSize;
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i3)) {
            long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
            this.containerAtoms.push(new androidx.media3.extractor.mp4.Atom.ContainerAtom(this.atomType, position2));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.atomSize > 2147483647L) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray((int) this.atomSize);
            java.lang.System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            if (this.atomSize > 2147483647L) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int i = ((int) this.atomSize) - this.atomHeaderBytesRead;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), 8, i);
            onLeafAtomRead(new androidx.media3.extractor.mp4.Atom.LeafAtom(this.atomType, parsableByteArray), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void processAtomEnded(long j) throws androidx.media3.common.ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private void onLeafAtomRead(androidx.media3.extractor.mp4.Atom.LeafAtom leafAtom, long j) throws androidx.media3.common.ParserException {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(leafAtom);
            return;
        }
        if (leafAtom.type == 1936286840) {
            android.util.Pair<java.lang.Long, androidx.media3.extractor.ChunkIndex> sidx = parseSidx(leafAtom.data, j);
            this.segmentIndexEarliestPresentationTimeUs = ((java.lang.Long) sidx.first).longValue();
            this.extractorOutput.seekMap((androidx.media3.extractor.SeekMap) sidx.second);
            this.haveOutputSeekMap = true;
            return;
        }
        if (leafAtom.type == 1701671783) {
            onEmsgLeafAtomRead(leafAtom.data);
        }
    }

    private void onContainerAtomRead(androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom) throws androidx.media3.common.ParserException {
        if (containerAtom.type == 1836019574) {
            onMoovContainerAtomRead(containerAtom);
        } else if (containerAtom.type == 1836019558) {
            onMoofContainerAtomRead(containerAtom);
        } else {
            if (this.containerAtoms.isEmpty()) {
                return;
            }
            this.containerAtoms.peek().add(containerAtom);
        }
    }

    private void onMoovContainerAtomRead(androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom) throws androidx.media3.common.ParserException {
        int i = 0;
        androidx.media3.common.util.Assertions.checkState(this.sideloadedTrack == null, "Unexpected moov box.");
        androidx.media3.common.DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom2 = (androidx.media3.extractor.mp4.Atom.ContainerAtom) androidx.media3.common.util.Assertions.checkNotNull(containerAtom.getContainerAtomOfType(androidx.media3.extractor.mp4.Atom.TYPE_mvex));
        android.util.SparseArray<androidx.media3.extractor.mp4.DefaultSampleValues> sparseArray = new android.util.SparseArray<>();
        int size = containerAtom2.leafChildren.size();
        long mehd = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.media3.extractor.mp4.Atom.LeafAtom leafAtom = containerAtom2.leafChildren.get(i2);
            if (leafAtom.type == 1953654136) {
                android.util.Pair<java.lang.Integer, androidx.media3.extractor.mp4.DefaultSampleValues> trex = parseTrex(leafAtom.data);
                sparseArray.put(((java.lang.Integer) trex.first).intValue(), (androidx.media3.extractor.mp4.DefaultSampleValues) trex.second);
            } else if (leafAtom.type == 1835362404) {
                mehd = parseMehd(leafAtom.data);
            }
        }
        java.util.List<androidx.media3.extractor.mp4.TrackSampleTable> traks = androidx.media3.extractor.mp4.AtomParsers.parseTraks(containerAtom, new androidx.media3.extractor.GaplessInfoHolder(), mehd, drmInitDataFromAtoms, (this.flags & 16) != 0, false, new com.google.common.base.Function() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.modifyTrack((androidx.media3.extractor.mp4.Track) obj);
            }
        });
        int size2 = traks.size();
        if (this.trackBundles.size() == 0) {
            while (i < size2) {
                androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable = traks.get(i);
                androidx.media3.extractor.mp4.Track track = trackSampleTable.track;
                this.trackBundles.put(track.id, new androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle(this.extractorOutput.track(i, track.type), trackSampleTable, getDefaultSampleValues(sparseArray, track.id)));
                this.durationUs = java.lang.Math.max(this.durationUs, track.durationUs);
                i++;
            }
            this.extractorOutput.endTracks();
            return;
        }
        androidx.media3.common.util.Assertions.checkState(this.trackBundles.size() == size2);
        while (i < size2) {
            androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable2 = traks.get(i);
            androidx.media3.extractor.mp4.Track track2 = trackSampleTable2.track;
            this.trackBundles.get(track2.id).reset(trackSampleTable2, getDefaultSampleValues(sparseArray, track2.id));
            i++;
        }
    }

    private androidx.media3.extractor.mp4.DefaultSampleValues getDefaultSampleValues(android.util.SparseArray<androidx.media3.extractor.mp4.DefaultSampleValues> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (androidx.media3.extractor.mp4.DefaultSampleValues) androidx.media3.common.util.Assertions.checkNotNull(sparseArray.get(i));
    }

    private void onMoofContainerAtomRead(androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom) throws androidx.media3.common.ParserException {
        parseMoof(containerAtom, this.trackBundles, this.sideloadedTrack != null, this.flags, this.scratchBytes);
        androidx.media3.common.DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i = 0; i < size; i++) {
                this.trackBundles.valueAt(i).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != androidx.media3.common.C.TIME_UNSET) {
            int size2 = this.trackBundles.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.trackBundles.valueAt(i2).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = androidx.media3.common.C.TIME_UNSET;
        }
    }

    private void initExtraTracks() {
        int i;
        androidx.media3.extractor.TrackOutput[] trackOutputArr = new androidx.media3.extractor.TrackOutput[2];
        this.emsgTrackOutputs = trackOutputArr;
        androidx.media3.extractor.TrackOutput trackOutput = this.additionalEmsgTrackOutput;
        int i2 = 0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.flags & 4) != 0) {
            trackOutputArr[i] = this.extractorOutput.track(100, 5);
            i3 = 101;
            i++;
        }
        androidx.media3.extractor.TrackOutput[] trackOutputArr2 = (androidx.media3.extractor.TrackOutput[]) androidx.media3.common.util.Util.nullSafeArrayCopy(this.emsgTrackOutputs, i);
        this.emsgTrackOutputs = trackOutputArr2;
        for (androidx.media3.extractor.TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.format(EMSG_FORMAT);
        }
        this.ceaTrackOutputs = new androidx.media3.extractor.TrackOutput[this.closedCaptionFormats.size()];
        while (i2 < this.ceaTrackOutputs.length) {
            androidx.media3.extractor.TrackOutput trackOutputTrack = this.extractorOutput.track(i3, 3);
            trackOutputTrack.format(this.closedCaptionFormats.get(i2));
            this.ceaTrackOutputs[i2] = trackOutputTrack;
            i2++;
            i3++;
        }
    }

    private void onEmsgLeafAtomRead(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        long jScaleLargeTimestamp;
        java.lang.String str;
        long jScaleLargeTimestamp2;
        java.lang.String str2;
        long unsignedInt;
        long jAdjustSampleTimestamp;
        if (this.emsgTrackOutputs.length == 0) {
            return;
        }
        parsableByteArray.setPosition(8);
        int fullAtomVersion = androidx.media3.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        if (fullAtomVersion == 0) {
            java.lang.String str3 = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            java.lang.String str4 = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            jScaleLargeTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, unsignedInt2);
            long j = this.segmentIndexEarliestPresentationTimeUs;
            long j2 = j != androidx.media3.common.C.TIME_UNSET ? j + jScaleLargeTimestamp : -9223372036854775807L;
            str = str3;
            jScaleLargeTimestamp2 = androidx.media3.common.util.Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt2);
            str2 = str4;
            unsignedInt = parsableByteArray.readUnsignedInt();
            jAdjustSampleTimestamp = j2;
        } else if (fullAtomVersion == 1) {
            long unsignedInt3 = parsableByteArray.readUnsignedInt();
            jAdjustSampleTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(parsableByteArray.readUnsignedLongToLong(), 1000000L, unsignedInt3);
            long jScaleLargeTimestamp3 = androidx.media3.common.util.Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt3);
            long unsignedInt4 = parsableByteArray.readUnsignedInt();
            str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            jScaleLargeTimestamp2 = jScaleLargeTimestamp3;
            unsignedInt = unsignedInt4;
            str2 = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            jScaleLargeTimestamp = -9223372036854775807L;
        } else {
            androidx.media3.common.util.Log.w(TAG, "Skipping unsupported emsg version: " + fullAtomVersion);
            return;
        }
        byte[] bArr = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr, 0, parsableByteArray.bytesLeft());
        androidx.media3.common.util.ParsableByteArray parsableByteArray2 = new androidx.media3.common.util.ParsableByteArray(this.eventMessageEncoder.encode(new androidx.media3.extractor.metadata.emsg.EventMessage(str, str2, jScaleLargeTimestamp2, unsignedInt, bArr)));
        int iBytesLeft = parsableByteArray2.bytesLeft();
        for (androidx.media3.extractor.TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray2.setPosition(0);
            trackOutput.sampleData(parsableByteArray2, iBytesLeft);
        }
        if (jAdjustSampleTimestamp == androidx.media3.common.C.TIME_UNSET) {
            this.pendingMetadataSampleInfos.addLast(new androidx.media3.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo(jScaleLargeTimestamp, true, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        if (!this.pendingMetadataSampleInfos.isEmpty()) {
            this.pendingMetadataSampleInfos.addLast(new androidx.media3.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo(jAdjustSampleTimestamp, false, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        androidx.media3.common.util.TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null && !timestampAdjuster.isInitialized()) {
            this.pendingMetadataSampleInfos.addLast(new androidx.media3.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo(jAdjustSampleTimestamp, false, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        androidx.media3.common.util.TimestampAdjuster timestampAdjuster2 = this.timestampAdjuster;
        if (timestampAdjuster2 != null) {
            jAdjustSampleTimestamp = timestampAdjuster2.adjustSampleTimestamp(jAdjustSampleTimestamp);
        }
        for (androidx.media3.extractor.TrackOutput trackOutput2 : this.emsgTrackOutputs) {
            trackOutput2.sampleMetadata(jAdjustSampleTimestamp, 1, iBytesLeft, 0, null);
        }
    }

    private static android.util.Pair<java.lang.Integer, androidx.media3.extractor.mp4.DefaultSampleValues> parseTrex(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return android.util.Pair.create(java.lang.Integer.valueOf(parsableByteArray.readInt()), new androidx.media3.extractor.mp4.DefaultSampleValues(parsableByteArray.readInt() - 1, parsableByteArray.readInt(), parsableByteArray.readInt(), parsableByteArray.readInt()));
    }

    private static long parseMehd(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return androidx.media3.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom, android.util.SparseArray<androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle> sparseArray, boolean z, int i, byte[] bArr) throws androidx.media3.common.ParserException {
        int size = containerAtom.containerChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i2);
            if (containerAtom2.type == 1953653094) {
                parseTraf(containerAtom2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void parseTraf(androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom, android.util.SparseArray<androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle> sparseArray, boolean z, int i, byte[] bArr) throws androidx.media3.common.ParserException {
        androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle tfhd = parseTfhd(((androidx.media3.extractor.mp4.Atom.LeafAtom) androidx.media3.common.util.Assertions.checkNotNull(containerAtom.getLeafAtomOfType(androidx.media3.extractor.mp4.Atom.TYPE_tfhd))).data, sparseArray, z);
        if (tfhd == null) {
            return;
        }
        androidx.media3.extractor.mp4.TrackFragment trackFragment = tfhd.fragment;
        long j = trackFragment.nextFragmentDecodeTime;
        boolean z2 = trackFragment.nextFragmentDecodeTimeIncludesMoov;
        tfhd.resetFragmentInfo();
        tfhd.currentlyInFragment = true;
        androidx.media3.extractor.mp4.Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(androidx.media3.extractor.mp4.Atom.TYPE_tfdt);
        if (leafAtomOfType != null && (i & 2) == 0) {
            trackFragment.nextFragmentDecodeTime = parseTfdt(leafAtomOfType.data);
            trackFragment.nextFragmentDecodeTimeIncludesMoov = true;
        } else {
            trackFragment.nextFragmentDecodeTime = j;
            trackFragment.nextFragmentDecodeTimeIncludesMoov = z2;
        }
        parseTruns(containerAtom, tfhd, i);
        androidx.media3.extractor.mp4.TrackEncryptionBox sampleDescriptionEncryptionBox = tfhd.moovSampleTable.track.getSampleDescriptionEncryptionBox(((androidx.media3.extractor.mp4.DefaultSampleValues) androidx.media3.common.util.Assertions.checkNotNull(trackFragment.header)).sampleDescriptionIndex);
        androidx.media3.extractor.mp4.Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(androidx.media3.extractor.mp4.Atom.TYPE_saiz);
        if (leafAtomOfType2 != null) {
            parseSaiz((androidx.media3.extractor.mp4.TrackEncryptionBox) androidx.media3.common.util.Assertions.checkNotNull(sampleDescriptionEncryptionBox), leafAtomOfType2.data, trackFragment);
        }
        androidx.media3.extractor.mp4.Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(androidx.media3.extractor.mp4.Atom.TYPE_saio);
        if (leafAtomOfType3 != null) {
            parseSaio(leafAtomOfType3.data, trackFragment);
        }
        androidx.media3.extractor.mp4.Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(androidx.media3.extractor.mp4.Atom.TYPE_senc);
        if (leafAtomOfType4 != null) {
            parseSenc(leafAtomOfType4.data, trackFragment);
        }
        parseSampleGroups(containerAtom, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null, trackFragment);
        int size = containerAtom.leafChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.media3.extractor.mp4.Atom.LeafAtom leafAtom = containerAtom.leafChildren.get(i2);
            if (leafAtom.type == 1970628964) {
                parseUuid(leafAtom.data, trackFragment, bArr);
            }
        }
    }

    private static void parseTruns(androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom, androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundle, int i) throws androidx.media3.common.ParserException {
        java.util.List<androidx.media3.extractor.mp4.Atom.LeafAtom> list = containerAtom.leafChildren;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.media3.extractor.mp4.Atom.LeafAtom leafAtom = list.get(i4);
            if (leafAtom.type == 1953658222) {
                androidx.media3.common.util.ParsableByteArray parsableByteArray = leafAtom.data;
                parsableByteArray.setPosition(12);
                int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (unsignedIntToInt > 0) {
                    i3 += unsignedIntToInt;
                    i2++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i2, i3);
        int i5 = 0;
        int trun = 0;
        for (int i6 = 0; i6 < size; i6++) {
            androidx.media3.extractor.mp4.Atom.LeafAtom leafAtom2 = list.get(i6);
            if (leafAtom2.type == 1953658222) {
                trun = parseTrun(trackBundle, i5, i, leafAtom2.data, trun);
                i5++;
            }
        }
    }

    private static void parseSaiz(androidx.media3.extractor.mp4.TrackEncryptionBox trackEncryptionBox, androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.mp4.TrackFragment trackFragment) throws androidx.media3.common.ParserException {
        int i;
        int i2 = trackEncryptionBox.perSampleIvSize;
        parsableByteArray.setPosition(8);
        if ((androidx.media3.extractor.mp4.Atom.parseFullAtomFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt > trackFragment.sampleCount) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Saiz sample count " + unsignedIntToInt + " is greater than fragment sample count" + trackFragment.sampleCount, null);
        }
        if (unsignedByte == 0) {
            boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
            i = 0;
            for (int i3 = 0; i3 < unsignedIntToInt; i3++) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                i += unsignedByte2;
                zArr[i3] = unsignedByte2 > i2;
            }
        } else {
            i = (unsignedByte * unsignedIntToInt) + 0;
            java.util.Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, unsignedIntToInt, unsignedByte > i2);
        }
        java.util.Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, unsignedIntToInt, trackFragment.sampleCount, false);
        if (i > 0) {
            trackFragment.initEncryptionData(i);
        }
    }

    private static void parseSaio(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.mp4.TrackFragment trackFragment) throws androidx.media3.common.ParserException {
        parsableByteArray.setPosition(8);
        int i = parsableByteArray.readInt();
        if ((androidx.media3.extractor.mp4.Atom.parseFullAtomFlags(i) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt != 1) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Unexpected saio entry count: " + unsignedIntToInt, null);
        }
        trackFragment.auxiliaryDataPosition += androidx.media3.extractor.mp4.Atom.parseFullAtomVersion(i) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle parseTfhd(androidx.media3.common.util.ParsableByteArray parsableByteArray, android.util.SparseArray<androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle> sparseArray, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        parsableByteArray.setPosition(8);
        int fullAtomFlags = androidx.media3.extractor.mp4.Atom.parseFullAtomFlags(parsableByteArray.readInt());
        androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundleValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(parsableByteArray.readInt());
        if (trackBundleValueAt == null) {
            return null;
        }
        if ((fullAtomFlags & 1) != 0) {
            long unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            trackBundleValueAt.fragment.dataPosition = unsignedLongToLong;
            trackBundleValueAt.fragment.auxiliaryDataPosition = unsignedLongToLong;
        }
        androidx.media3.extractor.mp4.DefaultSampleValues defaultSampleValues = trackBundleValueAt.defaultSampleValues;
        if ((fullAtomFlags & 2) != 0) {
            i = parsableByteArray.readInt() - 1;
        } else {
            i = defaultSampleValues.sampleDescriptionIndex;
        }
        if ((fullAtomFlags & 8) != 0) {
            i2 = parsableByteArray.readInt();
        } else {
            i2 = defaultSampleValues.duration;
        }
        if ((fullAtomFlags & 16) != 0) {
            i3 = parsableByteArray.readInt();
        } else {
            i3 = defaultSampleValues.size;
        }
        if ((fullAtomFlags & 32) != 0) {
            i4 = parsableByteArray.readInt();
        } else {
            i4 = defaultSampleValues.flags;
        }
        trackBundleValueAt.fragment.header = new androidx.media3.extractor.mp4.DefaultSampleValues(i, i2, i3, i4);
        return trackBundleValueAt;
    }

    private static long parseTfdt(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return androidx.media3.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    private static boolean isEdtsListDurationForEntireMediaTimeline(androidx.media3.extractor.mp4.Track track) {
        if (track.editListDurations == null || track.editListDurations.length != 1 || track.editListMediaTimes == null) {
            return false;
        }
        return track.editListDurations[0] == 0 || androidx.media3.common.util.Util.scaleLargeTimestamp(track.editListDurations[0] + track.editListMediaTimes[0], 1000000L, track.movieTimescale) >= track.durationUs;
    }

    private static int parseTrun(androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundle, int i, int i2, androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) throws androidx.media3.common.ParserException {
        int i4;
        androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundle2 = trackBundle;
        parsableByteArray.setPosition(8);
        int fullAtomFlags = androidx.media3.extractor.mp4.Atom.parseFullAtomFlags(parsableByteArray.readInt());
        androidx.media3.extractor.mp4.Track track = trackBundle2.moovSampleTable.track;
        androidx.media3.extractor.mp4.TrackFragment trackFragment = trackBundle2.fragment;
        androidx.media3.extractor.mp4.DefaultSampleValues defaultSampleValues = (androidx.media3.extractor.mp4.DefaultSampleValues) androidx.media3.common.util.Util.castNonNull(trackFragment.header);
        trackFragment.trunLength[i] = parsableByteArray.readUnsignedIntToInt();
        trackFragment.trunDataPosition[i] = trackFragment.dataPosition;
        if ((fullAtomFlags & 1) != 0) {
            long[] jArr = trackFragment.trunDataPosition;
            jArr[i] = jArr[i] + ((long) parsableByteArray.readInt());
        }
        boolean z = (fullAtomFlags & 4) != 0;
        int i5 = defaultSampleValues.flags;
        if (z) {
            i5 = parsableByteArray.readInt();
        }
        boolean z2 = (fullAtomFlags & 256) != 0;
        boolean z3 = (fullAtomFlags & 512) != 0;
        boolean z4 = (fullAtomFlags & 1024) != 0;
        boolean z5 = (fullAtomFlags & 2048) != 0;
        long j = isEdtsListDurationForEntireMediaTimeline(track) ? ((long[]) androidx.media3.common.util.Util.castNonNull(track.editListMediaTimes))[0] : 0L;
        int[] iArr = trackFragment.sampleSizeTable;
        long[] jArr2 = trackFragment.samplePresentationTimesUs;
        boolean[] zArr = trackFragment.sampleIsSyncFrameTable;
        int i6 = i5;
        boolean z6 = track.type == 2 && (i2 & 1) != 0;
        int i7 = i3 + trackFragment.trunLength[i];
        boolean z7 = z6;
        long j2 = track.timescale;
        long j3 = trackFragment.nextFragmentDecodeTime;
        int i8 = i3;
        while (i8 < i7) {
            int iCheckNonNegative = checkNonNegative(z2 ? parsableByteArray.readInt() : defaultSampleValues.duration);
            int iCheckNonNegative2 = checkNonNegative(z3 ? parsableByteArray.readInt() : defaultSampleValues.size);
            if (z4) {
                i4 = parsableByteArray.readInt();
            } else {
                i4 = (i8 == 0 && z) ? i6 : defaultSampleValues.flags;
            }
            jArr2[i8] = androidx.media3.common.util.Util.scaleLargeTimestamp((((long) (z5 ? parsableByteArray.readInt() : 0)) + j3) - j, 1000000L, j2);
            if (!trackFragment.nextFragmentDecodeTimeIncludesMoov) {
                jArr2[i8] = jArr2[i8] + trackBundle2.moovSampleTable.durationUs;
            }
            iArr[i8] = iCheckNonNegative2;
            zArr[i8] = ((i4 >> 16) & 1) == 0 && (!z7 || i8 == 0);
            j3 += (long) iCheckNonNegative;
            i8++;
            trackBundle2 = trackBundle;
            z2 = z2;
            z = z;
            z5 = z5;
            z3 = z3;
            z4 = z4;
        }
        trackFragment.nextFragmentDecodeTime = j3;
        return i7;
    }

    private static int checkNonNegative(int i) throws androidx.media3.common.ParserException {
        if (i >= 0) {
            return i;
        }
        throw androidx.media3.common.ParserException.createForMalformedContainer("Unexpected negative value: " + i, null);
    }

    private static void parseUuid(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.mp4.TrackFragment trackFragment, byte[] bArr) throws androidx.media3.common.ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (java.util.Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, trackFragment);
        }
    }

    private static void parseSenc(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.mp4.TrackFragment trackFragment) throws androidx.media3.common.ParserException {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    private static void parseSenc(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, androidx.media3.extractor.mp4.TrackFragment trackFragment) throws androidx.media3.common.ParserException {
        parsableByteArray.setPosition(i + 8);
        int fullAtomFlags = androidx.media3.extractor.mp4.Atom.parseFullAtomFlags(parsableByteArray.readInt());
        if ((fullAtomFlags & 1) != 0) {
            throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (fullAtomFlags & 2) != 0;
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt == 0) {
            java.util.Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, trackFragment.sampleCount, false);
        } else {
            if (unsignedIntToInt != trackFragment.sampleCount) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Senc sample count " + unsignedIntToInt + " is different from fragment sample count" + trackFragment.sampleCount, null);
            }
            java.util.Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, unsignedIntToInt, z);
            trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
            trackFragment.fillEncryptionData(parsableByteArray);
        }
    }

    private static void parseSampleGroups(androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom, java.lang.String str, androidx.media3.extractor.mp4.TrackFragment trackFragment) throws androidx.media3.common.ParserException {
        byte[] bArr = null;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = null;
        androidx.media3.common.util.ParsableByteArray parsableByteArray2 = null;
        for (int i = 0; i < containerAtom.leafChildren.size(); i++) {
            androidx.media3.extractor.mp4.Atom.LeafAtom leafAtom = containerAtom.leafChildren.get(i);
            androidx.media3.common.util.ParsableByteArray parsableByteArray3 = leafAtom.data;
            if (leafAtom.type == 1935828848) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray = parsableByteArray3;
                }
            } else if (leafAtom.type == 1936158820) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray2 = parsableByteArray3;
                }
            }
        }
        if (parsableByteArray == null || parsableByteArray2 == null) {
            return;
        }
        parsableByteArray.setPosition(8);
        int fullAtomVersion = androidx.media3.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        if (fullAtomVersion == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int fullAtomVersion2 = androidx.media3.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        if (fullAtomVersion2 == 1) {
            if (parsableByteArray2.readUnsignedInt() == 0) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (fullAtomVersion2 >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        parsableByteArray2.skipBytes(1);
        int unsignedByte = parsableByteArray2.readUnsignedByte();
        int i2 = (unsignedByte & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i3 = unsignedByte & 15;
        boolean z = parsableByteArray2.readUnsignedByte() == 1;
        if (z) {
            int unsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (unsignedByte2 == 0) {
                int unsignedByte3 = parsableByteArray2.readUnsignedByte();
                bArr = new byte[unsignedByte3];
                parsableByteArray2.readBytes(bArr, 0, unsignedByte3);
            }
            trackFragment.definesEncryptionData = true;
            trackFragment.trackEncryptionBox = new androidx.media3.extractor.mp4.TrackEncryptionBox(z, str, unsignedByte2, bArr2, i2, i3, bArr);
        }
    }

    private static android.util.Pair<java.lang.Long, androidx.media3.extractor.ChunkIndex> parseSidx(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j) throws androidx.media3.common.ParserException {
        long unsignedLongToLong;
        long unsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = androidx.media3.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (fullAtomVersion == 0) {
            unsignedLongToLong = parsableByteArray.readUnsignedInt();
            unsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            unsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j2 = unsignedLongToLong;
        long j3 = j + unsignedLongToLong2;
        long jScaleLargeTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(j2, 1000000L, unsignedInt);
        parsableByteArray.skipBytes(2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long[] jArr3 = new long[unsignedShort];
        long j4 = jScaleLargeTimestamp;
        int i = 0;
        long j5 = j2;
        while (i < unsignedShort) {
            int i2 = parsableByteArray.readInt();
            if ((i2 & Integer.MIN_VALUE) != 0) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i] = i2 & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + unsignedInt2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i3 = unsignedShort;
            int[] iArr2 = iArr;
            long jScaleLargeTimestamp2 = androidx.media3.common.util.Util.scaleLargeTimestamp(j6, 1000000L, unsignedInt);
            jArr4[i] = jScaleLargeTimestamp2 - jArr5[i];
            parsableByteArray.skipBytes(4);
            j3 += (long) iArr2[i];
            i++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            unsignedShort = i3;
            j5 = j6;
            j4 = jScaleLargeTimestamp2;
        }
        return android.util.Pair.create(java.lang.Long.valueOf(jScaleLargeTimestamp), new androidx.media3.extractor.ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private void readEncryptionData(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int size = this.trackBundles.size();
        long j = Long.MAX_VALUE;
        androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundleValueAt = null;
        for (int i = 0; i < size; i++) {
            androidx.media3.extractor.mp4.TrackFragment trackFragment = this.trackBundles.valueAt(i).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill && trackFragment.auxiliaryDataPosition < j) {
                j = trackFragment.auxiliaryDataPosition;
                trackBundleValueAt = this.trackBundles.valueAt(i);
            }
        }
        if (trackBundleValueAt == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j - extractorInput.getPosition());
        if (position < 0) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        extractorInput.skipFully(position);
        trackBundleValueAt.fragment.fillEncryptionData(extractorInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean readSample(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int iSampleData;
        androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle nextTrackBundle = this.currentTrackBundle;
        java.lang.Throwable th = null;
        if (nextTrackBundle == null) {
            nextTrackBundle = getNextTrackBundle(this.trackBundles);
            if (nextTrackBundle == null) {
                int position = (int) (this.endOfMdatPosition - extractorInput.getPosition());
                if (position < 0) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                extractorInput.skipFully(position);
                enterReadingAtomHeaderState();
                return false;
            }
            int currentSampleOffset = (int) (nextTrackBundle.getCurrentSampleOffset() - extractorInput.getPosition());
            if (currentSampleOffset < 0) {
                androidx.media3.common.util.Log.w(TAG, "Ignoring negative offset to sample data.");
                currentSampleOffset = 0;
            }
            extractorInput.skipFully(currentSampleOffset);
            this.currentTrackBundle = nextTrackBundle;
        }
        int i = 4;
        int i2 = 1;
        if (this.parserState == 3) {
            this.sampleSize = nextTrackBundle.getCurrentSampleSize();
            if (nextTrackBundle.currentSampleIndex < nextTrackBundle.firstSampleToOutputIndex) {
                extractorInput.skipFully(this.sampleSize);
                nextTrackBundle.skipSampleEncryptionData();
                if (!nextTrackBundle.next()) {
                    this.currentTrackBundle = null;
                }
                this.parserState = 3;
                return true;
            }
            if (nextTrackBundle.moovSampleTable.track.sampleTransformation == 1) {
                this.sampleSize -= 8;
                extractorInput.skipFully(8);
            }
            if (androidx.media3.common.MimeTypes.AUDIO_AC4.equals(nextTrackBundle.moovSampleTable.track.format.sampleMimeType)) {
                this.sampleBytesWritten = nextTrackBundle.outputSampleEncryptionData(this.sampleSize, 7);
                androidx.media3.extractor.Ac4Util.getAc4SampleHeader(this.sampleSize, this.scratch);
                nextTrackBundle.output.sampleData(this.scratch, 7);
                this.sampleBytesWritten += 7;
            } else {
                this.sampleBytesWritten = nextTrackBundle.outputSampleEncryptionData(this.sampleSize, 0);
            }
            this.sampleSize += this.sampleBytesWritten;
            this.parserState = 4;
            this.sampleCurrentNalBytesRemaining = 0;
        }
        androidx.media3.extractor.mp4.Track track = nextTrackBundle.moovSampleTable.track;
        androidx.media3.extractor.TrackOutput trackOutput = nextTrackBundle.output;
        long currentSamplePresentationTimeUs = nextTrackBundle.getCurrentSamplePresentationTimeUs();
        androidx.media3.common.util.TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            currentSamplePresentationTimeUs = timestampAdjuster.adjustSampleTimestamp(currentSamplePresentationTimeUs);
        }
        long j = currentSamplePresentationTimeUs;
        if (track.nalUnitLengthFieldLength == 0) {
            while (true) {
                int i3 = this.sampleBytesWritten;
                int i4 = this.sampleSize;
                if (i3 >= i4) {
                    break;
                }
                this.sampleBytesWritten += trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, i4 - i3, false);
            }
        } else {
            byte[] data = this.nalPrefix.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i5 = track.nalUnitLengthFieldLength + 1;
            int i6 = 4 - track.nalUnitLengthFieldLength;
            while (this.sampleBytesWritten < this.sampleSize) {
                int i7 = this.sampleCurrentNalBytesRemaining;
                if (i7 == 0) {
                    extractorInput.readFully(data, i6, i5);
                    this.nalPrefix.setPosition(0);
                    int i8 = this.nalPrefix.readInt();
                    if (i8 < i2) {
                        throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid NAL length", th);
                    }
                    this.sampleCurrentNalBytesRemaining = i8 - 1;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, i);
                    trackOutput.sampleData(this.nalPrefix, i2);
                    this.processSeiNalUnitPayload = (this.ceaTrackOutputs.length <= 0 || !androidx.media3.container.NalUnitUtil.isNalUnitSei(track.format.sampleMimeType, data[i])) ? 0 : i2;
                    this.sampleBytesWritten += 5;
                    this.sampleSize += i6;
                } else {
                    if (this.processSeiNalUnitPayload) {
                        this.nalBuffer.reset(i7);
                        extractorInput.readFully(this.nalBuffer.getData(), 0, this.sampleCurrentNalBytesRemaining);
                        trackOutput.sampleData(this.nalBuffer, this.sampleCurrentNalBytesRemaining);
                        iSampleData = this.sampleCurrentNalBytesRemaining;
                        int iUnescapeStream = androidx.media3.container.NalUnitUtil.unescapeStream(this.nalBuffer.getData(), this.nalBuffer.limit());
                        this.nalBuffer.setPosition("video/hevc".equals(track.format.sampleMimeType) ? 1 : 0);
                        this.nalBuffer.setLimit(iUnescapeStream);
                        androidx.media3.extractor.CeaUtil.consume(j, this.nalBuffer, this.ceaTrackOutputs);
                    } else {
                        iSampleData = trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, i7, false);
                    }
                    this.sampleBytesWritten += iSampleData;
                    this.sampleCurrentNalBytesRemaining -= iSampleData;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int currentSampleFlags = nextTrackBundle.getCurrentSampleFlags();
        androidx.media3.extractor.mp4.TrackEncryptionBox encryptionBoxIfEncrypted = nextTrackBundle.getEncryptionBoxIfEncrypted();
        trackOutput.sampleMetadata(j, currentSampleFlags, this.sampleSize, 0, encryptionBoxIfEncrypted != null ? encryptionBoxIfEncrypted.cryptoData : null);
        outputPendingMetadataSamples(j);
        if (!nextTrackBundle.next()) {
            this.currentTrackBundle = null;
        }
        this.parserState = 3;
        return true;
    }

    private void outputPendingMetadataSamples(long j) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            androidx.media3.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo metadataSampleInfoRemoveFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= metadataSampleInfoRemoveFirst.size;
            long jAdjustSampleTimestamp = metadataSampleInfoRemoveFirst.sampleTimeUs;
            if (metadataSampleInfoRemoveFirst.sampleTimeIsRelative) {
                jAdjustSampleTimestamp += j;
            }
            androidx.media3.common.util.TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
            }
            for (androidx.media3.extractor.TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(jAdjustSampleTimestamp, 1, metadataSampleInfoRemoveFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle getNextTrackBundle(android.util.SparseArray<androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle> sparseArray) {
        int size = sparseArray.size();
        androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundle = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundleValueAt = sparseArray.valueAt(i);
            if ((trackBundleValueAt.currentlyInFragment || trackBundleValueAt.currentSampleIndex != trackBundleValueAt.moovSampleTable.sampleCount) && (!trackBundleValueAt.currentlyInFragment || trackBundleValueAt.currentTrackRunIndex != trackBundleValueAt.fragment.trunCount)) {
                long currentSampleOffset = trackBundleValueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j) {
                    trackBundle = trackBundleValueAt;
                    j = currentSampleOffset;
                }
            }
        }
        return trackBundle;
    }

    private static androidx.media3.common.DrmInitData getDrmInitDataFromAtoms(java.util.List<androidx.media3.extractor.mp4.Atom.LeafAtom> list) {
        int size = list.size();
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            androidx.media3.extractor.mp4.Atom.LeafAtom leafAtom = list.get(i);
            if (leafAtom.type == 1886614376) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                byte[] data = leafAtom.data.getData();
                java.util.UUID uuid = androidx.media3.extractor.mp4.PsshAtomUtil.parseUuid(data);
                if (uuid == null) {
                    androidx.media3.common.util.Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new androidx.media3.common.DrmInitData.SchemeData(uuid, androidx.media3.common.MimeTypes.VIDEO_MP4, data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new androidx.media3.common.DrmInitData(arrayList);
    }

    private static final class MetadataSampleInfo {
        public final boolean sampleTimeIsRelative;
        public final long sampleTimeUs;
        public final int size;

        public MetadataSampleInfo(long j, boolean z, int i) {
            this.sampleTimeUs = j;
            this.sampleTimeIsRelative = z;
            this.size = i;
        }
    }

    private static final class TrackBundle {
        private static final int SINGLE_SUBSAMPLE_ENCRYPTION_DATA_LENGTH = 8;
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private boolean currentlyInFragment;
        public androidx.media3.extractor.mp4.DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public androidx.media3.extractor.mp4.TrackSampleTable moovSampleTable;
        public final androidx.media3.extractor.TrackOutput output;
        public final androidx.media3.extractor.mp4.TrackFragment fragment = new androidx.media3.extractor.mp4.TrackFragment();
        public final androidx.media3.common.util.ParsableByteArray scratch = new androidx.media3.common.util.ParsableByteArray();
        private final androidx.media3.common.util.ParsableByteArray encryptionSignalByte = new androidx.media3.common.util.ParsableByteArray(1);
        private final androidx.media3.common.util.ParsableByteArray defaultInitializationVector = new androidx.media3.common.util.ParsableByteArray();

        public TrackBundle(androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable, androidx.media3.extractor.mp4.DefaultSampleValues defaultSampleValues) {
            this.output = trackOutput;
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            reset(trackSampleTable, defaultSampleValues);
        }

        public void reset(androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable, androidx.media3.extractor.mp4.DefaultSampleValues defaultSampleValues) {
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            this.output.format(trackSampleTable.track.format);
            resetFragmentInfo();
        }

        public void updateDrmInitData(androidx.media3.common.DrmInitData drmInitData) {
            androidx.media3.extractor.mp4.TrackEncryptionBox sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(((androidx.media3.extractor.mp4.DefaultSampleValues) androidx.media3.common.util.Util.castNonNull(this.fragment.header)).sampleDescriptionIndex);
            this.output.format(this.moovSampleTable.track.format.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)).build());
        }

        public void resetFragmentInfo() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
            this.currentlyInFragment = false;
        }

        public void seek(long j) {
            for (int i = this.currentSampleIndex; i < this.fragment.sampleCount && this.fragment.getSamplePresentationTimeUs(i) <= j; i++) {
                if (this.fragment.sampleIsSyncFrameTable[i]) {
                    this.firstSampleToOutputIndex = i;
                }
            }
        }

        public long getCurrentSamplePresentationTimeUs() {
            if (!this.currentlyInFragment) {
                return this.moovSampleTable.timestampsUs[this.currentSampleIndex];
            }
            return this.fragment.getSamplePresentationTimeUs(this.currentSampleIndex);
        }

        public long getCurrentSampleOffset() {
            if (!this.currentlyInFragment) {
                return this.moovSampleTable.offsets[this.currentSampleIndex];
            }
            return this.fragment.trunDataPosition[this.currentTrackRunIndex];
        }

        public int getCurrentSampleSize() {
            if (!this.currentlyInFragment) {
                return this.moovSampleTable.sizes[this.currentSampleIndex];
            }
            return this.fragment.sampleSizeTable[this.currentSampleIndex];
        }

        public int getCurrentSampleFlags() {
            int i;
            if (!this.currentlyInFragment) {
                i = this.moovSampleTable.flags[this.currentSampleIndex];
            } else {
                i = this.fragment.sampleIsSyncFrameTable[this.currentSampleIndex] ? 1 : 0;
            }
            return getEncryptionBoxIfEncrypted() != null ? i | 1073741824 : i;
        }

        public boolean next() {
            this.currentSampleIndex++;
            if (!this.currentlyInFragment) {
                return false;
            }
            int i = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i;
            int[] iArr = this.fragment.trunLength;
            int i2 = this.currentTrackRunIndex;
            if (i != iArr[i2]) {
                return true;
            }
            this.currentTrackRunIndex = i2 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public int outputSampleEncryptionData(int i, int i2) {
            androidx.media3.common.util.ParsableByteArray parsableByteArray;
            int length;
            androidx.media3.extractor.mp4.TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            if (encryptionBoxIfEncrypted.perSampleIvSize != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
                length = encryptionBoxIfEncrypted.perSampleIvSize;
            } else {
                byte[] bArr = (byte[]) androidx.media3.common.util.Util.castNonNull(encryptionBoxIfEncrypted.defaultInitializationVector);
                this.defaultInitializationVector.reset(bArr, bArr.length);
                parsableByteArray = this.defaultInitializationVector;
                length = bArr.length;
            }
            boolean zSampleHasSubsampleEncryptionTable = this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex);
            boolean z = zSampleHasSubsampleEncryptionTable || i2 != 0;
            this.encryptionSignalByte.getData()[0] = (byte) ((z ? 128 : 0) | length);
            this.encryptionSignalByte.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1, 1);
            this.output.sampleData(parsableByteArray, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zSampleHasSubsampleEncryptionTable) {
                this.scratch.reset(8);
                byte[] data = this.scratch.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((i2 >> 8) & 255);
                data[3] = (byte) (i2 & 255);
                data[4] = (byte) ((i >> 24) & 255);
                data[5] = (byte) ((i >> 16) & 255);
                data[6] = (byte) ((i >> 8) & 255);
                data[7] = (byte) (i & 255);
                this.output.sampleData(this.scratch, 8, 1);
                return length + 1 + 8;
            }
            androidx.media3.common.util.ParsableByteArray parsableByteArray2 = this.fragment.sampleEncryptionData;
            int unsignedShort = parsableByteArray2.readUnsignedShort();
            parsableByteArray2.skipBytes(-2);
            int i3 = (unsignedShort * 6) + 2;
            if (i2 != 0) {
                this.scratch.reset(i3);
                byte[] data2 = this.scratch.getData();
                parsableByteArray2.readBytes(data2, 0, i3);
                int i4 = (((data2[2] & 255) << 8) | (data2[3] & 255)) + i2;
                data2[2] = (byte) ((i4 >> 8) & 255);
                data2[3] = (byte) (i4 & 255);
                parsableByteArray2 = this.scratch;
            }
            this.output.sampleData(parsableByteArray2, i3, 1);
            return length + 1 + i3;
        }

        public void skipSampleEncryptionData() {
            androidx.media3.extractor.mp4.TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            androidx.media3.common.util.ParsableByteArray parsableByteArray = this.fragment.sampleEncryptionData;
            if (encryptionBoxIfEncrypted.perSampleIvSize != 0) {
                parsableByteArray.skipBytes(encryptionBoxIfEncrypted.perSampleIvSize);
            }
            if (this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex)) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
            }
        }

        public androidx.media3.extractor.mp4.TrackEncryptionBox getEncryptionBoxIfEncrypted() {
            androidx.media3.extractor.mp4.TrackEncryptionBox sampleDescriptionEncryptionBox;
            if (!this.currentlyInFragment) {
                return null;
            }
            int i = ((androidx.media3.extractor.mp4.DefaultSampleValues) androidx.media3.common.util.Util.castNonNull(this.fragment.header)).sampleDescriptionIndex;
            if (this.fragment.trackEncryptionBox != null) {
                sampleDescriptionEncryptionBox = this.fragment.trackEncryptionBox;
            } else {
                sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(i);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.isEncrypted) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }
    }
}
