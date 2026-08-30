package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public int eqN;
    public java.util.concurrent.atomic.AtomicInteger bg = new java.util.concurrent.atomic.AtomicInteger(0);
    public java.util.concurrent.atomic.AtomicInteger IL = new java.util.concurrent.atomic.AtomicInteger(0);
    public java.util.concurrent.atomic.AtomicLong bX = new java.util.concurrent.atomic.AtomicLong(0);
    public java.util.concurrent.atomic.AtomicInteger zx = new java.util.concurrent.atomic.AtomicInteger(0);
    public java.util.Map<java.lang.Integer, java.lang.Integer> ldr = new java.util.HashMap();
    public java.util.concurrent.atomic.AtomicBoolean iR = new java.util.concurrent.atomic.AtomicBoolean(false);

    public IL(int i) {
        this.eqN = i;
    }

    org.json.JSONObject bg() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("success", this.bg.get());
            jSONObject.put(com.ironsource.y8.f.e, this.IL.get());
            jSONObject.put("type", this.eqN);
            jSONObject.put("duration", this.bX.get() / ((long) this.bg.get()));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (this.ldr.size() > 0) {
                for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : this.ldr.entrySet()) {
                    jSONObject2.put(java.lang.String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            jSONObject.put("fail_error_code", jSONObject2);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    org.json.JSONObject IL() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("success", this.bg.get());
            jSONObject.put(com.ironsource.y8.f.e, this.IL.get());
            jSONObject.put("type", this.eqN);
            jSONObject.put("time", this.zx.get());
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
