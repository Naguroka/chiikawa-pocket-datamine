package com.bytedance.sdk.openadsdk.component.reward.view;

/* JADX INFO: loaded from: classes4.dex */
public class eo {
    private int Fy;
    final android.app.Activity IL;
    android.view.View Kg;
    private boolean LZ;
    public com.bytedance.sdk.openadsdk.core.model.xxp Lq;
    com.bytedance.sdk.openadsdk.component.reward.bg.xxp PX;
    android.widget.RelativeLayout VB;
    private final boolean VzQ;
    com.bytedance.sdk.openadsdk.core.widget.PAGLogoView WR;
    protected final com.bytedance.sdk.openadsdk.component.reward.bg.bg bX;
    android.widget.ImageView eo;
    final com.bytedance.sdk.openadsdk.core.model.tuV eqN;
    android.view.View iR;
    android.widget.FrameLayout ldr;
    private com.bytedance.sdk.openadsdk.component.reward.view.bX tC;
    private final java.lang.String tuV;
    com.bytedance.sdk.openadsdk.core.zx.ldr vb;
    android.widget.ImageView zx;
    int bg = 3;
    protected int Ta = 0;
    protected final java.util.concurrent.atomic.AtomicBoolean yDt = new java.util.concurrent.atomic.AtomicBoolean(false);
    java.lang.Runnable xxp = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.eo.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                if ((com.bytedance.sdk.openadsdk.component.reward.view.eo.this.eqN == null || !com.bytedance.sdk.openadsdk.component.reward.view.eo.this.eqN.Fb()) && com.bytedance.sdk.openadsdk.component.reward.view.eo.this.zx != null) {
                    int[] iArr = new int[2];
                    com.bytedance.sdk.openadsdk.component.reward.view.eo.this.zx.getLocationOnScreen(iArr);
                    com.bytedance.sdk.openadsdk.component.reward.view.eo.this.bX.ayS.bg(iArr[0]);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    };

    protected boolean bg() {
        return true;
    }

    public eo(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.bX = bgVar;
        this.IL = bgVar.uu;
        this.eqN = bgVar.IL;
        this.tuV = bgVar.zx;
        this.VzQ = bgVar.eqN;
    }

    public void IL() {
        if (this.LZ) {
            return;
        }
        this.LZ = true;
        this.Fy = this.bX.GvG;
        if (bg()) {
            com.bytedance.sdk.openadsdk.component.reward.bg.xxp xxpVar = new com.bytedance.sdk.openadsdk.component.reward.bg.xxp(this.bX);
            this.PX = xxpVar;
            xxpVar.bg();
        }
        VzQ();
        com.bytedance.sdk.openadsdk.core.model.xxp xxpVar2 = new com.bytedance.sdk.openadsdk.core.model.xxp(this.IL, this.eqN, this.tuV, this.ldr, this.bX.qC, this.bX.CQc);
        this.Lq = xxpVar2;
        xxpVar2.bg();
    }

