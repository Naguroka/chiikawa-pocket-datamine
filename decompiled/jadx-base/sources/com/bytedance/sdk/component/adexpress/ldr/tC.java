package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class tC extends android.widget.FrameLayout {
    private android.widget.ImageView IL;
    private android.animation.AnimatorSet Kg;
    private android.animation.AnimatorSet WR;
    private android.widget.ImageView bX;
    private android.content.Context bg;
    private android.widget.ImageView eqN;
    private android.animation.AnimatorSet iR;
    private android.animation.AnimatorSet ldr;
    private android.widget.TextView zx;

    public tC(android.content.Context context) {
        super(context);
        this.ldr = new android.animation.AnimatorSet();
        this.iR = new android.animation.AnimatorSet();
        this.Kg = new android.animation.AnimatorSet();
        this.WR = new android.animation.AnimatorSet();
        this.bg = context;
        bX();
    }

    private void bX() {
        android.widget.ImageView imageView = new android.widget.ImageView(this.bg);
        this.eqN = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.Fy.eqN(this.bg, "tt_splash_slide_right_bg"));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 30.0f);
        addView(this.eqN, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        android.widget.ImageView imageView2 = new android.widget.ImageView(this.bg);
        this.bX = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(this.bg, "tt_splash_slide_right_circle"));
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 50.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 30.0f);
        addView(this.bX, layoutParams2);
        android.widget.ImageView imageView3 = new android.widget.ImageView(this.bg);
        this.IL = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(this.bg, "tt_splash_hand2"));
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 80.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 30.0f);
        addView(this.IL, layoutParams3);
        android.widget.TextView textView = new android.widget.TextView(this.bg);
        this.zx = textView;
        textView.setTextColor(-1);
        this.zx.setSingleLine();
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.zx, layoutParams4);
        post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.tC.1
            @Override // java.lang.Runnable
            public void run() {
                android.widget.FrameLayout.LayoutParams layoutParams5 = (android.widget.FrameLayout.LayoutParams) com.bytedance.sdk.component.adexpress.ldr.tC.this.IL.getLayoutParams();
                layoutParams5.topMargin = (int) ((com.bytedance.sdk.component.adexpress.ldr.tC.this.bX.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.tC.this.getContext(), 7.0f));
                layoutParams5.leftMargin = (-com.bytedance.sdk.component.adexpress.ldr.tC.this.bX.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.tC.this.bg, 30.0f));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                com.bytedance.sdk.component.adexpress.ldr.tC.this.IL.setLayoutParams(layoutParams5);
                android.widget.FrameLayout.LayoutParams layoutParams6 = (android.widget.FrameLayout.LayoutParams) com.bytedance.sdk.component.adexpress.ldr.tC.this.eqN.getLayoutParams();
                layoutParams6.topMargin = (int) ((com.bytedance.sdk.component.adexpress.ldr.tC.this.bX.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.tC.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((com.bytedance.sdk.component.adexpress.ldr.tC.this.bX.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.ldr.tC.this.bg, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                com.bytedance.sdk.component.adexpress.ldr.tC.this.eqN.setLayoutParams(layoutParams6);
            }
        });
    }

    private void eqN() {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.IL, "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.bX, "scaleX", 0.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(this.bX, "scaleY", 0.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat4 = android.animation.ObjectAnimator.ofFloat(this.eqN, "alpha", 0.0f, 1.0f);
        this.Kg.setDuration(300L);
        this.Kg.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        android.animation.ObjectAnimator objectAnimatorOfFloat5 = android.animation.ObjectAnimator.ofFloat(this.IL, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.tC.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) com.bytedance.sdk.component.adexpress.ldr.tC.this.eqN.getLayoutParams();
                layoutParams.width = num.intValue();
                com.bytedance.sdk.component.adexpress.ldr.tC.this.eqN.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        android.animation.ObjectAnimator objectAnimatorOfFloat6 = android.animation.ObjectAnimator.ofFloat(this.bX, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.WR.setDuration(1500L);
        this.WR.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        android.animation.ObjectAnimator objectAnimatorOfFloat7 = android.animation.ObjectAnimator.ofFloat(this.IL, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat8 = android.animation.ObjectAnimator.ofFloat(this.eqN, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat9 = android.animation.ObjectAnimator.ofFloat(this.bX, "alpha", 1.0f, 0.0f);
        this.iR.setDuration(50L);
        this.iR.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.ldr.playSequentially(this.Kg, this.WR, this.iR);
    }

    public void bg() {
        eqN();
        this.ldr.start();
        this.ldr.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.ldr.tC.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                com.bytedance.sdk.component.adexpress.ldr.tC.this.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.tC.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.adexpress.ldr.tC.this.ldr.start();
                    }
                }, 200L);
            }
        });
    }

    public void IL() {
        try {
            android.animation.AnimatorSet animatorSet = this.ldr;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            android.animation.AnimatorSet animatorSet2 = this.Kg;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            android.animation.AnimatorSet animatorSet3 = this.WR;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            android.animation.AnimatorSet animatorSet4 = this.iR;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setGuideText(java.lang.String str) {
        this.zx.setText(str);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
