package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultHlsPlaylistTracker implements androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker, androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.hls.playlist.HlsPlaylist>> {
    public static final double DEFAULT_PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT = 3.5d;
    public static final androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory FACTORY = new androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory() { // from class: androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker$$ExternalSyntheticLambda0
        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory
        public final androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker createTracker(androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory hlsPlaylistParserFactory) {
            return new androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory);
        }
    };
    private final androidx.media3.exoplayer.hls.HlsDataSourceFactory dataSourceFactory;
    private androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
    private androidx.media3.exoplayer.upstream.Loader initialPlaylistLoader;
    private long initialStartTimeUs;
    private boolean isLive;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener> listeners;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist;
    private final java.util.HashMap<android.net.Uri, androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle> playlistBundles;
    private final androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory playlistParserFactory;
    private android.os.Handler playlistRefreshHandler;
    private final double playlistStuckTargetDurationCoefficient;
    private androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist primaryMediaPlaylistSnapshot;
    private android.net.Uri primaryMediaPlaylistUrl;
    private androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener;

    public DefaultHlsPlaylistTracker(androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory hlsPlaylistParserFactory) {
        this(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory, 3.5d);
    }

    public DefaultHlsPlaylistTracker(androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory hlsPlaylistParserFactory, double d) {
        this.dataSourceFactory = hlsDataSourceFactory;
        this.playlistParserFactory = hlsPlaylistParserFactory;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.playlistStuckTargetDurationCoefficient = d;
        this.listeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.playlistBundles = new java.util.HashMap<>();
        this.initialStartTimeUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void start(android.net.Uri uri, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener) {
        this.playlistRefreshHandler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
        this.eventDispatcher = eventDispatcher;
        this.primaryPlaylistListener = primaryPlaylistListener;
        androidx.media3.exoplayer.upstream.ParsingLoadable parsingLoadable = new androidx.media3.exoplayer.upstream.ParsingLoadable(this.dataSourceFactory.createDataSource(4), uri, 4, this.playlistParserFactory.createPlaylistParser());
        androidx.media3.common.util.Assertions.checkState(this.initialPlaylistLoader == null);
        androidx.media3.exoplayer.upstream.Loader loader = new androidx.media3.exoplayer.upstream.Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.initialPlaylistLoader = loader;
        eventDispatcher.loadStarted(new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, loader.startLoading(parsingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type))), parsingLoadable.type);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.primaryMediaPlaylistUrl = null;
        this.primaryMediaPlaylistSnapshot = null;
        this.multivariantPlaylist = null;
        this.initialStartTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.initialPlaylistLoader.release();
        this.initialPlaylistLoader = null;
        java.util.Iterator<androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle> it = this.playlistBundles.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.playlistRefreshHandler.removeCallbacksAndMessages(null);
        this.playlistRefreshHandler = null;
        this.playlistBundles.clear();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void addListener(androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
        androidx.media3.common.util.Assertions.checkNotNull(playlistEventListener);
        this.listeners.add(playlistEventListener);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void removeListener(androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
        this.listeners.remove(playlistEventListener);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist getMultivariantPlaylist() {
        return this.multivariantPlaylist;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist getPlaylistSnapshot(android.net.Uri uri, boolean z) {
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist playlistSnapshot = this.playlistBundles.get(uri).getPlaylistSnapshot();
        if (playlistSnapshot != null && z) {
            maybeSetPrimaryUrl(uri);
            maybeActivateForPlayback(uri);
        }
        return playlistSnapshot;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public long getInitialStartTimeUs() {
        return this.initialStartTimeUs;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean isSnapshotValid(android.net.Uri uri) {
        return this.playlistBundles.get(uri).isSnapshotValid();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPrimaryPlaylistRefreshError() throws java.io.IOException {
        androidx.media3.exoplayer.upstream.Loader loader = this.initialPlaylistLoader;
        if (loader != null) {
            loader.maybeThrowError();
        }
        android.net.Uri uri = this.primaryMediaPlaylistUrl;
        if (uri != null) {
            maybeThrowPlaylistRefreshError(uri);
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPlaylistRefreshError(android.net.Uri uri) throws java.io.IOException {
        this.playlistBundles.get(uri).maybeThrowPlaylistRefreshError();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void refreshPlaylist(android.net.Uri uri) {
        this.playlistBundles.get(uri).loadPlaylist(true);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean isLive() {
        return this.isLive;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public boolean excludeMediaPlaylist(android.net.Uri uri, long j) {
        androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
        if (mediaPlaylistBundle != null) {
            return !mediaPlaylistBundle.excludePlaylist(j);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public void deactivatePlaylistForPlayback(android.net.Uri uri) {
        androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
        if (mediaPlaylistBundle != null) {
            mediaPlaylistBundle.setActiveForPlayback(false);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> parsingLoadable, long j, long j2) {
        androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylistCreateSingleVariantMultivariantPlaylist;
        androidx.media3.exoplayer.hls.playlist.HlsPlaylist result = parsingLoadable.getResult();
        boolean z = result instanceof androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
        if (z) {
            hlsMultivariantPlaylistCreateSingleVariantMultivariantPlaylist = androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.createSingleVariantMultivariantPlaylist(result.baseUri);
        } else {
            hlsMultivariantPlaylistCreateSingleVariantMultivariantPlaylist = (androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist) result;
        }
        this.multivariantPlaylist = hlsMultivariantPlaylistCreateSingleVariantMultivariantPlaylist;
        this.primaryMediaPlaylistUrl = hlsMultivariantPlaylistCreateSingleVariantMultivariantPlaylist.variants.get(0).url;
        this.listeners.add(new androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.FirstPrimaryMediaPlaylistListener());
        createBundles(hlsMultivariantPlaylistCreateSingleVariantMultivariantPlaylist.mediaPlaylistUrls);
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(this.primaryMediaPlaylistUrl);
        if (!z) {
            mediaPlaylistBundle.loadPlaylist(false);
        } else {
            mediaPlaylistBundle.processLoadedPlaylist((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist) result, loadEventInfo);
        }
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.eventDispatcher.loadCompleted(loadEventInfo, 4);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.eventDispatcher.loadCanceled(loadEventInfo, 4);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> parsingLoadable, long j, long j2, java.io.IOException iOException, int i) {
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(parsingLoadable.type), iOException, i));
        boolean z = retryDelayMsFor == androidx.media3.common.C.TIME_UNSET;
        this.eventDispatcher.loadError(loadEventInfo, parsingLoadable.type, iOException, z);
        if (z) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        }
        if (z) {
            return androidx.media3.exoplayer.upstream.Loader.DONT_RETRY_FATAL;
        }
        return androidx.media3.exoplayer.upstream.Loader.createRetryAction(false, retryDelayMsFor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean maybeSelectNewPrimaryUrl() {
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> list = this.multivariantPlaylist.variants;
        int size = list.size();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle mediaPlaylistBundle = (androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) androidx.media3.common.util.Assertions.checkNotNull(this.playlistBundles.get(list.get(i).url));
            if (jElapsedRealtime > mediaPlaylistBundle.excludeUntilMs) {
                android.net.Uri uri = mediaPlaylistBundle.playlistUrl;
                this.primaryMediaPlaylistUrl = uri;
                mediaPlaylistBundle.loadPlaylistInternal(getRequestUriForPrimaryChange(uri));
                return true;
            }
        }
        return false;
    }

    private void maybeSetPrimaryUrl(android.net.Uri uri) {
        if (uri.equals(this.primaryMediaPlaylistUrl) || !isVariantUrl(uri)) {
            return;
        }
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist = this.primaryMediaPlaylistSnapshot;
        if (hlsMediaPlaylist == null || !hlsMediaPlaylist.hasEndTag) {
            this.primaryMediaPlaylistUrl = uri;
            androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist2 = mediaPlaylistBundle.playlistSnapshot;
            if (hlsMediaPlaylist2 != null && hlsMediaPlaylist2.hasEndTag) {
                this.primaryMediaPlaylistSnapshot = hlsMediaPlaylist2;
                this.primaryPlaylistListener.onPrimaryPlaylistRefreshed(hlsMediaPlaylist2);
            } else {
                mediaPlaylistBundle.loadPlaylistInternal(getRequestUriForPrimaryChange(uri));
            }
        }
    }

    private void maybeActivateForPlayback(android.net.Uri uri) {
        androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(uri);
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist playlistSnapshot = mediaPlaylistBundle.getPlaylistSnapshot();
        if (mediaPlaylistBundle.isActiveForPlayback()) {
            return;
        }
        mediaPlaylistBundle.setActiveForPlayback(true);
        if (playlistSnapshot == null || playlistSnapshot.hasEndTag) {
            return;
        }
        mediaPlaylistBundle.loadPlaylist(true);
    }

    private android.net.Uri getRequestUriForPrimaryChange(android.net.Uri uri) {
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport renditionReport;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist = this.primaryMediaPlaylistSnapshot;
        if (hlsMediaPlaylist == null || !hlsMediaPlaylist.serverControl.canBlockReload || (renditionReport = this.primaryMediaPlaylistSnapshot.renditionReports.get(uri)) == null) {
            return uri;
        }
        android.net.Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", java.lang.String.valueOf(renditionReport.lastMediaSequence));
        if (renditionReport.lastPartIndex != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", java.lang.String.valueOf(renditionReport.lastPartIndex));
        }
        return builderBuildUpon.build();
    }

    private boolean isVariantUrl(android.net.Uri uri) {
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> list = this.multivariantPlaylist.variants;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).url)) {
                return true;
            }
        }
        return false;
    }

    private void createBundles(java.util.List<android.net.Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            android.net.Uri uri = list.get(i);
            this.playlistBundles.put(uri, new androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle(uri));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlaylistUpdated(android.net.Uri uri, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        if (uri.equals(this.primaryMediaPlaylistUrl)) {
            if (this.primaryMediaPlaylistSnapshot == null) {
                this.isLive = !hlsMediaPlaylist.hasEndTag;
                this.initialStartTimeUs = hlsMediaPlaylist.startTimeUs;
            }
            this.primaryMediaPlaylistSnapshot = hlsMediaPlaylist;
            this.primaryPlaylistListener.onPrimaryPlaylistRefreshed(hlsMediaPlaylist);
        }
        java.util.Iterator<androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onPlaylistChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean notifyPlaylistError(android.net.Uri uri, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
        java.util.Iterator<androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener> it = this.listeners.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !it.next().onPlaylistError(uri, loadErrorInfo, z);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist getLatestPlaylistSnapshot(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.isNewerThan(hlsMediaPlaylist)) {
            return hlsMediaPlaylist2.copyWith(getLoadedPlaylistStartTimeUs(hlsMediaPlaylist, hlsMediaPlaylist2), getLoadedPlaylistDiscontinuitySequence(hlsMediaPlaylist, hlsMediaPlaylist2));
        }
        return hlsMediaPlaylist2.hasEndTag ? hlsMediaPlaylist.copyWithEndTag() : hlsMediaPlaylist;
    }

    private long getLoadedPlaylistStartTimeUs(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.hasProgramDateTime) {
            return hlsMediaPlaylist2.startTimeUs;
        }
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist3 = this.primaryMediaPlaylistSnapshot;
        long j = hlsMediaPlaylist3 != null ? hlsMediaPlaylist3.startTimeUs : 0L;
        if (hlsMediaPlaylist == null) {
            return j;
        }
        int size = hlsMediaPlaylist.segments.size();
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment firstOldOverlappingSegment = getFirstOldOverlappingSegment(hlsMediaPlaylist, hlsMediaPlaylist2);
        if (firstOldOverlappingSegment != null) {
            return hlsMediaPlaylist.startTimeUs + firstOldOverlappingSegment.relativeStartTimeUs;
        }
        return ((long) size) == hlsMediaPlaylist2.mediaSequence - hlsMediaPlaylist.mediaSequence ? hlsMediaPlaylist.getEndTimeUs() : j;
    }

    private int getLoadedPlaylistDiscontinuitySequence(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist2) {
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment firstOldOverlappingSegment;
        if (hlsMediaPlaylist2.hasDiscontinuitySequence) {
            return hlsMediaPlaylist2.discontinuitySequence;
        }
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist3 = this.primaryMediaPlaylistSnapshot;
        int i = hlsMediaPlaylist3 != null ? hlsMediaPlaylist3.discontinuitySequence : 0;
        return (hlsMediaPlaylist == null || (firstOldOverlappingSegment = getFirstOldOverlappingSegment(hlsMediaPlaylist, hlsMediaPlaylist2)) == null) ? i : (hlsMediaPlaylist.discontinuitySequence + firstOldOverlappingSegment.relativeDiscontinuitySequence) - hlsMediaPlaylist2.segments.get(0).relativeDiscontinuitySequence;
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment getFirstOldOverlappingSegment(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist2) {
        int i = (int) (hlsMediaPlaylist2.mediaSequence - hlsMediaPlaylist.mediaSequence);
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class MediaPlaylistBundle implements androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.hls.playlist.HlsPlaylist>> {
        private static final java.lang.String BLOCK_MSN_PARAM = "_HLS_msn";
        private static final java.lang.String BLOCK_PART_PARAM = "_HLS_part";
        private static final java.lang.String SKIP_PARAM = "_HLS_skip";
        private boolean activeForPlayback;
        private long earliestNextLoadTimeMs;
        private long excludeUntilMs;
        private long lastSnapshotChangeMs;
        private long lastSnapshotLoadMs;
        private boolean loadPending;
        private final androidx.media3.datasource.DataSource mediaPlaylistDataSource;
        private final androidx.media3.exoplayer.upstream.Loader mediaPlaylistLoader = new androidx.media3.exoplayer.upstream.Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
        private java.io.IOException playlistError;
        private androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist playlistSnapshot;
        private final android.net.Uri playlistUrl;

        public MediaPlaylistBundle(android.net.Uri uri) {
            this.playlistUrl = uri;
            this.mediaPlaylistDataSource = androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.dataSourceFactory.createDataSource(4);
        }

        public androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist getPlaylistSnapshot() {
            return this.playlistSnapshot;
        }

        public boolean isSnapshotValid() {
            if (this.playlistSnapshot == null) {
                return false;
            }
            return this.playlistSnapshot.hasEndTag || this.playlistSnapshot.playlistType == 2 || this.playlistSnapshot.playlistType == 1 || this.lastSnapshotLoadMs + java.lang.Math.max(30000L, androidx.media3.common.util.Util.usToMs(this.playlistSnapshot.durationUs)) > android.os.SystemClock.elapsedRealtime();
        }

        public void loadPlaylist(boolean z) {
            loadPlaylistInternal(z ? getMediaPlaylistUriForReload() : this.playlistUrl);
        }

        public void maybeThrowPlaylistRefreshError() throws java.io.IOException {
            this.mediaPlaylistLoader.maybeThrowError();
            java.io.IOException iOException = this.playlistError;
            if (iOException != null) {
                throw iOException;
            }
        }

        public boolean isActiveForPlayback() {
            return this.activeForPlayback;
        }

        public void setActiveForPlayback(boolean z) {
            this.activeForPlayback = z;
        }

        public void release() {
            this.mediaPlaylistLoader.release();
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> parsingLoadable, long j, long j2) {
            androidx.media3.exoplayer.hls.playlist.HlsPlaylist result = parsingLoadable.getResult();
            androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
            if (result instanceof androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist) {
                processLoadedPlaylist((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist) result, loadEventInfo);
                androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.eventDispatcher.loadCompleted(loadEventInfo, 4);
            } else {
                this.playlistError = androidx.media3.common.ParserException.createForMalformedManifest("Loaded playlist has unexpected type.", null);
                androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.eventDispatcher.loadError(loadEventInfo, 4, this.playlistError, true);
            }
            androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
            androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
            androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
            androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.eventDispatcher.loadCanceled(loadEventInfo, 4);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.upstream.ParsingLoadable<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> parsingLoadable, long j, long j2, java.io.IOException iOException, int i) {
            androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorActionCreateRetryAction;
            androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j2, parsingLoadable.bytesLoaded());
            boolean z = iOException instanceof androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.DeltaUpdateException;
            if ((parsingLoadable.getUri().getQueryParameter(BLOCK_MSN_PARAM) != null) || z) {
                int i2 = iOException instanceof androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException ? ((androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) iOException).responseCode : Integer.MAX_VALUE;
                if (z || i2 == 400 || i2 == 503) {
                    this.earliestNextLoadTimeMs = android.os.SystemClock.elapsedRealtime();
                    loadPlaylist(false);
                    ((androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher) androidx.media3.common.util.Util.castNonNull(androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.eventDispatcher)).loadError(loadEventInfo, parsingLoadable.type, iOException, true);
                    return androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
                }
            }
            androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(parsingLoadable.type), iOException, i);
            if (androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.notifyPlaylistError(this.playlistUrl, loadErrorInfo, false)) {
                long retryDelayMsFor = androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
                if (retryDelayMsFor != androidx.media3.common.C.TIME_UNSET) {
                    loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.createRetryAction(false, retryDelayMsFor);
                } else {
                    loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY_FATAL;
                }
            } else {
                loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
            }
            boolean zIsRetry = true ^ loadErrorActionCreateRetryAction.isRetry();
            androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.eventDispatcher.loadError(loadEventInfo, parsingLoadable.type, iOException, zIsRetry);
            if (zIsRetry) {
                androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
            }
            return loadErrorActionCreateRetryAction;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadPlaylistInternal(final android.net.Uri uri) {
            this.excludeUntilMs = 0L;
            if (this.loadPending || this.mediaPlaylistLoader.isLoading() || this.mediaPlaylistLoader.hasFatalError()) {
                return;
            }
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (jElapsedRealtime < this.earliestNextLoadTimeMs) {
                this.loadPending = true;
                androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.playlistRefreshHandler.postDelayed(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker$MediaPlaylistBundle$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m169x7d3061bf(uri);
                    }
                }, this.earliestNextLoadTimeMs - jElapsedRealtime);
            } else {
                loadPlaylistImmediately(uri);
            }
        }

        /* JADX INFO: renamed from: lambda$loadPlaylistInternal$0$androidx-media3-exoplayer-hls-playlist-DefaultHlsPlaylistTracker$MediaPlaylistBundle, reason: not valid java name */
        /* synthetic */ void m169x7d3061bf(android.net.Uri uri) {
            this.loadPending = false;
            loadPlaylistImmediately(uri);
        }

        private void loadPlaylistImmediately(android.net.Uri uri) {
            androidx.media3.exoplayer.upstream.ParsingLoadable parsingLoadable = new androidx.media3.exoplayer.upstream.ParsingLoadable(this.mediaPlaylistDataSource, uri, 4, androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.playlistParserFactory.createPlaylistParser(androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.multivariantPlaylist, this.playlistSnapshot));
            androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.eventDispatcher.loadStarted(new androidx.media3.exoplayer.source.LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, this.mediaPlaylistLoader.startLoading(parsingLoadable, this, androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type))), parsingLoadable.type);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void processLoadedPlaylist(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo) {
            boolean z;
            long j;
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist2 = this.playlistSnapshot;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.lastSnapshotLoadMs = jElapsedRealtime;
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist latestPlaylistSnapshot = androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.getLatestPlaylistSnapshot(hlsMediaPlaylist2, hlsMediaPlaylist);
            this.playlistSnapshot = latestPlaylistSnapshot;
            java.io.IOException playlistStuckException = null;
            if (latestPlaylistSnapshot != hlsMediaPlaylist2) {
                this.playlistError = null;
                this.lastSnapshotChangeMs = jElapsedRealtime;
                androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.onPlaylistUpdated(this.playlistUrl, latestPlaylistSnapshot);
            } else if (!latestPlaylistSnapshot.hasEndTag) {
                if (hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size()) < this.playlistSnapshot.mediaSequence) {
                    playlistStuckException = new androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistResetException(this.playlistUrl);
                    z = true;
                } else {
                    z = false;
                    if (jElapsedRealtime - this.lastSnapshotChangeMs > androidx.media3.common.util.Util.usToMs(this.playlistSnapshot.targetDurationUs) * androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.playlistStuckTargetDurationCoefficient) {
                        playlistStuckException = new androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistStuckException(this.playlistUrl);
                    }
                }
                if (playlistStuckException != null) {
                    this.playlistError = playlistStuckException;
                    androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.notifyPlaylistError(this.playlistUrl, new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(4), playlistStuckException, 1), z);
                }
            }
            if (this.playlistSnapshot.serverControl.canBlockReload) {
                j = 0;
            } else {
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist3 = this.playlistSnapshot;
                if (hlsMediaPlaylist3 != hlsMediaPlaylist2) {
                    j = hlsMediaPlaylist3.targetDurationUs;
                } else {
                    j = hlsMediaPlaylist3.targetDurationUs / 2;
                }
            }
            this.earliestNextLoadTimeMs = (jElapsedRealtime + androidx.media3.common.util.Util.usToMs(j)) - loadEventInfo.loadDurationMs;
            if (this.playlistSnapshot.hasEndTag) {
                return;
            }
            if (this.playlistUrl.equals(androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.primaryMediaPlaylistUrl) || this.activeForPlayback) {
                loadPlaylistInternal(getMediaPlaylistUriForReload());
            }
        }

        private android.net.Uri getMediaPlaylistUriForReload() {
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist = this.playlistSnapshot;
            if (hlsMediaPlaylist == null || (hlsMediaPlaylist.serverControl.skipUntilUs == androidx.media3.common.C.TIME_UNSET && !this.playlistSnapshot.serverControl.canBlockReload)) {
                return this.playlistUrl;
            }
            android.net.Uri.Builder builderBuildUpon = this.playlistUrl.buildUpon();
            if (this.playlistSnapshot.serverControl.canBlockReload) {
                builderBuildUpon.appendQueryParameter(BLOCK_MSN_PARAM, java.lang.String.valueOf(this.playlistSnapshot.mediaSequence + ((long) this.playlistSnapshot.segments.size())));
                if (this.playlistSnapshot.partTargetDurationUs != androidx.media3.common.C.TIME_UNSET) {
                    java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> list = this.playlistSnapshot.trailingParts;
                    int size = list.size();
                    if (!list.isEmpty() && ((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part) com.google.common.collect.Iterables.getLast(list)).isPreload) {
                        size--;
                    }
                    builderBuildUpon.appendQueryParameter(BLOCK_PART_PARAM, java.lang.String.valueOf(size));
                }
            }
            if (this.playlistSnapshot.serverControl.skipUntilUs != androidx.media3.common.C.TIME_UNSET) {
                builderBuildUpon.appendQueryParameter(SKIP_PARAM, this.playlistSnapshot.serverControl.canSkipDateRanges ? "v2" : "YES");
            }
            return builderBuildUpon.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean excludePlaylist(long j) {
            this.excludeUntilMs = android.os.SystemClock.elapsedRealtime() + j;
            return this.playlistUrl.equals(androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.primaryMediaPlaylistUrl) && !androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.maybeSelectNewPrimaryUrl();
        }
    }

    private class FirstPrimaryMediaPlaylistListener implements androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener {
        private FirstPrimaryMediaPlaylistListener() {
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public void onPlaylistChanged() {
            androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.listeners.remove(this);
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public boolean onPlaylistError(android.net.Uri uri, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
            androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle mediaPlaylistBundle;
            if (androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.primaryMediaPlaylistSnapshot == null) {
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> list = ((androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist) androidx.media3.common.util.Util.castNonNull(androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.multivariantPlaylist)).variants;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle mediaPlaylistBundle2 = (androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.playlistBundles.get(list.get(i2).url);
                    if (mediaPlaylistBundle2 != null && jElapsedRealtime < mediaPlaylistBundle2.excludeUntilMs) {
                        i++;
                    }
                }
                androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.loadErrorHandlingPolicy.getFallbackSelectionFor(new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions(1, 0, androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.multivariantPlaylist.variants.size(), i), loadErrorInfo);
                if (fallbackSelectionFor != null && fallbackSelectionFor.type == 2 && (mediaPlaylistBundle = (androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle) androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.this.playlistBundles.get(uri)) != null) {
                    mediaPlaylistBundle.excludePlaylist(fallbackSelectionFor.exclusionDurationMs);
                }
            }
            return false;
        }
    }
}
