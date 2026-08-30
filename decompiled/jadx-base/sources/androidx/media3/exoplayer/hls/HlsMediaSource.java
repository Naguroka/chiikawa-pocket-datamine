package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends androidx.media3.exoplayer.source.BaseMediaSource implements androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;
    private final androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration;
    private final androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final androidx.media3.exoplayer.hls.HlsDataSourceFactory dataSourceFactory;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final androidx.media3.exoplayer.hls.HlsExtractorFactory extractorFactory;
    private androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private androidx.media3.common.MediaItem mediaItem;
    private androidx.media3.datasource.TransferListener mediaTransferListener;
    private final int metadataType;
    private final androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private final boolean useSessionKeys;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MetadataType {
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.exoplayer.hls");
    }

    public static final class Factory implements androidx.media3.exoplayer.source.MediaSourceFactory {
        private boolean allowChunklessPreparation;
        private androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfigurationFactory;
        private androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private long elapsedRealTimeOffsetMs;
        private androidx.media3.exoplayer.hls.HlsExtractorFactory extractorFactory;
        private final androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory;
        private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private int metadataType;
        private androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory playlistParserFactory;
        private androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory playlistTrackerFactory;
        private long timestampAdjusterInitializationTimeoutMs;
        private boolean useSessionKeys;

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        public Factory(androidx.media3.datasource.DataSource.Factory factory) {
            this(new androidx.media3.exoplayer.hls.DefaultHlsDataSourceFactory(factory));
        }

        public Factory(androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory) {
            this.hlsDataSourceFactory = (androidx.media3.exoplayer.hls.HlsDataSourceFactory) androidx.media3.common.util.Assertions.checkNotNull(hlsDataSourceFactory);
            this.drmSessionManagerProvider = new androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider();
            this.playlistParserFactory = new androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistParserFactory();
            this.playlistTrackerFactory = androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker.FACTORY;
            this.extractorFactory = androidx.media3.exoplayer.hls.HlsExtractorFactory.DEFAULT;
            this.loadErrorHandlingPolicy = new androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy();
            this.compositeSequenceableLoaderFactory = new androidx.media3.exoplayer.source.DefaultCompositeSequenceableLoaderFactory();
            this.metadataType = 1;
            this.elapsedRealTimeOffsetMs = androidx.media3.common.C.TIME_UNSET;
            this.allowChunklessPreparation = true;
            experimentalParseSubtitlesDuringExtraction(true);
        }

        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setExtractorFactory(androidx.media3.exoplayer.hls.HlsExtractorFactory hlsExtractorFactory) {
            if (hlsExtractorFactory == null) {
                hlsExtractorFactory = androidx.media3.exoplayer.hls.HlsExtractorFactory.DEFAULT;
            }
            this.extractorFactory = hlsExtractorFactory;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy) androidx.media3.common.util.Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            this.extractorFactory.setSubtitleParserFactory((androidx.media3.extractor.text.SubtitleParser.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory));
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @java.lang.Deprecated
        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            this.extractorFactory.experimentalParseSubtitlesDuringExtraction(z);
            return this;
        }

        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setPlaylistParserFactory(androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory hlsPlaylistParserFactory) {
            this.playlistParserFactory = (androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory) androidx.media3.common.util.Assertions.checkNotNull(hlsPlaylistParserFactory, "HlsMediaSource.Factory#setPlaylistParserFactory no longer handles null by instantiating a new DefaultHlsPlaylistParserFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setPlaylistTrackerFactory(androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory factory) {
            this.playlistTrackerFactory = (androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory, "HlsMediaSource.Factory#setPlaylistTrackerFactory no longer handles null by defaulting to DefaultHlsPlaylistTracker.FACTORY. Explicitly pass a reference to this instance in order to retain the old behavior.");
            return this;
        }

        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setCompositeSequenceableLoaderFactory(androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            this.compositeSequenceableLoaderFactory = (androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory) androidx.media3.common.util.Assertions.checkNotNull(compositeSequenceableLoaderFactory, "HlsMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setAllowChunklessPreparation(boolean z) {
            this.allowChunklessPreparation = z;
            return this;
        }

        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setMetadataType(int i) {
            this.metadataType = i;
            return this;
        }

        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setUseSessionKeys(boolean z) {
            this.useSessionKeys = z;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = (androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = (androidx.media3.exoplayer.drm.DrmSessionManagerProvider) androidx.media3.common.util.Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public androidx.media3.exoplayer.hls.HlsMediaSource.Factory setTimestampAdjusterInitializationTimeoutMs(long j) {
            this.timestampAdjusterInitializationTimeoutMs = j;
            return this;
        }

        androidx.media3.exoplayer.hls.HlsMediaSource.Factory setElapsedRealTimeOffsetMs(long j) {
            this.elapsedRealTimeOffsetMs = j;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.hls.HlsMediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem) {
            androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration);
            androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory hlsPlaylistParserFactory = this.playlistParserFactory;
            java.util.List<androidx.media3.common.StreamKey> list = mediaItem.localConfiguration.streamKeys;
            androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory filteringHlsPlaylistParserFactory = !list.isEmpty() ? new androidx.media3.exoplayer.hls.playlist.FilteringHlsPlaylistParserFactory(hlsPlaylistParserFactory, list) : hlsPlaylistParserFactory;
            androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfigurationCreateCmcdConfiguration = factory == null ? null : factory.createCmcdConfiguration(mediaItem);
            androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory = this.hlsDataSourceFactory;
            androidx.media3.exoplayer.hls.HlsExtractorFactory hlsExtractorFactory = this.extractorFactory;
            androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory = this.compositeSequenceableLoaderFactory;
            androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager = this.drmSessionManagerProvider.get(mediaItem);
            androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            return new androidx.media3.exoplayer.hls.HlsMediaSource(mediaItem, hlsDataSourceFactory, hlsExtractorFactory, compositeSequenceableLoaderFactory, cmcdConfigurationCreateCmcdConfiguration, drmSessionManager, loadErrorHandlingPolicy, this.playlistTrackerFactory.createTracker(this.hlsDataSourceFactory, loadErrorHandlingPolicy, filteringHlsPlaylistParserFactory), this.elapsedRealTimeOffsetMs, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys, this.timestampAdjusterInitializationTimeoutMs);
        }
    }

    private HlsMediaSource(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory, androidx.media3.exoplayer.hls.HlsExtractorFactory hlsExtractorFactory, androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker hlsPlaylistTracker, long j, boolean z, int i, boolean z2, long j2) {
        this.mediaItem = mediaItem;
        this.liveConfiguration = mediaItem.liveConfiguration;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.extractorFactory = hlsExtractorFactory;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.playlistTracker = hlsPlaylistTracker;
        this.elapsedRealTimeOffsetMs = j;
        this.allowChunklessPreparation = z;
        this.metadataType = i;
        this.useSessionKeys = z2;
        this.timestampAdjusterInitializationTimeoutMs = j2;
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
        this.drmSessionManager.setPlayer((android.os.Looper) androidx.media3.common.util.Assertions.checkNotNull(android.os.Looper.myLooper()), getPlayerId());
        this.drmSessionManager.prepare();
        this.playlistTracker.start(((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(getMediaItem().localConfiguration)).uri, createEventDispatcher(null), this);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
        this.playlistTracker.maybeThrowPrimaryPlaylistRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId);
        return new androidx.media3.exoplayer.hls.HlsMediaPeriod(this.extractorFactory, this.playlistTracker, this.dataSourceFactory, this.mediaTransferListener, this.cmcdConfiguration, this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, allocator, this.compositeSequenceableLoaderFactory, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys, getPlayerId(), this.timestampAdjusterInitializationTimeoutMs);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.hls.HlsMediaPeriod) mediaPeriod).release();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        this.playlistTracker.stop();
        this.drmSessionManager.release();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener
    public void onPrimaryPlaylistRefreshed(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        androidx.media3.exoplayer.source.SinglePeriodTimeline singlePeriodTimelineCreateTimelineForOnDemand;
        long jUsToMs = hlsMediaPlaylist.hasProgramDateTime ? androidx.media3.common.util.Util.usToMs(hlsMediaPlaylist.startTimeUs) : -9223372036854775807L;
        long j = (hlsMediaPlaylist.playlistType == 2 || hlsMediaPlaylist.playlistType == 1) ? jUsToMs : -9223372036854775807L;
        androidx.media3.exoplayer.hls.HlsManifest hlsManifest = new androidx.media3.exoplayer.hls.HlsManifest((androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist) androidx.media3.common.util.Assertions.checkNotNull(this.playlistTracker.getMultivariantPlaylist()), hlsMediaPlaylist);
        if (this.playlistTracker.isLive()) {
            singlePeriodTimelineCreateTimelineForOnDemand = createTimelineForLive(hlsMediaPlaylist, j, jUsToMs, hlsManifest);
        } else {
            singlePeriodTimelineCreateTimelineForOnDemand = createTimelineForOnDemand(hlsMediaPlaylist, j, jUsToMs, hlsManifest);
        }
        refreshSourceInfo(singlePeriodTimelineCreateTimelineForOnDemand);
    }

    private androidx.media3.exoplayer.source.SinglePeriodTimeline createTimelineForLive(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, long j, long j2, androidx.media3.exoplayer.hls.HlsManifest hlsManifest) {
        long targetLiveOffsetUs;
        long initialStartTimeUs = hlsMediaPlaylist.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        long j3 = hlsMediaPlaylist.hasEndTag ? initialStartTimeUs + hlsMediaPlaylist.durationUs : -9223372036854775807L;
        long liveEdgeOffsetUs = getLiveEdgeOffsetUs(hlsMediaPlaylist);
        if (this.liveConfiguration.targetOffsetMs != androidx.media3.common.C.TIME_UNSET) {
            targetLiveOffsetUs = androidx.media3.common.util.Util.msToUs(this.liveConfiguration.targetOffsetMs);
        } else {
            targetLiveOffsetUs = getTargetLiveOffsetUs(hlsMediaPlaylist, liveEdgeOffsetUs);
        }
        updateLiveConfiguration(hlsMediaPlaylist, androidx.media3.common.util.Util.constrainValue(targetLiveOffsetUs, liveEdgeOffsetUs, hlsMediaPlaylist.durationUs + liveEdgeOffsetUs));
        return new androidx.media3.exoplayer.source.SinglePeriodTimeline(j, j2, androidx.media3.common.C.TIME_UNSET, j3, hlsMediaPlaylist.durationUs, initialStartTimeUs, getLiveWindowDefaultStartPositionUs(hlsMediaPlaylist, liveEdgeOffsetUs), true, !hlsMediaPlaylist.hasEndTag, hlsMediaPlaylist.playlistType == 2 && hlsMediaPlaylist.hasPositiveStartOffset, hlsManifest, getMediaItem(), this.liveConfiguration);
    }

    private androidx.media3.exoplayer.source.SinglePeriodTimeline createTimelineForOnDemand(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, long j, long j2, androidx.media3.exoplayer.hls.HlsManifest hlsManifest) {
        long j3;
        if (hlsMediaPlaylist.startOffsetUs == androidx.media3.common.C.TIME_UNSET || hlsMediaPlaylist.segments.isEmpty()) {
            j3 = 0;
        } else if (hlsMediaPlaylist.preciseStart || hlsMediaPlaylist.startOffsetUs == hlsMediaPlaylist.durationUs) {
            j3 = hlsMediaPlaylist.startOffsetUs;
        } else {
            j3 = findClosestPrecedingSegment(hlsMediaPlaylist.segments, hlsMediaPlaylist.startOffsetUs).relativeStartTimeUs;
        }
        return new androidx.media3.exoplayer.source.SinglePeriodTimeline(j, j2, androidx.media3.common.C.TIME_UNSET, hlsMediaPlaylist.durationUs, hlsMediaPlaylist.durationUs, 0L, j3, true, false, true, hlsManifest, getMediaItem(), null);
    }

    private long getLiveEdgeOffsetUs(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist.hasProgramDateTime) {
            return androidx.media3.common.util.Util.msToUs(androidx.media3.common.util.Util.getNowUnixTimeMs(this.elapsedRealTimeOffsetMs)) - hlsMediaPlaylist.getEndTimeUs();
        }
        return 0L;
    }

    private long getLiveWindowDefaultStartPositionUs(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, long j) {
        long jMsToUs;
        if (hlsMediaPlaylist.startOffsetUs != androidx.media3.common.C.TIME_UNSET) {
            jMsToUs = hlsMediaPlaylist.startOffsetUs;
        } else {
            jMsToUs = (hlsMediaPlaylist.durationUs + j) - androidx.media3.common.util.Util.msToUs(this.liveConfiguration.targetOffsetMs);
        }
        if (hlsMediaPlaylist.preciseStart) {
            return jMsToUs;
        }
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part partFindClosestPrecedingIndependentPart = findClosestPrecedingIndependentPart(hlsMediaPlaylist.trailingParts, jMsToUs);
        if (partFindClosestPrecedingIndependentPart != null) {
            return partFindClosestPrecedingIndependentPart.relativeStartTimeUs;
        }
        if (hlsMediaPlaylist.segments.isEmpty()) {
            return 0L;
        }
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segmentFindClosestPrecedingSegment = findClosestPrecedingSegment(hlsMediaPlaylist.segments, jMsToUs);
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part partFindClosestPrecedingIndependentPart2 = findClosestPrecedingIndependentPart(segmentFindClosestPrecedingSegment.parts, jMsToUs);
        if (partFindClosestPrecedingIndependentPart2 != null) {
            return partFindClosestPrecedingIndependentPart2.relativeStartTimeUs;
        }
        return segmentFindClosestPrecedingSegment.relativeStartTimeUs;
    }

    private void updateLiveConfiguration(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, long j) {
        androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = getMediaItem().liveConfiguration;
        boolean z = liveConfiguration.minPlaybackSpeed == -3.4028235E38f && liveConfiguration.maxPlaybackSpeed == -3.4028235E38f && hlsMediaPlaylist.serverControl.holdBackUs == androidx.media3.common.C.TIME_UNSET && hlsMediaPlaylist.serverControl.partHoldBackUs == androidx.media3.common.C.TIME_UNSET;
        this.liveConfiguration = new androidx.media3.common.MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(androidx.media3.common.util.Util.usToMs(j)).setMinPlaybackSpeed(z ? 1.0f : this.liveConfiguration.minPlaybackSpeed).setMaxPlaybackSpeed(z ? 1.0f : this.liveConfiguration.maxPlaybackSpeed).build();
    }

    private static long getTargetLiveOffsetUs(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, long j) {
        long j2;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl serverControl = hlsMediaPlaylist.serverControl;
        if (hlsMediaPlaylist.startOffsetUs != androidx.media3.common.C.TIME_UNSET) {
            j2 = hlsMediaPlaylist.durationUs - hlsMediaPlaylist.startOffsetUs;
        } else if (serverControl.partHoldBackUs != androidx.media3.common.C.TIME_UNSET && hlsMediaPlaylist.partTargetDurationUs != androidx.media3.common.C.TIME_UNSET) {
            j2 = serverControl.partHoldBackUs;
        } else if (serverControl.holdBackUs != androidx.media3.common.C.TIME_UNSET) {
            j2 = serverControl.holdBackUs;
        } else {
            j2 = 3 * hlsMediaPlaylist.targetDurationUs;
        }
        return j2 + j;
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part findClosestPrecedingIndependentPart(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> list, long j) {
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part = null;
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part2 = list.get(i);
            if (part2.relativeStartTimeUs > j || !part2.isIndependent) {
                if (part2.relativeStartTimeUs > j) {
                    break;
                }
            } else {
                part = part2;
            }
        }
        return part;
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment findClosestPrecedingSegment(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment> list, long j) {
        return list.get(androidx.media3.common.util.Util.binarySearchFloor((java.util.List<? extends java.lang.Comparable<? super java.lang.Long>>) list, java.lang.Long.valueOf(j), true, true));
    }
}
