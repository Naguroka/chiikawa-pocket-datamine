package com.bytedance.adsdk.ugeno.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bytedance.adsdk.ugeno.bg.bg.bg {
    private android.graphics.Paint Kg;
    private android.graphics.Matrix VB;
    private android.graphics.PorterDuffXfermode WR;
    private java.lang.String bX;
    private android.graphics.LinearGradient eo;
    private float eqN;
    private android.graphics.Paint iR;
    private android.view.View ldr;
    private float zx;

    public bX(com.bytedance.adsdk.ugeno.IL.bX bXVar, org.json.JSONObject jSONObject) {
        super(bXVar, jSONObject);
        this.ldr = this.IL.WR();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.iR = paint;
        paint.setAntiAlias(true);
        this.ldr.setLayerType(2, null);
        this.WR = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
        this.Kg = new android.graphics.Paint();
        this.VB = new android.graphics.Matrix();
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void IL() {
        this.bX = this.bg.optString("direction", androidx.media3.extractor.text.ttml.TtmlNode.LEFT);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void bg(android.graphics.Canvas canvas) {
        byte b;
        try {
            if (this.IL.jz() > 0.0f) {
                int iJz = (int) (this.eqN * this.IL.jz());
                int iJz2 = (int) (this.zx * this.IL.jz());
                this.iR.setXfermode(this.WR);
                java.lang.String str = this.bX;
                switch (str.hashCode()) {
                    case -1383228885:
                        if (!str.equals("bottom")) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case 115029:
                        if (!str.equals("top")) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case 3317767:
                        if (!str.equals(androidx.media3.extractor.text.ttml.TtmlNode.LEFT)) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 108511772:
                        if (!str.equals(androidx.media3.extractor.text.ttml.TtmlNode.RIGHT)) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    float f = iJz;
                    canvas.drawRect(f, 0.0f, this.eqN, this.zx, this.iR);
                    this.VB.setTranslate(f, this.zx);
                    this.eo.setLocalMatrix(this.VB);
                    this.Kg.setShader(this.eo);
                    if (this.IL.jz() <= 1.0f && this.IL.jz() > 0.9f) {
                        this.Kg.setAlpha((int) (255.0f - (this.IL.jz() * 255.0f)));
                    }
                    canvas.drawRect(0.0f, 0.0f, f, this.zx, this.Kg);
                    return;
                }
                if (b == 1) {
                    float f2 = iJz;
                    canvas.drawRect(0.0f, 0.0f, this.eqN - f2, this.zx, this.iR);
                    this.VB.setTranslate(this.eqN - f2, 0.0f);
                    this.eo.setLocalMatrix(this.VB);
                    this.Kg.setShader(this.eo);
                    if (this.IL.jz() <= 1.0f && this.IL.jz() > 0.9f) {
                        this.Kg.setAlpha((int) (255.0f - (this.IL.jz() * 255.0f)));
                    }
                    float f3 = this.eqN;
                    canvas.drawRect(f3, this.zx, f3 - f2, 0.0f, this.Kg);
                    return;
                }
                if (b == 2) {
                    float f4 = iJz2;
                    canvas.drawRect(0.0f, f4, this.eqN, this.zx, this.iR);
                    this.VB.setTranslate(0.0f, f4);
                    this.eo.setLocalMatrix(this.VB);
                    this.Kg.setShader(this.eo);
                    if (this.IL.jz() <= 1.0f && this.IL.jz() > 0.9f) {
                        this.Kg.setAlpha((int) (255.0f - (this.IL.jz() * 255.0f)));
                    }
                    canvas.drawRect(0.0f, 0.0f, this.eqN, f4, this.Kg);
                    return;
                }
                if (b != 3) {
                    return;
                }
                float f5 = iJz2;
                canvas.drawRect(0.0f, 0.0f, this.eqN, this.zx - f5, this.iR);
                this.VB.setTranslate(0.0f, this.zx - f5);
                this.eo.setLocalMatrix(this.VB);
                this.Kg.setShader(this.eo);
                if (this.IL.jz() <= 1.0f && this.IL.jz() > 0.9f) {
                    this.Kg.setAlpha((int) (255.0f - (this.IL.jz() * 255.0f)));
                }
                float f6 = this.eqN;
                float f7 = this.zx;
                canvas.drawRect(f6, f7, 0.0f, f7 - f5, this.Kg);
            }
        } catch (java.lang.Throwable th) {
            android.util.Log.e("BaseEffectWrapper", th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void bg(int i, int i2) {
        this.eqN = i;
        this.zx = i2;
        java.lang.String str = this.bX;
        str.hashCode();
        switch (str) {
            case "bottom":
                this.eo = new android.graphics.LinearGradient(0.0f, -this.zx, 0.0f, 0.0f, 0, -1, android.graphics.Shader.TileMode.CLAMP);
                break;
            case "top":
                this.eo = new android.graphics.LinearGradient(0.0f, this.zx, 0.0f, 0.0f, 0, -1, android.graphics.Shader.TileMode.CLAMP);
                break;
            case "left":
                this.eo = new android.graphics.LinearGradient(this.eqN, 0.0f, 0.0f, 0.0f, 0, -1, android.graphics.Shader.TileMode.CLAMP);
                break;
            case "right":
                this.eo = new android.graphics.LinearGradient(-this.eqN, 0.0f, 0.0f, this.zx, 0, -1, android.graphics.Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public java.util.List<android.animation.PropertyValuesHolder> bX() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.animation.PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(android.animation.PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.bg.eqN.ALPHA.IL(), 0.0f, 1.0f));
        return arrayList;
    }
}
