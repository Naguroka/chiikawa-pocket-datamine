package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class tC {
    private java.lang.String IL;
    private int bX;
    private java.lang.String bg;
    private int eqN;

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public void IL(java.lang.String str) {
        this.IL = str;
    }

    public void bg(int i) {
        this.bX = i;
    }

    public void IL(int i) {
        this.eqN = i;
    }

    public boolean bg() {
        return this.eqN == 1;
    }

    public static com.bytedance.sdk.openadsdk.core.model.tC bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.tC tCVar = new com.bytedance.sdk.openadsdk.core.model.tC();
        try {
            tCVar.bg(jSONObject.optString("market_dpl", ""));
            tCVar.IL(jSONObject.optString("market_dpl_auto", ""));
            tCVar.bg(jSONObject.optInt("exec_type", 0));
            tCVar.IL(jSONObject.optInt("oem_vendor_type", 0));
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("OemModel", th.getMessage());
        }
        return tCVar;
    }

    public java.lang.String IL() {
        if (this.bX == 2) {
            return this.IL;
        }
        return this.bg;
    }

    public org.json.JSONObject bX() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!android.text.TextUtils.isEmpty(this.bg)) {
                jSONObject.put("market_dpl", this.bg);
            }
            if (!android.text.TextUtils.isEmpty(this.IL)) {
                jSONObject.put("market_dpl_auto", this.IL);
            }
            jSONObject.put("exec_type", this.bX);
            jSONObject.put("oem_vendor_type", this.eqN);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("OemModel", th.getMessage());
            return null;
        }
    }
}
