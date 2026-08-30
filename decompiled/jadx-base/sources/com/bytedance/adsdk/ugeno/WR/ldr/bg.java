package com.bytedance.adsdk.ugeno.WR.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends android.widget.TextView implements com.bytedance.adsdk.ugeno.bg.zx, com.bytedance.adsdk.ugeno.core.IAnimation {
    private float IL;
    private com.bytedance.adsdk.ugeno.bg.ldr bX;
    private com.bytedance.adsdk.ugeno.bX bg;

    public bg(android.content.Context context) {
        super(context);
        this.bX = new com.bytedance.adsdk.ugeno.bg.ldr(this);
    }

    public void bg(com.bytedance.adsdk.ugeno.bX bXVar) {
        this.bg = bXVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            int[] iArrBg = bXVar.bg(i, i2);
            super.onMeasure(iArrBg[0], iArrBg[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.bg(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.IL;
    }

    public void setShine(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.bX;
        if (ldrVar != null) {
            ldrVar.bX(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getShine() {
        return this.bX.getShine();
    }

    public void setStretch(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.bX;
        if (ldrVar != null) {
            ldrVar.eqN(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getStretch() {
        return this.bX.getStretch();
    }

    public void setRubIn(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.bX;
        if (ldrVar != null) {
            ldrVar.zx(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getRubIn() {
        return this.bX.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.IL = f;
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.bX;
        if (ldrVar != null) {
            ldrVar.IL(f);
        }
        postInvalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.bg(canvas, this);
            this.bg.bg(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.IL(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.iR();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.Kg();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setBorderRadius(float f) {
        com.bytedance.adsdk.ugeno.bg.ldr ldrVar = this.bX;
        if (ldrVar != null) {
            ldrVar.bg(f);
        }
    }

    public float getBorderRadius() {
        return this.bX.bg();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.bX.bg(i);
    }
}
