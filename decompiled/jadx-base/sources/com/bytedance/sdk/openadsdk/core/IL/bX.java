package com.bytedance.sdk.openadsdk.core.IL;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bX implements android.view.View.OnClickListener, android.view.View.OnTouchListener {
    private static float IL = 0.0f;
    protected static int aGH = 8;
    private static float bX;
    private static float bg;
    private static float eqN;
    private static long zx;
    protected android.view.View VJ;
    protected float LZ = -1.0f;
    protected float tC = -1.0f;
    protected float rri = -1.0f;
    protected float kMt = -1.0f;
    protected long JAA = -1;
    protected long Ja = -1;
    protected int Uw = -1;
    protected int DDQ = -1024;
    protected int Uq = -1;
    protected boolean VW = true;
    public android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> daV = new android.util.SparseArray<>();
    private int ldr = 0;
    private int iR = 0;

    protected abstract void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z);

    static {
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() != null) {
            aGH = com.bytedance.sdk.openadsdk.core.VzQ.IL();
        }
        bg = 0.0f;
        IL = 0.0f;
        bX = 0.0f;
        eqN = 0.0f;
        zx = 0L;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            bg(view, this.LZ, this.tC, this.rri, this.kMt, this.daV, this.VW);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i;
        this.DDQ = motionEvent.getDeviceId();
        this.Uw = motionEvent.getToolType(0);
        this.Uq = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 1;
        if (actionMasked != 0) {
            int i3 = 3;
            if (actionMasked == 1) {
                this.rri = motionEvent.getRawX();
                this.kMt = motionEvent.getRawY();
                this.Ja = java.lang.System.currentTimeMillis();
                if (java.lang.Math.abs(this.rri - this.ldr) >= aGH || java.lang.Math.abs(this.kMt - this.iR) >= aGH) {
                    this.VW = false;
                }
                android.graphics.Point point = new android.graphics.Point((int) this.rri, (int) this.kMt);
                if (view != null && !com.bytedance.sdk.openadsdk.core.IL.IL.bX(view) && bg((android.view.View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i3 = actionMasked != 3 ? -1 : 4;
            } else {
                bX += java.lang.Math.abs(motionEvent.getX() - bg);
                eqN += java.lang.Math.abs(motionEvent.getY() - IL);
                bg = motionEvent.getX();
                IL = motionEvent.getY();
                if (java.lang.System.currentTimeMillis() - zx > 200) {
                    float f = bX;
                    int i4 = aGH;
                    if (f <= i4 && eqN <= i4) {
                        i2 = 2;
                    }
                } else {
                    i2 = 2;
                }
                this.rri = motionEvent.getRawX();
                this.kMt = motionEvent.getRawY();
                if (java.lang.Math.abs(this.rri - this.ldr) >= aGH || java.lang.Math.abs(this.kMt - this.iR) >= aGH) {
                    this.VW = false;
                }
                i = i2;
            }
            i = i3;
        } else {
            this.ldr = (int) motionEvent.getRawX();
            this.iR = (int) motionEvent.getRawY();
            this.LZ = motionEvent.getRawX();
            this.tC = motionEvent.getRawY();
            this.JAA = java.lang.System.currentTimeMillis();
            this.Uw = motionEvent.getToolType(0);
            this.DDQ = motionEvent.getDeviceId();
            this.Uq = motionEvent.getSource();
            zx = java.lang.System.currentTimeMillis();
            this.VW = true;
            this.VJ = view;
            com.bytedance.sdk.openadsdk.core.WR.bX.bg(motionEvent);
            i = 0;
        }
        this.daV.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.IL.bX.bg(i, motionEvent.getSize(), motionEvent.getPressure(), java.lang.System.currentTimeMillis()));
        return false;
    }

    private boolean bg(android.view.View view, android.graphics.Point point) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (com.bytedance.sdk.openadsdk.core.IL.IL.bX(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && point.x >= iArr[0] && point.x <= iArr[0] + childAt.getWidth() && point.y >= iArr[1] && point.y <= iArr[1] + childAt.getHeight();
                }
                if (bg(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class bg {
        public double IL;
        public double bX;
        public int bg;
        public long eqN;

        public bg(int i, double d, double d2, long j) {
            this.bg = i;
            this.IL = d;
            this.bX = d2;
            this.eqN = j;
        }
    }

    public boolean iR() {
        return this.VW;
    }
}
