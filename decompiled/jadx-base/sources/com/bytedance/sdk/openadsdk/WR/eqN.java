package com.bytedance.sdk.openadsdk.WR;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    public static com.bytedance.sdk.component.zx.eo bg(java.lang.String str) {
        return com.bytedance.sdk.openadsdk.WR.eqN.bg.IL(str);
    }

    public static com.bytedance.sdk.component.zx.eo bg(com.bytedance.sdk.openadsdk.core.model.Lq lq) {
        return com.bytedance.sdk.openadsdk.WR.eqN.bg.IL(lq);
    }

    public static java.io.InputStream bg(java.lang.String str, java.lang.String str2) {
        return com.bytedance.sdk.openadsdk.WR.eqN.bg.IL(str, str2);
    }

    public static boolean bg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return com.bytedance.sdk.openadsdk.WR.eqN.bg.IL(str, str2, str3);
    }

    public static com.bytedance.sdk.component.zx.Lq bg() {
        return com.bytedance.sdk.openadsdk.WR.eqN.bg.bg;
    }

    private static final class bg {
        private static final com.bytedance.sdk.component.zx.Lq bg = bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());

        private static com.bytedance.sdk.component.zx.Lq bg(android.content.Context context) {
            return com.bytedance.sdk.component.zx.bX.IL.bg(context, new com.bytedance.sdk.component.zx.bX.zx.bg().bg(new com.bytedance.sdk.component.zx.bX.bg.bg(java.lang.Math.max(java.lang.Math.min(java.lang.Long.valueOf(java.lang.Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new java.io.File(com.bytedance.sdk.openadsdk.CacheDirFactory.getImageCacheDir()))).bg(new com.bytedance.sdk.component.zx.tC() { // from class: com.bytedance.sdk.openadsdk.WR.eqN.bg.2
                @Override // com.bytedance.sdk.component.zx.tC
                public java.util.concurrent.ExecutorService bg() {
                    return com.bytedance.sdk.openadsdk.utils.VJ.IL();
                }
            }).bg(new com.bytedance.sdk.component.zx.eqN() { // from class: com.bytedance.sdk.openadsdk.WR.eqN.bg.1
                @Override // com.bytedance.sdk.component.zx.eqN
                /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
                public com.bytedance.sdk.component.zx.IL.eqN bg(com.bytedance.sdk.component.zx.zx zxVar) {
                    com.bytedance.sdk.component.IL.bg.VB vbZx = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().zx();
                    com.bytedance.sdk.component.IL.bg.Ta taIL = new com.bytedance.sdk.component.IL.bg.Ta.bg().IL(zxVar.bg()).bg().IL();
                    com.bytedance.sdk.component.IL.bg.Lq lqIL = null;
                    com.bytedance.sdk.component.zx.IL.zx zxVar2 = zxVar.bX() ? new com.bytedance.sdk.component.zx.IL.zx() : null;
                    if (zxVar2 != null) {
                        zxVar2.bg(java.lang.System.currentTimeMillis());
                    }
                    try {
                        lqIL = vbZx.bg(taIL).IL();
                        if (zxVar2 != null) {
                            zxVar2.IL(java.lang.System.currentTimeMillis());
                        }
                        java.util.Map<java.lang.String, java.lang.String> mapBg = bg(zxVar, lqIL);
                        byte[] bArrEqN = lqIL.ldr().eqN();
                        if (zxVar2 != null) {
                            zxVar2.bX(java.lang.System.currentTimeMillis());
                        }
                        com.bytedance.sdk.component.zx.IL.eqN eqn = new com.bytedance.sdk.component.zx.IL.eqN(lqIL.bX(), bArrEqN, "", mapBg);
                        eqn.bg(zxVar2);
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(lqIL);
                        return eqn;
                    } catch (java.lang.Throwable th) {
                        try {
                            return bg(zxVar2, th);
                        } finally {
                            com.bytedance.sdk.component.zx.bX.bX.IL.bg(lqIL);
                        }
                    }
                }

                private java.util.Map<java.lang.String, java.lang.String> bg(com.bytedance.sdk.component.zx.zx zxVar, com.bytedance.sdk.component.IL.bg.Lq lq) {
                    if (!zxVar.IL()) {
                        return null;
                    }
                    com.bytedance.sdk.component.IL.bg.ldr ldrVarIR = lq.iR();
                    java.util.HashMap map = new java.util.HashMap();
                    int iBg = ldrVarIR.bg();
                    for (int i = 0; i < iBg; i++) {
                        java.lang.String strBg = ldrVarIR.bg(i);
                        java.lang.String strIL = ldrVarIR.IL(i);
                        if (strBg != null) {
                            map.put(strBg, strIL);
                        }
                    }
                    return map;
                }

                private com.bytedance.sdk.component.zx.IL.eqN bg(com.bytedance.sdk.component.zx.IL.zx zxVar, java.lang.Throwable th) {
                    th.getMessage();
                    if (zxVar != null) {
                        zxVar.bX(java.lang.System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.zx.IL.eqN eqn = new com.bytedance.sdk.component.zx.IL.eqN(98765, th, "net failed");
                    eqn.bg(zxVar);
                    return eqn;
                }
            }).bg());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.zx.eo IL(java.lang.String str) {
            return bg(bg.bg(str).zx(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.zx.eo IL(com.bytedance.sdk.openadsdk.core.model.Lq lq) {
            return bg(bg.bg(lq.bg()).bg(lq.IL()).IL(lq.bX()).zx(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bg(lq.iR()));
        }

        private static com.bytedance.sdk.component.zx.eo bg(com.bytedance.sdk.component.zx.eo eoVar) {
            return com.bytedance.sdk.openadsdk.utils.VW.bg() ? eoVar.bg(new com.bytedance.sdk.openadsdk.WR.zx()) : eoVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.io.InputStream IL(java.lang.String str, java.lang.String str2) {
            return bg.bg(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean IL(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            return bg.bg(str, str2, str3);
        }
    }
}
