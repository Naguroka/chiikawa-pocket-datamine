package com.bytedance.sdk.component.adexpress.dynamic.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX implements android.view.View.OnTouchListener {
    private float IL;
    private boolean Kg;
    private boolean WR;
    private float bX;
    private float bg;
    private float eqN;
    private int iR;
    private com.bytedance.sdk.component.adexpress.dynamic.bX.Kg ldr;
    private boolean zx;

    public bX(com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg) {
        this(kg, 5);
    }

    public bX(com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg, int i) {
        this.iR = 5;
        this.Kg = true;
        this.ldr = kg;
        if (i > 0) {
            this.iR = i;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg;
        com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg2;
        com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg3;
        if (this.WR) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bg = motionEvent.getX();
            this.IL = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.eqN = motionEvent.getX();
                this.bX = motionEvent.getY();
                if (java.lang.Math.abs(this.eqN - this.bg) > 10.0f) {
                    this.zx = true;
                }
                if (java.lang.Math.abs(this.eqN - this.bg) > 8.0f || java.lang.Math.abs(this.bX - this.IL) > 8.0f) {
                    this.Kg = false;
                }
                int iIL = com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg(), java.lang.Math.abs(this.eqN - this.bg));
                if (this.eqN > this.bg && iIL > this.iR && (kg3 = this.ldr) != null) {
                    kg3.bg();
                    this.WR = true;
                }
            }
        } else {
            if (!this.zx && !this.Kg) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iIL2 = com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg(), java.lang.Math.abs(this.eqN - this.bg));
            if (this.eqN > this.bg && iIL2 > this.iR && (kg2 = this.ldr) != null) {
                kg2.bg();
                this.WR = true;
            }
            float fAbs = java.lang.Math.abs(x - this.bg);
            float fAbs2 = java.lang.Math.abs(y - this.IL);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (kg = this.ldr) != null) {
                kg.IL();
                this.WR = true;
            }
        }
        return true;
    }
}
