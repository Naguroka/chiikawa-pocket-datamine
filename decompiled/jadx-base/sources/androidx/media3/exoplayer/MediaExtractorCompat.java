package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class MediaExtractorCompat {
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    private static final java.lang.String TAG = "MediaExtractorCompat";
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private androidx.media3.datasource.DataSource currentDataSource;
    private androidx.media3.extractor.Extractor currentExtractor;
    private androidx.media3.extractor.ExtractorInput currentExtractorInput;
    private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private final androidx.media3.extractor.ExtractorsFactory extractorsFactory;
    private final androidx.media3.exoplayer.FormatHolder formatHolder;
    private boolean hasBeenPrepared;
    private final androidx.media3.decoder.DecoderInputBuffer noDataBuffer;
    private long offsetInCurrentFile;
    private androidx.media3.extractor.SeekPoint pendingSeek;
    private final androidx.media3.extractor.PositionHolder positionHolder;
    private final androidx.media3.decoder.DecoderInputBuffer sampleHolder;
    private final android.util.SparseArray<androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorSampleQueue> sampleQueues;
    private androidx.media3.extractor.SeekMap seekMap;
    private final java.util.Set<java.lang.Integer> selectedTrackIndices;
    private final java.util.ArrayDeque<java.lang.Integer> trackIndicesPerSampleInQueuedOrder;
    private final java.util.ArrayList<androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorTrack> tracks;
    private boolean tracksEnded;
    private int upstreamFormatsCount;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }

    public MediaExtractorCompat(android.content.Context context) {
        this(new androidx.media3.extractor.DefaultExtractorsFactory(), new androidx.media3.datasource.DefaultDataSource.Factory(context));
    }

    public MediaExtractorCompat(androidx.media3.extractor.ExtractorsFactory extractorsFactory, androidx.media3.datasource.DataSource.Factory factory) {
        this.extractorsFactory = extractorsFactory;
        this.dataSourceFactory = factory;
        this.positionHolder = new androidx.media3.extractor.PositionHolder();
        this.allocator = new androidx.media3.exoplayer.upstream.DefaultAllocator(true, 65536);
        this.tracks = new java.util.ArrayList<>();
        this.sampleQueues = new android.util.SparseArray<>();
        this.trackIndicesPerSampleInQueuedOrder = new java.util.ArrayDeque<>();
        this.formatHolder = new androidx.media3.exoplayer.FormatHolder();
        this.sampleHolder = new androidx.media3.decoder.DecoderInputBuffer(0);
        this.noDataBuffer = androidx.media3.decoder.DecoderInputBuffer.newNoDataInstance();
        this.selectedTrackIndices = new java.util.HashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDataSource(android.net.Uri uri, long j) throws java.io.IOException {
        int i;
        androidx.media3.common.util.Assertions.checkState(!this.hasBeenPrepared);
        this.hasBeenPrepared = true;
        this.offsetInCurrentFile = j;
        androidx.media3.datasource.DataSpec dataSpecBuildDataSpec = buildDataSpec(uri, j);
        androidx.media3.datasource.DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
        this.currentDataSource = dataSourceCreateDataSource;
        androidx.media3.extractor.ExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(this.currentDataSource, 0L, dataSourceCreateDataSource.open(dataSpecBuildDataSpec));
        androidx.media3.extractor.Extractor extractorSelectExtractor = selectExtractor(defaultExtractorInput);
        java.lang.Throwable e = null;
        extractorSelectExtractor.init(new androidx.media3.exoplayer.MediaExtractorCompat.ExtractorOutputImpl());
        boolean z = true;
        while (z) {
            try {
                i = extractorSelectExtractor.read(defaultExtractorInput, this.positionHolder);
            } catch (java.lang.Exception | java.lang.OutOfMemoryError e2) {
                e = e2;
                i = -1;
            }
            boolean z2 = !this.tracksEnded || this.upstreamFormatsCount < this.sampleQueues.size() || this.seekMap == null;
            if (e != null || (z2 && i == -1)) {
                release();
                throw androidx.media3.common.ParserException.createForMalformedContainer(e != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e);
            }
            if (i == 1) {
                defaultExtractorInput = reopenCurrentDataSource(this.positionHolder.position);
            }
            z = z2;
        }
        this.currentExtractorInput = defaultExtractorInput;
        this.currentExtractor = extractorSelectExtractor;
    }

    public void release() {
        for (int i = 0; i < this.sampleQueues.size(); i++) {
            this.sampleQueues.valueAt(i).release();
        }
        this.sampleQueues.clear();
        androidx.media3.extractor.Extractor extractor = this.currentExtractor;
        if (extractor != null) {
            extractor.release();
            this.currentExtractor = null;
        }
        this.currentExtractorInput = null;
        this.pendingSeek = null;
        androidx.media3.datasource.DataSourceUtil.closeQuietly(this.currentDataSource);
        this.currentDataSource = null;
    }

    public int getTrackCount() {
        return this.tracks.size();
    }

    public android.media.MediaFormat getTrackFormat(int i) {
        return this.tracks.get(i).createDownstreamMediaFormat(this.formatHolder, this.noDataBuffer);
    }

    public void selectTrack(int i) {
        this.selectedTrackIndices.add(java.lang.Integer.valueOf(i));
    }

    public void unselectTrack(int i) {
        this.selectedTrackIndices.remove(java.lang.Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    public void seekTo(long j, int i) {
        androidx.media3.extractor.SeekMap.SeekPoints seekPoints;
        androidx.media3.extractor.SeekPoint seekPoint;
        if (this.seekMap == null) {
            return;
        }
        if (this.selectedTrackIndices.size() == 1) {
            androidx.media3.extractor.Extractor extractor = this.currentExtractor;
            if (extractor instanceof androidx.media3.extractor.mp4.Mp4Extractor) {
                seekPoints = ((androidx.media3.extractor.mp4.Mp4Extractor) extractor).getSeekPoints(j, this.tracks.get(this.selectedTrackIndices.iterator().next().intValue()).getIdOfBackingTrack());
            } else {
                seekPoints = this.seekMap.getSeekPoints(j);
            }
        } else {
            seekPoints = this.seekMap.getSeekPoints(j);
        }
        if (i == 0) {
            seekPoint = seekPoints.first;
        } else if (i == 1) {
            seekPoint = seekPoints.second;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalArgumentException();
            }
            if (java.lang.Math.abs(j - seekPoints.second.timeUs) < java.lang.Math.abs(j - seekPoints.first.timeUs)) {
                seekPoint = seekPoints.second;
            } else {
                seekPoint = seekPoints.first;
            }
        }
        this.trackIndicesPerSampleInQueuedOrder.clear();
        for (int i2 = 0; i2 < this.sampleQueues.size(); i2++) {
            this.sampleQueues.valueAt(i2).reset();
        }
        this.pendingSeek = seekPoint;
    }

    public boolean advance() {
        if (!advanceToSampleOrEndOfInput()) {
            return false;
        }
        skipOneSample();
        return advanceToSampleOrEndOfInput();
    }

    public int readSampleData(java.nio.ByteBuffer byteBuffer, int i) {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        byteBuffer.position(i);
        byteBuffer.limit(byteBuffer.capacity());
        this.sampleHolder.data = byteBuffer;
        peekNextSelectedTrackSample(this.sampleHolder, false);
        byteBuffer.flip();
        byteBuffer.position(i);
        this.sampleHolder.data = null;
        return byteBuffer.remaining();
    }

    public int getSampleTrackIndex() {
        if (advanceToSampleOrEndOfInput()) {
            return this.trackIndicesPerSampleInQueuedOrder.peekFirst().intValue();
        }
        return -1;
    }

    public long getSampleTime() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1L;
        }
        peekNextSelectedTrackSample(this.noDataBuffer, true);
        return this.noDataBuffer.timeUs;
    }

    public int getSampleFlags() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        peekNextSelectedTrackSample(this.noDataBuffer, true);
        return (this.noDataBuffer.isEncrypted() ? 2 : 0) | 0 | (this.noDataBuffer.isKeyFrame() ? 1 : 0);
    }

    public androidx.media3.exoplayer.upstream.Allocator getAllocator() {
        return this.allocator;
    }

    private void peekNextSelectedTrackSample(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, boolean z) {
        androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorTrack mediaExtractorTrack = this.tracks.get(((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(this.trackIndicesPerSampleInQueuedOrder.peekFirst())).intValue());
        androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorSampleQueue mediaExtractorSampleQueue = mediaExtractorTrack.sampleQueue;
        int i = (z ? 4 : 0) | 1;
        int i2 = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, i, false);
        if (i2 == -5) {
            i2 = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, i, false);
        }
        this.formatHolder.clear();
        if (i2 != -4) {
            throw new java.lang.IllegalStateException(androidx.media3.common.util.Util.formatInvariant("Sample read result: %s\nTrack sample: %s\nTrackIndicesPerSampleInQueuedOrder: %s\nTracks added: %s\n", java.lang.Integer.valueOf(i2), mediaExtractorTrack, this.trackIndicesPerSampleInQueuedOrder, this.tracks));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    private androidx.media3.extractor.Extractor selectExtractor(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.Extractor[] extractorArrCreateExtractors = this.extractorsFactory.createExtractors();
        for (androidx.media3.extractor.Extractor extractor : extractorArrCreateExtractors) {
            try {
                if (extractor.sniff(extractorInput)) {
                    extractorInput.resetPeekPosition();
                    if (extractor != null) {
                        return extractor;
                    }
                    throw new androidx.media3.exoplayer.source.UnrecognizedInputFormatException("None of the available extractors (" + com.google.common.base.Joiner.on(", ").join(com.google.common.collect.Lists.transform(com.google.common.collect.ImmutableList.copyOf(extractorArrCreateExtractors), new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.MediaExtractorCompat$$ExternalSyntheticLambda0
                        @Override // com.google.common.base.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return ((androidx.media3.extractor.Extractor) obj).getUnderlyingImplementation().getClass().getSimpleName();
                        }
                    })) + ") could read the stream.", (android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull(((androidx.media3.datasource.DataSource) androidx.media3.common.util.Assertions.checkNotNull(this.currentDataSource)).getUri()), com.google.common.collect.ImmutableList.of());
                }
                extractorInput.resetPeekPosition();
            } catch (java.io.EOFException unused) {
            } catch (java.lang.Throwable th) {
                extractorInput.resetPeekPosition();
                throw th;
            }
        }
        extractor = null;
        if (extractor != null) {
            return extractor;
        }
        throw new androidx.media3.exoplayer.source.UnrecognizedInputFormatException("None of the available extractors (" + com.google.common.base.Joiner.on(", ").join(com.google.common.collect.Lists.transform(com.google.common.collect.ImmutableList.copyOf(extractorArrCreateExtractors), new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.MediaExtractorCompat$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.extractor.Extractor) obj).getUnderlyingImplementation().getClass().getSimpleName();
            }
        })) + ") could read the stream.", (android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull(((androidx.media3.datasource.DataSource) androidx.media3.common.util.Assertions.checkNotNull(this.currentDataSource)).getUri()), com.google.common.collect.ImmutableList.of());
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"trackIndicesPerSampleInQueuedOrder.peekFirst()"}, result = true)
    private boolean advanceToSampleOrEndOfInput() {
        try {
            maybeResolvePendingSeek();
            boolean z = false;
            while (true) {
                if (this.trackIndicesPerSampleInQueuedOrder.isEmpty()) {
                    if (z) {
                        return false;
                    }
                    try {
                        int i = ((androidx.media3.extractor.Extractor) androidx.media3.common.util.Assertions.checkNotNull(this.currentExtractor)).read((androidx.media3.extractor.ExtractorInput) androidx.media3.common.util.Assertions.checkNotNull(this.currentExtractorInput), this.positionHolder);
                        if (i == -1) {
                            z = true;
                        } else if (i == 1) {
                            this.currentExtractorInput = reopenCurrentDataSource(this.positionHolder.position);
                        }
                    } catch (java.lang.Exception | java.lang.OutOfMemoryError e) {
                        androidx.media3.common.util.Log.w(TAG, "Treating exception as the end of input.", e);
                    }
                } else {
                    if (this.selectedTrackIndices.contains(this.trackIndicesPerSampleInQueuedOrder.peekFirst())) {
                        return true;
                    }
                    skipOneSample();
                }
            }
        } catch (java.io.IOException e2) {
            androidx.media3.common.util.Log.w(TAG, "Treating exception as the end of input.", e2);
            return false;
        }
    }

    private void skipOneSample() {
        androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorTrack mediaExtractorTrack = this.tracks.get(this.trackIndicesPerSampleInQueuedOrder.removeFirst().intValue());
        if (mediaExtractorTrack.isCompatibilityTrack) {
            return;
        }
        mediaExtractorTrack.discardFrontSample();
    }

    private androidx.media3.extractor.ExtractorInput reopenCurrentDataSource(long j) throws java.io.IOException {
        androidx.media3.datasource.DataSource dataSource = (androidx.media3.datasource.DataSource) androidx.media3.common.util.Assertions.checkNotNull(this.currentDataSource);
        android.net.Uri uri = (android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull(dataSource.getUri());
        androidx.media3.datasource.DataSourceUtil.closeQuietly(dataSource);
        long jOpen = dataSource.open(buildDataSpec(uri, this.offsetInCurrentFile + j));
        if (jOpen != -1) {
            jOpen += j;
        }
        return new androidx.media3.extractor.DefaultExtractorInput(dataSource, j, jOpen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void onSampleQueueFormatInitialized(androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorSampleQueue mediaExtractorSampleQueue, androidx.media3.common.Format format) {
        boolean z = true;
        this.upstreamFormatsCount++;
        mediaExtractorSampleQueue.setMainTrackIndex(this.tracks.size());
        java.lang.Object[] objArr = 0;
        this.tracks.add(new androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorTrack(mediaExtractorSampleQueue, false, null));
        java.lang.String alternativeCodecMimeType = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType != null) {
            mediaExtractorSampleQueue.setCompatibilityTrackIndex(this.tracks.size());
            this.tracks.add(new androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorTrack(mediaExtractorSampleQueue, z, alternativeCodecMimeType));
        }
    }

    private void maybeResolvePendingSeek() throws java.io.IOException {
        androidx.media3.extractor.SeekPoint seekPoint = this.pendingSeek;
        if (seekPoint == null) {
            return;
        }
        androidx.media3.extractor.SeekPoint seekPoint2 = (androidx.media3.extractor.SeekPoint) androidx.media3.common.util.Assertions.checkNotNull(seekPoint);
        ((androidx.media3.extractor.Extractor) androidx.media3.common.util.Assertions.checkNotNull(this.currentExtractor)).seek(seekPoint2.position, seekPoint2.timeUs);
        this.currentExtractorInput = reopenCurrentDataSource(seekPoint2.position);
        this.pendingSeek = null;
    }

    private static androidx.media3.datasource.DataSpec buildDataSpec(android.net.Uri uri, long j) {
        return new androidx.media3.datasource.DataSpec.Builder().setUri(uri).setPosition(j).setFlags(6).build();
    }

    private final class ExtractorOutputImpl implements androidx.media3.extractor.ExtractorOutput {
        private ExtractorOutputImpl() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public androidx.media3.extractor.TrackOutput track(int i, int i2) {
            androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorSampleQueue mediaExtractorSampleQueue = (androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorSampleQueue) androidx.media3.exoplayer.MediaExtractorCompat.this.sampleQueues.get(i);
            if (mediaExtractorSampleQueue != null) {
                return mediaExtractorSampleQueue;
            }
            if (androidx.media3.exoplayer.MediaExtractorCompat.this.tracksEnded) {
                return new androidx.media3.extractor.DiscardingTrackOutput();
            }
            androidx.media3.exoplayer.MediaExtractorCompat mediaExtractorCompat = androidx.media3.exoplayer.MediaExtractorCompat.this;
            androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorSampleQueue mediaExtractorSampleQueue2 = mediaExtractorCompat.new MediaExtractorSampleQueue(mediaExtractorCompat.allocator, i);
            androidx.media3.exoplayer.MediaExtractorCompat.this.sampleQueues.put(i, mediaExtractorSampleQueue2);
            return mediaExtractorSampleQueue2;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            androidx.media3.exoplayer.MediaExtractorCompat.this.tracksEnded = true;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
            androidx.media3.exoplayer.MediaExtractorCompat.this.seekMap = seekMap;
        }
    }

    private static final class MediaExtractorTrack {
        public final java.lang.String compatibilityTrackMimeType;
        public final boolean isCompatibilityTrack;
        public final androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorSampleQueue sampleQueue;

        private MediaExtractorTrack(androidx.media3.exoplayer.MediaExtractorCompat.MediaExtractorSampleQueue mediaExtractorSampleQueue, boolean z, java.lang.String str) {
            this.sampleQueue = mediaExtractorSampleQueue;
            this.isCompatibilityTrack = z;
            this.compatibilityTrackMimeType = str;
        }

        public android.media.MediaFormat createDownstreamMediaFormat(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
            formatHolder.clear();
            this.sampleQueue.read(formatHolder, decoderInputBuffer, 2, false);
            android.media.MediaFormat mediaFormatCreateMediaFormatFromFormat = androidx.media3.common.util.MediaFormatUtil.createMediaFormatFromFormat((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format));
            formatHolder.clear();
            if (this.compatibilityTrackMimeType != null) {
                if (androidx.media3.common.util.Util.SDK_INT >= 29) {
                    mediaFormatCreateMediaFormatFromFormat.removeKey("codecs-string");
                }
                mediaFormatCreateMediaFormatFromFormat.setString("mime", this.compatibilityTrackMimeType);
            }
            return mediaFormatCreateMediaFormatFromFormat;
        }

        public void discardFrontSample() {
            this.sampleQueue.skip(1);
            this.sampleQueue.discardToRead();
        }

        public int getIdOfBackingTrack() {
            return this.sampleQueue.trackId;
        }

        public java.lang.String toString() {
            return java.lang.String.format("MediaExtractorSampleQueue: %s, isCompatibilityTrack: %s, compatibilityTrackMimeType: %s", this.sampleQueue, java.lang.Boolean.valueOf(this.isCompatibilityTrack), this.compatibilityTrackMimeType);
        }
    }

    private final class MediaExtractorSampleQueue extends androidx.media3.exoplayer.source.SampleQueue {
        private int compatibilityTrackIndex;
        private int mainTrackIndex;
        public final int trackId;

        public MediaExtractorSampleQueue(androidx.media3.exoplayer.upstream.Allocator allocator, int i) {
            super(allocator, null, null);
            this.trackId = i;
            this.mainTrackIndex = -1;
            this.compatibilityTrackIndex = -1;
        }

        public void setMainTrackIndex(int i) {
            this.mainTrackIndex = i;
        }

        public void setCompatibilityTrackIndex(int i) {
            this.compatibilityTrackIndex = i;
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public androidx.media3.common.Format getAdjustedUpstreamFormat(androidx.media3.common.Format format) {
            if (getUpstreamFormat() == null) {
                androidx.media3.exoplayer.MediaExtractorCompat.this.onSampleQueueFormatInitialized(this, format);
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
            int i4 = i & (-536870913);
            if (this.compatibilityTrackIndex != -1) {
                androidx.media3.exoplayer.MediaExtractorCompat.this.trackIndicesPerSampleInQueuedOrder.addLast(java.lang.Integer.valueOf(this.compatibilityTrackIndex));
            }
            androidx.media3.common.util.Assertions.checkState(this.mainTrackIndex != -1);
            androidx.media3.exoplayer.MediaExtractorCompat.this.trackIndicesPerSampleInQueuedOrder.addLast(java.lang.Integer.valueOf(this.mainTrackIndex));
            super.sampleMetadata(j, i4, i2, i3, cryptoData);
        }

        public java.lang.String toString() {
            return java.lang.String.format("trackId: %s, mainTrackIndex: %s, compatibilityTrackIndex: %s", java.lang.Integer.valueOf(this.trackId), java.lang.Integer.valueOf(this.mainTrackIndex), java.lang.Integer.valueOf(this.compatibilityTrackIndex));
        }
    }
}
