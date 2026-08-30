package com.applovin.mediation.unity;

/* JADX INFO: loaded from: classes3.dex */
public class Utils {
    static android.app.Activity getCurrentActivity() {
        return com.unity3d.player.UnityPlayer.currentActivity;
    }

    static void runSafelyOnUiThread(android.app.Activity activity, final java.lang.Runnable runnable) {
        activity.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.mediation.unity.Utils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.mediation.unity.Utils.lambda$runSafelyOnUiThread$0(runnable);
            }
        });
    }

    static /* synthetic */ void lambda$runSafelyOnUiThread$0(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isMainThread() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    protected static boolean isCurrentProcessInForeground() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        try {
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (java.lang.Throwable unused) {
        }
        return runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200;
    }
}
