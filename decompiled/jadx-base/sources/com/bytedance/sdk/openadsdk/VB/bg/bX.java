package com.bytedance.sdk.openadsdk.VB.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.component.bg.eqN<org.json.JSONObject, org.json.JSONObject> {
    private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.aGH> bg;

    public static void bg(com.bytedance.sdk.component.bg.VzQ vzQ, final com.bytedance.sdk.openadsdk.core.aGH agh) {
        vzQ.bg("newClickEvent", new com.bytedance.sdk.component.bg.eqN.IL() { // from class: com.bytedance.sdk.openadsdk.VB.bg.bX.1
            @Override // com.bytedance.sdk.component.bg.eqN.IL
            public com.bytedance.sdk.component.bg.eqN bg() {
                return new com.bytedance.sdk.openadsdk.VB.bg.bX(agh);
            }
        });
    }

    public bX(com.bytedance.sdk.openadsdk.core.aGH agh) {
        this.bg = new java.lang.ref.WeakReference<>(agh);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.bg.eqN
    public void bg(org.json.JSONObject jSONObject, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        com.bytedance.sdk.openadsdk.core.aGH agh = this.bg.get();
        if (agh == null) {
            bX();
        } else {
            agh.eqN(jSONObject);
        }
    }
}
