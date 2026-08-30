package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03782j extends android.graphics.drawable.Drawable {
    public static com.facebook.ads.redexgen.core.InterfaceC03772i A0G;
    public static byte[] A0H;
    public static java.lang.String[] A0I = {"Bq6maawZ0clc1FQAmj5JQZ", "VAIBWau0AGjNNTEN3MsesX9vol", "j9uAnr9SO1508v2Fml3gke", "ZCgsP4jhFD2e5OZklqeZfYu5I7s7wZNA", "gWy56vmTKK0E", "vsILSp0QdnJQHstvTHvz6zn3fr5EWYkf", "Ft8tZM9UwubEJUOv9H1JFeEwlzUnh", "KM7boO2xaC3ZbV22lXcue9aE71LlUQ5e"};
    public static final double A0J;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public android.content.res.ColorStateList A04;
    public android.graphics.Paint A05;
    public android.graphics.Paint A06;
    public android.graphics.Path A08;
    public final android.graphics.RectF A0F;
    public boolean A0A = true;
    public boolean A09 = true;
    public boolean A0B = false;
    public final int A0E = 922746880;
    public final int A0D = 50331648;
    public final int A0C = com.facebook.ads.redexgen.core.AbstractC03732e.A09;
    public android.graphics.Paint A07 = new android.graphics.Paint(5);

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A0H = new byte[]{75, kotlin.io.encoding.Base64.padSymbol, 106, -110, -112, -111, kotlin.io.encoding.Base64.padSymbol, 127, -126, kotlin.io.encoding.Base64.padSymbol, 91, 90, kotlin.io.encoding.Base64.padSymbol, 77, 78, 115, 123, 102, 113, 110, 105, 37, 114, 102, 125, 37, 120, 109, 102, 105, 116, 124, 37, 120, 110, 127, 106, 37, 117, -102, -94, -115, -104, -107, -112, 76, -98, -115, -112, -107, -95, -97, 76, 78, 115, 123, 102, 113, 110, 105, 37, 120, 109, 102, 105, 116, 124, 37, 120, 110, 127, 106, 37};
    }

    static {
        A05();
        A0J = java.lang.Math.cos(java.lang.Math.toRadians(45.0d));
    }

    public C03782j(android.content.res.Resources resources, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        A07(colorStateList);
        this.A05 = new android.graphics.Paint(5);
        this.A05.setStyle(android.graphics.Paint.Style.FILL);
        this.A00 = (int) (0.5f + f);
        this.A0F = new android.graphics.RectF();
        this.A06 = new android.graphics.Paint(this.A05);
        this.A06.setAntiAlias(false);
        A06(f2, f3);
    }

    public static float A00(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - A0J) * ((double) f2)));
        }
        return f;
    }

    public static float A01(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f)) + ((1.0d - A0J) * ((double) f2)));
        }
        float f3 = 1.5f * f;
        if (A0I[6].length() == 2) {
            throw new java.lang.RuntimeException();
        }
        A0I[3] = "QZbxm3QXOF2yqMmVze25YX6oNvKBlq6Q";
        return f3;
    }

    private int A02(float f) {
        int i = (int) (0.5f + f);
        if (i % 2 == 1) {
            int i2 = i - 1;
            return i2;
        }
        return i;
    }

    private void A04() {
        android.graphics.RectF rectF = new android.graphics.RectF(-this.A00, -this.A00, this.A00, this.A00);
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        rectF2.inset(-this.A03, -this.A03);
        if (this.A08 == null) {
            this.A08 = new android.graphics.Path();
        } else {
            this.A08.reset();
        }
        this.A08.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        this.A08.moveTo(-this.A00, 0.0f);
        this.A08.rLineTo(-this.A03, 0.0f);
        this.A08.arcTo(rectF2, 180.0f, 90.0f, false);
        this.A08.arcTo(rectF, 270.0f, -90.0f, false);
        this.A08.close();
        this.A05.setShader(new android.graphics.RadialGradient(0.0f, 0.0f, this.A00 + this.A03, new int[]{this.A0E, this.A0E, this.A0D}, new float[]{0.0f, this.A00 / (this.A00 + this.A03), 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        this.A06.setShader(new android.graphics.LinearGradient(0.0f, (-this.A00) + this.A03, 0.0f, (-this.A00) - this.A03, new int[]{this.A0E, this.A0E, this.A0D}, new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        this.A06.setAntiAlias(false);
    }

    private void A06(float f, float f2) {
        java.lang.String strA03 = A03(0, 14, 25);
        if (f < 0.0f) {
            throw new java.lang.IllegalArgumentException(A03(53, 20, 1) + f + strA03);
        }
        if (f2 >= 0.0f) {
            float fA02 = A02(f);
            float fA03 = A02(f2);
            if (fA02 > fA03) {
                fA02 = fA03;
                if (!this.A0B) {
                    this.A0B = true;
                }
            }
            if (this.A02 == fA02 && this.A01 == fA03) {
                return;
            }
            this.A02 = fA02;
            this.A01 = fA03;
            this.A03 = (int) ((1.5f * fA02) + this.A0C + 0.5f);
            this.A0A = true;
            invalidateSelf();
            return;
        }
        throw new java.lang.IllegalArgumentException(A03(14, 24, 1) + f2 + strA03);
    }

    private void A07(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(0);
        }
        this.A04 = colorStateList;
        this.A07.setColor(this.A04.getColorForState(getState(), this.A04.getDefaultColor()));
    }

    private void A08(android.graphics.Canvas canvas) {
        float f = (-this.A00) - this.A03;
        float edgeShadowTop = this.A00 + this.A0C + (this.A02 / 2.0f);
        float inset = edgeShadowTop * 2.0f;
        boolean z = this.A0F.width() - inset > 0.0f;
        float inset2 = edgeShadowTop * 2.0f;
        boolean z2 = this.A0F.height() - inset2 > 0.0f;
        int iSave = canvas.save();
        float f2 = this.A0F.left + edgeShadowTop;
        float inset3 = this.A0F.top;
        canvas.translate(f2, inset3 + edgeShadowTop);
        canvas.drawPath(this.A08, this.A05);
        if (z) {
            float inset4 = edgeShadowTop * 2.0f;
            float fWidth = this.A0F.width() - inset4;
            float inset5 = this.A00;
            canvas.drawRect(0.0f, f, fWidth, -inset5, this.A06);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        float f3 = this.A0F.right - edgeShadowTop;
        float inset6 = this.A0F.bottom;
        canvas.translate(f3, inset6 - edgeShadowTop);
        canvas.rotate(180.0f);
        canvas.drawPath(this.A08, this.A05);
        if (z) {
            float inset7 = edgeShadowTop * 2.0f;
            float fWidth2 = this.A0F.width() - inset7;
            float inset8 = this.A00;
            float f4 = -inset8;
            float inset9 = this.A03;
            canvas.drawRect(0.0f, f, fWidth2, f4 + inset9, this.A06);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        float f5 = this.A0F.left + edgeShadowTop;
        float inset10 = this.A0F.bottom;
        canvas.translate(f5, inset10 - edgeShadowTop);
        canvas.rotate(270.0f);
        canvas.drawPath(this.A08, this.A05);
        if (z2) {
            float inset11 = edgeShadowTop * 2.0f;
            float fHeight = this.A0F.height() - inset11;
            float inset12 = this.A00;
            float f6 = -inset12;
            if (A0I[5].charAt(6) == 'R') {
                throw new java.lang.RuntimeException();
            }
            A0I[6] = "2Ln5BSLKVjuogxQZwoom6EaRoO86Ewhl";
            canvas.drawRect(0.0f, f, fHeight, f6, this.A06);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        float f7 = this.A0F.right - edgeShadowTop;
        float inset13 = this.A0F.top;
        canvas.translate(f7, inset13 + edgeShadowTop);
        canvas.rotate(90.0f);
        canvas.drawPath(this.A08, this.A05);
        if (A0I[7].charAt(11) != 'Z') {
            throw new java.lang.RuntimeException();
        }
        A0I[6] = "W2wdXev7uTlJlARfOPIfUdj";
        if (z2) {
            canvas.drawRect(0.0f, f, this.A0F.height() - (2.0f * edgeShadowTop), -this.A00, this.A06);
        }
        canvas.restoreToCount(iSave4);
    }

    private void A09(android.graphics.Rect rect) {
        float f = this.A01 * 1.5f;
        android.graphics.RectF rectF = this.A0F;
        float f2 = rect.left;
        float verticalOffset = this.A01;
        float f3 = f2 + verticalOffset;
        float f4 = rect.top + f;
        float f5 = rect.right;
        float verticalOffset2 = this.A01;
        float f6 = f5 - verticalOffset2;
        float verticalOffset3 = rect.bottom;
        rectF.set(f3, f4, f6, verticalOffset3 - f);
        A04();
    }

    public final float A0A() {
        return this.A00;
    }

    public final float A0B() {
        return this.A01;
    }

    public final float A0C() {
        float fMax = java.lang.Math.max(this.A01, this.A00 + this.A0C + ((this.A01 * 1.5f) / 2.0f)) * 2.0f;
        float f = this.A01 * 1.5f;
        float content = this.A0C;
        return ((f + content) * 2.0f) + fMax;
    }

    public final float A0D() {
        float fMax = java.lang.Math.max(this.A01, this.A00 + this.A0C + (this.A01 / 2.0f)) * 2.0f;
        float f = this.A01;
        float content = this.A0C;
        return ((f + content) * 2.0f) + fMax;
    }

    public final float A0E() {
        return this.A02;
    }

    public final android.content.res.ColorStateList A0F() {
        return this.A04;
    }

    public final void A0G(float f) {
        if (f >= 0.0f) {
            float f2 = (int) (0.5f + f);
            if (this.A00 == f2) {
                return;
            }
            this.A00 = f2;
            this.A0A = true;
            invalidateSelf();
            return;
        }
        throw new java.lang.IllegalArgumentException(A03(38, 15, 40) + f + A03(0, 14, 25));
    }

    public final void A0H(float f) {
        A06(this.A02, f);
    }

    public final void A0I(float f) {
        A06(f, this.A01);
    }

    public final void A0J(android.content.res.ColorStateList colorStateList) {
        A07(colorStateList);
        invalidateSelf();
    }

    public final void A0K(android.graphics.Rect rect) {
        getPadding(rect);
    }

    public final void A0L(boolean z) {
        this.A09 = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (this.A0A) {
            A09(getBounds());
            this.A0A = false;
        }
        canvas.translate(0.0f, this.A02 / 2.0f);
        A08(canvas);
        canvas.translate(0.0f, (-this.A02) / 2.0f);
        A0G.A5a(canvas, this.A0F, this.A00, this.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        int iCeil = (int) java.lang.Math.ceil(A01(this.A01, this.A00, this.A09));
        int vOffset = (int) java.lang.Math.ceil(A00(this.A01, this.A00, this.A09));
        rect.set(vOffset, iCeil, vOffset, iCeil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.A04 != null && this.A04.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.A0A = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.A04.getColorForState(iArr, this.A04.getDefaultColor());
        int newColor = this.A07.getColor();
        if (newColor == colorForState) {
            return false;
        }
        this.A07.setColor(colorForState);
        this.A0A = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        this.A05.setAlpha(i);
        this.A06.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }
}
