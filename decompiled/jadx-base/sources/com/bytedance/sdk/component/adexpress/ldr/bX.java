package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends android.widget.FrameLayout {
    private android.widget.ImageView IL;
    private android.widget.ImageView bX;
    private android.content.Context bg;
    private android.widget.TextView eqN;
    private android.animation.AnimatorSet ldr;
    private com.bytedance.sdk.component.adexpress.ldr.VzQ zx;

    public bX(android.content.Context context) {
        super(context);
        this.ldr = new android.animation.AnimatorSet();
        this.bg = context;
        zx();
        ldr();
    }

    private void zx() {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.bg);
        this.zx = new com.bytedance.sdk.component.adexpress.ldr.VzQ(this.bg);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 95.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.zx, layoutParams);
        this.IL = new android.widget.ImageView(this.bg);
        int iBg = com.bytedance.sdk.component.utils.Ja.bg(this.bg, 60.0f);
        this.IL.setImageDrawable(com.bytedance.sdk.component.adexpress.eqN.WR.bg(1, null, null, new int[]{iBg, iBg}, java.lang.Integer.valueOf(com.bytedance.sdk.component.utils.Ja.bg(this.bg, 1.0f)), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#80FFFFFF"))));
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 75.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.IL, layoutParams2);
        this.bX = new android.widget.ImageView(this.bg);
        int iBg2 = com.bytedance.sdk.component.utils.Ja.bg(this.bg, 50.0f);
        this.bX.setImageDrawable(com.bytedance.sdk.component.adexpress.eqN.WR.bg(1, java.lang.Integer.valueOf(android.graphics.Color.parseColor("#80FFFFFF")), null, new int[]{iBg2, iBg2}, null, null));
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 63.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.bg, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.bX, layoutParams3);
        addView(frameLayout);
        android.widget.TextView textView = new android.widget.TextView(this.bg);
        this.eqN = textView;
        textView.setTextColor(-1);
        this.eqN.setMaxLines(1);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.eqN, layoutParams4);
    }

    private void ldr() {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.bX, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.bX, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.ldr.setDuration(800L);
        this.ldr.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void setGuideText(java.lang.String str) {
        this.eqN.setText(str);
    }

    public void bg() {
        this.ldr.start();
    }

    public void IL() {
        this.ldr.cancel();
    }

    public void bX() {
        this.zx.bg();
    }

    public void eqN() {
        this.zx.IL();
        this.zx.bX();
    }
}
