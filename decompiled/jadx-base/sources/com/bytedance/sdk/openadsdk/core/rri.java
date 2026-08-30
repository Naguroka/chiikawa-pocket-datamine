package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class rri {
    private static final java.util.concurrent.atomic.AtomicInteger IL;
    private static final java.util.concurrent.atomic.AtomicInteger bX;
    private static final java.util.concurrent.atomic.AtomicInteger bg;
    private static final java.util.concurrent.atomic.AtomicInteger eqN;

    static {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        bg = atomicInteger;
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger();
        IL = atomicInteger2;
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = new java.util.concurrent.atomic.AtomicInteger();
        bX = atomicInteger3;
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = new java.util.concurrent.atomic.AtomicInteger();
        eqN = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void bg() {
        try {
            long jBg = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "upload_time_key", 0L);
            if (jBg <= 0 || java.lang.System.currentTimeMillis() - jBg < 86400000) {
                if (jBg <= 0 || jBg > java.lang.System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "upload_time_key", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    return;
                }
                return;
            }
            IL();
            synchronized (com.bytedance.sdk.openadsdk.core.rri.class) {
                bg.set(0);
                IL.set(0);
                bX.set(0);
                eqN.set(0);
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "upload_time_key", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void IL() {
        final int i = bg.get();
        final int i2 = IL.get();
        final int i3 = bX.get();
        final int i4 = eqN.get();
        com.bytedance.sdk.openadsdk.yDt.bX.bg("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.core.rri.1
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i);
                    jSONObject.put("encrypt_fail_count", i2);
                    jSONObject.put("decrypt_success_count", i3);
                    jSONObject.put("decrypt_fail_count", i4);
                } catch (java.lang.Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("crypt_v4_statistics").IL(jSONObject.toString());
            }
        });
    }

    public static void bg(final int i, final com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene cryptDataScene, final int i2) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.core.rri.2
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("crypt", i);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i2);
                    if (i2 == 6) {
                        jSONObject.put(com.json.ce.v, android.os.Build.MODEL);
                        jSONObject.put("vendor", android.os.Build.MANUFACTURER);
                    }
                } catch (java.lang.Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("crypt_v4_fail").IL(jSONObject.toString());
            }
        });
    }

    public static synchronized void bg(boolean z) {
        try {
            if (z) {
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "decrypt_success_count", java.lang.Integer.valueOf(bX.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "decrypt_fail_count", java.lang.Integer.valueOf(bX.incrementAndGet()));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public static void bg(org.json.JSONObject jSONObject) {
        IL(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }

    public static synchronized void IL(boolean z) {
        try {
            if (z) {
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "encrypt_success_count", java.lang.Integer.valueOf(bg.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("encrypt_statistics_file", "encrypt_fail_count", java.lang.Integer.valueOf(IL.incrementAndGet()));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
