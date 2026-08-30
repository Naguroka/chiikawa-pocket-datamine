package com.bytedance.adsdk.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class zx implements com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> {
    private final java.util.List<com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF>> bg;

    public zx(java.util.List<com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF>> list) {
        this.bg = list;
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.Ta
    public java.util.List<com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF>> bX() {
        return this.bg;
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.Ta
    public boolean IL() {
        return this.bg.size() == 1 && this.bg.get(0).zx();
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.Ta
    public com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bg() {
        if (this.bg.get(0).zx()) {
            return new com.bytedance.adsdk.IL.bg.IL.VB(this.bg);
        }
        return new com.bytedance.adsdk.IL.bg.IL.eo(this.bg);
    }
}
