package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends android.app.Service {
    private static final float EPSILON = 1.0E-5f;
    public static final java.lang.String KEY_MEDIA_ITEM = "media_item";
    public static final java.lang.String KEY_SEARCH_RESULTS = "search_results";
    public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    public static final int RESULT_OK = 0;
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final java.lang.String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    androidx.media.MediaBrowserServiceCompat.ConnectionRecord mCurConnection;
    private androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl mImpl;
    android.support.v4.media.session.MediaSessionCompat.Token mSession;
    static final java.lang.String TAG = "MBServiceCompat";
    static final boolean DEBUG = android.util.Log.isLoggable(TAG, 3);
    private final androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl mServiceBinderImpl = new androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl();
    final androidx.media.MediaBrowserServiceCompat.ConnectionRecord mConnectionFromFwk = new androidx.media.MediaBrowserServiceCompat.ConnectionRecord("android.media.session.MediaController", -1, -1, null, null);
    final java.util.ArrayList<androidx.media.MediaBrowserServiceCompat.ConnectionRecord> mPendingConnections = new java.util.ArrayList<>();
    final androidx.collection.ArrayMap<android.os.IBinder, androidx.media.MediaBrowserServiceCompat.ConnectionRecord> mConnections = new androidx.collection.ArrayMap<>();
    final androidx.media.MediaBrowserServiceCompat.ServiceHandler mHandler = new androidx.media.MediaBrowserServiceCompat.ServiceHandler(this);

    interface MediaBrowserServiceImpl {
        android.os.Bundle getBrowserRootHints();

        androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();

        void notifyChildrenChanged(androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo, java.lang.String str, android.os.Bundle bundle);

        void notifyChildrenChanged(java.lang.String str, android.os.Bundle bundle);

        android.os.IBinder onBind(android.content.Intent intent);

        void onCreate();

        void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token);
    }

    private interface ServiceCallbacks {
        android.os.IBinder asBinder();

        void onConnect(java.lang.String str, android.support.v4.media.session.MediaSessionCompat.Token token, android.os.Bundle bundle) throws android.os.RemoteException;

        void onConnectFailed() throws android.os.RemoteException;

        void onLoadChildren(java.lang.String str, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException;
    }

    @Override // android.app.Service
    public void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    public abstract androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot(java.lang.String str, int i, android.os.Bundle bundle);

    public abstract void onLoadChildren(java.lang.String str, androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result);

    public void onSubscribe(java.lang.String str, android.os.Bundle bundle) {
    }

    public void onUnsubscribe(java.lang.String str) {
    }

    class MediaBrowserServiceImplBase implements androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl {
        private android.os.Messenger mMessenger;

        MediaBrowserServiceImplBase() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            this.mMessenger = new android.os.Messenger(androidx.media.MediaBrowserServiceCompat.this.mHandler);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.IBinder onBind(android.content.Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.mMessenger.getBinder();
            }
            return null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(final android.support.v4.media.session.MediaSessionCompat.Token token) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.post(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.1
                @Override // java.lang.Runnable
                public void run() {
                    java.util.Iterator<androidx.media.MediaBrowserServiceCompat.ConnectionRecord> it = androidx.media.MediaBrowserServiceCompat.this.mConnections.values().iterator();
                    while (it.hasNext()) {
                        androidx.media.MediaBrowserServiceCompat.ConnectionRecord next = it.next();
                        try {
                            next.callbacks.onConnect(next.root.getRootId(), token, next.root.getExtras());
                        } catch (android.os.RemoteException unused) {
                            android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "Connection for " + next.pkg + " is no longer valid.");
                            it.remove();
                        }
                    }
                }
            });
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(final java.lang.String str, final android.os.Bundle bundle) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.post(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.2
                @Override // java.lang.Runnable
                public void run() {
                    java.util.Iterator<android.os.IBinder> it = androidx.media.MediaBrowserServiceCompat.this.mConnections.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.this.notifyChildrenChangedOnHandler(androidx.media.MediaBrowserServiceCompat.this.mConnections.get(it.next()), str, bundle);
                    }
                }
            });
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(final androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo, final java.lang.String str, final android.os.Bundle bundle) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.post(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.3
                @Override // java.lang.Runnable
                public void run() {
                    for (int i = 0; i < androidx.media.MediaBrowserServiceCompat.this.mConnections.size(); i++) {
                        androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecordValueAt = androidx.media.MediaBrowserServiceCompat.this.mConnections.valueAt(i);
                        if (connectionRecordValueAt.browserInfo.equals(remoteUserInfo)) {
                            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.this.notifyChildrenChangedOnHandler(connectionRecordValueAt, str, bundle);
                            return;
                        }
                    }
                }
            });
        }

        void notifyChildrenChangedOnHandler(androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, java.lang.String str, android.os.Bundle bundle) {
            java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>> list = connectionRecord.subscriptions.get(str);
            if (list != null) {
                for (androidx.core.util.Pair<android.os.IBinder, android.os.Bundle> pair : list) {
                    if (androidx.media.MediaBrowserCompatUtils.hasDuplicatedItems(bundle, pair.second)) {
                        androidx.media.MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, pair.second, bundle);
                    }
                }
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection == null) {
                throw new java.lang.IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection.rootHints == null) {
                return null;
            }
            return new android.os.Bundle(androidx.media.MediaBrowserServiceCompat.this.mCurConnection.rootHints);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection == null) {
                throw new java.lang.IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            return androidx.media.MediaBrowserServiceCompat.this.mCurConnection.browserInfo;
        }
    }

    class MediaBrowserServiceImplApi21 implements androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl {
        android.os.Messenger mMessenger;
        final java.util.List<android.os.Bundle> mRootExtrasList = new java.util.ArrayList();
        android.service.media.MediaBrowserService mServiceFwk;

        MediaBrowserServiceImplApi21() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 mediaBrowserServiceApi21 = new androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.MediaBrowserServiceApi21(androidx.media.MediaBrowserServiceCompat.this);
            this.mServiceFwk = mediaBrowserServiceApi21;
            mediaBrowserServiceApi21.onCreate();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.IBinder onBind(android.content.Intent intent) {
            return this.mServiceFwk.onBind(intent);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(final android.support.v4.media.session.MediaSessionCompat.Token token) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.postOrRun(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.this.setSessionTokenOnHandler(token);
                }
            });
        }

        void setSessionTokenOnHandler(android.support.v4.media.session.MediaSessionCompat.Token token) {
            if (!this.mRootExtrasList.isEmpty()) {
                android.support.v4.media.session.IMediaSession extraBinder = token.getExtraBinder();
                if (extraBinder != null) {
                    java.util.Iterator<android.os.Bundle> it = this.mRootExtrasList.iterator();
                    while (it.hasNext()) {
                        androidx.core.app.BundleCompat.putBinder(it.next(), "extra_session_binder", extraBinder.asBinder());
                    }
                }
                this.mRootExtrasList.clear();
            }
            this.mServiceFwk.setSessionToken((android.media.session.MediaSession.Token) token.getToken());
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(java.lang.String str, android.os.Bundle bundle) {
            notifyChildrenChangedForFramework(str, bundle);
            notifyChildrenChangedForCompat(str, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo, java.lang.String str, android.os.Bundle bundle) {
            notifyChildrenChangedForCompat(remoteUserInfo, str, bundle);
        }

        public androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot(java.lang.String str, int i, android.os.Bundle bundle) {
            android.os.Bundle extras;
            int i2 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                extras = null;
            } else {
                bundle.remove("extra_client_version");
                this.mMessenger = new android.os.Messenger(androidx.media.MediaBrowserServiceCompat.this.mHandler);
                extras = new android.os.Bundle();
                extras.putInt("extra_service_version", 2);
                androidx.core.app.BundleCompat.putBinder(extras, "extra_messenger", this.mMessenger.getBinder());
                if (androidx.media.MediaBrowserServiceCompat.this.mSession != null) {
                    android.support.v4.media.session.IMediaSession extraBinder = androidx.media.MediaBrowserServiceCompat.this.mSession.getExtraBinder();
                    androidx.core.app.BundleCompat.putBinder(extras, "extra_session_binder", extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.mRootExtrasList.add(extras);
                }
                i2 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media.MediaBrowserServiceCompat.this.new ConnectionRecord(str, i2, i, bundle, null);
            androidx.media.MediaBrowserServiceCompat.this.mCurConnection = connectionRecord;
            androidx.media.MediaBrowserServiceCompat.BrowserRoot browserRootOnGetRoot = androidx.media.MediaBrowserServiceCompat.this.onGetRoot(str, i, bundle);
            androidx.media.MediaBrowserServiceCompat.this.mCurConnection = null;
            if (browserRootOnGetRoot == null) {
                return null;
            }
            if (this.mMessenger != null) {
                androidx.media.MediaBrowserServiceCompat.this.mPendingConnections.add(connectionRecord);
            }
            if (extras == null) {
                extras = browserRootOnGetRoot.getExtras();
            } else if (browserRootOnGetRoot.getExtras() != null) {
                extras.putAll(browserRootOnGetRoot.getExtras());
            }
            return new androidx.media.MediaBrowserServiceCompat.BrowserRoot(browserRootOnGetRoot.getRootId(), extras);
        }

        public void onLoadChildren(java.lang.String str, final androidx.media.MediaBrowserServiceCompat.ResultWrapper<java.util.List<android.os.Parcel>> resultWrapper) {
            androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result = new androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.2
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public void onResultSent(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> list) {
                    java.util.ArrayList arrayList;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                        for (android.support.v4.media.MediaBrowserCompat.MediaItem mediaItem : list) {
                            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                            mediaItem.writeToParcel(parcelObtain, 0);
                            arrayList2.add(parcelObtain);
                        }
                        arrayList = arrayList2;
                    }
                    resultWrapper.sendResult(arrayList);
                }

                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }
            };
            androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = androidx.media.MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            androidx.media.MediaBrowserServiceCompat.this.onLoadChildren(str, result);
            androidx.media.MediaBrowserServiceCompat.this.mCurConnection = null;
        }

        void notifyChildrenChangedForFramework(java.lang.String str, android.os.Bundle bundle) {
            this.mServiceFwk.notifyChildrenChanged(str);
        }

        void notifyChildrenChangedForCompat(final java.lang.String str, final android.os.Bundle bundle) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.post(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.3
                @Override // java.lang.Runnable
                public void run() {
                    java.util.Iterator<android.os.IBinder> it = androidx.media.MediaBrowserServiceCompat.this.mConnections.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.this.notifyChildrenChangedForCompatOnHandler(androidx.media.MediaBrowserServiceCompat.this.mConnections.get(it.next()), str, bundle);
                    }
                }
            });
        }

        void notifyChildrenChangedForCompat(final androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo, final java.lang.String str, final android.os.Bundle bundle) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.post(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.4
                @Override // java.lang.Runnable
                public void run() {
                    for (int i = 0; i < androidx.media.MediaBrowserServiceCompat.this.mConnections.size(); i++) {
                        androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecordValueAt = androidx.media.MediaBrowserServiceCompat.this.mConnections.valueAt(i);
                        if (connectionRecordValueAt.browserInfo.equals(remoteUserInfo)) {
                            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.this.notifyChildrenChangedForCompatOnHandler(connectionRecordValueAt, str, bundle);
                        }
                    }
                }
            });
        }

        void notifyChildrenChangedForCompatOnHandler(androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, java.lang.String str, android.os.Bundle bundle) {
            java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>> list = connectionRecord.subscriptions.get(str);
            if (list != null) {
                for (androidx.core.util.Pair<android.os.IBinder, android.os.Bundle> pair : list) {
                    if (androidx.media.MediaBrowserCompatUtils.hasDuplicatedItems(bundle, pair.second)) {
                        androidx.media.MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, pair.second, bundle);
                    }
                }
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
            if (this.mMessenger == null) {
                return null;
            }
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection == null) {
                throw new java.lang.IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection.rootHints == null) {
                return null;
            }
            return new android.os.Bundle(androidx.media.MediaBrowserServiceCompat.this.mCurConnection.rootHints);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection == null) {
                throw new java.lang.IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            return androidx.media.MediaBrowserServiceCompat.this.mCurConnection.browserInfo;
        }

        class MediaBrowserServiceApi21 extends android.service.media.MediaBrowserService {
            MediaBrowserServiceApi21(android.content.Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String str, int i, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                androidx.media.MediaBrowserServiceCompat.BrowserRoot browserRootOnGetRoot = androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.this.onGetRoot(str, i, bundle == null ? null : new android.os.Bundle(bundle));
                if (browserRootOnGetRoot == null) {
                    return null;
                }
                return new android.service.media.MediaBrowserService.BrowserRoot(browserRootOnGetRoot.mRootId, browserRootOnGetRoot.mExtras);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> result) {
                androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.this.onLoadChildren(str, new androidx.media.MediaBrowserServiceCompat.ResultWrapper<>(result));
            }
        }
    }

    class MediaBrowserServiceImplApi23 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 {
        MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            this.mServiceFwk = new androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.MediaBrowserServiceApi23(androidx.media.MediaBrowserServiceCompat.this);
            this.mServiceFwk.onCreate();
        }

        public void onLoadItem(java.lang.String str, final androidx.media.MediaBrowserServiceCompat.ResultWrapper<android.os.Parcel> resultWrapper) {
            androidx.media.MediaBrowserServiceCompat.Result<android.support.v4.media.MediaBrowserCompat.MediaItem> result = new androidx.media.MediaBrowserServiceCompat.Result<android.support.v4.media.MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public void onResultSent(android.support.v4.media.MediaBrowserCompat.MediaItem mediaItem) {
                    if (mediaItem == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    resultWrapper.sendResult(parcelObtain);
                }

                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }
            };
            androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = androidx.media.MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            androidx.media.MediaBrowserServiceCompat.this.onLoadItem(str, result);
            androidx.media.MediaBrowserServiceCompat.this.mCurConnection = null;
        }

        class MediaBrowserServiceApi23 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            MediaBrowserServiceApi23(android.content.Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(java.lang.String str, android.service.media.MediaBrowserService.Result<android.media.browse.MediaBrowser.MediaItem> result) {
                androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.this.onLoadItem(str, new androidx.media.MediaBrowserServiceCompat.ResultWrapper<>(result));
            }
        }
    }

    class MediaBrowserServiceImplApi26 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23 {
        MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            this.mServiceFwk = new androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.MediaBrowserServiceApi26(androidx.media.MediaBrowserServiceCompat.this);
            this.mServiceFwk.onCreate();
        }

        public void onLoadChildren(java.lang.String str, final androidx.media.MediaBrowserServiceCompat.ResultWrapper<java.util.List<android.os.Parcel>> resultWrapper, final android.os.Bundle bundle) {
            androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result = new androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public void onResultSent(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> list) {
                    if (list == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    if ((getFlags() & 1) != 0) {
                        list = androidx.media.MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                    for (android.support.v4.media.MediaBrowserCompat.MediaItem mediaItem : list) {
                        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                    resultWrapper.sendResult(arrayList);
                }

                @Override // androidx.media.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }
            };
            androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = androidx.media.MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            androidx.media.MediaBrowserServiceCompat.this.onLoadChildren(str, result, bundle);
            androidx.media.MediaBrowserServiceCompat.this.mCurConnection = null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection == null) {
                throw new java.lang.IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection == androidx.media.MediaBrowserServiceCompat.this.mConnectionFromFwk) {
                return this.mServiceFwk.getBrowserRootHints();
            }
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection.rootHints == null) {
                return null;
            }
            return new android.os.Bundle(androidx.media.MediaBrowserServiceCompat.this.mCurConnection.rootHints);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        void notifyChildrenChangedForFramework(java.lang.String str, android.os.Bundle bundle) {
            if (bundle != null) {
                this.mServiceFwk.notifyChildrenChanged(str, bundle);
            } else {
                super.notifyChildrenChangedForFramework(str, bundle);
            }
        }

        class MediaBrowserServiceApi26 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            MediaBrowserServiceApi26(android.content.Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> result, android.os.Bundle bundle) {
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                androidx.media.MediaBrowserServiceCompat.this.mCurConnection = androidx.media.MediaBrowserServiceCompat.this.mConnectionFromFwk;
                androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.this.onLoadChildren(str, new androidx.media.MediaBrowserServiceCompat.ResultWrapper<>(result), bundle);
                androidx.media.MediaBrowserServiceCompat.this.mCurConnection = null;
            }
        }
    }

    class MediaBrowserServiceImplApi28 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 {
        MediaBrowserServiceImplApi28() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection == null) {
                throw new java.lang.IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (androidx.media.MediaBrowserServiceCompat.this.mCurConnection == androidx.media.MediaBrowserServiceCompat.this.mConnectionFromFwk) {
                return new androidx.media.MediaSessionManager.RemoteUserInfo(this.mServiceFwk.getCurrentBrowserInfo());
            }
            return androidx.media.MediaBrowserServiceCompat.this.mCurConnection.browserInfo;
        }
    }

    private static final class ServiceHandler extends android.os.Handler {
        private androidx.media.MediaBrowserServiceCompat mService;

        ServiceHandler(androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.mService = mediaBrowserServiceCompat;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = this.mService;
            if (mediaBrowserServiceCompat != null) {
                mediaBrowserServiceCompat.handleMessageInternal(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        public void release() {
            this.mService = null;
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(android.os.Message message, long j) {
            android.os.Bundle data = message.getData();
            data.setClassLoader(android.support.v4.media.MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", android.os.Binder.getCallingUid());
            int callingPid = android.os.Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }

        public void postOrRun(java.lang.Runnable runnable) {
            if (java.lang.Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    private class ConnectionRecord implements android.os.IBinder.DeathRecipient {
        public final androidx.media.MediaSessionManager.RemoteUserInfo browserInfo;
        public final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks callbacks;
        public final int pid;
        public final java.lang.String pkg;
        public androidx.media.MediaBrowserServiceCompat.BrowserRoot root;
        public final android.os.Bundle rootHints;
        public final java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> subscriptions = new java.util.HashMap<>();
        public final int uid;

        ConnectionRecord(java.lang.String str, int i, int i2, android.os.Bundle bundle, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            this.pkg = str;
            this.pid = i;
            this.uid = i2;
            this.browserInfo = new androidx.media.MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.rootHints = bundle;
            this.callbacks = serviceCallbacks;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.post(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ConnectionRecord.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media.MediaBrowserServiceCompat.this.mConnections.remove(androidx.media.MediaBrowserServiceCompat.ConnectionRecord.this.callbacks.asBinder());
                }
            });
        }
    }

    public static class Result<T> {
        private final java.lang.Object mDebug;
        private boolean mDetachCalled;
        private int mFlags;
        private boolean mSendErrorCalled;
        private boolean mSendResultCalled;

        void onResultSent(T t) {
        }

        Result(java.lang.Object obj) {
            this.mDebug = obj;
        }

        public void sendResult(T t) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                throw new java.lang.IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
            }
            this.mSendResultCalled = true;
            onResultSent(t);
        }

        public void sendProgressUpdate(android.os.Bundle bundle) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                throw new java.lang.IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
            }
            checkExtraFields(bundle);
            onProgressUpdateSent(bundle);
        }

        public void sendError(android.os.Bundle bundle) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                throw new java.lang.IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
            }
            this.mSendErrorCalled = true;
            onErrorSent(bundle);
        }

        public void detach() {
            if (this.mDetachCalled) {
                throw new java.lang.IllegalStateException("detach() called when detach() had already been called for: " + this.mDebug);
            }
            if (this.mSendResultCalled) {
                throw new java.lang.IllegalStateException("detach() called when sendResult() had already been called for: " + this.mDebug);
            }
            if (this.mSendErrorCalled) {
                throw new java.lang.IllegalStateException("detach() called when sendError() had already been called for: " + this.mDebug);
            }
            this.mDetachCalled = true;
        }

        boolean isDone() {
            return this.mDetachCalled || this.mSendResultCalled || this.mSendErrorCalled;
        }

        void setFlags(int i) {
            this.mFlags = i;
        }

        int getFlags() {
            return this.mFlags;
        }

        void onProgressUpdateSent(android.os.Bundle bundle) {
            throw new java.lang.UnsupportedOperationException("It is not supported to send an interim update for " + this.mDebug);
        }

        void onErrorSent(android.os.Bundle bundle) {
            throw new java.lang.UnsupportedOperationException("It is not supported to send an error for " + this.mDebug);
        }

        private void checkExtraFields(android.os.Bundle bundle) {
            if (bundle != null && bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS")) {
                float f = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
                if (f < -1.0E-5f || f > 1.00001f) {
                    throw new java.lang.IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
                }
            }
        }
    }

    private class ServiceBinderImpl {
        ServiceBinderImpl() {
        }

        public void connect(final java.lang.String str, final int i, final int i2, final android.os.Bundle bundle, final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            if (!androidx.media.MediaBrowserServiceCompat.this.isValidPackage(str, i2)) {
                throw new java.lang.IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
            }
            androidx.media.MediaBrowserServiceCompat.this.mHandler.postOrRun(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    android.os.IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                    androidx.media.MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                    androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media.MediaBrowserServiceCompat.this.new ConnectionRecord(str, i, i2, bundle, serviceCallbacks);
                    androidx.media.MediaBrowserServiceCompat.this.mCurConnection = connectionRecord;
                    connectionRecord.root = androidx.media.MediaBrowserServiceCompat.this.onGetRoot(str, i2, bundle);
                    androidx.media.MediaBrowserServiceCompat.this.mCurConnection = null;
                    if (connectionRecord.root == null) {
                        android.util.Log.i(androidx.media.MediaBrowserServiceCompat.TAG, "No root for client " + str + " from service " + getClass().getName());
                        try {
                            serviceCallbacks.onConnectFailed();
                            return;
                        } catch (android.os.RemoteException unused) {
                            android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                            return;
                        }
                    }
                    try {
                        androidx.media.MediaBrowserServiceCompat.this.mConnections.put(iBinderAsBinder, connectionRecord);
                        iBinderAsBinder.linkToDeath(connectionRecord, 0);
                        if (androidx.media.MediaBrowserServiceCompat.this.mSession != null) {
                            serviceCallbacks.onConnect(connectionRecord.root.getRootId(), androidx.media.MediaBrowserServiceCompat.this.mSession, connectionRecord.root.getExtras());
                        }
                    } catch (android.os.RemoteException unused2) {
                        android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "Calling onConnect() failed. Dropping client. pkg=" + str);
                        androidx.media.MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                    }
                }
            });
        }

        public void disconnect(final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.postOrRun(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecordRemove = androidx.media.MediaBrowserServiceCompat.this.mConnections.remove(serviceCallbacks.asBinder());
                    if (connectionRecordRemove != null) {
                        connectionRecordRemove.callbacks.asBinder().unlinkToDeath(connectionRecordRemove, 0);
                    }
                }
            });
        }

        public void addSubscription(final java.lang.String str, final android.os.IBinder iBinder, final android.os.Bundle bundle, final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.postOrRun(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media.MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "addSubscription for callback that isn't registered id=" + str);
                    } else {
                        androidx.media.MediaBrowserServiceCompat.this.addSubscription(str, connectionRecord, iBinder, bundle);
                    }
                }
            });
        }

        public void removeSubscription(final java.lang.String str, final android.os.IBinder iBinder, final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.postOrRun(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media.MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "removeSubscription for callback that isn't registered id=" + str);
                    } else {
                        if (androidx.media.MediaBrowserServiceCompat.this.removeSubscription(str, connectionRecord, iBinder)) {
                            return;
                        }
                        android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "removeSubscription called for " + str + " which is not subscribed");
                    }
                }
            });
        }

        public void getMediaItem(final java.lang.String str, final android.support.v4.os.ResultReceiver resultReceiver, final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            if (android.text.TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            androidx.media.MediaBrowserServiceCompat.this.mHandler.postOrRun(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media.MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "getMediaItem for callback that isn't registered id=" + str);
                    } else {
                        androidx.media.MediaBrowserServiceCompat.this.performLoadItem(str, connectionRecord, resultReceiver);
                    }
                }
            });
        }

        public void registerCallbacks(final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks, final java.lang.String str, final int i, final int i2, final android.os.Bundle bundle) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.postOrRun(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord;
                    android.os.IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                    androidx.media.MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                    java.util.Iterator<androidx.media.MediaBrowserServiceCompat.ConnectionRecord> it = androidx.media.MediaBrowserServiceCompat.this.mPendingConnections.iterator();
                    while (true) {
                        connectionRecord = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        androidx.media.MediaBrowserServiceCompat.ConnectionRecord next = it.next();
                        if (next.uid == i2) {
                            connectionRecord = (android.text.TextUtils.isEmpty(str) || i <= 0) ? androidx.media.MediaBrowserServiceCompat.this.new ConnectionRecord(next.pkg, next.pid, next.uid, bundle, serviceCallbacks) : null;
                            it.remove();
                            break;
                        }
                    }
                    if (connectionRecord == null) {
                        connectionRecord = androidx.media.MediaBrowserServiceCompat.this.new ConnectionRecord(str, i, i2, bundle, serviceCallbacks);
                    }
                    androidx.media.MediaBrowserServiceCompat.this.mConnections.put(iBinderAsBinder, connectionRecord);
                    try {
                        iBinderAsBinder.linkToDeath(connectionRecord, 0);
                    } catch (android.os.RemoteException unused) {
                        android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "IBinder is already dead.");
                    }
                }
            });
        }

        public void unregisterCallbacks(final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            androidx.media.MediaBrowserServiceCompat.this.mHandler.postOrRun(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    android.os.IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                    androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecordRemove = androidx.media.MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                    if (connectionRecordRemove != null) {
                        iBinderAsBinder.unlinkToDeath(connectionRecordRemove, 0);
                    }
                }
            });
        }

        public void search(final java.lang.String str, final android.os.Bundle bundle, final android.support.v4.os.ResultReceiver resultReceiver, final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            if (android.text.TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            androidx.media.MediaBrowserServiceCompat.this.mHandler.postOrRun(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.8
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media.MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "search for callback that isn't registered query=" + str);
                    } else {
                        androidx.media.MediaBrowserServiceCompat.this.performSearch(str, bundle, connectionRecord, resultReceiver);
                    }
                }
            });
        }

        public void sendCustomAction(final java.lang.String str, final android.os.Bundle bundle, final android.support.v4.os.ResultReceiver resultReceiver, final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            if (android.text.TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            androidx.media.MediaBrowserServiceCompat.this.mHandler.postOrRun(new java.lang.Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.9
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media.MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
                    } else {
                        androidx.media.MediaBrowserServiceCompat.this.performCustomAction(str, bundle, connectionRecord, resultReceiver);
                    }
                }
            });
        }
    }

    private static class ServiceCallbacksCompat implements androidx.media.MediaBrowserServiceCompat.ServiceCallbacks {
        final android.os.Messenger mCallbacks;

        ServiceCallbacksCompat(android.os.Messenger messenger) {
            this.mCallbacks = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public android.os.IBinder asBinder() {
            return this.mCallbacks.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnect(java.lang.String str, android.support.v4.media.session.MediaSessionCompat.Token token, android.os.Bundle bundle) throws android.os.RemoteException {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            sendRequest(1, bundle2);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnectFailed() throws android.os.RemoteException {
            sendRequest(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(java.lang.String str, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
            }
            sendRequest(3, bundle3);
        }

        private void sendRequest(int i, android.os.Bundle bundle) throws android.os.RemoteException {
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.mCallbacks.send(messageObtain);
        }
    }

    static class ResultWrapper<T> {
        android.service.media.MediaBrowserService.Result mResultFwk;

        ResultWrapper(android.service.media.MediaBrowserService.Result result) {
            this.mResultFwk = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void sendResult(T t) {
            if (t instanceof java.util.List) {
                this.mResultFwk.sendResult(parcelListToItemList((java.util.List) t));
                return;
            }
            if (t instanceof android.os.Parcel) {
                android.os.Parcel parcel = (android.os.Parcel) t;
                parcel.setDataPosition(0);
                this.mResultFwk.sendResult(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            this.mResultFwk.sendResult(null);
        }

        public void detach() {
            this.mResultFwk.detach();
        }

        java.util.List<android.media.browse.MediaBrowser.MediaItem> parcelListToItemList(java.util.List<android.os.Parcel> list) {
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (android.os.Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((android.media.browse.MediaBrowser.MediaItem) android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }
    }

    public void attachToBaseContext(android.content.Context context) {
        attachBaseContext(context);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi28();
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mImpl = new androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26();
        } else {
            this.mImpl = new androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23();
        }
        this.mImpl.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.mHandler.release();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.mImpl.onBind(intent);
    }

    public void onLoadChildren(java.lang.String str, androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result, android.os.Bundle bundle) {
        result.setFlags(1);
        onLoadChildren(str, result);
    }

    public void onLoadItem(java.lang.String str, androidx.media.MediaBrowserServiceCompat.Result<android.support.v4.media.MediaBrowserCompat.MediaItem> result) {
        result.setFlags(2);
        result.sendResult(null);
    }

    public void onSearch(java.lang.String str, android.os.Bundle bundle, androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result) {
        result.setFlags(4);
        result.sendResult(null);
    }

    public void onCustomAction(java.lang.String str, android.os.Bundle bundle, androidx.media.MediaBrowserServiceCompat.Result<android.os.Bundle> result) {
        result.sendError(null);
    }

    public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token) {
        if (token == null) {
            throw new java.lang.IllegalArgumentException("Session token may not be null");
        }
        if (this.mSession != null) {
            throw new java.lang.IllegalStateException("The session token has already been set");
        }
        this.mSession = token;
        this.mImpl.setSessionToken(token);
    }

    public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
        return this.mSession;
    }

    public final android.os.Bundle getBrowserRootHints() {
        return this.mImpl.getBrowserRootHints();
    }

    public final androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        return this.mImpl.getCurrentBrowserInfo();
    }

    public void notifyChildrenChanged(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.mImpl.notifyChildrenChanged(str, null);
    }

    public void notifyChildrenChanged(java.lang.String str, android.os.Bundle bundle) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new java.lang.IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.mImpl.notifyChildrenChanged(str, bundle);
    }

    public void notifyChildrenChanged(androidx.media.MediaSessionManager.RemoteUserInfo remoteUserInfo, java.lang.String str, android.os.Bundle bundle) {
        if (remoteUserInfo == null) {
            throw new java.lang.IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new java.lang.IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new java.lang.IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.mImpl.notifyChildrenChanged(remoteUserInfo, str, bundle);
    }

    void handleMessageInternal(android.os.Message message) {
        android.os.Bundle data = message.getData();
        switch (message.what) {
            case 1:
                android.os.Bundle bundle = data.getBundle("data_root_hints");
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
                this.mServiceBinderImpl.connect(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new androidx.media.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 2:
                this.mServiceBinderImpl.disconnect(new androidx.media.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 3:
                android.os.Bundle bundle2 = data.getBundle("data_options");
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle2);
                this.mServiceBinderImpl.addSubscription(data.getString("data_media_item_id"), androidx.core.app.BundleCompat.getBinder(data, "data_callback_token"), bundle2, new androidx.media.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 4:
                this.mServiceBinderImpl.removeSubscription(data.getString("data_media_item_id"), androidx.core.app.BundleCompat.getBinder(data, "data_callback_token"), new androidx.media.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 5:
                this.mServiceBinderImpl.getMediaItem(data.getString("data_media_item_id"), (android.support.v4.os.ResultReceiver) data.getParcelable("data_result_receiver"), new androidx.media.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 6:
                android.os.Bundle bundle3 = data.getBundle("data_root_hints");
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle3);
                this.mServiceBinderImpl.registerCallbacks(new androidx.media.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                break;
            case 7:
                this.mServiceBinderImpl.unregisterCallbacks(new androidx.media.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 8:
                android.os.Bundle bundle4 = data.getBundle("data_search_extras");
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle4);
                this.mServiceBinderImpl.search(data.getString("data_search_query"), bundle4, (android.support.v4.os.ResultReceiver) data.getParcelable("data_result_receiver"), new androidx.media.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 9:
                android.os.Bundle bundle5 = data.getBundle("data_custom_action_extras");
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle5);
                this.mServiceBinderImpl.sendCustomAction(data.getString("data_custom_action"), bundle5, (android.support.v4.os.ResultReceiver) data.getParcelable("data_result_receiver"), new androidx.media.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            default:
                android.util.Log.w(TAG, "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                break;
        }
    }

    boolean isValidPackage(java.lang.String str, int i) {
        if (str == null) {
            return false;
        }
        for (java.lang.String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    void addSubscription(java.lang.String str, androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, android.os.IBinder iBinder, android.os.Bundle bundle) {
        java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>> arrayList = connectionRecord.subscriptions.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
        }
        for (androidx.core.util.Pair<android.os.IBinder, android.os.Bundle> pair : arrayList) {
            if (iBinder == pair.first && androidx.media.MediaBrowserCompatUtils.areSameOptions(bundle, pair.second)) {
                return;
            }
        }
        arrayList.add(new androidx.core.util.Pair<>(iBinder, bundle));
        connectionRecord.subscriptions.put(str, arrayList);
        performLoadChildren(str, connectionRecord, bundle, null);
        this.mCurConnection = connectionRecord;
        onSubscribe(str, bundle);
        this.mCurConnection = null;
    }

    boolean removeSubscription(java.lang.String str, androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, android.os.IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder == null) {
                boolean z2 = connectionRecord.subscriptions.remove(str) != null;
                this.mCurConnection = connectionRecord;
                onUnsubscribe(str);
                this.mCurConnection = null;
                return z2;
            }
            java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>> list = connectionRecord.subscriptions.get(str);
            if (list != null) {
                java.util.Iterator<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().first) {
                        it.remove();
                        z = true;
                    }
                }
                if (list.size() == 0) {
                    connectionRecord.subscriptions.remove(str);
                }
            }
            this.mCurConnection = connectionRecord;
            onUnsubscribe(str);
            this.mCurConnection = null;
            return z;
        } catch (java.lang.Throwable th) {
            this.mCurConnection = connectionRecord;
            onUnsubscribe(str);
            this.mCurConnection = null;
            throw th;
        }
    }

    void performLoadChildren(final java.lang.String str, final androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, final android.os.Bundle bundle, final android.os.Bundle bundle2) {
        androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result = new androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void onResultSent(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> list) {
                if (androidx.media.MediaBrowserServiceCompat.this.mConnections.get(connectionRecord.callbacks.asBinder()) != connectionRecord) {
                    if (androidx.media.MediaBrowserServiceCompat.DEBUG) {
                        android.util.Log.d(androidx.media.MediaBrowserServiceCompat.TAG, "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + connectionRecord.pkg + " id=" + str);
                    }
                } else {
                    if ((getFlags() & 1) != 0) {
                        list = androidx.media.MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                    }
                    try {
                        connectionRecord.callbacks.onLoadChildren(str, list, bundle, bundle2);
                    } catch (android.os.RemoteException unused) {
                        android.util.Log.w(androidx.media.MediaBrowserServiceCompat.TAG, "Calling onLoadChildren() failed for id=" + str + " package=" + connectionRecord.pkg);
                    }
                }
            }
        };
        this.mCurConnection = connectionRecord;
        if (bundle == null) {
            onLoadChildren(str, result);
        } else {
            onLoadChildren(str, result, bundle);
        }
        this.mCurConnection = null;
        if (!result.isDone()) {
            throw new java.lang.IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + connectionRecord.pkg + " id=" + str);
        }
    }

    java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> applyOptions(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int size = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return java.util.Collections.emptyList();
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i3, size);
    }

    void performLoadItem(java.lang.String str, androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, final android.support.v4.os.ResultReceiver resultReceiver) {
        androidx.media.MediaBrowserServiceCompat.Result<android.support.v4.media.MediaBrowserCompat.MediaItem> result = new androidx.media.MediaBrowserServiceCompat.Result<android.support.v4.media.MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media.MediaBrowserServiceCompat.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void onResultSent(android.support.v4.media.MediaBrowserCompat.MediaItem mediaItem) {
                if ((getFlags() & 2) != 0) {
                    resultReceiver.send(-1, null);
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("media_item", mediaItem);
                resultReceiver.send(0, bundle);
            }
        };
        this.mCurConnection = connectionRecord;
        onLoadItem(str, result);
        this.mCurConnection = null;
        if (!result.isDone()) {
            throw new java.lang.IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    void performSearch(java.lang.String str, android.os.Bundle bundle, androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, final android.support.v4.os.ResultReceiver resultReceiver) {
        androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result = new androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void onResultSent(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> list) {
                if ((getFlags() & 4) != 0 || list == null) {
                    resultReceiver.send(-1, null);
                    return;
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putParcelableArray("search_results", (android.os.Parcelable[]) list.toArray(new android.support.v4.media.MediaBrowserCompat.MediaItem[0]));
                resultReceiver.send(0, bundle2);
            }
        };
        this.mCurConnection = connectionRecord;
        onSearch(str, bundle, result);
        this.mCurConnection = null;
        if (!result.isDone()) {
            throw new java.lang.IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    void performCustomAction(java.lang.String str, android.os.Bundle bundle, androidx.media.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, final android.support.v4.os.ResultReceiver resultReceiver) {
        androidx.media.MediaBrowserServiceCompat.Result<android.os.Bundle> result = new androidx.media.MediaBrowserServiceCompat.Result<android.os.Bundle>(str) { // from class: androidx.media.MediaBrowserServiceCompat.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            public void onResultSent(android.os.Bundle bundle2) {
                resultReceiver.send(0, bundle2);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            void onProgressUpdateSent(android.os.Bundle bundle2) {
                resultReceiver.send(1, bundle2);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            void onErrorSent(android.os.Bundle bundle2) {
                resultReceiver.send(-1, bundle2);
            }
        };
        this.mCurConnection = connectionRecord;
        onCustomAction(str, bundle, result);
        this.mCurConnection = null;
        if (!result.isDone()) {
            throw new java.lang.IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    public static final class BrowserRoot {
        public static final java.lang.String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final java.lang.String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final java.lang.String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";

        @java.lang.Deprecated
        public static final java.lang.String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final android.os.Bundle mExtras;
        private final java.lang.String mRootId;

        public BrowserRoot(java.lang.String str, android.os.Bundle bundle) {
            if (str == null) {
                throw new java.lang.IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.mRootId = str;
            this.mExtras = bundle;
        }

        public java.lang.String getRootId() {
            return this.mRootId;
        }

        public android.os.Bundle getExtras() {
            return this.mExtras;
        }
    }
}
