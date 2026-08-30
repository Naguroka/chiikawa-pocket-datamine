package com.bytedance.adsdk.IL.bX.bX;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.IL.bX.bX.bg {
    private final java.util.List<com.bytedance.adsdk.IL.bX.bX.bg> Kg;
    private boolean PX;
    private final android.graphics.Paint VB;
    private final android.graphics.RectF WR;
    private final android.graphics.RectF eo;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> iR;

    public IL(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.zx zxVar, java.util.List<com.bytedance.adsdk.IL.bX.bX.zx> list, com.bytedance.adsdk.IL.iR iRVar, android.content.Context context) {
        int i;
        com.bytedance.adsdk.IL.bX.bX.bg bgVar;
        com.bytedance.adsdk.IL.bX.bX.zx.IL ilPX;
        int i2;
        super(wr, zxVar);
        this.Kg = new java.util.ArrayList();
        this.WR = new android.graphics.RectF();
        this.eo = new android.graphics.RectF();
        this.VB = new android.graphics.Paint();
        this.PX = true;
        com.bytedance.adsdk.IL.bX.bg.IL ilLZ = zxVar.LZ();
        if (ilLZ != null) {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg = ilLZ.bg();
            this.iR = bgVarBg;
            bg(bgVarBg);
            this.iR.bg(this);
        } else {
            this.iR = null;
        }
        android.util.LongSparseArray longSparseArray = new android.util.LongSparseArray(iRVar.Ta().size());
        int size = list.size() - 1;
        com.bytedance.adsdk.IL.bX.bX.bg bgVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            com.bytedance.adsdk.IL.bX.bX.zx zxVar2 = list.get(size);
            com.bytedance.adsdk.IL.bX.bX.bg bgVarBg2 = com.bytedance.adsdk.IL.bX.bX.bg.bg(this, zxVar2, wr, iRVar, context);
            if (bgVarBg2 != null) {
                longSparseArray.put(bgVarBg2.IL().zx(), bgVarBg2);
                if (bgVar2 != null) {
                    bgVar2.bg(bgVarBg2);
                    bgVar2 = null;
                } else {
                    this.Kg.add(0, bgVarBg2);
                    if (zxVar2 != null && (ilPX = zxVar2.PX()) != null && ((i2 = com.bytedance.adsdk.IL.bX.bX.IL.AnonymousClass1.bg[ilPX.ordinal()]) == 1 || i2 == 2)) {
                        bgVar2 = bgVarBg2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            com.bytedance.adsdk.IL.bX.bX.bg bgVar3 = (com.bytedance.adsdk.IL.bX.bX.bg) longSparseArray.get(longSparseArray.keyAt(i));
            if (bgVar3 != null && (bgVar = (com.bytedance.adsdk.IL.bX.bX.bg) longSparseArray.get(bgVar3.IL().Ta())) != null) {
                bgVar3.IL(bgVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.bX.bX.IL$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.IL.bX.bX.zx.IL.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.adsdk.IL.bX.bX.zx.IL.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.bX.zx.IL.INVERT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public void IL(boolean z) {
        this.PX = z;
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg
    public void bg(boolean z) {
        super.bg(z);
        java.util.Iterator<com.bytedance.adsdk.IL.bX.bX.bg> it = this.Kg.iterator();
        while (it.hasNext()) {
            it.next().bg(z);
        }
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg
    public void IL(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        super.IL(canvas, matrix, i);
        com.bytedance.adsdk.IL.zx.bg("CompositionLayer#draw");
        this.eo.set(0.0f, 0.0f, this.bX.Kg(), this.bX.WR());
        matrix.mapRect(this.eo);
        boolean z = this.IL.iR() && this.Kg.size() > 1 && i != 255;
        if (z) {
            this.VB.setAlpha(i);
            com.bytedance.adsdk.IL.ldr.ldr.bg(canvas, this.eo, this.VB);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.Kg.size() - 1; size >= 0; size--) {
            if (((!this.PX && "__container".equals(this.bX.ldr())) || this.eo.isEmpty()) ? true : canvas.clipRect(this.eo)) {
                this.Kg.get(size).bg(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.IL.zx.IL("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg, com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.bg(rectF, matrix, z);
        for (int size = this.Kg.size() - 1; size >= 0; size--) {
            this.WR.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.Kg.get(size).bg(this.WR, this.bg, true);
            rectF.union(this.WR);
        }
    }

    public java.util.List<com.bytedance.adsdk.IL.bX.bX.bg> PX() {
        return this.Kg;
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg
    public void bg(float f) {
        super.bg(f);
        if (this.iR != null) {
            f = ((this.iR.iR().floatValue() * this.bX.bg().PX()) - this.bX.bg().ldr()) / (this.IL.kMt().xxp() + 0.01f);
        }
        if (this.iR == null) {
            f -= this.bX.bX();
        }
        if (this.bX.IL() != 0.0f && !"__container".equals(this.bX.ldr())) {
            f /= this.bX.IL();
        }
        for (int size = this.Kg.size() - 1; size >= 0; size--) {
            this.Kg.get(size).bg(f);
        }
    }
}
