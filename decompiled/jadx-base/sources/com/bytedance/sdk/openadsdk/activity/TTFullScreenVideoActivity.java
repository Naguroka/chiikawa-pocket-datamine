package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTFullScreenVideoActivity extends com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.bg.bX.IL PX;
    private boolean Ta;
    private com.bytedance.sdk.openadsdk.bg.bX.IL VB;

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean xxp() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void yDt() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        PX = this.VB;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.view.IL ilBg;
        super.onResume();
        if (this.IL == null || (ilBg = this.IL.Ja.bg()) == null) {
            return;
        }
        ilBg.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.ldr() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.ldr
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.tuV();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.IL == null || com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.IL.IL)) {
            return;
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = this.IL.IL.Dxa();
        if (ilDxa == null) {
            com.bykv.vk.openvk.bg.bg.bg.bX.IL il = new com.bykv.vk.openvk.bg.bg.bg.bX.IL();
            il.bg(10.0d);
            this.IL.IL.bg(il);
        } else if (ilDxa.ldr() <= 0.0d) {
            ilDxa.bg(10.0d);
        }
    }

    private void bg(final java.lang.String str) {
        com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL(1).executeFullVideoCallback(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.Pae, str);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void bg(android.content.Intent intent) {
        super.bg(intent);
        this.IL.wS = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(android.os.Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            this.VB = com.bytedance.sdk.openadsdk.core.JAA.bg().eqN();
        }
        if (this.VB != null || bundle == null) {
            return;
        }
        this.VB = PX;
        PX = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void vb() {
        final android.view.View viewEo = this.IL.LKE.eo();
        if (viewEo != null) {
            android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                /* JADX WARN: Code duplicated, block: B:31:0x00ef  */
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    boolean zZx;
                    if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.VJ.Ja() && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.eo.get()) {
                        boolean zTa = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.daV.Ta();
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.VJ.zx(zTa);
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.LKE.zx(8);
                        android.view.View view2 = viewEo;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.zx.eqN) {
                            ((com.bytedance.sdk.openadsdk.core.zx.eqN) view2).setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.Dxa, "tt_close_btn"));
                        }
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.bN.sendEmptyMessageDelayed(600, 5000L);
                        if (!com.bytedance.sdk.openadsdk.core.model.tuV.bX(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL)) {
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL) && zTa) {
                            return;
                        }
                    }
                    if (!com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.pA()) {
                        zZx = false;
                    } else if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.HXG()) {
                        if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.ZQc != null) {
                            com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.daV(2);
                            zZx = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.ZQc.zx();
                        } else {
                            zZx = false;
                        }
                    } else if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.OLh() != 0 || com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.VJ.xxp()) {
                        zZx = false;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.daV(11);
                        if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.VJ.eqN()) {
                            com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.daV(12);
                        }
                        try {
                            com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.LKE.xxp();
                            zZx = true;
                        } catch (java.lang.Exception unused) {
                            zZx = false;
                        }
                    }
                    if (zZx) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.VJ.Uw();
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.daV.VB();
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.DDQ.ldr();
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.finish();
                }
            };
            viewEo.setOnClickListener(onClickListener);
            viewEo.setTag(viewEo.getId(), onClickListener);
        }
        this.IL.ayS.bg(new com.bytedance.sdk.openadsdk.component.reward.top.IL() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void bg(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.core.model.rri.ldr(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL) || (com.bytedance.sdk.openadsdk.core.model.rri.zx(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL) && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.JAA.Kg(com.bytedance.sdk.openadsdk.component.reward.bg.Kg.IL))) {
                    if (com.bytedance.sdk.openadsdk.core.model.rri.eo(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL)) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.JAA.xxp();
                        return;
                    }
                    android.view.View view2 = viewEo;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL) && (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL) || com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.eo.get())) {
                    if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.JAA.bg()) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.JAA.bg(5);
                        return;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.VJ.Kg();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL) || (com.bytedance.sdk.openadsdk.core.model.xxp.bg(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL) && !com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.vb.get())) {
                    if (!com.bytedance.sdk.openadsdk.core.model.rri.Kg(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL) && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.JAA.bg()) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.JAA.bg(4);
                    }
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.finish();
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.GZy()) {
                    if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.LKE.VB() != null) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.daV(2);
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.LKE.xxp();
                        return;
                    }
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.bX && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.pA() && !com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.HXG()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.daV(13);
                    try {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.LKE.xxp();
                        return;
                    } catch (java.lang.Exception unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
                bgVar.bg(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.iR());
                bgVar.bX(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.tuV());
                bgVar.IL(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.VB());
                bgVar.bX(3);
                bgVar.eqN(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.VzQ());
                com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.bX(), bgVar, com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.bg());
                com.bytedance.sdk.openadsdk.core.kMt.bX(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.ldr);
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.bg("skip", false);
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.ayS.eqN(false);
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.bg(true, 4);
                } else {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.finish();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL != null && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.hi() != null && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri != null) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.hi().bg().ldr(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.iR());
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.hi().bg().zx(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.iR());
                }
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void IL(android.view.View view) {
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.RJ = !com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.RJ;
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.bX != null && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.bX.eqN() != null) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.bX.eqN().bg(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.RJ);
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.IL(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.RJ);
                if (!com.bytedance.sdk.openadsdk.core.model.rri.tuV(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL) || com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.eo.get()) {
                    if (com.bytedance.sdk.openadsdk.core.model.rri.iR(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL)) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.VW.bg(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.RJ, true);
                    }
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.VJ.eqN(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.RJ);
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.JAA.ldr(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.RJ);
                    if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL == null || com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.hi() == null || com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.hi().bg() == null || com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri == null) {
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.RJ) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.hi().bg().Kg(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.iR());
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.hi().bg().WR(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.iR());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void bX(android.view.View view) {
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.aGH.bg(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.bX);
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

    public boolean bg(long j, boolean z) {
        com.bytedance.sdk.openadsdk.eqN.iR iRVar = new com.bytedance.sdk.openadsdk.eqN.iR();
        iRVar.bg(java.lang.System.currentTimeMillis(), 1.0f);
        if (this.bX != null && (this.bX instanceof com.bytedance.sdk.openadsdk.component.reward.IL.Kg)) {
            this.IL.rri.bg(((com.bytedance.sdk.openadsdk.component.reward.IL.Kg) this.bX).Uq(), iRVar);
        } else {
            this.IL.rri.bg(this.IL.LKE.ldr(), iRVar);
        }
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar = new com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.5
            boolean bg;

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, int i) {
                if (this.bg) {
                    return;
                }
                this.bg = true;
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.Lq();
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.bg(j2, j2);
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.tuV.set(true);
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.vb() == 36 && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.kMt.bX().eqN();
                    com.bytedance.sdk.openadsdk.utils.PX.IL();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.bZw()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.daV(1);
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.LKE.xxp();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.vb() == 21 && !com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.eqN()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.IL(true);
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.LKE.xxp();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.bX) {
                    if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.dX()) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.ayS.bX();
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.bg(false, 5);
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.IL(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL) && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.Dt != null) {
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.Dt.bg(0L);
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.bg("skip", true);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL.dX()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.ayS.bX();
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.IL)) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.bg("skip", true);
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.finish();
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void IL(long j2, int i) {
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.Ta();
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.Ta();
                com.bytedance.sdk.component.utils.PX.bg("TTAD.FSVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.bg(false, true, 3);
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.bg(!com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.Uw() ? 1 : 0, 2);
                } else {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.Lq();
                java.lang.Object[] objArr = new java.lang.Object[2];
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.bX) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.bg(false, true, 6);
                } else {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.finish();
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.bg(!com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.Uw() ? 1 : 0, 1 ^ (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.Uw() ? 1 : 0));
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.Ta();
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, long j3) {
                if (!com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.txA && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.Lq();
                }
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.eo.get()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.eqN.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (j2 != com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.Kg()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.Lq();
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.bg(j2, j3);
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity tTFullScreenVideoActivity = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this;
                long j4 = j2 / 1000;
                tTFullScreenVideoActivity.ldr = (int) (tTFullScreenVideoActivity.IL.rri.DDQ() - j4);
                int i = (int) j4;
                if ((com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.Fy.get() || com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.VB.get()) && com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.rri.Lq();
                }
                com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.bX(i);
                if (com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.ldr >= 0) {
                    com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.IL.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this.ldr), null);
                }
            }
        };
        this.IL.rri.bg(bgVar);
        if (this.IL.LKE.Lq != null) {
            this.IL.LKE.Lq.bg(bgVar);
        }
        return this.IL.rri.bg(j, z, null, this.bX);
    }

    protected void bX(int i) {
        int iTuV = com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV(java.lang.String.valueOf(this.IL.ldr));
        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().ldr(java.lang.String.valueOf(this.IL.ldr)) || (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.IL.IL) && !this.IL.bX)) {
            if (i >= iTuV) {
                if (!this.IL.Ld) {
                    this.IL.bg(true);
                }
                bg();
                return;
            }
            return;
        }
        if (!this.IL.Ld) {
            this.IL.bg(true);
        }
        if (i <= iTuV) {
            eqN(iTuV - i);
            this.IL.ayS.zx(false);
        } else {
            bg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void bg() {
        if (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.IL.IL) && !this.IL.bX) {
            this.IL.ayS.bg(null, "X");
        } else {
            this.IL.ayS.bg(null, com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText());
        }
        this.IL.ayS.zx(true);
    }

    private void eqN(int i) {
        this.IL.ayS.bg(null, java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_skip_ad_time_text"), java.lang.Integer.valueOf(i)));
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void c_() {
        if (this.IL.IL.jf() != 100.0f) {
            this.Ta = true;
        }
        tuV();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void zx() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.bg.bX.IL il = this.VB;
            if (il != null) {
                il.bg();
            }
        }
        if (VzQ()) {
            this.IL.Ja.eo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void eqN() {
        tuV();
        this.IL.IL.fkt();
        this.IL.IL.bg(true);
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.IL.IL)) {
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.IL.IL, this.IL.zx, this.IL.IL.xZ());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tuV() {
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "invoke callback onAdClicked, ".concat(java.lang.String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.bg.bX.IL il = this.VB;
        if (il != null) {
            il.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.IL != null) {
            com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("videoForceBreak", this.IL.IL);
            this.IL.JAA.bg(this.IL.wS);
        }
        try {
            Fy();
        } catch (java.lang.Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Fy();
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("recycleRes");
        }
        this.VB = null;
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        PX = null;
    }

    private void Fy() {
        if (this.Kg) {
            return;
        }
        this.Kg = true;
        com.bytedance.sdk.openadsdk.utils.LZ.bg("BVA", "invoke callback onAdClose, ".concat(java.lang.String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.bg.bX.IL il = this.VB;
        if (il != null) {
            il.IL();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.IL == null || !IL(this.IL.IL) || bg(this.IL.IL)) {
            return;
        }
        if (this.Ta) {
            this.Ta = false;
            finish();
        } else if (this.IL.VJ.daV()) {
            finish();
        }
    }

    private boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return tuv == null || tuv.jf() == 100.0f;
    }

    private boolean IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.core.VzQ.eqN().Fy(java.lang.String.valueOf(this.IL.ldr));
    }
}
