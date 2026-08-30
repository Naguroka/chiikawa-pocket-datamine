package com.bytedance.sdk.openadsdk.core.IL;

/* JADX INFO: loaded from: classes4.dex */
public class ldr {
    private static float Lq = 0.0f;
    private static float Ta = 0.0f;
    public static int eo = 8;
    private static float vb;
    private static long xxp;
    private static float yDt;
    public float bg = -1.0f;
    public float IL = -1.0f;
    public float bX = -1.0f;
    public float eqN = -1.0f;
    public long zx = -1;
    public long ldr = -1;
    public int iR = -1;
    public int Kg = -1024;
    public int WR = -1;
    public boolean VB = true;
    public android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> PX = new android.util.SparseArray<>();
    private int VzQ = 0;
    private int tuV = 0;

    static {
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() != null) {
            eo = com.bytedance.sdk.openadsdk.core.VzQ.IL();
        }
        Ta = 0.0f;
        yDt = 0.0f;
        Lq = 0.0f;
        vb = 0.0f;
        xxp = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    public void bg(android.view.MotionEvent motionEvent) {
        int i;
        this.Kg = motionEvent.getDeviceId();
        int i2 = 0;
        this.iR = motionEvent.getToolType(0);
        this.WR = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 1;
        if (actionMasked == 0) {
            this.VzQ = (int) motionEvent.getRawX();
            this.tuV = (int) motionEvent.getRawY();
            this.bg = motionEvent.getRawX();
            this.IL = motionEvent.getRawY();
            this.zx = java.lang.System.currentTimeMillis();
            this.iR = motionEvent.getToolType(0);
            this.Kg = motionEvent.getDeviceId();
            this.WR = motionEvent.getSource();
            xxp = java.lang.System.currentTimeMillis();
            this.VB = true;
        } else {
            if (actionMasked == 1) {
                this.bX = motionEvent.getRawX();
                this.eqN = motionEvent.getRawY();
                this.ldr = java.lang.System.currentTimeMillis();
                if (java.lang.Math.abs(this.bX - this.VzQ) >= eo || java.lang.Math.abs(this.eqN - this.tuV) >= eo) {
                    this.VB = false;
                }
                i = 3;
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                Lq += java.lang.Math.abs(motionEvent.getX() - Ta);
                vb += java.lang.Math.abs(motionEvent.getY() - yDt);
                Ta = motionEvent.getX();
                yDt = motionEvent.getY();
                if (java.lang.System.currentTimeMillis() - xxp > 200) {
                    float f = Lq;
                    int i4 = eo;
                    if (f <= i4 && vb <= i4) {
                        i3 = 2;
                    }
                } else {
                    i3 = 2;
                }
                this.bX = motionEvent.getRawX();
                this.eqN = motionEvent.getRawY();
                if (java.lang.Math.abs(this.bX - this.VzQ) >= eo || java.lang.Math.abs(this.eqN - this.tuV) >= eo) {
                    this.VB = false;
                }
                i = i3;
            }
            this.PX.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.IL.bX.bg(i, motionEvent.getSize(), motionEvent.getPressure(), java.lang.System.currentTimeMillis()));
        }
        i = i2;
        this.PX.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.IL.bX.bg(i, motionEvent.getSize(), motionEvent.getPressure(), java.lang.System.currentTimeMillis()));
    }
}
