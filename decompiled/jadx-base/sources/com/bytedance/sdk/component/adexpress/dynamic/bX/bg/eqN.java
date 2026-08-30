package com.bytedance.sdk.component.adexpress.dynamic.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN implements android.view.View.OnTouchListener {
    private float IL;
    private boolean Kg;
    private boolean VB;
    private com.bytedance.sdk.component.adexpress.dynamic.bX.Kg WR;
    private float bX;
    private float bg;
    private int eo;
    private float eqN;
    private float iR;
    private float ldr;
    private boolean zx = true;

    public eqN(com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg, int i, boolean z) {
        this.WR = kg;
        this.eo = i;
        this.VB = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg;
        com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg2;
        com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bg = motionEvent.getX();
            this.IL = motionEvent.getY();
            this.ldr = motionEvent.getY();
            this.zx = true;
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.iR = y;
                if (java.lang.Math.abs(y - this.ldr) > 10.0f) {
                    this.Kg = true;
                }
                this.eqN = motionEvent.getX();
                this.bX = motionEvent.getY();
                if (java.lang.Math.abs(this.eqN - this.bg) > 8.0f || java.lang.Math.abs(this.bX - this.IL) > 8.0f) {
                    this.zx = false;
                }
            }
        } else {
            if (!this.Kg && !this.zx) {
                return false;
            }
            if (!this.VB && (kg3 = this.WR) != null) {
                kg3.bg();
            } else {
                int iIL = com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg(), java.lang.Math.abs(this.iR - this.ldr));
                if (this.iR - this.ldr < 0.0f && iIL > this.eo && (kg2 = this.WR) != null) {
                    kg2.bg();
                } else if (this.zx && (kg = this.WR) != null) {
                    kg.bg();
                }
            }
        }
        return true;
    }
}
