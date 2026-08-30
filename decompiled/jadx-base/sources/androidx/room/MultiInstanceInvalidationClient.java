package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
class MultiInstanceInvalidationClient {
    final android.content.Context mAppContext;
    int mClientId;
    final java.util.concurrent.Executor mExecutor;
    final androidx.room.InvalidationTracker mInvalidationTracker;
    final java.lang.String mName;
    final androidx.room.InvalidationTracker.Observer mObserver;
    final java.lang.Runnable mRemoveObserverRunnable;
    androidx.room.IMultiInstanceInvalidationService mService;
    final android.content.ServiceConnection mServiceConnection;
    final java.lang.Runnable mSetUpRunnable;
    private final java.lang.Runnable mTearDownRunnable;
    final androidx.room.IMultiInstanceInvalidationCallback mCallback = new androidx.room.IMultiInstanceInvalidationCallback.Stub() { // from class: androidx.room.MultiInstanceInvalidationClient.1
        @Override // androidx.room.IMultiInstanceInvalidationCallback
        public void onInvalidation(final java.lang.String[] strArr) {
            androidx.room.MultiInstanceInvalidationClient.this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.1.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.room.MultiInstanceInvalidationClient.this.mInvalidationTracker.notifyObserversByTableNames(strArr);
                }
            });
        }
    };
    final java.util.concurrent.atomic.AtomicBoolean mStopped = new java.util.concurrent.atomic.AtomicBoolean(false);

    MultiInstanceInvalidationClient(android.content.Context context, java.lang.String str, androidx.room.InvalidationTracker invalidationTracker, java.util.concurrent.Executor executor) {
        android.content.ServiceConnection serviceConnection = new android.content.ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient.2
            @Override // android.content.ServiceConnection
            public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
                androidx.room.MultiInstanceInvalidationClient.this.mService = androidx.room.IMultiInstanceInvalidationService.Stub.asInterface(iBinder);
                androidx.room.MultiInstanceInvalidationClient.this.mExecutor.execute(androidx.room.MultiInstanceInvalidationClient.this.mSetUpRunnable);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(android.content.ComponentName componentName) {
                androidx.room.MultiInstanceInvalidationClient.this.mExecutor.execute(androidx.room.MultiInstanceInvalidationClient.this.mRemoveObserverRunnable);
                androidx.room.MultiInstanceInvalidationClient.this.mService = null;
            }
        };
        this.mServiceConnection = serviceConnection;
        this.mSetUpRunnable = new java.lang.Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    androidx.room.IMultiInstanceInvalidationService iMultiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationClient.this.mService;
                    if (iMultiInstanceInvalidationService != null) {
                        androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient = androidx.room.MultiInstanceInvalidationClient.this;
                        multiInstanceInvalidationClient.mClientId = iMultiInstanceInvalidationService.registerCallback(multiInstanceInvalidationClient.mCallback, androidx.room.MultiInstanceInvalidationClient.this.mName);
                        androidx.room.MultiInstanceInvalidationClient.this.mInvalidationTracker.addObserver(androidx.room.MultiInstanceInvalidationClient.this.mObserver);
                    }
                } catch (android.os.RemoteException e) {
                    android.util.Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
                }
            }
        };
        this.mRemoveObserverRunnable = new java.lang.Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.4
            @Override // java.lang.Runnable
            public void run() {
                androidx.room.MultiInstanceInvalidationClient.this.mInvalidationTracker.removeObserver(androidx.room.MultiInstanceInvalidationClient.this.mObserver);
            }
        };
        this.mTearDownRunnable = new java.lang.Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.5
            @Override // java.lang.Runnable
            public void run() {
                androidx.room.MultiInstanceInvalidationClient.this.mInvalidationTracker.removeObserver(androidx.room.MultiInstanceInvalidationClient.this.mObserver);
                try {
                    androidx.room.IMultiInstanceInvalidationService iMultiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationClient.this.mService;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.unregisterCallback(androidx.room.MultiInstanceInvalidationClient.this.mCallback, androidx.room.MultiInstanceInvalidationClient.this.mClientId);
                    }
                } catch (android.os.RemoteException e) {
                    android.util.Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
                }
                androidx.room.MultiInstanceInvalidationClient.this.mAppContext.unbindService(androidx.room.MultiInstanceInvalidationClient.this.mServiceConnection);
            }
        };
        android.content.Context applicationContext = context.getApplicationContext();
        this.mAppContext = applicationContext;
        this.mName = str;
        this.mInvalidationTracker = invalidationTracker;
        this.mExecutor = executor;
        this.mObserver = new androidx.room.InvalidationTracker.Observer((java.lang.String[]) invalidationTracker.mTableIdLookup.keySet().toArray(new java.lang.String[0])) { // from class: androidx.room.MultiInstanceInvalidationClient.6
            @Override // androidx.room.InvalidationTracker.Observer
            boolean isRemote() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(java.util.Set<java.lang.String> set) {
                if (androidx.room.MultiInstanceInvalidationClient.this.mStopped.get()) {
                    return;
                }
                try {
                    androidx.room.IMultiInstanceInvalidationService iMultiInstanceInvalidationService = androidx.room.MultiInstanceInvalidationClient.this.mService;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.broadcastInvalidation(androidx.room.MultiInstanceInvalidationClient.this.mClientId, (java.lang.String[]) set.toArray(new java.lang.String[0]));
                    }
                } catch (android.os.RemoteException e) {
                    android.util.Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        };
        applicationContext.bindService(new android.content.Intent(applicationContext, (java.lang.Class<?>) androidx.room.MultiInstanceInvalidationService.class), serviceConnection, 1);
    }

    void stop() {
        if (this.mStopped.compareAndSet(false, true)) {
            this.mExecutor.execute(this.mTearDownRunnable);
        }
    }
}
