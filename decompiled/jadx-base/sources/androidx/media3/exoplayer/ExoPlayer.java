package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends androidx.media3.common.Player {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @java.lang.Deprecated
    public interface AudioComponent {
        @java.lang.Deprecated
        void clearAuxEffectInfo();

        @java.lang.Deprecated
        androidx.media3.common.AudioAttributes getAudioAttributes();

        @java.lang.Deprecated
        int getAudioSessionId();

        @java.lang.Deprecated
        boolean getSkipSilenceEnabled();

        @java.lang.Deprecated
        float getVolume();

        @java.lang.Deprecated
        void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z);

        @java.lang.Deprecated
        void setAudioSessionId(int i);

        @java.lang.Deprecated
        void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo);

        @java.lang.Deprecated
        void setSkipSilenceEnabled(boolean z);

        @java.lang.Deprecated
        void setVolume(float f);
    }

    public interface AudioOffloadListener {
        default void onOffloadedPlayback(boolean z) {
        }

        default void onSleepingForOffloadChanged(boolean z) {
        }
    }

    @java.lang.Deprecated
    public interface DeviceComponent {
        @java.lang.Deprecated
        void decreaseDeviceVolume();

        @java.lang.Deprecated
        androidx.media3.common.DeviceInfo getDeviceInfo();

        @java.lang.Deprecated
        int getDeviceVolume();

        @java.lang.Deprecated
        void increaseDeviceVolume();

        @java.lang.Deprecated
        boolean isDeviceMuted();

        @java.lang.Deprecated
        void setDeviceMuted(boolean z);

        @java.lang.Deprecated
        void setDeviceVolume(int i);
    }

    @java.lang.Deprecated
    public interface TextComponent {
        @java.lang.Deprecated
        androidx.media3.common.text.CueGroup getCurrentCues();
    }

    @java.lang.Deprecated
    public interface VideoComponent {
        @java.lang.Deprecated
        void clearCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener);

        @java.lang.Deprecated
        void clearVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener);

        @java.lang.Deprecated
        void clearVideoSurface();

        @java.lang.Deprecated
        void clearVideoSurface(android.view.Surface surface);

        @java.lang.Deprecated
        void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

        @java.lang.Deprecated
        void clearVideoSurfaceView(android.view.SurfaceView surfaceView);

        @java.lang.Deprecated
        void clearVideoTextureView(android.view.TextureView textureView);

        @java.lang.Deprecated
        int getVideoChangeFrameRateStrategy();

        @java.lang.Deprecated
        int getVideoScalingMode();

        @java.lang.Deprecated
        androidx.media3.common.VideoSize getVideoSize();

        @java.lang.Deprecated
        void setCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener);

        @java.lang.Deprecated
        void setVideoChangeFrameRateStrategy(int i);

        @java.lang.Deprecated
        void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener);

        @java.lang.Deprecated
        void setVideoScalingMode(int i);

        @java.lang.Deprecated
        void setVideoSurface(android.view.Surface surface);

        @java.lang.Deprecated
        void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

        @java.lang.Deprecated
        void setVideoSurfaceView(android.view.SurfaceView surfaceView);

        @java.lang.Deprecated
        void setVideoTextureView(android.view.TextureView textureView);
    }

    void addAnalyticsListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener);

    void addAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i, androidx.media3.exoplayer.source.MediaSource mediaSource);

    void addMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource);

    void addMediaSources(int i, java.util.List<androidx.media3.exoplayer.source.MediaSource> list);

    void addMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener);

    androidx.media3.exoplayer.PlayerMessage createMessage(androidx.media3.exoplayer.PlayerMessage.Target target);

    androidx.media3.exoplayer.analytics.AnalyticsCollector getAnalyticsCollector();

    @java.lang.Deprecated
    androidx.media3.exoplayer.ExoPlayer.AudioComponent getAudioComponent();

    androidx.media3.exoplayer.DecoderCounters getAudioDecoderCounters();

    androidx.media3.common.Format getAudioFormat();

    int getAudioSessionId();

    androidx.media3.common.util.Clock getClock();

    @java.lang.Deprecated
    androidx.media3.exoplayer.source.TrackGroupArray getCurrentTrackGroups();

    @java.lang.Deprecated
    androidx.media3.exoplayer.trackselection.TrackSelectionArray getCurrentTrackSelections();

    @java.lang.Deprecated
    androidx.media3.exoplayer.ExoPlayer.DeviceComponent getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    android.os.Looper getPlaybackLooper();

    @Override // androidx.media3.common.Player
    androidx.media3.exoplayer.ExoPlaybackException getPlayerError();

    androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration getPreloadConfiguration();

    androidx.media3.exoplayer.Renderer getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    androidx.media3.exoplayer.SeekParameters getSeekParameters();

    boolean getSkipSilenceEnabled();

    @java.lang.Deprecated
    androidx.media3.exoplayer.ExoPlayer.TextComponent getTextComponent();

    androidx.media3.exoplayer.trackselection.TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @java.lang.Deprecated
    androidx.media3.exoplayer.ExoPlayer.VideoComponent getVideoComponent();

    androidx.media3.exoplayer.DecoderCounters getVideoDecoderCounters();

    androidx.media3.common.Format getVideoFormat();

    int getVideoScalingMode();

    boolean isReleased();

    boolean isSleepingForOffload();

    boolean isTunnelingEnabled();

    @java.lang.Deprecated
    void prepare(androidx.media3.exoplayer.source.MediaSource mediaSource);

    @java.lang.Deprecated
    void prepare(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z, boolean z2);

    @Override // androidx.media3.common.Player
    void release();

    void removeAnalyticsListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener);

    void removeAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener);

    @Override // androidx.media3.common.Player
    void replaceMediaItem(int i, androidx.media3.common.MediaItem mediaItem);

    @Override // androidx.media3.common.Player
    void replaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    void setImageOutput(androidx.media3.exoplayer.image.ImageOutput imageOutput);

    void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource);

    void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, long j);

    void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z);

    void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list);

    void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, int i, long j);

    void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    void setPreferredAudioDevice(android.media.AudioDeviceInfo audioDeviceInfo);

    void setPreloadConfiguration(androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration);

    void setPriority(int i);

    void setPriorityTaskManager(androidx.media3.common.PriorityTaskManager priorityTaskManager);

    void setSeekParameters(androidx.media3.exoplayer.SeekParameters seekParameters);

    void setShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z);

    void setVideoChangeFrameRateStrategy(int i);

    void setVideoEffects(java.util.List<androidx.media3.common.Effect> list);

    void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i);

    void setWakeMode(int i);

    public static class PreloadConfiguration {
        public static final androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration DEFAULT = new androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration(androidx.media3.common.C.TIME_UNSET);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j) {
            this.targetPreloadDurationUs = j;
        }
    }

    public static final class Builder {
        com.google.common.base.Function<androidx.media3.common.util.Clock, androidx.media3.exoplayer.analytics.AnalyticsCollector> analyticsCollectorFunction;
        androidx.media3.common.AudioAttributes audioAttributes;
        com.google.common.base.Supplier<androidx.media3.exoplayer.upstream.BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        androidx.media3.common.util.Clock clock;
        final android.content.Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        androidx.media3.exoplayer.LivePlaybackSpeedControl livePlaybackSpeedControl;
        com.google.common.base.Supplier<androidx.media3.exoplayer.LoadControl> loadControlSupplier;
        android.os.Looper looper;
        long maxSeekToPreviousPositionMs;
        com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;
        android.os.Looper playbackLooper;
        java.lang.String playerName;
        int priority;
        androidx.media3.common.PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        com.google.common.base.Supplier<androidx.media3.exoplayer.RenderersFactory> renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        androidx.media3.exoplayer.SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        boolean suppressPlaybackOnUnsuitableOutput;
        com.google.common.base.Supplier<androidx.media3.exoplayer.trackselection.TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        static /* synthetic */ androidx.media3.exoplayer.trackselection.TrackSelector lambda$new$10(androidx.media3.exoplayer.trackselection.TrackSelector trackSelector) {
            return trackSelector;
        }

        static /* synthetic */ androidx.media3.exoplayer.LoadControl lambda$new$11(androidx.media3.exoplayer.LoadControl loadControl) {
            return loadControl;
        }

        static /* synthetic */ androidx.media3.exoplayer.upstream.BandwidthMeter lambda$new$12(androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        static /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsCollector lambda$new$13(androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, androidx.media3.common.util.Clock clock) {
            return analyticsCollector;
        }

        static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$2(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$new$5(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$6(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$new$7(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$8(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$new$9(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsCollector lambda$setAnalyticsCollector$21(androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, androidx.media3.common.util.Clock clock) {
            return analyticsCollector;
        }

        static /* synthetic */ androidx.media3.exoplayer.upstream.BandwidthMeter lambda$setBandwidthMeter$20(androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        static /* synthetic */ androidx.media3.exoplayer.LoadControl lambda$setLoadControl$19(androidx.media3.exoplayer.LoadControl loadControl) {
            return loadControl;
        }

        static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$setMediaSourceFactory$17(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$setRenderersFactory$16(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ androidx.media3.exoplayer.trackselection.TrackSelector lambda$setTrackSelector$18(androidx.media3.exoplayer.trackselection.TrackSelector trackSelector) {
            return trackSelector;
        }

        public Builder(final android.content.Context context) {
            this(context, (com.google.common.base.Supplier<androidx.media3.exoplayer.RenderersFactory>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda11
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$0(context);
                }
            }, (com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda16
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$1(context);
                }
            });
        }

        static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$0(android.content.Context context) {
            return new androidx.media3.exoplayer.DefaultRenderersFactory(context);
        }

        static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$new$1(android.content.Context context) {
            return new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(context, new androidx.media3.extractor.DefaultExtractorsFactory());
        }

        public Builder(final android.content.Context context, final androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            this(context, (com.google.common.base.Supplier<androidx.media3.exoplayer.RenderersFactory>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda6
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$2(renderersFactory);
                }
            }, (com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda7
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$3(context);
                }
            });
            androidx.media3.common.util.Assertions.checkNotNull(renderersFactory);
        }

        static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$new$3(android.content.Context context) {
            return new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(context, new androidx.media3.extractor.DefaultExtractorsFactory());
        }

        public Builder(final android.content.Context context, final androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            this(context, (com.google.common.base.Supplier<androidx.media3.exoplayer.RenderersFactory>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$4(context);
                }
            }, (com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda3
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$5(factory);
                }
            });
            androidx.media3.common.util.Assertions.checkNotNull(factory);
        }

        static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$4(android.content.Context context) {
            return new androidx.media3.exoplayer.DefaultRenderersFactory(context);
        }

        public Builder(android.content.Context context, final androidx.media3.exoplayer.RenderersFactory renderersFactory, final androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            this(context, (com.google.common.base.Supplier<androidx.media3.exoplayer.RenderersFactory>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda14
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$6(renderersFactory);
                }
            }, (com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda15
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$7(factory);
                }
            });
            androidx.media3.common.util.Assertions.checkNotNull(renderersFactory);
            androidx.media3.common.util.Assertions.checkNotNull(factory);
        }

        public Builder(android.content.Context context, final androidx.media3.exoplayer.RenderersFactory renderersFactory, final androidx.media3.exoplayer.source.MediaSource.Factory factory, final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, final androidx.media3.exoplayer.LoadControl loadControl, final androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, final androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector) {
            this(context, (com.google.common.base.Supplier<androidx.media3.exoplayer.RenderersFactory>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda18
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$8(renderersFactory);
                }
            }, (com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda19
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$9(factory);
                }
            }, (com.google.common.base.Supplier<androidx.media3.exoplayer.trackselection.TrackSelector>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda20
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$10(trackSelector);
                }
            }, (com.google.common.base.Supplier<androidx.media3.exoplayer.LoadControl>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda21
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$11(loadControl);
                }
            }, (com.google.common.base.Supplier<androidx.media3.exoplayer.upstream.BandwidthMeter>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda22
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$12(bandwidthMeter);
                }
            }, (com.google.common.base.Function<androidx.media3.common.util.Clock, androidx.media3.exoplayer.analytics.AnalyticsCollector>) new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda23
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$13(analyticsCollector, (androidx.media3.common.util.Clock) obj);
                }
            });
            androidx.media3.common.util.Assertions.checkNotNull(renderersFactory);
            androidx.media3.common.util.Assertions.checkNotNull(factory);
            androidx.media3.common.util.Assertions.checkNotNull(trackSelector);
            androidx.media3.common.util.Assertions.checkNotNull(bandwidthMeter);
            androidx.media3.common.util.Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(final android.content.Context context, com.google.common.base.Supplier<androidx.media3.exoplayer.RenderersFactory> supplier, com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory> supplier2) {
            this(context, supplier, supplier2, (com.google.common.base.Supplier<androidx.media3.exoplayer.trackselection.TrackSelector>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda9
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$14(context);
                }
            }, (com.google.common.base.Supplier<androidx.media3.exoplayer.LoadControl>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda10
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return new androidx.media3.exoplayer.DefaultLoadControl();
                }
            }, (com.google.common.base.Supplier<androidx.media3.exoplayer.upstream.BandwidthMeter>) new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda12
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.getSingletonInstance(context);
                }
            }, (com.google.common.base.Function<androidx.media3.common.util.Clock, androidx.media3.exoplayer.analytics.AnalyticsCollector>) new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda13
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return new androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector((androidx.media3.common.util.Clock) obj);
                }
            });
        }

        static /* synthetic */ androidx.media3.exoplayer.trackselection.TrackSelector lambda$new$14(android.content.Context context) {
            return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector(context);
        }

        private Builder(android.content.Context context, com.google.common.base.Supplier<androidx.media3.exoplayer.RenderersFactory> supplier, com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory> supplier2, com.google.common.base.Supplier<androidx.media3.exoplayer.trackselection.TrackSelector> supplier3, com.google.common.base.Supplier<androidx.media3.exoplayer.LoadControl> supplier4, com.google.common.base.Supplier<androidx.media3.exoplayer.upstream.BandwidthMeter> supplier5, com.google.common.base.Function<androidx.media3.common.util.Clock, androidx.media3.exoplayer.analytics.AnalyticsCollector> function) {
            this.context = (android.content.Context) androidx.media3.common.util.Assertions.checkNotNull(context);
            this.renderersFactorySupplier = supplier;
            this.mediaSourceFactorySupplier = supplier2;
            this.trackSelectorSupplier = supplier3;
            this.loadControlSupplier = supplier4;
            this.bandwidthMeterSupplier = supplier5;
            this.analyticsCollectorFunction = function;
            this.looper = androidx.media3.common.util.Util.getCurrentOrMainLooper();
            this.audioAttributes = androidx.media3.common.AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = androidx.media3.exoplayer.SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            this.maxSeekToPreviousPositionMs = androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
            this.livePlaybackSpeedControl = new androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = androidx.media3.common.util.Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder experimentalSetForegroundModeTimeoutMs(long j) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder experimentalSetDynamicSchedulingEnabled(boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.dynamicSchedulingEnabled = z;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSuppressPlaybackOnUnsuitableOutput(boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setRenderersFactory(final androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            androidx.media3.common.util.Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda17
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setRenderersFactory$16(renderersFactory);
                }
            };
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setMediaSourceFactory(final androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            androidx.media3.common.util.Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda5
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setMediaSourceFactory$17(factory);
                }
            };
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setTrackSelector(final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            androidx.media3.common.util.Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda4
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setTrackSelector$18(trackSelector);
                }
            };
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setLoadControl(final androidx.media3.exoplayer.LoadControl loadControl) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            androidx.media3.common.util.Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setLoadControl$19(loadControl);
                }
            };
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setBandwidthMeter(final androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            androidx.media3.common.util.Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setBandwidthMeter$20(bandwidthMeter);
                }
            };
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setLooper(android.os.Looper looper) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            androidx.media3.common.util.Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setAnalyticsCollector(final androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            androidx.media3.common.util.Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda8
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$setAnalyticsCollector$21(analyticsCollector, (androidx.media3.common.util.Clock) obj);
                }
            };
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setPriority(int i) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.priority = i;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setPriorityTaskManager(androidx.media3.common.PriorityTaskManager priorityTaskManager) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.audioAttributes = (androidx.media3.common.AudioAttributes) androidx.media3.common.util.Assertions.checkNotNull(audioAttributes);
            this.handleAudioFocus = z;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setWakeMode(int i) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.wakeMode = i;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setHandleAudioBecomingNoisy(boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSkipSilenceEnabled(boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setDeviceVolumeControlEnabled(boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.deviceVolumeControlEnabled = z;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setVideoScalingMode(int i) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setVideoChangeFrameRateStrategy(int i) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setUseLazyPreparation(boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSeekParameters(androidx.media3.exoplayer.SeekParameters seekParameters) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.seekParameters = (androidx.media3.exoplayer.SeekParameters) androidx.media3.common.util.Assertions.checkNotNull(seekParameters);
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSeekBackIncrementMs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j > 0);
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSeekForwardIncrementMs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j > 0);
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setMaxSeekToPreviousPositionMs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j >= 0);
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setReleaseTimeoutMs(long j) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setDetachSurfaceTimeoutMs(long j) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setPauseAtEndOfMediaItems(boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setLivePlaybackSpeedControl(androidx.media3.exoplayer.LivePlaybackSpeedControl livePlaybackSpeedControl) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (androidx.media3.exoplayer.LivePlaybackSpeedControl) androidx.media3.common.util.Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setUsePlatformDiagnostics(boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setClock(androidx.media3.common.util.Clock clock) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setPlaybackLooper(android.os.Looper looper) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.playbackLooper = looper;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setName(java.lang.String str) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.playerName = str;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer build() {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new androidx.media3.exoplayer.ExoPlayerImpl(this, null);
        }

        androidx.media3.exoplayer.SimpleExoPlayer buildSimpleExoPlayer() {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new androidx.media3.exoplayer.SimpleExoPlayer(this);
        }
    }
}
