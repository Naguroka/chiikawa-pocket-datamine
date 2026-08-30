package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class ProgressiveMediaSource extends androidx.media3.exoplayer.source.BaseMediaSource implements androidx.media3.exoplayer.source.ProgressiveMediaPeriod.Listener {
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    private final int continueLoadingCheckIntervalBytes;
    private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadableLoadErrorHandlingPolicy;
    private androidx.media3.common.MediaItem mediaItem;
    private final androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;
    private long timelineDurationUs;
    private boolean timelineIsLive;
    private boolean timelineIsPlaceholder;
    private boolean timelineIsSeekable;
    private androidx.media3.datasource.TransferListener transferListener;

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    public static final class Factory implements androidx.media3.exoplayer.source.MediaSourceFactory {
        private int continueLoadingCheckIntervalBytes;
        private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
        private androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        public Factory(androidx.media3.datasource.DataSource.Factory factory) {
            this(factory, new androidx.media3.extractor.DefaultExtractorsFactory());
        }

        public Factory(androidx.media3.datasource.DataSource.Factory factory, final androidx.media3.extractor.ExtractorsFactory extractorsFactory) {
            this(factory, new androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory() { // from class: androidx.media3.exoplayer.source.ProgressiveMediaSource$Factory$$ExternalSyntheticLambda0
                @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
                public final androidx.media3.exoplayer.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(androidx.media3.exoplayer.analytics.PlayerId playerId) {
                    return androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory.lambda$new$0(extractorsFactory, playerId);
                }
            });
        }

        static /* synthetic */ androidx.media3.exoplayer.source.ProgressiveMediaExtractor lambda$new$0(androidx.media3.extractor.ExtractorsFactory extractorsFactory, androidx.media3.exoplayer.analytics.PlayerId playerId) {
            return new androidx.media3.exoplayer.source.BundledExtractorsAdapter(extractorsFactory);
        }

        public Factory(androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory factory2) {
            this(factory, factory2, new androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider(), new androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy(), 1048576);
        }

        public Factory(androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory factory2, androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i) {
            this.dataSourceFactory = factory;
            this.progressiveMediaExtractorFactory = factory2;
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            this.continueLoadingCheckIntervalBytes = i;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy) androidx.media3.common.util.Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory setContinueLoadingCheckIntervalBytes(int i) {
            this.continueLoadingCheckIntervalBytes = i;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = (androidx.media3.exoplayer.drm.DrmSessionManagerProvider) androidx.media3.common.util.Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.ProgressiveMediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem) {
            androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration);
            return new androidx.media3.exoplayer.source.ProgressiveMediaSource(mediaItem, this.dataSourceFactory, this.progressiveMediaExtractorFactory, this.drmSessionManagerProvider.get(mediaItem), this.loadErrorHandlingPolicy, this.continueLoadingCheckIntervalBytes);
        }
    }

    private ProgressiveMediaSource(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory factory2, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i) {
        this.mediaItem = mediaItem;
        this.dataSourceFactory = factory;
        this.progressiveMediaExtractorFactory = factory2;
        this.drmSessionManager = drmSessionManager;
        this.loadableLoadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.continueLoadingCheckIntervalBytes = i;
        this.timelineIsPlaceholder = true;
        this.timelineDurationUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized androidx.media3.common.MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = getLocalConfiguration();
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration2 = mediaItem.localConfiguration;
        return localConfiguration2 != null && localConfiguration2.uri.equals(localConfiguration.uri) && localConfiguration2.imageDurationMs == localConfiguration.imageDurationMs && androidx.media3.common.util.Util.areEqual(localConfiguration2.customCacheKey, localConfiguration.customCacheKey);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        this.transferListener = transferListener;
        this.drmSessionManager.setPlayer((android.os.Looper) androidx.media3.common.util.Assertions.checkNotNull(android.os.Looper.myLooper()), getPlayerId());
        this.drmSessionManager.prepare();
        notifySourceInfoRefreshed();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        androidx.media3.datasource.DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
        androidx.media3.datasource.TransferListener transferListener = this.transferListener;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = getLocalConfiguration();
        return new androidx.media3.exoplayer.source.ProgressiveMediaPeriod(localConfiguration.uri, dataSourceCreateDataSource, this.progressiveMediaExtractorFactory.createProgressiveMediaExtractor(getPlayerId()), this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadableLoadErrorHandlingPolicy, createEventDispatcher(mediaPeriodId), this, allocator, localConfiguration.customCacheKey, this.continueLoadingCheckIntervalBytes, androidx.media3.common.util.Util.msToUs(localConfiguration.imageDurationMs));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.ProgressiveMediaPeriod) mediaPeriod).release();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        this.drmSessionManager.release();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaPeriod.Listener
    public void onSourceInfoRefreshed(long j, boolean z, boolean z2) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = this.timelineDurationUs;
        }
        if (!this.timelineIsPlaceholder && this.timelineDurationUs == j && this.timelineIsSeekable == z && this.timelineIsLive == z2) {
            return;
        }
        this.timelineDurationUs = j;
        this.timelineIsSeekable = z;
        this.timelineIsLive = z2;
        this.timelineIsPlaceholder = false;
        notifySourceInfoRefreshed();
    }

    private androidx.media3.common.MediaItem.LocalConfiguration getLocalConfiguration() {
        return (androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(getMediaItem().localConfiguration);
    }

    private void notifySourceInfoRefreshed() {
        androidx.media3.common.Timeline singlePeriodTimeline = new androidx.media3.exoplayer.source.SinglePeriodTimeline(this.timelineDurationUs, this.timelineIsSeekable, false, this.timelineIsLive, (java.lang.Object) null, getMediaItem());
        if (this.timelineIsPlaceholder) {
            singlePeriodTimeline = new androidx.media3.exoplayer.source.ForwardingTimeline(singlePeriodTimeline) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaSource.1
                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
                    super.getWindow(i, window, j);
                    window.isPlaceholder = true;
                    return window;
                }

                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
                    super.getPeriod(i, period, z);
                    period.isPlaceholder = true;
                    return period;
                }
            };
        }
        refreshSourceInfo(singlePeriodTimeline);
    }
}
