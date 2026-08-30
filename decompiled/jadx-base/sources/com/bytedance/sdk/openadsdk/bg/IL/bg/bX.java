package com.bytedance.sdk.openadsdk.bg.IL.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.bg.IL.Kg {
    protected final android.content.Context Kg;
    private boolean PX;
    protected java.lang.String VB;
    protected com.bytedance.sdk.openadsdk.AdSlot WR;
    protected com.bytedance.sdk.openadsdk.core.Kg.Fy eo;

    public bX(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        super(context, tuv, 5, true);
        this.VB = "embeded_ad";
        this.PX = false;
        this.IL.Kg(1);
        this.eqN.bg(this);
        this.Kg = context;
        this.WR = adSlot;
        bg();
        IL();
    }

    protected void bg() {
        this.eo = new com.bytedance.sdk.openadsdk.core.Kg.Fy(this.Kg, this.IL, this.WR, this.VB);
        bX();
    }

    private void IL() {
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.eo;
        if (fy != null) {
            fy.setBackupListener(new com.bytedance.sdk.component.adexpress.IL.bX() { // from class: com.bytedance.sdk.openadsdk.bg.IL.bg.bX.1
                @Override // com.bytedance.sdk.component.adexpress.IL.bX
                public boolean bg(android.view.ViewGroup viewGroup, int i) {
                    com.bytedance.sdk.openadsdk.bg.IL.bg.bg bgVar = new com.bytedance.sdk.openadsdk.bg.IL.bg.bg(com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.eo.getContext());
                    bgVar.setExtraFuncationHelper(com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.eqN);
                    bgVar.bg(com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.eo);
                    return true;
                }
            });
        }
    }

    protected void bX() {
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.eo;
        if (fy != null) {
            fy.setExpressInteractionListener(new com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.bg.IL.bg.bX.2
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
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(android.view.View view, float f, float f2) {
                    if (!com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.eo.Ta()) {
                        com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.bg(f, f2);
                        if (com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.PX) {
                            com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.eo.Kg();
                            return;
                        }
                        return;
                    }
                    com.bytedance.sdk.openadsdk.bg.IL.IL il = new com.bytedance.sdk.openadsdk.bg.IL.IL(com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.Kg, com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.IL, 5, com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.WR, com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.eqN, com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.bg);
                    com.bytedance.sdk.openadsdk.bg.IL.bg.bX bXVar = com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this;
                    if (bXVar instanceof com.bytedance.sdk.openadsdk.bg.IL.bg.IL) {
                        il.bg(((com.bytedance.sdk.openadsdk.core.Kg.tuV) bXVar.eqN()).getVideoAdListener());
                    }
                    com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.eqN.bg((com.bytedance.sdk.openadsdk.core.IL.bg) com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.eo.getClickCreativeListener());
                    com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView pAGMediaViewWR = com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.eqN.WR();
                    if (pAGMediaViewWR == null) {
                        pAGMediaViewWR = new com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView(com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.Kg);
                    }
                    com.bytedance.sdk.openadsdk.bg.IL.bg.bX.this.eo.addView(pAGMediaViewWR);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(float f, float f2) {
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.eo;
        if (fy != null && com.bytedance.sdk.openadsdk.core.VB.bX.bg(fy.getDynamicShowType())) {
            android.view.ViewGroup.LayoutParams layoutParams = this.eo.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.eo.setLayoutParams(layoutParams);
            return;
        }
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, f2);
        android.view.ViewGroup.LayoutParams layoutParams2 = this.eo.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new android.view.ViewGroup.LayoutParams(iBX, iBX2);
        } else {
            layoutParams2.width = iBX;
            layoutParams2.height = iBX2;
        }
        this.eo.setLayoutParams(layoutParams2);
    }

    public com.bytedance.sdk.openadsdk.core.Kg.Fy eqN() {
        return this.eo;
    }

    public void bg(boolean z) {
        this.PX = z;
    }

    public void zx() {
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.eo;
        if (fy != null) {
            fy.WR();
        }
    }
}
