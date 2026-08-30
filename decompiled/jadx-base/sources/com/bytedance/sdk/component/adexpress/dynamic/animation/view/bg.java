package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends android.widget.TextView implements com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation {
    private float IL;
    private float bX;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.bX bg;
    private float eqN;
    private float zx;

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

    public bg(android.content.Context context) {
        super(context);
        this.bg = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.bX();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.bg.bg(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bg.bg(this, i, i2);
    }
}
