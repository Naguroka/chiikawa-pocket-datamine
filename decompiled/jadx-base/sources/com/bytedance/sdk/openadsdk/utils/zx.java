package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class zx {
    static float IL = 0.0f;
    private static long bX = 0;
    static int bg = -1;

    private static void bg(android.content.Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            bg = 1;
        } else {
            bg = 0;
        }
        IL = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static com.bytedance.sdk.openadsdk.utils.zx.bg bg() {
        if (bX == 0 || android.os.SystemClock.elapsedRealtime() - bX > 60000) {
            android.content.Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.VzQ.bg().registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            android.util.Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(java.lang.String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                bg(intentRegisterReceiver);
                bX = android.os.SystemClock.elapsedRealtime();
            }
        }
        com.bytedance.sdk.openadsdk.utils.zx.bg bgVar = new com.bytedance.sdk.openadsdk.utils.zx.bg(bg, IL);
        int i = bgVar.bg;
        float f = bgVar.IL;
        return bgVar;
    }

    public static class bg {
        public final float IL;
        public final int bg;

        public bg(int i, float f) {
            this.bg = i;
            this.IL = f;
        }
    }
}
