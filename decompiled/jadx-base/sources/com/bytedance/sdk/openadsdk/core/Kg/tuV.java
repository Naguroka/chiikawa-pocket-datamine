package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class tuV extends com.bytedance.sdk.openadsdk.core.Kg.Fy implements com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX, com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN {
    boolean IL;
    private com.bytedance.sdk.openadsdk.core.Kg.Lq Uq;
    private long VJ;
    private long VW;
    private com.bytedance.sdk.openadsdk.multipro.IL.bg aGH;
    boolean bX;
    int bg;
    private com.bytedance.sdk.openadsdk.bg.IL.bX daV;
    int eqN;
    int iR;
    boolean ldr;
    boolean zx;

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void IL() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void zx() {
    }

    public tuV(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, java.lang.String str) {
        super(context, tuv, adSlot, str, false, true);
        this.bg = 1;
        this.IL = false;
        this.bX = true;
        this.zx = true;
        this.ldr = true;
        this.iR = -1;
        iR();
    }

    protected void iR() {
        this.PX = new android.widget.FrameLayout(this.Kg);
        int iIGR = this.VB != null ? this.VB.IGR() : 0;
        this.eqN = iIGR;
        eqN(iIGR);
        vb();
        addView(this.PX, new android.widget.FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    private void vb() {
        try {
            this.aGH = new com.bytedance.sdk.openadsdk.multipro.IL.bg();
            com.bytedance.sdk.openadsdk.core.Kg.Lq lq = new com.bytedance.sdk.openadsdk.core.Kg.Lq(this.Kg, this.VB, this.WR, this.JAA);
            this.Uq = lq;
            lq.setShouldCheckNetChange(false);
            this.Uq.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.IL() { // from class: com.bytedance.sdk.openadsdk.core.Kg.tuV.1
                @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.IL
                public void bg(boolean z, long j, long j2, long j3, boolean z2) {
                    com.bytedance.sdk.openadsdk.core.Kg.tuV.this.aGH.bg = z;
                    com.bytedance.sdk.openadsdk.core.Kg.tuV.this.aGH.zx = j;
                    com.bytedance.sdk.openadsdk.core.Kg.tuV.this.aGH.ldr = j2;
                    com.bytedance.sdk.openadsdk.core.Kg.tuV.this.aGH.iR = j3;
                    com.bytedance.sdk.openadsdk.core.Kg.tuV.this.aGH.eqN = z2;
                }
            });
            this.Uq.setVideoAdLoadListener(this);
            this.Uq.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.WR)) {
                this.Uq.setIsAutoPlay(this.IL ? this.eo.isAutoPlay() : this.bX);
            } else if ("open_ad".equals(this.WR)) {
                this.Uq.setIsAutoPlay(true);
            } else {
                this.Uq.setIsAutoPlay(this.bX);
            }
            if ("open_ad".equals(this.WR)) {
                this.Uq.setIsQuiet(true);
            } else {
                this.tC = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bX(java.lang.String.valueOf(this.eqN));
                this.Uq.setIsQuiet(this.tC);
            }
            this.Uq.eqN();
        } catch (java.lang.Exception unused) {
            this.Uq = null;
        }
    }

    void eqN(int i) {
        int iIL = com.bytedance.sdk.openadsdk.core.VzQ.eqN().IL(i);
        if (3 == iIL) {
            this.IL = false;
            this.bX = false;
        } else if (4 == iIL) {
            this.IL = true;
        } else {
            int iBX = com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            if (1 == iIL) {
                this.IL = false;
                this.bX = com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX);
            } else if (2 == iIL) {
                if (com.bytedance.sdk.openadsdk.utils.ayS.zx(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.ldr(iBX)) {
                    this.IL = false;
                    this.bX = true;
                }
            } else if (5 == iIL && (com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.ldr(iBX))) {
                this.IL = false;
                this.bX = true;
            }
        }
        if (this.bX) {
            return;
        }
        this.bg = 3;
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg getVideoModel() {
        return this.aGH;
    }

    private void setShowAdInteractionView(boolean z) {
        com.bytedance.sdk.openadsdk.core.Kg.Lq lq = this.Uq;
        if (lq != null) {
            lq.setShowAdInteractionView(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.component.adexpress.IL.Lq
    public void bg(com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn, com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        this.DDQ = eqn;
        this.iR = eqn.bX();
        if ((this.DDQ instanceof com.bytedance.sdk.openadsdk.core.Kg.kMt) && ((com.bytedance.sdk.openadsdk.core.Kg.kMt) this.DDQ).vb() != null) {
            ((com.bytedance.sdk.openadsdk.core.Kg.kMt) this.DDQ).vb().bg((com.bytedance.sdk.openadsdk.core.Kg.yDt) this);
        }
        if (ydt != null && ydt.bX()) {
            IL(ydt);
        }
        super.bg(eqn, ydt);
    }

    private void IL(final com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        if (ydt == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.tuV.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.Kg.tuV.this.bX(ydt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX(com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        int i;
        double dLdr = ydt.ldr();
        double dIR = ydt.iR();
        double dKg = ydt.Kg();
        double dWR = ydt.WR();
        if ((dKg != 0.0d && dWR != 0.0d) || (i = this.iR) == 7 || i == 10) {
            int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, (float) dLdr);
            int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, (float) dIR);
            int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, (float) dKg);
            int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, (float) dWR);
            float fMin = java.lang.Math.min(java.lang.Math.min(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, ydt.PX()), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, ydt.Ta())), java.lang.Math.min(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, ydt.yDt()), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, ydt.Lq())));
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.PX.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new android.widget.FrameLayout.LayoutParams(iBX3, iBX4);
            }
            layoutParams.width = iBX3;
            layoutParams.height = iBX4;
            layoutParams.topMargin = iBX2;
            layoutParams.leftMargin = iBX;
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            this.PX.setLayoutParams(layoutParams);
            this.PX.removeAllViews();
            if (this.Uq != null) {
                int i2 = this.iR;
                if ((i2 == 7 || i2 == 10) && (ydt instanceof com.bytedance.sdk.openadsdk.core.VB.eqN.IL)) {
                    android.widget.FrameLayout frameLayoutVb = ((com.bytedance.sdk.openadsdk.core.VB.eqN.IL) ydt).vb();
                    if (frameLayoutVb != null) {
                        frameLayoutVb.removeAllViews();
                        frameLayoutVb.addView(this.Uq, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    }
                } else if (ydt.bg() != null) {
                    if (this.ldr) {
                        ydt.bg().setTag(com.bytedance.sdk.component.adexpress.dynamic.bg.ldr, 1);
                        ((android.widget.FrameLayout) ydt.bg()).removeAllViews();
                        ((android.widget.FrameLayout) ydt.bg()).addView(this.Uq, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        this.ldr = false;
                    }
                } else {
                    this.PX.addView(this.Uq);
                }
                com.bytedance.sdk.openadsdk.utils.ZQc.IL(this.PX, fMin);
                this.Uq.bg(0L, true, false);
                eqN(this.eqN);
                if (!com.bytedance.sdk.component.utils.Lq.eqN(this.Kg) && !this.bX && this.zx) {
                    this.Uq.zx();
                }
                if (android.text.TextUtils.equals("embeded_ad", this.WR)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg(boolean z) {
        com.bytedance.sdk.openadsdk.core.Kg.Lq lq = this.Uq;
        if (lq != null) {
            lq.setIsQuiet(z);
            setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg(int i) {
        com.bytedance.sdk.openadsdk.core.Kg.Lq lq = this.Uq;
        if (lq == null) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
            return;
        }
        if (i == 1) {
            lq.bg(0L, true, false);
            return;
        }
        if (i == 2 || i == 3) {
            lq.setCanInterruptVideoPlay(true);
            this.Uq.performClick();
        } else if (i == 4) {
            lq.getNativeVideoController().eqN();
        } else {
            if (i != 5) {
                return;
            }
            lq.bg(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.component.adexpress.IL.Kg
    public void bg(android.view.View view, int i, com.bytedance.sdk.component.adexpress.bX bXVar) {
        if (i == -1 || bXVar == null) {
            return;
        }
        if (i == 11) {
            try {
                com.bytedance.sdk.openadsdk.core.Kg.Lq lq = this.Uq;
                if (lq != null) {
                    lq.setCanInterruptVideoPlay(true);
                    this.Uq.performClick();
                    if (this.Ta) {
                        this.Uq.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.yda).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        super.bg(view, i, bXVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public long bX() {
        return this.VW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public int eqN() {
        com.bytedance.sdk.openadsdk.core.Kg.Lq lq;
        if (this.bg == 3 && (lq = this.Uq) != null) {
            lq.eqN();
        }
        com.bytedance.sdk.openadsdk.core.Kg.Lq lq2 = this.Uq;
        if (lq2 == null || !lq2.getNativeVideoController().vb()) {
            return this.bg;
        }
        return 1;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void d_() {
        this.zx = false;
        this.bg = 2;
        com.bytedance.sdk.openadsdk.bg.IL.bX bXVar = this.daV;
        if (bXVar != null) {
            bXVar.bg(null);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void g_() {
        this.zx = false;
        this.Ta = true;
        this.bg = 3;
        com.bytedance.sdk.openadsdk.bg.IL.bX bXVar = this.daV;
        if (bXVar != null) {
            bXVar.IL(null);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void h_() {
        this.zx = false;
        this.Ta = false;
        this.bg = 2;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void bg(long j, long j2) {
        this.zx = false;
        int i = this.bg;
        if (i != 5 && i != 3 && j > this.VW) {
            this.bg = 2;
        }
        this.VW = j;
        this.VJ = j2;
        if (this.Uw != null && this.Uw.IL() != null) {
            this.Uw.IL().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        if (this.DDQ instanceof com.bytedance.sdk.openadsdk.core.VB.eqN.bX) {
            ((com.bytedance.sdk.openadsdk.core.VB.eqN.bX) this.DDQ).setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        IL(j, j2);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void i_() {
        this.zx = false;
        this.bg = 5;
        if (this.Uw != null && this.Uw.IL() != null) {
            this.Uw.IL().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.bg.IL.bX bXVar = this.daV;
        if (bXVar != null) {
            bXVar.bX(null);
        }
        if (this.DDQ instanceof com.bytedance.sdk.openadsdk.core.VB.eqN.bX) {
            ((com.bytedance.sdk.openadsdk.core.VB.eqN.bX) this.DDQ).onvideoComplate();
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN
    public void bg(int i, int i2) {
        this.VW = this.VJ;
        this.bg = 4;
        com.bytedance.sdk.openadsdk.bg.IL.bX bXVar = this.daV;
        if (bXVar != null) {
            bXVar.bg(i, i2);
        }
    }

    protected com.bytedance.sdk.openadsdk.core.Kg.Lq getExpressVideoView() {
        return this.Uq;
    }

    public com.bykv.vk.openvk.bg.bg.bg.eqN.bX getVideoController() {
        com.bytedance.sdk.openadsdk.core.Kg.Lq lq = this.Uq;
        if (lq != null) {
            return lq.getNativeVideoController();
        }
        return null;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.bg.IL.bX bXVar) {
        this.daV = bXVar;
    }

    public com.bytedance.sdk.openadsdk.bg.IL.bX getVideoAdListener() {
        return this.daV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg(int i, java.lang.String str) {
        this.VzQ = i;
        this.tuV = str;
    }

    private void IL(long j, long j2) {
        int iAbs = (int) java.lang.Math.abs(((long) this.VzQ) - j);
        if (this.VzQ < 0 || iAbs > 500 || this.VzQ > j2 || iAbs >= 500 || this.Fy.contains(this.tuV)) {
            return;
        }
        if (this.VzQ > j) {
            postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.tuV.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.Kg.tuV.this.Uq.setCanInterruptVideoPlay(true);
                    com.bytedance.sdk.openadsdk.core.Kg.tuV.this.Uq.performClick();
                    com.bytedance.sdk.openadsdk.core.Kg.tuV tuv = com.bytedance.sdk.openadsdk.core.Kg.tuV.this;
                    tuv.IL(tuv.VzQ, com.bytedance.sdk.openadsdk.core.Kg.tuV.this.tuV);
                }
            }, iAbs);
        } else {
            this.Uq.setCanInterruptVideoPlay(true);
            this.Uq.performClick();
            IL(this.VzQ, this.tuV);
        }
        this.Fy.add(this.tuV);
    }
}
