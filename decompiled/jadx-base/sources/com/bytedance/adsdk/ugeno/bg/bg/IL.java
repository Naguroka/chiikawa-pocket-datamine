package com.bytedance.adsdk.ugeno.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.ugeno.bg.bg.bg {
    private static final int iR = android.graphics.Color.parseColor("#7ed321");
    private int bX;
    private int eqN;
    private android.graphics.Paint ldr;
    private int zx;

    public IL(com.bytedance.adsdk.ugeno.IL.bX bXVar, org.json.JSONObject jSONObject) {
        super(bXVar, jSONObject);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.ldr = paint;
        paint.setAntiAlias(true);
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void IL() {
        this.bX = com.bytedance.adsdk.ugeno.iR.bg.bg(this.bg.optString(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR), iR);
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void bg(android.graphics.Canvas canvas) {
        try {
            if (this.IL.qC() > 0.0f) {
                this.ldr.setColor(this.bX);
                this.ldr.setAlpha((int) ((1.0f - this.IL.qC()) * 255.0f));
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.IL.WR().getParent();
                viewGroup.setClipChildren(true);
                int i = this.eqN;
                int i2 = this.zx;
                canvas.drawCircle(i, i2, java.lang.Math.min(i, i2) * 2 * this.IL.qC(), this.ldr);
            }
        } catch (java.lang.Throwable th) {
            android.util.Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public void bg(int i, int i2) {
        this.eqN = i / 2;
        this.zx = i2 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.bg.bg.bg
    public java.util.List<android.animation.PropertyValuesHolder> bX() {
        android.animation.PropertyValuesHolder propertyValuesHolderOfFloat = android.animation.PropertyValuesHolder.ofFloat(eqN(), 0.0f, 1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
