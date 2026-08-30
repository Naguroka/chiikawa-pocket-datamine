package com.bytedance.sdk.openadsdk.component.reward.view;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.core.Kg.bg {
    private com.bytedance.sdk.openadsdk.core.IL.zx Fy;
    private int Lq;
    private boolean Ta;
    private android.view.View VzQ;
    private float bg;
    private android.widget.FrameLayout tuV;
    private int vb;
    private android.view.View xxp;
    private int yDt;

    @Override // com.bytedance.sdk.openadsdk.core.Kg.bg
    protected void bg(android.view.View view, int i, com.bytedance.sdk.openadsdk.core.model.yDt ydt) {
    }

    public android.view.View getInteractionStyleRootView() {
        return this;
    }

    public bg(android.content.Context context, java.lang.String str) {
        super(context, str);
        this.vb = 1;
        this.IL = context;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, float f, int i, int i2, int i3) {
        this.bg = f;
        this.vb = i;
        this.bX = tuv;
        this.ldr = "fullscreen_interstitial_ad";
        this.yDt = i2;
        this.Lq = i3;
        bg(this.WR);
        IL();
    }

    private void IL() {
        this.iR = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, this.yDt);
        this.Kg = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, this.Lq);
        int i = (int) (this.bg * 1000.0f);
        if (this.vb == 1) {
            if (i == 666) {
                zx();
                return;
            }
            if (i == 1000) {
                bX();
                return;
            }
            if (i == 1500) {
                VB();
                return;
            } else if (i == 1777) {
                Ta();
                return;
            } else {
                bg(0.562f);
                PX();
                return;
            }
        }
        if (i == 562) {
            WR();
            return;
        }
        if (i == 666) {
            iR();
            return;
        }
        if (i == 1000) {
            bX();
        } else if (i == 1500) {
            Kg();
        } else {
            bg(1.777f);
            eo();
        }
    }

    private void bX() {
        com.bytedance.sdk.openadsdk.Ta.bg bgVar = new com.bytedance.sdk.openadsdk.Ta.bg(this.IL);
        this.xxp = bgVar;
        IL(bgVar);
        eqN();
        ldr();
    }

    private void IL(android.view.View view) {
        if (view.getParent() == null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void eqN() {
        this.tuV = (android.widget.FrameLayout) this.xxp.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.hi);
        android.widget.ImageView imageView = (android.widget.ImageView) this.xxp.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.HXG);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = (com.bytedance.sdk.openadsdk.core.widget.VzQ) this.xxp.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        android.widget.TextView textView = (android.widget.TextView) this.xxp.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.IEI);
        android.widget.TextView textView2 = (android.widget.TextView) this.xxp.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.gCm);
        android.view.View viewFindViewById = this.xxp.findViewById(520093739);
        if (!android.text.TextUtils.isEmpty(this.bX.zCS())) {
            textView2.setText(this.bX.zCS());
        }
        bg(this.tuV, imageView);
        if (this.bX.sVc() != null && !android.text.TextUtils.isEmpty(this.bX.sVc().bg())) {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.bX.sVc().bg(), this.bX.sVc().IL(), this.bX.sVc().bX(), vzQ, this.bX);
        }
        textView.setText(getTitle());
        bX(this.tuV);
        bX(imageView);
        bX(vzQ);
        bX(textView);
        bX(textView2);
        viewFindViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.bg.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                try {
                    com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.component.reward.view.bg.this.IL, com.bytedance.sdk.openadsdk.component.reward.view.bg.this.bX, com.bytedance.sdk.openadsdk.component.reward.view.bg.this.ldr);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void zx() {
        com.bytedance.sdk.openadsdk.Ta.bX bXVar = new com.bytedance.sdk.openadsdk.Ta.bX(this.IL);
        this.xxp = bXVar;
        IL(bXVar);
        eqN();
        ldr();
    }

    private void ldr() {
        android.widget.TextView textView = (android.widget.TextView) this.xxp.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.bu);
        if (textView != null) {
            textView.setText(getDescription());
            bX(textView);
        }
    }

    private void iR() {
        com.bytedance.sdk.openadsdk.Ta.IL il = new com.bytedance.sdk.openadsdk.Ta.IL(this.IL);
        this.xxp = il;
        IL(il);
        eqN();
        ldr();
    }

    private void Kg() {
        com.bytedance.sdk.openadsdk.Ta.eqN eqn = new com.bytedance.sdk.openadsdk.Ta.eqN(this.IL);
        this.xxp = eqn;
        IL(eqn);
        eqN();
    }

    private void WR() {
        com.bytedance.sdk.openadsdk.Ta.ldr ldrVar = new com.bytedance.sdk.openadsdk.Ta.ldr(this.IL);
        this.xxp = ldrVar;
        IL(ldrVar);
        eqN();
        ldr();
    }

    private void eo() {
        com.bytedance.sdk.openadsdk.Ta.Kg kg = new com.bytedance.sdk.openadsdk.Ta.Kg(this.IL);
        this.xxp = kg;
        IL(kg);
        eqN();
    }

    private void VB() {
        android.view.View zxVar = new com.bytedance.sdk.openadsdk.Ta.zx(this.IL);
        this.xxp = zxVar;
        IL(zxVar);
        this.tuV = (android.widget.FrameLayout) this.xxp.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.hi);
        android.widget.ImageView imageView = (android.widget.ImageView) this.xxp.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.eK);
        android.widget.TextView textView = (android.widget.TextView) this.xxp.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.rgo);
        android.view.View viewFindViewById = this.xxp.findViewById(520093739);
        bg(this.tuV, imageView);
        textView.setText(getDescription());
        bX(this.tuV);
        bX(imageView);
        bX(textView);
        viewFindViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.bg.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                try {
                    com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.component.reward.view.bg.this.IL, com.bytedance.sdk.openadsdk.component.reward.view.bg.this.bX, com.bytedance.sdk.openadsdk.component.reward.view.bg.this.ldr);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("FullInteractionStyleView", th.getMessage());
                }
            }
        });
    }

    private void bg(android.widget.FrameLayout frameLayout, android.widget.ImageView imageView) {
        if (this.bX == null) {
            return;
        }
        boolean zZx = com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bX);
        if (this.bX.Dxa() != null && zZx) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) imageView, 8);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) frameLayout, 0);
        } else {
            bg(imageView);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) imageView, 0);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) frameLayout, 8);
        }
    }

    private void bg(android.widget.ImageView imageView) {
        java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM;
        com.bytedance.sdk.openadsdk.core.model.Lq lq;
        if (this.bX == null || (listLM = this.bX.lM()) == null || listLM.size() <= 0 || (lq = listLM.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.WR.eqN.bg(lq).bX(2).bg(com.bytedance.sdk.openadsdk.WR.bX.bg(this.bX, lq.bg(), imageView));
    }

    private void PX() {
        com.bytedance.sdk.openadsdk.Ta.iR iRVar = new com.bytedance.sdk.openadsdk.Ta.iR(this.IL);
        this.xxp = iRVar;
        IL(iRVar);
        eqN();
    }

    private void Ta() {
        com.bytedance.sdk.openadsdk.Ta.WR wr = new com.bytedance.sdk.openadsdk.Ta.WR(this.IL);
        this.xxp = wr;
        IL(wr);
        eqN();
        ldr();
    }

    private void bX(android.view.View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar = this.Fy;
        if (bgVar == null) {
            bgVar = new com.bytedance.sdk.openadsdk.core.IL.bg(this.IL, this.bX, this.ldr, com.bytedance.sdk.openadsdk.utils.ayS.bg(this.ldr));
            bgVar.bg(bg(this.bX, this.IL));
        }
        view.setOnTouchListener(bgVar);
        view.setOnClickListener(bgVar);
    }

    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.content.Context context) {
        if (tuv != null && tuv.jz() == 4) {
            return new com.bytedance.sdk.openadsdk.VzQ.bg.bg.eqN(context, tuv, this.ldr);
        }
        return null;
    }

    public void setIsMute(boolean z) {
        this.Ta = z;
        android.view.View view = this.VzQ;
        if (view != null && (view instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.ldr)) {
            ((com.bytedance.sdk.openadsdk.core.Ta.IL.ldr) view).setIsQuiet(z);
        }
    }

    public android.widget.FrameLayout getVideoContainer() {
        return this.tuV;
    }

    public void setDownloadListener(com.bytedance.sdk.openadsdk.core.IL.zx zxVar) {
        this.Fy = zxVar;
    }

    private float getHeightDp() {
        return com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.IL, com.bytedance.sdk.openadsdk.utils.ZQc.WR(this.IL));
    }

    private float getWidthDp() {
        return com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.IL, com.bytedance.sdk.openadsdk.utils.ZQc.eo(this.IL));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    private void bg(float f) {
        float fMin;
        float fMax;
        int iMax;
        int i;
        int iMax2;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.vb == 2) {
            fMin = java.lang.Math.max(heightDp, widthDp);
            fMax = java.lang.Math.min(heightDp, widthDp);
        } else {
            fMin = java.lang.Math.min(heightDp, widthDp);
            fMax = java.lang.Math.max(heightDp, widthDp);
        }
        if (this.vb != 2 && com.bytedance.sdk.openadsdk.utils.ZQc.bX((android.app.Activity) this.IL)) {
            fMax -= com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.IL, com.bytedance.sdk.openadsdk.utils.ZQc.bg());
        }
        int i2 = 20;
        if (this.vb != 2) {
            if (f == 0.0f || f == 100.0f) {
                i2 = 0;
                iMax2 = 0;
                iMax = 0;
                i = 0;
            } else {
                iMax2 = (int) java.lang.Math.max((fMax - (((fMin - 20.0f) - 20.0f) / f)) / 2.0f, 0.0f);
                iMax = 20;
                i = 20;
                i2 = iMax2;
            }
        } else if (f == 0.0f || f == 100.0f) {
            i2 = 0;
            iMax2 = 0;
            iMax = 0;
            i = 0;
        } else {
            iMax = (int) java.lang.Math.max((fMin - (((fMax - 20.0f) - 20.0f) * f)) / 2.0f, 0.0f);
            i = iMax;
            iMax2 = 20;
        }
        ((android.app.Activity) this.IL).getWindow().getDecorView().setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, iMax), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, i2), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, i), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, iMax2));
    }
}
