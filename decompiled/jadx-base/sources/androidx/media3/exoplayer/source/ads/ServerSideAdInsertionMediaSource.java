package androidx.media3.exoplayer.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ServerSideAdInsertionMediaSource extends androidx.media3.exoplayer.source.BaseMediaSource implements androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller, androidx.media3.exoplayer.source.MediaSourceEventListener, androidx.media3.exoplayer.drm.DrmSessionEventListener {
    private final androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.AdPlaybackStateUpdater adPlaybackStateUpdater;
    private androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod lastUsedMediaPeriod;
    private final androidx.media3.exoplayer.source.MediaSource mediaSource;
    private android.os.Handler playbackHandler;
    private final com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod> mediaPeriods = com.google.common.collect.ArrayListMultimap.create();
    private com.google.common.collect.ImmutableMap<java.lang.Object, androidx.media3.common.AdPlaybackState> adPlaybackStates = com.google.common.collect.ImmutableMap.of();
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcherWithoutId = createEventDispatcher(null);
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcherWithoutId = createDrmEventDispatcher(null);

    public interface AdPlaybackStateUpdater {
        boolean onAdPlaybackStateUpdateRequested(androidx.media3.common.Timeline timeline);
    }

    public ServerSideAdInsertionMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.AdPlaybackStateUpdater adPlaybackStateUpdater) {
        this.mediaSource = mediaSource;
        this.adPlaybackStateUpdater = adPlaybackStateUpdater;
    }

    public void setAdPlaybackStates(final com.google.common.collect.ImmutableMap<java.lang.Object, androidx.media3.common.AdPlaybackState> immutableMap, final androidx.media3.common.Timeline timeline) {
        androidx.media3.common.util.Assertions.checkArgument(!immutableMap.isEmpty());
        java.lang.Object objCheckNotNull = androidx.media3.common.util.Assertions.checkNotNull(immutableMap.values().asList().get(0).adsId);
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<java.lang.Object, androidx.media3.common.AdPlaybackState>> it = immutableMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.Object, androidx.media3.common.AdPlaybackState> next = it.next();
            java.lang.Object key = next.getKey();
            androidx.media3.common.AdPlaybackState value = next.getValue();
            androidx.media3.common.util.Assertions.checkArgument(androidx.media3.common.util.Util.areEqual(objCheckNotNull, value.adsId));
            androidx.media3.common.AdPlaybackState adPlaybackState = this.adPlaybackStates.get(key);
            if (adPlaybackState != null) {
                for (int i = value.removedAdGroupCount; i < value.adGroupCount; i++) {
                    androidx.media3.common.AdPlaybackState.AdGroup adGroup = value.getAdGroup(i);
                    androidx.media3.common.util.Assertions.checkArgument(adGroup.isServerSideInserted);
                    if (i < adPlaybackState.adGroupCount && androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getAdCountInGroup(value, i) < androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState, i)) {
                        androidx.media3.common.AdPlaybackState.AdGroup adGroup2 = value.getAdGroup(i + 1);
                        androidx.media3.common.util.Assertions.checkArgument(adGroup.contentResumeOffsetUs + adGroup2.contentResumeOffsetUs == adPlaybackState.getAdGroup(i).contentResumeOffsetUs);
                        androidx.media3.common.util.Assertions.checkArgument(adGroup.timeUs + adGroup.contentResumeOffsetUs == adGroup2.timeUs);
                    }
                    if (adGroup.timeUs == Long.MIN_VALUE) {
                        androidx.media3.common.util.Assertions.checkArgument(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getAdCountInGroup(value, i) == 0);
                    }
                }
            }
        }
        synchronized (this) {
            android.os.Handler handler = this.playbackHandler;
            if (handler == null) {
                this.adPlaybackStates = immutableMap;
            } else {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m196x8b1696bf(immutableMap, timeline);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setAdPlaybackStates$0$androidx-media3-exoplayer-source-ads-ServerSideAdInsertionMediaSource, reason: not valid java name */
    /* synthetic */ void m196x8b1696bf(com.google.common.collect.ImmutableMap immutableMap, androidx.media3.common.Timeline timeline) {
        androidx.media3.common.AdPlaybackState adPlaybackState;
        for (androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod : this.mediaPeriods.values()) {
            androidx.media3.common.AdPlaybackState adPlaybackState2 = (androidx.media3.common.AdPlaybackState) immutableMap.get(sharedMediaPeriod.periodUid);
            if (adPlaybackState2 != null) {
                sharedMediaPeriod.updateAdPlaybackState(adPlaybackState2);
            }
        }
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod2 = this.lastUsedMediaPeriod;
        if (sharedMediaPeriod2 != null && (adPlaybackState = (androidx.media3.common.AdPlaybackState) immutableMap.get(sharedMediaPeriod2.periodUid)) != null) {
            this.lastUsedMediaPeriod.updateAdPlaybackState(adPlaybackState);
        }
        this.adPlaybackStates = immutableMap;
        refreshSourceInfo(new androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.ServerSideAdInsertionTimeline(timeline, immutableMap));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.common.MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        return this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.mediaSource.updateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        android.os.Handler handlerCreateHandlerForCurrentLooper = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
        synchronized (this) {
            this.playbackHandler = handlerCreateHandlerForCurrentLooper;
        }
        this.mediaSource.addEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.mediaSource.addDrmEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.mediaSource.prepareSource(this, transferListener, getPlayerId());
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
        this.mediaSource.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void enableInternal() {
        this.mediaSource.enable(this);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void disableInternal() {
        releaseLastUsedMediaPeriod();
        this.mediaSource.disable(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
    public void onSourceInfoRefreshed(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.AdPlaybackStateUpdater adPlaybackStateUpdater = this.adPlaybackStateUpdater;
        if ((adPlaybackStateUpdater == null || !adPlaybackStateUpdater.onAdPlaybackStateUpdateRequested(timeline)) && !this.adPlaybackStates.isEmpty()) {
            refreshSourceInfo(new androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.ServerSideAdInsertionTimeline(timeline, this.adPlaybackStates));
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        releaseLastUsedMediaPeriod();
        synchronized (this) {
            this.playbackHandler = null;
        }
        this.mediaSource.releaseSource(this);
        this.mediaSource.removeEventListener(this);
        this.mediaSource.removeDrmEventListener(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod;
        android.util.Pair<java.lang.Long, java.lang.Object> pair = new android.util.Pair<>(java.lang.Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid);
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod2 = this.lastUsedMediaPeriod;
        boolean z = false;
        if (sharedMediaPeriod2 != null) {
            if (sharedMediaPeriod2.periodUid.equals(mediaPeriodId.periodUid)) {
                sharedMediaPeriod = this.lastUsedMediaPeriod;
                this.mediaPeriods.put(pair, sharedMediaPeriod);
                z = true;
            } else {
                this.lastUsedMediaPeriod.release(this.mediaSource);
                sharedMediaPeriod = null;
            }
            this.lastUsedMediaPeriod = null;
        } else {
            sharedMediaPeriod = null;
        }
        if (sharedMediaPeriod == null && ((sharedMediaPeriod = (androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod) com.google.common.collect.Iterables.getLast(this.mediaPeriods.get(pair), null)) == null || !sharedMediaPeriod.canReuseMediaPeriod(mediaPeriodId, j))) {
            androidx.media3.common.AdPlaybackState adPlaybackState = (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodId.periodUid));
            androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod3 = new androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod(this.mediaSource.createPeriod(new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(mediaPeriodId.periodUid, mediaPeriodId.windowSequenceNumber), allocator, androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodId, adPlaybackState)), mediaPeriodId.periodUid, adPlaybackState);
            this.mediaPeriods.put(pair, sharedMediaPeriod3);
            sharedMediaPeriod = sharedMediaPeriod3;
        }
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = new androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl(sharedMediaPeriod, mediaPeriodId, createEventDispatcher(mediaPeriodId), createDrmEventDispatcher(mediaPeriodId));
        sharedMediaPeriod.add(mediaPeriodImpl);
        if (z && sharedMediaPeriod.trackSelections.length > 0) {
            mediaPeriodImpl.seekToUs(j);
        }
        return mediaPeriodImpl;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = (androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) mediaPeriod;
        mediaPeriodImpl.sharedPeriod.remove(mediaPeriodImpl);
        if (mediaPeriodImpl.sharedPeriod.isUnused()) {
            this.mediaPeriods.remove(new android.util.Pair(java.lang.Long.valueOf(mediaPeriodImpl.mediaPeriodId.windowSequenceNumber), mediaPeriodImpl.mediaPeriodId.periodUid), mediaPeriodImpl.sharedPeriod);
            if (this.mediaPeriods.isEmpty()) {
                this.lastUsedMediaPeriod = mediaPeriodImpl.sharedPeriod;
            } else {
                mediaPeriodImpl.sharedPeriod.release(this.mediaSource);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmSessionAcquired(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, true);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionAcquired(i2);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionAcquired(i2);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysLoaded();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysLoaded();
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmSessionManagerError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionManagerError(exc);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionManagerError(exc);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysRestored(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRestored();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysRestored();
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysRemoved(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRemoved();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysRemoved();
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmSessionReleased(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionReleased();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionReleased();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadStarted(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadStarted(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onLoadStarted(loadEventInfo, mediaLoadData);
            mediaPeriodForEvent.mediaSourceEventDispatcher.loadStarted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadCompleted(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCompleted(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
            mediaPeriodForEvent.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadCanceled(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCanceled(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
            mediaPeriodForEvent.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadError(loadEventInfo, mediaLoadData, iOException, z);
            return;
        }
        if (z) {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
        }
        mediaPeriodForEvent.mediaSourceEventDispatcher.loadError(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))), iOException, z);
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onUpstreamDiscarded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.upstreamDiscarded(mediaLoadData);
        } else {
            mediaPeriodForEvent.mediaSourceEventDispatcher.upstreamDiscarded(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onDownstreamFormatChanged(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.downstreamFormatChanged(mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onDownstreamFormatChanged(mediaPeriodForEvent, mediaLoadData);
            mediaPeriodForEvent.mediaSourceEventDispatcher.downstreamFormatChanged(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    private void releaseLastUsedMediaPeriod() {
        androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod = this.lastUsedMediaPeriod;
        if (sharedMediaPeriod != null) {
            sharedMediaPeriod.release(this.mediaSource);
            this.lastUsedMediaPeriod = null;
        }
    }

    private androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl getMediaPeriodForEvent(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, boolean z) {
        if (mediaPeriodId == null) {
            return null;
        }
        java.util.List<androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod> list = this.mediaPeriods.get(new android.util.Pair<>(java.lang.Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid));
        if (list.isEmpty()) {
            return null;
        }
        if (z) {
            androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod = (androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod) com.google.common.collect.Iterables.getLast(list);
            return sharedMediaPeriod.loadingPeriod != null ? sharedMediaPeriod.loadingPeriod : (androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) com.google.common.collect.Iterables.getLast(sharedMediaPeriod.mediaPeriods);
        }
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = list.get(i).getMediaPeriodForEvent(mediaLoadData);
            if (mediaPeriodForEvent != null) {
                return mediaPeriodForEvent;
            }
        }
        return (androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) list.get(0).mediaPeriods.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getMediaPeriodEndPositionUs(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, androidx.media3.common.AdPlaybackState adPlaybackState) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.mediaPeriodId;
        if (mediaPeriodId.isAd()) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex);
            if (adGroup.count == -1) {
                return 0L;
            }
            return adGroup.durationsUs[mediaPeriodId.adIndexInAdGroup];
        }
        if (mediaPeriodId.nextAdGroupIndex == -1) {
            return Long.MAX_VALUE;
        }
        androidx.media3.common.AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(mediaPeriodId.nextAdGroupIndex);
        if (adGroup2.timeUs == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return adGroup2.timeUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.source.MediaLoadData correctMediaLoadData(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, androidx.media3.common.AdPlaybackState adPlaybackState) {
        return new androidx.media3.exoplayer.source.MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, correctMediaLoadDataPositionMs(mediaLoadData.mediaStartTimeMs, mediaPeriodImpl, adPlaybackState), correctMediaLoadDataPositionMs(mediaLoadData.mediaEndTimeMs, mediaPeriodImpl, adPlaybackState));
    }

    private static long correctMediaLoadDataPositionMs(long j, androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, androidx.media3.common.AdPlaybackState adPlaybackState) {
        long mediaPeriodPositionUsForContent;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long jMsToUs = androidx.media3.common.util.Util.msToUs(j);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.mediaPeriodId;
        if (mediaPeriodId.isAd()) {
            mediaPeriodPositionUsForContent = androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForAd(jMsToUs, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        } else {
            mediaPeriodPositionUsForContent = androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(jMsToUs, -1, adPlaybackState);
        }
        return androidx.media3.common.util.Util.usToMs(mediaPeriodPositionUsForContent);
    }

    private static final class SharedMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod.Callback {
        private final androidx.media3.exoplayer.source.MediaPeriod actualMediaPeriod;
        private androidx.media3.common.AdPlaybackState adPlaybackState;
        private boolean hasStartedPreparing;
        private boolean isPrepared;
        private androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl loadingPeriod;
        private final java.lang.Object periodUid;
        private final java.util.List<androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl> mediaPeriods = new java.util.ArrayList();
        private final java.util.Map<java.lang.Long, android.util.Pair<androidx.media3.exoplayer.source.LoadEventInfo, androidx.media3.exoplayer.source.MediaLoadData>> activeLoads = new java.util.HashMap();
        public androidx.media3.exoplayer.trackselection.ExoTrackSelection[] trackSelections = new androidx.media3.exoplayer.trackselection.ExoTrackSelection[0];
        public androidx.media3.exoplayer.source.SampleStream[] sampleStreams = new androidx.media3.exoplayer.source.SampleStream[0];
        public androidx.media3.exoplayer.source.MediaLoadData[] lastDownstreamFormatChangeData = new androidx.media3.exoplayer.source.MediaLoadData[0];

        public SharedMediaPeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod, java.lang.Object obj, androidx.media3.common.AdPlaybackState adPlaybackState) {
            this.actualMediaPeriod = mediaPeriod;
            this.periodUid = obj;
            this.adPlaybackState = adPlaybackState;
        }

        public void updateAdPlaybackState(androidx.media3.common.AdPlaybackState adPlaybackState) {
            this.adPlaybackState = adPlaybackState;
        }

        public void add(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            this.mediaPeriods.add(mediaPeriodImpl);
        }

        public void remove(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            if (mediaPeriodImpl.equals(this.loadingPeriod)) {
                this.loadingPeriod = null;
                this.activeLoads.clear();
            }
            this.mediaPeriods.remove(mediaPeriodImpl);
        }

        public boolean isUnused() {
            return this.mediaPeriods.isEmpty();
        }

        public void release(androidx.media3.exoplayer.source.MediaSource mediaSource) {
            mediaSource.releasePeriod(this.actualMediaPeriod);
        }

        public boolean canReuseMediaPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
            androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = (androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) com.google.common.collect.Iterables.getLast(this.mediaPeriods);
            return androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodId, this.adPlaybackState) == androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(mediaPeriodImpl, this.adPlaybackState), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl getMediaPeriodForEvent(androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (mediaLoadData == null || mediaLoadData.mediaStartTimeMs == androidx.media3.common.C.TIME_UNSET) {
                return null;
            }
            for (int i = 0; i < this.mediaPeriods.size(); i++) {
                androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = this.mediaPeriods.get(i);
                if (mediaPeriodImpl.isPrepared) {
                    long mediaPeriodPositionUs = androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(androidx.media3.common.util.Util.msToUs(mediaLoadData.mediaStartTimeMs), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
                    long mediaPeriodEndPositionUs = androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(mediaPeriodImpl, this.adPlaybackState);
                    if (mediaPeriodPositionUs >= 0 && mediaPeriodPositionUs < mediaPeriodEndPositionUs) {
                        return mediaPeriodImpl;
                    }
                }
            }
            return null;
        }

        public void prepare(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            mediaPeriodImpl.lastStartPositionUs = j;
            if (this.hasStartedPreparing) {
                if (this.isPrepared) {
                    mediaPeriodImpl.onPrepared();
                }
            } else {
                this.hasStartedPreparing = true;
                this.actualMediaPeriod.prepare(this, androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState));
            }
        }

        public void maybeThrowPrepareError() throws java.io.IOException {
            this.actualMediaPeriod.maybeThrowPrepareError();
        }

        public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
            return this.actualMediaPeriod.getTrackGroups();
        }

        public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
            return this.actualMediaPeriod.getStreamKeys(list);
        }

        public boolean continueLoading(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, androidx.media3.exoplayer.LoadingInfo loadingInfo) {
            androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl2 = this.loadingPeriod;
            if (mediaPeriodImpl2 != null && !mediaPeriodImpl.equals(mediaPeriodImpl2)) {
                for (android.util.Pair<androidx.media3.exoplayer.source.LoadEventInfo, androidx.media3.exoplayer.source.MediaLoadData> pair : this.activeLoads.values()) {
                    mediaPeriodImpl2.mediaSourceEventDispatcher.loadCompleted((androidx.media3.exoplayer.source.LoadEventInfo) pair.first, androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl2, (androidx.media3.exoplayer.source.MediaLoadData) pair.second, this.adPlaybackState));
                    mediaPeriodImpl.mediaSourceEventDispatcher.loadStarted((androidx.media3.exoplayer.source.LoadEventInfo) pair.first, androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl, (androidx.media3.exoplayer.source.MediaLoadData) pair.second, this.adPlaybackState));
                }
            }
            this.loadingPeriod = mediaPeriodImpl;
            return this.actualMediaPeriod.continueLoading(loadingInfo.buildUpon().setPlaybackPositionUs(getStreamPositionUsWithNotYetStartedHandling(mediaPeriodImpl, loadingInfo.playbackPositionUs)).build());
        }

        public boolean isLoading(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            return mediaPeriodImpl.equals(this.loadingPeriod) && this.actualMediaPeriod.isLoading();
        }

        public long getBufferedPositionUs(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, this.actualMediaPeriod.getBufferedPositionUs());
        }

        public long getNextLoadPositionUs(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, this.actualMediaPeriod.getNextLoadPositionUs());
        }

        public long seekToUs(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            return androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.actualMediaPeriod.seekToUs(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState)), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public long getAdjustedSeekPositionUs(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
            return androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.actualMediaPeriod.getAdjustedSeekPositionUs(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState), seekParameters), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public void discardBuffer(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j, boolean z) {
            this.actualMediaPeriod.discardBuffer(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState), z);
        }

        public void reevaluateBuffer(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            this.actualMediaPeriod.reevaluateBuffer(getStreamPositionUsWithNotYetStartedHandling(mediaPeriodImpl, j));
        }

        public long readDiscontinuity(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            if (!mediaPeriodImpl.equals(this.mediaPeriods.get(0))) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            long discontinuity = this.actualMediaPeriod.readDiscontinuity();
            return discontinuity == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.C.TIME_UNSET : androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(discontinuity, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public long selectTracks(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            androidx.media3.exoplayer.source.SampleStream emptySampleStream;
            androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr2;
            mediaPeriodImpl.lastStartPositionUs = j;
            if (mediaPeriodImpl.equals(this.mediaPeriods.get(0))) {
                this.trackSelections = (androidx.media3.exoplayer.trackselection.ExoTrackSelection[]) java.util.Arrays.copyOf(exoTrackSelectionArr, exoTrackSelectionArr.length);
                long streamPositionUs = androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
                androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr3 = this.sampleStreams;
                if (sampleStreamArr3.length == 0) {
                    sampleStreamArr2 = new androidx.media3.exoplayer.source.SampleStream[exoTrackSelectionArr.length];
                } else {
                    sampleStreamArr2 = (androidx.media3.exoplayer.source.SampleStream[]) java.util.Arrays.copyOf(sampleStreamArr3, sampleStreamArr3.length);
                }
                androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr4 = sampleStreamArr2;
                long jSelectTracks = this.actualMediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr4, zArr2, streamPositionUs);
                this.sampleStreams = (androidx.media3.exoplayer.source.SampleStream[]) java.util.Arrays.copyOf(sampleStreamArr4, sampleStreamArr4.length);
                this.lastDownstreamFormatChangeData = (androidx.media3.exoplayer.source.MediaLoadData[]) java.util.Arrays.copyOf(this.lastDownstreamFormatChangeData, sampleStreamArr4.length);
                for (int i = 0; i < sampleStreamArr4.length; i++) {
                    if (sampleStreamArr4[i] == null) {
                        sampleStreamArr[i] = null;
                        this.lastDownstreamFormatChangeData[i] = null;
                    } else if (sampleStreamArr[i] == null || zArr2[i]) {
                        sampleStreamArr[i] = new androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SampleStreamImpl(mediaPeriodImpl, i);
                        this.lastDownstreamFormatChangeData[i] = null;
                    }
                }
                return androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(jSelectTracks, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            }
            for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
                androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
                boolean z = true;
                if (exoTrackSelection != null) {
                    if (zArr[i2] && sampleStreamArr[i2] != null) {
                        z = false;
                    }
                    zArr2[i2] = z;
                    if (z) {
                        if (androidx.media3.common.util.Util.areEqual(this.trackSelections[i2], exoTrackSelection)) {
                            emptySampleStream = new androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SampleStreamImpl(mediaPeriodImpl, i2);
                        } else {
                            emptySampleStream = new androidx.media3.exoplayer.source.EmptySampleStream();
                        }
                        sampleStreamArr[i2] = emptySampleStream;
                    }
                } else {
                    sampleStreamArr[i2] = null;
                    zArr2[i2] = true;
                }
            }
            return j;
        }

        public int readData(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, int i, androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i2) {
            long bufferedPositionUs = getBufferedPositionUs(mediaPeriodImpl);
            int data = ((androidx.media3.exoplayer.source.SampleStream) androidx.media3.common.util.Util.castNonNull(this.sampleStreams[i])).readData(formatHolder, decoderInputBuffer, i2 | 1 | 4);
            long mediaPeriodPositionUsWithEndOfSourceHandling = getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, decoderInputBuffer.timeUs);
            if ((data == -4 && mediaPeriodPositionUsWithEndOfSourceHandling == Long.MIN_VALUE) || (data == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys)) {
                maybeNotifyDownstreamFormatChanged(mediaPeriodImpl, i);
                decoderInputBuffer.clear();
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if (data == -4) {
                maybeNotifyDownstreamFormatChanged(mediaPeriodImpl, i);
                ((androidx.media3.exoplayer.source.SampleStream) androidx.media3.common.util.Util.castNonNull(this.sampleStreams[i])).readData(formatHolder, decoderInputBuffer, i2);
                decoderInputBuffer.timeUs = mediaPeriodPositionUsWithEndOfSourceHandling;
            }
            return data;
        }

        public int skipData(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, int i, long j) {
            return ((androidx.media3.exoplayer.source.SampleStream) androidx.media3.common.util.Util.castNonNull(this.sampleStreams[i])).skipData(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState));
        }

        public boolean isReady(int i) {
            return ((androidx.media3.exoplayer.source.SampleStream) androidx.media3.common.util.Util.castNonNull(this.sampleStreams[i])).isReady();
        }

        public void maybeThrowError(int i) throws java.io.IOException {
            ((androidx.media3.exoplayer.source.SampleStream) androidx.media3.common.util.Util.castNonNull(this.sampleStreams[i])).maybeThrowError();
        }

        public void onDownstreamFormatChanged(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            int iFindMatchingStreamIndex = findMatchingStreamIndex(mediaLoadData);
            if (iFindMatchingStreamIndex != -1) {
                this.lastDownstreamFormatChangeData[iFindMatchingStreamIndex] = mediaLoadData;
                mediaPeriodImpl.hasNotifiedDownstreamFormatChange[iFindMatchingStreamIndex] = true;
            }
        }

        public void onLoadStarted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            this.activeLoads.put(java.lang.Long.valueOf(loadEventInfo.loadTaskId), android.util.Pair.create(loadEventInfo, mediaLoadData));
        }

        public void onLoadFinished(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo) {
            this.activeLoads.remove(java.lang.Long.valueOf(loadEventInfo.loadTaskId));
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            this.isPrepared = true;
            for (int i = 0; i < this.mediaPeriods.size(); i++) {
                this.mediaPeriods.get(i).onPrepared();
            }
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = this.loadingPeriod;
            if (mediaPeriodImpl == null) {
                return;
            }
            ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(mediaPeriodImpl.callback)).onContinueLoadingRequested(this.loadingPeriod);
        }

        private long getStreamPositionUsWithNotYetStartedHandling(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            if (j < mediaPeriodImpl.lastStartPositionUs) {
                return androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(mediaPeriodImpl.lastStartPositionUs, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState) - (mediaPeriodImpl.lastStartPositionUs - j);
            }
            return androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        private long getMediaPeriodPositionUsWithEndOfSourceHandling(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            if (j == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long mediaPeriodPositionUs = androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            if (mediaPeriodPositionUs >= androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(mediaPeriodImpl, this.adPlaybackState)) {
                return Long.MIN_VALUE;
            }
            return mediaPeriodPositionUs;
        }

        private int findMatchingStreamIndex(androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (mediaLoadData.trackFormat == null) {
                return -1;
            }
            int i = 0;
            while (true) {
                androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr = this.trackSelections;
                if (i >= exoTrackSelectionArr.length) {
                    return -1;
                }
                androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
                if (exoTrackSelection != null) {
                    androidx.media3.common.TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                    boolean z = mediaLoadData.trackType == 0 && trackGroup.equals(getTrackGroups().get(0));
                    for (int i2 = 0; i2 < trackGroup.length; i2++) {
                        androidx.media3.common.Format format = trackGroup.getFormat(i2);
                        if (format.equals(mediaLoadData.trackFormat) || (z && format.id != null && format.id.equals(mediaLoadData.trackFormat.id))) {
                            return i;
                        }
                    }
                }
                i++;
            }
        }

        private void maybeNotifyDownstreamFormatChanged(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, int i) {
            if (mediaPeriodImpl.hasNotifiedDownstreamFormatChange[i] || this.lastDownstreamFormatChangeData[i] == null) {
                return;
            }
            mediaPeriodImpl.hasNotifiedDownstreamFormatChange[i] = true;
            mediaPeriodImpl.mediaSourceEventDispatcher.downstreamFormatChanged(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl, this.lastDownstreamFormatChangeData[i], this.adPlaybackState));
        }
    }

    private static final class ServerSideAdInsertionTimeline extends androidx.media3.exoplayer.source.ForwardingTimeline {
        private final com.google.common.collect.ImmutableMap<java.lang.Object, androidx.media3.common.AdPlaybackState> adPlaybackStates;

        public ServerSideAdInsertionTimeline(androidx.media3.common.Timeline timeline, com.google.common.collect.ImmutableMap<java.lang.Object, androidx.media3.common.AdPlaybackState> immutableMap) {
            super(timeline);
            androidx.media3.common.util.Assertions.checkState(timeline.getWindowCount() == 1);
            androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
            for (int i = 0; i < timeline.getPeriodCount(); i++) {
                timeline.getPeriod(i, period, true);
                androidx.media3.common.util.Assertions.checkState(immutableMap.containsKey(androidx.media3.common.util.Assertions.checkNotNull(period.uid)));
            }
            this.adPlaybackStates = immutableMap;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
            super.getWindow(i, window, j);
            androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
            androidx.media3.common.AdPlaybackState adPlaybackState = (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(androidx.media3.common.util.Assertions.checkNotNull(getPeriod(window.firstPeriodIndex, period, true).uid)));
            long mediaPeriodPositionUsForContent = androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.positionInFirstPeriodUs, -1, adPlaybackState);
            if (window.durationUs != androidx.media3.common.C.TIME_UNSET) {
                androidx.media3.common.Timeline.Period period2 = super.getPeriod(window.lastPeriodIndex, period, true);
                long j2 = period2.positionInWindowUs;
                androidx.media3.common.AdPlaybackState adPlaybackState2 = (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(period2.uid));
                androidx.media3.common.Timeline.Period period3 = getPeriod(window.lastPeriodIndex, period);
                window.durationUs = period3.positionInWindowUs + androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.durationUs - j2, -1, adPlaybackState2);
            } else if (adPlaybackState.contentDurationUs != androidx.media3.common.C.TIME_UNSET) {
                window.durationUs = adPlaybackState.contentDurationUs - mediaPeriodPositionUsForContent;
            }
            window.positionInFirstPeriodUs = mediaPeriodPositionUsForContent;
            return window;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
            long mediaPeriodPositionUsForContent;
            super.getPeriod(i, period, true);
            androidx.media3.common.AdPlaybackState adPlaybackState = (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(period.uid));
            long j = period.durationUs;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                mediaPeriodPositionUsForContent = adPlaybackState.contentDurationUs;
            } else {
                mediaPeriodPositionUsForContent = androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(j, -1, adPlaybackState);
            }
            long j2 = mediaPeriodPositionUsForContent;
            androidx.media3.common.Timeline.Period period2 = new androidx.media3.common.Timeline.Period();
            long mediaPeriodPositionUsForContent2 = 0;
            for (int i2 = 0; i2 < i + 1; i2++) {
                this.timeline.getPeriod(i2, period2, true);
                androidx.media3.common.AdPlaybackState adPlaybackState2 = (androidx.media3.common.AdPlaybackState) androidx.media3.common.util.Assertions.checkNotNull(this.adPlaybackStates.get(period2.uid));
                if (i2 == 0) {
                    mediaPeriodPositionUsForContent2 = -androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(-period2.getPositionInWindowUs(), -1, adPlaybackState2);
                }
                if (i2 != i) {
                    mediaPeriodPositionUsForContent2 += androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(period2.durationUs, -1, adPlaybackState2);
                }
            }
            period.set(period.id, period.uid, period.windowIndex, j2, mediaPeriodPositionUsForContent2, adPlaybackState, period.isPlaceholder);
            return period;
        }
    }

    private static final class MediaPeriodImpl implements androidx.media3.exoplayer.source.MediaPeriod {
        public androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
        public final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        public boolean[] hasNotifiedDownstreamFormatChange = new boolean[0];
        public boolean isPrepared;
        public long lastStartPositionUs;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
        public final androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedPeriod;

        public MediaPeriodImpl(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher2) {
            this.sharedPeriod = sharedMediaPeriod;
            this.mediaPeriodId = mediaPeriodId;
            this.mediaSourceEventDispatcher = eventDispatcher;
            this.drmEventDispatcher = eventDispatcher2;
        }

        public void onPrepared() {
            androidx.media3.exoplayer.source.MediaPeriod.Callback callback = this.callback;
            if (callback != null) {
                callback.onPrepared(this);
            }
            this.isPrepared = true;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
            this.callback = callback;
            this.sharedPeriod.prepare(this, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() throws java.io.IOException {
            this.sharedPeriod.maybeThrowPrepareError();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
            return this.sharedPeriod.getTrackGroups();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
            return this.sharedPeriod.getStreamKeys(list);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            if (this.hasNotifiedDownstreamFormatChange.length == 0) {
                this.hasNotifiedDownstreamFormatChange = new boolean[sampleStreamArr.length];
            }
            return this.sharedPeriod.selectTracks(this, exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j, boolean z) {
            this.sharedPeriod.discardBuffer(this, j, z);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return this.sharedPeriod.readDiscontinuity(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j) {
            return this.sharedPeriod.seekToUs(this, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
            return this.sharedPeriod.getAdjustedSeekPositionUs(this, j, seekParameters);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.sharedPeriod.getBufferedPositionUs(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.sharedPeriod.getNextLoadPositionUs(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
            return this.sharedPeriod.continueLoading(this, loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.sharedPeriod.isLoading(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
            this.sharedPeriod.reevaluateBuffer(this, j);
        }
    }

    private static final class SampleStreamImpl implements androidx.media3.exoplayer.source.SampleStream {
        private final androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriod;
        private final int streamIndex;

        public SampleStreamImpl(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, int i) {
            this.mediaPeriod = mediaPeriodImpl;
            this.streamIndex = i;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return this.mediaPeriod.sharedPeriod.isReady(this.streamIndex);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
            this.mediaPeriod.sharedPeriod.maybeThrowError(this.streamIndex);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            return this.mediaPeriod.sharedPeriod.readData(this.mediaPeriod, this.streamIndex, formatHolder, decoderInputBuffer, i);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            return this.mediaPeriod.sharedPeriod.skipData(this.mediaPeriod, this.streamIndex, j);
        }
    }
}
