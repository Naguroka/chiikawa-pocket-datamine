package com.bytedance.sdk.openadsdk.LZ;

/* JADX INFO: loaded from: classes4.dex */
public class zx implements com.bytedance.sdk.openadsdk.LZ.eqN {
    private com.bytedance.sdk.openadsdk.LZ.eqN IL;
    android.os.Handler bg = null;

    zx(com.bytedance.sdk.openadsdk.LZ.eqN eqn) {
        this.IL = eqn;
    }

    @Override // com.bytedance.sdk.openadsdk.LZ.eqN
    public java.util.concurrent.ExecutorService bg() {
        com.bytedance.sdk.openadsdk.LZ.eqN eqn = this.IL;
        if (eqn == null || eqn.bg() == null) {
            return java.util.concurrent.Executors.newCachedThreadPool();
        }
        return this.IL.bg();
    }

    @Override // com.bytedance.sdk.openadsdk.LZ.eqN
    public android.content.Context IL() {
        com.bytedance.sdk.openadsdk.LZ.eqN eqn = this.IL;
        if (eqn == null || eqn.IL() == null) {
            return Kg();
        }
        return this.IL.IL();
    }

    @Override // com.bytedance.sdk.openadsdk.LZ.eqN
    public java.lang.String bX() {
        com.bytedance.sdk.openadsdk.LZ.eqN eqn = this.IL;
        return (eqn == null || android.text.TextUtils.isEmpty(eqn.bX())) ? "null" : this.IL.bX();
    }

    @Override // com.bytedance.sdk.openadsdk.LZ.eqN
    public android.os.Handler eqN() {
        com.bytedance.sdk.openadsdk.LZ.eqN eqn = this.IL;
        if (eqn == null || eqn.iR() == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("pag_strategy", -1);
            handlerThread.start();
            android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
            this.bg = handler;
            return handler;
        }
        return this.IL.eqN();
    }

    @Override // com.bytedance.sdk.openadsdk.LZ.eqN
    public java.lang.String zx() {
        com.bytedance.sdk.openadsdk.LZ.eqN eqn = this.IL;
        if (eqn != null) {
            return eqn.zx();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.LZ.eqN
    public org.json.JSONObject ldr() {
        com.bytedance.sdk.openadsdk.LZ.eqN eqn = this.IL;
        if (eqn != null) {
            return eqn.ldr();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.LZ.eqN
    public java.util.Map<java.lang.String, java.lang.String> iR() {
        com.bytedance.sdk.openadsdk.LZ.eqN eqn = this.IL;
        if (eqn == null || eqn.iR() == null) {
            return new java.util.HashMap();
        }
        return this.IL.iR();
    }

    @Override // com.bytedance.sdk.openadsdk.LZ.eqN
    public org.json.JSONObject bg(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.LZ.eqN eqn = this.IL;
        return eqn != null ? eqn.bg(jSONObject) : jSONObject;
    }

    private android.content.Context Kg() {
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
            method.setAccessible(true);
            java.lang.Object objInvoke = method.invoke(null, new java.lang.Object[0]);
            return (android.app.Application) objInvoke.getClass().getMethod("getApplication", new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
