package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eo implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final com.bytedance.adsdk.IL.bX.IL.eo.bg IL;
    private final com.bytedance.adsdk.IL.bX.bg.IL Kg;
    private final boolean VB;
    private final com.bytedance.adsdk.IL.bX.bg.IL WR;
    private final com.bytedance.adsdk.IL.bX.bg.IL bX;
    private final java.lang.String bg;
    private final boolean eo;
    private final com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> eqN;
    private final com.bytedance.adsdk.IL.bX.bg.IL iR;
    private final com.bytedance.adsdk.IL.bX.bg.IL ldr;
    private final com.bytedance.adsdk.IL.bX.bg.IL zx;

    public enum bg {
        STAR(1),
        POLYGON(2);

        private final int bX;

        bg(int i) {
            this.bX = i;
        }

        public static com.bytedance.adsdk.IL.bX.IL.eo.bg bg(int i) {
            for (com.bytedance.adsdk.IL.bX.IL.eo.bg bgVar : values()) {
                if (bgVar.bX == i) {
                    return bgVar;
                }
            }
            return null;
        }
    }

    public eo(java.lang.String str, com.bytedance.adsdk.IL.bX.IL.eo.bg bgVar, com.bytedance.adsdk.IL.bX.bg.IL il, com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> ta, com.bytedance.adsdk.IL.bX.bg.IL il2, com.bytedance.adsdk.IL.bX.bg.IL il3, com.bytedance.adsdk.IL.bX.bg.IL il4, com.bytedance.adsdk.IL.bX.bg.IL il5, com.bytedance.adsdk.IL.bX.bg.IL il6, boolean z, boolean z2) {
        this.bg = str;
        this.IL = bgVar;
        this.bX = il;
        this.eqN = ta;
        this.zx = il2;
        this.ldr = il3;
        this.iR = il4;
        this.Kg = il5;
        this.WR = il6;
        this.eo = z;
        this.VB = z2;
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public com.bytedance.adsdk.IL.bX.IL.eo.bg IL() {
        return this.IL;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL bX() {
        return this.bX;
    }

    public com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> eqN() {
        return this.eqN;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL zx() {
        return this.zx;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL ldr() {
        return this.ldr;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL iR() {
        return this.iR;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL Kg() {
        return this.Kg;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL WR() {
        return this.WR;
    }

    public boolean eo() {
        return this.eo;
    }

    public boolean VB() {
        return this.VB;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.yDt(wr, bgVar, this);
    }
}
