package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class iR extends com.bytedance.sdk.component.adexpress.ldr.rri {
    private android.view.View IL;
    private android.animation.AnimatorSet bX;
    private android.widget.TextView bg;

    @Override // com.bytedance.sdk.component.adexpress.ldr.rri
    protected void bg(android.content.Context context) {
    }

    public iR(android.content.Context context) {
        super(context);
        this.bX = new android.animation.AnimatorSet();
        IL(context);
    }

    private void IL(android.content.Context context) {
        android.view.View viewBg = com.bytedance.sdk.component.adexpress.bX.bg.bg(context);
        this.IL = viewBg;
        addView(viewBg);
        setClipChildren(false);
        this.bg = (android.widget.TextView) findViewById(2097610748);
    }

    public void setButtonText(java.lang.String str) {
        if (this.bg == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.bg.setText(str);
    }

    private void eqN() {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.IL, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new android.view.animation.CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.IL, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new android.view.animation.CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.bX.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.bX.setDuration(1000L);
        this.bX.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.rri
    public void bg() {
        eqN();
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.rri
    public void IL() {
        this.bX.cancel();
    }
}
