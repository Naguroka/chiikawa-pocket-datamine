package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class tuV implements com.bytedance.adsdk.IL.zx.bN<java.lang.Integer> {
    public static final com.bytedance.adsdk.IL.zx.tuV bg = new com.bytedance.adsdk.IL.zx.tuV();

    private tuV() {
    }

    @Override // com.bytedance.adsdk.IL.zx.bN
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer IL(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        return java.lang.Integer.valueOf(java.lang.Math.round(com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader) * f));
    }
}
