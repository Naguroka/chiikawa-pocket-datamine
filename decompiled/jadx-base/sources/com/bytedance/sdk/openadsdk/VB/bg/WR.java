package com.bytedance.sdk.openadsdk.VB.bg;

/* JADX INFO: loaded from: classes4.dex */
public class WR extends com.bytedance.sdk.component.bg.zx<org.json.JSONObject, org.json.JSONObject> {
    private java.lang.ref.WeakReference<com.bytedance.sdk.component.WR.eqN> bg;

    public static void bg(com.bytedance.sdk.component.bg.VzQ vzQ, com.bytedance.sdk.component.WR.eqN eqn) {
        vzQ.bg("preventTouchEvent", new com.bytedance.sdk.openadsdk.VB.bg.WR(eqn));
    }

    public WR(com.bytedance.sdk.component.WR.eqN eqn) {
        this.bg = new java.lang.ref.WeakReference<>(eqn);
    }

    @Override // com.bytedance.sdk.component.bg.zx
    public org.json.JSONObject bg(org.json.JSONObject jSONObject, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.WR.eqN eqn = this.bg.get();
            if (eqn != null) {
                eqn.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("success", false);
            }
        } catch (java.lang.Throwable unused) {
            jSONObject2.put("success", false);
        }
        return jSONObject2;
    }
}
