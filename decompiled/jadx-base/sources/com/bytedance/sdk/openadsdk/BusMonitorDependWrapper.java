package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public class BusMonitorDependWrapper implements com.bytedance.sdk.openadsdk.p002vb.bX {
    private android.os.Handler IL;
    private com.bytedance.sdk.openadsdk.p002vb.bX bg;

    public BusMonitorDependWrapper(com.bytedance.sdk.openadsdk.p002vb.bX bXVar) {
        this.bg = bXVar;
    }

    @Override // com.bytedance.sdk.openadsdk.p002vb.bX
    public android.content.Context getContext() {
        com.bytedance.sdk.openadsdk.p002vb.bX bXVar = this.bg;
        if (bXVar != null && bXVar.getContext() != null) {
            return this.bg.getContext();
        }
        return getReflectContext();
    }

    @Override // com.bytedance.sdk.openadsdk.p002vb.bX
    public android.os.Handler getHandler() {
        com.bytedance.sdk.openadsdk.p002vb.bX bXVar = this.bg;
        if (bXVar != null && bXVar.getHandler() != null) {
            return this.bg.getHandler();
        }
        if (this.IL == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("pag_monitor");
            handlerThread.start();
            this.IL = new android.os.Handler(handlerThread.getLooper());
        }
        return this.IL;
    }

    @Override // com.bytedance.sdk.openadsdk.p002vb.bX
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        com.bytedance.sdk.openadsdk.p002vb.bX bXVar = this.bg;
        return (bXVar == null || (uploadIntervalTime = bXVar.getUploadIntervalTime()) < 1800000) ? com.adjust.sdk.Constants.THIRTY_MINUTES : uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.p002vb.bX
    public boolean isMonitorOpen() {
        com.bytedance.sdk.openadsdk.p002vb.bX bXVar = this.bg;
        if (bXVar != null) {
            return bXVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.p002vb.bX
    public void onMonitorUpload(java.util.List<com.bytedance.sdk.openadsdk.p002vb.IL.bg> list) {
        com.bytedance.sdk.openadsdk.p002vb.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.onMonitorUpload(list);
        }
    }

    public static android.content.Context getReflectContext() {
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
            method.setAccessible(true);
            java.lang.Object objInvoke = method.invoke(null, new java.lang.Object[0]);
            return (android.app.Application) objInvoke.getClass().getMethod("getApplication", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p002vb.bX
    public int getOnceLogCount() {
        com.bytedance.sdk.openadsdk.p002vb.bX bXVar = this.bg;
        if (bXVar != null) {
            return bXVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.p002vb.bX
    public int getOnceLogInterval() {
        com.bytedance.sdk.openadsdk.p002vb.bX bXVar = this.bg;
        if (bXVar != null) {
            return bXVar.getOnceLogInterval();
        }
        return 1000;
    }
}
