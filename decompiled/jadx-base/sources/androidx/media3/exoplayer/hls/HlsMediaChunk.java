package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class HlsMediaChunk extends androidx.media3.exoplayer.source.chunk.MediaChunk {
    public static final java.lang.String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final java.util.concurrent.atomic.AtomicInteger uidSource = new java.util.concurrent.atomic.AtomicInteger();
    public final int discontinuitySequenceNumber;
    private final androidx.media3.common.DrmInitData drmInitData;
    private androidx.media3.exoplayer.hls.HlsMediaChunkExtractor extractor;
    private final androidx.media3.exoplayer.hls.HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final androidx.media3.extractor.metadata.id3.Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;
    private final androidx.media3.datasource.DataSource initDataSource;
    private final androidx.media3.datasource.DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    private final boolean isPrimaryTimestampSource;
    private boolean isPublished;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;
    private final java.util.List<androidx.media3.common.Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private androidx.media3.exoplayer.hls.HlsSampleStreamWrapper output;
    public final int partIndex;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    public final android.net.Uri playlistUrl;
    private final androidx.media3.exoplayer.hls.HlsMediaChunkExtractor previousExtractor;
    private com.google.common.collect.ImmutableList<java.lang.Integer> sampleQueueFirstSampleIndices;
    private final androidx.media3.common.util.ParsableByteArray scratchId3Data;
    public final boolean shouldSpliceIn;
    private final androidx.media3.common.util.TimestampAdjuster timestampAdjuster;
    private final long timestampAdjusterInitializationTimeoutMs;
    public final int uid;

    public static androidx.media3.exoplayer.hls.HlsMediaChunk createInstance(androidx.media3.exoplayer.hls.HlsExtractorFactory hlsExtractorFactory, androidx.media3.datasource.DataSource dataSource, androidx.media3.common.Format format, long j, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder segmentBaseHolder, android.net.Uri uri, java.util.List<androidx.media3.common.Format> list, int i, java.lang.Object obj, boolean z, androidx.media3.exoplayer.hls.TimestampAdjusterProvider timestampAdjusterProvider, long j2, androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk, byte[] bArr, byte[] bArr2, boolean z2, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.exoplayer.upstream.CmcdData.Factory factory) {
        androidx.media3.datasource.DataSource dataSourceBuildDataSource;
        androidx.media3.datasource.DataSpec dataSpecBuild;
        boolean z3;
        androidx.media3.extractor.metadata.id3.Id3Decoder id3Decoder;
        androidx.media3.common.util.ParsableByteArray parsableByteArray;
        androidx.media3.exoplayer.hls.HlsMediaChunkExtractor hlsMediaChunkExtractor;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        androidx.media3.datasource.DataSpec dataSpecBuild2 = new androidx.media3.datasource.DataSpec.Builder().setUri(androidx.media3.common.util.UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segmentBase.url)).setPosition(segmentBase.byteRangeOffset).setLength(segmentBase.byteRangeLength).setFlags(segmentBaseHolder.isPreload ? 8 : 0).build();
        if (factory != null) {
            dataSpecBuild2 = factory.setChunkDurationUs(segmentBase.durationUs).createCmcdData().addToDataSpec(dataSpecBuild2);
        }
        androidx.media3.datasource.DataSpec dataSpec = dataSpecBuild2;
        boolean z4 = bArr != null;
        androidx.media3.datasource.DataSource dataSourceBuildDataSource2 = buildDataSource(dataSource, bArr, z4 ? getEncryptionIvArray((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(segmentBase.encryptionIV)) : null);
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z5 = bArr2 != null;
            byte[] encryptionIvArray = z5 ? getEncryptionIvArray((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(segment.encryptionIV)) : null;
            boolean z6 = z5;
            dataSpecBuild = new androidx.media3.datasource.DataSpec.Builder().setUri(androidx.media3.common.util.UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.url)).setPosition(segment.byteRangeOffset).setLength(segment.byteRangeLength).build();
            if (factory != null) {
                dataSpecBuild = factory.setObjectType(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT).createCmcdData().addToDataSpec(dataSpecBuild);
            }
            dataSourceBuildDataSource = buildDataSource(dataSource, bArr2, encryptionIvArray);
            z3 = z6;
        } else {
            dataSourceBuildDataSource = null;
            dataSpecBuild = null;
            z3 = false;
        }
        long j3 = j + segmentBase.relativeStartTimeUs;
        long j4 = j3 + segmentBase.durationUs;
        int i2 = hlsMediaPlaylist.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (hlsMediaChunk != null) {
            androidx.media3.datasource.DataSpec dataSpec2 = hlsMediaChunk.initDataSpec;
            boolean z7 = dataSpecBuild == dataSpec2 || (dataSpecBuild != null && dataSpec2 != null && dataSpecBuild.uri.equals(hlsMediaChunk.initDataSpec.uri) && dataSpecBuild.position == hlsMediaChunk.initDataSpec.position);
            boolean z8 = uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted;
            id3Decoder = hlsMediaChunk.id3Decoder;
            parsableByteArray = hlsMediaChunk.scratchId3Data;
            hlsMediaChunkExtractor = (z7 && z8 && !hlsMediaChunk.extractorInvalidated && hlsMediaChunk.discontinuitySequenceNumber == i2) ? hlsMediaChunk.extractor : null;
        } else {
            id3Decoder = new androidx.media3.extractor.metadata.id3.Id3Decoder();
            parsableByteArray = new androidx.media3.common.util.ParsableByteArray(10);
            hlsMediaChunkExtractor = null;
        }
        return new androidx.media3.exoplayer.hls.HlsMediaChunk(hlsExtractorFactory, dataSourceBuildDataSource2, dataSpec, format, z4, dataSourceBuildDataSource, dataSpecBuild, z3, uri, list, i, obj, j3, j4, segmentBaseHolder.mediaSequence, segmentBaseHolder.partIndex, !segmentBaseHolder.isPreload, i2, segmentBase.hasGapTag, z, timestampAdjusterProvider.getAdjuster(i2), j2, segmentBase.drmInitData, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z2, playerId);
    }

    public static boolean shouldSpliceIn(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk, android.net.Uri uri, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder segmentBaseHolder, long j) {
        if (hlsMediaChunk == null) {
            return false;
        }
        if (uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) {
            return false;
        }
        return !isIndependent(segmentBaseHolder, hlsMediaPlaylist) || j + segmentBaseHolder.segmentBase.relativeStartTimeUs < hlsMediaChunk.endTimeUs;
    }

    private HlsMediaChunk(androidx.media3.exoplayer.hls.HlsExtractorFactory hlsExtractorFactory, androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, boolean z, androidx.media3.datasource.DataSource dataSource2, androidx.media3.datasource.DataSpec dataSpec2, boolean z2, android.net.Uri uri, java.util.List<androidx.media3.common.Format> list, int i, java.lang.Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, long j4, androidx.media3.common.DrmInitData drmInitData, androidx.media3.exoplayer.hls.HlsMediaChunkExtractor hlsMediaChunkExtractor, androidx.media3.extractor.metadata.id3.Id3Decoder id3Decoder, androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z6, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j3);
        this.mediaSegmentEncrypted = z;
        this.partIndex = i2;
        this.isPublished = z3;
        this.discontinuitySequenceNumber = i3;
        this.initDataSpec = dataSpec2;
        this.initDataSource = dataSource2;
        this.initDataLoadRequired = dataSpec2 != null;
        this.initSegmentEncrypted = z2;
        this.playlistUrl = uri;
        this.isPrimaryTimestampSource = z5;
        this.timestampAdjuster = timestampAdjuster;
        this.timestampAdjusterInitializationTimeoutMs = j4;
        this.hasGapTag = z4;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = drmInitData;
        this.previousExtractor = hlsMediaChunkExtractor;
        this.id3Decoder = id3Decoder;
        this.scratchId3Data = parsableByteArray;
        this.shouldSpliceIn = z6;
        this.playerId = playerId;
        this.sampleQueueFirstSampleIndices = com.google.common.collect.ImmutableList.of();
        this.uid = uidSource.getAndIncrement();
    }

    public void init(androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper, com.google.common.collect.ImmutableList<java.lang.Integer> immutableList) {
        this.output = hlsSampleStreamWrapper;
        this.sampleQueueFirstSampleIndices = immutableList;
    }

    public int getFirstSampleIndex(int i) {
        androidx.media3.common.util.Assertions.checkState(!this.shouldSpliceIn);
        if (i >= this.sampleQueueFirstSampleIndices.size()) {
            return 0;
        }
        return this.sampleQueueFirstSampleIndices.get(i).intValue();
    }

    public void invalidateExtractor() {
        this.extractorInvalidated = true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() throws java.io.IOException {
        androidx.media3.exoplayer.hls.HlsMediaChunkExtractor hlsMediaChunkExtractor;
        androidx.media3.common.util.Assertions.checkNotNull(this.output);
        if (this.extractor == null && (hlsMediaChunkExtractor = this.previousExtractor) != null && hlsMediaChunkExtractor.isReusable()) {
            this.extractor = this.previousExtractor;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = !this.loadCanceled;
    }

    public boolean isPublished() {
        return this.isPublished;
    }

    public void publish() {
        this.isPublished = true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void maybeLoadInitData() throws java.io.IOException {
        if (this.initDataLoadRequired) {
            androidx.media3.common.util.Assertions.checkNotNull(this.initDataSource);
            androidx.media3.common.util.Assertions.checkNotNull(this.initDataSpec);
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted, false);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void loadMedia() throws java.io.IOException {
        feedDataToExtractor(this.dataSource, this.dataSpec, this.mediaSegmentEncrypted, true);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void feedDataToExtractor(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z, boolean z2) throws java.io.IOException {
        androidx.media3.datasource.DataSpec dataSpecSubrange;
        long position;
        long j;
        boolean z3 = false;
        if (z) {
            z3 = this.nextLoadPosition != 0;
            dataSpecSubrange = dataSpec;
        } else {
            dataSpecSubrange = dataSpec.subrange(this.nextLoadPosition);
        }
        try {
            androidx.media3.extractor.DefaultExtractorInput defaultExtractorInputPrepareExtraction = prepareExtraction(dataSource, dataSpecSubrange, z2);
            if (z3) {
                defaultExtractorInputPrepareExtraction.skipFully(this.nextLoadPosition);
            }
            while (!this.loadCanceled && this.extractor.read(defaultExtractorInputPrepareExtraction)) {
                try {
                    try {
                    } catch (java.io.EOFException e) {
                        if ((this.trackFormat.roleFlags & 16384) != 0) {
                            this.extractor.onTruncatedSegmentParsed();
                            position = defaultExtractorInputPrepareExtraction.getPosition();
                            j = dataSpec.position;
                        } else {
                            throw e;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    this.nextLoadPosition = (int) (defaultExtractorInputPrepareExtraction.getPosition() - dataSpec.position);
                    throw th;
                }
            }
            position = defaultExtractorInputPrepareExtraction.getPosition();
            j = dataSpec.position;
            this.nextLoadPosition = (int) (position - j);
            androidx.media3.datasource.DataSourceUtil.closeQuietly(dataSource);
        } catch (java.lang.Throwable th2) {
            androidx.media3.datasource.DataSourceUtil.closeQuietly(dataSource);
            throw th2;
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractor"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private androidx.media3.extractor.DefaultExtractorInput prepareExtraction(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z) throws java.io.IOException {
        androidx.media3.exoplayer.hls.HlsMediaChunkExtractor hlsMediaChunkExtractorCreateExtractor;
        long jAdjustTsTimestamp;
        long jOpen = dataSource.open(dataSpec);
        if (z) {
            try {
                this.timestampAdjuster.sharedInitializeOrWait(this.isPrimaryTimestampSource, this.startTimeUs, this.timestampAdjusterInitializationTimeoutMs);
            } catch (java.lang.InterruptedException unused) {
                throw new java.io.InterruptedIOException();
            } catch (java.util.concurrent.TimeoutException e) {
                throw new java.io.IOException(e);
            }
        }
        androidx.media3.extractor.DefaultExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(dataSource, dataSpec.position, jOpen);
        if (this.extractor == null) {
            long jPeekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            androidx.media3.exoplayer.hls.HlsMediaChunkExtractor hlsMediaChunkExtractor = this.previousExtractor;
            if (hlsMediaChunkExtractor != null) {
                hlsMediaChunkExtractorCreateExtractor = hlsMediaChunkExtractor.recreate();
            } else {
                hlsMediaChunkExtractorCreateExtractor = this.extractorFactory.createExtractor(dataSpec.uri, this.trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput, this.playerId);
            }
            this.extractor = hlsMediaChunkExtractorCreateExtractor;
            if (hlsMediaChunkExtractorCreateExtractor.isPackedAudioExtractor()) {
                androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper = this.output;
                if (jPeekId3PrivTimestamp != androidx.media3.common.C.TIME_UNSET) {
                    jAdjustTsTimestamp = this.timestampAdjuster.adjustTsTimestamp(jPeekId3PrivTimestamp);
                } else {
                    jAdjustTsTimestamp = this.startTimeUs;
                }
                hlsSampleStreamWrapper.setSampleOffsetUs(jAdjustTsTimestamp);
            } else {
                this.output.setSampleOffsetUs(0L);
            }
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return defaultExtractorInput;
    }

    private long peekId3PrivTimestamp(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        extractorInput.resetPeekPosition();
        try {
            this.scratchId3Data.reset(10);
            extractorInput.peekFully(this.scratchId3Data.getData(), 0, 10);
            if (this.scratchId3Data.readUnsignedInt24() != 4801587) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            this.scratchId3Data.skipBytes(3);
            int synchSafeInt = this.scratchId3Data.readSynchSafeInt();
            int i = synchSafeInt + 10;
            if (i > this.scratchId3Data.capacity()) {
                byte[] data = this.scratchId3Data.getData();
                this.scratchId3Data.reset(i);
                java.lang.System.arraycopy(data, 0, this.scratchId3Data.getData(), 0, 10);
            }
            extractorInput.peekFully(this.scratchId3Data.getData(), 10, synchSafeInt);
            androidx.media3.common.Metadata metadataDecode = this.id3Decoder.decode(this.scratchId3Data.getData(), synchSafeInt);
            if (metadataDecode == null) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            int length = metadataDecode.length();
            for (int i2 = 0; i2 < length; i2++) {
                androidx.media3.common.Metadata.Entry entry = metadataDecode.get(i2);
                if (entry instanceof androidx.media3.extractor.metadata.id3.PrivFrame) {
                    androidx.media3.extractor.metadata.id3.PrivFrame privFrame = (androidx.media3.extractor.metadata.id3.PrivFrame) entry;
                    if (PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.owner)) {
                        java.lang.System.arraycopy(privFrame.privateData, 0, this.scratchId3Data.getData(), 0, 8);
                        this.scratchId3Data.setPosition(0);
                        this.scratchId3Data.setLimit(8);
                        return this.scratchId3Data.readLong() & 8589934591L;
                    }
                }
            }
            return androidx.media3.common.C.TIME_UNSET;
        } catch (java.io.EOFException unused) {
        }
    }

    private static byte[] getEncryptionIvArray(java.lang.String str) {
        if (com.google.common.base.Ascii.toLowerCase(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new java.math.BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        java.lang.System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static androidx.media3.datasource.DataSource buildDataSource(androidx.media3.datasource.DataSource dataSource, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return dataSource;
        }
        androidx.media3.common.util.Assertions.checkNotNull(bArr2);
        return new androidx.media3.exoplayer.hls.Aes128DataSource(dataSource, bArr, bArr2);
    }

    private static boolean isIndependent(androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder segmentBaseHolder, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        if (segmentBaseHolder.segmentBase instanceof androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part) {
            return ((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part) segmentBaseHolder.segmentBase).isIndependent || (segmentBaseHolder.partIndex == 0 && hlsMediaPlaylist.hasIndependentSegments);
        }
        return hlsMediaPlaylist.hasIndependentSegments;
    }
}
