package com.bytedance.sdk.openadsdk.component.reward.IL;

/* JADX INFO: loaded from: classes4.dex */
public class WR extends com.bytedance.sdk.openadsdk.component.reward.IL.IL {
    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void bg(android.widget.FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void iR() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public boolean ldr() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public boolean zx() {
        return true;
    }

    public WR(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        super(bgVar);
    }

    public static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return com.bytedance.sdk.openadsdk.core.model.rri.iR(tuv) || com.bytedance.sdk.openadsdk.core.model.rri.VzQ(tuv);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void xxp() {
        if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.IL) && this.bg.VJ.CQc() && !this.bg.VJ.Dxa()) {
            VzQ();
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL)) {
            if (com.bytedance.sdk.openadsdk.utils.DeviceUtils.iR() == 0) {
                this.bg.RJ = true;
            }
            if (this.bg.RJ) {
                this.bg.ayS.IL(true);
                this.bg.VW.bg(true);
            }
        }
        this.bg.Dt.bg();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void tuV() {
        if (this.bg.JAA.Kg(com.bytedance.sdk.openadsdk.component.reward.bg.Kg.bX) && com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
            this.bg.JAA.bX("return_foreground");
            if ((this.Ta == null || !this.Ta.isShowing()) && this.bg.JAA.IL() >= 0.0f) {
                this.bg.JAA.zx(0);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void Fy() {
        super.Fy();
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
            this.eo.removeMessages(600);
            this.bg.JAA.bX("go_background");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void LZ() {
        super.LZ();
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
            this.eo.removeMessages(600);
            this.bg.JAA.bX("go_background");
        }
    }
}
