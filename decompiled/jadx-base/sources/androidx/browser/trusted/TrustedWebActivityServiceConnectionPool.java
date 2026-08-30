package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public final class TrustedWebActivityServiceConnectionPool {
    private static final java.lang.String TAG = "TWAConnectionPool";
    private final java.util.Map<android.net.Uri, androidx.browser.trusted.ConnectionHolder> mConnections = new java.util.HashMap();
    private final android.content.Context mContext;

    private TrustedWebActivityServiceConnectionPool(android.content.Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static androidx.browser.trusted.TrustedWebActivityServiceConnectionPool create(android.content.Context context) {
        return new androidx.browser.trusted.TrustedWebActivityServiceConnectionPool(context);
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.browser.trusted.TrustedWebActivityServiceConnection> connect(final android.net.Uri uri, java.util.Set<androidx.browser.trusted.Token> set, java.util.concurrent.Executor executor) {
        androidx.browser.trusted.ConnectionHolder connectionHolder = this.mConnections.get(uri);
        if (connectionHolder != null) {
            return connectionHolder.getServiceWrapper();
        }
        android.content.Intent intentCreateServiceIntent = createServiceIntent(this.mContext, uri, set, true);
        if (intentCreateServiceIntent == null) {
            return androidx.browser.trusted.FutureUtils.immediateFailedFuture(new java.lang.IllegalArgumentException("No service exists for scope"));
        }
        androidx.browser.trusted.ConnectionHolder connectionHolder2 = new androidx.browser.trusted.ConnectionHolder(new java.lang.Runnable() { // from class: androidx.browser.trusted.TrustedWebActivityServiceConnectionPool$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m10x9cdfbfef(uri);
            }
        });
        this.mConnections.put(uri, connectionHolder2);
        new androidx.browser.trusted.TrustedWebActivityServiceConnectionPool.BindToServiceAsyncTask(this.mContext, intentCreateServiceIntent, connectionHolder2).executeOnExecutor(executor, new java.lang.Void[0]);
        return connectionHolder2.getServiceWrapper();
    }

    /* JADX INFO: renamed from: lambda$connect$0$androidx-browser-trusted-TrustedWebActivityServiceConnectionPool, reason: not valid java name */
    /* synthetic */ void m10x9cdfbfef(android.net.Uri uri) {
        this.mConnections.remove(uri);
    }

    static class BindToServiceAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Exception> {
        private final android.content.Context mAppContext;
        private final androidx.browser.trusted.ConnectionHolder mConnection;
        private final android.content.Intent mIntent;

        BindToServiceAsyncTask(android.content.Context context, android.content.Intent intent, androidx.browser.trusted.ConnectionHolder connectionHolder) {
            this.mAppContext = context.getApplicationContext();
            this.mIntent = intent;
            this.mConnection = connectionHolder;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public java.lang.Exception doInBackground(java.lang.Void... voidArr) {
            try {
                if (this.mAppContext.bindService(this.mIntent, this.mConnection, androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN)) {
                    return null;
                }
                this.mAppContext.unbindService(this.mConnection);
                return new java.lang.IllegalStateException("Could not bind to the service");
            } catch (java.lang.SecurityException e) {
                android.util.Log.w(androidx.browser.trusted.TrustedWebActivityServiceConnectionPool.TAG, "SecurityException while binding.", e);
                return e;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(java.lang.Exception exc) {
            if (exc != null) {
                this.mConnection.cancel(exc);
            }
        }
    }

    public boolean serviceExistsForScope(android.net.Uri uri, java.util.Set<androidx.browser.trusted.Token> set) {
        return (this.mConnections.get(uri) == null && createServiceIntent(this.mContext, uri, set, false) == null) ? false : true;
    }

    void unbindAllConnections() {
        java.util.Iterator<androidx.browser.trusted.ConnectionHolder> it = this.mConnections.values().iterator();
        while (it.hasNext()) {
            this.mContext.unbindService(it.next());
        }
        this.mConnections.clear();
    }

    private android.content.Intent createServiceIntent(android.content.Context context, android.net.Uri uri, java.util.Set<androidx.browser.trusted.Token> set, boolean z) {
        if (set == null || set.size() == 0) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        java.util.Iterator<android.content.pm.ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        java.lang.String str = null;
        while (it.hasNext()) {
            java.lang.String str2 = it.next().activityInfo.packageName;
            java.util.Iterator<androidx.browser.trusted.Token> it2 = set.iterator();
            while (it2.hasNext()) {
                if (it2.next().matches(str2, context.getPackageManager())) {
                    str = str2;
                    break;
                }
            }
        }
        if (str == null) {
            if (z) {
                android.util.Log.w(TAG, "No TWA candidates for " + uri + " have been registered.");
            }
            return null;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setPackage(str);
        intent2.setAction(androidx.browser.trusted.TrustedWebActivityService.ACTION_TRUSTED_WEB_ACTIVITY_SERVICE);
        android.content.pm.ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveInfoResolveService == null) {
            if (z) {
                android.util.Log.w(TAG, "Could not find TWAService for " + str);
            }
            return null;
        }
        if (z) {
            android.util.Log.i(TAG, "Found " + resolveInfoResolveService.serviceInfo.name + " to handle request for " + uri);
        }
        android.content.Intent intent3 = new android.content.Intent();
        intent3.setComponent(new android.content.ComponentName(str, resolveInfoResolveService.serviceInfo.name));
        return intent3;
    }
}
