package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabsClient {
    private static final java.lang.String TAG = "CustomTabsClient";
    private final android.content.Context mApplicationContext;
    private final android.support.customtabs.ICustomTabsService mService;
    private final android.content.ComponentName mServiceComponentName;

    CustomTabsClient(android.support.customtabs.ICustomTabsService iCustomTabsService, android.content.ComponentName componentName, android.content.Context context) {
        this.mService = iCustomTabsService;
        this.mServiceComponentName = componentName;
        this.mApplicationContext = context;
    }

    public static boolean bindCustomTabsService(android.content.Context context, java.lang.String str, androidx.browser.customtabs.CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        android.content.Intent intent = new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!android.text.TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static boolean bindCustomTabsServicePreservePriority(android.content.Context context, java.lang.String str, androidx.browser.customtabs.CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        android.content.Intent intent = new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!android.text.TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 1);
    }

    public static java.lang.String getPackageName(android.content.Context context, java.util.List<java.lang.String> list) {
        return getPackageName(context, list, false);
    }

    public static java.lang.String getPackageName(android.content.Context context, java.util.List<java.lang.String> list, boolean z) {
        android.content.pm.ResolveInfo resolveInfoResolveActivity;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.util.List<java.lang.String> arrayList = list == null ? new java.util.ArrayList<>() : list;
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://"));
        if (!z && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            java.lang.String str = resolveInfoResolveActivity.activityInfo.packageName;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        android.content.Intent intent2 = new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        for (java.lang.String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return null;
        }
        android.util.Log.w(TAG, "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static boolean connectAndInitialize(android.content.Context context, java.lang.String str) {
        if (str == null) {
            return false;
        }
        final android.content.Context applicationContext = context.getApplicationContext();
        try {
            return bindCustomTabsService(applicationContext, str, new androidx.browser.customtabs.CustomTabsServiceConnection() { // from class: androidx.browser.customtabs.CustomTabsClient.1
                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(android.content.ComponentName componentName) {
                }

                @Override // androidx.browser.customtabs.CustomTabsServiceConnection
                public final void onCustomTabsServiceConnected(android.content.ComponentName componentName, androidx.browser.customtabs.CustomTabsClient customTabsClient) {
                    customTabsClient.warmup(0L);
                    applicationContext.unbindService(this);
                }
            });
        } catch (java.lang.SecurityException unused) {
            return false;
        }
    }

    public boolean warmup(long j) {
        try {
            return this.mService.warmup(j);
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    private static android.app.PendingIntent createSessionId(android.content.Context context, int i) {
        return android.app.PendingIntent.getActivity(context, i, new android.content.Intent(), 67108864);
    }

    public androidx.browser.customtabs.CustomTabsSession newSession(androidx.browser.customtabs.CustomTabsCallback customTabsCallback) {
        return newSessionInternal(customTabsCallback, null);
    }

    public androidx.browser.customtabs.CustomTabsSession newSession(androidx.browser.customtabs.CustomTabsCallback customTabsCallback, int i) {
        return newSessionInternal(customTabsCallback, createSessionId(this.mApplicationContext, i));
    }

    public static androidx.browser.customtabs.CustomTabsSession.PendingSession newPendingSession(android.content.Context context, androidx.browser.customtabs.CustomTabsCallback customTabsCallback, int i) {
        return new androidx.browser.customtabs.CustomTabsSession.PendingSession(customTabsCallback, createSessionId(context, i));
    }

    private androidx.browser.customtabs.CustomTabsSession newSessionInternal(androidx.browser.customtabs.CustomTabsCallback customTabsCallback, android.app.PendingIntent pendingIntent) {
        boolean zNewSession;
        android.support.customtabs.ICustomTabsCallback.Stub stubCreateCallbackWrapper = createCallbackWrapper(customTabsCallback);
        try {
            if (pendingIntent != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
                zNewSession = this.mService.newSessionWithExtras(stubCreateCallbackWrapper, bundle);
            } else {
                zNewSession = this.mService.newSession(stubCreateCallbackWrapper);
            }
            if (zNewSession) {
                return new androidx.browser.customtabs.CustomTabsSession(this.mService, stubCreateCallbackWrapper, this.mServiceComponentName, pendingIntent);
            }
            return null;
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) {
        try {
            return this.mService.extraCommand(str, bundle);
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    private android.support.customtabs.ICustomTabsCallback.Stub createCallbackWrapper(final androidx.browser.customtabs.CustomTabsCallback customTabsCallback) {
        return new android.support.customtabs.ICustomTabsCallback.Stub() { // from class: androidx.browser.customtabs.CustomTabsClient.2
            private android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onNavigationEvent(final int i, final android.os.Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onNavigationEvent(i, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void extraCallback(final java.lang.String str, final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.extraCallback(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                androidx.browser.customtabs.CustomTabsCallback customTabsCallback2 = customTabsCallback;
                if (customTabsCallback2 == null) {
                    return null;
                }
                return customTabsCallback2.extraCallbackWithResult(str, bundle);
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMessageChannelReady(final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onMessageChannelReady(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onPostMessage(final java.lang.String str, final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.4
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onPostMessage(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onRelationshipValidationResult(final int i, final android.net.Uri uri, final boolean z, final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onRelationshipValidationResult(i, uri, z, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityResized(final int i, final int i2, final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.6
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onActivityResized(i, i2, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onWarmupCompleted(final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.7
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onWarmupCompleted(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityLayout(final int i, final int i2, final int i3, final int i4, final int i5, final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.8
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onActivityLayout(i, i2, i3, i4, i5, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMinimized(final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.9
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onMinimized(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onUnminimized(final android.os.Bundle bundle) throws android.os.RemoteException {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new java.lang.Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.10
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onUnminimized(bundle);
                    }
                });
            }
        };
    }

    public androidx.browser.customtabs.CustomTabsSession attachSession(androidx.browser.customtabs.CustomTabsSession.PendingSession pendingSession) {
        return newSessionInternal(pendingSession.getCallback(), pendingSession.getId());
    }
}
