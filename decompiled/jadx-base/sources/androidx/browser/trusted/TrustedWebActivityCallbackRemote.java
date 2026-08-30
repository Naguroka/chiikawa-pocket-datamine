package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public class TrustedWebActivityCallbackRemote {
    private final android.support.customtabs.trusted.ITrustedWebActivityCallback mCallbackBinder;

    private TrustedWebActivityCallbackRemote(android.support.customtabs.trusted.ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.mCallbackBinder = iTrustedWebActivityCallback;
    }

    static androidx.browser.trusted.TrustedWebActivityCallbackRemote fromBinder(android.os.IBinder iBinder) {
        android.support.customtabs.trusted.ITrustedWebActivityCallback iTrustedWebActivityCallbackAsInterface = iBinder == null ? null : android.support.customtabs.trusted.ITrustedWebActivityCallback.Stub.asInterface(iBinder);
        if (iTrustedWebActivityCallbackAsInterface == null) {
            return null;
        }
        return new androidx.browser.trusted.TrustedWebActivityCallbackRemote(iTrustedWebActivityCallbackAsInterface);
    }

    public void runExtraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
