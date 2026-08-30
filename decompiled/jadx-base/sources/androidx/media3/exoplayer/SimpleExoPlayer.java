package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class SimpleExoPlayer extends androidx.media3.common.BasePlayer implements androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent, androidx.media3.exoplayer.ExoPlayer.VideoComponent, androidx.media3.exoplayer.ExoPlayer.TextComponent, androidx.media3.exoplayer.ExoPlayer.DeviceComponent {
    private final androidx.media3.common.util.ConditionVariable constructorFinished;
    private final androidx.media3.exoplayer.ExoPlayerImpl player;

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public androidx.media3.exoplayer.ExoPlayer.AudioComponent getAudioComponent() {
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public androidx.media3.exoplayer.ExoPlayer.DeviceComponent getDeviceComponent() {
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public androidx.media3.exoplayer.ExoPlayer.TextComponent getTextComponent() {
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public androidx.media3.exoplayer.ExoPlayer.VideoComponent getVideoComponent() {
        return this;
    }

    @java.lang.Deprecated
    public static final class Builder {
        private final androidx.media3.exoplayer.ExoPlayer.Builder wrappedBuilder;

        @java.lang.Deprecated
        public Builder(android.content.Context context) {
            this.wrappedBuilder = new androidx.media3.exoplayer.ExoPlayer.Builder(context);
        }

        @java.lang.Deprecated
        public Builder(android.content.Context context, androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            this.wrappedBuilder = new androidx.media3.exoplayer.ExoPlayer.Builder(context, renderersFactory);
        }

        @java.lang.Deprecated
        public Builder(android.content.Context context, androidx.media3.extractor.ExtractorsFactory extractorsFactory) {
            this.wrappedBuilder = new androidx.media3.exoplayer.ExoPlayer.Builder(context, new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(context, extractorsFactory));
        }

        @java.lang.Deprecated
        public Builder(android.content.Context context, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.extractor.ExtractorsFactory extractorsFactory) {
            this.wrappedBuilder = new androidx.media3.exoplayer.ExoPlayer.Builder(context, renderersFactory, new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(context, extractorsFactory));
        }

        @java.lang.Deprecated
        public Builder(android.content.Context context, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.exoplayer.LoadControl loadControl, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector) {
            this.wrappedBuilder = new androidx.media3.exoplayer.ExoPlayer.Builder(context, renderersFactory, factory, trackSelector, loadControl, bandwidthMeter, analyticsCollector);
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder experimentalSetForegroundModeTimeoutMs(long j) {
            this.wrappedBuilder.experimentalSetForegroundModeTimeoutMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setTrackSelector(androidx.media3.exoplayer.trackselection.TrackSelector trackSelector) {
            this.wrappedBuilder.setTrackSelector(trackSelector);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setMediaSourceFactory(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            this.wrappedBuilder.setMediaSourceFactory(factory);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setLoadControl(androidx.media3.exoplayer.LoadControl loadControl) {
            this.wrappedBuilder.setLoadControl(loadControl);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setBandwidthMeter(androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
            this.wrappedBuilder.setBandwidthMeter(bandwidthMeter);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setLooper(android.os.Looper looper) {
            this.wrappedBuilder.setLooper(looper);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setAnalyticsCollector(androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector) {
            this.wrappedBuilder.setAnalyticsCollector(analyticsCollector);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setPriorityTaskManager(androidx.media3.common.PriorityTaskManager priorityTaskManager) {
            this.wrappedBuilder.setPriorityTaskManager(priorityTaskManager);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
            this.wrappedBuilder.setAudioAttributes(audioAttributes, z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setWakeMode(int i) {
            this.wrappedBuilder.setWakeMode(i);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setHandleAudioBecomingNoisy(boolean z) {
            this.wrappedBuilder.setHandleAudioBecomingNoisy(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setSkipSilenceEnabled(boolean z) {
            this.wrappedBuilder.setSkipSilenceEnabled(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setVideoScalingMode(int i) {
            this.wrappedBuilder.setVideoScalingMode(i);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setVideoChangeFrameRateStrategy(int i) {
            this.wrappedBuilder.setVideoChangeFrameRateStrategy(i);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setUseLazyPreparation(boolean z) {
            this.wrappedBuilder.setUseLazyPreparation(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setSeekParameters(androidx.media3.exoplayer.SeekParameters seekParameters) {
            this.wrappedBuilder.setSeekParameters(seekParameters);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setSeekBackIncrementMs(long j) {
            this.wrappedBuilder.setSeekBackIncrementMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setSeekForwardIncrementMs(long j) {
            this.wrappedBuilder.setSeekForwardIncrementMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setReleaseTimeoutMs(long j) {
            this.wrappedBuilder.setReleaseTimeoutMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setDetachSurfaceTimeoutMs(long j) {
            this.wrappedBuilder.setDetachSurfaceTimeoutMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setPauseAtEndOfMediaItems(boolean z) {
            this.wrappedBuilder.setPauseAtEndOfMediaItems(z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setLivePlaybackSpeedControl(androidx.media3.exoplayer.LivePlaybackSpeedControl livePlaybackSpeedControl) {
            this.wrappedBuilder.setLivePlaybackSpeedControl(livePlaybackSpeedControl);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer.Builder setClock(androidx.media3.common.util.Clock clock) {
            this.wrappedBuilder.setClock(clock);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.SimpleExoPlayer build() {
            return this.wrappedBuilder.buildSimpleExoPlayer();
        }
    }

    @java.lang.Deprecated
    protected SimpleExoPlayer(android.content.Context context, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.exoplayer.LoadControl loadControl, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, boolean z, androidx.media3.common.util.Clock clock, android.os.Looper looper) {
        this(new androidx.media3.exoplayer.ExoPlayer.Builder(context, renderersFactory, factory, trackSelector, loadControl, bandwidthMeter, analyticsCollector).setUseLazyPreparation(z).setClock(clock).setLooper(looper));
    }

    protected SimpleExoPlayer(androidx.media3.exoplayer.SimpleExoPlayer.Builder builder) {
        this(builder.wrappedBuilder);
    }

    SimpleExoPlayer(androidx.media3.exoplayer.ExoPlayer.Builder builder) {
        androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable();
        this.constructorFinished = conditionVariable;
        try {
            this.player = new androidx.media3.exoplayer.ExoPlayerImpl(builder, this);
            conditionVariable.open();
        } catch (java.lang.Throwable th) {
            this.constructorFinished.open();
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        blockUntilConstructorFinished();
        return this.player.isSleepingForOffload();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int i) {
        blockUntilConstructorFinished();
        this.player.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
        blockUntilConstructorFinished();
        return this.player.getVideoScalingMode();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoChangeFrameRateStrategy(int i) {
        blockUntilConstructorFinished();
        this.player.setVideoChangeFrameRateStrategy(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public int getVideoChangeFrameRateStrategy() {
        blockUntilConstructorFinished();
        return this.player.getVideoChangeFrameRateStrategy();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.VideoSize getVideoSize() {
        blockUntilConstructorFinished();
        return this.player.getVideoSize();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.util.Size getSurfaceSize() {
        blockUntilConstructorFinished();
        return this.player.getSurfaceSize();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface() {
        blockUntilConstructorFinished();
        this.player.clearVideoSurface();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface(android.view.Surface surface) {
        blockUntilConstructorFinished();
        this.player.clearVideoSurface(surface);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurface(android.view.Surface surface) {
        blockUntilConstructorFinished();
        this.player.setVideoSurface(surface);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        blockUntilConstructorFinished();
        this.player.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        blockUntilConstructorFinished();
        this.player.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        blockUntilConstructorFinished();
        this.player.setVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        blockUntilConstructorFinished();
        this.player.clearVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public void setVideoTextureView(android.view.TextureView textureView) {
        blockUntilConstructorFinished();
        this.player.setVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoTextureView(android.view.TextureView textureView) {
        blockUntilConstructorFinished();
        this.player.clearVideoTextureView(textureView);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener) {
        blockUntilConstructorFinished();
        this.player.addAudioOffloadListener(audioOffloadListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener) {
        blockUntilConstructorFinished();
        this.player.removeAudioOffloadListener(audioOffloadListener);
    }

    @Override // androidx.media3.common.Player
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        blockUntilConstructorFinished();
        this.player.setAudioAttributes(audioAttributes, z);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        blockUntilConstructorFinished();
        return this.player.getAudioAttributes();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAudioSessionId(int i) {
        blockUntilConstructorFinished();
        this.player.setAudioSessionId(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
        blockUntilConstructorFinished();
        return this.player.getAudioSessionId();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo) {
        blockUntilConstructorFinished();
        this.player.setAuxEffectInfo(auxEffectInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
        blockUntilConstructorFinished();
        this.player.clearAuxEffectInfo();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreferredAudioDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        blockUntilConstructorFinished();
        this.player.setPreferredAudioDevice(audioDeviceInfo);
    }

    @Override // androidx.media3.common.Player
    public void setVolume(float f) {
        blockUntilConstructorFinished();
        this.player.setVolume(f);
    }

    @Override // androidx.media3.common.Player
    public float getVolume() {
        blockUntilConstructorFinished();
        return this.player.getVolume();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
        blockUntilConstructorFinished();
        return this.player.getSkipSilenceEnabled();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoEffects(java.util.List<androidx.media3.common.Effect> list) {
        blockUntilConstructorFinished();
        this.player.setVideoEffects(list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(boolean z) {
        blockUntilConstructorFinished();
        this.player.setSkipSilenceEnabled(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.analytics.AnalyticsCollector getAnalyticsCollector() {
        blockUntilConstructorFinished();
        return this.player.getAnalyticsCollector();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        blockUntilConstructorFinished();
        this.player.addAnalyticsListener(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        blockUntilConstructorFinished();
        this.player.removeAnalyticsListener(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z) {
        blockUntilConstructorFinished();
        this.player.setHandleAudioBecomingNoisy(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriority(int i) {
        blockUntilConstructorFinished();
        this.player.setPriority(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(androidx.media3.common.PriorityTaskManager priorityTaskManager) {
        blockUntilConstructorFinished();
        this.player.setPriorityTaskManager(priorityTaskManager);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.Format getVideoFormat() {
        blockUntilConstructorFinished();
        return this.player.getVideoFormat();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.Format getAudioFormat() {
        blockUntilConstructorFinished();
        return this.player.getAudioFormat();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.DecoderCounters getVideoDecoderCounters() {
        blockUntilConstructorFinished();
        return this.player.getVideoDecoderCounters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.DecoderCounters getAudioDecoderCounters() {
        blockUntilConstructorFinished();
        return this.player.getAudioDecoderCounters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        blockUntilConstructorFinished();
        this.player.setVideoFrameMetadataListener(videoFrameMetadataListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        blockUntilConstructorFinished();
        this.player.clearVideoFrameMetadataListener(videoFrameMetadataListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener) {
        blockUntilConstructorFinished();
        this.player.setCameraMotionListener(cameraMotionListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener) {
        blockUntilConstructorFinished();
        this.player.clearCameraMotionListener(cameraMotionListener);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.text.CueGroup getCurrentCues() {
        blockUntilConstructorFinished();
        return this.player.getCurrentCues();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public android.os.Looper getPlaybackLooper() {
        blockUntilConstructorFinished();
        return this.player.getPlaybackLooper();
    }

    @Override // androidx.media3.common.Player
    public android.os.Looper getApplicationLooper() {
        blockUntilConstructorFinished();
        return this.player.getApplicationLooper();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.util.Clock getClock() {
        blockUntilConstructorFinished();
        return this.player.getClock();
    }

    @Override // androidx.media3.common.Player
    public void addListener(androidx.media3.common.Player.Listener listener) {
        blockUntilConstructorFinished();
        this.player.addListener(listener);
    }

    @Override // androidx.media3.common.Player
    public void removeListener(androidx.media3.common.Player.Listener listener) {
        blockUntilConstructorFinished();
        this.player.removeListener(listener);
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackState() {
        blockUntilConstructorFinished();
        return this.player.getPlaybackState();
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        blockUntilConstructorFinished();
        return this.player.getPlaybackSuppressionReason();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.exoplayer.ExoPlaybackException getPlayerError() {
        blockUntilConstructorFinished();
        return this.player.getPlayerError();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Player.Commands getAvailableCommands() {
        blockUntilConstructorFinished();
        return this.player.getAvailableCommands();
    }

    @Override // androidx.media3.common.Player
    public void prepare() {
        blockUntilConstructorFinished();
        this.player.prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public void prepare(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        blockUntilConstructorFinished();
        this.player.prepare(mediaSource);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public void prepare(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z, boolean z2) {
        blockUntilConstructorFinished();
        this.player.prepare(mediaSource, z, z2);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z) {
        blockUntilConstructorFinished();
        this.player.setMediaItems(list, z);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        blockUntilConstructorFinished();
        this.player.setMediaItems(list, i, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        blockUntilConstructorFinished();
        this.player.setMediaSources(list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, boolean z) {
        blockUntilConstructorFinished();
        this.player.setMediaSources(list, z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, int i, long j) {
        blockUntilConstructorFinished();
        this.player.setMediaSources(list, i, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        blockUntilConstructorFinished();
        this.player.setMediaSource(mediaSource);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z) {
        blockUntilConstructorFinished();
        this.player.setMediaSource(mediaSource, z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, long j) {
        blockUntilConstructorFinished();
        this.player.setMediaSource(mediaSource, j);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        blockUntilConstructorFinished();
        this.player.addMediaItems(i, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        blockUntilConstructorFinished();
        this.player.addMediaSource(mediaSource);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(int i, androidx.media3.exoplayer.source.MediaSource mediaSource) {
        blockUntilConstructorFinished();
        this.player.addMediaSource(i, mediaSource);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        blockUntilConstructorFinished();
        this.player.addMediaSources(list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(int i, java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        blockUntilConstructorFinished();
        this.player.addMediaSources(i, list);
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItems(int i, int i2, int i3) {
        blockUntilConstructorFinished();
        this.player.moveMediaItems(i, i2, i3);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        blockUntilConstructorFinished();
        this.player.replaceMediaItems(i, i2, list);
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItems(int i, int i2) {
        blockUntilConstructorFinished();
        this.player.removeMediaItems(i, i2);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        blockUntilConstructorFinished();
        this.player.setShuffleOrder(shuffleOrder);
    }

    @Override // androidx.media3.common.Player
    public void setPlayWhenReady(boolean z) {
        blockUntilConstructorFinished();
        this.player.setPlayWhenReady(z);
    }

    @Override // androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        blockUntilConstructorFinished();
        return this.player.getPlayWhenReady();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z) {
        blockUntilConstructorFinished();
        this.player.setPauseAtEndOfMediaItems(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        blockUntilConstructorFinished();
        return this.player.getPauseAtEndOfMediaItems();
    }

    @Override // androidx.media3.common.Player
    public int getRepeatMode() {
        blockUntilConstructorFinished();
        return this.player.getRepeatMode();
    }

    @Override // androidx.media3.common.Player
    public void setRepeatMode(int i) {
        blockUntilConstructorFinished();
        this.player.setRepeatMode(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        blockUntilConstructorFinished();
        this.player.setPreloadConfiguration(preloadConfiguration);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration getPreloadConfiguration() {
        blockUntilConstructorFinished();
        return this.player.getPreloadConfiguration();
    }

    @Override // androidx.media3.common.Player
    public void setShuffleModeEnabled(boolean z) {
        blockUntilConstructorFinished();
        this.player.setShuffleModeEnabled(z);
    }

    @Override // androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        blockUntilConstructorFinished();
        return this.player.getShuffleModeEnabled();
    }

    @Override // androidx.media3.common.Player
    public boolean isLoading() {
        blockUntilConstructorFinished();
        return this.player.isLoading();
    }

    @Override // androidx.media3.common.BasePlayer
    public void seekTo(int i, long j, int i2, boolean z) {
        blockUntilConstructorFinished();
        this.player.seekTo(i, j, i2, z);
    }

    @Override // androidx.media3.common.Player
    public long getSeekBackIncrement() {
        blockUntilConstructorFinished();
        return this.player.getSeekBackIncrement();
    }

    @Override // androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        blockUntilConstructorFinished();
        return this.player.getSeekForwardIncrement();
    }

    @Override // androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        blockUntilConstructorFinished();
        return this.player.getMaxSeekToPreviousPosition();
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        blockUntilConstructorFinished();
        this.player.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        blockUntilConstructorFinished();
        return this.player.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekParameters(androidx.media3.exoplayer.SeekParameters seekParameters) {
        blockUntilConstructorFinished();
        this.player.setSeekParameters(seekParameters);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.SeekParameters getSeekParameters() {
        blockUntilConstructorFinished();
        return this.player.getSeekParameters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean z) {
        blockUntilConstructorFinished();
        this.player.setForegroundMode(z);
    }

    @Override // androidx.media3.common.Player
    public void stop() {
        blockUntilConstructorFinished();
        this.player.stop();
    }

    @Override // androidx.media3.common.Player
    public void release() {
        blockUntilConstructorFinished();
        this.player.release();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.PlayerMessage createMessage(androidx.media3.exoplayer.PlayerMessage.Target target) {
        blockUntilConstructorFinished();
        return this.player.createMessage(target);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        blockUntilConstructorFinished();
        return this.player.getRendererCount();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererType(int i) {
        blockUntilConstructorFinished();
        return this.player.getRendererType(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.Renderer getRenderer(int i) {
        blockUntilConstructorFinished();
        return this.player.getRenderer(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.trackselection.TrackSelector getTrackSelector() {
        blockUntilConstructorFinished();
        return this.player.getTrackSelector();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public androidx.media3.exoplayer.source.TrackGroupArray getCurrentTrackGroups() {
        blockUntilConstructorFinished();
        return this.player.getCurrentTrackGroups();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public androidx.media3.exoplayer.trackselection.TrackSelectionArray getCurrentTrackSelections() {
        blockUntilConstructorFinished();
        return this.player.getCurrentTrackSelections();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Tracks getCurrentTracks() {
        blockUntilConstructorFinished();
        return this.player.getCurrentTracks();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        blockUntilConstructorFinished();
        return this.player.getTrackSelectionParameters();
    }

    @Override // androidx.media3.common.Player
    public void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        blockUntilConstructorFinished();
        this.player.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getMediaMetadata() {
        blockUntilConstructorFinished();
        return this.player.getMediaMetadata();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        blockUntilConstructorFinished();
        return this.player.getPlaylistMetadata();
    }

    @Override // androidx.media3.common.Player
    public void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        blockUntilConstructorFinished();
        this.player.setPlaylistMetadata(mediaMetadata);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Timeline getCurrentTimeline() {
        blockUntilConstructorFinished();
        return this.player.getCurrentTimeline();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        blockUntilConstructorFinished();
        return this.player.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        blockUntilConstructorFinished();
        return this.player.getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public long getDuration() {
        blockUntilConstructorFinished();
        return this.player.getDuration();
    }

    @Override // androidx.media3.common.Player
    public long getCurrentPosition() {
        blockUntilConstructorFinished();
        return this.player.getCurrentPosition();
    }

    @Override // androidx.media3.common.Player
    public long getBufferedPosition() {
        blockUntilConstructorFinished();
        return this.player.getBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        blockUntilConstructorFinished();
        return this.player.getTotalBufferedDuration();
    }

    @Override // androidx.media3.common.Player
    public boolean isPlayingAd() {
        blockUntilConstructorFinished();
        return this.player.isPlayingAd();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        blockUntilConstructorFinished();
        return this.player.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        blockUntilConstructorFinished();
        return this.player.getCurrentAdIndexInAdGroup();
    }

    @Override // androidx.media3.common.Player
    public long getContentPosition() {
        blockUntilConstructorFinished();
        return this.player.getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public long getContentBufferedPosition() {
        blockUntilConstructorFinished();
        return this.player.getContentBufferedPosition();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setWakeMode(int i) {
        blockUntilConstructorFinished();
        this.player.setWakeMode(i);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.DeviceInfo getDeviceInfo() {
        blockUntilConstructorFinished();
        return this.player.getDeviceInfo();
    }

    @Override // androidx.media3.common.Player
    public int getDeviceVolume() {
        blockUntilConstructorFinished();
        return this.player.getDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public boolean isDeviceMuted() {
        blockUntilConstructorFinished();
        return this.player.isDeviceMuted();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceVolume(int i) {
        blockUntilConstructorFinished();
        this.player.setDeviceVolume(i);
    }

    @Override // androidx.media3.common.Player
    public void setDeviceVolume(int i, int i2) {
        blockUntilConstructorFinished();
        this.player.setDeviceVolume(i, i2);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void increaseDeviceVolume() {
        blockUntilConstructorFinished();
        this.player.increaseDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public void increaseDeviceVolume(int i) {
        blockUntilConstructorFinished();
        this.player.increaseDeviceVolume(i);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void decreaseDeviceVolume() {
        blockUntilConstructorFinished();
        this.player.decreaseDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public void decreaseDeviceVolume(int i) {
        blockUntilConstructorFinished();
        this.player.decreaseDeviceVolume(i);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceMuted(boolean z) {
        blockUntilConstructorFinished();
        this.player.setDeviceMuted(z);
    }

    @Override // androidx.media3.common.Player
    public void setDeviceMuted(boolean z, int i) {
        blockUntilConstructorFinished();
        this.player.setDeviceMuted(z, i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        blockUntilConstructorFinished();
        return this.player.isTunnelingEnabled();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        return this.player.isReleased();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(androidx.media3.exoplayer.image.ImageOutput imageOutput) {
        blockUntilConstructorFinished();
        this.player.setImageOutput(imageOutput);
    }

    void setThrowsWhenUsingWrongThread(boolean z) {
        blockUntilConstructorFinished();
        this.player.setThrowsWhenUsingWrongThread(z);
    }

    private void blockUntilConstructorFinished() {
        this.constructorFinished.blockUninterruptible();
    }
}
