package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public abstract class CompositeMediaSource<T> extends androidx.media3.exoplayer.source.BaseMediaSource {
    private final java.util.HashMap<T, androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T>> childSources = new java.util.HashMap<>();
    private android.os.Handler eventHandler;
    private androidx.media3.datasource.TransferListener mediaTransferListener;

    protected androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(T t, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    protected long getMediaTimeForChildMediaTime(T t, long j, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return j;
    }

    protected int getWindowIndexForChildWindowIndex(T t, int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: merged with bridge method [inline-methods] */
    public abstract void m179x28f9175(T t, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline);

    protected CompositeMediaSource() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.eventHandler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
        java.util.Iterator<androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T>> it = this.childSources.values().iterator();
        while (it.hasNext()) {
            it.next().mediaSource.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void enableInternal() {
        for (androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void disableInternal() {
        for (androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        for (androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void prepareChildSource(final T t, androidx.media3.exoplayer.source.MediaSource mediaSource) {
        androidx.media3.common.util.Assertions.checkArgument(!this.childSources.containsKey(t));
        androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller = new androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller() { // from class: androidx.media3.exoplayer.source.CompositeMediaSource$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(androidx.media3.exoplayer.source.MediaSource mediaSource2, androidx.media3.common.Timeline timeline) {
                this.f$0.m179x28f9175(t, mediaSource2, timeline);
            }
        };
        androidx.media3.exoplayer.source.CompositeMediaSource.ForwardingEventListener forwardingEventListener = new androidx.media3.exoplayer.source.CompositeMediaSource.ForwardingEventListener(t);
        this.childSources.put(t, new androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<>(mediaSource, mediaSourceCaller, forwardingEventListener));
        mediaSource.addEventListener((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(this.eventHandler), forwardingEventListener);
        mediaSource.addDrmEventListener((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(this.eventHandler), forwardingEventListener);
        mediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener, getPlayerId());
        if (isEnabled()) {
            return;
        }
        mediaSource.disable(mediaSourceCaller);
    }

    protected final void enableChildSource(T t) {
        androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener mediaSourceAndListener = (androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener) androidx.media3.common.util.Assertions.checkNotNull(this.childSources.get(t));
        mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
    }

    protected final void disableChildSource(T t) {
        androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener mediaSourceAndListener = (androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener) androidx.media3.common.util.Assertions.checkNotNull(this.childSources.get(t));
        mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void releaseChildSource(T t) {
        androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener mediaSourceAndListener = (androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener) androidx.media3.common.util.Assertions.checkNotNull(this.childSources.remove(t));
        mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
        mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
        mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
    }

    private static final class MediaSourceAndListener<T> {
        public final androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller caller;
        public final androidx.media3.exoplayer.source.CompositeMediaSource<T>.ForwardingEventListener eventListener;
        public final androidx.media3.exoplayer.source.MediaSource mediaSource;

        public MediaSourceAndListener(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller, androidx.media3.exoplayer.source.CompositeMediaSource<T>.ForwardingEventListener forwardingEventListener) {
            this.mediaSource = mediaSource;
            this.caller = mediaSourceCaller;
            this.eventListener = forwardingEventListener;
        }
    }

    private final class ForwardingEventListener implements androidx.media3.exoplayer.source.MediaSourceEventListener, androidx.media3.exoplayer.drm.DrmSessionEventListener {
        private androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        private final T id;
        private androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;

        public ForwardingEventListener(T t) {
            this.mediaSourceEventDispatcher = androidx.media3.exoplayer.source.CompositeMediaSource.this.createEventDispatcher(null);
            this.drmEventDispatcher = androidx.media3.exoplayer.source.CompositeMediaSource.this.createDrmEventDispatcher(null);
            this.id = t;
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadStarted(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadStarted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCompleted(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCanceled(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadError(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId), iOException, z);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.upstreamDiscarded(maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.downstreamFormatChanged(maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, int i2) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionAcquired(i2);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysLoaded();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionManagerError(exc);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysRestored();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysRemoved();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionReleased();
            }
        }

        private boolean maybeUpdateEventDispatcher(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId;
            if (mediaPeriodId != null) {
                mediaPeriodIdForChildMediaPeriodId = androidx.media3.exoplayer.source.CompositeMediaSource.this.getMediaPeriodIdForChildMediaPeriodId(this.id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return false;
                }
            } else {
                mediaPeriodIdForChildMediaPeriodId = null;
            }
            int windowIndexForChildWindowIndex = androidx.media3.exoplayer.source.CompositeMediaSource.this.getWindowIndexForChildWindowIndex(this.id, i);
            if (this.mediaSourceEventDispatcher.windowIndex != windowIndexForChildWindowIndex || !androidx.media3.common.util.Util.areEqual(this.mediaSourceEventDispatcher.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                this.mediaSourceEventDispatcher = androidx.media3.exoplayer.source.CompositeMediaSource.this.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId);
            }
            if (this.drmEventDispatcher.windowIndex == windowIndexForChildWindowIndex && androidx.media3.common.util.Util.areEqual(this.drmEventDispatcher.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                return true;
            }
            this.drmEventDispatcher = androidx.media3.exoplayer.source.CompositeMediaSource.this.createDrmEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId);
            return true;
        }

        private androidx.media3.exoplayer.source.MediaLoadData maybeUpdateMediaLoadData(androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            long mediaTimeForChildMediaTime = androidx.media3.exoplayer.source.CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.id, mediaLoadData.mediaStartTimeMs, mediaPeriodId);
            long mediaTimeForChildMediaTime2 = androidx.media3.exoplayer.source.CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.id, mediaLoadData.mediaEndTimeMs, mediaPeriodId);
            return (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) ? mediaLoadData : new androidx.media3.exoplayer.source.MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }
    }
}
