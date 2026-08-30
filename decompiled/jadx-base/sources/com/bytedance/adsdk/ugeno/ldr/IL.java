package com.bytedance.adsdk.ugeno.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.ugeno.ldr.bg<com.bytedance.adsdk.ugeno.IL.bX> {
    private com.bytedance.adsdk.ugeno.bX bX;

    public IL(android.content.Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ldr.bg
    public android.view.View iR(int i) {
        return ((com.bytedance.adsdk.ugeno.IL.bX) this.bg.get(i)).WR();
    }

    public void bg(com.bytedance.adsdk.ugeno.bX bXVar) {
        this.bX = bXVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            int[] iArrBg = bXVar.bg(i, i2);
            super.onMeasure(iArrBg[0], iArrBg[1]);
        } else {
            super.onMeasure(i, i2);
        }
        com.bytedance.adsdk.ugeno.bX bXVar2 = this.bX;
        if (bXVar2 != null) {
            bXVar2.zx();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.ldr();
        }
        super.onLayout(z, i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.bX bXVar2 = this.bX;
        if (bXVar2 != null) {
            bXVar2.bg(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.iR();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.Kg();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.IL(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
