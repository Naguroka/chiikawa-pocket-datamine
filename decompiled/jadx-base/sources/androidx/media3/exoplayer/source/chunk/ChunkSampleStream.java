package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public class ChunkSampleStream<T extends androidx.media3.exoplayer.source.chunk.ChunkSource> implements androidx.media3.exoplayer.source.SampleStream, androidx.media3.exoplayer.source.SequenceableLoader, androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.source.chunk.Chunk>, androidx.media3.exoplayer.upstream.Loader.ReleaseCallback {
    private static final java.lang.String TAG = "ChunkSampleStream";
    private final androidx.media3.exoplayer.source.SequenceableLoader.Callback<androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T>> callback;
    private androidx.media3.exoplayer.source.chunk.BaseMediaChunk canceledMediaChunk;
    private final androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput chunkOutput;
    private final T chunkSource;
    private final androidx.media3.exoplayer.source.SampleQueue[] embeddedSampleQueues;
    private final androidx.media3.common.Format[] embeddedTrackFormats;
    private final int[] embeddedTrackTypes;
    private final boolean[] embeddedTracksSelected;
    private long lastSeekPositionUs;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final androidx.media3.exoplayer.upstream.Loader loader;
    private androidx.media3.exoplayer.source.chunk.Chunk loadingChunk;
    boolean loadingFinished;
    private final java.util.ArrayList<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> mediaChunks;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final androidx.media3.exoplayer.source.chunk.ChunkHolder nextChunkHolder;
    private int nextNotifyPrimaryFormatMediaChunkIndex;
    private long pendingResetPositionUs;
    private androidx.media3.common.Format primaryDownstreamTrackFormat;
    private final androidx.media3.exoplayer.source.SampleQueue primarySampleQueue;
    public final int primaryTrackType;
    private final java.util.List<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> readOnlyMediaChunks;
    private androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback<T> releaseCallback;

    public interface ReleaseCallback<T extends androidx.media3.exoplayer.source.chunk.ChunkSource> {
        void onSampleStreamReleased(androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T> chunkSampleStream);
    }

    public ChunkSampleStream(int i, int[] iArr, androidx.media3.common.Format[] formatArr, T t, androidx.media3.exoplayer.source.SequenceableLoader.Callback<androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T>> callback, androidx.media3.exoplayer.upstream.Allocator allocator, long j, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2) {
        this.primaryTrackType = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.embeddedTrackTypes = iArr;
        this.embeddedTrackFormats = formatArr == null ? new androidx.media3.common.Format[0] : formatArr;
        this.chunkSource = t;
        this.callback = callback;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.loader = new androidx.media3.exoplayer.upstream.Loader(TAG);
        this.nextChunkHolder = new androidx.media3.exoplayer.source.chunk.ChunkHolder();
        java.util.ArrayList<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> arrayList = new java.util.ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = java.util.Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.embeddedSampleQueues = new androidx.media3.exoplayer.source.SampleQueue[length];
        this.embeddedTracksSelected = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = new androidx.media3.exoplayer.source.SampleQueue[i3];
        androidx.media3.exoplayer.source.SampleQueue sampleQueueCreateWithDrm = androidx.media3.exoplayer.source.SampleQueue.createWithDrm(allocator, drmSessionManager, eventDispatcher);
        this.primarySampleQueue = sampleQueueCreateWithDrm;
        iArr2[0] = i;
        sampleQueueArr[0] = sampleQueueCreateWithDrm;
        while (i2 < length) {
            androidx.media3.exoplayer.source.SampleQueue sampleQueueCreateWithoutDrm = androidx.media3.exoplayer.source.SampleQueue.createWithoutDrm(allocator);
            this.embeddedSampleQueues[i2] = sampleQueueCreateWithoutDrm;
            int i4 = i2 + 1;
            sampleQueueArr[i4] = sampleQueueCreateWithoutDrm;
            iArr2[i4] = this.embeddedTrackTypes[i2];
            i2 = i4;
        }
        this.chunkOutput = new androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput(iArr2, sampleQueueArr);
        this.pendingResetPositionUs = j;
        this.lastSeekPositionUs = j;
    }

    public void discardBuffer(long j, boolean z) {
        if (isPendingReset()) {
            return;
        }
        int firstIndex = this.primarySampleQueue.getFirstIndex();
        this.primarySampleQueue.discardTo(j, z, true);
        int firstIndex2 = this.primarySampleQueue.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = this.primarySampleQueue.getFirstTimestampUs();
            int i = 0;
            while (true) {
                androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
                if (i >= sampleQueueArr.length) {
                    break;
                }
                sampleQueueArr[i].discardTo(firstTimestampUs, z, this.embeddedTracksSelected[i]);
                i++;
            }
        }
        discardDownstreamMediaChunks(firstIndex2);
    }

    public androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long j, int i) {
        for (int i2 = 0; i2 < this.embeddedSampleQueues.length; i2++) {
            if (this.embeddedTrackTypes[i2] == i) {
                androidx.media3.common.util.Assertions.checkState(!this.embeddedTracksSelected[i2]);
                this.embeddedTracksSelected[i2] = true;
                this.embeddedSampleQueues[i2].seekTo(j, true);
                return new androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream(this, this.embeddedSampleQueues[i2], i2);
            }
        }
        throw new java.lang.IllegalStateException();
    }

    public T getChunkSource() {
        return this.chunkSource;
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
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.mediaChunks.size() > 1) {
                java.util.ArrayList<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> arrayList = this.mediaChunks;
                lastMediaChunk = arrayList.get(arrayList.size() - 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            jMax = java.lang.Math.max(jMax, lastMediaChunk.endTimeUs);
        }
        return java.lang.Math.max(jMax, this.primarySampleQueue.getLargestQueuedTimestampUs());
    }

    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j, seekParameters);
    }

    public void seekToUs(long j) {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk;
        boolean zSeekTo;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < this.mediaChunks.size()) {
                baseMediaChunk = this.mediaChunks.get(i2);
                long j2 = baseMediaChunk.startTimeUs;
                if (j2 == j && baseMediaChunk.clippedStartTimeUs == androidx.media3.common.C.TIME_UNSET) {
                    break;
                } else if (j2 <= j) {
                    i2++;
                }
            }
            baseMediaChunk = null;
            break;
        }
        if (baseMediaChunk != null) {
            zSeekTo = this.primarySampleQueue.seekTo(baseMediaChunk.getFirstSampleIndex(0));
        } else {
            zSeekTo = this.primarySampleQueue.seekTo(j, j < getNextLoadPositionUs());
        }
        if (zSeekTo) {
            this.nextNotifyPrimaryFormatMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), 0);
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            int length = sampleQueueArr.length;
            while (i < length) {
                sampleQueueArr[i].seekTo(j, true);
                i++;
            }
            return;
        }
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        this.nextNotifyPrimaryFormatMediaChunkIndex = 0;
        if (this.loader.isLoading()) {
            this.primarySampleQueue.discardToEnd();
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr2 = this.embeddedSampleQueues;
            int length2 = sampleQueueArr2.length;
            while (i < length2) {
                sampleQueueArr2[i].discardToEnd();
                i++;
            }
            this.loader.cancelLoading();
            return;
        }
        this.loader.clearFatalError();
        resetSampleQueues();
    }

    public void release() {
        release(null);
    }

    public void release(androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback<T> releaseCallback) {
        this.releaseCallback = releaseCallback;
        this.primarySampleQueue.preRelease();
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.preRelease();
        }
        this.loader.release(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        this.primarySampleQueue.release();
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.release();
        }
        this.chunkSource.release();
        androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback<T> releaseCallback = this.releaseCallback;
        if (releaseCallback != null) {
            releaseCallback.onSampleStreamReleased(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return !isPendingReset() && this.primarySampleQueue.isReady(this.loadingFinished);
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() throws java.io.IOException {
        this.loader.maybeThrowError();
        this.primarySampleQueue.maybeThrowError();
        if (this.loader.isLoading()) {
            return;
        }
        this.chunkSource.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
        if (isPendingReset()) {
            return -3;
        }
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null && baseMediaChunk.getFirstSampleIndex(0) <= this.primarySampleQueue.getReadIndex()) {
            return -3;
        }
        maybeNotifyPrimaryTrackFormatChanged();
        return this.primarySampleQueue.read(formatHolder, decoderInputBuffer, i, this.loadingFinished);
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j) {
        if (isPendingReset()) {
            return 0;
        }
        int skipCount = this.primarySampleQueue.getSkipCount(j, this.loadingFinished);
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null) {
            skipCount = java.lang.Math.min(skipCount, baseMediaChunk.getFirstSampleIndex(0) - this.primarySampleQueue.getReadIndex());
        }
        this.primarySampleQueue.skip(skipCount);
        maybeNotifyPrimaryTrackFormatChanged();
        return skipCount;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j2) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j2, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j2, boolean z) {
        this.loadingChunk = null;
        this.canceledMediaChunk = null;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j2, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z) {
            return;
        }
        if (isPendingReset()) {
            resetSampleQueues();
        } else if (isMediaChunk(chunk)) {
            discardUpstreamMediaChunksFromIndex(this.mediaChunks.size() - 1);
            if (this.mediaChunks.isEmpty()) {
                this.pendingResetPositionUs = this.lastSeekPositionUs;
            }
        }
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j2, java.io.IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        long jBytesLoaded = chunk.bytesLoaded();
        boolean zIsMediaChunk = isMediaChunk(chunk);
        int size = this.mediaChunks.size() - 1;
        boolean z = (jBytesLoaded != 0 && zIsMediaChunk && haveReadFromMediaChunk(size)) ? false : true;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j2, jBytesLoaded);
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, androidx.media3.common.util.Util.usToMs(chunk.startTimeUs), androidx.media3.common.util.Util.usToMs(chunk.endTimeUs)), iOException, i);
        if (!this.chunkSource.onChunkLoadError(chunk, z, loadErrorInfo, this.loadErrorHandlingPolicy)) {
            loadErrorActionCreateRetryAction = null;
        } else if (z) {
            loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
            if (zIsMediaChunk) {
                androidx.media3.common.util.Assertions.checkState(discardUpstreamMediaChunksFromIndex(size) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                }
            }
        } else {
            androidx.media3.common.util.Log.w(TAG, "Ignoring attempt to cancel non-cancelable load.");
            loadErrorActionCreateRetryAction = null;
        }
        if (loadErrorActionCreateRetryAction == null) {
            long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
            if (retryDelayMsFor != androidx.media3.common.C.TIME_UNSET) {
                loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.createRetryAction(false, retryDelayMsFor);
            } else {
                loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY_FATAL;
            }
        }
        boolean z2 = !loadErrorActionCreateRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, z2);
        if (z2) {
            this.loadingChunk = null;
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
            this.callback.onContinueLoadingRequested(this);
        }
        return loadErrorActionCreateRetryAction;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        java.util.List<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> listEmptyList;
        long j;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        boolean zIsPendingReset = isPendingReset();
        if (zIsPendingReset) {
            listEmptyList = java.util.Collections.emptyList();
            j = this.pendingResetPositionUs;
        } else {
            listEmptyList = this.readOnlyMediaChunks;
            j = getLastMediaChunk().endTimeUs;
        }
        this.chunkSource.getNextChunk(loadingInfo, j, listEmptyList, this.nextChunkHolder);
        boolean z = this.nextChunkHolder.endOfStream;
        androidx.media3.exoplayer.source.chunk.Chunk chunk = this.nextChunkHolder.chunk;
        this.nextChunkHolder.clear();
        if (z) {
            this.pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            return false;
        }
        this.loadingChunk = chunk;
        if (isMediaChunk(chunk)) {
            androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = (androidx.media3.exoplayer.source.chunk.BaseMediaChunk) chunk;
            if (zIsPendingReset) {
                long j2 = baseMediaChunk.startTimeUs;
                long j3 = this.pendingResetPositionUs;
                if (j2 != j3) {
                    this.primarySampleQueue.setStartTimeUs(j3);
                    for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
                        sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
                    }
                }
                this.pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
            }
            baseMediaChunk.init(this.chunkOutput);
            this.mediaChunks.add(baseMediaChunk);
        } else if (chunk instanceof androidx.media3.exoplayer.source.chunk.InitializationChunk) {
            ((androidx.media3.exoplayer.source.chunk.InitializationChunk) chunk).init(this.chunkOutput);
        }
        this.mediaSourceEventDispatcher.loadStarted(new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type))), chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
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
    public void reevaluateBuffer(long j) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (this.loader.isLoading()) {
            androidx.media3.exoplayer.source.chunk.Chunk chunk = (androidx.media3.exoplayer.source.chunk.Chunk) androidx.media3.common.util.Assertions.checkNotNull(this.loadingChunk);
            if (!(isMediaChunk(chunk) && haveReadFromMediaChunk(this.mediaChunks.size() - 1)) && this.chunkSource.shouldCancelLoad(j, chunk, this.readOnlyMediaChunks)) {
                this.loader.cancelLoading();
                if (isMediaChunk(chunk)) {
                    this.canceledMediaChunk = (androidx.media3.exoplayer.source.chunk.BaseMediaChunk) chunk;
                    return;
                }
                return;
            }
            return;
        }
        int preferredQueueSize = this.chunkSource.getPreferredQueueSize(j, this.readOnlyMediaChunks);
        if (preferredQueueSize < this.mediaChunks.size()) {
            discardUpstream(preferredQueueSize);
        }
    }

    private void discardUpstream(int i) {
        androidx.media3.common.util.Assertions.checkState(!this.loader.isLoading());
        int size = this.mediaChunks.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!haveReadFromMediaChunk(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = getLastMediaChunk().endTimeUs;
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunkDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primaryTrackType, baseMediaChunkDiscardUpstreamMediaChunksFromIndex.startTimeUs, j);
    }

    private boolean isMediaChunk(androidx.media3.exoplayer.source.chunk.Chunk chunk) {
        return chunk instanceof androidx.media3.exoplayer.source.chunk.BaseMediaChunk;
    }

    private void resetSampleQueues() {
        this.primarySampleQueue.reset();
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.reset();
        }
    }

    private boolean haveReadFromMediaChunk(int i) {
        int readIndex;
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i);
        if (this.primarySampleQueue.getReadIndex() > baseMediaChunk.getFirstSampleIndex(0)) {
            return true;
        }
        int i2 = 0;
        do {
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i2 >= sampleQueueArr.length) {
                return false;
            }
            readIndex = sampleQueueArr[i2].getReadIndex();
            i2++;
        } while (readIndex <= baseMediaChunk.getFirstSampleIndex(i2));
        return true;
    }

    boolean isPendingReset() {
        return this.pendingResetPositionUs != androidx.media3.common.C.TIME_UNSET;
    }

    private void discardDownstreamMediaChunks(int i) {
        int iMin = java.lang.Math.min(primarySampleIndexToMediaChunkIndex(i, 0), this.nextNotifyPrimaryFormatMediaChunkIndex);
        if (iMin > 0) {
            androidx.media3.common.util.Util.removeRange(this.mediaChunks, 0, iMin);
            this.nextNotifyPrimaryFormatMediaChunkIndex -= iMin;
        }
    }

    private void maybeNotifyPrimaryTrackFormatChanged() {
        int iPrimarySampleIndexToMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), this.nextNotifyPrimaryFormatMediaChunkIndex - 1);
        while (true) {
            int i = this.nextNotifyPrimaryFormatMediaChunkIndex;
            if (i > iPrimarySampleIndexToMediaChunkIndex) {
                return;
            }
            this.nextNotifyPrimaryFormatMediaChunkIndex = i + 1;
            maybeNotifyPrimaryTrackFormatChanged(i);
        }
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i) {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i);
        androidx.media3.common.Format format = baseMediaChunk.trackFormat;
        if (!format.equals(this.primaryDownstreamTrackFormat)) {
            this.mediaSourceEventDispatcher.downstreamFormatChanged(this.primaryTrackType, format, baseMediaChunk.trackSelectionReason, baseMediaChunk.trackSelectionData, baseMediaChunk.startTimeUs);
        }
        this.primaryDownstreamTrackFormat = format;
    }

    private int primarySampleIndexToMediaChunkIndex(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.mediaChunks.size()) {
                return this.mediaChunks.size() - 1;
            }
        } while (this.mediaChunks.get(i2).getFirstSampleIndex(0) <= i);
        return i2 - 1;
    }

    private androidx.media3.exoplayer.source.chunk.BaseMediaChunk getLastMediaChunk() {
        java.util.ArrayList<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> arrayList = this.mediaChunks;
        return arrayList.get(arrayList.size() - 1);
    }

    private androidx.media3.exoplayer.source.chunk.BaseMediaChunk discardUpstreamMediaChunksFromIndex(int i) {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i);
        java.util.ArrayList<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> arrayList = this.mediaChunks;
        androidx.media3.common.util.Util.removeRange(arrayList, i, arrayList.size());
        this.nextNotifyPrimaryFormatMediaChunkIndex = java.lang.Math.max(this.nextNotifyPrimaryFormatMediaChunkIndex, this.mediaChunks.size());
        int i2 = 0;
        this.primarySampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(0));
        while (true) {
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i2 >= sampleQueueArr.length) {
                return baseMediaChunk;
            }
            androidx.media3.exoplayer.source.SampleQueue sampleQueue = sampleQueueArr[i2];
            i2++;
            sampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(i2));
        }
    }

    public final class EmbeddedSampleStream implements androidx.media3.exoplayer.source.SampleStream {
        private final int index;
        private boolean notifiedDownstreamFormat;
        public final androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T> parent;
        private final androidx.media3.exoplayer.source.SampleQueue sampleQueue;

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }

        public EmbeddedSampleStream(androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T> chunkSampleStream, androidx.media3.exoplayer.source.SampleQueue sampleQueue, int i) {
            this.parent = chunkSampleStream;
            this.sampleQueue = sampleQueue;
            this.index = i;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.isPendingReset() && this.sampleQueue.isReady(androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.loadingFinished);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            if (androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.isPendingReset()) {
                return 0;
            }
            int skipCount = this.sampleQueue.getSkipCount(j, androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.loadingFinished);
            if (androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.canceledMediaChunk != null) {
                skipCount = java.lang.Math.min(skipCount, androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.canceledMediaChunk.getFirstSampleIndex(this.index + 1) - this.sampleQueue.getReadIndex());
            }
            this.sampleQueue.skip(skipCount);
            if (skipCount > 0) {
                maybeNotifyDownstreamFormat();
            }
            return skipCount;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            if (androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.isPendingReset()) {
                return -3;
            }
            if (androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.canceledMediaChunk != null && androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.canceledMediaChunk.getFirstSampleIndex(this.index + 1) <= this.sampleQueue.getReadIndex()) {
                return -3;
            }
            maybeNotifyDownstreamFormat();
            return this.sampleQueue.read(formatHolder, decoderInputBuffer, i, androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.loadingFinished);
        }

        public void release() {
            androidx.media3.common.util.Assertions.checkState(androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.embeddedTracksSelected[this.index]);
            androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.embeddedTracksSelected[this.index] = false;
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.notifiedDownstreamFormat) {
                return;
            }
            androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.mediaSourceEventDispatcher.downstreamFormatChanged(androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.embeddedTrackTypes[this.index], androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.embeddedTrackFormats[this.index], 0, null, androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.lastSeekPositionUs);
            this.notifiedDownstreamFormat = true;
        }
    }
}
