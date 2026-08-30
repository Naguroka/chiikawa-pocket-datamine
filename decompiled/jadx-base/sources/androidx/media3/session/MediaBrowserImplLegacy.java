package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserImplLegacy extends androidx.media3.session.MediaControllerImplLegacy implements androidx.media3.session.MediaBrowser.MediaBrowserImpl {
    private static final java.lang.String TAG = "MB2ImplLegacy";
    private final java.util.HashMap<androidx.media3.session.MediaLibraryService.LibraryParams, androidx.media3.session.legacy.MediaBrowserCompat> browserCompats;
    private final androidx.media3.session.MediaBrowser instance;
    private final java.util.HashMap<java.lang.String, java.util.List<androidx.media3.session.MediaBrowserImplLegacy.SubscribeCallback>> subscribeCallbacks;

    MediaBrowserImplLegacy(android.content.Context context, androidx.media3.session.MediaBrowser mediaBrowser, androidx.media3.session.SessionToken sessionToken, android.os.Looper looper, androidx.media3.common.util.BitmapLoader bitmapLoader) {
        super(context, mediaBrowser, sessionToken, looper, bitmapLoader);
        this.browserCompats = new java.util.HashMap<>();
        this.subscribeCallbacks = new java.util.HashMap<>();
        this.instance = mediaBrowser;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.media3.session.MediaControllerImplLegacy
    public androidx.media3.session.MediaBrowser getInstance() {
        return this.instance;
    }

    @Override // androidx.media3.session.MediaControllerImplLegacy, androidx.media3.session.MediaController.MediaControllerImpl
    public void release() {
        java.util.Iterator<androidx.media3.session.legacy.MediaBrowserCompat> it = this.browserCompats.values().iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
        this.browserCompats.clear();
        super.release();
    }

    @Override // androidx.media3.session.MediaControllerImplLegacy, androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.SessionCommands getAvailableSessionCommands() {
        if (getBrowserCompat() != null) {
            return super.getAvailableSessionCommands().buildUpon().addAllLibraryCommands().build();
        }
        return super.getAvailableSessionCommands();
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> getLibraryRoot(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (!getInstance().isSessionCommandAvailable(50000)) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-4));
        }
        com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        androidx.media3.session.legacy.MediaBrowserCompat browserCompat = getBrowserCompat(libraryParams);
        if (browserCompat != null) {
            settableFutureCreate.set(androidx.media3.session.LibraryResult.ofItem(createRootMediaItem(browserCompat), null));
        } else {
            androidx.media3.session.legacy.MediaBrowserCompat mediaBrowserCompat = new androidx.media3.session.legacy.MediaBrowserCompat(getContext(), getConnectedToken().getComponentName(), new androidx.media3.session.MediaBrowserImplLegacy.GetLibraryRootCallback(settableFutureCreate, libraryParams), androidx.media3.session.LegacyConversions.convertToRootHints(libraryParams));
            this.browserCompats.put(libraryParams, mediaBrowserCompat);
            mediaBrowserCompat.connect();
        }
        return settableFutureCreate;
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> subscribe(java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (!getInstance().isSessionCommandAvailable(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_SUBSCRIBE)) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-4));
        }
        androidx.media3.session.legacy.MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-100));
        }
        com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        androidx.media3.session.MediaBrowserImplLegacy.SubscribeCallback subscribeCallback = new androidx.media3.session.MediaBrowserImplLegacy.SubscribeCallback(settableFutureCreate);
        java.util.List<androidx.media3.session.MediaBrowserImplLegacy.SubscribeCallback> arrayList = this.subscribeCallbacks.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            this.subscribeCallbacks.put(str, arrayList);
        }
        arrayList.add(subscribeCallback);
        browserCompat.subscribe(str, createOptions(libraryParams), subscribeCallback);
        return settableFutureCreate;
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> unsubscribe(java.lang.String str) {
        if (!getInstance().isSessionCommandAvailable(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_UNSUBSCRIBE)) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-4));
        }
        androidx.media3.session.legacy.MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-100));
        }
        java.util.List<androidx.media3.session.MediaBrowserImplLegacy.SubscribeCallback> list = this.subscribeCallbacks.get(str);
        if (list == null) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-3));
        }
        for (int i = 0; i < list.size(); i++) {
            browserCompat.unsubscribe(str, list.get(i));
        }
        return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofVoid());
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> getChildren(java.lang.String str, int i, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (!getInstance().isSessionCommandAvailable(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_CHILDREN)) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-4));
        }
        androidx.media3.session.legacy.MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-100));
        }
        com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        browserCompat.subscribe(str, createOptions(libraryParams, i, i2), new androidx.media3.session.MediaBrowserImplLegacy.GetChildrenCallback(settableFutureCreate, str));
        return settableFutureCreate;
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> getItem(java.lang.String str) {
        if (!getInstance().isSessionCommandAvailable(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_ITEM)) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-4));
        }
        androidx.media3.session.legacy.MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-100));
        }
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        browserCompat.getItem(str, new androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback() { // from class: androidx.media3.session.MediaBrowserImplLegacy.1
            @Override // androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback
            public void onItemLoaded(androidx.media3.session.legacy.MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem != null) {
                    settableFutureCreate.set(androidx.media3.session.LibraryResult.ofItem(androidx.media3.session.LegacyConversions.convertToMediaItem(mediaItem), null));
                } else {
                    settableFutureCreate.set(androidx.media3.session.LibraryResult.ofError(-3));
                }
            }

            @Override // androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback
            public void onError(java.lang.String str2) {
                settableFutureCreate.set(androidx.media3.session.LibraryResult.ofError(-1));
            }
        });
        return settableFutureCreate;
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> search(java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (!getInstance().isSessionCommandAvailable(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_SEARCH)) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-4));
        }
        androidx.media3.session.legacy.MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-100));
        }
        browserCompat.search(str, getExtras(libraryParams), new androidx.media3.session.MediaBrowserImplLegacy.AnonymousClass2());
        return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofVoid());
    }

    /* JADX INFO: renamed from: androidx.media3.session.MediaBrowserImplLegacy$2, reason: invalid class name */
    class AnonymousClass2 extends androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback {
        AnonymousClass2() {
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback
        public void onSearchResult(final java.lang.String str, android.os.Bundle bundle, final java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
            androidx.media3.session.MediaBrowserImplLegacy.this.getInstance().notifyBrowserListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaBrowserImplLegacy$2$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m232x87f18d83(str, list, (androidx.media3.session.MediaBrowser.Listener) obj);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onSearchResult$0$androidx-media3-session-MediaBrowserImplLegacy$2, reason: not valid java name */
        /* synthetic */ void m232x87f18d83(java.lang.String str, java.util.List list, androidx.media3.session.MediaBrowser.Listener listener) {
            listener.onSearchResultChanged(androidx.media3.session.MediaBrowserImplLegacy.this.getInstance(), str, list.size(), null);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback
        public void onError(final java.lang.String str, android.os.Bundle bundle) {
            androidx.media3.session.MediaBrowserImplLegacy.this.getInstance().notifyBrowserListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaBrowserImplLegacy$2$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m231x841a1c17(str, (androidx.media3.session.MediaBrowser.Listener) obj);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onError$1$androidx-media3-session-MediaBrowserImplLegacy$2, reason: not valid java name */
        /* synthetic */ void m231x841a1c17(java.lang.String str, androidx.media3.session.MediaBrowser.Listener listener) {
            listener.onSearchResultChanged(androidx.media3.session.MediaBrowserImplLegacy.this.getInstance(), str, 0, null);
        }
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> getSearchResult(java.lang.String str, int i, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (!getInstance().isSessionCommandAvailable(androidx.media3.session.SessionCommand.COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT)) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-4));
        }
        androidx.media3.session.legacy.MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-100));
        }
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        android.os.Bundle bundleCreateOptions = createOptions(libraryParams, i, i2);
        bundleCreateOptions.putInt("android.media.browse.extra.PAGE", i);
        bundleCreateOptions.putInt("android.media.browse.extra.PAGE_SIZE", i2);
        browserCompat.search(str, bundleCreateOptions, new androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback() { // from class: androidx.media3.session.MediaBrowserImplLegacy.3
            @Override // androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback
            public void onSearchResult(java.lang.String str2, android.os.Bundle bundle, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
                settableFutureCreate.set(androidx.media3.session.LibraryResult.ofItemList(androidx.media3.session.LegacyConversions.convertBrowserItemListToMediaItemList(list), null));
            }

            @Override // androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback
            public void onError(java.lang.String str2, android.os.Bundle bundle) {
                settableFutureCreate.set(androidx.media3.session.LibraryResult.ofError(-1));
            }
        });
        return settableFutureCreate;
    }

    private androidx.media3.session.legacy.MediaBrowserCompat getBrowserCompat(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return this.browserCompats.get(libraryParams);
    }

    private static android.os.Bundle createOptions(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return libraryParams == null ? new android.os.Bundle() : new android.os.Bundle(libraryParams.extras);
    }

    private static android.os.Bundle createOptions(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams, int i, int i2) {
        android.os.Bundle bundleCreateOptions = createOptions(libraryParams);
        bundleCreateOptions.putInt("android.media.browse.extra.PAGE", i);
        bundleCreateOptions.putInt("android.media.browse.extra.PAGE_SIZE", i2);
        return bundleCreateOptions;
    }

    private static android.os.Bundle getExtras(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        if (libraryParams != null) {
            return libraryParams.extras;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.common.MediaItem createRootMediaItem(androidx.media3.session.legacy.MediaBrowserCompat mediaBrowserCompat) {
        java.lang.String root = mediaBrowserCompat.getRoot();
        return new androidx.media3.common.MediaItem.Builder().setMediaId(root).setMediaMetadata(new androidx.media3.common.MediaMetadata.Builder().setIsBrowsable(true).setMediaType(20).setIsPlayable(false).setExtras(mediaBrowserCompat.getExtras()).build()).build();
    }

    private class GetLibraryRootCallback extends androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback {
        private final androidx.media3.session.MediaLibraryService.LibraryParams params;
        private final com.google.common.util.concurrent.SettableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> result;

        public GetLibraryRootCallback(com.google.common.util.concurrent.SettableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> settableFuture, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
            this.result = settableFuture;
            this.params = libraryParams;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            androidx.media3.session.legacy.MediaBrowserCompat mediaBrowserCompat = (androidx.media3.session.legacy.MediaBrowserCompat) androidx.media3.session.MediaBrowserImplLegacy.this.browserCompats.get(this.params);
            if (mediaBrowserCompat == null) {
                this.result.set(androidx.media3.session.LibraryResult.ofError(-1));
            } else {
                this.result.set(androidx.media3.session.LibraryResult.ofItem(androidx.media3.session.MediaBrowserImplLegacy.this.createRootMediaItem(mediaBrowserCompat), androidx.media3.session.LegacyConversions.convertToLibraryParams(androidx.media3.session.MediaBrowserImplLegacy.this.context, mediaBrowserCompat.getExtras())));
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            onConnectionFailed();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            this.result.set(androidx.media3.session.LibraryResult.ofError(-3));
            androidx.media3.session.MediaBrowserImplLegacy.this.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SubscribeCallback extends androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback {
        private final com.google.common.util.concurrent.SettableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> future;

        public SubscribeCallback(com.google.common.util.concurrent.SettableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> settableFuture) {
            this.future = settableFuture;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onError(java.lang.String str) {
            onErrorInternal();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onError(java.lang.String str, android.os.Bundle bundle) {
            onErrorInternal();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
            onChildrenLoadedInternal(str, list);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle) {
            onChildrenLoadedInternal(str, list);
        }

        private void onErrorInternal() {
            this.future.set(androidx.media3.session.LibraryResult.ofError(-1));
        }

        private void onChildrenLoadedInternal(final java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
            if (android.text.TextUtils.isEmpty(str)) {
                androidx.media3.common.util.Log.w(androidx.media3.session.MediaBrowserImplLegacy.TAG, "SubscribeCallback.onChildrenLoaded(): Ignoring empty parentId");
                return;
            }
            androidx.media3.session.legacy.MediaBrowserCompat browserCompat = androidx.media3.session.MediaBrowserImplLegacy.this.getBrowserCompat();
            if (browserCompat == null || list == null) {
                return;
            }
            final int size = list.size();
            final androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsConvertToLibraryParams = androidx.media3.session.LegacyConversions.convertToLibraryParams(androidx.media3.session.MediaBrowserImplLegacy.this.context, browserCompat.getNotifyChildrenChangedOptions());
            androidx.media3.session.MediaBrowserImplLegacy.this.getInstance().notifyBrowserListener(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.session.MediaBrowserImplLegacy$SubscribeCallback$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f$0.m233xaa936684(str, size, libraryParamsConvertToLibraryParams, (androidx.media3.session.MediaBrowser.Listener) obj);
                }
            });
            this.future.set(androidx.media3.session.LibraryResult.ofVoid());
        }

        /* JADX INFO: renamed from: lambda$onChildrenLoadedInternal$0$androidx-media3-session-MediaBrowserImplLegacy$SubscribeCallback, reason: not valid java name */
        /* synthetic */ void m233xaa936684(java.lang.String str, int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams, androidx.media3.session.MediaBrowser.Listener listener) {
            listener.onChildrenChanged(androidx.media3.session.MediaBrowserImplLegacy.this.getInstance(), str, i, libraryParams);
        }
    }

    private class GetChildrenCallback extends androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback {
        private final com.google.common.util.concurrent.SettableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> future;
        private final java.lang.String parentId;

        public GetChildrenCallback(com.google.common.util.concurrent.SettableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> settableFuture, java.lang.String str) {
            this.future = settableFuture;
            this.parentId = str;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onError(java.lang.String str) {
            onErrorInternal();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onError(java.lang.String str, android.os.Bundle bundle) {
            onErrorInternal();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
            onChildrenLoadedInternal(str, list);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle) {
            onChildrenLoadedInternal(str, list);
        }

        private void onErrorInternal() {
            this.future.set(androidx.media3.session.LibraryResult.ofError(-1));
        }

        private void onChildrenLoadedInternal(java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
            if (android.text.TextUtils.isEmpty(str)) {
                androidx.media3.common.util.Log.w(androidx.media3.session.MediaBrowserImplLegacy.TAG, "GetChildrenCallback.onChildrenLoaded(): Ignoring empty parentId");
                return;
            }
            androidx.media3.session.legacy.MediaBrowserCompat browserCompat = androidx.media3.session.MediaBrowserImplLegacy.this.getBrowserCompat();
            if (browserCompat == null) {
                this.future.set(androidx.media3.session.LibraryResult.ofError(-100));
                return;
            }
            browserCompat.unsubscribe(this.parentId, this);
            if (list == null) {
                this.future.set(androidx.media3.session.LibraryResult.ofError(-1));
            } else {
                this.future.set(androidx.media3.session.LibraryResult.ofItemList(androidx.media3.session.LegacyConversions.convertBrowserItemListToMediaItemList(list), null));
            }
        }
    }
}
