package com.bytedance.sdk.component.adexpress.dynamic.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements android.view.View.OnTouchListener {
    private float IL;
    private long bX;
    private float bg;
    private boolean eqN;
    private com.bytedance.sdk.component.adexpress.dynamic.bX.Kg ldr;
    private com.bytedance.sdk.component.adexpress.dynamic.bX.WR zx;

    public IL(com.bytedance.sdk.component.adexpress.dynamic.bX.WR wr, com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg) {
        this.zx = wr;
        this.ldr = kg;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bX = java.lang.System.currentTimeMillis();
            this.bg = motionEvent.getX();
            this.IL = motionEvent.getY();
            this.zx.zx();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (java.lang.Math.abs(x - this.bg) >= com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), 10.0f) || java.lang.Math.abs(y - this.IL) >= com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), 10.0f)) {
                    this.eqN = true;
                    this.zx.ldr();
                }
            }
        } else {
            if (this.eqN) {
                return false;
            }
            if (java.lang.System.currentTimeMillis() - this.bX >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg = this.ldr;
                if (kg != null) {
                    kg.bg();
                }
            } else {
                this.zx.ldr();
            }
        }
        return true;
    }
}
