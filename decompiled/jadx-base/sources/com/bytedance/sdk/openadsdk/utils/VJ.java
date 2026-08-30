package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class VJ {
    private static volatile boolean IL;
    private static volatile com.bytedance.sdk.component.Kg.bX.ldr Kg;
    private static volatile com.bytedance.sdk.component.Kg.bX.ldr WR;
    private static volatile com.bytedance.sdk.component.Kg.bX.ldr bX;
    private static volatile java.util.concurrent.ThreadPoolExecutor bg;
    private static volatile com.bytedance.sdk.component.Kg.bX.ldr eo;
    private static volatile com.bytedance.sdk.component.Kg.bX.ldr eqN;
    private static volatile com.bytedance.sdk.component.Kg.bX.ldr iR;
    private static volatile com.bytedance.sdk.component.Kg.bX.ldr ldr;
    private static volatile com.bytedance.sdk.component.Kg.bX.ldr zx;

    static {
        com.bytedance.sdk.component.Kg.bX.bX.bg(new com.bytedance.sdk.component.Kg.bX.bg() { // from class: com.bytedance.sdk.openadsdk.utils.VJ.1
            @Override // com.bytedance.sdk.component.Kg.bX.bg
            public void bg(com.bytedance.sdk.component.Kg.bX.ldr ldrVar, com.bytedance.sdk.component.Kg.bX.IL il) {
                il.IL();
                new java.lang.RuntimeException();
            }
        });
        com.bytedance.sdk.component.Kg.bX.bX.bg(new com.bytedance.sdk.component.Kg.bX.zx() { // from class: com.bytedance.sdk.openadsdk.utils.VJ.3
            @Override // com.bytedance.sdk.component.Kg.bX.zx
            public void bg(final com.bytedance.sdk.component.Kg.bX.ldr ldrVar) {
                if (com.bytedance.sdk.openadsdk.utils.Uq.bg || ldrVar == null) {
                    return;
                }
                try {
                    java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.Kg.bX.bg.bg> linkedHashMapBg = ldrVar.bg();
                    if (linkedHashMapBg == null || linkedHashMapBg.size() <= 0) {
                        return;
                    }
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, com.bytedance.sdk.component.Kg.bX.bg.bg>> it = linkedHashMapBg.entrySet().iterator();
                    while (it.hasNext()) {
                        final com.bytedance.sdk.component.Kg.bX.bg.bg value = it.next().getValue();
                        if (value != null) {
                            com.bytedance.sdk.openadsdk.yDt.bX.bg();
                            com.bytedance.sdk.openadsdk.yDt.bX.bg("pag_thread_pool_state", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.utils.VJ.3.1
                                @Override // com.bytedance.sdk.openadsdk.yDt.IL
                                public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                                    try {
                                        jSONObject.put("name", value.bg());
                                        jSONObject.put("times", value.IL());
                                        jSONObject.put("runMaxTime", value.ldr());
                                        jSONObject.put("waitMaxTime", value.zx());
                                        long jIL = value.IL() == 0 ? 1 : value.IL();
                                        jSONObject.put("avgRunTime", value.eqN() / jIL);
                                        jSONObject.put("avgWaitTime", value.bX() / jIL);
                                        jSONObject.put("poolType", ldrVar.IL());
                                    } catch (java.lang.Exception e) {
                                        com.bytedance.sdk.component.utils.PX.bg("ThreadUtils", "run: ", e);
                                    }
                                    return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("pag_thread_pool_state").IL(jSONObject.toString());
                                }
                            });
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th.getMessage();
                }
            }
        });
        bg = null;
        IL = false;
    }

    public static java.util.concurrent.ScheduledExecutorService bg() {
        return com.bytedance.sdk.component.Kg.ldr.ldr();
    }

    public static java.util.concurrent.ExecutorService IL() {
        if (VB()) {
            return vb();
        }
        return com.bytedance.sdk.component.Kg.ldr.eo();
    }

    public static java.util.concurrent.ExecutorService bX() {
        if (VB()) {
            return yDt();
        }
        return com.bytedance.sdk.component.Kg.ldr.eqN();
    }

    public static java.util.concurrent.ExecutorService eqN() {
        if (VB()) {
            return Kg();
        }
        return com.bytedance.sdk.component.Kg.ldr.IL();
    }

    public static boolean zx() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    public static boolean ldr() {
        java.lang.String str = VB() ? "pag_log" : "csj_log";
        java.lang.String name = java.lang.Thread.currentThread().getName();
        if (android.text.TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    public static void bg(java.lang.Runnable runnable) {
        if (runnable == null || com.bytedance.sdk.openadsdk.utils.Uq.bg) {
            return;
        }
        if (zx()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.yDt.bX().post(runnable);
        }
    }

    public static void IL(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.yDt.bX().removeCallbacks(runnable);
    }

    public static void bg(final com.bytedance.sdk.component.Kg.Kg kg) {
        if (com.bytedance.sdk.openadsdk.utils.Uq.bg) {
            return;
        }
        if (VB()) {
            Kg().execute(new com.bytedance.sdk.component.Kg.bX.IL(kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.4
                @Override // java.lang.Runnable
                public void run() {
                    kg.run();
                }
            });
        } else {
            com.bytedance.sdk.component.Kg.ldr.bg(kg);
        }
    }

    public static java.util.concurrent.ExecutorService iR() {
        if (VB()) {
            return xxp();
        }
        return com.bytedance.sdk.component.Kg.ldr.bX();
    }

    public static void IL(final com.bytedance.sdk.component.Kg.Kg kg) {
        if (com.bytedance.sdk.openadsdk.utils.Uq.bg) {
            return;
        }
        if (VB()) {
            xxp().execute(new com.bytedance.sdk.component.Kg.bX.IL(kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.5
                @Override // java.lang.Runnable
                public void run() {
                    kg.run();
                }
            });
        } else {
            com.bytedance.sdk.component.Kg.ldr.IL(kg);
        }
    }

    public static void bg(final com.bytedance.sdk.component.Kg.Kg kg, int i) {
        if (kg == null || com.bytedance.sdk.openadsdk.utils.Uq.bg) {
            return;
        }
        if (VB()) {
            com.bytedance.sdk.component.Kg.bX.IL il = new com.bytedance.sdk.component.Kg.bX.IL(kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.6
                @Override // java.lang.Runnable
                public void run() {
                    kg.run();
                }
            };
            il.bg(i);
            xxp().execute(il);
            return;
        }
        com.bytedance.sdk.component.Kg.ldr.bg(kg, 5, i);
    }

    public static void bX(final com.bytedance.sdk.component.Kg.Kg kg) {
        if (kg == null || com.bytedance.sdk.openadsdk.utils.Uq.bg) {
            return;
        }
        if (VB()) {
            yDt().execute(new com.bytedance.sdk.component.Kg.bX.IL(kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.7
                @Override // java.lang.Runnable
                public void run() {
                    kg.run();
                }
            });
        } else {
            com.bytedance.sdk.component.Kg.ldr.bX(kg);
        }
    }

    public static void IL(final com.bytedance.sdk.component.Kg.Kg kg, int i) {
        if (kg == null || com.bytedance.sdk.openadsdk.utils.Uq.bg) {
            return;
        }
        if (VB()) {
            com.bytedance.sdk.component.Kg.bX.IL il = new com.bytedance.sdk.component.Kg.bX.IL(kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.8
                @Override // java.lang.Runnable
                public void run() {
                    kg.run();
                }
            };
            il.bg(i);
            yDt().execute(il);
            return;
        }
        com.bytedance.sdk.component.Kg.ldr.IL(kg, i);
    }

    public static void eqN(final com.bytedance.sdk.component.Kg.Kg kg) {
        if (kg == null || com.bytedance.sdk.openadsdk.utils.Uq.bg) {
            return;
        }
        if (VB()) {
            Ta().execute(new com.bytedance.sdk.component.Kg.bX.IL(kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.9
                @Override // java.lang.Runnable
                public void run() {
                    kg.run();
                }
            });
        } else {
            com.bytedance.sdk.component.Kg.ldr.zx(kg);
        }
    }

    public static void bX(final com.bytedance.sdk.component.Kg.Kg kg, int i) {
        if (kg == null || com.bytedance.sdk.openadsdk.utils.Uq.bg) {
            return;
        }
        if (VB()) {
            Lq().execute(new com.bytedance.sdk.component.Kg.bX.IL(kg.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.10
                @Override // java.lang.Runnable
                public void run() {
                    kg.run();
                }
            });
        } else {
            com.bytedance.sdk.component.Kg.ldr.bX(kg, i);
        }
    }

    public static void zx(final com.bytedance.sdk.component.Kg.Kg kg) {
        if (com.bytedance.sdk.openadsdk.utils.Uq.bg) {
            return;
        }
        if (VB()) {
            Ta().execute(new com.bytedance.sdk.component.Kg.bX.IL(kg.getName(), kg) { // from class: com.bytedance.sdk.openadsdk.utils.VJ.2
                @Override // java.lang.Runnable
                public void run() {
                    kg.run();
                }
            });
            return;
        }
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutorPX = PX();
        threadPoolExecutorPX.execute(kg);
        if (IL || !com.bytedance.sdk.openadsdk.core.settings.xxp.JxS()) {
            return;
        }
        IL = true;
        threadPoolExecutorPX.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.xxp.zU().RFq());
    }

    public static void bg(com.bytedance.sdk.component.Kg.bX.IL il) {
        eo().execute(il);
    }

    private static java.util.concurrent.ThreadPoolExecutor PX() {
        int iRFq;
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.utils.VJ.class) {
                if (bg == null) {
                    if (com.bytedance.sdk.openadsdk.core.settings.xxp.JxS()) {
                        iRFq = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().RFq();
                        IL = true;
                    } else {
                        iRFq = 4;
                    }
                    bg = new java.util.concurrent.ThreadPoolExecutor(iRFq, Integer.MAX_VALUE, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    java.lang.Integer.valueOf(iRFq);
                }
            }
        }
        return bg;
    }

    private static java.util.concurrent.ThreadPoolExecutor Ta() {
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar;
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar2 = bX;
        if (!bg(ldrVar2)) {
            return ldrVar2;
        }
        synchronized (com.bytedance.sdk.openadsdk.utils.VJ.class) {
            if (bg(bX)) {
                try {
                    bX = bg("ad", bX);
                } catch (java.lang.Throwable th) {
                    th.getMessage();
                }
                ldrVar = bX;
            } else {
                ldrVar = bX;
            }
            throw th;
        }
        return ldrVar;
    }

    public static com.bytedance.sdk.component.Kg.bX.ldr Kg() {
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar;
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar2 = ldr;
        if (!bg(ldrVar2)) {
            return ldrVar2;
        }
        synchronized (com.bytedance.sdk.openadsdk.utils.VJ.class) {
            if (bg(ldr)) {
                try {
                    ldr = bg("cache", ldr);
                } catch (java.lang.Throwable th) {
                    th.getMessage();
                }
                ldrVar = ldr;
            } else {
                ldrVar = ldr;
            }
            throw th;
        }
        return ldrVar;
    }

    private static com.bytedance.sdk.component.Kg.bX.ldr yDt() {
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar;
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar2 = eqN;
        if (!bg(ldrVar2)) {
            return ldrVar2;
        }
        synchronized (com.bytedance.sdk.openadsdk.utils.VJ.class) {
            if (bg(eqN)) {
                try {
                    eqN = bg("log", eqN);
                } catch (java.lang.Throwable th) {
                    th.getMessage();
                }
                ldrVar = eqN;
            } else {
                ldrVar = eqN;
            }
            throw th;
        }
        return ldrVar;
    }

    private static com.bytedance.sdk.component.Kg.bX.ldr Lq() {
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar;
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar2 = zx;
        if (!bg(ldrVar2)) {
            return ldrVar2;
        }
        synchronized (com.bytedance.sdk.openadsdk.utils.VJ.class) {
            if (bg(zx)) {
                try {
                    zx = bg("aidl", zx);
                } catch (java.lang.Throwable th) {
                    th.getMessage();
                }
                ldrVar = zx;
            } else {
                ldrVar = zx;
            }
            throw th;
        }
        return ldrVar;
    }

    private static com.bytedance.sdk.component.Kg.bX.ldr vb() {
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar;
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar2 = Kg;
        if (!bg(ldrVar2)) {
            return ldrVar2;
        }
        synchronized (com.bytedance.sdk.openadsdk.utils.VJ.class) {
            if (bg(Kg)) {
                try {
                    Kg = bg("image", Kg);
                } catch (java.lang.Throwable th) {
                    th.getMessage();
                }
                ldrVar = Kg;
            } else {
                ldrVar = Kg;
            }
            throw th;
        }
        return ldrVar;
    }

    public static com.bytedance.sdk.component.Kg.bX.ldr WR() {
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar;
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar2 = WR;
        if (!bg(ldrVar2)) {
            return ldrVar2;
        }
        synchronized (com.bytedance.sdk.openadsdk.utils.VJ.class) {
            if (bg(WR)) {
                try {
                    WR = bg("express", WR);
                } catch (java.lang.Throwable th) {
                    th.getMessage();
                }
                ldrVar = WR;
            } else {
                ldrVar = WR;
            }
            throw th;
        }
        return ldrVar;
    }

    private static com.bytedance.sdk.component.Kg.bX.ldr xxp() {
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar;
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar2 = iR;
        if (!bg(ldrVar2)) {
            return ldrVar2;
        }
        synchronized (com.bytedance.sdk.openadsdk.utils.VJ.class) {
            if (bg(iR)) {
                try {
                    iR = bg("io", iR);
                } catch (java.lang.Throwable th) {
                    th.getMessage();
                }
                ldrVar = iR;
            } else {
                ldrVar = iR;
            }
            throw th;
        }
        return ldrVar;
    }

    public static com.bytedance.sdk.component.Kg.bX.ldr eo() {
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar;
        com.bytedance.sdk.component.Kg.bX.ldr ldrVar2 = eo;
        if (!bg(ldrVar2)) {
            return ldrVar2;
        }
        synchronized (com.bytedance.sdk.openadsdk.utils.VJ.class) {
            if (bg(eo)) {
                try {
                    eo = bg("net", eo);
                } catch (java.lang.Throwable th) {
                    th.getMessage();
                }
                ldrVar = eo;
            } else {
                ldrVar = eo;
            }
            throw th;
        }
        return ldrVar;
    }

    private static boolean bg(com.bytedance.sdk.component.Kg.bX.ldr ldrVar) {
        if (ldrVar != null) {
            return !ldrVar.bX() && com.bytedance.sdk.openadsdk.core.settings.xxp.JxS();
        }
        return true;
    }

    public static boolean VB() {
        if (com.bytedance.sdk.openadsdk.core.settings.xxp.JxS()) {
            return com.bytedance.sdk.openadsdk.core.settings.xxp.zU().xFs();
        }
        return true;
    }

    private static com.bytedance.sdk.component.Kg.bX.ldr bg(java.lang.String str, com.bytedance.sdk.component.Kg.bX.ldr ldrVar) {
        com.bytedance.sdk.component.Kg.bX.ldr.bg bgVarBg = bg(str);
        if (ldrVar == null) {
            return bgVarBg.bg();
        }
        ldrVar.bg(bgVarBg);
        return ldrVar;
    }

    private static com.bytedance.sdk.component.Kg.bX.ldr.bg bg(java.lang.String str) {
        com.bytedance.sdk.component.Kg.bX.ldr.bg bgVarIL = IL(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.xxp.JxS()) {
                bgVarIL.IL(true);
                org.json.JSONObject jSONObjectGCm = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().gCm();
                org.json.JSONObject jSONObjectOptJSONObject = jSONObjectGCm != null ? jSONObjectGCm.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    bgVarIL.IL(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        bgVarIL.bg(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        bgVarIL.IL(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        bgVarIL.bX(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        bgVarIL.bg(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        bgVarIL.bg(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        bgVarIL.zx(jSONObjectOptJSONObject.optInt("reportLogThreshold"));
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        bgVarIL.eqN(jSONObjectOptJSONObject.optInt("logTaskCount"));
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
        return bgVarIL;
    }

    private static com.bytedance.sdk.component.Kg.bX.ldr.bg IL(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        com.bytedance.sdk.component.Kg.bX.ldr.bg bgVar = new com.bytedance.sdk.component.Kg.bX.ldr.bg();
        str.hashCode();
        switch (str) {
            case "express":
                return bgVar.bg(str).bg(2).IL(4).bX(0).bg(10000L).bg(true).zx(-1).eqN(10).IL(false);
            case "ad":
                return bgVar.bg(str).bg(4).IL(4).bX(0).bg(20000L).bg(true).zx(-1).eqN(10).IL(false);
            case "io":
                return bgVar.bg(str).bg(4).IL(10).bX(0).bg(20000L).bg(true).zx(-1).eqN(10).IL(false);
            case "log":
                return bgVar.bg(str).bg(4).IL(6).bX(2).bg(20000L).bg(true).zx(-1).eqN(10).IL(false);
            case "net":
                return bgVar.bg(str).bg(10).IL(10).bX(0).bg(10000L).bg(true).zx(-1).eqN(10).IL(false);
            case "aidl":
                return bgVar.bg(str).bg(2).IL(4).bX(0).bg(10000L).bg(true).zx(-1).eqN(10).IL(false);
            case "cache":
                return bgVar.bg(str).bg(0).IL(0).bX(0).bg(5000L).bg(true).zx(-1).eqN(20).IL(false);
            case "image":
                return bgVar.bg(str).bg(3).IL(3).bX(0).bg(20000L).bg(true).zx(-1).eqN(10).IL(false);
            case "monitor":
                return bgVar.bg(str).bg(2).IL(2).bX(0).bg(10000L).bg(true).zx(-1).eqN(10).IL(false);
            default:
                return bgVar.bg(str).bg(8).IL(16).bX(2).bg(20000L).bg(true).zx(-1).eqN(10).IL(false);
        }
    }
}
