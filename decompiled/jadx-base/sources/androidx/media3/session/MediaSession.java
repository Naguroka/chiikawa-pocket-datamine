package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock
public class MediaSession {
    private final androidx.media3.session.MediaSessionImpl impl;
    private static final java.lang.Object STATIC_LOCK = new java.lang.Object();
    private static final java.util.HashMap<java.lang.String, androidx.media3.session.MediaSession> SESSION_ID_TO_SESSION_MAP = new java.util.HashMap<>();

    interface ControllerCb {
        default void onAudioAttributesChanged(int i, androidx.media3.common.AudioAttributes audioAttributes) throws android.os.RemoteException {
        }

        default void onAvailableCommandsChangedFromPlayer(int i, androidx.media3.common.Player.Commands commands) throws android.os.RemoteException {
        }

        default void onAvailableCommandsChangedFromSession(int i, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) throws android.os.RemoteException {
        }

        default void onChildrenChanged(int i, java.lang.String str, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) throws android.os.RemoteException {
        }

        default void onDeviceInfoChanged(int i, androidx.media3.common.DeviceInfo deviceInfo) throws android.os.RemoteException {
        }

        default void onDeviceVolumeChanged(int i, int i2, boolean z) throws android.os.RemoteException {
        }

        default void onDisconnected(int i) throws android.os.RemoteException {
        }

        default void onError(int i, androidx.media3.session.SessionError sessionError) throws android.os.RemoteException {
        }

        default void onIsLoadingChanged(int i, boolean z) throws android.os.RemoteException {
        }

        default void onIsPlayingChanged(int i, boolean z) throws android.os.RemoteException {
        }

        default void onLibraryResult(int i, androidx.media3.session.LibraryResult<?> libraryResult) throws android.os.RemoteException {
        }

        default void onMediaItemTransition(int i, androidx.media3.common.MediaItem mediaItem, int i2) throws android.os.RemoteException {
        }

        default void onMediaMetadataChanged(int i, androidx.media3.common.MediaMetadata mediaMetadata) throws android.os.RemoteException {
        }

        default void onPeriodicSessionPositionInfoChanged(int i, androidx.media3.session.SessionPositionInfo sessionPositionInfo, boolean z, boolean z2, int i2) throws android.os.RemoteException {
        }

        default void onPlayWhenReadyChanged(int i, boolean z, int i2) throws android.os.RemoteException {
        }

        default void onPlaybackParametersChanged(int i, androidx.media3.common.PlaybackParameters playbackParameters) throws android.os.RemoteException {
        }

        default void onPlaybackStateChanged(int i, int i2, androidx.media3.common.PlaybackException playbackException) throws android.os.RemoteException {
        }

        default void onPlaybackSuppressionReasonChanged(int i, int i2) throws android.os.RemoteException {
        }

        default void onPlayerChanged(int i, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.PlayerWrapper playerWrapper2) throws android.os.RemoteException {
        }

        default void onPlayerError(int i, androidx.media3.common.PlaybackException playbackException) throws android.os.RemoteException {
        }

        default void onPlayerInfoChanged(int i, androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Commands commands, boolean z, boolean z2, int i2) throws android.os.RemoteException {
        }

        default void onPlaylistMetadataChanged(int i, androidx.media3.common.MediaMetadata mediaMetadata) throws android.os.RemoteException {
        }

        default void onPositionDiscontinuity(int i, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i2) throws android.os.RemoteException {
        }

        default void onRenderedFirstFrame(int i) throws android.os.RemoteException {
        }

        default void onRepeatModeChanged(int i, int i2) throws android.os.RemoteException {
        }

        default void onSearchResultChanged(int i, java.lang.String str, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) throws android.os.RemoteException {
        }

        default void onSeekBackIncrementChanged(int i, long j) throws android.os.RemoteException {
        }

        default void onSeekForwardIncrementChanged(int i, long j) throws android.os.RemoteException {
        }

        default void onSessionActivityChanged(int i, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        }

