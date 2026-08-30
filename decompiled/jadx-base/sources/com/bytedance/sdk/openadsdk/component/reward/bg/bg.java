package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public boolean ApA;
    public final com.bytedance.sdk.openadsdk.component.reward.view.iR CQc;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.VB DDQ;
    public com.bytedance.sdk.openadsdk.utils.VB Dt;
    public final android.content.Context Dxa;
    public int GZ;
    public final com.bytedance.sdk.openadsdk.core.model.tuV IL;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.Kg JAA;
    public final com.bytedance.sdk.openadsdk.component.reward.view.Kg Ja;
    public final com.bytedance.sdk.openadsdk.component.reward.view.eo LKE;
    public boolean Ld;
    public boolean Ny;
    public java.lang.String Pae;
    public boolean RJ;
    public boolean RiO;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.ldr Uq;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.PX Uw;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.tuV VJ;
    public com.bytedance.sdk.openadsdk.PX.Kg VW;
    public boolean Ys;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.zx ZQc;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.bX aGH;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.yDt ayS;
    public boolean bCU;
    public final com.bytedance.sdk.component.utils.JAA bN;
    public com.bytedance.sdk.openadsdk.component.reward.top.bX bOf;
    public final boolean bX;
    public final int bg;
    public com.bytedance.sdk.openadsdk.component.reward.IL.IL dS;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.Lq daV;
    private long eDa;
    public final boolean eqN;
    public int gXn;
    public final boolean iR;
    public final boolean jz;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.eqN kMt;
    public com.bytedance.sdk.openadsdk.activity.ldr kU;
    public float lM;
    public final int ldr;
    public final com.bytedance.sdk.openadsdk.core.Ta.eqN.IL qC;
    private long qp;
    public final com.bytedance.sdk.openadsdk.component.reward.bg.VzQ rri;
    public int sVc;
    public final android.app.Activity uu;
    public boolean wS;
    public com.bytedance.sdk.openadsdk.common.Ta zCS;
    public final java.lang.String zx;
    public int Kg = 0;
    public int WR = 0;
    public final java.util.concurrent.atomic.AtomicBoolean eo = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean VB = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean PX = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean Ta = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean yDt = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean Lq = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean vb = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean xxp = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean VzQ = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean tuV = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean Fy = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean LZ = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean tC = new java.util.concurrent.atomic.AtomicBoolean(false);
    public boolean txA = false;
    public int GvG = 1;
    public long cZH = 0;

    public bg(android.app.Activity activity, com.bytedance.sdk.component.utils.JAA jaa, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il, int i) {
        com.bytedance.sdk.openadsdk.component.reward.view.eo eoVar;
        this.uu = activity;
        this.qC = il;
        android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        this.Dxa = contextBg;
        this.IL = tuv;
        this.bg = i;
        this.jz = i == 0 || i == 2;
        this.RiO = i == 0 || i == 1;
        this.bN = jaa;
        boolean z = tuv.VW().getDurationSlotType() == 7;
        this.eqN = z;
        this.zx = z ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.Ys = tuv.bg();
        this.iR = com.bytedance.sdk.openadsdk.core.model.xxp.WR(tuv);
        int iIGR = tuv.IGR();
        this.ldr = iIGR;
        this.RJ = com.bytedance.sdk.openadsdk.core.VzQ.eqN().xxp(java.lang.String.valueOf(iIGR));
        this.bX = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().yDt(java.lang.String.valueOf(iIGR));
        this.Uw = i == 2 ? new com.bytedance.sdk.openadsdk.component.reward.bg.Ta(this) : new com.bytedance.sdk.openadsdk.component.reward.bg.PX(this);
        if (i == 2) {
            eoVar = new com.bytedance.sdk.openadsdk.component.reward.view.VB(this);
        } else {
            eoVar = tuv.bg() ? new com.bytedance.sdk.openadsdk.component.reward.view.eo(this) : new com.bytedance.sdk.openadsdk.component.reward.view.WR(this);
        }
        this.LKE = eoVar;
        this.CQc = new com.bytedance.sdk.openadsdk.component.reward.view.iR(this);
        this.rri = new com.bytedance.sdk.openadsdk.component.reward.bg.VzQ(this);
        this.kMt = new com.bytedance.sdk.openadsdk.component.reward.bg.eqN(this);
        this.JAA = new com.bytedance.sdk.openadsdk.component.reward.bg.Kg(this, tuv);
        this.Ja = new com.bytedance.sdk.openadsdk.component.reward.view.Kg(this);
        this.VJ = new com.bytedance.sdk.openadsdk.component.reward.bg.tuV(this);
        this.daV = new com.bytedance.sdk.openadsdk.component.reward.bg.Lq(this);
        this.ayS = new com.bytedance.sdk.openadsdk.component.reward.bg.yDt(this);
        this.ZQc = new com.bytedance.sdk.openadsdk.component.reward.bg.zx(this);
        this.DDQ = new com.bytedance.sdk.openadsdk.component.reward.bg.VB(this);
        this.Uq = new com.bytedance.sdk.openadsdk.component.reward.bg.ldr(this);
        this.aGH = new com.bytedance.sdk.openadsdk.component.reward.bg.bX(this);
        this.VW = new com.bytedance.sdk.openadsdk.PX.Kg(contextBg);
        this.Dt = com.bytedance.sdk.openadsdk.utils.ldr.bg(activity, new com.bytedance.sdk.openadsdk.utils.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.bg.1
            @Override // com.bytedance.sdk.openadsdk.utils.ldr.bg
            public android.view.View bg() {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.bg.this.LKE != null) {
                    return com.bytedance.sdk.openadsdk.component.reward.bg.bg.this.LKE.eo();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ldr.bg
            public void IL() {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.bg.this.ayS != null) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.bg.this.ayS.ldr();
                }
            }
        });
    }

    public void bg(boolean z) {
        this.Ld = z;
        this.ayS.eqN(z);
    }

    public void bg() {
        this.qp = android.os.SystemClock.elapsedRealtime();
    }

    public void IL() {
        if (this.qp <= 0) {
            this.qp = android.os.SystemClock.elapsedRealtime();
        }
        this.eDa += android.os.SystemClock.elapsedRealtime() - this.qp;
    }

    public long bX() {
        return this.eDa + (android.os.SystemClock.elapsedRealtime() - this.qp);
    }
}
