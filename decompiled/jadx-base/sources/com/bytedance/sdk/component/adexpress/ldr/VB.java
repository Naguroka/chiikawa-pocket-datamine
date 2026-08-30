package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class VB extends android.widget.FrameLayout {
    private final android.widget.ImageView IL;
    private final com.bytedance.sdk.component.adexpress.ldr.PX bX;
    private final android.widget.TextView bg;
    private final android.view.animation.RotateAnimation eqN;

    public VB(android.content.Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.bX.bg.eqN(context));
        this.bg = (android.widget.TextView) findViewById(2097610742);
        this.IL = (android.widget.ImageView) findViewById(2097610745);
        this.bX = (com.bytedance.sdk.component.adexpress.ldr.PX) findViewById(2097610744);
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.eqN = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
    }

    public void setText(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        android.widget.TextView textView = this.bg;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void bg() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void IL() {
        this.eqN.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Runnable getHaloAnimation() {
        return new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.VB.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.ldr.VB.this.IL.startAnimation(com.bytedance.sdk.component.adexpress.ldr.VB.this.eqN);
                com.bytedance.sdk.component.adexpress.ldr.VB.this.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.VB.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.adexpress.ldr.VB.this.bX.bg(4);
                    }
                }, 100L);
                com.bytedance.sdk.component.adexpress.ldr.VB.this.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.VB.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.adexpress.ldr.VB.this.bX.bg(4);
                    }
                }, 300L);
                com.bytedance.sdk.component.adexpress.ldr.VB vb = com.bytedance.sdk.component.adexpress.ldr.VB.this;
                vb.postDelayed(vb.getHaloAnimation(), 1200L);
            }
        };
    }
}
