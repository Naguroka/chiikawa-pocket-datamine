package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03762h extends android.graphics.drawable.Drawable {
    public static java.lang.String[] A0B = {"7TbfIjq4nUNlo9PBRbBh8Nqjz9WD1j4o", "QwIEzzAwkj5R91wAwEWLlMMFKcIcEzMH", "YGxjb6ZA6RtUmEF8MJ0615ZpcT73YF5q", "S0hvC3rZuvsYRwp1KEtz", "1QChJDVwb8IocnSKwo65wA6CZgco7TbD", "ZdRWauYqGR9BuXwVkjl982N5", "gVkOfeUFBBjn0ZGk6MgiFADp", "9Iu12MOa7l614b1gjodkd988Is"};
    public float A00;
    public float A01;
    public android.content.res.ColorStateList A02;
    public android.content.res.ColorStateList A03;
    public android.graphics.PorterDuffColorFilter A05;
    public final android.graphics.Rect A09;
    public final android.graphics.RectF A0A;
    public boolean A06 = false;
    public boolean A07 = true;
    public android.graphics.PorterDuff.Mode A04 = android.graphics.PorterDuff.Mode.SRC_IN;
    public final android.graphics.Paint A08 = new android.graphics.Paint(5);

    public C03762h(android.content.res.ColorStateList colorStateList, float f) {
        this.A01 = f;
        A01(colorStateList);
        this.A0A = new android.graphics.RectF();
        this.A09 = new android.graphics.Rect();
    }

    private android.graphics.PorterDuffColorFilter A00(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void A01(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(0);
        }
        this.A02 = colorStateList;
        this.A08.setColor(this.A02.getColorForState(getState(), this.A02.getDefaultColor()));
    }

    private void A02(android.graphics.Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.A0A.set(rect.left, rect.top, rect.right, rect.bottom);
        this.A09.set(rect);
        if (this.A06) {
            float fA01 = com.facebook.ads.redexgen.core.C03782j.A01(this.A00, this.A01, this.A07);
            float vInset = com.facebook.ads.redexgen.core.C03782j.A00(this.A00, this.A01, this.A07);
            this.A09.inset((int) java.lang.Math.ceil(vInset), (int) java.lang.Math.ceil(fA01));
            this.A0A.set(this.A09);
        }
    }

    public final float A03() {
        return this.A00;
    }

    public final float A04() {
        return this.A01;
    }

    public final android.content.res.ColorStateList A05() {
        return this.A02;
    }

    public final void A06(float f) {
        if (f == this.A01) {
            return;
        }
        this.A01 = f;
        A02(null);
        invalidateSelf();
    }

    public final void A07(float f, boolean z, boolean z2) {
        if (f == this.A00 && this.A06 == z && this.A07 == z2) {
            return;
        }
        this.A00 = f;
        this.A06 = z;
        this.A07 = z2;
        A02(null);
        invalidateSelf();
    }

    public final void A08(android.content.res.ColorStateList colorStateList) {
        A01(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        boolean z;
        android.graphics.Paint paint = this.A08;
        if (this.A05 != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.A05);
            z = true;
        } else {
            z = false;
        }
        canvas.drawRoundRect(this.A0A, this.A01, this.A01, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        outline.setRoundRect(this.A09, this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.A03 != null && this.A03.isStateful()) || (this.A02 != null && this.A02.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        A02(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.A02.getColorForState(iArr, this.A02.getDefaultColor());
        int newColor = this.A08.getColor();
        boolean colorChanged = colorForState != newColor;
        if (colorChanged) {
            this.A08.setColor(colorForState);
        }
        if (this.A03 != null && this.A04 != null) {
            android.content.res.ColorStateList colorStateList = this.A03;
            if (A0B[1].charAt(13) == 'z') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0B;
            strArr[5] = "QGJeL8K6asHWX9bSRI5oYOa5";
            strArr[6] = "GrCaC70zqQWkgUOv3d1vdiOs";
            this.A05 = A00(colorStateList, this.A04);
            return true;
        }
        return colorChanged;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A08.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        this.A03 = colorStateList;
        this.A05 = A00(this.A03, this.A04);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.A04 = mode;
        this.A05 = A00(this.A03, this.A04);
        invalidateSelf();
    }
}
