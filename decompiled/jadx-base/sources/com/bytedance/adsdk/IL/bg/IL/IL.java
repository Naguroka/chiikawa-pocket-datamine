package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.IL.bg.IL.iR<java.lang.Integer> {
    public IL(java.util.List<com.bytedance.adsdk.IL.iR.bg<java.lang.Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer bg(com.bytedance.adsdk.IL.iR.bg<java.lang.Integer> bgVar, float f) {
        return java.lang.Integer.valueOf(bX(bgVar, f));
    }

    public int bX(com.bytedance.adsdk.IL.iR.bg<java.lang.Integer> bgVar, float f) {
        if (bgVar.bg == null || bgVar.IL == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        if (this.bX != null) {
            bgVar.iR.floatValue();
            eqN();
            Kg();
            throw null;
        }
        return com.bytedance.adsdk.IL.ldr.IL.bg(com.bytedance.adsdk.IL.ldr.zx.IL(f, 0.0f, 1.0f), bgVar.bg.intValue(), bgVar.IL.intValue());
    }

    public int WR() {
        return bX(bX(), zx());
    }
}
