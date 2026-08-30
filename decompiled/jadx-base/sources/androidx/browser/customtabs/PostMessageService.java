package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends android.app.Service {
    private android.support.customtabs.IPostMessageService.Stub mBinder = new android.support.customtabs.IPostMessageService.Stub() { // from class: androidx.browser.customtabs.PostMessageService.1
        @Override // android.support.customtabs.IPostMessageService
        public void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            iCustomTabsCallback.onMessageChannelReady(bundle);
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onPostMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            iCustomTabsCallback.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.mBinder;
    }
}
