package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.openadsdk.activity.bg {
    private static java.lang.String Lq;
    private static java.lang.String Ta;
    private static java.lang.String vb;
    private static java.lang.String xxp;
    private static java.lang.String yDt;
    private int Fy;
    private java.lang.String VzQ;
    int iR;
    protected int ldr;
    private java.lang.String tuV;
    protected int zx;

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    protected boolean a_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ldr
    public java.lang.String b_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(android.os.Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(boolean z) {
    }

    public zx(com.bytedance.sdk.openadsdk.activity.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        super(il, tuv, i);
        this.Fy = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg, com.bytedance.sdk.openadsdk.activity.ldr
    public void bg(android.app.Activity activity, com.bytedance.sdk.openadsdk.activity.IL.zx zxVar) {
        super.bg(activity, zxVar);
        if (activity.isFinishing()) {
            return;
        }
        android.content.Intent intent = activity.getIntent();
        this.tuV = intent.getStringExtra("media_extra");
        this.VzQ = intent.getStringExtra("user_id");
        try {
            if (vb == null) {
                vb = com.bytedance.sdk.component.utils.Fy.bg(this.bX.Dxa, "tt_reward_msg");
                Ta = com.bytedance.sdk.component.utils.Fy.bg(this.bX.Dxa, "tt_msgPlayable");
                Lq = com.bytedance.sdk.component.utils.Fy.bg(this.bX.Dxa, "tt_negtiveBtnBtnText");
                xxp = com.bytedance.sdk.component.utils.Fy.bg(this.bX.Dxa, "tt_postiveBtnText");
                yDt = com.bytedance.sdk.component.utils.Fy.bg(this.bX.Dxa, "tt_postiveBtnTextPlayable");
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.RewardAdScene", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg
    protected void IL() {
        this.bX.ayS.bg(null, com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText());
        this.bX.ayS.zx(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg
    protected void bX() {
        final android.view.View viewEo = this.bX.LKE.eo();
        if (viewEo != null) {
            android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.zx.1
                /* JADX WARN: Code duplicated, block: B:28:0x00d9  */
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    boolean zZx;
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.VJ.Ja() && com.bytedance.sdk.openadsdk.activity.zx.this.bX.eo.get()) {
                        boolean zTa = com.bytedance.sdk.openadsdk.activity.zx.this.bX.daV.Ta();
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.VJ.zx(zTa);
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.LKE.zx(8);
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.bN.sendEmptyMessageDelayed(600, 5000L);
                        if (!com.bytedance.sdk.openadsdk.core.model.tuV.bX(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL)) {
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL) && zTa) {
                            return;
                        }
                    }
                    if (!com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.pA()) {
                        zZx = false;
                    } else if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.HXG()) {
                        if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.ZQc != null) {
                            com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.daV(2);
                            zZx = com.bytedance.sdk.openadsdk.activity.zx.this.bX.ZQc.zx();
                        } else {
                            zZx = false;
                        }
                    } else if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.OLh() != 0 || com.bytedance.sdk.openadsdk.activity.zx.this.bX.VJ.xxp()) {
                        zZx = false;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.daV(11);
                        if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.VJ.eqN()) {
                            com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.daV(12);
                        }
                        try {
                            com.bytedance.sdk.openadsdk.activity.zx.this.bX.LKE.xxp();
                            zZx = true;
                        } catch (java.lang.Exception unused) {
                            zZx = false;
                        }
                    }
                    if (zZx) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.VJ.Uw();
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.daV.VB();
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.DDQ.ldr();
                    if (com.bytedance.sdk.openadsdk.core.model.rri.eqN(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL)) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bg(true, true);
                    } else {
                        com.bytedance.sdk.openadsdk.activity.zx.this.Ja();
                    }
                }
            };
            viewEo.setOnClickListener(onClickListener);
            viewEo.setTag(viewEo.getId(), onClickListener);
        }
        this.bX.ayS.bg(new com.bytedance.sdk.openadsdk.component.reward.top.IL() { // from class: com.bytedance.sdk.openadsdk.activity.zx.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void bg(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.GZy()) {
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.LKE.VB() != null) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.daV(2);
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.LKE.xxp();
                        return;
                    }
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.activity.zx.this.bX.bX && com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.pA() && !com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.HXG()) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.daV(13);
                    try {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.LKE.xxp();
                        return;
                    } catch (java.lang.Exception unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.activity.zx zxVar = com.bytedance.sdk.openadsdk.activity.zx.this;
                zxVar.bg(com.bytedance.sdk.openadsdk.core.model.rri.bX(zxVar.bX.IL), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void IL(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.activity.zx.this.IL != null && com.bytedance.sdk.openadsdk.activity.zx.this.IL.eqN() != null) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.IL.eqN().bg(com.bytedance.sdk.openadsdk.activity.zx.this.bX.RJ);
                }
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.RJ = !com.bytedance.sdk.openadsdk.activity.zx.this.bX.RJ;
                java.lang.Object[] objArr = new java.lang.Object[2];
                java.lang.String str = "will set is Mute " + com.bytedance.sdk.openadsdk.activity.zx.this.bX.RJ + " mLastVolume=" + com.bytedance.sdk.openadsdk.activity.zx.this.bX.VW.bg();
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.IL(com.bytedance.sdk.openadsdk.activity.zx.this.bX.RJ);
                if (!com.bytedance.sdk.openadsdk.core.model.rri.tuV(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL) || com.bytedance.sdk.openadsdk.activity.zx.this.bX.eo.get()) {
                    if (com.bytedance.sdk.openadsdk.core.model.rri.iR(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL)) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.VW.bg(com.bytedance.sdk.openadsdk.activity.zx.this.bX.RJ, true);
                    }
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.VJ.eqN(com.bytedance.sdk.openadsdk.activity.zx.this.bX.RJ);
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL == null || com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.hi() == null || com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.hi().bg() == null || com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri == null) {
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.RJ) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.hi().bg().Kg(com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.iR());
                    } else {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.hi().bg().WR(com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.iR());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.IL
            public void bX(android.view.View view) {
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.aGH.bg(com.bytedance.sdk.openadsdk.activity.zx.this.IL);
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

    @Override // com.bytedance.sdk.openadsdk.activity.bg, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void bg(int i) {
        if (i == 10000) {
            rri();
        }
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
            this.bX.rri.bg(this.bX.Ja.IL(), iRVar);
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
            this.bX.rri.bg(new com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg() { // from class: com.bytedance.sdk.openadsdk.activity.zx.3
                boolean bg;

                @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                public void bg(long j2, int i) {
                    if (this.bg) {
                        return;
                    }
                    this.bg = true;
                    com.bytedance.sdk.openadsdk.activity.zx.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                    com.bytedance.sdk.openadsdk.activity.zx.this.Ta();
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.bg(j2, j2);
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ja.IL(true);
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.vb() == 36 && com.bytedance.sdk.openadsdk.activity.zx.this.bX.bX) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.kMt.bX().eqN();
                        com.bytedance.sdk.openadsdk.utils.PX.IL();
                    }
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.vb() == 21 && !com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.eqN()) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.IL(true);
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.LKE.xxp();
                    }
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ny) {
                        com.bytedance.sdk.openadsdk.activity.IL ilKMt = com.bytedance.sdk.openadsdk.activity.zx.this.kMt();
                        com.bytedance.sdk.openadsdk.activity.zx zxVar = com.bytedance.sdk.openadsdk.activity.zx.this;
                        ilKMt.bg(zxVar, zxVar.IL(5));
                    } else if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.bX) {
                        if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.dX()) {
                            if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ja.WR() == 1) {
                                com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.bX();
                            }
                        } else {
                            com.bytedance.sdk.openadsdk.activity.zx.this.bg(false, 5);
                            if (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL)) {
                                com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.bg("skip", true);
                            }
                        }
                    } else if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.dX()) {
                        if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ja.WR() == 1) {
                            com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.bX();
                        }
                    } else {
                        if (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL)) {
                            com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.bg("skip", true);
                        }
                        com.bytedance.sdk.openadsdk.activity.zx.this.Ja();
                    }
                    com.bytedance.sdk.openadsdk.activity.zx.this.zx = (int) (java.lang.System.currentTimeMillis() / 1000);
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ny) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.zx.this.rri();
                }

                @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                public void IL(long j2, int i) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.IL()) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.zx();
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.zx.this.rri();
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.Ta();
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ja.bg(true);
                    com.bytedance.sdk.openadsdk.activity.IL ilKMt = com.bytedance.sdk.openadsdk.activity.zx.this.kMt();
                    com.bytedance.sdk.openadsdk.activity.zx zxVar = com.bytedance.sdk.openadsdk.activity.zx.this;
                    ilKMt.bg(zxVar, zxVar.IL(3));
                }

                @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                public void bg() {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                    com.bytedance.sdk.openadsdk.activity.zx.this.Ta();
                    com.bytedance.sdk.openadsdk.activity.zx.this.rri();
                    com.bytedance.sdk.openadsdk.activity.IL ilKMt = com.bytedance.sdk.openadsdk.activity.zx.this.kMt();
                    com.bytedance.sdk.openadsdk.activity.zx zxVar = com.bytedance.sdk.openadsdk.activity.zx.this;
                    ilKMt.bg(zxVar, zxVar.IL(6));
                }

                @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                public void bg(long j2, long j3) {
                    if (!com.bytedance.sdk.openadsdk.activity.zx.this.bX.txA && com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.IL()) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.Lq();
                    }
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.eo.get()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.zx.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                    if (j2 != com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.Kg()) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.Ta();
                    }
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.IL()) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.bg(j2, j3);
                        int iEo = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eo(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.zx.this.bX.ldr));
                        boolean z2 = com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ja.Kg() && iEo != -1 && iEo >= 0;
                        com.bytedance.sdk.openadsdk.activity.zx zxVar = com.bytedance.sdk.openadsdk.activity.zx.this;
                        long j4 = j2 / 1000;
                        zxVar.iR = (int) (zxVar.bX.rri.DDQ() - j4);
                        int i = (int) j4;
                        if ((com.bytedance.sdk.openadsdk.activity.zx.this.bX.Fy.get() || com.bytedance.sdk.openadsdk.activity.zx.this.bX.VB.get()) && com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.IL()) {
                            com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.Lq();
                        }
                        if (com.bytedance.sdk.openadsdk.activity.zx.this.iR >= 0) {
                            com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.zx.this.iR), null);
                        }
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.LKE.eqN(i);
                        com.bytedance.sdk.openadsdk.activity.zx.this.bg(j2, j3);
                        if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ja != null && com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ja.bg() != null) {
                            com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ja.bg().setTime(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.zx.this.iR), i, 0, false);
                        }
                        com.bytedance.sdk.openadsdk.activity.zx.this.bg((j2 * 1.0f) / j3);
                        if (com.bytedance.sdk.openadsdk.activity.zx.this.iR > 0) {
                            if (z2 && i >= iEo && com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.vb() != 5) {
                                com.bytedance.sdk.openadsdk.activity.zx.this.bX.bg(true);
                                com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.zx.this.iR), com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText());
                                com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.zx(true);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.zx.this.iR), null);
                        }
                    }
                }
            });
            boolean zBg = this.bX.rri.bg(j, z, map, this.IL);
            if (zBg && !z) {
                this.ldr = (int) (java.lang.System.currentTimeMillis() / 1000);
            }
            return zBg;
        }
        com.bytedance.sdk.openadsdk.eqN.iR iRVar2 = new com.bytedance.sdk.openadsdk.eqN.iR();
        iRVar2.bg(java.lang.System.currentTimeMillis(), 1.0f);
        this.bX.rri.bg(this.bX.LKE.ldr(), iRVar2);
        com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar = new com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg() { // from class: com.bytedance.sdk.openadsdk.activity.zx.4
            boolean bg;

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, int i) {
                if (this.bg) {
                    return;
                }
                this.bg = true;
                com.bytedance.sdk.openadsdk.activity.zx.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.zx.this.Ta();
                if (!com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ny) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.rri();
                }
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.bg(j2, j2);
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.tuV.set(true);
                if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.bZw()) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.daV(1);
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.LKE.xxp();
                }
                if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.vb() == 21 && !com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.eqN()) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.IL(true);
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.LKE.xxp();
                }
                com.bytedance.sdk.openadsdk.activity.zx.this.zx = (int) (java.lang.System.currentTimeMillis() / 1000);
                if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.Ny) {
                    com.bytedance.sdk.openadsdk.activity.IL.zx zxVarIL = com.bytedance.sdk.openadsdk.activity.zx.this.IL(5);
                    zxVarIL.zx = true;
                    com.bytedance.sdk.openadsdk.activity.zx.this.kMt().bg(com.bytedance.sdk.openadsdk.activity.zx.this, zxVarIL);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.xxp.bX(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.IL(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL)) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bg(false, 5);
                    if (!com.bytedance.sdk.openadsdk.core.model.xxp.IL(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL) || com.bytedance.sdk.openadsdk.activity.zx.this.bX.Dt == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.Dt.bg(0L);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.xxp.bg(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL) && !com.bytedance.sdk.openadsdk.activity.zx.this.bX.vb.get()) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.bg(true);
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.zx(true);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.bX) {
                    if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.dX()) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.bX();
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.zx.this.bg(false, 5);
                    if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.bg("skip", true);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL.dX()) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.bX();
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.core.model.tuV.zx(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL)) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.bg("skip", true);
                }
                com.bytedance.sdk.openadsdk.activity.zx.this.Ja();
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void IL(long j2, int i) {
                com.bytedance.sdk.openadsdk.activity.zx.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.zx();
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.Ta();
                com.bytedance.sdk.openadsdk.activity.zx.this.rri();
                com.bytedance.sdk.openadsdk.activity.IL ilKMt = com.bytedance.sdk.openadsdk.activity.zx.this.kMt();
                com.bytedance.sdk.openadsdk.activity.zx zxVar = com.bytedance.sdk.openadsdk.activity.zx.this;
                ilKMt.bg(zxVar, zxVar.IL(3));
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.zx.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                com.bytedance.sdk.openadsdk.activity.zx.this.Ta();
                com.bytedance.sdk.openadsdk.activity.zx.this.rri();
                com.bytedance.sdk.openadsdk.activity.IL ilKMt = com.bytedance.sdk.openadsdk.activity.zx.this.kMt();
                com.bytedance.sdk.openadsdk.activity.zx zxVar = com.bytedance.sdk.openadsdk.activity.zx.this;
                ilKMt.bg(zxVar, zxVar.IL(6));
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
            public void bg(long j2, long j3) {
                if (!com.bytedance.sdk.openadsdk.activity.zx.this.bX.txA && com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.Lq();
                }
                if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.eo.get()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.zx.this.bg.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
                if (j2 != com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.Kg()) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.Ta();
                }
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.bg(j2, j3);
                com.bytedance.sdk.openadsdk.activity.zx zxVar = com.bytedance.sdk.openadsdk.activity.zx.this;
                long j4 = j2 / 1000;
                double d = j4;
                zxVar.iR = (int) (zxVar.bX.rri.DDQ() - d);
                if (com.bytedance.sdk.openadsdk.activity.zx.this.iR >= 0) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.zx.this.iR), null);
                }
                com.bytedance.sdk.openadsdk.activity.zx zxVar2 = com.bytedance.sdk.openadsdk.activity.zx.this;
                zxVar2.iR = (int) (zxVar2.bX.rri.DDQ() - d);
                int i = (int) j4;
                int iEo = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eo(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.zx.this.bX.ldr));
                boolean z2 = iEo >= 0;
                if ((com.bytedance.sdk.openadsdk.activity.zx.this.bX.Fy.get() || com.bytedance.sdk.openadsdk.activity.zx.this.bX.VB.get()) && com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.IL()) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.Lq();
                }
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.LKE.eqN(i);
                com.bytedance.sdk.openadsdk.activity.zx.this.bg(j2, j3);
                com.bytedance.sdk.openadsdk.activity.zx.this.bg((j2 * 1.0f) / j3);
                if (com.bytedance.sdk.openadsdk.activity.zx.this.iR > 0) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.eqN(true);
                    if (z2 && i >= iEo) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.bg(true);
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.zx.this.iR), com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText());
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.zx(true);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.ayS.bg(java.lang.String.valueOf(com.bytedance.sdk.openadsdk.activity.zx.this.iR), null);
                }
            }
        };
        this.bX.rri.bg(bgVar);
        if (this.bX.LKE.Lq != null) {
            this.bX.LKE.Lq.bg(bgVar);
        }
        boolean zBg2 = this.bX.rri.bg(j, z, null, this.IL);
        if (zBg2 && !z) {
            this.ldr = (int) (java.lang.System.currentTimeMillis() / 1000);
        }
        return zBg2;
    }

    public void bg(long j, long j2) {
        if (this.bX.Ny) {
            return;
        }
        long j3 = j + (((long) this.bX.sVc) * 1000);
        if (this.Fy == -1) {
            this.Fy = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(java.lang.String.valueOf(this.bX.ldr)).ldr;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= 30000 && j3 >= 27000) {
            rri();
        } else if ((j3 * 100) / j2 >= this.Fy) {
            rri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void c_() {
        Uq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg
    protected void iR() {
        DDQ();
        if (this.Kg.bg()) {
            this.bX.Ja.eo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.bg, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void PX() {
        rri();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    @Override // com.bytedance.sdk.openadsdk.activity.bg, com.bytedance.sdk.openadsdk.activity.ldr, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL
    public void yDt() {
        if (this.Kg.fE()) {
            int i = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(java.lang.String.valueOf(this.bX.ldr)).ldr;
            boolean z = false;
            if (com.bytedance.sdk.openadsdk.core.model.rri.tuV(this.bX.IL)) {
                if ((1.0d - (((double) this.iR) / this.bX.rri.DDQ())) * 100.0d >= i) {
                    z = true;
                }
            } else {
                boolean z2 = (1.0f - (this.bX.JAA.IL() / ((float) this.bX.IL.gtr()))) * 100.0f >= ((float) i);
                int iBg = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(java.lang.String.valueOf(this.bX.ldr));
                if (iBg == 0) {
                    boolean zZx = this.bX.VJ.PX().zx();
                    if (this.bX.JAA.bX()) {
                        zZx = true;
                    }
                    if (z2 && zZx) {
                        z = true;
                    }
                } else if (iBg == 1) {
                    z = z2;
                }
            }
            if (z) {
                rri();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final boolean z, boolean z2) {
        if (!z2 && kMt().WR().getBoolean("user_has_give_up_reward", false) && com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.bX.IL)) {
            VW();
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().Kg(java.lang.String.valueOf(this.bX.ldr))) {
            if (z) {
                Ja();
                return;
            } else {
                VW();
                return;
            }
        }
        if (kMt().WR().getBoolean("reward_verify", false)) {
            if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.bX.IL)) {
                VW();
                return;
            } else if (z) {
                Ja();
                return;
            } else {
                VW();
                return;
            }
        }
        this.bX.Fy.set(true);
        this.bX.rri.Lq();
        if (z) {
            this.bX.JAA.yDt();
        }
        final com.bytedance.sdk.openadsdk.core.widget.IL il = new com.bytedance.sdk.openadsdk.core.widget.IL(JAA());
        this.IL.Ta = il;
        if (z) {
            this.IL.Ta.bg(Ta).IL(yDt).bX(Lq);
        } else {
            this.IL.Ta.bg(vb).IL(xxp).bX(Lq);
        }
        this.IL.Ta.bg(new com.bytedance.sdk.openadsdk.core.widget.IL.bg() { // from class: com.bytedance.sdk.openadsdk.activity.zx.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.IL.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.rri.yDt();
                if (z) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.JAA.zx(1000);
                }
                il.dismiss();
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.Fy.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.IL.bg
            public void IL() {
                il.dismiss();
                com.bytedance.sdk.openadsdk.activity.zx.this.kMt().WR().putBoolean("user_has_give_up_reward", true);
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.Fy.set(false);
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.JAA.ldr(Integer.MAX_VALUE);
                if (!z) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.VW();
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(com.bytedance.sdk.openadsdk.activity.zx.this.bX.IL)) {
                    if (!com.bytedance.sdk.openadsdk.activity.zx.this.bX.JAA.bg()) {
                        com.bytedance.sdk.openadsdk.activity.zx.this.VW();
                        return;
                    } else {
                        com.bytedance.sdk.openadsdk.activity.zx.this.bX.JAA.bg(5);
                        return;
                    }
                }
                com.bytedance.sdk.openadsdk.activity.zx.this.bX.DDQ.ldr();
                if (com.bytedance.sdk.openadsdk.activity.zx.this.bX.JAA.bg()) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bX.JAA.bg(4);
                }
                com.bytedance.sdk.openadsdk.activity.zx.this.Ja();
            }
        }).show();
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
            jSONObject.put("play_start_ts", this.ldr);
            jSONObject.put("play_end_ts", this.zx);
            jSONObject.put("duration", iFy);
            jSONObject.put("user_id", this.VzQ);
            jSONObject.put("trans_id", com.bytedance.sdk.openadsdk.utils.rri.bg().replace("-", ""));
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.RewardAdScene", "", th);
            return null;
        }
    }

    public void rri() {
        if (kMt().WR().getBoolean("reward_verify", false) || kMt().Ta()) {
            return;
        }
        kMt().WR().putBoolean("reward_verify", true);
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().vb(java.lang.String.valueOf(this.bX.ldr))) {
            bg(true, this.bX.IL.LZ(), this.bX.IL.Fy(), 0, "");
        } else {
            com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(aGH(), new com.bytedance.sdk.openadsdk.core.Fy.IL() { // from class: com.bytedance.sdk.openadsdk.activity.zx.6
                @Override // com.bytedance.sdk.openadsdk.core.Fy.IL
                public void bg(int i, java.lang.String str) {
                    com.bytedance.sdk.openadsdk.activity.zx.this.bg(false, 0, "", i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.Fy.IL
                public void bg(com.bytedance.sdk.openadsdk.core.LZ.IL il) {
                    boolean z = il.IL;
                    com.bytedance.sdk.openadsdk.activity.zx.this.bg(il.IL, il.bX.bg(), il.bX.IL(), 0, "");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0078  */
    public void VW() {
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
        bgVar.bg(this.bX.rri.iR());
        bgVar.bX(this.bX.rri.tuV());
        bgVar.IL(this.bX.rri.VB());
        bgVar.bX(3);
        bgVar.eqN(this.bX.rri.VzQ());
        com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(this.bX.rri.bX(), bgVar, this.bX.rri.bg());
        com.bytedance.sdk.openadsdk.core.kMt.bX(this.bX.ldr);
        this.bX.rri.bg("skip", false);
        if (this.bX.bX) {
            bg(true, 4);
            if (com.bytedance.sdk.openadsdk.core.model.xxp.bg(this.bX.IL) && !this.bX.vb.get()) {
                Ja();
            }
        } else {
            Ja();
        }
        com.bytedance.sdk.openadsdk.core.PX.bg bgVarHi = this.bX.IL.hi();
        if (bgVarHi != null) {
            com.bytedance.sdk.openadsdk.core.PX.eqN eqnBg = bgVarHi.bg();
            long jIR = this.bX.rri.iR();
            eqnBg.ldr(jIR);
            eqnBg.zx(jIR);
        }
        com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.bX.IL, 5);
    }
}
