package com.bytedance.sdk.openadsdk.component.reward.view;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.core.Kg.Fy {
    public static float bg = 100.0f;
    com.bytedance.sdk.openadsdk.core.Kg.yDt IL;
    com.bytedance.sdk.openadsdk.core.Kg.xxp bX;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg eqN;

    public IL(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar, com.bytedance.sdk.openadsdk.AdSlot adSlot, java.lang.String str) {
        super(bgVar.uu, bgVar.IL, adSlot, str, bgVar.RJ, !bgVar.Ny);
        this.eqN = bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy
    protected void ldr() {
        this.yDt = true;
        this.PX = new android.widget.FrameLayout(this.Kg);
        if (!com.bytedance.sdk.openadsdk.core.VB.bX.bg(this.VB) && !com.bytedance.sdk.openadsdk.core.VB.bX.IL(this.VB)) {
            addView(this.PX, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        super.ldr();
        com.bytedance.sdk.component.WR.eqN webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        iR();
    }

    private void iR() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.IL.bX() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.IL.1
            @Override // com.bytedance.sdk.component.adexpress.IL.bX
            public boolean bg(android.view.ViewGroup viewGroup, int i) {
                try {
                    ((com.bytedance.sdk.openadsdk.core.Kg.Fy) viewGroup).PX();
                    com.bytedance.sdk.openadsdk.component.reward.view.IL.this.bX = new com.bytedance.sdk.openadsdk.core.Kg.xxp(viewGroup.getContext());
                    com.bytedance.sdk.openadsdk.component.reward.view.IL.this.bX.bg(com.bytedance.sdk.openadsdk.component.reward.view.IL.this.VB, (com.bytedance.sdk.openadsdk.core.Kg.Fy) viewGroup, com.bytedance.sdk.openadsdk.component.reward.view.IL.this.eqN.CQc);
                    return true;
                } catch (java.lang.Exception unused) {
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.component.adexpress.IL.Lq
    public void bg(com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn, com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        this.DDQ = eqn;
        if (this.VB != null && this.VB.Fb()) {
            super.bg(eqn, ydt);
            return;
        }
        if (eqn instanceof com.bytedance.sdk.openadsdk.core.Kg.kMt) {
            com.bytedance.sdk.openadsdk.core.Kg.kMt kmt = (com.bytedance.sdk.openadsdk.core.Kg.kMt) eqn;
            if (kmt.vb() != null) {
                kmt.vb().bg((com.bytedance.sdk.openadsdk.core.Kg.yDt) this);
            }
        }
        if (ydt != null && ydt.bX()) {
            IL(ydt);
        }
        super.bg(eqn, ydt);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy
    protected boolean bg(com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        if ((this.VB instanceof com.bytedance.sdk.openadsdk.core.model.Fy) && ((com.bytedance.sdk.openadsdk.core.model.Fy) this.VB).Uzu() && ydt.bX() && ydt.IL() == 1) {
            return false;
        }
        return super.bg(ydt);
    }

    public void setExpressVideoListenerProxy(com.bytedance.sdk.openadsdk.core.Kg.yDt ydt) {
        this.IL = ydt;
    }

    public void IL(final com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        if (ydt == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.IL.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.component.reward.view.IL.this.bX(ydt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX(com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        if (ydt == null) {
            return;
        }
        double dLdr = ydt.ldr();
        double dIR = ydt.iR();
        double dKg = ydt.Kg();
        double dWR = ydt.WR();
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, (float) dLdr);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, (float) dIR);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, (float) dKg);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Kg, (float) dWR);
        if ((dWR != 0.0d && dKg != 0.0d) || this.DDQ.bX() == 7 || this.DDQ.bX() == 10) {
            if ((this.DDQ.bX() == 7 || this.DDQ.bX() == 10) && (ydt instanceof com.bytedance.sdk.openadsdk.core.VB.eqN.IL)) {
                android.widget.FrameLayout frameLayoutVb = ((com.bytedance.sdk.openadsdk.core.VB.eqN.IL) ydt).vb();
                if (frameLayoutVb != null) {
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutVb.addView(this.PX, layoutParams);
                    return;
                }
                return;
            }
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.PX.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new android.widget.FrameLayout.LayoutParams(iBX3, iBX4);
            }
            layoutParams2.width = iBX3;
            layoutParams2.height = iBX4;
            layoutParams2.topMargin = iBX2;
            layoutParams2.leftMargin = iBX;
            layoutParams2.setMarginStart(layoutParams2.leftMargin);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.PX.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg(boolean z) {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.IL;
        if (ydt != null) {
            ydt.bg(z);
        }
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg() {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.IL;
        if (ydt != null) {
            ydt.bg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void IL() {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.IL;
        if (ydt != null) {
            ydt.IL();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg(int i) {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.IL;
        if (ydt != null) {
            ydt.bg(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public long bX() {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.IL;
        if (ydt != null) {
            return ydt.bX();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public int eqN() {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.IL;
        if (ydt != null) {
            return ydt.eqN();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void zx() {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.IL;
        if (ydt != null) {
            ydt.zx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.component.adexpress.IL.Kg
    public void bg(android.view.View view, int i, com.bytedance.sdk.component.adexpress.bX bXVar) {
        if (i != -1 && bXVar != null && i == 3) {
            zx();
        } else {
            super.bg(view, i, bXVar);
        }
    }

    public android.widget.FrameLayout getVideoFrameLayout() {
        if (Ta()) {
            return this.bX.getVideoContainer();
        }
        return this.PX;
    }

    public android.view.View getBackupContainerBackgroundView() {
        if (Ta()) {
            return this.bX.getBackupContainerBackgroundView();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void IL(int i) {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.IL;
        if (ydt != null) {
            ydt.IL(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg(int i, java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.IL;
        if (ydt != null) {
            ydt.bg(i, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy
    protected com.bytedance.sdk.openadsdk.rri.bg.zx.bg bX(int i) {
        com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVarBX = super.bX(i);
        if (this.eqN.Ny && this.eqN.kU != null) {
            bgVarBX.IL = this.eqN.kU.WR;
        }
        return bgVarBX;
    }
}
