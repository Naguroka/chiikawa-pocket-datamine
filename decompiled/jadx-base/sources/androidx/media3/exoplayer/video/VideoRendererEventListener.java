package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public interface VideoRendererEventListener {
    default void onDroppedFrames(int i, long j) {
    }

    default void onRenderedFirstFrame(java.lang.Object obj, long j) {
    }

    default void onVideoCodecError(java.lang.Exception exc) {
    }

    default void onVideoDecoderInitialized(java.lang.String str, long j, long j2) {
    }

    default void onVideoDecoderReleased(java.lang.String str) {
    }

    default void onVideoDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onVideoFrameProcessingOffset(long j, int i) {
    }

    default void onVideoInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
    }

    public static final class EventDispatcher {
        private final android.os.Handler handler;
        private final androidx.media3.exoplayer.video.VideoRendererEventListener listener;

        public EventDispatcher(android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(handler) : null;
            this.listener = videoRendererEventListener;
        }

        public void enabled(final androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m214x7180d5d(decoderCounters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$enabled$0$androidx-media3-exoplayer-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m214x7180d5d(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoEnabled(decoderCounters);
        }

        public void decoderInitialized(final java.lang.String str, final long j, final long j2) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m210xffa420d3(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$decoderInitialized$1$androidx-media3-exoplayer-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m210xffa420d3(java.lang.String str, long j, long j2) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoDecoderInitialized(str, j, j2);
        }

        public void inputFormatChanged(final androidx.media3.common.Format format, final androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m215xd00d27ef(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$inputFormatChanged$2$androidx-media3-exoplayer-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m215xd00d27ef(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void droppedFrames(final int i, final long j) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m213x9a4cf695(i, j);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$droppedFrames$3$androidx-media3-exoplayer-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m213x9a4cf695(int i, long j) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onDroppedFrames(i, j);
        }

        public void reportVideoFrameProcessingOffset(final long j, final int i) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m217xc5ffb974(j, i);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$reportVideoFrameProcessingOffset$4$androidx-media3-exoplayer-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m217xc5ffb974(long j, int i) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoFrameProcessingOffset(j, i);
        }

        public void videoSizeChanged(final androidx.media3.common.VideoSize videoSize) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m219xad971007(videoSize);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$videoSizeChanged$5$androidx-media3-exoplayer-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m219xad971007(androidx.media3.common.VideoSize videoSize) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoSizeChanged(videoSize);
        }

        public void renderedFirstFrame(final java.lang.Object obj) {
            if (this.handler != null) {
                final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m216xb1e96bac(obj, jElapsedRealtime);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$renderedFirstFrame$6$androidx-media3-exoplayer-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m216xb1e96bac(java.lang.Object obj, long j) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onRenderedFirstFrame(obj, j);
        }

        public void decoderReleased(final java.lang.String str) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m211x45853f96(str);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$decoderReleased$7$androidx-media3-exoplayer-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m211x45853f96(java.lang.String str) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoDecoderReleased(str);
        }

        public void disabled(final androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m212x166f1720(decoderCounters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$disabled$8$androidx-media3-exoplayer-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m212x166f1720(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoDisabled(decoderCounters);
        }

        public void videoCodecError(final java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m218x90ab4908(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$videoCodecError$9$androidx-media3-exoplayer-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m218x90ab4908(java.lang.Exception exc) {
            ((androidx.media3.exoplayer.video.VideoRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onVideoCodecError(exc);
        }
    }
}
