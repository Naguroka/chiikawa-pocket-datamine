package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock
public class MediaController implements androidx.media3.common.Player {
    public static final java.lang.String KEY_MEDIA_NOTIFICATION_CONTROLLER_FLAG = "androidx.media3.session.MediaNotificationManager";
    public static final long RELEASE_UNBIND_TIMEOUT_MS = 30000;
    private static final java.lang.String TAG = "MediaController";
    private static final java.lang.String WRONG_THREAD_ERROR_MESSAGE = "MediaController method is called from a wrong thread. See javadoc of MediaController for details.";
    final android.os.Handler applicationHandler;
    final androidx.media3.session.MediaController.ConnectionCallback connectionCallback;
    private boolean connectionNotified;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final androidx.media3.session.MediaController.MediaControllerImpl impl;
    final androidx.media3.session.MediaController.Listener listener;
    private boolean released;
    private long timeDiffMs;
    private final androidx.media3.common.Timeline.Window window;

    interface ConnectionCallback {
        void onAccepted();

        void onRejected();
    }

    interface MediaControllerImpl {
        void addListener(androidx.media3.common.Player.Listener listener);

        void addMediaItem(int i, androidx.media3.common.MediaItem mediaItem);

        void addMediaItem(androidx.media3.common.MediaItem mediaItem);

        void addMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list);

