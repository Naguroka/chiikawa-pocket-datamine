package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSessionEventListener {
    default void onDrmKeysLoaded(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRemoved(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRestored(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @java.lang.Deprecated
    default void onDrmSessionAcquired(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionAcquired(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, int i2) {
    }

    default void onDrmSessionManagerError(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc) {
    }

    default void onDrmSessionReleased(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public static class EventDispatcher {
        private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
        }

        private EventDispatcher(java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> copyOnWriteArrayList, int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }

        public androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher withParameters(int i, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            return new androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        public void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            androidx.media3.common.util.Assertions.checkNotNull(handler);
            androidx.media3.common.util.Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler(handler, drmSessionEventListener));
        }

        public void removeEventListener(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            for (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        public void drmSessionAcquired(final int i) {
            for (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                androidx.media3.common.util.Util.postOrRun(listenerAndHandler.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m157x3233dce6(drmSessionEventListener, i);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmSessionAcquired$0$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m157x3233dce6(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener, int i) {
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId, i);
        }

        public void drmKeysLoaded() {
            for (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                androidx.media3.common.util.Util.postOrRun(listenerAndHandler.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m154x8fe293c0(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmKeysLoaded$1$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m154x8fe293c0(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysLoaded(this.windowIndex, this.mediaPeriodId);
        }

        public void drmSessionManagerError(final java.lang.Exception exc) {
            for (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                androidx.media3.common.util.Util.postOrRun(listenerAndHandler.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m158x18253075(drmSessionEventListener, exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmSessionManagerError$2$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m158x18253075(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener, java.lang.Exception exc) {
            drmSessionEventListener.onDrmSessionManagerError(this.windowIndex, this.mediaPeriodId, exc);
        }

        public void drmKeysRestored() {
            for (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                androidx.media3.common.util.Util.postOrRun(listenerAndHandler.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m156xcfc47b53(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmKeysRestored$3$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m156xcfc47b53(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRestored(this.windowIndex, this.mediaPeriodId);
        }

        public void drmKeysRemoved() {
            for (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                androidx.media3.common.util.Util.postOrRun(listenerAndHandler.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m155x5d8fdb2(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmKeysRemoved$4$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m155x5d8fdb2(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRemoved(this.windowIndex, this.mediaPeriodId);
        }

        public void drmSessionReleased() {
            for (androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                androidx.media3.common.util.Util.postOrRun(listenerAndHandler.handler, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m159x690251a(drmSessionEventListener);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$drmSessionReleased$5$androidx-media3-exoplayer-drm-DrmSessionEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m159x690251a(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionReleased(this.windowIndex, this.mediaPeriodId);
        }

        private static final class ListenerAndHandler {
            public android.os.Handler handler;
            public androidx.media3.exoplayer.drm.DrmSessionEventListener listener;

            public ListenerAndHandler(android.os.Handler handler, androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }
    }
}
