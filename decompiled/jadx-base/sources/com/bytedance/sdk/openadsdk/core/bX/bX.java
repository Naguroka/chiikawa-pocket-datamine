package com.bytedance.sdk.openadsdk.core.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.core.zx.bX {
    protected com.bytedance.sdk.openadsdk.core.Kg.Fy IL;
    protected com.bytedance.sdk.openadsdk.core.model.tuV bX;
    protected final android.content.Context bg;
    protected com.bytedance.sdk.openadsdk.AdSlot eqN;
    protected java.lang.String ldr;
    protected com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener zx;

    public bX(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        super(context);
        this.ldr = "banner_ad";
        this.bg = context;
        this.bX = tuv;
        this.eqN = adSlot;
        bg();
        com.bytedance.sdk.openadsdk.AdSlot adSlot2 = this.eqN;
        if (adSlot2 != null) {
            bg(adSlot2.getExpressViewAcceptedWidth(), this.eqN.getExpressViewAcceptedHeight());
        }
    }

    protected void bg() {
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = new com.bytedance.sdk.openadsdk.core.Kg.Fy(this.bg, this.bX, this.eqN, this.ldr);
        this.IL = fy;
        addView(fy, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.zx;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public void setExpressInteractionListener(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.zx = pAGBannerAdWrapperListener;
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.IL;
        if (fy != null) {
            fy.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.ldr() { // from class: com.bytedance.sdk.openadsdk.core.bX.bX.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.ldr
                public void bg() {
                    com.bytedance.sdk.openadsdk.core.bX.bX.this.zx.onAdClicked();
                }
            });
            this.IL.setExpressInteractionListener(new com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bX.bX.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(android.view.View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    if (com.bytedance.sdk.openadsdk.core.bX.bX.this.bX == null || !com.bytedance.sdk.openadsdk.core.bX.bX.this.bX.eK() || com.bytedance.sdk.openadsdk.core.bX.bX.this.zx == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.bX.bX.this.zx.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(android.view.View view, java.lang.String str, int i) {
                    if (com.bytedance.sdk.openadsdk.core.bX.bX.this.zx != null) {
                        com.bytedance.sdk.openadsdk.core.bX.bX.this.zx.onRenderFail(com.bytedance.sdk.openadsdk.core.bX.bX.this, str, i);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(android.view.View view, float f, float f2) {
                    if (com.bytedance.sdk.openadsdk.core.bX.bX.this.IL != null) {
                        com.bytedance.sdk.openadsdk.core.bX.bX.this.IL.setSoundMute(true);
                    }
                    if (com.bytedance.sdk.openadsdk.core.bX.bX.this.IL != null && !com.bytedance.sdk.openadsdk.core.VB.bX.bg(com.bytedance.sdk.openadsdk.core.bX.bX.this.IL.getDynamicShowType())) {
                        com.bytedance.sdk.openadsdk.core.bX.bX.this.bg(f, f2);
                    }
                    if (com.bytedance.sdk.openadsdk.core.bX.bX.this.zx != null) {
                        com.bytedance.sdk.openadsdk.core.bX.bX.this.zx.onRenderSuccess(com.bytedance.sdk.openadsdk.core.bX.bX.this, f, f2);
                    }
                }
            });
        }
    }

    protected void bg(float f, float f2) {
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, f2);
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(iBX, iBX2);
        }
        layoutParams.width = iBX;
        layoutParams.height = iBX2;
        setLayoutParams(layoutParams);
    }

    public void IL() {
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.IL;
        if (fy != null) {
            fy.WR();
        }
    }

    public void bX() {
        if (this.IL != null) {
            com.bytedance.sdk.openadsdk.core.WR.IL().ldr(this.IL.getClosedListenerKey());
            removeView(this.IL);
            this.IL.VB();
            this.IL = null;
        }
        com.bytedance.sdk.openadsdk.core.WR.IL().LZ();
    }

    public com.bytedance.sdk.openadsdk.core.Kg.Fy getCurView() {
        return this.IL;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.IL == null) {
            bg();
        }
        com.bytedance.sdk.openadsdk.utils.bX.bg(this, this.bX);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