        void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list);

        void clearMediaItems();

        void clearVideoSurface();

        void clearVideoSurface(android.view.Surface surface);

        void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

        void clearVideoSurfaceView(android.view.SurfaceView surfaceView);

        void clearVideoTextureView(android.view.TextureView textureView);

        void connect();

        void decreaseDeviceVolume();

        void decreaseDeviceVolume(int i);

        androidx.media3.common.AudioAttributes getAudioAttributes();

        androidx.media3.common.Player.Commands getAvailableCommands();

        androidx.media3.session.SessionCommands getAvailableSessionCommands();

        androidx.media3.session.IMediaController getBinder();

        androidx.media3.session.legacy.MediaBrowserCompat getBrowserCompat();

        int getBufferedPercentage();

        long getBufferedPosition();

        androidx.media3.session.SessionToken getConnectedToken();

        long getContentBufferedPosition();

        long getContentDuration();

        long getContentPosition();

        android.content.Context getContext();

        int getCurrentAdGroupIndex();

        int getCurrentAdIndexInAdGroup();

        androidx.media3.common.text.CueGroup getCurrentCues();

        long getCurrentLiveOffset();

        int getCurrentMediaItemIndex();

        int getCurrentPeriodIndex();

        long getCurrentPosition();

        androidx.media3.common.Timeline getCurrentTimeline();

        androidx.media3.common.Tracks getCurrentTracks();

        com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> getCustomLayout();

        androidx.media3.common.DeviceInfo getDeviceInfo();

        int getDeviceVolume();

        long getDuration();

        long getMaxSeekToPreviousPosition();

        androidx.media3.common.MediaMetadata getMediaMetadata();

        int getNextMediaItemIndex();

        boolean getPlayWhenReady();

        androidx.media3.common.PlaybackParameters getPlaybackParameters();

        int getPlaybackState();

        int getPlaybackSuppressionReason();

        androidx.media3.common.PlaybackException getPlayerError();

        androidx.media3.common.MediaMetadata getPlaylistMetadata();

        int getPreviousMediaItemIndex();

        int getRepeatMode();

        long getSeekBackIncrement();

        long getSeekForwardIncrement();

        android.app.PendingIntent getSessionActivity();

        android.os.Bundle getSessionExtras();

        boolean getShuffleModeEnabled();

        androidx.media3.common.util.Size getSurfaceSize();

        long getTotalBufferedDuration();

        androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters();

        androidx.media3.common.VideoSize getVideoSize();

        float getVolume();

        boolean hasNextMediaItem();

        boolean hasPreviousMediaItem();

        void increaseDeviceVolume();

        void increaseDeviceVolume(int i);

        boolean isConnected();

        boolean isDeviceMuted();

        boolean isLoading();

        boolean isPlaying();

        boolean isPlayingAd();

        void moveMediaItem(int i, int i2);

        void moveMediaItems(int i, int i2, int i3);

        void pause();

        void play();

        void prepare();

        void release();

        void removeListener(androidx.media3.common.Player.Listener listener);

        void removeMediaItem(int i);

        void removeMediaItems(int i, int i2);

        void replaceMediaItem(int i, androidx.media3.common.MediaItem mediaItem);

        void replaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list);

        void seekBack();

        void seekForward();

        void seekTo(int i, long j);

        void seekTo(long j);

        void seekToDefaultPosition();

        void seekToDefaultPosition(int i);

        void seekToNext();

        void seekToNextMediaItem();

        void seekToPrevious();

        void seekToPreviousMediaItem();

        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle);

        void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z);

        void setDeviceMuted(boolean z);

        void setDeviceMuted(boolean z, int i);

        void setDeviceVolume(int i);

        void setDeviceVolume(int i, int i2);

        void setMediaItem(androidx.media3.common.MediaItem mediaItem);

        void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j);

        void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z);

        void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list);

        void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j);

        void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z);

        void setPlayWhenReady(boolean z);

        void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters);

        void setPlaybackSpeed(float f);

        void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata);

        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> setRating(androidx.media3.common.Rating rating);

        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> setRating(java.lang.String str, androidx.media3.common.Rating rating);

        void setRepeatMode(int i);

        void setShuffleModeEnabled(boolean z);

        void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters);

        void setVideoSurface(android.view.Surface surface);

        void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

        void setVideoSurfaceView(android.view.SurfaceView surfaceView);

        void setVideoTextureView(android.view.TextureView textureView);

        void setVolume(float f);

        void stop();
    }

    @Override // androidx.media3.common.Player
    public final boolean canAdvertiseSession() {
        return false;
    }

    @Override // androidx.media3.common.Player
    public final java.lang.Object getCurrentManifest() {
        return null;
    }

    public static final class Builder {
        private androidx.media3.common.util.BitmapLoader bitmapLoader;
        private final android.content.Context context;
        private final androidx.media3.session.SessionToken token;
        private android.os.Bundle connectionHints = android.os.Bundle.EMPTY;
        private androidx.media3.session.MediaController.Listener listener = new androidx.media3.session.MediaController.Listener() { // from class: androidx.media3.session.MediaController.Builder.1
        };
        private android.os.Looper applicationLooper = androidx.media3.common.util.Util.getCurrentOrMainLooper();

        public Builder(android.content.Context context, androidx.media3.session.SessionToken sessionToken) {
            this.context = (android.content.Context) androidx.media3.common.util.Assertions.checkNotNull(context);
            this.token = (androidx.media3.session.SessionToken) androidx.media3.common.util.Assertions.checkNotNull(sessionToken);
        }

        public androidx.media3.session.MediaController.Builder setConnectionHints(android.os.Bundle bundle) {
            this.connectionHints = new android.os.Bundle((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle));
            return this;
        }

        public androidx.media3.session.MediaController.Builder setListener(androidx.media3.session.MediaController.Listener listener) {
            this.listener = (androidx.media3.session.MediaController.Listener) androidx.media3.common.util.Assertions.checkNotNull(listener);
            return this;
        }

        public androidx.media3.session.MediaController.Builder setApplicationLooper(android.os.Looper looper) {
            this.applicationLooper = (android.os.Looper) androidx.media3.common.util.Assertions.checkNotNull(looper);
            return this;
        }

        public androidx.media3.session.MediaController.Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            this.bitmapLoader = (androidx.media3.common.util.BitmapLoader) androidx.media3.common.util.Assertions.checkNotNull(bitmapLoader);
            return this;
        }

        public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaController> buildAsync() {
            final androidx.media3.session.MediaControllerHolder mediaControllerHolder = new androidx.media3.session.MediaControllerHolder(this.applicationLooper);
            if (this.token.isLegacySession() && this.bitmapLoader == null) {
                this.bitmapLoader = new androidx.media3.session.CacheBitmapLoader(new androidx.media3.datasource.DataSourceBitmapLoader(this.context));
            }
            final androidx.media3.session.MediaController mediaController = new androidx.media3.session.MediaController(this.context, this.token, this.connectionHints, this.listener, this.applicationLooper, mediaControllerHolder, this.bitmapLoader);
            androidx.media3.common.util.Util.postOrRun(new android.os.Handler(this.applicationLooper), new java.lang.Runnable() { // from class: androidx.media3.session.MediaController$Builder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    mediaControllerHolder.setController(mediaController);
                }
            });
            return mediaControllerHolder;
        }
    }

    public interface Listener {
        default void onAvailableSessionCommandsChanged(androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionCommands sessionCommands) {
        }

        default void onCustomLayoutChanged(androidx.media3.session.MediaController mediaController, java.util.List<androidx.media3.session.CommandButton> list) {
        }

        default void onDisconnected(androidx.media3.session.MediaController mediaController) {
        }

        default void onError(androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionError sessionError) {
        }

        default void onExtrasChanged(androidx.media3.session.MediaController mediaController, android.os.Bundle bundle) {
        }

        default void onSessionActivityChanged(androidx.media3.session.MediaController mediaController, android.app.PendingIntent pendingIntent) {
        }

        default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> onSetCustomLayout(androidx.media3.session.MediaController mediaController, java.util.List<androidx.media3.session.CommandButton> list) {
            return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-6));
        }

        default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> onCustomCommand(androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
            return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-6));
        }
    }

    MediaController(android.content.Context context, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, androidx.media3.session.MediaController.Listener listener, android.os.Looper looper, androidx.media3.session.MediaController.ConnectionCallback connectionCallback, androidx.media3.common.util.BitmapLoader bitmapLoader) {
        androidx.media3.common.util.Assertions.checkNotNull(context, "context must not be null");
        androidx.media3.common.util.Assertions.checkNotNull(sessionToken, "token must not be null");
        androidx.media3.common.util.Log.i(TAG, "Init " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + com.ironsource.y8.i.e);
        this.window = new androidx.media3.common.Timeline.Window();
        this.timeDiffMs = androidx.media3.common.C.TIME_UNSET;
        this.listener = listener;
        this.applicationHandler = new android.os.Handler(looper);
        this.connectionCallback = connectionCallback;
        androidx.media3.session.MediaController.MediaControllerImpl mediaControllerImplCreateImpl = createImpl(context, sessionToken, bundle, looper, bitmapLoader);
        this.impl = mediaControllerImplCreateImpl;
        mediaControllerImplCreateImpl.connect();
    }

    androidx.media3.session.MediaController.MediaControllerImpl createImpl(android.content.Context context, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, android.os.Looper looper, androidx.media3.common.util.BitmapLoader bitmapLoader) {
        if (sessionToken.isLegacySession()) {
            return new androidx.media3.session.MediaControllerImplLegacy(context, this, sessionToken, looper, (androidx.media3.common.util.BitmapLoader) androidx.media3.common.util.Assertions.checkNotNull(bitmapLoader));
        }
        return new androidx.media3.session.MediaControllerImplBase(context, this, sessionToken, bundle, looper);
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring stop().");
        } else {
            this.impl.stop();
        }
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        verifyApplicationThread();
        if (this.released) {
            return;
        }
        androidx.media3.common.util.Log.i(TAG, "Release " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + "] [" + androidx.media3.common.MediaLibraryInfo.registeredModules() + com.ironsource.y8.i.e);
        this.released = true;
        this.applicationHandler.removeCallbacksAndMessages(null);
        try {
            this.impl.release();
        } catch (java.lang.Exception e) {
            androidx.media3.common.util.Log.d(TAG, "Exception while releasing impl", e);
        }
        if (this.connectionNotified) {
            notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaController$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m234lambda$release$0$androidxmedia3sessionMediaController((androidx.media3.session.MediaController.Listener) obj);
                }
            });
        } else {
            this.connectionNotified = true;
            this.connectionCallback.onRejected();
        }
    }

    /* JADX INFO: renamed from: lambda$release$0$androidx-media3-session-MediaController, reason: not valid java name */
    /* synthetic */ void m234lambda$release$0$androidxmedia3sessionMediaController(androidx.media3.session.MediaController.Listener listener) {
        listener.onDisconnected(this);
    }

    public static void releaseFuture(java.util.concurrent.Future<? extends androidx.media3.session.MediaController> future) {
        if (future.cancel(false)) {
            return;
        }
        try {
            ((androidx.media3.session.MediaController) com.google.common.util.concurrent.Futures.getDone(future)).release();
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            androidx.media3.common.util.Log.w(TAG, "MediaController future failed (so we couldn't release it)", e);
        }
    }

    public final androidx.media3.session.SessionToken getConnectedToken() {
        if (isConnected()) {
            return this.impl.getConnectedToken();
        }
        return null;
    }

    public final boolean isConnected() {
        return this.impl.isConnected();
    }

    @Override // androidx.media3.common.Player
    public final void play() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring play().");
        } else {
            this.impl.play();
        }
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring pause().");
        } else {
            this.impl.pause();
        }
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring prepare().");
        } else {
            this.impl.prepare();
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        } else {
            this.impl.seekToDefaultPosition();
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition(int i) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        } else {
            this.impl.seekToDefaultPosition(i);
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(long j) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        } else {
            this.impl.seekTo(j);
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(int i, long j) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        } else {
            this.impl.seekTo(i, j);
        }
    }

    @Override // androidx.media3.common.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getSeekBackIncrement();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final void seekBack() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekBack().");
        } else {
            this.impl.seekBack();
        }
    }

    @Override // androidx.media3.common.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getSeekForwardIncrement();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final void seekForward() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekForward().");
        } else {
            this.impl.seekForward();
        }
    }

    public final android.app.PendingIntent getSessionActivity() {
        if (isConnected()) {
            return this.impl.getSessionActivity();
        }
        return null;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.PlaybackException getPlayerError() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPlayerError();
        }
        return null;
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(boolean z) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setPlayWhenReady(z);
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThread();
        return isConnected() && this.impl.getPlayWhenReady();
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPlaybackSuppressionReason();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPlaybackState();
        }
        return 1;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlaying() {
        verifyApplicationThread();
        return isConnected() && this.impl.isPlaying();
    }

    @Override // androidx.media3.common.Player
    public final boolean isLoading() {
        verifyApplicationThread();
        return isConnected() && this.impl.isLoading();
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getDuration() : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentPosition();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final long getBufferedPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getBufferedPosition();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final int getBufferedPercentage() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getBufferedPercentage();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getTotalBufferedDuration();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentLiveOffset() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentLiveOffset() : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.common.Player
    public final long getContentDuration() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getContentDuration() : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getContentPosition();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getContentBufferedPosition();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        verifyApplicationThread();
        return isConnected() && this.impl.isPlayingAd();
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentAdGroupIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentAdIndexInAdGroup();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(playbackParameters, "playbackParameters must not be null");
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setPlaybackParameters().");
        } else {
            this.impl.setPlaybackParameters(playbackParameters);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackSpeed(float f) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setPlaybackSpeed().");
        } else {
            this.impl.setPlaybackSpeed(f);
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getPlaybackParameters() : androidx.media3.common.PlaybackParameters.DEFAULT;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        if (!isConnected()) {
            return androidx.media3.common.AudioAttributes.DEFAULT;
        }
        return this.impl.getAudioAttributes();
    }

    public final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> setRating(java.lang.String str, androidx.media3.common.Rating rating) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(str, "mediaId must not be null");
        androidx.media3.common.util.Assertions.checkNotEmpty(str, "mediaId must not be empty");
        androidx.media3.common.util.Assertions.checkNotNull(rating, "rating must not be null");
        if (isConnected()) {
            return this.impl.setRating(str, rating);
        }
        return createDisconnectedFuture();
    }

    public final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> setRating(androidx.media3.common.Rating rating) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(rating, "rating must not be null");
        if (isConnected()) {
            return this.impl.setRating(rating);
        }
        return createDisconnectedFuture();
    }

    public final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(sessionCommand, "command must not be null");
        androidx.media3.common.util.Assertions.checkArgument(sessionCommand.commandCode == 0, "command must be a custom command");
        if (isConnected()) {
            return this.impl.sendCustomCommand(sessionCommand, bundle);
        }
        return createDisconnectedFuture();
    }

    public final com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> getCustomLayout() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCustomLayout() : com.google.common.collect.ImmutableList.of();
    }

    public final android.os.Bundle getSessionExtras() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getSessionExtras() : android.os.Bundle.EMPTY;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentTimeline() : androidx.media3.common.Timeline.EMPTY;
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(mediaItem, "mediaItems must not be null");
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItem().");
        } else {
            this.impl.setMediaItem(mediaItem);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(mediaItem, "mediaItems must not be null");
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItem().");
        } else {
            this.impl.setMediaItem(mediaItem, j);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(mediaItem, "mediaItems must not be null");
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        } else {
            this.impl.setMediaItem(mediaItem, z);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.common.util.Assertions.checkArgument(list.get(i) != null, "items must not contain null, index=" + i);
        }
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        } else {
            this.impl.setMediaItems(list);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.common.util.Assertions.checkArgument(list.get(i) != null, "items must not contain null, index=" + i);
        }
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        } else {
            this.impl.setMediaItems(list, z);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.media3.common.util.Assertions.checkArgument(list.get(i2) != null, "items must not contain null, index=" + i2);
        }
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        } else {
            this.impl.setMediaItems(list, i, j);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(mediaMetadata, "playlistMetadata must not be null");
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setPlaylistMetadata().");
        } else {
            this.impl.setPlaylistMetadata(mediaMetadata);
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getPlaylistMetadata() : androidx.media3.common.MediaMetadata.EMPTY;
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItem(androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring addMediaItem().");
        } else {
            this.impl.addMediaItem(mediaItem);
        }
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring addMediaItem().");
        } else {
            this.impl.addMediaItem(i, mediaItem);
        }
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring addMediaItems().");
        } else {
            this.impl.addMediaItems(list);
        }
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring addMediaItems().");
        } else {
            this.impl.addMediaItems(i, list);
        }
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItem(int i) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring removeMediaItem().");
        } else {
            this.impl.removeMediaItem(i);
        }
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItems(int i, int i2) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring removeMediaItems().");
        } else {
            this.impl.removeMediaItems(i, i2);
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearMediaItems() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearMediaItems().");
        } else {
            this.impl.clearMediaItems();
        }
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItem(int i, int i2) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring moveMediaItem().");
        } else {
            this.impl.moveMediaItem(i, i2);
        }
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItems(int i, int i2, int i3) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring moveMediaItems().");
        } else {
            this.impl.moveMediaItems(i, i2, i3);
        }
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring replaceMediaItem().");
        } else {
            this.impl.replaceMediaItem(i, mediaItem);
        }
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring replaceMediaItems().");
        } else {
            this.impl.replaceMediaItems(i, i2, list);
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemDynamic() {
        verifyApplicationThread();
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isDynamic;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemLive() {
        verifyApplicationThread();
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isLive();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemSeekable() {
        verifyApplicationThread();
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isSeekable;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaItem getCurrentMediaItem() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem;
    }

    @Override // androidx.media3.common.Player
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaItem getMediaItemAt(int i) {
        return getCurrentTimeline().getWindow(i, this.window).mediaItem;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentPeriodIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentMediaItemIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final int getPreviousMediaItemIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPreviousMediaItemIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final int getNextMediaItemIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getNextMediaItemIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean hasPrevious() {
        return hasPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean hasPreviousWindow() {
        return hasPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    public final boolean hasPreviousMediaItem() {
        verifyApplicationThread();
        return isConnected() && this.impl.hasPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    public final boolean hasNextMediaItem() {
        verifyApplicationThread();
        return isConnected() && this.impl.hasNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void previous() {
        seekToPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    public final void seekToPreviousMediaItem() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        } else {
            this.impl.seekToPreviousMediaItem();
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    public final void seekToNextMediaItem() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekToNextMediaItem().");
        } else {
            this.impl.seekToNextMediaItem();
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToPrevious() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekToPrevious().");
        } else {
            this.impl.seekToPrevious();
        }
    }

    @Override // androidx.media3.common.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getMaxSeekToPreviousPosition();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final void seekToNext() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekToNext().");
        } else {
            this.impl.seekToNext();
        }
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getRepeatMode();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(int i) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setRepeatMode().");
        } else {
            this.impl.setRepeatMode(i);
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return isConnected() && this.impl.getShuffleModeEnabled();
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(boolean z) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setShuffleMode().");
        } else {
            this.impl.setShuffleModeEnabled(z);
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.VideoSize getVideoSize() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getVideoSize() : androidx.media3.common.VideoSize.UNKNOWN;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.util.Size getSurfaceSize() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getSurfaceSize() : androidx.media3.common.util.Size.UNKNOWN;
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurface().");
        } else {
            this.impl.clearVideoSurface();
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurface().");
        } else {
            this.impl.clearVideoSurface(surface);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setVideoSurface().");
        } else {
            this.impl.setVideoSurface(surface);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setVideoSurfaceHolder().");
        } else {
            this.impl.setVideoSurfaceHolder(surfaceHolder);
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurfaceHolder().");
        } else {
            this.impl.clearVideoSurfaceHolder(surfaceHolder);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setVideoSurfaceView().");
        } else {
            this.impl.setVideoSurfaceView(surfaceView);
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurfaceView().");
        } else {
            this.impl.clearVideoSurfaceView(surfaceView);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setVideoTextureView().");
        } else {
            this.impl.setVideoTextureView(textureView);
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearVideoTextureView().");
        } else {
            this.impl.clearVideoTextureView(textureView);
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.text.CueGroup getCurrentCues() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentCues() : androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getVolume();
        }
        return 1.0f;
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(float f) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkArgument(f >= 0.0f && f <= 1.0f, "volume must be between 0 and 1");
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setVolume().");
        } else {
            this.impl.setVolume(f);
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        if (!isConnected()) {
            return androidx.media3.common.DeviceInfo.UNKNOWN;
        }
        return this.impl.getDeviceInfo();
    }

    @Override // androidx.media3.common.Player
    public final int getDeviceVolume() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getDeviceVolume();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public final boolean isDeviceMuted() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.isDeviceMuted();
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void setDeviceVolume(int i) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setDeviceVolume().");
        } else {
            this.impl.setDeviceVolume(i);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceVolume(int i, int i2) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setDeviceVolume().");
        } else {
            this.impl.setDeviceVolume(i, i2);
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring increaseDeviceVolume().");
        } else {
            this.impl.increaseDeviceVolume();
        }
    }

    @Override // androidx.media3.common.Player
    public final void increaseDeviceVolume(int i) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring increaseDeviceVolume().");
        } else {
            this.impl.increaseDeviceVolume(i);
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring decreaseDeviceVolume().");
        } else {
            this.impl.decreaseDeviceVolume();
        }
    }

    @Override // androidx.media3.common.Player
    public final void decreaseDeviceVolume(int i) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring decreaseDeviceVolume().");
        } else {
            this.impl.decreaseDeviceVolume(i);
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void setDeviceMuted(boolean z) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setDeviceMuted().");
        } else {
            this.impl.setDeviceMuted(z);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceMuted(boolean z, int i) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setDeviceMuted().");
        } else {
            this.impl.setDeviceMuted(z, i);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setAudioAttributes().");
        } else {
            this.impl.setAudioAttributes(audioAttributes, z);
        }
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getMediaMetadata() : androidx.media3.common.MediaMetadata.EMPTY;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Tracks getCurrentTracks() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentTracks() : androidx.media3.common.Tracks.EMPTY;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        if (!isConnected()) {
            return androidx.media3.common.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT;
        }
        return this.impl.getTrackSelectionParameters();
    }

    @Override // androidx.media3.common.Player
    public final void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        this.impl.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player
    public final android.os.Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    final long getTimeDiffMs() {
        return this.timeDiffMs;
    }

    final void setTimeDiffMs(long j) {
        verifyApplicationThread();
        this.timeDiffMs = j;
    }

    @Override // androidx.media3.common.Player
    public final void addListener(androidx.media3.common.Player.Listener listener) {
        androidx.media3.common.util.Assertions.checkNotNull(listener, "listener must not be null");
        this.impl.addListener(listener);
    }

    @Override // androidx.media3.common.Player
    public final void removeListener(androidx.media3.common.Player.Listener listener) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotNull(listener, "listener must not be null");
        this.impl.removeListener(listener);
    }

    @Override // androidx.media3.common.Player
    public final boolean isCommandAvailable(int i) {
        return getAvailableCommands().contains(i);
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        if (!isConnected()) {
            return androidx.media3.common.Player.Commands.EMPTY;
        }
        return this.impl.getAvailableCommands();
    }

    public final boolean isSessionCommandAvailable(int i) {
        return getAvailableSessionCommands().contains(i);
    }

    public final boolean isSessionCommandAvailable(androidx.media3.session.SessionCommand sessionCommand) {
        return getAvailableSessionCommands().contains(sessionCommand);
    }

    public final androidx.media3.session.SessionCommands getAvailableSessionCommands() {
        verifyApplicationThread();
        if (!isConnected()) {
            return androidx.media3.session.SessionCommands.EMPTY;
        }
        return this.impl.getAvailableSessionCommands();
    }

    private static com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> createDisconnectedFuture() {
        return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-100));
    }

    final void runOnApplicationLooper(java.lang.Runnable runnable) {
        androidx.media3.common.util.Util.postOrRun(this.applicationHandler, runnable);
    }

    final void notifyControllerListener(androidx.media3.common.util.Consumer<androidx.media3.session.MediaController.Listener> consumer) {
        androidx.media3.common.util.Assertions.checkState(android.os.Looper.myLooper() == getApplicationLooper());
        consumer.accept(this.listener);
    }

    final void notifyAccepted() {
        androidx.media3.common.util.Assertions.checkState(android.os.Looper.myLooper() == getApplicationLooper());
        androidx.media3.common.util.Assertions.checkState(!this.connectionNotified);
        this.connectionNotified = true;
        this.connectionCallback.onAccepted();
    }

    final androidx.media3.session.IMediaController getBinder() {
        return this.impl.getBinder();
    }

    private void verifyApplicationThread() {
        androidx.media3.common.util.Assertions.checkState(android.os.Looper.myLooper() == getApplicationLooper(), WRONG_THREAD_ERROR_MESSAGE);
    }
}
