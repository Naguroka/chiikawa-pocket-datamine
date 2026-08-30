package com.bytedance.adsdk.IL.bX.bX;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    private final java.util.List<com.bytedance.adsdk.IL.iR.bg<java.lang.Float>> Fy;
    private final com.bytedance.adsdk.IL.iR IL;
    private final java.util.List<com.bytedance.adsdk.IL.bX.IL.Kg> Kg;
    private final com.bytedance.adsdk.IL.bX.bX.zx.IL LZ;
    private final float Lq;
    private final int PX;
    private final float Ta;
    private final int VB;
    private final com.bytedance.adsdk.IL.bX.bg.VB VzQ;
    private final com.bytedance.adsdk.IL.bX.bg.PX WR;
    private final java.lang.String bX;
    private final java.util.List<com.bytedance.adsdk.IL.bX.IL.bX> bg;
    private final int eo;
    private final long eqN;
    private final java.lang.String iR;
    private final com.bytedance.adsdk.IL.zx.eo kMt;
    private final long ldr;
    private final com.bytedance.adsdk.IL.bX.IL.bg rri;
    private final boolean tC;
    private final com.bytedance.adsdk.IL.bX.bg.IL tuV;
    private final float vb;
    private final com.bytedance.adsdk.IL.bX.bg.eo xxp;
    private final float yDt;
    private final com.bytedance.adsdk.IL.bX.bX.zx.bg zx;

    public enum IL {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public enum bg {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public zx(java.util.List<com.bytedance.adsdk.IL.bX.IL.bX> list, com.bytedance.adsdk.IL.iR iRVar, java.lang.String str, long j, com.bytedance.adsdk.IL.bX.bX.zx.bg bgVar, long j2, java.lang.String str2, java.util.List<com.bytedance.adsdk.IL.bX.IL.Kg> list2, com.bytedance.adsdk.IL.bX.bg.PX px, int i, int i2, int i3, float f, float f2, float f3, float f4, com.bytedance.adsdk.IL.bX.bg.eo eoVar, com.bytedance.adsdk.IL.bX.bg.VB vb, java.util.List<com.bytedance.adsdk.IL.iR.bg<java.lang.Float>> list3, com.bytedance.adsdk.IL.bX.bX.zx.IL il, com.bytedance.adsdk.IL.bX.bg.IL il2, boolean z, com.bytedance.adsdk.IL.bX.IL.bg bgVar2, com.bytedance.adsdk.IL.zx.eo eoVar2) {
        this.bg = list;
        this.IL = iRVar;
        this.bX = str;
        this.eqN = j;
        this.zx = bgVar;
        this.ldr = j2;
        this.iR = str2;
        this.Kg = list2;
        this.WR = px;
        this.eo = i;
        this.VB = i2;
        this.PX = i3;
        this.Ta = f;
        this.yDt = f2;
        this.Lq = f3;
        this.vb = f4;
        this.xxp = eoVar;
        this.VzQ = vb;
        this.Fy = list3;
        this.LZ = il;
        this.tuV = il2;
        this.tC = z;
        this.rri = bgVar2;
        this.kMt = eoVar2;
    }

    com.bytedance.adsdk.IL.iR bg() {
        return this.IL;
    }

    float IL() {
        return this.Ta;
    }

    float bX() {
        return this.yDt / this.IL.xxp();
    }

    java.util.List<com.bytedance.adsdk.IL.iR.bg<java.lang.Float>> eqN() {
        return this.Fy;
    }

    public long zx() {
        return this.eqN;
    }

    public java.lang.String ldr() {
        return this.bX;
    }

    public java.lang.String iR() {
        return this.iR;
    }

    float Kg() {
        return this.Lq;
    }

    float WR() {
        return this.vb;
    }

    java.util.List<com.bytedance.adsdk.IL.bX.IL.Kg> eo() {
        return this.Kg;
    }

    public com.bytedance.adsdk.IL.bX.bX.zx.bg VB() {
        return this.zx;
    }

    com.bytedance.adsdk.IL.bX.bX.zx.IL PX() {
        return this.LZ;
    }

    long Ta() {
        return this.ldr;
    }

    java.util.List<com.bytedance.adsdk.IL.bX.IL.bX> yDt() {
        return this.bg;
    }

    com.bytedance.adsdk.IL.bX.bg.PX Lq() {
        return this.WR;
    }

    int vb() {
        return this.PX;
    }

    int xxp() {
        return this.VB;
    }

    int VzQ() {
        return this.eo;
    }

    com.bytedance.adsdk.IL.bX.bg.eo tuV() {
        return this.xxp;
    }

    com.bytedance.adsdk.IL.bX.bg.VB Fy() {
        return this.VzQ;
    }

    com.bytedance.adsdk.IL.bX.bg.IL LZ() {
        return this.tuV;
    }

    public java.lang.String toString() {
        return bg("");
    }

    public boolean tC() {
        return this.tC;
    }

    public com.bytedance.adsdk.IL.bX.IL.bg rri() {
        return this.rri;
    }

    public com.bytedance.adsdk.IL.zx.eo kMt() {
        return this.kMt;
    }

    public java.lang.String bg(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str).append(ldr()).append("\n");
        com.bytedance.adsdk.IL.bX.bX.zx zxVarBg = this.IL.bg(Ta());
        if (zxVarBg != null) {
            sb.append("\t\tParents: ").append(zxVarBg.ldr());
            com.bytedance.adsdk.IL.bX.bX.zx zxVarBg2 = this.IL.bg(zxVarBg.Ta());
            while (zxVarBg2 != null) {
                sb.append("->").append(zxVarBg2.ldr());
                zxVarBg2 = this.IL.bg(zxVarBg2.Ta());
            }
            sb.append(str).append("\n");
        }
        if (!eo().isEmpty()) {
            sb.append(str).append("\tMasks: ").append(eo().size()).append("\n");
        }
        if (VzQ() != 0 && xxp() != 0) {
            sb.append(str).append("\tBackground: ").append(java.lang.String.format(java.util.Locale.US, "%dx%d %X\n", java.lang.Integer.valueOf(VzQ()), java.lang.Integer.valueOf(xxp()), java.lang.Integer.valueOf(vb())));
        }
        if (!this.bg.isEmpty()) {
            sb.append(str).append("\tShapes:\n");
            java.util.Iterator<com.bytedance.adsdk.IL.bX.IL.bX> it = this.bg.iterator();
            while (it.hasNext()) {
                sb.append(str).append("\t\t").append(it.next()).append("\n");
            }
        }
        return sb.toString();
    }
}
