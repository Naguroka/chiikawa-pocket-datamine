package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.adsdk.IL.bg.IL.iR<java.lang.Float> {
    public eqN(java.util.List<com.bytedance.adsdk.IL.iR.bg<java.lang.Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public java.lang.Float bg(com.bytedance.adsdk.IL.iR.bg<java.lang.Float> bgVar, float f) {
        return java.lang.Float.valueOf(bX(bgVar, f));
    }

    float bX(com.bytedance.adsdk.IL.iR.bg<java.lang.Float> bgVar, float f) {
        if (bgVar.bg == null || bgVar.IL == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        if (this.bX != null) {
            bgVar.iR.floatValue();
            eqN();
            Kg();
            throw null;
        }
        return com.bytedance.adsdk.IL.ldr.zx.bg(bgVar.ldr(), bgVar.iR(), f);
    }

    public float WR() {
        return bX(bX(), zx());
    }
}
