package com.bytedance.adsdk.ugeno.core.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private float IL;
    private com.bytedance.adsdk.ugeno.core.eo bX;
    private float bg;
    private android.content.Context eqN;
    private boolean zx;

    public IL(android.content.Context context, com.bytedance.adsdk.ugeno.core.eo eoVar) {
        this.eqN = context;
        this.bX = eoVar;
    }

    public boolean bg(com.bytedance.adsdk.ugeno.core.PX px, com.bytedance.adsdk.ugeno.IL.bX bXVar, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bg = motionEvent.getX();
            this.IL = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (java.lang.Math.abs(x - this.bg) >= 15.0f || java.lang.Math.abs(y - this.IL) >= 15.0f) {
                    this.zx = true;
                }
            } else if (action == 3) {
                this.zx = false;
            }
        } else {
            if (this.zx) {
                this.zx = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (java.lang.Math.abs(x2 - this.bg) >= 15.0f || java.lang.Math.abs(y2 - this.IL) >= 15.0f) {
                this.zx = false;
            } else if (px != null) {
                px.bg(this.bX, bXVar, bXVar);
                return true;
            }
        }
        return true;
    }
}
