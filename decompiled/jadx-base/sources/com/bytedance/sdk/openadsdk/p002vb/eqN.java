package com.bytedance.sdk.openadsdk.p002vb;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    private static java.lang.Boolean IL;
    private static volatile android.os.HandlerThread bX;
    private static volatile com.bytedance.sdk.openadsdk.p002vb.IL bg;
    private static volatile android.os.Handler eqN;

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("pag__bus_monitor", 0);
        bX = handlerThread;
        handlerThread.start();
    }

    public static com.bytedance.sdk.openadsdk.p002vb.IL bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.p002vb.eqN.class) {
                if (bg == null) {
                    bg = com.bytedance.sdk.openadsdk.p002vb.IL.bg(new com.bytedance.sdk.openadsdk.p002vb.bX() { // from class: com.bytedance.sdk.openadsdk.vb.eqN.1
                        @Override // com.bytedance.sdk.openadsdk.p002vb.bX
                        public android.content.Context getContext() {
                            return com.bytedance.sdk.openadsdk.core.VzQ.bg();
                        }

                        @Override // com.bytedance.sdk.openadsdk.p002vb.bX
                        public android.os.Handler getHandler() {
                            return com.bytedance.sdk.openadsdk.p002vb.eqN.zx();
                        }

                        @Override // com.bytedance.sdk.openadsdk.p002vb.bX
                        public int getUploadIntervalTime() {
                            int iBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("bus_monitor_config", "interval", 43200000);
                            if (iBg < 3600000) {
                                return 86400000;
                            }
                            return iBg;
                        }

                        @Override // com.bytedance.sdk.openadsdk.p002vb.bX
                        public boolean isMonitorOpen() {
                            if (com.bytedance.sdk.openadsdk.p002vb.eqN.IL != null) {
                                return com.bytedance.sdk.openadsdk.p002vb.eqN.IL.booleanValue();
                            }
                            java.lang.Boolean unused = com.bytedance.sdk.openadsdk.p002vb.eqN.IL = java.lang.Boolean.valueOf(com.bytedance.sdk.openadsdk.Fy.bg.bg("bus_monitor_config", com.json.mediationsdk.metadata.a.j, 0) == 1);
                            return com.bytedance.sdk.openadsdk.p002vb.eqN.IL.booleanValue();
                        }

                        @Override // com.bytedance.sdk.openadsdk.p002vb.bX
                        public void onMonitorUpload(java.util.List<com.bytedance.sdk.openadsdk.p002vb.IL.bg> list) {
                            if (list == null || list.isEmpty()) {
                                return;
                            }
                            for (final com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar : list) {
                                com.bytedance.sdk.openadsdk.yDt.bX.bg();
                                com.bytedance.sdk.openadsdk.yDt.bX.bg("bus_monitor", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.vb.eqN.1.1
                                    @Override // com.bytedance.sdk.openadsdk.yDt.IL
                                    public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                                        try {
                                            jSONObject.put("sdk_version", bgVar.IL());
                                            jSONObject.put("scene", bgVar.bX());
                                            jSONObject.put("start_count", bgVar.eqN());
                                            jSONObject.put("success_count", bgVar.zx());
                                            jSONObject.put("fail_count", bgVar.ldr());
                                            jSONObject.put("rit", bgVar.iR());
                                            jSONObject.put("tag", bgVar.Kg());
                                            jSONObject.put("label", bgVar.WR());
                                            jSONObject.put("mediation", bgVar.VB());
                                            jSONObject.put("is_init", bgVar.PX());
                                            jSONObject.put("extra", bgVar.Ta());
                                            java.lang.Object[] objArr = new java.lang.Object[2];
                                            return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("bus_monitor").IL(jSONObject.toString());
                                        } catch (java.lang.Exception e) {
                                            com.bytedance.sdk.component.utils.PX.bg("BusMonitorUtils", "onMonitorUpload: ", e);
                                            return null;
                                        }
                                    }
                                });
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.p002vb.bX
                        public int getOnceLogCount() {
                            int iBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("bus_monitor_config", "once_count", 10);
                            if (iBg > 100 || iBg < 5) {
                                return 10;
                            }
                            return iBg;
                        }

                        @Override // com.bytedance.sdk.openadsdk.p002vb.bX
                        public int getOnceLogInterval() {
                            int iBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("bus_monitor_config", "once_interval", 10000);
                            if (iBg < 10000) {
                                return 10000;
                            }
                            return iBg;
                        }
                    });
                }
            }
        }
        return bg;
    }

    public static void bg(com.bytedance.sdk.openadsdk.p002vb.zx zxVar) {
        bg().bg(new com.bytedance.sdk.openadsdk.p002vb.ldr(zxVar, 1, 0, 0));
    }

    public static void IL(com.bytedance.sdk.openadsdk.p002vb.zx zxVar) {
        bg().bg(new com.bytedance.sdk.openadsdk.p002vb.ldr(zxVar, 0, 1, 0));
    }

    public static void bX(com.bytedance.sdk.openadsdk.p002vb.zx zxVar) {
        bg().bg(new com.bytedance.sdk.openadsdk.p002vb.ldr(zxVar, 0, 0, 1));
    }

    public static void IL() {
        bg().bg(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.os.Handler zx() {
        if (bX == null || !bX.isAlive()) {
            synchronized (com.bytedance.sdk.openadsdk.core.yDt.class) {
                if (bX == null || !bX.isAlive()) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("csj_init_handle", -1);
                    bX = handlerThread;
                    handlerThread.start();
                    eqN = new android.os.Handler(bX.getLooper());
                }
            }
        } else if (eqN == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.yDt.class) {
                if (eqN == null) {
                    eqN = new android.os.Handler(bX.getLooper());
                }
            }
        }
        return eqN;
    }
}
