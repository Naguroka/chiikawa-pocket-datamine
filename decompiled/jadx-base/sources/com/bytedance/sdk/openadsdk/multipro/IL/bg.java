package com.bytedance.sdk.openadsdk.multipro.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public boolean IL;
    public boolean bX;
    public boolean bg;
    public boolean eqN;
    public long iR;
    public long ldr;
    public long zx;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.multipro.IL.bg$bg, reason: collision with other inner class name */
    public interface InterfaceC0162bg {
        com.bytedance.sdk.openadsdk.multipro.IL.bg ldr();
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg bg(boolean z) {
        this.eqN = z;
        return this;
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg IL(boolean z) {
        this.bg = z;
        return this;
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg bX(boolean z) {
        this.IL = z;
        return this;
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg eqN(boolean z) {
        this.bX = z;
        return this;
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg bg(long j) {
        this.zx = j;
        return this;
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg IL(long j) {
        this.ldr = j;
        return this;
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg bX(long j) {
        this.iR = j;
        return this;
    }

    public org.json.JSONObject bg() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("isCompleted", this.bg);
            jSONObject.put("isFromVideoDetailPage", this.IL);
            jSONObject.put("isFromDetailPage", this.bX);
            jSONObject.put("duration", this.zx);
            jSONObject.put("totalPlayDuration", this.ldr);
            jSONObject.put("currentPlayPosition", this.iR);
            jSONObject.put("isAutoPlay", this.eqN);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public static com.bytedance.sdk.openadsdk.multipro.IL.bg bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.IL.bg bgVar = new com.bytedance.sdk.openadsdk.multipro.IL.bg();
        bgVar.IL(jSONObject.optBoolean("isCompleted"));
        bgVar.bX(jSONObject.optBoolean("isFromVideoDetailPage"));
        bgVar.eqN(jSONObject.optBoolean("isFromDetailPage"));
        bgVar.bg(jSONObject.optLong("duration"));
        bgVar.IL(jSONObject.optLong("totalPlayDuration"));
        bgVar.bX(jSONObject.optLong("currentPlayPosition"));
        bgVar.bg(jSONObject.optBoolean("isAutoPlay"));
        return bgVar;
    }
}
