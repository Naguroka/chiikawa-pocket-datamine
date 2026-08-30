package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaSessionLegacyStub extends androidx.media3.session.legacy.MediaSessionCompat.Callback {
    private static final int DEFAULT_CONNECTION_TIMEOUT_MS = 300000;
    private static final java.lang.String DEFAULT_MEDIA_SESSION_TAG_DELIM = ".";
    private static final java.lang.String DEFAULT_MEDIA_SESSION_TAG_PREFIX = "androidx.media3.session.id";
    private static final int PENDING_INTENT_FLAG_MUTABLE;
    private static final java.lang.String TAG = "MediaSessionLegacyStub";
    private final android.content.ComponentName broadcastReceiverComponentName;
    private final androidx.media3.session.ConnectedControllersManager<androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo> connectedControllersManager;
    private final androidx.media3.session.MediaSessionLegacyStub.ConnectionTimeoutHandler connectionTimeoutHandler;
    private volatile long connectionTimeoutMs;
    private final androidx.media3.session.MediaSessionLegacyStub.ControllerLegacyCbForBroadcast controllerLegacyCbForBroadcast;
    private com.google.common.util.concurrent.FutureCallback<android.graphics.Bitmap> pendingBitmapLoadCallback;
    private final androidx.media3.session.MediaSessionLegacyStub.MediaButtonReceiver runtimeBroadcastReceiver;
    private final androidx.media3.session.legacy.MediaSessionCompat sessionCompat;
    private int sessionFlags;
    private final androidx.media3.session.MediaSessionImpl sessionImpl;
    private final androidx.media3.session.legacy.MediaSessionManager sessionManager;
    private androidx.media3.session.legacy.VolumeProviderCompat volumeProviderCompat;

    /* JADX INFO: Access modifiers changed from: private */
    interface SessionTask {
        void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException;
    }

    private static <T> void ignoreFuture(java.util.concurrent.Future<T> future) {
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onSetCaptioningEnabled(boolean z) {
    }

    static {
        PENDING_INTENT_FLAG_MUTABLE = androidx.media3.common.util.Util.SDK_INT >= 31 ? 33554432 : 0;
    }

    public MediaSessionLegacyStub(androidx.media3.session.MediaSessionImpl mediaSessionImpl, android.net.Uri uri, android.os.Handler handler) {
        android.content.ComponentName serviceComponentByAction;
        boolean z;
        android.app.PendingIntent broadcast;
        this.sessionImpl = mediaSessionImpl;
        android.content.Context context = mediaSessionImpl.getContext();
        this.sessionManager = androidx.media3.session.legacy.MediaSessionManager.getSessionManager(context);
        this.controllerLegacyCbForBroadcast = new androidx.media3.session.MediaSessionLegacyStub.ControllerLegacyCbForBroadcast();
        androidx.media3.session.ConnectedControllersManager<androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo> connectedControllersManager = new androidx.media3.session.ConnectedControllersManager<>(mediaSessionImpl);
        this.connectedControllersManager = connectedControllersManager;
        this.connectionTimeoutMs = 300000L;
        this.connectionTimeoutHandler = new androidx.media3.session.MediaSessionLegacyStub.ConnectionTimeoutHandler(mediaSessionImpl.getApplicationHandler().getLooper(), connectedControllersManager);
        android.content.ComponentName componentNameQueryPackageManagerForMediaButtonReceiver = queryPackageManagerForMediaButtonReceiver(context);
        this.broadcastReceiverComponentName = componentNameQueryPackageManagerForMediaButtonReceiver;
        if (componentNameQueryPackageManagerForMediaButtonReceiver == null || androidx.media3.common.util.Util.SDK_INT < 31) {
            serviceComponentByAction = getServiceComponentByAction(context, androidx.media3.session.MediaLibraryService.SERVICE_INTERFACE);
            serviceComponentByAction = serviceComponentByAction == null ? getServiceComponentByAction(context, androidx.media3.session.MediaSessionService.SERVICE_INTERFACE) : serviceComponentByAction;
            z = (serviceComponentByAction == null || java.util.Objects.equals(serviceComponentByAction, componentNameQueryPackageManagerForMediaButtonReceiver)) ? false : true;
        } else {
            z = false;
            serviceComponentByAction = componentNameQueryPackageManagerForMediaButtonReceiver;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON", uri);
        androidx.media3.session.MediaSessionLegacyStub.AnonymousClass1 anonymousClass1 = null;
        if (serviceComponentByAction == null) {
            androidx.media3.session.MediaSessionLegacyStub.MediaButtonReceiver mediaButtonReceiver = new androidx.media3.session.MediaSessionLegacyStub.MediaButtonReceiver(this, anonymousClass1);
            this.runtimeBroadcastReceiver = mediaButtonReceiver;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.addDataScheme((java.lang.String) androidx.media3.common.util.Util.castNonNull(uri.getScheme()));
            androidx.media3.common.util.Util.registerReceiverNotExported(context, mediaButtonReceiver, intentFilter);
            intent.setPackage(context.getPackageName());
            broadcast = android.app.PendingIntent.getBroadcast(context, 0, intent, PENDING_INTENT_FLAG_MUTABLE);
            serviceComponentByAction = new android.content.ComponentName(context, context.getClass());
        } else {
            intent.setComponent(serviceComponentByAction);
            if (z) {
                if (androidx.media3.common.util.Util.SDK_INT >= 26) {
                    broadcast = android.app.PendingIntent.getForegroundService(context, 0, intent, PENDING_INTENT_FLAG_MUTABLE);
                } else {
                    broadcast = android.app.PendingIntent.getService(context, 0, intent, PENDING_INTENT_FLAG_MUTABLE);
                }
            } else {
                broadcast = android.app.PendingIntent.getBroadcast(context, 0, intent, PENDING_INTENT_FLAG_MUTABLE);
            }
            this.runtimeBroadcastReceiver = null;
        }
        androidx.media3.session.legacy.MediaSessionCompat mediaSessionCompat = new androidx.media3.session.legacy.MediaSessionCompat(context, android.text.TextUtils.join(DEFAULT_MEDIA_SESSION_TAG_DELIM, new java.lang.String[]{DEFAULT_MEDIA_SESSION_TAG_PREFIX, mediaSessionImpl.getId()}), androidx.media3.common.util.Util.SDK_INT >= 31 ? null : serviceComponentByAction, androidx.media3.common.util.Util.SDK_INT < 31 ? broadcast : null, mediaSessionImpl.getToken().getExtras());
        this.sessionCompat = mediaSessionCompat;
        if (androidx.media3.common.util.Util.SDK_INT >= 31 && componentNameQueryPackageManagerForMediaButtonReceiver != null) {
            androidx.media3.session.MediaSessionLegacyStub.Api31.setMediaButtonBroadcastReceiver(mediaSessionCompat, componentNameQueryPackageManagerForMediaButtonReceiver);
        }
        android.app.PendingIntent sessionActivity = mediaSessionImpl.getSessionActivity();
        if (sessionActivity != null) {
            mediaSessionCompat.setSessionActivity(sessionActivity);
        }
        mediaSessionCompat.setCallback(this, handler);
    }

    private static android.content.ComponentName queryPackageManagerForMediaButtonReceiver(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            android.content.pm.ResolveInfo resolveInfo = listQueryBroadcastReceivers.get(0);
            return new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (listQueryBroadcastReceivers.isEmpty()) {
            return null;
        }
        throw new java.lang.IllegalStateException("Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + listQueryBroadcastReceivers.size());
    }

    public void start() {
        this.sessionCompat.setActive(true);
    }

    public void release() {
        if (androidx.media3.common.util.Util.SDK_INT < 31) {
            if (this.broadcastReceiverComponentName == null) {
                setMediaButtonReceiver(this.sessionCompat, null);
            } else {
                android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON", this.sessionImpl.getUri());
                intent.setComponent(this.broadcastReceiverComponentName);
                setMediaButtonReceiver(this.sessionCompat, android.app.PendingIntent.getBroadcast(this.sessionImpl.getContext(), 0, intent, PENDING_INTENT_FLAG_MUTABLE));
            }
        }
        if (this.runtimeBroadcastReceiver != null) {
            this.sessionImpl.getContext().unregisterReceiver(this.runtimeBroadcastReceiver);
        }
        this.sessionCompat.release();
    }

    public androidx.media3.session.legacy.MediaSessionCompat getSessionCompat() {
        return this.sessionCompat;
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onCommand(java.lang.String str, final android.os.Bundle bundle, final android.os.ResultReceiver resultReceiver) {
        androidx.media3.common.util.Assertions.checkStateNotNull(str);
        if (android.text.TextUtils.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN", str) && resultReceiver != null) {
            resultReceiver.send(0, this.sessionImpl.getToken().toBundle());
        } else {
            final androidx.media3.session.SessionCommand sessionCommand = new androidx.media3.session.SessionCommand(str, android.os.Bundle.EMPTY);
            dispatchSessionTaskWithSessionCommand(sessionCommand, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda20
                @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
                public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                    this.f$0.m383xec90a203(sessionCommand, bundle, resultReceiver, controllerInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onCommand$0$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m383xec90a203(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl;
        if (bundle == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> listenableFutureOnCustomCommandOnHandler = mediaSessionImpl.onCustomCommandOnHandler(controllerInfo, sessionCommand, bundle);
        if (resultReceiver != null) {
            sendCustomCommandResultWhenReady(resultReceiver, listenableFutureOnCustomCommandOnHandler);
        } else {
            ignoreFuture(listenableFutureOnCustomCommandOnHandler);
        }
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onCustomAction(java.lang.String str, final android.os.Bundle bundle) {
        final androidx.media3.session.SessionCommand sessionCommand = new androidx.media3.session.SessionCommand(str, android.os.Bundle.EMPTY);
        dispatchSessionTaskWithSessionCommand(sessionCommand, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda16
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m384x6dc3132e(sessionCommand, bundle, controllerInfo);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onCustomAction$1$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m384x6dc3132e(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl;
        if (bundle == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        ignoreFuture(mediaSessionImpl.onCustomCommandOnHandler(controllerInfo, sessionCommand, bundle));
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public boolean onMediaButtonEvent(android.content.Intent intent) {
        return this.sessionImpl.onMediaButtonEvent(new androidx.media3.session.MediaSession.ControllerInfo((androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo) androidx.media3.common.util.Assertions.checkNotNull(this.sessionCompat.getCurrentControllerInfo()), 0, 0, false, null, android.os.Bundle.EMPTY), intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeUpdateFlags(androidx.media3.session.PlayerWrapper playerWrapper) {
        int i = playerWrapper.isCommandAvailable(20) ? 4 : 0;
        if (this.sessionFlags != i) {
            this.sessionFlags = i;
            this.sessionCompat.setFlags(i);
        }
    }

    void handleMediaPlayPauseOnHandler(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        dispatchSessionTaskWithPlayerCommand(1, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda8
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m380x31f4e7a8(controllerInfo);
            }
        }, remoteUserInfo, true);
    }

    /* JADX INFO: renamed from: lambda$handleMediaPlayPauseOnHandler$2$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m380x31f4e7a8(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        androidx.media3.common.util.Util.handlePlayPauseButtonAction(this.sessionImpl.getPlayerWrapper(), this.sessionImpl.shouldPlayIfSuppressed());
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onPrepare() {
        dispatchSessionTaskWithPlayerCommand(2, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda21
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m388xfc59f964(controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onPrepare$3$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m388xfc59f964(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().prepare();
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onPrepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        handleMediaRequest(createMediaItemForMediaRequest(str, null, null, bundle), false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onPrepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
        handleMediaRequest(createMediaItemForMediaRequest(null, null, str, bundle), false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onPrepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        handleMediaRequest(createMediaItemForMediaRequest(null, uri, null, bundle), false);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onPlay() {
        dispatchSessionTaskWithPlayerCommand(1, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda5
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m387lambda$onPlay$4$androidxmedia3sessionMediaSessionLegacyStub(controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), false);
    }

    /* JADX INFO: renamed from: lambda$onPlay$4$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m387lambda$onPlay$4$androidxmedia3sessionMediaSessionLegacyStub(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.handleMediaControllerPlayRequest(controllerInfo, true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onPlayFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        handleMediaRequest(createMediaItemForMediaRequest(str, null, null, bundle), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onPlayFromSearch(java.lang.String str, android.os.Bundle bundle) {
        handleMediaRequest(createMediaItemForMediaRequest(null, null, str, bundle), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onPlayFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        handleMediaRequest(createMediaItemForMediaRequest(null, uri, null, bundle), true);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onPause() {
        dispatchSessionTaskWithPlayerCommand(1, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda1
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m386lambda$onPause$5$androidxmedia3sessionMediaSessionLegacyStub(controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onPause$5$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m386lambda$onPause$5$androidxmedia3sessionMediaSessionLegacyStub(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        androidx.media3.common.util.Util.handlePauseButtonAction(this.sessionImpl.getPlayerWrapper());
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onStop() {
        dispatchSessionTaskWithPlayerCommand(3, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda17
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m401lambda$onStop$6$androidxmedia3sessionMediaSessionLegacyStub(controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onStop$6$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m401lambda$onStop$6$androidxmedia3sessionMediaSessionLegacyStub(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().stop();
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onSeekTo(final long j) {
        dispatchSessionTaskWithPlayerCommand(5, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda3
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m391lambda$onSeekTo$7$androidxmedia3sessionMediaSessionLegacyStub(j, controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onSeekTo$7$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m391lambda$onSeekTo$7$androidxmedia3sessionMediaSessionLegacyStub(long j, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().seekTo(j);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onSkipToNext() {
        if (this.sessionImpl.getPlayerWrapper().isCommandAvailable(9)) {
            dispatchSessionTaskWithPlayerCommand(9, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda24
                @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
                public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                    this.f$0.m396x30de70a1(controllerInfo);
                }
            }, this.sessionCompat.getCurrentControllerInfo(), true);
        } else {
            dispatchSessionTaskWithPlayerCommand(8, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda25
                @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
                public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                    this.f$0.m397x6aa91280(controllerInfo);
                }
            }, this.sessionCompat.getCurrentControllerInfo(), true);
        }
    }

    /* JADX INFO: renamed from: lambda$onSkipToNext$8$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m396x30de70a1(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().seekToNext();
    }

    /* JADX INFO: renamed from: lambda$onSkipToNext$9$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m397x6aa91280(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().seekToNextMediaItem();
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onSkipToPrevious() {
        if (this.sessionImpl.getPlayerWrapper().isCommandAvailable(7)) {
            dispatchSessionTaskWithPlayerCommand(7, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda10
                @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
                public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                    this.f$0.m398x6478fb88(controllerInfo);
                }
            }, this.sessionCompat.getCurrentControllerInfo(), true);
        } else {
            dispatchSessionTaskWithPlayerCommand(6, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda12
                @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
                public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                    this.f$0.m399x9e439d67(controllerInfo);
                }
            }, this.sessionCompat.getCurrentControllerInfo(), true);
        }
    }

    /* JADX INFO: renamed from: lambda$onSkipToPrevious$10$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m398x6478fb88(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().seekToPrevious();
    }

    /* JADX INFO: renamed from: lambda$onSkipToPrevious$11$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m399x9e439d67(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().seekToPreviousMediaItem();
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onSetPlaybackSpeed(final float f) {
        if (f <= 0.0f) {
            return;
        }
        dispatchSessionTaskWithPlayerCommand(13, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda14
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m392x7cff143f(f, controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onSetPlaybackSpeed$12$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m392x7cff143f(float f, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().setPlaybackSpeed(f);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onSkipToQueueItem(final long j) {
        if (j < 0) {
            return;
        }
        dispatchSessionTaskWithPlayerCommand(10, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda27
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m400x3ee1cf86(j, controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onSkipToQueueItem$13$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m400x3ee1cf86(long j, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().seekToDefaultPosition((int) j);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onFastForward() {
        dispatchSessionTaskWithPlayerCommand(12, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda4
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m385x1c7427e4(controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onFastForward$14$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m385x1c7427e4(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().seekForward();
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onRewind() {
        dispatchSessionTaskWithPlayerCommand(11, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda9
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m390x92b575ad(controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onRewind$15$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m390x92b575ad(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().seekBack();
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onSetRating(androidx.media3.session.legacy.RatingCompat ratingCompat) {
        onSetRating(ratingCompat, null);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onSetRating(androidx.media3.session.legacy.RatingCompat ratingCompat, android.os.Bundle bundle) {
        final androidx.media3.common.Rating ratingConvertToRating = androidx.media3.session.LegacyConversions.convertToRating(ratingCompat);
        if (ratingConvertToRating == null) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring invalid RatingCompat " + ratingCompat);
        } else {
            dispatchSessionTaskWithSessionCommand(androidx.media3.session.SessionCommand.COMMAND_CODE_SESSION_SET_RATING, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda13
                @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
                public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                    this.f$0.m393xff1530f8(ratingConvertToRating, controllerInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onSetRating$16$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m393xff1530f8(androidx.media3.common.Rating rating, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        androidx.media3.common.MediaItem currentMediaItemWithCommandCheck = this.sessionImpl.getPlayerWrapper().getCurrentMediaItemWithCommandCheck();
        if (currentMediaItemWithCommandCheck == null) {
            return;
        }
        ignoreFuture(this.sessionImpl.onSetRatingOnHandler(controllerInfo, currentMediaItemWithCommandCheck.mediaId, rating));
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onSetRepeatMode(final int i) {
        dispatchSessionTaskWithPlayerCommand(15, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda6
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m394x107e51d8(i, controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onSetRepeatMode$17$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m394x107e51d8(int i, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().setRepeatMode(androidx.media3.session.LegacyConversions.convertToRepeatMode(i));
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onSetShuffleMode(final int i) {
        dispatchSessionTaskWithPlayerCommand(14, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda22
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m395xa4adaf49(i, controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onSetShuffleMode$18$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m395xa4adaf49(int i, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        this.sessionImpl.getPlayerWrapper().setShuffleModeEnabled(androidx.media3.session.LegacyConversions.convertToShuffleModeEnabled(i));
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onAddQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
        handleOnAddQueueItem(mediaDescriptionCompat, -1);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onAddQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i) {
        handleOnAddQueueItem(mediaDescriptionCompat, i);
    }

    @Override // androidx.media3.session.legacy.MediaSessionCompat.Callback
    public void onRemoveQueueItem(final androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        dispatchSessionTaskWithPlayerCommand(20, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda26
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m389x17150c56(mediaDescriptionCompat, controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), true);
    }

    /* JADX INFO: renamed from: lambda$onRemoveQueueItem$19$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m389x17150c56(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        java.lang.String mediaId = mediaDescriptionCompat.getMediaId();
        if (android.text.TextUtils.isEmpty(mediaId)) {
            androidx.media3.common.util.Log.w(TAG, "onRemoveQueueItem(): Media ID shouldn't be null");
            return;
        }
        androidx.media3.session.PlayerWrapper playerWrapper = this.sessionImpl.getPlayerWrapper();
        if (!playerWrapper.isCommandAvailable(17)) {
            androidx.media3.common.util.Log.w(TAG, "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
            return;
        }
        androidx.media3.common.Timeline currentTimeline = playerWrapper.getCurrentTimeline();
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        for (int i = 0; i < currentTimeline.getWindowCount(); i++) {
            if (android.text.TextUtils.equals(currentTimeline.getWindow(i, window).mediaItem.mediaId, mediaId)) {
                playerWrapper.removeMediaItem(i);
                return;
            }
        }
    }

    public androidx.media3.session.MediaSession.ControllerCb getControllerLegacyCbForBroadcast() {
        return this.controllerLegacyCbForBroadcast;
    }

    public androidx.media3.session.ConnectedControllersManager<androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo> getConnectedControllersManager() {
        return this.connectedControllersManager;
    }

    boolean canResumePlaybackOnStart() {
        return this.broadcastReceiverComponentName != null;
    }

    private void dispatchSessionTaskWithPlayerCommand(final int i, final androidx.media3.session.MediaSessionLegacyStub.SessionTask sessionTask, final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, final boolean z) {
        if (this.sessionImpl.isReleased()) {
            return;
        }
        if (remoteUserInfo == null) {
            androidx.media3.common.util.Log.d(TAG, "RemoteUserInfo is null, ignoring command=" + i);
        } else {
            androidx.media3.common.util.Util.postOrRun(this.sessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m378xe3c1229b(i, remoteUserInfo, sessionTask, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$dispatchSessionTaskWithPlayerCommand$21$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m378xe3c1229b(int i, androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, final androidx.media3.session.MediaSessionLegacyStub.SessionTask sessionTask, boolean z) {
        if (this.sessionImpl.isReleased()) {
            return;
        }
        if (!this.sessionCompat.isActive()) {
            androidx.media3.common.util.Log.w(TAG, "Ignore incoming player command before initialization. command=" + i + ", pid=" + remoteUserInfo.getPid());
            return;
        }
        final androidx.media3.session.MediaSession.ControllerInfo controllerInfoTryGetController = tryGetController(remoteUserInfo);
        if (controllerInfoTryGetController == null) {
            return;
        }
        if (!this.connectedControllersManager.isPlayerCommandAvailable(controllerInfoTryGetController, i)) {
            if (i != 1 || this.sessionImpl.getPlayerWrapper().getPlayWhenReady()) {
                return;
            }
            androidx.media3.common.util.Log.w(TAG, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (this.sessionImpl.onPlayerCommandRequestOnHandler(controllerInfoTryGetController, i) != 0) {
            return;
        }
        this.sessionImpl.callWithControllerForCurrentRequestSet(controllerInfoTryGetController, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.session.MediaSessionLegacyStub.lambda$dispatchSessionTaskWithPlayerCommand$20(sessionTask, controllerInfoTryGetController);
            }
        }).run();
        if (z) {
            this.sessionImpl.onPlayerInteractionFinishedOnHandler(controllerInfoTryGetController, new androidx.media3.common.Player.Commands.Builder().add(i).build());
        }
    }

    static /* synthetic */ void lambda$dispatchSessionTaskWithPlayerCommand$20(androidx.media3.session.MediaSessionLegacyStub.SessionTask sessionTask, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        try {
            sessionTask.run(controllerInfo);
        } catch (android.os.RemoteException e) {
            androidx.media3.common.util.Log.w(TAG, "Exception in " + controllerInfo, e);
        }
    }

    private void dispatchSessionTaskWithSessionCommand(int i, androidx.media3.session.MediaSessionLegacyStub.SessionTask sessionTask) {
        dispatchSessionTaskWithSessionCommandInternal(null, i, sessionTask, this.sessionCompat.getCurrentControllerInfo());
    }

    private void dispatchSessionTaskWithSessionCommand(androidx.media3.session.SessionCommand sessionCommand, androidx.media3.session.MediaSessionLegacyStub.SessionTask sessionTask) {
        dispatchSessionTaskWithSessionCommandInternal(sessionCommand, 0, sessionTask, this.sessionCompat.getCurrentControllerInfo());
    }

    private void dispatchSessionTaskWithSessionCommandInternal(final androidx.media3.session.SessionCommand sessionCommand, final int i, final androidx.media3.session.MediaSessionLegacyStub.SessionTask sessionTask, final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        java.lang.Object objValueOf;
        if (remoteUserInfo == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoteUserInfo is null, ignoring command=");
            if (sessionCommand == null) {
                objValueOf = sessionCommand;
                objValueOf = java.lang.Integer.valueOf(i);
            }
            objValueOf = sessionCommand;
            androidx.media3.common.util.Log.d(TAG, sb.append(objValueOf).toString());
            return;
        }
        androidx.media3.common.util.Util.postOrRun(this.sessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m379xc94c4056(sessionCommand, i, remoteUserInfo, sessionTask);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$dispatchSessionTaskWithSessionCommandInternal$22$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m379xc94c4056(androidx.media3.session.SessionCommand sessionCommand, int i, androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, androidx.media3.session.MediaSessionLegacyStub.SessionTask sessionTask) {
        if (this.sessionImpl.isReleased()) {
            return;
        }
        if (!this.sessionCompat.isActive()) {
            androidx.media3.common.util.Log.w(TAG, "Ignore incoming session command before initialization. command=" + (sessionCommand == null ? java.lang.Integer.valueOf(i) : sessionCommand.customAction) + ", pid=" + remoteUserInfo.getPid());
            return;
        }
        androidx.media3.session.MediaSession.ControllerInfo controllerInfoTryGetController = tryGetController(remoteUserInfo);
        if (controllerInfoTryGetController == null) {
            return;
        }
        if (sessionCommand != null) {
            if (!this.connectedControllersManager.isSessionCommandAvailable(controllerInfoTryGetController, sessionCommand)) {
                return;
            }
        } else if (!this.connectedControllersManager.isSessionCommandAvailable(controllerInfoTryGetController, i)) {
            return;
        }
        try {
            sessionTask.run(controllerInfoTryGetController);
        } catch (android.os.RemoteException e) {
            androidx.media3.common.util.Log.w(TAG, "Exception in " + controllerInfoTryGetController, e);
        }
    }

    private androidx.media3.session.MediaSession.ControllerInfo tryGetController(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        androidx.media3.session.MediaSession.ControllerInfo controller = this.connectedControllersManager.getController(remoteUserInfo);
        if (controller == null) {
            androidx.media3.session.MediaSessionLegacyStub.ControllerLegacyCb controllerLegacyCb = new androidx.media3.session.MediaSessionLegacyStub.ControllerLegacyCb(remoteUserInfo);
            androidx.media3.session.MediaSession.ControllerInfo controllerInfo = new androidx.media3.session.MediaSession.ControllerInfo(remoteUserInfo, 0, 0, this.sessionManager.isTrustedForMediaControl(remoteUserInfo), controllerLegacyCb, android.os.Bundle.EMPTY);
            androidx.media3.session.MediaSession.ConnectionResult connectionResultOnConnectOnHandler = this.sessionImpl.onConnectOnHandler(controllerInfo);
            if (!connectionResultOnConnectOnHandler.isAccepted) {
                try {
                    controllerLegacyCb.onDisconnected(0);
                    return null;
                } catch (android.os.RemoteException unused) {
                    return null;
                }
            }
            this.connectedControllersManager.addController(controllerInfo.getRemoteUserInfo(), controllerInfo, connectionResultOnConnectOnHandler.availableSessionCommands, connectionResultOnConnectOnHandler.availablePlayerCommands);
            controller = controllerInfo;
        }
        this.connectionTimeoutHandler.disconnectControllerAfterTimeout(controller, this.connectionTimeoutMs);
        return controller;
    }

    public void setLegacyControllerDisconnectTimeoutMs(long j) {
        this.connectionTimeoutMs = j;
    }

    public void updateLegacySessionPlaybackState(final androidx.media3.session.PlayerWrapper playerWrapper) {
        androidx.media3.common.util.Util.postOrRun(this.sessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m402x2ec088c8(playerWrapper);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateLegacySessionPlaybackState$23$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m402x2ec088c8(androidx.media3.session.PlayerWrapper playerWrapper) {
        this.sessionCompat.setPlaybackState(playerWrapper.createPlaybackStateCompat());
    }

    public void updateLegacySessionPlaybackStateAndQueue(final androidx.media3.session.PlayerWrapper playerWrapper) {
        androidx.media3.common.util.Util.postOrRun(this.sessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m403x245532c1(playerWrapper);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateLegacySessionPlaybackStateAndQueue$24$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m403x245532c1(androidx.media3.session.PlayerWrapper playerWrapper) {
        androidx.media3.common.Timeline currentTimeline;
        this.sessionCompat.setPlaybackState(playerWrapper.createPlaybackStateCompat());
        androidx.media3.session.MediaSessionLegacyStub.ControllerLegacyCbForBroadcast controllerLegacyCbForBroadcast = this.controllerLegacyCbForBroadcast;
        if (playerWrapper.getAvailableCommands().contains(17)) {
            currentTimeline = playerWrapper.getCurrentTimeline();
        } else {
            currentTimeline = androidx.media3.common.Timeline.EMPTY;
        }
        controllerLegacyCbForBroadcast.updateQueue(currentTimeline);
    }

    private void handleMediaRequest(final androidx.media3.common.MediaItem mediaItem, final boolean z) {
        dispatchSessionTaskWithPlayerCommand(31, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda15
            @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
            public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                this.f$0.m381x22e02407(mediaItem, z, controllerInfo);
            }
        }, this.sessionCompat.getCurrentControllerInfo(), false);
    }

    /* JADX INFO: renamed from: lambda$handleMediaRequest$25$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m381x22e02407(androidx.media3.common.MediaItem mediaItem, boolean z, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        com.google.common.util.concurrent.Futures.addCallback(this.sessionImpl.onSetMediaItemsOnHandler(controllerInfo, com.google.common.collect.ImmutableList.of(mediaItem), -1, androidx.media3.common.C.TIME_UNSET), new androidx.media3.session.MediaSessionLegacyStub.AnonymousClass1(controllerInfo, z), com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    /* JADX INFO: renamed from: androidx.media3.session.MediaSessionLegacyStub$1, reason: invalid class name */
    class AnonymousClass1 implements com.google.common.util.concurrent.FutureCallback<androidx.media3.session.MediaSession.MediaItemsWithStartPosition> {
        final /* synthetic */ androidx.media3.session.MediaSession.ControllerInfo val$controller;
        final /* synthetic */ boolean val$play;

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(java.lang.Throwable th) {
        }

        AnonymousClass1(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, boolean z) {
            this.val$controller = controllerInfo;
            this.val$play = z;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onSuccess(final androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
            android.os.Handler applicationHandler = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getApplicationHandler();
            androidx.media3.session.MediaSessionImpl mediaSessionImpl = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl;
            final androidx.media3.session.MediaSession.ControllerInfo controllerInfo = this.val$controller;
            final boolean z = this.val$play;
            androidx.media3.common.util.Util.postOrRun(applicationHandler, mediaSessionImpl.callWithControllerForCurrentRequestSet(controllerInfo, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionLegacyStub$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m404xec13c618(mediaItemsWithStartPosition, z, controllerInfo);
                }
            }));
        }

        /* JADX INFO: renamed from: lambda$onSuccess$0$androidx-media3-session-MediaSessionLegacyStub$1, reason: not valid java name */
        /* synthetic */ void m404xec13c618(androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition, boolean z, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
            androidx.media3.session.PlayerWrapper playerWrapper = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getPlayerWrapper();
            androidx.media3.session.MediaUtils.setMediaItemsWithStartIndexAndPosition(playerWrapper, mediaItemsWithStartPosition);
            int playbackState = playerWrapper.getPlaybackState();
            if (playbackState == 1) {
                playerWrapper.prepareIfCommandAvailable();
            } else if (playbackState == 4) {
                playerWrapper.seekToDefaultPositionIfCommandAvailable();
            }
            if (z) {
                playerWrapper.playIfCommandAvailable();
            }
            androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.onPlayerInteractionFinishedOnHandler(controllerInfo, new androidx.media3.common.Player.Commands.Builder().addAll(31, 2).addIf(1, z).build());
        }
    }

    private void handleOnAddQueueItem(final androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, final int i) {
        if (mediaDescriptionCompat != null) {
            if (i == -1 || i >= 0) {
                dispatchSessionTaskWithPlayerCommand(20, new androidx.media3.session.MediaSessionLegacyStub.SessionTask() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda18
                    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
                    public final void run(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
                        this.f$0.m382xe57ba27d(mediaDescriptionCompat, i, controllerInfo);
                    }
                }, this.sessionCompat.getCurrentControllerInfo(), false);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$handleOnAddQueueItem$26$androidx-media3-session-MediaSessionLegacyStub, reason: not valid java name */
    /* synthetic */ void m382xe57ba27d(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) throws android.os.RemoteException {
        if (android.text.TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
            androidx.media3.common.util.Log.w(TAG, "onAddQueueItem(): Media ID shouldn't be empty");
        } else {
            com.google.common.util.concurrent.Futures.addCallback(this.sessionImpl.onAddMediaItemsOnHandler(controllerInfo, com.google.common.collect.ImmutableList.of(androidx.media3.session.LegacyConversions.convertToMediaItem(mediaDescriptionCompat))), new androidx.media3.session.MediaSessionLegacyStub.AnonymousClass2(controllerInfo, i), com.google.common.util.concurrent.MoreExecutors.directExecutor());
        }
    }

    /* JADX INFO: renamed from: androidx.media3.session.MediaSessionLegacyStub$2, reason: invalid class name */
    class AnonymousClass2 implements com.google.common.util.concurrent.FutureCallback<java.util.List<androidx.media3.common.MediaItem>> {
        final /* synthetic */ androidx.media3.session.MediaSession.ControllerInfo val$controller;
        final /* synthetic */ int val$index;

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(java.lang.Throwable th) {
        }

        AnonymousClass2(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
            this.val$controller = controllerInfo;
            this.val$index = i;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onSuccess(final java.util.List<androidx.media3.common.MediaItem> list) {
            android.os.Handler applicationHandler = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getApplicationHandler();
            androidx.media3.session.MediaSessionImpl mediaSessionImpl = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl;
            final androidx.media3.session.MediaSession.ControllerInfo controllerInfo = this.val$controller;
            final int i = this.val$index;
            androidx.media3.common.util.Util.postOrRun(applicationHandler, mediaSessionImpl.callWithControllerForCurrentRequestSet(controllerInfo, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionLegacyStub$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m405xec13c619(i, list, controllerInfo);
                }
            }));
        }

        /* JADX INFO: renamed from: lambda$onSuccess$0$androidx-media3-session-MediaSessionLegacyStub$2, reason: not valid java name */
        /* synthetic */ void m405xec13c619(int i, java.util.List list, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
            if (i == -1) {
                androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getPlayerWrapper().addMediaItems(list);
            } else {
                androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getPlayerWrapper().addMediaItems(i, list);
            }
            androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.onPlayerInteractionFinishedOnHandler(controllerInfo, new androidx.media3.common.Player.Commands.Builder().add(20).build());
        }
    }

    private static void sendCustomCommandResultWhenReady(final android.os.ResultReceiver resultReceiver, final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> listenableFuture) {
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionLegacyStub$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.session.MediaSessionLegacyStub.lambda$sendCustomCommandResultWhenReady$27(listenableFuture, resultReceiver);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void lambda$sendCustomCommandResultWhenReady$27(com.google.common.util.concurrent.ListenableFuture listenableFuture, android.os.ResultReceiver resultReceiver) {
        androidx.media3.session.SessionResult sessionResult;
        try {
            sessionResult = (androidx.media3.session.SessionResult) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.session.SessionResult) listenableFuture.get(), "SessionResult must not be null");
        } catch (java.lang.InterruptedException e) {
            e = e;
            androidx.media3.common.util.Log.w(TAG, "Custom command failed", e);
            sessionResult = new androidx.media3.session.SessionResult(-1);
        } catch (java.util.concurrent.CancellationException e2) {
            androidx.media3.common.util.Log.w(TAG, "Custom command cancelled", e2);
            sessionResult = new androidx.media3.session.SessionResult(1);
        } catch (java.util.concurrent.ExecutionException e3) {
            e = e3;
            androidx.media3.common.util.Log.w(TAG, "Custom command failed", e);
            sessionResult = new androidx.media3.session.SessionResult(-1);
        }
        resultReceiver.send(sessionResult.resultCode, sessionResult.extras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setMetadata(androidx.media3.session.legacy.MediaSessionCompat mediaSessionCompat, androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
        mediaSessionCompat.setMetadata(mediaMetadataCompat);
    }

    private static void setMediaButtonReceiver(androidx.media3.session.legacy.MediaSessionCompat mediaSessionCompat, android.app.PendingIntent pendingIntent) {
        mediaSessionCompat.setMediaButtonReceiver(pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setQueue(androidx.media3.session.legacy.MediaSessionCompat mediaSessionCompat, java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) {
        mediaSessionCompat.setQueue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueueTitle(androidx.media3.session.legacy.MediaSessionCompat mediaSessionCompat, java.lang.CharSequence charSequence) {
        if (!isQueueEnabled()) {
            charSequence = null;
        }
        mediaSessionCompat.setQueueTitle(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isQueueEnabled() {
        androidx.media3.session.PlayerWrapper playerWrapper = this.sessionImpl.getPlayerWrapper();
        return playerWrapper.getAvailablePlayerCommands().contains(17) && playerWrapper.getAvailableCommands().contains(17);
    }

    private static androidx.media3.common.MediaItem createMediaItemForMediaRequest(java.lang.String str, android.net.Uri uri, java.lang.String str2, android.os.Bundle bundle) {
        androidx.media3.common.MediaItem.Builder builder = new androidx.media3.common.MediaItem.Builder();
        if (str == null) {
            str = "";
        }
        return builder.setMediaId(str).setRequestMetadata(new androidx.media3.common.MediaItem.RequestMetadata.Builder().setMediaUri(uri).setSearchQuery(str2).setExtras(bundle).build()).build();
    }

    private static final class ControllerLegacyCb implements androidx.media3.session.MediaSession.ControllerCb {
        private final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo;

        public ControllerLegacyCb(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.remoteUserInfo = remoteUserInfo;
        }

        public int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(this.remoteUserInfo);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != androidx.media3.session.MediaSessionLegacyStub.ControllerLegacyCb.class) {
                return false;
            }
            return androidx.media3.common.util.Util.areEqual(this.remoteUserInfo, ((androidx.media3.session.MediaSessionLegacyStub.ControllerLegacyCb) obj).remoteUserInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ControllerLegacyCbForBroadcast implements androidx.media3.session.MediaSession.ControllerCb {
        private android.net.Uri lastMediaUri;
        private androidx.media3.common.MediaMetadata lastMediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
        private java.lang.String lastMediaId = "";
        private long lastDurationMs = androidx.media3.common.C.TIME_UNSET;

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onDisconnected(int i) throws android.os.RemoteException {
        }

        public ControllerLegacyCbForBroadcast() {
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onAvailableCommandsChangedFromPlayer(int i, androidx.media3.common.Player.Commands commands) {
            androidx.media3.session.PlayerWrapper playerWrapper = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getPlayerWrapper();
            androidx.media3.session.MediaSessionLegacyStub.this.maybeUpdateFlags(playerWrapper);
            androidx.media3.session.MediaSessionLegacyStub.this.updateLegacySessionPlaybackState(playerWrapper);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPlayerChanged(int i, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.PlayerWrapper playerWrapper2) throws android.os.RemoteException {
            androidx.media3.common.Timeline currentTimelineWithCommandCheck = playerWrapper2.getCurrentTimelineWithCommandCheck();
            if (playerWrapper == null || !androidx.media3.common.util.Util.areEqual(playerWrapper.getCurrentTimelineWithCommandCheck(), currentTimelineWithCommandCheck)) {
                onTimelineChanged(i, currentTimelineWithCommandCheck, 0);
            }
            androidx.media3.common.MediaMetadata playlistMetadataWithCommandCheck = playerWrapper2.getPlaylistMetadataWithCommandCheck();
            if (playerWrapper == null || !androidx.media3.common.util.Util.areEqual(playerWrapper.getPlaylistMetadataWithCommandCheck(), playlistMetadataWithCommandCheck)) {
                onPlaylistMetadataChanged(i, playlistMetadataWithCommandCheck);
            }
            androidx.media3.common.MediaMetadata mediaMetadataWithCommandCheck = playerWrapper2.getMediaMetadataWithCommandCheck();
            if (playerWrapper == null || !androidx.media3.common.util.Util.areEqual(playerWrapper.getMediaMetadataWithCommandCheck(), mediaMetadataWithCommandCheck)) {
                onMediaMetadataChanged(i, mediaMetadataWithCommandCheck);
            }
            if (playerWrapper == null || playerWrapper.getShuffleModeEnabled() != playerWrapper2.getShuffleModeEnabled()) {
                onShuffleModeEnabledChanged(i, playerWrapper2.getShuffleModeEnabled());
            }
            if (playerWrapper == null || playerWrapper.getRepeatMode() != playerWrapper2.getRepeatMode()) {
                onRepeatModeChanged(i, playerWrapper2.getRepeatMode());
            }
            onDeviceInfoChanged(i, playerWrapper2.getDeviceInfo());
            androidx.media3.session.MediaSessionLegacyStub.this.maybeUpdateFlags(playerWrapper2);
            androidx.media3.common.MediaItem currentMediaItemWithCommandCheck = playerWrapper2.getCurrentMediaItemWithCommandCheck();
            if (playerWrapper == null || !androidx.media3.common.util.Util.areEqual(playerWrapper.getCurrentMediaItemWithCommandCheck(), currentMediaItemWithCommandCheck)) {
                onMediaItemTransition(i, currentMediaItemWithCommandCheck, 3);
            } else {
                androidx.media3.session.MediaSessionLegacyStub.this.updateLegacySessionPlaybackState(playerWrapper2);
            }
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPlayerError(int i, androidx.media3.common.PlaybackException playbackException) {
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.updateLegacySessionPlaybackState(mediaSessionLegacyStub.sessionImpl.getPlayerWrapper());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void setCustomLayout(int i, java.util.List<androidx.media3.session.CommandButton> list) {
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.updateLegacySessionPlaybackState(mediaSessionLegacyStub.sessionImpl.getPlayerWrapper());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSessionExtrasChanged(int i, android.os.Bundle bundle) {
            androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setExtras(bundle);
            androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getPlayerWrapper().setLegacyExtras(bundle);
            androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setPlaybackState(androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getPlayerWrapper().createPlaybackStateCompat());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSessionActivityChanged(int i, android.app.PendingIntent pendingIntent) {
            androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setSessionActivity(pendingIntent);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onError(int i, androidx.media3.session.SessionError sessionError) {
            androidx.media3.session.PlayerWrapper playerWrapper = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getPlayerWrapper();
            playerWrapper.setLegacyError(false, androidx.media3.session.LegacyConversions.convertToLegacyErrorCode(sessionError.code), sessionError.message, sessionError.extras);
            androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setPlaybackState(playerWrapper.createPlaybackStateCompat());
            playerWrapper.clearLegacyErrorStatus();
            androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setPlaybackState(playerWrapper.createPlaybackStateCompat());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void sendCustomCommand(int i, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
            androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.sendSessionEvent(sessionCommand.customAction, bundle);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPlayWhenReadyChanged(int i, boolean z, int i2) throws android.os.RemoteException {
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.updateLegacySessionPlaybackState(mediaSessionLegacyStub.sessionImpl.getPlayerWrapper());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPlaybackSuppressionReasonChanged(int i, int i2) throws android.os.RemoteException {
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.updateLegacySessionPlaybackState(mediaSessionLegacyStub.sessionImpl.getPlayerWrapper());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPlaybackStateChanged(int i, int i2, androidx.media3.common.PlaybackException playbackException) throws android.os.RemoteException {
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.updateLegacySessionPlaybackState(mediaSessionLegacyStub.sessionImpl.getPlayerWrapper());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onIsPlayingChanged(int i, boolean z) throws android.os.RemoteException {
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.updateLegacySessionPlaybackState(mediaSessionLegacyStub.sessionImpl.getPlayerWrapper());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPositionDiscontinuity(int i, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i2) throws android.os.RemoteException {
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.updateLegacySessionPlaybackState(mediaSessionLegacyStub.sessionImpl.getPlayerWrapper());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPlaybackParametersChanged(int i, androidx.media3.common.PlaybackParameters playbackParameters) throws android.os.RemoteException {
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.updateLegacySessionPlaybackState(mediaSessionLegacyStub.sessionImpl.getPlayerWrapper());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onMediaItemTransition(int i, androidx.media3.common.MediaItem mediaItem, int i2) throws android.os.RemoteException {
            updateMetadataIfChanged();
            if (mediaItem == null) {
                androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setRatingType(0);
            } else {
                androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setRatingType(androidx.media3.session.LegacyConversions.getRatingCompatStyle(mediaItem.mediaMetadata.userRating));
            }
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.updateLegacySessionPlaybackState(mediaSessionLegacyStub.sessionImpl.getPlayerWrapper());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onMediaMetadataChanged(int i, androidx.media3.common.MediaMetadata mediaMetadata) {
            updateMetadataIfChanged();
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onTimelineChanged(int i, androidx.media3.common.Timeline timeline, int i2) throws android.os.RemoteException {
            updateQueue(timeline);
            updateMetadataIfChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateQueue(final androidx.media3.common.Timeline timeline) {
            if (!androidx.media3.session.MediaSessionLegacyStub.this.isQueueEnabled() || timeline.isEmpty()) {
                androidx.media3.session.MediaSessionLegacyStub.setQueue(androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat, null);
                return;
            }
            final java.util.List<androidx.media3.common.MediaItem> listConvertToMediaItemList = androidx.media3.session.LegacyConversions.convertToMediaItemList(timeline);
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionLegacyStub$ControllerLegacyCbForBroadcast$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m406x58a50959(atomicInteger, listConvertToMediaItemList, arrayList, timeline);
                }
            };
            for (int i = 0; i < listConvertToMediaItemList.size(); i++) {
                androidx.media3.common.MediaMetadata mediaMetadata = listConvertToMediaItemList.get(i).mediaMetadata;
                if (mediaMetadata.artworkData != null) {
                    com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFutureDecodeBitmap = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getBitmapLoader().decodeBitmap(mediaMetadata.artworkData);
                    arrayList.add(listenableFutureDecodeBitmap);
                    android.os.Handler applicationHandler = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getApplicationHandler();
                    java.util.Objects.requireNonNull(applicationHandler);
                    listenableFutureDecodeBitmap.addListener(runnable, new androidx.media3.session.MediaSessionLegacyStub$ControllerLegacyCbForBroadcast$$ExternalSyntheticLambda1(applicationHandler));
                } else {
                    arrayList.add(null);
                    runnable.run();
                }
            }
        }

        /* JADX INFO: renamed from: lambda$updateQueue$0$androidx-media3-session-MediaSessionLegacyStub$ControllerLegacyCbForBroadcast, reason: not valid java name */
        /* synthetic */ void m406x58a50959(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.List list, java.util.List list2, androidx.media3.common.Timeline timeline) {
            if (atomicInteger.incrementAndGet() == list.size()) {
                handleBitmapFuturesAllCompletedAndSetQueue(list2, timeline, list);
            }
        }

        private void handleBitmapFuturesAllCompletedAndSetQueue(java.util.List<com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap>> list, androidx.media3.common.Timeline timeline, java.util.List<androidx.media3.common.MediaItem> list2) {
            android.graphics.Bitmap bitmap;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < list.size(); i++) {
                com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFuture = list.get(i);
                if (listenableFuture != null) {
                    try {
                        bitmap = (android.graphics.Bitmap) com.google.common.util.concurrent.Futures.getDone(listenableFuture);
                    } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
                        androidx.media3.common.util.Log.d(androidx.media3.session.MediaSessionLegacyStub.TAG, "Failed to get bitmap", e);
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                arrayList.add(androidx.media3.session.LegacyConversions.convertToQueueItem(list2.get(i), i, bitmap));
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                androidx.media3.session.MediaSessionLegacyStub.setQueue(androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat, arrayList);
                return;
            }
            java.util.List listTruncateListBySize = androidx.media3.session.MediaUtils.truncateListBySize(arrayList, 262144);
            if (listTruncateListBySize.size() != timeline.getWindowCount()) {
                androidx.media3.common.util.Log.i(androidx.media3.session.MediaSessionLegacyStub.TAG, "Sending " + listTruncateListBySize.size() + " items out of " + timeline.getWindowCount());
            }
            androidx.media3.session.MediaSessionLegacyStub.setQueue(androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat, listTruncateListBySize);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPlaylistMetadataChanged(int i, androidx.media3.common.MediaMetadata mediaMetadata) throws android.os.RemoteException {
            java.lang.CharSequence queueTitle = androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.getController().getQueueTitle();
            java.lang.CharSequence charSequence = mediaMetadata.title;
            if (android.text.TextUtils.equals(queueTitle, charSequence)) {
                return;
            }
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.setQueueTitle(mediaSessionLegacyStub.sessionCompat, charSequence);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onShuffleModeEnabledChanged(int i, boolean z) throws android.os.RemoteException {
            androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setShuffleMode(androidx.media3.session.LegacyConversions.convertToPlaybackStateCompatShuffleMode(z));
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onRepeatModeChanged(int i, int i2) throws android.os.RemoteException {
            androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setRepeatMode(androidx.media3.session.LegacyConversions.convertToPlaybackStateCompatRepeatMode(i2));
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onAudioAttributesChanged(int i, androidx.media3.common.AudioAttributes audioAttributes) {
            if (androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getPlayerWrapper().getDeviceInfo().playbackType == 0) {
                androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setPlaybackToLocal(androidx.media3.session.LegacyConversions.getLegacyStreamType(audioAttributes));
            }
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onDeviceInfoChanged(int i, androidx.media3.common.DeviceInfo deviceInfo) {
            androidx.media3.session.PlayerWrapper playerWrapper = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getPlayerWrapper();
            androidx.media3.session.MediaSessionLegacyStub.this.volumeProviderCompat = playerWrapper.createVolumeProviderCompat();
            if (androidx.media3.session.MediaSessionLegacyStub.this.volumeProviderCompat != null) {
                androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setPlaybackToRemote(androidx.media3.session.MediaSessionLegacyStub.this.volumeProviderCompat);
            } else {
                androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.setPlaybackToLocal(androidx.media3.session.LegacyConversions.getLegacyStreamType(playerWrapper.getAudioAttributesWithCommandCheck()));
            }
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onDeviceVolumeChanged(int i, int i2, boolean z) {
            if (androidx.media3.session.MediaSessionLegacyStub.this.volumeProviderCompat != null) {
                androidx.media3.session.legacy.VolumeProviderCompat volumeProviderCompat = androidx.media3.session.MediaSessionLegacyStub.this.volumeProviderCompat;
                if (z) {
                    i2 = 0;
                }
                volumeProviderCompat.setCurrentVolume(i2);
            }
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPeriodicSessionPositionInfoChanged(int i, androidx.media3.session.SessionPositionInfo sessionPositionInfo, boolean z, boolean z2, int i2) throws android.os.RemoteException {
            androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub = androidx.media3.session.MediaSessionLegacyStub.this;
            mediaSessionLegacyStub.updateLegacySessionPlaybackState(mediaSessionLegacyStub.sessionImpl.getPlayerWrapper());
        }

        private void updateMetadataIfChanged() {
            android.graphics.Bitmap bitmap;
            androidx.media3.session.PlayerWrapper playerWrapper = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getPlayerWrapper();
            androidx.media3.common.MediaItem currentMediaItemWithCommandCheck = playerWrapper.getCurrentMediaItemWithCommandCheck();
            final androidx.media3.common.MediaMetadata mediaMetadataWithCommandCheck = playerWrapper.getMediaMetadataWithCommandCheck();
            final long durationWithCommandCheck = playerWrapper.isCurrentMediaItemLiveWithCommandCheck() ? androidx.media3.common.C.TIME_UNSET : playerWrapper.getDurationWithCommandCheck();
            final java.lang.String str = currentMediaItemWithCommandCheck != null ? currentMediaItemWithCommandCheck.mediaId : "";
            android.net.Uri uri = (currentMediaItemWithCommandCheck == null || currentMediaItemWithCommandCheck.localConfiguration == null) ? null : currentMediaItemWithCommandCheck.localConfiguration.uri;
            if (java.util.Objects.equals(this.lastMediaMetadata, mediaMetadataWithCommandCheck) && java.util.Objects.equals(this.lastMediaId, str) && java.util.Objects.equals(this.lastMediaUri, uri) && this.lastDurationMs == durationWithCommandCheck) {
                return;
            }
            this.lastMediaId = str;
            this.lastMediaUri = uri;
            this.lastMediaMetadata = mediaMetadataWithCommandCheck;
            this.lastDurationMs = durationWithCommandCheck;
            com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFutureLoadBitmapFromMetadata = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getBitmapLoader().loadBitmapFromMetadata(mediaMetadataWithCommandCheck);
            if (listenableFutureLoadBitmapFromMetadata != null) {
                androidx.media3.session.MediaSessionLegacyStub.this.pendingBitmapLoadCallback = null;
                if (!listenableFutureLoadBitmapFromMetadata.isDone()) {
                    final android.net.Uri uri2 = uri;
                    androidx.media3.session.MediaSessionLegacyStub.this.pendingBitmapLoadCallback = new com.google.common.util.concurrent.FutureCallback<android.graphics.Bitmap>() { // from class: androidx.media3.session.MediaSessionLegacyStub.ControllerLegacyCbForBroadcast.1
                        @Override // com.google.common.util.concurrent.FutureCallback
                        public void onSuccess(android.graphics.Bitmap bitmap2) {
                            if (this != androidx.media3.session.MediaSessionLegacyStub.this.pendingBitmapLoadCallback) {
                                return;
                            }
                            androidx.media3.session.MediaSessionLegacyStub.setMetadata(androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat, androidx.media3.session.LegacyConversions.convertToMediaMetadataCompat(mediaMetadataWithCommandCheck, str, uri2, durationWithCommandCheck, bitmap2));
                            androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.onNotificationRefreshRequired();
                        }

                        @Override // com.google.common.util.concurrent.FutureCallback
                        public void onFailure(java.lang.Throwable th) {
                            if (this != androidx.media3.session.MediaSessionLegacyStub.this.pendingBitmapLoadCallback) {
                                return;
                            }
                            androidx.media3.common.util.Log.w(androidx.media3.session.MediaSessionLegacyStub.TAG, androidx.media3.session.MediaSessionLegacyStub.getBitmapLoadErrorMessage(th));
                        }
                    };
                    com.google.common.util.concurrent.FutureCallback futureCallback = androidx.media3.session.MediaSessionLegacyStub.this.pendingBitmapLoadCallback;
                    android.os.Handler applicationHandler = androidx.media3.session.MediaSessionLegacyStub.this.sessionImpl.getApplicationHandler();
                    java.util.Objects.requireNonNull(applicationHandler);
                    com.google.common.util.concurrent.Futures.addCallback(listenableFutureLoadBitmapFromMetadata, futureCallback, new androidx.media3.session.MediaSessionLegacyStub$ControllerLegacyCbForBroadcast$$ExternalSyntheticLambda1(applicationHandler));
                } else {
                    try {
                        bitmap = (android.graphics.Bitmap) com.google.common.util.concurrent.Futures.getDone(listenableFutureLoadBitmapFromMetadata);
                    } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
                        androidx.media3.common.util.Log.w(androidx.media3.session.MediaSessionLegacyStub.TAG, androidx.media3.session.MediaSessionLegacyStub.getBitmapLoadErrorMessage(e));
                        bitmap = null;
                    }
                }
                bitmap = null;
            } else {
                bitmap = null;
            }
            androidx.media3.session.MediaSessionLegacyStub.setMetadata(androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat, androidx.media3.session.LegacyConversions.convertToMediaMetadataCompat(mediaMetadataWithCommandCheck, str, uri, durationWithCommandCheck, bitmap));
        }
    }

    private static class ConnectionTimeoutHandler extends android.os.Handler {
        private static final int MSG_CONNECTION_TIMED_OUT = 1001;
        private final androidx.media3.session.ConnectedControllersManager<androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo> connectedControllersManager;

        public ConnectionTimeoutHandler(android.os.Looper looper, androidx.media3.session.ConnectedControllersManager<androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo> connectedControllersManager) {
            super(looper);
            this.connectedControllersManager = connectedControllersManager;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            androidx.media3.session.MediaSession.ControllerInfo controllerInfo = (androidx.media3.session.MediaSession.ControllerInfo) message.obj;
            if (this.connectedControllersManager.isConnected(controllerInfo)) {
                try {
                    ((androidx.media3.session.MediaSession.ControllerCb) androidx.media3.common.util.Assertions.checkStateNotNull(controllerInfo.getControllerCb())).onDisconnected(0);
                } catch (android.os.RemoteException unused) {
                }
                this.connectedControllersManager.removeController(controllerInfo);
            }
        }

        public void disconnectControllerAfterTimeout(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, long j) {
            removeMessages(1001, controllerInfo);
            sendMessageDelayed(obtainMessage(1001, controllerInfo), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getBitmapLoadErrorMessage(java.lang.Throwable th) {
        return "Failed to load bitmap: " + th.getMessage();
    }

    private static android.content.ComponentName getServiceComponentByAction(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.Intent intent = new android.content.Intent(str);
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        android.content.pm.ResolveInfo resolveInfo = listQueryIntentServices.get(0);
        return new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
    }

    private final class MediaButtonReceiver extends android.content.BroadcastReceiver {
        private MediaButtonReceiver() {
        }

        /* synthetic */ MediaButtonReceiver(androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub, androidx.media3.session.MediaSessionLegacyStub.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            android.view.KeyEvent keyEvent;
            if (androidx.media3.common.util.Util.areEqual(intent.getAction(), "android.intent.action.MEDIA_BUTTON")) {
                android.net.Uri data = intent.getData();
                if (androidx.media3.common.util.Util.areEqual(data, data) && (keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    androidx.media3.session.MediaSessionLegacyStub.this.sessionCompat.getController().dispatchMediaButtonEvent(keyEvent);
                }
            }
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static void setMediaButtonBroadcastReceiver(androidx.media3.session.legacy.MediaSessionCompat mediaSessionCompat, android.content.ComponentName componentName) {
            ((android.media.session.MediaSession) androidx.media3.common.util.Assertions.checkNotNull(mediaSessionCompat.getMediaSession())).setMediaButtonBroadcastReceiver(componentName);
        }
    }
}
