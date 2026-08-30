package com.bytedance.sdk.openadsdk.component;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.component.bX {
    private com.bytedance.sdk.openadsdk.component.WR.iR Lq;
    private final com.bytedance.sdk.openadsdk.component.ldr.IL PX;
    private com.bytedance.sdk.openadsdk.component.WR.IL Ta;
    private boolean yDt;

    public IL(android.app.Activity activity, com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.widget.FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.bg bgVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.Kg.bg bgVar2, com.bytedance.sdk.openadsdk.component.ldr.IL il) {
        super(activity, tuv, frameLayout, bgVar, i, z, bgVar2);
        this.PX = il;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bX
    public void bg(android.view.ViewGroup viewGroup) {
        android.util.Pair<java.lang.Float, java.lang.Float> pairBg = com.bytedance.sdk.openadsdk.core.Kg.bg.bg.bg(this.bg.getWindow(), this.iR);
        com.bytedance.sdk.openadsdk.component.WR.IL il = new com.bytedance.sdk.openadsdk.component.WR.IL(this.bg, this.IL, new com.bytedance.sdk.openadsdk.AdSlot.Builder().setCodeId(java.lang.String.valueOf(this.IL.IGR())).setExpressViewAcceptedSize(((java.lang.Float) pairBg.first).floatValue(), ((java.lang.Float) pairBg.second).floatValue()).build(), "open_ad", this.zx, this.PX, this.VB);
        this.Ta = il;
        il.setTopListener(this.zx);
        this.Ta.setExpressVideoListenerProxy(this.zx);
        this.Ta.setExpressInteractionListener(new com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.IL.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(android.view.View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(android.view.View view, java.lang.String str, int i) {
                com.bytedance.sdk.openadsdk.component.IL.this.zx.eqN();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(android.view.View view, float f, float f2) {
                if (com.bytedance.sdk.openadsdk.component.IL.this.Ta.Ta()) {
                    com.bytedance.sdk.openadsdk.component.IL.this.yDt = true;
                    if (com.bytedance.sdk.openadsdk.component.IL.this.Lq != null && com.bytedance.sdk.openadsdk.component.IL.this.eqN == com.bytedance.sdk.openadsdk.component.IL.this.Lq.getParent()) {
                        com.bytedance.sdk.openadsdk.component.IL.this.eqN.removeView(com.bytedance.sdk.openadsdk.component.IL.this.Lq);
                    }
                    com.bytedance.sdk.openadsdk.component.IL il2 = com.bytedance.sdk.openadsdk.component.IL.this;
                    com.bytedance.sdk.openadsdk.component.IL.super.bg((android.view.ViewGroup) il2.eqN);
                    com.bytedance.sdk.openadsdk.component.IL.super.bg();
                    com.bytedance.sdk.openadsdk.component.IL.super.IL();
                    return;
                }
                if (com.bytedance.sdk.openadsdk.component.IL.this.IL.NC()) {
                    com.bytedance.sdk.openadsdk.component.IL.this.zx.bX();
                    return;
                }
                if (com.bytedance.sdk.openadsdk.component.IL.this.bX) {
                    com.bytedance.sdk.openadsdk.component.IL il3 = com.bytedance.sdk.openadsdk.component.IL.this;
                    if (il3.bg(il3.Ta.getVideoFrameLayout())) {
                        com.bytedance.sdk.openadsdk.component.IL.this.Ta.setVideoManager(com.bytedance.sdk.openadsdk.component.IL.this.iR());
                        com.bytedance.sdk.openadsdk.component.IL.this.zx.bX();
                        return;
                    } else {
                        com.bytedance.sdk.openadsdk.component.IL.this.zx.eqN();
                        return;
                    }
                }
                com.bytedance.sdk.openadsdk.component.IL.this.zx.bX();
            }
        });
        this.IL.Kg(1);
        this.eqN.addView(this.Ta, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.Lq = new com.bytedance.sdk.openadsdk.component.WR.iR(this.bg);
        this.eqN.addView(this.Lq);
        this.WR = this.Lq.getTopDislike();
        this.eo = this.Lq.getTopSkip();
        this.eo.setVisibility(4);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bX
    public void bg() {
        com.bytedance.sdk.openadsdk.core.Kg.WR wrBg = com.bytedance.sdk.openadsdk.component.bg.IL.bg(this.IL, this.bg, this.VB, this.Ta);
        wrBg.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.component.IL.2
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
            public void bg(android.view.View view, int i) {
                com.bytedance.sdk.openadsdk.component.IL.this.zx.zx();
            }
        });
        this.Ta.setClickListener(wrBg);
        com.bytedance.sdk.openadsdk.core.Kg.Kg kgIL = com.bytedance.sdk.openadsdk.component.bg.IL.IL(this.IL, this.bg, this.VB, this.Ta);
        this.Ta.setClickCreativeListener(kgIL);
        kgIL.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.component.IL.3
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
            public void bg(android.view.View view, int i) {
                com.bytedance.sdk.openadsdk.component.IL.this.zx.zx();
            }
        });
        super.ldr();
        this.Ta.setBackupListener(new com.bytedance.sdk.component.adexpress.IL.bX() { // from class: com.bytedance.sdk.openadsdk.component.IL.4
            @Override // com.bytedance.sdk.component.adexpress.IL.bX
            public boolean bg(android.view.ViewGroup viewGroup, int i) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                java.lang.String str = "isUseBackup() called with: view = [" + viewGroup + "], errCode = [" + i + com.ironsource.y8.i.e;
                try {
                    ((com.bytedance.sdk.openadsdk.core.Kg.Fy) viewGroup).PX();
                    new com.bytedance.sdk.openadsdk.component.WR.bg(com.bytedance.sdk.openadsdk.component.IL.this.bg).bg((com.bytedance.sdk.openadsdk.core.Kg.Fy) com.bytedance.sdk.openadsdk.component.IL.this.Ta);
                    return true;
                } catch (java.lang.Exception e) {
                    android.util.Log.e("AppOpenAdExpressManager", "", e);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.bX
    public void IL() {
        this.Ta.WR();
    }

    @Override // com.bytedance.sdk.openadsdk.component.bX
    public void bg(int i, int i2, boolean z) {
        super.bg(i, i2, z);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bX
    public void bX() {
        super.bX();
        com.bytedance.sdk.openadsdk.component.WR.IL il = this.Ta;
        if (il != null) {
            il.VB();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.bX
    public int eqN() {
        return this.Ta.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.bX
    public org.json.JSONObject bg(org.json.JSONObject jSONObject) {
        return this.Ta.bg(jSONObject, this.IL);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bX
    public void zx() {
        com.bytedance.sdk.openadsdk.component.WR.IL il = this.Ta;
        if (il != null) {
            il.Kg();
        }
    }
}
