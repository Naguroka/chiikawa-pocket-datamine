package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class MediaSourceList {
    private static final java.lang.String TAG = "MediaSourceList";
    private final androidx.media3.common.util.HandlerWrapper eventHandler;
    private final androidx.media3.exoplayer.analytics.AnalyticsCollector eventListener;
    private boolean isPrepared;
    private final androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener mediaSourceListInfoListener;
    private androidx.media3.datasource.TransferListener mediaTransferListener;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    private androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder = new androidx.media3.exoplayer.source.ShuffleOrder.DefaultShuffleOrder(0);
    private final java.util.IdentityHashMap<androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> mediaSourceByMediaPeriod = new java.util.IdentityHashMap<>();
    private final java.util.Map<java.lang.Object, androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> mediaSourceByUid = new java.util.HashMap();
    private final java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> mediaSourceHolders = new java.util.ArrayList();
    private final java.util.HashMap<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder, androidx.media3.exoplayer.MediaSourceList.MediaSourceAndListener> childSources = new java.util.HashMap<>();
    private final java.util.Set<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> enabledMediaSourceHolders = new java.util.HashSet();

    public interface MediaSourceListInfoRefreshListener {
        void onPlaylistUpdateRequested();
    }

    public MediaSourceList(androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, androidx.media3.common.util.HandlerWrapper handlerWrapper, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this.playerId = playerId;
        this.mediaSourceListInfoListener = mediaSourceListInfoRefreshListener;
        this.eventListener = analyticsCollector;
        this.eventHandler = handlerWrapper;
    }

    public androidx.media3.common.Timeline setMediaSources(java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> list, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        removeMediaSourcesInternal(0, this.mediaSourceHolders.size());
        return addMediaSources(this.mediaSourceHolders.size(), list, shuffleOrder);
    }

    public androidx.media3.common.Timeline addMediaSources(int i, java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> list, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        if (!list.isEmpty()) {
            this.shuffleOrder = shuffleOrder;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder = list.get(i2 - i);
                if (i2 > 0) {
                    androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i2 - 1);
                    mediaSourceHolder.reset(mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.mediaSource.getTimeline().getWindowCount());
                } else {
                    mediaSourceHolder.reset(0);
                }
                correctOffsets(i2, mediaSourceHolder.mediaSource.getTimeline().getWindowCount());
                this.mediaSourceHolders.add(i2, mediaSourceHolder);
                this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
                if (this.isPrepared) {
                    prepareChildSource(mediaSourceHolder);
                    if (this.mediaSourceByMediaPeriod.isEmpty()) {
                        this.enabledMediaSourceHolders.add(mediaSourceHolder);
                    } else {
                        disableChildSource(mediaSourceHolder);
                    }
                }
            }
        }
        return createTimeline();
    }

    public androidx.media3.common.Timeline removeMediaSourceRange(int i, int i2, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= i2 && i2 <= getSize());
        this.shuffleOrder = shuffleOrder;
        removeMediaSourcesInternal(i, i2);
        return createTimeline();
    }

    public androidx.media3.common.Timeline moveMediaSource(int i, int i2, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        return moveMediaSourceRange(i, i + 1, i2, shuffleOrder);
    }

    public androidx.media3.common.Timeline moveMediaSourceRange(int i, int i2, int i3, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= i2 && i2 <= getSize() && i3 >= 0);
        this.shuffleOrder = shuffleOrder;
        if (i == i2 || i == i3) {
            return createTimeline();
        }
        int iMin = java.lang.Math.min(i, i3);
        int iMax = java.lang.Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int windowCount = this.mediaSourceHolders.get(iMin).firstWindowIndexInChild;
        androidx.media3.common.util.Util.moveItems(this.mediaSourceHolders, i, i2, i3);
        while (iMin <= iMax) {
            androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(iMin);
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            windowCount += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
            iMin++;
        }
        return createTimeline();
    }

    public androidx.media3.common.Timeline updateMediaSourcesWithMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= i2 && i2 <= getSize());
        androidx.media3.common.util.Assertions.checkArgument(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            this.mediaSourceHolders.get(i3).mediaSource.updateMediaItem(list.get(i3 - i));
        }
        return createTimeline();
    }

    public androidx.media3.common.Timeline clear(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        if (shuffleOrder == null) {
            shuffleOrder = this.shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        removeMediaSourcesInternal(0, getSize());
        return createTimeline();
    }

    public boolean isPrepared() {
        return this.isPrepared;
    }

    public int getSize() {
        return this.mediaSourceHolders.size();
    }

    public androidx.media3.common.Timeline setShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        int size = getSize();
        if (shuffleOrder.getLength() != size) {
            shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
        }
        this.shuffleOrder = shuffleOrder;
        return createTimeline();
    }

    public void prepare(androidx.media3.datasource.TransferListener transferListener) {
        androidx.media3.common.util.Assertions.checkState(!this.isPrepared);
        this.mediaTransferListener = transferListener;
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i);
            prepareChildSource(mediaSourceHolder);
            this.enabledMediaSourceHolders.add(mediaSourceHolder);
        }
        this.isPrepared = true;
    }

    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        java.lang.Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder = (androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder) androidx.media3.common.util.Assertions.checkNotNull(this.mediaSourceByUid.get(mediaSourceHolderUid));
        enableMediaSource(mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriodIds.add(mediaPeriodIdCopyWithPeriodUid);
        androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriodCreatePeriod = mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder = (androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder) androidx.media3.common.util.Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        mediaSourceHolder.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolder.activeMediaPeriodIds.remove(((androidx.media3.exoplayer.source.MaskingMediaPeriod) mediaPeriod).id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolder);
    }

    public void release() {
        for (androidx.media3.exoplayer.MediaSourceList.MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            try {
                mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.e(TAG, "Failed to release child source.", e);
            }
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
        this.enabledMediaSourceHolders.clear();
        this.isPrepared = false;
    }

    public androidx.media3.common.Timeline createTimeline() {
        if (this.mediaSourceHolders.isEmpty()) {
            return androidx.media3.common.Timeline.EMPTY;
        }
        int windowCount = 0;
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i);
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            windowCount += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
        }
        return new androidx.media3.exoplayer.PlaylistTimeline(this.mediaSourceHolders, this.shuffleOrder);
    }

    public androidx.media3.exoplayer.source.ShuffleOrder getShuffleOrder() {
        return this.shuffleOrder;
    }

    private void enableMediaSource(androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder) {
        this.enabledMediaSourceHolders.add(mediaSourceHolder);
        androidx.media3.exoplayer.MediaSourceList.MediaSourceAndListener mediaSourceAndListener = this.childSources.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
    }

    private void disableUnusedMediaSources() {
        java.util.Iterator<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder next = it.next();
            if (next.activeMediaPeriodIds.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private void disableChildSource(androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder) {
        androidx.media3.exoplayer.MediaSourceList.MediaSourceAndListener mediaSourceAndListener = this.childSources.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
        }
    }

    private void removeMediaSourcesInternal(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceHolders.remove(i3);
            this.mediaSourceByUid.remove(mediaSourceHolderRemove.uid);
            correctOffsets(i3, -mediaSourceHolderRemove.mediaSource.getTimeline().getWindowCount());
            mediaSourceHolderRemove.isRemoved = true;
            if (this.isPrepared) {
                maybeReleaseChildSource(mediaSourceHolderRemove);
            }
        }
    }

    private void correctOffsets(int i, int i2) {
        while (i < this.mediaSourceHolders.size()) {
            this.mediaSourceHolders.get(i).firstWindowIndexInChild += i2;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < mediaSourceHolder.activeMediaPeriodIds.size(); i++) {
            if (mediaSourceHolder.activeMediaPeriodIds.get(i).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getWindowIndexForChildWindowIndex(androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder, int i) {
        return i + mediaSourceHolder.firstWindowIndexInChild;
    }

    private void prepareChildSource(androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder) {
        androidx.media3.exoplayer.source.MaskingMediaSource maskingMediaSource = mediaSourceHolder.mediaSource;
        androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller = new androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller() { // from class: androidx.media3.exoplayer.MediaSourceList$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
                this.f$0.m123x10419188(mediaSource, timeline);
            }
        };
        androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener forwardingEventListener = new androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener(mediaSourceHolder);
        this.childSources.put(mediaSourceHolder, new androidx.media3.exoplayer.MediaSourceList.MediaSourceAndListener(maskingMediaSource, mediaSourceCaller, forwardingEventListener));
        maskingMediaSource.addEventListener(androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper(), forwardingEventListener);
        maskingMediaSource.addDrmEventListener(androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper(), forwardingEventListener);
        maskingMediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener, this.playerId);
    }

    /* JADX INFO: renamed from: lambda$prepareChildSource$0$androidx-media3-exoplayer-MediaSourceList, reason: not valid java name */
    /* synthetic */ void m123x10419188(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
        this.mediaSourceListInfoListener.onPlaylistUpdateRequested();
    }

    private void maybeReleaseChildSource(androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            androidx.media3.exoplayer.MediaSourceList.MediaSourceAndListener mediaSourceAndListener = (androidx.media3.exoplayer.MediaSourceList.MediaSourceAndListener) androidx.media3.common.util.Assertions.checkNotNull(this.childSources.remove(mediaSourceHolder));
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
            this.enabledMediaSourceHolders.remove(mediaSourceHolder);
        }
    }

    private static java.lang.Object getMediaSourceHolderUid(java.lang.Object obj) {
        return androidx.media3.exoplayer.PlaylistTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static java.lang.Object getChildPeriodUid(java.lang.Object obj) {
        return androidx.media3.exoplayer.PlaylistTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static java.lang.Object getPeriodUid(androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder, java.lang.Object obj) {
        return androidx.media3.exoplayer.PlaylistTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    static final class MediaSourceHolder implements androidx.media3.exoplayer.MediaSourceInfoHolder {
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final androidx.media3.exoplayer.source.MaskingMediaSource mediaSource;
        public final java.util.List<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> activeMediaPeriodIds = new java.util.ArrayList();
        public final java.lang.Object uid = new java.lang.Object();

        public MediaSourceHolder(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z) {
            this.mediaSource = new androidx.media3.exoplayer.source.MaskingMediaSource(mediaSource, z);
        }

        public void reset(int i) {
            this.firstWindowIndexInChild = i;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public java.lang.Object getUid() {
            return this.uid;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public androidx.media3.common.Timeline getTimeline() {
            return this.mediaSource.getTimeline();
        }
    }

    private static final class MediaSourceAndListener {
        public final androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller caller;
        public final androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener eventListener;
        public final androidx.media3.exoplayer.source.MediaSource mediaSource;

        public MediaSourceAndListener(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller, androidx.media3.exoplayer.MediaSourceList.ForwardingEventListener forwardingEventListener) {
            this.mediaSource = mediaSource;
            this.caller = mediaSourceCaller;
            this.eventListener = forwardingEventListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ForwardingEventListener implements androidx.media3.exoplayer.source.MediaSourceEventListener, androidx.media3.exoplayer.drm.DrmSessionEventListener {
        private final androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder id;

        public ForwardingEventListener(androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder) {
            this.id = mediaSourceHolder;
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadStarted(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m134x11454fa7(eventParameters, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onLoadStarted$0$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m134x11454fa7(android.util.Pair pair, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onLoadStarted(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCompleted(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m132x562f44b2(eventParameters, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onLoadCompleted$1$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m132x562f44b2(android.util.Pair pair, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onLoadCompleted(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCanceled(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m131x36d40f85(eventParameters, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onLoadCanceled$2$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m131x36d40f85(android.util.Pair pair, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onLoadCanceled(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, final java.io.IOException iOException, final boolean z) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m133x67e35871(eventParameters, loadEventInfo, mediaLoadData, iOException, z);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onLoadError$3$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m133x67e35871(android.util.Pair pair, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onLoadError(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second, loadEventInfo, mediaLoadData, iOException, z);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m135xcc5b5192(eventParameters, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onUpstreamDiscarded$4$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m135xcc5b5192(android.util.Pair pair, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onUpstreamDiscarded(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second), mediaLoadData);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m124xf34172ec(eventParameters, mediaLoadData);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDownstreamFormatChanged$5$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m124xf34172ec(android.util.Pair pair, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onDownstreamFormatChanged(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second, mediaLoadData);
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final int i2) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m128xe036324f(eventParameters, i2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmSessionAcquired$6$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m128xe036324f(android.util.Pair pair, int i) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onDrmSessionAcquired(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second, i);
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m125x3f5587cb(eventParameters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmKeysLoaded$7$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m125x3f5587cb(android.util.Pair pair) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onDrmKeysLoaded(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second);
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, final java.lang.Exception exc) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m129x6070cdde(eventParameters, exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmSessionManagerError$8$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m129x6070cdde(android.util.Pair pair, java.lang.Exception exc) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onDrmSessionManagerError(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second, exc);
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m127x356ec9e(eventParameters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmKeysRestored$9$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m127x356ec9e(android.util.Pair pair) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onDrmKeysRestored(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second);
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m126x32cca0d6(eventParameters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmKeysRemoved$10$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m126x32cca0d6(android.util.Pair pair) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onDrmKeysRemoved(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second);
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            final android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> eventParameters = getEventParameters(i, mediaPeriodId);
            if (eventParameters != null) {
                androidx.media3.exoplayer.MediaSourceList.this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m130xbda1950(eventParameters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onDrmSessionReleased$11$androidx-media3-exoplayer-MediaSourceList$ForwardingEventListener, reason: not valid java name */
        /* synthetic */ void m130xbda1950(android.util.Pair pair) {
            androidx.media3.exoplayer.MediaSourceList.this.eventListener.onDrmSessionReleased(((java.lang.Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) pair.second);
        }

        private android.util.Pair<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> getEventParameters(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = null;
            if (mediaPeriodId != null) {
                androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId = androidx.media3.exoplayer.MediaSourceList.getMediaPeriodIdForChildMediaPeriodId(this.id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return null;
                }
                mediaPeriodId2 = mediaPeriodIdForChildMediaPeriodId;
            }
            return android.util.Pair.create(java.lang.Integer.valueOf(androidx.media3.exoplayer.MediaSourceList.getWindowIndexForChildWindowIndex(this.id, i)), mediaPeriodId2);
        }
    }
}
