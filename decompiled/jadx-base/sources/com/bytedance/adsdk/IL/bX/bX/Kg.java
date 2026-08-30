package com.bytedance.adsdk.IL.bX.bX;

/* JADX INFO: loaded from: classes3.dex */
public class Kg extends com.bytedance.adsdk.IL.bX.bX.bg {
    private final android.graphics.Paint Kg;
    private com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> PX;
    private final com.bytedance.adsdk.IL.bX.bX.zx VB;
    private final float[] WR;
    private final android.graphics.Path eo;
    private final android.graphics.RectF iR;

    Kg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.zx zxVar) {
        super(wr, zxVar);
        this.iR = new android.graphics.RectF();
        com.bytedance.adsdk.IL.bg.bg bgVar = new com.bytedance.adsdk.IL.bg.bg();
        this.Kg = bgVar;
        this.WR = new float[8];
        this.eo = new android.graphics.Path();
        this.VB = zxVar;
        bgVar.setAlpha(0);
        bgVar.setStyle(android.graphics.Paint.Style.FILL);
        bgVar.setColor(zxVar.vb());
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg
    public void IL(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        super.IL(canvas, matrix, i);
        int iAlpha = android.graphics.Color.alpha(this.VB.vb());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.eqN.bg() == null ? 100 : this.eqN.bg().iR().intValue())) / 100.0f) * 255.0f);
        this.Kg.setAlpha(iIntValue);
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> bgVar = this.PX;
        if (bgVar != null) {
            this.Kg.setColorFilter(bgVar.iR());
        }
        if (iIntValue > 0) {
            float[] fArr = this.WR;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.VB.VzQ();
            float[] fArr2 = this.WR;
            fArr2[3] = 0.0f;
            fArr2[4] = this.VB.VzQ();
            this.WR[5] = this.VB.xxp();
            float[] fArr3 = this.WR;
            fArr3[6] = 0.0f;
            fArr3[7] = this.VB.xxp();
            matrix.mapPoints(this.WR);
            this.eo.reset();
            android.graphics.Path path = this.eo;
            float[] fArr4 = this.WR;
            path.moveTo(fArr4[0], fArr4[1]);
            android.graphics.Path path2 = this.eo;
            float[] fArr5 = this.WR;
            path2.lineTo(fArr5[2], fArr5[3]);
            android.graphics.Path path3 = this.eo;
            float[] fArr6 = this.WR;
            path3.lineTo(fArr6[4], fArr6[5]);
            android.graphics.Path path4 = this.eo;
            float[] fArr7 = this.WR;
            path4.lineTo(fArr7[6], fArr7[7]);
            android.graphics.Path path5 = this.eo;
            float[] fArr8 = this.WR;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.eo.close();
            canvas.drawPath(this.eo, this.Kg);
        }
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg, com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.bg(rectF, matrix, z);
        this.iR.set(0.0f, 0.0f, this.VB.VzQ(), this.VB.xxp());
        this.bg.mapRect(this.iR);
        rectF.set(this.iR);
    }
}
