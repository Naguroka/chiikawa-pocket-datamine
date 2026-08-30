package androidx.media3.exoplayer.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final class AdsMediaSource extends androidx.media3.exoplayer.source.CompositeMediaSource<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> {
    private static final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(new java.lang.Object());
    private final androidx.media3.exoplayer.source.MediaSource.Factory adMediaSourceFactory;
    private androidx.media3.common.AdPlaybackState adPlaybackState;
    private final androidx.media3.datasource.DataSpec adTagDataSpec;
    private final androidx.media3.common.AdViewProvider adViewProvider;
    private final java.lang.Object adsId;
    private final androidx.media3.exoplayer.source.ads.AdsLoader adsLoader;
    private androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener;
    final androidx.media3.common.MediaItem.DrmConfiguration contentDrmConfiguration;
    private final androidx.media3.exoplayer.source.MaskingMediaSource contentMediaSource;
    private androidx.media3.common.Timeline contentTimeline;
    private final android.os.Handler mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private final androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
    private androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolders = new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[0][];

    public static final class AdLoadException extends java.io.IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public static androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException createForAd(java.lang.Exception exc) {
            return new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException(0, exc);
        }

        public static androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException createForAdGroup(java.lang.Exception exc, int i) {
            return new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException(1, new java.io.IOException("Failed to load ad group " + i, exc));
        }

        public static androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException createForAllAds(java.lang.Exception exc) {
            return new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException(2, exc);
        }

        public static androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException createForUnexpected(java.lang.RuntimeException runtimeException) {
            return new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException(3, runtimeException);
        }

        private AdLoadException(int i, java.lang.Exception exc) {
            super(exc);
            this.type = i;
        }

        public java.lang.RuntimeException getRuntimeExceptionForUnexpected() {
            androidx.media3.common.util.Assertions.checkState(this.type == 3);
            return (java.lang.RuntimeException) androidx.media3.common.util.Assertions.checkNotNull(getCause());
        }
    }

    public AdsMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.datasource.DataSpec dataSpec, java.lang.Object obj, androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.exoplayer.source.ads.AdsLoader adsLoader, androidx.media3.common.AdViewProvider adViewProvider) {
        this.contentMediaSource = new androidx.media3.exoplayer.source.MaskingMediaSource(mediaSource, true);
        this.contentDrmConfiguration = ((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(mediaSource.getMediaItem().localConfiguration)).drmConfiguration;
        this.adMediaSourceFactory = factory;
        this.adsLoader = adsLoader;
        this.adViewProvider = adViewProvider;
        this.adTagDataSpec = dataSpec;
        this.adsId = obj;
        adsLoader.setSupportedContentTypes(factory.getSupportedTypes());
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.common.MediaItem getMediaItem() {
        return this.contentMediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        return androidx.media3.common.util.Util.areEqual(getAdsConfiguration(getMediaItem()), getAdsConfiguration(mediaItem)) && this.contentMediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.contentMediaSource.updateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        final androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener = new androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener();
        this.componentListener = componentListener;
        this.contentTimeline = this.contentMediaSource.getTimeline();
        prepareChildSource(CHILD_SOURCE_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m191x9f9466de(componentListener);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$prepareSourceInternal$0$androidx-media3-exoplayer-source-ads-AdsMediaSource, reason: not valid java name */
    /* synthetic */ void m191x9f9466de(androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener) {
        this.adsLoader.start(this, this.adTagDataSpec, this.adsId, this.adViewProvider, componentListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        if (((androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackState)).adGroupCount > 0 && mediaPeriodId.isAd()) {
            int i = mediaPeriodId.adGroupIndex;
            int i2 = mediaPeriodId.adIndexInAdGroup;
            androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i];
            if (adMediaSourceHolderArr2.length <= i2) {
                adMediaSourceHolderArr[i] = (androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[]) java.util.Arrays.copyOf(adMediaSourceHolderArr2, i2 + 1);
            }
            androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[i][i2];
            if (adMediaSourceHolder == null) {
                adMediaSourceHolder = new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder(mediaPeriodId);
                this.adMediaSourceHolders[i][i2] = adMediaSourceHolder;
                maybeUpdateAdMediaSources();
            }
            return adMediaSourceHolder.createMediaPeriod(mediaPeriodId, allocator, j);
        }
        androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = new androidx.media3.exoplayer.source.MaskingMediaPeriod(mediaPeriodId, allocator, j);
        maskingMediaPeriod.setMediaSource(this.contentMediaSource);
        maskingMediaPeriod.createPeriod(mediaPeriodId);
        return maskingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = (androidx.media3.exoplayer.source.MaskingMediaPeriod) mediaPeriod;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.id;
        if (mediaPeriodId.isAd()) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = (androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder) androidx.media3.common.util.Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup]);
            adMediaSourceHolder.releaseMediaPeriod(maskingMediaPeriod);
            if (adMediaSourceHolder.isInactive()) {
                adMediaSourceHolder.release();
                this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
                return;
            }
            return;
        }
        maskingMediaPeriod.releasePeriod();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        final androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener = (androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener) androidx.media3.common.util.Assertions.checkNotNull(this.componentListener);
        this.componentListener = null;
        componentListener.stop();
        this.contentTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[0][];
        this.mainHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m192x4d6cb35f(componentListener);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$releaseSourceInternal$1$androidx-media3-exoplayer-source-ads-AdsMediaSource, reason: not valid java name */
    /* synthetic */ void m192x4d6cb35f(androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener) {
        this.adsLoader.stop(this, componentListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void m179x28f9175(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
        if (mediaPeriodId.isAd()) {
            ((androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder) androidx.media3.common.util.Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup])).handleSourceInfoRefresh(timeline);
        } else {
            androidx.media3.common.util.Assertions.checkArgument(timeline.getPeriodCount() == 1);
            this.contentTimeline = timeline;
        }
        maybeUpdateSourceInfo();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(androidx.media3.common.AdPlaybackState adPlaybackState) {
        if (this.adPlaybackState == null) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr = new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[adPlaybackState.adGroupCount][];
            this.adMediaSourceHolders = adMediaSourceHolderArr;
            java.util.Arrays.fill(adMediaSourceHolderArr, new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[0]);
        } else {
            androidx.media3.common.util.Assertions.checkState(adPlaybackState.adGroupCount == this.adPlaybackState.adGroupCount);
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    private void maybeUpdateAdMediaSources() {
        androidx.media3.common.MediaItem mediaItemBuild;
        androidx.media3.common.AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null) {
            return;
        }
        for (int i = 0; i < this.adMediaSourceHolders.length; i++) {
            int i2 = 0;
            while (true) {
                androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[] adMediaSourceHolderArr = this.adMediaSourceHolders[i];
                if (i2 < adMediaSourceHolderArr.length) {
                    androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr[i2];
                    androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
                    if (adMediaSourceHolder != null && !adMediaSourceHolder.hasMediaSource() && i2 < adGroup.mediaItems.length && (mediaItemBuild = adGroup.mediaItems[i2]) != null) {
                        if (this.contentDrmConfiguration != null) {
                            mediaItemBuild = mediaItemBuild.buildUpon().setDrmConfiguration(this.contentDrmConfiguration).build();
                        }
                        adMediaSourceHolder.initializeWithMediaSource(this.adMediaSourceFactory.createMediaSource(mediaItemBuild), mediaItemBuild);
                    }
                    i2++;
                }
            }
        }
    }

    private void maybeUpdateSourceInfo() {
        androidx.media3.common.Timeline timeline = this.contentTimeline;
        androidx.media3.common.AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || timeline == null) {
            return;
        }
        if (adPlaybackState.adGroupCount == 0) {
            refreshSourceInfo(timeline);
        } else {
            this.adPlaybackState = this.adPlaybackState.withAdDurationsUs(getAdDurationsUs());
            refreshSourceInfo(new androidx.media3.exoplayer.source.ads.SinglePeriodAdTimeline(timeline, this.adPlaybackState));
        }
    }

    private long[][] getAdDurationsUs() {
        long[][] jArr = new long[this.adMediaSourceHolders.length][];
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            if (i >= adMediaSourceHolderArr.length) {
                return jArr;
            }
            jArr[i] = new long[adMediaSourceHolderArr[i].length];
            int i2 = 0;
            while (true) {
                androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.adMediaSourceHolders[i];
                if (i2 < adMediaSourceHolderArr2.length) {
                    androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr2[i2];
                    jArr[i][i2] = adMediaSourceHolder == null ? androidx.media3.common.C.TIME_UNSET : adMediaSourceHolder.getDurationUs();
                    i2++;
                }
            }
            i++;
        }
    }

    private static androidx.media3.common.MediaItem.AdsConfiguration getAdsConfiguration(androidx.media3.common.MediaItem mediaItem) {
        if (mediaItem.localConfiguration == null) {
            return null;
        }
        return mediaItem.localConfiguration.adsConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ComponentListener implements androidx.media3.exoplayer.source.ads.AdsLoader.EventListener {
        private final android.os.Handler playerHandler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
        private volatile boolean stopped;

        public ComponentListener() {
        }

        public void stop() {
            this.stopped = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(final androidx.media3.common.AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            this.playerHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$ComponentListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m195x6396e000(adPlaybackState);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdPlaybackState$0$androidx-media3-exoplayer-source-ads-AdsMediaSource$ComponentListener, reason: not valid java name */
        /* synthetic */ void m195x6396e000(androidx.media3.common.AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdLoadError(androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException adLoadException, androidx.media3.datasource.DataSpec dataSpec) {
            if (this.stopped) {
                return;
            }
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.createEventDispatcher(null).loadError(new androidx.media3.exoplayer.source.LoadEventInfo(androidx.media3.exoplayer.source.LoadEventInfo.getNewId(), dataSpec, android.os.SystemClock.elapsedRealtime()), 6, (java.io.IOException) adLoadException, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class AdPrepareListener implements androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener {
        private final androidx.media3.common.MediaItem adMediaItem;

        public AdPrepareListener(androidx.media3.common.MediaItem mediaItem) {
            this.adMediaItem = mediaItem;
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.mainHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m193x672fc1f4(mediaPeriodId);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onPrepareComplete$0$androidx-media3-exoplayer-source-ads-AdsMediaSource$AdPrepareListener, reason: not valid java name */
        /* synthetic */ void m193x672fc1f4(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.adsLoader.handlePrepareComplete(androidx.media3.exoplayer.source.ads.AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final java.io.IOException iOException) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.createEventDispatcher(mediaPeriodId).loadError(new androidx.media3.exoplayer.source.LoadEventInfo(androidx.media3.exoplayer.source.LoadEventInfo.getNewId(), new androidx.media3.datasource.DataSpec(((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(this.adMediaItem.localConfiguration)).uri), android.os.SystemClock.elapsedRealtime()), 6, (java.io.IOException) androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException.createForAd(iOException), true);
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.mainHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.ads.AdsMediaSource$AdPrepareListener$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m194xa9898f8e(mediaPeriodId, iOException);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onPrepareError$1$androidx-media3-exoplayer-source-ads-AdsMediaSource$AdPrepareListener, reason: not valid java name */
        /* synthetic */ void m194xa9898f8e(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.io.IOException iOException) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.adsLoader.handlePrepareError(androidx.media3.exoplayer.source.ads.AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, iOException);
        }
    }

    private final class AdMediaSourceHolder {
        private final java.util.List<androidx.media3.exoplayer.source.MaskingMediaPeriod> activeMediaPeriods = new java.util.ArrayList();
        private androidx.media3.common.MediaItem adMediaItem;
        private androidx.media3.exoplayer.source.MediaSource adMediaSource;
        private final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId id;
        private androidx.media3.common.Timeline timeline;

        public AdMediaSourceHolder(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            this.id = mediaPeriodId;
        }

        public void initializeWithMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.MediaItem mediaItem) {
            this.adMediaSource = mediaSource;
            this.adMediaItem = mediaItem;
            for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = this.activeMediaPeriods.get(i);
                maskingMediaPeriod.setMediaSource(mediaSource);
                maskingMediaPeriod.setPrepareListener(androidx.media3.exoplayer.source.ads.AdsMediaSource.this.new AdPrepareListener(mediaItem));
            }
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.prepareChildSource(this.id, mediaSource);
        }

        public androidx.media3.exoplayer.source.MediaPeriod createMediaPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
            androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = new androidx.media3.exoplayer.source.MaskingMediaPeriod(mediaPeriodId, allocator, j);
            this.activeMediaPeriods.add(maskingMediaPeriod);
            androidx.media3.exoplayer.source.MediaSource mediaSource = this.adMediaSource;
            if (mediaSource != null) {
                maskingMediaPeriod.setMediaSource(mediaSource);
                maskingMediaPeriod.setPrepareListener(androidx.media3.exoplayer.source.ads.AdsMediaSource.this.new AdPrepareListener((androidx.media3.common.MediaItem) androidx.media3.common.util.Assertions.checkNotNull(this.adMediaItem)));
            }
            androidx.media3.common.Timeline timeline = this.timeline;
            if (timeline != null) {
                maskingMediaPeriod.createPeriod(new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
            }
            return maskingMediaPeriod;
        }

        public void handleSourceInfoRefresh(androidx.media3.common.Timeline timeline) {
            androidx.media3.common.util.Assertions.checkArgument(timeline.getPeriodCount() == 1);
            if (this.timeline == null) {
                java.lang.Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i = 0; i < this.activeMediaPeriods.size(); i++) {
                    androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = this.activeMediaPeriods.get(i);
                    maskingMediaPeriod.createPeriod(new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(uidOfPeriod, maskingMediaPeriod.id.windowSequenceNumber));
                }
            }
            this.timeline = timeline;
        }

        public long getDurationUs() {
            androidx.media3.common.Timeline timeline = this.timeline;
            return timeline == null ? androidx.media3.common.C.TIME_UNSET : timeline.getPeriod(0, androidx.media3.exoplayer.source.ads.AdsMediaSource.this.period).getDurationUs();
        }

        public void releaseMediaPeriod(androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod) {
            this.activeMediaPeriods.remove(maskingMediaPeriod);
            maskingMediaPeriod.releasePeriod();
        }

        public void release() {
            if (hasMediaSource()) {
                androidx.media3.exoplayer.source.ads.AdsMediaSource.this.releaseChildSource(this.id);
            }
        }

        public boolean hasMediaSource() {
            return this.adMediaSource != null;
        }

        public boolean isInactive() {
            return this.activeMediaPeriods.isEmpty();
        }
    }
}