        default void onSessionExtrasChanged(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        default void onSessionResult(int i, androidx.media3.session.SessionResult sessionResult) throws android.os.RemoteException {
        }

        default void onShuffleModeEnabledChanged(int i, boolean z) throws android.os.RemoteException {
        }

        default void onTimelineChanged(int i, androidx.media3.common.Timeline timeline, int i2) throws android.os.RemoteException {
        }

        default void onTrackSelectionParametersChanged(int i, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) throws android.os.RemoteException {
        }

        default void onTracksChanged(int i, androidx.media3.common.Tracks tracks) throws android.os.RemoteException {
        }

        default void onVideoSizeChanged(int i, androidx.media3.common.VideoSize videoSize) throws android.os.RemoteException {
        }

        default void onVolumeChanged(int i, float f) throws android.os.RemoteException {
        }

        default void sendCustomCommand(int i, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        default void setCustomLayout(int i, java.util.List<androidx.media3.session.CommandButton> list) throws android.os.RemoteException {
        }
    }

    interface Listener {
        void onNotificationRefreshRequired(androidx.media3.session.MediaSession mediaSession);

        boolean onPlayRequested(androidx.media3.session.MediaSession mediaSession);
    }

    public static final class Builder extends androidx.media3.session.MediaSession.BuilderBase<androidx.media3.session.MediaSession, androidx.media3.session.MediaSession.Builder, androidx.media3.session.MediaSession.Callback> {
        @Override // androidx.media3.session.MediaSession.BuilderBase
        public /* bridge */ /* synthetic */ androidx.media3.session.MediaSession.BuilderBase setCustomLayout(java.util.List list) {
            return setCustomLayout((java.util.List<androidx.media3.session.CommandButton>) list);
        }

        public Builder(android.content.Context context, androidx.media3.common.Player player) {
            super(context, player, new androidx.media3.session.MediaSession.Callback() { // from class: androidx.media3.session.MediaSession.Builder.1
            });
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setSessionActivity(android.app.PendingIntent pendingIntent) {
            return (androidx.media3.session.MediaSession.Builder) super.setSessionActivity(pendingIntent);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setId(java.lang.String str) {
            return (androidx.media3.session.MediaSession.Builder) super.setId(str);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setCallback(androidx.media3.session.MediaSession.Callback callback) {
            return (androidx.media3.session.MediaSession.Builder) super.setCallback(callback);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setExtras(android.os.Bundle bundle) {
            return (androidx.media3.session.MediaSession.Builder) super.setExtras(bundle);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setSessionExtras(android.os.Bundle bundle) {
            return (androidx.media3.session.MediaSession.Builder) super.setSessionExtras(bundle);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            return (androidx.media3.session.MediaSession.Builder) super.setBitmapLoader(bitmapLoader);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setCustomLayout(java.util.List<androidx.media3.session.CommandButton> list) {
            return (androidx.media3.session.MediaSession.Builder) super.setCustomLayout(list);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setPeriodicPositionUpdateEnabled(boolean z) {
            return (androidx.media3.session.MediaSession.Builder) super.setPeriodicPositionUpdateEnabled(z);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
            return (androidx.media3.session.MediaSession.Builder) super.setShowPlayButtonIfPlaybackIsSuppressed(z);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession build() {
            if (this.bitmapLoader == null) {
                this.bitmapLoader = new androidx.media3.session.CacheBitmapLoader(new androidx.media3.datasource.DataSourceBitmapLoader(this.context));
            }
            return new androidx.media3.session.MediaSession(this.context, this.id, this.player, this.sessionActivity, this.customLayout, this.callback, this.tokenExtras, this.sessionExtras, (androidx.media3.common.util.BitmapLoader) androidx.media3.common.util.Assertions.checkNotNull(this.bitmapLoader), this.playIfSuppressed, this.isPeriodicPositionUpdateEnabled, 0);
        }
    }

    public static final class ControllerInfo {
        public static final int LEGACY_CONTROLLER_INTERFACE_VERSION = 0;
        public static final java.lang.String LEGACY_CONTROLLER_PACKAGE_NAME = "android.media.session.MediaController";
        public static final int LEGACY_CONTROLLER_VERSION = 0;
        private final android.os.Bundle connectionHints;
        private final androidx.media3.session.MediaSession.ControllerCb controllerCb;
        private final int interfaceVersion;
        private final boolean isTrusted;
        private final int libraryVersion;
        private final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo;

        ControllerInfo(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, int i, int i2, boolean z, androidx.media3.session.MediaSession.ControllerCb controllerCb, android.os.Bundle bundle) {
            this.remoteUserInfo = remoteUserInfo;
            this.libraryVersion = i;
            this.interfaceVersion = i2;
            this.isTrusted = z;
            this.controllerCb = controllerCb;
            this.connectionHints = bundle;
        }

        androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo getRemoteUserInfo() {
            return this.remoteUserInfo;
        }

        public int getControllerVersion() {
            return this.libraryVersion;
        }

        public int getInterfaceVersion() {
            return this.interfaceVersion;
        }

        public java.lang.String getPackageName() {
            return this.remoteUserInfo.getPackageName();
        }

        public int getUid() {
            return this.remoteUserInfo.getUid();
        }

        public android.os.Bundle getConnectionHints() {
            return new android.os.Bundle(this.connectionHints);
        }

        public boolean isTrusted() {
            return this.isTrusted;
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.controllerCb, this.remoteUserInfo);
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.session.MediaSession.ControllerInfo)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            androidx.media3.session.MediaSession.ControllerInfo controllerInfo = (androidx.media3.session.MediaSession.ControllerInfo) obj;
            androidx.media3.session.MediaSession.ControllerCb controllerCb = this.controllerCb;
            if (controllerCb != null || controllerInfo.controllerCb != null) {
                return androidx.media3.common.util.Util.areEqual(controllerCb, controllerInfo.controllerCb);
            }
            return this.remoteUserInfo.equals(controllerInfo.remoteUserInfo);
        }

        public java.lang.String toString() {
            return "ControllerInfo {pkg=" + this.remoteUserInfo.getPackageName() + ", uid=" + this.remoteUserInfo.getUid() + "})";
        }

        androidx.media3.session.MediaSession.ControllerCb getControllerCb() {
            return this.controllerCb;
        }

        static androidx.media3.session.MediaSession.ControllerInfo createLegacyControllerInfo() {
            return new androidx.media3.session.MediaSession.ControllerInfo(new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", -1, -1), 0, 0, false, null, android.os.Bundle.EMPTY);
        }

        @java.lang.Deprecated
        public static androidx.media3.session.MediaSession.ControllerInfo createTestOnlyControllerInfo(androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo, int i, int i2, boolean z, android.os.Bundle bundle) {
            return createTestOnlyControllerInfo(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid(), i, i2, z, bundle);
        }

        public static androidx.media3.session.MediaSession.ControllerInfo createTestOnlyControllerInfo(java.lang.String str, int i, int i2, int i3, int i4, boolean z, android.os.Bundle bundle) {
            return new androidx.media3.session.MediaSession.ControllerInfo(new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo(str, i, i2), i3, i4, z, null, bundle);
        }
    }

    MediaSession(android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.media3.session.MediaSession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
        synchronized (STATIC_LOCK) {
            java.util.HashMap<java.lang.String, androidx.media3.session.MediaSession> map = SESSION_ID_TO_SESSION_MAP;
            if (map.containsKey(str)) {
                throw new java.lang.IllegalStateException("Session ID must be unique. ID=" + str);
            }
            map.put(str, this);
        }
        this.impl = createImpl(context, str, player, pendingIntent, immutableList, callback, bundle, bundle2, bitmapLoader, z, z2, i);
    }

    androidx.media3.session.MediaSessionImpl createImpl(android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.media3.session.MediaSession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
        return new androidx.media3.session.MediaSessionImpl(this, context, str, player, pendingIntent, immutableList, callback, bundle, bundle2, bitmapLoader, z, z2);
    }

    androidx.media3.session.MediaSessionImpl getImpl() {
        return this.impl;
    }

    static androidx.media3.session.MediaSession getSession(android.net.Uri uri) {
        synchronized (STATIC_LOCK) {
            for (androidx.media3.session.MediaSession mediaSession : SESSION_ID_TO_SESSION_MAP.values()) {
                if (androidx.media3.common.util.Util.areEqual(mediaSession.getUri(), uri)) {
                    return mediaSession;
                }
            }
            return null;
        }
    }

    public final android.app.PendingIntent getSessionActivity() {
        return this.impl.getSessionActivity();
    }

    public final void setSessionActivity(android.app.PendingIntent pendingIntent) {
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            androidx.media3.common.util.Assertions.checkArgument(androidx.media3.session.MediaSession.Api31.isActivity(pendingIntent));
        }
        this.impl.setSessionActivity(pendingIntent);
    }

    public final void setSessionActivity(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, android.app.PendingIntent pendingIntent) {
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            androidx.media3.common.util.Assertions.checkArgument(androidx.media3.session.MediaSession.Api31.isActivity(pendingIntent));
        }
        this.impl.setSessionActivity(controllerInfo, pendingIntent);
    }

    public final void setPlayer(androidx.media3.common.Player player) {
        androidx.media3.common.util.Assertions.checkNotNull(player);
        androidx.media3.common.util.Assertions.checkArgument(player.canAdvertiseSession());
        androidx.media3.common.util.Assertions.checkArgument(player.getApplicationLooper() == getPlayer().getApplicationLooper());
        androidx.media3.common.util.Assertions.checkState(player.getApplicationLooper() == android.os.Looper.myLooper());
        this.impl.setPlayer(player);
    }

    public final void release() {
        try {
            synchronized (STATIC_LOCK) {
                SESSION_ID_TO_SESSION_MAP.remove(this.impl.getId());
            }
            this.impl.release();
        } catch (java.lang.Exception unused) {
        }
    }

    final boolean isReleased() {
        return this.impl.isReleased();
    }

    public final androidx.media3.common.Player getPlayer() {
        return this.impl.getPlayerWrapper().getWrappedPlayer();
    }

    public final java.lang.String getId() {
        return this.impl.getId();
    }

    public final androidx.media3.session.SessionToken getToken() {
        return this.impl.getToken();
    }

    public final java.util.List<androidx.media3.session.MediaSession.ControllerInfo> getConnectedControllers() {
        return this.impl.getConnectedControllers();
    }

    public final androidx.media3.session.MediaSession.ControllerInfo getControllerForCurrentRequest() {
        return this.impl.getControllerForCurrentRequest();
    }

    public boolean isMediaNotificationController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return this.impl.isMediaNotificationController(controllerInfo);
    }

    public androidx.media3.session.MediaSession.ControllerInfo getMediaNotificationControllerInfo() {
        return this.impl.getMediaNotificationControllerInfo();
    }

    public final boolean isAutomotiveController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return this.impl.isAutomotiveController(controllerInfo);
    }

    public final boolean isAutoCompanionController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return this.impl.isAutoCompanionController(controllerInfo);
    }

    public final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> setCustomLayout(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List<androidx.media3.session.CommandButton> list) {
        androidx.media3.common.util.Assertions.checkNotNull(controllerInfo, "controller must not be null");
        androidx.media3.common.util.Assertions.checkNotNull(list, "layout must not be null");
        return this.impl.setCustomLayout(controllerInfo, com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list));
    }

    public final void setCustomLayout(java.util.List<androidx.media3.session.CommandButton> list) {
        androidx.media3.common.util.Assertions.checkNotNull(list, "layout must not be null");
        this.impl.setCustomLayout(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list));
    }

    public final void setAvailableCommands(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        androidx.media3.common.util.Assertions.checkNotNull(controllerInfo, "controller must not be null");
        androidx.media3.common.util.Assertions.checkNotNull(sessionCommands, "sessionCommands must not be null");
        androidx.media3.common.util.Assertions.checkNotNull(commands, "playerCommands must not be null");
        this.impl.setAvailableCommands(controllerInfo, sessionCommands, commands);
    }

    public com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> getCustomLayout() {
        return this.impl.getCustomLayout();
    }

    public final void broadcastCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        androidx.media3.common.util.Assertions.checkNotNull(sessionCommand);
        androidx.media3.common.util.Assertions.checkNotNull(bundle);
        androidx.media3.common.util.Assertions.checkArgument(sessionCommand.commandCode == 0, "command must be a custom command");
        this.impl.broadcastCustomCommand(sessionCommand, bundle);
    }

