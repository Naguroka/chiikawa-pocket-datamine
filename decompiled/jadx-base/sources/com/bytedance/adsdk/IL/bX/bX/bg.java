package com.bytedance.adsdk.IL.bX.bX;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.zx {
    private boolean DDQ;
    private final java.lang.String Fy;
    final com.bytedance.adsdk.IL.WR IL;
    private java.util.List<com.bytedance.adsdk.IL.bX.bX.bg> JAA;
    private final java.util.List<com.bytedance.adsdk.IL.bg.IL.bg<?, ?>> Ja;
    private com.bytedance.adsdk.IL.bg.IL.Kg LZ;
    private final android.graphics.RectF Lq;
    private final android.graphics.Paint Ta;
    private android.graphics.Paint Uq;
    private boolean Uw;
    private float VW;
    private final android.graphics.RectF VzQ;
    private final android.graphics.Matrix aGH;
    final com.bytedance.adsdk.IL.bX.bX.zx bX;
    final android.graphics.Matrix bg;
    final com.bytedance.adsdk.IL.bg.IL.xxp eqN;
    private com.bytedance.adsdk.IL.bX.bX.bg kMt;
    android.graphics.BlurMaskFilter ldr;
    private com.bytedance.adsdk.IL.bX.bX.bg rri;
    private com.bytedance.adsdk.IL.bg.IL.eqN tC;
    private final android.graphics.RectF tuV;
    private final android.graphics.RectF vb;
    private final android.graphics.RectF xxp;
    private final android.graphics.Paint yDt;
    float zx;
    private final android.graphics.Path iR = new android.graphics.Path();
    private final android.graphics.Matrix Kg = new android.graphics.Matrix();
    private final android.graphics.Matrix WR = new android.graphics.Matrix();
    private final android.graphics.Paint eo = new com.bytedance.adsdk.IL.bg.bg(1);
    private final android.graphics.Paint VB = new com.bytedance.adsdk.IL.bg.bg(1, android.graphics.PorterDuff.Mode.DST_IN);
    private final android.graphics.Paint PX = new com.bytedance.adsdk.IL.bg.bg(1, android.graphics.PorterDuff.Mode.DST_OUT);

    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
    }

    static com.bytedance.adsdk.IL.bX.bX.bg bg(com.bytedance.adsdk.IL.bX.bX.IL il, com.bytedance.adsdk.IL.bX.bX.zx zxVar, com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, android.content.Context context) {
        switch (com.bytedance.adsdk.IL.bX.bX.bg.AnonymousClass2.bg[zxVar.VB().ordinal()]) {
            case 1:
                return new com.bytedance.adsdk.IL.bX.bX.iR(wr, zxVar, il, iRVar);
            case 2:
                return new com.bytedance.adsdk.IL.bX.bX.IL(wr, zxVar, iRVar.IL(zxVar.iR()), iRVar, context);
            case 3:
                return new com.bytedance.adsdk.IL.bX.bX.Kg(wr, zxVar);
            case 4:
                if (bg(wr, zxVar)) {
                    return new com.bytedance.adsdk.IL.bX.bX.bX(wr, zxVar, context);
                }
                return new com.bytedance.adsdk.IL.bX.bX.eqN(wr, zxVar);
            case 5:
                return new com.bytedance.adsdk.IL.bX.bX.ldr(wr, zxVar);
            case 6:
                return new com.bytedance.adsdk.IL.bX.bX.WR(wr, zxVar);
            default:
                new java.lang.StringBuilder("Unknown layer type ").append(zxVar.VB());
                return null;
        }
    }

    private static boolean bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.zx zxVar) {
        com.bytedance.adsdk.IL.eo eoVarLdr;
        if (wr == null || zxVar == null || (eoVarLdr = wr.ldr(zxVar.iR())) == null) {
            return false;
        }
        return "text:".equals(eoVarLdr.WR());
    }

    bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.zx zxVar) {
        com.bytedance.adsdk.IL.bg.bg bgVar = new com.bytedance.adsdk.IL.bg.bg(1);
        this.Ta = bgVar;
        this.yDt = new com.bytedance.adsdk.IL.bg.bg(android.graphics.PorterDuff.Mode.CLEAR);
        this.Lq = new android.graphics.RectF();
        this.vb = new android.graphics.RectF();
        this.xxp = new android.graphics.RectF();
        this.VzQ = new android.graphics.RectF();
        this.tuV = new android.graphics.RectF();
        this.bg = new android.graphics.Matrix();
        this.Ja = new java.util.ArrayList();
        this.Uw = true;
        this.zx = 0.0f;
        this.aGH = new android.graphics.Matrix();
        this.VW = 1.0f;
        this.IL = wr;
        this.bX = zxVar;
        this.Fy = zxVar.ldr() + "#draw";
        if (zxVar.PX() == com.bytedance.adsdk.IL.bX.bX.zx.IL.INVERT) {
            bgVar.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        } else {
            bgVar.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        }
        com.bytedance.adsdk.IL.bg.IL.xxp xxpVarEo = zxVar.Lq().eo();
        this.eqN = xxpVarEo;
        xxpVarEo.bg((com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg) this);
        if (zxVar.eo() != null && !zxVar.eo().isEmpty()) {
            com.bytedance.adsdk.IL.bg.IL.Kg kg = new com.bytedance.adsdk.IL.bg.IL.Kg(zxVar.eo());
            this.LZ = kg;
            java.util.Iterator<com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path>> it = kg.IL().iterator();
            while (it.hasNext()) {
                it.next().bg(this);
            }
            for (com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar2 : this.LZ.bX()) {
                bg(bgVar2);
                bgVar2.bg(this);
            }
        }
        PX();
    }

    void bg(boolean z) {
        if (z && this.Uq == null) {
            this.Uq = new com.bytedance.adsdk.IL.bg.bg();
        }
        this.DDQ = z;
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        Ta();
    }

    com.bytedance.adsdk.IL.bX.bX.zx IL() {
        return this.bX;
    }

    void bg(com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        this.rri = bgVar;
    }

    boolean bX() {
        return this.rri != null;
    }

    void IL(com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        this.kMt = bgVar;
    }

    private void PX() {
        if (!this.bX.eqN().isEmpty()) {
            com.bytedance.adsdk.IL.bg.IL.eqN eqn = new com.bytedance.adsdk.IL.bg.IL.eqN(this.bX.eqN());
            this.tC = eqn;
            eqn.bg();
            this.tC.bg(new com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg() { // from class: com.bytedance.adsdk.IL.bX.bX.bg.1
                @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
                public void bg() {
                    com.bytedance.adsdk.IL.bX.bX.bg bgVar = com.bytedance.adsdk.IL.bX.bX.bg.this;
                    bgVar.IL(bgVar.tC.WR() == 1.0f);
                }
            });
            IL(this.tC.iR().floatValue() == 1.0f);
            bg(this.tC);
            return;
        }
        IL(true);
    }

    private void Ta() {
        this.IL.invalidateSelf();
    }

    public void bg(com.bytedance.adsdk.IL.bg.IL.bg<?, ?> bgVar) {
        if (bgVar == null) {
            return;
        }
        this.Ja.add(bgVar);
    }

    public android.graphics.Matrix eqN() {
        return this.aGH;
    }

    public java.lang.String zx() {
        com.bytedance.adsdk.IL.bX.bX.zx zxVar = this.bX;
        if (zxVar != null) {
            return zxVar.iR();
        }
        return null;
    }

    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.Lq.set(0.0f, 0.0f, 0.0f, 0.0f);
        Lq();
        this.bg.set(matrix);
        if (z) {
            java.util.List<com.bytedance.adsdk.IL.bX.bX.bg> list = this.JAA;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.bg.preConcat(this.JAA.get(size).eqN.eqN());
                }
            } else {
                com.bytedance.adsdk.IL.bX.bX.bg bgVar = this.kMt;
                if (bgVar != null) {
                    this.bg.preConcat(bgVar.eqN.eqN());
                }
            }
        }
        this.bg.preConcat(this.eqN.eqN());
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        android.graphics.Paint paint;
        java.lang.Integer numIR;
        com.bytedance.adsdk.IL.zx.bg(this.Fy);
        if (!this.Uw || this.bX.tC()) {
            com.bytedance.adsdk.IL.zx.IL(this.Fy);
            return;
        }
        Lq();
        com.bytedance.adsdk.IL.zx.bg("Layer#parentMatrix");
        this.aGH.set(matrix);
        this.Kg.reset();
        this.Kg.set(matrix);
        for (int size = this.JAA.size() - 1; size >= 0; size--) {
            this.Kg.preConcat(this.JAA.get(size).eqN.eqN());
        }
        com.bytedance.adsdk.IL.zx.IL("Layer#parentMatrix");
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Integer> bgVarBg = this.eqN.bg();
        int iIntValue = (int) ((((i / 255.0f) * ((bgVarBg == null || (numIR = bgVarBg.iR()) == null) ? 100 : numIR.intValue())) / 100.0f) * 255.0f);
        if (!bX() && !iR()) {
            this.Kg.preConcat(this.eqN.eqN());
            com.bytedance.adsdk.IL.zx.bg("Layer#drawLayer");
            IL(canvas, this.Kg, iIntValue);
            com.bytedance.adsdk.IL.zx.IL("Layer#drawLayer");
            bX(com.bytedance.adsdk.IL.zx.IL(this.Fy));
            return;
        }
        com.bytedance.adsdk.IL.zx.bg("Layer#computeBounds");
        bg(this.Lq, this.Kg, false);
        IL(this.Lq, matrix);
        this.Kg.preConcat(this.eqN.eqN());
        bg(this.Lq, this.Kg);
        this.vb.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.WR);
        if (!this.WR.isIdentity()) {
            android.graphics.Matrix matrix2 = this.WR;
            matrix2.invert(matrix2);
            this.WR.mapRect(this.vb);
        }
        if (!this.Lq.intersect(this.vb)) {
            this.Lq.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.bytedance.adsdk.IL.zx.IL("Layer#computeBounds");
        if (this.Lq.width() >= 1.0f && this.Lq.height() >= 1.0f) {
            com.bytedance.adsdk.IL.zx.bg("Layer#saveLayer");
            this.eo.setAlpha(255);
            com.bytedance.adsdk.IL.ldr.ldr.bg(canvas, this.Lq, this.eo);
            com.bytedance.adsdk.IL.zx.IL("Layer#saveLayer");
            bg(canvas);
            com.bytedance.adsdk.IL.zx.bg("Layer#drawLayer");
            IL(canvas, this.Kg, iIntValue);
            com.bytedance.adsdk.IL.zx.IL("Layer#drawLayer");
            if (iR()) {
                bg(canvas, this.Kg);
            }
            if (bX()) {
                com.bytedance.adsdk.IL.zx.bg("Layer#drawMatte");
                com.bytedance.adsdk.IL.zx.bg("Layer#saveLayer");
                com.bytedance.adsdk.IL.ldr.ldr.bg(canvas, this.Lq, this.Ta, 19);
                com.bytedance.adsdk.IL.zx.IL("Layer#saveLayer");
                bg(canvas);
                this.rri.bg(canvas, matrix, iIntValue);
                com.bytedance.adsdk.IL.zx.bg("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.IL.zx.IL("Layer#restoreLayer");
                com.bytedance.adsdk.IL.zx.IL("Layer#drawMatte");
            }
            com.bytedance.adsdk.IL.zx.bg("Layer#restoreLayer");
            canvas.restore();
            com.bytedance.adsdk.IL.zx.IL("Layer#restoreLayer");
        }
        if (this.DDQ && (paint = this.Uq) != null) {
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            this.Uq.setColor(-251901);
            this.Uq.setStrokeWidth(4.0f);
            canvas.drawRect(this.Lq, this.Uq);
            this.Uq.setStyle(android.graphics.Paint.Style.FILL);
            this.Uq.setColor(1357638635);
            canvas.drawRect(this.Lq, this.Uq);
        }
        bX(com.bytedance.adsdk.IL.zx.IL(this.Fy));
    }

    private void bX(float f) {
        this.IL.kMt().bX().bg(this.bX.ldr(), f);
    }

    private void bg(android.graphics.Canvas canvas) {
        com.bytedance.adsdk.IL.zx.bg("Layer#clearLayer");
        canvas.drawRect(this.Lq.left - 1.0f, this.Lq.top - 1.0f, this.Lq.right + 1.0f, this.Lq.bottom + 1.0f, this.yDt);
        com.bytedance.adsdk.IL.zx.IL("Layer#clearLayer");
    }

    private void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix) {
        this.xxp.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (iR()) {
            int size = this.LZ.bg().size();
            for (int i = 0; i < size; i++) {
                com.bytedance.adsdk.IL.bX.IL.Kg kg = this.LZ.bg().get(i);
                android.graphics.Path pathIR = this.LZ.IL().get(i).iR();
                if (pathIR != null) {
                    this.iR.set(pathIR);
                    this.iR.transform(matrix);
                    int i2 = com.bytedance.adsdk.IL.bX.bX.bg.AnonymousClass2.IL[kg.bg().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && kg.eqN()) {
                        return;
                    }
                    this.iR.computeBounds(this.tuV, false);
                    if (i == 0) {
                        this.xxp.set(this.tuV);
                    } else {
                        android.graphics.RectF rectF2 = this.xxp;
                        rectF2.set(java.lang.Math.min(rectF2.left, this.tuV.left), java.lang.Math.min(this.xxp.top, this.tuV.top), java.lang.Math.max(this.xxp.right, this.tuV.right), java.lang.Math.max(this.xxp.bottom, this.tuV.bottom));
                    }
                }
            }
            if (rectF.intersect(this.xxp)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.bX.bX.bg$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] IL;
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.IL.bX.IL.Kg.bg.values().length];
            IL = iArr;
            try {
                iArr[com.bytedance.adsdk.IL.bX.IL.Kg.bg.MASK_MODE_NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                IL[com.bytedance.adsdk.IL.bX.IL.Kg.bg.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                IL[com.bytedance.adsdk.IL.bX.IL.Kg.bg.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                IL[com.bytedance.adsdk.IL.bX.IL.Kg.bg.MASK_MODE_ADD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.bytedance.adsdk.IL.bX.bX.zx.bg.values().length];
            bg = iArr2;
            try {
                iArr2[com.bytedance.adsdk.IL.bX.bX.zx.bg.SHAPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.bX.zx.bg.PRE_COMP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.bX.zx.bg.SOLID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.bX.zx.bg.IMAGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.bX.zx.bg.NULL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.bX.zx.bg.TEXT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.bX.zx.bg.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    private void IL(android.graphics.RectF rectF, android.graphics.Matrix matrix) {
        if (bX() && this.bX.PX() != com.bytedance.adsdk.IL.bX.bX.zx.IL.INVERT) {
            this.VzQ.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.rri.bg(this.VzQ, matrix, true);
            if (rectF.intersect(this.VzQ)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public float ldr() {
        return this.VW;
    }

    protected void bg(int i) {
        this.VW = ((this.eqN.bg() != null ? this.eqN.bg().iR().intValue() : 100) / 100.0f) * (i / 255.0f);
    }

    public void IL(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        bg(i);
    }

    private void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix) {
        com.bytedance.adsdk.IL.zx.bg("Layer#saveLayer");
        com.bytedance.adsdk.IL.ldr.ldr.bg(canvas, this.Lq, this.VB, 19);
        if (android.os.Build.VERSION.SDK_INT < 28) {
            bg(canvas);
        }
        com.bytedance.adsdk.IL.zx.IL("Layer#saveLayer");
        for (int i = 0; i < this.LZ.bg().size(); i++) {
            com.bytedance.adsdk.IL.bX.IL.Kg kg = this.LZ.bg().get(i);
            com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path> bgVar = this.LZ.IL().get(i);
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar2 = this.LZ.bX().get(i);
            int i2 = com.bytedance.adsdk.IL.bX.bX.bg.AnonymousClass2.IL[kg.bg().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.eo.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
                        this.eo.setAlpha(255);
                        canvas.drawRect(this.Lq, this.eo);
                    }
                    if (kg.eqN()) {
                        bX(canvas, matrix, bgVar, bgVar2);
                    } else {
                        bg(canvas, matrix, bgVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (kg.eqN()) {
                            IL(canvas, matrix, bgVar, bgVar2);
                        } else {
                            bg(canvas, matrix, bgVar, bgVar2);
                        }
                    }
                } else if (kg.eqN()) {
                    zx(canvas, matrix, bgVar, bgVar2);
                } else {
                    eqN(canvas, matrix, bgVar, bgVar2);
                }
            } else if (yDt()) {
                this.eo.setAlpha(255);
                canvas.drawRect(this.Lq, this.eo);
            }
        }
        com.bytedance.adsdk.IL.zx.bg("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.IL.zx.IL("Layer#restoreLayer");
    }

    private boolean yDt() {
        if (this.LZ.IL().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.LZ.bg().size(); i++) {
            if (this.LZ.bg().get(i).bg() != com.bytedance.adsdk.IL.bX.IL.Kg.bg.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix, com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path> bgVar, com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar2) {
        this.iR.set(bgVar.iR());
        this.iR.transform(matrix);
        this.eo.setAlpha((int) (bgVar2.iR().intValue() * 2.55f));
        canvas.drawPath(this.iR, this.eo);
    }

    private void IL(android.graphics.Canvas canvas, android.graphics.Matrix matrix, com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path> bgVar, com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar2) {
        com.bytedance.adsdk.IL.ldr.ldr.bg(canvas, this.Lq, this.eo);
        canvas.drawRect(this.Lq, this.eo);
        this.iR.set(bgVar.iR());
        this.iR.transform(matrix);
        this.eo.setAlpha((int) (bgVar2.iR().intValue() * 2.55f));
        canvas.drawPath(this.iR, this.PX);
        canvas.restore();
    }

    private void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix, com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path> bgVar) {
        this.iR.set(bgVar.iR());
        this.iR.transform(matrix);
        canvas.drawPath(this.iR, this.PX);
    }

    private void bX(android.graphics.Canvas canvas, android.graphics.Matrix matrix, com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path> bgVar, com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar2) {
        com.bytedance.adsdk.IL.ldr.ldr.bg(canvas, this.Lq, this.PX);
        canvas.drawRect(this.Lq, this.eo);
        this.PX.setAlpha((int) (bgVar2.iR().intValue() * 2.55f));
        this.iR.set(bgVar.iR());
        this.iR.transform(matrix);
        canvas.drawPath(this.iR, this.PX);
        canvas.restore();
    }

    private void eqN(android.graphics.Canvas canvas, android.graphics.Matrix matrix, com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path> bgVar, com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar2) {
        com.bytedance.adsdk.IL.ldr.ldr.bg(canvas, this.Lq, this.VB);
        this.iR.set(bgVar.iR());
        this.iR.transform(matrix);
        this.eo.setAlpha((int) (bgVar2.iR().intValue() * 2.55f));
        canvas.drawPath(this.iR, this.eo);
        canvas.restore();
    }

    private void zx(android.graphics.Canvas canvas, android.graphics.Matrix matrix, com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path> bgVar, com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar2) {
        com.bytedance.adsdk.IL.ldr.ldr.bg(canvas, this.Lq, this.VB);
        canvas.drawRect(this.Lq, this.eo);
        this.PX.setAlpha((int) (bgVar2.iR().intValue() * 2.55f));
        this.iR.set(bgVar.iR());
        this.iR.transform(matrix);
        canvas.drawPath(this.iR, this.PX);
        canvas.restore();
    }

    boolean iR() {
        com.bytedance.adsdk.IL.bg.IL.Kg kg = this.LZ;
        return (kg == null || kg.IL().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(boolean z) {
        if (z != this.Uw) {
            this.Uw = z;
            Ta();
        }
    }

    public boolean Kg() {
        return this.Uw;
    }

    void bg(float f) {
        this.eqN.bg(f);
        if (this.LZ != null) {
            for (int i = 0; i < this.LZ.IL().size(); i++) {
                this.LZ.IL().get(i).bg(f);
            }
        }
        com.bytedance.adsdk.IL.bg.IL.eqN eqn = this.tC;
        if (eqn != null) {
            eqn.bg(f);
        }
        com.bytedance.adsdk.IL.bX.bX.bg bgVar = this.rri;
        if (bgVar != null) {
            bgVar.bg(f);
        }
        for (int i2 = 0; i2 < this.Ja.size(); i2++) {
            this.Ja.get(i2).bg(f);
        }
    }

    private void Lq() {
        if (this.JAA != null) {
            return;
        }
        if (this.kMt == null) {
            this.JAA = java.util.Collections.emptyList();
            return;
        }
        this.JAA = new java.util.ArrayList();
        for (com.bytedance.adsdk.IL.bX.bX.bg bgVar = this.kMt; bgVar != null; bgVar = bgVar.kMt) {
            this.JAA.add(bgVar);
        }
    }

    public java.lang.String WR() {
        return this.bX.ldr();
    }

    public com.bytedance.adsdk.IL.bX.IL.bg eo() {
        return this.bX.rri();
    }

    public android.graphics.BlurMaskFilter IL(float f) {
        if (this.zx == f) {
            return this.ldr;
        }
        android.graphics.BlurMaskFilter blurMaskFilter = new android.graphics.BlurMaskFilter(f / 2.0f, android.graphics.BlurMaskFilter.Blur.NORMAL);
        this.ldr = blurMaskFilter;
        this.zx = f;
        return blurMaskFilter;
    }

    public com.bytedance.adsdk.IL.zx.eo VB() {
        return this.bX.kMt();
    }
}
