package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
class UnusedAppRestrictionsBackportServiceConnection implements android.content.ServiceConnection {
    private final android.content.Context mContext;
    androidx.concurrent.futures.ResolvableFuture<java.lang.Integer> mResultFuture;
    androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService mUnusedAppRestrictionsService = null;
    private boolean mHasBoundService = false;

    UnusedAppRestrictionsBackportServiceConnection(android.content.Context context) {
        this.mContext = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportServiceAsInterface = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.asInterface(iBinder);
        this.mUnusedAppRestrictionsService = iUnusedAppRestrictionsBackportServiceAsInterface;
        try {
            iUnusedAppRestrictionsBackportServiceAsInterface.isPermissionRevocationEnabledForApp(getBackportCallback());
        } catch (android.os.RemoteException unused) {
            this.mResultFuture.set(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        this.mUnusedAppRestrictionsService = null;
    }

    public void connectAndFetchResult(androidx.concurrent.futures.ResolvableFuture<java.lang.Integer> resolvableFuture) {
        if (this.mHasBoundService) {
            throw new java.lang.IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.mHasBoundService = true;
        this.mResultFuture = resolvableFuture;
        this.mContext.bindService(new android.content.Intent(androidx.core.content.UnusedAppRestrictionsBackportService.ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION).setPackage(androidx.core.content.PackageManagerCompat.getPermissionRevocationVerifierApp(this.mContext.getPackageManager())), this, 1);
    }

    public void disconnectFromService() {
        if (!this.mHasBoundService) {
            throw new java.lang.IllegalStateException("bindService must be called before unbind");
        }
        this.mHasBoundService = false;
        this.mContext.unbindService(this);
    }

    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback getBackportCallback() {
        return new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws android.os.RemoteException {
                if (!z) {
                    androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(0);
                    android.util.Log.e(androidx.core.content.PackageManagerCompat.LOG_TAG, "Unable to retrieve the permission revocation setting from the backport");
                } else if (z2) {
                    androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(3);
                } else {
                    androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(2);
                }
            }
        };
    }
}
