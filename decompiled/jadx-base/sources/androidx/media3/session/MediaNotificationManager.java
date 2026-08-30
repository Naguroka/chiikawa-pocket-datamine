package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class MediaNotificationManager {
    private static final java.lang.String TAG = "MediaNtfMng";
    private final androidx.media3.session.MediaNotification.ActionFactory actionFactory;
    private final java.util.Map<androidx.media3.session.MediaSession, com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaController>> controllerMap;
    private final java.util.concurrent.Executor mainExecutor;
    private androidx.media3.session.MediaNotification mediaNotification;
    private final androidx.media3.session.MediaNotification.Provider mediaNotificationProvider;
    private final androidx.media3.session.MediaSessionService mediaSessionService;
    private final androidx.core.app.NotificationManagerCompat notificationManagerCompat;
    private final android.content.Intent startSelfIntent;
    private boolean startedInForeground;
    private int totalNotificationCount;

    public MediaNotificationManager(androidx.media3.session.MediaSessionService mediaSessionService, androidx.media3.session.MediaNotification.Provider provider, androidx.media3.session.MediaNotification.ActionFactory actionFactory) {
        this.mediaSessionService = mediaSessionService;
        this.mediaNotificationProvider = provider;
        this.actionFactory = actionFactory;
        this.notificationManagerCompat = androidx.core.app.NotificationManagerCompat.from(mediaSessionService);
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.mainExecutor = new java.util.concurrent.Executor() { // from class: androidx.media3.session.MediaNotificationManager$$ExternalSyntheticLambda7
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                androidx.media3.common.util.Util.postOrRun(handler, runnable);
            }
        };
        this.startSelfIntent = new android.content.Intent(mediaSessionService, mediaSessionService.getClass());
        this.controllerMap = new java.util.HashMap();
        this.startedInForeground = false;
    }

    public void addSession(final androidx.media3.session.MediaSession mediaSession) {
        if (this.controllerMap.containsKey(mediaSession)) {
            return;
        }
        final androidx.media3.session.MediaNotificationManager.MediaControllerListener mediaControllerListener = new androidx.media3.session.MediaNotificationManager.MediaControllerListener(this.mediaSessionService, mediaSession);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean(androidx.media3.session.MediaController.KEY_MEDIA_NOTIFICATION_CONTROLLER_FLAG, true);
        final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaController> listenableFutureBuildAsync = new androidx.media3.session.MediaController.Builder(this.mediaSessionService, mediaSession.getToken()).setConnectionHints(bundle).setListener(mediaControllerListener).setApplicationLooper(android.os.Looper.getMainLooper()).buildAsync();
        this.controllerMap.put(mediaSession, listenableFutureBuildAsync);
        listenableFutureBuildAsync.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaNotificationManager$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m353x67573ed4(listenableFutureBuildAsync, mediaControllerListener, mediaSession);
            }
        }, this.mainExecutor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lambda$addSession$1$androidx-media3-session-MediaNotificationManager, reason: not valid java name */
    /* synthetic */ void m353x67573ed4(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.media3.session.MediaNotificationManager.MediaControllerListener mediaControllerListener, androidx.media3.session.MediaSession mediaSession) {
        try {
            androidx.media3.session.MediaController mediaController = (androidx.media3.session.MediaController) listenableFuture.get(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
            mediaControllerListener.onConnected(shouldShowNotification(mediaSession));
            mediaController.addListener(mediaControllerListener);
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
            this.mediaSessionService.removeSession(mediaSession);
        }
    }

    public void removeSession(androidx.media3.session.MediaSession mediaSession) {
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaController> listenableFutureRemove = this.controllerMap.remove(mediaSession);
        if (listenableFutureRemove != null) {
            androidx.media3.session.MediaController.releaseFuture(listenableFutureRemove);
        }
    }

    public void onCustomAction(final androidx.media3.session.MediaSession mediaSession, final java.lang.String str, final android.os.Bundle bundle) {
        final androidx.media3.session.MediaController connectedControllerForSession = getConnectedControllerForSession(mediaSession);
        if (connectedControllerForSession == null) {
            return;
        }
        androidx.media3.common.util.Util.postOrRun(new android.os.Handler(mediaSession.getPlayer().getApplicationLooper()), new java.lang.Runnable() { // from class: androidx.media3.session.MediaNotificationManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m355x54793c21(mediaSession, str, bundle, connectedControllerForSession);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onCustomAction$3$androidx-media3-session-MediaNotificationManager, reason: not valid java name */
    /* synthetic */ void m355x54793c21(androidx.media3.session.MediaSession mediaSession, final java.lang.String str, final android.os.Bundle bundle, final androidx.media3.session.MediaController mediaController) {
        if (this.mediaNotificationProvider.handleCustomCommand(mediaSession, str, bundle)) {
            return;
        }
        this.mainExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.session.MediaNotificationManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m354x62cf9602(mediaController, str, bundle);
            }
        });
    }

    public void updateNotification(final androidx.media3.session.MediaSession mediaSession, final boolean z) {
        androidx.media3.session.MediaController mediaController;
        com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableListOf;
        if (!this.mediaSessionService.isSessionAdded(mediaSession) || !shouldShowNotification(mediaSession)) {
            maybeStopForegroundService(true);
            return;
        }
        final int i = this.totalNotificationCount + 1;
        this.totalNotificationCount = i;
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaController> listenableFuture = this.controllerMap.get(mediaSession);
        if (listenableFuture == null || !listenableFuture.isDone()) {
            mediaController = null;
        } else {
            try {
                mediaController = (androidx.media3.session.MediaController) com.google.common.util.concurrent.Futures.getDone(listenableFuture);
            } catch (java.util.concurrent.ExecutionException unused) {
                mediaController = null;
            }
        }
        if (mediaController != null) {
            immutableListOf = mediaController.getCustomLayout();
        } else {
            immutableListOf = com.google.common.collect.ImmutableList.of();
        }
        final com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList = immutableListOf;
        final androidx.media3.session.MediaNotification.Provider.Callback callback = new androidx.media3.session.MediaNotification.Provider.Callback() { // from class: androidx.media3.session.MediaNotificationManager$$ExternalSyntheticLambda2
            @Override // androidx.media3.session.MediaNotification.Provider.Callback
            public final void onNotificationChanged(androidx.media3.session.MediaNotification mediaNotification) {
                this.f$0.m357xb22eb051(i, mediaSession, mediaNotification);
            }
        };
        androidx.media3.common.util.Util.postOrRun(new android.os.Handler(mediaSession.getPlayer().getApplicationLooper()), new java.lang.Runnable() { // from class: androidx.media3.session.MediaNotificationManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m359x9581fc8f(mediaSession, immutableList, callback, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateNotification$5$androidx-media3-session-MediaNotificationManager, reason: not valid java name */
    /* synthetic */ void m357xb22eb051(final int i, final androidx.media3.session.MediaSession mediaSession, final androidx.media3.session.MediaNotification mediaNotification) {
        this.mainExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.session.MediaNotificationManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m356xc0850a32(i, mediaSession, mediaNotification);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateNotification$7$androidx-media3-session-MediaNotificationManager, reason: not valid java name */
    /* synthetic */ void m359x9581fc8f(final androidx.media3.session.MediaSession mediaSession, com.google.common.collect.ImmutableList immutableList, androidx.media3.session.MediaNotification.Provider.Callback callback, final boolean z) {
        final androidx.media3.session.MediaNotification mediaNotificationCreateNotification = this.mediaNotificationProvider.createNotification(mediaSession, immutableList, this.actionFactory, callback);
        this.mainExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.session.MediaNotificationManager$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m358xa3d85670(mediaSession, mediaNotificationCreateNotification, z);
            }
        });
    }

    public boolean isStartedInForeground() {
        return this.startedInForeground;
    }

    boolean shouldRunInForeground(androidx.media3.session.MediaSession mediaSession, boolean z) {
        androidx.media3.session.MediaController connectedControllerForSession = getConnectedControllerForSession(mediaSession);
        return connectedControllerForSession != null && (connectedControllerForSession.getPlayWhenReady() || z) && (connectedControllerForSession.getPlaybackState() == 3 || connectedControllerForSession.getPlaybackState() == 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onNotificationUpdated, reason: merged with bridge method [inline-methods] */
    public void m356xc0850a32(int i, androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaNotification mediaNotification) {
        if (i == this.totalNotificationCount) {
            m358xa3d85670(mediaSession, mediaNotification, shouldRunInForeground(mediaSession, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateNotificationInternal, reason: merged with bridge method [inline-methods] */
    public void m358xa3d85670(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaNotification mediaNotification, boolean z) {
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            mediaNotification.notification.extras.putParcelable(androidx.core.app.NotificationCompat.EXTRA_MEDIA_SESSION, (android.media.session.MediaSession.Token) mediaSession.getSessionCompat().getSessionToken().getToken());
        }
        this.mediaNotification = mediaNotification;
        if (z) {
            startForeground(mediaNotification);
        } else {
            this.notificationManagerCompat.notify(mediaNotification.notificationId, mediaNotification.notification);
            maybeStopForegroundService(false);
        }
    }

    private void maybeStopForegroundService(boolean z) {
        androidx.media3.session.MediaNotification mediaNotification;
        java.util.List<androidx.media3.session.MediaSession> sessions = this.mediaSessionService.getSessions();
        for (int i = 0; i < sessions.size(); i++) {
            if (shouldRunInForeground(sessions.get(i), false)) {
                return;
            }
        }
        stopForeground(z);
        if (!z || (mediaNotification = this.mediaNotification) == null) {
            return;
        }
        this.notificationManagerCompat.cancel(mediaNotification.notificationId);
        this.totalNotificationCount++;
        this.mediaNotification = null;
    }

    private boolean shouldShowNotification(androidx.media3.session.MediaSession mediaSession) {
        androidx.media3.session.MediaController connectedControllerForSession = getConnectedControllerForSession(mediaSession);
        return (connectedControllerForSession == null || connectedControllerForSession.getCurrentTimeline().isEmpty() || connectedControllerForSession.getPlaybackState() == 1) ? false : true;
    }

    private androidx.media3.session.MediaController getConnectedControllerForSession(androidx.media3.session.MediaSession mediaSession) {
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaController> listenableFuture = this.controllerMap.get(mediaSession);
        if (listenableFuture == null || !listenableFuture.isDone()) {
            return null;
        }
        try {
            return (androidx.media3.session.MediaController) com.google.common.util.concurrent.Futures.getDone(listenableFuture);
        } catch (java.util.concurrent.ExecutionException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendCustomCommandIfCommandIsAvailable, reason: merged with bridge method [inline-methods] */
    public void m354x62cf9602(androidx.media3.session.MediaController mediaController, final java.lang.String str, android.os.Bundle bundle) {
        androidx.media3.session.SessionCommand next;
        com.google.common.collect.UnmodifiableIterator<androidx.media3.session.SessionCommand> it = mediaController.getAvailableSessionCommands().commands.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.commandCode == 0 && next.customAction.equals(str)) {
                break;
            }
        }
        if (next == null || !mediaController.getAvailableSessionCommands().contains(next)) {
            return;
        }
        com.google.common.util.concurrent.Futures.addCallback(mediaController.sendCustomCommand(new androidx.media3.session.SessionCommand(str, bundle), android.os.Bundle.EMPTY), new com.google.common.util.concurrent.FutureCallback<androidx.media3.session.SessionResult>() { // from class: androidx.media3.session.MediaNotificationManager.1
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(androidx.media3.session.SessionResult sessionResult) {
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.media3.common.util.Log.w(androidx.media3.session.MediaNotificationManager.TAG, "custom command " + str + " produced an error: " + th.getMessage(), th);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class MediaControllerListener implements androidx.media3.session.MediaController.Listener, androidx.media3.common.Player.Listener {
        private final androidx.media3.session.MediaSessionService mediaSessionService;
        private final androidx.media3.session.MediaSession session;

        public MediaControllerListener(androidx.media3.session.MediaSessionService mediaSessionService, androidx.media3.session.MediaSession mediaSession) {
            this.mediaSessionService = mediaSessionService;
            this.session = mediaSession;
        }

        public void onConnected(boolean z) {
            if (z) {
                this.mediaSessionService.onUpdateNotificationInternal(this.session, false);
            }
        }

        @Override // androidx.media3.session.MediaController.Listener
        public void onCustomLayoutChanged(androidx.media3.session.MediaController mediaController, java.util.List<androidx.media3.session.CommandButton> list) {
            this.mediaSessionService.onUpdateNotificationInternal(this.session, false);
        }

        @Override // androidx.media3.session.MediaController.Listener
        public void onAvailableSessionCommandsChanged(androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionCommands sessionCommands) {
            this.mediaSessionService.onUpdateNotificationInternal(this.session, false);
        }

        @Override // androidx.media3.session.MediaController.Listener
        public void onDisconnected(androidx.media3.session.MediaController mediaController) {
            if (this.mediaSessionService.isSessionAdded(this.session)) {
                this.mediaSessionService.removeSession(this.session);
            }
            this.mediaSessionService.onUpdateNotificationInternal(this.session, false);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
            if (events.containsAny(4, 5, 14, 0)) {
                this.mediaSessionService.onUpdateNotificationInternal(this.session, false);
            }
        }
    }

    private void startForeground(androidx.media3.session.MediaNotification mediaNotification) {
        androidx.core.content.ContextCompat.startForegroundService(this.mediaSessionService, this.startSelfIntent);
        androidx.media3.common.util.Util.setForegroundServiceNotification(this.mediaSessionService, mediaNotification.notificationId, mediaNotification.notification, 2, "mediaPlayback");
        this.startedInForeground = true;
    }

    private void stopForeground(boolean z) {
        if (androidx.media3.common.util.Util.SDK_INT >= 24) {
            androidx.media3.session.MediaNotificationManager.Api24.stopForeground(this.mediaSessionService, z);
        } else {
            this.mediaSessionService.stopForeground(z || androidx.media3.common.util.Util.SDK_INT < 21);
        }
        this.startedInForeground = false;
    }

    private static class Api24 {
        public static void stopForeground(androidx.media3.session.MediaSessionService mediaSessionService, boolean z) {
            mediaSessionService.stopForeground(z ? 1 : 2);
        }

        private Api24() {
        }
    }
}
