package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaLibraryServiceLegacyStub extends androidx.media3.session.MediaSessionServiceLegacyStub {
    private static final java.lang.String TAG = "MLSLegacyStub";
    private final androidx.media3.session.MediaSession.ControllerCb browserLegacyCbForBroadcast;
    private final androidx.media3.session.MediaLibrarySessionImpl librarySessionImpl;

    private static <T> void ignoreFuture(java.util.concurrent.Future<T> future) {
    }

    public MediaLibraryServiceLegacyStub(androidx.media3.session.MediaLibrarySessionImpl mediaLibrarySessionImpl) {
        super(mediaLibrarySessionImpl);
        this.librarySessionImpl = mediaLibrarySessionImpl;
        this.browserLegacyCbForBroadcast = new androidx.media3.session.MediaLibraryServiceLegacyStub.BrowserLegacyCbForBroadcast();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.session.MediaSessionServiceLegacyStub, androidx.media3.session.legacy.MediaBrowserServiceCompat
    public androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot onGetRoot(java.lang.String str, int i, android.os.Bundle bundle) {
        final androidx.media3.session.MediaSession.ControllerInfo currentController;
        androidx.media3.session.LibraryResult libraryResult;
        android.os.Bundle bundle2;
        if (super.onGetRoot(str, i, bundle) == null || (currentController = getCurrentController()) == null || !getConnectedControllersManager().isSessionCommandAvailable(currentController, 50000)) {
            return null;
        }
        final androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsConvertToLibraryParams = androidx.media3.session.LegacyConversions.convertToLibraryParams(this.librarySessionImpl.getContext(), bundle);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable();
        androidx.media3.common.util.Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m339xa7534c8(atomicReference, currentController, libraryParamsConvertToLibraryParams, conditionVariable);
            }
        });
        try {
            conditionVariable.block();
            libraryResult = (androidx.media3.session.LibraryResult) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.session.LibraryResult) ((com.google.common.util.concurrent.ListenableFuture) atomicReference.get()).get(), "LibraryResult must not be null");
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            androidx.media3.common.util.Log.e(TAG, "Couldn't get a result from onGetLibraryRoot", e);
            libraryResult = null;
        }
        if (libraryResult != null && libraryResult.resultCode == 0 && libraryResult.value != 0) {
            if (libraryResult.params != null) {
                bundle2 = androidx.media3.session.LegacyConversions.convertToRootHints(libraryResult.params);
            } else {
                bundle2 = new android.os.Bundle();
            }
            ((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle2)).putBoolean("android.media.browse.SEARCH_SUPPORTED", getConnectedControllersManager().isSessionCommandAvailable(currentController, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_SEARCH));
            return new androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot(((androidx.media3.common.MediaItem) libraryResult.value).mediaId, bundle2);
        }
        if (libraryResult == null || libraryResult.resultCode == 0) {
            return androidx.media3.session.MediaUtils.defaultBrowserRoot;
        }
        return null;
    }

    /* JADX INFO: renamed from: lambda$onGetRoot$0$androidx-media3-session-MediaLibraryServiceLegacyStub, reason: not valid java name */
    /* synthetic */ void m339xa7534c8(java.util.concurrent.atomic.AtomicReference atomicReference, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams, androidx.media3.common.util.ConditionVariable conditionVariable) {
        atomicReference.set(this.librarySessionImpl.onGetLibraryRootOnHandler(controllerInfo, libraryParams));
        conditionVariable.open();
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onSubscribe(final java.lang.String str, final android.os.Bundle bundle) {
        final androidx.media3.session.MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "onSubscribe(): Ignoring empty id from " + currentController);
        } else {
            androidx.media3.common.util.Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m343x33fceefb(currentController, bundle, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onSubscribe$1$androidx-media3-session-MediaLibraryServiceLegacyStub, reason: not valid java name */
    /* synthetic */ void m343x33fceefb(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, android.os.Bundle bundle, java.lang.String str) {
        if (getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_SUBSCRIBE)) {
            ignoreFuture(this.librarySessionImpl.onSubscribeOnHandler(controllerInfo, str, androidx.media3.session.LegacyConversions.convertToLibraryParams(this.librarySessionImpl.getContext(), bundle)));
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onUnsubscribe(final java.lang.String str) {
        final androidx.media3.session.MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "onUnsubscribe(): Ignoring empty id from " + currentController);
        } else {
            androidx.media3.common.util.Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m344xd6387fc3(currentController, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onUnsubscribe$2$androidx-media3-session-MediaLibraryServiceLegacyStub, reason: not valid java name */
    /* synthetic */ void m344xd6387fc3(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str) {
        if (getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_UNSUBSCRIBE)) {
            ignoreFuture(this.librarySessionImpl.onUnsubscribeOnHandler(controllerInfo, str));
        }
    }

    @Override // androidx.media3.session.MediaSessionServiceLegacyStub, androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onLoadChildren(java.lang.String str, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result) {
        onLoadChildren(str, result, null);
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onLoadChildren(final java.lang.String str, final androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result, final android.os.Bundle bundle) {
        final androidx.media3.session.MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            result.sendResult(null);
        } else if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "onLoadChildren(): Ignoring empty parentId from " + currentController);
            result.sendResult(null);
        } else {
            result.detach();
            androidx.media3.common.util.Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m340x4e3aab0(currentController, result, bundle, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onLoadChildren$3$androidx-media3-session-MediaLibraryServiceLegacyStub, reason: not valid java name */
    /* synthetic */ void m340x4e3aab0(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result, android.os.Bundle bundle, java.lang.String str) {
        if (!getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_CHILDREN)) {
            result.sendResult(null);
            return;
        }
        if (bundle != null) {
            bundle.setClassLoader(this.librarySessionImpl.getContext().getClassLoader());
            try {
                int i = bundle.getInt("android.media.browse.extra.PAGE");
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE");
                if (i >= 0 && i2 > 0) {
                    sendLibraryResultWithMediaItemsWhenReady(result, androidx.media3.common.util.Util.transformFutureAsync(this.librarySessionImpl.onGetChildrenOnHandler(controllerInfo, str, i, i2, androidx.media3.session.LegacyConversions.convertToLibraryParams(this.librarySessionImpl.getContext(), bundle)), createMediaItemsToBrowserItemsAsyncFunction()));
                    return;
                }
            } catch (android.os.BadParcelableException unused) {
            }
        }
        sendLibraryResultWithMediaItemsWhenReady(result, androidx.media3.common.util.Util.transformFutureAsync(this.librarySessionImpl.onGetChildrenOnHandler(controllerInfo, str, 0, Integer.MAX_VALUE, null), createMediaItemsToBrowserItemsAsyncFunction()));
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onLoadItem(final java.lang.String str, final androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> result) {
        final androidx.media3.session.MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            result.sendResult(null);
        } else if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring empty itemId from " + currentController);
            result.sendResult(null);
        } else {
            result.detach();
            androidx.media3.common.util.Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m341xa4bca205(currentController, result, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onLoadItem$4$androidx-media3-session-MediaLibraryServiceLegacyStub, reason: not valid java name */
    /* synthetic */ void m341xa4bca205(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result, java.lang.String str) {
        if (!getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_ITEM)) {
            result.sendResult(null);
        } else {
            sendLibraryResultWithMediaItemWhenReady(result, androidx.media3.common.util.Util.transformFutureAsync(this.librarySessionImpl.onGetItemOnHandler(controllerInfo, str), createMediaItemToBrowserItemAsyncFunction()));
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onSearch(final java.lang.String str, final android.os.Bundle bundle, final androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result) {
        final androidx.media3.session.MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            result.sendResult(null);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring empty query from " + currentController);
            result.sendResult(null);
        } else if (currentController.getControllerCb() instanceof androidx.media3.session.MediaLibraryServiceLegacyStub.BrowserLegacyCb) {
            result.detach();
            androidx.media3.common.util.Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m342xa75a61d5(currentController, result, str, bundle);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onSearch$5$androidx-media3-session-MediaLibraryServiceLegacyStub, reason: not valid java name */
    /* synthetic */ void m342xa75a61d5(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result, java.lang.String str, android.os.Bundle bundle) {
        if (!getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_SEARCH)) {
            result.sendResult(null);
            return;
        }
        ((androidx.media3.session.MediaLibraryServiceLegacyStub.BrowserLegacyCb) androidx.media3.common.util.Assertions.checkStateNotNull(controllerInfo.getControllerCb())).registerSearchRequest(controllerInfo, str, bundle, result);
        ignoreFuture(this.librarySessionImpl.onSearchOnHandler(controllerInfo, str, androidx.media3.session.LegacyConversions.convertToLibraryParams(this.librarySessionImpl.getContext(), bundle)));
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onCustomAction(final java.lang.String str, final android.os.Bundle bundle, final androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<android.os.Bundle> result) {
        final androidx.media3.session.MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            result.sendError(null);
        } else {
            result.detach();
            androidx.media3.common.util.Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m338x888c5875(str, currentController, result, bundle);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onCustomAction$6$androidx-media3-session-MediaLibraryServiceLegacyStub, reason: not valid java name */
    /* synthetic */ void m338x888c5875(java.lang.String str, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result, android.os.Bundle bundle) {
        androidx.media3.session.SessionCommand sessionCommand = new androidx.media3.session.SessionCommand(str, android.os.Bundle.EMPTY);
        if (!getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, sessionCommand)) {
            result.sendError(null);
        } else {
            sendCustomActionResultWhenReady(result, this.librarySessionImpl.onCustomCommandOnHandler(controllerInfo, sessionCommand, bundle));
        }
    }

    @Override // androidx.media3.session.MediaSessionServiceLegacyStub
    public androidx.media3.session.MediaSession.ControllerInfo createControllerInfo(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, android.os.Bundle bundle) {
        return new androidx.media3.session.MediaSession.ControllerInfo(remoteUserInfo, 0, 0, getMediaSessionManager().isTrustedForMediaControl(remoteUserInfo), new androidx.media3.session.MediaLibraryServiceLegacyStub.BrowserLegacyCb(remoteUserInfo), bundle);
    }

    public androidx.media3.session.MediaSession.ControllerCb getBrowserLegacyCbForBroadcast() {
        return this.browserLegacyCbForBroadcast;
    }

    private androidx.media3.session.MediaSession.ControllerInfo getCurrentController() {
        return getConnectedControllersManager().getController(getCurrentBrowserInfo());
    }

    private static void sendCustomActionResultWhenReady(final androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<android.os.Bundle> result, final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.SessionResult> listenableFuture) {
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.session.MediaLibraryServiceLegacyStub.lambda$sendCustomActionResultWhenReady$7(listenableFuture, result);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void lambda$sendCustomActionResultWhenReady$7(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result) {
        try {
            result.sendResult(((androidx.media3.session.SessionResult) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.session.SessionResult) listenableFuture.get(), "SessionResult must not be null")).extras);
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            androidx.media3.common.util.Log.w(TAG, "Custom action failed", e);
            result.sendError(null);
        }
    }

    private static void sendLibraryResultWithMediaItemWhenReady(final androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> result, final com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> listenableFuture) {
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.session.MediaLibraryServiceLegacyStub.lambda$sendLibraryResultWithMediaItemWhenReady$8(listenableFuture, result);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void lambda$sendLibraryResultWithMediaItemWhenReady$8(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result) {
        try {
            result.sendResult((androidx.media3.session.legacy.MediaBrowserCompat.MediaItem) listenableFuture.get());
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            androidx.media3.common.util.Log.w(TAG, "Library operation failed", e);
            result.sendResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendLibraryResultWithMediaItemsWhenReady(final androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result, final com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> listenableFuture) {
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.session.MediaLibraryServiceLegacyStub.lambda$sendLibraryResultWithMediaItemsWhenReady$9(listenableFuture, result);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    static /* synthetic */ void lambda$sendLibraryResultWithMediaItemsWhenReady$9(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result result) {
        try {
            java.util.List list = (java.util.List) listenableFuture.get();
            result.sendResult(list == null ? null : androidx.media3.session.MediaUtils.truncateListBySize(list, 262144));
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            androidx.media3.common.util.Log.w(TAG, "Library operation failed", e);
            result.sendResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.util.concurrent.AsyncFunction<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> createMediaItemsToBrowserItemsAsyncFunction() {
        return new com.google.common.util.concurrent.AsyncFunction() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda9
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return this.f$0.m337xa49f4399((androidx.media3.session.LibraryResult) obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lambda$createMediaItemsToBrowserItemsAsyncFunction$12$androidx-media3-session-MediaLibraryServiceLegacyStub, reason: not valid java name */
    /* synthetic */ com.google.common.util.concurrent.ListenableFuture m337xa49f4399(androidx.media3.session.LibraryResult libraryResult) throws java.lang.Exception {
        androidx.media3.common.util.Assertions.checkNotNull(libraryResult, "LibraryResult must not be null");
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        if (libraryResult.resultCode != 0 || libraryResult.value == 0) {
            settableFutureCreate.set(null);
            return settableFutureCreate;
        }
        final com.google.common.collect.ImmutableList immutableList = (com.google.common.collect.ImmutableList) libraryResult.value;
        if (immutableList.isEmpty()) {
            settableFutureCreate.set(new java.util.ArrayList());
            return settableFutureCreate;
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        settableFutureCreate.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.session.MediaLibraryServiceLegacyStub.lambda$createMediaItemsToBrowserItemsAsyncFunction$10(settableFutureCreate, arrayList);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m336x7b4aee58(atomicInteger, immutableList, arrayList, settableFutureCreate);
            }
        };
        for (int i = 0; i < immutableList.size(); i++) {
            androidx.media3.common.MediaMetadata mediaMetadata = ((androidx.media3.common.MediaItem) immutableList.get(i)).mediaMetadata;
            if (mediaMetadata.artworkData == null) {
                arrayList.add(null);
                runnable.run();
            } else {
                com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFutureDecodeBitmap = this.librarySessionImpl.getBitmapLoader().decodeBitmap(mediaMetadata.artworkData);
                arrayList.add(listenableFutureDecodeBitmap);
                listenableFutureDecodeBitmap.addListener(runnable, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            }
        }
        return settableFutureCreate;
    }

    static /* synthetic */ void lambda$createMediaItemsToBrowserItemsAsyncFunction$10(com.google.common.util.concurrent.SettableFuture settableFuture, java.util.List list) {
        if (settableFuture.isCancelled()) {
            cancelAllFutures(list);
        }
    }

    /* JADX INFO: renamed from: lambda$createMediaItemsToBrowserItemsAsyncFunction$11$androidx-media3-session-MediaLibraryServiceLegacyStub, reason: not valid java name */
    /* synthetic */ void m336x7b4aee58(java.util.concurrent.atomic.AtomicInteger atomicInteger, com.google.common.collect.ImmutableList immutableList, java.util.List list, com.google.common.util.concurrent.SettableFuture settableFuture) {
        if (atomicInteger.incrementAndGet() == immutableList.size()) {
            handleBitmapFuturesAllCompletedAndSetOutputFuture(list, immutableList, settableFuture);
        }
    }

    private void handleBitmapFuturesAllCompletedAndSetOutputFuture(java.util.List<com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap>> list, java.util.List<androidx.media3.common.MediaItem> list2, com.google.common.util.concurrent.SettableFuture<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> settableFuture) {
        android.graphics.Bitmap bitmap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFuture = list.get(i);
            if (listenableFuture != null) {
                try {
                    bitmap = (android.graphics.Bitmap) com.google.common.util.concurrent.Futures.getDone(listenableFuture);
                } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
                    androidx.media3.common.util.Log.d(TAG, "Failed to get bitmap", e);
                    bitmap = null;
                }
            } else {
                bitmap = null;
            }
            arrayList.add(androidx.media3.session.LegacyConversions.convertToBrowserItem(list2.get(i), bitmap));
        }
        settableFuture.set(arrayList);
    }

    private static <T> void cancelAllFutures(java.util.List<com.google.common.util.concurrent.ListenableFuture<T>> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                list.get(i).cancel(false);
            }
        }
    }

    private com.google.common.util.concurrent.AsyncFunction<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>, androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> createMediaItemToBrowserItemAsyncFunction() {
        return new com.google.common.util.concurrent.AsyncFunction() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda2
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return this.f$0.m335xc5987e36((androidx.media3.session.LibraryResult) obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lambda$createMediaItemToBrowserItemAsyncFunction$15$androidx-media3-session-MediaLibraryServiceLegacyStub, reason: not valid java name */
    /* synthetic */ com.google.common.util.concurrent.ListenableFuture m335xc5987e36(androidx.media3.session.LibraryResult libraryResult) throws java.lang.Exception {
        androidx.media3.common.util.Assertions.checkNotNull(libraryResult, "LibraryResult must not be null");
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        if (libraryResult.resultCode != 0 || libraryResult.value == 0) {
            settableFutureCreate.set(null);
            return settableFutureCreate;
        }
        final androidx.media3.common.MediaItem mediaItem = (androidx.media3.common.MediaItem) libraryResult.value;
        androidx.media3.common.MediaMetadata mediaMetadata = mediaItem.mediaMetadata;
        if (mediaMetadata.artworkData == null) {
            settableFutureCreate.set(androidx.media3.session.LegacyConversions.convertToBrowserItem(mediaItem, null));
            return settableFutureCreate;
        }
        final com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFutureDecodeBitmap = this.librarySessionImpl.getBitmapLoader().decodeBitmap(mediaMetadata.artworkData);
        settableFutureCreate.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.session.MediaLibraryServiceLegacyStub.lambda$createMediaItemToBrowserItemAsyncFunction$13(settableFutureCreate, listenableFutureDecodeBitmap);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        listenableFutureDecodeBitmap.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.session.MediaLibraryServiceLegacyStub.lambda$createMediaItemToBrowserItemAsyncFunction$14(listenableFutureDecodeBitmap, settableFutureCreate, mediaItem);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return settableFutureCreate;
    }

    static /* synthetic */ void lambda$createMediaItemToBrowserItemAsyncFunction$13(com.google.common.util.concurrent.SettableFuture settableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        if (settableFuture.isCancelled()) {
            listenableFuture.cancel(false);
        }
    }

    static /* synthetic */ void lambda$createMediaItemToBrowserItemAsyncFunction$14(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.common.util.concurrent.SettableFuture settableFuture, androidx.media3.common.MediaItem mediaItem) {
        android.graphics.Bitmap bitmap;
        try {
            bitmap = (android.graphics.Bitmap) com.google.common.util.concurrent.Futures.getDone(listenableFuture);
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            androidx.media3.common.util.Log.d(TAG, "failed to get bitmap", e);
            bitmap = null;
        }
        settableFuture.set(androidx.media3.session.LegacyConversions.convertToBrowserItem(mediaItem, bitmap));
    }

    private static class SearchRequest {
        public final androidx.media3.session.MediaSession.ControllerInfo controller;
        public final android.os.Bundle extras;
        public final java.lang.String query;
        public final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo;
        public final androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result;

        public SearchRequest(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result) {
            this.controller = controllerInfo;
            this.remoteUserInfo = remoteUserInfo;
            this.query = str;
            this.extras = bundle;
            this.result = result;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class BrowserLegacyCb implements androidx.media3.session.MediaSession.ControllerCb {
        private final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo;
        private final java.lang.Object lock = new java.lang.Object();
        private final java.util.List<androidx.media3.session.MediaLibraryServiceLegacyStub.SearchRequest> searchRequests = new java.util.ArrayList();

        public BrowserLegacyCb(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.remoteUserInfo = remoteUserInfo;
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onChildrenChanged(int i, java.lang.String str, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) throws android.os.RemoteException {
            android.os.Bundle bundle = libraryParams != null ? libraryParams.extras : null;
            androidx.media3.session.MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub = androidx.media3.session.MediaLibraryServiceLegacyStub.this;
            androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo = this.remoteUserInfo;
            if (bundle == null) {
                bundle = android.os.Bundle.EMPTY;
            }
            mediaLibraryServiceLegacyStub.notifyChildrenChanged(remoteUserInfo, str, bundle);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSearchResultChanged(int i, java.lang.String str, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) throws android.os.RemoteException {
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (this.lock) {
                for (int size = this.searchRequests.size() - 1; size >= 0; size--) {
                    androidx.media3.session.MediaLibraryServiceLegacyStub.SearchRequest searchRequest = this.searchRequests.get(size);
                    if (androidx.media3.common.util.Util.areEqual(this.remoteUserInfo, searchRequest.remoteUserInfo) && searchRequest.query.equals(str)) {
                        arrayList.add(searchRequest);
                        this.searchRequests.remove(size);
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
                androidx.media3.common.util.Util.postOrRun(androidx.media3.session.MediaLibraryServiceLegacyStub.this.librarySessionImpl.getApplicationHandler(), new java.lang.Runnable() { // from class: androidx.media3.session.MediaLibraryServiceLegacyStub$BrowserLegacyCb$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m345xc133ba0b(arrayList);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$onSearchResultChanged$0$androidx-media3-session-MediaLibraryServiceLegacyStub$BrowserLegacyCb, reason: not valid java name */
        /* synthetic */ void m345xc133ba0b(java.util.List list) {
            int i;
            int i2;
            int i3;
            int i4;
            for (int i5 = 0; i5 < list.size(); i5++) {
                androidx.media3.session.MediaLibraryServiceLegacyStub.SearchRequest searchRequest = (androidx.media3.session.MediaLibraryServiceLegacyStub.SearchRequest) list.get(i5);
                if (searchRequest.extras != null) {
                    try {
                        searchRequest.extras.setClassLoader(androidx.media3.session.MediaLibraryServiceLegacyStub.this.librarySessionImpl.getContext().getClassLoader());
                        i = searchRequest.extras.getInt("android.media.browse.extra.PAGE", -1);
                        i2 = searchRequest.extras.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                    } catch (android.os.BadParcelableException unused) {
                        searchRequest.result.sendResult(null);
                        return;
                    }
                } else {
                    i = 0;
                    i2 = Integer.MAX_VALUE;
                }
                if (i < 0 || i2 < 1) {
                    i3 = 0;
                    i4 = Integer.MAX_VALUE;
                } else {
                    i3 = i;
                    i4 = i2;
                }
                androidx.media3.session.MediaLibraryServiceLegacyStub.sendLibraryResultWithMediaItemsWhenReady(searchRequest.result, androidx.media3.common.util.Util.transformFutureAsync(androidx.media3.session.MediaLibraryServiceLegacyStub.this.librarySessionImpl.onGetSearchResultOnHandler(searchRequest.controller, searchRequest.query, i3, i4, androidx.media3.session.LegacyConversions.convertToLibraryParams(androidx.media3.session.MediaLibraryServiceLegacyStub.this.librarySessionImpl.getContext(), searchRequest.extras)), androidx.media3.session.MediaLibraryServiceLegacyStub.this.createMediaItemsToBrowserItemsAsyncFunction()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void registerSearchRequest(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result) {
            synchronized (this.lock) {
                this.searchRequests.add(new androidx.media3.session.MediaLibraryServiceLegacyStub.SearchRequest(controllerInfo, controllerInfo.getRemoteUserInfo(), str, bundle, result));
            }
        }

        public int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(this.remoteUserInfo);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.media3.session.MediaLibraryServiceLegacyStub.BrowserLegacyCb) {
                return androidx.media3.common.util.Util.areEqual(this.remoteUserInfo, ((androidx.media3.session.MediaLibraryServiceLegacyStub.BrowserLegacyCb) obj).remoteUserInfo);
            }
            return false;
        }
    }

    private final class BrowserLegacyCbForBroadcast implements androidx.media3.session.MediaSession.ControllerCb {
        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSearchResultChanged(int i, java.lang.String str, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) throws android.os.RemoteException {
        }

        private BrowserLegacyCbForBroadcast() {
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onChildrenChanged(int i, java.lang.String str, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) throws android.os.RemoteException {
            if (libraryParams == null || libraryParams.extras == null) {
                androidx.media3.session.MediaLibraryServiceLegacyStub.this.notifyChildrenChanged(str);
            } else {
                androidx.media3.session.MediaLibraryServiceLegacyStub.this.notifyChildrenChanged(str, (android.os.Bundle) androidx.media3.common.util.Util.castNonNull(libraryParams.extras));
            }
        }
    }
}
