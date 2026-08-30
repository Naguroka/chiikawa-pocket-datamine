package androidx.startup;

/* JADX INFO: loaded from: classes3.dex */
public final class StartupLogger {
    static final boolean DEBUG = false;
    private static final java.lang.String TAG = "StartupLogger";

    private StartupLogger() {
    }

    public static void i(java.lang.String str) {
        android.util.Log.i(TAG, str);
    }

    public static void w(java.lang.String str) {
        android.util.Log.w(TAG, str);
    }

    public static void e(java.lang.String str, java.lang.Throwable th) {
        android.util.Log.e(TAG, str, th);
    }
}
