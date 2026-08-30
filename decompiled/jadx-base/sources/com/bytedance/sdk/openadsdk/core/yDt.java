package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class yDt {
    public static volatile boolean bg = false;
    private static volatile android.os.HandlerThread iR;
    public static long zx;
    public static java.util.concurrent.atomic.AtomicBoolean IL = new java.util.concurrent.atomic.AtomicBoolean(false);
    public static long bX = 0;
    private static volatile int ldr = 0;
    public static float eqN = 1.0f;
    private static volatile android.os.Handler Kg = null;

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("csj_init_handle", 10);
        iR = handlerThread;
        handlerThread.start();
        zx = java.lang.System.currentTimeMillis();
    }

    public static void bg(long j) {
        zx = j;
    }

    public static long bg() {
        return zx;
    }

    public static android.os.Handler IL() {
        if (iR == null || !iR.isAlive()) {
            synchronized (com.bytedance.sdk.openadsdk.core.yDt.class) {
                if (iR == null || !iR.isAlive()) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("csj_init_handle", -1);
                    iR = handlerThread;
                    handlerThread.start();
                    Kg = new android.os.Handler(iR.getLooper());
                }
            }
        } else if (Kg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.yDt.class) {
                if (Kg == null) {
                    Kg = new android.os.Handler(iR.getLooper());
                }
            }
        }
        return Kg;
    }

    public static android.os.Handler bX() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static int eqN() {
        return ldr;
    }

    public static void bg(int i) {
        ldr = i;
    }

    public static boolean zx() {
        return eqN() == 1;
    }

    public static void ldr() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (jElapsedRealtime - bX <= 10000) {
            return;
        }
        bX = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.yDt.1
            @Override // java.lang.Runnable
            public void run() {
                java.lang.String strBX = com.bytedance.sdk.openadsdk.core.settings.xxp.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
                if (android.text.TextUtils.equals(strBX, com.bytedance.sdk.openadsdk.core.settings.xxp.eqN)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(6, true);
                com.bytedance.sdk.openadsdk.core.settings.xxp.eqN = strBX;
            }
        });
    }

    public static void bg(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    com.bytedance.sdk.openadsdk.core.WR.IL().IL(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("InitHelper", th.getMessage());
        }
    }

    public static void iR() {
        IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yDt.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.p002vb.eqN.bg(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.yDt.2.1
                        @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                        public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                            com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                            bgVar.IL(com.ironsource.y8.a.f);
                            return bgVar;
                        }
                    });
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("InitHelper", th.getMessage());
                }
            }
        });
    }
}
