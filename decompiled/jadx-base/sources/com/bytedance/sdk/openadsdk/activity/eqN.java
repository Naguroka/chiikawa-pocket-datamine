package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends com.bytedance.sdk.openadsdk.activity.bg {
    private boolean ldr;
    int zx;

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    protected boolean a_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public java.lang.String b_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(android.os.Bundle bundle) {
    }

    public eqN(com.bytedance.sdk.openadsdk.activity.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        super(il, tuv, i);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg
    public void IL() {
        if (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bX.IL) && !this.bX.bX) {
            this.bX.ayS.bg(null, "X");
        } else {
            this.bX.ayS.bg(null, com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText());
        }
        this.bX.ayS.zx(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg, com.bytedance.sdk.openadsdk.activity.ldr
    public void bX(android.app.Activity activity) {
        super.bX(activity);
        if (this.bX == null || !IL(this.bX.IL) || bg(this.bX.IL)) {
            return;
        }
        if (this.ldr) {
            this.ldr = false;
            Ja();
        } else if (this.bX.VJ.daV()) {
            Ja();
        }
    }

    private boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return tuv == null || tuv.jf() == 100.0f;
    }

    private boolean IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.core.VzQ.eqN().Fy(java.lang.String.valueOf(this.bX.ldr));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg
    protected void bX() {
        final android.view.View viewEo = this.bX.LKE.eo();
        if (viewEo != null) {
            android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.eqN.1
                /* JADX WARN: Code duplicated, block: B:28:0x00d8  */
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    boolean zZx;
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.VJ.Ja() && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.eo.get()) {
                        boolean zTa = com.bytedance.sdk.openadsdk.activity.eqN.this.bX.daV.Ta();
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.VJ.zx(zTa);
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.LKE.zx(8);
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.bN.sendEmptyMessageDelayed(600, 5000L);
                        if (!com.bytedance.sdk.openadsdk.core.model.tuV.bX(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL)) {
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL) && zTa) {
                            return;
                        }
                    }
                    if (!com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.pA()) {
                        zZx = false;
                    } else if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.HXG()) {
                        if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ZQc != null) {
                            com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.daV(2);
                            zZx = com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ZQc.zx();
                        } else {
                            zZx = false;
                        }
                    } else if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.OLh() != 0 || com.bytedance.sdk.openadsdk.activity.eqN.this.bX.VJ.xxp()) {
                        zZx = false;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.daV(11);
                        if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.VJ.eqN()) {
                            com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.daV(12);
                        }
                        try {
                            com.bytedance.sdk.openadsdk.activity.eqN.this.bX.LKE.xxp();
                            zZx = true;
                        } catch (java.lang.Exception unused) {
                            zZx = false;
                        }
                    }
                    if (zZx) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.VJ.Uw();
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.daV.VB();
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.DDQ.ldr();
                    com.bytedance.sdk.openadsdk.activity.eqN.this.Ja();
                }
            };
            viewEo.setOnClickListener(onClickListener);
            viewEo.setTag(viewEo.getId(), onClickListener);
        }
        this.bX.ayS.bg(new com.bytedance.sdk.openadsdk.component.reward.top.IL() { // from class: com.bytedance.sdk.openadsdk.activity.eqN.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void bg(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL) && (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL) || com.bytedance.sdk.openadsdk.activity.eqN.this.bX.eo.get())) {
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.JAA.bg()) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.JAA.bg(5);
                        return;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.VJ.Kg();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL) || (com.bytedance.sdk.openadsdk.core.model.xxp.bg(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL) && !com.bytedance.sdk.openadsdk.activity.eqN.this.bX.vb.get())) {
                    if (!com.bytedance.sdk.openadsdk.core.model.rri.Kg(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL) && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.JAA.bg()) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.JAA.bg(4);
                    }
                    com.bytedance.sdk.openadsdk.activity.eqN.this.Ja();
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.GZy()) {
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.LKE.VB() != null) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.daV(2);
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.LKE.xxp();
                        return;
                    }
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.activity.eqN.this.bX.bX && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.pA() && !com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.HXG()) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.daV(13);
                    try {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.LKE.xxp();
                        return;
                    } catch (java.lang.Exception unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
                bgVar.bg(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.iR());
                bgVar.bX(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.tuV());
                bgVar.IL(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.VB());
                bgVar.bX(3);
                bgVar.eqN(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.VzQ());
                com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.bX(), bgVar, com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.bg());
                com.bytedance.sdk.openadsdk.core.kMt.bX(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ldr);
                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.bg("skip", false);
                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ayS.eqN(false);
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.bX) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bg(true, 4);
                } else {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.Ja();
                }
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL != null && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.hi() != null && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri != null) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.hi().bg().ldr(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.iR());
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.hi().bg().zx(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.iR());
                }
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void IL(android.view.View view) {
                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.RJ = !com.bytedance.sdk.openadsdk.activity.eqN.this.bX.RJ;
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.IL != null && com.bytedance.sdk.openadsdk.activity.eqN.this.IL.eqN() != null) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.IL.eqN().bg(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.RJ);
                }
                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.IL(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.RJ);
                if (!com.bytedance.sdk.openadsdk.core.model.rri.tuV(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL) || com.bytedance.sdk.openadsdk.activity.eqN.this.bX.eo.get()) {
                    if (com.bytedance.sdk.openadsdk.core.model.rri.iR(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL)) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.VW.bg(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.RJ, true);
                    }
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.VJ.eqN(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.RJ);
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL == null || com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.hi() == null || com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.hi().bg() == null || com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri == null) {
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.RJ) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.hi().bg().Kg(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.iR());
                    } else {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.hi().bg().WR(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.iR());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void bX(android.view.View view) {
                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.aGH.bg(com.bytedance.sdk.openadsdk.activity.eqN.this.IL);
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

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public boolean bg(long j, boolean z) {
        com.bytedance.sdk.openadsdk.eqN.iR iRVar;
        if (this.Kg.bg()) {
            if (this.bX.Ja != null && this.bX.Ja.bg() != null) {
                iRVar = this.bX.Ja.bg().getAdShowTime();
            } else {
                iRVar = new com.bytedance.sdk.openadsdk.eqN.iR();
            }
            if (this.IL != null && (this.IL instanceof com.bytedance.sdk.openadsdk.component.reward.IL.Kg) && !this.bX.ApA) {
                this.bX.rri.bg(((com.bytedance.sdk.openadsdk.component.reward.IL.Kg) this.IL).Uq(), iRVar);
            } else {
                this.bX.rri.bg(this.bX.Ja.IL(), iRVar);
            }
            java.util.HashMap map = new java.util.HashMap();
            if (this.bX.Ja != null) {
                map.put("dynamic_show_type", java.lang.Integer.valueOf(this.bX.Ja.WR()));
                org.json.JSONObject jSONObjectBg = this.bX.Ja.bg((org.json.JSONObject) null);
                if (jSONObjectBg != null) {
                    java.util.Iterator<java.lang.String> itKeys = jSONObjectBg.keys();
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        try {
                            map.put(next, jSONObjectBg.get(next));
                        } catch (org.json.JSONException unused) {
                        }
                    }
                }
            }
            this.bX.rri.bg(new com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg() { // from class: com.bytedance.sdk.openadsdk.activity.eqN.3
                boolean bg;

                @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                public void bg(long j2, int i) {
                    if (this.bg) {
                        return;
                    }
                    this.bg = true;
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                    com.bytedance.sdk.openadsdk.activity.eqN.this.Ta();
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.bg(j2, j2);
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja.IL(true);
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.vb() == 36 && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.bX) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.kMt.bX().eqN();
                        com.bytedance.sdk.openadsdk.utils.PX.IL();
                    }
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.vb() == 21 && !com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.eqN()) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.IL(true);
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.LKE.xxp();
                    }
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ny) {
                        com.bytedance.sdk.openadsdk.activity.IL.zx zxVarIL = com.bytedance.sdk.openadsdk.activity.eqN.this.IL(5);
                        zxVarIL.zx = true;
                        com.bytedance.sdk.openadsdk.activity.eqN.this.kMt().bg(com.bytedance.sdk.openadsdk.activity.eqN.this, zxVarIL);
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.bX) {
                        if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.dX()) {
                            if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja.WR() == 1) {
                                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ayS.bX();
                                return;
                            }
                            return;
                        } else {
                            com.bytedance.sdk.openadsdk.activity.eqN.this.bg(false, 5);
                            if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL)) {
                                return;
                            }
                            com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.bg("skip", true);
                            return;
                        }
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL)) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.Ja();
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja == null || com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja.bg() == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja.bg().setTime("0", 0, 0, false);
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja.Kg()) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ayS.bg("0", "X");
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ayS.zx(true);
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ayS.bX();
                    }
                }

                @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                public void IL(long j2, int i) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.IL()) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.zx();
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.Ta();
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.AdScene", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja.bg(true);
                    com.bytedance.sdk.openadsdk.activity.IL ilKMt = com.bytedance.sdk.openadsdk.activity.eqN.this.kMt();
                    com.bytedance.sdk.openadsdk.activity.eqN eqn = com.bytedance.sdk.openadsdk.activity.eqN.this;
                    ilKMt.bg(eqn, eqn.IL(3));
                }

                @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                public void bg() {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                    com.bytedance.sdk.openadsdk.activity.eqN.this.Ta();
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    com.bytedance.sdk.openadsdk.activity.IL ilKMt = com.bytedance.sdk.openadsdk.activity.eqN.this.kMt();
                    com.bytedance.sdk.openadsdk.activity.eqN eqn = com.bytedance.sdk.openadsdk.activity.eqN.this;
                    ilKMt.bg(eqn, eqn.IL(6));
                }

                @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                public void bg(long j2, long j3) {
                    if (!com.bytedance.sdk.openadsdk.activity.eqN.this.bX.txA && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.IL()) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.Lq();
                    }
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.eo.get()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                    if (j2 != com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.Kg()) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.Ta();
                    }
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.IL()) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.bg(j2, j3);
                        com.bytedance.sdk.openadsdk.activity.eqN eqn = com.bytedance.sdk.openadsdk.activity.eqN.this;
                        long j4 = j2 / 1000;
                        eqn.zx = (int) (eqn.bX.rri.DDQ() - j4);
                        int i = (int) j4;
                        if ((com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Fy.get() || com.bytedance.sdk.openadsdk.activity.eqN.this.bX.VB.get()) && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.IL()) {
                            com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.Lq();
                        }
                        if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja != null && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja.bg() != null) {
                            com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja.bg().setTime(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.eqN.this.zx), i, 0, false);
                        }
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bg((j2 * 1.0f) / j3);
                        if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ja.Kg() || com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.Fb()) {
                            com.bytedance.sdk.openadsdk.activity.eqN.this.eqN(i);
                            if (com.bytedance.sdk.openadsdk.activity.eqN.this.zx >= 0) {
                                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ayS.eqN(true);
                                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.eqN.this.zx), null);
                            }
                        }
                    }
                }
            });
            return this.bX.rri.bg(j, z, map, this.IL);
        }
        com.bytedance.sdk.openadsdk.eqN.iR iRVar2 = new com.bytedance.sdk.openadsdk.eqN.iR();
        iRVar2.bg(java.lang.System.currentTimeMillis(), 1.0f);
        if (this.IL != null && (this.IL instanceof com.bytedance.sdk.openadsdk.component.reward.IL.Kg)) {
            this.bX.rri.bg(((com.bytedance.sdk.openadsdk.component.reward.IL.Kg) this.IL).Uq(), iRVar2);
        } else {
            this.bX.rri.bg(this.bX.LKE.ldr(), iRVar2);
        }
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar = new com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg() { // from class: com.bytedance.sdk.openadsdk.activity.eqN.4
            boolean bg;

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, int i) {
                if (this.bg) {
                    return;
                }
                this.bg = true;
                com.bytedance.sdk.openadsdk.activity.eqN.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.eqN.this.Ta();
                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.bg(j2, j2);
                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.tuV.set(true);
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.bZw()) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.daV(1);
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.LKE.xxp();
                }
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.vb() == 21 && !com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.eqN()) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.IL(true);
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.LKE.xxp();
                }
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Ny) {
                    com.bytedance.sdk.openadsdk.activity.IL.zx zxVarIL = com.bytedance.sdk.openadsdk.activity.eqN.this.IL(5);
                    zxVarIL.zx = true;
                    com.bytedance.sdk.openadsdk.activity.eqN.this.kMt().bg(com.bytedance.sdk.openadsdk.activity.eqN.this, zxVarIL);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.bX) {
                    if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.dX()) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ayS.bX();
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bg(false, 5);
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.IL(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL) && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Dt != null) {
                        com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Dt.bg(0L);
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.bg("skip", true);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL.dX()) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ayS.bX();
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.eqN.this.bX.IL)) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.bg("skip", true);
                }
                com.bytedance.sdk.openadsdk.activity.eqN.this.Ja();
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void IL(long j2, int i) {
                com.bytedance.sdk.openadsdk.activity.eqN.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.zx();
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.Ta();
                com.bytedance.sdk.openadsdk.activity.IL ilKMt = com.bytedance.sdk.openadsdk.activity.eqN.this.kMt();
                com.bytedance.sdk.openadsdk.activity.eqN eqn = com.bytedance.sdk.openadsdk.activity.eqN.this;
                ilKMt.bg(eqn, eqn.IL(3));
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.eqN.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.eqN.this.Ta();
                java.lang.Object[] objArr = new java.lang.Object[2];
                com.bytedance.sdk.openadsdk.activity.IL ilKMt = com.bytedance.sdk.openadsdk.activity.eqN.this.kMt();
                com.bytedance.sdk.openadsdk.activity.eqN eqn = com.bytedance.sdk.openadsdk.activity.eqN.this;
                ilKMt.bg(eqn, eqn.IL(6));
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, long j3) {
                if (!com.bytedance.sdk.openadsdk.activity.eqN.this.bX.txA && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.Lq();
                }
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.bX.eo.get()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.eqN.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (j2 != com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.Kg()) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.Ta();
                }
                com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.bg(j2, j3);
                com.bytedance.sdk.openadsdk.activity.eqN eqn = com.bytedance.sdk.openadsdk.activity.eqN.this;
                long j4 = j2 / 1000;
                eqn.zx = (int) (eqn.bX.rri.DDQ() - j4);
                int i = (int) j4;
                if ((com.bytedance.sdk.openadsdk.activity.eqN.this.bX.Fy.get() || com.bytedance.sdk.openadsdk.activity.eqN.this.bX.VB.get()) && com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.rri.Lq();
                }
                com.bytedance.sdk.openadsdk.activity.eqN.this.eqN(i);
                com.bytedance.sdk.openadsdk.activity.eqN.this.bg((j2 * 1.0f) / j3);
                if (com.bytedance.sdk.openadsdk.activity.eqN.this.zx >= 0) {
                    com.bytedance.sdk.openadsdk.activity.eqN.this.bX.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.eqN.this.zx), null);
                }
            }
        };
        this.bX.rri.bg(bgVar);
        if (this.bX.LKE.Lq != null) {
            this.bX.LKE.Lq.bg(bgVar);
        }
        return this.bX.rri.bg(j, z, null, this.IL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN(int i) {
        int iTuV = com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV(java.lang.String.valueOf(this.bX.ldr));
        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().ldr(java.lang.String.valueOf(this.bX.ldr)) || (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bX.IL) && !this.bX.bX)) {
            if (i >= iTuV) {
                if (!this.bX.Ld) {
                    this.bX.bg(true);
                }
                IL();
                return;
            }
            return;
        }
        if (!this.bX.Ld) {
            this.bX.bg(true);
        }
        if (i <= iTuV) {
            zx(iTuV - i);
            this.bX.ayS.zx(false);
        } else {
            IL();
        }
    }

    private void zx(int i) {
        this.bX.ayS.bg(null, new android.text.SpannableStringBuilder(java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_skip_ad_time_text"), java.lang.Integer.valueOf(i))));
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void c_() {
        if (this.bX.IL.jf() != 100.0f) {
            this.ldr = true;
        }
        Uq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg
    protected void iR() {
        DDQ();
        if (this.Kg.bg()) {
            this.bX.Ja.eo();
        }
    }
}
