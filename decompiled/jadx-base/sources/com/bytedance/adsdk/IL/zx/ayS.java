package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class ayS implements com.bytedance.adsdk.IL.zx.bN<com.bytedance.adsdk.IL.iR.bX> {
    public static final com.bytedance.adsdk.IL.zx.ayS bg = new com.bytedance.adsdk.IL.zx.ayS();

    private ayS() {
    }

    @Override // com.bytedance.adsdk.IL.zx.bN
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.IL.iR.bX IL(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        boolean z = jsonReader.peek() == android.util.JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.IL.iR.bX((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
