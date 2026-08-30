package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
final class g {
    private int A;
    private int B;
    private int C;
    private int D;
    private android.text.StaticLayout E;
    private android.text.StaticLayout F;
    private int G;
    private int H;
    private int I;
    private android.graphics.Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f569a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final android.text.TextPaint f;
    private final android.graphics.Paint g;
    private final android.graphics.Paint h;
    private java.lang.CharSequence i;
    private android.text.Layout.Alignment j;
    private android.graphics.Bitmap k;
    private float l;
    private int m;
    private int n;
    private float o;
    private int p;
    private float q;
    private float r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private float x;
    private float y;
    private float z;

    public g(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = java.lang.Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f569a = fRound;
        this.b = fRound;
        this.c = fRound;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private void b() {
        int i;
        int i2;
        int iMax;
        int iMin;
        int iRound;
        int i3;
        java.lang.CharSequence charSequence = this.i;
        android.text.SpannableStringBuilder spannableStringBuilder = charSequence instanceof android.text.SpannableStringBuilder ? (android.text.SpannableStringBuilder) charSequence : new android.text.SpannableStringBuilder(this.i);
        int i4 = this.C - this.A;
        int i5 = this.D - this.B;
        this.f.setTextSize(this.x);
        int i6 = (int) ((this.x * 0.125f) + 0.5f);
        int i7 = i6 * 2;
        int i8 = i4 - i7;
        float f = this.q;
        if (f != -3.4028235E38f) {
            i8 = (int) (i8 * f);
        }
        int i9 = i8;
        if (i9 <= 0) {
            com.applovin.impl.oc.d("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.y > 0.0f) {
            spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) this.y), 0, spannableStringBuilder.length(), 16711680);
        }
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(spannableStringBuilder);
        if (this.w == 1) {
            for (android.text.style.ForegroundColorSpan foregroundColorSpan : (android.text.style.ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), android.text.style.ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (android.graphics.Color.alpha(this.t) > 0) {
            int i10 = this.w;
            if (i10 == 0 || i10 == 2) {
                spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new android.text.style.BackgroundColorSpan(this.t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        android.text.Layout.Alignment alignment = this.j;
        if (alignment == null) {
            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
        }
        android.text.Layout.Alignment alignment2 = alignment;
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spannableStringBuilder, this.f, i9, alignment2, this.d, this.e, true);
        this.E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.E.getLineCount();
        int iMax2 = 0;
        for (int i11 = 0; i11 < lineCount; i11++) {
            iMax2 = java.lang.Math.max((int) java.lang.Math.ceil(this.E.getLineWidth(i11)), iMax2);
        }
        if (this.q == -3.4028235E38f || iMax2 >= i9) {
            i9 = iMax2;
        }
        int i12 = i9 + i7;
        float f2 = this.o;
        if (f2 != -3.4028235E38f) {
            int iRound2 = java.lang.Math.round(i4 * f2);
            int i13 = this.A;
            int i14 = iRound2 + i13;
            int i15 = this.p;
            i = 1;
            i2 = 2;
            if (i15 == 1) {
                i14 = ((i14 * 2) - i12) / 2;
            } else if (i15 == 2) {
                i14 -= i12;
            }
            iMax = java.lang.Math.max(i14, i13);
            iMin = java.lang.Math.min(i12 + iMax, this.C);
        } else {
            i = 1;
            i2 = 2;
            iMax = ((i4 - i12) / 2) + this.A;
            iMin = iMax + i12;
        }
        int i16 = iMin - iMax;
        if (i16 <= 0) {
            com.applovin.impl.oc.d("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f3 = this.l;
        if (f3 != -3.4028235E38f) {
            if (this.m == 0) {
                iRound = java.lang.Math.round(i5 * f3) + this.B;
                int i17 = this.n;
                if (i17 == i2) {
                    iRound -= height;
                } else if (i17 == i) {
                    iRound = ((iRound * 2) - height) / i2;
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f4 = this.l;
                if (f4 >= 0.0f) {
                    iRound = java.lang.Math.round(f4 * lineBottom) + this.B;
                } else {
                    iRound = java.lang.Math.round((f4 + 1.0f) * lineBottom) + this.D;
                    iRound -= height;
                }
            }
            int i18 = iRound + height;
            int i19 = this.D;
            if (i18 <= i19) {
                int i20 = this.B;
                if (iRound < i20) {
                    i3 = i20;
                }
                this.E = new android.text.StaticLayout(spannableStringBuilder, this.f, i16, alignment2, this.d, this.e, true);
                this.F = new android.text.StaticLayout(spannableStringBuilder2, this.f, i16, alignment2, this.d, this.e, true);
                this.G = iMax;
                this.H = i3;
                this.I = i6;
            }
            iRound = i19 - height;
        } else {
            iRound = (this.D - height) - ((int) (i5 * this.z));
        }
        i3 = iRound;
        this.E = new android.text.StaticLayout(spannableStringBuilder, this.f, i16, alignment2, this.d, this.e, true);
        this.F = new android.text.StaticLayout(spannableStringBuilder2, this.f, i16, alignment2, this.d, this.e, true);
        this.G = iMax;
        this.H = i3;
        this.I = i6;
    }

    private void b(android.graphics.Canvas canvas) {
        android.text.StaticLayout staticLayout = this.E;
        android.text.StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (android.graphics.Color.alpha(this.u) > 0) {
            this.g.setColor(this.u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.g);
        }
        int i = this.w;
        if (i == 1) {
            this.f.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            this.f.setStrokeWidth(this.f569a);
            this.f.setColor(this.v);
            this.f.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            android.text.TextPaint textPaint = this.f;
            float f = this.b;
            float f2 = this.c;
            textPaint.setShadowLayer(f, f2, f2, this.v);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.v;
            int i3 = z ? this.v : -1;
            float f3 = this.b / 2.0f;
            this.f.setColor(this.s);
            this.f.setStyle(android.graphics.Paint.Style.FILL);
            float f4 = -f3;
            this.f.setShadowLayer(this.b, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.f.setShadowLayer(this.b, f3, f3, i3);
        }
        this.f.setColor(this.s);
        this.f.setStyle(android.graphics.Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    public void a(com.applovin.impl.a5 a5Var, com.applovin.impl.x2 x2Var, float f, float f2, float f3, android.graphics.Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = a5Var.d == null;
        if (!z) {
            i5 = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        } else if (android.text.TextUtils.isEmpty(a5Var.f580a)) {
            return;
        } else {
            i5 = a5Var.m ? a5Var.n : x2Var.c;
        }
        if (a(this.i, a5Var.f580a) && com.applovin.impl.xp.a(this.j, a5Var.b) && this.k == a5Var.d && this.l == a5Var.f && this.m == a5Var.g && com.applovin.impl.xp.a(java.lang.Integer.valueOf(this.n), java.lang.Integer.valueOf(a5Var.h)) && this.o == a5Var.i && com.applovin.impl.xp.a(java.lang.Integer.valueOf(this.p), java.lang.Integer.valueOf(a5Var.j)) && this.q == a5Var.k && this.r == a5Var.l && this.s == x2Var.f1484a && this.t == x2Var.b && this.u == i5 && this.w == x2Var.d && this.v == x2Var.e && com.applovin.impl.xp.a(this.f.getTypeface(), x2Var.f) && this.x == f && this.y == f2 && this.z == f3 && this.A == i && this.B == i2 && this.C == i3 && this.D == i4) {
            a(canvas, z);
            return;
        }
        this.i = a5Var.f580a;
        this.j = a5Var.b;
        this.k = a5Var.d;
        this.l = a5Var.f;
        this.m = a5Var.g;
        this.n = a5Var.h;
        this.o = a5Var.i;
        this.p = a5Var.j;
        this.q = a5Var.k;
        this.r = a5Var.l;
        this.s = x2Var.f1484a;
        this.t = x2Var.b;
        this.u = i5;
        this.w = x2Var.d;
        this.v = x2Var.e;
        this.f.setTypeface(x2Var.f);
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = i;
        this.B = i2;
        this.C = i3;
        this.D = i4;
        if (z) {
            com.applovin.impl.b1.a(this.i);
            b();
        } else {
            com.applovin.impl.b1.a(this.k);
            a();
        }
        a(canvas, z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    private void a() {
        int iRound;
        float f;
        int i;
        float f2;
        android.graphics.Bitmap bitmap = this.k;
        int i2 = this.C;
        int i3 = this.A;
        int i4 = this.D;
        int i5 = this.B;
        float f3 = i2 - i3;
        float f4 = i3 + (this.o * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.l * f5);
        int iRound2 = java.lang.Math.round(f3 * this.q);
        float f7 = this.r;
        if (f7 != -3.4028235E38f) {
            iRound = java.lang.Math.round(f5 * f7);
        } else {
            iRound = java.lang.Math.round(iRound2 * (bitmap.getHeight() / bitmap.getWidth()));
        }
        int i6 = this.p;
        if (i6 != 2) {
            if (i6 == 1) {
                f = iRound2 / 2;
            }
            int iRound3 = java.lang.Math.round(f4);
            i = this.n;
            if (i == 2) {
                if (i == 1) {
                    f2 = iRound / 2;
                }
                int iRound4 = java.lang.Math.round(f6);
                this.J = new android.graphics.Rect(iRound3, iRound4, iRound2 + iRound3, iRound + iRound4);
            }
            f2 = iRound;
            f6 -= f2;
            int iRound5 = java.lang.Math.round(f6);
            this.J = new android.graphics.Rect(iRound3, iRound5, iRound2 + iRound3, iRound + iRound5);
        }
        f = iRound2;
        f4 -= f;
        int iRound6 = java.lang.Math.round(f4);
        i = this.n;
        if (i == 2) {
            if (i == 1) {
                f2 = iRound / 2;
            }
            int iRound7 = java.lang.Math.round(f6);
            this.J = new android.graphics.Rect(iRound6, iRound7, iRound2 + iRound6, iRound + iRound7);
        }
        f2 = iRound;
        f6 -= f2;
        int iRound8 = java.lang.Math.round(f6);
        this.J = new android.graphics.Rect(iRound6, iRound8, iRound2 + iRound6, iRound + iRound8);
    }

    private void a(android.graphics.Canvas canvas, boolean z) {
        if (z) {
            b(canvas);
            return;
        }
        com.applovin.impl.b1.a(this.J);
        com.applovin.impl.b1.a(this.k);
        a(canvas);
    }

    private void a(android.graphics.Canvas canvas) {
        canvas.drawBitmap(this.k, (android.graphics.Rect) null, this.J, this.h);
    }

    private static boolean a(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
