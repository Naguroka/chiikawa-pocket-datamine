package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class ExoPlayerImpl extends androidx.media3.common.BasePlayer implements androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent, androidx.media3.exoplayer.ExoPlayer.VideoComponent, androidx.media3.exoplayer.ExoPlayer.TextComponent, androidx.media3.exoplayer.ExoPlayer.DeviceComponent {
    private static final java.lang.String TAG = "ExoPlayerImpl";
    private final androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector;
    private final android.content.Context applicationContext;
    private final android.os.Looper applicationLooper;
    private androidx.media3.common.AudioAttributes audioAttributes;
    private final androidx.media3.exoplayer.AudioBecomingNoisyManager audioBecomingNoisyManager;
    private androidx.media3.exoplayer.DecoderCounters audioDecoderCounters;
    private final androidx.media3.exoplayer.AudioFocusManager audioFocusManager;
    private androidx.media3.common.Format audioFormat;
    private android.media.AudioManager audioManager;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private int audioSessionId;
    private androidx.media3.common.Player.Commands availableCommands;
    private final androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter;
    private androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener;
    private final androidx.media3.common.util.Clock clock;
    private final androidx.media3.exoplayer.ExoPlayerImpl.ComponentListener componentListener;
    private final androidx.media3.common.util.ConditionVariable constructorFinished;
    private androidx.media3.common.text.CueGroup currentCueGroup;
    private final long detachSurfaceTimeoutMs;
    private androidx.media3.common.DeviceInfo deviceInfo;
    final androidx.media3.exoplayer.trackselection.TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private final androidx.media3.exoplayer.ExoPlayerImpl.FrameMetadataListener frameMetadataListener;
    private boolean hasNotifiedFullWrongThreadWarning;
    private final androidx.media3.exoplayer.ExoPlayerImplInternal internalPlayer;
    private boolean isPriorityTaskManagerRegistered;
    private android.media.AudioTrack keepSessionIdAudioTrack;
    private final androidx.media3.common.util.ListenerSet<androidx.media3.common.Player.Listener> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private final long maxSeekToPreviousPositionMs;
    private androidx.media3.common.MediaMetadata mediaMetadata;
    private final androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory;
    private final java.util.List<androidx.media3.exoplayer.ExoPlayerImpl.MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;
    private android.view.Surface ownedSurface;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private final androidx.media3.common.Timeline.Period period;
    final androidx.media3.common.Player.Commands permanentAvailableCommands;
    private androidx.media3.exoplayer.PlaybackInfo playbackInfo;
    private final androidx.media3.common.util.HandlerWrapper playbackInfoUpdateHandler;
    private final androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private boolean playerReleased;
    private androidx.media3.common.MediaMetadata playlistMetadata;
    private androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration;
    private int priority;
    private androidx.media3.common.PriorityTaskManager priorityTaskManager;
    private final androidx.media3.exoplayer.Renderer[] renderers;
    private int repeatMode;
    private final long seekBackIncrementMs;
    private final long seekForwardIncrementMs;
    private androidx.media3.exoplayer.SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder;
    private boolean skipSilenceEnabled;
    private androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView sphericalGLSurfaceView;
    private androidx.media3.common.MediaMetadata staticAndDynamicMediaMetadata;
    private final androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager;
    private final boolean suppressPlaybackOnUnsuitableOutput;
    private android.view.SurfaceHolder surfaceHolder;
    private boolean surfaceHolderSurfaceIsVideoOutput;
    private androidx.media3.common.util.Size surfaceSize;
    private android.view.TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    private final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector;
    private final boolean useLazyPreparation;
    private int videoChangeFrameRateStrategy;
    private androidx.media3.exoplayer.DecoderCounters videoDecoderCounters;
    private androidx.media3.common.Format videoFormat;
    private androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener;
    private java.lang.Object videoOutput;
    private int videoScalingMode;
    private androidx.media3.common.VideoSize videoSize;
    private float volume;
    private final androidx.media3.exoplayer.WakeLockManager wakeLockManager;
    private final androidx.media3.exoplayer.WifiLockManager wifiLockManager;
    private final androidx.media3.common.Player wrappingPlayer;

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPlayWhenReadyChangeReason(int i) {
        return i == -1 ? 2 : 1;
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExoPlayerImpl(androidx.media3.exoplayer.ExoPlayer.Builder builder, androidx.media3.common.Player player) {
        androidx.media3.exoplayer.analytics.PlayerId playerIdRegisterMediaMetricsListener;
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager;
        androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable();
        this.constructorFinished = conditionVariable;
        try {
            androidx.media3.common.util.Log.i(TAG, "Init " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + com.ironsource.y8.i.e);
            android.content.Context applicationContext = builder.context.getApplicationContext();
            this.applicationContext = applicationContext;
            androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollectorApply = builder.analyticsCollectorFunction.apply(builder.clock);
            this.analyticsCollector = analyticsCollectorApply;
            this.priority = builder.priority;
            this.priorityTaskManager = builder.priorityTaskManager;
            this.audioAttributes = builder.audioAttributes;
            this.videoScalingMode = builder.videoScalingMode;
            this.videoChangeFrameRateStrategy = builder.videoChangeFrameRateStrategy;
            this.skipSilenceEnabled = builder.skipSilenceEnabled;
            this.detachSurfaceTimeoutMs = builder.detachSurfaceTimeoutMs;
            androidx.media3.exoplayer.ExoPlayerImpl.ComponentListener componentListener = new androidx.media3.exoplayer.ExoPlayerImpl.ComponentListener();
            this.componentListener = componentListener;
            androidx.media3.exoplayer.ExoPlayerImpl.FrameMetadataListener frameMetadataListener = new androidx.media3.exoplayer.ExoPlayerImpl.FrameMetadataListener();
            this.frameMetadataListener = frameMetadataListener;
            android.os.Handler handler = new android.os.Handler(builder.looper);
            androidx.media3.exoplayer.Renderer[] rendererArrCreateRenderers = builder.renderersFactorySupplier.get().createRenderers(handler, componentListener, componentListener, componentListener, componentListener);
            this.renderers = rendererArrCreateRenderers;
            androidx.media3.common.util.Assertions.checkState(rendererArrCreateRenderers.length > 0);
            androidx.media3.exoplayer.trackselection.TrackSelector trackSelector = builder.trackSelectorSupplier.get();
            this.trackSelector = trackSelector;
            this.mediaSourceFactory = builder.mediaSourceFactorySupplier.get();
            androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter = builder.bandwidthMeterSupplier.get();
            this.bandwidthMeter = bandwidthMeter;
            this.useLazyPreparation = builder.useLazyPreparation;
            this.seekParameters = builder.seekParameters;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.pauseAtEndOfMediaItems = builder.pauseAtEndOfMediaItems;
            android.os.Looper looper = builder.looper;
            this.applicationLooper = looper;
            androidx.media3.common.util.Clock clock = builder.clock;
            this.clock = clock;
            androidx.media3.common.Player player2 = player == null ? this : player;
            this.wrappingPlayer = player2;
            boolean z = builder.suppressPlaybackOnUnsuitableOutput;
            this.suppressPlaybackOnUnsuitableOutput = z;
            this.listeners = new androidx.media3.common.util.ListenerSet<>(looper, clock, new androidx.media3.common.util.ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda24
                @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
                public final void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
                    this.f$0.m114lambda$new$0$androidxmedia3exoplayerExoPlayerImpl((androidx.media3.common.Player.Listener) obj, flagSet);
                }
            });
            this.audioOffloadListeners = new java.util.concurrent.CopyOnWriteArraySet<>();
            this.mediaSourceHolderSnapshots = new java.util.ArrayList();
            this.shuffleOrder = new androidx.media3.exoplayer.source.ShuffleOrder.DefaultShuffleOrder(0);
            this.preloadConfiguration = androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration.DEFAULT;
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = new androidx.media3.exoplayer.trackselection.TrackSelectorResult(new androidx.media3.exoplayer.RendererConfiguration[rendererArrCreateRenderers.length], new androidx.media3.exoplayer.trackselection.ExoTrackSelection[rendererArrCreateRenderers.length], androidx.media3.common.Tracks.EMPTY, null);
            this.emptyTrackSelectorResult = trackSelectorResult;
            this.period = new androidx.media3.common.Timeline.Period();
            androidx.media3.common.Player.Commands commandsBuild = new androidx.media3.common.Player.Commands.Builder().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).addIf(29, trackSelector.isSetParametersSupported()).addIf(23, builder.deviceVolumeControlEnabled).addIf(25, builder.deviceVolumeControlEnabled).addIf(33, builder.deviceVolumeControlEnabled).addIf(26, builder.deviceVolumeControlEnabled).addIf(34, builder.deviceVolumeControlEnabled).build();
            this.permanentAvailableCommands = commandsBuild;
            this.availableCommands = new androidx.media3.common.Player.Commands.Builder().addAll(commandsBuild).add(4).add(10).build();
            this.playbackInfoUpdateHandler = clock.createHandler(looper, null);
            androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener = new androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda25
                @Override // androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener
                public final void onPlaybackInfoUpdate(androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
                    this.f$0.m116lambda$new$2$androidxmedia3exoplayerExoPlayerImpl(playbackInfoUpdate);
                }
            };
            this.playbackInfoUpdateListener = playbackInfoUpdateListener;
            this.playbackInfo = androidx.media3.exoplayer.PlaybackInfo.createDummy(trackSelectorResult);
            analyticsCollectorApply.setPlayer(player2, looper);
            if (androidx.media3.common.util.Util.SDK_INT < 31) {
                playerIdRegisterMediaMetricsListener = new androidx.media3.exoplayer.analytics.PlayerId(builder.playerName);
            } else {
                playerIdRegisterMediaMetricsListener = androidx.media3.exoplayer.ExoPlayerImpl.Api31.registerMediaMetricsListener(applicationContext, this, builder.usePlatformDiagnostics, builder.playerName);
            }
            androidx.media3.exoplayer.ExoPlayerImplInternal exoPlayerImplInternal = new androidx.media3.exoplayer.ExoPlayerImplInternal(rendererArrCreateRenderers, trackSelector, trackSelectorResult, builder.loadControlSupplier.get(), bandwidthMeter, this.repeatMode, this.shuffleModeEnabled, analyticsCollectorApply, this.seekParameters, builder.livePlaybackSpeedControl, builder.releaseTimeoutMs, this.pauseAtEndOfMediaItems, builder.dynamicSchedulingEnabled, looper, clock, playbackInfoUpdateListener, playerIdRegisterMediaMetricsListener, builder.playbackLooper, this.preloadConfiguration);
            this.internalPlayer = exoPlayerImplInternal;
            this.volume = 1.0f;
            this.repeatMode = 0;
            this.mediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
            this.playlistMetadata = androidx.media3.common.MediaMetadata.EMPTY;
            this.staticAndDynamicMediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
            this.maskingWindowIndex = -1;
            if (androidx.media3.common.util.Util.SDK_INT < 21) {
                this.audioSessionId = initializeKeepSessionIdAudioTrack(0);
            } else {
                this.audioSessionId = androidx.media3.common.util.Util.generateAudioSessionIdV21(applicationContext);
            }
            this.currentCueGroup = androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
            this.throwsWhenUsingWrongThread = true;
            addListener(analyticsCollectorApply);
            bandwidthMeter.addEventListener(new android.os.Handler(looper), analyticsCollectorApply);
            addAudioOffloadListener(componentListener);
            if (builder.foregroundModeTimeoutMs > 0) {
                exoPlayerImplInternal.experimentalSetForegroundModeTimeoutMs(builder.foregroundModeTimeoutMs);
            }
            androidx.media3.exoplayer.AudioBecomingNoisyManager audioBecomingNoisyManager = new androidx.media3.exoplayer.AudioBecomingNoisyManager(builder.context, handler, componentListener);
            this.audioBecomingNoisyManager = audioBecomingNoisyManager;
            audioBecomingNoisyManager.setEnabled(builder.handleAudioBecomingNoisy);
            androidx.media3.exoplayer.AudioFocusManager audioFocusManager = new androidx.media3.exoplayer.AudioFocusManager(builder.context, handler, componentListener);
            this.audioFocusManager = audioFocusManager;
            audioFocusManager.setAudioAttributes(builder.handleAudioFocus ? this.audioAttributes : null);
            if (!z || androidx.media3.common.util.Util.SDK_INT < 23) {
                streamVolumeManager = null;
            } else {
                android.media.AudioManager audioManager = (android.media.AudioManager) applicationContext.getSystemService("audio");
                this.audioManager = audioManager;
                streamVolumeManager = null;
                androidx.media3.exoplayer.ExoPlayerImpl.Api23.registerAudioDeviceCallback(audioManager, new androidx.media3.exoplayer.ExoPlayerImpl.NoSuitableOutputPlaybackSuppressionAudioDeviceCallback(), new android.os.Handler(looper));
            }
            if (builder.deviceVolumeControlEnabled) {
                androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager2 = new androidx.media3.exoplayer.StreamVolumeManager(builder.context, handler, componentListener);
                this.streamVolumeManager = streamVolumeManager2;
                streamVolumeManager2.setStreamType(androidx.media3.common.util.Util.getStreamTypeForAudioUsage(this.audioAttributes.usage));
            } else {
                this.streamVolumeManager = streamVolumeManager;
            }
            androidx.media3.exoplayer.WakeLockManager wakeLockManager = new androidx.media3.exoplayer.WakeLockManager(builder.context);
            this.wakeLockManager = wakeLockManager;
            wakeLockManager.setEnabled(builder.wakeMode != 0);
            androidx.media3.exoplayer.WifiLockManager wifiLockManager = new androidx.media3.exoplayer.WifiLockManager(builder.context);
            this.wifiLockManager = wifiLockManager;
            wifiLockManager.setEnabled(builder.wakeMode == 2);
            this.deviceInfo = createDeviceInfo(this.streamVolumeManager);
            this.videoSize = androidx.media3.common.VideoSize.UNKNOWN;
            this.surfaceSize = androidx.media3.common.util.Size.UNKNOWN;
            trackSelector.setAudioAttributes(this.audioAttributes);
            sendRendererMessage(1, 10, java.lang.Integer.valueOf(this.audioSessionId));
            sendRendererMessage(2, 10, java.lang.Integer.valueOf(this.audioSessionId));
            sendRendererMessage(1, 3, this.audioAttributes);
            sendRendererMessage(2, 4, java.lang.Integer.valueOf(this.videoScalingMode));
            sendRendererMessage(2, 5, java.lang.Integer.valueOf(this.videoChangeFrameRateStrategy));
            sendRendererMessage(1, 9, java.lang.Boolean.valueOf(this.skipSilenceEnabled));
            sendRendererMessage(2, 7, frameMetadataListener);
            sendRendererMessage(6, 8, frameMetadataListener);
            sendRendererMessage(16, java.lang.Integer.valueOf(this.priority));
            conditionVariable.open();
        } catch (java.lang.Throwable th) {
            this.constructorFinished.open();
            throw th;
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-exoplayer-ExoPlayerImpl, reason: not valid java name */
    /* synthetic */ void m114lambda$new$0$androidxmedia3exoplayerExoPlayerImpl(androidx.media3.common.Player.Listener listener, androidx.media3.common.FlagSet flagSet) {
        listener.onEvents(this.wrappingPlayer, new androidx.media3.common.Player.Events(flagSet));
    }

    /* JADX INFO: renamed from: lambda$new$2$androidx-media3-exoplayer-ExoPlayerImpl, reason: not valid java name */
    /* synthetic */ void m116lambda$new$2$androidxmedia3exoplayerExoPlayerImpl(final androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.playbackInfoUpdateHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m115lambda$new$1$androidxmedia3exoplayerExoPlayerImpl(playbackInfoUpdate);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public androidx.media3.exoplayer.ExoPlayer.AudioComponent getAudioComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public androidx.media3.exoplayer.ExoPlayer.VideoComponent getVideoComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public androidx.media3.exoplayer.ExoPlayer.TextComponent getTextComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public androidx.media3.exoplayer.ExoPlayer.DeviceComponent getDeviceComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        verifyApplicationThread();
        return this.playbackInfo.sleepingForOffload;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public android.os.Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    @Override // androidx.media3.common.Player
    public android.os.Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.util.Clock getClock() {
        return this.clock;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.audioOffloadListeners.add(audioOffloadListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener) {
        verifyApplicationThread();
        this.audioOffloadListeners.remove(audioOffloadListener);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return this.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackState() {
        verifyApplicationThread();
        return this.playbackInfo.playbackState;
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return this.playbackInfo.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.exoplayer.ExoPlaybackException getPlayerError() {
        verifyApplicationThread();
        return this.playbackInfo.playbackError;
    }

    @Override // androidx.media3.common.Player
    public void prepare() {
        verifyApplicationThread();
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, 2);
        updatePlayWhenReady(playWhenReady, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
        if (this.playbackInfo.playbackState != 1) {
            return;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlaybackError = this.playbackInfo.copyWithPlaybackError(null);
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlaybackState = playbackInfoCopyWithPlaybackError.copyWithPlaybackState(playbackInfoCopyWithPlaybackError.timeline.isEmpty() ? 4 : 2);
        this.pendingOperationAcks++;
        this.internalPlayer.prepare();
        updatePlaybackInfo(playbackInfoCopyWithPlaybackState, 1, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public void prepare(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSource(mediaSource);
        prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public void prepare(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z, boolean z2) {
        verifyApplicationThread();
        setMediaSource(mediaSource, z);
        prepare();
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), z);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), i, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSources(java.util.Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, long j) {
        verifyApplicationThread();
        setMediaSources(java.util.Collections.singletonList(mediaSource), 0, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z) {
        verifyApplicationThread();
        setMediaSources(java.util.Collections.singletonList(mediaSource), z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        verifyApplicationThread();
        setMediaSources(list, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, boolean z) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, -1, androidx.media3.common.C.TIME_UNSET, z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, int i, long j) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, i, j, false);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        addMediaSources(i, createMediaSources(list));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(java.util.Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(int i, androidx.media3.exoplayer.source.MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(i, java.util.Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        verifyApplicationThread();
        addMediaSources(this.mediaSourceHolderSnapshots.size(), list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(int i, java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkArgument(i >= 0);
        int iMin = java.lang.Math.min(i, this.mediaSourceHolderSnapshots.size());
        if (this.mediaSourceHolderSnapshots.isEmpty()) {
            setMediaSources(list, this.maskingWindowIndex == -1);
        } else {
            updatePlaybackInfo(addMediaSourcesInternal(this.playbackInfo, iMin, list), 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
        }
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItems(int i, int i2) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i2 >= i);
        int size = this.mediaSourceHolderSnapshots.size();
        int iMin = java.lang.Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoRemoveMediaItemsInternal = removeMediaItemsInternal(this.playbackInfo, i, iMin);
        updatePlaybackInfo(playbackInfoRemoveMediaItemsInternal, 0, !playbackInfoRemoveMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(playbackInfoRemoveMediaItemsInternal), -1, false);
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItems(int i, int i2, int i3) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= i2 && i3 >= 0);
        int size = this.mediaSourceHolderSnapshots.size();
        int iMin = java.lang.Math.min(i2, size);
        int iMin2 = java.lang.Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        this.pendingOperationAcks++;
        androidx.media3.common.util.Util.moveItems(this.mediaSourceHolderSnapshots, i, iMin, iMin2);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(currentTimeline, timelineCreateMaskingTimeline, getCurrentWindowIndexInternal(playbackInfo), getContentPositionInternal(this.playbackInfo)));
        this.internalPlayer.moveMediaSources(i, iMin, iMin2, this.shuffleOrder);
        updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i2 >= i);
        int size = this.mediaSourceHolderSnapshots.size();
        if (i > size) {
            return;
        }
        int iMin = java.lang.Math.min(i2, size);
        if (canUpdateMediaSourcesWithMediaItems(i, iMin, list)) {
            updateMediaSourcesWithMediaItems(i, iMin, list);
            return;
        }
        java.util.List<androidx.media3.exoplayer.source.MediaSource> listCreateMediaSources = createMediaSources(list);
        if (this.mediaSourceHolderSnapshots.isEmpty()) {
            setMediaSources(listCreateMediaSources, this.maskingWindowIndex == -1);
        } else {
            androidx.media3.exoplayer.PlaybackInfo playbackInfoRemoveMediaItemsInternal = removeMediaItemsInternal(addMediaSourcesInternal(this.playbackInfo, iMin, listCreateMediaSources), i, iMin);
            updatePlaybackInfo(playbackInfoRemoveMediaItemsInternal, 0, !playbackInfoRemoveMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(playbackInfoRemoveMediaItemsInternal), -1, false);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkArgument(shuffleOrder.getLength() == this.mediaSourceHolderSnapshots.size());
        this.shuffleOrder = shuffleOrder;
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, timelineCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(timelineCreateMaskingTimeline, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.pendingOperationAcks++;
        this.internalPlayer.setShuffleOrder(shuffleOrder);
        updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z) {
        verifyApplicationThread();
        if (this.pauseAtEndOfMediaItems == z) {
            return;
        }
        this.pauseAtEndOfMediaItems = z;
        this.internalPlayer.setPauseAtEndOfWindow(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        verifyApplicationThread();
        return this.pauseAtEndOfMediaItems;
    }

    @Override // androidx.media3.common.Player
    public void setPlayWhenReady(boolean z) {
        verifyApplicationThread();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(z, getPlaybackState());
        updatePlayWhenReady(z, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
    }

    @Override // androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return this.playbackInfo.playWhenReady;
    }

    @Override // androidx.media3.common.Player
    public void setRepeatMode(final int i) {
        verifyApplicationThread();
        if (this.repeatMode != i) {
            this.repeatMode = i;
            this.internalPlayer.setRepeatMode(i);
            this.listeners.queueEvent(8, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda26
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onRepeatModeChanged(i);
                }
            });
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.common.Player
    public int getRepeatMode() {
        verifyApplicationThread();
        return this.repeatMode;
    }

    @Override // androidx.media3.common.Player
    public void setShuffleModeEnabled(final boolean z) {
        verifyApplicationThread();
        if (this.shuffleModeEnabled != z) {
            this.shuffleModeEnabled = z;
            this.internalPlayer.setShuffleModeEnabled(z);
            this.listeners.queueEvent(9, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda17
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onShuffleModeEnabledChanged(z);
                }
            });
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return this.shuffleModeEnabled;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        verifyApplicationThread();
        if (this.preloadConfiguration.equals(preloadConfiguration)) {
            return;
        }
        this.preloadConfiguration = preloadConfiguration;
        this.internalPlayer.setPreloadConfiguration(preloadConfiguration);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration getPreloadConfiguration() {
        return this.preloadConfiguration;
    }

    @Override // androidx.media3.common.Player
    public boolean isLoading() {
        verifyApplicationThread();
        return this.playbackInfo.isLoading;
    }

    @Override // androidx.media3.common.BasePlayer
    public void seekTo(int i, long j, int i2, boolean z) {
        verifyApplicationThread();
        if (i == -1) {
            return;
        }
        androidx.media3.common.util.Assertions.checkArgument(i >= 0);
        androidx.media3.common.Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty() || i < timeline.getWindowCount()) {
            this.analyticsCollector.notifySeekStarted();
            this.pendingOperationAcks++;
            if (isPlayingAd()) {
                androidx.media3.common.util.Log.w(TAG, "seekTo ignored because an ad is playing");
                androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
                playbackInfoUpdate.incrementPendingOperationAcks(1);
                this.playbackInfoUpdateListener.onPlaybackInfoUpdate(playbackInfoUpdate);
                return;
            }
            androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlaybackState = this.playbackInfo;
            if (playbackInfoCopyWithPlaybackState.playbackState == 3 || (this.playbackInfo.playbackState == 4 && !timeline.isEmpty())) {
                playbackInfoCopyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfoCopyWithPlaybackState, timeline, maskWindowPositionMsOrGetPeriodPositionUs(timeline, i, j));
            this.internalPlayer.seekTo(timeline, i, androidx.media3.common.util.Util.msToUs(j));
            updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, true, 1, getCurrentPositionUsInternal(playbackInfoMaskTimelineAndPosition), currentMediaItemIndex, z);
        }
    }

    @Override // androidx.media3.common.Player
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return this.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return this.seekForwardIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return this.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        if (playbackParameters == null) {
            playbackParameters = androidx.media3.common.PlaybackParameters.DEFAULT;
        }
        if (this.playbackInfo.playbackParameters.equals(playbackParameters)) {
            return;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlaybackParameters = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        this.pendingOperationAcks++;
        this.internalPlayer.setPlaybackParameters(playbackParameters);
        updatePlaybackInfo(playbackInfoCopyWithPlaybackParameters, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return this.playbackInfo.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekParameters(androidx.media3.exoplayer.SeekParameters seekParameters) {
        verifyApplicationThread();
        if (seekParameters == null) {
            seekParameters = androidx.media3.exoplayer.SeekParameters.DEFAULT;
        }
        if (this.seekParameters.equals(seekParameters)) {
            return;
        }
        this.seekParameters = seekParameters;
        this.internalPlayer.setSeekParameters(seekParameters);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.SeekParameters getSeekParameters() {
        verifyApplicationThread();
        return this.seekParameters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean z) {
        verifyApplicationThread();
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (this.internalPlayer.setForegroundMode(z)) {
                return;
            }
            stopInternal(androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(new androidx.media3.exoplayer.ExoTimeoutException(2), 1003));
        }
    }

    @Override // androidx.media3.common.Player
    public void stop() {
        verifyApplicationThread();
        this.audioFocusManager.updateAudioFocus(getPlayWhenReady(), 1);
        stopInternal(null);
        this.currentCueGroup = new androidx.media3.common.text.CueGroup(com.google.common.collect.ImmutableList.of(), this.playbackInfo.positionUs);
    }

    @Override // androidx.media3.common.Player
    public void release() {
        android.media.AudioTrack audioTrack;
        androidx.media3.common.util.Log.i(TAG, "Release " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + "] [" + androidx.media3.common.MediaLibraryInfo.registeredModules() + com.ironsource.y8.i.e);
        verifyApplicationThread();
        if (androidx.media3.common.util.Util.SDK_INT < 21 && (audioTrack = this.keepSessionIdAudioTrack) != null) {
            audioTrack.release();
            this.keepSessionIdAudioTrack = null;
        }
        this.audioBecomingNoisyManager.setEnabled(false);
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.release();
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
        this.audioFocusManager.release();
        if (!this.internalPlayer.release()) {
            this.listeners.sendEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda16
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlayerError(androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(new androidx.media3.exoplayer.ExoTimeoutException(1), 1003));
                }
            });
        }
        this.listeners.release();
        this.playbackInfoUpdateHandler.removeCallbacksAndMessages(null);
        this.bandwidthMeter.removeEventListener(this.analyticsCollector);
        if (this.playbackInfo.sleepingForOffload) {
            this.playbackInfo = this.playbackInfo.copyWithEstimatedPosition();
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(1);
        this.playbackInfo = playbackInfoCopyWithPlaybackState;
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfoCopyWithPlaybackState.copyWithLoadingMediaPeriodId(playbackInfoCopyWithPlaybackState.periodId);
        this.playbackInfo = playbackInfoCopyWithLoadingMediaPeriodId;
        playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
        this.playbackInfo.totalBufferedDurationUs = 0L;
        this.analyticsCollector.release();
        this.trackSelector.release();
        removeSurfaceCallbacks();
        android.view.Surface surface = this.ownedSurface;
        if (surface != null) {
            surface.release();
            this.ownedSurface = null;
        }
        if (this.isPriorityTaskManagerRegistered) {
            ((androidx.media3.common.PriorityTaskManager) androidx.media3.common.util.Assertions.checkNotNull(this.priorityTaskManager)).remove(this.priority);
            this.isPriorityTaskManagerRegistered = false;
        }
        this.currentCueGroup = androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
        this.playerReleased = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        verifyApplicationThread();
        return this.playerReleased;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.PlayerMessage createMessage(androidx.media3.exoplayer.PlayerMessage.Target target) {
        verifyApplicationThread();
        return createMessageInternal(target);
    }

    @Override // androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingPeriodIndex;
        }
        return this.playbackInfo.timeline.getIndexOfPeriod(this.playbackInfo.periodId.periodUid);
    }

    @Override // androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    @Override // androidx.media3.common.Player
    public long getDuration() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
            this.playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
            return androidx.media3.common.util.Util.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
        }
        return getContentDuration();
    }

    @Override // androidx.media3.common.Player
    public long getCurrentPosition() {
        verifyApplicationThread();
        return androidx.media3.common.util.Util.usToMs(getCurrentPositionUsInternal(this.playbackInfo));
    }

    @Override // androidx.media3.common.Player
    public long getBufferedPosition() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            if (this.playbackInfo.loadingMediaPeriodId.equals(this.playbackInfo.periodId)) {
                return androidx.media3.common.util.Util.usToMs(this.playbackInfo.bufferedPositionUs);
            }
            return getDuration();
        }
        return getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return androidx.media3.common.util.Util.usToMs(this.playbackInfo.totalBufferedDurationUs);
    }

    @Override // androidx.media3.common.Player
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return this.playbackInfo.periodId.isAd();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public long getContentPosition() {
        verifyApplicationThread();
        return getContentPositionInternal(this.playbackInfo);
    }

    @Override // androidx.media3.common.Player
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        if (this.playbackInfo.loadingMediaPeriodId.windowSequenceNumber != this.playbackInfo.periodId.windowSequenceNumber) {
            return this.playbackInfo.timeline.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
        }
        long j = this.playbackInfo.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            androidx.media3.common.Timeline.Period periodByUid = this.playbackInfo.timeline.getPeriodByUid(this.playbackInfo.loadingMediaPeriodId.periodUid, this.period);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
            j = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.durationUs : adGroupTimeUs;
        }
        return androidx.media3.common.util.Util.usToMs(periodPositionUsToWindowPositionUs(this.playbackInfo.timeline, this.playbackInfo.loadingMediaPeriodId, j));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        verifyApplicationThread();
        return this.renderers.length;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererType(int i) {
        verifyApplicationThread();
        return this.renderers[i].getTrackType();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.Renderer getRenderer(int i) {
        verifyApplicationThread();
        return this.renderers[i];
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.trackselection.TrackSelector getTrackSelector() {
        verifyApplicationThread();
        return this.trackSelector;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.source.TrackGroupArray getCurrentTrackGroups() {
        verifyApplicationThread();
        return this.playbackInfo.trackGroups;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.trackselection.TrackSelectionArray getCurrentTrackSelections() {
        verifyApplicationThread();
        return new androidx.media3.exoplayer.trackselection.TrackSelectionArray(this.playbackInfo.trackSelectorResult.selections);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Tracks getCurrentTracks() {
        verifyApplicationThread();
        return this.playbackInfo.trackSelectorResult.tracks;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        return this.trackSelector.getParameters();
    }

    @Override // androidx.media3.common.Player
    public void setTrackSelectionParameters(final androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        if (!this.trackSelector.isSetParametersSupported() || trackSelectionParameters.equals(this.trackSelector.getParameters())) {
            return;
        }
        this.trackSelector.setParameters(trackSelectionParameters);
        this.listeners.sendEvent(19, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda11
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.common.Player.Listener) obj).onTrackSelectionParametersChanged(trackSelectionParameters);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return this.mediaMetadata;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return this.playlistMetadata;
    }

    @Override // androidx.media3.common.Player
    public void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(mediaMetadata);
        if (mediaMetadata.equals(this.playlistMetadata)) {
            return;
        }
        this.playlistMetadata = mediaMetadata;
        this.listeners.sendEvent(15, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda23
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                this.f$0.m117x47ee3208((androidx.media3.common.Player.Listener) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setPlaylistMetadata$7$androidx-media3-exoplayer-ExoPlayerImpl, reason: not valid java name */
    /* synthetic */ void m117x47ee3208(androidx.media3.common.Player.Listener listener) {
        listener.onPlaylistMetadataChanged(this.playlistMetadata);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return this.playbackInfo.timeline;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoEffects(java.util.List<androidx.media3.common.Effect> list) {
        verifyApplicationThread();
        try {
            java.lang.Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(androidx.media3.common.VideoFrameProcessor.Factory.class);
            sendRendererMessage(2, 13, list);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalStateException("Could not find required lib-effect dependencies.", e);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int i) {
        verifyApplicationThread();
        this.videoScalingMode = i;
        sendRendererMessage(2, 4, java.lang.Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
        verifyApplicationThread();
        return this.videoScalingMode;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoChangeFrameRateStrategy(int i) {
        verifyApplicationThread();
        if (this.videoChangeFrameRateStrategy == i) {
            return;
        }
        this.videoChangeFrameRateStrategy = i;
        sendRendererMessage(2, 5, java.lang.Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public int getVideoChangeFrameRateStrategy() {
        verifyApplicationThread();
        return this.videoChangeFrameRateStrategy;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.VideoSize getVideoSize() {
        verifyApplicationThread();
        return this.videoSize;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.util.Size getSurfaceSize() {
        verifyApplicationThread();
        return this.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface() {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(null);
        maybeNotifySurfaceSizeChanged(0, 0);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        if (surface == null || surface != this.videoOutput) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(surface);
        int i = surface == null ? 0 : -1;
        maybeNotifySurfaceSizeChanged(i, i);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.surfaceHolderSurfaceIsVideoOutput = true;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        android.view.Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            setVideoOutputInternal(surface);
            android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        } else {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null || surfaceHolder != this.surfaceHolder) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        if (surfaceView instanceof androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer) {
            removeSurfaceCallbacks();
            setVideoOutputInternal(surfaceView);
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView) {
                removeSurfaceCallbacks();
                this.sphericalGLSurfaceView = (androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView) surfaceView;
                createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(this.sphericalGLSurfaceView).send();
                this.sphericalGLSurfaceView.addVideoSurfaceListener(this.componentListener);
                setVideoOutputInternal(this.sphericalGLSurfaceView.getVideoSurface());
                setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
                return;
            }
            setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // androidx.media3.common.Player
    public void setVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.textureView = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            androidx.media3.common.util.Log.w(TAG, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.componentListener);
        android.graphics.SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setSurfaceTextureInternal(surfaceTexture);
            maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // androidx.media3.common.Player
    public void clearVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null || textureView != this.textureView) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.common.Player
    public void setAudioAttributes(final androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        if (!androidx.media3.common.util.Util.areEqual(this.audioAttributes, audioAttributes)) {
            this.audioAttributes = audioAttributes;
            sendRendererMessage(1, 3, audioAttributes);
            androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
            if (streamVolumeManager != null) {
                streamVolumeManager.setStreamType(androidx.media3.common.util.Util.getStreamTypeForAudioUsage(audioAttributes.usage));
            }
            this.listeners.queueEvent(20, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda22
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onAudioAttributesChanged(audioAttributes);
                }
            });
        }
        this.audioFocusManager.setAudioAttributes(z ? audioAttributes : null);
        this.trackSelector.setAudioAttributes(audioAttributes);
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, getPlaybackState());
        updatePlayWhenReady(playWhenReady, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
        this.listeners.flushEvents();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAudioSessionId(final int i) {
        verifyApplicationThread();
        if (this.audioSessionId == i) {
            return;
        }
        if (i == 0) {
            if (androidx.media3.common.util.Util.SDK_INT < 21) {
                i = initializeKeepSessionIdAudioTrack(0);
            } else {
                i = androidx.media3.common.util.Util.generateAudioSessionIdV21(this.applicationContext);
            }
        } else if (androidx.media3.common.util.Util.SDK_INT < 21) {
            initializeKeepSessionIdAudioTrack(i);
        }
        this.audioSessionId = i;
        sendRendererMessage(1, 10, java.lang.Integer.valueOf(i));
        sendRendererMessage(2, 10, java.lang.Integer.valueOf(i));
        this.listeners.sendEvent(21, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.common.Player.Listener) obj).onAudioSessionIdChanged(i);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
        verifyApplicationThread();
        return this.audioSessionId;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 6, auxEffectInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
        verifyApplicationThread();
        setAuxEffectInfo(new androidx.media3.common.AuxEffectInfo(0, 0.0f));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreferredAudioDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 12, audioDeviceInfo);
    }

    @Override // androidx.media3.common.Player
    public void setVolume(float f) {
        verifyApplicationThread();
        final float fConstrainValue = androidx.media3.common.util.Util.constrainValue(f, 0.0f, 1.0f);
        if (this.volume == fConstrainValue) {
            return;
        }
        this.volume = fConstrainValue;
        sendVolumeToRenderers();
        this.listeners.sendEvent(22, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda19
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.common.Player.Listener) obj).onVolumeChanged(fConstrainValue);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public float getVolume() {
        verifyApplicationThread();
        return this.volume;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
        verifyApplicationThread();
        return this.skipSilenceEnabled;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(final boolean z) {
        verifyApplicationThread();
        if (this.skipSilenceEnabled == z) {
            return;
        }
        this.skipSilenceEnabled = z;
        sendRendererMessage(1, 9, java.lang.Boolean.valueOf(z));
        this.listeners.sendEvent(23, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda20
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.common.Player.Listener) obj).onSkipSilenceEnabledChanged(z);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.analytics.AnalyticsCollector getAnalyticsCollector() {
        verifyApplicationThread();
        return this.analyticsCollector;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        this.analyticsCollector.addListener((androidx.media3.exoplayer.analytics.AnalyticsListener) androidx.media3.common.util.Assertions.checkNotNull(analyticsListener));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        verifyApplicationThread();
        this.analyticsCollector.removeListener((androidx.media3.exoplayer.analytics.AnalyticsListener) androidx.media3.common.util.Assertions.checkNotNull(analyticsListener));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        this.audioBecomingNoisyManager.setEnabled(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriority(int i) {
        verifyApplicationThread();
        if (this.priority == i) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            androidx.media3.common.PriorityTaskManager priorityTaskManager = (androidx.media3.common.PriorityTaskManager) androidx.media3.common.util.Assertions.checkNotNull(this.priorityTaskManager);
            priorityTaskManager.add(i);
            priorityTaskManager.remove(this.priority);
        }
        this.priority = i;
        sendRendererMessage(16, java.lang.Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(androidx.media3.common.PriorityTaskManager priorityTaskManager) {
        verifyApplicationThread();
        if (androidx.media3.common.util.Util.areEqual(this.priorityTaskManager, priorityTaskManager)) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            ((androidx.media3.common.PriorityTaskManager) androidx.media3.common.util.Assertions.checkNotNull(this.priorityTaskManager)).remove(this.priority);
        }
        if (priorityTaskManager != null && isLoading()) {
            priorityTaskManager.add(this.priority);
            this.isPriorityTaskManagerRegistered = true;
        } else {
            this.isPriorityTaskManagerRegistered = false;
        }
        this.priorityTaskManager = priorityTaskManager;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.Format getVideoFormat() {
        verifyApplicationThread();
        return this.videoFormat;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.Format getAudioFormat() {
        verifyApplicationThread();
        return this.audioFormat;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.DecoderCounters getVideoDecoderCounters() {
        verifyApplicationThread();
        return this.videoDecoderCounters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.DecoderCounters getAudioDecoderCounters() {
        verifyApplicationThread();
        return this.audioDecoderCounters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(videoFrameMetadataListener).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        if (this.videoFrameMetadataListener != videoFrameMetadataListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(null).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        this.cameraMotionListener = cameraMotionListener;
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(cameraMotionListener).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        if (this.cameraMotionListener != cameraMotionListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(null).send();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.text.CueGroup getCurrentCues() {
        verifyApplicationThread();
        return this.currentCueGroup;
    }

    @Override // androidx.media3.common.Player
    public void addListener(androidx.media3.common.Player.Listener listener) {
        this.listeners.add((androidx.media3.common.Player.Listener) androidx.media3.common.util.Assertions.checkNotNull(listener));
    }

    @Override // androidx.media3.common.Player
    public void removeListener(androidx.media3.common.Player.Listener listener) {
        verifyApplicationThread();
        this.listeners.remove((androidx.media3.common.Player.Listener) androidx.media3.common.util.Assertions.checkNotNull(listener));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setWakeMode(int i) {
        verifyApplicationThread();
        if (i == 0) {
            this.wakeLockManager.setEnabled(false);
            this.wifiLockManager.setEnabled(false);
        } else if (i == 1) {
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(false);
        } else {
            if (i != 2) {
                return;
            }
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(true);
        }
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return this.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public int getDeviceVolume() {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.getVolume();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.isMuted();
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceVolume(int i) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i, 1);
        }
    }

    @Override // androidx.media3.common.Player
    public void setDeviceVolume(int i, int i2) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i, i2);
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(1);
        }
    }

    @Override // androidx.media3.common.Player
    public void increaseDeviceVolume(int i) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(i);
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(1);
        }
    }

    @Override // androidx.media3.common.Player
    public void decreaseDeviceVolume(int i) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(i);
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceMuted(boolean z) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z, 1);
        }
    }

    @Override // androidx.media3.common.Player
    public void setDeviceMuted(boolean z, int i) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z, i);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        verifyApplicationThread();
        for (androidx.media3.exoplayer.RendererConfiguration rendererConfiguration : this.playbackInfo.trackSelectorResult.rendererConfigurations) {
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(androidx.media3.exoplayer.image.ImageOutput imageOutput) {
        verifyApplicationThread();
        sendRendererMessage(4, 15, imageOutput);
    }

    void setThrowsWhenUsingWrongThread(boolean z) {
        this.throwsWhenUsingWrongThread = z;
        this.listeners.setThrowsWhenUsingWrongThread(z);
        androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector = this.analyticsCollector;
        if (analyticsCollector instanceof androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector) {
            ((androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector) analyticsCollector).setThrowsWhenUsingWrongThread(z);
        }
    }

    private void stopInternal(androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException) {
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfo.copyWithLoadingMediaPeriodId(playbackInfo.periodId);
        playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
        playbackInfoCopyWithLoadingMediaPeriodId.totalBufferedDurationUs = 0L;
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlaybackState = playbackInfoCopyWithLoadingMediaPeriodId.copyWithPlaybackState(1);
        if (exoPlaybackException != null) {
            playbackInfoCopyWithPlaybackState = playbackInfoCopyWithPlaybackState.copyWithPlaybackError(exoPlaybackException);
        }
        this.pendingOperationAcks++;
        this.internalPlayer.stop();
        updatePlaybackInfo(playbackInfoCopyWithPlaybackState, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    private int getCurrentWindowIndexInternal(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        if (playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowIndex;
        }
        return playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex;
    }

    private long getContentPositionInternal(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        if (playbackInfo.periodId.isAd()) {
            playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period);
            if (playbackInfo.requestedContentPositionUs == androidx.media3.common.C.TIME_UNSET) {
                return playbackInfo.timeline.getWindow(getCurrentWindowIndexInternal(playbackInfo), this.window).getDefaultPositionMs();
            }
            return this.period.getPositionInWindowMs() + androidx.media3.common.util.Util.usToMs(playbackInfo.requestedContentPositionUs);
        }
        return androidx.media3.common.util.Util.usToMs(getCurrentPositionUsInternal(playbackInfo));
    }

    private long getCurrentPositionUsInternal(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        long estimatedPositionUs;
        if (playbackInfo.timeline.isEmpty()) {
            return androidx.media3.common.util.Util.msToUs(this.maskingWindowPositionMs);
        }
        if (playbackInfo.sleepingForOffload) {
            estimatedPositionUs = playbackInfo.getEstimatedPositionUs();
        } else {
            estimatedPositionUs = playbackInfo.positionUs;
        }
        return playbackInfo.periodId.isAd() ? estimatedPositionUs : periodPositionUsToWindowPositionUs(playbackInfo.timeline, playbackInfo.periodId, estimatedPositionUs);
    }

    private java.util.List<androidx.media3.exoplayer.source.MediaSource> createMediaSources(java.util.List<androidx.media3.common.MediaItem> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.mediaSourceFactory.createMediaSource(list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handlePlaybackInfo, reason: merged with bridge method [inline-methods] */
    public void m115lambda$new$1$androidxmedia3exoplayerExoPlayerImpl(androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        boolean z;
        this.pendingOperationAcks -= playbackInfoUpdate.operationAcks;
        boolean z2 = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.pendingDiscontinuityReason = playbackInfoUpdate.discontinuityReason;
            this.pendingDiscontinuity = true;
        }
        if (this.pendingOperationAcks == 0) {
            androidx.media3.common.Timeline timeline = playbackInfoUpdate.playbackInfo.timeline;
            if (!this.playbackInfo.timeline.isEmpty() && timeline.isEmpty()) {
                this.maskingWindowIndex = -1;
                this.maskingWindowPositionMs = 0L;
                this.maskingPeriodIndex = 0;
            }
            if (!timeline.isEmpty()) {
                java.util.List<androidx.media3.common.Timeline> childTimelines = ((androidx.media3.exoplayer.PlaylistTimeline) timeline).getChildTimelines();
                androidx.media3.common.util.Assertions.checkState(childTimelines.size() == this.mediaSourceHolderSnapshots.size());
                for (int i = 0; i < childTimelines.size(); i++) {
                    this.mediaSourceHolderSnapshots.get(i).updateTimeline(childTimelines.get(i));
                }
            }
            boolean z3 = this.pendingDiscontinuity;
            long jPeriodPositionUsToWindowPositionUs = androidx.media3.common.C.TIME_UNSET;
            if (z3) {
                if (playbackInfoUpdate.playbackInfo.periodId.equals(this.playbackInfo.periodId) && playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs == this.playbackInfo.positionUs) {
                    z2 = false;
                }
                if (z2) {
                    if (timeline.isEmpty() || playbackInfoUpdate.playbackInfo.periodId.isAd()) {
                        jPeriodPositionUsToWindowPositionUs = playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs;
                    } else {
                        jPeriodPositionUsToWindowPositionUs = periodPositionUsToWindowPositionUs(timeline, playbackInfoUpdate.playbackInfo.periodId, playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs);
                    }
                }
                z = z2;
            } else {
                z = false;
            }
            this.pendingDiscontinuity = false;
            updatePlaybackInfo(playbackInfoUpdate.playbackInfo, 1, z, this.pendingDiscontinuityReason, jPeriodPositionUsToWindowPositionUs, -1, false);
        }
    }

    private void updatePlaybackInfo(final androidx.media3.exoplayer.PlaybackInfo playbackInfo, final int i, boolean z, final int i2, long j, int i3, boolean z2) {
        androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = this.playbackInfo;
        this.playbackInfo = playbackInfo;
        boolean z3 = !playbackInfo2.timeline.equals(playbackInfo.timeline);
        android.util.Pair<java.lang.Boolean, java.lang.Integer> pairEvaluateMediaItemTransitionReason = evaluateMediaItemTransitionReason(playbackInfo, playbackInfo2, z, i2, z3, z2);
        boolean zBooleanValue = ((java.lang.Boolean) pairEvaluateMediaItemTransitionReason.first).booleanValue();
        final int iIntValue = ((java.lang.Integer) pairEvaluateMediaItemTransitionReason.second).intValue();
        final androidx.media3.common.MediaItem mediaItem = null;
        if (zBooleanValue) {
            if (!playbackInfo.timeline.isEmpty()) {
                mediaItem = playbackInfo.timeline.getWindow(playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window).mediaItem;
            }
            this.staticAndDynamicMediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
        }
        if (zBooleanValue || !playbackInfo2.staticMetadata.equals(playbackInfo.staticMetadata)) {
            this.staticAndDynamicMediaMetadata = this.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(playbackInfo.staticMetadata).build();
        }
        androidx.media3.common.MediaMetadata mediaMetadataBuildUpdatedMediaMetadata = buildUpdatedMediaMetadata();
        boolean z4 = !mediaMetadataBuildUpdatedMediaMetadata.equals(this.mediaMetadata);
        this.mediaMetadata = mediaMetadataBuildUpdatedMediaMetadata;
        boolean z5 = playbackInfo2.playWhenReady != playbackInfo.playWhenReady;
        boolean z6 = playbackInfo2.playbackState != playbackInfo.playbackState;
        if (z6 || z5) {
            updateWakeAndWifiLock();
        }
        boolean z7 = playbackInfo2.isLoading != playbackInfo.isLoading;
        if (z7) {
            updatePriorityTaskManagerForIsLoadingChange(playbackInfo.isLoading);
        }
        if (z3) {
            this.listeners.queueEvent(0, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda27
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.Player.Listener listener = (androidx.media3.common.Player.Listener) obj;
                    listener.onTimelineChanged(playbackInfo.timeline, i);
                }
            });
        }
        if (z) {
            final androidx.media3.common.Player.PositionInfo previousPositionInfo = getPreviousPositionInfo(i2, playbackInfo2, i3);
            final androidx.media3.common.Player.PositionInfo positionInfo = getPositionInfo(j);
            this.listeners.queueEvent(11, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$13(i2, previousPositionInfo, positionInfo, (androidx.media3.common.Player.Listener) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.listeners.queueEvent(1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda6
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMediaItemTransition(mediaItem, iIntValue);
                }
            });
        }
        if (playbackInfo2.playbackError != playbackInfo.playbackError) {
            this.listeners.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda7
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlayerErrorChanged(playbackInfo.playbackError);
                }
            });
            if (playbackInfo.playbackError != null) {
                this.listeners.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda8
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((androidx.media3.common.Player.Listener) obj).onPlayerError(playbackInfo.playbackError);
                    }
                });
            }
        }
        if (playbackInfo2.trackSelectorResult != playbackInfo.trackSelectorResult) {
            this.trackSelector.onSelectionActivated(playbackInfo.trackSelectorResult.info);
            this.listeners.queueEvent(2, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda9
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onTracksChanged(playbackInfo.trackSelectorResult.tracks);
                }
            });
        }
        if (z4) {
            final androidx.media3.common.MediaMetadata mediaMetadata = this.mediaMetadata;
            this.listeners.queueEvent(14, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda10
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMediaMetadataChanged(mediaMetadata);
                }
            });
        }
        if (z7) {
            this.listeners.queueEvent(3, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda12
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                }
            });
        }
        if (z6 || z5) {
            this.listeners.queueEvent(-1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda13
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.exoplayer.PlaybackInfo playbackInfo3 = playbackInfo;
                    ((androidx.media3.common.Player.Listener) obj).onPlayerStateChanged(playbackInfo3.playWhenReady, playbackInfo3.playbackState);
                }
            });
        }
        if (z6) {
            this.listeners.queueEvent(4, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda14
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackStateChanged(playbackInfo.playbackState);
                }
            });
        }
        if (z5 || playbackInfo2.playWhenReadyChangeReason != playbackInfo.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.exoplayer.PlaybackInfo playbackInfo3 = playbackInfo;
                    ((androidx.media3.common.Player.Listener) obj).onPlayWhenReadyChanged(playbackInfo3.playWhenReady, playbackInfo3.playWhenReadyChangeReason);
                }
            });
        }
        if (playbackInfo2.playbackSuppressionReason != playbackInfo.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackSuppressionReasonChanged(playbackInfo.playbackSuppressionReason);
                }
            });
        }
        if (playbackInfo2.isPlaying() != playbackInfo.isPlaying()) {
            this.listeners.queueEvent(7, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda3
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onIsPlayingChanged(playbackInfo.isPlaying());
                }
            });
        }
        if (!playbackInfo2.playbackParameters.equals(playbackInfo.playbackParameters)) {
            this.listeners.queueEvent(12, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackParametersChanged(playbackInfo.playbackParameters);
                }
            });
        }
        updateAvailableCommands();
        this.listeners.flushEvents();
        if (playbackInfo2.sleepingForOffload != playbackInfo.sleepingForOffload) {
            java.util.Iterator<androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener> it = this.audioOffloadListeners.iterator();
            while (it.hasNext()) {
                it.next().onSleepingForOffloadChanged(playbackInfo.sleepingForOffload);
            }
        }
    }

    static /* synthetic */ void lambda$updatePlaybackInfo$13(int i, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, androidx.media3.common.Player.Listener listener) {
        listener.onPositionDiscontinuity(i);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
    }

    static /* synthetic */ void lambda$updatePlaybackInfo$19(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onLoadingChanged(playbackInfo.isLoading);
        listener.onIsLoadingChanged(playbackInfo.isLoading);
    }

    private androidx.media3.common.Player.PositionInfo getPreviousPositionInfo(int i, androidx.media3.exoplayer.PlaybackInfo playbackInfo, int i2) {
        int i3;
        java.lang.Object obj;
        androidx.media3.common.MediaItem mediaItem;
        java.lang.Object obj2;
        int i4;
        long requestedContentPositionUs;
        long requestedContentPositionUs2;
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        if (playbackInfo.timeline.isEmpty()) {
            i3 = i2;
            obj = null;
            mediaItem = null;
            obj2 = null;
            i4 = -1;
        } else {
            java.lang.Object obj3 = playbackInfo.periodId.periodUid;
            playbackInfo.timeline.getPeriodByUid(obj3, period);
            int i5 = period.windowIndex;
            int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(obj3);
            java.lang.Object obj4 = playbackInfo.timeline.getWindow(i5, this.window).uid;
            mediaItem = this.window.mediaItem;
            obj2 = obj3;
            i4 = indexOfPeriod;
            obj = obj4;
            i3 = i5;
        }
        if (i == 0) {
            if (playbackInfo.periodId.isAd()) {
                requestedContentPositionUs = period.getAdDurationUs(playbackInfo.periodId.adGroupIndex, playbackInfo.periodId.adIndexInAdGroup);
                requestedContentPositionUs2 = getRequestedContentPositionUs(playbackInfo);
            } else {
                if (playbackInfo.periodId.nextAdGroupIndex != -1) {
                    requestedContentPositionUs = getRequestedContentPositionUs(this.playbackInfo);
                } else {
                    requestedContentPositionUs = period.positionInWindowUs + period.durationUs;
                }
                requestedContentPositionUs2 = requestedContentPositionUs;
            }
        } else if (playbackInfo.periodId.isAd()) {
            requestedContentPositionUs = playbackInfo.positionUs;
            requestedContentPositionUs2 = getRequestedContentPositionUs(playbackInfo);
        } else {
            requestedContentPositionUs = period.positionInWindowUs + playbackInfo.positionUs;
            requestedContentPositionUs2 = requestedContentPositionUs;
        }
        return new androidx.media3.common.Player.PositionInfo(obj, i3, mediaItem, obj2, i4, androidx.media3.common.util.Util.usToMs(requestedContentPositionUs), androidx.media3.common.util.Util.usToMs(requestedContentPositionUs2), playbackInfo.periodId.adGroupIndex, playbackInfo.periodId.adIndexInAdGroup);
    }

    private androidx.media3.common.Player.PositionInfo getPositionInfo(long j) {
        androidx.media3.common.MediaItem mediaItem;
        java.lang.Object obj;
        int indexOfPeriod;
        java.lang.Object obj2;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (this.playbackInfo.timeline.isEmpty()) {
            mediaItem = null;
            obj = null;
            indexOfPeriod = -1;
            obj2 = null;
        } else {
            java.lang.Object obj3 = this.playbackInfo.periodId.periodUid;
            this.playbackInfo.timeline.getPeriodByUid(obj3, this.period);
            indexOfPeriod = this.playbackInfo.timeline.getIndexOfPeriod(obj3);
            obj2 = this.playbackInfo.timeline.getWindow(currentMediaItemIndex, this.window).uid;
            mediaItem = this.window.mediaItem;
            obj = obj3;
        }
        long jUsToMs = androidx.media3.common.util.Util.usToMs(j);
        return new androidx.media3.common.Player.PositionInfo(obj2, currentMediaItemIndex, mediaItem, obj, indexOfPeriod, jUsToMs, this.playbackInfo.periodId.isAd() ? androidx.media3.common.util.Util.usToMs(getRequestedContentPositionUs(this.playbackInfo)) : jUsToMs, this.playbackInfo.periodId.adGroupIndex, this.playbackInfo.periodId.adIndexInAdGroup);
    }

    private static long getRequestedContentPositionUs(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, period);
        if (playbackInfo.requestedContentPositionUs == androidx.media3.common.C.TIME_UNSET) {
            return playbackInfo.timeline.getWindow(period.windowIndex, window).getDefaultPositionUs();
        }
        return period.getPositionInWindowUs() + playbackInfo.requestedContentPositionUs;
    }

    private android.util.Pair<java.lang.Boolean, java.lang.Integer> evaluateMediaItemTransitionReason(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.exoplayer.PlaybackInfo playbackInfo2, boolean z, int i, boolean z2, boolean z3) {
        androidx.media3.common.Timeline timeline = playbackInfo2.timeline;
        androidx.media3.common.Timeline timeline2 = playbackInfo.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return new android.util.Pair<>(false, -1);
        }
        int i2 = 3;
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return new android.util.Pair<>(true, 3);
        }
        if (timeline.getWindow(timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period).windowIndex, this.window).uid.equals(timeline2.getWindow(timeline2.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window).uid)) {
            if (z && i == 0 && playbackInfo2.periodId.windowSequenceNumber < playbackInfo.periodId.windowSequenceNumber) {
                return new android.util.Pair<>(true, 0);
            }
            if (z && i == 1 && z3) {
                return new android.util.Pair<>(true, 2);
            }
            return new android.util.Pair<>(false, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new java.lang.IllegalStateException();
        }
        return new android.util.Pair<>(true, java.lang.Integer.valueOf(i2));
    }

    private void updateAvailableCommands() {
        androidx.media3.common.Player.Commands commands = this.availableCommands;
        androidx.media3.common.Player.Commands availableCommands = androidx.media3.common.util.Util.getAvailableCommands(this.wrappingPlayer, this.permanentAvailableCommands);
        this.availableCommands = availableCommands;
        if (availableCommands.equals(commands)) {
            return;
        }
        this.listeners.queueEvent(13, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda21
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                this.f$0.m118x9a87546c((androidx.media3.common.Player.Listener) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateAvailableCommands$26$androidx-media3-exoplayer-ExoPlayerImpl, reason: not valid java name */
    /* synthetic */ void m118x9a87546c(androidx.media3.common.Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.availableCommands);
    }

    private void setMediaSourcesInternal(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, int i, long j, boolean z) {
        int i2;
        long j2;
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        long currentPosition = getCurrentPosition();
        this.pendingOperationAcks++;
        if (!this.mediaSourceHolderSnapshots.isEmpty()) {
            removeMediaSourceHolders(0, this.mediaSourceHolderSnapshots.size());
        }
        java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> listAddMediaSourceHolders = addMediaSourceHolders(0, list);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        if (!timelineCreateMaskingTimeline.isEmpty() && i >= timelineCreateMaskingTimeline.getWindowCount()) {
            throw new androidx.media3.common.IllegalSeekPositionException(timelineCreateMaskingTimeline, i, j);
        }
        if (z) {
            int firstWindowIndex = timelineCreateMaskingTimeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j2 = androidx.media3.common.C.TIME_UNSET;
            i2 = firstWindowIndex;
        } else if (i == -1) {
            i2 = currentWindowIndexInternal;
            j2 = currentPosition;
        } else {
            i2 = i;
            j2 = j;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, timelineCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(timelineCreateMaskingTimeline, i2, j2));
        int i3 = playbackInfoMaskTimelineAndPosition.playbackState;
        if (i2 != -1 && playbackInfoMaskTimelineAndPosition.playbackState != 1) {
            i3 = (timelineCreateMaskingTimeline.isEmpty() || i2 >= timelineCreateMaskingTimeline.getWindowCount()) ? 4 : 2;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlaybackState = playbackInfoMaskTimelineAndPosition.copyWithPlaybackState(i3);
        this.internalPlayer.setMediaSources(listAddMediaSourceHolders, i2, androidx.media3.common.util.Util.msToUs(j2), this.shuffleOrder);
        updatePlaybackInfo(playbackInfoCopyWithPlaybackState, 0, (this.playbackInfo.periodId.periodUid.equals(playbackInfoCopyWithPlaybackState.periodId.periodUid) || this.playbackInfo.timeline.isEmpty()) ? false : true, 4, getCurrentPositionUsInternal(playbackInfoCopyWithPlaybackState), -1, false);
    }

    private java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int i, java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder = new androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder(list.get(i2), this.useLazyPreparation);
            arrayList.add(mediaSourceHolder);
            this.mediaSourceHolderSnapshots.add(i2 + i, new androidx.media3.exoplayer.ExoPlayerImpl.MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(i, arrayList.size());
        return arrayList;
    }

    private androidx.media3.exoplayer.PlaybackInfo addMediaSourcesInternal(androidx.media3.exoplayer.PlaybackInfo playbackInfo, int i, java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        androidx.media3.common.Timeline timeline = playbackInfo.timeline;
        this.pendingOperationAcks++;
        java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> listAddMediaSourceHolders = addMediaSourceHolders(i, list);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(timeline, timelineCreateMaskingTimeline, getCurrentWindowIndexInternal(playbackInfo), getContentPositionInternal(playbackInfo)));
        this.internalPlayer.addMediaSources(i, listAddMediaSourceHolders, this.shuffleOrder);
        return playbackInfoMaskTimelineAndPosition;
    }

    private androidx.media3.exoplayer.PlaybackInfo removeMediaItemsInternal(androidx.media3.exoplayer.PlaybackInfo playbackInfo, int i, int i2) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(playbackInfo);
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        androidx.media3.common.Timeline timeline = playbackInfo.timeline;
        int size = this.mediaSourceHolderSnapshots.size();
        this.pendingOperationAcks++;
        removeMediaSourceHolders(i, i2);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(timeline, timelineCreateMaskingTimeline, currentWindowIndexInternal, contentPositionInternal));
        if (playbackInfoMaskTimelineAndPosition.playbackState != 1 && playbackInfoMaskTimelineAndPosition.playbackState != 4 && i < i2 && i2 == size && currentWindowIndexInternal >= playbackInfoMaskTimelineAndPosition.timeline.getWindowCount()) {
            playbackInfoMaskTimelineAndPosition = playbackInfoMaskTimelineAndPosition.copyWithPlaybackState(4);
        }
        this.internalPlayer.removeMediaSources(i, i2, this.shuffleOrder);
        return playbackInfoMaskTimelineAndPosition;
    }

    private void removeMediaSourceHolders(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.mediaSourceHolderSnapshots.remove(i3);
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i, i2);
    }

    private androidx.media3.common.Timeline createMaskingTimeline() {
        return new androidx.media3.exoplayer.PlaylistTimeline(this.mediaSourceHolderSnapshots, this.shuffleOrder);
    }

    private androidx.media3.exoplayer.PlaybackInfo maskTimelineAndPosition(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Timeline timeline, android.util.Pair<java.lang.Object, java.lang.Long> pair) {
        long adDurationUs;
        androidx.media3.common.util.Assertions.checkArgument(timeline.isEmpty() || pair != null);
        androidx.media3.common.Timeline timeline2 = playbackInfo.timeline;
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithTimeline = playbackInfo.copyWithTimeline(timeline);
        if (timeline.isEmpty()) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId dummyPeriodForEmptyTimeline = androidx.media3.exoplayer.PlaybackInfo.getDummyPeriodForEmptyTimeline();
            long jMsToUs = androidx.media3.common.util.Util.msToUs(this.maskingWindowPositionMs);
            androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfoCopyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, jMsToUs, jMsToUs, jMsToUs, 0L, androidx.media3.exoplayer.source.TrackGroupArray.EMPTY, this.emptyTrackSelectorResult, com.google.common.collect.ImmutableList.of()).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
            return playbackInfoCopyWithLoadingMediaPeriodId;
        }
        java.lang.Object obj = playbackInfoCopyWithTimeline.periodId.periodUid;
        boolean z = !obj.equals(((android.util.Pair) androidx.media3.common.util.Util.castNonNull(pair)).first);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = z ? new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(pair.first) : playbackInfoCopyWithTimeline.periodId;
        long jLongValue = ((java.lang.Long) pair.second).longValue();
        long jMsToUs2 = androidx.media3.common.util.Util.msToUs(contentPositionInternal);
        if (!timeline2.isEmpty()) {
            jMsToUs2 -= timeline2.getPeriodByUid(obj, this.period).getPositionInWindowUs();
        }
        if (z || jLongValue < jMsToUs2) {
            androidx.media3.common.util.Assertions.checkState(!mediaPeriodId.isAd());
            androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId2 = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId, jLongValue, jLongValue, jLongValue, 0L, z ? androidx.media3.exoplayer.source.TrackGroupArray.EMPTY : playbackInfoCopyWithTimeline.trackGroups, z ? this.emptyTrackSelectorResult : playbackInfoCopyWithTimeline.trackSelectorResult, z ? com.google.common.collect.ImmutableList.of() : playbackInfoCopyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId);
            playbackInfoCopyWithLoadingMediaPeriodId2.bufferedPositionUs = jLongValue;
            return playbackInfoCopyWithLoadingMediaPeriodId2;
        }
        if (jLongValue == jMsToUs2) {
            int indexOfPeriod = timeline.getIndexOfPeriod(playbackInfoCopyWithTimeline.loadingMediaPeriodId.periodUid);
            if (indexOfPeriod == -1 || timeline.getPeriod(indexOfPeriod, this.period).windowIndex != timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex) {
                timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
                if (mediaPeriodId.isAd()) {
                    adDurationUs = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                } else {
                    adDurationUs = this.period.durationUs;
                }
                playbackInfoCopyWithTimeline = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId, playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.discontinuityStartPositionUs, adDurationUs - playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.trackGroups, playbackInfoCopyWithTimeline.trackSelectorResult, playbackInfoCopyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId);
                playbackInfoCopyWithTimeline.bufferedPositionUs = adDurationUs;
            }
        } else {
            androidx.media3.common.util.Assertions.checkState(!mediaPeriodId.isAd());
            long jMax = java.lang.Math.max(0L, playbackInfoCopyWithTimeline.totalBufferedDurationUs - (jLongValue - jMsToUs2));
            long j = playbackInfoCopyWithTimeline.bufferedPositionUs;
            if (playbackInfoCopyWithTimeline.loadingMediaPeriodId.equals(playbackInfoCopyWithTimeline.periodId)) {
                j = jLongValue + jMax;
            }
            playbackInfoCopyWithTimeline = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId, jLongValue, jLongValue, jLongValue, jMax, playbackInfoCopyWithTimeline.trackGroups, playbackInfoCopyWithTimeline.trackSelectorResult, playbackInfoCopyWithTimeline.staticMetadata);
            playbackInfoCopyWithTimeline.bufferedPositionUs = j;
        }
        return playbackInfoCopyWithTimeline;
    }

    private android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPositionUsAfterTimelineChanged(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2, int i, long j) {
        boolean zIsEmpty = timeline.isEmpty();
        long j2 = androidx.media3.common.C.TIME_UNSET;
        if (zIsEmpty || timeline2.isEmpty()) {
            boolean z = !timeline.isEmpty() && timeline2.isEmpty();
            int i2 = z ? -1 : i;
            if (!z) {
                j2 = j;
            }
            return maskWindowPositionMsOrGetPeriodPositionUs(timeline2, i2, j2);
        }
        android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i, androidx.media3.common.util.Util.msToUs(j));
        java.lang.Object obj = ((android.util.Pair) androidx.media3.common.util.Util.castNonNull(periodPositionUs)).first;
        if (timeline2.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        int iResolveSubsequentPeriod = androidx.media3.exoplayer.ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, obj, timeline, timeline2);
        if (iResolveSubsequentPeriod != -1) {
            return maskWindowPositionMsOrGetPeriodPositionUs(timeline2, iResolveSubsequentPeriod, timeline2.getWindow(iResolveSubsequentPeriod, this.window).getDefaultPositionMs());
        }
        return maskWindowPositionMsOrGetPeriodPositionUs(timeline2, -1, androidx.media3.common.C.TIME_UNSET);
    }

    private android.util.Pair<java.lang.Object, java.lang.Long> maskWindowPositionMsOrGetPeriodPositionUs(androidx.media3.common.Timeline timeline, int i, long j) {
        if (timeline.isEmpty()) {
            this.maskingWindowIndex = i;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                j = 0;
            }
            this.maskingWindowPositionMs = j;
            this.maskingPeriodIndex = 0;
            return null;
        }
        if (i == -1 || i >= timeline.getWindowCount()) {
            i = timeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j = timeline.getWindow(i, this.window).getDefaultPositionMs();
        }
        return timeline.getPeriodPositionUs(this.window, this.period, i, androidx.media3.common.util.Util.msToUs(j));
    }

    private long periodPositionUsToWindowPositionUs(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return j + this.period.getPositionInWindowUs();
    }

    private androidx.media3.exoplayer.PlayerMessage createMessageInternal(androidx.media3.exoplayer.PlayerMessage.Target target) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        androidx.media3.exoplayer.ExoPlayerImplInternal exoPlayerImplInternal = this.internalPlayer;
        androidx.media3.common.Timeline timeline = this.playbackInfo.timeline;
        if (currentWindowIndexInternal == -1) {
            currentWindowIndexInternal = 0;
        }
        return new androidx.media3.exoplayer.PlayerMessage(exoPlayerImplInternal, target, timeline, currentWindowIndexInternal, this.clock, this.internalPlayer.getPlaybackLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.common.MediaMetadata buildUpdatedMediaMetadata() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.staticAndDynamicMediaMetadata;
        }
        return this.staticAndDynamicMediaMetadata.buildUpon().populate(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem.mediaMetadata).build();
    }

    private void removeSurfaceCallbacks() {
        if (this.sphericalGLSurfaceView != null) {
            createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(null).send();
            this.sphericalGLSurfaceView.removeVideoSurfaceListener(this.componentListener);
            this.sphericalGLSurfaceView = null;
        }
        android.view.TextureView textureView = this.textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.componentListener) {
                androidx.media3.common.util.Log.w(TAG, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener(null);
            }
            this.textureView = null;
        }
        android.view.SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.componentListener);
            this.surfaceHolder = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfaceTextureInternal(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        setVideoOutputInternal(surface);
        this.ownedSurface = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoOutputInternal(java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = false;
        for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == 2) {
                arrayList.add(createMessageInternal(renderer).setType(1).setPayload(obj).send());
            }
        }
        java.lang.Object obj2 = this.videoOutput;
        if (obj2 != null && obj2 != obj) {
            try {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((androidx.media3.exoplayer.PlayerMessage) it.next()).blockUntilDelivered(this.detachSurfaceTimeoutMs);
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.TimeoutException unused2) {
                z = true;
            }
            java.lang.Object obj3 = this.videoOutput;
            android.view.Surface surface = this.ownedSurface;
            if (obj3 == surface) {
                surface.release();
                this.ownedSurface = null;
            }
        }
        this.videoOutput = obj;
        if (z) {
            stopInternal(androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(new androidx.media3.exoplayer.ExoTimeoutException(3), 1003));
        }
    }

    private void setNonVideoOutputSurfaceHolderInternal(android.view.SurfaceHolder surfaceHolder) {
        this.surfaceHolderSurfaceIsVideoOutput = false;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        android.view.Surface surface = this.surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            android.graphics.Rect surfaceFrame = this.surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        } else {
            maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(final int i, final int i2) {
        if (i == this.surfaceSize.getWidth() && i2 == this.surfaceSize.getHeight()) {
            return;
        }
        this.surfaceSize = new androidx.media3.common.util.Size(i, i2);
        this.listeners.sendEvent(24, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda18
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.common.Player.Listener) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        sendRendererMessage(2, 14, new androidx.media3.common.util.Size(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendVolumeToRenderers() {
        sendRendererMessage(1, 2, java.lang.Float.valueOf(this.volume * this.audioFocusManager.getVolumeMultiplier()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayWhenReady(boolean z, int i, int i2) {
        boolean z2 = z && i != -1;
        int iComputePlaybackSuppressionReason = computePlaybackSuppressionReason(z2, i);
        if (this.playbackInfo.playWhenReady == z2 && this.playbackInfo.playbackSuppressionReason == iComputePlaybackSuppressionReason && this.playbackInfo.playWhenReadyChangeReason == i2) {
            return;
        }
        updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(z2, i2, iComputePlaybackSuppressionReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(boolean z, int i, int i2) {
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithEstimatedPosition;
        this.pendingOperationAcks++;
        if (this.playbackInfo.sleepingForOffload) {
            playbackInfoCopyWithEstimatedPosition = this.playbackInfo.copyWithEstimatedPosition();
        } else {
            playbackInfoCopyWithEstimatedPosition = this.playbackInfo;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlayWhenReady = playbackInfoCopyWithEstimatedPosition.copyWithPlayWhenReady(z, i, i2);
        this.internalPlayer.setPlayWhenReady(z, i, i2);
        updatePlaybackInfo(playbackInfoCopyWithPlayWhenReady, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    private int computePlaybackSuppressionReason(boolean z, int i) {
        if (i == 0) {
            return 1;
        }
        if (!this.suppressPlaybackOnUnsuitableOutput) {
            return 0;
        }
        if (!z || hasSupportedAudioOutput()) {
            return (z || this.playbackInfo.playbackSuppressionReason != 3) ? 0 : 3;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasSupportedAudioOutput() {
        if (this.audioManager == null || androidx.media3.common.util.Util.SDK_INT < 23) {
            return true;
        }
        return androidx.media3.exoplayer.ExoPlayerImpl.Api23.isSuitableAudioOutputPresentInAudioDeviceInfoList(this.applicationContext, this.audioManager.getDevices(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWakeAndWifiLock() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.wakeLockManager.setStayAwake(getPlayWhenReady() && !isSleepingForOffload());
                this.wifiLockManager.setStayAwake(getPlayWhenReady());
                return;
            } else if (playbackState != 4) {
                throw new java.lang.IllegalStateException();
            }
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
    }

    private void verifyApplicationThread() {
        this.constructorFinished.blockUninterruptible();
        if (java.lang.Thread.currentThread() != getApplicationLooper().getThread()) {
            java.lang.String invariant = androidx.media3.common.util.Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", java.lang.Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.throwsWhenUsingWrongThread) {
                throw new java.lang.IllegalStateException(invariant);
            }
            androidx.media3.common.util.Log.w(TAG, invariant, this.hasNotifiedFullWrongThreadWarning ? null : new java.lang.IllegalStateException());
            this.hasNotifiedFullWrongThreadWarning = true;
        }
    }

    private void sendRendererMessage(int i, java.lang.Object obj) {
        sendRendererMessage(-1, i, obj);
    }

    private void sendRendererMessage(int i, int i2, java.lang.Object obj) {
        for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
            if (i == -1 || renderer.getTrackType() == i) {
                createMessageInternal(renderer).setType(i2).setPayload(obj).send();
            }
        }
    }

    private int initializeKeepSessionIdAudioTrack(int i) {
        android.media.AudioTrack audioTrack = this.keepSessionIdAudioTrack;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.keepSessionIdAudioTrack.release();
            this.keepSessionIdAudioTrack = null;
        }
        if (this.keepSessionIdAudioTrack == null) {
            this.keepSessionIdAudioTrack = new android.media.AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.keepSessionIdAudioTrack.getAudioSessionId();
    }

    private void updatePriorityTaskManagerForIsLoadingChange(boolean z) {
        androidx.media3.common.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            if (z && !this.isPriorityTaskManagerRegistered) {
                priorityTaskManager.add(this.priority);
                this.isPriorityTaskManagerRegistered = true;
            } else {
                if (z || !this.isPriorityTaskManagerRegistered) {
                    return;
                }
                priorityTaskManager.remove(this.priority);
                this.isPriorityTaskManagerRegistered = false;
            }
        }
    }

    private boolean canUpdateMediaSourcesWithMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        if (i2 - i != list.size()) {
            return false;
        }
        for (int i3 = i; i3 < i2; i3++) {
            if (!this.mediaSourceHolderSnapshots.get(i3).mediaSource.canUpdateMediaItem(list.get(i3 - i))) {
                return false;
            }
        }
        return true;
    }

    private void updateMediaSourcesWithMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        this.pendingOperationAcks++;
        this.internalPlayer.updateMediaSourcesWithMediaItems(i, i2, list);
        for (int i3 = i; i3 < i2; i3++) {
            androidx.media3.exoplayer.ExoPlayerImpl.MediaSourceHolderSnapshot mediaSourceHolderSnapshot = this.mediaSourceHolderSnapshots.get(i3);
            mediaSourceHolderSnapshot.updateTimeline(new androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem(mediaSourceHolderSnapshot.getTimeline(), list.get(i3 - i)));
        }
        updatePlaybackInfo(this.playbackInfo.copyWithTimeline(createMaskingTimeline()), 0, false, 4, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.common.DeviceInfo createDeviceInfo(androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager) {
        return new androidx.media3.common.DeviceInfo.Builder(0).setMinVolume(streamVolumeManager != null ? streamVolumeManager.getMinVolume() : 0).setMaxVolume(streamVolumeManager != null ? streamVolumeManager.getMaxVolume() : 0).build();
    }

    private static final class MediaSourceHolderSnapshot implements androidx.media3.exoplayer.MediaSourceInfoHolder {
        private final androidx.media3.exoplayer.source.MediaSource mediaSource;
        private androidx.media3.common.Timeline timeline;
        private final java.lang.Object uid;

        public MediaSourceHolderSnapshot(java.lang.Object obj, androidx.media3.exoplayer.source.MaskingMediaSource maskingMediaSource) {
            this.uid = obj;
            this.mediaSource = maskingMediaSource;
            this.timeline = maskingMediaSource.getTimeline();
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public java.lang.Object getUid() {
            return this.uid;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public androidx.media3.common.Timeline getTimeline() {
            return this.timeline;
        }

        public void updateTimeline(androidx.media3.common.Timeline timeline) {
            this.timeline = timeline;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ComponentListener implements androidx.media3.exoplayer.video.VideoRendererEventListener, androidx.media3.exoplayer.audio.AudioRendererEventListener, androidx.media3.exoplayer.text.TextOutput, androidx.media3.exoplayer.metadata.MetadataOutput, android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener, androidx.media3.exoplayer.AudioFocusManager.PlayerControl, androidx.media3.exoplayer.AudioBecomingNoisyManager.EventListener, androidx.media3.exoplayer.StreamVolumeManager.Listener, androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener {
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        }

        private ComponentListener() {
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoDecoderCounters = decoderCounters;
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoEnabled(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(java.lang.String str, long j, long j2) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoDecoderInitialized(str, j, j2);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoFormat = format;
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onDroppedFrames(int i, long j) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onDroppedFrames(i, j);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoSizeChanged(final androidx.media3.common.VideoSize videoSize) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoSize = videoSize;
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(25, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda7
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onVideoSizeChanged(videoSize);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onRenderedFirstFrame(java.lang.Object obj, long j) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onRenderedFirstFrame(obj, j);
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.videoOutput == obj) {
                androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(26, new androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda23());
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderReleased(java.lang.String str) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoDisabled(decoderCounters);
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoFormat = null;
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoDecoderCounters = null;
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long j, int i) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoFrameProcessingOffset(j, i);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoCodecError(java.lang.Exception exc) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.audioDecoderCounters = decoderCounters;
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioEnabled(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(java.lang.String str, long j, long j2) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioDecoderInitialized(str, j, j2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.audioFormat = format;
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long j) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioPositionAdvancing(j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioUnderrun(int i, long j, long j2) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioUnderrun(i, j, j2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(java.lang.String str) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioDisabled(decoderCounters);
            androidx.media3.exoplayer.ExoPlayerImpl.this.audioFormat = null;
            androidx.media3.exoplayer.ExoPlayerImpl.this.audioDecoderCounters = null;
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(final boolean z) {
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.skipSilenceEnabled == z) {
                return;
            }
            androidx.media3.exoplayer.ExoPlayerImpl.this.skipSilenceEnabled = z;
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(23, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda6
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onSkipSilenceEnabledChanged(z);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioSinkError(java.lang.Exception exc) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioCodecError(java.lang.Exception exc) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioTrackReleased(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public void onCues(final java.util.List<androidx.media3.common.text.Cue> list) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(27, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onCues((java.util.List<androidx.media3.common.text.Cue>) list);
                }
            });
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public void onCues(final androidx.media3.common.text.CueGroup cueGroup) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.currentCueGroup = cueGroup;
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(27, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onCues(cueGroup);
                }
            });
        }

        @Override // androidx.media3.exoplayer.metadata.MetadataOutput
        public void onMetadata(final androidx.media3.common.Metadata metadata) {
            androidx.media3.exoplayer.ExoPlayerImpl exoPlayerImpl = androidx.media3.exoplayer.ExoPlayerImpl.this;
            exoPlayerImpl.staticAndDynamicMediaMetadata = exoPlayerImpl.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(metadata).build();
            androidx.media3.common.MediaMetadata mediaMetadataBuildUpdatedMediaMetadata = androidx.media3.exoplayer.ExoPlayerImpl.this.buildUpdatedMediaMetadata();
            if (!mediaMetadataBuildUpdatedMediaMetadata.equals(androidx.media3.exoplayer.ExoPlayerImpl.this.mediaMetadata)) {
                androidx.media3.exoplayer.ExoPlayerImpl.this.mediaMetadata = mediaMetadataBuildUpdatedMediaMetadata;
                androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.queueEvent(14, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda1
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        this.f$0.m119xb185137((androidx.media3.common.Player.Listener) obj);
                    }
                });
            }
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.queueEvent(28, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMetadata(metadata);
                }
            });
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.flushEvents();
        }

        /* JADX INFO: renamed from: lambda$onMetadata$4$androidx-media3-exoplayer-ExoPlayerImpl$ComponentListener, reason: not valid java name */
        /* synthetic */ void m119xb185137(androidx.media3.common.Player.Listener listener) {
            listener.onMediaMetadataChanged(androidx.media3.exoplayer.ExoPlayerImpl.this.mediaMetadata);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                androidx.media3.exoplayer.ExoPlayerImpl.this.setVideoOutputInternal(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                androidx.media3.exoplayer.ExoPlayerImpl.this.setVideoOutputInternal(null);
            }
            androidx.media3.exoplayer.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.setSurfaceTextureInternal(surfaceTexture);
            androidx.media3.exoplayer.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.setVideoOutputInternal(null);
            androidx.media3.exoplayer.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
            return true;
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(android.view.Surface surface) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.setVideoOutputInternal(surface);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(android.view.Surface surface) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.setVideoOutputInternal(null);
        }

        @Override // androidx.media3.exoplayer.AudioFocusManager.PlayerControl
        public void setVolumeMultiplier(float f) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.sendVolumeToRenderers();
        }

        @Override // androidx.media3.exoplayer.AudioFocusManager.PlayerControl
        public void executePlayerCommand(int i) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.updatePlayWhenReady(androidx.media3.exoplayer.ExoPlayerImpl.this.getPlayWhenReady(), i, androidx.media3.exoplayer.ExoPlayerImpl.getPlayWhenReadyChangeReason(i));
        }

        @Override // androidx.media3.exoplayer.AudioBecomingNoisyManager.EventListener
        public void onAudioBecomingNoisy() {
            androidx.media3.exoplayer.ExoPlayerImpl.this.updatePlayWhenReady(false, -1, 3);
        }

        @Override // androidx.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int i) {
            final androidx.media3.common.DeviceInfo deviceInfoCreateDeviceInfo = androidx.media3.exoplayer.ExoPlayerImpl.createDeviceInfo(androidx.media3.exoplayer.ExoPlayerImpl.this.streamVolumeManager);
            if (deviceInfoCreateDeviceInfo.equals(androidx.media3.exoplayer.ExoPlayerImpl.this.deviceInfo)) {
                return;
            }
            androidx.media3.exoplayer.ExoPlayerImpl.this.deviceInfo = deviceInfoCreateDeviceInfo;
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(29, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onDeviceInfoChanged(deviceInfoCreateDeviceInfo);
                }
            });
        }

        @Override // androidx.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(final int i, final boolean z) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda3
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onDeviceVolumeChanged(i, z);
                }
            });
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener
        public void onSleepingForOffloadChanged(boolean z) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.updateWakeAndWifiLock();
        }
    }

    private static final class FrameMetadataListener implements androidx.media3.exoplayer.video.VideoFrameMetadataListener, androidx.media3.exoplayer.video.spherical.CameraMotionListener, androidx.media3.exoplayer.PlayerMessage.Target {
        public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
        public static final int MSG_SET_SPHERICAL_SURFACE_VIEW = 10000;
        public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;
        private androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener;
        private androidx.media3.exoplayer.video.spherical.CameraMotionListener internalCameraMotionListener;
        private androidx.media3.exoplayer.video.VideoFrameMetadataListener internalVideoFrameMetadataListener;
        private androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener;

        private FrameMetadataListener() {
        }

        @Override // androidx.media3.exoplayer.PlayerMessage.Target
        public void handleMessage(int i, java.lang.Object obj) {
            if (i == 7) {
                this.videoFrameMetadataListener = (androidx.media3.exoplayer.video.VideoFrameMetadataListener) obj;
                return;
            }
            if (i == 8) {
                this.cameraMotionListener = (androidx.media3.exoplayer.video.spherical.CameraMotionListener) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView sphericalGLSurfaceView = (androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.internalVideoFrameMetadataListener = null;
                this.internalCameraMotionListener = null;
            } else {
                this.internalVideoFrameMetadataListener = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.internalCameraMotionListener = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long j, long j2, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
            androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener = this.internalVideoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
            }
            androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener2 = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotion(long j, float[] fArr) {
            androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotion(j, fArr);
            }
            androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotion(j, fArr);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
            androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotionReset();
            }
            androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotionReset();
            }
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static androidx.media3.exoplayer.analytics.PlayerId registerMediaMetricsListener(android.content.Context context, androidx.media3.exoplayer.ExoPlayerImpl exoPlayerImpl, boolean z, java.lang.String str) {
            androidx.media3.exoplayer.analytics.MediaMetricsListener mediaMetricsListenerCreate = androidx.media3.exoplayer.analytics.MediaMetricsListener.create(context);
            if (mediaMetricsListenerCreate == null) {
                androidx.media3.common.util.Log.w(androidx.media3.exoplayer.ExoPlayerImpl.TAG, "MediaMetricsService unavailable.");
                return new androidx.media3.exoplayer.analytics.PlayerId(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z) {
                exoPlayerImpl.addAnalyticsListener(mediaMetricsListenerCreate);
            }
            return new androidx.media3.exoplayer.analytics.PlayerId(mediaMetricsListenerCreate.getLogSessionId(), str);
        }
    }

    private static final class Api23 {
        private Api23() {
        }

        public static boolean isSuitableAudioOutputPresentInAudioDeviceInfoList(android.content.Context context, android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!androidx.media3.common.util.Util.isWear(context)) {
                return true;
            }
            for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                if (androidx.media3.common.util.Util.SDK_INT >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (androidx.media3.common.util.Util.SDK_INT >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (androidx.media3.common.util.Util.SDK_INT >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (androidx.media3.common.util.Util.SDK_INT >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void registerAudioDeviceCallback(android.media.AudioManager audioManager, android.media.AudioDeviceCallback audioDeviceCallback, android.os.Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    private final class NoSuitableOutputPlaybackSuppressionAudioDeviceCallback extends android.media.AudioDeviceCallback {
        private NoSuitableOutputPlaybackSuppressionAudioDeviceCallback() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.hasSupportedAudioOutput() && androidx.media3.exoplayer.ExoPlayerImpl.this.playbackInfo.playbackSuppressionReason == 3) {
                androidx.media3.exoplayer.ExoPlayerImpl exoPlayerImpl = androidx.media3.exoplayer.ExoPlayerImpl.this;
                exoPlayerImpl.updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(exoPlayerImpl.playbackInfo.playWhenReady, 1, 0);
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.hasSupportedAudioOutput()) {
                return;
            }
            androidx.media3.exoplayer.ExoPlayerImpl exoPlayerImpl = androidx.media3.exoplayer.ExoPlayerImpl.this;
            exoPlayerImpl.updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(exoPlayerImpl.playbackInfo.playWhenReady, 1, 3);
        }
    }
}
