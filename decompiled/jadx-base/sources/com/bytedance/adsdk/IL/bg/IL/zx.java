package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends com.bytedance.adsdk.IL.bg.IL.iR<com.bytedance.adsdk.IL.bX.IL.eqN> {
    private final com.bytedance.adsdk.IL.bX.IL.eqN eqN;

    public zx(java.util.List<com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL.eqN>> list) {
        super(list);
        com.bytedance.adsdk.IL.bX.IL.eqN eqn = list.get(0).bg;
        int iBX = eqn != null ? eqn.bX() : 0;
        this.eqN = new com.bytedance.adsdk.IL.bX.IL.eqN(new float[iBX], new int[iBX]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.IL.bX.IL.eqN bg(com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL.eqN> bgVar, float f) {
        this.eqN.bg(bgVar.bg, bgVar.IL, f);
        return this.eqN;
    }
}
