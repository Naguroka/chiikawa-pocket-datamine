package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class CompositionPlayer extends androidx.media3.common.SimpleBasePlayer implements androidx.media3.transformer.CompositionPlayerInternal.Listener, androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener, android.view.SurfaceHolder.Callback {
    private static final int MAX_SUPPORTED_SEQUENCES = 2;
    private static final java.lang.String TAG = "CompositionPlayer";
    private final androidx.media3.common.util.HandlerWrapper applicationHandler;
    private final androidx.media3.common.util.Clock clock;
    private androidx.media3.transformer.Composition composition;
    private long compositionDurationUs;
    private final androidx.media3.common.util.HandlerWrapper compositionInternalListenerHandler;
    private androidx.media3.transformer.CompositionPlayerInternal compositionPlayerInternal;
    private final android.content.Context context;
    private android.view.Surface displaySurface;
    private final androidx.media3.exoplayer.source.ExternalLoader externalImageLoader;
    private final androidx.media3.exoplayer.audio.AudioSink finalAudioSink;
    private final androidx.media3.exoplayer.image.ImageDecoder.Factory imageDecoderFactory;
    private boolean playWhenReady;
    private int playWhenReadyChangeReason;
    private androidx.media3.common.PlaybackException playbackException;
    private int playbackState;
    private android.os.HandlerThread playbackThread;
    private final java.util.List<androidx.media3.exoplayer.ExoPlayer> players;
    private com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.MediaItemData> playlist;
    private final androidx.media3.common.PreviewingVideoGraph.Factory previewingVideoGraphFactory;
    private boolean renderedFirstFrame;
    private android.view.SurfaceHolder surfaceHolder;
    private java.lang.Object videoOutput;
    private androidx.media3.common.util.Size videoOutputSize;
    private static final androidx.media3.common.Player.Commands AVAILABLE_COMMANDS = new androidx.media3.common.Player.Commands.Builder().addAll(1, 2, 3, 5, 11, 12, 16, 17, 27, 22, 24, 32).build();
    private static final int[] SUPPORTED_LISTENER_EVENTS = {4, 5, 10, 11};

    @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
    public void onFrameDropped(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider) {
    }

    @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
    public void onVideoSizeChanged(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider, androidx.media3.common.VideoSize videoSize) {
    }

    public static final class Builder {
        private androidx.media3.exoplayer.audio.AudioSink audioSink;
        private boolean built;
        private final android.content.Context context;
        private androidx.media3.exoplayer.source.ExternalLoader externalImageLoader;
        private android.os.Looper looper;
        private androidx.media3.common.PreviewingVideoGraph.Factory previewingVideoGraphFactory;
        private androidx.media3.exoplayer.image.ImageDecoder.Factory imageDecoderFactory = androidx.media3.exoplayer.image.ImageDecoder.Factory.DEFAULT;
        private androidx.media3.common.util.Clock clock = androidx.media3.common.util.Clock.DEFAULT;

        public Builder(android.content.Context context) {
            this.context = context.getApplicationContext();
        }

        public androidx.media3.transformer.CompositionPlayer.Builder setLooper(android.os.Looper looper) {
            this.looper = looper;
            return this;
        }

        public androidx.media3.transformer.CompositionPlayer.Builder setAudioSink(androidx.media3.exoplayer.audio.AudioSink audioSink) {
            this.audioSink = audioSink;
            return this;
        }

        public androidx.media3.transformer.CompositionPlayer.Builder setExternalImageLoader(androidx.media3.exoplayer.source.ExternalLoader externalLoader) {
            this.externalImageLoader = externalLoader;
            return this;
        }

        public androidx.media3.transformer.CompositionPlayer.Builder setImageDecoderFactory(androidx.media3.exoplayer.image.ImageDecoder.Factory factory) {
            this.imageDecoderFactory = factory;
            return this;
        }

        public androidx.media3.transformer.CompositionPlayer.Builder setClock(androidx.media3.common.util.Clock clock) {
            this.clock = clock;
            return this;
        }

        public androidx.media3.transformer.CompositionPlayer.Builder setPreviewingVideoGraphFactory(androidx.media3.common.PreviewingVideoGraph.Factory factory) {
            this.previewingVideoGraphFactory = factory;
            return this;
        }

        public androidx.media3.transformer.CompositionPlayer build() {
            androidx.media3.common.util.Assertions.checkState(!this.built);
            if (this.looper == null) {
                this.looper = (android.os.Looper) androidx.media3.common.util.Assertions.checkStateNotNull(android.os.Looper.myLooper());
            }
            if (this.audioSink == null) {
                this.audioSink = new androidx.media3.exoplayer.audio.DefaultAudioSink.Builder(this.context).build();
            }
            if (this.previewingVideoGraphFactory == null) {
                this.previewingVideoGraphFactory = new androidx.media3.effect.PreviewingSingleInputVideoGraph.Factory();
            }
            androidx.media3.transformer.CompositionPlayer compositionPlayer = new androidx.media3.transformer.CompositionPlayer(this);
            this.built = true;
            return compositionPlayer;
        }
    }

    private CompositionPlayer(androidx.media3.transformer.CompositionPlayer.Builder builder) {
        super((android.os.Looper) androidx.media3.common.util.Assertions.checkNotNull(builder.looper), builder.clock);
        this.context = builder.context;
        androidx.media3.common.util.Clock clock = builder.clock;
        this.clock = clock;
        this.applicationHandler = clock.createHandler(builder.looper, null);
        this.finalAudioSink = (androidx.media3.exoplayer.audio.AudioSink) androidx.media3.common.util.Assertions.checkNotNull(builder.audioSink);
        this.externalImageLoader = builder.externalImageLoader;
        this.imageDecoderFactory = builder.imageDecoderFactory;
        this.previewingVideoGraphFactory = (androidx.media3.common.PreviewingVideoGraph.Factory) androidx.media3.common.util.Assertions.checkNotNull(builder.previewingVideoGraphFactory);
        this.compositionInternalListenerHandler = clock.createHandler(builder.looper, null);
        this.players = new java.util.ArrayList();
        this.compositionDurationUs = androidx.media3.common.C.TIME_UNSET;
        this.playbackState = 1;
    }

    public void setComposition(androidx.media3.transformer.Composition composition) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkArgument(!composition.sequences.isEmpty() && composition.sequences.size() <= 2);
        androidx.media3.common.util.Assertions.checkState(this.composition == null);
        setCompositionInternal(composition);
        java.lang.Object obj = this.videoOutput;
        if (obj != null) {
            if (obj instanceof android.view.SurfaceHolder) {
                setVideoSurfaceHolderInternal((android.view.SurfaceHolder) obj);
            } else if (obj instanceof android.view.SurfaceView) {
                setVideoSurfaceHolderInternal(((android.view.SurfaceView) obj).getHolder());
            } else if (obj instanceof android.view.Surface) {
                setVideoSurfaceInternal((android.view.Surface) obj, (androidx.media3.common.util.Size) androidx.media3.common.util.Assertions.checkNotNull(this.videoOutputSize));
            } else {
                throw new java.lang.IllegalStateException(this.videoOutput.getClass().toString());
            }
        }
        this.composition = composition;
    }

    public void setVideoSurface(android.view.Surface surface, androidx.media3.common.util.Size size) {
        this.videoOutput = surface;
        this.videoOutputSize = size;
        setVideoSurfaceInternal(surface, size);
    }

    @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
    public void onFirstFrameRendered(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider) {
        this.applicationHandler.post(new java.lang.Runnable() { // from class: androidx.media3.transformer.CompositionPlayer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m429x1dcb8f93();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onFirstFrameRendered$0$androidx-media3-transformer-CompositionPlayer, reason: not valid java name */
    /* synthetic */ void m429x1dcb8f93() {
        this.renderedFirstFrame = true;
        invalidateState();
    }

    @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
    public void onError(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider, final androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
        this.applicationHandler.post(new java.lang.Runnable() { // from class: androidx.media3.transformer.CompositionPlayer$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m428lambda$onError$1$androidxmedia3transformerCompositionPlayer(videoFrameProcessingException);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onError$1$androidx-media3-transformer-CompositionPlayer, reason: not valid java name */
    /* synthetic */ void m428lambda$onError$1$androidxmedia3transformerCompositionPlayer(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
        maybeUpdatePlaybackError("error from video sink provider", videoFrameProcessingException, 7001);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.videoOutputSize = new androidx.media3.common.util.Size(surfaceHolder.getSurfaceFrame().width(), surfaceHolder.getSurfaceFrame().height());
        setVideoSurfaceInternal(surfaceHolder.getSurface(), this.videoOutputSize);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        maybeSetOutputSurfaceInfo(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        clearVideoSurfaceInternal();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected androidx.media3.common.SimpleBasePlayer.State getState() {
        int i = this.playbackState;
        updatePlaybackState();
        if (i != 3 && this.playbackState == 3 && this.playWhenReady) {
            for (int i2 = 0; i2 < this.players.size(); i2++) {
                this.players.get(i2).setPlayWhenReady(true);
            }
        } else if (i == 3 && this.playWhenReady && this.playbackState == 2) {
            for (int i3 = 0; i3 < this.players.size(); i3++) {
                this.players.get(i3).setPlayWhenReady(false);
            }
        }
        androidx.media3.common.SimpleBasePlayer.State.Builder newlyRenderedFirstFrame = new androidx.media3.common.SimpleBasePlayer.State.Builder().setAvailableCommands(AVAILABLE_COMMANDS).setPlaybackState(this.playbackState).setPlayerError(this.playbackException).setPlayWhenReady(this.playWhenReady, this.playWhenReadyChangeReason).setContentPositionMs(new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.transformer.CompositionPlayer$$ExternalSyntheticLambda1
            @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return this.f$0.getContentPositionMs();
            }
        }).setContentBufferedPositionMs(new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.transformer.CompositionPlayer$$ExternalSyntheticLambda2
            @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return this.f$0.getBufferedPositionMs();
            }
        }).setTotalBufferedDurationMs(new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.transformer.CompositionPlayer$$ExternalSyntheticLambda3
            @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return this.f$0.getTotalBufferedDurationMs();
            }
        }).setNewlyRenderedFirstFrame(getRenderedFirstFrameAndReset());
        com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.MediaItemData> immutableList = this.playlist;
        if (immutableList != null) {
            newlyRenderedFirstFrame.setPlaylist(immutableList);
        }
        return newlyRenderedFirstFrame.build();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handlePrepare() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.composition, "No composition set");
        if (this.playbackState != 1) {
            return com.google.common.util.concurrent.Futures.immediateVoidFuture();
        }
        for (int i = 0; i < this.players.size(); i++) {
            this.players.get(i).prepare();
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlayWhenReady(boolean z) {
        this.playWhenReady = z;
        this.playWhenReadyChangeReason = 1;
        if (this.playbackState == 3) {
            for (int i = 0; i < this.players.size(); i++) {
                this.players.get(i).setPlayWhenReady(z);
            }
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleStop() {
        for (int i = 0; i < this.players.size(); i++) {
            this.players.get(i).stop();
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleRelease() {
        if (this.composition == null) {
            return com.google.common.util.concurrent.Futures.immediateVoidFuture();
        }
        androidx.media3.common.util.Assertions.checkState(((android.os.HandlerThread) androidx.media3.common.util.Assertions.checkStateNotNull(this.playbackThread)).isAlive());
        for (int i = 0; i < this.players.size(); i++) {
            this.players.get(i).release();
        }
        ((androidx.media3.transformer.CompositionPlayerInternal) androidx.media3.common.util.Assertions.checkStateNotNull(this.compositionPlayerInternal)).release();
        removeSurfaceCallbacks();
        this.compositionInternalListenerHandler.removeCallbacksAndMessages(null);
        this.displaySurface = null;
        ((android.os.HandlerThread) androidx.media3.common.util.Assertions.checkStateNotNull(this.playbackThread)).quitSafely();
        this.applicationHandler.removeCallbacksAndMessages(null);
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleClearVideoOutput(java.lang.Object obj) {
        androidx.media3.common.util.Assertions.checkArgument(androidx.media3.common.util.Util.areEqual(obj, this.videoOutput));
        this.videoOutput = null;
        if (this.composition == null) {
            return com.google.common.util.concurrent.Futures.immediateVoidFuture();
        }
        removeSurfaceCallbacks();
        clearVideoSurfaceInternal();
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetVideoOutput(java.lang.Object obj) {
        boolean z = obj instanceof android.view.SurfaceHolder;
        if (!z && !(obj instanceof android.view.SurfaceView)) {
            throw new java.lang.UnsupportedOperationException(obj.getClass().toString());
        }
        this.videoOutput = obj;
        if (this.composition == null) {
            return com.google.common.util.concurrent.Futures.immediateVoidFuture();
        }
        if (z) {
            setVideoSurfaceHolderInternal((android.view.SurfaceHolder) obj);
        } else {
            setVideoSurfaceHolderInternal(((android.view.SurfaceView) obj).getHolder());
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetVolume(float f) {
        this.finalAudioSink.setVolume(androidx.media3.common.util.Util.constrainValue(f, 0.0f, 1.0f));
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSeek(int i, long j, int i2) {
        androidx.media3.transformer.CompositionPlayerInternal compositionPlayerInternal = (androidx.media3.transformer.CompositionPlayerInternal) androidx.media3.common.util.Assertions.checkStateNotNull(this.compositionPlayerInternal);
        compositionPlayerInternal.startSeek(j);
        for (int i3 = 0; i3 < this.players.size(); i3++) {
            this.players.get(i3).seekTo(j);
        }
        compositionPlayerInternal.endSeek();
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.transformer.CompositionPlayerInternal.Listener
    public void onError(java.lang.String str, java.lang.Exception exc, int i) {
        maybeUpdatePlaybackError(str, exc, i);
    }

    private void updatePlaybackState() {
        if (this.players.isEmpty() || this.playbackException != null) {
            this.playbackState = 1;
            return;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.players.size(); i4++) {
            int playbackState = this.players.get(i4).getPlaybackState();
            if (playbackState == 1) {
                i++;
            } else if (playbackState == 2) {
                i2++;
            } else if (playbackState == 3) {
                continue;
            } else {
                if (playbackState != 4) {
                    throw new java.lang.IllegalStateException(java.lang.String.valueOf(playbackState));
                }
                i3++;
            }
        }
        if (i > 0) {
            this.playbackState = 1;
            return;
        }
        if (i2 > 0) {
            this.playbackState = 2;
        } else if (i3 == this.players.size()) {
            this.playbackState = 4;
        } else {
            this.playbackState = 3;
        }
    }

    private void setCompositionInternal(androidx.media3.transformer.Composition composition) {
        androidx.media3.transformer.SequencePlayerRenderersWrapper sequencePlayerRenderersWrapperCreateForAudio;
        this.compositionDurationUs = getCompositionDurationUs(composition);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CompositionPlaybackThread", -16);
        this.playbackThread = handlerThread;
        handlerThread.start();
        androidx.media3.transformer.PreviewAudioPipeline previewAudioPipeline = new androidx.media3.transformer.PreviewAudioPipeline(new androidx.media3.transformer.DefaultAudioMixer.Factory(), composition.effects.audioProcessors, (androidx.media3.exoplayer.audio.AudioSink) androidx.media3.common.util.Assertions.checkNotNull(this.finalAudioSink));
        androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProviderBuild = new androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Builder(this.context, new androidx.media3.exoplayer.video.VideoFrameReleaseControl(this.context, new androidx.media3.transformer.CompositionPlayer.CompositionFrameTimingEvaluator(), 0L)).setPreviewingVideoGraphFactory((androidx.media3.common.PreviewingVideoGraph.Factory) androidx.media3.common.util.Assertions.checkNotNull(this.previewingVideoGraphFactory)).setClock(this.clock).build();
        compositingVideoSinkProviderBuild.addListener(this);
        int i = 0;
        while (i < composition.sequences.size()) {
            androidx.media3.transformer.EditedMediaItemSequence editedMediaItemSequence = composition.sequences.get(i);
            if (i == 0) {
                sequencePlayerRenderersWrapperCreateForAudio = androidx.media3.transformer.SequencePlayerRenderersWrapper.create(this.context, editedMediaItemSequence, previewAudioPipeline, compositingVideoSinkProviderBuild, this.imageDecoderFactory);
            } else {
                sequencePlayerRenderersWrapperCreateForAudio = androidx.media3.transformer.SequencePlayerRenderersWrapper.createForAudio(this.context, editedMediaItemSequence, previewAudioPipeline);
            }
            androidx.media3.exoplayer.ExoPlayer.Builder clock = new androidx.media3.exoplayer.ExoPlayer.Builder(this.context).setLooper(getApplicationLooper()).setPlaybackLooper(this.playbackThread.getLooper()).setRenderersFactory(sequencePlayerRenderersWrapperCreateForAudio).setHandleAudioBecomingNoisy(true).setClock(this.clock);
            if (i == 0) {
                clock.setTrackSelector(new androidx.media3.transformer.CompositionPlayer.CompositionTrackSelector(this.context));
            }
            androidx.media3.exoplayer.ExoPlayer exoPlayerBuild = clock.build();
            exoPlayerBuild.addListener(new androidx.media3.transformer.CompositionPlayer.PlayerListener(i));
            exoPlayerBuild.addAnalyticsListener(new androidx.media3.exoplayer.util.EventLogger());
            setPlayerSequence(exoPlayerBuild, editedMediaItemSequence, i == 0);
            this.players.add(exoPlayerBuild);
            if (i == 0) {
                invalidateState();
                this.playlist = createPlaylist();
            }
            i++;
        }
        this.compositionPlayerInternal = new androidx.media3.transformer.CompositionPlayerInternal(this.playbackThread.getLooper(), this.clock, previewAudioPipeline, compositingVideoSinkProviderBuild, this, this.compositionInternalListenerHandler);
    }

    private void setPlayerSequence(androidx.media3.exoplayer.ExoPlayer exoPlayer, androidx.media3.transformer.EditedMediaItemSequence editedMediaItemSequence, boolean z) {
        androidx.media3.exoplayer.source.ConcatenatingMediaSource2.Builder builderUseDefaultMediaSourceFactory = new androidx.media3.exoplayer.source.ConcatenatingMediaSource2.Builder().useDefaultMediaSourceFactory(this.context);
        for (int i = 0; i < editedMediaItemSequence.editedMediaItems.size(); i++) {
            androidx.media3.transformer.EditedMediaItem editedMediaItem = editedMediaItemSequence.editedMediaItems.get(i);
            androidx.media3.common.util.Assertions.checkArgument(editedMediaItem.durationUs != androidx.media3.common.C.TIME_UNSET);
            long presentationDurationUs = editedMediaItem.getPresentationDurationUs();
            if (z) {
                androidx.media3.exoplayer.source.DefaultMediaSourceFactory defaultMediaSourceFactory = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(this.context);
                androidx.media3.exoplayer.source.ExternalLoader externalLoader = this.externalImageLoader;
                if (externalLoader != null) {
                    defaultMediaSourceFactory.setExternalImageLoader(externalLoader);
                }
                builderUseDefaultMediaSourceFactory.add(new androidx.media3.exoplayer.source.MergingMediaSource(defaultMediaSourceFactory.createMediaSource(editedMediaItem.mediaItem), new androidx.media3.exoplayer.source.SilenceMediaSource(editedMediaItem.durationUs)), androidx.media3.common.util.Util.usToMs(presentationDurationUs));
            } else {
                builderUseDefaultMediaSourceFactory.add(editedMediaItem.mediaItem, androidx.media3.common.util.Util.usToMs(presentationDurationUs));
            }
        }
        exoPlayer.setMediaSource(builderUseDefaultMediaSourceFactory.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getContentPositionMs() {
        return this.players.isEmpty() ? androidx.media3.common.C.TIME_UNSET : this.players.get(0).getContentPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBufferedPositionMs() {
        if (this.players.isEmpty()) {
            return 0L;
        }
        long jMin = 2147483647L;
        for (int i = 0; i < this.players.size(); i++) {
            jMin = java.lang.Math.min(jMin, this.players.get(i).getBufferedPosition());
        }
        return jMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getTotalBufferedDurationMs() {
        if (this.players.isEmpty()) {
            return 0L;
        }
        long jMin = 2147483647L;
        for (int i = 0; i < this.players.size(); i++) {
            jMin = java.lang.Math.min(jMin, this.players.get(i).getTotalBufferedDuration());
        }
        return jMin;
    }

    private boolean getRenderedFirstFrameAndReset() {
        boolean z = this.renderedFirstFrame;
        this.renderedFirstFrame = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeUpdatePlaybackError(java.lang.String str, java.lang.Exception exc, int i) {
        if (this.playbackException == null) {
            this.playbackException = new androidx.media3.common.PlaybackException(str, exc, i);
            for (int i2 = 0; i2 < this.players.size(); i2++) {
                this.players.get(i2).stop();
            }
            invalidateState();
            return;
        }
        androidx.media3.common.util.Log.w(TAG, str, exc);
    }

    private void setVideoSurfaceHolderInternal(android.view.SurfaceHolder surfaceHolder) {
        removeSurfaceCallbacks();
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this);
        android.view.Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            androidx.media3.common.util.Size size = new androidx.media3.common.util.Size(surfaceHolder.getSurfaceFrame().width(), surfaceHolder.getSurfaceFrame().height());
            this.videoOutputSize = size;
            setVideoSurfaceInternal(surface, size);
            return;
        }
        clearVideoSurfaceInternal();
    }

    private void setVideoSurfaceInternal(android.view.Surface surface, androidx.media3.common.util.Size size) {
        this.displaySurface = surface;
        maybeSetOutputSurfaceInfo(size.getWidth(), size.getHeight());
    }

    private void maybeSetOutputSurfaceInfo(int i, int i2) {
        androidx.media3.transformer.CompositionPlayerInternal compositionPlayerInternal;
        android.view.Surface surface = this.displaySurface;
        if (i == 0 || i2 == 0 || surface == null || (compositionPlayerInternal = this.compositionPlayerInternal) == null) {
            return;
        }
        compositionPlayerInternal.setOutputSurfaceInfo(surface, new androidx.media3.common.util.Size(i, i2));
    }

    private void clearVideoSurfaceInternal() {
        this.displaySurface = null;
        androidx.media3.transformer.CompositionPlayerInternal compositionPlayerInternal = this.compositionPlayerInternal;
        if (compositionPlayerInternal != null) {
            compositionPlayerInternal.clearOutputSurface();
        }
    }

    private void removeSurfaceCallbacks() {
        android.view.SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            this.surfaceHolder = null;
        }
    }

    private com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.MediaItemData> createPlaylist() {
        androidx.media3.common.util.Assertions.checkNotNull(java.lang.Boolean.valueOf(this.compositionDurationUs != androidx.media3.common.C.TIME_UNSET));
        return com.google.common.collect.ImmutableList.of(new androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder("CompositionTimeline").setMediaItem(androidx.media3.common.MediaItem.EMPTY).setDurationUs(this.compositionDurationUs).build());
    }

    private static long getCompositionDurationUs(androidx.media3.transformer.Composition composition) {
        androidx.media3.common.util.Assertions.checkState(!composition.sequences.isEmpty());
        long sequenceDurationUs = getSequenceDurationUs(composition.sequences.get(0));
        for (int i = 0; i < composition.sequences.size(); i++) {
            long sequenceDurationUs2 = getSequenceDurationUs(composition.sequences.get(i));
            androidx.media3.common.util.Assertions.checkArgument(sequenceDurationUs == sequenceDurationUs2, androidx.media3.common.util.Util.formatInvariant("Non-matching sequence durations. First sequence duration: %d us, sequence [%d] duration: %d us", java.lang.Long.valueOf(sequenceDurationUs), java.lang.Integer.valueOf(i), java.lang.Long.valueOf(sequenceDurationUs2)));
        }
        return sequenceDurationUs;
    }

    private static long getSequenceDurationUs(androidx.media3.transformer.EditedMediaItemSequence editedMediaItemSequence) {
        long presentationDurationUs = 0;
        for (int i = 0; i < editedMediaItemSequence.editedMediaItems.size(); i++) {
            presentationDurationUs += editedMediaItemSequence.editedMediaItems.get(i).getPresentationDurationUs();
        }
        androidx.media3.common.util.Assertions.checkState(presentationDurationUs > 0, java.lang.String.valueOf(presentationDurationUs));
        return presentationDurationUs;
    }

    private static final class CompositionFrameTimingEvaluator implements androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator {
        private static final long FRAME_LATE_THRESHOLD_US = -30000;
        private static final long FRAME_RELEASE_THRESHOLD_US = 100000;

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
        public boolean shouldDropFrame(long j, long j2, boolean z) {
            return j < FRAME_LATE_THRESHOLD_US && !z;
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
        public boolean shouldForceReleaseFrame(long j, long j2) {
            return j < FRAME_LATE_THRESHOLD_US && j2 > 100000;
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
        public boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2) {
            return false;
        }

        private CompositionFrameTimingEvaluator() {
        }
    }

    private final class PlayerListener implements androidx.media3.common.Player.Listener {
        private final int playerIndex;

        public PlayerListener(int i) {
            this.playerIndex = i;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
            if (events.containsAny(androidx.media3.transformer.CompositionPlayer.SUPPORTED_LISTENER_EVENTS)) {
                androidx.media3.transformer.CompositionPlayer.this.invalidateState();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            androidx.media3.transformer.CompositionPlayer.this.playWhenReadyChangeReason = i;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(androidx.media3.common.PlaybackException playbackException) {
            androidx.media3.transformer.CompositionPlayer.this.maybeUpdatePlaybackError("error from player " + this.playerIndex, playbackException, playbackException.errorCode);
        }
    }

    private static final class CompositionTrackSelector extends androidx.media3.exoplayer.trackselection.DefaultTrackSelector {
        private static final java.lang.String SILENCE_AUDIO_TRACK_GROUP_ID = "1:";

        public CompositionTrackSelector(android.content.Context context) {
            super(context);
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector
        protected android.util.Pair<androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectAudioTrack(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters) throws androidx.media3.exoplayer.ExoPlaybackException {
            int i = 0;
            while (true) {
                if (i >= mappedTrackInfo.getRendererCount()) {
                    i = -1;
                    break;
                }
                if (mappedTrackInfo.getRendererType(i) == 1) {
                    break;
                }
                i++;
            }
            androidx.media3.common.util.Assertions.checkState(i != -1);
            androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            if (trackGroups.length > 1) {
                boolean z = false;
                int i2 = -1;
                for (int i3 = 0; i3 < trackGroups.length; i3++) {
                    if (trackGroups.get(i3).id.startsWith(SILENCE_AUDIO_TRACK_GROUP_ID)) {
                        i2 = i3;
                    } else {
                        for (int i4 = 0; i4 < trackGroups.get(i3).length; i4++) {
                            z |= androidx.media3.exoplayer.RendererCapabilities.getFormatSupport(iArr[i][i3][i4]) == 4;
                        }
                    }
                }
                androidx.media3.common.util.Assertions.checkState(i2 != -1);
                if (z) {
                    iArr[i][trackGroups.length - 1][0] = androidx.media3.exoplayer.RendererCapabilities.create(0);
                }
            }
            return super.selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        }
    }
}
