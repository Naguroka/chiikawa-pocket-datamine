package com.bytedance.sdk.component.adexpress.dynamic.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Kg implements android.view.View.OnTouchListener {
    private final boolean IL;
    private final int bX = 10;
    private final com.bytedance.sdk.component.adexpress.dynamic.bX.Kg bg;
    private float eqN;
    private float iR;
    private float ldr;
    private float zx;

    public Kg(com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg, boolean z) {
        this.bg = kg;
        this.IL = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg;
        com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.eqN = motionEvent.getX();
            this.zx = motionEvent.getY();
            java.lang.Object[] objArr = new java.lang.Object[3];
            java.lang.Float.valueOf(this.eqN);
            java.lang.String str = ", mStartY: " + this.zx;
        } else if (action == 1) {
            this.ldr = motionEvent.getX();
            this.iR = motionEvent.getY();
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            java.lang.Float.valueOf(this.ldr);
            java.lang.String str2 = ", mEndY: " + this.iR;
            if (!this.IL && (kg2 = this.bg) != null) {
                kg2.bg();
            } else {
                float f = this.ldr - this.eqN;
                float f2 = this.iR - this.zx;
                float fSqrt = (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
                java.lang.Object[] objArr3 = new java.lang.Object[2];
                java.lang.Float.valueOf(fSqrt);
                float fIL = com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg(), java.lang.Math.abs(fSqrt));
                java.lang.Object[] objArr4 = new java.lang.Object[5];
                java.lang.Float.valueOf(fIL);
                java.lang.Integer.valueOf(10);
                if (fIL > 10.0f && (kg = this.bg) != null) {
                    kg.bg();
                }
            }
        }
        return true;
    }
}
