package com.bytedance.sdk.openadsdk.rri.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private final int IL;
    private final float bX;
    private final int bg;

    public bg(int i, int i2, float f) {
        this.bg = i;
        this.IL = i2;
        this.bX = f;
    }

    public static org.json.JSONObject bg(com.bytedance.sdk.openadsdk.rri.bg.bg bgVar) throws java.lang.Throwable {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("width", bgVar.bg);
        jSONObject.put("height", bgVar.IL);
        jSONObject.put("alpha", bgVar.bX);
        return jSONObject;
    }
}