    private void VzQ() {
        android.widget.RelativeLayout relativeLayout;
        com.bytedance.sdk.openadsdk.component.reward.view.bX bXVar = (com.bytedance.sdk.openadsdk.component.reward.view.bX) this.bX.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.PX);
        this.tC = bXVar;
        bXVar.bg(this.bX);
        this.WR = (com.bytedance.sdk.openadsdk.core.widget.PAGLogoView) this.bX.CQc.findViewById(520093757);
        this.eo = (android.widget.ImageView) this.bX.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Fb);
        this.zx = (android.widget.ImageView) this.bX.CQc.findViewById(520093708);
        this.ldr = (android.widget.FrameLayout) this.bX.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.VB);
        this.iR = this.bX.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.xxp);
        this.Kg = this.bX.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.huT);
        this.VB = (android.widget.RelativeLayout) this.bX.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.waE);
        com.bytedance.sdk.openadsdk.component.reward.bg.xxp xxpVar = this.PX;
        if (xxpVar == null || xxpVar.eqN() == null || (relativeLayout = this.VB) == null) {
            return;
        }
        relativeLayout.addView(this.PX.eqN(), new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.PX.IL();
    }

    public void bX() {
        this.ldr.removeAllViews();
    }

    public void bg(boolean z) {
        int i = 8;
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.WR, com.bytedance.sdk.openadsdk.core.model.rri.bX(this.eqN) ? 8 : 0);
        android.widget.ImageView imageView = this.eo;
        if (this.eqN.HXG() && this.eqN.Kg()) {
            i = 0;
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) imageView, i);
        IL(z);
        if (this.VzQ) {
            zx();
        }
    }

    public void bg(int i) {
        if (this.vb == null) {
            this.vb = new com.bytedance.sdk.openadsdk.core.zx.ldr(this.bX.uu);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.vb.setLayoutParams(layoutParams);
            this.vb.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(this.bX.uu, "tt_video_loading_progress_bar"));
            this.bX.LKE.ldr().addView(this.vb);
        }
        this.vb.setVisibility(i);
    }

    public void bg(int i, int i2) {
        android.widget.FrameLayout frameLayout;
        if (this.eqN.Uq() == 1 && (frameLayout = this.ldr) != null && (frameLayout.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams)) {
            int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX((android.content.Context) this.IL);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.ldr.getLayoutParams();
            layoutParams.width = iBX;
            int i3 = (iBX * 9) / 16;
            layoutParams.height = i3;
            this.ldr.setLayoutParams(layoutParams);
            this.Ta = (com.bytedance.sdk.openadsdk.utils.ZQc.eqN((android.content.Context) this.IL) - i3) / 2;
            com.bytedance.sdk.component.utils.PX.bg("TTAD.RFullVideoLayout", "NonContentAreaHeight:" + this.Ta);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.bX bXVar, android.view.View.OnTouchListener onTouchListener, android.view.View.OnClickListener onClickListener) {
        android.view.View view;
        android.view.View view2;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        if (this.ldr != null && (tuv = this.eqN) != null && tuv.aGH() != null) {
            if (this.eqN.aGH().ldr && !com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.eqN)) {
                bg((android.view.View.OnClickListener) bXVar);
                bg(bXVar);
            } else {
                bg(onClickListener);
            }
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.eqN;
        if (tuv2 != null && tuv2.Uq() == 1) {
            if (this.eqN.aGH() != null && (view2 = this.iR) != null) {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg(view2, 0);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.iR.getLayoutParams();
                layoutParams.height = this.Ta;
                this.iR.setLayoutParams(layoutParams);
                if (this.eqN.aGH().IL) {
                    this.iR.setOnClickListener(bXVar);
                    this.iR.setOnTouchListener(onTouchListener);
                } else {
                    this.iR.setOnClickListener(onClickListener);
                }
            }
            if (this.eqN.aGH() != null && (view = this.Kg) != null) {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg(view, 0);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.Kg.getLayoutParams();
                layoutParams2.height = this.Ta;
                this.Kg.setLayoutParams(layoutParams2);
                if (this.eqN.aGH().eqN) {
                    this.Kg.setOnClickListener(bXVar);
                    this.Kg.setOnTouchListener(onTouchListener);
                } else {
                    this.Kg.setOnClickListener(onClickListener);
                }
            }
        }
        com.bytedance.sdk.openadsdk.core.widget.PAGLogoView pAGLogoView = this.WR;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.eo.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view3) {
                    try {
                        com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.component.reward.view.eo.this.IL, com.bytedance.sdk.openadsdk.component.reward.view.eo.this.eqN, com.bytedance.sdk.openadsdk.component.reward.view.eo.this.tuV);
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        android.widget.ImageView imageView = this.eo;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg((int) com.bytedance.sdk.openadsdk.utils.ZQc.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 14.0f, true), this.eo, this.bX.IL);
        }
    }

    public void eqN() {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.ldr, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.iR, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.Kg, 8);
        IL(8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.zx, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.WR, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.VB, 8);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.eo, 8);
    }

    void zx() {
        int iVJ = this.eqN.VJ();
        this.bg = iVJ;
        if (iVJ == -200) {
            this.bg = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Lq(java.lang.String.valueOf(this.eqN.IGR()));
        }
        if (this.bg != -1 || bg() || (this.bX.dS instanceof com.bytedance.sdk.openadsdk.component.reward.IL.bX)) {
            return;
        }
        IL(0);
    }

    void IL(boolean z) {
        android.widget.ImageView imageView;
        int iBg;
        if (this.Fy != 1 && (imageView = this.zx) != null && z) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) && (iBg = bg("navigation_bar_height")) > 0) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                if (iBg > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = iBg;
                }
            }
        }
        if (this.bX.dS instanceof com.bytedance.sdk.openadsdk.component.reward.IL.bX) {
            return;
        }
        IL(0);
    }

    private int bg(java.lang.String str) {
        android.content.res.Resources resources = this.IL.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void IL(int i) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.eqN;
        if (tuv != null && tuv.HXG() && com.bytedance.sdk.openadsdk.core.model.Ta.bg(this.eqN)) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.tC, 8);
        } else {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.tC, i);
        }
    }

    public android.widget.FrameLayout ldr() {
        return this.ldr;
    }

    public void bX(int i) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.WR, i);
    }

    public void iR() {
        if (this.eo.getVisibility() == 0) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.eo.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.eo.setLayoutParams(marginLayoutParams);
        }
    }

    public void eqN(int i) {
        int i2 = this.bg;
        if (i2 == -1 || i != i2 || this.yDt.get()) {
            return;
        }
        IL(0);
        this.yDt.set(true);
        Kg();
    }

    protected void Kg() {
        com.bytedance.sdk.openadsdk.component.reward.view.bX bXVar = this.tC;
        if (bXVar == null) {
            return;
        }
        bXVar.bg();
    }

    public void zx(int i) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.zx, i);
        if (i == 0 && !this.bX.eo.get() && com.bytedance.sdk.openadsdk.core.model.rri.iR(this.bX.IL)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bX.IL, this.bX.zx, "show_close_button", (org.json.JSONObject) null, java.lang.System.currentTimeMillis() - this.bX.cZH);
        }
    }

    public boolean WR() {
        android.widget.ImageView imageView = this.zx;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void bg(android.view.View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.ldr, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void bg(com.bytedance.sdk.openadsdk.core.IL.bX bXVar) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.ldr, (android.view.View.OnTouchListener) bXVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public android.view.View eo() {
        return this.zx;
    }

    public android.view.View VB() {
        return this.tC;
    }

    public void bg(float f) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.zx, f);
    }

    public void bg(android.view.animation.Animation animation) {
        android.widget.RelativeLayout relativeLayout = this.VB;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void PX() {
        try {
            com.bytedance.sdk.openadsdk.component.reward.bg.xxp xxpVar = this.PX;
            if (xxpVar != null) {
                xxpVar.bX();
            }
            android.widget.RelativeLayout relativeLayout = this.VB;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (java.lang.Throwable unused) {
            android.widget.RelativeLayout relativeLayout2 = this.VB;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void Ta() {
        try {
            android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.bX.uu, com.bytedance.sdk.component.utils.Fy.WR(this.bX.uu, "tt_fade_out"));
            if (animationLoadAnimation != null) {
                animationLoadAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.eo.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(android.view.animation.Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(android.view.animation.Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(android.view.animation.Animation animation) {
                        com.bytedance.sdk.openadsdk.component.reward.view.eo.this.bX.LKE.PX();
                    }
                });
                this.bX.LKE.bg(animationLoadAnimation);
            } else {
                this.bX.LKE.PX();
            }
        } catch (java.lang.Throwable unused) {
            this.bX.LKE.PX();
        }
    }

    public void yDt() {
        com.bytedance.sdk.openadsdk.core.model.xxp xxpVar = this.Lq;
        if (xxpVar != null) {
            xxpVar.zx();
        }
        android.widget.ImageView imageView = this.zx;
        if (imageView != null) {
            imageView.removeCallbacks(this.xxp);
        }
    }

    public void Lq() {
        com.bytedance.sdk.openadsdk.core.model.xxp xxpVar = this.Lq;
        if (xxpVar != null) {
            xxpVar.ldr();
        }
    }

    public void vb() {
        com.bytedance.sdk.openadsdk.core.model.xxp xxpVar = this.Lq;
        if (xxpVar != null) {
            xxpVar.iR();
        }
    }

    public void xxp() {
        com.bytedance.sdk.openadsdk.core.IL.zx zxVarZx = this.bX.DDQ.zx();
        android.view.View view = this.tC;
        if (view == null) {
            view = this.bX.CQc;
        }
        zxVarZx.onClick(view);
    }
}
