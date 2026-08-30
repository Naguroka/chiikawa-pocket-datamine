package com.bytedance.sdk.component.adexpress.dynamic.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements android.view.View.OnTouchListener {
    private static int bX = 10;
    private float IL;
    private float bg;
    private com.bytedance.sdk.component.adexpress.dynamic.bX.Kg eqN;
    private int zx;
    private android.graphics.RectF ldr = new android.graphics.RectF();
    private long iR = 0;
    private final int Kg = 200;
    private final int WR = 3;
    private java.lang.ref.SoftReference<android.view.ViewGroup> eo = new java.lang.ref.SoftReference<>(null);

    public bg(com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg, int i, final android.view.ViewGroup viewGroup) {
        this.zx = bX;
        this.eqN = kg;
        if (i > 0) {
            this.zx = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.bg.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.adexpress.dynamic.bX.bg.bg.this.eo = new java.lang.ref.SoftReference(viewGroup);
                }
            });
        }
    }

    private android.graphics.RectF bg(android.view.View view) {
        if (view == null) {
            return new android.graphics.RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new android.graphics.RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ldr = bg(this.eo.get());
            this.bg = motionEvent.getRawX();
            this.IL = motionEvent.getRawY();
            this.iR = java.lang.System.currentTimeMillis();
        } else if (action == 1) {
            android.graphics.RectF rectF = this.ldr;
            if (rectF != null && !rectF.contains(this.bg, this.IL)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = java.lang.Math.abs(rawX - this.bg);
            float fAbs2 = java.lang.Math.abs(rawY - this.IL);
            int i = this.zx;
            if (fAbs >= i && fAbs2 >= i) {
                com.bytedance.sdk.component.adexpress.dynamic.bX.Kg kg2 = this.eqN;
                if (kg2 != null) {
                    kg2.bg();
                }
            } else if ((java.lang.System.currentTimeMillis() - this.iR < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (kg = this.eqN) != null) {
                kg.bg();
            }
        }
        return true;
    }
}
