package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource extends androidx.media3.exoplayer.source.BaseMediaSource {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;
    public static final java.lang.String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    public static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final java.lang.String TAG = "DashMediaSource";
    private final androidx.media3.exoplayer.dash.BaseUrlExclusionList baseUrlExclusionList;
    private final androidx.media3.exoplayer.dash.DashChunkSource.Factory chunkSourceFactory;
    private final androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration;
    private final androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private androidx.media3.datasource.DataSource dataSource;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private android.os.Handler handler;
    private android.net.Uri initialManifestUri;
    private androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private androidx.media3.exoplayer.upstream.Loader loader;
    private androidx.media3.exoplayer.dash.manifest.DashManifest manifest;
    private final androidx.media3.exoplayer.dash.DashMediaSource.ManifestCallback manifestCallback;
    private final androidx.media3.datasource.DataSource.Factory manifestDataSourceFactory;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    private java.io.IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final androidx.media3.exoplayer.upstream.LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends androidx.media3.exoplayer.dash.manifest.DashManifest> manifestParser;
    private android.net.Uri manifestUri;
    private final java.lang.Object manifestUriLock;
    private androidx.media3.common.MediaItem mediaItem;
    private androidx.media3.datasource.TransferListener mediaTransferListener;
    private final long minLiveStartPositionUs;
    private final android.util.SparseArray<androidx.media3.exoplayer.dash.DashMediaPeriod> periodsById;
    private final androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final java.lang.Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final java.lang.Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.exoplayer.dash");
    }

    public static final class Factory implements androidx.media3.exoplayer.source.MediaSourceFactory {
        private final androidx.media3.exoplayer.dash.DashChunkSource.Factory chunkSourceFactory;
        private androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfigurationFactory;
        private androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private final androidx.media3.datasource.DataSource.Factory manifestDataSourceFactory;
        private androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends androidx.media3.exoplayer.dash.manifest.DashManifest> manifestParser;
        private long minLiveStartPositionUs;

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory(androidx.media3.datasource.DataSource.Factory factory) {
            this(new androidx.media3.exoplayer.dash.DefaultDashChunkSource.Factory(factory), factory);
        }

        public Factory(androidx.media3.exoplayer.dash.DashChunkSource.Factory factory, androidx.media3.datasource.DataSource.Factory factory2) {
            this.chunkSourceFactory = (androidx.media3.exoplayer.dash.DashChunkSource.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory);
            this.manifestDataSourceFactory = factory2;
            this.drmSessionManagerProvider = new androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider();
            this.loadErrorHandlingPolicy = new androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy();
            this.fallbackTargetLiveOffsetMs = 30000L;
            this.minLiveStartPositionUs = androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
            this.compositeSequenceableLoaderFactory = new androidx.media3.exoplayer.source.DefaultCompositeSequenceableLoaderFactory();
            experimentalParseSubtitlesDuringExtraction(true);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.dash.DashMediaSource.Factory setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = (androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.dash.DashMediaSource.Factory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = (androidx.media3.exoplayer.drm.DrmSessionManagerProvider) androidx.media3.common.util.Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.dash.DashMediaSource.Factory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy) androidx.media3.common.util.Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.dash.DashMediaSource.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            this.chunkSourceFactory.setSubtitleParserFactory((androidx.media3.extractor.text.SubtitleParser.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory));
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @java.lang.Deprecated
        public androidx.media3.exoplayer.dash.DashMediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            this.chunkSourceFactory.experimentalParseSubtitlesDuringExtraction(z);
            return this;
        }

        public androidx.media3.exoplayer.dash.DashMediaSource.Factory setFallbackTargetLiveOffsetMs(long j) {
            this.fallbackTargetLiveOffsetMs = j;
            return this;
        }

        public androidx.media3.exoplayer.dash.DashMediaSource.Factory setMinLiveStartPositionUs(long j) {
            this.minLiveStartPositionUs = j;
            return this;
        }

        public androidx.media3.exoplayer.dash.DashMediaSource.Factory setManifestParser(androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends androidx.media3.exoplayer.dash.manifest.DashManifest> parser) {
            this.manifestParser = parser;
            return this;
        }

        public androidx.media3.exoplayer.dash.DashMediaSource.Factory setCompositeSequenceableLoaderFactory(androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            this.compositeSequenceableLoaderFactory = (androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory) androidx.media3.common.util.Assertions.checkNotNull(compositeSequenceableLoaderFactory, "DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public androidx.media3.exoplayer.dash.DashMediaSource createMediaSource(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest) {
            return createMediaSource(dashManifest, new androidx.media3.common.MediaItem.Builder().setUri(android.net.Uri.EMPTY).setMediaId("DashMediaSource").setMimeType(androidx.media3.common.MimeTypes.APPLICATION_MPD).build());
        }

        public androidx.media3.exoplayer.dash.DashMediaSource createMediaSource(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, androidx.media3.common.MediaItem mediaItem) {
            androidx.media3.common.util.Assertions.checkArgument(!dashManifest.dynamic);
            androidx.media3.common.MediaItem.Builder mimeType = mediaItem.buildUpon().setMimeType(androidx.media3.common.MimeTypes.APPLICATION_MPD);
            if (mediaItem.localConfiguration == null) {
                mimeType.setUri(android.net.Uri.EMPTY);
            }
            androidx.media3.common.MediaItem mediaItemBuild = mimeType.build();
            androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            return new androidx.media3.exoplayer.dash.DashMediaSource(mediaItemBuild, dashManifest, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, factory == null ? null : factory.createCmcdConfiguration(mediaItemBuild), this.drmSessionManagerProvider.get(mediaItemBuild), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, this.minLiveStartPositionUs);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.dash.DashMediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem) {
            androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration);
            androidx.media3.exoplayer.upstream.ParsingLoadable.Parser dashManifestParser = this.manifestParser;
            if (dashManifestParser == null) {
                dashManifestParser = new androidx.media3.exoplayer.dash.manifest.DashManifestParser();
            }
            java.util.List<androidx.media3.common.StreamKey> list = mediaItem.localConfiguration.streamKeys;
            androidx.media3.exoplayer.upstream.ParsingLoadable.Parser filteringManifestParser = !list.isEmpty() ? new androidx.media3.exoplayer.offline.FilteringManifestParser(dashManifestParser, list) : dashManifestParser;
            androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            return new androidx.media3.exoplayer.dash.DashMediaSource(mediaItem, null, this.manifestDataSourceFactory, filteringManifestParser, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, factory == null ? null : factory.createCmcdConfiguration(mediaItem), this.drmSessionManagerProvider.get(mediaItem), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, this.minLiveStartPositionUs);
        }
    }

    private DashMediaSource(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends androidx.media3.exoplayer.dash.manifest.DashManifest> parser, androidx.media3.exoplayer.dash.DashChunkSource.Factory factory2, androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j, long j2) {
        this.mediaItem = mediaItem;
        this.liveConfiguration = mediaItem.liveConfiguration;
        this.manifestUri = ((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration)).uri;
        this.initialManifestUri = mediaItem.localConfiguration.uri;
        this.manifest = dashManifest;
        this.manifestDataSourceFactory = factory;
        this.manifestParser = parser;
        this.chunkSourceFactory = factory2;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.fallbackTargetLiveOffsetMs = j;
        this.minLiveStartPositionUs = j2;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.baseUrlExclusionList = new androidx.media3.exoplayer.dash.BaseUrlExclusionList();
        boolean z = dashManifest != null;
        this.sideloadedManifest = z;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new java.lang.Object();
        this.periodsById = new android.util.SparseArray<>();
        this.playerEmsgCallback = new androidx.media3.exoplayer.dash.DashMediaSource.DefaultPlayerEmsgCallback();
        this.expiredManifestPublishTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.elapsedRealtimeOffsetMs = androidx.media3.common.C.TIME_UNSET;
        if (z) {
            androidx.media3.common.util.Assertions.checkState(true ^ dashManifest.dynamic);
            this.manifestCallback = null;
            this.refreshManifestRunnable = null;
            this.simulateManifestRefreshRunnable = null;
            this.manifestLoadErrorThrower = new androidx.media3.exoplayer.upstream.LoaderErrorThrower.Placeholder();
            return;
        }
        this.manifestCallback = new androidx.media3.exoplayer.dash.DashMediaSource.ManifestCallback();
        this.manifestLoadErrorThrower = new androidx.media3.exoplayer.dash.DashMediaSource.ManifestLoadErrorThrower();
        this.refreshManifestRunnable = new java.lang.Runnable() { // from class: androidx.media3.exoplayer.dash.DashMediaSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.startLoadingManifest();
            }
        };
        this.simulateManifestRefreshRunnable = new java.lang.Runnable() { // from class: androidx.media3.exoplayer.dash.DashMediaSource$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m151lambda$new$0$androidxmedia3exoplayerdashDashMediaSource();
            }
        };
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-exoplayer-dash-DashMediaSource, reason: not valid java name */
    /* synthetic */ void m151lambda$new$0$androidxmedia3exoplayerdashDashMediaSource() {
        processManifest(false);
    }

    public void replaceManifestUri(android.net.Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized androidx.media3.common.MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.MediaItem mediaItem2 = getMediaItem();
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = (androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(mediaItem2.localConfiguration);
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration2 = mediaItem.localConfiguration;
        return localConfiguration2 != null && localConfiguration2.uri.equals(localConfiguration.uri) && localConfiguration2.streamKeys.equals(localConfiguration.streamKeys) && androidx.media3.common.util.Util.areEqual(localConfiguration2.drmConfiguration, localConfiguration.drmConfiguration) && mediaItem2.liveConfiguration.equals(mediaItem.liveConfiguration);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.drmSessionManager.setPlayer(android.os.Looper.myLooper(), getPlayerId());
        this.drmSessionManager.prepare();
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.createDataSource();
        this.loader = new androidx.media3.exoplayer.upstream.Loader("DashMediaSource");
        this.handler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
        startLoadingManifest();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
        this.manifestLoadErrorThrower.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        int iIntValue = ((java.lang.Integer) mediaPeriodId.periodUid).intValue() - this.firstPeriodId;
        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId);
        androidx.media3.exoplayer.dash.DashMediaPeriod dashMediaPeriod = new androidx.media3.exoplayer.dash.DashMediaPeriod(iIntValue + this.firstPeriodId, this.manifest, this.baseUrlExclusionList, iIntValue, this.chunkSourceFactory, this.mediaTransferListener, this.cmcdConfiguration, this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, allocator, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback, getPlayerId());
        this.periodsById.put(dashMediaPeriod.id, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.dash.DashMediaPeriod dashMediaPeriod = (androidx.media3.exoplayer.dash.DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.release();
        this.periodsById.remove(dashMediaPeriod.id);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        androidx.media3.exoplayer.upstream.Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0L;
        this.manifestLoadEndTimestampMs = 0L;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        android.os.Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = androidx.media3.common.C.TIME_UNSET;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.periodsById.clear();
        this.baseUrlExclusionList.reset();
        this.drmSessionManager.release();
    }

    void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    void onDashManifestPublishTimeExpired(long j) {
        long j2 = this.expiredManifestPublishTimeUs;
        if (j2 == androidx.media3.common.C.TIME_UNSET || j2 < j) {
            this.expiredManifestPublishTimeUs = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
    void onManifestLoadCompleted(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.dash.manifest.DashManifest> parsingLoadable, long j, long j2) {
        boolean z;
        int i;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        androidx.media3.exoplayer.dash.manifest.DashManifest result = parsingLoadable.getResult();
        androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest = this.manifest;
        int periodCount = dashManifest == null ? 0 : dashManifest.getPeriodCount();
        long j3 = result.getPeriod(0).startMs;
        int i2 = 0;
        while (i2 < periodCount && this.manifest.getPeriod(i2).startMs < j3) {
            i2++;
        }
        if (result.dynamic) {
            if (periodCount - i2 > result.getPeriodCount()) {
                androidx.media3.common.util.Log.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                if (this.expiredManifestPublishTimeUs == androidx.media3.common.C.TIME_UNSET || result.publishTimeMs * 1000 > this.expiredManifestPublishTimeUs) {
                    z = false;
                } else {
                    androidx.media3.common.util.Log.w("DashMediaSource", "Loaded stale dynamic manifest: " + result.publishTimeMs + ", " + this.expiredManifestPublishTimeUs);
                }
                if (z) {
                    i = this.staleManifestReloadAttempt;
                    this.staleManifestReloadAttempt = i + 1;
                    if (i < this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type)) {
                        scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                        return;
                    } else {
                        this.manifestFatalError = new androidx.media3.exoplayer.dash.DashManifestStaleException();
                        return;
                    }
                }
                this.staleManifestReloadAttempt = 0;
            }
            z = true;
            if (z) {
                i = this.staleManifestReloadAttempt;
                this.staleManifestReloadAttempt = i + 1;
                if (i < this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type)) {
                    scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                    return;
                } else {
                    this.manifestFatalError = new androidx.media3.exoplayer.dash.DashManifestStaleException();
                    return;
                }
            }
            this.staleManifestReloadAttempt = 0;
        }
        this.manifest = result;
        this.manifestLoadPending = result.dynamic & this.manifestLoadPending;
        this.manifestLoadStartTimestampMs = j - j2;
        this.manifestLoadEndTimestampMs = j;
        this.firstPeriodId += i2;
        synchronized (this.manifestUriLock) {
            if (parsingLoadable.dataSpec.uri == this.manifestUri) {
                this.manifestUri = this.manifest.location != null ? this.manifest.location : parsingLoadable.getUri();
            }
        }
        if (this.manifest.dynamic && this.elapsedRealtimeOffsetMs == androidx.media3.common.C.TIME_UNSET) {
            if (this.manifest.utcTiming != null) {
                resolveUtcTimingElement(this.manifest.utcTiming);
                return;
            } else {
                loadNtpTimeOffset();
                return;
            }
        }
        processManifest(true);
    }

    androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onManifestLoadError(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.dash.manifest.DashManifest> parsingLoadable, long j, long j2, java.io.IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(parsingLoadable.type), iOException, i));
        if (retryDelayMsFor == androidx.media3.common.C.TIME_UNSET) {
            loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY_FATAL;
        } else {
            loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.createRetryAction(false, retryDelayMsFor);
        }
        boolean z = !loadErrorActionCreateRetryAction.isRetry();
        this.manifestEventDispatcher.loadError(loadEventInfo, parsingLoadable.type, iOException, z);
        if (z) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    void onUtcTimestampLoadCompleted(androidx.media3.exoplayer.upstream.ParsingLoadable<java.lang.Long> parsingLoadable, long j, long j2) {
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        onUtcTimestampResolved(parsingLoadable.getResult().longValue() - j);
    }

    androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onUtcTimestampLoadError(androidx.media3.exoplayer.upstream.ParsingLoadable<java.lang.Long> parsingLoadable, long j, long j2, java.io.IOException iOException) {
        this.manifestEventDispatcher.loadError(new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded()), parsingLoadable.type, iOException, true);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        onUtcTimestampResolutionError(iOException);
        return androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
    }

    void onLoadCanceled(androidx.media3.exoplayer.upstream.ParsingLoadable<?> parsingLoadable, long j, long j2) {
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCanceled(loadEventInfo, parsingLoadable.type);
    }

    private void resolveUtcTimingElement(androidx.media3.exoplayer.dash.manifest.UtcTimingElement utcTimingElement) {
        java.lang.String str = utcTimingElement.schemeIdUri;
        if (androidx.media3.common.util.Util.areEqual(str, "urn:mpeg:dash:utc:direct:2014") || androidx.media3.common.util.Util.areEqual(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(utcTimingElement);
            return;
        }
        if (androidx.media3.common.util.Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2014") || androidx.media3.common.util.Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new androidx.media3.exoplayer.dash.DashMediaSource.Iso8601Parser());
            return;
        }
        if (androidx.media3.common.util.Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2014") || androidx.media3.common.util.Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new androidx.media3.exoplayer.dash.DashMediaSource.XsDateTimeParser());
        } else if (androidx.media3.common.util.Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2014") || androidx.media3.common.util.Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2012")) {
            loadNtpTimeOffset();
        } else {
            onUtcTimestampResolutionError(new java.io.IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(androidx.media3.exoplayer.dash.manifest.UtcTimingElement utcTimingElement) {
        try {
            onUtcTimestampResolved(androidx.media3.common.util.Util.parseXsDateTime(utcTimingElement.value) - this.manifestLoadEndTimestampMs);
        } catch (androidx.media3.common.ParserException e) {
            onUtcTimestampResolutionError(e);
        }
    }

    private void resolveUtcTimingElementHttp(androidx.media3.exoplayer.dash.manifest.UtcTimingElement utcTimingElement, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<java.lang.Long> parser) {
        startLoading(new androidx.media3.exoplayer.upstream.ParsingLoadable(this.dataSource, android.net.Uri.parse(utcTimingElement.value), 5, parser), new androidx.media3.exoplayer.dash.DashMediaSource.UtcTimestampCallback(), 1);
    }

    private void loadNtpTimeOffset() {
        androidx.media3.exoplayer.util.SntpClient.initialize(this.loader, new androidx.media3.exoplayer.util.SntpClient.InitializationCallback() { // from class: androidx.media3.exoplayer.dash.DashMediaSource.1
            @Override // androidx.media3.exoplayer.util.SntpClient.InitializationCallback
            public void onInitialized() {
                androidx.media3.exoplayer.dash.DashMediaSource.this.onUtcTimestampResolved(androidx.media3.exoplayer.util.SntpClient.getElapsedRealtimeOffsetMs());
            }

            @Override // androidx.media3.exoplayer.util.SntpClient.InitializationCallback
            public void onInitializationFailed(java.io.IOException iOException) {
                androidx.media3.exoplayer.dash.DashMediaSource.this.onUtcTimestampResolutionError(iOException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolved(long j) {
        this.elapsedRealtimeOffsetMs = j;
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolutionError(java.io.IOException iOException) {
        androidx.media3.common.util.Log.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.elapsedRealtimeOffsetMs = java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime();
        processManifest(true);
    }

    private void processManifest(boolean z) {
        long j;
        long j2;
        for (int i = 0; i < this.periodsById.size(); i++) {
            int iKeyAt = this.periodsById.keyAt(i);
            if (iKeyAt >= this.firstPeriodId) {
                this.periodsById.valueAt(i).updateManifest(this.manifest, iKeyAt - this.firstPeriodId);
            }
        }
        androidx.media3.exoplayer.dash.manifest.Period period = this.manifest.getPeriod(0);
        int periodCount = this.manifest.getPeriodCount() - 1;
        androidx.media3.exoplayer.dash.manifest.Period period2 = this.manifest.getPeriod(periodCount);
        long periodDurationUs = this.manifest.getPeriodDurationUs(periodCount);
        long jMsToUs = androidx.media3.common.util.Util.msToUs(androidx.media3.common.util.Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs));
        long availableStartTimeInManifestUs = getAvailableStartTimeInManifestUs(period, this.manifest.getPeriodDurationUs(0), jMsToUs);
        long availableEndTimeInManifestUs = getAvailableEndTimeInManifestUs(period2, periodDurationUs, jMsToUs);
        boolean z2 = this.manifest.dynamic && !isIndexExplicit(period2);
        if (z2 && this.manifest.timeShiftBufferDepthMs != androidx.media3.common.C.TIME_UNSET) {
            availableStartTimeInManifestUs = java.lang.Math.max(availableStartTimeInManifestUs, availableEndTimeInManifestUs - androidx.media3.common.util.Util.msToUs(this.manifest.timeShiftBufferDepthMs));
        }
        long j3 = availableEndTimeInManifestUs - availableStartTimeInManifestUs;
        if (this.manifest.dynamic) {
            androidx.media3.common.util.Assertions.checkState(this.manifest.availabilityStartTimeMs != androidx.media3.common.C.TIME_UNSET);
            long jMsToUs2 = (jMsToUs - androidx.media3.common.util.Util.msToUs(this.manifest.availabilityStartTimeMs)) - availableStartTimeInManifestUs;
            updateLiveConfiguration(jMsToUs2, j3);
            long jUsToMs = this.manifest.availabilityStartTimeMs + androidx.media3.common.util.Util.usToMs(availableStartTimeInManifestUs);
            long jMsToUs3 = jMsToUs2 - androidx.media3.common.util.Util.msToUs(this.liveConfiguration.targetOffsetMs);
            j = jUsToMs;
            long jMin = java.lang.Math.min(this.minLiveStartPositionUs, j3 / 2);
            j2 = jMsToUs3 < jMin ? jMin : jMsToUs3;
        } else {
            j = androidx.media3.common.C.TIME_UNSET;
            j2 = 0;
        }
        refreshSourceInfo(new androidx.media3.exoplayer.dash.DashMediaSource.DashTimeline(this.manifest.availabilityStartTimeMs, j, this.elapsedRealtimeOffsetMs, this.firstPeriodId, availableStartTimeInManifestUs - androidx.media3.common.util.Util.msToUs(period.startMs), j3, j2, this.manifest, getMediaItem(), this.manifest.dynamic ? this.liveConfiguration : null));
        if (this.sideloadedManifest) {
            return;
        }
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        if (z2) {
            this.handler.postDelayed(this.simulateManifestRefreshRunnable, getIntervalUntilNextManifestRefreshMs(this.manifest, androidx.media3.common.util.Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs)));
        }
        if (this.manifestLoadPending) {
            startLoadingManifest();
            return;
        }
        if (z && this.manifest.dynamic && this.manifest.minUpdatePeriodMs != androidx.media3.common.C.TIME_UNSET) {
            long j4 = this.manifest.minUpdatePeriodMs;
            if (j4 == 0) {
                j4 = 5000;
            }
            scheduleManifestRefresh(java.lang.Math.max(0L, (this.manifestLoadStartTimestampMs + j4) - android.os.SystemClock.elapsedRealtime()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    private void updateLiveConfiguration(long j, long j2) {
        long j3;
        long jMin;
        long jUsToMs;
        long jConstrainValue;
        long jConstrainValue2;
        float f;
        float f2;
        androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = getMediaItem().liveConfiguration;
        long jUsToMs2 = androidx.media3.common.util.Util.usToMs(j);
        if (liveConfiguration.maxOffsetMs != androidx.media3.common.C.TIME_UNSET) {
            jMin = java.lang.Math.min(jUsToMs2, liveConfiguration.maxOffsetMs);
        } else {
            if (this.manifest.serviceDescription == null || this.manifest.serviceDescription.maxOffsetMs == androidx.media3.common.C.TIME_UNSET) {
                j3 = jUsToMs2;
            } else {
                jMin = java.lang.Math.min(jUsToMs2, this.manifest.serviceDescription.maxOffsetMs);
            }
            jUsToMs = androidx.media3.common.util.Util.usToMs(j - j2);
            if (jUsToMs < 0 && j3 > 0) {
                jUsToMs = 0;
            }
            if (this.manifest.minBufferTimeMs != androidx.media3.common.C.TIME_UNSET) {
                jUsToMs = java.lang.Math.min(jUsToMs + this.manifest.minBufferTimeMs, jUsToMs2);
            }
            jConstrainValue = jUsToMs;
            if (liveConfiguration.minOffsetMs != androidx.media3.common.C.TIME_UNSET) {
                jConstrainValue = androidx.media3.common.util.Util.constrainValue(liveConfiguration.minOffsetMs, jConstrainValue, jUsToMs2);
            } else if (this.manifest.serviceDescription != null && this.manifest.serviceDescription.minOffsetMs != androidx.media3.common.C.TIME_UNSET) {
                jConstrainValue = androidx.media3.common.util.Util.constrainValue(this.manifest.serviceDescription.minOffsetMs, jConstrainValue, jUsToMs2);
            }
            if (jConstrainValue > j3) {
                j3 = jConstrainValue;
            }
            if (this.liveConfiguration.targetOffsetMs != androidx.media3.common.C.TIME_UNSET) {
                jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
            } else if (this.manifest.serviceDescription == null && this.manifest.serviceDescription.targetOffsetMs != androidx.media3.common.C.TIME_UNSET) {
                jConstrainValue2 = this.manifest.serviceDescription.targetOffsetMs;
            } else if (this.manifest.suggestedPresentationDelayMs != androidx.media3.common.C.TIME_UNSET) {
                jConstrainValue2 = this.manifest.suggestedPresentationDelayMs;
            } else {
                jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
            }
            if (jConstrainValue2 < jConstrainValue) {
                jConstrainValue2 = jConstrainValue;
            }
            if (jConstrainValue2 > j3) {
                jConstrainValue2 = androidx.media3.common.util.Util.constrainValue(androidx.media3.common.util.Util.usToMs(j - java.lang.Math.min(this.minLiveStartPositionUs, j2 / 2)), jConstrainValue, j3);
            }
            if (liveConfiguration.minPlaybackSpeed != -3.4028235E38f) {
                f = liveConfiguration.minPlaybackSpeed;
            } else if (this.manifest.serviceDescription != null) {
                f = this.manifest.serviceDescription.minPlaybackSpeed;
            } else {
                f = -3.4028235E38f;
            }
            if (liveConfiguration.maxPlaybackSpeed != -3.4028235E38f) {
                f2 = liveConfiguration.maxPlaybackSpeed;
            } else if (this.manifest.serviceDescription != null) {
                f2 = this.manifest.serviceDescription.maxPlaybackSpeed;
            } else {
                f2 = -3.4028235E38f;
            }
            if (f == -3.4028235E38f && f2 == -3.4028235E38f && (this.manifest.serviceDescription == null || this.manifest.serviceDescription.targetOffsetMs == androidx.media3.common.C.TIME_UNSET)) {
                f = 1.0f;
                f2 = 1.0f;
            }
            this.liveConfiguration = new androidx.media3.common.MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(jConstrainValue).setMaxOffsetMs(j3).setMinPlaybackSpeed(f).setMaxPlaybackSpeed(f2).build();
        }
        j3 = jMin;
        jUsToMs = androidx.media3.common.util.Util.usToMs(j - j2);
        if (jUsToMs < 0) {
            jUsToMs = 0;
        }
        if (this.manifest.minBufferTimeMs != androidx.media3.common.C.TIME_UNSET) {
            jUsToMs = java.lang.Math.min(jUsToMs + this.manifest.minBufferTimeMs, jUsToMs2);
        }
        jConstrainValue = jUsToMs;
        if (liveConfiguration.minOffsetMs != androidx.media3.common.C.TIME_UNSET) {
            jConstrainValue = androidx.media3.common.util.Util.constrainValue(liveConfiguration.minOffsetMs, jConstrainValue, jUsToMs2);
        } else if (this.manifest.serviceDescription != null) {
            jConstrainValue = androidx.media3.common.util.Util.constrainValue(this.manifest.serviceDescription.minOffsetMs, jConstrainValue, jUsToMs2);
        }
        if (jConstrainValue > j3) {
            j3 = jConstrainValue;
        }
        if (this.liveConfiguration.targetOffsetMs != androidx.media3.common.C.TIME_UNSET) {
            jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
        } else if (this.manifest.serviceDescription == null) {
            if (this.manifest.suggestedPresentationDelayMs != androidx.media3.common.C.TIME_UNSET) {
                jConstrainValue2 = this.manifest.suggestedPresentationDelayMs;
            } else {
                jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
            }
        } else if (this.manifest.suggestedPresentationDelayMs != androidx.media3.common.C.TIME_UNSET) {
            jConstrainValue2 = this.manifest.suggestedPresentationDelayMs;
        } else {
            jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
        }
        if (jConstrainValue2 < jConstrainValue) {
            jConstrainValue2 = jConstrainValue;
        }
        if (jConstrainValue2 > j3) {
            jConstrainValue2 = androidx.media3.common.util.Util.constrainValue(androidx.media3.common.util.Util.usToMs(j - java.lang.Math.min(this.minLiveStartPositionUs, j2 / 2)), jConstrainValue, j3);
        }
        if (liveConfiguration.minPlaybackSpeed != -3.4028235E38f) {
            f = liveConfiguration.minPlaybackSpeed;
        } else if (this.manifest.serviceDescription != null) {
            f = this.manifest.serviceDescription.minPlaybackSpeed;
        } else {
            f = -3.4028235E38f;
        }
        if (liveConfiguration.maxPlaybackSpeed != -3.4028235E38f) {
            f2 = liveConfiguration.maxPlaybackSpeed;
        } else if (this.manifest.serviceDescription != null) {
            f2 = this.manifest.serviceDescription.maxPlaybackSpeed;
        } else {
            f2 = -3.4028235E38f;
        }
        if (f == -3.4028235E38f) {
            f = 1.0f;
            f2 = 1.0f;
        }
        this.liveConfiguration = new androidx.media3.common.MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(jConstrainValue).setMaxOffsetMs(j3).setMinPlaybackSpeed(f).setMaxPlaybackSpeed(f2).build();
    }

    private void scheduleManifestRefresh(long j) {
        this.handler.postDelayed(this.refreshManifestRunnable, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoadingManifest() {
        android.net.Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        if (this.loader.hasFatalError()) {
            return;
        }
        if (this.loader.isLoading()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        startLoading(new androidx.media3.exoplayer.upstream.ParsingLoadable(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(4));
    }

    private long getManifestLoadRetryDelayMillis() {
        return java.lang.Math.min((this.staleManifestReloadAttempt - 1) * 1000, 5000);
    }

    private <T> void startLoading(androidx.media3.exoplayer.upstream.ParsingLoadable<T> parsingLoadable, androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.upstream.ParsingLoadable<T>> callback, int i) {
        this.manifestEventDispatcher.loadStarted(new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, this.loader.startLoading(parsingLoadable, callback, i)), parsingLoadable.type);
    }

    private static long getIntervalUntilNextManifestRefreshMs(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, long j) {
        androidx.media3.exoplayer.dash.DashSegmentIndex index;
        int periodCount = dashManifest.getPeriodCount() - 1;
        androidx.media3.exoplayer.dash.manifest.Period period = dashManifest.getPeriod(periodCount);
        long jMsToUs = androidx.media3.common.util.Util.msToUs(period.startMs);
        long periodDurationUs = dashManifest.getPeriodDurationUs(periodCount);
        long jMsToUs2 = androidx.media3.common.util.Util.msToUs(j);
        long jMsToUs3 = androidx.media3.common.util.Util.msToUs(dashManifest.availabilityStartTimeMs);
        long jMsToUs4 = androidx.media3.common.util.Util.msToUs(5000L);
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> list = period.adaptationSets.get(i).representations;
            if (!list.isEmpty() && (index = list.get(0).getIndex()) != null) {
                long nextSegmentAvailableTimeUs = ((jMsToUs3 + jMsToUs) + index.getNextSegmentAvailableTimeUs(periodDurationUs, jMsToUs2)) - jMsToUs2;
                if (nextSegmentAvailableTimeUs < jMsToUs4 - androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US || (nextSegmentAvailableTimeUs > jMsToUs4 && nextSegmentAvailableTimeUs < jMsToUs4 + androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)) {
                    jMsToUs4 = nextSegmentAvailableTimeUs;
                }
            }
        }
        return com.google.common.math.LongMath.divide(jMsToUs4, 1000L, java.math.RoundingMode.CEILING);
    }

    private static long getAvailableStartTimeInManifestUs(androidx.media3.exoplayer.dash.manifest.Period period, long j, long j2) {
        long jMsToUs = androidx.media3.common.util.Util.msToUs(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMax = jMsToUs;
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet = period.adaptationSets.get(i);
            java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> list = adaptationSet.representations;
            boolean z = (adaptationSet.type == 1 || adaptationSet.type == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z) && !list.isEmpty()) {
                androidx.media3.exoplayer.dash.DashSegmentIndex index = list.get(0).getIndex();
                if (index == null || index.getAvailableSegmentCount(j, j2) == 0) {
                    return jMsToUs;
                }
                jMax = java.lang.Math.max(jMax, index.getTimeUs(index.getFirstAvailableSegmentNum(j, j2)) + jMsToUs);
            }
        }
        return jMax;
    }

    private static long getAvailableEndTimeInManifestUs(androidx.media3.exoplayer.dash.manifest.Period period, long j, long j2) {
        long jMsToUs = androidx.media3.common.util.Util.msToUs(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet = period.adaptationSets.get(i);
            java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> list = adaptationSet.representations;
            boolean z = (adaptationSet.type == 1 || adaptationSet.type == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z) && !list.isEmpty()) {
                androidx.media3.exoplayer.dash.DashSegmentIndex index = list.get(0).getIndex();
                if (index == null) {
                    return jMsToUs + j;
                }
                long availableSegmentCount = index.getAvailableSegmentCount(j, j2);
                if (availableSegmentCount == 0) {
                    return jMsToUs;
                }
                long firstAvailableSegmentNum = (index.getFirstAvailableSegmentNum(j, j2) + availableSegmentCount) - 1;
                jMin = java.lang.Math.min(jMin, index.getDurationUs(firstAvailableSegmentNum, j) + index.getTimeUs(firstAvailableSegmentNum) + jMsToUs);
            }
        }
        return jMin;
    }

    private static boolean isIndexExplicit(androidx.media3.exoplayer.dash.manifest.Period period) {
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            androidx.media3.exoplayer.dash.DashSegmentIndex index = period.adaptationSets.get(i).representations.get(0).getIndex();
            if (index == null || index.isExplicit()) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasVideoOrAudioAdaptationSets(androidx.media3.exoplayer.dash.manifest.Period period) {
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            int i2 = period.adaptationSets.get(i).type;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    private static final class DashTimeline extends androidx.media3.common.Timeline {
        private final long elapsedRealtimeEpochOffsetMs;
        private final int firstPeriodId;
        private final androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
        private final androidx.media3.exoplayer.dash.manifest.DashManifest manifest;
        private final androidx.media3.common.MediaItem mediaItem;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }

        public DashTimeline(long j, long j2, long j3, int i, long j4, long j5, long j6, androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, androidx.media3.common.MediaItem mediaItem, androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
            androidx.media3.common.util.Assertions.checkState(dashManifest.dynamic == (liveConfiguration != null));
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.elapsedRealtimeEpochOffsetMs = j3;
            this.firstPeriodId = i;
            this.offsetInFirstPeriodUs = j4;
            this.windowDurationUs = j5;
            this.windowDefaultStartPositionUs = j6;
            this.manifest = dashManifest;
            this.mediaItem = mediaItem;
            this.liveConfiguration = liveConfiguration;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.manifest.getPeriodCount();
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
            androidx.media3.common.util.Assertions.checkIndex(i, 0, getPeriodCount());
            return period.set(z ? this.manifest.getPeriod(i).id : null, z ? java.lang.Integer.valueOf(this.firstPeriodId + i) : null, 0, this.manifest.getPeriodDurationUs(i), androidx.media3.common.util.Util.msToUs(this.manifest.getPeriod(i).startMs - this.manifest.getPeriod(0).startMs) - this.offsetInFirstPeriodUs);
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
            androidx.media3.common.util.Assertions.checkIndex(i, 0, 1);
            long adjustedWindowDefaultStartPositionUs = getAdjustedWindowDefaultStartPositionUs(j);
            java.lang.Object obj = androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID;
            androidx.media3.common.MediaItem mediaItem = this.mediaItem;
            androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest = this.manifest;
            return window.set(obj, mediaItem, dashManifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, true, isMovingLiveWindow(dashManifest), this.liveConfiguration, adjustedWindowDefaultStartPositionUs, this.windowDurationUs, 0, getPeriodCount() - 1, this.offsetInFirstPeriodUs);
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            int iIntValue;
            if ((obj instanceof java.lang.Integer) && (iIntValue = ((java.lang.Integer) obj).intValue() - this.firstPeriodId) >= 0 && iIntValue < getPeriodCount()) {
                return iIntValue;
            }
            return -1;
        }

        private long getAdjustedWindowDefaultStartPositionUs(long j) {
            androidx.media3.exoplayer.dash.DashSegmentIndex index;
            long j2 = this.windowDefaultStartPositionUs;
            if (!isMovingLiveWindow(this.manifest)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.windowDurationUs) {
                    return androidx.media3.common.C.TIME_UNSET;
                }
            }
            long j3 = this.offsetInFirstPeriodUs + j2;
            long periodDurationUs = this.manifest.getPeriodDurationUs(0);
            int i = 0;
            while (i < this.manifest.getPeriodCount() - 1 && j3 >= periodDurationUs) {
                j3 -= periodDurationUs;
                i++;
                periodDurationUs = this.manifest.getPeriodDurationUs(i);
            }
            androidx.media3.exoplayer.dash.manifest.Period period = this.manifest.getPeriod(i);
            int adaptationSetIndex = period.getAdaptationSetIndex(2);
            return (adaptationSetIndex == -1 || (index = period.adaptationSets.get(adaptationSetIndex).representations.get(0).getIndex()) == null || index.getSegmentCount(periodDurationUs) == 0) ? j2 : (j2 + index.getTimeUs(index.getSegmentNum(j3, periodDurationUs))) - j3;
        }

        @Override // androidx.media3.common.Timeline
        public java.lang.Object getUidOfPeriod(int i) {
            androidx.media3.common.util.Assertions.checkIndex(i, 0, getPeriodCount());
            return java.lang.Integer.valueOf(this.firstPeriodId + i);
        }

        private static boolean isMovingLiveWindow(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest) {
            return dashManifest.dynamic && dashManifest.minUpdatePeriodMs != androidx.media3.common.C.TIME_UNSET && dashManifest.durationMs == androidx.media3.common.C.TIME_UNSET;
        }
    }

    private final class DefaultPlayerEmsgCallback implements androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback {
        private DefaultPlayerEmsgCallback() {
        }

        @Override // androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
            androidx.media3.exoplayer.dash.DashMediaSource.this.onDashManifestRefreshRequested();
        }

        @Override // androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long j) {
            androidx.media3.exoplayer.dash.DashMediaSource.this.onDashManifestPublishTimeExpired(j);
        }
    }

    private final class ManifestCallback implements androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.dash.manifest.DashManifest>> {
        private ManifestCallback() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.dash.manifest.DashManifest> parsingLoadable, long j, long j2) {
            androidx.media3.exoplayer.dash.DashMediaSource.this.onManifestLoadCompleted(parsingLoadable, j, j2);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.dash.manifest.DashManifest> parsingLoadable, long j, long j2, boolean z) {
            androidx.media3.exoplayer.dash.DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j2);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.dash.manifest.DashManifest> parsingLoadable, long j, long j2, java.io.IOException iOException, int i) {
            return androidx.media3.exoplayer.dash.DashMediaSource.this.onManifestLoadError(parsingLoadable, j, j2, iOException, i);
        }
    }

    private final class UtcTimestampCallback implements androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.upstream.ParsingLoadable<java.lang.Long>> {
        private UtcTimestampCallback() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(androidx.media3.exoplayer.upstream.ParsingLoadable<java.lang.Long> parsingLoadable, long j, long j2) {
            androidx.media3.exoplayer.dash.DashMediaSource.this.onUtcTimestampLoadCompleted(parsingLoadable, j, j2);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(androidx.media3.exoplayer.upstream.ParsingLoadable<java.lang.Long> parsingLoadable, long j, long j2, boolean z) {
            androidx.media3.exoplayer.dash.DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j2);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.upstream.ParsingLoadable<java.lang.Long> parsingLoadable, long j, long j2, java.io.IOException iOException, int i) {
            return androidx.media3.exoplayer.dash.DashMediaSource.this.onUtcTimestampLoadError(parsingLoadable, j, j2, iOException);
        }
    }

    private static final class XsDateTimeParser implements androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<java.lang.Long> {
        private XsDateTimeParser() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
        public java.lang.Long parse(android.net.Uri uri, java.io.InputStream inputStream) throws java.io.IOException {
            return java.lang.Long.valueOf(androidx.media3.common.util.Util.parseXsDateTime(new java.io.BufferedReader(new java.io.InputStreamReader(inputStream)).readLine()));
        }
    }

    static final class Iso8601Parser implements androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<java.lang.Long> {
        private static final java.util.regex.Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = java.util.regex.Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        Iso8601Parser() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
        public java.lang.Long parse(android.net.Uri uri, java.io.InputStream inputStream) throws java.io.IOException {
            java.lang.String line = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, com.google.common.base.Charsets.UTF_8)).readLine();
            try {
                java.util.regex.Matcher matcher = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(line);
                if (!matcher.matches()) {
                    throw androidx.media3.common.ParserException.createForMalformedManifest("Couldn't parse timestamp: " + line, null);
                }
                java.lang.String strGroup = matcher.group(1);
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", java.util.Locale.US);
                simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = java.lang.Long.parseLong(matcher.group(5));
                    java.lang.String strGroup2 = matcher.group(7);
                    time -= j * ((((j2 * 60) + (android.text.TextUtils.isEmpty(strGroup2) ? 0L : java.lang.Long.parseLong(strGroup2))) * 60) * 1000);
                }
                return java.lang.Long.valueOf(time);
            } catch (java.text.ParseException e) {
                throw androidx.media3.common.ParserException.createForMalformedManifest(null, e);
            }
        }
    }

    final class ManifestLoadErrorThrower implements androidx.media3.exoplayer.upstream.LoaderErrorThrower {
        ManifestLoadErrorThrower() {
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() throws java.io.IOException {
            androidx.media3.exoplayer.dash.DashMediaSource.this.loader.maybeThrowError();
            maybeThrowManifestError();
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError(int i) throws java.io.IOException {
            androidx.media3.exoplayer.dash.DashMediaSource.this.loader.maybeThrowError(i);
            maybeThrowManifestError();
        }

        private void maybeThrowManifestError() throws java.io.IOException {
            if (androidx.media3.exoplayer.dash.DashMediaSource.this.manifestFatalError != null) {
                throw androidx.media3.exoplayer.dash.DashMediaSource.this.manifestFatalError;
            }
        }
    }
}