    public android.os.Bundle getSessionExtras() {
        return this.impl.getSessionExtras();
    }

    public final void setSessionExtras(android.os.Bundle bundle) {
        androidx.media3.common.util.Assertions.checkNotNull(bundle);
        this.impl.setSessionExtras(bundle);
    }

    public final void setSessionExtras(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, android.os.Bundle bundle) {
        androidx.media3.common.util.Assertions.checkNotNull(controllerInfo, "controller must not be null");
        androidx.media3.common.util.Assertions.checkNotNull(bundle);
        this.impl.setSessionExtras(controllerInfo, bundle);
    }

    public final androidx.media3.common.util.BitmapLoader getBitmapLoader() {
        return this.impl.getBitmapLoader();
    }

    public final boolean getShowPlayButtonIfPlaybackIsSuppressed() {
        return this.impl.shouldPlayIfSuppressed();
    }

    public final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> sendCustomCommand(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        androidx.media3.common.util.Assertions.checkNotNull(controllerInfo);
        androidx.media3.common.util.Assertions.checkNotNull(sessionCommand);
        androidx.media3.common.util.Assertions.checkNotNull(bundle);
        androidx.media3.common.util.Assertions.checkArgument(sessionCommand.commandCode == 0, "command must be a custom command");
        return this.impl.sendCustomCommand(controllerInfo, sessionCommand, bundle);
    }

