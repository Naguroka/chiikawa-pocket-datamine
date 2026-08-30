package com.bytedance.sdk.component.Kg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    public int IL;
    public int bX;
    public int bg;
    public int eqN;

    public bg(int i, int i2, int i3, int i4) {
        this.bg = i;
        this.IL = i2;
        this.bX = i3;
        this.eqN = i4;
    }

    public org.json.JSONObject bg() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.bg);
            jSONObject.put("sdk_max_thread_num", this.IL);
            jSONObject.put("app_thread_num", this.bX);
            jSONObject.put("app_max_thread_num", this.eqN);
        } catch (java.lang.Throwable unused) {
        }
        return jSONObject;
    }
}
