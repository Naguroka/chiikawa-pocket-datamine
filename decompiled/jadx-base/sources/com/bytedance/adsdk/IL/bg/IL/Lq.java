package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class Lq extends com.bytedance.adsdk.IL.bg.IL.iR<com.bytedance.adsdk.IL.bX.IL> {
    public Lq(java.util.List<com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.IL.bX.IL bg(com.bytedance.adsdk.IL.iR.bg<com.bytedance.adsdk.IL.bX.IL> bgVar, float f) {
        if (this.bX != null) {
            if (bgVar.iR != null) {
                bgVar.iR.floatValue();
            }
            zx();
            Kg();
            throw null;
        }
        if (f != 1.0f || bgVar.IL == null) {
            return bgVar.bg;
        }
        return bgVar.IL;
    }
}
