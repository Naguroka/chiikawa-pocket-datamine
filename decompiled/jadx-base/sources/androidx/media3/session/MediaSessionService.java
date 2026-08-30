package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaSessionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "androidx.media3.session.MediaSessionService";
    private static final java.lang.String TAG = "MSessionService";
    private androidx.media3.session.DefaultActionFactory actionFactory;
    private androidx.media3.session.MediaSessionService.Listener listener;
    private androidx.media3.session.MediaNotificationManager mediaNotificationManager;
    private androidx.media3.session.MediaNotification.Provider mediaNotificationProvider;
    private androidx.media3.session.MediaSessionService.MediaSessionServiceStub stub;
    private final java.lang.Object lock = new java.lang.Object();
    private final android.os.Handler mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.Map<java.lang.String, androidx.media3.session.MediaSession> sessions = new androidx.collection.ArrayMap();
    private boolean defaultMethodCalled = false;

    public interface Listener {
        default void onForegroundServiceStartNotAllowedException() {
        }
    }

    public abstract androidx.media3.session.MediaSession onGetSession(androidx.media3.session.MediaSession.ControllerInfo controllerInfo);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        synchronized (this.lock) {
            this.stub = new androidx.media3.session.MediaSessionService.MediaSessionServiceStub(this);
        }
    }

    public final void addSession(final androidx.media3.session.MediaSession mediaSession) {
        androidx.media3.session.MediaSession mediaSession2;
        androidx.media3.common.util.Assertions.checkNotNull(mediaSession, "session must not be null");
        boolean z = true;
        androidx.media3.common.util.Assertions.checkArgument(!mediaSession.isReleased(), "session is already released");
        synchronized (this.lock) {
            mediaSession2 = this.sessions.get(mediaSession.getId());
            if (mediaSession2 != null && mediaSession2 != mediaSession) {
                z = false;
            }
            androidx.media3.common.util.Assertions.checkArgument(z, "Session ID should be unique");
            this.sessions.put(mediaSession.getId(), mediaSession);
        }
        if (mediaSession2 == null) {
            final androidx.media3.session.MediaNotificationManager mediaNotificationManager = getMediaNotificationManager();
            androidx.media3.common.util.Util.postOrRun(this.mainHandler, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m407lambda$addSession$0$androidxmedia3sessionMediaSessionService(mediaNotificationManager, mediaSession);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$addSession$0$androidx-media3-session-MediaSessionService, reason: not valid java name */
    /* synthetic */ void m407lambda$addSession$0$androidxmedia3sessionMediaSessionService(androidx.media3.session.MediaNotificationManager mediaNotificationManager, androidx.media3.session.MediaSession mediaSession) {
        mediaNotificationManager.addSession(mediaSession);
        mediaSession.setListener(new androidx.media3.session.MediaSessionService.MediaSessionListener());
    }

    public final void removeSession(final androidx.media3.session.MediaSession mediaSession) {
        androidx.media3.common.util.Assertions.checkNotNull(mediaSession, "session must not be null");
        synchronized (this.lock) {
            androidx.media3.common.util.Assertions.checkArgument(this.sessions.containsKey(mediaSession.getId()), "session not found");
            this.sessions.remove(mediaSession.getId());
        }
        final androidx.media3.session.MediaNotificationManager mediaNotificationManager = getMediaNotificationManager();
        androidx.media3.common.util.Util.postOrRun(this.mainHandler, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionService$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.session.MediaSessionService.lambda$removeSession$1(mediaNotificationManager, mediaSession);
            }
        });
    }

    static /* synthetic */ void lambda$removeSession$1(androidx.media3.session.MediaNotificationManager mediaNotificationManager, androidx.media3.session.MediaSession mediaSession) {
        mediaNotificationManager.removeSession(mediaSession);
        mediaSession.clearListener();
    }

    public final java.util.List<androidx.media3.session.MediaSession> getSessions() {
        java.util.ArrayList arrayList;
        synchronized (this.lock) {
            arrayList = new java.util.ArrayList(this.sessions.values());
        }
        return arrayList;
    }

    public final boolean isSessionAdded(androidx.media3.session.MediaSession mediaSession) {
        boolean zContainsKey;
        synchronized (this.lock) {
            zContainsKey = this.sessions.containsKey(mediaSession.getId());
        }
        return zContainsKey;
    }

    public final void setListener(androidx.media3.session.MediaSessionService.Listener listener) {
        synchronized (this.lock) {
            this.listener = listener;
        }
    }

    public final void clearListener() {
        synchronized (this.lock) {
            this.listener = null;
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        java.lang.String action;
        androidx.media3.session.MediaSession mediaSessionOnGetSession;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        action.hashCode();
        if (action.equals(SERVICE_INTERFACE)) {
            return getServiceBinder();
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (mediaSessionOnGetSession = onGetSession(androidx.media3.session.MediaSession.ControllerInfo.createLegacyControllerInfo())) == null) {
            return null;
        }
        addSession(mediaSessionOnGetSession);
        return mediaSessionOnGetSession.getLegacyBrowserServiceBinder();
    }

    @Override // android.app.Service
    public int onStartCommand(final android.content.Intent intent, int i, int i2) {
        java.lang.String customAction;
        if (intent == null) {
            return 1;
        }
        androidx.media3.session.DefaultActionFactory actionFactory = getActionFactory();
        android.net.Uri data = intent.getData();
        androidx.media3.session.MediaSession session = data != null ? androidx.media3.session.MediaSession.getSession(data) : null;
        if (actionFactory.isMediaAction(intent)) {
            if (session == null) {
                session = onGetSession(androidx.media3.session.MediaSession.ControllerInfo.createLegacyControllerInfo());
                if (session == null) {
                    return 1;
                }
                addSession(session);
            }
            final androidx.media3.session.MediaSessionImpl impl = session.getImpl();
            impl.getApplicationHandler().post(new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionService$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.session.MediaSessionService.lambda$onStartCommand$2(impl, intent);
                }
            });
        } else {
            if (session == null || !actionFactory.isCustomAction(intent) || (customAction = actionFactory.getCustomAction(intent)) == null) {
                return 1;
            }
            getMediaNotificationManager().onCustomAction(session, customAction, actionFactory.getCustomActionExtras(intent));
        }
        return 1;
    }

    static /* synthetic */ void lambda$onStartCommand$2(androidx.media3.session.MediaSessionImpl mediaSessionImpl, android.content.Intent intent) {
        androidx.media3.session.MediaSession.ControllerInfo mediaNotificationControllerInfo = mediaSessionImpl.getMediaNotificationControllerInfo();
        if (mediaNotificationControllerInfo == null) {
            mediaNotificationControllerInfo = createFallbackMediaButtonCaller(intent);
        }
        if (mediaSessionImpl.onMediaButtonEvent(mediaNotificationControllerInfo, intent)) {
            return;
        }
        androidx.media3.common.util.Log.d(TAG, "Ignored unrecognized media button intent.");
    }

    private static androidx.media3.session.MediaSession.ControllerInfo createFallbackMediaButtonCaller(android.content.Intent intent) {
        android.content.ComponentName component = intent.getComponent();
        return new androidx.media3.session.MediaSession.ControllerInfo(new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo(component != null ? component.getPackageName() : SERVICE_INTERFACE, -1, -1), androidx.media3.common.MediaLibraryInfo.VERSION_INT, 6, false, null, android.os.Bundle.EMPTY);
    }

    public boolean isPlaybackOngoing() {
        return getMediaNotificationManager().isStartedInForeground();
    }

    public void pauseAllPlayersAndStopSelf() {
        java.util.List<androidx.media3.session.MediaSession> sessions = getSessions();
        for (int i = 0; i < sessions.size(); i++) {
            sessions.get(i).getPlayer().setPlayWhenReady(false);
        }
        stopSelf();
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        if (isPlaybackOngoing()) {
            return;
        }
        stopSelf();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        synchronized (this.lock) {
            androidx.media3.session.MediaSessionService.MediaSessionServiceStub mediaSessionServiceStub = this.stub;
            if (mediaSessionServiceStub != null) {
                mediaSessionServiceStub.release();
                this.stub = null;
            }
        }
    }

    @java.lang.Deprecated
    public void onUpdateNotification(androidx.media3.session.MediaSession mediaSession) {
        this.defaultMethodCalled = true;
    }

    public void onUpdateNotification(androidx.media3.session.MediaSession mediaSession, boolean z) {
        onUpdateNotification(mediaSession);
        if (this.defaultMethodCalled) {
            getMediaNotificationManager().updateNotification(mediaSession, z);
        }
    }

    protected final void setMediaNotificationProvider(androidx.media3.session.MediaNotification.Provider provider) {
        androidx.media3.common.util.Assertions.checkNotNull(provider);
        synchronized (this.lock) {
            this.mediaNotificationProvider = provider;
        }
    }

    android.os.IBinder getServiceBinder() {
        android.os.IBinder iBinderAsBinder;
        synchronized (this.lock) {
            iBinderAsBinder = ((androidx.media3.session.MediaSessionService.MediaSessionServiceStub) androidx.media3.common.util.Assertions.checkStateNotNull(this.stub)).asBinder();
        }
        return iBinderAsBinder;
    }

    boolean onUpdateNotificationInternal(androidx.media3.session.MediaSession mediaSession, boolean z) {
        try {
            onUpdateNotification(mediaSession, getMediaNotificationManager().shouldRunInForeground(mediaSession, z));
            return true;
        } catch (java.lang.IllegalStateException e) {
            if (androidx.media3.common.util.Util.SDK_INT >= 31 && androidx.media3.session.MediaSessionService.Api31.instanceOfForegroundServiceStartNotAllowedException(e)) {
                androidx.media3.common.util.Log.e(TAG, "Failed to start foreground", e);
                onForegroundServiceStartNotAllowedException();
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.session.MediaNotificationManager getMediaNotificationManager() {
        androidx.media3.session.MediaNotificationManager mediaNotificationManager;
        synchronized (this.lock) {
            if (this.mediaNotificationManager == null) {
                if (this.mediaNotificationProvider == null) {
                    this.mediaNotificationProvider = new androidx.media3.session.DefaultMediaNotificationProvider.Builder(getApplicationContext()).build();
                }
                this.mediaNotificationManager = new androidx.media3.session.MediaNotificationManager(this, this.mediaNotificationProvider, getActionFactory());
            }
            mediaNotificationManager = this.mediaNotificationManager;
        }
        return mediaNotificationManager;
    }

    private androidx.media3.session.DefaultActionFactory getActionFactory() {
        androidx.media3.session.DefaultActionFactory defaultActionFactory;
        synchronized (this.lock) {
            if (this.actionFactory == null) {
                this.actionFactory = new androidx.media3.session.DefaultActionFactory(this);
            }
            defaultActionFactory = this.actionFactory;
        }
        return defaultActionFactory;
    }

    private androidx.media3.session.MediaSessionService.Listener getListener() {
        androidx.media3.session.MediaSessionService.Listener listener;
        synchronized (this.lock) {
            listener = this.listener;
        }
        return listener;
    }

    private void onForegroundServiceStartNotAllowedException() {
        this.mainHandler.post(new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionService$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m408xf9903c0b();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onForegroundServiceStartNotAllowedException$3$androidx-media3-session-MediaSessionService, reason: not valid java name */
    /* synthetic */ void m408xf9903c0b() {
        androidx.media3.session.MediaSessionService.Listener listener = getListener();
        if (listener != null) {
            listener.onForegroundServiceStartNotAllowedException();
        }
    }

    private final class MediaSessionListener implements androidx.media3.session.MediaSession.Listener {
        private MediaSessionListener() {
        }

        @Override // androidx.media3.session.MediaSession.Listener
        public void onNotificationRefreshRequired(androidx.media3.session.MediaSession mediaSession) {
            androidx.media3.session.MediaSessionService.this.onUpdateNotificationInternal(mediaSession, false);
        }

        @Override // androidx.media3.session.MediaSession.Listener
        public boolean onPlayRequested(androidx.media3.session.MediaSession mediaSession) {
            if (androidx.media3.common.util.Util.SDK_INT < 31 || androidx.media3.common.util.Util.SDK_INT >= 33 || androidx.media3.session.MediaSessionService.this.getMediaNotificationManager().isStartedInForeground()) {
                return true;
            }
            return androidx.media3.session.MediaSessionService.this.onUpdateNotificationInternal(mediaSession, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class MediaSessionServiceStub extends androidx.media3.session.IMediaSessionService.Stub {
        private final android.os.Handler handler;
        private final androidx.media3.session.legacy.MediaSessionManager mediaSessionManager;
        private final java.util.Set<androidx.media3.session.IMediaController> pendingControllers;
        private final java.lang.ref.WeakReference<androidx.media3.session.MediaSessionService> serviceReference;

        public MediaSessionServiceStub(androidx.media3.session.MediaSessionService mediaSessionService) {
            this.serviceReference = new java.lang.ref.WeakReference<>(mediaSessionService);
            android.content.Context applicationContext = mediaSessionService.getApplicationContext();
            this.handler = new android.os.Handler(applicationContext.getMainLooper());
            this.mediaSessionManager = androidx.media3.session.legacy.MediaSessionManager.getSessionManager(applicationContext);
            this.pendingControllers = java.util.Collections.synchronizedSet(new java.util.HashSet());
        }

        @Override // androidx.media3.session.IMediaSessionService
        public void connect(final androidx.media3.session.IMediaController iMediaController, android.os.Bundle bundle) {
            if (iMediaController == null || bundle == null) {
                return;
            }
            try {
                final androidx.media3.session.ConnectionRequest connectionRequestFromBundle = androidx.media3.session.ConnectionRequest.fromBundle(bundle);
                if (this.serviceReference.get() == null) {
                    try {
                        iMediaController.onDisconnected(0);
                        return;
                    } catch (android.os.RemoteException unused) {
                        return;
                    }
                }
                int callingPid = android.os.Binder.getCallingPid();
                int callingUid = android.os.Binder.getCallingUid();
                long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = connectionRequestFromBundle.pid;
                }
                final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo = new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo(connectionRequestFromBundle.packageName, callingPid, callingUid);
                final boolean zIsTrustedForMediaControl = this.mediaSessionManager.isTrustedForMediaControl(remoteUserInfo);
                this.pendingControllers.add(iMediaController);
                try {
                    this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionService$MediaSessionServiceStub$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() throws java.lang.Throwable {
                            this.f$0.m409x7a28fad4(iMediaController, remoteUserInfo, connectionRequestFromBundle, zIsTrustedForMediaControl);
                        }
                    });
                } finally {
                    android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(androidx.media3.session.MediaSessionService.TAG, "Ignoring malformed Bundle for ConnectionRequest", e);
            }
        }

        /* JADX WARN: Code duplicated, block: B:36:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
        /* JADX INFO: renamed from: lambda$connect$0$androidx-media3-session-MediaSessionService$MediaSessionServiceStub, reason: not valid java name */
        /* synthetic */ void m409x7a28fad4(androidx.media3.session.IMediaController iMediaController, androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, androidx.media3.session.ConnectionRequest connectionRequest, boolean z) throws java.lang.Throwable {
            this.pendingControllers.remove(iMediaController);
            boolean z2 = true;
            try {
                androidx.media3.session.MediaSessionService mediaSessionService = this.serviceReference.get();
                if (mediaSessionService != null) {
                    androidx.media3.session.MediaSession.ControllerInfo controllerInfo = new androidx.media3.session.MediaSession.ControllerInfo(remoteUserInfo, connectionRequest.libraryVersion, connectionRequest.controllerInterfaceVersion, z, new androidx.media3.session.MediaSessionStub.Controller2Cb(iMediaController), connectionRequest.connectionHints);
                    try {
                        androidx.media3.session.MediaSession mediaSessionOnGetSession = mediaSessionService.onGetSession(controllerInfo);
                        if (mediaSessionOnGetSession != null) {
                            mediaSessionService.addSession(mediaSessionOnGetSession);
                            try {
                                mediaSessionOnGetSession.handleControllerConnectionFromService(iMediaController, controllerInfo);
                                z2 = false;
                            } catch (java.lang.Exception e) {
                                e = e;
                                z2 = false;
                                androidx.media3.common.util.Log.w(androidx.media3.session.MediaSessionService.TAG, "Failed to add a session to session service", e);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                z2 = false;
                            }
                            if (z2) {
                                try {
                                    iMediaController.onDisconnected(0);
                                    return;
                                } catch (android.os.RemoteException unused) {
                                    return;
                                }
                            }
                            return;
                        }
                        try {
                            iMediaController.onDisconnected(0);
                            return;
                        } catch (android.os.RemoteException unused2) {
                            return;
                        }
                    } catch (java.lang.Exception e2) {
                        e = e2;
                    }
                    androidx.media3.common.util.Log.w(androidx.media3.session.MediaSessionService.TAG, "Failed to add a session to session service", e);
                    if (z2) {
                        iMediaController.onDisconnected(0);
                        return;
                    }
                    return;
                }
                try {
                    iMediaController.onDisconnected(0);
                    return;
                } catch (android.os.RemoteException unused3) {
                    return;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            if (z2) {
                try {
                    iMediaController.onDisconnected(0);
                } catch (android.os.RemoteException unused4) {
                }
            }
            throw th;
        }

        public void release() {
            this.serviceReference.clear();
            this.handler.removeCallbacksAndMessages(null);
            java.util.Iterator<androidx.media3.session.IMediaController> it = this.pendingControllers.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onDisconnected(0);
                } catch (android.os.RemoteException unused) {
                }
            }
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static boolean instanceOfForegroundServiceStartNotAllowedException(java.lang.IllegalStateException illegalStateException) {
            return illegalStateException instanceof android.app.ForegroundServiceStartNotAllowedException;
        }
    }
}
