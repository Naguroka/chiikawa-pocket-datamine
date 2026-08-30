package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg<T extends com.bytedance.sdk.openadsdk.eqN.zx.IL.bX> {
    private java.lang.String IL;
    private org.json.JSONObject bX;
    private com.bytedance.sdk.openadsdk.core.model.tuV bg;
    private T eqN;
    private boolean zx = false;

    public bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, org.json.JSONObject jSONObject, T t) {
        this.bg = tuv;
        this.IL = str;
        this.bX = jSONObject;
        this.eqN = t;
    }

    public com.bytedance.sdk.openadsdk.core.model.tuV bg() {
        return this.bg;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    public org.json.JSONObject bX() {
        if (this.bX == null) {
            this.bX = new org.json.JSONObject();
        }
        return this.bX;
    }

    public T eqN() {
        return this.eqN;
    }

    public boolean zx() {
        return this.zx;
    }

    public void bg(boolean z) {
        this.zx = z;
    }
}
