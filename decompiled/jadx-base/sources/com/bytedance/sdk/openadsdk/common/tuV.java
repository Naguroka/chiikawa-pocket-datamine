package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class tuV {
    com.bytedance.sdk.openadsdk.common.TTAdDislikeToast IL;
    private android.widget.ImageView Kg;
    private boolean PX;
    private android.widget.TextView WR;
    com.bytedance.sdk.openadsdk.common.Lq bg;
    private com.bytedance.sdk.openadsdk.core.zx.ldr eo;
    private final android.content.Context iR;
    private final com.bytedance.sdk.openadsdk.core.model.tuV ldr;
    private final android.widget.RelativeLayout zx;
    final java.util.concurrent.atomic.AtomicBoolean bX = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.util.concurrent.atomic.AtomicBoolean eqN = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final int VB = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 44.0f);

    public tuV(android.content.Context context, android.widget.RelativeLayout relativeLayout, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.iR = context;
        this.zx = relativeLayout;
        this.ldr = tuv;
        zx();
    }

    private void zx() {
        this.Kg = (android.widget.ImageView) this.zx.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.dS);
        this.WR = (android.widget.TextView) this.zx.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.RiO);
        android.widget.ImageView imageView = (android.widget.ImageView) this.zx.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Dt);
        this.eo = (com.bytedance.sdk.openadsdk.core.zx.ldr) this.zx.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Ny);
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.ldr;
        if (tuv != null) {
            this.WR.setText(android.text.TextUtils.isEmpty(tuv.wS()) ? com.bytedance.sdk.component.utils.Fy.bg(this.iR, "tt_web_title_default") : this.ldr.wS());
        }
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tuV.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.bytedance.sdk.openadsdk.common.tuV.this.eqN();
            }
        });
    }

    public void bg(int i) {
        if (i == 100) {
            this.eo.setVisibility(8);
        } else {
            this.eo.setVisibility(0);
            this.eo.setProgress(i);
        }
    }

    public void bg() {
        try {
            final android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.zx.getLayoutParams();
            if (this.PX) {
                return;
            }
            int i = marginLayoutParams.topMargin;
            int i2 = this.VB;
            if (i == (-i2)) {
                android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(-i2, 0);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.tuV.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
                        com.bytedance.sdk.openadsdk.common.tuV.this.zx.setLayoutParams(marginLayoutParams);
                    }
                });
                valueAnimatorOfInt.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.tuV.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(android.animation.Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(android.animation.Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(android.animation.Animator animator) {
                        com.bytedance.sdk.openadsdk.common.tuV.this.PX = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        com.bytedance.sdk.openadsdk.common.tuV.this.PX = false;
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void IL() {
        try {
            final android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.zx.getLayoutParams();
            if (this.PX || marginLayoutParams.topMargin != 0) {
                return;
            }
            android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, -this.VB);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.tuV.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    marginLayoutParams.topMargin = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
                    com.bytedance.sdk.openadsdk.common.tuV.this.zx.setLayoutParams(marginLayoutParams);
                }
            });
            valueAnimatorOfInt.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.tuV.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(android.animation.Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(android.animation.Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    com.bytedance.sdk.openadsdk.common.tuV.this.PX = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    com.bytedance.sdk.openadsdk.common.tuV.this.PX = false;
                }
            });
            valueAnimatorOfInt.start();
        } catch (java.lang.Throwable unused) {
        }
    }

    public android.widget.ImageView bX() {
        return this.Kg;
    }

    protected void eqN() {
        if (this.eqN.get()) {
            iR();
            return;
        }
        if (this.bg == null) {
            ldr();
        }
        com.bytedance.sdk.openadsdk.common.Lq lq = this.bg;
        if (lq != null) {
            lq.bg();
        }
    }

    private void ldr() {
        try {
            if (this.bg == null) {
                com.bytedance.sdk.openadsdk.common.Lq lq = new com.bytedance.sdk.openadsdk.common.Lq(this.iR, this.ldr);
                this.bg = lq;
                lq.setDislikeSource("landing_page");
                this.bg.setCallback(new com.bytedance.sdk.openadsdk.common.Lq.bg() { // from class: com.bytedance.sdk.openadsdk.common.tuV.6
                    @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                    public void bg(android.view.View view) {
                        com.bytedance.sdk.openadsdk.common.tuV.this.bX.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                    public void IL(android.view.View view) {
                        com.bytedance.sdk.openadsdk.common.tuV.this.bX.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                    public void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
                        if (com.bytedance.sdk.openadsdk.common.tuV.this.eqN.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.common.tuV.this.eqN.set(true);
                    }
                });
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.zx.getRootView().findViewById(android.R.id.content);
            frameLayout.addView(this.bg);
            if (this.IL == null) {
                com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast = new com.bytedance.sdk.openadsdk.common.TTAdDislikeToast(this.iR);
                this.IL = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    private void iR() {
        this.IL.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeTip());
    }
}
