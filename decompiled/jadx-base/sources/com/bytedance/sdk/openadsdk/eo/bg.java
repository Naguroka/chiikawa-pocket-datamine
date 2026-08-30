package com.bytedance.sdk.openadsdk.eo;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.sdk.openadsdk.eo.bX {
    private final com.bytedance.sdk.openadsdk.eo.IL IL;
    private final java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr> bX = new java.util.HashMap();
    private final com.bytedance.sdk.openadsdk.core.model.tuV bg;

    private bg(com.bytedance.sdk.openadsdk.eo.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.IL = il;
        this.bg = tuv;
    }

    public static com.bytedance.sdk.openadsdk.eo.bg bg(com.bytedance.sdk.openadsdk.eo.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return new com.bytedance.sdk.openadsdk.eo.bg(il, tuv);
    }

    @Override // com.bytedance.sdk.openadsdk.eo.bX
    public void bg() {
        this.bX.clear();
    }

    private com.bytedance.sdk.openadsdk.core.model.tuV bg(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.String strBg;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuvBX = com.bytedance.sdk.openadsdk.core.model.tuV.bX();
        tuvBX.eqN(jSONObject);
        if (!android.text.TextUtils.isEmpty(str)) {
            tuvBX.Fy(str);
        }
        if (this.bg == null) {
            return tuvBX;
        }
        java.lang.String strBg2 = tuvBX.RiO() != null ? tuvBX.RiO().bg() : null;
        if (android.text.TextUtils.isEmpty(strBg2)) {
            return this.bg;
        }
        com.bytedance.sdk.openadsdk.core.model.bX bXVarRiO = this.bg.RiO();
        if (bXVarRiO != null && strBg2.equals(bXVarRiO.bg())) {
            return this.bg;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (bXVarRiO != null) {
            try {
                strBg = bXVarRiO.bg();
            } catch (org.json.JSONException unused) {
            }
        } else {
            strBg = "null";
        }
        jSONObject2.put("lu", strBg);
        jSONObject2.put("ju", strBg2);
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv), -5, jSONObject2);
        if (bXVarRiO != null && strBg2.contains("play.google.com/store") && !strBg2.contains(com.adjust.sdk.Constants.REFERRER)) {
            tuvBX.RiO().bg(bXVarRiO.bg());
        }
        return tuvBX;
    }

    @Override // com.bytedance.sdk.openadsdk.eo.bX
    public void bg(android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, int i, boolean z) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        bg(context, bg(jSONObjectOptJSONObject, str), jSONObjectOptJSONObject, i, z);
    }

    private void bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, org.json.JSONObject jSONObject, int i, boolean z) {
        if (context == null || tuv == null || tuv.RiO() == null || jSONObject == null || this.IL == null || this.bX.get(tuv.RiO().bg()) != null) {
            return;
        }
        java.lang.String strIL = com.bytedance.sdk.openadsdk.utils.ayS.IL(i);
        if (android.text.TextUtils.isEmpty(strIL)) {
            return;
        }
        this.bX.put(tuv.RiO().bg(), bg(context, tuv, jSONObject, strIL, z));
    }

    @Override // com.bytedance.sdk.openadsdk.eo.bX
    public void bg(android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        if (context == null || (tuv = this.bg) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(context, tuv, str).eqN();
    }

    @Override // com.bytedance.sdk.openadsdk.eo.bX
    public void bg(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        bg(bg(jSONObjectOptJSONObject, (java.lang.String) null), jSONObjectOptJSONObject);
    }

    private void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, org.json.JSONObject jSONObject) {
        if (this.IL == null || tuv == null || tuv.RiO() == null) {
            return;
        }
        java.lang.String strBg = tuv.RiO().bg();
        if (this.bX.containsKey(strBg)) {
            this.bX.remove(strBg);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.IL.bg("app_ad_event", jSONObject2);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("JsAppAdDownloadManager", e.getMessage());
            }
        }
    }

    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, org.json.JSONObject jSONObject, java.lang.String str, boolean z) {
        com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr ldrVarBg = com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(context, tuv, str);
        ldrVarBg.bg(true);
        return ldrVarBg;
    }
}
