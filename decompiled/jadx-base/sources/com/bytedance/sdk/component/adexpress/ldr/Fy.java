package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class Fy extends android.widget.LinearLayout {
    private android.widget.TextView IL;
    private android.widget.LinearLayout Kg;
    private org.json.JSONObject PX;
    private int VB;
    private int WR;
    private android.widget.ImageView bX;
    private android.widget.TextView bg;
    private int eo;
    private com.bytedance.sdk.component.utils.LZ eqN;
    private com.bytedance.sdk.component.adexpress.ldr.Fy.bg iR;
    private android.widget.TextView ldr;
    private android.widget.TextView zx;

    public interface bg {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public Fy(android.content.Context context, android.view.View view, int i, int i2, int i3, org.json.JSONObject jSONObject) {
        super(context);
        this.WR = i;
        this.eo = i2;
        this.VB = i3;
        this.PX = jSONObject;
        bg(context, view);
    }

    protected void bg(android.content.Context context, android.view.View view) {
        addView(view);
        this.Kg = (android.widget.LinearLayout) findViewById(2097610727);
        this.bX = (android.widget.ImageView) findViewById(2097610725);
        this.bg = (android.widget.TextView) findViewById(2097610724);
        this.IL = (android.widget.TextView) findViewById(2097610726);
        this.zx = (android.widget.TextView) findViewById(2097610723);
        this.ldr = (android.widget.TextView) findViewById(2097610728);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(android.graphics.Color.parseColor("#57000000"));
        this.Kg.setBackground(gradientDrawable);
    }

    public void setShakeText(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.zx.setVisibility(8);
            this.ldr.setVisibility(8);
        } else {
            this.zx.setText(str);
        }
    }

    public android.widget.LinearLayout getShakeLayout() {
        return this.Kg;
    }

    public void setOnShakeViewListener(com.bytedance.sdk.component.adexpress.ldr.Fy.bg bgVar) {
        this.iR = bgVar;
    }

    public void bg() {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new com.bytedance.sdk.component.adexpress.ldr.Fy.AnonymousClass1(), 500L);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ldr.Fy$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.ldr.Fy.this.bX != null) {
                final android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new com.bytedance.sdk.component.adexpress.ldr.Fy.IL(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.Fy.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(android.view.animation.Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(android.view.animation.Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(android.view.animation.Animation animation) {
                        com.bytedance.sdk.component.adexpress.ldr.Fy.this.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.Fy.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.bytedance.sdk.component.adexpress.ldr.Fy.this.bX.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }
                });
                com.bytedance.sdk.component.adexpress.ldr.Fy.this.bX.startAnimation(rotateAnimation);
            }
        }
    }

    private static class IL implements android.view.animation.Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f <= 0.25f) {
                return (f * (-2.0f)) + 0.5f;
            }
            if (f <= 0.5f) {
                return (f * 4.0f) - 1.0f;
            }
            return f <= 0.75f ? (f * (-4.0f)) + 3.0f : (f * 2.0f) - 1.5f;
        }

        private IL() {
        }

        /* synthetic */ IL(com.bytedance.sdk.component.adexpress.ldr.Fy.AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.eqN == null) {
                this.eqN = new com.bytedance.sdk.component.utils.LZ(getContext().getApplicationContext(), 1);
            }
            new java.lang.Object() { // from class: com.bytedance.sdk.component.adexpress.ldr.Fy.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
