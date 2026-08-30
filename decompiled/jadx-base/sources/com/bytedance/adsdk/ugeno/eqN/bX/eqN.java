package com.bytedance.adsdk.ugeno.eqN.bX;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.adsdk.ugeno.eqN.bX.bg {
    private boolean VB;
    private float WR;
    private float eo;

    public eqN(android.content.Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.bX.bg
    public boolean bg(java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return bg(this.IL, (android.view.MotionEvent) objArr[0]);
    }

    public boolean bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.WR = motionEvent.getRawX();
            this.eo = motionEvent.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (java.lang.Math.abs(rawX - this.WR) >= 15.0f || java.lang.Math.abs(rawY - this.eo) >= 15.0f) {
                    this.VB = true;
                }
            } else if (action == 3) {
                this.VB = false;
            }
        } else {
            if (this.VB) {
                this.VB = false;
                this.WR = 0.0f;
                this.eo = 0.0f;
                return false;
            }
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (java.lang.Math.abs(rawX2 - this.WR) >= 15.0f || java.lang.Math.abs(rawY2 - this.eo) >= 15.0f) {
                this.VB = false;
            } else if (this.bg != null) {
                this.bg.bg(bXVar, this.ldr, this.bX.IL());
                this.WR = 0.0f;
                this.eo = 0.0f;
                return true;
            }
        }
        return true;
    }
}
