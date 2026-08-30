package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaSessionImpl {
    private static final java.lang.String ANDROID_AUTOMOTIVE_LAUNCHER_PACKAGE_NAME = "com.android.car.carlauncher";
    private static final java.lang.String ANDROID_AUTOMOTIVE_MEDIA_PACKAGE_NAME = "com.android.car.media";
    private static final java.lang.String ANDROID_AUTO_PACKAGE_NAME = "com.google.android.projection.gearhead";
    private static final long DEFAULT_SESSION_POSITION_UPDATE_DELAY_MS = 3000;
    private static final androidx.media3.session.SessionResult RESULT_WHEN_CLOSED = new androidx.media3.session.SessionResult(1);
    private static final java.lang.String SYSTEM_UI_PACKAGE_NAME = "com.android.systemui";
    public static final java.lang.String TAG = "MediaSessionImpl";
    private static final java.lang.String WRONG_THREAD_ERROR_MESSAGE = "Player callback method is called from a wrong thread. See javadoc of MediaSession for details.";
    private final android.os.Handler applicationHandler;
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;
    private androidx.media3.session.MediaSessionServiceLegacyStub browserServiceLegacyStub;
    private final androidx.media3.session.MediaSession.Callback callback;
    private boolean closed;
    private final android.content.Context context;
    private androidx.media3.session.MediaSession.ControllerInfo controllerForCurrentRequest;
    private com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> customLayout;
    private final androidx.media3.session.MediaSession instance;
    private boolean isMediaNotificationControllerConnected;
    private final boolean isPeriodicPositionUpdateEnabled;
    private final java.lang.Object lock = new java.lang.Object();
    private final android.os.Handler mainHandler;
    private final androidx.media3.session.MediaSessionImpl.MediaPlayPauseKeyHandler mediaPlayPauseKeyHandler;
    private androidx.media3.session.MediaSession.Listener mediaSessionListener;
    private final androidx.media3.session.MediaSessionImpl.PlayerInfoChangedHandler onPlayerInfoChangedHandler;
    private final java.lang.Runnable periodicSessionPositionInfoUpdateRunnable;
    private final boolean playIfSuppressed;
    private androidx.media3.session.PlayerInfo playerInfo;
    private androidx.media3.session.MediaSessionImpl.PlayerListener playerListener;
    private androidx.media3.session.PlayerWrapper playerWrapper;
    private android.app.PendingIntent sessionActivity;
    private android.os.Bundle sessionExtras;
    private final java.lang.String sessionId;
    private final androidx.media3.session.MediaSessionLegacyStub sessionLegacyStub;
    private long sessionPositionUpdateDelayMs;
    private final androidx.media3.session.MediaSessionStub sessionStub;
    private final androidx.media3.session.SessionToken sessionToken;
    private final android.net.Uri sessionUri;

    interface RemoteControllerTask {
        void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException;
    }

    public MediaSessionImpl(androidx.media3.session.MediaSession mediaSession, android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.media3.session.MediaSession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2) {
        androidx.media3.common.util.Log.i(TAG, "Init " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + com.ironsource.y8.i.e);
        this.instance = mediaSession;
        this.context = context;
        this.sessionId = str;
        this.sessionActivity = pendingIntent;
        this.customLayout = immutableList;
        this.callback = callback;
        this.sessionExtras = bundle2;
        this.bitmapLoader = bitmapLoader;
        this.playIfSuppressed = z;
        this.isPeriodicPositionUpdateEnabled = z2;
        androidx.media3.session.MediaSessionStub mediaSessionStub = new androidx.media3.session.MediaSessionStub(this);
        this.sessionStub = mediaSessionStub;
        this.mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        android.os.Looper applicationLooper = player.getApplicationLooper();
        android.os.Handler handler = new android.os.Handler(applicationLooper);
        this.applicationHandler = handler;
        this.playerInfo = androidx.media3.session.PlayerInfo.DEFAULT;
        this.onPlayerInfoChangedHandler = new androidx.media3.session.MediaSessionImpl.PlayerInfoChangedHandler(applicationLooper);
        this.mediaPlayPauseKeyHandler = new androidx.media3.session.MediaSessionImpl.MediaPlayPauseKeyHandler(applicationLooper);
        android.net.Uri uriBuild = new android.net.Uri.Builder().scheme(androidx.media3.session.MediaSessionImpl.class.getName()).appendPath(str).appendPath(java.lang.String.valueOf(android.os.SystemClock.elapsedRealtime())).build();
        this.sessionUri = uriBuild;
        this.sessionToken = new androidx.media3.session.SessionToken(android.os.Process.myUid(), 0, androidx.media3.common.MediaLibraryInfo.VERSION_INT, 4, context.getPackageName(), mediaSessionStub, bundle);
        this.sessionLegacyStub = new androidx.media3.session.MediaSessionLegacyStub(this, uriBuild, handler);
        androidx.media3.session.MediaSession.ConnectionResult connectionResultBuild = new androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder(mediaSession).build();
        final androidx.media3.session.PlayerWrapper playerWrapper = new androidx.media3.session.PlayerWrapper(player, z, immutableList, connectionResultBuild.availableSessionCommands, connectionResultBuild.availablePlayerCommands, bundle2);
        this.playerWrapper = playerWrapper;
        androidx.media3.common.util.Util.postOrRun(handler, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.setPlayerInternal(null, playerWrapper);
            }
        });
        this.sessionPositionUpdateDelayMs = 3000L;
        java.util.Objects.requireNonNull(this);
        this.periodicSessionPositionInfoUpdateRunnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyPeriodicSessionPositionInfoChangesOnHandler();
            }
        };
        java.util.Objects.requireNonNull(this);
        androidx.media3.common.util.Util.postOrRun(handler, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.schedulePeriodicSessionPositionInfoChanges();
            }
        });
    }

    public void setPlayer(androidx.media3.common.Player player) {
        if (player == this.playerWrapper.getWrappedPlayer()) {
            return;
        }
        setPlayerInternal(this.playerWrapper, new androidx.media3.session.PlayerWrapper(player, this.playIfSuppressed, this.playerWrapper.getCustomLayout(), this.playerWrapper.getAvailableSessionCommands(), this.playerWrapper.getAvailablePlayerCommands(), this.playerWrapper.getLegacyExtras()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerInternal(final androidx.media3.session.PlayerWrapper playerWrapper, final androidx.media3.session.PlayerWrapper playerWrapper2) {
        this.playerWrapper = playerWrapper2;
        if (playerWrapper != null) {
            playerWrapper.removeListener((androidx.media3.common.Player.Listener) androidx.media3.common.util.Assertions.checkStateNotNull(this.playerListener));
        }
        androidx.media3.session.MediaSessionImpl.PlayerListener playerListener = new androidx.media3.session.MediaSessionImpl.PlayerListener(this, playerWrapper2);
        playerWrapper2.addListener(playerListener);
        this.playerListener = playerListener;
        dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda16
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                controllerCb.onPlayerChanged(i, playerWrapper, playerWrapper2);
            }
        });
        if (playerWrapper == null) {
            this.sessionLegacyStub.start();
        }
        this.playerInfo = playerWrapper2.createPlayerInfoForBundling();
        handleAvailablePlayerCommandsChanged(playerWrapper2.getAvailableCommands());
    }

    public void release() {
        androidx.media3.common.util.Log.i(TAG, "Release " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + "] [" + androidx.media3.common.MediaLibraryInfo.registeredModules() + com.ironsource.y8.i.e);
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.mediaPlayPauseKeyHandler.clearPendingPlayPauseTask();
            this.applicationHandler.removeCallbacksAndMessages(null);
            try {
                androidx.media3.common.util.Util.postOrRun(this.applicationHandler, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m375lambda$release$2$androidxmedia3sessionMediaSessionImpl();
                    }
                });
            } catch (java.lang.Exception e) {
                androidx.media3.common.util.Log.w(TAG, "Exception thrown while closing", e);
            }
            this.sessionLegacyStub.release();
            this.sessionStub.release();
        }
    }

    /* JADX INFO: renamed from: lambda$release$2$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m375lambda$release$2$androidxmedia3sessionMediaSessionImpl() {
        androidx.media3.session.MediaSessionImpl.PlayerListener playerListener = this.playerListener;
        if (playerListener != null) {
            this.playerWrapper.removeListener(playerListener);
        }
    }

    public androidx.media3.session.PlayerWrapper getPlayerWrapper() {
        return this.playerWrapper;
    }

    public java.lang.Runnable callWithControllerForCurrentRequestSet(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final java.lang.Runnable runnable) {
        return new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m371x8683e518(controllerInfo, runnable);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$callWithControllerForCurrentRequestSet$3$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m371x8683e518(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.Runnable runnable) {
        this.controllerForCurrentRequest = controllerInfo;
        runnable.run();
        this.controllerForCurrentRequest = null;
    }

    public java.lang.String getId() {
        return this.sessionId;
    }

    public android.net.Uri getUri() {
        return this.sessionUri;
    }

    public androidx.media3.session.SessionToken getToken() {
        return this.sessionToken;
    }

    public java.util.List<androidx.media3.session.MediaSession.ControllerInfo> getConnectedControllers() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.sessionStub.getConnectedControllersManager().getConnectedControllers());
        if (this.isMediaNotificationControllerConnected) {
            com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> connectedControllers = this.sessionLegacyStub.getConnectedControllersManager().getConnectedControllers();
            for (int i = 0; i < connectedControllers.size(); i++) {
                androidx.media3.session.MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
                if (!isSystemUiController(controllerInfo)) {
                    arrayList.add(controllerInfo);
                }
            }
        } else {
            arrayList.addAll(this.sessionLegacyStub.getConnectedControllersManager().getConnectedControllers());
        }
        return arrayList;
    }

    public androidx.media3.session.MediaSession.ControllerInfo getControllerForCurrentRequest() {
        androidx.media3.session.MediaSession.ControllerInfo controllerInfo = this.controllerForCurrentRequest;
        if (controllerInfo != null) {
            return resolveControllerInfoForCallback(controllerInfo);
        }
        return null;
    }

    public boolean isConnected(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo) || this.sessionLegacyStub.getConnectedControllersManager().isConnected(controllerInfo);
    }

    protected boolean isSystemUiController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return controllerInfo != null && controllerInfo.getControllerVersion() == 0 && java.util.Objects.equals(controllerInfo.getPackageName(), SYSTEM_UI_PACKAGE_NAME);
    }

    public boolean isMediaNotificationController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return java.util.Objects.equals(controllerInfo.getPackageName(), this.context.getPackageName()) && controllerInfo.getControllerVersion() != 0 && controllerInfo.getConnectionHints().getBoolean(androidx.media3.session.MediaController.KEY_MEDIA_NOTIFICATION_CONTROLLER_FLAG, false);
    }

    public boolean isAutomotiveController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return controllerInfo.getControllerVersion() == 0 && (controllerInfo.getPackageName().equals(ANDROID_AUTOMOTIVE_MEDIA_PACKAGE_NAME) || controllerInfo.getPackageName().equals(ANDROID_AUTOMOTIVE_LAUNCHER_PACKAGE_NAME));
    }

    public boolean isAutoCompanionController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return controllerInfo.getControllerVersion() == 0 && controllerInfo.getPackageName().equals(ANDROID_AUTO_PACKAGE_NAME);
    }

    protected androidx.media3.session.MediaSession.ControllerInfo getSystemUiControllerInfo() {
        com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> connectedControllers = this.sessionLegacyStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            androidx.media3.session.MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (isSystemUiController(controllerInfo)) {
                return controllerInfo;
            }
        }
        return null;
    }

    public androidx.media3.session.MediaSession.ControllerInfo getMediaNotificationControllerInfo() {
        com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            androidx.media3.session.MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (isMediaNotificationController(controllerInfo)) {
                return controllerInfo;
            }
        }
        return null;
    }

    protected boolean isMediaNotificationControllerConnected() {
        return this.isMediaNotificationControllerConnected;
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> setCustomLayout(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList) {
        if (isMediaNotificationController(controllerInfo)) {
            this.playerWrapper.setCustomLayout(immutableList);
            this.sessionLegacyStub.updateLegacySessionPlaybackState(this.playerWrapper);
        }
        return dispatchRemoteControllerTask(controllerInfo, new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda12
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                controllerCb.setCustomLayout(i, immutableList);
            }
        });
    }

    public void setCustomLayout(final com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList) {
        this.customLayout = immutableList;
        this.playerWrapper.setCustomLayout(immutableList);
        dispatchRemoteControllerTaskWithoutReturn(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda14
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                controllerCb.setCustomLayout(i, immutableList);
            }
        });
    }

    public com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> getCustomLayout() {
        return this.customLayout;
    }

    public void setSessionExtras(final android.os.Bundle bundle) {
        this.sessionExtras = bundle;
        dispatchRemoteControllerTaskWithoutReturn(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda4
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                controllerCb.onSessionExtrasChanged(i, bundle);
            }
        });
    }

    public void setSessionExtras(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final android.os.Bundle bundle) {
        if (this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo)) {
            dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda1
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onSessionExtrasChanged(i, bundle);
                }
            });
            if (isMediaNotificationController(controllerInfo)) {
                dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda2
                    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                    public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                        controllerCb.onSessionExtrasChanged(i, bundle);
                    }
                });
            }
        }
    }

    public android.os.Bundle getSessionExtras() {
        return this.sessionExtras;
    }

    public androidx.media3.common.util.BitmapLoader getBitmapLoader() {
        return this.bitmapLoader;
    }

    public boolean shouldPlayIfSuppressed() {
        return this.playIfSuppressed;
    }

    public void setAvailableCommands(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final androidx.media3.session.SessionCommands sessionCommands, final androidx.media3.common.Player.Commands commands) {
        if (this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo)) {
            if (isMediaNotificationController(controllerInfo)) {
                setAvailableFrameworkControllerCommands(sessionCommands, commands);
                androidx.media3.session.MediaSession.ControllerInfo systemUiControllerInfo = getSystemUiControllerInfo();
                if (systemUiControllerInfo != null) {
                    this.sessionLegacyStub.getConnectedControllersManager().updateCommandsFromSession(systemUiControllerInfo, sessionCommands, commands);
                }
            }
            this.sessionStub.getConnectedControllersManager().updateCommandsFromSession(controllerInfo, sessionCommands, commands);
            dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda13
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onAvailableCommandsChangedFromSession(i, sessionCommands, commands);
                }
            });
            this.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(false, false);
            return;
        }
        this.sessionLegacyStub.getConnectedControllersManager().updateCommandsFromSession(controllerInfo, sessionCommands, commands);
    }

    public void broadcastCustomCommand(final androidx.media3.session.SessionCommand sessionCommand, final android.os.Bundle bundle) {
        dispatchRemoteControllerTaskWithoutReturn(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda3
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                controllerCb.sendCustomCommand(i, sessionCommand, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnPlayerInfoChanged(androidx.media3.session.PlayerInfo playerInfo, boolean z, boolean z2) {
        int iObtainNextSequenceNumber;
        androidx.media3.session.PlayerInfo playerInfoGenerateAndCacheUniqueTrackGroupIds = this.sessionStub.generateAndCacheUniqueTrackGroupIds(playerInfo);
        com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            androidx.media3.session.MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            try {
                androidx.media3.session.ConnectedControllersManager<android.os.IBinder> connectedControllersManager = this.sessionStub.getConnectedControllersManager();
                androidx.media3.session.SequencedFutureManager sequencedFutureManager = connectedControllersManager.getSequencedFutureManager(controllerInfo);
                if (sequencedFutureManager != null) {
                    iObtainNextSequenceNumber = sequencedFutureManager.obtainNextSequenceNumber();
                } else if (!isConnected(controllerInfo)) {
                    return;
                } else {
                    iObtainNextSequenceNumber = 0;
                }
                ((androidx.media3.session.MediaSession.ControllerCb) androidx.media3.common.util.Assertions.checkStateNotNull(controllerInfo.getControllerCb())).onPlayerInfoChanged(iObtainNextSequenceNumber, playerInfoGenerateAndCacheUniqueTrackGroupIds, androidx.media3.session.MediaUtils.intersect(connectedControllersManager.getAvailablePlayerCommands(controllerInfo), getPlayerWrapper().getAvailableCommands()), z, z2, controllerInfo.getInterfaceVersion());
            } catch (android.os.DeadObjectException unused) {
                onDeadObjectException(controllerInfo);
            } catch (android.os.RemoteException e) {
                androidx.media3.common.util.Log.w(TAG, "Exception in " + controllerInfo.toString(), e);
            }
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> sendCustomCommand(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final androidx.media3.session.SessionCommand sessionCommand, final android.os.Bundle bundle) {
        return dispatchRemoteControllerTask(controllerInfo, new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda11
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                controllerCb.sendCustomCommand(i, sessionCommand, bundle);
            }
        });
    }

    public void sendError(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final androidx.media3.session.SessionError sessionError) {
        if (controllerInfo.getControllerVersion() == 0 || controllerInfo.getInterfaceVersion() >= 4) {
            if (isMediaNotificationController(controllerInfo) || controllerInfo.getControllerVersion() == 0) {
                dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda30
                    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                    public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                        controllerCb.onError(i, sessionError);
                    }
                });
            } else {
                dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda31
                    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                    public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                        controllerCb.onError(i, sessionError);
                    }
                });
            }
        }
    }

    public void sendError(final androidx.media3.session.SessionError sessionError) {
        com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            androidx.media3.session.MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (!isMediaNotificationController(controllerInfo)) {
                sendError(controllerInfo, sessionError);
            }
        }
        dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda34
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                controllerCb.onError(i2, sessionError);
            }
        });
    }

    public androidx.media3.session.MediaSession.ConnectionResult onConnectOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> customLayout;
        if (this.isMediaNotificationControllerConnected && isSystemUiController(controllerInfo)) {
            return new androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder(this.instance).setAvailableSessionCommands(this.playerWrapper.getAvailableSessionCommands()).setAvailablePlayerCommands(this.playerWrapper.getAvailablePlayerCommands()).setCustomLayout(this.playerWrapper.getCustomLayout()).build();
        }
        androidx.media3.session.MediaSession.ConnectionResult connectionResult = (androidx.media3.session.MediaSession.ConnectionResult) androidx.media3.common.util.Assertions.checkNotNull(this.callback.onConnect(this.instance, controllerInfo), "Callback.onConnect must return non-null future");
        if (isMediaNotificationController(controllerInfo) && connectionResult.isAccepted) {
            this.isMediaNotificationControllerConnected = true;
            androidx.media3.session.PlayerWrapper playerWrapper = this.playerWrapper;
            if (connectionResult.customLayout != null) {
                customLayout = connectionResult.customLayout;
            } else {
                customLayout = this.instance.getCustomLayout();
            }
            playerWrapper.setCustomLayout(customLayout);
            setAvailableFrameworkControllerCommands(connectionResult.availableSessionCommands, connectionResult.availablePlayerCommands);
        }
        return connectionResult;
    }

    public void onPostConnectOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        if (this.isMediaNotificationControllerConnected && isSystemUiController(controllerInfo)) {
            return;
        }
        this.callback.onPostConnect(this.instance, controllerInfo);
    }

    public void onDisconnectedOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        if (this.isMediaNotificationControllerConnected) {
            if (isSystemUiController(controllerInfo)) {
                return;
            }
            if (isMediaNotificationController(controllerInfo)) {
                this.isMediaNotificationControllerConnected = false;
            }
        }
        this.callback.onDisconnected(this.instance, controllerInfo);
    }

    public int onPlayerCommandRequestOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        return this.callback.onPlayerCommandRequest(this.instance, resolveControllerInfoForCallback(controllerInfo), i);
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> onSetRatingOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, androidx.media3.common.Rating rating) {
        return (com.google.common.util.concurrent.ListenableFuture) androidx.media3.common.util.Assertions.checkNotNull(this.callback.onSetRating(this.instance, resolveControllerInfoForCallback(controllerInfo), str, rating), "Callback.onSetRating must return non-null future");
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> onSetRatingOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.Rating rating) {
        return (com.google.common.util.concurrent.ListenableFuture) androidx.media3.common.util.Assertions.checkNotNull(this.callback.onSetRating(this.instance, resolveControllerInfoForCallback(controllerInfo), rating), "Callback.onSetRating must return non-null future");
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> onCustomCommandOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        return (com.google.common.util.concurrent.ListenableFuture) androidx.media3.common.util.Assertions.checkNotNull(this.callback.onCustomCommand(this.instance, resolveControllerInfoForCallback(controllerInfo), sessionCommand, bundle), "Callback.onCustomCommandOnHandler must return non-null future");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.media3.common.MediaItem>> onAddMediaItemsOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List<androidx.media3.common.MediaItem> list) {
        return (com.google.common.util.concurrent.ListenableFuture) androidx.media3.common.util.Assertions.checkNotNull(this.callback.onAddMediaItems(this.instance, resolveControllerInfoForCallback(controllerInfo), list), "Callback.onAddMediaItems must return a non-null future");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaSession.MediaItemsWithStartPosition> onSetMediaItemsOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        return (com.google.common.util.concurrent.ListenableFuture) androidx.media3.common.util.Assertions.checkNotNull(this.callback.onSetMediaItems(this.instance, resolveControllerInfoForCallback(controllerInfo), list, i, j), "Callback.onSetMediaItems must return a non-null future");
    }

    protected void onPlayerInteractionFinishedOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.Player.Commands commands) {
        this.callback.onPlayerInteractionFinished(this.instance, resolveControllerInfoForCallback(controllerInfo), commands);
    }

    public void connectFromService(androidx.media3.session.IMediaController iMediaController, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.connect(iMediaController, controllerInfo);
    }

    public androidx.media3.session.legacy.MediaSessionCompat getSessionCompat() {
        return this.sessionLegacyStub.getSessionCompat();
    }

    public void setLegacyControllerConnectionTimeoutMs(long j) {
        this.sessionLegacyStub.setLegacyControllerDisconnectTimeoutMs(j);
    }

    protected android.content.Context getContext() {
        return this.context;
    }

    protected android.os.Handler getApplicationHandler() {
        return this.applicationHandler;
    }

    protected boolean isReleased() {
        boolean z;
        synchronized (this.lock) {
            z = this.closed;
        }
        return z;
    }

    protected android.app.PendingIntent getSessionActivity() {
        return this.sessionActivity;
    }

    protected void setSessionActivity(android.app.PendingIntent pendingIntent) {
        this.sessionActivity = pendingIntent;
        com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            setSessionActivity(connectedControllers.get(i), pendingIntent);
        }
    }

    protected void setSessionActivity(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final android.app.PendingIntent pendingIntent) {
        if (controllerInfo.getControllerVersion() < 3 || !this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo)) {
            return;
        }
        dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda32
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                controllerCb.onSessionActivityChanged(i, pendingIntent);
            }
        });
        if (isMediaNotificationController(controllerInfo)) {
            dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda33
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onSessionActivityChanged(i, pendingIntent);
                }
            });
        }
    }

    protected androidx.media3.session.MediaSession.ControllerInfo resolveControllerInfoForCallback(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return (this.isMediaNotificationControllerConnected && isSystemUiController(controllerInfo)) ? (androidx.media3.session.MediaSession.ControllerInfo) androidx.media3.common.util.Assertions.checkNotNull(getMediaNotificationControllerInfo()) : controllerInfo;
    }

    protected android.os.IBinder getLegacyBrowserServiceBinder() {
        androidx.media3.session.MediaSessionServiceLegacyStub mediaSessionServiceLegacyStub;
        synchronized (this.lock) {
            if (this.browserServiceLegacyStub == null) {
                this.browserServiceLegacyStub = createLegacyBrowserService(this.instance.getSessionCompat().getSessionToken());
            }
            mediaSessionServiceLegacyStub = this.browserServiceLegacyStub;
        }
        return mediaSessionServiceLegacyStub.onBind(new android.content.Intent("android.media.browse.MediaBrowserService"));
    }

    protected androidx.media3.session.MediaSessionServiceLegacyStub createLegacyBrowserService(androidx.media3.session.legacy.MediaSessionCompat.Token token) {
        androidx.media3.session.MediaSessionServiceLegacyStub mediaSessionServiceLegacyStub = new androidx.media3.session.MediaSessionServiceLegacyStub(this);
        mediaSessionServiceLegacyStub.initialize(token);
        return mediaSessionServiceLegacyStub;
    }

    protected void setSessionPositionUpdateDelayMsOnHandler(long j) {
        verifyApplicationThread();
        this.sessionPositionUpdateDelayMs = j;
        schedulePeriodicSessionPositionInfoChanges();
    }

    protected androidx.media3.session.MediaSessionServiceLegacyStub getLegacyBrowserService() {
        androidx.media3.session.MediaSessionServiceLegacyStub mediaSessionServiceLegacyStub;
        synchronized (this.lock) {
            mediaSessionServiceLegacyStub = this.browserServiceLegacyStub;
        }
        return mediaSessionServiceLegacyStub;
    }

    boolean canResumePlaybackOnStart() {
        return this.sessionLegacyStub.canResumePlaybackOnStart();
    }

    void setMediaSessionListener(androidx.media3.session.MediaSession.Listener listener) {
        this.mediaSessionListener = listener;
    }

    void clearMediaSessionListener() {
        this.mediaSessionListener = null;
    }

    void onNotificationRefreshRequired() {
        androidx.media3.common.util.Util.postOrRun(this.mainHandler, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m373xa8155a70();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onNotificationRefreshRequired$17$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m373xa8155a70() {
        androidx.media3.session.MediaSession.Listener listener = this.mediaSessionListener;
        if (listener != null) {
            listener.onNotificationRefreshRequired(this.instance);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean onPlayRequested() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
            this.mainHandler.post(new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m374x9a3d657a(settableFutureCreate);
                }
            });
            try {
                return ((java.lang.Boolean) settableFutureCreate.get()).booleanValue();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
        androidx.media3.session.MediaSession.Listener listener = this.mediaSessionListener;
        if (listener != null) {
            return listener.onPlayRequested(this.instance);
        }
        return true;
    }

    /* JADX INFO: renamed from: lambda$onPlayRequested$18$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m374x9a3d657a(com.google.common.util.concurrent.SettableFuture settableFuture) {
        settableFuture.set(java.lang.Boolean.valueOf(onPlayRequested()));
    }

    void handleMediaControllerPlayRequest(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, boolean z) {
        if (onPlayRequested()) {
            boolean z2 = this.playerWrapper.isCommandAvailable(16) && this.playerWrapper.getCurrentMediaItem() != null;
            boolean z3 = this.playerWrapper.isCommandAvailable(31) || this.playerWrapper.isCommandAvailable(20);
            androidx.media3.session.MediaSession.ControllerInfo controllerInfoResolveControllerInfoForCallback = resolveControllerInfoForCallback(controllerInfo);
            androidx.media3.common.Player.Commands commandsBuild = new androidx.media3.common.Player.Commands.Builder().add(1).build();
            if (z2 || !z3) {
                if (!z2) {
                    androidx.media3.common.util.Log.w(TAG, "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                androidx.media3.common.util.Util.handlePlayButtonAction(this.playerWrapper);
                if (z) {
                    onPlayerInteractionFinishedOnHandler(controllerInfoResolveControllerInfoForCallback, commandsBuild);
                    return;
                }
                return;
            }
            com.google.common.util.concurrent.Futures.addCallback((com.google.common.util.concurrent.ListenableFuture) androidx.media3.common.util.Assertions.checkNotNull(this.callback.onPlaybackResumption(this.instance, controllerInfoResolveControllerInfoForCallback), "Callback.onPlaybackResumption must return a non-null future"), new androidx.media3.session.MediaSessionImpl.AnonymousClass1(controllerInfoResolveControllerInfoForCallback, z, commandsBuild), new java.util.concurrent.Executor() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda9
                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable runnable) {
                    this.f$0.postOrRunOnApplicationHandler(runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.media3.session.MediaSessionImpl$1, reason: invalid class name */
    class AnonymousClass1 implements com.google.common.util.concurrent.FutureCallback<androidx.media3.session.MediaSession.MediaItemsWithStartPosition> {
        final /* synthetic */ boolean val$callOnPlayerInteractionFinished;
        final /* synthetic */ androidx.media3.session.MediaSession.ControllerInfo val$controllerForRequest;
        final /* synthetic */ androidx.media3.common.Player.Commands val$playCommand;

        AnonymousClass1(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, boolean z, androidx.media3.common.Player.Commands commands) {
            this.val$controllerForRequest = controllerInfo;
            this.val$callOnPlayerInteractionFinished = z;
            this.val$playCommand = commands;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onSuccess(final androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
            androidx.media3.session.MediaSessionImpl mediaSessionImpl = androidx.media3.session.MediaSessionImpl.this;
            final androidx.media3.session.MediaSession.ControllerInfo controllerInfo = this.val$controllerForRequest;
            final boolean z = this.val$callOnPlayerInteractionFinished;
            final androidx.media3.common.Player.Commands commands = this.val$playCommand;
            mediaSessionImpl.callWithControllerForCurrentRequestSet(controllerInfo, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m376lambda$onSuccess$0$androidxmedia3sessionMediaSessionImpl$1(mediaItemsWithStartPosition, z, controllerInfo, commands);
                }
            }).run();
        }

        /* JADX INFO: renamed from: lambda$onSuccess$0$androidx-media3-session-MediaSessionImpl$1, reason: not valid java name */
        /* synthetic */ void m376lambda$onSuccess$0$androidxmedia3sessionMediaSessionImpl$1(androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition, boolean z, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.Player.Commands commands) {
            androidx.media3.session.MediaUtils.setMediaItemsWithStartIndexAndPosition(androidx.media3.session.MediaSessionImpl.this.playerWrapper, mediaItemsWithStartPosition);
            androidx.media3.common.util.Util.handlePlayButtonAction(androidx.media3.session.MediaSessionImpl.this.playerWrapper);
            if (z) {
                androidx.media3.session.MediaSessionImpl.this.onPlayerInteractionFinishedOnHandler(controllerInfo, commands);
            }
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(java.lang.Throwable th) {
            if (th instanceof java.lang.UnsupportedOperationException) {
                androidx.media3.common.util.Log.w(androidx.media3.session.MediaSessionImpl.TAG, "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
            } else {
                androidx.media3.common.util.Log.e(androidx.media3.session.MediaSessionImpl.TAG, "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
            }
            androidx.media3.common.util.Util.handlePlayButtonAction(androidx.media3.session.MediaSessionImpl.this.playerWrapper);
            if (this.val$callOnPlayerInteractionFinished) {
                androidx.media3.session.MediaSessionImpl.this.onPlayerInteractionFinishedOnHandler(this.val$controllerForRequest, this.val$playCommand);
            }
        }
    }

    private void setAvailableFrameworkControllerCommands(androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        boolean z = this.playerWrapper.getAvailablePlayerCommands().contains(17) != commands.contains(17);
        this.playerWrapper.setAvailableCommands(sessionCommands, commands);
        if (z) {
            this.sessionLegacyStub.updateLegacySessionPlaybackStateAndQueue(this.playerWrapper);
        } else {
            this.sessionLegacyStub.updateLegacySessionPlaybackState(this.playerWrapper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRemoteControllerTaskToLegacyStub(androidx.media3.session.MediaSessionImpl.RemoteControllerTask remoteControllerTask) {
        try {
            remoteControllerTask.run(this.sessionLegacyStub.getControllerLegacyCbForBroadcast(), 0);
        } catch (android.os.RemoteException e) {
            androidx.media3.common.util.Log.e(TAG, "Exception in using media1 API", e);
        }
    }

    private void dispatchOnPeriodicSessionPositionInfoChanged(final androidx.media3.session.SessionPositionInfo sessionPositionInfo) {
        androidx.media3.session.ConnectedControllersManager<android.os.IBinder> connectedControllersManager = this.sessionStub.getConnectedControllersManager();
        com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            final androidx.media3.session.MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            final boolean zIsPlayerCommandAvailable = connectedControllersManager.isPlayerCommandAvailable(controllerInfo, 16);
            final boolean zIsPlayerCommandAvailable2 = connectedControllersManager.isPlayerCommandAvailable(controllerInfo, 17);
            dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                    controllerCb.onPeriodicSessionPositionInfoChanged(i2, sessionPositionInfo, zIsPlayerCommandAvailable, zIsPlayerCommandAvailable2, controllerInfo.getInterfaceVersion());
                }
            });
        }
        try {
            this.sessionLegacyStub.getControllerLegacyCbForBroadcast().onPeriodicSessionPositionInfoChanged(0, sessionPositionInfo, true, true, 0);
        } catch (android.os.RemoteException e) {
            androidx.media3.common.util.Log.e(TAG, "Exception in using media1 API", e);
        }
    }

    protected void dispatchRemoteControllerTaskWithoutReturn(androidx.media3.session.MediaSessionImpl.RemoteControllerTask remoteControllerTask) {
        com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            dispatchRemoteControllerTaskWithoutReturn(connectedControllers.get(i), remoteControllerTask);
        }
        try {
            remoteControllerTask.run(this.sessionLegacyStub.getControllerLegacyCbForBroadcast(), 0);
        } catch (android.os.RemoteException e) {
            androidx.media3.common.util.Log.e(TAG, "Exception in using media1 API", e);
        }
    }

    protected void dispatchRemoteControllerTaskWithoutReturn(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.MediaSessionImpl.RemoteControllerTask remoteControllerTask) {
        int iObtainNextSequenceNumber;
        try {
            androidx.media3.session.SequencedFutureManager sequencedFutureManager = this.sessionStub.getConnectedControllersManager().getSequencedFutureManager(controllerInfo);
            if (sequencedFutureManager != null) {
                iObtainNextSequenceNumber = sequencedFutureManager.obtainNextSequenceNumber();
            } else if (!isConnected(controllerInfo)) {
                return;
            } else {
                iObtainNextSequenceNumber = 0;
            }
            androidx.media3.session.MediaSession.ControllerCb controllerCb = controllerInfo.getControllerCb();
            if (controllerCb != null) {
                remoteControllerTask.run(controllerCb, iObtainNextSequenceNumber);
            }
        } catch (android.os.DeadObjectException unused) {
            onDeadObjectException(controllerInfo);
        } catch (android.os.RemoteException e) {
            androidx.media3.common.util.Log.w(TAG, "Exception in " + controllerInfo.toString(), e);
        }
    }

    private com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> dispatchRemoteControllerTask(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.MediaSessionImpl.RemoteControllerTask remoteControllerTask) {
        int sequenceNumber;
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> listenableFutureImmediateFuture;
        try {
            androidx.media3.session.SequencedFutureManager sequencedFutureManager = this.sessionStub.getConnectedControllersManager().getSequencedFutureManager(controllerInfo);
            if (sequencedFutureManager != null) {
                androidx.media3.session.SequencedFutureManager.SequencedFuture sequencedFutureCreateSequencedFuture = sequencedFutureManager.createSequencedFuture(RESULT_WHEN_CLOSED);
                androidx.media3.session.SequencedFutureManager.SequencedFuture sequencedFuture = sequencedFutureCreateSequencedFuture;
                sequenceNumber = sequencedFutureCreateSequencedFuture.getSequenceNumber();
                listenableFutureImmediateFuture = sequencedFutureCreateSequencedFuture;
            } else {
                if (!isConnected(controllerInfo)) {
                    return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-100));
                }
                sequenceNumber = 0;
                listenableFutureImmediateFuture = com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(0));
            }
            androidx.media3.session.MediaSession.ControllerCb controllerCb = controllerInfo.getControllerCb();
            if (controllerCb != null) {
                remoteControllerTask.run(controllerCb, sequenceNumber);
            }
            return listenableFutureImmediateFuture;
        } catch (android.os.DeadObjectException unused) {
            onDeadObjectException(controllerInfo);
            return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-100));
        } catch (android.os.RemoteException e) {
            androidx.media3.common.util.Log.w(TAG, "Exception in " + controllerInfo.toString(), e);
            return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-1));
        }
    }

    private void onDeadObjectException(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.getConnectedControllersManager().removeController(controllerInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void verifyApplicationThread() {
        if (android.os.Looper.myLooper() != this.applicationHandler.getLooper()) {
            throw new java.lang.IllegalStateException(WRONG_THREAD_ERROR_MESSAGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPeriodicSessionPositionInfoChangesOnHandler() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            androidx.media3.session.SessionPositionInfo sessionPositionInfoCreateSessionPositionInfoForBundling = this.playerWrapper.createSessionPositionInfoForBundling();
            if (!this.onPlayerInfoChangedHandler.hasPendingPlayerInfoChangedUpdate() && androidx.media3.session.MediaUtils.areSessionPositionInfosInSamePeriodOrAd(sessionPositionInfoCreateSessionPositionInfoForBundling, this.playerInfo.sessionPositionInfo)) {
                dispatchOnPeriodicSessionPositionInfoChanged(sessionPositionInfoCreateSessionPositionInfoForBundling);
            }
            schedulePeriodicSessionPositionInfoChanges();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void schedulePeriodicSessionPositionInfoChanges() {
        this.applicationHandler.removeCallbacks(this.periodicSessionPositionInfoUpdateRunnable);
        if (!this.isPeriodicPositionUpdateEnabled || this.sessionPositionUpdateDelayMs <= 0) {
            return;
        }
        if (this.playerWrapper.isPlaying() || this.playerWrapper.isLoading()) {
            this.applicationHandler.postDelayed(this.periodicSessionPositionInfoUpdateRunnable, this.sessionPositionUpdateDelayMs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAvailablePlayerCommandsChanged(final androidx.media3.common.Player.Commands commands) {
        this.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(false, false);
        dispatchRemoteControllerTaskWithoutReturn(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda28
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                controllerCb.onAvailableCommandsChangedFromPlayer(i, commands);
            }
        });
        dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda29
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                this.f$0.m372x4261346b(controllerCb, i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$handleAvailablePlayerCommandsChanged$21$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m372x4261346b(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
        controllerCb.onDeviceInfoChanged(i, this.playerInfo.deviceInfo);
    }

    boolean onMediaButtonEvent(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, android.content.Intent intent) {
        boolean z;
        android.view.KeyEvent keyEvent = androidx.media3.session.DefaultActionFactory.getKeyEvent(intent);
        android.content.ComponentName component = intent.getComponent();
        if (!java.util.Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || ((component != null && !java.util.Objects.equals(component.getPackageName(), this.context.getPackageName())) || keyEvent == null || keyEvent.getAction() != 0)) {
            return false;
        }
        verifyApplicationThread();
        if (this.callback.onMediaButtonEvent(this.instance, controllerInfo, intent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z2 = androidx.media3.common.util.Util.SDK_INT >= 21 && androidx.media3.session.MediaSessionImpl.Api21.isTvApp(this.context);
        if ((keyCode != 79 && keyCode != 85) || z2 || controllerInfo.getControllerVersion() != 0 || keyEvent.getRepeatCount() != 0) {
            this.mediaPlayPauseKeyHandler.flush();
            z = false;
        } else if (this.mediaPlayPauseKeyHandler.hasPendingPlayPauseTask()) {
            this.mediaPlayPauseKeyHandler.clearPendingPlayPauseTask();
            z = true;
        } else {
            this.mediaPlayPauseKeyHandler.setPendingPlayPauseTask(controllerInfo, keyEvent);
            return true;
        }
        if (isMediaNotificationControllerConnected()) {
            return applyMediaButtonKeyEvent(keyEvent, z);
        }
        if (keyCode == 85 && z) {
            this.sessionLegacyStub.onSkipToNext();
            return true;
        }
        if (controllerInfo.getControllerVersion() == 0) {
            return false;
        }
        this.sessionLegacyStub.getSessionCompat().getController().dispatchMediaButtonEvent(keyEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    public boolean applyMediaButtonKeyEvent(android.view.KeyEvent keyEvent, boolean z) {
        final java.lang.Runnable runnable;
        final androidx.media3.session.MediaSession.ControllerInfo controllerInfo = (androidx.media3.session.MediaSession.ControllerInfo) androidx.media3.common.util.Assertions.checkNotNull(this.instance.getMediaNotificationControllerInfo());
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 126) && z) {
            keyCode = 87;
        }
        if (keyCode == 126) {
            runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m363x9e89ee61(controllerInfo);
                }
            };
        } else if (keyCode == 127) {
            runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m364xa5ef2380(controllerInfo);
                }
            };
        } else if (keyCode == 272) {
            runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m365xad54589f(controllerInfo);
                }
            };
        } else if (keyCode != 273) {
            switch (keyCode) {
                case 85:
                    if (getPlayerWrapper().getPlayWhenReady()) {
                        runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda17
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.m361x8fbf8423(controllerInfo);
                            }
                        };
                    } else {
                        runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda18
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.m362x9724b942(controllerInfo);
                            }
                        };
                    }
                    break;
                case 86:
                    runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda26
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m369x663688a6(controllerInfo);
                        }
                    };
                    break;
                case 87:
                    runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda21
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m365xad54589f(controllerInfo);
                        }
                    };
                    break;
                case 88:
                    runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda23
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m366xb4b98dbe(controllerInfo);
                        }
                    };
                    break;
                case 89:
                    runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda25
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m368xc383f7fc(controllerInfo);
                        }
                    };
                    break;
                case 90:
                    runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda24
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m367xbc1ec2dd(controllerInfo);
                        }
                    };
                    break;
                default:
                    return false;
            }
        } else {
            runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m366xb4b98dbe(controllerInfo);
                }
            };
        }
        androidx.media3.common.util.Util.postOrRun(getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m370x6d9bbdc5(runnable, controllerInfo);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: lambda$applyMediaButtonKeyEvent$22$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m361x8fbf8423(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.pauseForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: lambda$applyMediaButtonKeyEvent$23$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m362x9724b942(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.playForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: lambda$applyMediaButtonKeyEvent$24$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m363x9e89ee61(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.playForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: lambda$applyMediaButtonKeyEvent$25$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m364xa5ef2380(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.pauseForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: lambda$applyMediaButtonKeyEvent$26$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m365xad54589f(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekToNextForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: lambda$applyMediaButtonKeyEvent$27$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m366xb4b98dbe(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekToPreviousForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: lambda$applyMediaButtonKeyEvent$28$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m367xbc1ec2dd(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekForwardForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: lambda$applyMediaButtonKeyEvent$29$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m368xc383f7fc(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekBackForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: lambda$applyMediaButtonKeyEvent$30$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m369x663688a6(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.stopForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: lambda$applyMediaButtonKeyEvent$31$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m370x6d9bbdc5(java.lang.Runnable runnable, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        runnable.run();
        this.sessionStub.getConnectedControllersManager().flushCommandQueue(controllerInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(java.lang.Runnable runnable) {
        androidx.media3.common.util.Util.postOrRun(getApplicationHandler(), runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PlayerListener implements androidx.media3.common.Player.Listener {
        private final java.lang.ref.WeakReference<androidx.media3.session.PlayerWrapper> player;
        private final java.lang.ref.WeakReference<androidx.media3.session.MediaSessionImpl> session;

        public PlayerListener(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.PlayerWrapper playerWrapper) {
            this.session = new java.lang.ref.WeakReference<>(mediaSessionImpl);
            this.player = new java.lang.ref.WeakReference<>(playerWrapper);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(final androidx.media3.common.PlaybackException playbackException) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlayerError(playbackException);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda19
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onPlayerError(i, playbackException);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaItemTransition(final androidx.media3.common.MediaItem mediaItem, final int i) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithMediaItemTransitionReason(i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda17
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                    controllerCb.onMediaItemTransition(i2, mediaItem, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(final boolean z, final int i) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlayWhenReady(z, i, session.playerInfo.playbackSuppressionReason);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda20
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                    controllerCb.onPlayWhenReadyChanged(i2, z, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackSuppressionReasonChanged(final int i) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlayWhenReady(session.playerInfo.playWhenReady, session.playerInfo.playWhenReadyChangeReason, i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda7
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                    controllerCb.onPlaybackSuppressionReasonChanged(i2, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(final int i) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            final androidx.media3.session.PlayerWrapper playerWrapper = this.player.get();
            if (playerWrapper == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlaybackState(i, playerWrapper.getPlayerError());
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda11
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                    controllerCb.onPlaybackStateChanged(i2, i, playerWrapper.getPlayerError());
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsPlayingChanged(final boolean z) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithIsPlaying(z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda8
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onIsPlayingChanged(i, z);
                }
            });
            session.schedulePeriodicSessionPositionInfoChanges();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsLoadingChanged(final boolean z) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithIsLoading(z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda15
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onIsLoadingChanged(i, z);
                }
            });
            session.schedulePeriodicSessionPositionInfoChanges();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(final androidx.media3.common.Player.PositionInfo positionInfo, final androidx.media3.common.Player.PositionInfo positionInfo2, final int i) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPositionInfos(positionInfo, positionInfo2, i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda12
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                    controllerCb.onPositionDiscontinuity(i2, positionInfo, positionInfo2, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackParametersChanged(final androidx.media3.common.PlaybackParameters playbackParameters) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlaybackParameters(playbackParameters);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda23
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onPlaybackParametersChanged(i, playbackParameters);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSeekBackIncrementChanged(final long j) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithSeekBackIncrement(j);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda2
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onSeekBackIncrementChanged(i, j);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSeekForwardIncrementChanged(final long j) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithSeekForwardIncrement(j);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda0
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onSeekForwardIncrementChanged(i, j);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTimelineChanged(final androidx.media3.common.Timeline timeline, final int i) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            androidx.media3.session.PlayerWrapper playerWrapper = this.player.get();
            if (playerWrapper == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithTimelineAndSessionPositionInfo(timeline, playerWrapper.createSessionPositionInfoForBundling(), i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(false, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda13
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                    controllerCb.onTimelineChanged(i2, timeline, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaylistMetadataChanged(final androidx.media3.common.MediaMetadata mediaMetadata) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            session.playerInfo = session.playerInfo.copyWithPlaylistMetadata(mediaMetadata);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda1
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onPlaylistMetadataChanged(i, mediaMetadata);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRepeatModeChanged(final int i) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithRepeatMode(i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda10
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                    controllerCb.onRepeatModeChanged(i2, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onShuffleModeEnabledChanged(final boolean z) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithShuffleModeEnabled(z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda4
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onShuffleModeEnabledChanged(i, z);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAudioAttributesChanged(final androidx.media3.common.AudioAttributes audioAttributes) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithAudioAttributes(audioAttributes);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda5
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onAudioAttributesChanged(i, audioAttributes);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVideoSizeChanged(final androidx.media3.common.VideoSize videoSize) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            session.playerInfo = session.playerInfo.copyWithVideoSize(videoSize);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda9
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onVideoSizeChanged(i, videoSize);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVolumeChanged(final float f) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            session.playerInfo = session.playerInfo.copyWithVolume(f);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda6
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onVolumeChanged(i, f);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onCues(androidx.media3.common.text.CueGroup cueGroup) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = new androidx.media3.session.PlayerInfo.Builder(session.playerInfo).setCues(cueGroup).build();
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onDeviceInfoChanged(final androidx.media3.common.DeviceInfo deviceInfo) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithDeviceInfo(deviceInfo);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda16
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onDeviceInfoChanged(i, deviceInfo);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onDeviceVolumeChanged(final int i, final boolean z) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithDeviceVolume(i, z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda22
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                    controllerCb.onDeviceVolumeChanged(i2, i, z);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAvailableCommandsChanged(androidx.media3.common.Player.Commands commands) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.handleAvailablePlayerCommandsChanged(commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTracksChanged(final androidx.media3.common.Tracks tracks) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithCurrentTracks(tracks);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, false);
            session.dispatchRemoteControllerTaskWithoutReturn(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onTracksChanged(i, tracks);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTrackSelectionParametersChanged(final androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithTrackSelectionParameters(trackSelectionParameters);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskWithoutReturn(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda14
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onTrackSelectionParametersChanged(i, trackSelectionParameters);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaMetadataChanged(final androidx.media3.common.MediaMetadata mediaMetadata) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithMediaMetadata(mediaMetadata);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda21
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onMediaMetadataChanged(i, mediaMetadata);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            session.dispatchRemoteControllerTaskWithoutReturn(new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda18
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i) throws android.os.RemoteException {
                    controllerCb.onRenderedFirstFrame(i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMaxSeekToPreviousPositionChanged(long j) {
            androidx.media3.session.MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithMaxSeekToPreviousPositionMs(j);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
        }

        private androidx.media3.session.MediaSessionImpl getSession() {
            return this.session.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class MediaPlayPauseKeyHandler extends android.os.Handler {
        private java.lang.Runnable playPauseTask;

        public MediaPlayPauseKeyHandler(android.os.Looper looper) {
            super(looper);
        }

        public void setPendingPlayPauseTask(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final android.view.KeyEvent keyEvent) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionImpl$MediaPlayPauseKeyHandler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m377xa939a527(controllerInfo, keyEvent);
                }
            };
            this.playPauseTask = runnable;
            postDelayed(runnable, android.view.ViewConfiguration.getDoubleTapTimeout());
        }

        /* JADX INFO: renamed from: lambda$setPendingPlayPauseTask$0$androidx-media3-session-MediaSessionImpl$MediaPlayPauseKeyHandler, reason: not valid java name */
        /* synthetic */ void m377xa939a527(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, android.view.KeyEvent keyEvent) {
            if (androidx.media3.session.MediaSessionImpl.this.isMediaNotificationController(controllerInfo)) {
                androidx.media3.session.MediaSessionImpl.this.applyMediaButtonKeyEvent(keyEvent, false);
            } else {
                androidx.media3.session.MediaSessionImpl.this.sessionLegacyStub.handleMediaPlayPauseOnHandler((androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo) androidx.media3.common.util.Assertions.checkNotNull(controllerInfo.getRemoteUserInfo()));
            }
            this.playPauseTask = null;
        }

        public java.lang.Runnable clearPendingPlayPauseTask() {
            java.lang.Runnable runnable = this.playPauseTask;
            if (runnable == null) {
                return null;
            }
            removeCallbacks(runnable);
            java.lang.Runnable runnable2 = this.playPauseTask;
            this.playPauseTask = null;
            return runnable2;
        }

        public boolean hasPendingPlayPauseTask() {
            return this.playPauseTask != null;
        }

        public void flush() {
            java.lang.Runnable runnableClearPendingPlayPauseTask = clearPendingPlayPauseTask();
            if (runnableClearPendingPlayPauseTask != null) {
                androidx.media3.common.util.Util.postOrRun(this, runnableClearPendingPlayPauseTask);
            }
        }
    }

    private class PlayerInfoChangedHandler extends android.os.Handler {
        private static final int MSG_PLAYER_INFO_CHANGED = 1;
        private boolean excludeTimeline;
        private boolean excludeTracks;

        public PlayerInfoChangedHandler(android.os.Looper looper) {
            super(looper);
            this.excludeTimeline = true;
            this.excludeTracks = true;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what == 1) {
                androidx.media3.session.MediaSessionImpl mediaSessionImpl = androidx.media3.session.MediaSessionImpl.this;
                mediaSessionImpl.playerInfo = mediaSessionImpl.playerInfo.copyWithTimelineAndSessionPositionInfo(androidx.media3.session.MediaSessionImpl.this.getPlayerWrapper().getCurrentTimelineWithCommandCheck(), androidx.media3.session.MediaSessionImpl.this.getPlayerWrapper().createSessionPositionInfoForBundling(), androidx.media3.session.MediaSessionImpl.this.playerInfo.timelineChangeReason);
                androidx.media3.session.MediaSessionImpl mediaSessionImpl2 = androidx.media3.session.MediaSessionImpl.this;
                mediaSessionImpl2.dispatchOnPlayerInfoChanged(mediaSessionImpl2.playerInfo, this.excludeTimeline, this.excludeTracks);
                this.excludeTimeline = true;
                this.excludeTracks = true;
                return;
            }
            throw new java.lang.IllegalStateException("Invalid message what=" + message.what);
        }

        public boolean hasPendingPlayerInfoChangedUpdate() {
            return hasMessages(1);
        }

        public void sendPlayerInfoChangedMessage(boolean z, boolean z2) {
            boolean z3 = false;
            this.excludeTimeline = this.excludeTimeline && z;
            if (this.excludeTracks && z2) {
                z3 = true;
            }
            this.excludeTracks = z3;
            if (hasMessages(1)) {
                return;
            }
            sendEmptyMessage(1);
        }
    }

    private static final class Api21 {
        private Api21() {
        }

        public static boolean isTvApp(android.content.Context context) {
            return context.getPackageManager().hasSystemFeature("android.software.leanback");
        }
    }
}
