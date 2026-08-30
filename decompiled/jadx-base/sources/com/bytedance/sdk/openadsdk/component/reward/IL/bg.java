package com.bytedance.sdk.openadsdk.component.reward.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    protected com.bytedance.sdk.openadsdk.core.model.tuV IL;
    protected final com.bytedance.sdk.openadsdk.component.reward.bg.yDt Kg;
    protected com.bytedance.sdk.openadsdk.core.Ta.eqN.IL WR;
    protected int bX;
    protected com.bytedance.sdk.openadsdk.component.reward.bg.bg bg;
    protected com.bytedance.sdk.component.utils.JAA eo;
    protected int eqN;
    protected final com.bytedance.sdk.openadsdk.component.reward.bg.tuV iR;
    protected final com.bytedance.sdk.openadsdk.component.reward.view.eo ldr;
    protected final com.bytedance.sdk.openadsdk.component.reward.bg.VzQ zx;

    public bg(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.bg = bgVar;
        this.IL = bgVar.IL;
        this.bX = bgVar.gXn;
        this.eqN = bgVar.GZ;
        this.zx = bgVar.rri;
        this.ldr = bgVar.LKE;
        this.iR = bgVar.VJ;
        this.Kg = bgVar.ayS;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il, com.bytedance.sdk.component.utils.JAA jaa) {
        this.WR = il;
        this.eo = jaa;
    }

    public boolean bg() {
        return this.bg.IL.HXG() || this.bg.IL.bOf() == 15 || this.bg.IL.bOf() == 5 || this.bg.IL.bOf() == 50;
    }

    public void bg(boolean z) {
        if (this.bg.eo.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        if (tuv != null && tuv.Fb()) {
            this.Kg.bX(false);
            this.Kg.bg(true);
            this.bg.LKE.IL(8);
            this.bg.LKE.bX(8);
            return;
        }
        if (!z) {
            this.Kg.bX(false);
            this.Kg.bg(false);
            this.Kg.eqN(false);
            this.bg.LKE.zx(8);
        } else {
            this.Kg.bg(this.bg.IL.ZyO());
            if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL) || bg()) {
                this.Kg.bX(true);
            }
            if (bg() || ((this instanceof com.bytedance.sdk.openadsdk.component.reward.IL.iR) && this.bg.IL.bg())) {
                this.Kg.eqN(true);
            } else {
                this.Kg.ldr();
                this.bg.LKE.zx(0);
            }
        }
        if (!z) {
            this.bg.LKE.IL(4);
            this.bg.LKE.bX(8);
        } else if (this.bg.lM != com.bytedance.sdk.openadsdk.component.reward.view.IL.bg) {
            this.bg.LKE.IL(8);
            this.bg.LKE.bX(8);
        } else {
            this.bg.LKE.IL(0);
            this.bg.LKE.bX(0);
        }
    }

    public boolean IL() {
        if (!com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.bg.IL) || !this.bg.tuV.get()) {
            return (this.bg.eo.get() || this.bg.VB.get() || com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) ? false : true;
        }
        android.widget.FrameLayout frameLayoutLdr = this.bg.LKE.ldr();
        frameLayoutLdr.setVisibility(4);
        frameLayoutLdr.setVisibility(0);
        return false;
    }

    protected void bX() {
        if (com.bytedance.sdk.openadsdk.core.model.rri.IL(this.bg.IL) && com.bytedance.sdk.openadsdk.utils.DeviceUtils.iR() == 0) {
            this.bg.RJ = true;
        }
        this.bg.ayS.IL(this.bg.RJ);
    }
}
