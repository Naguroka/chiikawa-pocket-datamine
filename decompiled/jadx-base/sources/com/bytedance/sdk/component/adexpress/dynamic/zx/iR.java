package com.bytedance.sdk.component.adexpress.dynamic.zx;

/* JADX INFO: loaded from: classes3.dex */
public class iR implements com.bytedance.sdk.component.adexpress.dynamic.zx.Kg {
    private com.bytedance.sdk.component.adexpress.dynamic.ldr.IL bg;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zx.Kg
    public void bg(com.bytedance.sdk.component.adexpress.dynamic.ldr.IL il) {
        this.bg = il;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zx.Kg
    public void bg(final com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        if (ta.PX() == 1) {
            IL(ta);
        } else {
            com.bytedance.sdk.component.adexpress.eqN.eqN.bg(new com.bytedance.sdk.component.Kg.Kg("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.zx.iR.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.adexpress.dynamic.zx.iR.this.IL(ta);
                }
            }, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        try {
            org.json.JSONObject jSONObjectBX = ta.bX();
            org.json.JSONObject jSONObject = new org.json.JSONObject(jSONObjectBX.optString("template_Plugin"));
            org.json.JSONObject jSONObjectOptJSONObject = jSONObjectBX.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kgBg = new com.bytedance.sdk.component.adexpress.dynamic.zx.ldr(jSONObject, jSONObjectOptJSONObject, jSONObjectBX.optJSONObject("AdSize"), new org.json.JSONObject(jSONObjectBX.optString("diff_template_Plugin"))).bg(ta.IL(), ta.eo(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), ta);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                kgBg.bg(jSONObject2.optString("color"));
                kgBg.bg(jSONObject2.optJSONArray("material_center"));
            } catch (java.lang.Throwable unused) {
            }
            this.bg.bg(kgBg);
        } catch (java.lang.Exception unused2) {
        }
    }
}
