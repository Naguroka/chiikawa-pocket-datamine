package com.bytedance.sdk.openadsdk.WR;

/* JADX INFO: loaded from: classes4.dex */
public class IL<T> implements com.bytedance.sdk.component.zx.xxp<T> {
    private final java.lang.String IL;
    private final com.bytedance.sdk.component.zx.xxp<T> bX;
    private final long bg = android.os.SystemClock.elapsedRealtime();
    private final com.bytedance.sdk.openadsdk.core.model.tuV eqN;

    public IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, com.bytedance.sdk.component.zx.xxp<T> xxpVar) {
        this.bX = xxpVar;
        this.eqN = tuv;
        this.IL = str;
    }

    @Override // com.bytedance.sdk.component.zx.xxp
    public void bg(com.bytedance.sdk.component.zx.VB<T> vb) {
        com.bytedance.sdk.component.zx.xxp<T> xxpVar = this.bX;
        if (xxpVar != null) {
            xxpVar.bg(vb);
        }
        if (this.eqN != null) {
            final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.bg;
            final int iIR = vb.iR() / 1024;
            final int i = vb.ldr() ? 1 : 0;
            com.bytedance.sdk.openadsdk.yDt.bX.bg("load_image_success", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.WR.IL.1
                @Override // com.bytedance.sdk.openadsdk.yDt.IL
                public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("duration", jElapsedRealtime);
                    jSONObject.put("url", com.bytedance.sdk.openadsdk.WR.IL.this.IL);
                    jSONObject.put("preload_size", iIR);
                    jSONObject.put("local_cache", i);
                    jSONObject.put("image_mode", com.bytedance.sdk.openadsdk.WR.IL.this.eqN.bOf());
                    return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("load_image_success").bg(com.bytedance.sdk.openadsdk.WR.IL.this.eqN.JMw()).IL(jSONObject.toString());
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.zx.xxp
    public void bg(final int i, final java.lang.String str, java.lang.Throwable th) {
        com.bytedance.sdk.component.zx.xxp<T> xxpVar = this.bX;
        if (xxpVar != null) {
            xxpVar.bg(i, str, th);
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.eqN;
        if (tuv == null || android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv))) {
            return;
        }
        final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.bg;
        com.bytedance.sdk.openadsdk.yDt.bX.bg("load_image_error", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.WR.IL.2
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("duration", jElapsedRealtime);
                jSONObject.put("url", com.bytedance.sdk.openadsdk.WR.IL.this.IL);
                jSONObject.put("error_code", i);
                jSONObject.put("error_message", str);
                jSONObject.put("image_mode", com.bytedance.sdk.openadsdk.WR.IL.this.eqN.bOf());
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("load_image_error").bg(com.bytedance.sdk.openadsdk.WR.IL.this.eqN.JMw()).IL(jSONObject.toString());
            }
        });
    }
}
