package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class CalleeHandler {
    private CalleeHandler() {
    }

    static android.os.Handler create() {
        if (android.os.Looper.myLooper() == null) {
            return new android.os.Handler(android.os.Looper.getMainLooper());
        }
        return new android.os.Handler();
    }
}
