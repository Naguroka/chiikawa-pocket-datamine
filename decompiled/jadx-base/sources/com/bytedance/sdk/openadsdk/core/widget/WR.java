package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class WR extends android.view.View {
    private static final int[] bg = {android.graphics.Color.parseColor("#1AFFFFFF"), android.graphics.Color.parseColor("#4DFFFFFF"), android.graphics.Color.parseColor("#99FFFFFF")};
    private final android.graphics.RectF IL;
    private int Kg;
    private int WR;
    private final android.graphics.RectF bX;
    private final java.util.ArrayList<com.bytedance.sdk.openadsdk.core.widget.WR.bg> eqN;
    private int iR;
    private final android.graphics.Paint ldr;
    private final android.graphics.Paint zx;

    public WR(android.content.Context context) {
        super(context);
        this.IL = new android.graphics.RectF();
        this.bX = new android.graphics.RectF();
        this.eqN = new java.util.ArrayList<>();
        this.ldr = new android.graphics.Paint();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.zx = paint;
        paint.setColor(android.graphics.Color.parseColor("#D9D9D9"));
    }

    public void setProgress(int i) {
        int i2 = this.Kg;
        if (i2 == i) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        if (i2 == i) {
            return;
        }
        this.Kg = i;
        bg();
    }

    private void bg() {
        if (this.iR <= 0) {
            return;
        }
        this.bX.right = java.lang.Math.max(this.WR, (int) (((this.Kg * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 / 2;
        this.iR = i5;
        this.WR = i5 * 5;
        float f = i;
        float f2 = i2;
        this.IL.set(0.0f, 0.0f, f, f2);
        this.bX.set(0.0f, 0.0f, 0.0f, f2);
        this.ldr.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, f, f2, new int[]{android.graphics.Color.parseColor("#90C0FF"), android.graphics.Color.parseColor("#196BE4")}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        this.eqN.clear();
        float f3 = this.iR / 4.0f;
        for (int i6 : bg) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setColor(i6);
            this.eqN.add(new com.bytedance.sdk.openadsdk.core.widget.WR.bg(paint, this.iR / 2.0f, f3, f2 / 2.0f));
            f3 += (this.iR / 2.0f) * 3.0f;
        }
        bg();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.RectF rectF = this.IL;
        int i = this.iR;
        canvas.drawRoundRect(rectF, i, i, this.zx);
        android.graphics.RectF rectF2 = this.bX;
        int i2 = this.iR;
        canvas.drawRoundRect(rectF2, i2, i2, this.ldr);
        int iSave = canvas.save();
        canvas.translate(this.bX.right - this.WR, 0.0f);
        for (com.bytedance.sdk.openadsdk.core.widget.WR.bg bgVar : this.eqN) {
            canvas.drawCircle(bgVar.bX, bgVar.eqN, bgVar.IL, bgVar.bg);
        }
        canvas.restoreToCount(iSave);
    }

    private static final class bg {
        public float IL;
        float bX;
        public android.graphics.Paint bg;
        float eqN;

        public bg(android.graphics.Paint paint, float f, float f2, float f3) {
            this.bg = paint;
            this.IL = f;
            this.bX = f2;
            this.eqN = f3;
        }
    }
}
