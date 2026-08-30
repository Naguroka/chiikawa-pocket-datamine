package com.bytedance.sdk.openadsdk.VB.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.component.bg.eqN<org.json.JSONObject, org.json.JSONObject> {
    private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.aGH> bg;

    public static void bg(com.bytedance.sdk.component.bg.VzQ vzQ, final com.bytedance.sdk.openadsdk.core.aGH agh) {
        vzQ.bg("interstitial_webview_close", new com.bytedance.sdk.component.bg.eqN.IL() { // from class: com.bytedance.sdk.openadsdk.VB.bg.IL.1
            @Override // com.bytedance.sdk.component.bg.eqN.IL
            public com.bytedance.sdk.component.bg.eqN bg() {
                return new com.bytedance.sdk.openadsdk.VB.bg.IL(agh);
            }
        });
    }

    public IL(com.bytedance.sdk.openadsdk.core.aGH agh) {
        this.bg = new java.lang.ref.WeakReference<>(agh);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.bg.eqN
    public void bg(org.json.JSONObject jSONObject, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception {
        com.bytedance.sdk.openadsdk.core.WR.IL().xxp();
        com.bytedance.sdk.openadsdk.core.aGH agh = this.bg.get();
        if (agh == null) {
            com.bytedance.sdk.component.utils.PX.bg("DoInterstitialWebViewCloseMethod", "invoke error");
            bX();
        } else {
            agh.iR();
        }
    }
}
