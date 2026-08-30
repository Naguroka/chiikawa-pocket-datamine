package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4Extractor implements androidx.media3.extractor.Extractor, androidx.media3.extractor.SeekMap {

    @java.lang.Deprecated
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.mp4.Mp4Extractor.lambda$static$1();
        }
    };
    private static final int FILE_TYPE_HEIC = 2;
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 16;
    public static final int FLAG_MARK_FIRST_VIDEO_TRACK_WITH_MAIN_ROLE = 8;
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;
    private androidx.media3.common.util.ParsableByteArray atomData;
    private final androidx.media3.common.util.ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final java.util.ArrayDeque<androidx.media3.extractor.mp4.Atom.ContainerAtom> containerAtoms;
    private long durationUs;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;
    private com.google.common.collect.ImmutableList<androidx.media3.extractor.SniffFailure> lastSniffFailures;
    private androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata motionPhotoMetadata;
    private final androidx.media3.common.util.ParsableByteArray nalLength;
    private final androidx.media3.common.util.ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private final androidx.media3.common.util.ParsableByteArray scratch;
    private boolean seenFtypAtom;
    private final androidx.media3.extractor.mp4.SefReader sefReader;
    private final java.util.List<androidx.media3.common.Metadata.Entry> slowMotionMetadataEntries;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] tracks;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static int brandToFileType(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    static /* synthetic */ androidx.media3.extractor.mp4.Track lambda$processMoovAtom$2(androidx.media3.extractor.mp4.Track track) {
        return track;
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$newFactory$0(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.mp4.Mp4Extractor(factory)};
    }

    public static androidx.media3.extractor.ExtractorsFactory newFactory(final androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda0
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final androidx.media3.extractor.Extractor[] createExtractors() {
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$newFactory$0(factory);
            }
        };
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$1() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.mp4.Mp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 16)};
    }

    @java.lang.Deprecated
    public Mp4Extractor() {
        this(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 16);
    }

    public Mp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this(factory, 0);
    }

    @java.lang.Deprecated
    public Mp4Extractor(int i) {
        this(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, i);
    }

    public Mp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory factory, int i) {
        this.subtitleParserFactory = factory;
        this.flags = i;
        this.lastSniffFailures = com.google.common.collect.ImmutableList.of();
        this.parserState = (i & 4) != 0 ? 3 : 0;
        this.sefReader = new androidx.media3.extractor.mp4.SefReader();
        this.slowMotionMetadataEntries = new java.util.ArrayList();
        this.atomHeader = new androidx.media3.common.util.ParsableByteArray(16);
        this.containerAtoms = new java.util.ArrayDeque<>();
        this.nalStartCode = new androidx.media3.common.util.ParsableByteArray(androidx.media3.container.NalUnitUtil.NAL_START_CODE);
        this.nalLength = new androidx.media3.common.util.ParsableByteArray(4);
        this.scratch = new androidx.media3.common.util.ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = androidx.media3.extractor.ExtractorOutput.PLACEHOLDER;
        this.tracks = new androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[0];
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.SniffFailure sniffFailureSniffUnfragmented = androidx.media3.extractor.mp4.Sniffer.sniffUnfragmented(extractorInput, (this.flags & 2) != 0);
        this.lastSniffFailures = sniffFailureSniffUnfragmented != null ? com.google.common.collect.ImmutableList.of(sniffFailureSniffUnfragmented) : com.google.common.collect.ImmutableList.of();
        return sniffFailureSniffUnfragmented == null;
    }

    @Override // androidx.media3.extractor.Extractor
    public com.google.common.collect.ImmutableList<androidx.media3.extractor.SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        if ((this.flags & 16) == 0) {
            extractorOutput = new androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.reset();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track mp4Track : this.tracks) {
            updateSampleIndex(mp4Track, j2);
            if (mp4Track.trueHdSampleRechunker != null) {
                mp4Track.trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        while (true) {
            int i = this.parserState;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i == 3) {
                        return readSefData(extractorInput, positionHolder);
                    }
                    throw new java.lang.IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        return getSeekPoints(j, -1);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f A[EDGE_INSN: B:42:0x007f->B:36:0x007f BREAK  A[LOOP:0: B:28:0x0063->B:35:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007c A[SYNTHETIC] */
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j, int i) {
        long jMaybeAdjustSeekOffset;
        long j2;
        long jMaybeAdjustSeekOffset2;
        long j3;
        androidx.media3.extractor.SeekPoint seekPoint;
        int i2;
        androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] mp4TrackArr;
        androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable;
        int indexOfLaterOrEqualSynchronizationSample;
        androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] mp4TrackArr2 = this.tracks;
        if (mp4TrackArr2.length == 0) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(androidx.media3.extractor.SeekPoint.START);
        }
        int i3 = i != -1 ? i : this.firstVideoTrackIndex;
        if (i3 != -1) {
            androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable2 = mp4TrackArr2[i3].sampleTable;
            int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable2, j);
            if (synchronizationSampleIndex == -1) {
                return new androidx.media3.extractor.SeekMap.SeekPoints(androidx.media3.extractor.SeekPoint.START);
            }
            j2 = trackSampleTable2.timestampsUs[synchronizationSampleIndex];
            jMaybeAdjustSeekOffset = trackSampleTable2.offsets[synchronizationSampleIndex];
            if (j2 < j && synchronizationSampleIndex < trackSampleTable2.sampleCount - 1 && (indexOfLaterOrEqualSynchronizationSample = trackSampleTable2.getIndexOfLaterOrEqualSynchronizationSample(j)) != -1 && indexOfLaterOrEqualSynchronizationSample != synchronizationSampleIndex) {
                j3 = trackSampleTable2.timestampsUs[indexOfLaterOrEqualSynchronizationSample];
                jMaybeAdjustSeekOffset2 = trackSampleTable2.offsets[indexOfLaterOrEqualSynchronizationSample];
            }
            if (i == -1) {
                i2 = 0;
                while (true) {
                    mp4TrackArr = this.tracks;
                    if (i2 < mp4TrackArr.length) {
                        break;
                    }
                    if (i2 != this.firstVideoTrackIndex) {
                        trackSampleTable = mp4TrackArr[i2].sampleTable;
                        jMaybeAdjustSeekOffset = maybeAdjustSeekOffset(trackSampleTable, j2, jMaybeAdjustSeekOffset);
                        if (j3 != androidx.media3.common.C.TIME_UNSET) {
                            jMaybeAdjustSeekOffset2 = maybeAdjustSeekOffset(trackSampleTable, j3, jMaybeAdjustSeekOffset2);
                        }
                    }
                    i2++;
                }
            }
            seekPoint = new androidx.media3.extractor.SeekPoint(j2, jMaybeAdjustSeekOffset);
            if (j3 == androidx.media3.common.C.TIME_UNSET) {
                return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
            }
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(j3, jMaybeAdjustSeekOffset2));
        }
        jMaybeAdjustSeekOffset = Long.MAX_VALUE;
        j2 = j;
        jMaybeAdjustSeekOffset2 = -1;
        j3 = -9223372036854775807L;
        if (i == -1) {
            i2 = 0;
            while (true) {
                mp4TrackArr = this.tracks;
                if (i2 < mp4TrackArr.length) {
                    break;
                    break;
                }
                if (i2 != this.firstVideoTrackIndex) {
                    trackSampleTable = mp4TrackArr[i2].sampleTable;
                    jMaybeAdjustSeekOffset = maybeAdjustSeekOffset(trackSampleTable, j2, jMaybeAdjustSeekOffset);
                    if (j3 != androidx.media3.common.C.TIME_UNSET) {
                        jMaybeAdjustSeekOffset2 = maybeAdjustSeekOffset(trackSampleTable, j3, jMaybeAdjustSeekOffset2);
                    }
                }
                i2++;
            }
        }
        seekPoint = new androidx.media3.extractor.SeekPoint(j2, jMaybeAdjustSeekOffset);
        if (j3 == androidx.media3.common.C.TIME_UNSET) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(j3, jMaybeAdjustSeekOffset2));
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private boolean readAtomHeader(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtomPeek;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
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
            if (length == -1 && (containerAtomPeek = this.containerAtoms.peek()) != null) {
                length = containerAtomPeek.endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j2 = this.atomSize;
            int i = this.atomHeaderBytesRead;
            long j3 = (position + j2) - ((long) i);
            if (j2 != i && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new androidx.media3.extractor.mp4.Atom.ContainerAtom(this.atomType, j3));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j3);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            androidx.media3.common.util.Assertions.checkState(this.atomHeaderBytesRead == 8);
            androidx.media3.common.util.Assertions.checkState(this.atomSize <= 2147483647L);
            androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray((int) this.atomSize);
            java.lang.System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            processUnparsedAtom(extractorInput.getPosition() - ((long) this.atomHeaderBytesRead));
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private boolean readAtomPayload(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        boolean z;
        long j = this.atomSize - ((long) this.atomHeaderBytesRead);
        long position = extractorInput.getPosition() + j;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), this.atomHeaderBytesRead, (int) j);
            if (this.atomType == 1718909296) {
                this.seenFtypAtom = true;
                this.fileType = processFtypAtom(parsableByteArray);
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(new androidx.media3.extractor.mp4.Atom.LeafAtom(this.atomType, parsableByteArray));
            }
        } else {
            if (!this.seenFtypAtom && this.atomType == 1835295092) {
                this.fileType = 1;
            }
            if (j < 262144) {
                extractorInput.skipFully((int) j);
            } else {
                positionHolder.position = extractorInput.getPosition() + j;
                z = true;
            }
            processAtomEnded(position);
            return (z || this.parserState == 2) ? false : true;
        }
        z = false;
        processAtomEnded(position);
        if (z) {
        }
    }

    private int readSefData(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int i = this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (i == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return i;
    }

    private void processAtomEnded(long j) throws androidx.media3.common.ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j) {
            androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtomPop = this.containerAtoms.pop();
            if (containerAtomPop.type == 1836019574) {
                processMoovAtom(containerAtomPop);
                this.containerAtoms.clear();
                this.parserState = 2;
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(containerAtomPop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private void processMoovAtom(androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom) throws androidx.media3.common.ParserException {
        androidx.media3.common.Metadata metadata;
        androidx.media3.common.Metadata metadata2;
        int i;
        int i2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = this.fileType == 1;
        androidx.media3.extractor.GaplessInfoHolder gaplessInfoHolder = new androidx.media3.extractor.GaplessInfoHolder();
        androidx.media3.extractor.mp4.Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(androidx.media3.extractor.mp4.Atom.TYPE_udta);
        if (leafAtomOfType != null) {
            androidx.media3.common.Metadata udta = androidx.media3.extractor.mp4.AtomParsers.parseUdta(leafAtomOfType);
            gaplessInfoHolder.setFromMetadata(udta);
            metadata = udta;
        } else {
            metadata = null;
        }
        androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(androidx.media3.extractor.mp4.Atom.TYPE_meta);
        androidx.media3.common.Metadata mdtaFromMeta = containerAtomOfType != null ? androidx.media3.extractor.mp4.AtomParsers.parseMdtaFromMeta(containerAtomOfType) : null;
        androidx.media3.common.Metadata metadata3 = new androidx.media3.common.Metadata(androidx.media3.extractor.mp4.AtomParsers.parseMvhd(((androidx.media3.extractor.mp4.Atom.LeafAtom) androidx.media3.common.util.Assertions.checkNotNull(containerAtom.getLeafAtomOfType(androidx.media3.extractor.mp4.Atom.TYPE_mvhd))).data));
        boolean z2 = (this.flags & 1) != 0;
        long j = androidx.media3.common.C.TIME_UNSET;
        java.util.List<androidx.media3.extractor.mp4.TrackSampleTable> traks = androidx.media3.extractor.mp4.AtomParsers.parseTraks(containerAtom, gaplessInfoHolder, androidx.media3.common.C.TIME_UNSET, null, z2, z, new com.google.common.base.Function() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$processMoovAtom$2((androidx.media3.extractor.mp4.Track) obj);
            }
        });
        long jMax = -9223372036854775807L;
        int i3 = 0;
        int i4 = 0;
        int size = -1;
        while (i3 < traks.size()) {
            androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable = traks.get(i3);
            if (trackSampleTable.sampleCount == 0) {
                i = i4;
                metadata2 = metadata;
            } else {
                androidx.media3.extractor.mp4.Track track = trackSampleTable.track;
                metadata2 = metadata;
                androidx.media3.common.Metadata metadata4 = mdtaFromMeta;
                long j2 = track.durationUs != j ? track.durationUs : trackSampleTable.durationUs;
                jMax = java.lang.Math.max(jMax, j2);
                i = i4 + 1;
                androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track mp4Track = new androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track(track, trackSampleTable, this.extractorOutput.track(i4, track.type));
                if (androidx.media3.common.MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType)) {
                    i2 = trackSampleTable.maximumSize * 16;
                } else {
                    i2 = trackSampleTable.maximumSize + 30;
                }
                androidx.media3.common.Format.Builder builderBuildUpon = track.format.buildUpon();
                builderBuildUpon.setMaxInputSize(i2);
                if (track.type == 2) {
                    if ((this.flags & 8) != 0) {
                        builderBuildUpon.setRoleFlags(track.format.roleFlags | (size == -1 ? 1 : 2));
                    }
                    if (j2 > 0 && trackSampleTable.sampleCount > 0) {
                        builderBuildUpon.setFrameRate(trackSampleTable.sampleCount / (j2 / 1000000.0f));
                    }
                }
                androidx.media3.extractor.mp4.MetadataUtil.setFormatGaplessInfo(track.type, gaplessInfoHolder, builderBuildUpon);
                int i5 = track.type;
                androidx.media3.common.Metadata[] metadataArr = new androidx.media3.common.Metadata[3];
                metadataArr[0] = this.slowMotionMetadataEntries.isEmpty() ? null : new androidx.media3.common.Metadata(this.slowMotionMetadataEntries);
                metadataArr[1] = metadata2;
                metadataArr[2] = metadata3;
                mdtaFromMeta = metadata4;
                androidx.media3.extractor.mp4.MetadataUtil.setFormatMetadata(i5, mdtaFromMeta, builderBuildUpon, metadataArr);
                mp4Track.trackOutput.format(builderBuildUpon.build());
                if (track.type == 2 && size == -1) {
                    size = arrayList.size();
                }
                arrayList.add(mp4Track);
            }
            i3++;
            metadata = metadata2;
            i4 = i;
            j = androidx.media3.common.C.TIME_UNSET;
        }
        this.firstVideoTrackIndex = size;
        this.durationUs = jMax;
        androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] mp4TrackArr = (androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[]) arrayList.toArray(new androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[0]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private int readSample(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int i;
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track mp4Track = this.tracks[this.sampleTrackIndex];
        androidx.media3.extractor.TrackOutput trackOutput = mp4Track.trackOutput;
        int i2 = mp4Track.sampleIndex;
        long j = mp4Track.sampleTable.offsets[i2];
        int i3 = mp4Track.sampleTable.sizes[i2];
        androidx.media3.extractor.TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
        long j2 = (j - position) + ((long) this.sampleBytesRead);
        if (j2 < 0 || j2 >= 262144) {
            positionHolder.position = j;
            return 1;
        }
        if (mp4Track.track.sampleTransformation == 1) {
            j2 += 8;
            i3 -= 8;
        }
        extractorInput.skipFully((int) j2);
        if (mp4Track.track.nalUnitLengthFieldLength != 0) {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i4 = mp4Track.track.nalUnitLengthFieldLength;
            int i5 = 4;
            int i6 = 4 - mp4Track.track.nalUnitLengthFieldLength;
            while (this.sampleBytesWritten < i3) {
                int i7 = this.sampleCurrentNalBytesRemaining;
                if (i7 == 0) {
                    extractorInput.readFully(data, i6, i4);
                    this.sampleBytesRead += i4;
                    this.nalLength.setPosition(0);
                    int i8 = this.nalLength.readInt();
                    if (i8 < 0) {
                        throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.sampleCurrentNalBytesRemaining = i8;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, i5);
                    this.sampleBytesWritten += i5;
                    i3 += i6;
                } else {
                    int iSampleData = trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, i7, false);
                    this.sampleBytesRead += iSampleData;
                    this.sampleBytesWritten += iSampleData;
                    this.sampleCurrentNalBytesRemaining -= iSampleData;
                    i5 = 4;
                }
            }
        } else {
            if (androidx.media3.common.MimeTypes.AUDIO_AC4.equals(mp4Track.track.format.sampleMimeType)) {
                if (this.sampleBytesWritten == 0) {
                    androidx.media3.extractor.Ac4Util.getAc4SampleHeader(i3, this.scratch);
                    trackOutput.sampleData(this.scratch, 7);
                    this.sampleBytesWritten += 7;
                }
                i3 += 7;
            } else if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i9 = this.sampleBytesWritten;
                if (i9 >= i3) {
                    break;
                }
                int iSampleData2 = trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, i3 - i9, false);
                this.sampleBytesRead += iSampleData2;
                this.sampleBytesWritten += iSampleData2;
                this.sampleCurrentNalBytesRemaining -= iSampleData2;
            }
        }
        int i10 = i3;
        long j3 = mp4Track.sampleTable.timestampsUs[i2];
        int i11 = mp4Track.sampleTable.flags[i2];
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(trackOutput, j3, i11, i10, 0, null);
            if (i2 + 1 == mp4Track.sampleTable.sampleCount) {
                trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
            }
            i = 0;
        } else {
            i = 0;
            trackOutput.sampleMetadata(j3, i11, i10, 0, null);
        }
        mp4Track.sampleIndex++;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = i;
        this.sampleBytesWritten = i;
        this.sampleCurrentNalBytesRemaining = i;
        return i;
    }

    private int getTrackIndexOfNextReadSample(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] mp4TrackArr = this.tracks;
            if (i3 >= mp4TrackArr.length) {
                break;
            }
            androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track mp4Track = mp4TrackArr[i3];
            int i4 = mp4Track.sampleIndex;
            if (i4 != mp4Track.sampleTable.sampleCount) {
                long j5 = mp4Track.sampleTable.offsets[i4];
                long j6 = ((long[][]) androidx.media3.common.util.Util.castNonNull(this.accumulatedSampleSizes))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + MAXIMUM_READ_AHEAD_BYTES_STREAM) ? i2 : i;
    }

    private void updateSampleIndex(androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track mp4Track, long j) {
        androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j);
        }
        mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.fileType != 2 || (this.flags & 2) == 0) {
            return;
        }
        this.extractorOutput.track(0, 4).format(new androidx.media3.common.Format.Builder().setMetadata(this.motionPhotoMetadata == null ? null : new androidx.media3.common.Metadata(this.motionPhotoMetadata)).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET));
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        androidx.media3.extractor.mp4.AtomParsers.maybeSkipRemainingMetaAtomHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    private void processUnparsedAtom(long j) {
        if (this.atomType == 1836086884) {
            int i = this.atomHeaderBytesRead;
            this.motionPhotoMetadata = new androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata(0L, j, androidx.media3.common.C.TIME_UNSET, j + ((long) i), this.atomSize - ((long) i));
        }
    }

    private static long[][] calculateAccumulatedSampleSizes(androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length][];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i = 0; i < mp4TrackArr.length; i++) {
            jArr[i] = new long[mp4TrackArr[i].sampleTable.sampleCount];
            jArr2[i] = mp4TrackArr[i].sampleTable.timestampsUs[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < mp4TrackArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < mp4TrackArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) mp4TrackArr[i3].sampleTable.sizes[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = mp4TrackArr[i3].sampleTable.timestampsUs[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private static long maybeAdjustSeekOffset(androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable, long j, long j2) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j);
        return synchronizationSampleIndex == -1 ? j2 : java.lang.Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j2);
    }

    private static int getSynchronizationSampleIndex(androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable, long j) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j) : indexOfEarlierOrEqualSynchronizationSample;
    }

    private static int processFtypAtom(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int iBrandToFileType = brandToFileType(parsableByteArray.readInt());
        if (iBrandToFileType != 0) {
            return iBrandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int iBrandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (iBrandToFileType2 != 0) {
                return iBrandToFileType2;
            }
        }
        return 0;
    }

    private static final class Mp4Track {
        public int sampleIndex;
        public final androidx.media3.extractor.mp4.TrackSampleTable sampleTable;
        public final androidx.media3.extractor.mp4.Track track;
        public final androidx.media3.extractor.TrackOutput trackOutput;
        public final androidx.media3.extractor.TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(androidx.media3.extractor.mp4.Track track, androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable, androidx.media3.extractor.TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            this.trueHdSampleRechunker = androidx.media3.common.MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType) ? new androidx.media3.extractor.TrueHdSampleRechunker() : null;
        }
    }
}
