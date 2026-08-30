package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class MediaPeriodQueue {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private final androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector;
    private final androidx.media3.common.util.HandlerWrapper analyticsCollectorHandler;
    private int length;
    private androidx.media3.exoplayer.MediaPeriodHolder loading;
    private final androidx.media3.exoplayer.MediaPeriodHolder.Factory mediaPeriodHolderFactory;
    private long nextWindowSequenceNumber;
    private java.lang.Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;
    private androidx.media3.exoplayer.MediaPeriodHolder playing;
    private androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration;
    private androidx.media3.exoplayer.MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
    private final androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
    private java.util.List<androidx.media3.exoplayer.MediaPeriodHolder> preloadPriorityList = new java.util.ArrayList();

    static boolean areDurationsCompatible(long j, long j2) {
        return j == androidx.media3.common.C.TIME_UNSET || j == j2;
    }

    public MediaPeriodQueue(androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, androidx.media3.common.util.HandlerWrapper handlerWrapper, androidx.media3.exoplayer.MediaPeriodHolder.Factory factory, androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.analyticsCollector = analyticsCollector;
        this.analyticsCollectorHandler = handlerWrapper;
        this.mediaPeriodHolderFactory = factory;
        this.preloadConfiguration = preloadConfiguration;
    }

    public boolean updateRepeatMode(androidx.media3.common.Timeline timeline, int i) {
        this.repeatMode = i;
        return updateForPlaybackModeChange(timeline);
    }

    public boolean updateShuffleModeEnabled(androidx.media3.common.Timeline timeline, boolean z) {
        this.shuffleModeEnabled = z;
        return updateForPlaybackModeChange(timeline);
    }

    public void updatePreloadConfiguration(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        invalidatePreloadPool(timeline);
    }

    public boolean isLoading(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void reevaluateBuffer(long j) {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j);
        }
    }

    public boolean shouldLoadNextMediaPeriod() {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null || (!mediaPeriodHolder.info.isFinal && this.loading.isFullyBuffered() && this.loading.info.durationUs != androidx.media3.common.C.TIME_UNSET && this.length < 100);
    }

    public androidx.media3.exoplayer.MediaPeriodInfo getNextMediaPeriodInfo(long j, androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        if (this.loading == null) {
            return getFirstMediaPeriodInfo(playbackInfo);
        }
        return getFollowingMediaPeriodInfo(playbackInfo.timeline, this.loading, j);
    }

    public androidx.media3.exoplayer.MediaPeriodHolder enqueueNextMediaPeriodHolder(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo) {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.loading;
        long rendererOffset = mediaPeriodHolder == null ? INITIAL_RENDERER_POSITION_OFFSET_US : (mediaPeriodHolder.getRendererOffset() + this.loading.info.durationUs) - mediaPeriodInfo.startPositionUs;
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolderRemovePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfo);
        if (mediaPeriodHolderRemovePreloadedMediaPeriodHolder == null) {
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfo, rendererOffset);
        } else {
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder.info = mediaPeriodInfo;
            mediaPeriodHolderRemovePreloadedMediaPeriodHolder.setRendererOffset(rendererOffset);
        }
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder2 = this.loading;
        if (mediaPeriodHolder2 != null) {
            mediaPeriodHolder2.setNext(mediaPeriodHolderRemovePreloadedMediaPeriodHolder);
        } else {
            this.playing = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
            this.reading = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
        }
        this.oldFrontPeriodUid = null;
        this.loading = mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
        this.length++;
        notifyQueueUpdate();
        return mediaPeriodHolderRemovePreloadedMediaPeriodHolder;
    }

    public void invalidatePreloadPool(androidx.media3.common.Timeline timeline) {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder;
        if (this.preloadConfiguration.targetPreloadDurationUs == androidx.media3.common.C.TIME_UNSET || (mediaPeriodHolder = this.loading) == null) {
            releasePreloadPool();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Pair<java.lang.Object, java.lang.Long> defaultPeriodPositionOfNextWindow = getDefaultPeriodPositionOfNextWindow(timeline, mediaPeriodHolder.info.id.periodUid, 0L);
        if (defaultPeriodPositionOfNextWindow != null && !timeline.getWindow(timeline.getPeriodByUid(defaultPeriodPositionOfNextWindow.first, this.period).windowIndex, this.window).isLive()) {
            long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(defaultPeriodPositionOfNextWindow.first);
            if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                this.nextWindowSequenceNumber = 1 + jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            }
            androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfoForPeriodPosition = getMediaPeriodInfoForPeriodPosition(timeline, defaultPeriodPositionOfNextWindow.first, ((java.lang.Long) defaultPeriodPositionOfNextWindow.second).longValue(), jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods);
            androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolderRemovePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfoForPeriodPosition);
            if (mediaPeriodHolderRemovePreloadedMediaPeriodHolder == null) {
                mediaPeriodHolderRemovePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfoForPeriodPosition, (mediaPeriodHolder.getRendererOffset() + mediaPeriodHolder.info.durationUs) - mediaPeriodInfoForPeriodPosition.startPositionUs);
            }
            arrayList.add(mediaPeriodHolderRemovePreloadedMediaPeriodHolder);
        }
        releaseAndResetPreloadPriorityList(arrayList);
    }

    public void releasePreloadPool() {
        if (this.preloadPriorityList.isEmpty()) {
            return;
        }
        releaseAndResetPreloadPriorityList(new java.util.ArrayList());
    }

    private androidx.media3.exoplayer.MediaPeriodHolder removePreloadedMediaPeriodHolder(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            if (this.preloadPriorityList.get(i).canBeUsedForMediaPeriodInfo(mediaPeriodInfo)) {
                return this.preloadPriorityList.remove(i);
            }
        }
        return null;
    }

    private void releaseAndResetPreloadPriorityList(java.util.List<androidx.media3.exoplayer.MediaPeriodHolder> list) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            this.preloadPriorityList.get(i).release();
        }
        this.preloadPriorityList = list;
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getMediaPeriodInfoForPeriodPosition(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j, long j2) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j, j2, this.window, this.period);
        if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd()) {
            return getMediaPeriodInfoForAd(timeline, mediaPeriodIdResolveMediaPeriodIdForAds.periodUid, mediaPeriodIdResolveMediaPeriodIdForAds.adGroupIndex, mediaPeriodIdResolveMediaPeriodIdForAds.adIndexInAdGroup, j, mediaPeriodIdResolveMediaPeriodIdForAds.windowSequenceNumber);
        }
        return getMediaPeriodInfoForContent(timeline, mediaPeriodIdResolveMediaPeriodIdForAds.periodUid, j, androidx.media3.common.C.TIME_UNSET, mediaPeriodIdResolveMediaPeriodIdForAds.windowSequenceNumber);
    }

    private android.util.Pair<java.lang.Object, java.lang.Long> getDefaultPeriodPositionOfNextWindow(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j) {
        int nextWindowIndex = timeline.getNextWindowIndex(timeline.getPeriodByUid(obj, this.period).windowIndex, this.repeatMode, this.shuffleModeEnabled);
        if (nextWindowIndex != -1) {
            return timeline.getPeriodPositionUs(this.window, this.period, nextWindowIndex, androidx.media3.common.C.TIME_UNSET, j);
        }
        return null;
    }

    public androidx.media3.exoplayer.MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    public androidx.media3.exoplayer.MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    public androidx.media3.exoplayer.MediaPeriodHolder getReadingPeriod() {
        return this.reading;
    }

    public androidx.media3.exoplayer.MediaPeriodHolder advanceReadingPeriod() {
        this.reading = ((androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkStateNotNull(this.reading)).getNext();
        notifyQueueUpdate();
        return (androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkStateNotNull(this.reading);
    }

    public androidx.media3.exoplayer.MediaPeriodHolder advancePlayingPeriod() {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.reading) {
            this.reading = mediaPeriodHolder.getNext();
        }
        this.playing.release();
        int i = this.length - 1;
        this.length = i;
        if (i == 0) {
            this.loading = null;
            this.oldFrontPeriodUid = this.playing.uid;
            this.oldFrontPeriodWindowSequenceNumber = this.playing.info.id.windowSequenceNumber;
        }
        this.playing = this.playing.getNext();
        notifyQueueUpdate();
        return this.playing;
    }

    public boolean removeAfter(androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder) {
        androidx.media3.common.util.Assertions.checkStateNotNull(mediaPeriodHolder);
        boolean z = false;
        if (mediaPeriodHolder.equals(this.loading)) {
            return false;
        }
        this.loading = mediaPeriodHolder;
        while (mediaPeriodHolder.getNext() != null) {
            mediaPeriodHolder = (androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkNotNull(mediaPeriodHolder.getNext());
            if (mediaPeriodHolder == this.reading) {
                this.reading = this.playing;
                z = true;
            }
            mediaPeriodHolder.release();
            this.length--;
        }
        ((androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkNotNull(this.loading)).setNext(null);
        notifyQueueUpdate();
        return z;
    }

    public void clear() {
        if (this.length == 0) {
            return;
        }
        androidx.media3.exoplayer.MediaPeriodHolder next = (androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkStateNotNull(this.playing);
        this.oldFrontPeriodUid = next.uid;
        this.oldFrontPeriodWindowSequenceNumber = next.info.id.windowSequenceNumber;
        while (next != null) {
            next.release();
            next = next.getNext();
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.length = 0;
        notifyQueueUpdate();
    }

    public boolean updateQueuedPeriods(androidx.media3.common.Timeline timeline, long j, long j2) {
        androidx.media3.exoplayer.MediaPeriodInfo updatedMediaPeriodInfo;
        androidx.media3.exoplayer.MediaPeriodHolder next = this.playing;
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = null;
        while (next != null) {
            androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = next.info;
            if (mediaPeriodHolder == null) {
                updatedMediaPeriodInfo = getUpdatedMediaPeriodInfo(timeline, mediaPeriodInfo);
            } else {
                androidx.media3.exoplayer.MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(timeline, mediaPeriodHolder, j);
                if (followingMediaPeriodInfo == null) {
                    return !removeAfter(mediaPeriodHolder);
                }
                if (!canKeepMediaPeriodHolder(mediaPeriodInfo, followingMediaPeriodInfo)) {
                    return !removeAfter(mediaPeriodHolder);
                }
                updatedMediaPeriodInfo = followingMediaPeriodInfo;
            }
            next.info = updatedMediaPeriodInfo.copyWithRequestedContentPositionUs(mediaPeriodInfo.requestedContentPositionUs);
            if (!areDurationsCompatible(mediaPeriodInfo.durationUs, updatedMediaPeriodInfo.durationUs)) {
                next.updateClipping();
                return (removeAfter(next) || (next == this.reading && !next.info.isFollowedByTransitionToSameStream && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((updatedMediaPeriodInfo.durationUs > androidx.media3.common.C.TIME_UNSET ? 1 : (updatedMediaPeriodInfo.durationUs == androidx.media3.common.C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(updatedMediaPeriodInfo.durationUs)) ? 1 : (j2 == ((updatedMediaPeriodInfo.durationUs > androidx.media3.common.C.TIME_UNSET ? 1 : (updatedMediaPeriodInfo.durationUs == androidx.media3.common.C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(updatedMediaPeriodInfo.durationUs)) ? 0 : -1)) >= 0))) ? false : true;
            }
            mediaPeriodHolder = next;
            next = next.getNext();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    public androidx.media3.exoplayer.MediaPeriodInfo getUpdatedMediaPeriodInfo(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo) {
        long durationUs;
        long j;
        boolean zIsServerSideInsertedAdGroup;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, zIsLastInPeriod);
        timeline.getPeriodByUid(mediaPeriodInfo.id.periodUid, this.period);
        long adGroupTimeUs = (mediaPeriodId.isAd() || mediaPeriodId.nextAdGroupIndex == -1) ? -9223372036854775807L : this.period.getAdGroupTimeUs(mediaPeriodId.nextAdGroupIndex);
        if (mediaPeriodId.isAd()) {
            durationUs = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        } else {
            if (adGroupTimeUs == androidx.media3.common.C.TIME_UNSET || adGroupTimeUs == Long.MIN_VALUE) {
                durationUs = this.period.getDurationUs();
            } else {
                j = adGroupTimeUs;
            }
            if (mediaPeriodId.isAd()) {
                zIsServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
            } else if (mediaPeriodId.nextAdGroupIndex == -1 && this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex)) {
                zIsServerSideInsertedAdGroup = true;
            } else {
                zIsServerSideInsertedAdGroup = false;
            }
            return new androidx.media3.exoplayer.MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs, adGroupTimeUs, j, zIsServerSideInsertedAdGroup, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
        }
        j = durationUs;
        if (mediaPeriodId.isAd()) {
            zIsServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        } else if (mediaPeriodId.nextAdGroupIndex == -1) {
            zIsServerSideInsertedAdGroup = false;
        } else {
            zIsServerSideInsertedAdGroup = false;
        }
        return new androidx.media3.exoplayer.MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs, adGroupTimeUs, j, zIsServerSideInsertedAdGroup, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
    }

    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j) {
        return resolveMediaPeriodIdForAds(timeline, obj, j, resolvePeriodUidToWindowSequenceNumber(timeline, obj), this.window, this.period);
    }

    private static androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j, long j2, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        java.lang.Object objCheckNotNull = obj;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); isSkippableAdPeriod(period) && indexOfPeriod <= window.lastPeriodIndex; indexOfPeriod++) {
            timeline.getPeriod(indexOfPeriod, period, true);
            objCheckNotNull = androidx.media3.common.util.Assertions.checkNotNull(period.uid);
        }
        timeline.getPeriodByUid(objCheckNotNull, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j);
        if (adGroupIndexForPositionUs == -1) {
            return new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(objCheckNotNull, j2, period.getAdGroupIndexAfterPositionUs(j));
        }
        return new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(objCheckNotNull, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j2);
    }

    private static boolean isSkippableAdPeriod(androidx.media3.common.Timeline.Period period) {
        int adGroupCount = period.getAdGroupCount();
        if (adGroupCount == 0) {
            return false;
        }
        if ((adGroupCount == 1 && period.isLivePostrollPlaceholder(0)) || !period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount())) {
            return false;
        }
        long contentResumeOffsetUs = 0;
        if (period.getAdGroupIndexForPositionUs(0L) != -1) {
            return false;
        }
        if (period.durationUs == 0) {
            return true;
        }
        int i = adGroupCount - (period.isLivePostrollPlaceholder(adGroupCount + (-1)) ? 2 : 1);
        for (int i2 = 0; i2 <= i; i2++) {
            contentResumeOffsetUs += period.getContentResumeOffsetUs(i2);
        }
        return period.durationUs <= contentResumeOffsetUs;
    }

    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j) {
        long jResolvePeriodUidToWindowSequenceNumber = resolvePeriodUidToWindowSequenceNumber(timeline, obj);
        timeline.getPeriodByUid(obj, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        boolean z = false;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); indexOfPeriod >= this.window.firstPeriodIndex; indexOfPeriod--) {
            timeline.getPeriod(indexOfPeriod, this.period, true);
            boolean z2 = this.period.getAdGroupCount() > 0;
            z |= z2;
            androidx.media3.common.Timeline.Period period = this.period;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj = androidx.media3.common.util.Assertions.checkNotNull(this.period.uid);
            }
            if (z && (!z2 || this.period.durationUs != 0)) {
                break;
            }
        }
        return resolveMediaPeriodIdForAds(timeline, obj, j, jResolvePeriodUidToWindowSequenceNumber, this.window, this.period);
    }

    private void notifyQueueUpdate() {
        final com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (androidx.media3.exoplayer.MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            builder.add(next.info.id);
        }
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.reading;
        final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder == null ? null : mediaPeriodHolder.info.id;
        this.analyticsCollectorHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaPeriodQueue$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m122x6b40a91a(builder, mediaPeriodId);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$notifyQueueUpdate$0$androidx-media3-exoplayer-MediaPeriodQueue, reason: not valid java name */
    /* synthetic */ void m122x6b40a91a(com.google.common.collect.ImmutableList.Builder builder, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.analyticsCollector.updateMediaPeriodQueueInfo(builder.build(), mediaPeriodId);
    }

    private long resolvePeriodUidToWindowSequenceNumber(androidx.media3.common.Timeline timeline, java.lang.Object obj) {
        int indexOfPeriod;
        int i = timeline.getPeriodByUid(obj, this.period).windowIndex;
        java.lang.Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj2)) != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (androidx.media3.exoplayer.MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            if (next.uid.equals(obj)) {
                return next.info.id.windowSequenceNumber;
            }
        }
        for (androidx.media3.exoplayer.MediaPeriodHolder next2 = this.playing; next2 != null; next2 = next2.getNext()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(next2.uid);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i) {
                return next2.info.id.windowSequenceNumber;
            }
        }
        long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj);
        if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods != -1) {
            return jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        }
        long j = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j;
        }
        return j;
    }

    private long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(java.lang.Object obj) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i);
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.id.windowSequenceNumber;
            }
        }
        return -1L;
    }

    private boolean canKeepMediaPeriodHolder(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo, androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo2) {
        return mediaPeriodInfo.startPositionUs == mediaPeriodInfo2.startPositionUs && mediaPeriodInfo.id.equals(mediaPeriodInfo2.id);
    }

    private boolean updateForPlaybackModeChange(androidx.media3.common.Timeline timeline) {
        androidx.media3.exoplayer.MediaPeriodHolder next = this.playing;
        if (next == null) {
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(next.uid);
        while (true) {
            indexOfPeriod = timeline.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (((androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkNotNull(next)).getNext() != null && !next.info.isLastInTimelinePeriod) {
                next = next.getNext();
            }
            androidx.media3.exoplayer.MediaPeriodHolder next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || timeline.getIndexOfPeriod(next2.uid) != indexOfPeriod) {
                break;
            }
            next = next2;
        }
        boolean zRemoveAfter = removeAfter(next);
        next.info = getUpdatedMediaPeriodInfo(timeline, next.info);
        return !zRemoveAfter;
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getFirstMediaPeriodInfo(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.requestedContentPositionUs, playbackInfo.positionUs);
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getFollowingMediaPeriodInfo(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder, long j) {
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        long rendererOffset = (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j;
        if (mediaPeriodInfo.isLastInTimelinePeriod) {
            return getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, rendererOffset);
        }
        return getFollowingMediaPeriodInfoOfCurrentPeriod(timeline, mediaPeriodHolder, rendererOffset);
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getFirstMediaPeriodInfoOfNextPeriod(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder, long j) {
        long j2;
        long j3;
        java.lang.Object obj;
        long j4;
        long j5;
        long jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(mediaPeriodInfo.id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i = timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
        java.lang.Object objCheckNotNull = androidx.media3.common.util.Assertions.checkNotNull(this.period.uid);
        long j6 = mediaPeriodInfo.id.windowSequenceNumber;
        if (timeline.getWindow(i, this.window).firstPeriodIndex == nextPeriodIndex) {
            android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i, androidx.media3.common.C.TIME_UNSET, java.lang.Math.max(0L, j));
            if (periodPositionUs == null) {
                return null;
            }
            java.lang.Object obj2 = periodPositionUs.first;
            long jLongValue = ((java.lang.Long) periodPositionUs.second).longValue();
            androidx.media3.exoplayer.MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (next != null && next.uid.equals(obj2)) {
                jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = next.info.id.windowSequenceNumber;
            } else {
                jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj2);
                if (jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                    jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                }
            }
            j2 = jResolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            j3 = -9223372036854775807L;
            obj = obj2;
            j4 = jLongValue;
        } else {
            j2 = j6;
            j3 = 0;
            obj = objCheckNotNull;
            j4 = 0;
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j4, j2, this.window, this.period);
        if (j3 == androidx.media3.common.C.TIME_UNSET || mediaPeriodInfo.requestedContentPositionUs == androidx.media3.common.C.TIME_UNSET) {
            j5 = j4;
        } else {
            boolean zHasServerSideInsertedAds = hasServerSideInsertedAds(mediaPeriodInfo.id.periodUid, timeline);
            if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd() && zHasServerSideInsertedAds) {
                j3 = mediaPeriodInfo.requestedContentPositionUs;
            } else if (zHasServerSideInsertedAds) {
                j5 = mediaPeriodInfo.requestedContentPositionUs;
            }
            j5 = j4;
        }
        return getMediaPeriodInfo(timeline, mediaPeriodIdResolveMediaPeriodIdForAds, j3, j5);
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getFollowingMediaPeriodInfoOfCurrentPeriod(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder, long j) {
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            int i = mediaPeriodId.adGroupIndex;
            int adCountInAdGroup = this.period.getAdCountInAdGroup(i);
            if (adCountInAdGroup == -1) {
                return null;
            }
            int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i, mediaPeriodId.adIndexInAdGroup);
            if (nextAdIndexToPlay < adCountInAdGroup) {
                return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, i, nextAdIndexToPlay, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            long jLongValue = mediaPeriodInfo.requestedContentPositionUs;
            if (jLongValue == androidx.media3.common.C.TIME_UNSET) {
                androidx.media3.common.Timeline.Window window = this.window;
                androidx.media3.common.Timeline.Period period = this.period;
                android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, period.windowIndex, androidx.media3.common.C.TIME_UNSET, java.lang.Math.max(0L, j));
                if (periodPositionUs == null) {
                    return null;
                }
                jLongValue = ((java.lang.Long) periodPositionUs.second).longValue();
            }
            return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, java.lang.Math.max(getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), jLongValue), mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        if (mediaPeriodId.nextAdGroupIndex != -1 && this.period.isLivePostrollPlaceholder(mediaPeriodId.nextAdGroupIndex)) {
            return getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, j);
        }
        int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
        boolean z = this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex) && this.period.getAdState(mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay) == 3;
        if (firstAdIndexToPlay == this.period.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex) || z) {
            return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
        }
        return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
    }

    private boolean hasServerSideInsertedAds(java.lang.Object obj, androidx.media3.common.Timeline timeline) {
        int adGroupCount = timeline.getPeriodByUid(obj, this.period).getAdGroupCount();
        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
        return adGroupCount > 0 && this.period.isServerSideInsertedAdGroup(removedAdGroupCount) && (adGroupCount > 1 || this.period.getAdGroupTimeUs(removedAdGroupCount) != Long.MIN_VALUE);
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getMediaPeriodInfo(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j, mediaPeriodId.windowSequenceNumber);
        }
        return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, j2, j, mediaPeriodId.windowSequenceNumber);
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getMediaPeriodInfoForAd(androidx.media3.common.Timeline timeline, java.lang.Object obj, int i, int i2, long j, long j2) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(obj, i, i2, j2);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = i2 == this.period.getFirstAdIndexToPlay(i) ? this.period.getAdResumePositionUs() : 0L;
        return new androidx.media3.exoplayer.MediaPeriodInfo(mediaPeriodId, (adDurationUs == androidx.media3.common.C.TIME_UNSET || adResumePositionUs < adDurationUs) ? adResumePositionUs : java.lang.Math.max(0L, adDurationUs - 1), j, androidx.media3.common.C.TIME_UNSET, adDurationUs, this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex), false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    private androidx.media3.exoplayer.MediaPeriodInfo getMediaPeriodInfoForContent(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j, long j2, long j3) {
        boolean z;
        long j4;
        long adGroupTimeUs;
        long j5;
        long jMax = j;
        timeline.getPeriodByUid(obj, this.period);
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(jMax);
        int i = 1;
        boolean z2 = adGroupIndexAfterPositionUs != -1 && this.period.isLivePostrollPlaceholder(adGroupIndexAfterPositionUs);
        if (adGroupIndexAfterPositionUs == -1) {
            if (this.period.getAdGroupCount() > 0) {
                androidx.media3.common.Timeline.Period period = this.period;
                if (period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount())) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else if (this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs) && this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs) == this.period.durationUs && this.period.hasPlayedAdGroup(adGroupIndexAfterPositionUs)) {
            z = true;
            adGroupIndexAfterPositionUs = -1;
        } else {
            z = false;
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(obj, j3, adGroupIndexAfterPositionUs);
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, zIsLastInPeriod);
        boolean z3 = (adGroupIndexAfterPositionUs == -1 || !this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs) || z2) ? false : true;
        if (adGroupIndexAfterPositionUs != -1 && !z2) {
            adGroupTimeUs = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
        } else {
            if (z) {
                adGroupTimeUs = this.period.durationUs;
            } else {
                j4 = -9223372036854775807L;
            }
            if (j4 != androidx.media3.common.C.TIME_UNSET || j4 == Long.MIN_VALUE) {
                j5 = this.period.durationUs;
            } else {
                j5 = j4;
            }
            if (j5 != androidx.media3.common.C.TIME_UNSET && jMax >= j5) {
                if (!zIsLastInTimeline && z) {
                    i = 0;
                }
                jMax = java.lang.Math.max(0L, j5 - ((long) i));
            }
            return new androidx.media3.exoplayer.MediaPeriodInfo(mediaPeriodId, jMax, j2, j4, j5, z3, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
        }
        j4 = adGroupTimeUs;
        if (j4 != androidx.media3.common.C.TIME_UNSET) {
            j5 = this.period.durationUs;
        } else {
            j5 = this.period.durationUs;
        }
        if (j5 != androidx.media3.common.C.TIME_UNSET) {
            if (!zIsLastInTimeline) {
                i = 0;
            }
            jMax = java.lang.Math.max(0L, j5 - ((long) i));
        }
        return new androidx.media3.exoplayer.MediaPeriodInfo(mediaPeriodId, jMax, j2, j4, j5, z3, zIsLastInPeriod, zIsLastInWindow, zIsLastInTimeline);
    }

    private boolean isLastInPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1;
    }

    private boolean isLastInWindow(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        if (isLastInPeriod(mediaPeriodId)) {
            return timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window).lastPeriodIndex == timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        }
        return false;
    }

    private boolean isLastInTimeline(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, boolean z) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, this.window).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z;
    }

    private long getMinStartPositionAfterAdGroupUs(androidx.media3.common.Timeline timeline, java.lang.Object obj, int i) {
        timeline.getPeriodByUid(obj, this.period);
        long adGroupTimeUs = this.period.getAdGroupTimeUs(i);
        if (adGroupTimeUs == Long.MIN_VALUE) {
            return this.period.durationUs;
        }
        return adGroupTimeUs + this.period.getContentResumeOffsetUs(i);
    }
}
