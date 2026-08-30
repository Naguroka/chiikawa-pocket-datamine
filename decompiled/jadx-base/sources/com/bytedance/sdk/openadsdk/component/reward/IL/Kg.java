package com.bytedance.sdk.openadsdk.component.reward.IL;

/* JADX INFO: loaded from: classes4.dex */
public class Kg extends com.bytedance.sdk.openadsdk.component.reward.IL.IL {
    private com.bytedance.sdk.openadsdk.component.reward.view.bg Lq;

    public Kg(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        super(bgVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void bg(android.widget.FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.view.bg bgVar = new com.bytedance.sdk.openadsdk.component.reward.view.bg(this.bg.uu, this.VB);
        this.Lq = bgVar;
        bgVar.setDownloadListener(this.PX);
        this.Lq.bg(this.IL, this.bg.lM, this.bg.GvG, this.bX, this.eqN);
        frameLayout.addView(this.Lq.getInteractionStyleRootView());
    }

    public static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return (tuv.fE() || tuv.jf() == 100.0f) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public com.bytedance.sdk.openadsdk.component.reward.IL.IL.bg eqN() {
        return new com.bytedance.sdk.openadsdk.component.reward.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.IL.Kg.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL.bg
            public void bg(boolean z) {
                if (com.bytedance.sdk.openadsdk.component.reward.IL.Kg.this.Lq != null) {
                    com.bytedance.sdk.openadsdk.component.reward.IL.Kg.this.Lq.setIsMute(z);
                }
            }
        };
    }

    public android.widget.FrameLayout Uq() {
        com.bytedance.sdk.openadsdk.component.reward.view.bg bgVar = this.Lq;
        if (bgVar != null) {
            return bgVar.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public boolean zx() {
        return aGH();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public boolean ldr() {
        return aGH();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void iR() {
        this.ldr.bX(8);
        this.ldr.IL(8);
        if (this.IL.tC() == 2) {
            this.Kg.bg(false);
            this.Kg.bX(false);
            this.Kg.eqN(false);
            this.ldr.zx(8);
            return;
        }
        this.Kg.bg(this.IL.ZyO());
        this.Kg.bX(aGH());
        this.Kg.eqN(aGH());
        if (aGH()) {
            this.ldr.zx(8);
        } else {
            this.Kg.ldr();
            this.ldr.zx(0);
        }
    }

    private boolean aGH() {
        return com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.IL);
    }
}
