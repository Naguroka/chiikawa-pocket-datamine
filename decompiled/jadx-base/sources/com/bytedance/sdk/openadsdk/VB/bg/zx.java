package com.bytedance.sdk.openadsdk.VB.bg;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.component.bg.zx<org.json.JSONObject, org.json.JSONObject> {
    private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.aGH> bg;

    public static void bg(com.bytedance.sdk.component.bg.VzQ vzQ, com.bytedance.sdk.openadsdk.core.aGH agh) {
        vzQ.bg("interactiveFinish", new com.bytedance.sdk.openadsdk.VB.bg.zx(agh));
    }

    @Override // com.bytedance.sdk.component.bg.zx
    public org.json.JSONObject bg(org.json.JSONObject jSONObject, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.aGH> weakReference = this.bg;
        if (weakReference != null && weakReference.get() != null) {
            com.bytedance.sdk.openadsdk.core.aGH agh = this.bg.get();
            com.bytedance.sdk.openadsdk.core.model.tuV tuvBX = agh.bX();
            try {
                boolean z = true;
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iOvC = tuvBX != null ? tuvBX.ovC() : 0;
                if (iOptInt >= 0 && iOvC >= 0) {
                    iOptInt = java.lang.Math.min(iOptInt, iOvC);
                } else if (iOptInt < 0) {
                    iOptInt = iOvC >= 0 ? iOvC : 0;
                }
                if (z) {
                    agh.bX(iOptInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", iOptInt);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("InteractiveFinishMethod", e.getMessage());
            }
        }
        return jSONObject2;
    }

    public zx(com.bytedance.sdk.openadsdk.core.aGH agh) {
        this.bg = new java.lang.ref.WeakReference<>(agh);
    }
}
