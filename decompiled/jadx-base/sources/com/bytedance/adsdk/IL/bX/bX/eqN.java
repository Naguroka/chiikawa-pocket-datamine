package com.bytedance.adsdk.IL.bX.bX;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.adsdk.IL.bX.bX.bg {
    private final android.graphics.Paint Kg;
    private com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.Bitmap, android.graphics.Bitmap> PX;
    private com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> VB;
    private final android.graphics.Rect WR;
    private final android.graphics.Rect eo;
    protected final com.bytedance.adsdk.IL.eo iR;

    eqN(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.zx zxVar) {
        super(wr, zxVar);
        this.Kg = new com.bytedance.adsdk.IL.bg.bg(3);
        this.WR = new android.graphics.Rect();
        this.eo = new android.graphics.Rect();
        this.iR = wr.ldr(zxVar.iR());
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg
    public void IL(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        super.IL(canvas, matrix, i);
        android.graphics.Bitmap bitmapPX = PX();
        if (bitmapPX == null || bitmapPX.isRecycled() || this.iR == null) {
            return;
        }
        float fBg = com.bytedance.adsdk.IL.ldr.ldr.bg();
        this.Kg.setAlpha(i);
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> bgVar = this.VB;
        if (bgVar != null) {
            this.Kg.setColorFilter(bgVar.iR());
        }
        canvas.save();
        canvas.concat(matrix);
        this.WR.set(0, 0, bitmapPX.getWidth(), bitmapPX.getHeight());
        if (this.IL.eqN()) {
            this.eo.set(0, 0, (int) (this.iR.bg() * fBg), (int) (this.iR.IL() * fBg));
        } else {
            this.eo.set(0, 0, (int) (bitmapPX.getWidth() * fBg), (int) (bitmapPX.getHeight() * fBg));
        }
        canvas.drawBitmap(bitmapPX, this.WR, this.eo, this.Kg);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg, com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.bg(rectF, matrix, z);
        if (this.iR != null) {
            float fBg = com.bytedance.adsdk.IL.ldr.ldr.bg();
            rectF.set(0.0f, 0.0f, this.iR.bg() * fBg, this.iR.IL() * fBg);
            this.bg.mapRect(rectF);
        }
    }

    private android.graphics.Bitmap PX() {
        android.graphics.Bitmap bitmapIR;
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.Bitmap, android.graphics.Bitmap> bgVar = this.PX;
        if (bgVar != null && (bitmapIR = bgVar.iR()) != null) {
            return bitmapIR;
        }
        android.graphics.Bitmap bitmapZx = this.IL.zx(this.bX.iR());
        if (bitmapZx != null) {
            return bitmapZx;
        }
        com.bytedance.adsdk.IL.eo eoVar = this.iR;
        if (eoVar != null) {
            return eoVar.eo();
        }
        return null;
    }
}
