package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerImplBase implements androidx.media3.session.MediaController.MediaControllerImpl {
    private static final long RELEASE_TIMEOUT_MS = 30000;
    public static final java.lang.String TAG = "MCImplBase";
    private androidx.media3.session.SessionToken connectedToken;
    private final android.os.Bundle connectionHints;
    private final android.content.Context context;
    protected final androidx.media3.session.MediaControllerStub controllerStub;
    private long currentPositionMs;
    private final android.os.IBinder.DeathRecipient deathRecipient;
    private final androidx.media3.session.MediaControllerImplBase.FlushCommandQueueHandler flushCommandQueueHandler;
    private androidx.media3.session.IMediaSession iSession;
    private final androidx.media3.session.MediaController instance;
    private androidx.media3.common.Player.Commands intersectedPlayerCommands;
    private long lastSetPlayWhenReadyCalledTimeMs;
    private final androidx.media3.common.util.ListenerSet<androidx.media3.common.Player.Listener> listeners;
    private androidx.media3.session.PlayerInfo.BundlingExclusions pendingBundlingExclusions;
    private final androidx.collection.ArraySet<java.lang.Integer> pendingMaskingSequencedFutureNumbers;
    private androidx.media3.session.PlayerInfo pendingPlayerInfo;
    private androidx.media3.common.Player.Commands playerCommandsFromPlayer;
    private boolean released;
    protected final androidx.media3.session.SequencedFutureManager sequencedFutureManager;
    private androidx.media3.session.MediaControllerImplBase.SessionServiceConnection serviceConnection;
    private android.app.PendingIntent sessionActivity;
    private android.os.Bundle sessionExtras;
    private final androidx.media3.session.MediaControllerImplBase.SurfaceCallback surfaceCallback;
    private final androidx.media3.session.SessionToken token;
    private android.view.Surface videoSurface;
    private android.view.SurfaceHolder videoSurfaceHolder;
    private android.view.TextureView videoTextureView;
    private androidx.media3.session.PlayerInfo playerInfo = androidx.media3.session.PlayerInfo.DEFAULT;
    private androidx.media3.common.util.Size surfaceSize = androidx.media3.common.util.Size.UNKNOWN;
    private androidx.media3.session.SessionCommands sessionCommands = androidx.media3.session.SessionCommands.EMPTY;
    private com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> customLayoutOriginal = com.google.common.collect.ImmutableList.of();
    private com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> customLayoutWithUnavailableButtonsDisabled = com.google.common.collect.ImmutableList.of();
    private androidx.media3.common.Player.Commands playerCommandsFromSession = androidx.media3.common.Player.Commands.EMPTY;

    /* JADX INFO: Access modifiers changed from: private */
    interface RemoteSessionTask {
        void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException;
    }

    private static int convertRepeatModeForNavigation(int i) {
        if (i == 1) {
            return 0;
        }
        return i;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.legacy.MediaBrowserCompat getBrowserCompat() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaControllerImplBase(android.content.Context context, androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, android.os.Looper looper) {
        androidx.media3.common.Player.Commands commands = androidx.media3.common.Player.Commands.EMPTY;
        this.playerCommandsFromPlayer = commands;
        this.intersectedPlayerCommands = createIntersectedCommandsEnsuringCommandReleaseAvailable(this.playerCommandsFromSession, commands);
        this.listeners = new androidx.media3.common.util.ListenerSet<>(looper, androidx.media3.common.util.Clock.DEFAULT, new androidx.media3.common.util.ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda91
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
                this.f$0.m253lambda$new$0$androidxmedia3sessionMediaControllerImplBase((androidx.media3.common.Player.Listener) obj, flagSet);
            }
        });
        this.instance = mediaController;
        androidx.media3.common.util.Assertions.checkNotNull(context, "context must not be null");
        androidx.media3.common.util.Assertions.checkNotNull(sessionToken, "token must not be null");
        this.context = context;
        this.sequencedFutureManager = new androidx.media3.session.SequencedFutureManager();
        this.controllerStub = new androidx.media3.session.MediaControllerStub(this);
        this.pendingMaskingSequencedFutureNumbers = new androidx.collection.ArraySet<>();
        this.token = sessionToken;
        this.connectionHints = bundle;
        this.deathRecipient = new android.os.IBinder.DeathRecipient() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda92
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                this.f$0.m254lambda$new$1$androidxmedia3sessionMediaControllerImplBase();
            }
        };
        this.surfaceCallback = new androidx.media3.session.MediaControllerImplBase.SurfaceCallback();
        this.sessionExtras = android.os.Bundle.EMPTY;
        this.serviceConnection = sessionToken.getType() != 0 ? new androidx.media3.session.MediaControllerImplBase.SessionServiceConnection(bundle) : null;
        this.flushCommandQueueHandler = new androidx.media3.session.MediaControllerImplBase.FlushCommandQueueHandler(looper);
        this.currentPositionMs = androidx.media3.common.C.TIME_UNSET;
        this.lastSetPlayWhenReadyCalledTimeMs = androidx.media3.common.C.TIME_UNSET;
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m253lambda$new$0$androidxmedia3sessionMediaControllerImplBase(androidx.media3.common.Player.Listener listener, androidx.media3.common.FlagSet flagSet) {
        listener.onEvents(getInstance(), new androidx.media3.common.Player.Events(flagSet));
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m254lambda$new$1$androidxmedia3sessionMediaControllerImplBase() {
        androidx.media3.session.MediaController mediaControllerImplBase = getInstance();
        androidx.media3.session.MediaController mediaControllerImplBase2 = getInstance();
        java.util.Objects.requireNonNull(mediaControllerImplBase2);
        mediaControllerImplBase.runOnApplicationLooper(new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda44(mediaControllerImplBase2));
    }

    androidx.media3.session.MediaController getInstance() {
        return this.instance;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void connect() {
        boolean zRequestConnectToService;
        if (this.token.getType() == 0) {
            this.serviceConnection = null;
            zRequestConnectToService = requestConnectToSession(this.connectionHints);
        } else {
            this.serviceConnection = new androidx.media3.session.MediaControllerImplBase.SessionServiceConnection(this.connectionHints);
            zRequestConnectToService = requestConnectToService();
        }
        if (zRequestConnectToService) {
            return;
        }
        androidx.media3.session.MediaController mediaControllerImplBase = getInstance();
        androidx.media3.session.MediaController mediaControllerImplBase2 = getInstance();
        java.util.Objects.requireNonNull(mediaControllerImplBase2);
        mediaControllerImplBase.runOnApplicationLooper(new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda44(mediaControllerImplBase2));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addListener(androidx.media3.common.Player.Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeListener(androidx.media3.common.Player.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void stop() {
        if (isPlayerCommandAvailable(3)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda45
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m316lambda$stop$2$androidxmedia3sessionMediaControllerImplBase(iMediaSession, i);
                }
            });
            androidx.media3.session.PlayerInfo playerInfoCopyWithSessionPositionInfo = this.playerInfo.copyWithSessionPositionInfo(new androidx.media3.session.SessionPositionInfo(this.playerInfo.sessionPositionInfo.positionInfo, this.playerInfo.sessionPositionInfo.isPlayingAd, android.os.SystemClock.elapsedRealtime(), this.playerInfo.sessionPositionInfo.durationMs, this.playerInfo.sessionPositionInfo.positionInfo.positionMs, androidx.media3.session.MediaUtils.calculateBufferedPercentage(this.playerInfo.sessionPositionInfo.positionInfo.positionMs, this.playerInfo.sessionPositionInfo.durationMs), 0L, this.playerInfo.sessionPositionInfo.currentLiveOffsetMs, this.playerInfo.sessionPositionInfo.contentDurationMs, this.playerInfo.sessionPositionInfo.positionInfo.positionMs));
            this.playerInfo = playerInfoCopyWithSessionPositionInfo;
            if (playerInfoCopyWithSessionPositionInfo.playbackState != 1) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithPlaybackState(1, playerInfo.playerError);
                this.listeners.queueEvent(4, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda46
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((androidx.media3.common.Player.Listener) obj).onPlaybackStateChanged(1);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$stop$2$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m316lambda$stop$2$androidxmedia3sessionMediaControllerImplBase(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.stop(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void release() {
        androidx.media3.session.IMediaSession iMediaSession = this.iSession;
        if (this.released) {
            return;
        }
        this.released = true;
        this.connectedToken = null;
        this.flushCommandQueueHandler.release();
        this.iSession = null;
        if (iMediaSession != null) {
            int iObtainNextSequenceNumber = this.sequencedFutureManager.obtainNextSequenceNumber();
            try {
                iMediaSession.asBinder().unlinkToDeath(this.deathRecipient, 0);
                iMediaSession.release(this.controllerStub, iObtainNextSequenceNumber);
            } catch (android.os.RemoteException unused) {
            }
        }
        this.listeners.release();
        this.sequencedFutureManager.lazyRelease(30000L, new java.lang.Runnable() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda117
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m268lambda$release$4$androidxmedia3sessionMediaControllerImplBase();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$release$4$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m268lambda$release$4$androidxmedia3sessionMediaControllerImplBase() {
        androidx.media3.session.MediaControllerImplBase.SessionServiceConnection sessionServiceConnection = this.serviceConnection;
        if (sessionServiceConnection != null) {
            this.context.unbindService(sessionServiceConnection);
            this.serviceConnection = null;
        }
        this.controllerStub.destroy();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.SessionToken getConnectedToken() {
        return this.connectedToken;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isConnected() {
        return this.iSession != null;
    }

    boolean isReleased() {
        return this.released;
    }

    private void dispatchRemoteSessionTaskWithPlayerCommand(androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask) {
        this.flushCommandQueueHandler.sendFlushCommandQueueMessage();
        dispatchRemoteSessionTask(this.iSession, remoteSessionTask, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask) {
        this.flushCommandQueueHandler.sendFlushCommandQueueMessage();
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> listenableFutureDispatchRemoteSessionTask = dispatchRemoteSessionTask(this.iSession, remoteSessionTask, true);
        try {
            androidx.media3.session.LegacyConversions.getFutureResult(listenableFutureDispatchRemoteSessionTask, androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } catch (java.util.concurrent.ExecutionException e) {
            throw new java.lang.IllegalStateException(e);
        } catch (java.util.concurrent.TimeoutException e2) {
            if (listenableFutureDispatchRemoteSessionTask instanceof androidx.media3.session.SequencedFutureManager.SequencedFuture) {
                int sequenceNumber = ((androidx.media3.session.SequencedFutureManager.SequencedFuture) listenableFutureDispatchRemoteSessionTask).getSequenceNumber();
                this.pendingMaskingSequencedFutureNumbers.remove(java.lang.Integer.valueOf(sequenceNumber));
                this.sequencedFutureManager.setFutureResult(sequenceNumber, new androidx.media3.session.SessionResult(-1));
            }
            androidx.media3.common.util.Log.w(TAG, "Synchronous command takes too long on the session side.", e2);
        }
    }

    private com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> dispatchRemoteSessionTaskWithSessionCommand(int i, androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask) {
        return dispatchRemoteSessionTaskWithSessionCommandInternal(i, null, remoteSessionTask);
    }

    private com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> dispatchRemoteSessionTaskWithSessionCommand(androidx.media3.session.SessionCommand sessionCommand, androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask) {
        return dispatchRemoteSessionTaskWithSessionCommandInternal(0, sessionCommand, remoteSessionTask);
    }

    private com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> dispatchRemoteSessionTaskWithSessionCommandInternal(int i, androidx.media3.session.SessionCommand sessionCommand, androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask) {
        androidx.media3.session.IMediaSession sessionInterfaceWithSessionCommandIfAble;
        if (sessionCommand != null) {
            sessionInterfaceWithSessionCommandIfAble = getSessionInterfaceWithSessionCommandIfAble(sessionCommand);
        } else {
            sessionInterfaceWithSessionCommandIfAble = getSessionInterfaceWithSessionCommandIfAble(i);
        }
        return dispatchRemoteSessionTask(sessionInterfaceWithSessionCommandIfAble, remoteSessionTask, false);
    }

    private com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> dispatchRemoteSessionTask(androidx.media3.session.IMediaSession iMediaSession, androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask, boolean z) {
        if (iMediaSession != null) {
            androidx.media3.session.SequencedFutureManager.SequencedFuture sequencedFutureCreateSequencedFuture = this.sequencedFutureManager.createSequencedFuture(new androidx.media3.session.SessionResult(1));
            int sequenceNumber = sequencedFutureCreateSequencedFuture.getSequenceNumber();
            if (z) {
                this.pendingMaskingSequencedFutureNumbers.add(java.lang.Integer.valueOf(sequenceNumber));
            }
            try {
                remoteSessionTask.run(iMediaSession, sequenceNumber);
            } catch (android.os.RemoteException e) {
                androidx.media3.common.util.Log.w(TAG, "Cannot connect to the service or the session is gone", e);
                this.pendingMaskingSequencedFutureNumbers.remove(java.lang.Integer.valueOf(sequenceNumber));
                this.sequencedFutureManager.setFutureResult(sequenceNumber, new androidx.media3.session.SessionResult(-100));
            }
            return sequencedFutureCreateSequencedFuture;
        }
        return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-4));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void play() {
        if (!isPlayerCommandAvailable(1)) {
            androidx.media3.common.util.Log.w(TAG, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda109
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m266lambda$play$5$androidxmedia3sessionMediaControllerImplBase(iMediaSession, i);
                }
            });
            setPlayWhenReady(true, 1);
        }
    }

    /* JADX INFO: renamed from: lambda$play$5$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m266lambda$play$5$androidxmedia3sessionMediaControllerImplBase(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.play(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void pause() {
        if (isPlayerCommandAvailable(1)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda52
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m265lambda$pause$6$androidxmedia3sessionMediaControllerImplBase(iMediaSession, i);
                }
            });
            setPlayWhenReady(false, 1);
        }
    }

    /* JADX INFO: renamed from: lambda$pause$6$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m265lambda$pause$6$androidxmedia3sessionMediaControllerImplBase(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.pause(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void prepare() {
        if (isPlayerCommandAvailable(2)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda51
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m267lambda$prepare$7$androidxmedia3sessionMediaControllerImplBase(iMediaSession, i);
                }
            });
            if (this.playerInfo.playbackState == 1) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                updatePlayerInfo(playerInfo.copyWithPlaybackState(playerInfo.timeline.isEmpty() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$prepare$7$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m267lambda$prepare$7$androidxmedia3sessionMediaControllerImplBase(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.prepare(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToDefaultPosition() {
        if (isPlayerCommandAvailable(4)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda53
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m277x4935e2a(iMediaSession, i);
                }
            });
            seekToInternal(getCurrentMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
        }
    }

    /* JADX INFO: renamed from: lambda$seekToDefaultPosition$8$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m277x4935e2a(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.seekToDefaultPosition(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToDefaultPosition(final int i) {
        if (isPlayerCommandAvailable(10)) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda97
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m278x41cf82b(i, iMediaSession, i2);
                }
            });
            seekToInternal(i, androidx.media3.common.C.TIME_UNSET);
        }
    }

    /* JADX INFO: renamed from: lambda$seekToDefaultPosition$9$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m278x41cf82b(int i, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.seekToDefaultPositionWithMediaItemIndex(this.controllerStub, i2, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekTo(final long j) {
        if (isPlayerCommandAvailable(5)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda55
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m275lambda$seekTo$10$androidxmedia3sessionMediaControllerImplBase(j, iMediaSession, i);
                }
            });
            seekToInternal(getCurrentMediaItemIndex(), j);
        }
    }

    /* JADX INFO: renamed from: lambda$seekTo$10$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m275lambda$seekTo$10$androidxmedia3sessionMediaControllerImplBase(long j, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.seekTo(this.controllerStub, i, j);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekTo(final int i, final long j) {
        if (isPlayerCommandAvailable(10)) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda103
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m276lambda$seekTo$11$androidxmedia3sessionMediaControllerImplBase(i, j, iMediaSession, i2);
                }
            });
            seekToInternal(i, j);
        }
    }

    /* JADX INFO: renamed from: lambda$seekTo$11$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m276lambda$seekTo$11$androidxmedia3sessionMediaControllerImplBase(int i, long j, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.seekToWithMediaItemIndex(this.controllerStub, i2, i, j);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getSeekBackIncrement() {
        return this.playerInfo.seekBackIncrementMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekBack() {
        if (isPlayerCommandAvailable(11)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda90
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m273xa77bbc45(iMediaSession, i);
                }
            });
            seekToInternalByOffset(-getSeekBackIncrement());
        }
    }

    /* JADX INFO: renamed from: lambda$seekBack$12$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m273xa77bbc45(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.seekBack(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getSeekForwardIncrement() {
        return this.playerInfo.seekForwardIncrementMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekForward() {
        if (isPlayerCommandAvailable(12)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda93
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m274xc4e101b2(iMediaSession, i);
                }
            });
            seekToInternalByOffset(getSeekForwardIncrement());
        }
    }

    /* JADX INFO: renamed from: lambda$seekForward$13$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m274xc4e101b2(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.seekForward(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlayWhenReady(final boolean z) {
        if (isPlayerCommandAvailable(1)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda96
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m301x3c78c7d3(z, iMediaSession, i);
                }
            });
            setPlayWhenReady(z, 1);
        } else if (z) {
            androidx.media3.common.util.Log.w(TAG, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    /* JADX INFO: renamed from: lambda$setPlayWhenReady$14$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m301x3c78c7d3(boolean z, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setPlayWhenReady(this.controllerStub, i, z);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean getPlayWhenReady() {
        return this.playerInfo.playWhenReady;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPlaybackSuppressionReason() {
        return this.playerInfo.playbackSuppressionReason;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.PlaybackException getPlayerError() {
        return this.playerInfo.playerError;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPlaybackState() {
        return this.playerInfo.playbackState;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isPlaying() {
        return this.playerInfo.isPlaying;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isLoading() {
        return this.playerInfo.isLoading;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getDuration() {
        return this.playerInfo.sessionPositionInfo.durationMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getCurrentPosition() {
        long updatedCurrentPositionMs = androidx.media3.session.MediaUtils.getUpdatedCurrentPositionMs(this.playerInfo, this.currentPositionMs, this.lastSetPlayWhenReadyCalledTimeMs, getInstance().getTimeDiffMs());
        this.currentPositionMs = updatedCurrentPositionMs;
        return updatedCurrentPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getBufferedPosition() {
        return this.playerInfo.sessionPositionInfo.bufferedPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getBufferedPercentage() {
        return this.playerInfo.sessionPositionInfo.bufferedPercentage;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getTotalBufferedDuration() {
        return this.playerInfo.sessionPositionInfo.totalBufferedDurationMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getCurrentLiveOffset() {
        return this.playerInfo.sessionPositionInfo.currentLiveOffsetMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentDuration() {
        return this.playerInfo.sessionPositionInfo.contentDurationMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentPosition() {
        if (!this.playerInfo.sessionPositionInfo.isPlayingAd) {
            return getCurrentPosition();
        }
        return this.playerInfo.sessionPositionInfo.positionInfo.contentPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentBufferedPosition() {
        return this.playerInfo.sessionPositionInfo.contentBufferedPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isPlayingAd() {
        return this.playerInfo.sessionPositionInfo.isPlayingAd;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentAdGroupIndex() {
        return this.playerInfo.sessionPositionInfo.positionInfo.adGroupIndex;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentAdIndexInAdGroup() {
        return this.playerInfo.sessionPositionInfo.positionInfo.adIndexInAdGroup;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaybackParameters(final androidx.media3.common.PlaybackParameters playbackParameters) {
        if (isPlayerCommandAvailable(13)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda30
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m302x7ad849fa(playbackParameters, iMediaSession, i);
                }
            });
            if (this.playerInfo.playbackParameters.equals(playbackParameters)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithPlaybackParameters(playbackParameters);
            this.listeners.queueEvent(12, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda32
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackParametersChanged(playbackParameters);
                }
            });
            this.listeners.flushEvents();
        }
    }

    /* JADX INFO: renamed from: lambda$setPlaybackParameters$15$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m302x7ad849fa(androidx.media3.common.PlaybackParameters playbackParameters, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setPlaybackParameters(this.controllerStub, i, playbackParameters.toBundle());
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.playerInfo.playbackParameters;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaybackSpeed(final float f) {
        if (isPlayerCommandAvailable(13)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda98
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m303x786a6f3f(f, iMediaSession, i);
                }
            });
            if (this.playerInfo.playbackParameters.speed != f) {
                final androidx.media3.common.PlaybackParameters playbackParametersWithSpeed = this.playerInfo.playbackParameters.withSpeed(f);
                this.playerInfo = this.playerInfo.copyWithPlaybackParameters(playbackParametersWithSpeed);
                this.listeners.queueEvent(12, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda99
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((androidx.media3.common.Player.Listener) obj).onPlaybackParametersChanged(playbackParametersWithSpeed);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setPlaybackSpeed$17$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m303x786a6f3f(float f, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setPlaybackSpeed(this.controllerStub, i, f);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        return this.playerInfo.audioAttributes;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> setRating(final java.lang.String str, final androidx.media3.common.Rating rating) {
        return dispatchRemoteSessionTaskWithSessionCommand(androidx.media3.session.SessionCommand.COMMAND_CODE_SESSION_SET_RATING, new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda0
            @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
            public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                this.f$0.m305x577a1446(str, rating, iMediaSession, i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setRating$19$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m305x577a1446(java.lang.String str, androidx.media3.common.Rating rating, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setRatingWithMediaId(this.controllerStub, i, str, rating.toBundle());
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> setRating(final androidx.media3.common.Rating rating) {
        return dispatchRemoteSessionTaskWithSessionCommand(androidx.media3.session.SessionCommand.COMMAND_CODE_SESSION_SET_RATING, new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda107
            @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
            public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                this.f$0.m306x4d4d505c(rating, iMediaSession, i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setRating$20$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m306x4d4d505c(androidx.media3.common.Rating rating, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setRating(this.controllerStub, i, rating.toBundle());
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> sendCustomCommand(final androidx.media3.session.SessionCommand sessionCommand, final android.os.Bundle bundle) {
        return dispatchRemoteSessionTaskWithSessionCommand(sessionCommand, new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda94
            @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
            public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                this.f$0.m284xbdee5b2a(sessionCommand, bundle, iMediaSession, i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$sendCustomCommand$21$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m284xbdee5b2a(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.onCustomCommand(this.controllerStub, i, sessionCommand.toBundle(), bundle);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public android.app.PendingIntent getSessionActivity() {
        return this.sessionActivity;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> getCustomLayout() {
        return this.customLayoutWithUnavailableButtonsDisabled;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public android.os.Bundle getSessionExtras() {
        return this.sessionExtras;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.Timeline getCurrentTimeline() {
        return this.playerInfo.timeline;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(final androidx.media3.common.MediaItem mediaItem) {
        if (isPlayerCommandAvailable(31)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda114
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m295x9063a1ce(mediaItem, iMediaSession, i);
                }
            });
            setMediaItemsInternal(java.util.Collections.singletonList(mediaItem), -1, androidx.media3.common.C.TIME_UNSET, true);
        }
    }

    /* JADX INFO: renamed from: lambda$setMediaItem$22$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m295x9063a1ce(androidx.media3.common.MediaItem mediaItem, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setMediaItem(this.controllerStub, i, mediaItem.toBundleIncludeLocalConfiguration());
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(final androidx.media3.common.MediaItem mediaItem, final long j) {
        if (isPlayerCommandAvailable(31)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda85
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m296x8fed3bcf(mediaItem, j, iMediaSession, i);
                }
            });
            setMediaItemsInternal(java.util.Collections.singletonList(mediaItem), -1, j, false);
        }
    }

    /* JADX INFO: renamed from: lambda$setMediaItem$23$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m296x8fed3bcf(androidx.media3.common.MediaItem mediaItem, long j, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setMediaItemWithStartPosition(this.controllerStub, i, mediaItem.toBundleIncludeLocalConfiguration(), j);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(final androidx.media3.common.MediaItem mediaItem, final boolean z) {
        if (isPlayerCommandAvailable(31)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda110
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m297x8f76d5d0(mediaItem, z, iMediaSession, i);
                }
            });
            setMediaItemsInternal(java.util.Collections.singletonList(mediaItem), -1, androidx.media3.common.C.TIME_UNSET, z);
        }
    }

    /* JADX INFO: renamed from: lambda$setMediaItem$24$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m297x8f76d5d0(androidx.media3.common.MediaItem mediaItem, boolean z, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setMediaItemWithResetPosition(this.controllerStub, i, mediaItem.toBundleIncludeLocalConfiguration(), z);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(final java.util.List<androidx.media3.common.MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda95
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m298x501359e2(list, iMediaSession, i);
                }
            });
            setMediaItemsInternal(list, -1, androidx.media3.common.C.TIME_UNSET, true);
        }
    }

    /* JADX INFO: renamed from: lambda$setMediaItems$25$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m298x501359e2(java.util.List list, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setMediaItems(this.controllerStub, i, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda42())));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(final java.util.List<androidx.media3.common.MediaItem> list, final boolean z) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda47
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m299x4f9cf3e3(list, z, iMediaSession, i);
                }
            });
            setMediaItemsInternal(list, -1, androidx.media3.common.C.TIME_UNSET, z);
        }
    }

    /* JADX INFO: renamed from: lambda$setMediaItems$26$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m299x4f9cf3e3(java.util.List list, boolean z, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setMediaItemsWithResetPosition(this.controllerStub, i, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda42())), z);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(final java.util.List<androidx.media3.common.MediaItem> list, final int i, final long j) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda31
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m300x4f268de4(list, i, j, iMediaSession, i2);
                }
            });
            setMediaItemsInternal(list, i, j, false);
        }
    }

    /* JADX INFO: renamed from: lambda$setMediaItems$27$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m300x4f268de4(java.util.List list, int i, long j, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.setMediaItemsWithStartIndex(this.controllerStub, i2, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda42())), i, j);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaylistMetadata(final androidx.media3.common.MediaMetadata mediaMetadata) {
        if (isPlayerCommandAvailable(19)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda16
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m304x8d147ea0(mediaMetadata, iMediaSession, i);
                }
            });
            if (this.playerInfo.playlistMetadata.equals(mediaMetadata)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithPlaylistMetadata(mediaMetadata);
            this.listeners.queueEvent(15, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda17
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaylistMetadataChanged(mediaMetadata);
                }
            });
            this.listeners.flushEvents();
        }
    }

    /* JADX INFO: renamed from: lambda$setPlaylistMetadata$28$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m304x8d147ea0(androidx.media3.common.MediaMetadata mediaMetadata, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setPlaylistMetadata(this.controllerStub, i, mediaMetadata.toBundle());
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        return this.playerInfo.playlistMetadata;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItem(final androidx.media3.common.MediaItem mediaItem) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda105
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m237x274a4faa(mediaItem, iMediaSession, i);
                }
            });
            addMediaItemsInternal(getCurrentTimeline().getWindowCount(), java.util.Collections.singletonList(mediaItem));
        }
    }

    /* JADX INFO: renamed from: lambda$addMediaItem$30$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m237x274a4faa(androidx.media3.common.MediaItem mediaItem, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.addMediaItem(this.controllerStub, i, mediaItem.toBundleIncludeLocalConfiguration());
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItem(final int i, final androidx.media3.common.MediaItem mediaItem) {
        if (isPlayerCommandAvailable(20)) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda36
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m238x26d3e9ab(i, mediaItem, iMediaSession, i2);
                }
            });
            addMediaItemsInternal(i, java.util.Collections.singletonList(mediaItem));
        }
    }

    /* JADX INFO: renamed from: lambda$addMediaItem$31$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m238x26d3e9ab(int i, androidx.media3.common.MediaItem mediaItem, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.addMediaItemWithIndex(this.controllerStub, i2, i, mediaItem.toBundleIncludeLocalConfiguration());
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItems(final java.util.List<androidx.media3.common.MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda100
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m239x28d76e1f(list, iMediaSession, i);
                }
            });
            addMediaItemsInternal(getCurrentTimeline().getWindowCount(), list);
        }
    }

    /* JADX INFO: renamed from: lambda$addMediaItems$32$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m239x28d76e1f(java.util.List list, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.addMediaItems(this.controllerStub, i, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda42())));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItems(final int i, final java.util.List<androidx.media3.common.MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda22
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m240x28610820(i, list, iMediaSession, i2);
                }
            });
            addMediaItemsInternal(i, list);
        }
    }

    /* JADX INFO: renamed from: lambda$addMediaItems$33$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m240x28610820(int i, java.util.List list, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.addMediaItemsWithIndex(this.controllerStub, i2, i, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda42())));
    }

    private void addMediaItemsInternal(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.playerInfo.timeline.isEmpty()) {
            setMediaItemsInternal(list, -1, androidx.media3.common.C.TIME_UNSET, false);
        } else {
            updatePlayerInfo(maskPlayerInfoForAddedItems(this.playerInfo, java.lang.Math.min(i, this.playerInfo.timeline.getWindowCount()), list, getCurrentPosition(), getContentPosition()), 0, null, null, this.playerInfo.timeline.isEmpty() ? 3 : null);
        }
    }

    private static androidx.media3.session.PlayerInfo maskPlayerInfoForAddedItems(androidx.media3.session.PlayerInfo playerInfo, int i, java.util.List<androidx.media3.common.MediaItem> list, long j, long j2) {
        int size;
        int size2;
        androidx.media3.common.Timeline timeline = playerInfo.timeline;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < timeline.getWindowCount(); i3++) {
            arrayList.add(timeline.getWindow(i3, new androidx.media3.common.Timeline.Window()));
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            arrayList.add(i4 + i, createNewWindow(list.get(i4)));
        }
        rebuildPeriods(timeline, arrayList, arrayList2);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline(arrayList, arrayList2);
        if (playerInfo.timeline.isEmpty()) {
            size = 0;
        } else {
            if (playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex >= i) {
                size = playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex + list.size();
            } else {
                size = playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
            }
            if (playerInfo.sessionPositionInfo.positionInfo.periodIndex >= i) {
                size2 = playerInfo.sessionPositionInfo.positionInfo.periodIndex + list.size();
            } else {
                size2 = playerInfo.sessionPositionInfo.positionInfo.periodIndex;
            }
            i2 = size2;
        }
        return maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, size, i2, j, j2, 5);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeMediaItem(final int i) {
        if (isPlayerCommandAvailable(20)) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda10
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m269xcb8143eb(i, iMediaSession, i2);
                }
            });
            removeMediaItemsInternal(i, i + 1);
        }
    }

    /* JADX INFO: renamed from: lambda$removeMediaItem$34$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m269xcb8143eb(int i, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.removeMediaItem(this.controllerStub, i2, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeMediaItems(final int i, final int i2) {
        if (isPlayerCommandAvailable(20)) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i2 >= i);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda8
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
                    this.f$0.m270x43753785(i, i2, iMediaSession, i3);
                }
            });
            removeMediaItemsInternal(i, i2);
        }
    }

    /* JADX INFO: renamed from: lambda$removeMediaItems$35$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m270x43753785(int i, int i2, androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
        iMediaSession.removeMediaItems(this.controllerStub, i3, i, i2);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearMediaItems() {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda43
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m241x7e2b5cb7(iMediaSession, i);
                }
            });
            removeMediaItemsInternal(0, Integer.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: lambda$clearMediaItems$36$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m241x7e2b5cb7(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.clearMediaItems(this.controllerStub, i);
    }

    private void removeMediaItemsInternal(int i, int i2) {
        int windowCount = this.playerInfo.timeline.getWindowCount();
        int iMin = java.lang.Math.min(i2, windowCount);
        if (i >= windowCount || i == iMin || windowCount == 0) {
            return;
        }
        boolean z = getCurrentMediaItemIndex() >= i && getCurrentMediaItemIndex() < iMin;
        updatePlayerInfo(maskPlayerInfoForRemovedItems(this.playerInfo, i, iMin, false, getCurrentPosition(), getContentPosition()), 0, null, z ? 4 : null, this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex >= i && this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex < iMin ? 3 : null);
    }

    private static androidx.media3.session.PlayerInfo maskPlayerInfoForRemovedItems(androidx.media3.session.PlayerInfo playerInfo, int i, int i2, boolean z, long j, long j2) {
        int i3;
        int newPeriodIndexWithoutRemovedPeriods;
        int i4;
        int i5;
        androidx.media3.session.PlayerInfo playerInfoMaskTimelineAndPositionInfo;
        androidx.media3.common.Timeline timeline = playerInfo.timeline;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i6 = 0; i6 < timeline.getWindowCount(); i6++) {
            if (i6 < i || i6 >= i2) {
                arrayList.add(timeline.getWindow(i6, new androidx.media3.common.Timeline.Window()));
            }
        }
        rebuildPeriods(timeline, arrayList, arrayList2);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline(arrayList, arrayList2);
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(playerInfo);
        int i7 = playerInfo.sessionPositionInfo.positionInfo.periodIndex;
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        boolean z2 = currentMediaItemIndexInternal >= i && currentMediaItemIndexInternal < i2;
        if (timelineCreateMaskingTimeline.isEmpty()) {
            i4 = -1;
            i3 = -1;
            newPeriodIndexWithoutRemovedPeriods = 0;
        } else if (z2) {
            i3 = -1;
            int iResolveSubsequentMediaItemIndex = resolveSubsequentMediaItemIndex(playerInfo.repeatMode, playerInfo.shuffleModeEnabled, currentMediaItemIndexInternal, timeline, i, i2);
            if (iResolveSubsequentMediaItemIndex == -1) {
                iResolveSubsequentMediaItemIndex = timelineCreateMaskingTimeline.getFirstWindowIndex(playerInfo.shuffleModeEnabled);
            } else if (iResolveSubsequentMediaItemIndex >= i2) {
                iResolveSubsequentMediaItemIndex -= i2 - i;
            }
            newPeriodIndexWithoutRemovedPeriods = timelineCreateMaskingTimeline.getWindow(iResolveSubsequentMediaItemIndex, window).firstPeriodIndex;
            i4 = iResolveSubsequentMediaItemIndex;
        } else {
            i3 = -1;
            if (currentMediaItemIndexInternal >= i2) {
                i4 = currentMediaItemIndexInternal - (i2 - i);
                newPeriodIndexWithoutRemovedPeriods = getNewPeriodIndexWithoutRemovedPeriods(timeline, i7, i, i2);
            } else {
                newPeriodIndexWithoutRemovedPeriods = i7;
                i4 = currentMediaItemIndexInternal;
            }
        }
        if (!z2) {
            i5 = 4;
            playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, i4, newPeriodIndexWithoutRemovedPeriods, j, j2, 4);
        } else if (i4 == i3) {
            playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO, androidx.media3.session.SessionPositionInfo.DEFAULT, 4);
            i5 = 4;
        } else if (z) {
            i5 = 4;
            playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, i4, newPeriodIndexWithoutRemovedPeriods, j, j2, 4);
        } else {
            i5 = 4;
            androidx.media3.common.Timeline.Window window2 = timelineCreateMaskingTimeline.getWindow(i4, new androidx.media3.common.Timeline.Window());
            long defaultPositionMs = window2.getDefaultPositionMs();
            long durationMs = window2.getDurationMs();
            androidx.media3.common.Player.PositionInfo positionInfo = new androidx.media3.common.Player.PositionInfo(null, i4, window2.mediaItem, null, newPeriodIndexWithoutRemovedPeriods, defaultPositionMs, defaultPositionMs, -1, -1);
            playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, positionInfo, new androidx.media3.session.SessionPositionInfo(positionInfo, false, android.os.SystemClock.elapsedRealtime(), durationMs, defaultPositionMs, androidx.media3.session.MediaUtils.calculateBufferedPercentage(defaultPositionMs, durationMs), 0L, androidx.media3.common.C.TIME_UNSET, durationMs, defaultPositionMs), 4);
        }
        return playerInfoMaskTimelineAndPositionInfo.playbackState != 1 && playerInfoMaskTimelineAndPositionInfo.playbackState != i5 && i < i2 && i2 == timeline.getWindowCount() && currentMediaItemIndexInternal >= i ? playerInfoMaskTimelineAndPositionInfo.copyWithPlaybackState(i5, null) : playerInfoMaskTimelineAndPositionInfo;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void moveMediaItem(final int i, final int i2) {
        if (isPlayerCommandAvailable(20)) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i2 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda48
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
                    this.f$0.m251x94a376fb(i, i2, iMediaSession, i3);
                }
            });
            moveMediaItemsInternal(i, i + 1, i2);
        }
    }

    /* JADX INFO: renamed from: lambda$moveMediaItem$37$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m251x94a376fb(int i, int i2, androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
        iMediaSession.moveMediaItem(this.controllerStub, i3, i, i2);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void moveMediaItems(final int i, final int i2, final int i3) {
        if (isPlayerCommandAvailable(20)) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= i2 && i3 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda38
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i4) throws android.os.RemoteException {
                    this.f$0.m252xc839421b(i, i2, i3, iMediaSession, i4);
                }
            });
            moveMediaItemsInternal(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: lambda$moveMediaItems$38$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m252xc839421b(int i, int i2, int i3, androidx.media3.session.IMediaSession iMediaSession, int i4) throws android.os.RemoteException {
        iMediaSession.moveMediaItems(this.controllerStub, i4, i, i2, i3);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void replaceMediaItem(final int i, final androidx.media3.common.MediaItem mediaItem) {
        if (isPlayerCommandAvailable(20)) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda108
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m271x2a7593c6(i, mediaItem, iMediaSession, i2);
                }
            });
            replaceMediaItemsInternal(i, i + 1, com.google.common.collect.ImmutableList.of(mediaItem));
        }
    }

    /* JADX INFO: renamed from: lambda$replaceMediaItem$39$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m271x2a7593c6(int i, androidx.media3.common.MediaItem mediaItem, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        if (((androidx.media3.session.SessionToken) androidx.media3.common.util.Assertions.checkNotNull(this.connectedToken)).getInterfaceVersion() >= 2) {
            iMediaSession.replaceMediaItem(this.controllerStub, i2, i, mediaItem.toBundleIncludeLocalConfiguration());
        } else {
            iMediaSession.addMediaItemWithIndex(this.controllerStub, i2, i + 1, mediaItem.toBundleIncludeLocalConfiguration());
            iMediaSession.removeMediaItem(this.controllerStub, i2, i);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void replaceMediaItems(final int i, final int i2, final java.util.List<androidx.media3.common.MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= i2);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda37
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
                    this.f$0.m272xfeb44889(list, i, i2, iMediaSession, i3);
                }
            });
            replaceMediaItemsInternal(i, i2, list);
        }
    }

    /* JADX INFO: renamed from: lambda$replaceMediaItems$40$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m272xfeb44889(java.util.List list, int i, int i2, androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
        androidx.media3.common.BundleListRetriever bundleListRetriever = new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda42()));
        if (((androidx.media3.session.SessionToken) androidx.media3.common.util.Assertions.checkNotNull(this.connectedToken)).getInterfaceVersion() >= 2) {
            iMediaSession.replaceMediaItems(this.controllerStub, i3, i, i2, bundleListRetriever);
        } else {
            iMediaSession.addMediaItemsWithIndex(this.controllerStub, i3, i2, bundleListRetriever);
            iMediaSession.removeMediaItems(this.controllerStub, i3, i, i2);
        }
    }

    private void replaceMediaItemsInternal(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        int windowCount = this.playerInfo.timeline.getWindowCount();
        if (i > windowCount) {
            return;
        }
        if (this.playerInfo.timeline.isEmpty()) {
            setMediaItemsInternal(list, -1, androidx.media3.common.C.TIME_UNSET, false);
            return;
        }
        int iMin = java.lang.Math.min(i2, windowCount);
        androidx.media3.session.PlayerInfo playerInfoMaskPlayerInfoForRemovedItems = maskPlayerInfoForRemovedItems(maskPlayerInfoForAddedItems(this.playerInfo, iMin, list, getCurrentPosition(), getContentPosition()), i, iMin, true, getCurrentPosition(), getContentPosition());
        boolean z = this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex >= i && this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex < iMin;
        updatePlayerInfo(playerInfoMaskPlayerInfoForRemovedItems, 0, null, z ? 4 : null, z ? 3 : null);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentPeriodIndex() {
        return this.playerInfo.sessionPositionInfo.positionInfo.periodIndex;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentMediaItemIndex() {
        return getCurrentMediaItemIndexInternal(this.playerInfo);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPreviousMediaItemIndex() {
        if (this.playerInfo.timeline.isEmpty()) {
            return -1;
        }
        return this.playerInfo.timeline.getPreviousWindowIndex(getCurrentMediaItemIndex(), convertRepeatModeForNavigation(this.playerInfo.repeatMode), this.playerInfo.shuffleModeEnabled);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getNextMediaItemIndex() {
        if (this.playerInfo.timeline.isEmpty()) {
            return -1;
        }
        return this.playerInfo.timeline.getNextWindowIndex(getCurrentMediaItemIndex(), convertRepeatModeForNavigation(this.playerInfo.repeatMode), this.playerInfo.shuffleModeEnabled);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToPreviousMediaItem() {
        if (isPlayerCommandAvailable(6)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda41
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m282xb9ec60ad(iMediaSession, i);
                }
            });
            if (getPreviousMediaItemIndex() != -1) {
                seekToInternal(getPreviousMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$seekToPreviousMediaItem$41$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m282xb9ec60ad(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.seekToPreviousMediaItem(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToNextMediaItem() {
        if (isPlayerCommandAvailable(8)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda54
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m280x391820aa(iMediaSession, i);
                }
            });
            if (getNextMediaItemIndex() != -1) {
                seekToInternal(getNextMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$seekToNextMediaItem$42$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m280x391820aa(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.seekToNextMediaItem(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToPrevious() {
        if (isPlayerCommandAvailable(7)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda104
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m281x5c7914d8(iMediaSession, i);
                }
            });
            androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
            if (currentTimeline.isEmpty() || isPlayingAd()) {
                return;
            }
            boolean zHasPreviousMediaItem = hasPreviousMediaItem();
            androidx.media3.common.Timeline.Window window = currentTimeline.getWindow(getCurrentMediaItemIndex(), new androidx.media3.common.Timeline.Window());
            if (window.isDynamic && window.isLive()) {
                if (zHasPreviousMediaItem) {
                    seekToInternal(getPreviousMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
                }
            } else if (zHasPreviousMediaItem && getCurrentPosition() <= getMaxSeekToPreviousPosition()) {
                seekToInternal(getPreviousMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
            } else {
                seekToInternal(getCurrentMediaItemIndex(), 0L);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$seekToPrevious$43$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m281x5c7914d8(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.seekToPrevious(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getMaxSeekToPreviousPosition() {
        return this.playerInfo.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToNext() {
        if (isPlayerCommandAvailable(9)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda19
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m279x194a9d5d(iMediaSession, i);
                }
            });
            androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
            if (currentTimeline.isEmpty() || isPlayingAd()) {
                return;
            }
            if (hasNextMediaItem()) {
                seekToInternal(getNextMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
                return;
            }
            androidx.media3.common.Timeline.Window window = currentTimeline.getWindow(getCurrentMediaItemIndex(), new androidx.media3.common.Timeline.Window());
            if (window.isDynamic && window.isLive()) {
                seekToInternal(getCurrentMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$seekToNext$44$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m279x194a9d5d(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.seekToNext(this.controllerStub, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getRepeatMode() {
        return this.playerInfo.repeatMode;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setRepeatMode(final int i) {
        if (isPlayerCommandAvailable(15)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda26
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m307xe0f5373e(i, iMediaSession, i2);
                }
            });
            if (this.playerInfo.repeatMode != i) {
                this.playerInfo = this.playerInfo.copyWithRepeatMode(i);
                this.listeners.queueEvent(8, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda27
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((androidx.media3.common.Player.Listener) obj).onRepeatModeChanged(i);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setRepeatMode$45$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m307xe0f5373e(int i, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.setRepeatMode(this.controllerStub, i2, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean getShuffleModeEnabled() {
        return this.playerInfo.shuffleModeEnabled;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setShuffleModeEnabled(final boolean z) {
        if (isPlayerCommandAvailable(14)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda12
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m308x9eb3c759(z, iMediaSession, i);
                }
            });
            if (this.playerInfo.shuffleModeEnabled != z) {
                this.playerInfo = this.playerInfo.copyWithShuffleModeEnabled(z);
                this.listeners.queueEvent(9, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda13
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((androidx.media3.common.Player.Listener) obj).onShuffleModeEnabledChanged(z);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setShuffleModeEnabled$47$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m308x9eb3c759(boolean z, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setShuffleModeEnabled(this.controllerStub, i, z);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.text.CueGroup getCurrentCues() {
        return this.playerInfo.cueGroup;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public float getVolume() {
        return this.playerInfo.volume;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVolume(final float f) {
        if (isPlayerCommandAvailable(24)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda33
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m315xd97b1206(f, iMediaSession, i);
                }
            });
            if (this.playerInfo.volume != f) {
                this.playerInfo = this.playerInfo.copyWithVolume(f);
                this.listeners.queueEvent(22, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda34
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((androidx.media3.common.Player.Listener) obj).onVolumeChanged(f);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setVolume$49$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m315xd97b1206(float f, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setVolume(this.controllerStub, i, f);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.DeviceInfo getDeviceInfo() {
        return this.playerInfo.deviceInfo;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getDeviceVolume() {
        return this.playerInfo.deviceVolume;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isDeviceMuted() {
        return this.playerInfo.deviceMuted;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void setDeviceVolume(final int i) {
        if (isPlayerCommandAvailable(25)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda20
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m290x4638e627(i, iMediaSession, i2);
                }
            });
            androidx.media3.common.DeviceInfo deviceInfo = getDeviceInfo();
            if (this.playerInfo.deviceVolume == i || deviceInfo.minVolume > i) {
                return;
            }
            if (deviceInfo.maxVolume == 0 || i <= deviceInfo.maxVolume) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda21
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        this.f$0.m291x45c28028(i, (androidx.media3.common.Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setDeviceVolume$51$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m290x4638e627(int i, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.setDeviceVolume(this.controllerStub, i2, i);
    }

    /* JADX INFO: renamed from: lambda$setDeviceVolume$52$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m291x45c28028(int i, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setDeviceVolume(final int i, final int i2) {
        if (isPlayerCommandAvailable(33)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda4
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
                    this.f$0.m292x454c1a29(i, i2, iMediaSession, i3);
                }
            });
            androidx.media3.common.DeviceInfo deviceInfo = getDeviceInfo();
            if (this.playerInfo.deviceVolume == i || deviceInfo.minVolume > i) {
                return;
            }
            if (deviceInfo.maxVolume == 0 || i <= deviceInfo.maxVolume) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda5
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        this.f$0.m293x44d5b42a(i, (androidx.media3.common.Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setDeviceVolume$53$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m292x454c1a29(int i, int i2, androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
        iMediaSession.setDeviceVolumeWithFlags(this.controllerStub, i3, i, i2);
    }

    /* JADX INFO: renamed from: lambda$setDeviceVolume$54$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m293x44d5b42a(int i, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void increaseDeviceVolume() {
        if (isPlayerCommandAvailable(26)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda101
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m247x83ebc271(iMediaSession, i);
                }
            });
            final int i = this.playerInfo.deviceVolume + 1;
            int i2 = getDeviceInfo().maxVolume;
            if (i2 == 0 || i <= i2) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda102
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        this.f$0.m248x83755c72(i, (androidx.media3.common.Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$increaseDeviceVolume$55$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m247x83ebc271(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.increaseDeviceVolume(this.controllerStub, i);
    }

    /* JADX INFO: renamed from: lambda$increaseDeviceVolume$56$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m248x83755c72(int i, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void increaseDeviceVolume(final int i) {
        if (isPlayerCommandAvailable(34)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda115
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m249x82fef673(i, iMediaSession, i2);
                }
            });
            final int i2 = this.playerInfo.deviceVolume + 1;
            int i3 = getDeviceInfo().maxVolume;
            if (i3 == 0 || i2 <= i3) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i2, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda116
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        this.f$0.m250x82889074(i2, (androidx.media3.common.Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$increaseDeviceVolume$57$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m249x82fef673(int i, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.increaseDeviceVolumeWithFlags(this.controllerStub, i2, i);
    }

    /* JADX INFO: renamed from: lambda$increaseDeviceVolume$58$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m250x82889074(int i, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void decreaseDeviceVolume() {
        if (isPlayerCommandAvailable(26)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda23
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m243x12544499(iMediaSession, i);
                }
            });
            final int i = this.playerInfo.deviceVolume - 1;
            if (i >= getDeviceInfo().minVolume) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda24
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        this.f$0.m244x82780af(i, (androidx.media3.common.Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$decreaseDeviceVolume$59$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m243x12544499(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.decreaseDeviceVolume(this.controllerStub, i);
    }

    /* JADX INFO: renamed from: lambda$decreaseDeviceVolume$60$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m244x82780af(int i, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void decreaseDeviceVolume(final int i) {
        if (isPlayerCommandAvailable(34)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda118
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m245x7b11ab0(i, iMediaSession, i2);
                }
            });
            final int i2 = this.playerInfo.deviceVolume - 1;
            if (i2 >= getDeviceInfo().minVolume) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i2, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda11
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        this.f$0.m246x73ab4b1(i2, (androidx.media3.common.Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$decreaseDeviceVolume$61$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m245x7b11ab0(int i, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.decreaseDeviceVolumeWithFlags(this.controllerStub, i2, i);
    }

    /* JADX INFO: renamed from: lambda$decreaseDeviceVolume$62$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m246x73ab4b1(int i, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void setDeviceMuted(final boolean z) {
        if (isPlayerCommandAvailable(26)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda39
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m286x98e70aad(z, iMediaSession, i);
                }
            });
            if (this.playerInfo.deviceMuted != z) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(playerInfo.deviceVolume, z);
                this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda40
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        this.f$0.m287x9870a4ae(z, (androidx.media3.common.Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setDeviceMuted$63$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m286x98e70aad(boolean z, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setDeviceMuted(this.controllerStub, i, z);
    }

    /* JADX INFO: renamed from: lambda$setDeviceMuted$64$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m287x9870a4ae(boolean z, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(this.playerInfo.deviceVolume, z);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setDeviceMuted(final boolean z, final int i) {
        if (isPlayerCommandAvailable(34)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda63
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
                    this.f$0.m288x97fa3eaf(z, i, iMediaSession, i2);
                }
            });
            if (this.playerInfo.deviceMuted != z) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(playerInfo.deviceVolume, z);
                this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda74
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        this.f$0.m289x9783d8b0(z, (androidx.media3.common.Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setDeviceMuted$65$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m288x97fa3eaf(boolean z, int i, androidx.media3.session.IMediaSession iMediaSession, int i2) throws android.os.RemoteException {
        iMediaSession.setDeviceMutedWithFlags(this.controllerStub, i2, z, i);
    }

    /* JADX INFO: renamed from: lambda$setDeviceMuted$66$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m289x9783d8b0(boolean z, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(this.playerInfo.deviceVolume, z);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setAudioAttributes(final androidx.media3.common.AudioAttributes audioAttributes, final boolean z) {
        if (isPlayerCommandAvailable(35)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda6
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m285xd2c92c19(audioAttributes, z, iMediaSession, i);
                }
            });
            if (this.playerInfo.audioAttributes.equals(audioAttributes)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithAudioAttributes(audioAttributes);
            this.listeners.queueEvent(20, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda7
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onAudioAttributesChanged(audioAttributes);
                }
            });
            this.listeners.flushEvents();
        }
    }

    /* JADX INFO: renamed from: lambda$setAudioAttributes$67$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m285xd2c92c19(androidx.media3.common.AudioAttributes audioAttributes, boolean z, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setAudioAttributes(this.controllerStub, i, audioAttributes.toBundle(), z);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.VideoSize getVideoSize() {
        return this.playerInfo.videoSize;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.util.Size getSurfaceSize() {
        return this.surfaceSize;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurface() {
        if (isPlayerCommandAvailable(27)) {
            clearSurfacesAndCallbacks();
            dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda88
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m242xf1aa0fe1(iMediaSession, i);
                }
            });
            maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    /* JADX INFO: renamed from: lambda$clearVideoSurface$69$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m242xf1aa0fe1(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, null);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurface(android.view.Surface surface) {
        if (isPlayerCommandAvailable(27) && surface != null && this.videoSurface == surface) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurface(final android.view.Surface surface) {
        if (isPlayerCommandAvailable(27)) {
            clearSurfacesAndCallbacks();
            this.videoSurface = surface;
            dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda89
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m310x50be6282(surface, iMediaSession, i);
                }
            });
            int i = surface == null ? 0 : -1;
            maybeNotifySurfaceSizeChanged(i, i);
        }
    }

    /* JADX INFO: renamed from: lambda$setVideoSurface$70$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m310x50be6282(android.view.Surface surface, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, surface);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        if (isPlayerCommandAvailable(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
                return;
            }
            if (this.videoSurfaceHolder == surfaceHolder) {
                return;
            }
            clearSurfacesAndCallbacks();
            this.videoSurfaceHolder = surfaceHolder;
            surfaceHolder.addCallback(this.surfaceCallback);
            final android.view.Surface surface = surfaceHolder.getSurface();
            if (surface != null && surface.isValid()) {
                this.videoSurface = surface;
                dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda2
                    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                    public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                        this.f$0.m311x96618c77(surface, iMediaSession, i);
                    }
                });
                android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
                return;
            }
            this.videoSurface = null;
            dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda3
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m312x95eb2678(iMediaSession, i);
                }
            });
            maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    /* JADX INFO: renamed from: lambda$setVideoSurfaceHolder$71$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m311x96618c77(android.view.Surface surface, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, surface);
    }

    /* JADX INFO: renamed from: lambda$setVideoSurfaceHolder$72$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m312x95eb2678(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, null);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        if (isPlayerCommandAvailable(27) && surfaceHolder != null && this.videoSurfaceHolder == surfaceHolder) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        if (isPlayerCommandAvailable(27)) {
            setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        if (isPlayerCommandAvailable(27)) {
            clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoTextureView(android.view.TextureView textureView) {
        if (isPlayerCommandAvailable(27)) {
            if (textureView == null) {
                clearVideoSurface();
                return;
            }
            if (this.videoTextureView == textureView) {
                return;
            }
            clearSurfacesAndCallbacks();
            this.videoTextureView = textureView;
            textureView.setSurfaceTextureListener(this.surfaceCallback);
            android.graphics.SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda14
                    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                    public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                        this.f$0.m313x1d29f4f2(iMediaSession, i);
                    }
                });
                maybeNotifySurfaceSizeChanged(0, 0);
            } else {
                this.videoSurface = new android.view.Surface(surfaceTexture);
                dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda15
                    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                    public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                        this.f$0.m314x1cb38ef3(iMediaSession, i);
                    }
                });
                maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setVideoTextureView$73$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m313x1d29f4f2(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, null);
    }

    /* JADX INFO: renamed from: lambda$setVideoTextureView$74$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m314x1cb38ef3(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, this.videoSurface);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoTextureView(android.view.TextureView textureView) {
        if (isPlayerCommandAvailable(27) && textureView != null && this.videoTextureView == textureView) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.MediaMetadata getMediaMetadata() {
        return this.playerInfo.mediaMetadata;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.Player.Commands getAvailableCommands() {
        return this.intersectedPlayerCommands;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.Tracks getCurrentTracks() {
        return this.playerInfo.currentTracks;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        return this.playerInfo.trackSelectionParameters;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setTrackSelectionParameters(final androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        if (isPlayerCommandAvailable(29)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda28
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m309xd4d571ce(trackSelectionParameters, iMediaSession, i);
                }
            });
            if (trackSelectionParameters != this.playerInfo.trackSelectionParameters) {
                this.playerInfo = this.playerInfo.copyWithTrackSelectionParameters(trackSelectionParameters);
                this.listeners.queueEvent(19, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda29
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((androidx.media3.common.Player.Listener) obj).onTrackSelectionParametersChanged(trackSelectionParameters);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setTrackSelectionParameters$75$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m309xd4d571ce(androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
        iMediaSession.setTrackSelectionParameters(this.controllerStub, i, trackSelectionParameters.toBundle());
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.SessionCommands getAvailableSessionCommands() {
        return this.sessionCommands;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public android.content.Context getContext() {
        return this.context;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.IMediaController getBinder() {
        return this.controllerStub;
    }

    private static androidx.media3.common.Timeline createMaskingTimeline(java.util.List<androidx.media3.common.Timeline.Window> list, java.util.List<androidx.media3.common.Timeline.Period> list2) {
        return new androidx.media3.common.Timeline.RemotableTimeline(new com.google.common.collect.ImmutableList.Builder().addAll((java.lang.Iterable) list).build(), new com.google.common.collect.ImmutableList.Builder().addAll((java.lang.Iterable) list2).build(), androidx.media3.session.MediaUtils.generateUnshuffledIndices(list.size()));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x0149  */
    /* JADX WARN: Code duplicated, block: B:49:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x0158  */
    /* JADX WARN: Code duplicated, block: B:55:0x0171  */
    /* JADX WARN: Code duplicated, block: B:56:0x0177  */
    /* JADX WARN: Code duplicated, block: B:59:0x0182  */
    /* JADX WARN: Code duplicated, block: B:63:0x018d  */
    private void setMediaItemsInternal(java.util.List<androidx.media3.common.MediaItem> list, int i, long j, boolean z) {
        boolean z2;
        androidx.media3.session.MediaControllerImplBase.PeriodInfo periodInfo;
        androidx.media3.session.SessionPositionInfo sessionPositionInfo;
        androidx.media3.common.Player.PositionInfo positionInfo;
        int i2;
        java.lang.Integer num;
        java.lang.Integer num2;
        long j2;
        long j3;
        long j4;
        long j5;
        int firstWindowIndex = i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(androidx.media3.session.LegacyConversions.convertToWindow(list.get(i3), i3));
            arrayList2.add(androidx.media3.session.LegacyConversions.convertToPeriod(i3));
        }
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline(arrayList, arrayList2);
        if (!timelineCreateMaskingTimeline.isEmpty() && firstWindowIndex >= timelineCreateMaskingTimeline.getWindowCount()) {
            throw new androidx.media3.common.IllegalSeekPositionException(timelineCreateMaskingTimeline, firstWindowIndex, j);
        }
        long j6 = j;
        if (z) {
            firstWindowIndex = timelineCreateMaskingTimeline.getFirstWindowIndex(this.playerInfo.shuffleModeEnabled);
            z2 = false;
        } else {
            if (firstWindowIndex == -1) {
                firstWindowIndex = this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
                j6 = this.playerInfo.sessionPositionInfo.positionInfo.positionMs;
                if (!timelineCreateMaskingTimeline.isEmpty() && firstWindowIndex >= timelineCreateMaskingTimeline.getWindowCount()) {
                    firstWindowIndex = timelineCreateMaskingTimeline.getFirstWindowIndex(this.playerInfo.shuffleModeEnabled);
                    z2 = true;
                }
                periodInfo = getPeriodInfo(timelineCreateMaskingTimeline, firstWindowIndex, j6);
                if (periodInfo == null) {
                    if (j6 == androidx.media3.common.C.TIME_UNSET) {
                        j2 = 0;
                    } else {
                        j2 = j6;
                    }
                    if (j6 == androidx.media3.common.C.TIME_UNSET) {
                        j3 = 0;
                    } else {
                        j3 = j6;
                    }
                    positionInfo = new androidx.media3.common.Player.PositionInfo(null, firstWindowIndex, null, null, firstWindowIndex, j2, j3, -1, -1);
                    long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    if (j6 == androidx.media3.common.C.TIME_UNSET) {
                        j4 = 0;
                    } else {
                        j4 = j6;
                    }
                    if (j6 == androidx.media3.common.C.TIME_UNSET) {
                        j5 = 0;
                    } else {
                        j5 = j6;
                    }
                    sessionPositionInfo = new androidx.media3.session.SessionPositionInfo(positionInfo, false, jElapsedRealtime, androidx.media3.common.C.TIME_UNSET, j4, 0, 0L, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, j5);
                } else {
                    androidx.media3.common.Player.PositionInfo positionInfo2 = new androidx.media3.common.Player.PositionInfo(null, firstWindowIndex, list.get(firstWindowIndex), null, periodInfo.index, androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs), androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs), -1, -1);
                    sessionPositionInfo = new androidx.media3.session.SessionPositionInfo(positionInfo2, false, android.os.SystemClock.elapsedRealtime(), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs), 0, 0L, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs));
                    positionInfo = positionInfo2;
                }
                androidx.media3.session.PlayerInfo playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(this.playerInfo, timelineCreateMaskingTimeline, positionInfo, sessionPositionInfo, 4);
                i2 = playerInfoMaskTimelineAndPositionInfo.playbackState;
                if (firstWindowIndex != -1 && playerInfoMaskTimelineAndPositionInfo.playbackState != 1) {
                    if (!timelineCreateMaskingTimeline.isEmpty() || z2) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                }
                androidx.media3.session.PlayerInfo playerInfoCopyWithPlaybackState = playerInfoMaskTimelineAndPositionInfo.copyWithPlaybackState(i2, this.playerInfo.playerError);
                if (this.playerInfo.timeline.isEmpty()) {
                    num = null;
                } else {
                    num = 4;
                }
                if (this.playerInfo.timeline.isEmpty() || !playerInfoCopyWithPlaybackState.timeline.isEmpty()) {
                    num2 = 3;
                } else {
                    num2 = null;
                }
                updatePlayerInfo(playerInfoCopyWithPlaybackState, 0, null, num, num2);
            }
            z2 = false;
            periodInfo = getPeriodInfo(timelineCreateMaskingTimeline, firstWindowIndex, j6);
            if (periodInfo == null) {
                if (j6 == androidx.media3.common.C.TIME_UNSET) {
                    j2 = 0;
                } else {
                    j2 = j6;
                }
                if (j6 == androidx.media3.common.C.TIME_UNSET) {
                    j3 = 0;
                } else {
                    j3 = j6;
                }
                positionInfo = new androidx.media3.common.Player.PositionInfo(null, firstWindowIndex, null, null, firstWindowIndex, j2, j3, -1, -1);
                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                if (j6 == androidx.media3.common.C.TIME_UNSET) {
                    j4 = 0;
                } else {
                    j4 = j6;
                }
                if (j6 == androidx.media3.common.C.TIME_UNSET) {
                    j5 = 0;
                } else {
                    j5 = j6;
                }
                sessionPositionInfo = new androidx.media3.session.SessionPositionInfo(positionInfo, false, jElapsedRealtime2, androidx.media3.common.C.TIME_UNSET, j4, 0, 0L, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, j5);
            } else {
                androidx.media3.common.Player.PositionInfo positionInfo3 = new androidx.media3.common.Player.PositionInfo(null, firstWindowIndex, list.get(firstWindowIndex), null, periodInfo.index, androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs), androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs), -1, -1);
                sessionPositionInfo = new androidx.media3.session.SessionPositionInfo(positionInfo3, false, android.os.SystemClock.elapsedRealtime(), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs), 0, 0L, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs));
                positionInfo = positionInfo3;
            }
            androidx.media3.session.PlayerInfo playerInfoMaskTimelineAndPositionInfo2 = maskTimelineAndPositionInfo(this.playerInfo, timelineCreateMaskingTimeline, positionInfo, sessionPositionInfo, 4);
            i2 = playerInfoMaskTimelineAndPositionInfo2.playbackState;
            if (firstWindowIndex != -1) {
                if (timelineCreateMaskingTimeline.isEmpty()) {
                    i2 = 4;
                } else {
                    i2 = 4;
                }
            }
            androidx.media3.session.PlayerInfo playerInfoCopyWithPlaybackState2 = playerInfoMaskTimelineAndPositionInfo2.copyWithPlaybackState(i2, this.playerInfo.playerError);
            if (this.playerInfo.timeline.isEmpty()) {
                num = 4;
            } else {
                num = null;
            }
            if (this.playerInfo.timeline.isEmpty()) {
                num2 = 3;
            } else {
                num2 = 3;
            }
            updatePlayerInfo(playerInfoCopyWithPlaybackState2, 0, null, num, num2);
        }
        j6 = -9223372036854775807L;
        periodInfo = getPeriodInfo(timelineCreateMaskingTimeline, firstWindowIndex, j6);
        if (periodInfo == null) {
            if (j6 == androidx.media3.common.C.TIME_UNSET) {
                j2 = 0;
            } else {
                j2 = j6;
            }
            if (j6 == androidx.media3.common.C.TIME_UNSET) {
                j3 = 0;
            } else {
                j3 = j6;
            }
            positionInfo = new androidx.media3.common.Player.PositionInfo(null, firstWindowIndex, null, null, firstWindowIndex, j2, j3, -1, -1);
            long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            if (j6 == androidx.media3.common.C.TIME_UNSET) {
                j4 = 0;
            } else {
                j4 = j6;
            }
            if (j6 == androidx.media3.common.C.TIME_UNSET) {
                j5 = 0;
            } else {
                j5 = j6;
            }
            sessionPositionInfo = new androidx.media3.session.SessionPositionInfo(positionInfo, false, jElapsedRealtime3, androidx.media3.common.C.TIME_UNSET, j4, 0, 0L, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, j5);
        } else {
            androidx.media3.common.Player.PositionInfo positionInfo4 = new androidx.media3.common.Player.PositionInfo(null, firstWindowIndex, list.get(firstWindowIndex), null, periodInfo.index, androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs), androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs), -1, -1);
            sessionPositionInfo = new androidx.media3.session.SessionPositionInfo(positionInfo4, false, android.os.SystemClock.elapsedRealtime(), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs), 0, 0L, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.util.Util.usToMs(periodInfo.periodPositionUs));
            positionInfo = positionInfo4;
        }
        androidx.media3.session.PlayerInfo playerInfoMaskTimelineAndPositionInfo3 = maskTimelineAndPositionInfo(this.playerInfo, timelineCreateMaskingTimeline, positionInfo, sessionPositionInfo, 4);
        i2 = playerInfoMaskTimelineAndPositionInfo3.playbackState;
        if (firstWindowIndex != -1) {
            if (timelineCreateMaskingTimeline.isEmpty()) {
                i2 = 4;
            } else {
                i2 = 4;
            }
        }
        androidx.media3.session.PlayerInfo playerInfoCopyWithPlaybackState3 = playerInfoMaskTimelineAndPositionInfo3.copyWithPlaybackState(i2, this.playerInfo.playerError);
        if (this.playerInfo.timeline.isEmpty()) {
            num = 4;
        } else {
            num = null;
        }
        if (this.playerInfo.timeline.isEmpty()) {
            num2 = 3;
        } else {
            num2 = 3;
        }
        updatePlayerInfo(playerInfoCopyWithPlaybackState3, 0, null, num, num2);
    }

    private void moveMediaItemsInternal(int i, int i2, int i3) {
        int i4;
        int i5;
        androidx.media3.common.Timeline timeline = this.playerInfo.timeline;
        int windowCount = this.playerInfo.timeline.getWindowCount();
        int iMin = java.lang.Math.min(i2, windowCount);
        int i6 = iMin - i;
        int iMin2 = java.lang.Math.min(i3, windowCount - i6);
        if (i >= windowCount || i == iMin || i == iMin2) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i7 = 0; i7 < windowCount; i7++) {
            arrayList.add(timeline.getWindow(i7, new androidx.media3.common.Timeline.Window()));
        }
        androidx.media3.common.util.Util.moveItems(arrayList, i, iMin, iMin2);
        rebuildPeriods(timeline, arrayList, arrayList2);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline(arrayList, arrayList2);
        if (timelineCreateMaskingTimeline.isEmpty()) {
            return;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (currentMediaItemIndex < i || currentMediaItemIndex >= iMin) {
            if (iMin > currentMediaItemIndex || iMin2 <= currentMediaItemIndex) {
                i4 = (iMin <= currentMediaItemIndex || iMin2 > currentMediaItemIndex) ? currentMediaItemIndex : i6 + currentMediaItemIndex;
            } else {
                i5 = currentMediaItemIndex - i6;
            }
            androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
            updatePlayerInfo(maskTimelineAndPositionInfo(this.playerInfo, timelineCreateMaskingTimeline, i4, timelineCreateMaskingTimeline.getWindow(i4, window).firstPeriodIndex + (this.playerInfo.sessionPositionInfo.positionInfo.periodIndex - timeline.getWindow(currentMediaItemIndex, window).firstPeriodIndex), getCurrentPosition(), getContentPosition(), 5), 0, null, null, null);
        }
        i5 = (currentMediaItemIndex - i) + iMin2;
        i4 = i5;
        androidx.media3.common.Timeline.Window window2 = new androidx.media3.common.Timeline.Window();
        updatePlayerInfo(maskTimelineAndPositionInfo(this.playerInfo, timelineCreateMaskingTimeline, i4, timelineCreateMaskingTimeline.getWindow(i4, window2).firstPeriodIndex + (this.playerInfo.sessionPositionInfo.positionInfo.periodIndex - timeline.getWindow(currentMediaItemIndex, window2).firstPeriodIndex), getCurrentPosition(), getContentPosition(), 5), 0, null, null, null);
    }

    private void seekToInternalByOffset(long j) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != androidx.media3.common.C.TIME_UNSET) {
            currentPosition = java.lang.Math.min(currentPosition, duration);
        }
        seekToInternal(getCurrentMediaItemIndex(), java.lang.Math.max(currentPosition, 0L));
    }

    private void seekToInternal(int i, long j) {
        androidx.media3.session.PlayerInfo playerInfoMaskPositionInfo;
        androidx.media3.session.MediaControllerImplBase mediaControllerImplBase = this;
        androidx.media3.common.Timeline timeline = mediaControllerImplBase.playerInfo.timeline;
        if ((timeline.isEmpty() || i < timeline.getWindowCount()) && !isPlayingAd()) {
            int i2 = getPlaybackState() == 1 ? 1 : 2;
            androidx.media3.session.PlayerInfo playerInfo = mediaControllerImplBase.playerInfo;
            androidx.media3.session.PlayerInfo playerInfoCopyWithPlaybackState = playerInfo.copyWithPlaybackState(i2, playerInfo.playerError);
            androidx.media3.session.MediaControllerImplBase.PeriodInfo periodInfo = mediaControllerImplBase.getPeriodInfo(timeline, i, j);
            if (periodInfo == null) {
                androidx.media3.common.Player.PositionInfo positionInfo = new androidx.media3.common.Player.PositionInfo(null, i, null, null, i, j == androidx.media3.common.C.TIME_UNSET ? 0L : j, j == androidx.media3.common.C.TIME_UNSET ? 0L : j, -1, -1);
                androidx.media3.session.PlayerInfo playerInfo2 = mediaControllerImplBase.playerInfo;
                playerInfoMaskPositionInfo = maskTimelineAndPositionInfo(playerInfo2, playerInfo2.timeline, positionInfo, new androidx.media3.session.SessionPositionInfo(positionInfo, mediaControllerImplBase.playerInfo.sessionPositionInfo.isPlayingAd, android.os.SystemClock.elapsedRealtime(), mediaControllerImplBase.playerInfo.sessionPositionInfo.durationMs, j == androidx.media3.common.C.TIME_UNSET ? 0L : j, 0, 0L, mediaControllerImplBase.playerInfo.sessionPositionInfo.currentLiveOffsetMs, mediaControllerImplBase.playerInfo.sessionPositionInfo.contentDurationMs, j == androidx.media3.common.C.TIME_UNSET ? 0L : j), 1);
                mediaControllerImplBase = this;
            } else {
                playerInfoMaskPositionInfo = mediaControllerImplBase.maskPositionInfo(playerInfoCopyWithPlaybackState, timeline, periodInfo);
            }
            boolean z = (mediaControllerImplBase.playerInfo.timeline.isEmpty() || playerInfoMaskPositionInfo.sessionPositionInfo.positionInfo.mediaItemIndex == mediaControllerImplBase.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex) ? false : true;
            if (z || playerInfoMaskPositionInfo.sessionPositionInfo.positionInfo.positionMs != mediaControllerImplBase.playerInfo.sessionPositionInfo.positionInfo.positionMs) {
                updatePlayerInfo(playerInfoMaskPositionInfo, null, null, 1, z ? 2 : null);
            }
        }
    }

    private void setPlayWhenReady(boolean z, int i) {
        int playbackSuppressionReason = getPlaybackSuppressionReason();
        if (playbackSuppressionReason == 1) {
            playbackSuppressionReason = 0;
        }
        if (this.playerInfo.playWhenReady == z && this.playerInfo.playbackSuppressionReason == playbackSuppressionReason) {
            return;
        }
        this.currentPositionMs = androidx.media3.session.MediaUtils.getUpdatedCurrentPositionMs(this.playerInfo, this.currentPositionMs, this.lastSetPlayWhenReadyCalledTimeMs, getInstance().getTimeDiffMs());
        this.lastSetPlayWhenReadyCalledTimeMs = android.os.SystemClock.elapsedRealtime();
        updatePlayerInfo(this.playerInfo.copyWithPlayWhenReady(z, i, playbackSuppressionReason), null, java.lang.Integer.valueOf(i), null, null);
    }

    private void updatePlayerInfo(androidx.media3.session.PlayerInfo playerInfo, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        androidx.media3.session.PlayerInfo playerInfo2 = this.playerInfo;
        this.playerInfo = playerInfo;
        notifyPlayerInfoListenersWithReasons(playerInfo2, playerInfo, num, num2, num3, num4);
    }

    private void notifyPlayerInfoListenersWithReasons(androidx.media3.session.PlayerInfo playerInfo, final androidx.media3.session.PlayerInfo playerInfo2, final java.lang.Integer num, final java.lang.Integer num2, final java.lang.Integer num3, final java.lang.Integer num4) {
        boolean z = false;
        if (num != null) {
            this.listeners.queueEvent(0, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda57
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onTimelineChanged(playerInfo2.timeline, num.intValue());
                }
            });
        }
        if (num3 != null) {
            this.listeners.queueEvent(11, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda69
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.session.PlayerInfo playerInfo3 = playerInfo2;
                    ((androidx.media3.common.Player.Listener) obj).onPositionDiscontinuity(playerInfo3.oldPositionInfo, playerInfo3.newPositionInfo, num3.intValue());
                }
            });
        }
        final androidx.media3.common.MediaItem currentMediaItem = playerInfo2.getCurrentMediaItem();
        if (num4 != null) {
            this.listeners.queueEvent(1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda78
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMediaItemTransition(currentMediaItem, num4.intValue());
                }
            });
        }
        androidx.media3.common.PlaybackException playbackException = playerInfo.playerError;
        final androidx.media3.common.PlaybackException playbackException2 = playerInfo2.playerError;
        if (playbackException == playbackException2 || (playbackException != null && playbackException.errorInfoEquals(playbackException2))) {
            z = true;
        }
        if (!z) {
            this.listeners.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda79
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlayerErrorChanged(playbackException2);
                }
            });
            if (playbackException2 != null) {
                this.listeners.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda80
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((androidx.media3.common.Player.Listener) obj).onPlayerError(playbackException2);
                    }
                });
            }
        }
        if (!playerInfo.currentTracks.equals(playerInfo2.currentTracks)) {
            this.listeners.queueEvent(2, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda81
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onTracksChanged(playerInfo2.currentTracks);
                }
            });
        }
        if (!playerInfo.mediaMetadata.equals(playerInfo2.mediaMetadata)) {
            this.listeners.queueEvent(14, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda82
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMediaMetadataChanged(playerInfo2.mediaMetadata);
                }
            });
        }
        if (playerInfo.isLoading != playerInfo2.isLoading) {
            this.listeners.queueEvent(3, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda83
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onIsLoadingChanged(playerInfo2.isLoading);
                }
            });
        }
        if (playerInfo.playbackState != playerInfo2.playbackState) {
            this.listeners.queueEvent(4, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda84
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackStateChanged(playerInfo2.playbackState);
                }
            });
        }
        if (num2 != null) {
            this.listeners.queueEvent(5, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda86
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlayWhenReadyChanged(playerInfo2.playWhenReady, num2.intValue());
                }
            });
        }
        if (playerInfo.playbackSuppressionReason != playerInfo2.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda58
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackSuppressionReasonChanged(playerInfo2.playbackSuppressionReason);
                }
            });
        }
        if (playerInfo.isPlaying != playerInfo2.isPlaying) {
            this.listeners.queueEvent(7, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda59
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onIsPlayingChanged(playerInfo2.isPlaying);
                }
            });
        }
        if (!playerInfo.playbackParameters.equals(playerInfo2.playbackParameters)) {
            this.listeners.queueEvent(12, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda60
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaybackParametersChanged(playerInfo2.playbackParameters);
                }
            });
        }
        if (playerInfo.repeatMode != playerInfo2.repeatMode) {
            this.listeners.queueEvent(8, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda61
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onRepeatModeChanged(playerInfo2.repeatMode);
                }
            });
        }
        if (playerInfo.shuffleModeEnabled != playerInfo2.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda62
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onShuffleModeEnabledChanged(playerInfo2.shuffleModeEnabled);
                }
            });
        }
        if (!playerInfo.playlistMetadata.equals(playerInfo2.playlistMetadata)) {
            this.listeners.queueEvent(15, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda64
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onPlaylistMetadataChanged(playerInfo2.playlistMetadata);
                }
            });
        }
        if (playerInfo.volume != playerInfo2.volume) {
            this.listeners.queueEvent(22, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda65
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onVolumeChanged(playerInfo2.volume);
                }
            });
        }
        if (!playerInfo.audioAttributes.equals(playerInfo2.audioAttributes)) {
            this.listeners.queueEvent(20, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda66
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onAudioAttributesChanged(playerInfo2.audioAttributes);
                }
            });
        }
        if (!playerInfo.cueGroup.cues.equals(playerInfo2.cueGroup.cues)) {
            this.listeners.queueEvent(27, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda67
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onCues(playerInfo2.cueGroup.cues);
                }
            });
            this.listeners.queueEvent(27, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda68
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onCues(playerInfo2.cueGroup);
                }
            });
        }
        if (!playerInfo.deviceInfo.equals(playerInfo2.deviceInfo)) {
            this.listeners.queueEvent(29, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda70
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onDeviceInfoChanged(playerInfo2.deviceInfo);
                }
            });
        }
        if (playerInfo.deviceVolume != playerInfo2.deviceVolume || playerInfo.deviceMuted != playerInfo2.deviceMuted) {
            this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda71
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.session.PlayerInfo playerInfo3 = playerInfo2;
                    ((androidx.media3.common.Player.Listener) obj).onDeviceVolumeChanged(playerInfo3.deviceVolume, playerInfo3.deviceMuted);
                }
            });
        }
        if (!playerInfo.videoSize.equals(playerInfo2.videoSize)) {
            this.listeners.queueEvent(25, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda72
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onVideoSizeChanged(playerInfo2.videoSize);
                }
            });
        }
        if (playerInfo.seekBackIncrementMs != playerInfo2.seekBackIncrementMs) {
            this.listeners.queueEvent(16, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda73
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onSeekBackIncrementChanged(playerInfo2.seekBackIncrementMs);
                }
            });
        }
        if (playerInfo.seekForwardIncrementMs != playerInfo2.seekForwardIncrementMs) {
            this.listeners.queueEvent(17, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda75
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onSeekForwardIncrementChanged(playerInfo2.seekForwardIncrementMs);
                }
            });
        }
        if (playerInfo.maxSeekToPreviousPositionMs != playerInfo2.maxSeekToPreviousPositionMs) {
            this.listeners.queueEvent(18, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda76
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onMaxSeekToPreviousPositionChanged(playerInfo2.maxSeekToPreviousPositionMs);
                }
            });
        }
        if (!playerInfo.trackSelectionParameters.equals(playerInfo2.trackSelectionParameters)) {
            this.listeners.queueEvent(19, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda77
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onTrackSelectionParametersChanged(playerInfo2.trackSelectionParameters);
                }
            });
        }
        this.listeners.flushEvents();
    }

    private boolean requestConnectToService() {
        int i = androidx.media3.common.util.Util.SDK_INT >= 29 ? androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN : 1;
        android.content.Intent intent = new android.content.Intent(androidx.media3.session.MediaSessionService.SERVICE_INTERFACE);
        intent.setClassName(this.token.getPackageName(), this.token.getServiceName());
        if (this.context.bindService(intent, this.serviceConnection, i)) {
            return true;
        }
        androidx.media3.common.util.Log.w(TAG, "bind to " + this.token + " failed");
        return false;
    }

    private boolean requestConnectToSession(android.os.Bundle bundle) {
        try {
            androidx.media3.session.IMediaSession.Stub.asInterface((android.os.IBinder) androidx.media3.common.util.Assertions.checkStateNotNull(this.token.getBinder())).connect(this.controllerStub, this.sequencedFutureManager.obtainNextSequenceNumber(), new androidx.media3.session.ConnectionRequest(this.context.getPackageName(), android.os.Process.myPid(), bundle).toBundle());
            return true;
        } catch (android.os.RemoteException e) {
            androidx.media3.common.util.Log.w(TAG, "Failed to call connection request.", e);
            return false;
        }
    }

    private void clearSurfacesAndCallbacks() {
        android.view.TextureView textureView = this.videoTextureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.videoTextureView = null;
        }
        android.view.SurfaceHolder surfaceHolder = this.videoSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.surfaceCallback);
            this.videoSurfaceHolder = null;
        }
        if (this.videoSurface != null) {
            this.videoSurface = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(final int i, final int i2) {
        if (this.surfaceSize.getWidth() == i && this.surfaceSize.getHeight() == i2) {
            return;
        }
        this.surfaceSize = new androidx.media3.common.util.Size(i, i2);
        this.listeners.sendEvent(24, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda9
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.common.Player.Listener) obj).onSurfaceSizeChanged(i, i2);
            }
        });
    }

    androidx.media3.session.IMediaSession getSessionInterfaceWithSessionCommandIfAble(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i != 0);
        if (!this.sessionCommands.contains(i)) {
            androidx.media3.common.util.Log.w(TAG, "Controller isn't allowed to call command, commandCode=" + i);
            return null;
        }
        return this.iSession;
    }

    androidx.media3.session.IMediaSession getSessionInterfaceWithSessionCommandIfAble(androidx.media3.session.SessionCommand sessionCommand) {
        androidx.media3.common.util.Assertions.checkArgument(sessionCommand.commandCode == 0);
        if (!this.sessionCommands.contains(sessionCommand)) {
            androidx.media3.common.util.Log.w(TAG, "Controller isn't allowed to call custom session command:" + sessionCommand.customAction);
            return null;
        }
        return this.iSession;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyPeriodicSessionPositionInfoChanged(androidx.media3.session.SessionPositionInfo sessionPositionInfo) {
        if (isConnected()) {
            updateSessionPositionInfoIfNeeded(sessionPositionInfo);
        }
    }

    <T> void setFutureResult(final int i, T t) {
        this.sequencedFutureManager.setFutureResult(i, t);
        getInstance().runOnApplicationLooper(new java.lang.Runnable() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m294x8f22d373(i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setFutureResult$105$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m294x8f22d373(int i) {
        this.pendingMaskingSequencedFutureNumbers.remove(java.lang.Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onConnected(androidx.media3.session.ConnectionState connectionState) {
        if (this.iSession != null) {
            androidx.media3.common.util.Log.e(TAG, "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
            getInstance().release();
            return;
        }
        this.iSession = connectionState.sessionBinder;
        this.sessionActivity = connectionState.sessionActivity;
        this.sessionCommands = connectionState.sessionCommands;
        this.playerCommandsFromSession = connectionState.playerCommandsFromSession;
        androidx.media3.common.Player.Commands commands = connectionState.playerCommandsFromPlayer;
        this.playerCommandsFromPlayer = commands;
        this.intersectedPlayerCommands = createIntersectedCommandsEnsuringCommandReleaseAvailable(this.playerCommandsFromSession, commands);
        this.customLayoutOriginal = connectionState.customLayout;
        this.customLayoutWithUnavailableButtonsDisabled = androidx.media3.session.CommandButton.copyWithUnavailableButtonsDisabled(connectionState.customLayout, this.sessionCommands, this.intersectedPlayerCommands);
        this.playerInfo = connectionState.playerInfo;
        try {
            connectionState.sessionBinder.asBinder().linkToDeath(this.deathRecipient, 0);
            this.connectedToken = new androidx.media3.session.SessionToken(this.token.getUid(), 0, connectionState.libraryVersion, connectionState.sessionInterfaceVersion, this.token.getPackageName(), connectionState.sessionBinder, connectionState.tokenExtras);
            this.sessionExtras = connectionState.sessionExtras;
            getInstance().notifyAccepted();
        } catch (android.os.RemoteException unused) {
            getInstance().release();
        }
    }

    private void sendControllerResult(int i, androidx.media3.session.SessionResult sessionResult) {
        androidx.media3.session.IMediaSession iMediaSession = this.iSession;
        if (iMediaSession == null) {
            return;
        }
        try {
            iMediaSession.onControllerResult(this.controllerStub, i, sessionResult.toBundle());
        } catch (android.os.RemoteException unused) {
            androidx.media3.common.util.Log.w(TAG, "Error in sending");
        }
    }

    private void sendControllerResultWhenReady(final int i, final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> listenableFuture) {
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m283xccda08fa(listenableFuture, i);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lambda$sendControllerResultWhenReady$106$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m283xccda08fa(com.google.common.util.concurrent.ListenableFuture listenableFuture, int i) {
        androidx.media3.session.SessionResult sessionResult;
        try {
            sessionResult = (androidx.media3.session.SessionResult) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.session.SessionResult) listenableFuture.get(), "SessionResult must not be null");
        } catch (java.lang.InterruptedException e) {
            e = e;
            androidx.media3.common.util.Log.w(TAG, "Session operation failed", e);
            sessionResult = new androidx.media3.session.SessionResult(-1);
        } catch (java.util.concurrent.CancellationException e2) {
            androidx.media3.common.util.Log.w(TAG, "Session operation cancelled", e2);
            sessionResult = new androidx.media3.session.SessionResult(1);
        } catch (java.util.concurrent.ExecutionException e3) {
            e = e3;
            androidx.media3.common.util.Log.w(TAG, "Session operation failed", e);
            sessionResult = new androidx.media3.session.SessionResult(-1);
        }
        sendControllerResult(i, sessionResult);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onCustomCommand(final int i, final androidx.media3.session.SessionCommand sessionCommand, final android.os.Bundle bundle) {
        if (isConnected()) {
            getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda56
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m260xd317daae(sessionCommand, bundle, i, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onCustomCommand$107$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m260xd317daae(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, int i, androidx.media3.session.MediaController.Listener listener) {
        sendControllerResultWhenReady(i, (com.google.common.util.concurrent.ListenableFuture) androidx.media3.common.util.Assertions.checkNotNull(listener.onCustomCommand(getInstance(), sessionCommand, bundle), "ControllerCallback#onCustomCommand() must not return null"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPlayerInfoChanged(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusions) {
        androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusions2;
        if (isConnected()) {
            androidx.media3.session.PlayerInfo playerInfo2 = this.pendingPlayerInfo;
            if (playerInfo2 != null && (bundlingExclusions2 = this.pendingBundlingExclusions) != null) {
                android.util.Pair<androidx.media3.session.PlayerInfo, androidx.media3.session.PlayerInfo.BundlingExclusions> pairMergePlayerInfo = androidx.media3.session.MediaUtils.mergePlayerInfo(playerInfo2, bundlingExclusions2, playerInfo, bundlingExclusions, this.intersectedPlayerCommands);
                androidx.media3.session.PlayerInfo playerInfo3 = (androidx.media3.session.PlayerInfo) pairMergePlayerInfo.first;
                bundlingExclusions = (androidx.media3.session.PlayerInfo.BundlingExclusions) pairMergePlayerInfo.second;
                playerInfo = playerInfo3;
            }
            this.pendingPlayerInfo = null;
            this.pendingBundlingExclusions = null;
            if (!this.pendingMaskingSequencedFutureNumbers.isEmpty()) {
                this.pendingPlayerInfo = playerInfo;
                this.pendingBundlingExclusions = bundlingExclusions;
                return;
            }
            androidx.media3.session.PlayerInfo playerInfo4 = this.playerInfo;
            androidx.media3.session.PlayerInfo playerInfo5 = (androidx.media3.session.PlayerInfo) androidx.media3.session.MediaUtils.mergePlayerInfo(playerInfo4, androidx.media3.session.PlayerInfo.BundlingExclusions.NONE, playerInfo, bundlingExclusions, this.intersectedPlayerCommands).first;
            this.playerInfo = playerInfo5;
            notifyPlayerInfoListenersWithReasons(playerInfo4, playerInfo5, !playerInfo4.timeline.equals(playerInfo5.timeline) ? java.lang.Integer.valueOf(playerInfo5.timelineChangeReason) : null, (playerInfo4.playWhenReadyChangeReason == playerInfo5.playWhenReadyChangeReason && playerInfo4.playWhenReady == playerInfo5.playWhenReady) ? null : java.lang.Integer.valueOf(playerInfo5.playWhenReadyChangeReason), (playerInfo4.oldPositionInfo.equals(playerInfo.oldPositionInfo) && playerInfo4.newPositionInfo.equals(playerInfo.newPositionInfo)) ? null : java.lang.Integer.valueOf(playerInfo5.discontinuityReason), !androidx.media3.common.util.Util.areEqual(playerInfo4.getCurrentMediaItem(), playerInfo5.getCurrentMediaItem()) ? java.lang.Integer.valueOf(playerInfo5.mediaItemTransitionReason) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAvailableCommandsChangedFromSession(final androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        boolean z;
        if (isConnected()) {
            boolean z2 = !androidx.media3.common.util.Util.areEqual(this.playerCommandsFromSession, commands);
            boolean z3 = !androidx.media3.common.util.Util.areEqual(this.sessionCommands, sessionCommands);
            if (z2 || z3) {
                this.sessionCommands = sessionCommands;
                boolean z4 = false;
                if (z2) {
                    this.playerCommandsFromSession = commands;
                    androidx.media3.common.Player.Commands commands2 = this.intersectedPlayerCommands;
                    androidx.media3.common.Player.Commands commandsCreateIntersectedCommandsEnsuringCommandReleaseAvailable = createIntersectedCommandsEnsuringCommandReleaseAvailable(commands, this.playerCommandsFromPlayer);
                    this.intersectedPlayerCommands = commandsCreateIntersectedCommandsEnsuringCommandReleaseAvailable;
                    z = !androidx.media3.common.util.Util.areEqual(commandsCreateIntersectedCommandsEnsuringCommandReleaseAvailable, commands2);
                } else {
                    z = false;
                }
                if (z3 || z) {
                    com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList = this.customLayoutWithUnavailableButtonsDisabled;
                    com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableListCopyWithUnavailableButtonsDisabled = androidx.media3.session.CommandButton.copyWithUnavailableButtonsDisabled(this.customLayoutOriginal, sessionCommands, this.intersectedPlayerCommands);
                    this.customLayoutWithUnavailableButtonsDisabled = immutableListCopyWithUnavailableButtonsDisabled;
                    z4 = !immutableListCopyWithUnavailableButtonsDisabled.equals(immutableList);
                }
                if (z) {
                    this.listeners.sendEvent(13, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda111
                        @Override // androidx.media3.common.util.ListenerSet.Event
                        public final void invoke(java.lang.Object obj) {
                            this.f$0.m257xd538541e((androidx.media3.common.Player.Listener) obj);
                        }
                    });
                }
                if (z3) {
                    getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda112
                        @Override // androidx.media3.common.util.Consumer
                        public final void accept(java.lang.Object obj) {
                            this.f$0.m258xd4c1ee1f(sessionCommands, (androidx.media3.session.MediaController.Listener) obj);
                        }
                    });
                }
                if (z4) {
                    getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda113
                        @Override // androidx.media3.common.util.Consumer
                        public final void accept(java.lang.Object obj) {
                            this.f$0.m259xca952a35((androidx.media3.session.MediaController.Listener) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: lambda$onAvailableCommandsChangedFromSession$108$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m257xd538541e(androidx.media3.common.Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.intersectedPlayerCommands);
    }

    /* JADX INFO: renamed from: lambda$onAvailableCommandsChangedFromSession$109$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m258xd4c1ee1f(androidx.media3.session.SessionCommands sessionCommands, androidx.media3.session.MediaController.Listener listener) {
        listener.onAvailableSessionCommandsChanged(getInstance(), sessionCommands);
    }

    /* JADX INFO: renamed from: lambda$onAvailableCommandsChangedFromSession$110$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m259xca952a35(androidx.media3.session.MediaController.Listener listener) {
        listener.onCustomLayoutChanged(getInstance(), this.customLayoutWithUnavailableButtonsDisabled);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAvailableCommandsChangedFromPlayer(androidx.media3.common.Player.Commands commands) {
        boolean z;
        if (isConnected() && !androidx.media3.common.util.Util.areEqual(this.playerCommandsFromPlayer, commands)) {
            this.playerCommandsFromPlayer = commands;
            androidx.media3.common.Player.Commands commands2 = this.intersectedPlayerCommands;
            androidx.media3.common.Player.Commands commandsCreateIntersectedCommandsEnsuringCommandReleaseAvailable = createIntersectedCommandsEnsuringCommandReleaseAvailable(this.playerCommandsFromSession, commands);
            this.intersectedPlayerCommands = commandsCreateIntersectedCommandsEnsuringCommandReleaseAvailable;
            if (!androidx.media3.common.util.Util.areEqual(commandsCreateIntersectedCommandsEnsuringCommandReleaseAvailable, commands2)) {
                com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList = this.customLayoutWithUnavailableButtonsDisabled;
                com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableListCopyWithUnavailableButtonsDisabled = androidx.media3.session.CommandButton.copyWithUnavailableButtonsDisabled(this.customLayoutOriginal, this.sessionCommands, this.intersectedPlayerCommands);
                this.customLayoutWithUnavailableButtonsDisabled = immutableListCopyWithUnavailableButtonsDisabled;
                z = !immutableListCopyWithUnavailableButtonsDisabled.equals(immutableList);
                this.listeners.sendEvent(13, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda49
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        this.f$0.m255xdbcc6033((androidx.media3.common.Player.Listener) obj);
                    }
                });
            } else {
                z = false;
            }
            if (z) {
                getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda50
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        this.f$0.m256xdb55fa34((androidx.media3.session.MediaController.Listener) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: lambda$onAvailableCommandsChangedFromPlayer$111$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m255xdbcc6033(androidx.media3.common.Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.intersectedPlayerCommands);
    }

    /* JADX INFO: renamed from: lambda$onAvailableCommandsChangedFromPlayer$112$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m256xdb55fa34(androidx.media3.session.MediaController.Listener listener) {
        listener.onCustomLayoutChanged(getInstance(), this.customLayoutWithUnavailableButtonsDisabled);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onSetCustomLayout(final int i, java.util.List<androidx.media3.session.CommandButton> list) {
        if (isConnected()) {
            com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList = this.customLayoutWithUnavailableButtonsDisabled;
            this.customLayoutOriginal = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableListCopyWithUnavailableButtonsDisabled = androidx.media3.session.CommandButton.copyWithUnavailableButtonsDisabled(list, this.sessionCommands, this.intersectedPlayerCommands);
            this.customLayoutWithUnavailableButtonsDisabled = immutableListCopyWithUnavailableButtonsDisabled;
            final boolean z = !java.util.Objects.equals(immutableListCopyWithUnavailableButtonsDisabled, immutableList);
            getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda87
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m263xdc59392c(z, i, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onSetCustomLayout$113$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m263xdc59392c(boolean z, int i, androidx.media3.session.MediaController.Listener listener) {
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> listenableFuture = (com.google.common.util.concurrent.ListenableFuture) androidx.media3.common.util.Assertions.checkNotNull(listener.onSetCustomLayout(getInstance(), this.customLayoutWithUnavailableButtonsDisabled), "MediaController.Listener#onSetCustomLayout() must not return null");
        if (z) {
            listener.onCustomLayoutChanged(getInstance(), this.customLayoutWithUnavailableButtonsDisabled);
        }
        sendControllerResultWhenReady(i, listenableFuture);
    }

    public void onExtrasChanged(final android.os.Bundle bundle) {
        if (isConnected()) {
            this.sessionExtras = bundle;
            getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda106
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m262xa4e2181(bundle, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onExtrasChanged$114$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m262xa4e2181(android.os.Bundle bundle, androidx.media3.session.MediaController.Listener listener) {
        listener.onExtrasChanged(getInstance(), bundle);
    }

    public void onSetSessionActivity(int i, final android.app.PendingIntent pendingIntent) {
        if (isConnected()) {
            this.sessionActivity = pendingIntent;
            getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda18
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m264x835c9a2c(pendingIntent, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onSetSessionActivity$115$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m264x835c9a2c(android.app.PendingIntent pendingIntent, androidx.media3.session.MediaController.Listener listener) {
        listener.onSessionActivityChanged(getInstance(), pendingIntent);
    }

    public void onError(int i, final androidx.media3.session.SessionError sessionError) {
        if (isConnected()) {
            getInstance().notifyControllerListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda25
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m261xd7dae73a(sessionError, (androidx.media3.session.MediaController.Listener) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onError$116$androidx-media3-session-MediaControllerImplBase, reason: not valid java name */
    /* synthetic */ void m261xd7dae73a(androidx.media3.session.SessionError sessionError, androidx.media3.session.MediaController.Listener listener) {
        listener.onError(getInstance(), sessionError);
    }

    public void onRenderedFirstFrame() {
        this.listeners.sendEvent(26, new androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda23());
    }

    private void updateSessionPositionInfoIfNeeded(androidx.media3.session.SessionPositionInfo sessionPositionInfo) {
        if (this.pendingMaskingSequencedFutureNumbers.isEmpty() && this.playerInfo.sessionPositionInfo.eventTimeMs < sessionPositionInfo.eventTimeMs && androidx.media3.session.MediaUtils.areSessionPositionInfosInSamePeriodOrAd(sessionPositionInfo, this.playerInfo.sessionPositionInfo)) {
            this.playerInfo = this.playerInfo.copyWithSessionPositionInfo(sessionPositionInfo);
        }
    }

    private boolean isPlayerCommandAvailable(int i) {
        if (this.intersectedPlayerCommands.contains(i)) {
            return true;
        }
        androidx.media3.common.util.Log.w(TAG, "Controller isn't allowed to call command= " + i);
        return false;
    }

    private androidx.media3.session.PlayerInfo maskPositionInfo(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Timeline timeline, androidx.media3.session.MediaControllerImplBase.PeriodInfo periodInfo) {
        int i = playerInfo.sessionPositionInfo.positionInfo.periodIndex;
        int i2 = periodInfo.index;
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        timeline.getPeriod(i, period);
        androidx.media3.common.Timeline.Period period2 = new androidx.media3.common.Timeline.Period();
        timeline.getPeriod(i2, period2);
        boolean z = i != i2;
        long j = periodInfo.periodPositionUs;
        long jMsToUs = androidx.media3.common.util.Util.msToUs(getCurrentPosition()) - period.getPositionInWindowUs();
        if (!z && j == jMsToUs) {
            return playerInfo;
        }
        androidx.media3.common.util.Assertions.checkState(playerInfo.sessionPositionInfo.positionInfo.adGroupIndex == -1);
        androidx.media3.common.Player.PositionInfo positionInfo = new androidx.media3.common.Player.PositionInfo(null, period.windowIndex, playerInfo.sessionPositionInfo.positionInfo.mediaItem, null, i, androidx.media3.common.util.Util.usToMs(period.positionInWindowUs + jMsToUs), androidx.media3.common.util.Util.usToMs(period.positionInWindowUs + jMsToUs), -1, -1);
        timeline.getPeriod(i2, period2);
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        timeline.getWindow(period2.windowIndex, window);
        androidx.media3.common.Player.PositionInfo positionInfo2 = new androidx.media3.common.Player.PositionInfo(null, period2.windowIndex, window.mediaItem, null, i2, androidx.media3.common.util.Util.usToMs(period2.positionInWindowUs + j), androidx.media3.common.util.Util.usToMs(period2.positionInWindowUs + j), -1, -1);
        androidx.media3.session.PlayerInfo playerInfoCopyWithPositionInfos = playerInfo.copyWithPositionInfos(positionInfo, positionInfo2, 1);
        if (z || j < jMsToUs) {
            return playerInfoCopyWithPositionInfos.copyWithSessionPositionInfo(new androidx.media3.session.SessionPositionInfo(positionInfo2, false, android.os.SystemClock.elapsedRealtime(), window.getDurationMs(), androidx.media3.common.util.Util.usToMs(period2.positionInWindowUs + j), androidx.media3.session.MediaUtils.calculateBufferedPercentage(androidx.media3.common.util.Util.usToMs(period2.positionInWindowUs + j), window.getDurationMs()), 0L, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.util.Util.usToMs(period2.positionInWindowUs + j)));
        }
        long jMax = java.lang.Math.max(0L, androidx.media3.common.util.Util.msToUs(playerInfoCopyWithPositionInfos.sessionPositionInfo.totalBufferedDurationMs) - (j - jMsToUs));
        long j2 = j + jMax;
        return playerInfoCopyWithPositionInfos.copyWithSessionPositionInfo(new androidx.media3.session.SessionPositionInfo(positionInfo2, false, android.os.SystemClock.elapsedRealtime(), window.getDurationMs(), androidx.media3.common.util.Util.usToMs(j2), androidx.media3.session.MediaUtils.calculateBufferedPercentage(androidx.media3.common.util.Util.usToMs(j2), window.getDurationMs()), androidx.media3.common.util.Util.usToMs(jMax), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.util.Util.usToMs(j2)));
    }

    private androidx.media3.session.MediaControllerImplBase.PeriodInfo getPeriodInfo(androidx.media3.common.Timeline timeline, int i, long j) {
        if (timeline.isEmpty()) {
            return null;
        }
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        if (i == -1 || i >= timeline.getWindowCount()) {
            i = timeline.getFirstWindowIndex(getShuffleModeEnabled());
            j = timeline.getWindow(i, window).getDefaultPositionMs();
        }
        return getPeriodInfo(timeline, window, period, i, androidx.media3.common.util.Util.msToUs(j));
    }

    private static androidx.media3.session.MediaControllerImplBase.PeriodInfo getPeriodInfo(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period, int i, long j) {
        androidx.media3.common.util.Assertions.checkIndex(i, 0, timeline.getWindowCount());
        timeline.getWindow(i, window);
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = window.getDefaultPositionUs();
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = window.firstPeriodIndex;
        timeline.getPeriod(i2, period);
        while (i2 < window.lastPeriodIndex && period.positionInWindowUs != j) {
            int i3 = i2 + 1;
            if (timeline.getPeriod(i3, period).positionInWindowUs > j) {
                break;
            }
            i2 = i3;
        }
        timeline.getPeriod(i2, period);
        return new androidx.media3.session.MediaControllerImplBase.PeriodInfo(i2, j - period.positionInWindowUs);
    }

    private static int getCurrentMediaItemIndexInternal(androidx.media3.session.PlayerInfo playerInfo) {
        if (playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex == -1) {
            return 0;
        }
        return playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
    }

    private static androidx.media3.session.PlayerInfo maskTimelineAndPositionInfo(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Timeline timeline, int i, int i2, long j, long j2, int i3) {
        androidx.media3.common.Player.PositionInfo positionInfo = new androidx.media3.common.Player.PositionInfo(null, i, timeline.getWindow(i, new androidx.media3.common.Timeline.Window()).mediaItem, null, i2, j, j2, playerInfo.sessionPositionInfo.positionInfo.adGroupIndex, playerInfo.sessionPositionInfo.positionInfo.adIndexInAdGroup);
        return maskTimelineAndPositionInfo(playerInfo, timeline, positionInfo, new androidx.media3.session.SessionPositionInfo(positionInfo, playerInfo.sessionPositionInfo.isPlayingAd, android.os.SystemClock.elapsedRealtime(), playerInfo.sessionPositionInfo.durationMs, playerInfo.sessionPositionInfo.bufferedPositionMs, playerInfo.sessionPositionInfo.bufferedPercentage, playerInfo.sessionPositionInfo.totalBufferedDurationMs, playerInfo.sessionPositionInfo.currentLiveOffsetMs, playerInfo.sessionPositionInfo.contentDurationMs, playerInfo.sessionPositionInfo.contentBufferedPositionMs), i3);
    }

    private static androidx.media3.session.PlayerInfo maskTimelineAndPositionInfo(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Timeline timeline, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.session.SessionPositionInfo sessionPositionInfo, int i) {
        return new androidx.media3.session.PlayerInfo.Builder(playerInfo).setTimeline(timeline).setOldPositionInfo(playerInfo.sessionPositionInfo.positionInfo).setNewPositionInfo(positionInfo).setSessionPositionInfo(sessionPositionInfo).setDiscontinuityReason(i).build();
    }

    private static androidx.media3.common.Timeline.Period getPeriodWithNewWindowIndex(androidx.media3.common.Timeline timeline, int i, int i2) {
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        timeline.getPeriod(i, period);
        period.windowIndex = i2;
        return period;
    }

    private static int getNewPeriodIndexWithoutRemovedPeriods(androidx.media3.common.Timeline timeline, int i, int i2, int i3) {
        if (i == -1) {
            return i;
        }
        while (i2 < i3) {
            androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
            timeline.getWindow(i2, window);
            i -= (window.lastPeriodIndex - window.firstPeriodIndex) + 1;
            i2++;
        }
        return i;
    }

    private static androidx.media3.common.Timeline.Window createNewWindow(androidx.media3.common.MediaItem mediaItem) {
        return new androidx.media3.common.Timeline.Window().set(0, mediaItem, null, 0L, 0L, 0L, true, false, null, 0L, androidx.media3.common.C.TIME_UNSET, -1, -1, 0L);
    }

    private static androidx.media3.common.Timeline.Period createNewPeriod(int i) {
        return new androidx.media3.common.Timeline.Period().set(null, null, i, androidx.media3.common.C.TIME_UNSET, 0L, androidx.media3.common.AdPlaybackState.NONE, true);
    }

    private static void rebuildPeriods(androidx.media3.common.Timeline timeline, java.util.List<androidx.media3.common.Timeline.Window> list, java.util.List<androidx.media3.common.Timeline.Period> list2) {
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.common.Timeline.Window window = list.get(i);
            int i2 = window.firstPeriodIndex;
            int i3 = window.lastPeriodIndex;
            if (i2 == -1 || i3 == -1) {
                window.firstPeriodIndex = list2.size();
                window.lastPeriodIndex = list2.size();
                list2.add(createNewPeriod(i));
            } else {
                window.firstPeriodIndex = list2.size();
                window.lastPeriodIndex = list2.size() + (i3 - i2);
                while (i2 <= i3) {
                    list2.add(getPeriodWithNewWindowIndex(timeline, i2, i));
                    i2++;
                }
            }
        }
    }

    private static int resolveSubsequentMediaItemIndex(int i, boolean z, int i2, androidx.media3.common.Timeline timeline, int i3, int i4) {
        int windowCount = timeline.getWindowCount();
        for (int i5 = 0; i5 < windowCount && (i2 = timeline.getNextWindowIndex(i2, i, z)) != -1; i5++) {
            if (i2 < i3 || i2 >= i4) {
                return i2;
            }
        }
        return -1;
    }

    private static androidx.media3.common.Player.Commands createIntersectedCommandsEnsuringCommandReleaseAvailable(androidx.media3.common.Player.Commands commands, androidx.media3.common.Player.Commands commands2) {
        androidx.media3.common.Player.Commands commandsIntersect = androidx.media3.session.MediaUtils.intersect(commands, commands2);
        return commandsIntersect.contains(32) ? commandsIntersect : commandsIntersect.buildUpon().add(32).build();
    }

    private class SessionServiceConnection implements android.content.ServiceConnection {
        private final android.os.Bundle connectionHints;

        public SessionServiceConnection(android.os.Bundle bundle) {
            this.connectionHints = bundle;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            try {
                try {
                    if (!androidx.media3.session.MediaControllerImplBase.this.token.getPackageName().equals(componentName.getPackageName())) {
                        androidx.media3.common.util.Log.e(androidx.media3.session.MediaControllerImplBase.TAG, "Expected connection to " + androidx.media3.session.MediaControllerImplBase.this.token.getPackageName() + " but is connected to " + componentName);
                        androidx.media3.session.MediaController mediaControllerImplBase = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                        androidx.media3.session.MediaController mediaControllerImplBase2 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                        java.util.Objects.requireNonNull(mediaControllerImplBase2);
                        mediaControllerImplBase.runOnApplicationLooper(new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda44(mediaControllerImplBase2));
                        return;
                    }
                    androidx.media3.session.IMediaSessionService iMediaSessionServiceAsInterface = androidx.media3.session.IMediaSessionService.Stub.asInterface(iBinder);
                    if (iMediaSessionServiceAsInterface == null) {
                        androidx.media3.common.util.Log.e(androidx.media3.session.MediaControllerImplBase.TAG, "Service interface is missing.");
                        androidx.media3.session.MediaController mediaControllerImplBase3 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                        androidx.media3.session.MediaController mediaControllerImplBase4 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                        java.util.Objects.requireNonNull(mediaControllerImplBase4);
                        mediaControllerImplBase3.runOnApplicationLooper(new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda44(mediaControllerImplBase4));
                        return;
                    }
                    iMediaSessionServiceAsInterface.connect(androidx.media3.session.MediaControllerImplBase.this.controllerStub, new androidx.media3.session.ConnectionRequest(androidx.media3.session.MediaControllerImplBase.this.getContext().getPackageName(), android.os.Process.myPid(), this.connectionHints).toBundle());
                } catch (android.os.RemoteException unused) {
                    androidx.media3.common.util.Log.w(androidx.media3.session.MediaControllerImplBase.TAG, "Service " + componentName + " has died prematurely");
                    androidx.media3.session.MediaController mediaControllerImplBase5 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                    androidx.media3.session.MediaController mediaControllerImplBase6 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                    java.util.Objects.requireNonNull(mediaControllerImplBase6);
                    mediaControllerImplBase5.runOnApplicationLooper(new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda44(mediaControllerImplBase6));
                }
            } catch (java.lang.Throwable th) {
                androidx.media3.session.MediaController mediaControllerImplBase7 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                androidx.media3.session.MediaController mediaControllerImplBase8 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                java.util.Objects.requireNonNull(mediaControllerImplBase8);
                mediaControllerImplBase7.runOnApplicationLooper(new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda44(mediaControllerImplBase8));
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            androidx.media3.session.MediaController mediaControllerImplBase = androidx.media3.session.MediaControllerImplBase.this.getInstance();
            androidx.media3.session.MediaController mediaControllerImplBase2 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
            java.util.Objects.requireNonNull(mediaControllerImplBase2);
            mediaControllerImplBase.runOnApplicationLooper(new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda44(mediaControllerImplBase2));
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(android.content.ComponentName componentName) {
            androidx.media3.session.MediaController mediaControllerImplBase = androidx.media3.session.MediaControllerImplBase.this.getInstance();
            androidx.media3.session.MediaController mediaControllerImplBase2 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
            java.util.Objects.requireNonNull(mediaControllerImplBase2);
            mediaControllerImplBase.runOnApplicationLooper(new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda44(mediaControllerImplBase2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SurfaceCallback implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener {
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        }

        private SurfaceCallback() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoSurfaceHolder != surfaceHolder) {
                return;
            }
            androidx.media3.session.MediaControllerImplBase.this.videoSurface = surfaceHolder.getSurface();
            androidx.media3.session.MediaControllerImplBase.this.dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$SurfaceCallback$$ExternalSyntheticLambda3
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m319x74a7f40e(iMediaSession, i);
                }
            });
            android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            androidx.media3.session.MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }

        /* JADX INFO: renamed from: lambda$surfaceCreated$0$androidx-media3-session-MediaControllerImplBase$SurfaceCallback, reason: not valid java name */
        /* synthetic */ void m319x74a7f40e(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
            iMediaSession.setVideoSurface(androidx.media3.session.MediaControllerImplBase.this.controllerStub, i, androidx.media3.session.MediaControllerImplBase.this.videoSurface);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoSurfaceHolder != surfaceHolder) {
                return;
            }
            androidx.media3.session.MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoSurfaceHolder != surfaceHolder) {
                return;
            }
            androidx.media3.session.MediaControllerImplBase.this.videoSurface = null;
            androidx.media3.session.MediaControllerImplBase.this.dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$SurfaceCallback$$ExternalSyntheticLambda1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                    this.f$0.m320x3f436f00(iMediaSession, i);
                }
            });
            androidx.media3.session.MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(0, 0);
        }

        /* JADX INFO: renamed from: lambda$surfaceDestroyed$1$androidx-media3-session-MediaControllerImplBase$SurfaceCallback, reason: not valid java name */
        /* synthetic */ void m320x3f436f00(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
            iMediaSession.setVideoSurface(androidx.media3.session.MediaControllerImplBase.this.controllerStub, i, null);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoTextureView == null || androidx.media3.session.MediaControllerImplBase.this.videoTextureView.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            androidx.media3.session.MediaControllerImplBase.this.videoSurface = new android.view.Surface(surfaceTexture);
            androidx.media3.session.MediaControllerImplBase.this.dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$SurfaceCallback$$ExternalSyntheticLambda0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
                    this.f$0.m317x47b74597(iMediaSession, i3);
                }
            });
            androidx.media3.session.MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        /* JADX INFO: renamed from: lambda$onSurfaceTextureAvailable$2$androidx-media3-session-MediaControllerImplBase$SurfaceCallback, reason: not valid java name */
        /* synthetic */ void m317x47b74597(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
            iMediaSession.setVideoSurface(androidx.media3.session.MediaControllerImplBase.this.controllerStub, i, androidx.media3.session.MediaControllerImplBase.this.videoSurface);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoTextureView == null || androidx.media3.session.MediaControllerImplBase.this.videoTextureView.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            androidx.media3.session.MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoTextureView != null && androidx.media3.session.MediaControllerImplBase.this.videoTextureView.getSurfaceTexture() == surfaceTexture) {
                androidx.media3.session.MediaControllerImplBase.this.videoSurface = null;
                androidx.media3.session.MediaControllerImplBase.this.dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.MediaControllerImplBase$SurfaceCallback$$ExternalSyntheticLambda2
                    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                    public final void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                        this.f$0.m318x1e8b4e8(iMediaSession, i);
                    }
                });
                androidx.media3.session.MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(0, 0);
            }
            return true;
        }

        /* JADX INFO: renamed from: lambda$onSurfaceTextureDestroyed$3$androidx-media3-session-MediaControllerImplBase$SurfaceCallback, reason: not valid java name */
        /* synthetic */ void m318x1e8b4e8(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
            iMediaSession.setVideoSurface(androidx.media3.session.MediaControllerImplBase.this.controllerStub, i, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class FlushCommandQueueHandler {
        private static final int MSG_FLUSH_COMMAND_QUEUE = 1;
        private final android.os.Handler handler;

        public FlushCommandQueueHandler(android.os.Looper looper) {
            this.handler = new android.os.Handler(looper, new android.os.Handler.Callback() { // from class: androidx.media3.session.MediaControllerImplBase$FlushCommandQueueHandler$$ExternalSyntheticLambda0
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(android.os.Message message) {
                    return this.f$0.handleMessage(message);
                }
            });
        }

        public void sendFlushCommandQueueMessage() {
            if (androidx.media3.session.MediaControllerImplBase.this.iSession == null || this.handler.hasMessages(1)) {
                return;
            }
            this.handler.sendEmptyMessage(1);
        }

        public void release() {
            if (this.handler.hasMessages(1)) {
                flushCommandQueue();
            }
            this.handler.removeCallbacksAndMessages(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean handleMessage(android.os.Message message) {
            if (message.what == 1) {
                flushCommandQueue();
            }
            return true;
        }

        private void flushCommandQueue() {
            try {
                androidx.media3.session.MediaControllerImplBase.this.iSession.flushCommandQueue(androidx.media3.session.MediaControllerImplBase.this.controllerStub);
            } catch (android.os.RemoteException unused) {
                androidx.media3.common.util.Log.w(androidx.media3.session.MediaControllerImplBase.TAG, "Error in sending flushCommandQueue");
            }
        }
    }

    private static final class PeriodInfo {
        private final int index;
        private final long periodPositionUs;

        public PeriodInfo(int i, long j) {
            this.index = i;
            this.periodPositionUs = j;
        }
    }
}
