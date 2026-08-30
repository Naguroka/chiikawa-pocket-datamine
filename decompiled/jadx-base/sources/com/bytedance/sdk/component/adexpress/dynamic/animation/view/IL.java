package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends android.widget.ImageView implements com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation {
    private float IL;
    private float bX;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.bX bg;
    private float eqN;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.iR ldr;
    private float zx;

    public com.bytedance.sdk.component.adexpress.dynamic.eqN.iR getBrickNativeValue() {
        return this.ldr;
    }

    public void setBrickNativeValue(com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        this.ldr = iRVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.bX = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.IL = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.eqN = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.zx;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.zx = f;
        this.bg.bg(this, f);
    }

    public IL(android.content.Context context) {
        super(context);
        this.bg = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.bX();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar;
        super.onDraw(canvas);
        this.bg.bg(canvas, this, this);
        if (getRippleValue() == 0.0f || (iRVar = this.ldr) == null || iRVar.IL() <= 0) {
            return;
        }
        ((android.view.ViewGroup) getParent()).setClipChildren(false);
        ((android.view.ViewGroup) getParent().getParent()).setClipChildren(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bg.bg(this, i, i2);
    }
}