    public final void sendError(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionError sessionError) {
        this.impl.sendError(controllerInfo, sessionError);
    }

    public final void sendError(androidx.media3.session.SessionError sessionError) {
        this.impl.sendError(sessionError);
    }

    final androidx.media3.session.legacy.MediaSessionCompat getSessionCompat() {
        return this.impl.getSessionCompat();
    }

    @java.lang.Deprecated
    public final android.support.v4.media.session.MediaSessionCompat.Token getSessionCompatToken() {
        return (android.support.v4.media.session.MediaSessionCompat.Token) androidx.media3.session.legacy.LegacyParcelableUtil.convert(this.impl.getSessionCompat().getSessionToken(), android.support.v4.media.session.MediaSessionCompat.Token.CREATOR);
    }

    public final android.media.session.MediaSession.Token getPlatformToken() {
        return (android.media.session.MediaSession.Token) this.impl.getSessionCompat().getSessionToken().getToken();
    }

    final void setLegacyControllerConnectionTimeoutMs(long j) {
        this.impl.setLegacyControllerConnectionTimeoutMs(j);
    }

    final void handleControllerConnectionFromService(androidx.media3.session.IMediaController iMediaController, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.impl.connectFromService(iMediaController, controllerInfo);
    }

    final android.os.IBinder getLegacyBrowserServiceBinder() {
        return this.impl.getLegacyBrowserServiceBinder();
    }

