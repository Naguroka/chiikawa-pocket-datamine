package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaLibrarySessionImpl extends androidx.media3.session.MediaSessionImpl {
    private static final java.lang.String RECENT_LIBRARY_ROOT_MEDIA_ID = "androidx.media3.session.recent.root";
    private final androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback callback;
    private final com.google.common.collect.HashMultimap<androidx.media3.session.MediaSession.ControllerCb, java.lang.String> controllerToSubscribedParentIds;
    private final androidx.media3.session.MediaLibraryService.MediaLibrarySession instance;
    private final int libraryErrorReplicationMode;
    private final com.google.common.collect.HashMultimap<java.lang.String, androidx.media3.session.MediaSession.ControllerInfo> parentIdToSubscribedControllers;

    private boolean isReplicationErrorCode(int i) {
        return i == -102 || i == -105;
    }

    public MediaLibrarySessionImpl(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
        super(mediaLibrarySession, context, str, player, pendingIntent, immutableList, callback, bundle, bundle2, bitmapLoader, z, z2);
        this.instance = mediaLibrarySession;
        this.callback = callback;
        this.libraryErrorReplicationMode = i;
        this.parentIdToSubscribedControllers = com.google.common.collect.HashMultimap.create();
        this.controllerToSubscribedParentIds = com.google.common.collect.HashMultimap.create();
    }

    @Override // androidx.media3.session.MediaSessionImpl
    public java.util.List<androidx.media3.session.MediaSession.ControllerInfo> getConnectedControllers() {
        java.util.List<androidx.media3.session.MediaSession.ControllerInfo> connectedControllers = super.getConnectedControllers();
        androidx.media3.session.MediaLibraryServiceLegacyStub legacyBrowserService = getLegacyBrowserService();
        if (legacyBrowserService != null) {
            connectedControllers.addAll(legacyBrowserService.getConnectedControllersManager().getConnectedControllers());
        }
        return connectedControllers;
    }

    @Override // androidx.media3.session.MediaSessionImpl
    public boolean isConnected(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        if (super.isConnected(controllerInfo)) {
            return true;
        }
        androidx.media3.session.MediaLibraryServiceLegacyStub legacyBrowserService = getLegacyBrowserService();
        return legacyBrowserService != null && legacyBrowserService.getConnectedControllersManager().isConnected(controllerInfo);
    }

    public void clearReplicatedLibraryError() {
        androidx.media3.session.PlayerWrapper playerWrapper = getPlayerWrapper();
        if (playerWrapper.getLegacyError() != null) {
            playerWrapper.clearLegacyErrorStatus();
            getSessionCompat().setPlaybackState(playerWrapper.createPlaybackStateCompat());
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> onGetLibraryRootOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (libraryParams != null && libraryParams.isRecent && isSystemUiController(controllerInfo)) {
            if (!canResumePlaybackOnStart()) {
                return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-6));
            }
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofItem(new androidx.media3.common.MediaItem.Builder().setMediaId(RECENT_LIBRARY_ROOT_MEDIA_ID).setMediaMetadata(new androidx.media3.common.MediaMetadata.Builder().setIsBrowsable(true).setIsPlayable(false).build()).build(), libraryParams));
        }
        return this.callback.onGetLibraryRoot(this.instance, resolveControllerInfoForCallback(controllerInfo), libraryParams);
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> onGetChildrenOnHandler(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, int i, final int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (java.util.Objects.equals(str, RECENT_LIBRARY_ROOT_MEDIA_ID)) {
            if (!canResumePlaybackOnStart()) {
                return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-6));
            }
            if (getPlayerWrapper().getPlaybackState() == 1) {
                return getRecentMediaItemAtDeviceBootTime(controllerInfo, libraryParams);
            }
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofItemList(com.google.common.collect.ImmutableList.of(new androidx.media3.common.MediaItem.Builder().setMediaId("androidx.media3.session.recent.item").setMediaMetadata(new androidx.media3.common.MediaMetadata.Builder().setIsBrowsable(false).setIsPlayable(true).build()).build()), libraryParams));
        }
        final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> listenableFutureOnGetChildren = this.callback.onGetChildren(this.instance, resolveControllerInfoForCallback(controllerInfo), str, i, i2, libraryParams);
        listenableFutureOnGetChildren.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m347x816c3a08(listenableFutureOnGetChildren, controllerInfo, i2);
            }
        }, new androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda1(this));
        return listenableFutureOnGetChildren;
    }

    /* JADX INFO: renamed from: lambda$onGetChildrenOnHandler$0$androidx-media3-session-MediaLibrarySessionImpl, reason: not valid java name */
    /* synthetic */ void m347x816c3a08(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        androidx.media3.session.LibraryResult<?> libraryResult = (androidx.media3.session.LibraryResult) tryGetFutureResult(listenableFuture);
        if (libraryResult != null) {
            maybeUpdateLegacyErrorState(controllerInfo, libraryResult);
            verifyResultItems(libraryResult, i);
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> onGetItemOnHandler(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str) {
        final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> listenableFutureOnGetItem = this.callback.onGetItem(this.instance, resolveControllerInfoForCallback(controllerInfo), str);
        listenableFutureOnGetItem.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m348x1a6f4d75(listenableFutureOnGetItem, controllerInfo);
            }
        }, new androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda1(this));
        return listenableFutureOnGetItem;
    }

    /* JADX INFO: renamed from: lambda$onGetItemOnHandler$1$androidx-media3-session-MediaLibrarySessionImpl, reason: not valid java name */
    /* synthetic */ void m348x1a6f4d75(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        androidx.media3.session.LibraryResult<?> libraryResult = (androidx.media3.session.LibraryResult) tryGetFutureResult(listenableFuture);
        if (libraryResult != null) {
            maybeUpdateLegacyErrorState(controllerInfo, libraryResult);
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> onSubscribeOnHandler(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        this.controllerToSubscribedParentIds.put((androidx.media3.session.MediaSession.ControllerCb) androidx.media3.common.util.Assertions.checkNotNull(controllerInfo.getControllerCb()), str);
        this.parentIdToSubscribedControllers.put(str, controllerInfo);
        final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> listenableFuture = (com.google.common.util.concurrent.ListenableFuture) androidx.media3.common.util.Assertions.checkNotNull(this.callback.onSubscribe(this.instance, resolveControllerInfoForCallback(controllerInfo), str, libraryParams), "onSubscribe must return non-null future");
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m351x944f5215(listenableFuture, controllerInfo, str);
            }
        }, new androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda1(this));
        return listenableFuture;
    }

    /* JADX INFO: renamed from: lambda$onSubscribeOnHandler$2$androidx-media3-session-MediaLibrarySessionImpl, reason: not valid java name */
    /* synthetic */ void m351x944f5215(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str) {
        androidx.media3.session.LibraryResult libraryResult = (androidx.media3.session.LibraryResult) tryGetFutureResult(listenableFuture);
        if (libraryResult == null || libraryResult.resultCode != 0) {
            m352x38a12f2f(controllerInfo, str);
        }
    }

    public com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> getSubscribedControllers(java.lang.String str) {
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.parentIdToSubscribedControllers.get((java.lang.Object) str));
    }

    private boolean isSubscribed(androidx.media3.session.MediaSession.ControllerCb controllerCb, java.lang.String str) {
        return this.controllerToSubscribedParentIds.containsEntry(controllerCb, str);
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> onUnsubscribeOnHandler(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final java.lang.String str) {
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> listenableFutureOnUnsubscribe = this.callback.onUnsubscribe(this.instance, resolveControllerInfoForCallback(controllerInfo), str);
        listenableFutureOnUnsubscribe.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m352x38a12f2f(controllerInfo, str);
            }
        }, new androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda1(this));
        return listenableFutureOnUnsubscribe;
    }

    public void notifyChildrenChanged(java.lang.String str, int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        java.util.List<androidx.media3.session.MediaSession.ControllerInfo> connectedControllers = this.instance.getConnectedControllers();
        for (int i2 = 0; i2 < connectedControllers.size(); i2++) {
            notifyChildrenChanged(connectedControllers.get(i2), str, i, libraryParams);
        }
    }

    public void notifyChildrenChanged(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final java.lang.String str, final int i, final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (isMediaNotificationControllerConnected() && isMediaNotificationController(controllerInfo) && (controllerInfo = getSystemUiControllerInfo()) == null) {
            return;
        }
        dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda4
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                this.f$0.m346x4196d269(str, i, libraryParams, controllerCb, i2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$notifyChildrenChanged$4$androidx-media3-session-MediaLibrarySessionImpl, reason: not valid java name */
    /* synthetic */ void m346x4196d269(java.lang.String str, int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams, androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
        if (isSubscribed(controllerCb, str)) {
            controllerCb.onChildrenChanged(i2, str, i, libraryParams);
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> onSearchOnHandler(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> listenableFutureOnSearch = this.callback.onSearch(this.instance, resolveControllerInfoForCallback(controllerInfo), str, libraryParams);
        listenableFutureOnSearch.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m350x86f02a82(listenableFutureOnSearch, controllerInfo);
            }
        }, new androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda1(this));
        return listenableFutureOnSearch;
    }

    /* JADX INFO: renamed from: lambda$onSearchOnHandler$5$androidx-media3-session-MediaLibrarySessionImpl, reason: not valid java name */
    /* synthetic */ void m350x86f02a82(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        androidx.media3.session.LibraryResult<?> libraryResult = (androidx.media3.session.LibraryResult) tryGetFutureResult(listenableFuture);
        if (libraryResult != null) {
            maybeUpdateLegacyErrorState(controllerInfo, libraryResult);
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> onGetSearchResultOnHandler(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, int i, final int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> listenableFutureOnGetSearchResult = this.callback.onGetSearchResult(this.instance, resolveControllerInfoForCallback(controllerInfo), str, i, i2, libraryParams);
        listenableFutureOnGetSearchResult.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m349xb21d3d68(listenableFutureOnGetSearchResult, controllerInfo, i2);
            }
        }, new androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda1(this));
        return listenableFutureOnGetSearchResult;
    }

    /* JADX INFO: renamed from: lambda$onGetSearchResultOnHandler$6$androidx-media3-session-MediaLibrarySessionImpl, reason: not valid java name */
    /* synthetic */ void m349xb21d3d68(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i) {
        androidx.media3.session.LibraryResult<?> libraryResult = (androidx.media3.session.LibraryResult) tryGetFutureResult(listenableFuture);
        if (libraryResult != null) {
            maybeUpdateLegacyErrorState(controllerInfo, libraryResult);
            verifyResultItems(libraryResult, i);
        }
    }

    public void notifySearchResultChanged(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final java.lang.String str, final int i, final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (isMediaNotificationControllerConnected() && isMediaNotificationController(controllerInfo) && (controllerInfo = getSystemUiControllerInfo()) == null) {
            return;
        }
        dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new androidx.media3.session.MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.MediaLibrarySessionImpl$$ExternalSyntheticLambda5
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(androidx.media3.session.MediaSession.ControllerCb controllerCb, int i2) throws android.os.RemoteException {
                controllerCb.onSearchResultChanged(i2, str, i, libraryParams);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.session.MediaSessionImpl
    public void onDisconnectedOnHandler(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) this.controllerToSubscribedParentIds.get(androidx.media3.common.util.Assertions.checkNotNull(controllerInfo.getControllerCb()))).iterator();
        while (it.hasNext()) {
            m352x38a12f2f(controllerInfo, (java.lang.String) it.next());
        }
        super.onDisconnectedOnHandler(controllerInfo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.session.MediaSessionImpl
    public androidx.media3.session.MediaLibraryServiceLegacyStub getLegacyBrowserService() {
        return (androidx.media3.session.MediaLibraryServiceLegacyStub) super.getLegacyBrowserService();
    }

    @Override // androidx.media3.session.MediaSessionImpl
    protected androidx.media3.session.MediaSessionServiceLegacyStub createLegacyBrowserService(androidx.media3.session.legacy.MediaSessionCompat.Token token) {
        androidx.media3.session.MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub = new androidx.media3.session.MediaLibraryServiceLegacyStub(this);
        mediaLibraryServiceLegacyStub.initialize(token);
        return mediaLibraryServiceLegacyStub;
    }

    @Override // androidx.media3.session.MediaSessionImpl
    protected void dispatchRemoteControllerTaskWithoutReturn(androidx.media3.session.MediaSessionImpl.RemoteControllerTask remoteControllerTask) {
        super.dispatchRemoteControllerTaskWithoutReturn(remoteControllerTask);
        androidx.media3.session.MediaLibraryServiceLegacyStub legacyBrowserService = getLegacyBrowserService();
        if (legacyBrowserService != null) {
            try {
                remoteControllerTask.run(legacyBrowserService.getBrowserLegacyCbForBroadcast(), 0);
            } catch (android.os.RemoteException e) {
                androidx.media3.common.util.Log.e(androidx.media3.session.MediaSessionImpl.TAG, "Exception in using media1 API", e);
            }
        }
    }

    private void maybeUpdateLegacyErrorState(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.LibraryResult<?> libraryResult) {
        if (this.libraryErrorReplicationMode == 0 || controllerInfo.getControllerVersion() != 0) {
            return;
        }
        androidx.media3.session.PlayerWrapper playerWrapper = getPlayerWrapper();
        if (setLegacyErrorState(libraryResult)) {
            getSessionCompat().setPlaybackState(playerWrapper.createPlaybackStateCompat());
        } else if (libraryResult.resultCode == 0) {
            clearReplicatedLibraryError();
        }
    }

    private boolean setLegacyErrorState(androidx.media3.session.LibraryResult<?> libraryResult) {
        androidx.media3.session.PlayerWrapper playerWrapper = getPlayerWrapper();
        if (isReplicationErrorCode(libraryResult.resultCode)) {
            int iConvertToLegacyErrorCode = androidx.media3.session.LegacyConversions.convertToLegacyErrorCode(libraryResult.resultCode);
            androidx.media3.session.PlayerWrapper.LegacyError legacyError = playerWrapper.getLegacyError();
            if (legacyError == null || legacyError.code != iConvertToLegacyErrorCode) {
                java.lang.String str = libraryResult.sessionError != null ? libraryResult.sessionError.message : "no error message provided";
                android.os.Bundle bundle = android.os.Bundle.EMPTY;
                if (libraryResult.params != null && libraryResult.params.extras.containsKey("android.media.extras.ERROR_RESOLUTION_ACTION_INTENT")) {
                    bundle = libraryResult.params.extras;
                } else if (libraryResult.sessionError != null) {
                    bundle = libraryResult.sessionError.extras;
                }
                playerWrapper.setLegacyError(this.libraryErrorReplicationMode == 1, iConvertToLegacyErrorCode, str, bundle);
                return true;
            }
        }
        return false;
    }

    private static <T> T tryGetFutureResult(java.util.concurrent.Future<T> future) {
        androidx.media3.common.util.Assertions.checkState(future.isDone());
        try {
            return future.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            androidx.media3.common.util.Log.w(androidx.media3.session.MediaSessionImpl.TAG, "Library operation failed", e);
            return null;
        }
    }

    private static void verifyResultItems(androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>> libraryResult, int i) {
        if (libraryResult.resultCode == 0) {
            java.util.List list = (java.util.List) androidx.media3.common.util.Assertions.checkNotNull(libraryResult.value);
            if (list.size() > i) {
                throw new java.lang.IllegalStateException("Invalid size=" + list.size() + ", pageSize=" + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: removeSubscription, reason: merged with bridge method [inline-methods] */
    public void m352x38a12f2f(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str) {
        androidx.media3.session.MediaSession.ControllerCb controllerCb = (androidx.media3.session.MediaSession.ControllerCb) androidx.media3.common.util.Assertions.checkNotNull(controllerInfo.getControllerCb());
        this.parentIdToSubscribedControllers.remove(str, controllerInfo);
        this.controllerToSubscribedParentIds.remove(controllerCb, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(java.lang.Runnable runnable) {
        androidx.media3.common.util.Util.postOrRun(getApplicationHandler(), runnable);
    }

    private com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> getRecentMediaItemAtDeviceBootTime(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        if (isMediaNotificationControllerConnected()) {
            controllerInfo = (androidx.media3.session.MediaSession.ControllerInfo) androidx.media3.common.util.Assertions.checkNotNull(getMediaNotificationControllerInfo());
        }
        com.google.common.util.concurrent.Futures.addCallback(this.callback.onPlaybackResumption(this.instance, controllerInfo), new com.google.common.util.concurrent.FutureCallback<androidx.media3.session.MediaSession.MediaItemsWithStartPosition>() { // from class: androidx.media3.session.MediaLibrarySessionImpl.1
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
                if (mediaItemsWithStartPosition.mediaItems.isEmpty()) {
                    settableFutureCreate.set(androidx.media3.session.LibraryResult.ofError(-2, libraryParams));
                } else {
                    settableFutureCreate.set(androidx.media3.session.LibraryResult.ofItemList(com.google.common.collect.ImmutableList.of(mediaItemsWithStartPosition.mediaItems.get(java.lang.Math.max(0, java.lang.Math.min(mediaItemsWithStartPosition.startIndex, mediaItemsWithStartPosition.mediaItems.size() - 1)))), libraryParams));
                }
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                settableFutureCreate.set(androidx.media3.session.LibraryResult.ofError(-1, libraryParams));
                androidx.media3.common.util.Log.e(androidx.media3.session.MediaSessionImpl.TAG, "Failed fetching recent media item at boot time: " + th.getMessage(), th);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return settableFutureCreate;
    }
}
