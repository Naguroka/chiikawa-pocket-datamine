package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public class UnusedAppRestrictionsBackportCallback {
    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback mCallback;

    public UnusedAppRestrictionsBackportCallback(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        this.mCallback = iUnusedAppRestrictionsBackportCallback;
    }

    public void onResult(boolean z, boolean z2) throws android.os.RemoteException {
        this.mCallback.onIsPermissionRevocationEnabledForAppResult(z, z2);
    }
}
