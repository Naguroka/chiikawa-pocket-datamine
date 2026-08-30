package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaSessionServiceLegacyStub extends androidx.media3.session.legacy.MediaBrowserServiceCompat {
    private static final java.lang.String TAG = "MSSLegacyStub";
    private final androidx.media3.session.ConnectedControllersManager<androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo> connectedControllersManager;
    private final androidx.media3.session.legacy.MediaSessionManager manager;
    private final androidx.media3.session.MediaSessionImpl sessionImpl;

    public MediaSessionServiceLegacyStub(androidx.media3.session.MediaSessionImpl mediaSessionImpl) {
        this.manager = androidx.media3.session.legacy.MediaSessionManager.getSessionManager(mediaSessionImpl.getContext());
        this.sessionImpl = mediaSessionImpl;
        this.connectedControllersManager = new androidx.media3.session.ConnectedControllersManager<>(mediaSessionImpl);
    }

    public void initialize(androidx.media3.session.legacy.MediaSessionCompat.Token token) {
        attachToBaseContext(this.sessionImpl.getContext());
        onCreate();
        setSessionToken(token);
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot onGetRoot(java.lang.String str, int i, android.os.Bundle bundle) {
        androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (bundle == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        final androidx.media3.session.MediaSession.ControllerInfo controllerInfoCreateControllerInfo = createControllerInfo(currentBrowserInfo, bundle);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable();
        androidx.media3.common.util.Util.postOrRun(this.sessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionServiceLegacyStub$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m410x22fee84d(atomicReference, controllerInfoCreateControllerInfo, conditionVariable);
            }
        });
        try {
            conditionVariable.block();
            androidx.media3.session.MediaSession.ConnectionResult connectionResult = (androidx.media3.session.MediaSession.ConnectionResult) atomicReference.get();
            if (!connectionResult.isAccepted) {
                return null;
            }
            this.connectedControllersManager.addController(currentBrowserInfo, controllerInfoCreateControllerInfo, connectionResult.availableSessionCommands, connectionResult.availablePlayerCommands);
            return androidx.media3.session.MediaUtils.defaultBrowserRoot;
        } catch (java.lang.InterruptedException e) {
            androidx.media3.common.util.Log.e(TAG, "Couldn't get a result from onConnect", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: lambda$onGetRoot$0$androidx-media3-session-MediaSessionServiceLegacyStub, reason: not valid java name */
    /* synthetic */ void m410x22fee84d(java.util.concurrent.atomic.AtomicReference atomicReference, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.util.ConditionVariable conditionVariable) {
        atomicReference.set(this.sessionImpl.onConnectOnHandler(controllerInfo));
        conditionVariable.open();
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onLoadChildren(java.lang.String str, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result) {
        result.sendResult(null);
    }

    public androidx.media3.session.MediaSession.ControllerInfo createControllerInfo(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, android.os.Bundle bundle) {
        return new androidx.media3.session.MediaSession.ControllerInfo(remoteUserInfo, 0, 0, this.manager.isTrustedForMediaControl(remoteUserInfo), null, bundle);
    }

    public final androidx.media3.session.legacy.MediaSessionManager getMediaSessionManager() {
        return this.manager;
    }

    public final androidx.media3.session.ConnectedControllersManager<androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo> getConnectedControllersManager() {
        return this.connectedControllersManager;
    }
}
