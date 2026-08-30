package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends android.widget.FrameLayout {
    private android.animation.ObjectAnimator IL;
    private int Kg;
    private int WR;
    private boolean bX;
    private android.animation.AnimatorSet bg;
    private android.content.Context eo;
    private android.view.View eqN;
    private android.widget.ImageView iR;
    private android.view.View ldr;
    private android.view.View zx;

    public IL(android.content.Context context, int i, int i2) {
        super(context);
        this.bX = false;
        this.bg = new android.animation.AnimatorSet();
        this.Kg = i;
        this.WR = i2;
        this.eo = context;
        bX();
        eqN();
    }

    private void bX() {
        android.view.View view = new android.view.View(this.eo);
        this.eqN = view;
        view.setBackground(bg("#1A7BBEFF", "#337BBEFF"));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) (((double) this.Kg) * 0.45d), (int) (((double) this.WR) * 0.45d));
        layoutParams.gravity = 17;
        this.eqN.setLayoutParams(layoutParams);
        addView(this.eqN);
        android.view.View view2 = new android.view.View(this.eo);
        this.zx = view2;
        view2.setBackground(bg("#337BBEFF", "#807BBEFF"));
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams((int) (((double) this.Kg) * 0.25d), (int) (((double) this.WR) * 0.25d));
        layoutParams2.gravity = 17;
        this.zx.setLayoutParams(layoutParams2);
        addView(this.zx);
        android.view.View view3 = new android.view.View(this.eo);
        this.ldr = view3;
        view3.setBackground(bg("#807BBEFF", "#FF7BBEFF"));
        int i = this.Kg;
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams((int) (((double) i) * 0.25d), (int) (((double) i) * 0.25d));
        layoutParams3.gravity = 17;
        this.ldr.setLayoutParams(layoutParams3);
        addView(this.ldr);
        android.widget.ImageView imageView = new android.widget.ImageView(this.eo);
        this.iR = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_blue_hand"));
        this.iR.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams((int) (((double) this.Kg) * 0.62d), (int) (((double) this.WR) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.iR.setLayoutParams(layoutParams4);
        addView(this.iR);
    }

    private void eqN() {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.eqN, "scaleX", 1.0f, 2.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.eqN, "scaleY", 1.0f, 2.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(this.zx, "scaleX", 1.0f, 2.5f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat4 = android.animation.ObjectAnimator.ofFloat(this.zx, "scaleY", 1.0f, 2.5f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat5 = android.animation.ObjectAnimator.ofFloat(this.ldr, "scaleX", 1.0f, 1.5f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat6 = android.animation.ObjectAnimator.ofFloat(this.ldr, "scaleY", 1.0f, 1.5f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat7 = android.animation.ObjectAnimator.ofFloat(this.iR, androidx.constraintlayout.motion.widget.Key.ROTATION, 0.0f, -20.0f, 0.0f);
        this.IL = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.bg.setDuration(1500L);
        this.bg.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.bg.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.bg.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.IL.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (com.bytedance.sdk.component.adexpress.ldr.IL.this.bX) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.ldr.IL.this.IL.start();
                com.bytedance.sdk.component.adexpress.ldr.IL.this.bg.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                com.bytedance.sdk.component.adexpress.ldr.IL.this.bX = true;
            }
        });
    }

    private android.graphics.drawable.GradientDrawable bg(java.lang.String str, java.lang.String str2) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(android.graphics.Color.parseColor(str));
        gradientDrawable.setStroke(1, android.graphics.Color.parseColor(str2));
        return gradientDrawable;
    }

    public void bg() {
        this.bX = false;
        android.animation.ObjectAnimator objectAnimator = this.IL;
        if (objectAnimator == null || this.bg == null) {
            return;
        }
        objectAnimator.start();
        this.bg.start();
    }

    public void IL() {
        this.bX = true;
        android.animation.ObjectAnimator objectAnimator = this.IL;
        if (objectAnimator == null || this.bg == null) {
            return;
        }
        objectAnimator.cancel();
        this.bg.cancel();
    }
}
