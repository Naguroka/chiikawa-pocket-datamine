package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.activity.ldr implements com.bytedance.sdk.component.utils.JAA.bg, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL {
    private static java.lang.String Ta;
    private static java.lang.String eqN;
    private static java.lang.String iR;
    private static java.lang.String ldr;
    private static java.lang.String zx;
    private boolean Fy;
    protected com.bytedance.sdk.openadsdk.component.reward.IL.IL IL;
    private int Lq;
    private java.lang.String VzQ;
    protected com.bytedance.sdk.openadsdk.component.reward.bg.bg bX;
    protected final com.bytedance.sdk.component.utils.JAA bg;
    private java.lang.String tuV;
    private com.bytedance.sdk.openadsdk.activity.IL.zx vb;
    private boolean xxp;
    private android.os.Bundle yDt;

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void WR() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(android.os.Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public boolean bg(long j, boolean z) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final android.view.View eo() {
        return null;
    }

    public bX(com.bytedance.sdk.openadsdk.activity.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        super(il, tuv, i);
        this.bg = new com.bytedance.sdk.component.utils.JAA(android.os.Looper.getMainLooper(), this);
        this.Lq = 0;
        this.Fy = true;
        bg(tuv, this.yDt);
        try {
            vb();
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.EndCardScene", "onCreate: ", th);
            Ja();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public final void bg(android.app.Activity activity, android.os.Bundle bundle) {
        this.yDt = bundle;
        super.bg(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public final android.view.View bg() {
        return this.bX.CQc;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void bg(android.app.Activity activity, com.bytedance.sdk.openadsdk.activity.IL.zx zxVar) {
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar;
        super.bg(activity, zxVar);
        this.vb = zxVar;
        android.content.Intent intent = activity.getIntent();
        this.tuV = intent.getStringExtra("media_extra");
        this.VzQ = intent.getStringExtra("user_id");
        try {
            if (iR == null) {
                iR = com.bytedance.sdk.component.utils.Fy.bg(this.bX.Dxa, "tt_reward_msg");
                eqN = com.bytedance.sdk.component.utils.Fy.bg(this.bX.Dxa, "tt_msgPlayable");
                ldr = com.bytedance.sdk.component.utils.Fy.bg(this.bX.Dxa, "tt_negtiveBtnBtnText");
                Ta = com.bytedance.sdk.component.utils.Fy.bg(this.bX.Dxa, "tt_postiveBtnText");
                zx = com.bytedance.sdk.component.utils.Fy.bg(this.bX.Dxa, "tt_postiveBtnTextPlayable");
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.EndCardScene", th.getMessage());
        }
        if (zxVar != null && (bgVar = zxVar.bX) != null) {
            this.bX.Ta.set(bgVar.Ta.get());
            this.bX.cZH = bgVar.cZH;
            this.bX.yDt.set(bgVar.yDt.get());
            this.bX.rri.bg(bgVar.rri.bg());
        }
        VzQ();
        Kg();
    }

    private void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.os.Bundle bundle) {
        android.app.Activity activityJAA = JAA();
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = new com.bytedance.sdk.openadsdk.component.reward.bg.bg(activityJAA, this.bg, tuv, this, 2);
        this.bX = bgVar;
        bgVar.Ny = kMt().bg();
        this.bX.kU = this;
        this.bX.VW = kMt().xxp();
        com.bytedance.sdk.openadsdk.component.reward.bg.IL.bg(this.bX, activityJAA.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.IL.IL ilBg = com.bytedance.sdk.openadsdk.component.reward.IL.ldr.bg(this.bX);
        this.IL = ilBg;
        this.bX.dS = ilBg;
        new java.lang.StringBuilder("init: mAdType = ").append(this.IL);
    }

    private void vb() {
        this.bX.CQc.bg(this.IL);
        this.IL.bg(this, this.bg);
        this.IL.VB();
    }

    private void VzQ() {
        if (this.xxp) {
            return;
        }
        this.xxp = true;
        this.IL.bg(this.PX);
        LZ();
    }

    private void LZ() {
        final android.view.View viewEo = this.bX.LKE.eo();
        if (viewEo != null) {
            android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.bX.1
                /* JADX WARN: Code duplicated, block: B:29:0x00e4  */
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    boolean zZx;
                    if (com.bytedance.sdk.openadsdk.activity.bX.this.bX.VJ.Ja()) {
                        boolean zTa = com.bytedance.sdk.openadsdk.activity.bX.this.bX.daV.Ta();
                        com.bytedance.sdk.openadsdk.activity.bX.this.bX.VJ.zx(zTa);
                        com.bytedance.sdk.openadsdk.activity.bX.this.bX.LKE.zx(8);
                        android.view.View view2 = viewEo;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.zx.eqN) {
                            ((com.bytedance.sdk.openadsdk.core.zx.eqN) view2).setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.activity.bX.this.bX.Dxa, "tt_close_btn"));
                        }
                        com.bytedance.sdk.openadsdk.activity.bX.this.bX.bN.sendEmptyMessageDelayed(600, 5000L);
                        if (!com.bytedance.sdk.openadsdk.core.model.tuV.bX(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL)) {
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL) && zTa) {
                            return;
                        }
                    }
                    if (!com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL.pA()) {
                        zZx = false;
                    } else if (com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL.HXG()) {
                        if (com.bytedance.sdk.openadsdk.activity.bX.this.bX.ZQc != null) {
                            com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL.daV(2);
                            zZx = com.bytedance.sdk.openadsdk.activity.bX.this.bX.ZQc.zx();
                        } else {
                            zZx = false;
                        }
                    } else if (com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL.OLh() != 0 || com.bytedance.sdk.openadsdk.activity.bX.this.bX.VJ.xxp()) {
                        zZx = false;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL.daV(11);
                        if (com.bytedance.sdk.openadsdk.activity.bX.this.bX.VJ.eqN()) {
                            com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL.daV(12);
                        }
                        try {
                            com.bytedance.sdk.openadsdk.activity.bX.this.bX.LKE.xxp();
                            zZx = true;
                        } catch (java.lang.Exception unused) {
                            zZx = false;
                        }
                    }
                    if (zZx) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.bX.this.bX.VJ.Uw();
                    com.bytedance.sdk.openadsdk.activity.bX.this.bX.daV.VB();
                    com.bytedance.sdk.openadsdk.activity.bX.this.bX.DDQ.ldr();
                    if (com.bytedance.sdk.openadsdk.core.model.rri.eqN(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL) && com.bytedance.sdk.openadsdk.activity.bX.this.bg(true, true)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.bX.this.Ja();
                }
            };
            viewEo.setOnClickListener(onClickListener);
            viewEo.setTag(viewEo.getId(), onClickListener);
        }
        this.bX.ayS.bg(new com.bytedance.sdk.openadsdk.component.reward.top.IL() { // from class: com.bytedance.sdk.openadsdk.activity.bX.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void bg(android.view.View view) {
                com.bytedance.sdk.openadsdk.activity.bX bXVar = com.bytedance.sdk.openadsdk.activity.bX.this;
                if (bXVar.bg(com.bytedance.sdk.openadsdk.core.model.rri.bX(bXVar.bX.IL), false)) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.rri.zx(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL)) {
                    if (com.bytedance.sdk.openadsdk.core.model.rri.eo(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL)) {
                        com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.xxp();
                        return;
                    }
                    android.view.View view2 = viewEo;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.bX.this.Ja();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL)) {
                    if (com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.bg()) {
                        com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.bg(5);
                        return;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.bX.this.bX.VJ.Kg();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL) || (com.bytedance.sdk.openadsdk.core.model.xxp.bg(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL) && !com.bytedance.sdk.openadsdk.activity.bX.this.bX.vb.get())) {
                    if (!com.bytedance.sdk.openadsdk.core.model.rri.Kg(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL) && com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.bg()) {
                        com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.bg(4);
                    }
                    com.bytedance.sdk.openadsdk.activity.bX.this.Ja();
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.bX.this.Ja();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void IL(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.activity.bX.this.IL != null && com.bytedance.sdk.openadsdk.activity.bX.this.IL.eqN() != null) {
                    com.bytedance.sdk.openadsdk.activity.bX.this.IL.eqN().bg(com.bytedance.sdk.openadsdk.activity.bX.this.bX.RJ);
                }
                com.bytedance.sdk.openadsdk.activity.bX.this.bX.RJ = !com.bytedance.sdk.openadsdk.activity.bX.this.bX.RJ;
                java.lang.Object[] objArr = new java.lang.Object[2];
                java.lang.String str = "will set is Mute " + com.bytedance.sdk.openadsdk.activity.bX.this.bX.RJ + " mLastVolume=" + com.bytedance.sdk.openadsdk.activity.bX.this.bX.VW.bg();
                com.bytedance.sdk.openadsdk.activity.bX.this.bX.rri.IL(com.bytedance.sdk.openadsdk.activity.bX.this.bX.RJ);
                if (!com.bytedance.sdk.openadsdk.core.model.rri.tuV(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL) || com.bytedance.sdk.openadsdk.activity.bX.this.bX.eo.get()) {
                    if (com.bytedance.sdk.openadsdk.core.model.rri.iR(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL)) {
                        com.bytedance.sdk.openadsdk.activity.bX.this.bX.VW.bg(com.bytedance.sdk.openadsdk.activity.bX.this.bX.RJ, true);
                    }
                    com.bytedance.sdk.openadsdk.activity.bX.this.bX.VJ.eqN(com.bytedance.sdk.openadsdk.activity.bX.this.bX.RJ);
                    if (com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL != null && com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL.hi() != null && com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL.hi().bg() != null && com.bytedance.sdk.openadsdk.activity.bX.this.bX.rri != null) {
                        if (com.bytedance.sdk.openadsdk.activity.bX.this.bX.RJ) {
                            com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL.hi().bg().Kg(com.bytedance.sdk.openadsdk.activity.bX.this.bX.rri.iR());
                        } else {
                            com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL.hi().bg().WR(com.bytedance.sdk.openadsdk.activity.bX.this.bX.rri.iR());
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.ldr(com.bytedance.sdk.openadsdk.activity.bX.this.bX.RJ);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void bX(android.view.View view) {
                com.bytedance.sdk.openadsdk.activity.bX.this.bX.aGH.bg(com.bytedance.sdk.openadsdk.activity.bX.this.IL);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void eqN(android.view.View view) {
                android.view.View view2 = viewEo;
                if (view2 != null) {
                    view2.performClick();
                }
            }
        });
    }

    private boolean rri() {
        if (this.bX.eo.get() && this.bX.iR) {
            return false;
        }
        if (this.Kg.bg()) {
            return this.bX.eo.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public final void IL(android.app.Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il;
        super.IL(activity);
        if (this.bX == null || (il = this.IL) == null) {
            return;
        }
        il.xxp();
        this.bX.txA = true;
        this.bX.Uw.IL(this.bg);
        if (rri()) {
            this.bX.ayS.bg(this.bX.IL.ZyO());
        }
        this.bX.LKE.Lq();
        this.bX.VJ.tC();
        this.bX.JAA.Ta();
        if (this.IL.IL()) {
            this.bX.rri.bg(this.IL);
            this.bX.rri.bg(false, this, this.Lq != 0);
        }
        this.Lq++;
        if (this.bX.Ja != null) {
            this.bX.Ja.iR();
        }
        this.bX.Uw.bg(this.bg);
        this.IL.tuV();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void bX(android.app.Activity activity) {
        super.bX(activity);
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il == null) {
            return;
        }
        il.LZ();
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public final void bg(android.os.Message message) {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il == null) {
            return;
        }
        il.bg(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void eqN() {
        Uq();
        this.bX.IL.fkt();
        this.bX.IL.bg(true);
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bX.IL)) {
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.bX.IL, this.bX.zx, this.bX.IL.xZ());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void c_() {
        Uq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void ldr() {
        DDQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void Kg() {
        if (kMt() == null) {
            return;
        }
        this.bX.ZQc.bg(this.vb.bg.getBoolean("isSkip", false), this.vb.bg.getBoolean("force", false), this.vb.bg.getBoolean("isFromLandingPage", false), this.IL, this.vb.IL);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public final void eqN(android.app.Activity activity) {
        super.eqN(activity);
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.bX;
        if (bgVar == null) {
            return;
        }
        bgVar.VJ.VJ();
        com.bytedance.sdk.openadsdk.utils.bX.bg(activity, this.bX.IL);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public final void zx(android.app.Activity activity) {
        super.zx(activity);
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il == null) {
            return;
        }
        il.Fy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public final void VB() {
        if (!this.bX.yDt.getAndSet(true) || com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bX.IL)) {
            this.bX.DDQ.bg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void PX() {
        bX();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void yDt() {
        boolean z = false;
        boolean z2 = (1.0f - (this.bX.JAA.IL() / ((float) this.bX.IL.gtr()))) * 100.0f >= ((float) com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(java.lang.String.valueOf(this.bX.ldr)).ldr);
        int iBg = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(java.lang.String.valueOf(this.bX.ldr));
        if (iBg == 0) {
            boolean zZx = this.bX.VJ.PX().zx();
            if (this.bX.JAA.bX()) {
                zZx = true;
            }
            z = z2 && zZx;
        } else if (iBg == 1) {
            z = z2;
        }
        if (z) {
            bX();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(boolean z) {
        if (z) {
            bX();
        }
    }

    public void bX() {
        if (kMt().WR().getBoolean("reward_verify", false) || kMt().Ta()) {
            return;
        }
        kMt().WR().putBoolean("reward_verify", true);
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().vb(java.lang.String.valueOf(this.bX.ldr))) {
            bg(true, this.bX.IL.LZ(), this.bX.IL.Fy(), 0, "");
        } else {
            com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(aGH(), new com.bytedance.sdk.openadsdk.core.Fy.IL() { // from class: com.bytedance.sdk.openadsdk.activity.bX.3
                @Override // com.bytedance.sdk.openadsdk.core.Fy.IL
                public void bg(int i, java.lang.String str) {
                    com.bytedance.sdk.openadsdk.activity.bX.this.bg(false, 0, "", i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.Fy.IL
                public void bg(com.bytedance.sdk.openadsdk.core.LZ.IL il) {
                    com.bytedance.sdk.openadsdk.activity.bX.this.bg(il.IL, il.bX.bg(), il.bX.IL(), 0, "");
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void xxp() {
        super.xxp();
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il != null) {
            il.rri();
        }
    }

    public void zx() {
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il == null) {
            return;
        }
        il.Uw();
        this.bX.ZQc.IL();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public boolean tuV() {
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.bX;
        return bgVar != null && bgVar.rri.kMt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    protected boolean a_() {
        return this.bX.eqN;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    protected java.lang.String Fy() {
        return this.bX.Pae;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public java.lang.String b_() {
        return this.bX.zx;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void bg(com.bytedance.sdk.openadsdk.activity.ldr ldrVar, com.bytedance.sdk.openadsdk.activity.ldr ldrVar2, com.bytedance.sdk.openadsdk.activity.IL.zx zxVar) {
        super.bg(ldrVar, ldrVar2, zxVar);
        if (ldrVar != null || ldrVar2 == this) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bX.IL) || com.bytedance.sdk.openadsdk.Fy.bg.bg("ivrv_new_arch_endcard_view_add_at_first", 0) == 1) {
            kMt().bg(bg());
        }
        VzQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bg(final boolean z, boolean z2) {
        if (!this.bX.eqN || kMt().WR().getBoolean("reward_verify", false) || kMt().Ta()) {
            return false;
        }
        if (!z2 && kMt().WR().getBoolean("user_has_give_up_reward", false)) {
            return false;
        }
        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().Kg(java.lang.String.valueOf(this.bX.ldr))) {
            if (!z2) {
                return false;
            }
            if (z) {
                Ja();
                return true;
            }
        }
        this.bX.Fy.set(true);
        if (z) {
            this.bX.JAA.yDt();
        }
        final com.bytedance.sdk.openadsdk.core.widget.IL il = new com.bytedance.sdk.openadsdk.core.widget.IL(this.bX.uu);
        this.IL.Ta = il;
        if (z) {
            this.IL.Ta.bg(eqN).IL(zx).bX(ldr);
        } else {
            this.IL.Ta.bg(iR).IL(Ta).bX(ldr);
        }
        this.IL.Ta.bg(new com.bytedance.sdk.openadsdk.core.widget.IL.bg() { // from class: com.bytedance.sdk.openadsdk.activity.bX.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.IL.bg
            public void bg() {
                if (z) {
                    com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.zx(1000);
                }
                il.dismiss();
                com.bytedance.sdk.openadsdk.activity.bX.this.bX.Fy.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.IL.bg
            public void IL() {
                il.dismiss();
                com.bytedance.sdk.openadsdk.activity.bX.this.kMt().WR().putBoolean("user_has_give_up_reward", true);
                com.bytedance.sdk.openadsdk.activity.bX.this.bX.Fy.set(false);
                com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.ldr(Integer.MAX_VALUE);
                if (z) {
                    if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(com.bytedance.sdk.openadsdk.activity.bX.this.bX.IL)) {
                        if (com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.bg()) {
                            com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.bg(5);
                            return;
                        } else {
                            com.bytedance.sdk.openadsdk.activity.bX.this.bX.VJ.Kg();
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.bX.this.bX.DDQ.ldr();
                    if (com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.bg()) {
                        com.bytedance.sdk.openadsdk.activity.bX.this.bX.JAA.bg(4);
                    }
                    com.bytedance.sdk.openadsdk.activity.bX.this.Ja();
                }
            }
        }).show();
        return true;
    }

    private org.json.JSONObject aGH() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int iFy = (int) this.bX.rri.Fy();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.bX.IL.Fy());
            jSONObject.put("reward_amount", this.bX.IL.LZ());
            jSONObject.put("network", com.bytedance.sdk.component.utils.Lq.bX(this.bX.Dxa));
            jSONObject.put("sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
            int iZQc = this.bX.IL.ZQc();
            java.lang.String strBX = "unKnow";
            if (iZQc == 2) {
                strBX = com.bytedance.sdk.openadsdk.utils.ayS.IL();
            } else if (iZQc == 1) {
                strBX = com.bytedance.sdk.openadsdk.utils.ayS.bX();
            }
            jSONObject.put("user_agent", strBX);
            jSONObject.put("extra", this.bX.IL.DCn());
            jSONObject.put("media_extra", this.tuV);
            jSONObject.put("video_duration", this.bX.IL.Dxa().ldr());
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("duration", iFy);
            jSONObject.put("user_id", this.VzQ);
            jSONObject.put("trans_id", com.bytedance.sdk.openadsdk.utils.rri.bg().replace("-", ""));
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.EndCardScene", "", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void Lq() {
        super.Lq();
        com.bytedance.sdk.openadsdk.component.reward.IL.IL il = this.IL;
        if (il == null) {
            return;
        }
        il.tC();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public void IL(boolean z) {
        long j = this.Fy ? this.bX.cZH : 0L;
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.bX;
        if (bgVar != null && bgVar.DDQ != null) {
            this.bX.DDQ.IL(z);
            this.bX.DDQ.bX(z);
            if (z && j > 0) {
                this.bX.cZH = j;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar2 = this.bX;
        if (bgVar2 != null && (bgVar2.dS instanceof com.bytedance.sdk.openadsdk.component.reward.IL.zx)) {
            ((com.bytedance.sdk.openadsdk.component.reward.IL.zx) this.bX.dS).IL(z);
        }
        if (z) {
            this.Fy = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public com.bytedance.sdk.openadsdk.component.reward.bg.bg tC() {
        return this.bX;
    }
}
