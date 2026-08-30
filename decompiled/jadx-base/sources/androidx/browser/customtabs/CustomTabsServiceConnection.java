package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsServiceConnection implements android.content.ServiceConnection {
    private android.content.Context mApplicationContext;

    public abstract void onCustomTabsServiceConnected(android.content.ComponentName componentName, androidx.browser.customtabs.CustomTabsClient customTabsClient);

    void setApplicationContext(android.content.Context context) {
        this.mApplicationContext = context;
    }

    android.content.Context getApplicationContext() {
        return this.mApplicationContext;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new java.lang.IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new androidx.browser.customtabs.CustomTabsClient(android.support.customtabs.ICustomTabsService.Stub.asInterface(iBinder), componentName, this.mApplicationContext) { // from class: androidx.browser.customtabs.CustomTabsServiceConnection.1
        });
    }
}
