package com.bytedance.adsdk.ugeno.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.adsdk.ugeno.bg.bg.bg {
    private static final float Lq;
    private static final float vb;
    private static final float xxp;
    private static final float yDt;
    private int Kg;
    private boolean PX;
    private android.graphics.Path Ta;
    private int VB;
    private float VzQ;
    private float WR;
    private int bX;
    private int eo;
    private android.graphics.Paint eqN;
    private int iR;
    private com.bytedance.adsdk.ugeno.iR.bg.C0092bg ldr;
    private android.graphics.Path zx;

    static {
        float radians = (float) java.lang.Math.toRadians(30.0d);
        yDt = radians;
        Lq = (float) java.lang.Math.tan(radians);
        vb = (float) java.lang.Math.cos(radians);
        xxp = (float) java.lang.Math.sin(radians);
    }

    public eqN(com.bytedance.adsdk.ugeno.IL.bX bXVar, org.json.JSONObject jSONObject) {
        super(bXVar, jSONObject);
        this.PX = true;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.eqN = paint;
        paint.setAntiAlias(true);
        this.zx = new android.graphics.Path();
        this.WR = this.IL.Fy();
        this.Ta = new android.graphics.Path();
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void IL() {
        this.bX = (int) com.bytedance.adsdk.ugeno.iR.Kg.bg(this.IL.WR().getContext(), this.bg.optInt("shineWidth", 30));
        java.lang.String strOptString = this.bg.optString(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        java.lang.String str = android.text.TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.ldr = com.bytedance.adsdk.ugeno.iR.bg.IL(str);
        } else {
            int iBg = com.bytedance.adsdk.ugeno.iR.bg.bg(str);
            this.iR = iBg;
            this.Kg = com.bytedance.adsdk.ugeno.iR.bg.bg(iBg, 32);
            this.PX = false;
        }
        this.VzQ = vb * this.bX;
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void bg(android.graphics.Canvas canvas) {
        android.graphics.LinearGradient linearGradient;
        try {
            if (this.IL.Dxa() > 0.0f) {
                int i = this.eo;
                float f = Lq;
                float fDxa = (i + (i * f)) * this.IL.Dxa();
                this.Ta.reset();
                this.Ta.moveTo(fDxa, 0.0f);
                int i2 = this.VB;
                float f2 = fDxa - (i2 * f);
                this.Ta.lineTo(f2, i2);
                this.Ta.lineTo(f2 + this.bX, this.VB);
                this.Ta.lineTo(this.bX + fDxa, 0.0f);
                this.Ta.close();
                float f3 = this.VzQ;
                float f4 = vb * f3;
                float f5 = f3 * xxp;
                if (this.PX && this.ldr != null) {
                    linearGradient = new android.graphics.LinearGradient(fDxa, 0.0f, fDxa + f4, f5, this.ldr.IL, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
                } else {
                    float f6 = fDxa + f4;
                    int i3 = this.Kg;
                    linearGradient = new android.graphics.LinearGradient(fDxa, 0.0f, f6, f5, new int[]{i3, this.iR, i3}, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
                }
                this.eqN.setShader(linearGradient);
                android.graphics.Path path = this.zx;
                if (path != null) {
                    canvas.clipPath(path, android.graphics.Region.Op.INTERSECT);
                }
                canvas.drawPath(this.Ta, this.eqN);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void bg(int i, int i2) {
        this.eo = i;
        this.VB = i2;
        try {
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, i, i2);
            android.graphics.Path path = this.zx;
            float f = this.WR;
            path.addRoundRect(rectF, f, f, android.graphics.Path.Direction.CW);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public java.util.List<android.animation.PropertyValuesHolder> bX() {
        android.animation.PropertyValuesHolder propertyValuesHolderOfFloat = android.animation.PropertyValuesHolder.ofFloat(eqN(), 0.0f, 1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
