package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaLibraryService extends androidx.media3.session.MediaSessionService {
    public static final java.lang.String SERVICE_INTERFACE = "androidx.media3.session.MediaLibraryService";

    @Override // androidx.media3.session.MediaSessionService
    public abstract androidx.media3.session.MediaLibraryService.MediaLibrarySession onGetSession(androidx.media3.session.MediaSession.ControllerInfo controllerInfo);

    public static final class MediaLibrarySession extends androidx.media3.session.MediaSession {
        public static final int LIBRARY_ERROR_REPLICATION_MODE_FATAL = 1;
        public static final int LIBRARY_ERROR_REPLICATION_MODE_NONE = 0;
        public static final int LIBRARY_ERROR_REPLICATION_MODE_NON_FATAL = 2;

        @Override // androidx.media3.session.MediaSession
        /* bridge */ /* synthetic */ androidx.media3.session.MediaSessionImpl createImpl(android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, com.google.common.collect.ImmutableList immutableList, androidx.media3.session.MediaSession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
            return createImpl(context, str, player, pendingIntent, (com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton>) immutableList, callback, bundle, bundle2, bitmapLoader, z, z2, i);
        }

        public interface Callback extends androidx.media3.session.MediaSession.Callback {
            default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> onGetLibraryRoot(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
                return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem>> onGetItem(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str) {
                return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> onGetChildren(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, int i, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
                return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> onSubscribe(final androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, final androidx.media3.session.MediaSession.ControllerInfo controllerInfo, final java.lang.String str, final androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
                return androidx.media3.common.util.Util.transformFutureAsync(onGetItem(mediaLibrarySession, controllerInfo, str), new com.google.common.util.concurrent.AsyncFunction() { // from class: androidx.media3.session.MediaLibraryService$MediaLibrarySession$Callback$$ExternalSyntheticLambda0
                    @Override // com.google.common.util.concurrent.AsyncFunction
                    public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                        return androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback.lambda$onSubscribe$0(controllerInfo, mediaLibrarySession, str, libraryParams, (androidx.media3.session.LibraryResult) obj);
                    }
                });
            }

            /* JADX WARN: Multi-variable type inference failed */
            static /* synthetic */ com.google.common.util.concurrent.ListenableFuture lambda$onSubscribe$0(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams, androidx.media3.session.LibraryResult libraryResult) throws java.lang.Exception {
                if (libraryResult.resultCode != 0 || libraryResult.value == 0 || ((androidx.media3.common.MediaItem) libraryResult.value).mediaMetadata.isBrowsable == null || !((androidx.media3.common.MediaItem) libraryResult.value).mediaMetadata.isBrowsable.booleanValue()) {
                    return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(libraryResult.resultCode != 0 ? libraryResult.resultCode : -3));
                }
                if (controllerInfo.getControllerVersion() != 0) {
                    mediaLibrarySession.notifyChildrenChanged(controllerInfo, str, Integer.MAX_VALUE, libraryParams);
                }
                return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofVoid());
            }

            default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> onUnsubscribe(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str) {
                return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofVoid());
            }

            default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<java.lang.Void>> onSearch(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
                return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.ListenableFuture<androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>>> onGetSearchResult(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, int i, int i2, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
                return com.google.common.util.concurrent.Futures.immediateFuture(androidx.media3.session.LibraryResult.ofError(-6));
            }
        }

        public static final class Builder extends androidx.media3.session.MediaSession.BuilderBase<androidx.media3.session.MediaLibraryService.MediaLibrarySession, androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder, androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback> {
            private int libraryErrorReplicationMode;

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public /* bridge */ /* synthetic */ androidx.media3.session.MediaSession.BuilderBase setCustomLayout(java.util.List list) {
                return setCustomLayout((java.util.List<androidx.media3.session.CommandButton>) list);
            }

            public Builder(androidx.media3.session.MediaLibraryService mediaLibraryService, androidx.media3.common.Player player, androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback callback) {
                this((android.content.Context) mediaLibraryService, player, callback);
            }

            public Builder(android.content.Context context, androidx.media3.common.Player player, androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback callback) {
                super(context, player, callback);
                this.libraryErrorReplicationMode = 1;
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setSessionActivity(android.app.PendingIntent pendingIntent) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setSessionActivity(pendingIntent);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setId(java.lang.String str) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setId(str);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setExtras(android.os.Bundle bundle) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setExtras(bundle);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setSessionExtras(android.os.Bundle bundle) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setSessionExtras(bundle);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setBitmapLoader(bitmapLoader);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setCustomLayout(java.util.List<androidx.media3.session.CommandButton> list) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setCustomLayout(list);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setShowPlayButtonIfPlaybackIsSuppressed(z);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setPeriodicPositionUpdateEnabled(boolean z) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setPeriodicPositionUpdateEnabled(z);
            }

            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setLibraryErrorReplicationMode(int i) {
                this.libraryErrorReplicationMode = i;
                return this;
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession build() {
                if (this.bitmapLoader == null) {
                    this.bitmapLoader = new androidx.media3.session.CacheBitmapLoader(new androidx.media3.datasource.DataSourceBitmapLoader(this.context));
                }
                return new androidx.media3.session.MediaLibraryService.MediaLibrarySession(this.context, this.id, this.player, this.sessionActivity, this.customLayout, this.callback, this.tokenExtras, this.sessionExtras, (androidx.media3.common.util.BitmapLoader) androidx.media3.common.util.Assertions.checkNotNull(this.bitmapLoader), this.playIfSuppressed, this.isPeriodicPositionUpdateEnabled, this.libraryErrorReplicationMode);
            }
        }

        MediaLibrarySession(android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.media3.session.MediaSession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
            super(context, str, player, pendingIntent, immutableList, callback, bundle, bundle2, bitmapLoader, z, z2, i);
        }

        @Override // androidx.media3.session.MediaSession
        androidx.media3.session.MediaLibrarySessionImpl createImpl(android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, com.google.common.collect.ImmutableList<androidx.media3.session.CommandButton> immutableList, androidx.media3.session.MediaSession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
            return new androidx.media3.session.MediaLibrarySessionImpl(this, context, str, player, pendingIntent, immutableList, (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback) callback, bundle, bundle2, bitmapLoader, z, z2, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media3.session.MediaSession
        public androidx.media3.session.MediaLibrarySessionImpl getImpl() {
            return (androidx.media3.session.MediaLibrarySessionImpl) super.getImpl();
        }

        public com.google.common.collect.ImmutableList<androidx.media3.session.MediaSession.ControllerInfo> getSubscribedControllers(java.lang.String str) {
            return getImpl().getSubscribedControllers(str);
        }

        public void notifyChildrenChanged(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            getImpl().notifyChildrenChanged((androidx.media3.session.MediaSession.ControllerInfo) androidx.media3.common.util.Assertions.checkNotNull(controllerInfo), androidx.media3.common.util.Assertions.checkNotEmpty(str), i, libraryParams);
        }

        public void notifyChildrenChanged(java.lang.String str, int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            getImpl().notifyChildrenChanged(androidx.media3.common.util.Assertions.checkNotEmpty(str), i, libraryParams);
        }

        public void notifySearchResultChanged(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            getImpl().notifySearchResultChanged((androidx.media3.session.MediaSession.ControllerInfo) androidx.media3.common.util.Assertions.checkNotNull(controllerInfo), androidx.media3.common.util.Assertions.checkNotEmpty(str), i, libraryParams);
        }

        public void clearReplicatedLibraryError() {
            getImpl().clearReplicatedLibraryError();
        }
    }

    public static final class LibraryParams {
        public final android.os.Bundle extras;
        public final boolean isOffline;
        public final boolean isRecent;
        public final boolean isSuggested;
        private static final java.lang.String FIELD_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_RECENT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_OFFLINE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_SUGGESTED = androidx.media3.common.util.Util.intToStringMaxRadix(3);

        private LibraryParams(android.os.Bundle bundle, boolean z, boolean z2, boolean z3) {
            this.extras = new android.os.Bundle(bundle);
            this.isRecent = z;
            this.isOffline = z2;
            this.isSuggested = z3;
        }

        public static final class Builder {
            private android.os.Bundle extras = android.os.Bundle.EMPTY;
            private boolean offline;
            private boolean recent;
            private boolean suggested;

            public androidx.media3.session.MediaLibraryService.LibraryParams.Builder setRecent(boolean z) {
                this.recent = z;
                return this;
            }

            public androidx.media3.session.MediaLibraryService.LibraryParams.Builder setOffline(boolean z) {
                this.offline = z;
                return this;
            }

            public androidx.media3.session.MediaLibraryService.LibraryParams.Builder setSuggested(boolean z) {
                this.suggested = z;
                return this;
            }

            public androidx.media3.session.MediaLibraryService.LibraryParams.Builder setExtras(android.os.Bundle bundle) {
                this.extras = (android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle);
                return this;
            }

            public androidx.media3.session.MediaLibraryService.LibraryParams build() {
                return new androidx.media3.session.MediaLibraryService.LibraryParams(this.extras, this.recent, this.offline, this.suggested);
            }
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBundle(FIELD_EXTRAS, this.extras);
            bundle.putBoolean(FIELD_RECENT, this.isRecent);
            bundle.putBoolean(FIELD_OFFLINE, this.isOffline);
            bundle.putBoolean(FIELD_SUGGESTED, this.isSuggested);
            return bundle;
        }

        public static androidx.media3.session.MediaLibraryService.LibraryParams fromBundle(android.os.Bundle bundle) {
            android.os.Bundle bundle2 = bundle.getBundle(FIELD_EXTRAS);
            boolean z = bundle.getBoolean(FIELD_RECENT, false);
            boolean z2 = bundle.getBoolean(FIELD_OFFLINE, false);
            boolean z3 = bundle.getBoolean(FIELD_SUGGESTED, false);
            if (bundle2 == null) {
                bundle2 = android.os.Bundle.EMPTY;
            }
            return new androidx.media3.session.MediaLibraryService.LibraryParams(bundle2, z, z2, z3);
        }
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        if (SERVICE_INTERFACE.equals(intent.getAction())) {
            return getServiceBinder();
        }
        return super.onBind(intent);
    }
}
