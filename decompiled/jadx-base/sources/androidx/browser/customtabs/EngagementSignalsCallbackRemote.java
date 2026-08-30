package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
final class EngagementSignalsCallbackRemote implements androidx.browser.customtabs.EngagementSignalsCallback {
    private static final java.lang.String TAG = "EngagementSigsCallbkRmt";
    private final android.support.customtabs.IEngagementSignalsCallback mCallbackBinder;

    private EngagementSignalsCallbackRemote(android.support.customtabs.IEngagementSignalsCallback iEngagementSignalsCallback) {
        this.mCallbackBinder = iEngagementSignalsCallback;
    }

    static androidx.browser.customtabs.EngagementSignalsCallbackRemote fromBinder(android.os.IBinder iBinder) {
        return new androidx.browser.customtabs.EngagementSignalsCallbackRemote(android.support.customtabs.IEngagementSignalsCallback.Stub.asInterface(iBinder));
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onVerticalScrollEvent(boolean z, android.os.Bundle bundle) {
        try {
            this.mCallbackBinder.onVerticalScrollEvent(z, bundle);
        } catch (android.os.RemoteException unused) {
            android.util.Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(int i, android.os.Bundle bundle) {
        try {
            this.mCallbackBinder.onGreatestScrollPercentageIncreased(i, bundle);
        } catch (android.os.RemoteException unused) {
            android.util.Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onSessionEnded(boolean z, android.os.Bundle bundle) {
        try {
            this.mCallbackBinder.onSessionEnded(z, bundle);
        } catch (android.os.RemoteException unused) {
            android.util.Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}
