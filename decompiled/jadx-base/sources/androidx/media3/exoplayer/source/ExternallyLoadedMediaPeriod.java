package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
final class ExternallyLoadedMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod {
    private final androidx.media3.exoplayer.source.ExternalLoader externalLoader;
    private final java.util.concurrent.atomic.AtomicBoolean loadingFinished;
    private com.google.common.util.concurrent.ListenableFuture<?> loadingFuture;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> loadingThrowable;
    private final byte[] sampleData;
    private final androidx.media3.exoplayer.source.TrackGroupArray tracks;
    private final android.net.Uri uri;

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

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        return j;
    }

    public ExternallyLoadedMediaPeriod(android.net.Uri uri, java.lang.String str, androidx.media3.exoplayer.source.ExternalLoader externalLoader) {
        this.uri = uri;
        androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setSampleMimeType(str).build();
        this.externalLoader = externalLoader;
        this.tracks = new androidx.media3.exoplayer.source.TrackGroupArray(new androidx.media3.common.TrackGroup(formatBuild));
        this.sampleData = uri.toString().getBytes(com.google.common.base.Charsets.UTF_8);
        this.loadingFinished = new java.util.concurrent.atomic.AtomicBoolean();
        this.loadingThrowable = new java.util.concurrent.atomic.AtomicReference<>();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        callback.onPrepared(this);
        com.google.common.util.concurrent.ListenableFuture<?> listenableFutureLoad = this.externalLoader.load(new androidx.media3.exoplayer.source.ExternalLoader.LoadRequest(this.uri));
        this.loadingFuture = listenableFutureLoad;
        com.google.common.util.concurrent.Futures.addCallback(listenableFutureLoad, new com.google.common.util.concurrent.FutureCallback<java.lang.Object>() { // from class: androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.1
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(java.lang.Object obj) {
                androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.this.loadingFinished.set(true);
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.this.loadingThrowable.set(th);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return this.tracks;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            if (sampleStreamArr[i] != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                sampleStreamArr[i] = null;
            }
            if (sampleStreamArr[i] == null && exoTrackSelectionArr[i] != null) {
                sampleStreamArr[i] = new androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.SampleStreamImpl();
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.loadingFinished.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.loadingFinished.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        return !this.loadingFinished.get();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return !this.loadingFinished.get();
    }

    public void releasePeriod() {
        com.google.common.util.concurrent.ListenableFuture<?> listenableFuture = this.loadingFuture;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
    }

    private final class SampleStreamImpl implements androidx.media3.exoplayer.source.SampleStream {
        private static final int STREAM_STATE_END_OF_STREAM = 2;
        private static final int STREAM_STATE_SEND_FORMAT = 0;
        private static final int STREAM_STATE_SEND_SAMPLE = 1;
        private int streamState = 0;

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            return 0;
        }

        public SampleStreamImpl() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.this.loadingFinished.get();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
            java.lang.Throwable th = (java.lang.Throwable) androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.this.loadingThrowable.get();
            if (th != null) {
                throw new java.io.IOException(th);
            }
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            int i2 = this.streamState;
            if (i2 == 2) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                formatHolder.format = androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.this.tracks.get(0).getFormat(0);
                this.streamState = 1;
                return -5;
            }
            if (!androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.this.loadingFinished.get()) {
                return -3;
            }
            int length = androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.this.sampleData.length;
            decoderInputBuffer.addFlag(1);
            decoderInputBuffer.timeUs = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.ensureSpaceForWrite(length);
                decoderInputBuffer.data.put(androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.this.sampleData, 0, length);
            }
            if ((i & 1) == 0) {
                this.streamState = 2;
            }
            return -4;
        }
    }
}
