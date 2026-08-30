package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
public class Ta implements com.bytedance.sdk.openadsdk.yDt.IL {
    private final boolean IL;
    private final com.bytedance.sdk.component.ldr.bg.ldr.eqN bg;

    public Ta(boolean z, com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn) {
        this.bg = eqn;
        this.IL = z;
    }

    @Override // com.bytedance.sdk.openadsdk.yDt.IL
    public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
        int i;
        if (this.bg == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("success", this.IL);
        jSONObject.put("url", this.bg.IL());
        int iEqN = this.bg.eqN();
        if (iEqN <= 0) {
            iEqN = 0;
        }
        jSONObject.put("retry_times", iEqN);
        jSONObject.put("ad_id", this.bg.ldr());
        jSONObject.put("track_type", this.bg.zx());
        if (!this.IL) {
            i = 4;
        } else if (this.bg.eo()) {
            i = 3;
        } else {
            i = this.bg.eqN() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        java.lang.String strIR = this.bg.iR();
        if (!android.text.TextUtils.isEmpty(strIR)) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.String str : strIR.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        java.lang.String strWR = this.bg.WR();
        if (!android.text.TextUtils.isEmpty(strWR)) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (java.lang.String str2 : strWR.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("track_link_result").IL(jSONObject.toString());
    }
}
