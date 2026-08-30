package com.bytedance.sdk.openadsdk.component.reward.IL;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IL extends com.bytedance.sdk.openadsdk.component.reward.IL.bg {
    private com.bytedance.sdk.openadsdk.PX.zx Lq;
    protected com.bytedance.sdk.openadsdk.core.IL.zx PX;
    public com.bytedance.sdk.openadsdk.core.widget.IL Ta;
    protected java.lang.String VB;
    public android.widget.LinearLayout yDt;

    public interface bg {
        void bg(boolean z);
    }

    protected boolean DDQ() {
        return true;
    }

    public void Ta() {
    }

    public abstract void bg(android.widget.FrameLayout frameLayout);

    public com.bytedance.sdk.openadsdk.component.reward.IL.IL.bg eqN() {
        return null;
    }

    public abstract void iR();

    public abstract boolean ldr();

    public void tuV() {
    }

    public abstract boolean zx();

    public IL(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        super(bgVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.bg
    public void bg(com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il, com.bytedance.sdk.component.utils.JAA jaa) {
        super.bg(il, jaa);
        if (this.bg.IL.bg() && this.bg.RiO) {
            this.bg.VJ.bg(false);
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
            this.bg.JAA.PX();
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.component.reward.view.iR iRVar) {
        bg(iRVar, this.bg);
    }

    public com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout Kg() {
        return new com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout(this.bg.Dxa);
    }

    public android.view.View WR() {
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(this.bg.uu);
        bXVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.hSp);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqnIL = com.bytedance.sdk.openadsdk.core.widget.iR.IL(this.bg.uu);
        eqnIL.setId(520093708);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg.uu, 20.0f);
        layoutParams.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg.uu, 16.0f);
        eqnIL.setLayoutParams(layoutParams);
        eqnIL.setContentDescription(com.bytedance.sdk.component.utils.Fy.bg(this.bg.uu, "tt_ad_close_text"));
        eqnIL.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.widget.PAGLogoView pAGLogoView = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(this.bg.uu);
        pAGLogoView.setId(520093757);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg.uu, 14.0f));
        layoutParams2.gravity = 8388691;
        pAGLogoView.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(this.bg.uu);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.Fb);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg.uu, 32.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg.uu, 14.0f));
        layoutParams3.gravity = 8388693;
        eqn.setLayoutParams(layoutParams3);
        eqn.setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg.uu, 9.0f), 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg.uu, 9.0f), 0);
        eqn.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.bytedance.sdk.openadsdk.core.widget.VB vb = new com.bytedance.sdk.openadsdk.core.widget.VB(this.bg.uu);
        vb.setId(com.bytedance.sdk.openadsdk.utils.Ta.OLh);
        vb.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        vb.setClickable(true);
        vb.setFocusable(true);
        bXVar.addView(pAGLogoView);
        bXVar.addView(eqn);
        bXVar.addView(vb);
        if (!this.bg.IL.eq() || !this.bg.Ny || this.bg.bg != 1) {
            com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.bX(this.bg.uu);
            bXVar2.setId(com.bytedance.sdk.openadsdk.utils.Ta.Rh);
            bXVar2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
            bXVar.addView(bXVar2);
        }
        bXVar.addView(eqnIL);
        return bXVar;
    }

    public android.view.View eo() {
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar;
        if (this.IL.Uq() != 5) {
            iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(this.bg.uu);
            iRVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.waE);
        } else {
            iRVar = null;
        }
        new java.lang.StringBuilder("getLoadingFrameView").append(iRVar);
        return iRVar;
    }

    public void VB() {
        this.bg.Uw.bg(this.bg.eqN);
        this.bg.LKE.IL();
        this.bg.ZQc.bg();
        if (!this.bg.IL.HXG()) {
            if (this.bg.iR && android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.tuV.bg(this.bg.Dxa, this.IL))) {
                PX();
            }
            this.bg.VJ.bg();
            this.bg.daV.bg();
        }
        this.bg.JAA.Lq();
        this.bg.ayS.bg();
        if (com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL)) {
            com.bytedance.sdk.component.WR.eqN eqnEo = this.bg.VJ.eo();
            if (eqnEo != null) {
                eqnEo.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            }
            this.bg.VJ.VB().setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            this.bg.ayS.bX(true);
            if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
                this.bg.LKE.eqN();
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) eqnEo, 4);
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.bg.VJ.VB(), 0);
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.ldr(this.bg.IL)) {
            this.bg.LKE.eqN();
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.bg.VJ.eo(), 4);
        }
        if (com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.bg.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.bg.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.bg.IL)) {
            return;
        }
        this.bg.LKE.bg(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg.Dxa, this.bg.gXn), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg.Dxa, this.bg.GZ));
        this.bg.kMt.bg();
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
            this.bg.VJ.bg(true);
            this.bg.VJ.zx();
            bg(false, false, false, com.bytedance.sdk.openadsdk.eqN.IL.C0157IL.bX);
        } else if (this.bg.Ys) {
            this.bg.LKE.bg(0);
        }
    }

    public void PX() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.bg.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Ta);
        this.yDt = linearLayout;
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) linearLayout, 8);
        this.bg.zCS = new com.bytedance.sdk.openadsdk.common.Ta(this.bg.uu, this.bg.IL, "landingpage_endcard");
        this.bg.zCS.bX().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.IL.IL.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.bytedance.sdk.openadsdk.component.reward.IL.IL.this.bg.LKE.eo().performClick();
            }
        });
        this.yDt.addView(this.bg.zCS.zx(), new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.bg.VJ.bg(this.bg.zCS);
    }

    public void bg(boolean z, boolean z2, boolean z3, int i) {
        this.bg.ZQc.bg(z, z2, z3, this, i);
    }

    public void yDt() {
        com.bytedance.sdk.openadsdk.core.widget.IL il = this.Ta;
        if (il == null || !il.isShowing()) {
            return;
        }
        this.Ta.dismiss();
    }

    public void Lq() {
        if (this.bg.iR) {
            return;
        }
        this.bg.ayS.ldr();
        if (this.bg.Ny && (this.bg.kU instanceof com.bytedance.sdk.openadsdk.activity.bg)) {
            return;
        }
        this.bg.LKE.zx(0);
    }

    public void vb() {
        this.eo.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
    }

    public void xxp() {
        if (!com.bytedance.sdk.openadsdk.core.model.rri.eo(this.IL) || this.bg.VJ.CQc()) {
            VzQ();
        }
        if (this.bg == null) {
            return;
        }
        if (this.bg.Dt != null) {
            this.bg.Dt.bg();
        }
        this.bg.bg();
    }

    protected void VzQ() {
        if (this.bg.eo.get() && !this.bg.iR && this.bg.LZ.getAndSet(false) && (this.bg.Kg >= 0 || this.bg.Kg == -1)) {
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.what = 700;
            messageObtain.arg1 = this.bg.Kg;
            this.bg.bN.sendMessage(messageObtain);
        }
        if (this.bg.WR <= 0 || !this.bg.tC.getAndSet(false)) {
            return;
        }
        android.os.Message messageObtain2 = android.os.Message.obtain();
        messageObtain2.what = 900;
        messageObtain2.arg1 = this.bg.WR;
        this.bg.bN.sendMessage(messageObtain2);
    }

    public void Fy() {
        if (this.bg == null) {
            return;
        }
        this.bg.txA = false;
        boolean z = this.bg.txA;
        boolean z2 = this.bg.RJ;
        if (!this.bg.VB.get()) {
            this.bg.rri.eo();
        }
        vb();
        this.bg.VJ.LZ();
        this.bg.JAA.vb();
        this.bg.tC.set(true);
        if (this.bg.eo.get()) {
            this.bg.LZ.set(true);
        }
        if (this.bg.Dt != null) {
            this.bg.Dt.IL();
        }
        this.bg.IL();
    }

    public void LZ() {
        if (this.bg == null) {
            return;
        }
        if (this.bg.LKE != null) {
            this.bg.LKE.vb();
        }
        boolean z = this.bg.RJ;
        this.bg.VW.bg();
        com.bytedance.sdk.openadsdk.utils.DeviceUtils.iR();
        this.bg.VJ.Fy();
        if (this.bg.RJ) {
            this.bg.uu.runOnUiThread(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.IL.IL.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.component.reward.IL.IL.this.bg.VW.bg() > 0) {
                        com.bytedance.sdk.openadsdk.component.reward.IL.IL.this.bg.VW.bg(false);
                    }
                }
            });
        }
    }

    public void tC() {
        if (this.bg.Ja != null) {
            this.bg.Ja.ldr();
        }
        if (this.bg.LKE != null) {
            this.bg.LKE.yDt();
        }
        this.bg.rri.JAA();
        if (!zx()) {
            this.bg.eo.get();
        }
        this.bg.VJ.vb();
        this.bg.JAA.iR(com.bytedance.sdk.openadsdk.component.reward.bg.Kg.bg);
        this.bg.LKE.PX();
        this.bg.ZQc.bX();
        this.bg.Uw.IL();
        if (this.bg.Dt != null) {
            this.bg.Dt.bX();
        }
    }

    public void rri() {
        int iTuV;
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().LZ(java.lang.String.valueOf(this.bg.ldr)) == 1) {
            if (this.bg.eqN) {
                if (com.bytedance.sdk.openadsdk.core.model.rri.bX(this.bg.IL)) {
                    iTuV = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(java.lang.String.valueOf(this.bg.ldr), true);
                } else {
                    iTuV = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eo(java.lang.String.valueOf(this.bg.ldr));
                }
            } else if (com.bytedance.sdk.openadsdk.core.model.rri.bX(this.bg.IL)) {
                iTuV = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(java.lang.String.valueOf(this.bg.ldr), false);
            } else {
                iTuV = com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV(java.lang.String.valueOf(this.bg.ldr));
            }
            if (this.bg.LKE != null && this.bg.LKE.WR()) {
                if (this.bg.LKE != null) {
                    this.bg.LKE.eo().performClick();
                }
            } else if ((!this.bg.eo.get() || com.bytedance.sdk.openadsdk.core.model.rri.bX(this.bg.IL)) && iTuV != -1) {
                if (((this.bg.rri == null || this.bg.rri.Kg() < ((long) iTuV) * 1000) && (this.bg.JAA == null || !this.bg.JAA.eqN(iTuV))) || this.bg.ayS == null) {
                    return;
                }
                this.bg.ayS.eqN();
            }
        }
    }

    public void kMt() {
        this.bg.ayS.bX();
        this.bg.ayS.zx(true);
    }

    public void JAA() {
        this.PX = this.bg.DDQ.bX();
    }

    public void Ja() {
        if (!ldr() && ((this instanceof com.bytedance.sdk.openadsdk.component.reward.IL.iR) || (this instanceof com.bytedance.sdk.openadsdk.component.reward.IL.Kg))) {
            this.bg.DDQ.IL();
            return;
        }
        if (!this.WR.bg(this.zx.WR(), false)) {
            this.eo.removeMessages(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
            if (this.bg.Ny && (this.bg.kU instanceof com.bytedance.sdk.openadsdk.activity.bg)) {
                ((com.bytedance.sdk.openadsdk.activity.bg) this.bg.kU).LZ();
            } else {
                bg(com.bytedance.sdk.openadsdk.eqN.IL.C0157IL.bg);
                this.zx.bg(!this.zx.Uw() ? 1 : 0, 4);
            }
        }
        if (this.bg == null || this.bg.IL == null || this.bg.Dt == null || !this.bg.IL.Fb()) {
            return;
        }
        this.bg.Dt.bg(this.bg.rri.Fy());
    }

    public void bg(int i) {
        this.zx.Ta();
        bg(false, true, false, i);
        if (this.bg.eqN) {
            this.WR.bg(10000);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.PX.zx zxVar) {
        this.Lq = zxVar;
        bX();
        if (!this.bg.IL.HXG() && DDQ()) {
            Uw();
        }
        if (DDQ()) {
            this.bg.ZQc.IL();
        }
        if (com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.bg.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.bg.IL)) {
            this.eo.sendEmptyMessageDelayed(500, 100L);
        }
        this.bg.LKE.bg(this.bg.lM == 100.0f);
        JAA();
        iR();
    }

    public final void Uw() {
        if (this.bg.uu.isFinishing()) {
            return;
        }
        this.bg.VJ.Lq();
        java.lang.String str = this.bg.eqN ? "reward_endcard" : "fullscreen_endcard";
        this.bg.VJ.bg(this.Lq, str, this.bg.qC);
        this.bg.JAA.bg(this.Lq, this.bg.RJ);
        this.bg.VJ.bg(str, this.bg.qC);
        this.bg.VJ.zx();
    }

    public void bg(android.os.Message message) {
        int i = message.what;
        int i2 = message.what;
        if (i2 == 1) {
            kMt();
            return;
        }
        if (i2 == 300) {
            if (this.bg.Ny && (this.bg.kU instanceof com.bytedance.sdk.openadsdk.activity.bg)) {
                ((com.bytedance.sdk.openadsdk.activity.bg) this.bg.kU).LZ();
            } else {
                bg(com.bytedance.sdk.openadsdk.eqN.IL.C0157IL.IL);
                this.bg.rri.bg(!this.bg.rri.Uw() ? 1 : 0, 1 ^ (this.bg.rri.Uw() ? 1 : 0));
            }
            if (this.bg.IL.hi() == null || this.bg.IL.hi().bg() == null) {
                return;
            }
            this.bg.IL.hi().bg().bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg.GENERAL_LINEAR_AD_ERROR);
            return;
        }
        if (i2 == 400) {
            this.bg.rri.Ta();
            bg(false, true, false, 3);
            return;
        }
        if (i2 == 500) {
            if (!com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL)) {
                this.bg.ayS.bX(false);
            }
            com.bytedance.sdk.component.WR.eqN eqnEo = this.bg.VJ.eo();
            if (eqnEo != null && eqnEo.getWebView() != null) {
                eqnEo.WR();
                eqnEo.getWebView().resumeTimers();
            }
            if (this.bg.VJ.eo() != null) {
                this.bg.VJ.bg(1.0f);
                this.bg.LKE.bg(1.0f);
            }
            if (!this.bg.IL.fE() && this.bg.rri.IL() && this.bg.VzQ.get()) {
                this.bg.rri.Ta();
                return;
            }
            return;
        }
        if (i2 == 600) {
            Lq();
            return;
        }
        if (i2 == 700) {
            int i3 = message.arg1;
            if (this.bg.LZ.get()) {
                return;
            }
            if (i3 > 0) {
                this.bg.ayS.IL();
                this.bg.ayS.bg((i3 / 1000) + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                this.bg.ayS.zx(false);
                android.os.Message messageObtain = android.os.Message.obtain();
                messageObtain.what = 700;
                messageObtain.arg1 = i3 - 1000;
                this.bg.Kg -= 1000;
                this.eo.sendMessageDelayed(messageObtain, 1000L);
                return;
            }
            this.eo.removeMessages(700);
            if (com.bytedance.sdk.openadsdk.core.model.rri.WR(this.IL)) {
                if (this.bg.JAA.iR() || !this.bg.VJ.VzQ()) {
                    Lq();
                    return;
                } else {
                    kMt();
                    return;
                }
            }
            Lq();
            return;
        }
        if (i2 == 800) {
            if (!com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bg.IL)) {
                this.bg.ayS.bX(false);
            }
            this.bg.LKE.bg(1.0f);
            if (!this.bg.IL.fE() && this.bg.rri.IL() && this.bg.VzQ.get()) {
                this.bg.rri.Ta();
                return;
            }
            return;
        }
        if (i2 == 900 && !this.bg.tC.get()) {
            int i4 = message.arg1;
            double dDDQ = this.bg.rri.DDQ();
            bg(i4, (long) (1000.0d * dDDQ));
            if (i4 > 0) {
                this.bg.ayS.IL();
                this.bg.ayS.bg((i4 / 1000) + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                this.bg.ayS.zx(false);
                android.os.Message messageObtain2 = android.os.Message.obtain();
                messageObtain2.what = 900;
                messageObtain2.arg1 = i4 - 1000;
                this.bg.WR = messageObtain2.arg1;
                this.eo.sendMessageDelayed(messageObtain2, 1000L);
                if (this.bg.Ny && (this.bg.kU instanceof com.bytedance.sdk.openadsdk.activity.bg) && dDDQ > 0.0d) {
                    ((com.bytedance.sdk.openadsdk.activity.bg) this.bg.kU).bg((float) (1.0d - (((double) (i4 / 1000.0f)) / dDDQ)));
                    return;
                }
                return;
            }
            this.eo.removeMessages(900);
            Lq();
            com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.bg.kU;
            if (this.bg.Ny && (ldrVar instanceof com.bytedance.sdk.openadsdk.activity.bg)) {
                ldrVar.kMt().bg(ldrVar, new com.bytedance.sdk.openadsdk.activity.IL.zx(5, this.bg));
            }
        }
    }

    private void bg(long j, long j2) {
        long j3 = j2 - j;
        if (this.bg.uu instanceof com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity) {
            ((com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity) this.bg.uu).bg(j3, j2);
        } else if (this.bg.qC instanceof com.bytedance.sdk.openadsdk.activity.zx) {
            ((com.bytedance.sdk.openadsdk.activity.zx) this.bg.qC).bg(j3, j2);
        }
    }

    static void bg(android.widget.FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        final com.bytedance.sdk.openadsdk.core.zx.eqN eqn;
        android.content.Context context = frameLayout.getContext();
        if (bgVar.RiO) {
            com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
            bXVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.eo);
            frameLayout.addView(bXVar, new android.widget.FrameLayout.LayoutParams(-1, -1));
            android.widget.FrameLayout frameLayoutBg = bg(context);
            java.lang.String strBg = "";
            if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(bgVar.IL)) {
                com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = bgVar.IL.Dxa();
                if (ilDxa != null) {
                    strBg = ilDxa.eo();
                }
            } else {
                java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM = bgVar.IL.lM();
                if (listLM != null && !listLM.isEmpty()) {
                    strBg = listLM.get(0).bg();
                }
            }
            if (android.text.TextUtils.isEmpty(strBg)) {
                eqn = null;
            } else {
                eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
                eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.ULi);
                eqn.setTag(com.bytedance.sdk.openadsdk.utils.Ta.ULi, strBg);
                eqn.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                frameLayoutBg.addView(eqn);
            }
            bXVar.addView(frameLayoutBg);
            com.bytedance.sdk.openadsdk.component.reward.view.bX bXVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.bX(context);
            bXVar2.setId(com.bytedance.sdk.openadsdk.utils.Ta.PX);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(bXVar2, layoutParams);
            bXVar2.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.IL.IL.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    android.view.View viewFindViewById = bgVar.CQc.findViewById(520093757);
                    if (viewFindViewById != null) {
                        android.view.ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams) {
                            ((android.widget.FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    android.view.View viewFindViewById2 = bgVar.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Fb);
                    if (viewFindViewById2 != null) {
                        android.view.ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof android.widget.FrameLayout.LayoutParams) {
                            ((android.widget.FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    android.view.View viewFindViewById3 = bgVar.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Az);
                    if (viewFindViewById3 != null) {
                        android.view.ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof android.widget.FrameLayout.LayoutParams) {
                            ((android.widget.FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.zx.eqN eqn2 = eqn;
                    if (eqn2 != null) {
                        android.view.ViewGroup.LayoutParams layoutParams5 = eqn2.getLayoutParams();
                        if (layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams) {
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            eqn.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
            zxVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.Ta);
            zxVar.setOrientation(1);
            zxVar.setVisibility(8);
            frameLayout.addView(zxVar, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        if (bgVar.jz) {
            com.bytedance.sdk.component.WR.eqN eqn2 = new com.bytedance.sdk.component.WR.eqN(context, true);
            eqn2.setId(com.bytedance.sdk.openadsdk.utils.Ta.yDt);
            eqn2.setLayerType(2, null);
            eqn2.setVisibility(4);
            frameLayout.addView(eqn2, new android.widget.FrameLayout.LayoutParams(-1, -1));
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
            frameLayout2.setId(com.bytedance.sdk.openadsdk.utils.Ta.Lq);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new android.widget.FrameLayout.LayoutParams(-1, -1));
            if (com.bytedance.sdk.openadsdk.core.model.rri.IL(bgVar.IL)) {
                com.bytedance.sdk.openadsdk.core.zx.bX bXVar3 = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
                bXVar3.setId(com.bytedance.sdk.openadsdk.utils.Ta.GEa);
                bXVar3.setVisibility(4);
                frameLayout.addView(bXVar3, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
        }
        com.bytedance.sdk.component.WR.eqN eqn3 = new com.bytedance.sdk.component.WR.eqN(context, true);
        eqn3.setId(com.bytedance.sdk.openadsdk.utils.Ta.vb);
        eqn3.setVisibility(8);
        frameLayout.addView(eqn3, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    protected static android.widget.FrameLayout bg(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        bXVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.VB);
        bXVar.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        bXVar.setLayoutParams(layoutParams);
        return bXVar;
    }
}
