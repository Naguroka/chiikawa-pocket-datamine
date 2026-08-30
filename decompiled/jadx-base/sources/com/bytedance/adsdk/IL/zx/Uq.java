package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class Uq implements com.bytedance.adsdk.IL.zx.bN<android.graphics.PointF> {
    public static final com.bytedance.adsdk.IL.zx.Uq bg = new com.bytedance.adsdk.IL.zx.Uq();

    private Uq() {
    }

    @Override // com.bytedance.adsdk.IL.zx.bN
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public android.graphics.PointF IL(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        android.util.JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == android.util.JsonToken.BEGIN_ARRAY) {
            return com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, f);
        }
        if (jsonTokenPeek == android.util.JsonToken.BEGIN_OBJECT) {
            return com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, f);
        }
        if (jsonTokenPeek == android.util.JsonToken.NUMBER) {
            android.graphics.PointF pointF = new android.graphics.PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new java.lang.IllegalArgumentException("Cannot convert json to point. Next token is ".concat(java.lang.String.valueOf(jsonTokenPeek)));
    }
}
