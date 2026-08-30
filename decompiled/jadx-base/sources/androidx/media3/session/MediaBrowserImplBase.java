package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserImplBase extends androidx.media3.session.MediaControllerImplBase implements androidx.media3.session.MediaBrowser.MediaBrowserImpl {
    private final androidx.media3.session.MediaBrowser instance;

    private interface RemoteLibrarySessionTask {
        void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException;
    }

    MediaBrowserImplBase(android.content.Context context, androidx.media3.session.MediaBrowser mediaBrowser, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, android.os.Looper looper) {
        super(context, mediaBrowser, sessionToken, bundle, looper);
        this.instance = mediaBrowser;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.media3.session.MediaControllerImplBase
    public androidx.media3.session.MediaBrowser getInstance() {
        return this.instance;
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> getLibraryRoot(final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(50000, new androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.1
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                androidx.media3.session.MediaControllerStub mediaControllerStub = androidx.media3.session.MediaBrowserImplBase.this.controllerStub;
                androidx.media3.session.MediaLibraryService.LibraryParams libraryParams2 = libraryParams;
                iMediaSession.getLibraryRoot(mediaControllerStub, i, libraryParams2 == null ? null : libraryParams2.toBundle());
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> subscribe(final java.lang.String str, final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_SUBSCRIBE, new androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.2
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                androidx.media3.session.MediaControllerStub mediaControllerStub = androidx.media3.session.MediaBrowserImplBase.this.controllerStub;
                java.lang.String str2 = str;
                androidx.media3.session.MediaLibraryService.LibraryParams libraryParams2 = libraryParams;
                iMediaSession.subscribe(mediaControllerStub, i, str2, libraryParams2 == null ? null : libraryParams2.toBundle());
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> unsubscribe(final java.lang.String str) {
        return dispatchRemoteLibrarySessionTask(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_UNSUBSCRIBE, new androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.3
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                iMediaSession.unsubscribe(androidx.media3.session.MediaBrowserImplBase.this.controllerStub, i, str);
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> getChildren(final java.lang.String str, final int i, final int i2, final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_CHILDREN, new androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.4
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
                androidx.media3.session.MediaControllerStub mediaControllerStub = androidx.media3.session.MediaBrowserImplBase.this.controllerStub;
                java.lang.String str2 = str;
                int i4 = i;
                int i5 = i2;
                androidx.media3.session.MediaLibraryService.LibraryParams libraryParams2 = libraryParams;
                iMediaSession.getChildren(mediaControllerStub, i3, str2, i4, i5, libraryParams2 == null ? null : libraryParams2.toBundle());
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> getItem(final java.lang.String str) {
        return dispatchRemoteLibrarySessionTask(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_ITEM, new androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.5
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                iMediaSession.getItem(androidx.media3.session.MediaBrowserImplBase.this.controllerStub, i, str);
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> search(final java.lang.String str, final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_SEARCH, new androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.6
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(androidx.media3.session.IMediaSession iMediaSession, int i) throws android.os.RemoteException {
                androidx.media3.session.MediaControllerStub mediaControllerStub = androidx.media3.session.MediaBrowserImplBase.this.controllerStub;
                java.lang.String str2 = str;
                androidx.media3.session.MediaLibraryService.LibraryParams libraryParams2 = libraryParams;
                iMediaSession.search(mediaControllerStub, i, str2, libraryParams2 == null ? null : libraryParams2.toBundle());
            }
        });
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> getSearchResult(final java.lang.String str, final int i, final int i2, final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return dispatchRemoteLibrarySessionTask(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT, new androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask() { // from class: androidx.media3.session.MediaBrowserImplBase.7
            @Override // androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask
            public void run(androidx.media3.session.IMediaSession iMediaSession, int i3) throws android.os.RemoteException {
                androidx.media3.session.MediaControllerStub mediaControllerStub = androidx.media3.session.MediaBrowserImplBase.this.controllerStub;
                java.lang.String str2 = str;
                int i4 = i;
                int i5 = i2;
                androidx.media3.session.MediaLibraryService.LibraryParams libraryParams2 = libraryParams;
                iMediaSession.getSearchResult(mediaControllerStub, i3, str2, i4, i5, libraryParams2 == null ? null : libraryParams2.toBundle());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifySearchResultChanged(final java.lang.String str, final int i, final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (isConnected()) {
            getInstance().notifyBrowserListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaBrowserImplBase$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m230x7271beb5(str, i, libraryParams, (androidx.media3.session.MediaBrowser.Listener) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$notifySearchResultChanged$0$androidx-media3-session-MediaBrowserImplBase, reason: not valid java name */
    /* synthetic */ void m230x7271beb5(java.lang.String str, int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams, androidx.media3.session.MediaBrowser.Listener listener) {
        listener.onSearchResultChanged(getInstance(), str, i, libraryParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyChildrenChanged(final java.lang.String str, final int i, final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (isConnected()) {
            getInstance().notifyBrowserListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaBrowserImplBase$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m229x606d39ee(str, i, libraryParams, (androidx.media3.session.MediaBrowser.Listener) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$notifyChildrenChanged$1$androidx-media3-session-MediaBrowserImplBase, reason: not valid java name */
    /* synthetic */ void m229x606d39ee(java.lang.String str, int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams, androidx.media3.session.MediaBrowser.Listener listener) {
        listener.onChildrenChanged(getInstance(), str, i, libraryParams);
    }

    private <V> com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<V>> dispatchRemoteLibrarySessionTask(int i, androidx.media3.session.MediaBrowserImplBase.RemoteLibrarySessionTask remoteLibrarySessionTask) {
        androidx.media3.session.IMediaSession sessionInterfaceWithSessionCommandIfAble = getSessionInterfaceWithSessionCommandIfAble(i);
        if (sessionInterfaceWithSessionCommandIfAble != null) {
            androidx.media3.session.SequencedFutureManager.SequencedFuture sequencedFutureCreateSequencedFuture = this.sequencedFutureManager.createSequencedFuture(androidx.media3.session.LibraryResult.ofError(1));
            try {
                remoteLibrarySessionTask.run(sessionInterfaceWithSessionCommandIfAble, sequencedFutureCreateSequencedFuture.getSequenceNumber());
            } catch (android.os.RemoteException e) {
                androidx.media3.common.util.Log.w(androidx.media3.session.MediaControllerImplBase.TAG, "Cannot connect to the service or the session is gone", e);
                this.sequencedFutureManager.setFutureResult(sequencedFutureCreateSequencedFuture.getSequenceNumber(), androidx.media3.session.LibraryResult.ofError(-100));
            }
            return sequencedFutureCreateSequencedFuture;
        }
        return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-4));
    }
}
