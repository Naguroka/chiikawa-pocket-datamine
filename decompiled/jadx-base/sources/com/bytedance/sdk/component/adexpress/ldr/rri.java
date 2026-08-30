package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class rri extends android.widget.RelativeLayout {
    private android.widget.ImageView IL;
    private android.animation.AnimatorSet Kg;
    private int VB;
    private android.animation.AnimatorSet WR;
    private android.widget.ImageView bX;
    private android.widget.ImageView bg;
    private java.lang.String eo;
    private android.widget.TextView eqN;
    private android.animation.AnimatorSet iR;
    private android.animation.AnimatorSet ldr;
    private android.widget.TextView zx;

    public rri(android.content.Context context) {
        super(context);
        this.ldr = new android.animation.AnimatorSet();
        this.iR = new android.animation.AnimatorSet();
        this.Kg = new android.animation.AnimatorSet();
        this.WR = new android.animation.AnimatorSet();
        this.VB = 100;
        bg(context);
    }

    public rri(android.content.Context context, java.lang.String str) {
        super(context);
        this.ldr = new android.animation.AnimatorSet();
        this.iR = new android.animation.AnimatorSet();
        this.Kg = new android.animation.AnimatorSet();
        this.WR = new android.animation.AnimatorSet();
        this.VB = 100;
        setClipChildren(false);
        this.eo = str;
        bg(context);
    }

    protected void bg(android.content.Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.eqN.bg();
        }
        if ("5".equals(this.eo)) {
            addView(com.bytedance.sdk.component.adexpress.bX.bg.ldr(context));
            this.VB = (int) (((double) this.VB) * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.bX.bg.zx(context));
        }
        this.bg = (android.widget.ImageView) findViewById(2097610734);
        this.IL = (android.widget.ImageView) findViewById(2097610735);
        this.eqN = (android.widget.TextView) findViewById(2097610730);
        this.bX = (android.widget.ImageView) findViewById(2097610733);
        this.zx = (android.widget.TextView) findViewById(2097610731);
    }

    public android.animation.AnimatorSet getSlideUpAnimatorSet() {
        return this.ldr;
    }

    public void bg() {
        bX();
        this.ldr.start();
        this.ldr.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.ldr.rri.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                com.bytedance.sdk.component.adexpress.ldr.rri.this.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.rri.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.adexpress.ldr.rri.this.ldr.start();
                    }
                }, 200L);
            }
        });
    }

    public void bX() {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.bg, "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.bg, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(this.bg, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), -this.VB));
        objectAnimatorOfFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), this.VB));
        valueAnimatorOfInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.rri.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                if (com.bytedance.sdk.component.adexpress.ldr.rri.this.bX != null) {
                    java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) com.bytedance.sdk.component.adexpress.ldr.rri.this.bX.getLayoutParams();
                    layoutParams.height = num.intValue();
                    com.bytedance.sdk.component.adexpress.ldr.rri.this.bX.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        android.animation.ObjectAnimator objectAnimatorOfFloat4 = android.animation.ObjectAnimator.ofFloat(this.bX, "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat5 = android.animation.ObjectAnimator.ofFloat(this.bX, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat6 = android.animation.ObjectAnimator.ofFloat(this.IL, "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat7 = android.animation.ObjectAnimator.ofFloat(this.IL, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat8 = android.animation.ObjectAnimator.ofFloat(this.IL, "scaleX", 0.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat9 = android.animation.ObjectAnimator.ofFloat(this.IL, "scaleY", 0.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat10 = android.animation.ObjectAnimator.ofFloat(this.IL, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), -this.VB));
        objectAnimatorOfFloat10.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.iR.setDuration(50L);
        this.WR.setDuration(1500L);
        this.Kg.setDuration(50L);
        this.iR.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.Kg.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.WR.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.ldr.playSequentially(this.Kg, this.WR, this.iR);
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
            android.animation.AnimatorSet animatorSet3 = this.iR;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            android.animation.AnimatorSet animatorSet4 = this.WR;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
        }
    }

    public void setGuideText(java.lang.String str) {
        android.widget.TextView textView = this.eqN;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(java.lang.String str) {
        if (this.zx != null) {
            if (android.text.TextUtils.isEmpty(str)) {
                this.zx.setText("");
            } else {
                this.zx.setText(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IL();
    }
}
