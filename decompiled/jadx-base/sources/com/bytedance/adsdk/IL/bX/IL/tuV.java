package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class tuV implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final com.bytedance.adsdk.IL.bX.bg.IL IL;
    private final com.bytedance.adsdk.IL.bX.IL.tuV.IL Kg;
    private final float WR;
    private final java.util.List<com.bytedance.adsdk.IL.bX.bg.IL> bX;
    private final java.lang.String bg;
    private final boolean eo;
    private final com.bytedance.adsdk.IL.bX.bg.bg eqN;
    private final com.bytedance.adsdk.IL.bX.IL.tuV.bg iR;
    private final com.bytedance.adsdk.IL.bX.bg.IL ldr;
    private final com.bytedance.adsdk.IL.bX.bg.eqN zx;

    public enum bg {
        BUTT,
        ROUND,
        UNKNOWN;

        public android.graphics.Paint.Cap bg() {
            int i = com.bytedance.adsdk.IL.bX.IL.tuV.AnonymousClass1.bg[ordinal()];
            if (i == 1) {
                return android.graphics.Paint.Cap.BUTT;
            }
            if (i == 2) {
                return android.graphics.Paint.Cap.ROUND;
            }
            return android.graphics.Paint.Cap.SQUARE;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.bX.IL.tuV$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IL;
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.IL.bX.IL.tuV.IL.values().length];
            IL = iArr;
            try {
                iArr[com.bytedance.adsdk.IL.bX.IL.tuV.IL.BEVEL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                IL[com.bytedance.adsdk.IL.bX.IL.tuV.IL.MITER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                IL[com.bytedance.adsdk.IL.bX.IL.tuV.IL.ROUND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.bytedance.adsdk.IL.bX.IL.tuV.bg.values().length];
            bg = iArr2;
            try {
                iArr2[com.bytedance.adsdk.IL.bX.IL.tuV.bg.BUTT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.IL.tuV.bg.ROUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.IL.tuV.bg.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public enum IL {
        MITER,
        ROUND,
        BEVEL;

        public android.graphics.Paint.Join bg() {
            int i = com.bytedance.adsdk.IL.bX.IL.tuV.AnonymousClass1.IL[ordinal()];
            if (i == 1) {
                return android.graphics.Paint.Join.BEVEL;
            }
            if (i == 2) {
                return android.graphics.Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return android.graphics.Paint.Join.ROUND;
        }
    }

    public tuV(java.lang.String str, com.bytedance.adsdk.IL.bX.bg.IL il, java.util.List<com.bytedance.adsdk.IL.bX.bg.IL> list, com.bytedance.adsdk.IL.bX.bg.bg bgVar, com.bytedance.adsdk.IL.bX.bg.eqN eqn, com.bytedance.adsdk.IL.bX.bg.IL il2, com.bytedance.adsdk.IL.bX.IL.tuV.bg bgVar2, com.bytedance.adsdk.IL.bX.IL.tuV.IL il3, float f, boolean z) {
        this.bg = str;
        this.IL = il;
        this.bX = list;
        this.eqN = bgVar;
        this.zx = eqn;
        this.ldr = il2;
        this.iR = bgVar2;
        this.Kg = il3;
        this.WR = f;
        this.eo = z;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.LZ(wr, bgVar, this);
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public com.bytedance.adsdk.IL.bX.bg.bg IL() {
        return this.eqN;
    }

    public com.bytedance.adsdk.IL.bX.bg.eqN bX() {
        return this.zx;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL eqN() {
        return this.ldr;
    }

    public java.util.List<com.bytedance.adsdk.IL.bX.bg.IL> zx() {
        return this.bX;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL ldr() {
        return this.IL;
    }

    public com.bytedance.adsdk.IL.bX.IL.tuV.bg iR() {
        return this.iR;
    }

    public com.bytedance.adsdk.IL.bX.IL.tuV.IL Kg() {
        return this.Kg;
    }

    public float WR() {
        return this.WR;
    }

    public boolean eo() {
        return this.eo;
    }
}
