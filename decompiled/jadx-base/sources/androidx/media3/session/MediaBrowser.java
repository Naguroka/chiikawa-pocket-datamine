package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowser extends androidx.media3.session.MediaController {
    private static final java.lang.String WRONG_THREAD_ERROR_MESSAGE = "MediaBrowser method is called from a wrong thread. See javadoc of MediaController for details.";

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private androidx.media3.session.MediaBrowser.MediaBrowserImpl impl;

    public interface Listener extends androidx.media3.session.MediaController.Listener {
        default void onChildrenChanged(androidx.media3.session.MediaBrowser mediaBrowser, java.lang.String str, int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        }

        default void onSearchResultChanged(androidx.media3.session.MediaBrowser mediaBrowser, java.lang.String str, int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        }
    }

    interface MediaBrowserImpl extends androidx.media3.session.MediaController.MediaControllerImpl {
        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> getChildren(java.lang.String str, int i, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> getItem(java.lang.String str);

        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> getLibraryRoot(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> getSearchResult(java.lang.String str, int i, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> search(java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> subscribe(java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> unsubscribe(java.lang.String str);
    }

    public static final class Builder {
        private androidx.media3.common.util.BitmapLoader bitmapLoader;
        private final android.content.Context context;
        private final androidx.media3.session.SessionToken token;
        private android.os.Bundle connectionHints = android.os.Bundle.EMPTY;
        private androidx.media3.session.MediaBrowser.Listener listener = new androidx.media3.session.MediaBrowser.Listener() { // from class: androidx.media3.session.MediaBrowser.Builder.1
        };
        private android.os.Looper applicationLooper = androidx.media3.common.util.Util.getCurrentOrMainLooper();

        public Builder(android.content.Context context, androidx.media3.session.SessionToken sessionToken) {
            this.context = (android.content.Context) androidx.media3.common.util.Assertions.checkNotNull(context);
            this.token = (androidx.media3.session.SessionToken) androidx.media3.common.util.Assertions.checkNotNull(sessionToken);
        }

        public androidx.media3.session.MediaBrowser.Builder setConnectionHints(android.os.Bundle bundle) {
            this.connectionHints = new android.os.Bundle((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle));
            return this;
        }

        public androidx.media3.session.MediaBrowser.Builder setListener(androidx.media3.session.MediaBrowser.Listener listener) {
            this.listener = (androidx.media3.session.MediaBrowser.Listener) androidx.media3.common.util.Assertions.checkNotNull(listener);
            return this;
        }

        public androidx.media3.session.MediaBrowser.Builder setApplicationLooper(android.os.Looper looper) {
            this.applicationLooper = (android.os.Looper) androidx.media3.common.util.Assertions.checkNotNull(looper);
            return this;
        }

        public androidx.media3.session.MediaBrowser.Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            this.bitmapLoader = (androidx.media3.common.util.BitmapLoader) androidx.media3.common.util.Assertions.checkNotNull(bitmapLoader);
            return this;
        }

        public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.MediaBrowser> buildAsync() {
            final androidx.media3.session.MediaControllerHolder mediaControllerHolder = new androidx.media3.session.MediaControllerHolder(this.applicationLooper);
            if (this.token.isLegacySession() && this.bitmapLoader == null) {
                this.bitmapLoader = new androidx.media3.session.CacheBitmapLoader(new androidx.media3.datasource.DataSourceBitmapLoader(this.context));
            }
            final androidx.media3.session.MediaBrowser mediaBrowser = new androidx.media3.session.MediaBrowser(this.context, this.token, this.connectionHints, this.listener, this.applicationLooper, mediaControllerHolder, this.bitmapLoader);
            androidx.media3.common.util.Util.postOrRun(new android.os.Handler(this.applicationLooper), new java.lang.Runnable() { // from class: androidx.media3.session.MediaBrowser$Builder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    mediaControllerHolder.setController(mediaBrowser);
                }
            });
            return mediaControllerHolder;
        }
    }

    MediaBrowser(android.content.Context context, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, androidx.media3.session.MediaBrowser.Listener listener, android.os.Looper looper, androidx.media3.session.MediaController.ConnectionCallback connectionCallback, androidx.media3.common.util.BitmapLoader bitmapLoader) {
        super(context, sessionToken, bundle, listener, looper, connectionCallback, bitmapLoader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.media3.session.MediaController
    public androidx.media3.session.MediaBrowser.MediaBrowserImpl createImpl(android.content.Context context, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, android.os.Looper looper, androidx.media3.common.util.BitmapLoader bitmapLoader) {
        androidx.media3.session.MediaBrowser.MediaBrowserImpl mediaBrowserImplBase;
        if (sessionToken.isLegacySession()) {
            mediaBrowserImplBase = new androidx.media3.session.MediaBrowserImplLegacy(context, this, sessionToken, looper, (androidx.media3.common.util.BitmapLoader) androidx.media3.common.util.Assertions.checkNotNull(bitmapLoader));
        } else {
            mediaBrowserImplBase = new androidx.media3.session.MediaBrowserImplBase(context, this, sessionToken, bundle, looper);
        }
        this.impl = mediaBrowserImplBase;
        return mediaBrowserImplBase;
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> getLibraryRoot(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        if (isConnected()) {
            return ((androidx.media3.session.MediaBrowser.MediaBrowserImpl) androidx.media3.common.util.Assertions.checkNotNull(this.impl)).getLibraryRoot(libraryParams);
        }
        return createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> subscribe(java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotEmpty(str, "parentId must not be empty");
        if (isConnected()) {
            return ((androidx.media3.session.MediaBrowser.MediaBrowserImpl) androidx.media3.common.util.Assertions.checkNotNull(this.impl)).subscribe(str, libraryParams);
        }
        return createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> unsubscribe(java.lang.String str) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotEmpty(str, "parentId must not be empty");
        if (isConnected()) {
            return ((androidx.media3.session.MediaBrowser.MediaBrowserImpl) androidx.media3.common.util.Assertions.checkNotNull(this.impl)).unsubscribe(str);
        }
        return createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> getChildren(java.lang.String str, int i, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotEmpty(str, "parentId must not be empty");
        androidx.media3.common.util.Assertions.checkArgument(i >= 0, "page must not be negative");
        androidx.media3.common.util.Assertions.checkArgument(i2 >= 1, "pageSize must not be less than 1");
        if (isConnected()) {
            return ((androidx.media3.session.MediaBrowser.MediaBrowserImpl) androidx.media3.common.util.Assertions.checkNotNull(this.impl)).getChildren(str, i, i2, libraryParams);
        }
        return createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> getItem(java.lang.String str) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotEmpty(str, "mediaId must not be empty");
        if (isConnected()) {
            return ((androidx.media3.session.MediaBrowser.MediaBrowserImpl) androidx.media3.common.util.Assertions.checkNotNull(this.impl)).getItem(str);
        }
        return createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> search(java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotEmpty(str, "query must not be empty");
        if (isConnected()) {
            return ((androidx.media3.session.MediaBrowser.MediaBrowserImpl) androidx.media3.common.util.Assertions.checkNotNull(this.impl)).search(str, libraryParams);
        }
        return createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> getSearchResult(java.lang.String str, int i, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        androidx.media3.common.util.Assertions.checkNotEmpty(str, "query must not be empty");
        androidx.media3.common.util.Assertions.checkArgument(i >= 0, "page must not be negative");
        androidx.media3.common.util.Assertions.checkArgument(i2 >= 1, "pageSize must not be less than 1");
        if (isConnected()) {
            return ((androidx.media3.session.MediaBrowser.MediaBrowserImpl) androidx.media3.common.util.Assertions.checkNotNull(this.impl)).getSearchResult(str, i, i2, libraryParams);
        }
        return createDisconnectedFuture();
    }

    private static <V> com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<V>> createDisconnectedFuture() {
        return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-100));
    }

    private void verifyApplicationThread() {
        androidx.media3.common.util.Assertions.checkState(android.os.Looper.myLooper() == getApplicationLooper(), WRONG_THREAD_ERROR_MESSAGE);
    }

    void notifyBrowserListener(final androidx.media3.common.util.Consumer<androidx.media3.session.MediaBrowser.Listener> consumer) {
        final androidx.media3.session.MediaBrowser.Listener listener = (androidx.media3.session.MediaBrowser.Listener) this.listener;
        if (listener != null) {
            androidx.media3.common.util.Util.postOrRun(this.applicationHandler, new java.lang.Runnable() { // from class: androidx.media3.session.MediaBrowser$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    consumer.accept(listener);
                }
            });
        }
    }
}
