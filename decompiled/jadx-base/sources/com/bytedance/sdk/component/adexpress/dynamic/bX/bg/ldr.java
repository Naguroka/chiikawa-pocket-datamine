package com.bytedance.sdk.component.adexpress.dynamic.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr implements android.view.View.OnTouchListener {
    private static int bX = 10;
    private float IL;
    private float bg;
    private boolean eqN;
    private com.bytedance.sdk.component.adexpress.dynamic.bX.Kg zx;

    public ldr(com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg) {
        this.zx = kg;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bg = motionEvent.getX();
            this.IL = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (java.lang.Math.abs(x - this.bg) >= bX || java.lang.Math.abs(y - this.IL) >= bX) {
                    this.eqN = true;
                }
            } else if (action == 3) {
                this.eqN = false;
            }
        } else {
            if (this.eqN) {
                this.eqN = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (java.lang.Math.abs(x2 - this.bg) >= bX || java.lang.Math.abs(y2 - this.IL) >= bX) {
                this.eqN = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg = this.zx;
                if (kg != null) {
                    kg.bg();
                }
            }
        }
        return true;
    }
}
