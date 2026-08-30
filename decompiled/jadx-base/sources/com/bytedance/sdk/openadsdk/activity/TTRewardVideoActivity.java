package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTRewardVideoActivity extends com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.bg.zx.bg LZ;
    private static java.lang.String Lq;
    private static java.lang.String VzQ;
    private static java.lang.String vb;
    private static java.lang.String xxp;
    private static java.lang.String yDt;
    private java.lang.String Fy;
    protected int PX;
    protected com.bytedance.sdk.openadsdk.bg.zx.bg Ta;
    protected int VB;
    private boolean kMt;
    private java.lang.String tuV;
    private final java.util.concurrent.atomic.AtomicBoolean tC = new java.util.concurrent.atomic.AtomicBoolean(false);
    private int rri = -1;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean xxp() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        LZ = this.Ta;
        if (this.tC.get() && this.IL != null) {
            this.IL.IL.sbN();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (yDt == null) {
                yDt = com.bytedance.sdk.component.utils.Fy.bg(this, "tt_reward_msg");
                Lq = com.bytedance.sdk.component.utils.Fy.bg(this, "tt_msgPlayable");
                vb = com.bytedance.sdk.component.utils.Fy.bg(this, "tt_negtiveBtnBtnText");
                xxp = com.bytedance.sdk.component.utils.Fy.bg(this, "tt_postiveBtnText");
                VzQ = com.bytedance.sdk.component.utils.Fy.bg(this, "tt_postiveBtnTextPlayable");
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.RVA", th.getMessage());
        }
        if (bundle == null || this.IL == null || !this.IL.IL.GJw()) {
            return;
        }
        this.tC.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.view.IL ilBg;
        super.onResume();
        if (this.IL == null || (ilBg = this.IL.Ja.bg()) == null) {
            return;
        }
        ilBg.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.ldr() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.ldr
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.LZ();
            }
        });
    }

    protected void bg(java.lang.String str) {
        bg(str, false, 0, "", 0, "");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        LZ = null;
    }

    private void bg(final java.lang.String str, final boolean z, final int i, final java.lang.String str2, final int i2, final java.lang.String str3) {
        com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL(0).executeRewardVideoCallback(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.Pae, str, z, i, str2, i2, str3);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(android.os.Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            this.Ta = com.bytedance.sdk.openadsdk.core.JAA.bg().bX();
        }
        if (this.Ta != null || bundle == null) {
            return;
        }
        this.Ta = LZ;
        LZ = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void bg() {
        this.IL.ayS.bg(null, com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText());
        this.IL.ayS.zx(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void vb() {
        final android.view.View viewEo = this.IL.LKE.eo();
        if (viewEo != null) {
            android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
                /* JADX WARN: Code duplicated, block: B:31:0x00f0  */
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    boolean zZx;
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.VJ.Ja() && com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.eo.get()) {
                        boolean zTa = com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.daV.Ta();
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.VJ.zx(zTa);
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.LKE.zx(8);
                        android.view.View view2 = viewEo;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.zx.eqN) {
                            ((com.bytedance.sdk.openadsdk.core.zx.eqN) view2).setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.Dxa, "tt_close_btn"));
                        }
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.bN.sendEmptyMessageDelayed(600, 5000L);
                        if (!com.bytedance.sdk.openadsdk.core.model.tuV.bX(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL)) {
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL) && zTa) {
                            return;
                        }
                    }
                    if (!com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.pA()) {
                        zZx = false;
                    } else if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.HXG()) {
                        if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ZQc != null) {
                            com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.daV(2);
                            zZx = com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ZQc.zx();
                        } else {
                            zZx = false;
                        }
                    } else if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.OLh() != 0 || com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.VJ.xxp()) {
                        zZx = false;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.daV(11);
                        if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.VJ.eqN()) {
                            com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.daV(12);
                        }
                        try {
                            com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.LKE.xxp();
                            zZx = true;
                        } catch (java.lang.Exception unused) {
                            zZx = false;
                        }
                    }
                    if (zZx) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.VJ.Uw();
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.daV.VB();
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.DDQ.ldr();
                    if (com.bytedance.sdk.openadsdk.core.model.rri.eqN(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL)) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bg(true, true);
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewEo.setOnClickListener(onClickListener);
            viewEo.setTag(viewEo.getId(), onClickListener);
        }
        this.IL.ayS.bg(new com.bytedance.sdk.openadsdk.component.reward.top.IL() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void bg(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.GZy()) {
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.LKE.VB() != null) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.daV(2);
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.LKE.xxp();
                        return;
                    }
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.bX && com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.pA() && !com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.HXG()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.daV(13);
                    try {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.LKE.xxp();
                        return;
                    } catch (java.lang.Exception unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity tTRewardVideoActivity = com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this;
                tTRewardVideoActivity.bg(com.bytedance.sdk.openadsdk.core.model.rri.bX(tTRewardVideoActivity.IL.IL), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void IL(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bX != null && com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bX.eqN() != null) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bX.eqN().bg(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.RJ);
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.RJ = !com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.RJ;
                java.lang.Object[] objArr = new java.lang.Object[2];
                java.lang.String str = "will set is Mute " + com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.RJ + " mLastVolume=" + com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.VW.bg();
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.IL(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.RJ);
                if (!com.bytedance.sdk.openadsdk.core.model.rri.tuV(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL) || com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.eo.get()) {
                    if (com.bytedance.sdk.openadsdk.core.model.rri.iR(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL)) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.VW.bg(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.RJ, true);
                    }
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.VJ.eqN(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.RJ);
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.JAA.ldr(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.RJ);
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL == null || com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.hi() == null || com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.hi().bg() == null || com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri == null) {
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.RJ) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.hi().bg().Kg(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.iR());
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.hi().bg().WR(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.iR());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void bX(android.view.View view) {
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.aGH.bg(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bX);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final boolean z, boolean z2) {
        if (!z2 && this.kMt && this.IL.eo.get()) {
            if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.IL.IL)) {
                this.IL.VJ.Kg();
                return;
            } else if (com.bytedance.sdk.openadsdk.core.model.rri.eo(this.IL.IL)) {
                this.IL.JAA.xxp();
                return;
            }
        }
        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().Kg(java.lang.String.valueOf(this.IL.ldr))) {
            if (!z2 && this.IL.eo.get()) {
                if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.IL.IL)) {
                    this.IL.VJ.Kg();
                    return;
                } else if (com.bytedance.sdk.openadsdk.core.model.rri.eo(this.IL.IL)) {
                    this.IL.JAA.xxp();
                    return;
                }
            }
            if (z) {
                finish();
                return;
            } else {
                Fy();
                return;
            }
        }
        if (this.tC.get()) {
            if (this.IL.eo.get()) {
                if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.IL.IL)) {
                    this.IL.VJ.Kg();
                    return;
                } else if (com.bytedance.sdk.openadsdk.core.model.rri.eo(this.IL.IL)) {
                    this.IL.JAA.xxp();
                    return;
                }
            }
            if (z) {
                finish();
                return;
            } else {
                Fy();
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.IL.IL) && this.IL.VJ.VB().getVisibility() == 0) {
            this.IL.VJ.Kg();
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.eo(this.IL.IL) && this.IL.VJ.eo().getVisibility() == 0) {
            this.IL.JAA.xxp();
            return;
        }
        this.IL.Fy.set(true);
        this.IL.rri.Lq();
        if (z) {
            this.IL.JAA.yDt();
        }
        final com.bytedance.sdk.openadsdk.core.widget.IL il = new com.bytedance.sdk.openadsdk.core.widget.IL(this);
        this.bX.Ta = il;
        if (z) {
            this.bX.Ta.bg(Lq).IL(VzQ).bX(vb);
        } else {
            this.bX.Ta.bg(yDt).IL(xxp).bX(vb);
        }
        this.bX.Ta.bg(new com.bytedance.sdk.openadsdk.core.widget.IL.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.IL.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.yDt();
                if (z) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.JAA.zx(1000);
                }
                il.dismiss();
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.Fy.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.IL.bg
            public void IL() {
                il.dismiss();
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.kMt = true;
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.Fy.set(false);
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.JAA.ldr(Integer.MAX_VALUE);
                if (z) {
                    if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL)) {
                        if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL)) {
                            if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.JAA.bg()) {
                                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.JAA.bg(5);
                                return;
                            } else {
                                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.VJ.Kg();
                                return;
                            }
                        }
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.DDQ.ldr();
                        if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.JAA.bg()) {
                            com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.JAA.bg(4);
                        }
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.finish();
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.rri.ldr(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL)) {
                        if (com.bytedance.sdk.openadsdk.core.model.rri.eo(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL)) {
                            com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.JAA.xxp();
                            return;
                        } else {
                            com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.DDQ.ldr();
                            com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.finish();
                            return;
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.Fy();
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0078  */
    public void Fy() {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
        bgVar.bg(this.IL.rri.iR());
        bgVar.bX(this.IL.rri.tuV());
        bgVar.IL(this.IL.rri.VB());
        bgVar.bX(3);
        bgVar.eqN(this.IL.rri.VzQ());
        com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(this.IL.rri.bX(), bgVar, this.IL.rri.bg());
        com.bytedance.sdk.openadsdk.core.kMt.bX(this.IL.ldr);
        this.IL.rri.bg("skip", false);
        if (this.IL.bX) {
            bg(true, 4);
            if (com.bytedance.sdk.openadsdk.core.model.xxp.bg(this.IL.IL) && !this.IL.vb.get()) {
                finish();
            }
        } else {
            finish();
        }
        com.bytedance.sdk.openadsdk.core.PX.bg bgVarHi = this.IL.IL.hi();
        if (bgVarHi != null) {
            com.bytedance.sdk.openadsdk.core.PX.eqN eqnBg = bgVarHi.bg();
            long jIR = this.IL.rri.iR();
            eqnBg.ldr(jIR);
            eqnBg.zx(jIR);
        }
        com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.IL.IL, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void bg(android.content.Intent intent) {
        super.bg(intent);
        this.tuV = intent.getStringExtra("media_extra");
        this.Fy = intent.getStringExtra("user_id");
    }

    public boolean bg(long j, boolean z) {
        com.bytedance.sdk.openadsdk.eqN.iR iRVar = new com.bytedance.sdk.openadsdk.eqN.iR();
        iRVar.bg(java.lang.System.currentTimeMillis(), 1.0f);
        this.IL.rri.bg(this.IL.LKE.ldr(), iRVar);
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar = new com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            boolean bg;

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, int i) {
                if (this.bg) {
                    return;
                }
                this.bg = true;
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.Lq();
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.tuV();
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.bg(j2, j2);
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.tuV.set(true);
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.vb() == 36 && com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.kMt.bX().eqN();
                    com.bytedance.sdk.openadsdk.utils.PX.IL();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.bZw()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.daV(1);
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.LKE.xxp();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.vb() == 21 && !com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.eqN()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.IL(true);
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.LKE.xxp();
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.PX = (int) (java.lang.System.currentTimeMillis() / 1000);
                if (com.bytedance.sdk.openadsdk.core.model.xxp.bX(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.IL(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL)) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bg(false, 5);
                    if (!com.bytedance.sdk.openadsdk.core.model.xxp.IL(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL) || com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.Dt == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.Dt.bg(0L);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.xxp.bg(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL) && !com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.vb.get()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.bg(true);
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ayS.zx(true);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.bX) {
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.dX()) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ayS.bX();
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bg(false, 5);
                    if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.bg("skip", true);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL.dX()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ayS.bX();
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.IL)) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.bg("skip", true);
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.finish();
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void IL(long j2, int i) {
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.Ta();
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.Ta();
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.tuV();
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bg(false, true, 3);
                } else {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.finish();
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.bg(1 ^ (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.Uw() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.Lq();
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.tuV();
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bg(false, true, 6);
                } else {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.finish();
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.bg(!com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.Uw() ? 1 : 0, 1 ^ (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.Uw() ? 1 : 0));
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.Ta();
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, long j3) {
                if (!com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.txA && com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.Lq();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.eo.get()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (j2 != com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.Kg()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.Lq();
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.bg(j2, j3);
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity tTRewardVideoActivity = com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this;
                long j4 = j2 / 1000;
                double d = j4;
                tTRewardVideoActivity.ldr = (int) (tTRewardVideoActivity.IL.rri.DDQ() - d);
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.ldr >= 0) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.ldr), null);
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity tTRewardVideoActivity2 = com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this;
                tTRewardVideoActivity2.ldr = (int) (tTRewardVideoActivity2.IL.rri.DDQ() - d);
                int i = (int) j4;
                int iEo = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eo(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ldr));
                boolean z2 = iEo >= 0;
                if ((com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.Fy.get() || com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.VB.get()) && com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.rri.Lq();
                }
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.LKE.eqN(i);
                com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bg(j2, j3);
                if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.ldr > 0) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ayS.eqN(true);
                    if (z2 && i >= iEo) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.bg(true);
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.ldr), com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText());
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ayS.zx(true);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.IL.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.ldr), null);
                }
            }
        };
        this.IL.rri.bg(bgVar);
        if (this.IL.LKE.Lq != null) {
            this.IL.LKE.Lq.bg(bgVar);
        }
        boolean zBg = this.IL.rri.bg(j, z, null, this.bX);
        if (zBg && !z) {
            this.VB = (int) (java.lang.System.currentTimeMillis() / 1000);
        }
        return zBg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void c_() {
        LZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LZ() {
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "invoke callback onAdClicked, ".concat(java.lang.String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.bg.zx.bg bgVar = this.Ta;
        if (bgVar != null) {
            bgVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final boolean z, final int i, final java.lang.String str, final int i2, final java.lang.String str2) {
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "invoke callback onRewardVerify: " + z + ", " + i + ", " + str + ", " + i2 + ", " + str2 + "; " + this);
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onRewardVerify", z, i, str, i2, str2);
        } else {
            this.eqN.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.Ta != null) {
                        com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.Ta.bg(z, i, str, i2, str2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void zx() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.bg.zx.bg bgVar = this.Ta;
            if (bgVar != null) {
                bgVar.bg();
            }
        }
        if (VzQ()) {
            this.IL.Ja.eo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void PX() {
        tuV();
    }

    protected void tuV() {
        if (this.tC.get()) {
            return;
        }
        this.tC.set(true);
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().vb(java.lang.String.valueOf(this.IL.ldr))) {
            bg(true, this.IL.IL.LZ(), this.IL.IL.Fy(), 0, "");
        } else {
            com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(tC(), new com.bytedance.sdk.openadsdk.core.Fy.IL() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.Fy.IL
                public void bg(int i, java.lang.String str) {
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bg(false, 0, "", i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.Fy.IL
                public void bg(com.bytedance.sdk.openadsdk.core.LZ.IL il) {
                    boolean z = il.IL;
                    com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.this.bg(il.IL, il.bX.bg(), il.bX.IL(), 0, "");
                }
            });
        }
    }

    private org.json.JSONObject tC() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int iFy = (int) this.IL.rri.Fy();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.IL.IL.Fy());
            jSONObject.put("reward_amount", this.IL.IL.LZ());
            jSONObject.put("network", com.bytedance.sdk.component.utils.Lq.bX(getApplicationContext()));
            jSONObject.put("sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
            int iZQc = this.IL.IL.ZQc();
            java.lang.String strBX = "unKnow";
            if (iZQc == 2) {
                strBX = com.bytedance.sdk.openadsdk.utils.ayS.IL();
            } else if (iZQc == 1) {
                strBX = com.bytedance.sdk.openadsdk.utils.ayS.bX();
            }
            jSONObject.put("user_agent", strBX);
            jSONObject.put("extra", this.IL.IL.DCn());
            jSONObject.put("media_extra", this.tuV);
            jSONObject.put("video_duration", this.IL.IL.Dxa().ldr());
            jSONObject.put("play_start_ts", this.VB);
            jSONObject.put("play_end_ts", this.PX);
            jSONObject.put("duration", iFy);
            jSONObject.put("user_id", this.Fy);
            jSONObject.put("trans_id", com.bytedance.sdk.openadsdk.utils.rri.bg().replace("-", ""));
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.RVA", "", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void eqN() {
        LZ();
        this.IL.IL.fkt();
        this.IL.IL.bg(true);
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.IL.IL)) {
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.IL.IL, this.IL.zx, this.IL.IL.xZ());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(int i) {
        if (i == 10000) {
            tuV();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        rri();
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("recycleRes");
        }
        this.Ta = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.IL != null) {
            com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("videoForceBreak", this.IL.IL);
        }
        rri();
        super.finish();
    }

    private void rri() {
        if (this.Kg) {
            return;
        }
        this.Kg = true;
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "invoke callback onAdClose, ".concat(java.lang.String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.bg.zx.bg bgVar = this.Ta;
        if (bgVar != null) {
            bgVar.IL();
        }
    }

    public void bg(long j, long j2) {
        long j3 = j + (((long) this.IL.sVc) * 1000);
        if (this.rri == -1) {
            this.rri = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(java.lang.String.valueOf(this.IL.ldr)).ldr;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= 30000 && j3 >= 27000) {
            tuV();
        } else if ((j3 * 100) / j2 >= this.rri) {
            tuV();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void yDt() {
        int i = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(java.lang.String.valueOf(this.IL.ldr)).ldr;
        boolean z = true;
        boolean z2 = false;
        if (com.bytedance.sdk.openadsdk.core.model.rri.tuV(this.IL.IL)) {
            if ((1.0d - (((double) this.ldr) / this.IL.rri.DDQ())) * 100.0d < i) {
                z = false;
            }
            z2 = z;
        } else {
            boolean z3 = (1.0f - (this.IL.JAA.IL() / ((float) this.IL.IL.gtr()))) * 100.0f >= ((float) i);
            int iBg = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(java.lang.String.valueOf(this.IL.ldr));
            if (iBg == 0) {
                boolean zZx = this.IL.VJ.PX().zx();
                if (this.IL.JAA.bX()) {
                    zZx = true;
                }
                if (!z3 || !zZx) {
                    z = false;
                }
                z2 = z;
            } else if (iBg == 1) {
                z2 = z3;
            }
        }
        if (z2) {
            tuV();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(boolean z) {
        if (z) {
            tuV();
            return;
        }
        if ((1.0d - (((double) this.ldr) / this.IL.rri.DDQ())) * 100.0d >= com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(java.lang.String.valueOf(this.IL.ldr)).ldr) {
            tuV();
        }
    }
}
