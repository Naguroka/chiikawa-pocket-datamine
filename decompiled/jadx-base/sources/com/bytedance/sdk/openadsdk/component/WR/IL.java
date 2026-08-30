package com.bytedance.sdk.openadsdk.component.WR;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.core.Kg.Fy {
    private final com.bytedance.sdk.openadsdk.component.bg IL;
    private com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg Uq;
    private final com.bytedance.sdk.openadsdk.component.ldr.IL bX;
    boolean bg;
    private final com.bytedance.sdk.openadsdk.component.Kg.bg eqN;
    private android.widget.FrameLayout iR;
    private com.bytedance.sdk.openadsdk.component.ldr.bg ldr;
    private com.bytedance.sdk.openadsdk.component.Kg.bX zx;

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg(int i, java.lang.String str) {
    }

    public IL(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, java.lang.String str, com.bytedance.sdk.openadsdk.component.bg bgVar, com.bytedance.sdk.openadsdk.component.ldr.IL il, com.bytedance.sdk.openadsdk.component.Kg.bg bgVar2) {
        super(context, tuv, adSlot, str, true, true);
        this.bg = true;
        this.IL = bgVar;
        this.bX = il;
        this.eqN = bgVar2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy
    protected void ldr() {
        this.yDt = true;
        this.iR = new android.widget.FrameLayout(this.Kg);
        if (!com.bytedance.sdk.openadsdk.core.VB.bX.bg(this.VB) && !com.bytedance.sdk.openadsdk.core.VB.bX.IL(this.VB)) {
            addView(this.iR, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        super.ldr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy
    public int getDynamicShowType() {
        if (this.DDQ == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.component.adexpress.IL.Lq
    public void bg(com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn, com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        this.DDQ = eqn;
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

    public void IL(final com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        if (ydt == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.WR.IL.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.component.WR.IL.this.bX(ydt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX(com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        if (ydt == null) {
            return;
        }
        if (ydt.bg() != null) {
            if (this.bg) {
                ydt.bg().setTag(com.bytedance.sdk.component.adexpress.dynamic.bg.ldr, 1);
                ((android.widget.FrameLayout) ydt.bg()).removeAllViews();
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ydt.bg();
                this.iR = frameLayout;
                ((android.widget.FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.bg = false;
                return;
            }
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
                    frameLayoutVb.addView(this.iR, layoutParams);
                    return;
                }
                return;
            }
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.iR.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new android.widget.FrameLayout.LayoutParams(iBX3, iBX4);
            }
            layoutParams2.width = iBX3;
            layoutParams2.height = iBX4;
            layoutParams2.topMargin = iBX2;
            layoutParams2.leftMargin = iBX;
            layoutParams2.setMarginStart(layoutParams2.leftMargin);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.iR.setLayoutParams(layoutParams2);
        }
    }

    public void setExpressVideoListenerProxy(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar) {
        this.Uq = bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg() {
        com.bytedance.sdk.openadsdk.component.ldr.bg bgVar = this.ldr;
        if (bgVar != null) {
            bgVar.bg(this);
        }
    }

    public void setVideoManager(com.bytedance.sdk.openadsdk.component.Kg.bX bXVar) {
        this.zx = bXVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void IL() {
        super.IL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void bg(int i) {
        com.bytedance.sdk.openadsdk.component.Kg.bX bXVar = this.zx;
        if (bXVar == null) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                bXVar.iR();
                this.bX.eqN();
                return;
            } else if (i == 3) {
                bXVar.Kg();
                this.bX.bX();
                return;
            } else if (i == 4) {
                bXVar.WR();
                return;
            } else if (i != 5) {
                return;
            }
        }
        if (bXVar.eqN() || this.zx.zx()) {
            return;
        }
        this.zx.bg(getVideoFrameLayout(), this.IL, this.VB);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public void zx() {
        com.bytedance.sdk.openadsdk.component.ldr.bg bgVar = this.ldr;
        if (bgVar != null) {
            bgVar.IL(this);
        }
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.ldr.bg bgVar) {
        this.ldr = bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public int eqN() {
        com.bytedance.sdk.openadsdk.component.Kg.bX bXVar = this.zx;
        if (bXVar != null && bXVar.ldr()) {
            return 1;
        }
        com.bytedance.sdk.openadsdk.component.Kg.bX bXVar2 = this.zx;
        if (bXVar2 != null && bXVar2.zx()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.Kg.bX bXVar3 = this.zx;
        if (bXVar3 != null && bXVar3.eqN()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.Kg.bX bXVar4 = this.zx;
        if (bXVar4 != null && bXVar4.IL()) {
            return 4;
        }
        com.bytedance.sdk.openadsdk.component.Kg.bX bXVar5 = this.zx;
        return (bXVar5 == null || !bXVar5.bX()) ? 3 : 5;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy, com.bytedance.sdk.openadsdk.core.Kg.yDt
    public long bX() {
        return this.eqN.IL();
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
        return this.iR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy
    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.iR.bg.bg(this.VB, com.bytedance.sdk.openadsdk.core.VzQ.eqN().iR(java.lang.String.valueOf(this.VB.IGR())));
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy
    protected void bg(com.bytedance.sdk.component.adexpress.IL.Ta.bg bgVar) {
        bgVar.zx(com.bytedance.sdk.openadsdk.component.iR.bg.IL());
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.Fy
    protected void bg(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.component.iR.bg.bg(jSONObject, this.VB != null ? this.VB.IGR() : 0, this.VB != null && this.VB.JAA() == 0);
    }
}
