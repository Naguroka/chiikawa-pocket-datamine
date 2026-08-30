package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerStub extends androidx.media3.session.IMediaController.Stub {
    private static final java.lang.String TAG = "MediaControllerStub";
    public static final int VERSION_INT = 6;
    private final java.lang.ref.WeakReference<androidx.media3.session.MediaControllerImplBase> controller;

    /* JADX INFO: Access modifiers changed from: private */
    interface ControllerTask<T extends androidx.media3.session.MediaControllerImplBase> {
        void run(T t);
    }

    public MediaControllerStub(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
        this.controller = new java.lang.ref.WeakReference<>(mediaControllerImplBase);
    }

    @Override // androidx.media3.session.IMediaController
    public void onSessionResult(int i, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            setControllerFutureResult(i, androidx.media3.session.SessionResult.fromBundle(bundle));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onLibraryResult(int i, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            setControllerFutureResult(i, androidx.media3.session.LibraryResult.fromUnknownBundle(bundle));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onConnected(int i, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            final androidx.media3.session.ConnectionState connectionStateFromBundle = androidx.media3.session.ConnectionState.fromBundle(bundle);
            dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda10
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.onConnected(connectionStateFromBundle);
                }
            });
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            onDisconnected(i);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onDisconnected(int i) {
        dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda6
            @Override // androidx.media3.session.MediaControllerStub.ControllerTask
            public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                androidx.media3.session.MediaControllerStub.lambda$onDisconnected$1(mediaControllerImplBase);
            }
        });
    }

    static /* synthetic */ void lambda$onDisconnected$1(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
        androidx.media3.session.MediaController mediaControllerImplBase2 = mediaControllerImplBase.getInstance();
        androidx.media3.session.MediaController mediaControllerImplBase3 = mediaControllerImplBase.getInstance();
        java.util.Objects.requireNonNull(mediaControllerImplBase3);
        mediaControllerImplBase2.runOnApplicationLooper(new androidx.media3.session.MediaControllerImplBase$$ExternalSyntheticLambda44(mediaControllerImplBase3));
    }

    @Override // androidx.media3.session.IMediaController
    public void onSetCustomLayout(final int i, java.util.List<android.os.Bundle> list) {
        if (list == null) {
            return;
        }
        try {
            final int sessionInterfaceVersion = getSessionInterfaceVersion();
            if (sessionInterfaceVersion == -1) {
                return;
            }
            final com.google.common.collect.ImmutableList immutableListFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda7
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.session.CommandButton.fromBundle((android.os.Bundle) obj, sessionInterfaceVersion);
                }
            }, list);
            dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda8
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.onSetCustomLayout(i, immutableListFromBundleList);
                }
            });
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for CommandButton", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onAvailableCommandsChangedFromSession(int i, android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            final androidx.media3.session.SessionCommands sessionCommandsFromBundle = androidx.media3.session.SessionCommands.fromBundle(bundle);
            try {
                final androidx.media3.common.Player.Commands commandsFromBundle = androidx.media3.common.Player.Commands.fromBundle(bundle2);
                dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda2
                    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                    public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                        mediaControllerImplBase.onAvailableCommandsChangedFromSession(sessionCommandsFromBundle, commandsFromBundle);
                    }
                });
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for Commands", e);
            }
        } catch (java.lang.RuntimeException e2) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for SessionCommands", e2);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onAvailableCommandsChangedFromPlayer(int i, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            final androidx.media3.common.Player.Commands commandsFromBundle = androidx.media3.common.Player.Commands.fromBundle(bundle);
            dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda11
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.onAvailableCommandsChangedFromPlayer(commandsFromBundle);
                }
            });
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onCustomCommand(final int i, android.os.Bundle bundle, final android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring custom command with null args.");
            return;
        }
        try {
            final androidx.media3.session.SessionCommand sessionCommandFromBundle = androidx.media3.session.SessionCommand.fromBundle(bundle);
            dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda3
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.onCustomCommand(i, sessionCommandFromBundle, bundle2);
                }
            });
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onSessionActivityChanged(final int i, final android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        if (pendingIntent == null) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring null session activity intent");
        } else {
            dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda14
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.onSetSessionActivity(i, pendingIntent);
                }
            });
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onPeriodicSessionPositionInfoChanged(int i, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            final androidx.media3.session.SessionPositionInfo sessionPositionInfoFromBundle = androidx.media3.session.SessionPositionInfo.fromBundle(bundle);
            dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda15
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.notifyPeriodicSessionPositionInfoChanged(sessionPositionInfoFromBundle);
                }
            });
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    @java.lang.Deprecated
    public void onPlayerInfoChanged(int i, android.os.Bundle bundle, boolean z) {
        onPlayerInfoChangedWithExclusions(i, bundle, new androidx.media3.session.PlayerInfo.BundlingExclusions(z, true).toBundle());
    }

    @Override // androidx.media3.session.IMediaController
    public void onPlayerInfoChangedWithExclusions(int i, android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int sessionInterfaceVersion = getSessionInterfaceVersion();
            if (sessionInterfaceVersion == -1) {
                return;
            }
            final androidx.media3.session.PlayerInfo playerInfoFromBundle = androidx.media3.session.PlayerInfo.fromBundle(bundle, sessionInterfaceVersion);
            try {
                final androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusionsFromBundle = androidx.media3.session.PlayerInfo.BundlingExclusions.fromBundle(bundle2);
                dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda0
                    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                    public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                        mediaControllerImplBase.onPlayerInfoChanged(playerInfoFromBundle, bundlingExclusionsFromBundle);
                    }
                });
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (java.lang.RuntimeException e2) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onExtrasChanged(int i, final android.os.Bundle bundle) {
        if (bundle == null) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring null Bundle for extras");
        } else {
            dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda13
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.onExtrasChanged(bundle);
                }
            });
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onError(final int i, android.os.Bundle bundle) throws android.os.RemoteException {
        try {
            final androidx.media3.session.SessionError sessionErrorFromBundle = androidx.media3.session.SessionError.fromBundle(bundle);
            dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda4
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.onError(i, sessionErrorFromBundle);
                }
            });
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Bundle for SessionError", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onRenderedFirstFrame(int i) {
        dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda9
            @Override // androidx.media3.session.MediaControllerStub.ControllerTask
            public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                mediaControllerImplBase.onRenderedFirstFrame();
            }
        });
    }

    @Override // androidx.media3.session.IMediaController
    public void onSearchResultChanged(int i, final java.lang.String str, final int i2, android.os.Bundle bundle) throws java.lang.RuntimeException {
        final androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsFromBundle;
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "onSearchResultChanged(): Ignoring empty query");
            return;
        }
        if (i2 < 0) {
            androidx.media3.common.util.Log.w(TAG, "onSearchResultChanged(): Ignoring negative itemCount: " + i2);
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
        dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda5
            @Override // androidx.media3.session.MediaControllerStub.ControllerTask
            public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                ((androidx.media3.session.MediaBrowserImplBase) mediaControllerImplBase).notifySearchResultChanged(str, i2, libraryParamsFromBundle);
            }
        });
    }

    @Override // androidx.media3.session.IMediaController
    public void onChildrenChanged(int i, final java.lang.String str, final int i2, android.os.Bundle bundle) {
        final androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsFromBundle;
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "onChildrenChanged(): Ignoring empty parentId");
            return;
        }
        if (i2 < 0) {
            androidx.media3.common.util.Log.w(TAG, "onChildrenChanged(): Ignoring negative itemCount: " + i2);
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
        dispatchControllerTaskOnHandler(new androidx.media3.session.MediaControllerStub.ControllerTask() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda12
            @Override // androidx.media3.session.MediaControllerStub.ControllerTask
            public final void run(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase) {
                ((androidx.media3.session.MediaBrowserImplBase) mediaControllerImplBase).notifyChildrenChanged(str, i2, libraryParamsFromBundle);
            }
        });
    }

    public void destroy() {
        this.controller.clear();
    }

    private <T> void setControllerFutureResult(int i, T t) {
        long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
        try {
            androidx.media3.session.MediaControllerImplBase mediaControllerImplBase = this.controller.get();
            if (mediaControllerImplBase == null) {
                return;
            }
            mediaControllerImplBase.setFutureResult(i, t);
        } finally {
            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    private <T extends androidx.media3.session.MediaControllerImplBase> void dispatchControllerTaskOnHandler(final androidx.media3.session.MediaControllerStub.ControllerTask<T> controllerTask) {
        long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
        try {
            final androidx.media3.session.MediaControllerImplBase mediaControllerImplBase = this.controller.get();
            if (mediaControllerImplBase == null) {
                return;
            }
            androidx.media3.common.util.Util.postOrRun(mediaControllerImplBase.getInstance().applicationHandler, new java.lang.Runnable() { // from class: androidx.media3.session.MediaControllerStub$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.session.MediaControllerStub.lambda$dispatchControllerTaskOnHandler$14(mediaControllerImplBase, controllerTask);
                }
            });
        } finally {
            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    static /* synthetic */ void lambda$dispatchControllerTaskOnHandler$14(androidx.media3.session.MediaControllerImplBase mediaControllerImplBase, androidx.media3.session.MediaControllerStub.ControllerTask controllerTask) {
        if (mediaControllerImplBase.isReleased()) {
            return;
        }
        controllerTask.run(mediaControllerImplBase);
    }

    private int getSessionInterfaceVersion() {
        androidx.media3.session.SessionToken connectedToken;
        androidx.media3.session.MediaControllerImplBase mediaControllerImplBase = this.controller.get();
        if (mediaControllerImplBase == null || (connectedToken = mediaControllerImplBase.getConnectedToken()) == null) {
            return -1;
        }
        return connectedToken.getInterfaceVersion();
    }
}
