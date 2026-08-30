package com.bytedance.adsdk.IL.bX.bX;

/* JADX INFO: loaded from: classes3.dex */
public class WR extends com.bytedance.adsdk.IL.bX.bX.bg {
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> Fy;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> JAA;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> Ja;
    private final android.graphics.RectF Kg;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> LZ;
    private final com.bytedance.adsdk.IL.bg.IL.Lq Lq;
    private final java.util.Map<com.bytedance.adsdk.IL.bX.eqN, java.util.List<com.bytedance.adsdk.IL.bg.bg.eqN>> PX;
    private final android.util.LongSparseArray<java.lang.String> Ta;
    private com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.Typeface, android.graphics.Typeface> Uw;
    private final android.graphics.Paint VB;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> VzQ;
    private final android.graphics.Matrix WR;
    private final android.graphics.Paint eo;
    private final java.lang.StringBuilder iR;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> kMt;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> rri;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> tC;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> tuV;
    private final com.bytedance.adsdk.IL.WR vb;
    private final com.bytedance.adsdk.IL.iR xxp;
    private final java.util.List<com.bytedance.adsdk.IL.bX.bX.WR.bg> yDt;

    WR(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.zx zxVar) {
        super(wr, zxVar);
        this.iR = new java.lang.StringBuilder(2);
        this.Kg = new android.graphics.RectF();
        this.WR = new android.graphics.Matrix();
        int i = 1;
        this.eo = new android.graphics.Paint(i) { // from class: com.bytedance.adsdk.IL.bX.bX.WR.1
            {
                setStyle(android.graphics.Paint.Style.FILL);
            }
        };
        this.VB = new android.graphics.Paint(i) { // from class: com.bytedance.adsdk.IL.bX.bX.WR.2
            {
                setStyle(android.graphics.Paint.Style.STROKE);
            }
        };
        this.PX = new java.util.HashMap();
        this.Ta = new android.util.LongSparseArray<>();
        this.yDt = new java.util.ArrayList();
        this.vb = wr;
        this.xxp = zxVar.bg();
        com.bytedance.adsdk.IL.bg.IL.Lq lqBg = zxVar.tuV().bg();
        this.Lq = lqBg;
        lqBg.bg(this);
        bg(lqBg);
        com.bytedance.adsdk.IL.bX.bg.VB vbFy = zxVar.Fy();
        if (vbFy != null && vbFy.bg != null) {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVarBg = vbFy.bg.bg();
            this.VzQ = bgVarBg;
            bgVarBg.bg(this);
            bg(this.VzQ);
        }
        if (vbFy != null && vbFy.IL != null) {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVarBg2 = vbFy.IL.bg();
            this.Fy = bgVarBg2;
            bgVarBg2.bg(this);
            bg(this.Fy);
        }
        if (vbFy != null && vbFy.bX != null) {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg3 = vbFy.bX.bg();
            this.tC = bgVarBg3;
            bgVarBg3.bg(this);
            bg(this.tC);
        }
        if (vbFy == null || vbFy.eqN == null) {
            return;
        }
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg4 = vbFy.eqN.bg();
        this.kMt = bgVarBg4;
        bgVarBg4.bg(this);
        bg(this.kMt);
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg, com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.bg(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.xxp.eqN().width(), this.xxp.eqN().height());
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg
    public void IL(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        super.IL(canvas, matrix, i);
        com.bytedance.adsdk.IL.bX.IL ilIR = this.Lq.iR();
        com.bytedance.adsdk.IL.bX.bX bXVar = this.xxp.Lq().get(ilIR.IL);
        if (bXVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        bg(ilIR, matrix);
        if (this.vb.rri()) {
            bg(ilIR, matrix, bXVar, canvas);
        } else {
            bg(ilIR, bXVar, canvas);
        }
        canvas.restore();
    }

    private void bg(com.bytedance.adsdk.IL.bX.IL il, android.graphics.Matrix matrix) {
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar = this.tuV;
        if (bgVar != null) {
            this.eo.setColor(bgVar.iR().intValue());
        } else {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar2 = this.VzQ;
            if (bgVar2 != null) {
                this.eo.setColor(bgVar2.iR().intValue());
            } else {
                this.eo.setColor(il.Kg);
            }
        }
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar3 = this.LZ;
        if (bgVar3 != null) {
            this.VB.setColor(bgVar3.iR().intValue());
        } else {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar4 = this.Fy;
            if (bgVar4 != null) {
                this.VB.setColor(bgVar4.iR().intValue());
            } else {
                this.VB.setColor(il.WR);
            }
        }
        int iIntValue = ((this.eqN.bg() == null ? 100 : this.eqN.bg().iR().intValue()) * 255) / 100;
        this.eo.setAlpha(iIntValue);
        this.VB.setAlpha(iIntValue);
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar5 = this.rri;
        if (bgVar5 != null) {
            this.VB.setStrokeWidth(bgVar5.iR().floatValue());
            return;
        }
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar6 = this.tC;
        if (bgVar6 != null) {
            this.VB.setStrokeWidth(bgVar6.iR().floatValue());
        } else {
            this.VB.setStrokeWidth(il.eo * com.bytedance.adsdk.IL.ldr.ldr.bg());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c A[LOOP:1: B:20:0x0076->B:22:0x007c, LOOP_END] */
    private void bg(com.bytedance.adsdk.IL.bX.IL il, android.graphics.Matrix matrix, com.bytedance.adsdk.IL.bX.bX bXVar, android.graphics.Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float f;
        int i;
        int i2;
        float f2;
        java.util.List<com.bytedance.adsdk.IL.bX.bX.WR.bg> listBg;
        int i3;
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar = this.Ja;
        if (bgVar != null) {
            fFloatValue = bgVar.iR().floatValue();
        } else {
            fFloatValue = il.bX;
        }
        float f3 = fFloatValue / 100.0f;
        float fBg = com.bytedance.adsdk.IL.ldr.ldr.bg(matrix);
        java.util.List<java.lang.String> listBg2 = bg(il.bg);
        int size = listBg2.size();
        float f4 = il.zx / 10.0f;
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar2 = this.JAA;
        if (bgVar2 != null) {
            fFloatValue2 = bgVar2.iR().floatValue();
        } else {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar3 = this.kMt;
            if (bgVar3 != null) {
                fFloatValue2 = bgVar3.iR().floatValue();
            }
            f = f4;
            i = -1;
            i2 = 0;
            while (i2 < size) {
                java.lang.String str = listBg2.get(i2);
                if (il.Ta == null) {
                    f2 = 0.0f;
                } else {
                    f2 = il.Ta.x;
                }
                int i4 = i2;
                listBg = bg(str, f2, bXVar, f3, f, true);
                i3 = 0;
                while (i3 < listBg.size()) {
                    com.bytedance.adsdk.IL.bX.bX.WR.bg bgVar4 = listBg.get(i3);
                    int i5 = i + 1;
                    canvas.save();
                    bg(canvas, il, i5, bgVar4.IL);
                    bg(bgVar4.bg, il, bXVar, canvas, fBg, f3, f);
                    canvas.restore();
                    i3++;
                    listBg = listBg;
                    i = i5;
                }
                i2 = i4 + 1;
            }
        }
        f4 += fFloatValue2;
        f = f4;
        i = -1;
        i2 = 0;
        while (i2 < size) {
            java.lang.String str2 = listBg2.get(i2);
            if (il.Ta == null) {
                f2 = 0.0f;
            } else {
                f2 = il.Ta.x;
            }
            int i6 = i2;
            listBg = bg(str2, f2, bXVar, f3, f, true);
            i3 = 0;
            while (i3 < listBg.size()) {
                com.bytedance.adsdk.IL.bX.bX.WR.bg bgVar5 = listBg.get(i3);
                int i7 = i + 1;
                canvas.save();
                bg(canvas, il, i7, bgVar5.IL);
                bg(bgVar5.bg, il, bXVar, canvas, fBg, f3, f);
                canvas.restore();
                i3++;
                listBg = listBg;
                i = i7;
            }
            i2 = i6 + 1;
        }
    }

    private void bg(java.lang.String str, com.bytedance.adsdk.IL.bX.IL il, com.bytedance.adsdk.IL.bX.bX bXVar, android.graphics.Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            com.bytedance.adsdk.IL.bX.eqN eqn = this.xxp.yDt().get(com.bytedance.adsdk.IL.bX.eqN.bg(str.charAt(i), bXVar.bg(), bXVar.bX()));
            if (eqn != null) {
                bg(eqn, f2, il, canvas);
                canvas.translate((((float) eqn.IL()) * f2 * com.bytedance.adsdk.IL.ldr.ldr.bg()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bd A[LOOP:1: B:26:0x00b7->B:28:0x00bd, LOOP_END] */
    private void bg(com.bytedance.adsdk.IL.bX.IL il, com.bytedance.adsdk.IL.bX.bX bXVar, android.graphics.Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fBg;
        java.util.List<java.lang.String> listBg;
        int size;
        int i;
        int i2;
        float f;
        java.util.List<com.bytedance.adsdk.IL.bX.bX.WR.bg> listBg2;
        int i3;
        android.graphics.Typeface typefaceBg = bg(bXVar);
        if (typefaceBg == null) {
            return;
        }
        java.lang.String strIL = il.bg;
        com.bytedance.adsdk.IL.LZ lzTC = this.vb.tC();
        if (lzTC != null) {
            strIL = lzTC.IL(WR(), strIL);
        }
        this.eo.setTypeface(typefaceBg);
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar = this.Ja;
        if (bgVar != null) {
            fFloatValue = bgVar.iR().floatValue();
        } else {
            fFloatValue = il.bX;
        }
        this.eo.setTextSize(com.bytedance.adsdk.IL.ldr.ldr.bg() * fFloatValue);
        this.VB.setTypeface(this.eo.getTypeface());
        this.VB.setTextSize(this.eo.getTextSize());
        float f2 = il.zx / 10.0f;
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar2 = this.JAA;
        if (bgVar2 != null) {
            fFloatValue2 = bgVar2.iR().floatValue();
        } else {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar3 = this.kMt;
            if (bgVar3 != null) {
                fFloatValue2 = bgVar3.iR().floatValue();
            }
            fBg = ((f2 * com.bytedance.adsdk.IL.ldr.ldr.bg()) * fFloatValue) / 100.0f;
            listBg = bg(strIL);
            size = listBg.size();
            i = -1;
            i2 = 0;
            while (i2 < size) {
                java.lang.String str = listBg.get(i2);
                if (il.Ta == null) {
                    f = 0.0f;
                } else {
                    f = il.Ta.x;
                }
                int i4 = i2;
                listBg2 = bg(str, f, bXVar, 0.0f, fBg, false);
                for (i3 = 0; i3 < listBg2.size(); i3++) {
                    com.bytedance.adsdk.IL.bX.bX.WR.bg bgVar4 = listBg2.get(i3);
                    i++;
                    canvas.save();
                    bg(canvas, il, i, bgVar4.IL);
                    bg(bgVar4.bg, il, canvas, fBg);
                    canvas.restore();
                }
                i2 = i4 + 1;
            }
        }
        f2 += fFloatValue2;
        fBg = ((f2 * com.bytedance.adsdk.IL.ldr.ldr.bg()) * fFloatValue) / 100.0f;
        listBg = bg(strIL);
        size = listBg.size();
        i = -1;
        i2 = 0;
        while (i2 < size) {
            java.lang.String str2 = listBg.get(i2);
            if (il.Ta == null) {
                f = 0.0f;
            } else {
                f = il.Ta.x;
            }
            int i5 = i2;
            listBg2 = bg(str2, f, bXVar, 0.0f, fBg, false);
            while (i3 < listBg2.size()) {
                com.bytedance.adsdk.IL.bX.bX.WR.bg bgVar5 = listBg2.get(i3);
                i++;
                canvas.save();
                bg(canvas, il, i, bgVar5.IL);
                bg(bgVar5.bg, il, canvas, fBg);
                canvas.restore();
            }
            i2 = i5 + 1;
        }
    }

    private void bg(android.graphics.Canvas canvas, com.bytedance.adsdk.IL.bX.IL il, int i, float f) {
        android.graphics.PointF pointF = il.PX;
        android.graphics.PointF pointF2 = il.Ta;
        float fBg = com.bytedance.adsdk.IL.ldr.ldr.bg();
        float f2 = (i * il.ldr * fBg) + (pointF == null ? 0.0f : (il.ldr * 0.6f * fBg) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = com.bytedance.adsdk.IL.bX.bX.WR.AnonymousClass3.bg[il.eqN.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
        } else if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else {
            if (i2 != 3) {
                return;
            }
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.bX.bX.WR$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.IL.bX.IL.bg.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.adsdk.IL.bX.IL.bg.LEFT_ALIGN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.IL.bg.RIGHT_ALIGN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.IL.bg.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private android.graphics.Typeface bg(com.bytedance.adsdk.IL.bX.bX bXVar) {
        android.graphics.Typeface typefaceIR;
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.Typeface, android.graphics.Typeface> bgVar = this.Uw;
        if (bgVar != null && (typefaceIR = bgVar.iR()) != null) {
            return typefaceIR;
        }
        android.graphics.Typeface typefaceBg = this.vb.bg(bXVar);
        return typefaceBg != null ? typefaceBg : bXVar.eqN();
    }

    private java.util.List<java.lang.String> bg(java.lang.String str) {
        return java.util.Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void bg(java.lang.String str, com.bytedance.adsdk.IL.bX.IL il, android.graphics.Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            java.lang.String strBg = bg(str, length);
            length += strBg.length();
            bg(strBg, il, canvas);
            canvas.translate(this.eo.measureText(strBg) + f, 0.0f);
        }
    }

    private java.util.List<com.bytedance.adsdk.IL.bX.bX.WR.bg> bg(java.lang.String str, float f, com.bytedance.adsdk.IL.bX.bX bXVar, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                com.bytedance.adsdk.IL.bX.eqN eqn = this.xxp.yDt().get(com.bytedance.adsdk.IL.bX.eqN.bg(cCharAt, bXVar.bg(), bXVar.bX()));
                if (eqn != null) {
                    fMeasureText = ((float) eqn.IL()) * f2 * com.bytedance.adsdk.IL.ldr.ldr.bg();
                }
            } else {
                fMeasureText = this.eo.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                com.bytedance.adsdk.IL.bX.bX.WR.bg bgVarIL = IL(i);
                if (i3 == i2) {
                    java.lang.String strSubstring = str.substring(i2, i4);
                    java.lang.String strTrim = strSubstring.trim();
                    bgVarIL.bg(strTrim, (f4 - f7) - ((strTrim.length() - strSubstring.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    java.lang.String strSubstring2 = str.substring(i2, i3 - 1);
                    java.lang.String strTrim2 = strSubstring2.trim();
                    bgVarIL.bg(strTrim2, ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            IL(i).bg(str.substring(i2), f4);
        }
        return this.yDt.subList(0, i);
    }

    private com.bytedance.adsdk.IL.bX.bX.WR.bg IL(int i) {
        for (int size = this.yDt.size(); size < i; size++) {
            this.yDt.add(new com.bytedance.adsdk.IL.bX.bX.WR.bg());
        }
        return this.yDt.get(i - 1);
    }

    private void bg(com.bytedance.adsdk.IL.bX.eqN eqn, float f, com.bytedance.adsdk.IL.bX.IL il, android.graphics.Canvas canvas) {
        java.util.List<com.bytedance.adsdk.IL.bg.bg.eqN> listBg = bg(eqn);
        for (int i = 0; i < listBg.size(); i++) {
            android.graphics.Path pathEqN = listBg.get(i).eqN();
            pathEqN.computeBounds(this.Kg, false);
            this.WR.reset();
            this.WR.preTranslate(0.0f, (-il.iR) * com.bytedance.adsdk.IL.ldr.ldr.bg());
            this.WR.preScale(f, f);
            pathEqN.transform(this.WR);
            if (il.VB) {
                bg(pathEqN, this.eo, canvas);
                bg(pathEqN, this.VB, canvas);
            } else {
                bg(pathEqN, this.VB, canvas);
                bg(pathEqN, this.eo, canvas);
            }
        }
    }

    private void bg(android.graphics.Path path, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == android.graphics.Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void bg(java.lang.String str, com.bytedance.adsdk.IL.bX.IL il, android.graphics.Canvas canvas) {
        if (il.VB) {
            bg(str, this.eo, canvas);
            bg(str, this.VB, canvas);
        } else {
            bg(str, this.VB, canvas);
            bg(str, this.eo, canvas);
        }
    }

    private void bg(java.lang.String str, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == android.graphics.Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private java.util.List<com.bytedance.adsdk.IL.bg.bg.eqN> bg(com.bytedance.adsdk.IL.bX.eqN eqn) {
        if (this.PX.containsKey(eqn)) {
            return this.PX.get(eqn);
        }
        java.util.List<com.bytedance.adsdk.IL.bX.IL.xxp> listBg = eqn.bg();
        int size = listBg.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new com.bytedance.adsdk.IL.bg.bg.eqN(this.vb, this, listBg.get(i), this.xxp));
        }
        this.PX.put(eqn, arrayList);
        return arrayList;
    }

    private java.lang.String bg(java.lang.String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = java.lang.Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!bX(iCodePointAt2)) {
                break;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.Ta.indexOfKey(j) >= 0) {
            return this.Ta.get(j);
        }
        this.iR.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.iR.appendCodePoint(iCodePointAt3);
            i += java.lang.Character.charCount(iCodePointAt3);
        }
        java.lang.String string = this.iR.toString();
        this.Ta.put(j, string);
        return string;
    }

    private boolean bX(int i) {
        return java.lang.Character.getType(i) == 16 || java.lang.Character.getType(i) == 27 || java.lang.Character.getType(i) == 6 || java.lang.Character.getType(i) == 28 || java.lang.Character.getType(i) == 8 || java.lang.Character.getType(i) == 19;
    }

    private static class bg {
        private float IL;
        private java.lang.String bg;

        private bg() {
            this.bg = "";
            this.IL = 0.0f;
        }

        void bg(java.lang.String str, float f) {
            this.bg = str;
            this.IL = f;
        }
    }
}
