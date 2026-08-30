package com.bytedance.adsdk.ugeno.WR.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends android.widget.FrameLayout {
    private java.util.Map<java.lang.Integer, com.bytedance.adsdk.ugeno.core.eo> IL;
    private com.bytedance.adsdk.ugeno.bX bg;

    public bg(android.content.Context context) {
        super(context);
    }

    public void setEventMap(java.util.Map<java.lang.Integer, com.bytedance.adsdk.ugeno.core.eo> map) {
        this.IL = map;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            int[] iArrBg = bXVar.bg(i, i2);
            super.onMeasure(iArrBg[0], iArrBg[1]);
        } else {
            super.onMeasure(i, i2);
        }
        com.bytedance.adsdk.ugeno.bX bXVar2 = this.bg;
        if (bXVar2 != null) {
            bXVar2.zx();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.ldr();
        }
        super.onLayout(z, i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.bX bXVar2 = this.bg;
        if (bXVar2 != null) {
            bXVar2.bg(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        java.util.Map<java.lang.Integer, com.bytedance.adsdk.ugeno.core.eo> map = this.IL;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void bg(com.bytedance.adsdk.ugeno.bX bXVar) {
        this.bg = bXVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.iR();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.Kg();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.IL(i, i2, i3, i4);
        }
    }
}
