package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class ConcatenatingMediaSource extends androidx.media3.exoplayer.source.CompositeMediaSource<androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> {
    private static final int MSG_ADD = 1;
    private static final int MSG_MOVE = 3;
    private static final int MSG_ON_COMPLETION = 6;
    private static final int MSG_REMOVE = 2;
    private static final int MSG_SET_SHUFFLE_ORDER = 4;
    private static final int MSG_UPDATE_TIMELINE = 5;
    private static final androidx.media3.common.MediaItem PLACEHOLDER_MEDIA_ITEM = new androidx.media3.common.MediaItem.Builder().setUri(android.net.Uri.EMPTY).build();
    private final java.util.Set<androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final java.util.IdentityHashMap<androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourceByMediaPeriod;
    private final java.util.Map<java.lang.Object, androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourceByUid;
    private final java.util.List<androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourceHolders;
    private final java.util.List<androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> mediaSourcesPublic;
    private java.util.Set<androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable> nextTimelineUpdateOnCompletionActions;
    private final java.util.Set<androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable> pendingOnCompletionActions;
    private android.os.Handler playbackThreadHandler;
    private androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void enableInternal() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public ConcatenatingMediaSource(androidx.media3.exoplayer.source.MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, androidx.media3.exoplayer.source.MediaSource... mediaSourceArr) {
        this(z, new androidx.media3.exoplayer.source.ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder, androidx.media3.exoplayer.source.MediaSource... mediaSourceArr) {
        this(z, false, shuffleOrder, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, boolean z2, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder, androidx.media3.exoplayer.source.MediaSource... mediaSourceArr) {
        for (androidx.media3.exoplayer.source.MediaSource mediaSource : mediaSourceArr) {
            androidx.media3.common.util.Assertions.checkNotNull(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new java.util.IdentityHashMap<>();
        this.mediaSourceByUid = new java.util.HashMap();
        this.mediaSourcesPublic = new java.util.ArrayList();
        this.mediaSourceHolders = new java.util.ArrayList();
        this.nextTimelineUpdateOnCompletionActions = new java.util.HashSet();
        this.pendingOnCompletionActions = new java.util.HashSet();
        this.enabledMediaSourceHolders = new java.util.HashSet();
        this.isAtomic = z;
        this.useLazyPreparation = z2;
        addMediaSources(java.util.Arrays.asList(mediaSourceArr));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized androidx.media3.common.Timeline getInitialTimeline() {
        androidx.media3.exoplayer.source.ShuffleOrder shuffleOrderCloneAndInsert;
        if (this.shuffleOrder.getLength() != this.mediaSourcesPublic.size()) {
            shuffleOrderCloneAndInsert = this.shuffleOrder.cloneAndClear().cloneAndInsert(0, this.mediaSourcesPublic.size());
        } else {
            shuffleOrderCloneAndInsert = this.shuffleOrder;
        }
        return new androidx.media3.exoplayer.source.ConcatenatingMediaSource.ConcatenatedTimeline(this.mediaSourcesPublic, shuffleOrderCloneAndInsert, this.isAtomic);
    }

    public synchronized void addMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource);
    }

    public synchronized void addMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, android.os.Handler handler, java.lang.Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, handler, runnable);
    }

    public synchronized void addMediaSource(int i, androidx.media3.exoplayer.source.MediaSource mediaSource) {
        addPublicMediaSources(i, java.util.Collections.singletonList(mediaSource), null, null);
    }

    public synchronized void addMediaSource(int i, androidx.media3.exoplayer.source.MediaSource mediaSource, android.os.Handler handler, java.lang.Runnable runnable) {
        addPublicMediaSources(i, java.util.Collections.singletonList(mediaSource), handler, runnable);
    }

    public synchronized void addMediaSources(java.util.Collection<androidx.media3.exoplayer.source.MediaSource> collection) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, null, null);
    }

    public synchronized void addMediaSources(java.util.Collection<androidx.media3.exoplayer.source.MediaSource> collection, android.os.Handler handler, java.lang.Runnable runnable) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, handler, runnable);
    }

    public synchronized void addMediaSources(int i, java.util.Collection<androidx.media3.exoplayer.source.MediaSource> collection) {
        addPublicMediaSources(i, collection, null, null);
    }

    public synchronized void addMediaSources(int i, java.util.Collection<androidx.media3.exoplayer.source.MediaSource> collection, android.os.Handler handler, java.lang.Runnable runnable) {
        addPublicMediaSources(i, collection, handler, runnable);
    }

    public synchronized androidx.media3.exoplayer.source.MediaSource removeMediaSource(int i) {
        androidx.media3.exoplayer.source.MediaSource mediaSource;
        mediaSource = getMediaSource(i);
        removePublicMediaSources(i, i + 1, null, null);
        return mediaSource;
    }

    public synchronized androidx.media3.exoplayer.source.MediaSource removeMediaSource(int i, android.os.Handler handler, java.lang.Runnable runnable) {
        androidx.media3.exoplayer.source.MediaSource mediaSource;
        mediaSource = getMediaSource(i);
        removePublicMediaSources(i, i + 1, handler, runnable);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int i, int i2) {
        removePublicMediaSources(i, i2, null, null);
    }

    public synchronized void removeMediaSourceRange(int i, int i2, android.os.Handler handler, java.lang.Runnable runnable) {
        removePublicMediaSources(i, i2, handler, runnable);
    }

    public synchronized void moveMediaSource(int i, int i2) {
        movePublicMediaSource(i, i2, null, null);
    }

    public synchronized void moveMediaSource(int i, int i2, android.os.Handler handler, java.lang.Runnable runnable) {
        movePublicMediaSource(i, i2, handler, runnable);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    public synchronized void clear(android.os.Handler handler, java.lang.Runnable runnable) {
        removeMediaSourceRange(0, getSize(), handler, runnable);
    }

    public synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    public synchronized androidx.media3.exoplayer.source.MediaSource getMediaSource(int i) {
        return this.mediaSourcesPublic.get(i).mediaSource;
    }

    public synchronized void setShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        setPublicShuffleOrder(shuffleOrder, null, null);
    }

    public synchronized void setShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder, android.os.Handler handler, java.lang.Runnable runnable) {
        setPublicShuffleOrder(shuffleOrder, handler, runnable);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.common.MediaItem getMediaItem() {
        return PLACEHOLDER_MEDIA_ITEM;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected synchronized void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new android.os.Handler(new android.os.Handler.Callback() { // from class: androidx.media3.exoplayer.source.ConcatenatingMediaSource$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.f$0.handleMessage(message);
            }
        });
        if (this.mediaSourcesPublic.isEmpty()) {
            updateTimelineAndScheduleOnCompletionActions();
        } else {
            this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
            addMediaSourcesInternal(0, this.mediaSourcesPublic);
            scheduleTimelineUpdate();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        java.lang.Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder = this.mediaSourceByUid.get(mediaSourceHolderUid);
        if (mediaSourceHolder == null) {
            mediaSourceHolder = new androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder(new androidx.media3.exoplayer.source.ConcatenatingMediaSource.FakeMediaSource(), this.useLazyPreparation);
            mediaSourceHolder.isRemoved = true;
            prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        }
        enableMediaSource(mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriodIds.add(mediaPeriodIdCopyWithPeriodUid);
        androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriodCreatePeriod = mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder = (androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder) androidx.media3.common.util.Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        mediaSourceHolder.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolder.activeMediaPeriodIds.remove(((androidx.media3.exoplayer.source.MaskingMediaPeriod) mediaPeriod).id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolder);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void disableInternal() {
        super.disableInternal();
        this.enabledMediaSourceHolders.clear();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected synchronized void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.mediaSourceHolders.clear();
        this.enabledMediaSourceHolders.clear();
        this.mediaSourceByUid.clear();
        this.shuffleOrder = this.shuffleOrder.cloneAndClear();
        android.os.Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
        this.nextTimelineUpdateOnCompletionActions.clear();
        dispatchOnCompletionActions(this.pendingOnCompletionActions);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void m179x28f9175(androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
        updateMediaSourceInternal(mediaSourceHolder, timeline);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < mediaSourceHolder.activeMediaPeriodIds.size(); i++) {
            if (mediaSourceHolder.activeMediaPeriodIds.get(i).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder, int i) {
        return i + mediaSourceHolder.firstWindowIndexInChild;
    }

    private void addPublicMediaSources(int i, java.util.Collection<androidx.media3.exoplayer.source.MediaSource> collection, android.os.Handler handler, java.lang.Runnable runnable) {
        androidx.media3.common.util.Assertions.checkArgument((handler == null) == (runnable == null));
        android.os.Handler handler2 = this.playbackThreadHandler;
        java.util.Iterator<androidx.media3.exoplayer.source.MediaSource> it = collection.iterator();
        while (it.hasNext()) {
            androidx.media3.common.util.Assertions.checkNotNull(it.next());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        java.util.Iterator<androidx.media3.exoplayer.source.MediaSource> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder(it2.next(), this.useLazyPreparation));
        }
        this.mediaSourcesPublic.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(1, new androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData(i, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void removePublicMediaSources(int i, int i2, android.os.Handler handler, java.lang.Runnable runnable) {
        androidx.media3.common.util.Assertions.checkArgument((handler == null) == (runnable == null));
        android.os.Handler handler2 = this.playbackThreadHandler;
        androidx.media3.common.util.Util.removeRange(this.mediaSourcesPublic, i, i2);
        if (handler2 != null) {
            handler2.obtainMessage(2, new androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData(i, java.lang.Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void movePublicMediaSource(int i, int i2, android.os.Handler handler, java.lang.Runnable runnable) {
        androidx.media3.common.util.Assertions.checkArgument((handler == null) == (runnable == null));
        android.os.Handler handler2 = this.playbackThreadHandler;
        java.util.List<androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> list = this.mediaSourcesPublic;
        list.add(i2, list.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(3, new androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData(i, java.lang.Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void setPublicShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder, android.os.Handler handler, java.lang.Runnable runnable) {
        androidx.media3.common.util.Assertions.checkArgument((handler == null) == (runnable == null));
        android.os.Handler handler2 = this.playbackThreadHandler;
        if (handler2 != null) {
            int size = getSize();
            if (shuffleOrder.getLength() != size) {
                shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(4, new androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData(0, shuffleOrder, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable createOnCompletionAction(android.os.Handler handler, java.lang.Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable handlerAndRunnable = new androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable(handler, runnable);
        this.pendingOnCompletionActions.add(handlerAndRunnable);
        return handlerAndRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 1:
                androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData messageData = (androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData) androidx.media3.common.util.Util.castNonNull(message.obj);
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData.index, ((java.util.Collection) messageData.customData).size());
                addMediaSourcesInternal(messageData.index, (java.util.Collection) messageData.customData);
                scheduleTimelineUpdate(messageData.onCompletionAction);
                return true;
            case 2:
                androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData messageData2 = (androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData) androidx.media3.common.util.Util.castNonNull(message.obj);
                int i = messageData2.index;
                int iIntValue = ((java.lang.Integer) messageData2.customData).intValue();
                if (i == 0 && iIntValue == this.shuffleOrder.getLength()) {
                    this.shuffleOrder = this.shuffleOrder.cloneAndClear();
                } else {
                    this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i, iIntValue);
                }
                for (int i2 = iIntValue - 1; i2 >= i; i2--) {
                    removeMediaSourceInternal(i2);
                }
                scheduleTimelineUpdate(messageData2.onCompletionAction);
                return true;
            case 3:
                androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData messageData3 = (androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData) androidx.media3.common.util.Util.castNonNull(message.obj);
                androidx.media3.exoplayer.source.ShuffleOrder shuffleOrderCloneAndRemove = this.shuffleOrder.cloneAndRemove(messageData3.index, messageData3.index + 1);
                this.shuffleOrder = shuffleOrderCloneAndRemove;
                this.shuffleOrder = shuffleOrderCloneAndRemove.cloneAndInsert(((java.lang.Integer) messageData3.customData).intValue(), 1);
                moveMediaSourceInternal(messageData3.index, ((java.lang.Integer) messageData3.customData).intValue());
                scheduleTimelineUpdate(messageData3.onCompletionAction);
                return true;
            case 4:
                androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData messageData4 = (androidx.media3.exoplayer.source.ConcatenatingMediaSource.MessageData) androidx.media3.common.util.Util.castNonNull(message.obj);
                this.shuffleOrder = (androidx.media3.exoplayer.source.ShuffleOrder) messageData4.customData;
                scheduleTimelineUpdate(messageData4.onCompletionAction);
                return true;
            case 5:
                updateTimelineAndScheduleOnCompletionActions();
                return true;
            case 6:
                dispatchOnCompletionActions((java.util.Set) androidx.media3.common.util.Util.castNonNull(message.obj));
                return true;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    private void scheduleTimelineUpdate() {
        scheduleTimelineUpdate(null);
    }

    private void scheduleTimelineUpdate(androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable handlerAndRunnable) {
        if (!this.timelineUpdateScheduled) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5).sendToTarget();
            this.timelineUpdateScheduled = true;
        }
        if (handlerAndRunnable != null) {
            this.nextTimelineUpdateOnCompletionActions.add(handlerAndRunnable);
        }
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.timelineUpdateScheduled = false;
        java.util.Set<androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable> set = this.nextTimelineUpdateOnCompletionActions;
        this.nextTimelineUpdateOnCompletionActions = new java.util.HashSet();
        refreshSourceInfo(new androidx.media3.exoplayer.source.ConcatenatingMediaSource.ConcatenatedTimeline(this.mediaSourceHolders, this.shuffleOrder, this.isAtomic));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(6, set).sendToTarget();
    }

    private android.os.Handler getPlaybackThreadHandlerOnPlaybackThread() {
        return (android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(this.playbackThreadHandler);
    }

    private synchronized void dispatchOnCompletionActions(java.util.Set<androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable> set) {
        java.util.Iterator<androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable> it = set.iterator();
        while (it.hasNext()) {
            it.next().dispatch();
        }
        this.pendingOnCompletionActions.removeAll(set);
    }

    private void addMediaSourcesInternal(int i, java.util.Collection<androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> collection) {
        java.util.Iterator<androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i, it.next());
            i++;
        }
    }

    private void addMediaSourceInternal(int i, androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder) {
        if (i > 0) {
            androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i - 1);
            mediaSourceHolder.reset(i, mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.mediaSource.getTimeline().getWindowCount());
        } else {
            mediaSourceHolder.reset(i, 0);
        }
        correctOffsets(i, 1, mediaSourceHolder.mediaSource.getTimeline().getWindowCount());
        this.mediaSourceHolders.add(i, mediaSourceHolder);
        this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
        prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        if (isEnabled() && this.mediaSourceByMediaPeriod.isEmpty()) {
            this.enabledMediaSourceHolders.add(mediaSourceHolder);
        } else {
            disableChildSource(mediaSourceHolder);
        }
    }

    private void updateMediaSourceInternal(androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder, androidx.media3.common.Timeline timeline) {
        if (mediaSourceHolder.childIndex + 1 < this.mediaSourceHolders.size()) {
            int windowCount = timeline.getWindowCount() - (this.mediaSourceHolders.get(mediaSourceHolder.childIndex + 1).firstWindowIndexInChild - mediaSourceHolder.firstWindowIndexInChild);
            if (windowCount != 0) {
                correctOffsets(mediaSourceHolder.childIndex + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    private void removeMediaSourceInternal(int i) {
        androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceHolders.remove(i);
        this.mediaSourceByUid.remove(mediaSourceHolderRemove.uid);
        correctOffsets(i, -1, -mediaSourceHolderRemove.mediaSource.getTimeline().getWindowCount());
        mediaSourceHolderRemove.isRemoved = true;
        maybeReleaseChildSource(mediaSourceHolderRemove);
    }

    private void moveMediaSourceInternal(int i, int i2) {
        int iMin = java.lang.Math.min(i, i2);
        int iMax = java.lang.Math.max(i, i2);
        int windowCount = this.mediaSourceHolders.get(iMin).firstWindowIndexInChild;
        java.util.List<androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> list = this.mediaSourceHolders;
        list.add(i2, list.remove(i));
        while (iMin <= iMax) {
            androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(iMin);
            mediaSourceHolder.childIndex = iMin;
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            windowCount += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
            iMin++;
        }
    }

    private void correctOffsets(int i, int i2, int i3) {
        while (i < this.mediaSourceHolders.size()) {
            androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i);
            mediaSourceHolder.childIndex += i2;
            mediaSourceHolder.firstWindowIndexInChild += i3;
            i++;
        }
    }

    private void maybeReleaseChildSource(androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            this.enabledMediaSourceHolders.remove(mediaSourceHolder);
            releaseChildSource(mediaSourceHolder);
        }
    }

    private void enableMediaSource(androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder) {
        this.enabledMediaSourceHolders.add(mediaSourceHolder);
        enableChildSource(mediaSourceHolder);
    }

    private void disableUnusedMediaSources() {
        java.util.Iterator<androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder next = it.next();
            if (next.activeMediaPeriodIds.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private static java.lang.Object getMediaSourceHolderUid(java.lang.Object obj) {
        return androidx.media3.exoplayer.source.ConcatenatingMediaSource.ConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static java.lang.Object getChildPeriodUid(java.lang.Object obj) {
        return androidx.media3.exoplayer.source.ConcatenatingMediaSource.ConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static java.lang.Object getPeriodUid(androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder, java.lang.Object obj) {
        return androidx.media3.exoplayer.source.ConcatenatingMediaSource.ConcatenatedTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    static final class MediaSourceHolder {
        public int childIndex;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final androidx.media3.exoplayer.source.MaskingMediaSource mediaSource;
        public final java.util.List<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> activeMediaPeriodIds = new java.util.ArrayList();
        public final java.lang.Object uid = new java.lang.Object();

        public MediaSourceHolder(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z) {
            this.mediaSource = new androidx.media3.exoplayer.source.MaskingMediaSource(mediaSource, z);
        }

        public void reset(int i, int i2) {
            this.childIndex = i;
            this.firstWindowIndexInChild = i2;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }
    }

    private static final class MessageData<T> {
        public final T customData;
        public final int index;
        public final androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable onCompletionAction;

        public MessageData(int i, T t, androidx.media3.exoplayer.source.ConcatenatingMediaSource.HandlerAndRunnable handlerAndRunnable) {
            this.index = i;
            this.customData = t;
            this.onCompletionAction = handlerAndRunnable;
        }
    }

    private static final class ConcatenatedTimeline extends androidx.media3.exoplayer.AbstractConcatenatedTimeline {
        private final java.util.HashMap<java.lang.Object, java.lang.Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final androidx.media3.common.Timeline[] timelines;
        private final java.lang.Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(java.util.Collection<androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder> collection, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder, boolean z) {
            super(z, shuffleOrder);
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new androidx.media3.common.Timeline[size];
            this.uids = new java.lang.Object[size];
            this.childIndexByUid = new java.util.HashMap<>();
            int windowCount = 0;
            int periodCount = 0;
            int i = 0;
            for (androidx.media3.exoplayer.source.ConcatenatingMediaSource.MediaSourceHolder mediaSourceHolder : collection) {
                this.timelines[i] = mediaSourceHolder.mediaSource.getTimeline();
                this.firstWindowInChildIndices[i] = windowCount;
                this.firstPeriodInChildIndices[i] = periodCount;
                windowCount += this.timelines[i].getWindowCount();
                periodCount += this.timelines[i].getPeriodCount();
                this.uids[i] = mediaSourceHolder.uid;
                this.childIndexByUid.put(this.uids[i], java.lang.Integer.valueOf(i));
                i++;
            }
            this.windowCount = windowCount;
            this.periodCount = periodCount;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getChildIndexByPeriodIndex(int i) {
            return androidx.media3.common.util.Util.binarySearchFloor(this.firstPeriodInChildIndices, i + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getChildIndexByWindowIndex(int i) {
            return androidx.media3.common.util.Util.binarySearchFloor(this.firstWindowInChildIndices, i + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getChildIndexByChildUid(java.lang.Object obj) {
            java.lang.Integer num = this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected androidx.media3.common.Timeline getTimelineByChildIndex(int i) {
            return this.timelines[i];
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getFirstPeriodIndexByChildIndex(int i) {
            return this.firstPeriodInChildIndices[i];
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int getFirstWindowIndexByChildIndex(int i) {
            return this.firstWindowInChildIndices[i];
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected java.lang.Object getChildUidByChildIndex(int i) {
            return this.uids[i];
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.windowCount;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodCount;
        }
    }

    private static final class FakeMediaSource extends androidx.media3.exoplayer.source.BaseMediaSource {
        @Override // androidx.media3.exoplayer.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // androidx.media3.exoplayer.source.BaseMediaSource
        protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        }

        @Override // androidx.media3.exoplayer.source.BaseMediaSource
        protected void releaseSourceInternal() {
        }

        private FakeMediaSource() {
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public androidx.media3.common.MediaItem getMediaItem() {
            return androidx.media3.exoplayer.source.ConcatenatingMediaSource.PLACEHOLDER_MEDIA_ITEM;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static final class HandlerAndRunnable {
        private final android.os.Handler handler;
        private final java.lang.Runnable runnable;

        public HandlerAndRunnable(android.os.Handler handler, java.lang.Runnable runnable) {
            this.handler = handler;
            this.runnable = runnable;
        }

        public void dispatch() {
            this.handler.post(this.runnable);
        }
    }
}
