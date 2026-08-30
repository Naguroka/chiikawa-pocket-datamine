package com.bytedance.adsdk.ugeno.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends com.bytedance.adsdk.ugeno.bg.bg.bg {
    private boolean Kg;
    private android.graphics.Path PX;
    private android.graphics.PorterDuffXfermode Ta;
    private android.graphics.Path VB;
    private boolean WR;
    private float bX;
    private android.graphics.Path eo;
    private float eqN;
    private java.lang.String iR;
    private float ldr;
    private android.graphics.Paint zx;

    public zx(com.bytedance.adsdk.ugeno.IL.bX bXVar, org.json.JSONObject jSONObject) {
        super(bXVar, jSONObject);
        this.Kg = true;
        this.WR = true;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.zx = paint;
        paint.setAntiAlias(true);
        this.IL.WR().setLayerType(2, null);
        this.Ta = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
        this.eo = new android.graphics.Path();
        this.VB = new android.graphics.Path();
        this.PX = new android.graphics.Path();
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void IL() {
        this.ldr = (float) this.bg.optDouble(androidx.media3.extractor.text.ttml.TtmlNode.START, 0.0d);
        this.iR = this.bg.optString("direction", androidx.media3.extractor.text.ttml.TtmlNode.CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void bg(android.graphics.Canvas canvas) {
        if (this.IL.bN() > 0.0f) {
            int iBN = (int) (this.bX * this.IL.bN());
            int iBN2 = (int) (this.eqN * this.IL.bN());
            this.zx.setXfermode(this.Ta);
            java.lang.String str = this.iR;
            str.hashCode();
            switch (str) {
                case "bottom":
                    canvas.drawRect(0.0f, iBN2, this.bX, this.eqN, this.zx);
                    break;
                case "center":
                    this.eo.reset();
                    this.VB.reset();
                    this.PX.reset();
                    this.eo.addCircle(this.bX / 2.0f, this.eqN / 2.0f, iBN, android.graphics.Path.Direction.CW);
                    android.graphics.Path path = this.VB;
                    float f = this.bX;
                    path.addRect(f / 2.0f, 0.0f, f, this.eqN, android.graphics.Path.Direction.CW);
                    this.VB.op(this.eo, android.graphics.Path.Op.DIFFERENCE);
                    this.PX.addRect(0.0f, 0.0f, this.bX / 2.0f, this.eqN, android.graphics.Path.Direction.CW);
                    this.PX.op(this.eo, android.graphics.Path.Op.DIFFERENCE);
                    canvas.drawPath(this.VB, this.zx);
                    canvas.drawPath(this.PX, this.zx);
                    break;
                case "top":
                    canvas.drawRect(0.0f, 0.0f, this.bX, this.eqN - iBN2, this.zx);
                    break;
                case "left":
                    canvas.drawRect(0.0f, 0.0f, this.bX - iBN, this.eqN, this.zx);
                    break;
                case "right":
                    canvas.drawRect(iBN, 0.0f, this.bX, this.eqN, this.zx);
                    break;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void bg(int i, int i2) {
        if (i > 0 && this.Kg) {
            this.bX = i;
            this.Kg = false;
        }
        if (i2 <= 0 || !this.WR) {
            return;
        }
        this.eqN = i2;
        this.WR = false;
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public java.util.List<android.animation.PropertyValuesHolder> bX() {
        android.animation.PropertyValuesHolder propertyValuesHolderOfFloat = android.animation.PropertyValuesHolder.ofFloat(eqN(), this.ldr, 1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
