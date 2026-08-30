package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class Ta extends com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path> {
    private final com.bytedance.adsdk.IL.bX.IL.yDt eqN;
    private java.util.List<com.bytedance.adsdk.IL.bg.bg.Fy> ldr;
    private final android.graphics.Path zx;

    public Ta(java.util.List<com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL.yDt>> list) {
        super(list);
        this.eqN = new com.bytedance.adsdk.IL.bX.IL.yDt();
        this.zx = new android.graphics.Path();
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public android.graphics.Path bg(com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL.yDt> bgVar, float f) {
        this.eqN.bg(bgVar.bg, bgVar.IL, f);
        com.bytedance.adsdk.IL.bX.IL.yDt ydtBg = this.eqN;
        java.util.List<com.bytedance.adsdk.IL.bg.bg.Fy> list = this.ldr;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ydtBg = this.ldr.get(size).bg(ydtBg);
            }
        }
        com.bytedance.adsdk.IL.ldr.zx.bg(ydtBg, this.zx);
        return this.zx;
    }

    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.Fy> list) {
        this.ldr = list;
    }
}
