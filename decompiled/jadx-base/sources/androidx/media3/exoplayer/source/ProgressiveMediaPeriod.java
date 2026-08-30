package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
final class ProgressiveMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.extractor.ExtractorOutput, androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ExtractingLoadable>, androidx.media3.exoplayer.upstream.Loader.ReleaseCallback, androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final java.lang.String TAG = "ProgressiveMediaPeriod";
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;
    private final java.lang.String customCacheKey;
    private final androidx.media3.datasource.DataSource dataSource;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private boolean haveAudioVideoTracks;
    private androidx.media3.extractor.metadata.icy.IcyHeaders icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private boolean isSingleSample;
    private long lastSeekPositionUs;
    private final androidx.media3.exoplayer.source.ProgressiveMediaPeriod.Listener listener;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean loadingFinished;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private boolean pendingDeferredRetry;
    private boolean prepared;
    private final androidx.media3.exoplayer.source.ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private boolean sampleQueuesBuilt;
    private androidx.media3.extractor.SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private final long singleSampleDurationUs;
    private androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackState trackState;
    private final android.net.Uri uri;
    private static final java.util.Map<java.lang.String, java.lang.String> ICY_METADATA_HEADERS = createIcyMetadataHeaders();
    private static final androidx.media3.common.Format ICY_FORMAT = new androidx.media3.common.Format.Builder().setId("icy").setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_ICY).build();
    private final androidx.media3.exoplayer.upstream.Loader loader = new androidx.media3.exoplayer.upstream.Loader(TAG);
    private final androidx.media3.common.util.ConditionVariable loadCondition = new androidx.media3.common.util.ConditionVariable();
    private final java.lang.Runnable maybeFinishPrepareRunnable = new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.maybeFinishPrepare();
        }
    };
    private final java.lang.Runnable onContinueLoadingRequestedRunnable = new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m188x97cae34d();
        }
    };
    private final android.os.Handler handler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
    private androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackId[] sampleQueueTrackIds = new androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackId[0];
    private androidx.media3.exoplayer.source.SampleQueue[] sampleQueues = new androidx.media3.exoplayer.source.SampleQueue[0];
    private long pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
    private int dataType = 1;

    interface Listener {
        void onSourceInfoRefreshed(long j, boolean z, boolean z2);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
    }

    public ProgressiveMediaPeriod(android.net.Uri uri, androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.source.ProgressiveMediaExtractor progressiveMediaExtractor, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2, androidx.media3.exoplayer.source.ProgressiveMediaPeriod.Listener listener, androidx.media3.exoplayer.upstream.Allocator allocator, java.lang.String str, int i, long j) {
        this.uri = uri;
        this.dataSource = dataSource;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i;
        this.progressiveMediaExtractor = progressiveMediaExtractor;
        this.singleSampleDurationUs = j;
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-exoplayer-source-ProgressiveMediaPeriod, reason: not valid java name */
    /* synthetic */ void m188x97cae34d() {
        if (this.released) {
            return;
        }
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    public void release() {
        if (this.prepared) {
            for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.preRelease();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.release();
        }
        this.progressiveMediaExtractor.release();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.loadCondition.open();
        startLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        assertPrepared();
        return this.trackState.tracks;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection;
        assertPrepared();
        androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray = this.trackState.tracks;
        boolean[] zArr3 = this.trackState.trackEnabledStates;
        int i = this.enabledTrackCount;
        int i2 = 0;
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i3];
            if (sampleStream != null && (exoTrackSelectionArr[i3] == null || !zArr[i3])) {
                int i4 = ((androidx.media3.exoplayer.source.ProgressiveMediaPeriod.SampleStreamImpl) sampleStream).track;
                androidx.media3.common.util.Assertions.checkState(zArr3[i4]);
                this.enabledTrackCount--;
                zArr3[i4] = false;
                sampleStreamArr[i3] = null;
            }
        }
        boolean z = !this.seenFirstTrackSelection ? j == 0 || this.isSingleSample : i != 0;
        for (int i5 = 0; i5 < exoTrackSelectionArr.length; i5++) {
            if (sampleStreamArr[i5] == null && (exoTrackSelection = exoTrackSelectionArr[i5]) != null) {
                androidx.media3.common.util.Assertions.checkState(exoTrackSelection.length() == 1);
                androidx.media3.common.util.Assertions.checkState(exoTrackSelection.getIndexInTrackGroup(0) == 0);
                int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
                androidx.media3.common.util.Assertions.checkState(!zArr3[iIndexOf]);
                this.enabledTrackCount++;
                zArr3[iIndexOf] = true;
                sampleStreamArr[i5] = new androidx.media3.exoplayer.source.ProgressiveMediaPeriod.SampleStreamImpl(iIndexOf);
                zArr2[i5] = true;
                if (!z) {
                    androidx.media3.exoplayer.source.SampleQueue sampleQueue = this.sampleQueues[iIndexOf];
                    z = (sampleQueue.getReadIndex() == 0 || sampleQueue.seekTo(j, true)) ? false : true;
                }
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            if (this.loader.isLoading()) {
                androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i2 < length) {
                    sampleQueueArr[i2].discardToEnd();
                    i2++;
                }
                this.loader.cancelLoading();
            } else {
                this.loadingFinished = false;
                androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr2 = this.sampleQueues;
                int length2 = sampleQueueArr2.length;
                while (i2 < length2) {
                    sampleQueueArr2[i2].reset();
                    i2++;
                }
            }
        } else if (z) {
            j = seekToUs(j);
            while (i2 < sampleStreamArr.length) {
                if (sampleStreamArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.seenFirstTrackSelection = true;
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        if (this.isSingleSample) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.trackState.trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            this.sampleQueues[i].discardTo(j, z, zArr[i]);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        if (this.loadingFinished || this.loader.hasFatalError() || this.pendingDeferredRetry) {
            return false;
        }
        if (this.prepared && this.enabledTrackCount == 0) {
            return false;
        }
        boolean zOpen = this.loadCondition.open();
        if (this.loader.isLoading()) {
            return zOpen;
        }
        startLoading();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading() && this.loadCondition.isOpen();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.notifyDiscontinuity) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        this.notifyDiscontinuity = false;
        return this.lastSeekPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long largestQueuedTimestampUs;
        assertPrepared();
        if (this.loadingFinished || this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            largestQueuedTimestampUs = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (this.trackState.trackIsAudioVideoFlags[i] && this.trackState.trackEnabledStates[i] && !this.sampleQueues[i].isLastSampleQueued()) {
                    largestQueuedTimestampUs = java.lang.Math.min(largestQueuedTimestampUs, this.sampleQueues[i].getLargestQueuedTimestampUs());
                }
            }
        } else {
            largestQueuedTimestampUs = Long.MAX_VALUE;
        }
        if (largestQueuedTimestampUs == Long.MAX_VALUE) {
            largestQueuedTimestampUs = getLargestQueuedTimestampUs(false);
        }
        return largestQueuedTimestampUs == Long.MIN_VALUE ? this.lastSeekPositionUs : largestQueuedTimestampUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (!this.seekMap.isSeekable()) {
            j = 0;
        }
        int i = 0;
        this.notifyDiscontinuity = false;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return j;
        }
        if (this.dataType != 7 && ((this.loadingFinished || this.loader.isLoading()) && seekInsideBufferUs(zArr, j))) {
            return j;
        }
        this.pendingDeferredRetry = false;
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        if (this.loader.isLoading()) {
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.sampleQueues;
            int length = sampleQueueArr.length;
            while (i < length) {
                sampleQueueArr[i].discardToEnd();
                i++;
            }
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr2 = this.sampleQueues;
            int length2 = sampleQueueArr2.length;
            while (i < length2) {
                sampleQueueArr2[i].reset();
                i++;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        assertPrepared();
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        androidx.media3.extractor.SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j);
        return seekParameters.resolveSeekPositionUs(j, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    boolean isReady(int i) {
        return !suppressRead() && this.sampleQueues[i].isReady(this.loadingFinished);
    }

    void maybeThrowError(int i) throws java.io.IOException {
        this.sampleQueues[i].maybeThrowError();
        maybeThrowError();
    }

    void maybeThrowError() throws java.io.IOException {
        this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    int readData(int i, androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i2) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i);
        int i3 = this.sampleQueues[i].read(formatHolder, decoderInputBuffer, i2, this.loadingFinished);
        if (i3 == -3) {
            maybeStartDeferredRetry(i);
        }
        return i3;
    }

    int skipData(int i, long j) {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i);
        androidx.media3.exoplayer.source.SampleQueue sampleQueue = this.sampleQueues[i];
        int skipCount = sampleQueue.getSkipCount(j, this.loadingFinished);
        sampleQueue.skip(skipCount);
        if (skipCount == 0) {
            maybeStartDeferredRetry(i);
        }
        return skipCount;
    }

    private void maybeNotifyDownstreamFormat(int i) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackNotifiedDownstreamFormats;
        if (zArr[i]) {
            return;
        }
        androidx.media3.common.Format format = this.trackState.tracks.get(i).getFormat(0);
        this.mediaSourceEventDispatcher.downstreamFormatChanged(androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
        zArr[i] = true;
    }

    private void maybeStartDeferredRetry(int i) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (this.pendingDeferredRetry && zArr[i]) {
            if (this.sampleQueues[i].isReady(false)) {
                return;
            }
            this.pendingResetPositionUs = 0L;
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = true;
            this.lastSeekPositionUs = 0L;
            this.extractedSamplesCountAtStartOfLoad = 0;
            for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.reset();
            }
            ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable, long j, long j2) {
        androidx.media3.extractor.SeekMap seekMap;
        if (this.durationUs == androidx.media3.common.C.TIME_UNSET && (seekMap = this.seekMap) != null) {
            boolean zIsSeekable = seekMap.isSeekable();
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j3 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.durationUs = j3;
            this.listener.onSourceInfoRefreshed(j3, zIsSeekable, this.isLive);
        }
        androidx.media3.datasource.StatsDataSource statsDataSource = extractingLoadable.dataSource;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        this.loadingFinished = true;
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable, long j, long j2, boolean z) {
        androidx.media3.datasource.StatsDataSource statsDataSource = extractingLoadable.dataSource;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        if (z) {
            return;
        }
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        if (this.enabledTrackCount > 0) {
            ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable, long j, long j2, java.io.IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        androidx.media3.datasource.StatsDataSource statsDataSource = extractingLoadable.dataSource;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(1, -1, null, 0, null, androidx.media3.common.util.Util.usToMs(extractingLoadable.seekTimeUs), androidx.media3.common.util.Util.usToMs(this.durationUs)), iOException, i));
        if (retryDelayMsFor == androidx.media3.common.C.TIME_UNSET) {
            loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY_FATAL;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            boolean z = extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad;
            if (configureRetry(extractingLoadable, extractedSamplesCount)) {
                loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.createRetryAction(z, retryDelayMsFor);
            } else {
                loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
            }
        }
        boolean z2 = !loadErrorActionCreateRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, iOException, z2);
        if (z2) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public androidx.media3.extractor.TrackOutput track(int i, int i2) {
        return prepareTrackOutput(new androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackId(i, false));
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(final androidx.media3.extractor.SeekMap seekMap) {
        this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m190x33ac0ff2(seekMap);
            }
        });
    }

    androidx.media3.extractor.TrackOutput icyTrack() {
        return prepareTrackOutput(new androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackId(0, true));
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(androidx.media3.common.Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m189xa2bd730d();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onLengthKnown$2$androidx-media3-exoplayer-source-ProgressiveMediaPeriod, reason: not valid java name */
    /* synthetic */ void m189xa2bd730d() {
        this.isLengthKnown = true;
    }

    private androidx.media3.extractor.TrackOutput prepareTrackOutput(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackId trackId) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            if (trackId.equals(this.sampleQueueTrackIds[i])) {
                return this.sampleQueues[i];
            }
        }
        if (this.sampleQueuesBuilt) {
            androidx.media3.common.util.Log.w(TAG, "Extractor added new track (id=" + trackId.id + ") after finishing tracks.");
            return new androidx.media3.extractor.DiscardingTrackOutput();
        }
        androidx.media3.exoplayer.source.SampleQueue sampleQueueCreateWithDrm = androidx.media3.exoplayer.source.SampleQueue.createWithDrm(this.allocator, this.drmSessionManager, this.drmEventDispatcher);
        sampleQueueCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i2 = length + 1;
        androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackId[] trackIdArr = (androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackId[]) java.util.Arrays.copyOf(this.sampleQueueTrackIds, i2);
        trackIdArr[length] = trackId;
        this.sampleQueueTrackIds = (androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackId[]) androidx.media3.common.util.Util.castNonNullTypeArray(trackIdArr);
        androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = (androidx.media3.exoplayer.source.SampleQueue[]) java.util.Arrays.copyOf(this.sampleQueues, i2);
        sampleQueueArr[length] = sampleQueueCreateWithDrm;
        this.sampleQueues = (androidx.media3.exoplayer.source.SampleQueue[]) androidx.media3.common.util.Util.castNonNullTypeArray(sampleQueueArr);
        return sampleQueueCreateWithDrm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setSeekMap, reason: merged with bridge method [inline-methods] */
    public void m190x33ac0ff2(androidx.media3.extractor.SeekMap seekMap) {
        this.seekMap = this.icyHeaders == null ? seekMap : new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET);
        this.durationUs = seekMap.getDurationUs();
        boolean z = !this.isLengthKnown && seekMap.getDurationUs() == androidx.media3.common.C.TIME_UNSET;
        this.isLive = z;
        this.dataType = z ? 7 : 1;
        if (this.prepared) {
            this.listener.onSourceInfoRefreshed(this.durationUs, seekMap.isSeekable(), this.isLive);
        } else {
            maybeFinishPrepare();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        androidx.media3.common.Metadata metadataCopyWithAppendedEntries;
        if (this.released || this.prepared || !this.sampleQueuesBuilt || this.seekMap == null) {
            return;
        }
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.loadCondition.close();
        int length = this.sampleQueues.length;
        androidx.media3.common.TrackGroup[] trackGroupArr = new androidx.media3.common.TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            androidx.media3.common.Format formatBuild = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.sampleQueues[i].getUpstreamFormat());
            java.lang.String str = formatBuild.sampleMimeType;
            boolean zIsAudio = androidx.media3.common.MimeTypes.isAudio(str);
            boolean z = zIsAudio || androidx.media3.common.MimeTypes.isVideo(str);
            zArr[i] = z;
            this.haveAudioVideoTracks = z | this.haveAudioVideoTracks;
            this.isSingleSample = this.singleSampleDurationUs != androidx.media3.common.C.TIME_UNSET && length == 1 && androidx.media3.common.MimeTypes.isImage(str);
            androidx.media3.extractor.metadata.icy.IcyHeaders icyHeaders = this.icyHeaders;
            if (icyHeaders != null) {
                if (zIsAudio || this.sampleQueueTrackIds[i].isIcyTrack) {
                    androidx.media3.common.Metadata metadata = formatBuild.metadata;
                    if (metadata == null) {
                        metadataCopyWithAppendedEntries = new androidx.media3.common.Metadata(icyHeaders);
                    } else {
                        metadataCopyWithAppendedEntries = metadata.copyWithAppendedEntries(icyHeaders);
                    }
                    formatBuild = formatBuild.buildUpon().setMetadata(metadataCopyWithAppendedEntries).build();
                }
                if (zIsAudio && formatBuild.averageBitrate == -1 && formatBuild.peakBitrate == -1 && icyHeaders.bitrate != -1) {
                    formatBuild = formatBuild.buildUpon().setAverageBitrate(icyHeaders.bitrate).build();
                }
            }
            trackGroupArr[i] = new androidx.media3.common.TrackGroup(java.lang.Integer.toString(i), formatBuild.copyWithCryptoType(this.drmSessionManager.getCryptoType(formatBuild)));
        }
        this.trackState = new androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackState(new androidx.media3.exoplayer.source.TrackGroupArray(trackGroupArr), zArr);
        if (this.isSingleSample && this.durationUs == androidx.media3.common.C.TIME_UNSET) {
            this.durationUs = this.singleSampleDurationUs;
            this.seekMap = new androidx.media3.extractor.ForwardingSeekMap(this.seekMap) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.1
                @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
                public long getDurationUs() {
                    return androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.durationUs;
                }
            };
        }
        this.listener.onSourceInfoRefreshed(this.durationUs, this.seekMap.isSeekable(), this.isLive);
        this.prepared = true;
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    private void startLoading() {
        androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable = new androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ExtractingLoadable(this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            androidx.media3.common.util.Assertions.checkState(isPendingReset());
            long j = this.durationUs;
            if (j != androidx.media3.common.C.TIME_UNSET && this.pendingResetPositionUs > j) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
                return;
            }
            extractingLoadable.setLoadPosition(((androidx.media3.extractor.SeekMap) androidx.media3.common.util.Assertions.checkNotNull(this.seekMap)).getSeekPoints(this.pendingResetPositionUs).first.position, this.pendingResetPositionUs);
            for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
            this.pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.mediaSourceEventDispatcher.loadStarted(new androidx.media3.exoplayer.source.LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, this.loader.startLoading(extractingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType))), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
    }

    private boolean configureRetry(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable, int i) {
        androidx.media3.extractor.SeekMap seekMap;
        if (this.isLengthKnown || ((seekMap = this.seekMap) != null && seekMap.getDurationUs() != androidx.media3.common.C.TIME_UNSET)) {
            this.extractedSamplesCountAtStartOfLoad = i;
            return true;
        }
        if (this.prepared && !suppressRead()) {
            this.pendingDeferredRetry = true;
            return false;
        }
        this.notifyDiscontinuity = this.prepared;
        this.lastSeekPositionUs = 0L;
        this.extractedSamplesCountAtStartOfLoad = 0;
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        extractingLoadable.setLoadPosition(0L, 0L);
        return true;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j) {
        boolean zSeekTo;
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            androidx.media3.exoplayer.source.SampleQueue sampleQueue = this.sampleQueues[i];
            if (this.isSingleSample) {
                zSeekTo = sampleQueue.seekTo(sampleQueue.getFirstIndex());
            } else {
                zSeekTo = sampleQueue.seekTo(j, false);
            }
            if (!zSeekTo && (zArr[i] || !this.haveAudioVideoTracks)) {
                return false;
            }
        }
        return true;
    }

    private int getExtractedSamplesCount() {
        int writeIndex = 0;
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.sampleQueues) {
            writeIndex += sampleQueue.getWriteIndex();
        }
        return writeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLargestQueuedTimestampUs(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.sampleQueues.length; i++) {
            if (z || ((androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackState) androidx.media3.common.util.Assertions.checkNotNull(this.trackState)).trackEnabledStates[i]) {
                jMax = java.lang.Math.max(jMax, this.sampleQueues[i].getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != androidx.media3.common.C.TIME_UNSET;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackState", "seekMap"})
    private void assertPrepared() {
        androidx.media3.common.util.Assertions.checkState(this.prepared);
        androidx.media3.common.util.Assertions.checkNotNull(this.trackState);
        androidx.media3.common.util.Assertions.checkNotNull(this.seekMap);
    }

    private final class SampleStreamImpl implements androidx.media3.exoplayer.source.SampleStream {
        private final int track;

        public SampleStreamImpl(int i) {
            this.track = i;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.isReady(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.maybeThrowError(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            return androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, i);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            return androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.skipData(this.track, j);
        }
    }

    final class ExtractingLoadable implements androidx.media3.exoplayer.upstream.Loader.Loadable, androidx.media3.exoplayer.source.IcyDataSource.Listener {
        private final androidx.media3.datasource.StatsDataSource dataSource;
        private final androidx.media3.extractor.ExtractorOutput extractorOutput;
        private androidx.media3.extractor.TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final androidx.media3.common.util.ConditionVariable loadCondition;
        private final androidx.media3.exoplayer.source.ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        private final android.net.Uri uri;
        private final androidx.media3.extractor.PositionHolder positionHolder = new androidx.media3.extractor.PositionHolder();
        private boolean pendingExtractorSeek = true;
        private final long loadTaskId = androidx.media3.exoplayer.source.LoadEventInfo.getNewId();
        private androidx.media3.datasource.DataSpec dataSpec = buildDataSpec(0);

        public ExtractingLoadable(android.net.Uri uri, androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.source.ProgressiveMediaExtractor progressiveMediaExtractor, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.common.util.ConditionVariable conditionVariable) {
            this.uri = uri;
            this.dataSource = new androidx.media3.datasource.StatsDataSource(dataSource);
            this.progressiveMediaExtractor = progressiveMediaExtractor;
            this.extractorOutput = extractorOutput;
            this.loadCondition = conditionVariable;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x011b */
        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void load() throws java.io.IOException {
            int i = 0;
            while (i == 0 && !this.loadCanceled) {
                long j = this.positionHolder.position;
                androidx.media3.datasource.DataSpec dataSpecBuildDataSpec = buildDataSpec(j);
                this.dataSpec = dataSpecBuildDataSpec;
                long jOpen = this.dataSource.open(dataSpecBuildDataSpec);
                if (!this.loadCanceled) {
                    if (jOpen != -1) {
                        jOpen += j;
                        androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.onLengthKnown();
                    }
                    long j2 = jOpen;
                    androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.icyHeaders = androidx.media3.extractor.metadata.icy.IcyHeaders.parse(this.dataSource.getResponseHeaders());
                    androidx.media3.common.DataReader icyDataSource = this.dataSource;
                    if (androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.icyHeaders != null && androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.icyHeaders.metadataInterval != -1) {
                        icyDataSource = new androidx.media3.exoplayer.source.IcyDataSource(this.dataSource, androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.icyHeaders.metadataInterval, this);
                        androidx.media3.extractor.TrackOutput trackOutputIcyTrack = androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.icyTrack();
                        this.icyTrackOutput = trackOutputIcyTrack;
                        trackOutputIcyTrack.format(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ICY_FORMAT);
                    }
                    long currentInputPosition = j;
                    this.progressiveMediaExtractor.init(icyDataSource, this.uri, this.dataSource.getResponseHeaders(), j, j2, this.extractorOutput);
                    if (androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.icyHeaders != null) {
                        this.progressiveMediaExtractor.disableSeekingOnMp3Streams();
                    }
                    if (this.pendingExtractorSeek) {
                        this.progressiveMediaExtractor.seek(currentInputPosition, this.seekTimeUs);
                        this.pendingExtractorSeek = false;
                    }
                    while (true) {
                        long j3 = currentInputPosition;
                        while (true) {
                            if (i != 0 || this.loadCanceled) {
                                break;
                            }
                            try {
                                this.loadCondition.block();
                                i = this.progressiveMediaExtractor.read(this.positionHolder);
                                currentInputPosition = this.progressiveMediaExtractor.getCurrentInputPosition();
                                if (currentInputPosition > androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.continueLoadingCheckIntervalBytes + j3) {
                                    this.loadCondition.close();
                                    androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.handler.post(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.onContinueLoadingRequestedRunnable);
                                }
                            } catch (java.lang.InterruptedException unused) {
                                throw new java.io.InterruptedIOException();
                            }
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
                } else {
                    if (i != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
                    return;
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.IcyDataSource.Listener
        public void onIcyMetadata(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            long jMax;
            if (this.seenIcyMetadata) {
                jMax = java.lang.Math.max(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.getLargestQueuedTimestampUs(true), this.seekTimeUs);
            } else {
                jMax = this.seekTimeUs;
            }
            int iBytesLeft = parsableByteArray.bytesLeft();
            androidx.media3.extractor.TrackOutput trackOutput = (androidx.media3.extractor.TrackOutput) androidx.media3.common.util.Assertions.checkNotNull(this.icyTrackOutput);
            trackOutput.sampleData(parsableByteArray, iBytesLeft);
            trackOutput.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
            this.seenIcyMetadata = true;
        }

        private androidx.media3.datasource.DataSpec buildDataSpec(long j) {
            return new androidx.media3.datasource.DataSpec.Builder().setUri(this.uri).setPosition(j).setKey(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.this.customCacheKey).setFlags(6).setHttpRequestHeaders(androidx.media3.exoplayer.source.ProgressiveMediaPeriod.ICY_METADATA_HEADERS).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j, long j2) {
            this.positionHolder.position = j;
            this.seekTimeUs = j2;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }
    }

    private static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final androidx.media3.exoplayer.source.TrackGroupArray tracks;

        public TrackState(androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.tracks = trackGroupArray;
            this.trackIsAudioVideoFlags = zArr;
            this.trackEnabledStates = new boolean[trackGroupArray.length];
            this.trackNotifiedDownstreamFormats = new boolean[trackGroupArray.length];
        }
    }

    private static final class TrackId {
        public final int id;
        public final boolean isIcyTrack;

        public TrackId(int i, boolean z) {
            this.id = i;
            this.isIcyTrack = z;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackId trackId = (androidx.media3.exoplayer.source.ProgressiveMediaPeriod.TrackId) obj;
            return this.id == trackId.id && this.isIcyTrack == trackId.isIcyTrack;
        }

        public int hashCode() {
            return (this.id * 31) + (this.isIcyTrack ? 1 : 0);
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> createIcyMetadataHeaders() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return java.util.Collections.unmodifiableMap(map);
    }
}
