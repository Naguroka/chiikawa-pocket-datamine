package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public interface AudioRendererEventListener {
    default void onAudioCodecError(java.lang.Exception exc) {
    }

    default void onAudioDecoderInitialized(java.lang.String str, long j, long j2) {
    }

    default void onAudioDecoderReleased(java.lang.String str) {
    }

    default void onAudioDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onAudioEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
    }

    default void onAudioInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onAudioPositionAdvancing(long j) {
    }

    default void onAudioSinkError(java.lang.Exception exc) {
    }

    default void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void onAudioUnderrun(int i, long j, long j2) {
    }

    default void onSkipSilenceEnabledChanged(boolean z) {
    }

    public static final class EventDispatcher {
        private final android.os.Handler handler;
        private final androidx.media3.exoplayer.audio.AudioRendererEventListener listener;

        public EventDispatcher(android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(handler) : null;
            this.listener = audioRendererEventListener;
        }

        public void enabled(final androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m145x55ee20a7(decoderCounters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$enabled$0$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m145x55ee20a7(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioEnabled(decoderCounters);
        }

        public void decoderInitialized(final java.lang.String str, final long j, final long j2) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m142x4e7a341d(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$decoderInitialized$1$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m142x4e7a341d(java.lang.String str, long j, long j2) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioDecoderInitialized(str, j, j2);
        }

        public void inputFormatChanged(final androidx.media3.common.Format format, final androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m146x1ee33b39(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$inputFormatChanged$2$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m146x1ee33b39(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void positionAdvancing(final long j) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m147xa4e1944f(j);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$positionAdvancing$3$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m147xa4e1944f(long j) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioPositionAdvancing(j);
        }

        public void underrun(final int i, final long j, final long j2) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m149x8e019017(i, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$underrun$4$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m149x8e019017(int i, long j, long j2) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioUnderrun(i, j, j2);
        }

        public void decoderReleased(final java.lang.String str) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m143x102cf822(str);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$decoderReleased$5$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m143x102cf822(java.lang.String str) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioDecoderReleased(str);
        }

        public void disabled(final androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m144xe116cfac(decoderCounters);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$disabled$6$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m144xe116cfac(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioDisabled(decoderCounters);
        }

        public void skipSilenceEnabledChanged(final boolean z) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m148x60b531cc(z);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$skipSilenceEnabledChanged$7$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m148x60b531cc(boolean z) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onSkipSilenceEnabledChanged(z);
        }

        public void audioSinkError(final java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m139xc89a3787(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$audioSinkError$8$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m139xc89a3787(java.lang.Exception exc) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioSinkError(exc);
        }

        public void audioCodecError(final java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m138xdf751697(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$audioCodecError$9$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m138xdf751697(java.lang.Exception exc) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioCodecError(exc);
        }

        public void audioTrackInitialized(final androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m140xee74b056(audioTrackConfig);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$audioTrackInitialized$10$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m140xee74b056(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioTrackInitialized(audioTrackConfig);
        }

        public void audioTrackReleased(final androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m141x12b02702(audioTrackConfig);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$audioTrackReleased$11$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m141x12b02702(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioTrackReleased(audioTrackConfig);
        }
    }
}
