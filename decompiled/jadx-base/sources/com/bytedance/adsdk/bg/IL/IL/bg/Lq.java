package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Lq implements com.bytedance.adsdk.bg.IL.IL.bg {
    private java.lang.Number bg;

    public Lq(java.lang.String str) {
        if (str.indexOf(46) >= 0) {
            java.lang.Float fValueOf = java.lang.Float.valueOf(str);
            this.bg = fValueOf;
            if (java.lang.Float.isInfinite(fValueOf.floatValue())) {
                this.bg = java.lang.Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.bg = java.lang.Integer.valueOf(str);
        } catch (java.lang.NumberFormatException unused) {
            this.bg = java.lang.Long.valueOf(str);
        }
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.Object bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        return this.bg;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public com.bytedance.adsdk.bg.IL.eqN.zx bg() {
        return com.bytedance.adsdk.bg.IL.eqN.ldr.NUMBER;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.String IL() {
        return this.bg.toString();
    }

    public java.lang.String toString() {
        return IL();
    }
}
