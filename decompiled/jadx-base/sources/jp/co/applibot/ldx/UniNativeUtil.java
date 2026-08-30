package jp.co.applibot.ldx;

/* JADX INFO: loaded from: classes6.dex */
public class UniNativeUtil {
    public static void setSystemBarVisibility(final android.app.Activity activity, final boolean z) {
        activity.runOnUiThread(new java.lang.Runnable() { // from class: jp.co.applibot.ldx.UniNativeUtil$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                jp.co.applibot.ldx.UniNativeUtil.lambda$setSystemBarVisibility$0(activity, z);
            }
        });
    }

    static /* synthetic */ void lambda$setSystemBarVisibility$0(android.app.Activity activity, boolean z) {
        android.view.Window window = activity.getWindow();
        if (z) {
            window.clearFlags(1024);
            window.addFlags(2048);
        } else {
            window.clearFlags(2048);
            window.addFlags(1024);
        }
    }

    public static void setSystemBarTranslucent(final android.app.Activity activity, final boolean z) {
        activity.runOnUiThread(new java.lang.Runnable() { // from class: jp.co.applibot.ldx.UniNativeUtil$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                jp.co.applibot.ldx.UniNativeUtil.lambda$setSystemBarTranslucent$1(activity, z);
            }
        });
    }

    static /* synthetic */ void lambda$setSystemBarTranslucent$1(android.app.Activity activity, boolean z) {
        android.view.Window window = activity.getWindow();
        int iArgb = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        if (z) {
            iArgb = android.graphics.Color.argb(128, android.graphics.Color.red(androidx.core.view.ViewCompat.MEASURED_STATE_MASK), android.graphics.Color.blue(androidx.core.view.ViewCompat.MEASURED_STATE_MASK), android.graphics.Color.green(androidx.core.view.ViewCompat.MEASURED_STATE_MASK));
            window.addFlags(-1946157056);
        } else {
            window.clearFlags(-1946157056);
        }
        window.setStatusBarColor(iArgb);
        window.setNavigationBarColor(iArgb);
    }

    public static void setSystemBarTransparent(final android.app.Activity activity, final boolean z) {
        activity.runOnUiThread(new java.lang.Runnable() { // from class: jp.co.applibot.ldx.UniNativeUtil$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                jp.co.applibot.ldx.UniNativeUtil.lambda$setSystemBarTransparent$2(activity, z);
            }
        });
    }

    static /* synthetic */ void lambda$setSystemBarTransparent$2(android.app.Activity activity, boolean z) {
        android.view.Window window = activity.getWindow();
        if (isHigherAPILevel(23)) {
            window.setDecorFitsSystemWindows(false);
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(z ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        } else {
            window.addFlags(512);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    private static boolean isHigherAPILevel(int i) {
        return android.os.Build.VERSION.SDK_INT >= i;
    }
}
