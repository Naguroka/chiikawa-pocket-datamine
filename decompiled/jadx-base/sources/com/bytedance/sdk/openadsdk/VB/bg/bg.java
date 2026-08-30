package com.bytedance.sdk.openadsdk.VB.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.component.bg.eqN<org.json.JSONObject, org.json.JSONObject> {
    private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.aGH> bg;

    public static void bg(com.bytedance.sdk.component.bg.VzQ vzQ, final com.bytedance.sdk.openadsdk.core.aGH agh) {
        vzQ.bg("getNetworkData", new com.bytedance.sdk.component.bg.eqN.IL() { // from class: com.bytedance.sdk.openadsdk.VB.bg.bg.1
            @Override // com.bytedance.sdk.component.bg.eqN.IL
            public com.bytedance.sdk.component.bg.eqN bg() {
                return new com.bytedance.sdk.openadsdk.VB.bg.bg(agh);
            }
        });
    }

    public bg(com.bytedance.sdk.openadsdk.core.aGH agh) {
        this.bg = new java.lang.ref.WeakReference<>(agh);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.bg.eqN
    public void bg(org.json.JSONObject jSONObject, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        com.bytedance.sdk.openadsdk.core.aGH agh = this.bg.get();
        if (agh == null) {
            bX();
        } else {
            agh.bg(jSONObject, new com.bytedance.sdk.openadsdk.PX.bX() { // from class: com.bytedance.sdk.openadsdk.VB.bg.bg.2
                @Override // com.bytedance.sdk.openadsdk.PX.bX
                public void bg(boolean z, java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list) {
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        if (!z) {
                            com.bytedance.sdk.openadsdk.VB.bg.bg.this.bg(jSONObject2);
                        } else {
                            jSONObject2.put("creatives", com.bytedance.sdk.openadsdk.core.aGH.IL(list));
                            com.bytedance.sdk.openadsdk.VB.bg.bg.this.bg(jSONObject2);
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
            });
        }
    }
}
