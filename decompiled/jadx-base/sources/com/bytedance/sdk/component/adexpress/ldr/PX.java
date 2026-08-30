package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class PX extends android.view.View {
    android.graphics.Rect IL;
    private int Kg;
    private final java.util.List<com.bytedance.sdk.component.adexpress.ldr.PX.bg> Lq;
    private android.graphics.Xfermode PX;
    private android.graphics.PorterDuff.Mode Ta;
    private android.graphics.Paint VB;
    private int[] WR;
    private int bX;
    android.graphics.Rect bg;
    private android.graphics.Bitmap eo;
    private int eqN;
    private int iR;
    private int ldr;
    private android.graphics.LinearGradient yDt;
    private int zx;

    public PX(android.content.Context context) {
        super(context);
        this.Ta = android.graphics.PorterDuff.Mode.DST_IN;
        this.Lq = new java.util.ArrayList();
        bg();
    }

    private void bg() {
        this.bX = com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_splash_unlock_image_arrow");
        this.eqN = android.graphics.Color.parseColor("#00ffffff");
        this.zx = android.graphics.Color.parseColor("#ffffffff");
        int color = android.graphics.Color.parseColor("#00ffffff");
        this.ldr = color;
        this.iR = 10;
        this.Kg = 40;
        this.WR = new int[]{this.eqN, this.zx, color};
        setLayerType(1, null);
        this.VB = new android.graphics.Paint(1);
        this.eo = android.graphics.BitmapFactory.decodeResource(getResources(), this.bX);
        this.PX = new android.graphics.PorterDuffXfermode(this.Ta);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.eo, this.bg, this.IL, this.VB);
        canvas.save();
        java.util.Iterator<com.bytedance.sdk.component.adexpress.ldr.PX.bg> it = this.Lq.iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.ldr.PX.bg next = it.next();
            this.yDt = new android.graphics.LinearGradient(next.IL, 0.0f, next.IL + this.Kg, this.iR, this.WR, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
            this.VB.setColor(-1);
            this.VB.setShader(this.yDt);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.VB);
            this.VB.setShader(null);
            next.bg();
            if (next.IL > getWidth()) {
                it.remove();
            }
        }
        this.VB.setXfermode(this.PX);
        canvas.drawBitmap(this.eo, this.bg, this.IL, this.VB);
        this.VB.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.eo == null) {
            return;
        }
        this.bg = new android.graphics.Rect(0, 0, this.eo.getWidth(), this.eo.getHeight());
        this.IL = new android.graphics.Rect(0, 0, getWidth(), getHeight());
    }

    public void bg(int i) {
        this.Lq.add(new com.bytedance.sdk.component.adexpress.ldr.PX.bg(i));
        postInvalidate();
    }

    public static class bg {
        private int IL = 0;
        private final int bg;

        public bg(int i) {
            this.bg = i;
        }

        public void bg() {
            this.IL += this.bg;
        }
    }
}