    final void setSessionPositionUpdateDelayMs(long j) {
        this.impl.setSessionPositionUpdateDelayMsOnHandler(j);
    }

    final void setListener(androidx.media3.session.MediaSession.Listener listener) {
        this.impl.setMediaSessionListener(listener);
    }

    final void clearListener() {
        this.impl.clearMediaSessionListener();
    }

    final android.net.Uri getUri() {
        return this.impl.getUri();
    }

    public interface Callback {
        default void onDisconnected(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        }

        default boolean onMediaButtonEvent(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, android.content.Intent intent) {
            return false;
        }

        @java.lang.Deprecated
        default int onPlayerCommandRequest(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
            return 0;
        }

        default void onPlayerInteractionFinished(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.Player.Commands commands) {
        }

        default void onPostConnect(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        }

        default androidx.media3.session.MediaSession.ConnectionResult onConnect(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
            return new androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder(mediaSession).build();
        }

        default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> onSetRating(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, androidx.media3.common.Rating rating) {
            return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-6));
        }

        default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> onSetRating(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.Rating rating) {
            return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-6));
        }

        default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> onCustomCommand(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
            return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-6));
        }

        default com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.media3.common.MediaItem>> onAddMediaItems(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List<androidx.media3.common.MediaItem> list) {
            java.util.Iterator<androidx.media3.common.MediaItem> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().localConfiguration == null) {
                    return com.google.common.util.concurrent.Futures.immediateFailedFuture(new java.lang.UnsupportedOperationException());
                }
            }
            return com.google.common.util.concurrent.Futures.immediateFuture(list);
        }

        default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaSession.MediaItemsWithStartPosition> onSetMediaItems(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List<androidx.media3.common.MediaItem> list, final int i, final long j) {
            return androidx.media3.common.util.Util.transformFutureAsync(onAddMediaItems(mediaSession, controllerInfo, list), new com.google.common.util.concurrent.AsyncFunction() { // from class: androidx.media3.session.MediaSession$Callback$$ExternalSyntheticLambda0
                @Override // com.google.common.util.concurrent.AsyncFunction
                public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                    return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.MediaSession.MediaItemsWithStartPosition((java.util.List) obj, i, j));
                }
            });
        }

        default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaSession.MediaItemsWithStartPosition> onPlaybackResumption(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
            return com.google.common.util.concurrent.Futures.immediateFailedFuture(new java.lang.UnsupportedOperationException());
        }
    }

    public static final class MediaItemsWithStartPosition {
        public final com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem> mediaItems;
        public final int startIndex;
        public final long startPositionMs;

        public MediaItemsWithStartPosition(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
            this.mediaItems = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            this.startIndex = i;
            this.startPositionMs = j;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.session.MediaSession.MediaItemsWithStartPosition)) {
                return false;
            }
            androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition = (androidx.media3.session.MediaSession.MediaItemsWithStartPosition) obj;
            return this.mediaItems.equals(mediaItemsWithStartPosition.mediaItems) && androidx.media3.common.util.Util.areEqual(java.lang.Integer.valueOf(this.startIndex), java.lang.Integer.valueOf(mediaItemsWithStartPosition.startIndex)) && androidx.media3.common.util.Util.areEqual(java.lang.Long.valueOf(this.startPositionMs), java.lang.Long.valueOf(mediaItemsWithStartPosition.startPositionMs));
        }

        public int hashCode() {
            return (((this.mediaItems.hashCode() * 31) + this.startIndex) * 31) + com.google.common.primitives.Longs.hashCode(this.startPositionMs);
        }
    }

    public static final class ConnectionResult {
        public final androidx.media3.common.Player.Commands availablePlayerCommands;
        public final androidx.media3.session.SessionCommands availableSessionCommands;
        public final com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> customLayout;
        public final boolean isAccepted;
        public final android.app.PendingIntent sessionActivity;
        public final android.os.Bundle sessionExtras;
        public static final androidx.media3.session.SessionCommands DEFAULT_SESSION_COMMANDS = new androidx.media3.session.SessionCommands.Builder().addAllSessionCommands().build();
        public static final androidx.media3.session.SessionCommands DEFAULT_SESSION_AND_LIBRARY_COMMANDS = new androidx.media3.session.SessionCommands.Builder().addAllLibraryCommands().addAllSessionCommands().build();
        public static final androidx.media3.common.Player.Commands DEFAULT_PLAYER_COMMANDS = new androidx.media3.common.Player.Commands.Builder().addAllCommands().build();

        public static class AcceptedResultBuilder {
            private androidx.media3.common.Player.Commands availablePlayerCommands = androidx.media3.session.MediaSession.ConnectionResult.DEFAULT_PLAYER_COMMANDS;
            private androidx.media3.session.SessionCommands availableSessionCommands;
            private com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> customLayout;
            private android.app.PendingIntent sessionActivity;
            private android.os.Bundle sessionExtras;

            public AcceptedResultBuilder(androidx.media3.session.MediaSession mediaSession) {
                androidx.media3.session.SessionCommands sessionCommands;
                if (mediaSession instanceof androidx.media3.session.MediaLibraryService.MediaLibrarySession) {
                    sessionCommands = androidx.media3.session.MediaSession.ConnectionResult.DEFAULT_SESSION_AND_LIBRARY_COMMANDS;
                } else {
                    sessionCommands = androidx.media3.session.MediaSession.ConnectionResult.DEFAULT_SESSION_COMMANDS;
                }
                this.availableSessionCommands = sessionCommands;
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setAvailableSessionCommands(androidx.media3.session.SessionCommands sessionCommands) {
                this.availableSessionCommands = (androidx.media3.session.SessionCommands) androidx.media3.common.util.Assertions.checkNotNull(sessionCommands);
                return this;
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setAvailablePlayerCommands(androidx.media3.common.Player.Commands commands) {
                this.availablePlayerCommands = (androidx.media3.common.Player.Commands) androidx.media3.common.util.Assertions.checkNotNull(commands);
                return this;
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setCustomLayout(java.util.List<androidx.media3.session.CommandButton> list) {
                this.customLayout = list == null ? null : com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                return this;
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setSessionExtras(android.os.Bundle bundle) {
                this.sessionExtras = bundle;
                return this;
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setSessionActivity(android.app.PendingIntent pendingIntent) {
                this.sessionActivity = pendingIntent;
                return this;
            }

            public androidx.media3.session.MediaSession.ConnectionResult build() {
                return new androidx.media3.session.MediaSession.ConnectionResult(true, this.availableSessionCommands, this.availablePlayerCommands, this.customLayout, this.sessionExtras, this.sessionActivity);
            }
        }

        private ConnectionResult(boolean z, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, android.os.Bundle bundle, android.app.PendingIntent pendingIntent) {
            this.isAccepted = z;
            this.availableSessionCommands = sessionCommands;
            this.availablePlayerCommands = commands;
            this.customLayout = immutableList;
            this.sessionExtras = bundle;
            this.sessionActivity = pendingIntent;
        }

        public static androidx.media3.session.MediaSession.ConnectionResult accept(androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
            return new androidx.media3.session.MediaSession.ConnectionResult(true, sessionCommands, commands, null, null, null);
        }

        public static androidx.media3.session.MediaSession.ConnectionResult reject() {
            return new androidx.media3.session.MediaSession.ConnectionResult(false, androidx.media3.session.SessionCommands.EMPTY, androidx.media3.common.Player.Commands.EMPTY, com.google.common.collect.ImmutableList.of(), android.os.Bundle.EMPTY, null);
        }
    }

    static abstract class BuilderBase<SessionT extends androidx.media3.session.MediaSession, BuilderT extends androidx.media3.session.MediaSession.BuilderBase<SessionT, BuilderT, CallbackT>, CallbackT extends androidx.media3.session.MediaSession.Callback> {
        androidx.media3.common.util.BitmapLoader bitmapLoader;
        CallbackT callback;
        final android.content.Context context;
        com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> customLayout;
        java.lang.String id;
        boolean isPeriodicPositionUpdateEnabled;
        boolean playIfSuppressed;
        final androidx.media3.common.Player player;
        android.app.PendingIntent sessionActivity;
        android.os.Bundle sessionExtras;
        android.os.Bundle tokenExtras;

        public abstract SessionT build();

        public BuilderBase(android.content.Context context, androidx.media3.common.Player player, CallbackT callbackt) {
            this.context = (android.content.Context) androidx.media3.common.util.Assertions.checkNotNull(context);
            this.player = (androidx.media3.common.Player) androidx.media3.common.util.Assertions.checkNotNull(player);
            androidx.media3.common.util.Assertions.checkArgument(player.canAdvertiseSession());
            this.id = "";
            this.callback = callbackt;
            this.tokenExtras = android.os.Bundle.EMPTY;
            this.sessionExtras = android.os.Bundle.EMPTY;
            this.customLayout = com.google.common.collect.ImmutableList.of();
            this.playIfSuppressed = true;
            this.isPeriodicPositionUpdateEnabled = true;
        }

        public BuilderT setSessionActivity(android.app.PendingIntent pendingIntent) {
            if (androidx.media3.common.util.Util.SDK_INT >= 31) {
                androidx.media3.common.util.Assertions.checkArgument(androidx.media3.session.MediaSession.Api31.isActivity(pendingIntent));
            }
            this.sessionActivity = (android.app.PendingIntent) androidx.media3.common.util.Assertions.checkNotNull(pendingIntent);
            return this;
        }

        public BuilderT setId(java.lang.String str) {
            this.id = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(str);
            return this;
        }

        BuilderT setCallback(CallbackT callbackt) {
            this.callback = (CallbackT) androidx.media3.common.util.Assertions.checkNotNull(callbackt);
            return this;
        }

        public BuilderT setExtras(android.os.Bundle bundle) {
            this.tokenExtras = new android.os.Bundle((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle));
            return this;
        }

        public BuilderT setSessionExtras(android.os.Bundle bundle) {
            this.sessionExtras = new android.os.Bundle((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle));
            return this;
        }

        public BuilderT setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            this.bitmapLoader = (androidx.media3.common.util.BitmapLoader) androidx.media3.common.util.Assertions.checkNotNull(bitmapLoader);
            return this;
        }

        public BuilderT setCustomLayout(java.util.List<androidx.media3.session.CommandButton> list) {
            this.customLayout = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            return this;
        }

        public BuilderT setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
            this.playIfSuppressed = z;
            return this;
        }

        public BuilderT setPeriodicPositionUpdateEnabled(boolean z) {
            this.isPeriodicPositionUpdateEnabled = z;
            return this;
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static boolean isActivity(android.app.PendingIntent pendingIntent) {
            return pendingIntent.isActivity();
        }
    }
}
