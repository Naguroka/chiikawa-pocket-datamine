package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class HlsSampleStreamWrapper implements androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.source.chunk.Chunk>, androidx.media3.exoplayer.upstream.Loader.ReleaseCallback, androidx.media3.exoplayer.source.SequenceableLoader, androidx.media3.extractor.ExtractorOutput, androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener {
    private static final java.util.Set<java.lang.Integer> MAPPABLE_TYPES = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(1, 2, 5)));
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
    public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
    private static final java.lang.String TAG = "HlsSampleStreamWrapper";
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private final androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback callback;
    private final androidx.media3.exoplayer.hls.HlsChunkSource chunkSource;
    private androidx.media3.common.Format downstreamTrackFormat;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private androidx.media3.common.DrmInitData drmInitData;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private androidx.media3.extractor.TrackOutput emsgUnwrappingTrackOutput;
    private int enabledTrackGroupCount;
    private final android.os.Handler handler;
    private boolean haveAudioVideoSampleQueues;
    private final java.util.ArrayList<androidx.media3.exoplayer.hls.HlsSampleStream> hlsSampleStreams;
    private long lastSeekPositionUs;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private androidx.media3.exoplayer.source.chunk.Chunk loadingChunk;
    private boolean loadingFinished;
    private final java.lang.Runnable maybeFinishPrepareRunnable;
    private final java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> mediaChunks;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final int metadataType;
    private final androidx.media3.common.Format muxedAudioFormat;
    private final java.lang.Runnable onTracksEndedRunnable;
    private java.util.Set<androidx.media3.common.TrackGroup> optionalTrackGroups;
    private final java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> overridingDrmInitData;
    private long pendingResetPositionUs;
    private boolean pendingResetUpstreamFormats;
    private boolean prepared;
    private int primarySampleQueueIndex;
    private int primarySampleQueueType;
    private int primaryTrackGroupIndex;
    private final java.util.List<androidx.media3.exoplayer.hls.HlsMediaChunk> readOnlyMediaChunks;
    private boolean released;
    private long sampleOffsetUs;
    private android.util.SparseIntArray sampleQueueIndicesByType;
    private boolean[] sampleQueueIsAudioVideoFlags;
    private java.util.Set<java.lang.Integer> sampleQueueMappingDoneByType;
    private androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private boolean[] sampleQueuesEnabledStates;
    private boolean seenFirstTrackSelection;
    private androidx.media3.exoplayer.hls.HlsMediaChunk sourceChunk;
    private int[] trackGroupToSampleQueueIndex;
    private androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
    private final int trackType;
    private boolean tracksEnded;
    private final java.lang.String uid;
    private androidx.media3.common.Format upstreamTrackFormat;
    private final androidx.media3.exoplayer.upstream.Loader loader = new androidx.media3.exoplayer.upstream.Loader("Loader:HlsSampleStreamWrapper");
    private final androidx.media3.exoplayer.hls.HlsChunkSource.HlsChunkHolder nextChunkHolder = new androidx.media3.exoplayer.hls.HlsChunkSource.HlsChunkHolder();
    private int[] sampleQueueTrackIds = new int[0];

    public interface Callback extends androidx.media3.exoplayer.source.SequenceableLoader.Callback<androidx.media3.exoplayer.hls.HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(android.net.Uri uri);

        void onPrepared();
    }

    private static int getTrackTypeScore(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
    }

    public HlsSampleStreamWrapper(java.lang.String str, int i, androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback callback, androidx.media3.exoplayer.hls.HlsChunkSource hlsChunkSource, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map, androidx.media3.exoplayer.upstream.Allocator allocator, long j, androidx.media3.common.Format format, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2, int i2) {
        this.uid = str;
        this.trackType = i;
        this.callback = callback;
        this.chunkSource = hlsChunkSource;
        this.overridingDrmInitData = map;
        this.allocator = allocator;
        this.muxedAudioFormat = format;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.metadataType = i2;
        java.util.Set<java.lang.Integer> set = MAPPABLE_TYPES;
        this.sampleQueueMappingDoneByType = new java.util.HashSet(set.size());
        this.sampleQueueIndicesByType = new android.util.SparseIntArray(set.size());
        this.sampleQueues = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[0];
        this.sampleQueueIsAudioVideoFlags = new boolean[0];
        this.sampleQueuesEnabledStates = new boolean[0];
        java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> arrayList = new java.util.ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = java.util.Collections.unmodifiableList(arrayList);
        this.hlsSampleStreams = new java.util.ArrayList<>();
        this.maybeFinishPrepareRunnable = new java.lang.Runnable() { // from class: androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.maybeFinishPrepare();
            }
        };
        this.onTracksEndedRunnable = new java.lang.Runnable() { // from class: androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onTracksEnded();
            }
        };
        this.handler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
        this.lastSeekPositionUs = j;
        this.pendingResetPositionUs = j;
    }

    public void continuePreparing() {
        if (this.prepared) {
            return;
        }
        continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
    }

    public void prepareWithMultivariantPlaylistInfo(androidx.media3.common.TrackGroup[] trackGroupArr, int i, int... iArr) {
        this.trackGroups = createTrackGroupArrayWithDrmInfo(trackGroupArr);
        this.optionalTrackGroups = new java.util.HashSet();
        for (int i2 : iArr) {
            this.optionalTrackGroups.add(this.trackGroups.get(i2));
        }
        this.primaryTrackGroupIndex = i;
        android.os.Handler handler = this.handler;
        final androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback callback = this.callback;
        java.util.Objects.requireNonNull(callback);
        handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                callback.onPrepared();
            }
        });
        setIsPrepared();
    }

    public void maybeThrowPrepareError() throws java.io.IOException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        assertIsPrepared();
        return this.trackGroups;
    }

    public int getPrimaryTrackGroupIndex() {
        return this.primaryTrackGroupIndex;
    }

    public int bindSampleQueueToSampleStream(int i) {
        assertIsPrepared();
        androidx.media3.common.util.Assertions.checkNotNull(this.trackGroupToSampleQueueIndex);
        int i2 = this.trackGroupToSampleQueueIndex[i];
        if (i2 == -1) {
            return this.optionalTrackGroups.contains(this.trackGroups.get(i)) ? -3 : -2;
        }
        boolean[] zArr = this.sampleQueuesEnabledStates;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    public void unbindSampleQueue(int i) {
        assertIsPrepared();
        androidx.media3.common.util.Assertions.checkNotNull(this.trackGroupToSampleQueueIndex);
        int i2 = this.trackGroupToSampleQueueIndex[i];
        androidx.media3.common.util.Assertions.checkState(this.sampleQueuesEnabledStates[i2]);
        this.sampleQueuesEnabledStates[i2] = false;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x012c  */
    public boolean selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j, boolean z) {
        boolean z2;
        boolean z3;
        assertIsPrepared();
        int i = this.enabledTrackGroupCount;
        int i2 = 0;
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            androidx.media3.exoplayer.hls.HlsSampleStream hlsSampleStream = (androidx.media3.exoplayer.hls.HlsSampleStream) sampleStreamArr[i3];
            if (hlsSampleStream != null && (exoTrackSelectionArr[i3] == null || !zArr[i3])) {
                this.enabledTrackGroupCount--;
                hlsSampleStream.unbindSampleQueue();
                sampleStreamArr[i3] = null;
            }
        }
        boolean z4 = z || (!this.seenFirstTrackSelection ? j == this.lastSeekPositionUs : i != 0);
        androidx.media3.exoplayer.trackselection.ExoTrackSelection trackSelection = this.chunkSource.getTrackSelection();
        boolean z5 = z4;
        androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = trackSelection;
        for (int i4 = 0; i4 < exoTrackSelectionArr.length; i4++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr[i4];
            if (exoTrackSelection2 != null) {
                int iIndexOf = this.trackGroups.indexOf(exoTrackSelection2.getTrackGroup());
                if (iIndexOf == this.primaryTrackGroupIndex) {
                    this.chunkSource.setTrackSelection(exoTrackSelection2);
                    exoTrackSelection = exoTrackSelection2;
                }
                if (sampleStreamArr[i4] == null) {
                    this.enabledTrackGroupCount++;
                    androidx.media3.exoplayer.hls.HlsSampleStream hlsSampleStream2 = new androidx.media3.exoplayer.hls.HlsSampleStream(this, iIndexOf);
                    sampleStreamArr[i4] = hlsSampleStream2;
                    zArr2[i4] = true;
                    if (this.trackGroupToSampleQueueIndex != null) {
                        hlsSampleStream2.bindSampleQueue();
                        if (!z5) {
                            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue = this.sampleQueues[this.trackGroupToSampleQueueIndex[iIndexOf]];
                            z5 = (hlsSampleQueue.getReadIndex() == 0 || hlsSampleQueue.seekTo(j, true)) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.enabledTrackGroupCount == 0) {
            this.chunkSource.reset();
            this.downstreamTrackFormat = null;
            this.pendingResetUpstreamFormats = true;
            this.mediaChunks.clear();
            if (this.loader.isLoading()) {
                if (this.sampleQueuesBuilt) {
                    androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
                    int length = hlsSampleQueueArr.length;
                    while (i2 < length) {
                        hlsSampleQueueArr[i2].discardToEnd();
                        i2++;
                    }
                }
                this.loader.cancelLoading();
            } else {
                resetSampleQueues();
            }
        } else {
            if (this.mediaChunks.isEmpty() || androidx.media3.common.util.Util.areEqual(exoTrackSelection, trackSelection)) {
                z2 = z;
            } else {
                if (this.seenFirstTrackSelection) {
                    z3 = true;
                } else {
                    long j2 = j < 0 ? -j : 0L;
                    androidx.media3.exoplayer.hls.HlsMediaChunk lastMediaChunk = getLastMediaChunk();
                    exoTrackSelection.updateSelectedTrack(j, j2, androidx.media3.common.C.TIME_UNSET, this.readOnlyMediaChunks, this.chunkSource.createMediaChunkIterators(lastMediaChunk, j));
                    if (exoTrackSelection.getSelectedIndexInTrackGroup() != this.chunkSource.getTrackGroup().indexOf(lastMediaChunk.trackFormat)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    this.pendingResetUpstreamFormats = true;
                    z2 = true;
                    z5 = true;
                } else {
                    z2 = z;
                }
            }
            if (z5) {
                seekToUs(j, z2);
                while (i2 < sampleStreamArr.length) {
                    if (sampleStreamArr[i2] != null) {
                        zArr2[i2] = true;
                    }
                    i2++;
                }
            }
        }
        updateSampleStreams(sampleStreamArr);
        this.seenFirstTrackSelection = true;
        return z5;
    }

    public void discardBuffer(long j, boolean z) {
        if (!this.sampleQueuesBuilt || isPendingReset()) {
            return;
        }
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            this.sampleQueues[i].discardTo(j, z, this.sampleQueuesEnabledStates[i]);
        }
    }

    public boolean seekToUs(long j, boolean z) {
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return true;
        }
        if (!this.chunkSource.hasIndependentSegments()) {
            hlsMediaChunk = null;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= this.mediaChunks.size()) {
                hlsMediaChunk = null;
                break;
            }
            hlsMediaChunk = this.mediaChunks.get(i);
            if (hlsMediaChunk.startTimeUs == j) {
                break;
            }
            i++;
        }
        if (this.sampleQueuesBuilt && !z && seekInsideBufferUs(j, hlsMediaChunk)) {
            return false;
        }
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        if (this.loader.isLoading()) {
            if (this.sampleQueuesBuilt) {
                for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                    hlsSampleQueue.discardToEnd();
                }
            }
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            resetSampleQueues();
        }
        return true;
    }

    public void onPlaylistUpdated() {
        if (this.mediaChunks.isEmpty()) {
            return;
        }
        final androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = (androidx.media3.exoplayer.hls.HlsMediaChunk) com.google.common.collect.Iterables.getLast(this.mediaChunks);
        int chunkPublicationState = this.chunkSource.getChunkPublicationState(hlsMediaChunk);
        if (chunkPublicationState == 1) {
            hlsMediaChunk.publish();
            return;
        }
        if (chunkPublicationState == 0) {
            this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m168x332ef84d(hlsMediaChunk);
                }
            });
        } else if (chunkPublicationState == 2 && !this.loadingFinished && this.loader.isLoading()) {
            this.loader.cancelLoading();
        }
    }

    /* JADX INFO: renamed from: lambda$onPlaylistUpdated$0$androidx-media3-exoplayer-hls-HlsSampleStreamWrapper, reason: not valid java name */
    /* synthetic */ void m168x332ef84d(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
        this.callback.onPlaylistRefreshRequired(hlsMediaChunk.playlistUrl);
    }

    public void release() {
        if (this.prepared) {
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.preRelease();
            }
        }
        this.chunkSource.reset();
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.released = true;
        this.hlsSampleStreams.clear();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.release();
        }
    }

    public void setIsPrimaryTimestampSource(boolean z) {
        this.chunkSource.setIsPrimaryTimestampSource(z);
    }

    public boolean onPlaylistError(android.net.Uri uri, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!this.chunkSource.obtainsChunksForPlaylist(uri)) {
            return true;
        }
        long j = (z || (fallbackSelectionFor = this.loadErrorHandlingPolicy.getFallbackSelectionFor(androidx.media3.exoplayer.trackselection.TrackSelectionUtil.createFallbackOptions(this.chunkSource.getTrackSelection()), loadErrorInfo)) == null || fallbackSelectionFor.type != 2) ? -9223372036854775807L : fallbackSelectionFor.exclusionDurationMs;
        return this.chunkSource.onPlaylistError(uri, j) && j != androidx.media3.common.C.TIME_UNSET;
    }

    public boolean isVideoSampleStream() {
        return this.primarySampleQueueType == 2;
    }

    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j, seekParameters);
    }

    public boolean isReady(int i) {
        return !isPendingReset() && this.sampleQueues[i].isReady(this.loadingFinished);
    }

    public void maybeThrowError(int i) throws java.io.IOException {
        maybeThrowError();
        this.sampleQueues[i].maybeThrowError();
    }

    public void maybeThrowError() throws java.io.IOException {
        this.loader.maybeThrowError();
        this.chunkSource.maybeThrowError();
    }

    public int readData(int i, androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i2) {
        androidx.media3.common.Format format;
        if (isPendingReset()) {
            return -3;
        }
        int i3 = 0;
        if (!this.mediaChunks.isEmpty()) {
            int i4 = 0;
            while (i4 < this.mediaChunks.size() - 1 && finishedReadingChunk(this.mediaChunks.get(i4))) {
                i4++;
            }
            androidx.media3.common.util.Util.removeRange(this.mediaChunks, 0, i4);
            androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(0);
            androidx.media3.common.Format format2 = hlsMediaChunk.trackFormat;
            if (!format2.equals(this.downstreamTrackFormat)) {
                this.mediaSourceEventDispatcher.downstreamFormatChanged(this.trackType, format2, hlsMediaChunk.trackSelectionReason, hlsMediaChunk.trackSelectionData, hlsMediaChunk.startTimeUs);
            }
            this.downstreamTrackFormat = format2;
        }
        if (!this.mediaChunks.isEmpty() && !this.mediaChunks.get(0).isPublished()) {
            return -3;
        }
        int i5 = this.sampleQueues[i].read(formatHolder, decoderInputBuffer, i2, this.loadingFinished);
        if (i5 == -5) {
            androidx.media3.common.Format formatWithManifestFormatInfo = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format);
            if (i == this.primarySampleQueueIndex) {
                int iCheckedCast = com.google.common.primitives.Ints.checkedCast(this.sampleQueues[i].peekSourceId());
                while (i3 < this.mediaChunks.size() && this.mediaChunks.get(i3).uid != iCheckedCast) {
                    i3++;
                }
                if (i3 < this.mediaChunks.size()) {
                    format = this.mediaChunks.get(i3).trackFormat;
                } else {
                    format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.upstreamTrackFormat);
                }
                formatWithManifestFormatInfo = formatWithManifestFormatInfo.withManifestFormatInfo(format);
            }
            formatHolder.format = formatWithManifestFormatInfo;
        }
        return i5;
    }

    public int skipData(int i, long j) {
        if (isPendingReset()) {
            return 0;
        }
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue = this.sampleQueues[i];
        int skipCount = hlsSampleQueue.getSkipCount(j, this.loadingFinished);
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = (androidx.media3.exoplayer.hls.HlsMediaChunk) com.google.common.collect.Iterables.getLast(this.mediaChunks, null);
        if (hlsMediaChunk != null && !hlsMediaChunk.isPublished()) {
            skipCount = java.lang.Math.min(skipCount, hlsMediaChunk.getFirstSampleIndex(i) - hlsSampleQueue.getReadIndex());
        }
        hlsSampleQueue.skip(skipCount);
        return skipCount;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long jMax = this.lastSeekPositionUs;
        androidx.media3.exoplayer.hls.HlsMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.mediaChunks.size() > 1) {
                java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> arrayList = this.mediaChunks;
                lastMediaChunk = arrayList.get(arrayList.size() - 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            jMax = java.lang.Math.max(jMax, lastMediaChunk.endTimeUs);
        }
        if (this.sampleQueuesBuilt) {
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                jMax = java.lang.Math.max(jMax, hlsSampleQueue.getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        java.util.List<androidx.media3.exoplayer.hls.HlsMediaChunk> listEmptyList;
        long jMax;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        if (isPendingReset()) {
            listEmptyList = java.util.Collections.emptyList();
            jMax = this.pendingResetPositionUs;
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
        } else {
            listEmptyList = this.readOnlyMediaChunks;
            androidx.media3.exoplayer.hls.HlsMediaChunk lastMediaChunk = getLastMediaChunk();
            if (lastMediaChunk.isLoadCompleted()) {
                jMax = lastMediaChunk.endTimeUs;
            } else {
                jMax = java.lang.Math.max(this.lastSeekPositionUs, lastMediaChunk.startTimeUs);
            }
        }
        java.util.List<androidx.media3.exoplayer.hls.HlsMediaChunk> list = listEmptyList;
        long j = jMax;
        this.nextChunkHolder.clear();
        this.chunkSource.getNextChunk(loadingInfo, j, list, this.prepared || !list.isEmpty(), this.nextChunkHolder);
        boolean z = this.nextChunkHolder.endOfStream;
        androidx.media3.exoplayer.source.chunk.Chunk chunk = this.nextChunkHolder.chunk;
        android.net.Uri uri = this.nextChunkHolder.playlistUrl;
        if (z) {
            this.pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            if (uri != null) {
                this.callback.onPlaylistRefreshRequired(uri);
            }
            return false;
        }
        if (isMediaChunk(chunk)) {
            initMediaChunkLoad((androidx.media3.exoplayer.hls.HlsMediaChunk) chunk);
        }
        this.loadingChunk = chunk;
        this.mediaSourceEventDispatcher.loadStarted(new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type))), chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (this.loader.isLoading()) {
            androidx.media3.common.util.Assertions.checkNotNull(this.loadingChunk);
            if (this.chunkSource.shouldCancelLoad(j, this.loadingChunk, this.readOnlyMediaChunks)) {
                this.loader.cancelLoading();
                return;
            }
            return;
        }
        int size = this.readOnlyMediaChunks.size();
        while (size > 0 && this.chunkSource.getChunkPublicationState(this.readOnlyMediaChunks.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.readOnlyMediaChunks.size()) {
            discardUpstream(size);
        }
        int preferredQueueSize = this.chunkSource.getPreferredQueueSize(j, this.readOnlyMediaChunks);
        if (preferredQueueSize < this.mediaChunks.size()) {
            discardUpstream(preferredQueueSize);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j2) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j2, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (!this.prepared) {
            continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
        } else {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j2, boolean z) {
        this.loadingChunk = null;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j2, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z) {
            return;
        }
        if (isPendingReset() || this.enabledTrackGroupCount == 0) {
            resetSampleQueues();
        }
        if (this.enabledTrackGroupCount > 0) {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j2, java.io.IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        int i2;
        boolean zIsMediaChunk = isMediaChunk(chunk);
        if (zIsMediaChunk && !((androidx.media3.exoplayer.hls.HlsMediaChunk) chunk).isPublished() && (iOException instanceof androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) && ((i2 = ((androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) iOException).responseCode) == 410 || i2 == 404)) {
            return androidx.media3.exoplayer.upstream.Loader.RETRY;
        }
        long jBytesLoaded = chunk.bytesLoaded();
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j2, jBytesLoaded);
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, androidx.media3.common.util.Util.usToMs(chunk.startTimeUs), androidx.media3.common.util.Util.usToMs(chunk.endTimeUs)), iOException, i);
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = this.loadErrorHandlingPolicy.getFallbackSelectionFor(androidx.media3.exoplayer.trackselection.TrackSelectionUtil.createFallbackOptions(this.chunkSource.getTrackSelection()), loadErrorInfo);
        boolean zMaybeExcludeTrack = (fallbackSelectionFor == null || fallbackSelectionFor.type != 2) ? false : this.chunkSource.maybeExcludeTrack(chunk, fallbackSelectionFor.exclusionDurationMs);
        if (zMaybeExcludeTrack) {
            if (zIsMediaChunk && jBytesLoaded == 0) {
                java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> arrayList = this.mediaChunks;
                androidx.media3.common.util.Assertions.checkState(arrayList.remove(arrayList.size() - 1) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                } else {
                    ((androidx.media3.exoplayer.hls.HlsMediaChunk) com.google.common.collect.Iterables.getLast(this.mediaChunks)).invalidateExtractor();
                }
            }
            loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
        } else {
            long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
            if (retryDelayMsFor != androidx.media3.common.C.TIME_UNSET) {
                loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.createRetryAction(false, retryDelayMsFor);
            } else {
                loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY_FATAL;
            }
        }
        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorAction = loadErrorActionCreateRetryAction;
        boolean z = !loadErrorAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, z);
        if (z) {
            this.loadingChunk = null;
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        }
        if (zMaybeExcludeTrack) {
            if (!this.prepared) {
                continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
            } else {
                this.callback.onContinueLoadingRequested(this);
            }
        }
        return loadErrorAction;
    }

    private void initMediaChunkLoad(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
        this.sourceChunk = hlsMediaChunk;
        this.upstreamTrackFormat = hlsMediaChunk.trackFormat;
        this.pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
        this.mediaChunks.add(hlsMediaChunk);
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            builder.add(java.lang.Integer.valueOf(hlsSampleQueue.getWriteIndex()));
        }
        hlsMediaChunk.init(this, builder.build());
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue2 : this.sampleQueues) {
            hlsSampleQueue2.setSourceChunk(hlsMediaChunk);
            if (hlsMediaChunk.shouldSpliceIn) {
                hlsSampleQueue2.splice();
            }
        }
    }

    private void discardUpstream(int i) {
        androidx.media3.common.util.Assertions.checkState(!this.loader.isLoading());
        while (true) {
            if (i >= this.mediaChunks.size()) {
                i = -1;
                break;
            } else if (canDiscardUpstreamMediaChunksFromIndex(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = getLastMediaChunk().endTimeUs;
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunkDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        } else {
            ((androidx.media3.exoplayer.hls.HlsMediaChunk) com.google.common.collect.Iterables.getLast(this.mediaChunks)).invalidateExtractor();
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primarySampleQueueType, hlsMediaChunkDiscardUpstreamMediaChunksFromIndex.startTimeUs, j);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public androidx.media3.extractor.TrackOutput track(int i, int i2) {
        androidx.media3.extractor.TrackOutput trackOutputCreateSampleQueue;
        if (!MAPPABLE_TYPES.contains(java.lang.Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                androidx.media3.extractor.TrackOutput[] trackOutputArr = this.sampleQueues;
                if (i3 >= trackOutputArr.length) {
                    trackOutputCreateSampleQueue = null;
                    break;
                }
                if (this.sampleQueueTrackIds[i3] == i) {
                    trackOutputCreateSampleQueue = trackOutputArr[i3];
                    break;
                }
                i3++;
            }
        } else {
            trackOutputCreateSampleQueue = getMappedTrackOutput(i, i2);
        }
        if (trackOutputCreateSampleQueue == null) {
            if (this.tracksEnded) {
                return createDiscardingTrackOutput(i, i2);
            }
            trackOutputCreateSampleQueue = createSampleQueue(i, i2);
        }
        if (i2 != 5) {
            return trackOutputCreateSampleQueue;
        }
        if (this.emsgUnwrappingTrackOutput == null) {
            this.emsgUnwrappingTrackOutput = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.EmsgUnwrappingTrackOutput(trackOutputCreateSampleQueue, this.metadataType);
        }
        return this.emsgUnwrappingTrackOutput;
    }

    private androidx.media3.extractor.TrackOutput getMappedTrackOutput(int i, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(MAPPABLE_TYPES.contains(java.lang.Integer.valueOf(i2)));
        int i3 = this.sampleQueueIndicesByType.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.sampleQueueMappingDoneByType.add(java.lang.Integer.valueOf(i2))) {
            this.sampleQueueTrackIds[i3] = i;
        }
        if (this.sampleQueueTrackIds[i3] == i) {
            return this.sampleQueues[i3];
        }
        return createDiscardingTrackOutput(i, i2);
    }

    private androidx.media3.exoplayer.source.SampleQueue createSampleQueue(int i, int i2) {
        int length = this.sampleQueues.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue(this.allocator, this.drmSessionManager, this.drmEventDispatcher, this.overridingDrmInitData);
        hlsSampleQueue.setStartTimeUs(this.lastSeekPositionUs);
        if (z) {
            hlsSampleQueue.setDrmInitData(this.drmInitData);
        }
        hlsSampleQueue.setSampleOffsetUs(this.sampleOffsetUs);
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = this.sourceChunk;
        if (hlsMediaChunk != null) {
            hlsSampleQueue.setSourceChunk(hlsMediaChunk);
        }
        hlsSampleQueue.setUpstreamFormatChangeListener(this);
        int i3 = length + 1;
        int[] iArrCopyOf = java.util.Arrays.copyOf(this.sampleQueueTrackIds, i3);
        this.sampleQueueTrackIds = iArrCopyOf;
        iArrCopyOf[length] = i;
        this.sampleQueues = (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[]) androidx.media3.common.util.Util.nullSafeArrayAppend(this.sampleQueues, hlsSampleQueue);
        boolean[] zArrCopyOf = java.util.Arrays.copyOf(this.sampleQueueIsAudioVideoFlags, i3);
        this.sampleQueueIsAudioVideoFlags = zArrCopyOf;
        zArrCopyOf[length] = z;
        this.haveAudioVideoSampleQueues |= z;
        this.sampleQueueMappingDoneByType.add(java.lang.Integer.valueOf(i2));
        this.sampleQueueIndicesByType.append(i2, length);
        if (getTrackTypeScore(i2) > getTrackTypeScore(this.primarySampleQueueType)) {
            this.primarySampleQueueIndex = length;
            this.primarySampleQueueType = i2;
        }
        this.sampleQueuesEnabledStates = java.util.Arrays.copyOf(this.sampleQueuesEnabledStates, i3);
        return hlsSampleQueue;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.tracksEnded = true;
        this.handler.post(this.onTracksEndedRunnable);
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(androidx.media3.common.Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    public void onNewExtractor() {
        this.sampleQueueMappingDoneByType.clear();
    }

    public void setSampleOffsetUs(long j) {
        if (this.sampleOffsetUs != j) {
            this.sampleOffsetUs = j;
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setSampleOffsetUs(j);
            }
        }
    }

    public void setDrmInitData(androidx.media3.common.DrmInitData drmInitData) {
        if (androidx.media3.common.util.Util.areEqual(this.drmInitData, drmInitData)) {
            return;
        }
        this.drmInitData = drmInitData;
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
            if (i >= hlsSampleQueueArr.length) {
                return;
            }
            if (this.sampleQueueIsAudioVideoFlags[i]) {
                hlsSampleQueueArr[i].setDrmInitData(drmInitData);
            }
            i++;
        }
    }

    private void updateSampleStreams(androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr) {
        this.hlsSampleStreams.clear();
        for (androidx.media3.exoplayer.source.SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream != null) {
                this.hlsSampleStreams.add((androidx.media3.exoplayer.hls.HlsSampleStream) sampleStream);
            }
        }
    }

    private boolean finishedReadingChunk(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
        int i = hlsMediaChunk.uid;
        int length = this.sampleQueues.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.sampleQueuesEnabledStates[i2] && this.sampleQueues[i2].peekSourceId() == i) {
                return false;
            }
        }
        return true;
    }

    private boolean canDiscardUpstreamMediaChunksFromIndex(int i) {
        for (int i2 = i; i2 < this.mediaChunks.size(); i2++) {
            if (this.mediaChunks.get(i2).shouldSpliceIn) {
                return false;
            }
        }
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(i);
        for (int i3 = 0; i3 < this.sampleQueues.length; i3++) {
            if (this.sampleQueues[i3].getReadIndex() > hlsMediaChunk.getFirstSampleIndex(i3)) {
                return false;
            }
        }
        return true;
    }

    private androidx.media3.exoplayer.hls.HlsMediaChunk discardUpstreamMediaChunksFromIndex(int i) {
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(i);
        java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> arrayList = this.mediaChunks;
        androidx.media3.common.util.Util.removeRange(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.sampleQueues.length; i2++) {
            this.sampleQueues[i2].discardUpstreamSamples(hlsMediaChunk.getFirstSampleIndex(i2));
        }
        return hlsMediaChunk;
    }

    private void resetSampleQueues() {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.reset(this.pendingResetUpstreamFormats);
        }
        this.pendingResetUpstreamFormats = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTracksEnded() {
        this.sampleQueuesBuilt = true;
        maybeFinishPrepare();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (!this.released && this.trackGroupToSampleQueueIndex == null && this.sampleQueuesBuilt) {
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                if (hlsSampleQueue.getUpstreamFormat() == null) {
                    return;
                }
            }
            if (this.trackGroups != null) {
                mapSampleQueuesToMatchTrackGroups();
                return;
            }
            buildTracksFromSampleStreams();
            setIsPrepared();
            this.callback.onPrepared();
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroups"})
    private void mapSampleQueuesToMatchTrackGroups() {
        int i = this.trackGroups.length;
        int[] iArr = new int[i];
        this.trackGroupToSampleQueueIndex = iArr;
        java.util.Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
                if (i3 >= hlsSampleQueueArr.length) {
                    break;
                }
                if (formatsMatch((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(hlsSampleQueueArr[i3].getUpstreamFormat()), this.trackGroups.get(i2).getFormat(0))) {
                    this.trackGroupToSampleQueueIndex[i2] = i3;
                    break;
                }
                i3++;
            }
        }
        java.util.Iterator<androidx.media3.exoplayer.hls.HlsSampleStream> it = this.hlsSampleStreams.iterator();
        while (it.hasNext()) {
            it.next().bindSampleQueue();
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void buildTracksFromSampleStreams() {
        androidx.media3.common.Format formatDeriveFormat;
        androidx.media3.common.Format format;
        int length = this.sampleQueues.length;
        int i = -2;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i3 >= length) {
                break;
            }
            java.lang.String str = ((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.sampleQueues[i3].getUpstreamFormat())).sampleMimeType;
            if (!androidx.media3.common.MimeTypes.isVideo(str)) {
                if (androidx.media3.common.MimeTypes.isAudio(str)) {
                    i4 = 1;
                } else {
                    i4 = androidx.media3.common.MimeTypes.isText(str) ? 3 : -2;
                }
            }
            if (getTrackTypeScore(i4) > getTrackTypeScore(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        androidx.media3.common.TrackGroup trackGroup = this.chunkSource.getTrackGroup();
        int i5 = trackGroup.length;
        this.primaryTrackGroupIndex = -1;
        this.trackGroupToSampleQueueIndex = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.trackGroupToSampleQueueIndex[i6] = i6;
        }
        androidx.media3.common.TrackGroup[] trackGroupArr = new androidx.media3.common.TrackGroup[length];
        int i7 = 0;
        while (i7 < length) {
            androidx.media3.common.Format format2 = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.sampleQueues[i7].getUpstreamFormat());
            if (i7 == i2) {
                androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[i5];
                for (int i8 = 0; i8 < i5; i8++) {
                    androidx.media3.common.Format format3 = trackGroup.getFormat(i8);
                    if (i == 1 && (format = this.muxedAudioFormat) != null) {
                        format3 = format3.withManifestFormatInfo(format);
                    }
                    if (i5 == 1) {
                        formatDeriveFormat = format2.withManifestFormatInfo(format3);
                    } else {
                        formatDeriveFormat = deriveFormat(format3, format2, true);
                    }
                    formatArr[i8] = formatDeriveFormat;
                }
                trackGroupArr[i7] = new androidx.media3.common.TrackGroup(this.uid, formatArr);
                this.primaryTrackGroupIndex = i7;
            } else {
                trackGroupArr[i7] = new androidx.media3.common.TrackGroup(this.uid + ":muxed:" + (i7 < i2 ? i7 : i7 - 1), deriveFormat((i == 2 && androidx.media3.common.MimeTypes.isAudio(format2.sampleMimeType)) ? this.muxedAudioFormat : null, format2, false));
            }
            i7++;
        }
        this.trackGroups = createTrackGroupArrayWithDrmInfo(trackGroupArr);
        androidx.media3.common.util.Assertions.checkState(this.optionalTrackGroups == null);
        this.optionalTrackGroups = java.util.Collections.emptySet();
    }

    private androidx.media3.exoplayer.source.TrackGroupArray createTrackGroupArrayWithDrmInfo(androidx.media3.common.TrackGroup[] trackGroupArr) {
        for (int i = 0; i < trackGroupArr.length; i++) {
            androidx.media3.common.TrackGroup trackGroup = trackGroupArr[i];
            androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[trackGroup.length];
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                androidx.media3.common.Format format = trackGroup.getFormat(i2);
                formatArr[i2] = format.copyWithCryptoType(this.drmSessionManager.getCryptoType(format));
            }
            trackGroupArr[i] = new androidx.media3.common.TrackGroup(trackGroup.id, formatArr);
        }
        return new androidx.media3.exoplayer.source.TrackGroupArray(trackGroupArr);
    }

    private androidx.media3.exoplayer.hls.HlsMediaChunk getLastMediaChunk() {
        java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> arrayList = this.mediaChunks;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != androidx.media3.common.C.TIME_UNSET;
    }

    private boolean seekInsideBufferUs(long j, androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
        boolean zSeekTo;
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue = this.sampleQueues[i];
            if (hlsMediaChunk != null) {
                zSeekTo = hlsSampleQueue.seekTo(hlsMediaChunk.getFirstSampleIndex(i));
            } else {
                zSeekTo = hlsSampleQueue.seekTo(j, false);
            }
            if (!zSeekTo && (this.sampleQueueIsAudioVideoFlags[i] || !this.haveAudioVideoSampleQueues)) {
                return false;
            }
        }
        return true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    private void setIsPrepared() {
        this.prepared = true;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void assertIsPrepared() {
        androidx.media3.common.util.Assertions.checkState(this.prepared);
        androidx.media3.common.util.Assertions.checkNotNull(this.trackGroups);
        androidx.media3.common.util.Assertions.checkNotNull(this.optionalTrackGroups);
    }

    private static androidx.media3.common.Format deriveFormat(androidx.media3.common.Format format, androidx.media3.common.Format format2, boolean z) {
        java.lang.String codecsCorrespondingToMimeType;
        java.lang.String mediaMimeType;
        if (format == null) {
            return format2;
        }
        int trackType = androidx.media3.common.MimeTypes.getTrackType(format2.sampleMimeType);
        if (androidx.media3.common.util.Util.getCodecCountOfType(format.codecs, trackType) == 1) {
            codecsCorrespondingToMimeType = androidx.media3.common.util.Util.getCodecsOfType(format.codecs, trackType);
            mediaMimeType = androidx.media3.common.MimeTypes.getMediaMimeType(codecsCorrespondingToMimeType);
        } else {
            codecsCorrespondingToMimeType = androidx.media3.common.MimeTypes.getCodecsCorrespondingToMimeType(format.codecs, format2.sampleMimeType);
            mediaMimeType = format2.sampleMimeType;
        }
        androidx.media3.common.Format.Builder codecs = format2.buildUpon().setId(format.id).setLabel(format.label).setLabels(format.labels).setLanguage(format.language).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).setAverageBitrate(z ? format.averageBitrate : -1).setPeakBitrate(z ? format.peakBitrate : -1).setCodecs(codecsCorrespondingToMimeType);
        if (trackType == 2) {
            codecs.setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate);
        }
        if (mediaMimeType != null) {
            codecs.setSampleMimeType(mediaMimeType);
        }
        if (format.channelCount != -1 && trackType == 1) {
            codecs.setChannelCount(format.channelCount);
        }
        if (format.metadata != null) {
            androidx.media3.common.Metadata metadataCopyWithAppendedEntriesFrom = format.metadata;
            if (format2.metadata != null) {
                metadataCopyWithAppendedEntriesFrom = format2.metadata.copyWithAppendedEntriesFrom(metadataCopyWithAppendedEntriesFrom);
            }
            codecs.setMetadata(metadataCopyWithAppendedEntriesFrom);
        }
        return codecs.build();
    }

    private static boolean isMediaChunk(androidx.media3.exoplayer.source.chunk.Chunk chunk) {
        return chunk instanceof androidx.media3.exoplayer.hls.HlsMediaChunk;
    }

    private static boolean formatsMatch(androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        java.lang.String str = format.sampleMimeType;
        java.lang.String str2 = format2.sampleMimeType;
        int trackType = androidx.media3.common.MimeTypes.getTrackType(str);
        if (trackType != 3) {
            return trackType == androidx.media3.common.MimeTypes.getTrackType(str2);
        }
        if (androidx.media3.common.util.Util.areEqual(str, str2)) {
            return !(androidx.media3.common.MimeTypes.APPLICATION_CEA608.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_CEA708.equals(str)) || format.accessibilityChannel == format2.accessibilityChannel;
        }
        return false;
    }

    private static androidx.media3.extractor.DiscardingTrackOutput createDiscardingTrackOutput(int i, int i2) {
        androidx.media3.common.util.Log.w(TAG, "Unmapped track with id " + i + " of type " + i2);
        return new androidx.media3.extractor.DiscardingTrackOutput();
    }

    private static final class HlsSampleQueue extends androidx.media3.exoplayer.source.SampleQueue {
        private androidx.media3.common.DrmInitData drmInitData;
        private final java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> overridingDrmInitData;

        private HlsSampleQueue(androidx.media3.exoplayer.upstream.Allocator allocator, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map) {
            super(allocator, drmSessionManager, eventDispatcher);
            this.overridingDrmInitData = map;
        }

        public void setSourceChunk(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
            sourceId(hlsMediaChunk.uid);
        }

        public void setDrmInitData(androidx.media3.common.DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            invalidateUpstreamFormatAdjustment();
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public androidx.media3.common.Format getAdjustedUpstreamFormat(androidx.media3.common.Format format) {
            androidx.media3.common.DrmInitData drmInitData;
            androidx.media3.common.DrmInitData drmInitData2 = this.drmInitData;
            if (drmInitData2 == null) {
                drmInitData2 = format.drmInitData;
            }
            if (drmInitData2 != null && (drmInitData = this.overridingDrmInitData.get(drmInitData2.schemeType)) != null) {
                drmInitData2 = drmInitData;
            }
            androidx.media3.common.Metadata adjustedMetadata = getAdjustedMetadata(format.metadata);
            if (drmInitData2 != format.drmInitData || adjustedMetadata != format.metadata) {
                format = format.buildUpon().setDrmInitData(drmInitData2).setMetadata(adjustedMetadata).build();
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        private androidx.media3.common.Metadata getAdjustedMetadata(androidx.media3.common.Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int length = metadata.length();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                androidx.media3.common.Metadata.Entry entry = metadata.get(i2);
                if ((entry instanceof androidx.media3.extractor.metadata.id3.PrivFrame) && androidx.media3.exoplayer.hls.HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(((androidx.media3.extractor.metadata.id3.PrivFrame) entry).owner)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return metadata;
            }
            if (length == 1) {
                return null;
            }
            androidx.media3.common.Metadata.Entry[] entryArr = new androidx.media3.common.Metadata.Entry[length - 1];
            while (i < length) {
                if (i != i2) {
                    entryArr[i < i2 ? i : i - 1] = metadata.get(i);
                }
                i++;
            }
            return new androidx.media3.common.Metadata(entryArr);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
            super.sampleMetadata(j, i, i2, i3, cryptoData);
        }
    }

    private static class EmsgUnwrappingTrackOutput implements androidx.media3.extractor.TrackOutput {
        private byte[] buffer;
        private int bufferPosition;
        private final androidx.media3.extractor.TrackOutput delegate;
        private final androidx.media3.common.Format delegateFormat;
        private final androidx.media3.extractor.metadata.emsg.EventMessageDecoder emsgDecoder = new androidx.media3.extractor.metadata.emsg.EventMessageDecoder();
        private androidx.media3.common.Format format;
        private static final androidx.media3.common.Format ID3_FORMAT = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_ID3).build();
        private static final androidx.media3.common.Format EMSG_FORMAT = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_EMSG).build();

        public EmsgUnwrappingTrackOutput(androidx.media3.extractor.TrackOutput trackOutput, int i) {
            this.delegate = trackOutput;
            if (i == 1) {
                this.delegateFormat = ID3_FORMAT;
            } else if (i == 3) {
                this.delegateFormat = EMSG_FORMAT;
            } else {
                throw new java.lang.IllegalArgumentException("Unknown metadataType: " + i);
            }
            this.buffer = new byte[0];
            this.bufferPosition = 0;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void format(androidx.media3.common.Format format) {
            this.format = format;
            this.delegate.format(this.delegateFormat);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException {
            ensureBufferCapacity(this.bufferPosition + i);
            int i3 = dataReader.read(this.buffer, this.bufferPosition, i);
            if (i3 != -1) {
                this.bufferPosition += i3;
                return i3;
            }
            if (z) {
                return -1;
            }
            throw new java.io.EOFException();
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2) {
            ensureBufferCapacity(this.bufferPosition + i);
            parsableByteArray.readBytes(this.buffer, this.bufferPosition, i);
            this.bufferPosition += i;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
            androidx.media3.common.util.Assertions.checkNotNull(this.format);
            androidx.media3.common.util.ParsableByteArray sampleAndTrimBuffer = getSampleAndTrimBuffer(i2, i3);
            if (!androidx.media3.common.util.Util.areEqual(this.format.sampleMimeType, this.delegateFormat.sampleMimeType)) {
                if (androidx.media3.common.MimeTypes.APPLICATION_EMSG.equals(this.format.sampleMimeType)) {
                    androidx.media3.extractor.metadata.emsg.EventMessage eventMessageDecode = this.emsgDecoder.decode(sampleAndTrimBuffer);
                    if (!emsgContainsExpectedWrappedFormat(eventMessageDecode)) {
                        androidx.media3.common.util.Log.w(androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.TAG, java.lang.String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.delegateFormat.sampleMimeType, eventMessageDecode.getWrappedMetadataFormat()));
                        return;
                    }
                    sampleAndTrimBuffer = new androidx.media3.common.util.ParsableByteArray((byte[]) androidx.media3.common.util.Assertions.checkNotNull(eventMessageDecode.getWrappedMetadataBytes()));
                } else {
                    androidx.media3.common.util.Log.w(androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.TAG, "Ignoring sample for unsupported format: " + this.format.sampleMimeType);
                    return;
                }
            }
            int iBytesLeft = sampleAndTrimBuffer.bytesLeft();
            this.delegate.sampleData(sampleAndTrimBuffer, iBytesLeft);
            this.delegate.sampleMetadata(j, i, iBytesLeft, 0, cryptoData);
        }

        private boolean emsgContainsExpectedWrappedFormat(androidx.media3.extractor.metadata.emsg.EventMessage eventMessage) {
            androidx.media3.common.Format wrappedMetadataFormat = eventMessage.getWrappedMetadataFormat();
            return wrappedMetadataFormat != null && androidx.media3.common.util.Util.areEqual(this.delegateFormat.sampleMimeType, wrappedMetadataFormat.sampleMimeType);
        }

        private void ensureBufferCapacity(int i) {
            byte[] bArr = this.buffer;
            if (bArr.length < i) {
                this.buffer = java.util.Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        private androidx.media3.common.util.ParsableByteArray getSampleAndTrimBuffer(int i, int i2) {
            int i3 = this.bufferPosition - i2;
            androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(java.util.Arrays.copyOfRange(this.buffer, i3 - i, i3));
            byte[] bArr = this.buffer;
            java.lang.System.arraycopy(bArr, i3, bArr, 0, i2);
            this.bufferPosition = i2;
            return parsableByteArray;
        }
    }
}
