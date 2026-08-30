package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class CompositionPlayerInternal implements android.os.Handler.Callback {
    private static final int MSG_CLEAR_OUTPUT_SURFACE = 2;
    private static final int MSG_END_SEEK = 4;
    private static final int MSG_RELEASE = 5;
    private static final int MSG_SET_OUTPUT_SURFACE_INFO = 1;
    private static final int MSG_START_SEEK = 3;
    private static final java.lang.String TAG = "CompPlayerInternal";
    private final androidx.media3.common.util.Clock clock;
    private final androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider;
    private final androidx.media3.common.util.HandlerWrapper handler;
    private final androidx.media3.transformer.CompositionPlayerInternal.Listener listener;
    private final androidx.media3.common.util.HandlerWrapper listenerHandler;
    private final androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline;
    private boolean released;

    public interface Listener {
        void onError(java.lang.String str, java.lang.Exception exc, int i);
    }

    public CompositionPlayerInternal(android.os.Looper looper, androidx.media3.common.util.Clock clock, androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline, androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider, androidx.media3.transformer.CompositionPlayerInternal.Listener listener, androidx.media3.common.util.HandlerWrapper handlerWrapper) {
        this.clock = clock;
        this.handler = clock.createHandler(looper, this);
        this.previewAudioPipeline = previewAudioPipeline;
        this.compositingVideoSinkProvider = compositingVideoSinkProvider;
        this.listener = listener;
        this.listenerHandler = handlerWrapper;
    }

    public void setOutputSurfaceInfo(android.view.Surface surface, androidx.media3.common.util.Size size) {
        this.handler.obtainMessage(1, new androidx.media3.transformer.CompositionPlayerInternal.OutputSurfaceInfo(surface, size)).sendToTarget();
    }

    public void clearOutputSurface() {
        this.handler.obtainMessage(2).sendToTarget();
    }

    public void startSeek(long j) {
        this.handler.obtainMessage(3, java.lang.Long.valueOf(j)).sendToTarget();
    }

    public void endSeek() {
        this.handler.obtainMessage(4).sendToTarget();
    }

    public void release() {
        androidx.media3.common.util.Assertions.checkState(!this.released);
        this.released = true;
        androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable();
        this.handler.obtainMessage(5, conditionVariable).sendToTarget();
        this.clock.onThreadBlocked();
        try {
            conditionVariable.block();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        try {
            int i = message.what;
            if (i == 1) {
                setOutputSurfaceInfoOnInternalThread((androidx.media3.transformer.CompositionPlayerInternal.OutputSurfaceInfo) message.obj);
            } else if (i == 2) {
                clearOutputSurfaceInternal();
            } else if (i == 3) {
                this.previewAudioPipeline.startSeek(androidx.media3.common.util.Util.msToUs(((java.lang.Long) message.obj).longValue()));
            } else if (i == 4) {
                this.previewAudioPipeline.endSeek();
            } else if (i == 5) {
                releaseInternal((androidx.media3.common.util.ConditionVariable) message.obj);
            } else {
                maybeRaiseError("Unknown message", new java.lang.IllegalStateException(java.lang.String.valueOf(message.what)), 1000);
            }
        } catch (java.lang.RuntimeException e) {
            maybeRaiseError("Unknown error", e, 1000);
        }
        return true;
    }

    private void releaseInternal(androidx.media3.common.util.ConditionVariable conditionVariable) {
        try {
            try {
                this.previewAudioPipeline.release();
                this.compositingVideoSinkProvider.clearOutputSurfaceInfo();
                this.compositingVideoSinkProvider.release();
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.e(TAG, "error while releasing the player", e);
            }
        } finally {
            conditionVariable.open();
        }
    }

    private void clearOutputSurfaceInternal() {
        try {
            this.compositingVideoSinkProvider.clearOutputSurfaceInfo();
        } catch (java.lang.RuntimeException e) {
            maybeRaiseError("error clearing video output", e, 7001);
        }
    }

    private void setOutputSurfaceInfoOnInternalThread(androidx.media3.transformer.CompositionPlayerInternal.OutputSurfaceInfo outputSurfaceInfo) {
        try {
            this.compositingVideoSinkProvider.setOutputSurfaceInfo(outputSurfaceInfo.surface, outputSurfaceInfo.size);
        } catch (java.lang.RuntimeException e) {
            maybeRaiseError("error setting surface view", e, 7001);
        }
    }

    private void maybeRaiseError(final java.lang.String str, final java.lang.Exception exc, final int i) {
        try {
            this.listenerHandler.post(new java.lang.Runnable() { // from class: androidx.media3.transformer.CompositionPlayerInternal$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m430xfd13a429(str, exc, i);
                }
            });
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.e(TAG, "error", e);
        }
    }

    /* JADX INFO: renamed from: lambda$maybeRaiseError$0$androidx-media3-transformer-CompositionPlayerInternal, reason: not valid java name */
    /* synthetic */ void m430xfd13a429(java.lang.String str, java.lang.Exception exc, int i) {
        if (this.released) {
            return;
        }
        this.listener.onError(str, exc, i);
    }

    private static final class OutputSurfaceInfo {
        public final androidx.media3.common.util.Size size;
        public final android.view.Surface surface;

        public OutputSurfaceInfo(android.view.Surface surface, androidx.media3.common.util.Size size) {
            this.surface = surface;
            this.size = size;
        }
    }
}
