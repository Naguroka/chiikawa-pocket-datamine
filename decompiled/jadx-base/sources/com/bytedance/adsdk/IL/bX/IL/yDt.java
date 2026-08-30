package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class yDt {
    private android.graphics.PointF IL;
    private boolean bX;
    private final java.util.List<com.bytedance.adsdk.IL.bX.bg> bg;

    public yDt(android.graphics.PointF pointF, boolean z, java.util.List<com.bytedance.adsdk.IL.bX.bg> list) {
        this.IL = pointF;
        this.bX = z;
        this.bg = new java.util.ArrayList(list);
    }

    public yDt() {
        this.bg = new java.util.ArrayList();
    }

    public void bg(float f, float f2) {
        if (this.IL == null) {
            this.IL = new android.graphics.PointF();
        }
        this.IL.set(f, f2);
    }

    public android.graphics.PointF bg() {
        return this.IL;
    }

    public void bg(boolean z) {
        this.bX = z;
    }

    public boolean IL() {
        return this.bX;
    }

    public java.util.List<com.bytedance.adsdk.IL.bX.bg> bX() {
        return this.bg;
    }

    public void bg(com.bytedance.adsdk.IL.bX.IL.yDt ydt, com.bytedance.adsdk.IL.bX.IL.yDt ydt2, float f) {
        if (this.IL == null) {
            this.IL = new android.graphics.PointF();
        }
        this.bX = ydt.IL() || ydt2.IL();
        if (ydt.bX().size() != ydt2.bX().size()) {
            ydt.bX().size();
            ydt2.bX().size();
        }
        int iMin = java.lang.Math.min(ydt.bX().size(), ydt2.bX().size());
        if (this.bg.size() < iMin) {
            for (int size = this.bg.size(); size < iMin; size++) {
                this.bg.add(new com.bytedance.adsdk.IL.bX.bg());
            }
        } else if (this.bg.size() > iMin) {
            for (int size2 = this.bg.size() - 1; size2 >= iMin; size2--) {
                java.util.List<com.bytedance.adsdk.IL.bX.bg> list = this.bg;
                list.remove(list.size() - 1);
            }
        }
        android.graphics.PointF pointFBg = ydt.bg();
        android.graphics.PointF pointFBg2 = ydt2.bg();
        bg(com.bytedance.adsdk.IL.ldr.zx.bg(pointFBg.x, pointFBg2.x, f), com.bytedance.adsdk.IL.ldr.zx.bg(pointFBg.y, pointFBg2.y, f));
        for (int size3 = this.bg.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.IL.bX.bg bgVar = ydt.bX().get(size3);
            com.bytedance.adsdk.IL.bX.bg bgVar2 = ydt2.bX().get(size3);
            android.graphics.PointF pointFBg3 = bgVar.bg();
            android.graphics.PointF pointFIL = bgVar.IL();
            android.graphics.PointF pointFBX = bgVar.bX();
            android.graphics.PointF pointFBg4 = bgVar2.bg();
            android.graphics.PointF pointFIL2 = bgVar2.IL();
            android.graphics.PointF pointFBX2 = bgVar2.bX();
            this.bg.get(size3).bg(com.bytedance.adsdk.IL.ldr.zx.bg(pointFBg3.x, pointFBg4.x, f), com.bytedance.adsdk.IL.ldr.zx.bg(pointFBg3.y, pointFBg4.y, f));
            this.bg.get(size3).IL(com.bytedance.adsdk.IL.ldr.zx.bg(pointFIL.x, pointFIL2.x, f), com.bytedance.adsdk.IL.ldr.zx.bg(pointFIL.y, pointFIL2.y, f));
            this.bg.get(size3).bX(com.bytedance.adsdk.IL.ldr.zx.bg(pointFBX.x, pointFBX2.x, f), com.bytedance.adsdk.IL.ldr.zx.bg(pointFBX.y, pointFBX2.y, f));
        }
    }

    public java.lang.String toString() {
        return "ShapeData{numCurves=" + this.bg.size() + "closed=" + this.bX + '}';
    }
}
