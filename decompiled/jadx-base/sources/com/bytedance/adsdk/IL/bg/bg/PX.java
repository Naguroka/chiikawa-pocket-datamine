package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class PX implements com.bytedance.adsdk.IL.bg.bg.Ta, com.bytedance.adsdk.IL.bg.bg.eo {
    private final java.lang.String eqN;
    private final com.bytedance.adsdk.IL.bX.IL.WR ldr;
    private final android.graphics.Path bg = new android.graphics.Path();
    private final android.graphics.Path IL = new android.graphics.Path();
    private final android.graphics.Path bX = new android.graphics.Path();
    private final java.util.List<com.bytedance.adsdk.IL.bg.bg.Ta> zx = new java.util.ArrayList();

    public PX(com.bytedance.adsdk.IL.bX.IL.WR wr) {
        this.eqN = wr.bg();
        this.ldr = wr;
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.eo
    public void bg(java.util.ListIterator<com.bytedance.adsdk.IL.bg.bg.bX> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVarPrevious = listIterator.previous();
            if (bXVarPrevious instanceof com.bytedance.adsdk.IL.bg.bg.Ta) {
                this.zx.add((com.bytedance.adsdk.IL.bg.bg.Ta) bXVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
        for (int i = 0; i < this.zx.size(); i++) {
            this.zx.get(i).bg(list, list2);
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.Ta
    public android.graphics.Path eqN() {
        this.bX.reset();
        if (this.ldr.bX()) {
            return this.bX;
        }
        int i = com.bytedance.adsdk.IL.bg.bg.PX.AnonymousClass1.bg[this.ldr.IL().ordinal()];
        if (i == 1) {
            bg();
        } else if (i == 2) {
            bg(android.graphics.Path.Op.UNION);
        } else if (i == 3) {
            bg(android.graphics.Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            bg(android.graphics.Path.Op.INTERSECT);
        } else if (i == 5) {
            bg(android.graphics.Path.Op.XOR);
        }
        return this.bX;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.bg.bg.PX$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.IL.bX.IL.WR.bg.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.adsdk.IL.bX.IL.WR.bg.MERGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.IL.WR.bg.ADD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.IL.WR.bg.SUBTRACT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.IL.WR.bg.INTERSECT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.IL.WR.bg.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private void bg() {
        for (int i = 0; i < this.zx.size(); i++) {
            this.bX.addPath(this.zx.get(i).eqN());
        }
    }

    private void bg(android.graphics.Path.Op op) {
        this.IL.reset();
        this.bg.reset();
        for (int size = this.zx.size() - 1; size > 0; size--) {
            com.bytedance.adsdk.IL.bg.bg.Ta ta = this.zx.get(size);
            if (ta instanceof com.bytedance.adsdk.IL.bg.bg.eqN) {
                com.bytedance.adsdk.IL.bg.bg.eqN eqn = (com.bytedance.adsdk.IL.bg.bg.eqN) ta;
                java.util.List<com.bytedance.adsdk.IL.bg.bg.Ta> listIL = eqn.IL();
                for (int size2 = listIL.size() - 1; size2 >= 0; size2--) {
                    android.graphics.Path pathEqN = listIL.get(size2).eqN();
                    pathEqN.transform(eqn.bX());
                    this.IL.addPath(pathEqN);
                }
            } else {
                this.IL.addPath(ta.eqN());
            }
        }
        com.bytedance.adsdk.IL.bg.bg.Ta ta2 = this.zx.get(0);
        if (ta2 instanceof com.bytedance.adsdk.IL.bg.bg.eqN) {
            com.bytedance.adsdk.IL.bg.bg.eqN eqn2 = (com.bytedance.adsdk.IL.bg.bg.eqN) ta2;
            java.util.List<com.bytedance.adsdk.IL.bg.bg.Ta> listIL2 = eqn2.IL();
            for (int i = 0; i < listIL2.size(); i++) {
                android.graphics.Path pathEqN2 = listIL2.get(i).eqN();
                pathEqN2.transform(eqn2.bX());
                this.bg.addPath(pathEqN2);
            }
        } else {
            this.bg.set(ta2.eqN());
        }
        this.bX.op(this.bg, this.IL, op);
    }
}
