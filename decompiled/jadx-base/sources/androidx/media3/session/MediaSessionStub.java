package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class MediaSessionStub extends androidx.media3.session.IMediaSession.Stub {
    private static final java.lang.String TAG = "MediaSessionStub";
    public static final int UNKNOWN_SEQUENCE_NUMBER = Integer.MIN_VALUE;
    public static final int VERSION_INT = 4;
    private final androidx.media3.session.ConnectedControllersManager<android.os.IBinder> connectedControllersManager;
    private int nextUniqueTrackGroupIdPrefix;
    private final java.lang.ref.WeakReference<androidx.media3.session.MediaSessionImpl> sessionImpl;
    private final androidx.media3.session.legacy.MediaSessionManager sessionManager;
    private final java.util.Set<androidx.media3.session.MediaSession.ControllerInfo> pendingControllers = java.util.Collections.synchronizedSet(new java.util.HashSet());
    private com.google.common.collect.ImmutableBiMap<androidx.media3.common.TrackGroup, java.lang.String> trackGroupIdMap = com.google.common.collect.ImmutableBiMap.of();

    /* JADX INFO: Access modifiers changed from: private */
    interface ControllerPlayerTask {
        void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface MediaItemPlayerTask {
        void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List<androidx.media3.common.MediaItem> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface MediaItemsWithStartPositionPlayerTask {
        void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface SessionTask<T, K extends androidx.media3.session.MediaSessionImpl> {
        T run(K k, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i);
    }

    public MediaSessionStub(androidx.media3.session.MediaSessionImpl mediaSessionImpl) {
        this.sessionImpl = new java.lang.ref.WeakReference<>(mediaSessionImpl);
        this.sessionManager = androidx.media3.session.legacy.MediaSessionManager.getSessionManager(mediaSessionImpl.getContext());
        this.connectedControllersManager = new androidx.media3.session.ConnectedControllersManager<>(mediaSessionImpl);
    }

    public androidx.media3.session.ConnectedControllersManager<android.os.IBinder> getConnectedControllersManager() {
        return this.connectedControllersManager;
    }

    private static void sendSessionResult(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i, androidx.media3.session.SessionResult sessionResult) {
        try {
            ((androidx.media3.session.MediaSession.ControllerCb) androidx.media3.common.util.Assertions.checkStateNotNull(controllerInfo.getControllerCb())).onSessionResult(i, sessionResult);
        } catch (android.os.RemoteException e) {
            androidx.media3.common.util.Log.w(TAG, "Failed to send result to controller " + controllerInfo, e);
        }
    }

    private static <K extends androidx.media3.session.MediaSessionImpl> androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>, K> sendSessionResultSuccess(final androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper> consumer) {
        return sendSessionResultSuccess(new androidx.media3.session.MediaSessionStub.ControllerPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda25
            @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
            public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
                consumer.accept(playerWrapper);
            }
        });
    }

    private static <K extends androidx.media3.session.MediaSessionImpl> androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>, K> sendSessionResultSuccess(final androidx.media3.session.MediaSessionStub.ControllerPlayerTask controllerPlayerTask) {
        return new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda18
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
                return androidx.media3.session.MediaSessionStub.lambda$sendSessionResultSuccess$1(controllerPlayerTask, mediaSessionImpl, controllerInfo, i);
            }
        };
    }

    static /* synthetic */ com.google.common.util.concurrent.ListenableFuture lambda$sendSessionResultSuccess$1(androidx.media3.session.MediaSessionStub.ControllerPlayerTask controllerPlayerTask, androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        if (mediaSessionImpl.isReleased()) {
            return com.google.common.util.concurrent.Futures.immediateVoidFuture();
        }
        controllerPlayerTask.run(mediaSessionImpl.getPlayerWrapper(), controllerInfo);
        sendSessionResult(controllerInfo, i, new androidx.media3.session.SessionResult(0));
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    private static <K extends androidx.media3.session.MediaSessionImpl> androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>, K> sendSessionResultWhenReady(final androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult>, K> sessionTask) {
        return new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda39
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
                return androidx.media3.session.MediaSessionStub.handleSessionTaskWhenReady(mediaSessionImpl, controllerInfo, i, sessionTask, new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda35
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        androidx.media3.session.MediaSessionStub.lambda$sendSessionResultWhenReady$2(controllerInfo, i, (com.google.common.util.concurrent.ListenableFuture) obj);
                    }
                });
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void lambda$sendSessionResultWhenReady$2(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        androidx.media3.session.SessionResult sessionResult;
        int i2;
        try {
            sessionResult = (androidx.media3.session.SessionResult) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.session.SessionResult) listenableFuture.get(), "SessionResult must not be null");
        } catch (java.lang.InterruptedException e) {
            e = e;
            androidx.media3.common.util.Log.w(TAG, "Session operation failed", e);
            if (e.getCause() instanceof java.lang.UnsupportedOperationException) {
                i2 = -6;
            } else {
                i2 = -1;
            }
            sessionResult = new androidx.media3.session.SessionResult(i2);
        } catch (java.util.concurrent.CancellationException e2) {
            androidx.media3.common.util.Log.w(TAG, "Session operation cancelled", e2);
            sessionResult = new androidx.media3.session.SessionResult(1);
        } catch (java.util.concurrent.ExecutionException e3) {
            e = e3;
            androidx.media3.common.util.Log.w(TAG, "Session operation failed", e);
            if (e.getCause() instanceof java.lang.UnsupportedOperationException) {
                i2 = -6;
            } else {
                i2 = -1;
            }
            sessionResult = new androidx.media3.session.SessionResult(i2);
        }
        sendSessionResult(controllerInfo, i, sessionResult);
    }

    private static <K extends androidx.media3.session.MediaSessionImpl> androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult>, K> handleMediaItemsWhenReady(final androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.media3.common.MediaItem>>, K> sessionTask, final androidx.media3.session.MediaSessionStub.MediaItemPlayerTask mediaItemPlayerTask) {
        return new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda47
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
                return androidx.media3.session.MediaSessionStub.lambda$handleMediaItemsWhenReady$6(sessionTask, mediaItemPlayerTask, mediaSessionImpl, controllerInfo, i);
            }
        };
    }

    static /* synthetic */ com.google.common.util.concurrent.ListenableFuture lambda$handleMediaItemsWhenReady$6(androidx.media3.session.MediaSessionStub.SessionTask sessionTask, final androidx.media3.session.MediaSessionStub.MediaItemPlayerTask mediaItemPlayerTask, final androidx.media3.session.MediaSessionImpl mediaSessionImpl, final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        if (mediaSessionImpl.isReleased()) {
            return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-100));
        }
        return androidx.media3.common.util.Util.transformFutureAsync((com.google.common.util.concurrent.ListenableFuture) sessionTask.run(mediaSessionImpl, controllerInfo, i), new com.google.common.util.concurrent.AsyncFunction() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda52
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                androidx.media3.session.MediaSessionImpl mediaSessionImpl2 = mediaSessionImpl;
                androidx.media3.session.MediaSession.ControllerInfo controllerInfo2 = controllerInfo;
                return androidx.media3.common.util.Util.postOrRunWithCompletion(mediaSessionImpl2.getApplicationHandler(), mediaSessionImpl2.callWithControllerForCurrentRequestSet(controllerInfo2, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda72
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.session.MediaSessionStub.lambda$handleMediaItemsWhenReady$4(mediaSessionImpl2, mediaItemPlayerTask, controllerInfo2, list);
                    }
                }), new androidx.media3.session.SessionResult(0));
            }
        });
    }

    static /* synthetic */ void lambda$handleMediaItemsWhenReady$4(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSessionStub.MediaItemPlayerTask mediaItemPlayerTask, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
        if (mediaSessionImpl.isReleased()) {
            return;
        }
        mediaItemPlayerTask.run(mediaSessionImpl.getPlayerWrapper(), controllerInfo, list);
    }

    private static <K extends androidx.media3.session.MediaSessionImpl> androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult>, K> handleMediaItemsWithStartPositionWhenReady(final androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaSession.MediaItemsWithStartPosition>, K> sessionTask, final androidx.media3.session.MediaSessionStub.MediaItemsWithStartPositionPlayerTask mediaItemsWithStartPositionPlayerTask) {
        return new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda59
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
                return androidx.media3.session.MediaSessionStub.lambda$handleMediaItemsWithStartPositionWhenReady$9(sessionTask, mediaItemsWithStartPositionPlayerTask, mediaSessionImpl, controllerInfo, i);
            }
        };
    }

    static /* synthetic */ com.google.common.util.concurrent.ListenableFuture lambda$handleMediaItemsWithStartPositionWhenReady$9(androidx.media3.session.MediaSessionStub.SessionTask sessionTask, final androidx.media3.session.MediaSessionStub.MediaItemsWithStartPositionPlayerTask mediaItemsWithStartPositionPlayerTask, final androidx.media3.session.MediaSessionImpl mediaSessionImpl, final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        if (mediaSessionImpl.isReleased()) {
            return com.google.common.util.concurrent.Futures.immediateFuture(new androidx.media3.session.SessionResult(-100));
        }
        return androidx.media3.common.util.Util.transformFutureAsync((com.google.common.util.concurrent.ListenableFuture) sessionTask.run(mediaSessionImpl, controllerInfo, i), new com.google.common.util.concurrent.AsyncFunction() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda11
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                androidx.media3.session.MediaSessionImpl mediaSessionImpl2 = mediaSessionImpl;
                return androidx.media3.common.util.Util.postOrRunWithCompletion(mediaSessionImpl2.getApplicationHandler(), mediaSessionImpl2.callWithControllerForCurrentRequestSet(controllerInfo, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda32
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.session.MediaSessionStub.lambda$handleMediaItemsWithStartPositionWhenReady$7(mediaSessionImpl2, mediaItemsWithStartPositionPlayerTask, mediaItemsWithStartPosition);
                    }
                }), new androidx.media3.session.SessionResult(0));
            }
        });
    }

    static /* synthetic */ void lambda$handleMediaItemsWithStartPositionWhenReady$7(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSessionStub.MediaItemsWithStartPositionPlayerTask mediaItemsWithStartPositionPlayerTask, androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
        if (mediaSessionImpl.isReleased()) {
            return;
        }
        mediaItemsWithStartPositionPlayerTask.run(mediaSessionImpl.getPlayerWrapper(), mediaItemsWithStartPosition);
    }

    private static void sendLibraryResult(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i, androidx.media3.session.LibraryResult<?> libraryResult) {
        try {
            ((androidx.media3.session.MediaSession.ControllerCb) androidx.media3.common.util.Assertions.checkStateNotNull(controllerInfo.getControllerCb())).onLibraryResult(i, libraryResult);
        } catch (android.os.RemoteException e) {
            androidx.media3.common.util.Log.w(TAG, "Failed to send result to browser " + controllerInfo, e);
        }
    }

    private static <V, K extends androidx.media3.session.MediaLibrarySessionImpl> androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>, K> sendLibraryResultWhenReady(final androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<V>>, K> sessionTask) {
        return new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda79
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
                return androidx.media3.session.MediaSessionStub.handleSessionTaskWhenReady((androidx.media3.session.MediaLibrarySessionImpl) mediaSessionImpl, controllerInfo, i, sessionTask, new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda33
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        androidx.media3.session.MediaSessionStub.lambda$sendLibraryResultWhenReady$10(controllerInfo, i, (com.google.common.util.concurrent.ListenableFuture) obj);
                    }
                });
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void lambda$sendLibraryResultWhenReady$10(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        androidx.media3.session.LibraryResult libraryResultOfError;
        try {
            libraryResultOfError = (androidx.media3.session.LibraryResult) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.session.LibraryResult) listenableFuture.get(), "LibraryResult must not be null");
        } catch (java.lang.InterruptedException e) {
            e = e;
            androidx.media3.common.util.Log.w(TAG, "Library operation failed", e);
            libraryResultOfError = androidx.media3.session.LibraryResult.ofError(-1);
        } catch (java.util.concurrent.CancellationException e2) {
            androidx.media3.common.util.Log.w(TAG, "Library operation cancelled", e2);
            libraryResultOfError = androidx.media3.session.LibraryResult.ofError(1);
        } catch (java.util.concurrent.ExecutionException e3) {
            e = e3;
            androidx.media3.common.util.Log.w(TAG, "Library operation failed", e);
            libraryResultOfError = androidx.media3.session.LibraryResult.ofError(-1);
        }
        sendLibraryResult(controllerInfo, i, libraryResultOfError);
    }

    private <K extends androidx.media3.session.MediaSessionImpl> void queueSessionTaskWithPlayerCommand(androidx.media3.session.IMediaController iMediaController, int i, int i2, androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>, K> sessionTask) {
        androidx.media3.session.MediaSession.ControllerInfo controller = this.connectedControllersManager.getController(iMediaController.asBinder());
        if (controller != null) {
            queueSessionTaskWithPlayerCommandForControllerInfo(controller, i, i2, sessionTask);
        }
    }

    private <K extends androidx.media3.session.MediaSessionImpl> void queueSessionTaskWithPlayerCommandForControllerInfo(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final int i, final int i2, final androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>, K> sessionTask) {
        long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
        try {
            final androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
            if (mediaSessionImpl != null && !mediaSessionImpl.isReleased()) {
                androidx.media3.common.util.Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m417x89a6a664(controllerInfo, i2, i, mediaSessionImpl, sessionTask);
                    }
                });
            }
        } finally {
            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    /* JADX INFO: renamed from: lambda$queueSessionTaskWithPlayerCommandForControllerInfo$14$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m417x89a6a664(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i, final int i2, final androidx.media3.session.MediaSessionImpl mediaSessionImpl, final androidx.media3.session.MediaSessionStub.SessionTask sessionTask) {
        if (!this.connectedControllersManager.isPlayerCommandAvailable(controllerInfo, i)) {
            sendSessionResult(controllerInfo, i2, new androidx.media3.session.SessionResult(-4));
            return;
        }
        int iOnPlayerCommandRequestOnHandler = mediaSessionImpl.onPlayerCommandRequestOnHandler(controllerInfo, i);
        if (iOnPlayerCommandRequestOnHandler != 0) {
            sendSessionResult(controllerInfo, i2, new androidx.media3.session.SessionResult(iOnPlayerCommandRequestOnHandler));
        } else if (i == 27) {
            mediaSessionImpl.callWithControllerForCurrentRequestSet(controllerInfo, new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda54
                @Override // java.lang.Runnable
                public final void run() {
                    sessionTask.run(mediaSessionImpl, controllerInfo, i2);
                }
            }).run();
            this.connectedControllersManager.addToCommandQueue(controllerInfo, i, new androidx.media3.session.ConnectedControllersManager.AsyncCommand() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda56
                @Override // androidx.media3.session.ConnectedControllersManager.AsyncCommand
                public final com.google.common.util.concurrent.ListenableFuture run() {
                    return com.google.common.util.concurrent.Futures.immediateVoidFuture();
                }
            });
        } else {
            this.connectedControllersManager.addToCommandQueue(controllerInfo, i, new androidx.media3.session.ConnectedControllersManager.AsyncCommand() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda57
                @Override // androidx.media3.session.ConnectedControllersManager.AsyncCommand
                public final com.google.common.util.concurrent.ListenableFuture run() {
                    return androidx.media3.session.MediaSessionStub.lambda$queueSessionTaskWithPlayerCommandForControllerInfo$13(sessionTask, mediaSessionImpl, controllerInfo, i2);
                }
            });
        }
    }

    static /* synthetic */ com.google.common.util.concurrent.ListenableFuture lambda$queueSessionTaskWithPlayerCommandForControllerInfo$13(androidx.media3.session.MediaSessionStub.SessionTask sessionTask, androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        return (com.google.common.util.concurrent.ListenableFuture) sessionTask.run(mediaSessionImpl, controllerInfo, i);
    }

    private <K extends androidx.media3.session.MediaSessionImpl> void dispatchSessionTaskWithSessionCommand(androidx.media3.session.IMediaController iMediaController, int i, int i2, androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>, K> sessionTask) {
        dispatchSessionTaskWithSessionCommand(iMediaController, i, null, i2, sessionTask);
    }

    private <K extends androidx.media3.session.MediaSessionImpl> void dispatchSessionTaskWithSessionCommand(androidx.media3.session.IMediaController iMediaController, int i, androidx.media3.session.SessionCommand sessionCommand, androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>, K> sessionTask) {
        dispatchSessionTaskWithSessionCommand(iMediaController, i, sessionCommand, 0, sessionTask);
    }

    private <K extends androidx.media3.session.MediaSessionImpl> void dispatchSessionTaskWithSessionCommand(androidx.media3.session.IMediaController iMediaController, final int i, final androidx.media3.session.SessionCommand sessionCommand, final int i2, final androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<java.lang.Void>, K> sessionTask) {
        long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
        try {
            final androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
            if (mediaSessionImpl != null && !mediaSessionImpl.isReleased()) {
                final androidx.media3.session.MediaSession.ControllerInfo controller = this.connectedControllersManager.getController(iMediaController.asBinder());
                if (controller == null) {
                    return;
                }
                androidx.media3.common.util.Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda69
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m414xc8132c6c(controller, sessionCommand, i, i2, sessionTask, mediaSessionImpl);
                    }
                });
            }
        } finally {
            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    /* JADX INFO: renamed from: lambda$dispatchSessionTaskWithSessionCommand$15$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m414xc8132c6c(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommand sessionCommand, int i, int i2, androidx.media3.session.MediaSessionStub.SessionTask sessionTask, androidx.media3.session.MediaSessionImpl mediaSessionImpl) {
        if (this.connectedControllersManager.isConnected(controllerInfo)) {
            if (sessionCommand != null) {
                if (!this.connectedControllersManager.isSessionCommandAvailable(controllerInfo, sessionCommand)) {
                    sendSessionResult(controllerInfo, i, new androidx.media3.session.SessionResult(-4));
                    return;
                }
            } else if (!this.connectedControllersManager.isSessionCommandAvailable(controllerInfo, i2)) {
                sendSessionResult(controllerInfo, i, new androidx.media3.session.SessionResult(-4));
                return;
            }
            sessionTask.run(mediaSessionImpl, controllerInfo, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T, K extends androidx.media3.session.MediaSessionImpl> com.google.common.util.concurrent.ListenableFuture<java.lang.Void> handleSessionTaskWhenReady(final K k, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i, androidx.media3.session.MediaSessionStub.SessionTask<com.google.common.util.concurrent.ListenableFuture<T>, K> sessionTask, final androidx.media3.common.util.Consumer<com.google.common.util.concurrent.ListenableFuture<T>> consumer) {
        if (k.isReleased()) {
            return com.google.common.util.concurrent.Futures.immediateVoidFuture();
        }
        final com.google.common.util.concurrent.ListenableFuture<T> listenableFutureRun = sessionTask.run(k, controllerInfo, i);
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        listenableFutureRun.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.session.MediaSessionStub.lambda$handleSessionTaskWhenReady$16(k, settableFutureCreate, consumer, listenableFutureRun);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return settableFutureCreate;
    }

    static /* synthetic */ void lambda$handleSessionTaskWhenReady$16(androidx.media3.session.MediaSessionImpl mediaSessionImpl, com.google.common.util.concurrent.SettableFuture settableFuture, androidx.media3.common.util.Consumer consumer, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        if (mediaSessionImpl.isReleased()) {
            settableFuture.set(null);
            return;
        }
        try {
            consumer.accept(listenableFuture);
            settableFuture.set(null);
        } catch (java.lang.Throwable th) {
            settableFuture.setException(th);
        }
    }

    private int maybeCorrectMediaItemIndex(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.PlayerWrapper playerWrapper, int i) {
        return (playerWrapper.isCommandAvailable(17) && !this.connectedControllersManager.isPlayerCommandAvailable(controllerInfo, 17) && this.connectedControllersManager.isPlayerCommandAvailable(controllerInfo, 16)) ? i + playerWrapper.getCurrentMediaItemIndex() : i;
    }

    public void connect(final androidx.media3.session.IMediaController iMediaController, final androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        if (iMediaController == null || controllerInfo == null) {
            return;
        }
        final androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl == null || mediaSessionImpl.isReleased()) {
            try {
                iMediaController.onDisconnected(0);
            } catch (android.os.RemoteException unused) {
            }
        } else {
            this.pendingControllers.add(controllerInfo);
            androidx.media3.common.util.Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda68
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    this.f$0.m413lambda$connect$17$androidxmedia3sessionMediaSessionStub(controllerInfo, mediaSessionImpl, iMediaController);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$connect$17$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m413lambda$connect$17$androidxmedia3sessionMediaSessionStub(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.IMediaController iMediaController) throws java.lang.Throwable {
        int i;
        boolean z = false;
        try {
            this.pendingControllers.remove(controllerInfo);
            if (mediaSessionImpl.isReleased()) {
                try {
                    iMediaController.onDisconnected(0);
                    return;
                } catch (android.os.RemoteException unused) {
                    return;
                }
            }
            android.os.IBinder callbackBinder = ((androidx.media3.session.MediaSessionStub.Controller2Cb) androidx.media3.common.util.Assertions.checkStateNotNull((androidx.media3.session.MediaSessionStub.Controller2Cb) controllerInfo.getControllerCb())).getCallbackBinder();
            androidx.media3.session.MediaSession.ConnectionResult connectionResultOnConnectOnHandler = mediaSessionImpl.onConnectOnHandler(controllerInfo);
            if (!connectionResultOnConnectOnHandler.isAccepted && !controllerInfo.isTrusted()) {
                try {
                    iMediaController.onDisconnected(0);
                    return;
                } catch (android.os.RemoteException unused2) {
                    return;
                }
            }
            if (!connectionResultOnConnectOnHandler.isAccepted) {
                connectionResultOnConnectOnHandler = androidx.media3.session.MediaSession.ConnectionResult.accept(androidx.media3.session.SessionCommands.EMPTY, androidx.media3.common.Player.Commands.EMPTY);
            }
            if (this.connectedControllersManager.isConnected(controllerInfo)) {
                androidx.media3.common.util.Log.w(TAG, "Controller " + controllerInfo + " has sent connection request multiple times");
            }
            this.connectedControllersManager.addController(callbackBinder, controllerInfo, connectionResultOnConnectOnHandler.availableSessionCommands, connectionResultOnConnectOnHandler.availablePlayerCommands);
            androidx.media3.session.SequencedFutureManager sequencedFutureManager = this.connectedControllersManager.getSequencedFutureManager(controllerInfo);
            if (sequencedFutureManager == null) {
                androidx.media3.common.util.Log.w(TAG, "Ignoring connection request from unknown controller info");
                try {
                    iMediaController.onDisconnected(0);
                    return;
                } catch (android.os.RemoteException unused3) {
                    return;
                }
            }
            androidx.media3.session.PlayerWrapper playerWrapper = mediaSessionImpl.getPlayerWrapper();
            i = 0;
            try {
                androidx.media3.session.ConnectionState connectionState = new androidx.media3.session.ConnectionState(androidx.media3.common.MediaLibraryInfo.VERSION_INT, 4, this, connectionResultOnConnectOnHandler.sessionActivity != null ? connectionResultOnConnectOnHandler.sessionActivity : mediaSessionImpl.getSessionActivity(), connectionResultOnConnectOnHandler.customLayout != null ? connectionResultOnConnectOnHandler.customLayout : mediaSessionImpl.getCustomLayout(), connectionResultOnConnectOnHandler.availableSessionCommands, connectionResultOnConnectOnHandler.availablePlayerCommands, playerWrapper.getAvailableCommands(), mediaSessionImpl.getToken().getExtras(), connectionResultOnConnectOnHandler.sessionExtras != null ? connectionResultOnConnectOnHandler.sessionExtras : mediaSessionImpl.getSessionExtras(), generateAndCacheUniqueTrackGroupIds(playerWrapper.createPlayerInfoForBundling()));
                if (mediaSessionImpl.isReleased()) {
                    try {
                        iMediaController.onDisconnected(0);
                        return;
                    } catch (android.os.RemoteException unused4) {
                        return;
                    }
                }
                try {
                    iMediaController.onConnected(sequencedFutureManager.obtainNextSequenceNumber(), iMediaController instanceof androidx.media3.session.MediaControllerStub ? connectionState.toBundleInProcess() : connectionState.toBundleForRemoteProcess(controllerInfo.getInterfaceVersion()));
                    z = true;
                } catch (android.os.RemoteException unused5) {
                    z = false;
                }
                if (z) {
                    try {
                        mediaSessionImpl.onPostConnectOnHandler(controllerInfo);
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                }
                if (z) {
                    return;
                }
                try {
                    iMediaController.onDisconnected(0);
                    return;
                } catch (android.os.RemoteException unused6) {
                    return;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                z = false;
            }
            if (!z) {
                try {
                    iMediaController.onDisconnected(i);
                } catch (android.os.RemoteException unused7) {
                }
            }
            throw th;
        } catch (java.lang.Throwable th3) {
            th = th3;
            i = 0;
        }
    }

    public void release() {
        java.util.Iterator<androidx.media3.session.MediaSession.ControllerInfo> it = this.connectedControllersManager.getConnectedControllers().iterator();
        while (it.hasNext()) {
            androidx.media3.session.MediaSession.ControllerCb controllerCb = it.next().getControllerCb();
            if (controllerCb != null) {
                try {
                    controllerCb.onDisconnected(0);
                } catch (android.os.RemoteException unused) {
                }
            }
        }
        java.util.Iterator<androidx.media3.session.MediaSession.ControllerInfo> it2 = this.pendingControllers.iterator();
        while (it2.hasNext()) {
            androidx.media3.session.MediaSession.ControllerCb controllerCb2 = it2.next().getControllerCb();
            if (controllerCb2 != null) {
                try {
                    controllerCb2.onDisconnected(0);
                } catch (android.os.RemoteException unused2) {
                }
            }
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void connect(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            androidx.media3.session.ConnectionRequest connectionRequestFromBundle = androidx.media3.session.ConnectionRequest.fromBundle(bundle);
            int callingUid = android.os.Binder.getCallingUid();
            int callingPid = android.os.Binder.getCallingPid();
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = connectionRequestFromBundle.pid;
            }
            try {
                androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo = new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo(connectionRequestFromBundle.packageName, callingPid, callingUid);
                connect(iMediaController, new androidx.media3.session.MediaSession.ControllerInfo(remoteUserInfo, connectionRequestFromBundle.libraryVersion, connectionRequestFromBundle.controllerInterfaceVersion, this.sessionManager.isTrustedForMediaControl(remoteUserInfo), new androidx.media3.session.MediaSessionStub.Controller2Cb(iMediaController), connectionRequestFromBundle.connectionHints));
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void stop(androidx.media3.session.IMediaController iMediaController, int i) {
        androidx.media3.session.MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        stopForControllerInfo(controller, i);
    }

    public void stopForControllerInfo(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 3, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda71
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).stop();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void release(final androidx.media3.session.IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
        try {
            androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
            if (mediaSessionImpl != null && !mediaSessionImpl.isReleased()) {
                androidx.media3.common.util.Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m418lambda$release$18$androidxmedia3sessionMediaSessionStub(iMediaController);
                    }
                });
            }
        } finally {
            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    /* JADX INFO: renamed from: lambda$release$18$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m418lambda$release$18$androidxmedia3sessionMediaSessionStub(androidx.media3.session.IMediaController iMediaController) {
        this.connectedControllersManager.removeController(iMediaController.asBinder());
    }

    @Override // androidx.media3.session.IMediaSession
    public void onControllerResult(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            androidx.media3.session.SessionResult sessionResultFromBundle = androidx.media3.session.SessionResult.fromBundle(bundle);
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                androidx.media3.session.SequencedFutureManager sequencedFutureManager = this.connectedControllersManager.getSequencedFutureManager(iMediaController.asBinder());
                if (sequencedFutureManager == null) {
                    return;
                }
                sequencedFutureManager.setFutureResult(i, sessionResultFromBundle);
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void play(androidx.media3.session.IMediaController iMediaController, int i) {
        androidx.media3.session.MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        playForControllerInfo(controller, i);
    }

    public void playForControllerInfo(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 1, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda29
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                this.f$0.m416x862bd0ab(controllerInfo, (androidx.media3.session.PlayerWrapper) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: lambda$playForControllerInfo$19$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m416x862bd0ab(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.PlayerWrapper playerWrapper) {
        androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl == null || mediaSessionImpl.isReleased()) {
            return;
        }
        mediaSessionImpl.handleMediaControllerPlayRequest(controllerInfo, false);
    }

    @Override // androidx.media3.session.IMediaSession
    public void pause(androidx.media3.session.IMediaController iMediaController, int i) {
        androidx.media3.session.MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        pauseForControllerInfo(controller, i);
    }

    public void pauseForControllerInfo(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 1, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda42
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).pause();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void prepare(androidx.media3.session.IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 2, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda63
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).prepare();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToDefaultPosition(androidx.media3.session.IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 4, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda36
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).seekToDefaultPosition();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToDefaultPositionWithMediaItemIndex(androidx.media3.session.IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null || i2 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 10, sendSessionResultSuccess(new androidx.media3.session.MediaSessionStub.ControllerPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda8
            @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
            public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
                this.f$0.m423x6c0a2b2d(i2, playerWrapper, controllerInfo);
            }
        }));
    }

    /* JADX INFO: renamed from: lambda$seekToDefaultPositionWithMediaItemIndex$21$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m423x6c0a2b2d(int i, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        playerWrapper.seekToDefaultPosition(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekTo(androidx.media3.session.IMediaController iMediaController, int i, final long j) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 5, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda10
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).seekTo(j);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToWithMediaItemIndex(androidx.media3.session.IMediaController iMediaController, int i, final int i2, final long j) {
        if (iMediaController == null || i2 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 10, sendSessionResultSuccess(new androidx.media3.session.MediaSessionStub.ControllerPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda61
            @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
            public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
                this.f$0.m424x442a0fa1(i2, j, playerWrapper, controllerInfo);
            }
        }));
    }

    /* JADX INFO: renamed from: lambda$seekToWithMediaItemIndex$23$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m424x442a0fa1(int i, long j, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        playerWrapper.seekTo(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), j);
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekBack(androidx.media3.session.IMediaController iMediaController, int i) {
        androidx.media3.session.MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        seekBackForControllerInfo(controller, i);
    }

    public void seekBackForControllerInfo(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 11, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda30
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).seekBack();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekForward(androidx.media3.session.IMediaController iMediaController, int i) {
        androidx.media3.session.MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        seekForwardForControllerInfo(controller, i);
    }

    public void seekForwardForControllerInfo(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 12, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda14
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).seekForward();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void onCustomCommand(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, final android.os.Bundle bundle2) {
        if (iMediaController == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            final androidx.media3.session.SessionCommand sessionCommandFromBundle = androidx.media3.session.SessionCommand.fromBundle(bundle);
            dispatchSessionTaskWithSessionCommand(iMediaController, i, sessionCommandFromBundle, sendSessionResultWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda21
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                    return mediaSessionImpl.onCustomCommandOnHandler(controllerInfo, sessionCommandFromBundle, bundle2);
                }
            }));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setRatingWithMediaId(androidx.media3.session.IMediaController iMediaController, int i, final java.lang.String str, android.os.Bundle bundle) {
        if (iMediaController == null || str == null || bundle == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "setRatingWithMediaId(): Ignoring empty mediaId");
            return;
        }
        try {
            final androidx.media3.common.Rating ratingFromBundle = androidx.media3.common.Rating.fromBundle(bundle);
            dispatchSessionTaskWithSessionCommand(iMediaController, i, androidx.media3.session.SessionCommand.COMMAND_CODE_SESSION_SET_RATING, sendSessionResultWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda22
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                    return mediaSessionImpl.onSetRatingOnHandler(controllerInfo, str, ratingFromBundle);
                }
            }));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for Rating", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setRating(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final androidx.media3.common.Rating ratingFromBundle = androidx.media3.common.Rating.fromBundle(bundle);
            dispatchSessionTaskWithSessionCommand(iMediaController, i, androidx.media3.session.SessionCommand.COMMAND_CODE_SESSION_SET_RATING, sendSessionResultWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda12
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                    return mediaSessionImpl.onSetRatingOnHandler(controllerInfo, ratingFromBundle);
                }
            }));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for Rating", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setPlaybackSpeed(androidx.media3.session.IMediaController iMediaController, int i, final float f) {
        if (iMediaController == null || f <= 0.0f) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 13, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda53
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).setPlaybackSpeed(f);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setPlaybackParameters(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final androidx.media3.common.PlaybackParameters playbackParametersFromBundle = androidx.media3.common.PlaybackParameters.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 13, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda16
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.media3.session.PlayerWrapper) obj).setPlaybackParameters(playbackParametersFromBundle);
                }
            }));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItem(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) {
        setMediaItemWithResetPosition(iMediaController, i, bundle, true);
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItemWithStartPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, final long j) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final androidx.media3.common.MediaItem mediaItemFromBundle = androidx.media3.common.MediaItem.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 31, sendSessionResultWhenReady(handleMediaItemsWithStartPositionWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda62
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                    return mediaSessionImpl.onSetMediaItemsOnHandler(controllerInfo, com.google.common.collect.ImmutableList.of(mediaItemFromBundle), 0, j);
                }
            }, new androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda3())));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItemWithResetPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, final boolean z) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final androidx.media3.common.MediaItem mediaItemFromBundle = androidx.media3.common.MediaItem.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 31, sendSessionResultWhenReady(handleMediaItemsWithStartPositionWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda2
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                    androidx.media3.common.MediaItem mediaItem = mediaItemFromBundle;
                    boolean z2 = z;
                    return mediaSessionImpl.onSetMediaItemsOnHandler(controllerInfo, com.google.common.collect.ImmutableList.of(mediaItem), z2 ? -1 : mediaSessionImpl.getPlayerWrapper().getCurrentMediaItemIndex(), z2 ? androidx.media3.common.C.TIME_UNSET : mediaSessionImpl.getPlayerWrapper().getCurrentPosition());
                }
            }, new androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda3())));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItems(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder) {
        setMediaItemsWithResetPosition(iMediaController, i, iBinder, true);
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItemsWithResetPosition(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder, final boolean z) {
        if (iMediaController == null || iBinder == null) {
            return;
        }
        try {
            final com.google.common.collect.ImmutableList immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.session.LibraryResult$$ExternalSyntheticLambda1(), androidx.media3.common.BundleListRetriever.getList(iBinder));
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWithStartPositionWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda9
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                    java.util.List list = immutableListFromBundleList;
                    boolean z2 = z;
                    return mediaSessionImpl.onSetMediaItemsOnHandler(controllerInfo, list, z2 ? -1 : mediaSessionImpl.getPlayerWrapper().getCurrentMediaItemIndex(), z2 ? androidx.media3.common.C.TIME_UNSET : mediaSessionImpl.getPlayerWrapper().getCurrentPosition());
                }
            }, new androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda3())));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItemsWithStartIndex(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder, final int i2, final long j) {
        if (iMediaController == null || iBinder == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            try {
                final com.google.common.collect.ImmutableList immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.session.LibraryResult$$ExternalSyntheticLambda1(), androidx.media3.common.BundleListRetriever.getList(iBinder));
                queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWithStartPositionWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda70
                    @Override // androidx.media3.session.MediaSessionStub.SessionTask
                    public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
                        return androidx.media3.session.MediaSessionStub.lambda$setMediaItemsWithStartIndex$32(immutableListFromBundleList, i2, j, mediaSessionImpl, controllerInfo, i3);
                    }
                }, new androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda3())));
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    static /* synthetic */ com.google.common.util.concurrent.ListenableFuture lambda$setMediaItemsWithStartIndex$32(java.util.List list, int i, long j, androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
        int currentMediaItemIndex = i == -1 ? mediaSessionImpl.getPlayerWrapper().getCurrentMediaItemIndex() : i;
        if (i == -1) {
            j = mediaSessionImpl.getPlayerWrapper().getCurrentPosition();
        }
        return mediaSessionImpl.onSetMediaItemsOnHandler(controllerInfo, list, currentMediaItemIndex, j);
    }

    @Override // androidx.media3.session.IMediaSession
    public void setPlaylistMetadata(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final androidx.media3.common.MediaMetadata mediaMetadataFromBundle = androidx.media3.common.MediaMetadata.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 19, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda37
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.media3.session.PlayerWrapper) obj).setPlaylistMetadata(mediaMetadataFromBundle);
                }
            }));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaMetadata", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void addMediaItem(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final androidx.media3.common.MediaItem mediaItemFromBundle = androidx.media3.common.MediaItem.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda66
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                    return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, com.google.common.collect.ImmutableList.of(mediaItemFromBundle));
                }
            }, new androidx.media3.session.MediaSessionStub.MediaItemPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda67
                @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
                public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
                    playerWrapper.addMediaItems(list);
                }
            })));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void addMediaItemWithIndex(androidx.media3.session.IMediaController iMediaController, int i, final int i2, android.os.Bundle bundle) {
        if (iMediaController == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            final androidx.media3.common.MediaItem mediaItemFromBundle = androidx.media3.common.MediaItem.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda73
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
                    return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, com.google.common.collect.ImmutableList.of(mediaItemFromBundle));
                }
            }, new androidx.media3.session.MediaSessionStub.MediaItemPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda74
                @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
                public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
                    this.f$0.m411x9bd7c586(i2, playerWrapper, controllerInfo, list);
                }
            })));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    /* JADX INFO: renamed from: lambda$addMediaItemWithIndex$37$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m411x9bd7c586(int i, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
        playerWrapper.addMediaItems(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), list);
    }

    @Override // androidx.media3.session.IMediaSession
    public void addMediaItems(androidx.media3.session.IMediaController iMediaController, int i, android.os.IBinder iBinder) {
        if (iMediaController == null || iBinder == null) {
            return;
        }
        try {
            final com.google.common.collect.ImmutableList immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.session.LibraryResult$$ExternalSyntheticLambda1(), androidx.media3.common.BundleListRetriever.getList(iBinder));
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda84
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                    return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, immutableListFromBundleList);
                }
            }, new androidx.media3.session.MediaSessionStub.MediaItemPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda1
                @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
                public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
                    playerWrapper.addMediaItems(list);
                }
            })));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void addMediaItemsWithIndex(androidx.media3.session.IMediaController iMediaController, int i, final int i2, android.os.IBinder iBinder) {
        if (iMediaController == null || iBinder == null || i2 < 0) {
            return;
        }
        try {
            final com.google.common.collect.ImmutableList immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.session.LibraryResult$$ExternalSyntheticLambda1(), androidx.media3.common.BundleListRetriever.getList(iBinder));
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda49
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
                    return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, immutableListFromBundleList);
                }
            }, new androidx.media3.session.MediaSessionStub.MediaItemPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda50
                @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
                public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
                    this.f$0.m412xa0630f40(i2, playerWrapper, controllerInfo, list);
                }
            })));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    /* JADX INFO: renamed from: lambda$addMediaItemsWithIndex$41$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m412xa0630f40(int i, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
        playerWrapper.addMediaItems(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), list);
    }

    @Override // androidx.media3.session.IMediaSession
    public void removeMediaItem(androidx.media3.session.IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null || i2 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultSuccess(new androidx.media3.session.MediaSessionStub.ControllerPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda58
            @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
            public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
                this.f$0.m419x6cb7e389(i2, playerWrapper, controllerInfo);
            }
        }));
    }

    /* JADX INFO: renamed from: lambda$removeMediaItem$42$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m419x6cb7e389(int i, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        playerWrapper.removeMediaItem(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i));
    }

    @Override // androidx.media3.session.IMediaSession
    public void removeMediaItems(androidx.media3.session.IMediaController iMediaController, int i, final int i2, final int i3) {
        if (iMediaController == null || i2 < 0 || i3 < i2) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultSuccess(new androidx.media3.session.MediaSessionStub.ControllerPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda81
            @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
            public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
                this.f$0.m420x3037692f(i2, i3, playerWrapper, controllerInfo);
            }
        }));
    }

    /* JADX INFO: renamed from: lambda$removeMediaItems$43$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m420x3037692f(int i, int i2, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        playerWrapper.removeMediaItems(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i2));
    }

    @Override // androidx.media3.session.IMediaSession
    public void clearMediaItems(androidx.media3.session.IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda5
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).clearMediaItems();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void moveMediaItem(androidx.media3.session.IMediaController iMediaController, int i, final int i2, final int i3) {
        if (iMediaController == null || i2 < 0 || i3 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda77
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).moveMediaItem(i2, i3);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void moveMediaItems(androidx.media3.session.IMediaController iMediaController, int i, final int i2, final int i3, final int i4) {
        if (iMediaController == null || i2 < 0 || i3 < i2 || i4 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda20
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).moveMediaItems(i2, i3, i4);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void replaceMediaItem(androidx.media3.session.IMediaController iMediaController, int i, final int i2, android.os.Bundle bundle) {
        if (iMediaController == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            final androidx.media3.common.MediaItem mediaItemFromBundle = androidx.media3.common.MediaItem.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda43
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
                    return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, com.google.common.collect.ImmutableList.of(mediaItemFromBundle));
                }
            }, new androidx.media3.session.MediaSessionStub.MediaItemPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda45
                @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
                public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
                    this.f$0.m421x6cbfe40e(i2, playerWrapper, controllerInfo, list);
                }
            })));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    /* JADX INFO: renamed from: lambda$replaceMediaItem$47$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m421x6cbfe40e(int i, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
        if (list.size() == 1) {
            playerWrapper.replaceMediaItem(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), (androidx.media3.common.MediaItem) list.get(0));
        } else {
            playerWrapper.replaceMediaItems(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i + 1), list);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void replaceMediaItems(androidx.media3.session.IMediaController iMediaController, int i, final int i2, final int i3, android.os.IBinder iBinder) {
        if (iMediaController == null || iBinder == null || i2 < 0 || i3 < i2) {
            return;
        }
        try {
            final com.google.common.collect.ImmutableList immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.session.LibraryResult$$ExternalSyntheticLambda1(), androidx.media3.common.BundleListRetriever.getList(iBinder));
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda76
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i4) {
                    return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, immutableListFromBundleList);
                }
            }, new androidx.media3.session.MediaSessionStub.MediaItemPlayerTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda83
                @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
                public final void run(androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
                    this.f$0.m422xe3478e3f(i2, i3, playerWrapper, controllerInfo, list);
                }
            })));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    /* JADX INFO: renamed from: lambda$replaceMediaItems$49$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m422xe3478e3f(int i, int i2, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List list) {
        playerWrapper.replaceMediaItems(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i2), list);
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToPreviousMediaItem(androidx.media3.session.IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 6, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda26
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).seekToPreviousMediaItem();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToNextMediaItem(androidx.media3.session.IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 8, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda55
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).seekToNextMediaItem();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToPrevious(androidx.media3.session.IMediaController iMediaController, int i) {
        androidx.media3.session.MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        seekToPreviousForControllerInfo(controller, i);
    }

    public void seekToPreviousForControllerInfo(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 7, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda80
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).seekToPrevious();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToNext(androidx.media3.session.IMediaController iMediaController, int i) {
        androidx.media3.session.MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        seekToNextForControllerInfo(controller, i);
    }

    public void seekToNextForControllerInfo(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 9, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda46
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).seekToNext();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setRepeatMode(androidx.media3.session.IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null) {
            return;
        }
        if (i2 == 2 || i2 == 0 || i2 == 1) {
            queueSessionTaskWithPlayerCommand(iMediaController, i, 15, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda31
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.media3.session.PlayerWrapper) obj).setRepeatMode(i2);
                }
            }));
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setShuffleModeEnabled(androidx.media3.session.IMediaController iMediaController, int i, final boolean z) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 14, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda4
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).setShuffleModeEnabled(z);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setVideoSurface(androidx.media3.session.IMediaController iMediaController, int i, final android.view.Surface surface) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 27, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda28
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).setVideoSurface(surface);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setVolume(androidx.media3.session.IMediaController iMediaController, int i, final float f) {
        if (iMediaController == null || f < 0.0f || f > 1.0f) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 24, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda38
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).setVolume(f);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null || i2 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 25, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda23
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).setDeviceVolume(i2);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, final int i2, final int i3) {
        if (iMediaController == null || i2 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 33, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda44
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).setDeviceVolume(i2, i3);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void increaseDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 26, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda24
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).increaseDeviceVolume();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void increaseDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 34, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda19
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).increaseDeviceVolume(i2);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void decreaseDeviceVolume(androidx.media3.session.IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 26, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda15
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).decreaseDeviceVolume();
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void decreaseDeviceVolumeWithFlags(androidx.media3.session.IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 34, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda34
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).decreaseDeviceVolume(i2);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setDeviceMuted(androidx.media3.session.IMediaController iMediaController, int i, final boolean z) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 26, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda65
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).setDeviceMuted(z);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setDeviceMutedWithFlags(androidx.media3.session.IMediaController iMediaController, int i, final boolean z, final int i2) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 34, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda27
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).setDeviceMuted(z, i2);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setAudioAttributes(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle, final boolean z) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final androidx.media3.common.AudioAttributes audioAttributesFromBundle = androidx.media3.common.AudioAttributes.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 35, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda60
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    ((androidx.media3.session.PlayerWrapper) obj).setAudioAttributes(audioAttributesFromBundle, z);
                }
            }));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setPlayWhenReady(androidx.media3.session.IMediaController iMediaController, int i, final boolean z) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 1, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda17
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.media3.session.PlayerWrapper) obj).setPlayWhenReady(z);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void flushCommandQueue(androidx.media3.session.IMediaController iMediaController) {
        if (iMediaController == null) {
            return;
        }
        long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
        try {
            androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
            if (mediaSessionImpl != null && !mediaSessionImpl.isReleased()) {
                final androidx.media3.session.MediaSession.ControllerInfo controller = this.connectedControllersManager.getController(iMediaController.asBinder());
                if (controller != null) {
                    androidx.media3.common.util.Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda41
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m415x787698c0(controller);
                        }
                    });
                }
            }
        } finally {
            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    /* JADX INFO: renamed from: lambda$flushCommandQueue$64$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m415x787698c0(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.connectedControllersManager.flushCommandQueue(controllerInfo);
    }

    @Override // androidx.media3.session.IMediaSession
    public void setTrackSelectionParameters(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final androidx.media3.common.TrackSelectionParameters trackSelectionParametersFromBundle = androidx.media3.common.TrackSelectionParameters.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 29, sendSessionResultSuccess((androidx.media3.common.util.Consumer<androidx.media3.session.PlayerWrapper>) new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda7
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m425x8b51cbc2(trackSelectionParametersFromBundle, (androidx.media3.session.PlayerWrapper) obj);
                }
            }));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    /* JADX INFO: renamed from: lambda$setTrackSelectionParameters$65$androidx-media3-session-MediaSessionStub, reason: not valid java name */
    /* synthetic */ void m425x8b51cbc2(androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.session.PlayerWrapper playerWrapper) {
        playerWrapper.setTrackSelectionParameters(updateOverridesUsingUniqueTrackGroupIds(trackSelectionParameters));
    }

    @Override // androidx.media3.session.IMediaSession
    public void getLibraryRoot(androidx.media3.session.IMediaController iMediaController, int i, android.os.Bundle bundle) {
        final androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsFromBundle;
        if (iMediaController == null) {
            return;
        }
        if (bundle == null) {
            libraryParamsFromBundle = null;
        } else {
            try {
                libraryParamsFromBundle = androidx.media3.session.MediaLibraryService.LibraryParams.fromBundle(bundle);
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        dispatchSessionTaskWithSessionCommand(iMediaController, i, 50000, sendLibraryResultWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda82
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                return ((androidx.media3.session.MediaLibrarySessionImpl) mediaSessionImpl).onGetLibraryRootOnHandler(controllerInfo, libraryParamsFromBundle);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void getItem(androidx.media3.session.IMediaController iMediaController, int i, final java.lang.String str) {
        if (iMediaController == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "getItem(): Ignoring empty mediaId");
        } else {
            dispatchSessionTaskWithSessionCommand(iMediaController, i, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_ITEM, sendLibraryResultWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda64
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                    return ((androidx.media3.session.MediaLibrarySessionImpl) mediaSessionImpl).onGetItemOnHandler(controllerInfo, str);
                }
            }));
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void getChildren(androidx.media3.session.IMediaController iMediaController, int i, final java.lang.String str, final int i2, final int i3, android.os.Bundle bundle) {
        final androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsFromBundle;
        if (iMediaController == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "getChildren(): Ignoring empty parentId");
            return;
        }
        if (i2 < 0) {
            androidx.media3.common.util.Log.w(TAG, "getChildren(): Ignoring negative page");
            return;
        }
        if (i3 < 1) {
            androidx.media3.common.util.Log.w(TAG, "getChildren(): Ignoring pageSize less than 1");
            return;
        }
        if (bundle == null) {
            libraryParamsFromBundle = null;
        } else {
            try {
                libraryParamsFromBundle = androidx.media3.session.MediaLibraryService.LibraryParams.fromBundle(bundle);
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        dispatchSessionTaskWithSessionCommand(iMediaController, i, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_CHILDREN, sendLibraryResultWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda51
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i4) {
                return ((androidx.media3.session.MediaLibrarySessionImpl) mediaSessionImpl).onGetChildrenOnHandler(controllerInfo, str, i2, i3, libraryParamsFromBundle);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void search(androidx.media3.session.IMediaController iMediaController, int i, final java.lang.String str, android.os.Bundle bundle) {
        final androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsFromBundle;
        if (iMediaController == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "search(): Ignoring empty query");
            return;
        }
        if (bundle == null) {
            libraryParamsFromBundle = null;
        } else {
            try {
                libraryParamsFromBundle = androidx.media3.session.MediaLibraryService.LibraryParams.fromBundle(bundle);
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        dispatchSessionTaskWithSessionCommand(iMediaController, i, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_SEARCH, sendLibraryResultWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda48
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                return ((androidx.media3.session.MediaLibrarySessionImpl) mediaSessionImpl).onSearchOnHandler(controllerInfo, str, libraryParamsFromBundle);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void getSearchResult(androidx.media3.session.IMediaController iMediaController, int i, final java.lang.String str, final int i2, final int i3, android.os.Bundle bundle) {
        final androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsFromBundle;
        if (iMediaController == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "getSearchResult(): Ignoring empty query");
            return;
        }
        if (i2 < 0) {
            androidx.media3.common.util.Log.w(TAG, "getSearchResult(): Ignoring negative page");
            return;
        }
        if (i3 < 1) {
            androidx.media3.common.util.Log.w(TAG, "getSearchResult(): Ignoring pageSize less than 1");
            return;
        }
        if (bundle == null) {
            libraryParamsFromBundle = null;
        } else {
            try {
                libraryParamsFromBundle = androidx.media3.session.MediaLibraryService.LibraryParams.fromBundle(bundle);
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        dispatchSessionTaskWithSessionCommand(iMediaController, i, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT, sendLibraryResultWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda13
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i4) {
                return ((androidx.media3.session.MediaLibrarySessionImpl) mediaSessionImpl).onGetSearchResultOnHandler(controllerInfo, str, i2, i3, libraryParamsFromBundle);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void subscribe(androidx.media3.session.IMediaController iMediaController, int i, final java.lang.String str, android.os.Bundle bundle) {
        final androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsFromBundle;
        if (iMediaController == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "subscribe(): Ignoring empty parentId");
            return;
        }
        if (bundle == null) {
            libraryParamsFromBundle = null;
        } else {
            try {
                libraryParamsFromBundle = androidx.media3.session.MediaLibraryService.LibraryParams.fromBundle(bundle);
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        dispatchSessionTaskWithSessionCommand(iMediaController, i, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_SUBSCRIBE, sendLibraryResultWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda78
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                return ((androidx.media3.session.MediaLibrarySessionImpl) mediaSessionImpl).onSubscribeOnHandler(controllerInfo, str, libraryParamsFromBundle);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void unsubscribe(androidx.media3.session.IMediaController iMediaController, int i, final java.lang.String str) {
        if (iMediaController == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "unsubscribe(): Ignoring empty parentId");
        } else {
            dispatchSessionTaskWithSessionCommand(iMediaController, i, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_UNSUBSCRIBE, sendLibraryResultWhenReady(new androidx.media3.session.MediaSessionStub.SessionTask() { // from class: androidx.media3.session.MediaSessionStub$$ExternalSyntheticLambda75
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final java.lang.Object run(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i2) {
                    return ((androidx.media3.session.MediaLibrarySessionImpl) mediaSessionImpl).onUnsubscribeOnHandler(controllerInfo, str);
                }
            }));
        }
    }

    androidx.media3.session.PlayerInfo generateAndCacheUniqueTrackGroupIds(androidx.media3.session.PlayerInfo playerInfo) {
        com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> groups = playerInfo.currentTracks.getGroups();
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableBiMap.Builder builder2 = com.google.common.collect.ImmutableBiMap.builder();
        for (int i = 0; i < groups.size(); i++) {
            androidx.media3.common.Tracks.Group group = groups.get(i);
            androidx.media3.common.TrackGroup mediaTrackGroup = group.getMediaTrackGroup();
            java.lang.String strGenerateUniqueTrackGroupId = this.trackGroupIdMap.get(mediaTrackGroup);
            if (strGenerateUniqueTrackGroupId == null) {
                strGenerateUniqueTrackGroupId = generateUniqueTrackGroupId(mediaTrackGroup);
            }
            builder2.put(mediaTrackGroup, strGenerateUniqueTrackGroupId);
            builder.add(group.copyWithId(strGenerateUniqueTrackGroupId));
        }
        this.trackGroupIdMap = builder2.buildOrThrow();
        androidx.media3.session.PlayerInfo playerInfoCopyWithCurrentTracks = playerInfo.copyWithCurrentTracks(new androidx.media3.common.Tracks(builder.build()));
        if (playerInfoCopyWithCurrentTracks.trackSelectionParameters.overrides.isEmpty()) {
            return playerInfoCopyWithCurrentTracks;
        }
        androidx.media3.common.TrackSelectionParameters.Builder builderClearOverrides = playerInfoCopyWithCurrentTracks.trackSelectionParameters.buildUpon().clearOverrides();
        com.google.common.collect.UnmodifiableIterator<androidx.media3.common.TrackSelectionOverride> it = playerInfoCopyWithCurrentTracks.trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            androidx.media3.common.TrackSelectionOverride next = it.next();
            androidx.media3.common.TrackGroup trackGroup = next.mediaTrackGroup;
            java.lang.String str = this.trackGroupIdMap.get(trackGroup);
            if (str != null) {
                builderClearOverrides.addOverride(new androidx.media3.common.TrackSelectionOverride(trackGroup.copyWithId(str), next.trackIndices));
            } else {
                builderClearOverrides.addOverride(next);
            }
        }
        return playerInfoCopyWithCurrentTracks.copyWithTrackSelectionParameters(builderClearOverrides.build());
    }

    private androidx.media3.common.TrackSelectionParameters updateOverridesUsingUniqueTrackGroupIds(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters.overrides.isEmpty()) {
            return trackSelectionParameters;
        }
        androidx.media3.common.TrackSelectionParameters.Builder builderClearOverrides = trackSelectionParameters.buildUpon().clearOverrides();
        com.google.common.collect.UnmodifiableIterator<androidx.media3.common.TrackSelectionOverride> it = trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            androidx.media3.common.TrackSelectionOverride next = it.next();
            androidx.media3.common.TrackGroup trackGroup = this.trackGroupIdMap.inverse().get(next.mediaTrackGroup.id);
            if (trackGroup != null && next.mediaTrackGroup.length == trackGroup.length) {
                builderClearOverrides.addOverride(new androidx.media3.common.TrackSelectionOverride(trackGroup, next.trackIndices));
            } else {
                builderClearOverrides.addOverride(next);
            }
        }
        return builderClearOverrides.build();
    }

    private java.lang.String generateUniqueTrackGroupId(androidx.media3.common.TrackGroup trackGroup) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.nextUniqueTrackGroupIdPrefix;
        this.nextUniqueTrackGroupIdPrefix = i + 1;
        return sb.append(androidx.media3.common.util.Util.intToStringMaxRadix(i)).append("-").append(trackGroup.id).toString();
    }

    static final class Controller2Cb implements androidx.media3.session.MediaSession.ControllerCb {
        private final androidx.media3.session.IMediaController iController;

        public Controller2Cb(androidx.media3.session.IMediaController iMediaController) {
            this.iController = iMediaController;
        }

        public android.os.IBinder getCallbackBinder() {
            return this.iController.asBinder();
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSessionResult(int i, androidx.media3.session.SessionResult sessionResult) throws android.os.RemoteException {
            this.iController.onSessionResult(i, sessionResult.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onLibraryResult(int i, androidx.media3.session.LibraryResult<?> libraryResult) throws android.os.RemoteException {
            this.iController.onLibraryResult(i, libraryResult.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPlayerInfoChanged(int i, androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Commands commands, boolean z, boolean z2, int i2) throws android.os.RemoteException {
            android.os.Bundle bundleForRemoteProcess;
            androidx.media3.common.util.Assertions.checkState(i2 != 0);
            boolean z3 = z || !commands.contains(17);
            boolean z4 = z2 || !commands.contains(30);
            if (i2 >= 2) {
                androidx.media3.session.PlayerInfo playerInfoFilterByAvailableCommands = playerInfo.filterByAvailableCommands(commands, z, z2);
                if (this.iController instanceof androidx.media3.session.MediaControllerStub) {
                    bundleForRemoteProcess = playerInfoFilterByAvailableCommands.toBundleInProcess();
                } else {
                    bundleForRemoteProcess = playerInfoFilterByAvailableCommands.toBundleForRemoteProcess(i2);
                }
                this.iController.onPlayerInfoChangedWithExclusions(i, bundleForRemoteProcess, new androidx.media3.session.PlayerInfo.BundlingExclusions(z3, z4).toBundle());
                return;
            }
            this.iController.onPlayerInfoChanged(i, playerInfo.filterByAvailableCommands(commands, z, true).toBundleForRemoteProcess(i2), z3);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void setCustomLayout(int i, java.util.List<androidx.media3.session.CommandButton> list) throws android.os.RemoteException {
            this.iController.onSetCustomLayout(i, androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.ConnectionState$$ExternalSyntheticLambda0()));
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSessionActivityChanged(int i, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
            this.iController.onSessionActivityChanged(i, pendingIntent);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onAvailableCommandsChangedFromSession(int i, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) throws android.os.RemoteException {
            this.iController.onAvailableCommandsChangedFromSession(i, sessionCommands.toBundle(), commands.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onAvailableCommandsChangedFromPlayer(int i, androidx.media3.common.Player.Commands commands) throws android.os.RemoteException {
            this.iController.onAvailableCommandsChangedFromPlayer(i, commands.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void sendCustomCommand(int i, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) throws android.os.RemoteException {
            this.iController.onCustomCommand(i, sessionCommand.toBundle(), bundle);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onChildrenChanged(int i, java.lang.String str, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) throws android.os.RemoteException {
            this.iController.onChildrenChanged(i, str, i2, libraryParams == null ? null : libraryParams.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSearchResultChanged(int i, java.lang.String str, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) throws android.os.RemoteException {
            this.iController.onSearchResultChanged(i, str, i2, libraryParams == null ? null : libraryParams.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onDisconnected(int i) throws android.os.RemoteException {
            this.iController.onDisconnected(i);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPeriodicSessionPositionInfoChanged(int i, androidx.media3.session.SessionPositionInfo sessionPositionInfo, boolean z, boolean z2, int i2) throws android.os.RemoteException {
            this.iController.onPeriodicSessionPositionInfoChanged(i, sessionPositionInfo.filterByAvailableCommands(z, z2).toBundle(i2));
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onRenderedFirstFrame(int i) throws android.os.RemoteException {
            this.iController.onRenderedFirstFrame(i);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSessionExtrasChanged(int i, android.os.Bundle bundle) throws android.os.RemoteException {
            this.iController.onExtrasChanged(i, bundle);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onError(int i, androidx.media3.session.SessionError sessionError) throws android.os.RemoteException {
            this.iController.onError(i, sessionError.toBundle());
        }

        public int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(getCallbackBinder());
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != androidx.media3.session.MediaSessionStub.Controller2Cb.class) {
                return false;
            }
            return androidx.media3.common.util.Util.areEqual(getCallbackBinder(), ((androidx.media3.session.MediaSessionStub.Controller2Cb) obj).getCallbackBinder());
        }
    }
}
