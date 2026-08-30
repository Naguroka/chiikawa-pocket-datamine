package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class zx {
    private final com.bytedance.sdk.openadsdk.component.reward.view.ldr IL;
    private com.bytedance.sdk.openadsdk.component.reward.bg.zx.bg bX;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg bg;

    public interface bg {
        void bg(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.IL.IL il, int i);

        void vb();
    }

    public zx(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.bg = bgVar;
        this.IL = new com.bytedance.sdk.openadsdk.component.reward.view.ldr(bgVar);
    }

    public void bg() {
        this.IL.bg();
    }

    public void IL() {
        this.IL.bX();
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.zx zxVar) {
        this.IL.bg(zxVar);
    }

    public void bg(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.IL.IL il, int i) {
        int i2;
        if (this.bg != null) {
            com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("videoForceBreak", this.bg.IL);
        }
        new java.lang.StringBuilder("showEndCard() called with: isSkip = [").append(z).append("], force = [").append(z2).append("], isFromLandingPage = [").append(z3).append("], mAdType = [").append(il);
        if (this.bg.uu.isFinishing() || il == null) {
            return;
        }
        this.bg.LKE.PX();
        if (z2) {
            this.bg.Lq.set(true);
        }
        boolean z4 = false;
        if (this.bg.RiO && !this.bg.vb.get() && !com.bytedance.sdk.openadsdk.core.model.xxp.Kg(this.bg.IL) && (!com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.bg.IL) || !this.bg.Lq.get() || !this.bg.xxp.get())) {
            if (com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.bg.IL) && z3) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.bg.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.bg.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.bg.IL)) {
                this.bg.ayS.bX(false);
                il.Lq();
                return;
            }
        }
        if (this.bg.uu.isDestroyed() || this.bg.uu.isFinishing()) {
            return;
        }
        if (this.bg.IL.Fb()) {
            com.bytedance.sdk.openadsdk.component.reward.view.Kg kg = this.bg.Ja;
            com.bytedance.sdk.openadsdk.core.Kg.bX brandBannerController = (kg == null || kg.bg() == null) ? null : kg.bg().getBrandBannerController();
            if (brandBannerController != null) {
                brandBannerController.IL();
            }
            this.bg.uu.finish();
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.zx.bg bgVar = this.bX;
        if (bgVar != null) {
            bgVar.bg(z, z2, z3, il, i);
            return;
        }
        this.bg.rri.Ta();
        this.bg.VJ.DDQ();
        this.bg.VB.set(false);
        this.bg.PX.set(false);
        this.bg.aGH.bg();
        com.bytedance.sdk.openadsdk.component.reward.bg.yDt ydt = this.bg.ayS;
        if (!this.bg.iR && this.bg.IL.ZyO()) {
            z4 = true;
        }
        ydt.bg(z4);
        if (this.bg.eo.getAndSet(true)) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.IL(this.bg.IL)) {
            java.util.HashMap map = new java.util.HashMap();
            if (this.bg.VJ.LKE()) {
                i2 = 1;
            } else {
                i2 = !this.bg.VJ.tuV() ? -1 : 2;
            }
            map.put("webview_state", java.lang.Integer.valueOf(i2));
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bg.IL, this.bg.zx, z, z2, z3, this.bg.uu.isFinishing(), i, map);
        }
        if (this.bg.IL.bg() && com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL) && z) {
            this.bg.ayS.eqN(true);
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL)) {
            this.bg.ayS.bX(true);
        }
        WR();
        if (com.bytedance.sdk.openadsdk.core.model.rri.zx(this.bg.IL)) {
            if (this.bg.RJ) {
                this.bg.ayS.bX(true);
            }
            this.bg.LKE.bX();
            if (this.bg.Ja != null) {
                this.bg.Ja.ldr();
            }
            this.bg.JAA.VzQ();
            return;
        }
        bg(z, il);
    }

    public void bg(boolean z, com.bytedance.sdk.openadsdk.component.reward.IL.IL il) {
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
            return;
        }
        this.bg.VzQ.set(z);
        il.yDt();
        boolean z2 = false;
        if (this.bg.IL.HXG()) {
            this.bg.ayS.eqN(false);
        } else {
            this.bg.ayS.eqN(com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL));
        }
        this.bg.ayS.bX(com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL));
        if (this.bg.IL.bg() && com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL) && z) {
            this.bg.ayS.eqN(true);
        }
        this.bg.VJ.Uq();
        if (this.bg.LKE.Lq != null) {
            this.bg.LKE.Lq.eqN();
        }
        this.bg.LKE.bX();
        if (this.bg.Ja != null) {
            this.bg.Ja.ldr();
        }
        if (this.bg.JAA != null) {
            this.bg.JAA.iR(com.bytedance.sdk.openadsdk.component.reward.bg.Kg.IL);
        }
        if (!android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.tuV.bg(this.bg.Dxa, this.bg.IL))) {
            com.bytedance.sdk.openadsdk.utils.Fy.bg(this.bg.uu, com.bytedance.sdk.openadsdk.core.model.rri.Ta(this.bg.IL), this.bg.IL, com.bytedance.sdk.openadsdk.eqN.IL.bg.bX);
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.bg.IL) && this.bg.daV != null) {
            this.bg.daV.ldr();
        }
        if (com.bytedance.sdk.openadsdk.core.model.tuV.bg(this.bg.IL) || ((!com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.bg.IL) && this.bg.VJ.uu()) || (!com.bytedance.sdk.openadsdk.core.model.tuV.bg(this.bg.IL, this.bg.VJ.VzQ(), this.bg.VJ.bN(), this.bg.daV.PX(), this.bg.VJ.aGH()) && !com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL)))) {
            eqN();
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.model.tuV.eqN(this.bg.IL) && !com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL) && !com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.bg.IL)) {
            this.bg.VJ.bg(true, 0, (java.lang.String) null);
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL)) {
            if (com.bytedance.sdk.openadsdk.core.model.rri.rri(this.bg.IL) && !this.bg.VJ.LKE()) {
                if (!this.bg.VJ.VzQ()) {
                    if (this.bg.JAA.eqN() != null) {
                        this.bg.JAA.eqN().bg(2);
                    }
                    this.bg.JAA.zx();
                } else {
                    if (this.bg.JAA.eqN() != null) {
                        this.bg.JAA.eqN().bg(-1);
                    }
                    this.bg.JAA.ldr();
                    this.bg.ayS.eqN(false);
                    this.bg.JAA.bg(this.bg.DDQ.zx());
                }
                z2 = true;
            } else {
                if (this.bg.VJ.LKE() && this.bg.JAA.eqN() != null) {
                    this.bg.JAA.eqN().bg(1);
                }
                IL(il);
            }
        } else {
            bX(il);
        }
        if (z2) {
            return;
        }
        bg(il);
    }

    void bg(com.bytedance.sdk.openadsdk.component.reward.IL.IL il) {
        this.bg.VJ.bg(0.0f);
        this.bg.LKE.bg(0.0f);
        if (!com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.bg.IL)) {
            this.bg.daV.bg(8);
            this.bg.VJ.IL(0);
            this.bg.VJ.qC();
        } else {
            this.bg.VJ.IL(8);
            this.bg.daV.bg(0);
            this.bg.daV.iR();
        }
        if (this.bg.iR) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) il.yDt, 0);
            this.bg.LKE.zx(8);
        }
        this.bg.LKE.bX(8);
        this.bg.LKE.iR();
        if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.bg.IL)) {
            this.bg.bN.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        this.bg.bN.sendEmptyMessageDelayed(500, 100L);
        this.bg.VJ.bg(this.bg.RJ, true);
        this.bg.VJ.bX(true);
        this.bg.VJ.IL(true);
        com.bytedance.sdk.openadsdk.core.aGH aghPX = this.bg.VJ.PX();
        if (aghPX != null) {
            aghPX.bg("prerender_page_show", (org.json.JSONObject) null);
        }
    }

    public void IL(com.bytedance.sdk.openadsdk.component.reward.IL.IL il) {
        int iIEI = this.bg.IL.IEI();
        boolean z = true;
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
            iIEI = (this.bg.IL.gtr() + 1) * 1000;
        }
        if (iIEI == -1) {
            if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.bg.IL)) {
                if (com.bytedance.sdk.openadsdk.core.model.rri.rri(this.bg.IL) && this.bg.JAA.iR()) {
                    il.Lq();
                } else {
                    il.kMt();
                }
                z = false;
            } else {
                il.Lq();
            }
        } else if (iIEI >= 0) {
            this.bg.ayS.eqN(false);
            if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.bg.IL)) {
                if (com.bytedance.sdk.openadsdk.core.model.rri.rri(this.bg.IL) && this.bg.JAA.iR()) {
                    this.bg.bN.sendEmptyMessageDelayed(600, iIEI);
                } else {
                    this.bg.bN.sendEmptyMessageDelayed(1, iIEI);
                    z = false;
                }
            } else {
                this.bg.bN.sendEmptyMessageDelayed(600, iIEI);
            }
        } else {
            z = false;
        }
        if (!z || this.bg.Dt == null) {
            return;
        }
        this.bg.Dt.bg(iIEI);
    }

    public boolean bX(com.bytedance.sdk.openadsdk.component.reward.IL.IL il) {
        boolean z;
        this.bg.Kg = Kg();
        int i = this.bg.Kg;
        if (this.bg.IL.zx()) {
            return false;
        }
        if (this.bg.Kg == -1) {
            if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.bg.IL) && this.bg.VJ.VzQ()) {
                il.kMt();
            } else if (com.bytedance.sdk.openadsdk.core.model.rri.eo(this.bg.IL) && this.bg.VJ.VzQ()) {
                il.kMt();
            } else {
                il.Lq();
                z = true;
            }
            z = false;
        } else {
            if (this.bg.Kg >= 0) {
                this.bg.LZ.set(false);
                android.os.Message messageObtain = android.os.Message.obtain();
                messageObtain.what = 700;
                messageObtain.arg1 = this.bg.Kg;
                this.bg.bN.sendMessage(messageObtain);
                if (!com.bytedance.sdk.openadsdk.core.model.rri.WR(this.bg.IL)) {
                    z = true;
                }
            }
            z = false;
        }
        if ((this.bg.VJ.Ja() ? false : z) && this.bg.Dt != null) {
            this.bg.Dt.bg(this.bg.Kg);
        }
        return true;
    }

    private int Kg() {
        int iBu = this.bg.IL.bu();
        if (iBu <= 5000 && iBu >= 0) {
            if (iBu < 1000) {
                iBu += 1000;
            }
            int iBg = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(this.bg.IL.IGR());
            if (iBg <= 5000 && iBg >= 0) {
                if (iBg < 1000) {
                    iBg += 1000;
                }
                return java.lang.Math.min(iBu, iBg);
            }
        }
        return -1;
    }

    private void WR() {
        if (com.bytedance.sdk.openadsdk.core.model.rri.tuV(this.bg.IL) && this.bg.RJ) {
            this.bg.ayS.IL(true);
            this.bg.VW.bg(true);
        }
    }

    public void bX() {
        this.IL.eqN();
    }

    public void eqN() {
        bg(true);
    }

    public void bg(boolean z) {
        if (!com.bytedance.sdk.openadsdk.core.model.tuV.eqN(this.bg.IL)) {
            this.bg.VJ.bg(false, 408, "end_card_timeout");
        }
        this.bg.VJ.VW();
        this.bg.VJ.IL(8);
        this.bg.daV.bg(8);
        if (this.bg.iR) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.bg.dS.yDt, 8);
            this.bg.LKE.zx(0);
        }
        this.bg.LKE.bX(8);
        if (this.bg.IL.HXG()) {
            if (!this.IL.bg(this.bg.rri)) {
                this.bg.uu.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.bg.kU;
            if (ldrVar != null) {
                this.IL.bg(ldrVar.kMt().ldr());
            }
            this.IL.IL();
        }
        this.bg.LKE.iR();
        if (z) {
            bX(this.bg.dS);
        }
        this.bg.ayS.bX(false);
        this.bg.DDQ.bg(this.bg.IL.fE());
    }

    public boolean zx() {
        com.bytedance.sdk.openadsdk.component.reward.view.ldr ldrVar = this.IL;
        if (ldrVar != null) {
            return ldrVar.zx();
        }
        return false;
    }

    public void bg(com.bytedance.sdk.openadsdk.component.reward.bg.zx.bg bgVar) {
        this.bX = bgVar;
    }

    public com.bytedance.sdk.openadsdk.component.reward.bg.zx.bg ldr() {
        return this.bX;
    }

    public boolean iR() {
        return this.IL.ldr();
    }
}
