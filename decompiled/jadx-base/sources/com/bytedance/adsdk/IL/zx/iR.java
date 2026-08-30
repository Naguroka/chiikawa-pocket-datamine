package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class iR implements com.bytedance.adsdk.IL.zx.bN<java.lang.Integer> {
    public static final com.bytedance.adsdk.IL.zx.iR bg = new com.bytedance.adsdk.IL.zx.iR();

    private iR() {
    }

    @Override // com.bytedance.adsdk.IL.zx.bN
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer IL(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        boolean z = jsonReader.peek() == android.util.JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        double dNextDouble = jsonReader.nextDouble();
        double dNextDouble2 = jsonReader.nextDouble();
        double dNextDouble3 = jsonReader.nextDouble();
        double dNextDouble4 = jsonReader.peek() == android.util.JsonToken.NUMBER ? jsonReader.nextDouble() : 1.0d;
        if (z) {
            jsonReader.endArray();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return java.lang.Integer.valueOf(android.graphics.Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}
