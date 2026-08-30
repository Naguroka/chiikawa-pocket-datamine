package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class yDt extends android.widget.FrameLayout {
    private android.widget.ImageView IL;
    private com.bytedance.sdk.component.adexpress.ldr.eqN bX;
    private android.content.Context bg;
    private android.animation.AnimatorSet eqN;
    private android.widget.TextView ldr;
    private boolean zx;

    public yDt(android.content.Context context) {
        super(context);
        this.zx = true;
        this.bg = context;
        this.eqN = new android.animation.AnimatorSet();
        bX();
        eqN();
        post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.yDt.1
            @Override // java.lang.Runnable
            public void run() {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) com.bytedance.sdk.component.adexpress.ldr.yDt.this.IL.getLayoutParams();
                layoutParams.topMargin = ((int) ((com.bytedance.sdk.component.adexpress.ldr.yDt.this.bX.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.yDt.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.yDt.this.bg, 20.0f));
                layoutParams.leftMargin = ((int) ((com.bytedance.sdk.component.adexpress.ldr.yDt.this.bX.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.yDt.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.yDt.this.bg, 20.0f));
                layoutParams.bottomMargin = (int) (((-com.bytedance.sdk.component.adexpress.ldr.yDt.this.bX.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.yDt.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-com.bytedance.sdk.component.adexpress.ldr.yDt.this.bX.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.yDt.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                com.bytedance.sdk.component.adexpress.ldr.yDt.this.IL.setLayoutParams(layoutParams);
            }
        });
    }

    private void bX() {
        this.bX = new com.bytedance.sdk.component.adexpress.ldr.eqN(this.bg);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 80.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 20.0f);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 20.0f);
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.bX, layoutParams);
        this.bX.bg();
        this.IL = new android.widget.ImageView(this.bg);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 80.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 80.0f));
        this.IL.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(this.bg, "tt_splash_hand"));
        addView(this.IL, layoutParams2);
        android.widget.TextView textView = new android.widget.TextView(this.bg);
        this.ldr = textView;
        textView.setTextColor(-1);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 10.0f);
        addView(this.ldr, layoutParams3);
    }

    private void eqN() {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.IL, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.yDt.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(com.bytedance.sdk.component.adexpress.ldr.yDt.this.IL, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
                objectAnimatorOfFloat2.start();
                com.bytedance.sdk.component.adexpress.ldr.yDt.this.IL.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
                if (com.bytedance.sdk.component.adexpress.ldr.yDt.this.zx) {
                    com.bytedance.sdk.component.adexpress.ldr.yDt.this.bX.bg();
                    com.bytedance.sdk.component.adexpress.ldr.yDt.this.bX.setAlpha(1.0f);
                } else {
                    com.bytedance.sdk.component.adexpress.ldr.yDt.this.bX.IL();
                    com.bytedance.sdk.component.adexpress.ldr.yDt.this.bX.setAlpha(0.0f);
                }
                com.bytedance.sdk.component.adexpress.ldr.yDt ydt = com.bytedance.sdk.component.adexpress.ldr.yDt.this;
                ydt.zx = !ydt.zx;
            }
        });
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.IL, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.eqN.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void setGuideText(java.lang.String str) {
        this.ldr.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.ldr.setTextColor(i);
    }

    public void bg() {
        this.eqN.start();
    }

    public void IL() {
        android.animation.AnimatorSet animatorSet = this.eqN;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        com.bytedance.sdk.component.adexpress.ldr.eqN eqn = this.bX;
        if (eqn != null) {
            eqn.IL();
        }
    }
}
