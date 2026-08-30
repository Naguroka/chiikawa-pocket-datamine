package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class VB {
    private static final java.util.concurrent.atomic.AtomicInteger bg = new java.util.concurrent.atomic.AtomicInteger(0);
    private static final java.util.concurrent.atomic.AtomicBoolean IL = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void bg(java.lang.String str) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = IL;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.Lq.Kg(com.bytedance.sdk.openadsdk.core.VzQ.bg())) {
                atomicBoolean.set(false);
            } else {
                com.bytedance.sdk.openadsdk.core.VB.bg.bg();
                bX(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bX(final java.lang.String str) {
        com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.VB.1
            @Override // java.lang.Runnable
            public void run() {
                org.json.JSONObject jSONObjectBg;
                final java.lang.String strJf = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().jf();
                com.bytedance.sdk.openadsdk.yDt.bX.bg(0, strJf);
                if (android.text.TextUtils.isEmpty(strJf)) {
                    com.bytedance.sdk.openadsdk.yDt.bX.bg(-1, strJf, -1, "url is null");
                    return;
                }
                com.bytedance.sdk.component.iR.IL.eqN eqnIL = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().IL();
                try {
                    eqnIL.IL(strJf);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.rri.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 0L));
                    jSONObject.put("device_id", java.lang.Long.parseLong(str));
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.eqN.bg.bX.bg().IL());
                    if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.APP_LOG)) {
                        jSONObjectBg = com.bytedance.sdk.component.embedapplog.PangleEncryptManager.encryptType4(jSONObject, new com.bytedance.sdk.openadsdk.core.tC(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                        if (jSONObjectBg != null && jSONObjectBg.optInt("cypher") == 4) {
                            com.bytedance.sdk.openadsdk.core.rri.IL(true);
                            eqnIL.IL("x-pgli18n", "4");
                            eqnIL.IL("Content-Type", "application/json; charset=utf-8");
                        } else {
                            com.bytedance.sdk.openadsdk.core.rri.IL(false);
                        }
                    } else {
                        jSONObjectBg = com.bytedance.sdk.component.utils.bg.bg(jSONObject);
                        if (com.bytedance.sdk.openadsdk.core.VB.IL(jSONObjectBg)) {
                            eqnIL.IL(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                        }
                    }
                    if (com.bytedance.sdk.openadsdk.core.VB.IL(jSONObjectBg)) {
                        jSONObject = jSONObjectBg;
                    }
                    eqnIL.IL("Content-Type", "application/json; charset=utf-8");
                    eqnIL.IL(com.google.common.net.HttpHeaders.USER_AGENT, com.bytedance.sdk.openadsdk.utils.ayS.bX());
                    eqnIL.bg(jSONObject);
                    eqnIL.bg(6);
                    eqnIL.bg("send_i_p_v6");
                    eqnIL.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.VB.1.1
                        @Override // com.bytedance.sdk.component.iR.bg.bg
                        public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                            if (il.ldr()) {
                                com.bytedance.sdk.openadsdk.yDt.bX.bg(1, strJf);
                            } else {
                                com.bytedance.sdk.openadsdk.yDt.bX.bg(-1, strJf, il.bg(), il.IL());
                                com.bytedance.sdk.openadsdk.core.VB.eqN();
                            }
                        }

                        @Override // com.bytedance.sdk.component.iR.bg.bg
                        public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.yDt.bX.bg(-1, strJf, 1, iOException.getMessage());
                            }
                            com.bytedance.sdk.openadsdk.core.VB.eqN();
                        }
                    });
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.openadsdk.yDt.bX.bg(-1, strJf, -2, e.getMessage());
                    com.bytedance.sdk.component.utils.PX.IL("build ipv6 request failed:" + e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean IL(org.json.JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bX() {
        bg.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void eqN() {
        if (bg.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg().schedule(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VB.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.VB.bX(com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
                }
            }, 10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    private static class bg implements com.bytedance.sdk.component.utils.rri.bg {
        private static final java.util.concurrent.atomic.AtomicBoolean bg = new java.util.concurrent.atomic.AtomicBoolean(false);
        private static volatile long IL = -1;

        private bg() {
        }

        public static void bg() {
            if (bg.compareAndSet(false, true)) {
                IL = java.lang.System.currentTimeMillis();
                com.bytedance.sdk.component.utils.rri.bg(new com.bytedance.sdk.openadsdk.core.VB.bg(), com.bytedance.sdk.openadsdk.core.VzQ.bg());
            }
        }

        public void IL() {
            com.bytedance.sdk.component.utils.rri.bg(this);
        }

        @Override // com.bytedance.sdk.component.utils.rri.bg
        public void bg(android.content.Context context, android.content.Intent intent, boolean z, int i) {
            if (java.lang.System.currentTimeMillis() - IL >= 2000 && i != 0) {
                com.bytedance.sdk.openadsdk.core.VB.bX();
                com.bytedance.sdk.openadsdk.core.VB.bX(com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
                IL();
            }
        }
    }
}
