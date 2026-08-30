package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class PX extends com.bytedance.sdk.openadsdk.core.zx.bX {
    protected boolean IL;
    private int Kg;
    private int bX;
    protected com.bytedance.sdk.openadsdk.common.VB bg;
    private long eqN;
    private com.bytedance.sdk.openadsdk.core.zx.eqN iR;
    private java.lang.Runnable ldr;
    private java.lang.Runnable zx;

    public PX(android.content.Context context) {
        super(context);
        this.eqN = 10L;
        this.IL = true;
        this.Kg = 1;
        bX();
    }

    private void bX() {
        setBackgroundColor(android.graphics.Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.VzQ vzQWR;
        if (tuv != null && (vzQWR = tuv.WR()) != null) {
            this.eqN = vzQWR.bg();
        }
        com.bytedance.sdk.openadsdk.common.VB vb = new com.bytedance.sdk.openadsdk.common.VB(getContext());
        this.bg = vb;
        android.view.View viewBg = vb.bg();
        if (viewBg.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) viewBg.getParent()).removeView(viewBg);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewBg.setLayoutParams(layoutParams);
        if (tuv != null) {
            boolean zRJ = tuv.RJ();
            com.bytedance.sdk.openadsdk.core.widget.VzQ vzQIL = this.bg.IL();
            if (vzQIL != null) {
                if (zRJ) {
                    vzQIL.setVisibility(8);
                } else {
                    com.bytedance.sdk.openadsdk.core.model.Lq lqSVc = (tuv.sVc() == null || android.text.TextUtils.isEmpty(tuv.sVc().bg())) ? null : tuv.sVc();
                    if (lqSVc != null && !android.text.TextUtils.isEmpty(lqSVc.bg())) {
                        try {
                            com.bytedance.sdk.openadsdk.WR.eqN.bg(lqSVc).bg(new com.bytedance.sdk.openadsdk.WR.IL(tuv, lqSVc.bg(), new com.bytedance.sdk.openadsdk.utils.Ja(vzQIL)));
                        } catch (java.lang.Throwable unused) {
                            vzQIL.setVisibility(8);
                        }
                    } else {
                        vzQIL.setVisibility(8);
                    }
                }
            }
            com.bytedance.sdk.openadsdk.core.zx.Kg kgBX = this.bg.bX();
            if (kgBX != null) {
                if (zRJ) {
                    kgBX.setText("Loading");
                } else if (!android.text.TextUtils.isEmpty(tuv.wS())) {
                    kgBX.setText(tuv.wS());
                } else {
                    kgBX.setVisibility(8);
                }
            }
        }
        addView(viewBg);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(getContext());
        this.iR = eqn;
        eqn.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(getContext(), "tt_ad_logo_big"));
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 64.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 24.0f));
        layoutParams2.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 60.0f);
        layoutParams2.gravity = 81;
        this.iR.setLayoutParams(layoutParams2);
        addView(this.iR);
        this.iR.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.PX.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                android.content.Context context = com.bytedance.sdk.openadsdk.common.PX.this.getContext();
                com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = tuv;
                com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(context, tuv2, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv2));
            }
        });
        bX(getResources().getConfiguration().orientation);
    }

    public void bg() {
        post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.common.PX.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.common.PX.this.bg != null) {
                    com.bytedance.sdk.openadsdk.common.PX.this.setVisibility(0);
                }
            }
        });
        if (this.zx == null) {
            this.zx = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.common.PX.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.common.PX.this.IL();
                }
            };
        }
        postDelayed(this.zx, this.eqN * 1000);
    }

    public void bg(int i) {
        if (i == 100 || java.lang.Math.abs(i - this.bX) >= 7) {
            this.bX = i;
            if (com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
                IL(this.bX);
                return;
            }
            if (this.ldr == null) {
                this.ldr = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.common.PX.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.common.PX px = com.bytedance.sdk.openadsdk.common.PX.this;
                        px.IL(px.bX);
                    }
                };
            }
            post(this.ldr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(int i) {
        com.bytedance.sdk.openadsdk.common.VB vb = this.bg;
        if (vb != null) {
            vb.bg(i);
        }
        if (i == 100 && this.IL) {
            IL();
        }
    }

    public void IL() {
        this.bX = 0;
        com.bytedance.sdk.openadsdk.common.VB vb = this.bg;
        if (vb != null) {
            removeView(vb.bg);
            this.bg.eqN();
        }
        setVisibility(8);
        this.bg = null;
        java.lang.Runnable runnable = this.zx;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = this.ldr;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.ldr = null;
        this.zx = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.Runnable runnable = this.zx;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.zx = null;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bX(configuration.orientation);
    }

    private void bX(int i) {
        if (this.Kg != i) {
            this.Kg = i;
            com.bytedance.sdk.openadsdk.core.zx.eqN eqn = this.iR;
            if (eqn != null) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) eqn.getLayoutParams();
                if (this.Kg == 1) {
                    marginLayoutParams.width = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 64.0f);
                    marginLayoutParams.height = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 24.0f);
                    marginLayoutParams.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 60.0f);
                } else {
                    marginLayoutParams.width = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 41.0f);
                    marginLayoutParams.height = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 15.0f);
                    marginLayoutParams.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 24.0f);
                }
                this.iR.setLayoutParams(marginLayoutParams);
            }
        }
    }
}
