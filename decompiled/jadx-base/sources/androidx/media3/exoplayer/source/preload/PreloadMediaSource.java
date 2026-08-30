package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadMediaSource extends androidx.media3.exoplayer.source.WrappingMediaSource {
    private static final java.lang.String TAG = "PreloadMediaSource";
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private final androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter;
    private boolean onSourcePreparedNotified;
    private boolean onUsedByPlayerNotified;
    private android.util.Pair<androidx.media3.exoplayer.source.preload.PreloadMediaPeriod, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> playingPreloadedMediaPeriodAndId;
    private boolean preloadCalled;
    private final androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl preloadControl;
    private final android.os.Handler preloadHandler;
    private android.util.Pair<androidx.media3.exoplayer.source.preload.PreloadMediaPeriod, androidx.media3.exoplayer.source.preload.PreloadMediaSource.MediaPeriodKey> preloadingMediaPeriodAndKey;
    private boolean prepareChildSourceCalled;
    private final androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilities;
    private long startPositionUs;
    private androidx.media3.common.Timeline timeline;
    private final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector;

    public interface PreloadControl {
        boolean onContinueLoadingRequested(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource, long j);

        default void onLoadedToTheEndOfSource(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
        }

        boolean onSourcePrepared(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource);

        boolean onTracksSelected(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource);

        void onUsedByPlayer(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource);
    }

    public static final class Factory implements androidx.media3.exoplayer.source.MediaSource.Factory {
        private final androidx.media3.exoplayer.upstream.Allocator allocator;
        private final androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter;
        private final androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory;
        private final androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl preloadControl;
        private final android.os.Looper preloadLooper;
        private final androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilities;
        private final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector;

        public Factory(androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl preloadControl, androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr, androidx.media3.exoplayer.upstream.Allocator allocator, android.os.Looper looper) {
            this.mediaSourceFactory = factory;
            this.preloadControl = preloadControl;
            this.trackSelector = trackSelector;
            this.bandwidthMeter = bandwidthMeter;
            this.rendererCapabilities = (androidx.media3.exoplayer.RendererCapabilities[]) java.util.Arrays.copyOf(rendererCapabilitiesArr, rendererCapabilitiesArr.length);
            this.allocator = allocator;
            this.preloadLooper = looper;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.preload.PreloadMediaSource.Factory setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
            this.mediaSourceFactory.setCmcdConfigurationFactory(factory);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.preload.PreloadMediaSource.Factory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.preload.PreloadMediaSource.Factory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return this.mediaSourceFactory.getSupportedTypes();
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.preload.PreloadMediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem) {
            return new androidx.media3.exoplayer.source.preload.PreloadMediaSource(this.mediaSourceFactory.createMediaSource(mediaItem), this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.allocator, this.preloadLooper);
        }

        public androidx.media3.exoplayer.source.preload.PreloadMediaSource createMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
            return new androidx.media3.exoplayer.source.preload.PreloadMediaSource(mediaSource, this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.allocator, this.preloadLooper);
        }
    }

    private PreloadMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl preloadControl, androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr, androidx.media3.exoplayer.upstream.Allocator allocator, android.os.Looper looper) {
        super(mediaSource);
        this.preloadControl = preloadControl;
        this.trackSelector = trackSelector;
        this.bandwidthMeter = bandwidthMeter;
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.allocator = allocator;
        this.preloadHandler = androidx.media3.common.util.Util.createHandler(looper, null);
        this.startPositionUs = androidx.media3.common.C.TIME_UNSET;
    }

    public void preload(final long j) {
        this.preloadHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m199xf99e9a56(j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$preload$0$androidx-media3-exoplayer-source-preload-PreloadMediaSource, reason: not valid java name */
    /* synthetic */ void m199xf99e9a56(long j) {
        this.preloadCalled = true;
        this.startPositionUs = j;
        this.onSourcePreparedNotified = false;
        if (isUsedByPlayer()) {
            notifyOnUsedByPlayer();
        } else {
            setPlayerId(androidx.media3.exoplayer.analytics.PlayerId.UNSET);
            prepareSourceInternal(this.bandwidthMeter.getTransferListener());
        }
    }

    public void clear() {
        this.preloadHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m198xcf4780db();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$clear$1$androidx-media3-exoplayer-source-preload-PreloadMediaSource, reason: not valid java name */
    /* synthetic */ void m198xcf4780db() {
        if (this.preloadingMediaPeriodAndKey != null) {
            this.mediaSource.releasePeriod(((androidx.media3.exoplayer.source.preload.PreloadMediaPeriod) this.preloadingMediaPeriodAndKey.first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void prepareSourceInternal() {
        if (isUsedByPlayer() && !this.onUsedByPlayerNotified) {
            notifyOnUsedByPlayer();
        }
        androidx.media3.common.Timeline timeline = this.timeline;
        if (timeline != null) {
            onChildSourceInfoRefreshed(timeline);
        } else {
            if (this.prepareChildSourceCalled) {
                return;
            }
            this.prepareChildSourceCalled = true;
            prepareChildSource();
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(androidx.media3.common.Timeline timeline) {
        this.timeline = timeline;
        refreshSourceInfo(timeline);
        if (isUsedByPlayer() || this.onSourcePreparedNotified) {
            return;
        }
        this.onSourcePreparedNotified = true;
        if (this.preloadControl.onSourcePrepared(this)) {
            android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(new androidx.media3.common.Timeline.Window(), new androidx.media3.common.Timeline.Period(), 0, this.startPositionUs);
            createPeriod(new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(periodPositionUs.first), this.allocator, ((java.lang.Long) periodPositionUs.second).longValue()).preload(new androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadMediaPeriodCallback(((java.lang.Long) periodPositionUs.second).longValue()), ((java.lang.Long) periodPositionUs.second).longValue());
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.preload.PreloadMediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        androidx.media3.exoplayer.source.preload.PreloadMediaSource.MediaPeriodKey mediaPeriodKey = new androidx.media3.exoplayer.source.preload.PreloadMediaSource.MediaPeriodKey(mediaPeriodId, j);
        android.util.Pair<androidx.media3.exoplayer.source.preload.PreloadMediaPeriod, androidx.media3.exoplayer.source.preload.PreloadMediaSource.MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null && mediaPeriodKey.equals(pair.second)) {
            androidx.media3.exoplayer.source.preload.PreloadMediaPeriod preloadMediaPeriod = (androidx.media3.exoplayer.source.preload.PreloadMediaPeriod) ((android.util.Pair) androidx.media3.common.util.Assertions.checkNotNull(this.preloadingMediaPeriodAndKey)).first;
            if (isUsedByPlayer()) {
                this.preloadingMediaPeriodAndKey = null;
                this.playingPreloadedMediaPeriodAndId = new android.util.Pair<>(preloadMediaPeriod, mediaPeriodId);
            }
            return preloadMediaPeriod;
        }
        if (this.preloadingMediaPeriodAndKey != null) {
            this.mediaSource.releasePeriod(((androidx.media3.exoplayer.source.preload.PreloadMediaPeriod) ((android.util.Pair) androidx.media3.common.util.Assertions.checkNotNull(this.preloadingMediaPeriodAndKey)).first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
        androidx.media3.exoplayer.source.preload.PreloadMediaPeriod preloadMediaPeriod2 = new androidx.media3.exoplayer.source.preload.PreloadMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j));
        if (!isUsedByPlayer()) {
            this.preloadingMediaPeriodAndKey = new android.util.Pair<>(preloadMediaPeriod2, mediaPeriodKey);
        }
        return preloadMediaPeriod2;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        android.util.Pair<androidx.media3.exoplayer.source.preload.PreloadMediaPeriod, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> pair = this.playingPreloadedMediaPeriodAndId;
        return (pair == null || !mediaPeriodIdEqualsWithoutWindowSequenceNumber(mediaPeriodId, (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) ((android.util.Pair) androidx.media3.common.util.Assertions.checkNotNull(pair)).second)) ? mediaPeriodId : (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) ((android.util.Pair) androidx.media3.common.util.Assertions.checkNotNull(this.playingPreloadedMediaPeriodAndId)).second;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.source.preload.PreloadMediaPeriod preloadMediaPeriod = (androidx.media3.exoplayer.source.preload.PreloadMediaPeriod) mediaPeriod;
        android.util.Pair<androidx.media3.exoplayer.source.preload.PreloadMediaPeriod, androidx.media3.exoplayer.source.preload.PreloadMediaSource.MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null && preloadMediaPeriod == ((android.util.Pair) androidx.media3.common.util.Assertions.checkNotNull(pair)).first) {
            this.preloadingMediaPeriodAndKey = null;
        } else {
            android.util.Pair<androidx.media3.exoplayer.source.preload.PreloadMediaPeriod, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> pair2 = this.playingPreloadedMediaPeriodAndId;
            if (pair2 != null && preloadMediaPeriod == ((android.util.Pair) androidx.media3.common.util.Assertions.checkNotNull(pair2)).first) {
                this.playingPreloadedMediaPeriodAndId = null;
            }
        }
        this.mediaSource.releasePeriod(preloadMediaPeriod.mediaPeriod);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        if (isUsedByPlayer()) {
            return;
        }
        this.onUsedByPlayerNotified = false;
        if (this.preloadCalled) {
            return;
        }
        this.timeline = null;
        this.prepareChildSourceCalled = false;
        super.releaseSourceInternal();
    }

    public void releasePreloadMediaSource() {
        this.preloadHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaSource$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m200x1f0d7b4c();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$releasePreloadMediaSource$2$androidx-media3-exoplayer-source-preload-PreloadMediaSource, reason: not valid java name */
    /* synthetic */ void m200x1f0d7b4c() {
        this.preloadCalled = false;
        this.startPositionUs = androidx.media3.common.C.TIME_UNSET;
        this.onSourcePreparedNotified = false;
        if (this.preloadingMediaPeriodAndKey != null) {
            this.mediaSource.releasePeriod(((androidx.media3.exoplayer.source.preload.PreloadMediaPeriod) this.preloadingMediaPeriodAndKey.first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
        releaseSourceInternal();
        this.preloadHandler.removeCallbacksAndMessages(null);
    }

    private class PreloadMediaPeriodCallback implements androidx.media3.exoplayer.source.MediaPeriod.Callback {
        private final long periodStartPositionUs;
        private boolean prepared;

        public PreloadMediaPeriodCallback(long j) {
            this.periodStartPositionUs = j;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResultSelectTracks;
            this.prepared = true;
            if (androidx.media3.exoplayer.source.preload.PreloadMediaSource.this.isUsedByPlayer()) {
                return;
            }
            androidx.media3.exoplayer.source.preload.PreloadMediaPeriod preloadMediaPeriod = (androidx.media3.exoplayer.source.preload.PreloadMediaPeriod) mediaPeriod;
            try {
                trackSelectorResultSelectTracks = androidx.media3.exoplayer.source.preload.PreloadMediaSource.this.trackSelector.selectTracks(androidx.media3.exoplayer.source.preload.PreloadMediaSource.this.rendererCapabilities, preloadMediaPeriod.getTrackGroups(), ((androidx.media3.exoplayer.source.preload.PreloadMediaSource.MediaPeriodKey) ((android.util.Pair) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.source.preload.PreloadMediaSource.this.preloadingMediaPeriodAndKey)).second).mediaPeriodId, (androidx.media3.common.Timeline) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.source.preload.PreloadMediaSource.this.timeline));
            } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.source.preload.PreloadMediaSource.TAG, "Failed to select tracks", e);
                trackSelectorResultSelectTracks = null;
            }
            if (trackSelectorResultSelectTracks != null) {
                preloadMediaPeriod.selectTracksForPreloading(trackSelectorResultSelectTracks.selections, this.periodStartPositionUs);
                if (androidx.media3.exoplayer.source.preload.PreloadMediaSource.this.preloadControl.onTracksSelected(androidx.media3.exoplayer.source.preload.PreloadMediaSource.this)) {
                    preloadMediaPeriod.continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(this.periodStartPositionUs).build());
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            if (androidx.media3.exoplayer.source.preload.PreloadMediaSource.this.isUsedByPlayer()) {
                return;
            }
            androidx.media3.exoplayer.source.preload.PreloadMediaPeriod preloadMediaPeriod = (androidx.media3.exoplayer.source.preload.PreloadMediaPeriod) mediaPeriod;
            if (this.prepared && mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE) {
                androidx.media3.exoplayer.source.preload.PreloadMediaSource.this.preloadControl.onLoadedToTheEndOfSource(androidx.media3.exoplayer.source.preload.PreloadMediaSource.this);
            } else if (!this.prepared || androidx.media3.exoplayer.source.preload.PreloadMediaSource.this.preloadControl.onContinueLoadingRequested(androidx.media3.exoplayer.source.preload.PreloadMediaSource.this, preloadMediaPeriod.getBufferedPositionUs())) {
                preloadMediaPeriod.continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(this.periodStartPositionUs).build());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUsedByPlayer() {
        return prepareSourceCalled();
    }

    private void notifyOnUsedByPlayer() {
        this.preloadControl.onUsedByPlayer(this);
        this.onUsedByPlayerNotified = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mediaPeriodIdEqualsWithoutWindowSequenceNumber(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid) && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup && mediaPeriodId.nextAdGroupIndex == mediaPeriodId2.nextAdGroupIndex;
    }

    private static class MediaPeriodKey {
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        private final java.lang.Long startPositionUs;

        public MediaPeriodKey(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
            this.mediaPeriodId = mediaPeriodId;
            this.startPositionUs = java.lang.Long.valueOf(j);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.source.preload.PreloadMediaSource.MediaPeriodKey)) {
                return false;
            }
            androidx.media3.exoplayer.source.preload.PreloadMediaSource.MediaPeriodKey mediaPeriodKey = (androidx.media3.exoplayer.source.preload.PreloadMediaSource.MediaPeriodKey) obj;
            return androidx.media3.exoplayer.source.preload.PreloadMediaSource.mediaPeriodIdEqualsWithoutWindowSequenceNumber(this.mediaPeriodId, mediaPeriodKey.mediaPeriodId) && this.startPositionUs.equals(mediaPeriodKey.startPositionUs);
        }

        public int hashCode() {
            return ((((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.mediaPeriodId.periodUid.hashCode()) * 31) + this.mediaPeriodId.adGroupIndex) * 31) + this.mediaPeriodId.adIndexInAdGroup) * 31) + this.mediaPeriodId.nextAdGroupIndex) * 31) + this.startPositionUs.intValue();
        }
    }
}
