package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class PX extends com.bytedance.adsdk.IL.bg.IL.iR<com.bytedance.adsdk.IL.iR.bX> {
    private final com.bytedance.adsdk.IL.iR.bX eqN;

    public PX(java.util.List<com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.iR.bX>> list) {
        super(list);
        this.eqN = new com.bytedance.adsdk.IL.iR.bX();
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.IL.iR.bX bg(com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.iR.bX> bgVar, float f) {
        if (bgVar.bg == null || bgVar.IL == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.IL.iR.bX bXVar = bgVar.bg;
        com.bytedance.adsdk.IL.iR.bX bXVar2 = bgVar.IL;
        if (this.bX != null) {
            bgVar.iR.floatValue();
            eqN();
            Kg();
            throw null;
        }
        this.eqN.bg(com.bytedance.adsdk.IL.ldr.zx.bg(bXVar.bg(), bXVar2.bg(), f), com.bytedance.adsdk.IL.ldr.zx.bg(bXVar.IL(), bXVar2.IL(), f));
        return this.eqN;
    }
}
