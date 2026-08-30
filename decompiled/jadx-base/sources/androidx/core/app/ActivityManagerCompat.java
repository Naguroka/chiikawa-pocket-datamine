package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityManagerCompat {
    private ActivityManagerCompat() {
    }

    public static boolean isLowRamDevice(android.app.ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
