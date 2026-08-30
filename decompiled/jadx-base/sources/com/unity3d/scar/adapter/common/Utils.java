package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes6.dex */
public class Utils {
    public static void runOnUiThread(java.lang.Runnable runnable) {
        runOnUiThread(runnable, 0L);
    }

    public static void runOnUiThread(java.lang.Runnable runnable, long j) {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(runnable, j);
    }
}
