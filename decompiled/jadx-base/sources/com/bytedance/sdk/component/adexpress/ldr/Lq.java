package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class Lq extends android.widget.FrameLayout {
    private android.widget.ImageView IL;
    private com.bytedance.sdk.component.adexpress.ldr.kMt bX;
    private android.content.Context bg;
    private android.animation.AnimatorSet eqN;
    private boolean zx;

    public Lq(android.content.Context context) {
        super(context);
        this.zx = true;
        this.bg = context;
        this.eqN = new android.animation.AnimatorSet();
        bX();
        eqN();
        post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.Lq.1
            @Override // java.lang.Runnable
            public void run() {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) com.bytedance.sdk.component.adexpress.ldr.Lq.this.IL.getLayoutParams();
                layoutParams.topMargin = (int) ((com.bytedance.sdk.component.adexpress.ldr.Lq.this.bX.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.Lq.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((com.bytedance.sdk.component.adexpress.ldr.Lq.this.bX.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.Lq.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-com.bytedance.sdk.component.adexpress.ldr.Lq.this.bX.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.Lq.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-com.bytedance.sdk.component.adexpress.ldr.Lq.this.bX.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.Lq.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                com.bytedance.sdk.component.adexpress.ldr.Lq.this.IL.setLayoutParams(layoutParams);
            }
        });
    }

    private void bX() {
        this.bX = new com.bytedance.sdk.component.adexpress.ldr.kMt(this.bg);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 40.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.bX, layoutParams);
        this.IL = new android.widget.ImageView(this.bg);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 62.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 62.0f));
        layoutParams2.gravity = 16;
        this.IL.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(this.bg, "tt_splash_hand"));
        addView(this.IL, layoutParams2);
    }

    private void eqN() {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.IL, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.Lq.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(com.bytedance.sdk.component.adexpress.ldr.Lq.this.IL, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                com.bytedance.sdk.component.adexpress.ldr.Lq.this.IL.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
                if (com.bytedance.sdk.component.adexpress.ldr.Lq.this.zx) {
                    com.bytedance.sdk.component.adexpress.ldr.Lq.this.bX.bg();
                }
                com.bytedance.sdk.component.adexpress.ldr.Lq lq = com.bytedance.sdk.component.adexpress.ldr.Lq.this;
                lq.zx = !lq.zx;
            }
        });
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.IL, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.eqN.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void bg() {
        this.eqN.start();
    }

    public void IL() {
        android.animation.AnimatorSet animatorSet = this.eqN;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        com.bytedance.sdk.component.adexpress.ldr.kMt kmt = this.bX;
        if (kmt != null) {
            kmt.IL();
        }
        android.widget.ImageView imageView = this.IL;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }
}
