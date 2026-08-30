package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
final class SingleSampleMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.source.SingleSampleMediaPeriod.SourceLoadable> {
    private static final int INITIAL_SAMPLE_SIZE = 1024;
    private static final java.lang.String TAG = "SingleSampleMediaPeriod";
    private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private final androidx.media3.datasource.DataSpec dataSpec;
    private final long durationUs;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
    final androidx.media3.common.Format format;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    boolean loadingFinished;
    byte[] sampleData;
    int sampleSize;
    private final androidx.media3.exoplayer.source.TrackGroupArray tracks;
    private final androidx.media3.datasource.TransferListener transferListener;
    final boolean treatLoadErrorsAsEndOfStream;
    private final java.util.ArrayList<androidx.media3.exoplayer.source.SingleSampleMediaPeriod.SampleStreamImpl> sampleStreams = new java.util.ArrayList<>();
    final androidx.media3.exoplayer.upstream.Loader loader = new androidx.media3.exoplayer.upstream.Loader(TAG);

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
    }

    public SingleSampleMediaPeriod(androidx.media3.datasource.DataSpec dataSpec, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.datasource.TransferListener transferListener, androidx.media3.common.Format format, long j, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher, boolean z) {
        this.dataSpec = dataSpec;
        this.dataSourceFactory = factory;
        this.transferListener = transferListener;
        this.format = format;
        this.durationUs = j;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher;
        this.treatLoadErrorsAsEndOfStream = z;
        this.tracks = new androidx.media3.exoplayer.source.TrackGroupArray(new androidx.media3.common.TrackGroup(format));
    }

    public void release() {
        this.loader.release();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return this.tracks;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i];
            if (sampleStream != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                this.sampleStreams.remove(sampleStream);
                sampleStreamArr[i] = null;
            }
            if (sampleStreamArr[i] == null && exoTrackSelectionArr[i] != null) {
                androidx.media3.exoplayer.source.SingleSampleMediaPeriod.SampleStreamImpl sampleStreamImpl = new androidx.media3.exoplayer.source.SingleSampleMediaPeriod.SampleStreamImpl();
                this.sampleStreams.add(sampleStreamImpl);
                sampleStreamArr[i] = sampleStreamImpl;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        androidx.media3.datasource.DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
        androidx.media3.datasource.TransferListener transferListener = this.transferListener;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        androidx.media3.exoplayer.source.SingleSampleMediaPeriod.SourceLoadable sourceLoadable = new androidx.media3.exoplayer.source.SingleSampleMediaPeriod.SourceLoadable(this.dataSpec, dataSourceCreateDataSource);
        this.eventDispatcher.loadStarted(new androidx.media3.exoplayer.source.LoadEventInfo(sourceLoadable.loadTaskId, this.dataSpec, this.loader.startLoading(sourceLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(1))), 1, -1, this.format, 0, null, 0L, this.durationUs);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return (this.loadingFinished || this.loader.isLoading()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.loadingFinished ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        for (int i = 0; i < this.sampleStreams.size(); i++) {
            this.sampleStreams.get(i).reset();
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(androidx.media3.exoplayer.source.SingleSampleMediaPeriod.SourceLoadable sourceLoadable, long j, long j2) {
        this.sampleSize = (int) sourceLoadable.dataSource.getBytesRead();
        this.sampleData = (byte[]) androidx.media3.common.util.Assertions.checkNotNull(sourceLoadable.sampleData);
        this.loadingFinished = true;
        androidx.media3.datasource.StatsDataSource statsDataSource = sourceLoadable.dataSource;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(sourceLoadable.loadTaskId, sourceLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, this.sampleSize);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(sourceLoadable.loadTaskId);
        this.eventDispatcher.loadCompleted(loadEventInfo, 1, -1, this.format, 0, null, 0L, this.durationUs);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(androidx.media3.exoplayer.source.SingleSampleMediaPeriod.SourceLoadable sourceLoadable, long j, long j2, boolean z) {
        androidx.media3.datasource.StatsDataSource statsDataSource = sourceLoadable.dataSource;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(sourceLoadable.loadTaskId, sourceLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(sourceLoadable.loadTaskId);
        this.eventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, 0L, this.durationUs);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.source.SingleSampleMediaPeriod.SourceLoadable sourceLoadable, long j, long j2, java.io.IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        androidx.media3.datasource.StatsDataSource statsDataSource = sourceLoadable.dataSource;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(sourceLoadable.loadTaskId, sourceLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(1, -1, this.format, 0, null, 0L, androidx.media3.common.util.Util.usToMs(this.durationUs)), iOException, i));
        boolean z = retryDelayMsFor == androidx.media3.common.C.TIME_UNSET || i >= this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(1);
        if (this.treatLoadErrorsAsEndOfStream && z) {
            androidx.media3.common.util.Log.w(TAG, "Loading failed, treating as end-of-stream.", iOException);
            this.loadingFinished = true;
            loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
        } else if (retryDelayMsFor != androidx.media3.common.C.TIME_UNSET) {
            loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.createRetryAction(false, retryDelayMsFor);
        } else {
            loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY_FATAL;
        }
        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorAction = loadErrorActionCreateRetryAction;
        boolean z2 = !loadErrorAction.isRetry();
        this.eventDispatcher.loadError(loadEventInfo, 1, -1, this.format, 0, null, 0L, this.durationUs, iOException, z2);
        if (z2) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(sourceLoadable.loadTaskId);
        }
        return loadErrorAction;
    }

    private final class SampleStreamImpl implements androidx.media3.exoplayer.source.SampleStream {
        private static final int STREAM_STATE_END_OF_STREAM = 2;
        private static final int STREAM_STATE_SEND_FORMAT = 0;
        private static final int STREAM_STATE_SEND_SAMPLE = 1;
        private boolean notifiedDownstreamFormat;
        private int streamState;

        private SampleStreamImpl() {
        }

        public void reset() {
            if (this.streamState == 2) {
                this.streamState = 1;
            }
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.loadingFinished;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
            if (androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.treatLoadErrorsAsEndOfStream) {
                return;
            }
            androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.loader.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            maybeNotifyDownstreamFormat();
            if (androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.loadingFinished && androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.sampleData == null) {
                this.streamState = 2;
            }
            int i2 = this.streamState;
            if (i2 == 2) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                formatHolder.format = androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.format;
                this.streamState = 1;
                return -5;
            }
            if (!androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.loadingFinished) {
                return -3;
            }
            androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.sampleData);
            decoderInputBuffer.addFlag(1);
            decoderInputBuffer.timeUs = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.ensureSpaceForWrite(androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.sampleSize);
                decoderInputBuffer.data.put(androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.sampleData, 0, androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.sampleSize);
            }
            if ((i & 1) == 0) {
                this.streamState = 2;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            maybeNotifyDownstreamFormat();
            if (j <= 0 || this.streamState == 2) {
                return 0;
            }
            this.streamState = 2;
            return 1;
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.notifiedDownstreamFormat) {
                return;
            }
            androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.eventDispatcher.downstreamFormatChanged(androidx.media3.common.MimeTypes.getTrackType(androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.format.sampleMimeType), androidx.media3.exoplayer.source.SingleSampleMediaPeriod.this.format, 0, null, 0L);
            this.notifiedDownstreamFormat = true;
        }
    }

    static final class SourceLoadable implements androidx.media3.exoplayer.upstream.Loader.Loadable {
        private final androidx.media3.datasource.StatsDataSource dataSource;
        public final androidx.media3.datasource.DataSpec dataSpec;
        public final long loadTaskId = androidx.media3.exoplayer.source.LoadEventInfo.getNewId();
        private byte[] sampleData;

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        public SourceLoadable(androidx.media3.datasource.DataSpec dataSpec, androidx.media3.datasource.DataSource dataSource) {
            this.dataSpec = dataSpec;
            this.dataSource = new androidx.media3.datasource.StatsDataSource(dataSource);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() throws java.io.IOException {
            this.dataSource.resetBytesRead();
            try {
                this.dataSource.open(this.dataSpec);
                int i = 0;
                while (i != -1) {
                    int bytesRead = (int) this.dataSource.getBytesRead();
                    byte[] bArr = this.sampleData;
                    if (bArr == null) {
                        this.sampleData = new byte[1024];
                    } else if (bytesRead == bArr.length) {
                        this.sampleData = java.util.Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    androidx.media3.datasource.StatsDataSource statsDataSource = this.dataSource;
                    byte[] bArr2 = this.sampleData;
                    i = statsDataSource.read(bArr2, bytesRead, bArr2.length - bytesRead);
                }
            } finally {
                androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
            }
        }
    }
}
