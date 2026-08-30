package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class PX implements com.bytedance.adsdk.IL.zx.bN<java.lang.Float> {
    public static final com.bytedance.adsdk.IL.zx.PX bg = new com.bytedance.adsdk.IL.zx.PX();

    private PX() {
    }

    @Override // com.bytedance.adsdk.IL.zx.bN
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public java.lang.Float IL(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        return java.lang.Float.valueOf(com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader) * f);
    }
}
