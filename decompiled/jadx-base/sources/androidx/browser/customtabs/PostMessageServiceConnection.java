package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public abstract class PostMessageServiceConnection implements androidx.browser.customtabs.PostMessageBackend, android.content.ServiceConnection {
    private static final java.lang.String TAG = "PostMessageServConn";
    private final java.lang.Object mLock = new java.lang.Object();
    private boolean mMessageChannelCreated;
    private java.lang.String mPackageName;
    private android.support.customtabs.IPostMessageService mService;
    private final android.support.customtabs.ICustomTabsCallback mSessionBinder;

    public void onPostMessageServiceDisconnected() {
    }

    public PostMessageServiceConnection(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken) {
        android.os.IBinder callbackBinder = customTabsSessionToken.getCallbackBinder();
        if (callbackBinder == null) {
            throw new java.lang.IllegalArgumentException("Provided session must have binder.");
        }
        this.mSessionBinder = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(callbackBinder);
    }

    public void setPackageName(java.lang.String str) {
        this.mPackageName = str;
    }

    public boolean bindSessionToPostMessageService(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(str, androidx.browser.customtabs.PostMessageService.class.getName());
        boolean zBindService = context.bindService(intent, this, 1);
        if (!zBindService) {
            android.util.Log.w(TAG, "Could not bind to PostMessageService in client.");
        }
        return zBindService;
    }

    public boolean bindSessionToPostMessageService(android.content.Context context) {
        java.lang.String str = this.mPackageName;
        if (str == null) {
            throw new java.lang.IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
        }
        return bindSessionToPostMessageService(context, str);
    }

    private boolean isBoundToService() {
        return this.mService != null;
    }

    public void unbindFromContext(android.content.Context context) {
        if (isBoundToService()) {
            context.unbindService(this);
            this.mService = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.mService = android.support.customtabs.IPostMessageService.Stub.asInterface(iBinder);
        onPostMessageServiceConnected();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.mService = null;
        onPostMessageServiceDisconnected();
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    public final boolean onNotifyMessageChannelReady(android.os.Bundle bundle) {
        return notifyMessageChannelReady(bundle);
    }

    public final boolean notifyMessageChannelReady(android.os.Bundle bundle) {
        this.mMessageChannelCreated = true;
        return notifyMessageChannelReadyInternal(bundle);
    }

    private boolean notifyMessageChannelReadyInternal(android.os.Bundle bundle) {
        if (this.mService == null) {
            return false;
        }
        synchronized (this.mLock) {
            try {
                try {
                    this.mService.onMessageChannelReady(this.mSessionBinder, bundle);
                } catch (android.os.RemoteException unused) {
                    return false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    public final boolean onPostMessage(java.lang.String str, android.os.Bundle bundle) {
        return postMessage(str, bundle);
    }

    public final boolean postMessage(java.lang.String str, android.os.Bundle bundle) {
        if (this.mService == null) {
            return false;
        }
        synchronized (this.mLock) {
            try {
                try {
                    this.mService.onPostMessage(this.mSessionBinder, str, bundle);
                } catch (android.os.RemoteException unused) {
                    return false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    public void onDisconnectChannel(android.content.Context context) {
        unbindFromContext(context);
    }

    public void onPostMessageServiceConnected() {
        if (this.mMessageChannelCreated) {
            notifyMessageChannelReadyInternal(null);
        }
    }

    public void cleanup(android.content.Context context) {
        if (isBoundToService()) {
            unbindFromContext(context);
        }
    }
}
