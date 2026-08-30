package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eo implements com.bytedance.sdk.openadsdk.PX.iR {
    protected final android.app.Activity Kg;
    protected boolean Lq;
    protected boolean PX;
    protected boolean Ta;
    protected final com.bytedance.sdk.openadsdk.component.reward.bg.bg VB;
    protected java.util.concurrent.atomic.AtomicBoolean VzQ = new java.util.concurrent.atomic.AtomicBoolean(false);
    protected final com.bytedance.sdk.openadsdk.core.model.tuV WR;
    protected final java.lang.String eo;
    protected volatile boolean iR;
    protected android.widget.FrameLayout vb;
    protected com.bytedance.sdk.openadsdk.tuV.bg.bg xxp;
    protected boolean yDt;

    public void IL(int i) {
    }

    public void Kg() {
    }

    public boolean WR() {
        return false;
    }

    public void bg(long j) {
    }

    public eo(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.VB = bgVar;
        this.Kg = bgVar.uu;
        this.eo = bgVar.zx;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = bgVar.IL;
        this.WR = tuv;
        this.Ta = com.bytedance.sdk.openadsdk.core.model.rri.zx(tuv);
    }

    public void bg() {
        if (this.Ta && !this.PX) {
            this.PX = true;
            com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.bg(this);
        }
    }

    public void IL(boolean z) {
        if (this.Ta && this.VB.jz) {
            this.vb = (android.widget.FrameLayout) this.VB.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.GEa);
            bg(z);
        }
    }

    protected void bg(boolean z) {
        if (this.vb != null) {
            com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar = new com.bytedance.sdk.openadsdk.tuV.bg.bg(this.VB.Dxa, this.WR, this.VB.GvG, z, this.vb);
            this.xxp = bgVar;
            bgVar.bg(true, IL());
        }
    }

    protected com.bytedance.sdk.openadsdk.PX.zx IL() {
        return new com.bytedance.sdk.openadsdk.PX.zx() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.eo.1
            @Override // com.bytedance.sdk.openadsdk.PX.zx
            public void bg() {
                com.bytedance.sdk.openadsdk.component.reward.bg.eo.this.VB.qC.bg(false);
            }
        };
    }

    public void bX() {
        if (this.Ta) {
            this.iR = true;
            this.xxp.bg();
            iR();
            if (com.bytedance.sdk.openadsdk.core.model.rri.eo(this.WR)) {
                this.VB.VJ.ldr();
            }
        }
    }

    private void iR() {
        int iIEI = this.WR.IEI();
        boolean z = true;
        if (iIEI == -1) {
            if (com.bytedance.sdk.openadsdk.core.model.rri.WR(this.WR)) {
                com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar = this.xxp;
                if (bgVar != null && bgVar.zx()) {
                    this.VB.tuV.set(true);
                    this.VB.dS.Lq();
                } else {
                    this.VB.dS.kMt();
                    z = false;
                }
            } else {
                this.VB.tuV.set(true);
                this.VB.dS.Lq();
            }
        } else if (iIEI >= 0) {
            this.VB.ayS.eqN(false);
            if (com.bytedance.sdk.openadsdk.core.model.rri.WR(this.WR)) {
                com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar2 = this.xxp;
                if (bgVar2 != null && bgVar2.zx()) {
                    this.VB.bN.sendEmptyMessageDelayed(600, iIEI);
                } else {
                    this.VB.bN.sendEmptyMessageDelayed(1, iIEI);
                    z = false;
                }
            } else {
                this.VB.bN.sendEmptyMessageDelayed(600, iIEI);
            }
        } else {
            z = false;
        }
        if (!z || this.VB.Dt == null) {
            return;
        }
        this.VB.Dt.bg(iIEI);
    }

    public void eqN() {
        com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar;
        if (!this.Ta || this.VzQ.get() || (bgVar = this.xxp) == null) {
            return;
        }
        bgVar.IL();
    }

    public void zx() {
        com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar;
        if (!this.Ta || this.VzQ.get() || (bgVar = this.xxp) == null) {
            return;
        }
        bgVar.bX();
    }

    public void ldr() {
        if (this.Ta && !this.Lq) {
            this.Lq = true;
            com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar = this.xxp;
            if (bgVar != null) {
                bgVar.eqN();
            }
            android.widget.FrameLayout frameLayout = this.vb;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.IL(this);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.zx zxVar) {
        com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar;
        if (this.Ta && (bgVar = this.xxp) != null) {
            bgVar.bg(zxVar);
        }
    }

    public void bX(boolean z) {
        if (this.Ta && this.xxp != null && this.iR) {
            this.xxp.bg(z);
        }
    }

    public boolean eo() {
        return this.iR;
    }

    @Override // com.bytedance.sdk.openadsdk.PX.iR
    public void bg(int i) {
        if (this.VB.VW.IL()) {
            boolean z = this.VB.RJ;
            this.VB.VW.bg();
            if (i == 0) {
                this.VB.ayS.IL(true);
                bX(true);
                return;
            } else {
                this.VB.ayS.IL(false);
                bX(false);
                return;
            }
        }
        this.VB.VW.bg(-1);
        boolean z2 = this.VB.RJ;
        this.VB.VW.bg();
        if (this.VB.txA) {
            if (i == 0) {
                this.VB.RJ = true;
                this.VB.ayS.IL(true);
                bX(true);
            } else {
                this.VB.RJ = false;
                this.VB.ayS.IL(false);
                bX(false);
            }
        }
    }

    public void VB() {
        if (this.VzQ.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar = this.xxp;
            if (bgVar != null) {
                bgVar.bg(true);
            }
            this.VB.VJ.ldr(true);
            this.VB.ZQc.bg(true, this.VB.dS);
            if (this.VB.ZQc.iR()) {
                this.VB.Dt.bg(this.VB.Kg);
                return;
            }
            this.VB.VJ.bg(this.VB.RJ, true);
            this.VB.VJ.bX(true);
            this.VB.VJ.IL(true);
            this.VB.bN.removeMessages(600);
            return;
        }
        this.VB.VJ.WR();
    }
}
