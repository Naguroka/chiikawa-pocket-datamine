package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class Kg extends com.bytedance.sdk.component.adexpress.ldr.rri {
    private android.widget.ImageView IL;
    private android.widget.ImageView bX;
    private android.widget.TextView bg;
    private android.widget.ImageView eqN;
    private android.animation.AnimatorSet ldr;
    private int zx;

    @Override // com.bytedance.sdk.component.adexpress.ldr.rri
    protected void bg(android.content.Context context) {
    }

    public Kg(android.content.Context context) {
        super(context);
        this.ldr = new android.animation.AnimatorSet();
        IL(context);
    }

    private void IL(android.content.Context context) {
        addView(com.bytedance.sdk.component.adexpress.bX.bg.IL(context));
        this.IL = (android.widget.ImageView) findViewById(2097610751);
        this.bX = (android.widget.ImageView) findViewById(2097610750);
        this.eqN = (android.widget.ImageView) findViewById(2097610749);
        this.bg = (android.widget.TextView) findViewById(2097610748);
    }

    public void setButtonText(java.lang.String str) {
        if (this.bg == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.bg.setText(str);
    }

    private void eqN() {
        android.animation.ObjectAnimator objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new android.view.animation.LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    public float getAlphaColor() {
        return this.zx;
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i2 = i + org.objectweb.asm.Opcodes.MONITOREXIT;
        this.eqN.setColorFilter(android.graphics.Color.rgb(i2, i2, i2), android.graphics.PorterDuff.Mode.SRC_IN);
        int i3 = ((i + 20) % 60) + org.objectweb.asm.Opcodes.MONITOREXIT;
        this.bX.setColorFilter(android.graphics.Color.rgb(i3, i3, i3), android.graphics.PorterDuff.Mode.SRC_IN);
        int i4 = ((i + 40) % 60) + org.objectweb.asm.Opcodes.MONITOREXIT;
        this.IL.setColorFilter(android.graphics.Color.rgb(i4, i4, i4), android.graphics.PorterDuff.Mode.SRC_IN);
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.rri
    public void bg() {
        eqN();
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.rri
    public void IL() {
        this.ldr.cancel();
    }
}
