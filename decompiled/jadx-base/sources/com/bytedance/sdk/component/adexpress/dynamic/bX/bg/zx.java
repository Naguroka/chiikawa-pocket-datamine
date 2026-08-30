package com.bytedance.sdk.component.adexpress.dynamic.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class zx implements android.view.View.OnTouchListener {
    private float IL;
    private boolean bX;
    private float bg;
    private com.bytedance.sdk.component.adexpress.dynamic.bX.Kg eqN;
    private int zx;

    public zx(com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg, int i) {
        this.eqN = kg;
        this.zx = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bg = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.IL = y;
                if (java.lang.Math.abs(y - this.bg) > 10.0f) {
                    this.bX = true;
                }
            }
        } else {
            if (!this.bX) {
                return false;
            }
            int iIL = com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg(), java.lang.Math.abs(this.IL - this.bg));
            if (this.IL - this.bg < 0.0f && iIL > this.zx && (kg = this.eqN) != null) {
                kg.bg();
                this.bg = 0.0f;
                this.IL = 0.0f;
                this.bX = false;
            }
        }
        return true;
    }
}
