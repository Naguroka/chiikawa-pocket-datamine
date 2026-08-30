package com.google.android.material.shadow;

/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public class ShadowDrawableWrapper extends androidx.appcompat.graphics.drawable.DrawableWrapper {
    static final double COS_45 = java.lang.Math.cos(java.lang.Math.toRadians(45.0d));
    static final float SHADOW_BOTTOM_SCALE = 1.0f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;
    final android.graphics.RectF contentBounds;
    float cornerRadius;
    final android.graphics.Paint cornerShadowPaint;
    android.graphics.Path cornerShadowPath;
    private boolean dirty;
    final android.graphics.Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    public int getOpacity() {
        return -3;
    }

    public ShadowDrawableWrapper(android.content.Context context, android.graphics.drawable.Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.dirty = true;
        this.addPaddingForCorners = true;
        this.printedShadowClipWarning = false;
        this.shadowStartColor = androidx.core.content.ContextCompat.getColor(context, com.google.android.material.R.color.design_fab_shadow_start_color);
        this.shadowMiddleColor = androidx.core.content.ContextCompat.getColor(context, com.google.android.material.R.color.design_fab_shadow_mid_color);
        this.shadowEndColor = androidx.core.content.ContextCompat.getColor(context, com.google.android.material.R.color.design_fab_shadow_end_color);
        android.graphics.Paint paint = new android.graphics.Paint(5);
        this.cornerShadowPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.cornerRadius = java.lang.Math.round(f);
        this.contentBounds = new android.graphics.RectF();
        android.graphics.Paint paint2 = new android.graphics.Paint(paint);
        this.edgeShadowPaint = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    private static int toEven(float f) {
        int iRound = java.lang.Math.round(f);
        return iRound % 2 == 1 ? iRound - 1 : iRound;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.addPaddingForCorners = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.cornerShadowPaint.setAlpha(i);
        this.edgeShadowPaint.setAlpha(i);
    }

    protected void onBoundsChange(android.graphics.Rect rect) {
        this.dirty = true;
    }

    public void setShadowSize(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new java.lang.IllegalArgumentException("invalid shadow size");
        }
        float even = toEven(f);
        float even2 = toEven(f2);
        if (even > even2) {
            if (!this.printedShadowClipWarning) {
                this.printedShadowClipWarning = true;
            }
            even = even2;
        }
        if (this.rawShadowSize == even && this.rawMaxShadowSize == even2) {
            return;
        }
        this.rawShadowSize = even;
        this.rawMaxShadowSize = even2;
        this.shadowSize = java.lang.Math.round(even * SHADOW_MULTIPLIER);
        this.maxShadowSize = even2;
        this.dirty = true;
        invalidateSelf();
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.rawMaxShadowSize);
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    public boolean getPadding(android.graphics.Rect rect) {
        int iCeil = (int) java.lang.Math.ceil(calculateVerticalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        int iCeil2 = (int) java.lang.Math.ceil(calculateHorizontalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * SHADOW_MULTIPLIER)) + ((1.0d - COS_45) * ((double) f2))) : f * SHADOW_MULTIPLIER;
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - COS_45) * ((double) f2))) : f;
    }

    public void setCornerRadius(float f) {
        float fRound = java.lang.Math.round(f);
        if (this.cornerRadius == fRound) {
            return;
        }
        this.cornerRadius = fRound;
        this.dirty = true;
        invalidateSelf();
    }

    public void draw(android.graphics.Canvas canvas) {
        if (this.dirty) {
            buildComponents(getBounds());
            this.dirty = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public final void setRotation(float f) {
        if (this.rotation != f) {
            this.rotation = f;
            invalidateSelf();
        }
    }

    private void drawShadow(android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(this.rotation, this.contentBounds.centerX(), this.contentBounds.centerY());
        float f = this.cornerRadius;
        float f2 = (-f) - this.shadowSize;
        float f3 = f * 2.0f;
        boolean z = this.contentBounds.width() - f3 > 0.0f;
        boolean z2 = this.contentBounds.height() - f3 > 0.0f;
        float f4 = this.rawShadowSize;
        float f5 = f / ((f4 - (0.5f * f4)) + f);
        float f6 = f / ((f4 - (SHADOW_TOP_SCALE * f4)) + f);
        float f7 = f / ((f4 - (f4 * 1.0f)) + f);
        int iSave2 = canvas.save();
        canvas.translate(this.contentBounds.left + f, this.contentBounds.top + f);
        canvas.scale(f5, f6);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z) {
            canvas.scale(1.0f / f5, 1.0f);
            canvas.drawRect(0.0f, f2, this.contentBounds.width() - f3, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        canvas.translate(this.contentBounds.right - f, this.contentBounds.bottom - f);
        canvas.scale(f5, f7);
        canvas.rotate(180.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z) {
            canvas.scale(1.0f / f5, 1.0f);
            canvas.drawRect(0.0f, f2, this.contentBounds.width() - f3, (-this.cornerRadius) + this.shadowSize, this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        canvas.translate(this.contentBounds.left + f, this.contentBounds.bottom - f);
        canvas.scale(f5, r6);
        canvas.rotate(270.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z2) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f2, this.contentBounds.height() - f3, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave4);
        int iSave5 = canvas.save();
        canvas.translate(this.contentBounds.right - f, this.contentBounds.top + f);
        canvas.scale(f5, f6);
        canvas.rotate(90.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z2) {
            canvas.scale(1.0f / f6, 1.0f);
            canvas.drawRect(0.0f, f2, this.contentBounds.height() - f3, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave5);
        canvas.restoreToCount(iSave);
    }

    private void buildShadowCorners() {
        float f = this.cornerRadius;
        android.graphics.RectF rectF = new android.graphics.RectF(-f, -f, f, f);
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        float f2 = this.shadowSize;
        rectF2.inset(-f2, -f2);
        android.graphics.Path path = this.cornerShadowPath;
        if (path == null) {
            this.cornerShadowPath = new android.graphics.Path();
        } else {
            path.reset();
        }
        this.cornerShadowPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        this.cornerShadowPath.moveTo(-this.cornerRadius, 0.0f);
        this.cornerShadowPath.rLineTo(-this.shadowSize, 0.0f);
        this.cornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.cornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.cornerShadowPath.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.cornerRadius / f3;
            this.cornerShadowPaint.setShader(new android.graphics.RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        }
        this.edgeShadowPaint.setShader(new android.graphics.LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        this.edgeShadowPaint.setAntiAlias(false);
    }

    private void buildComponents(android.graphics.Rect rect) {
        float f = this.rawMaxShadowSize * SHADOW_MULTIPLIER;
        this.contentBounds.set(rect.left + this.rawMaxShadowSize, rect.top + f, rect.right - this.rawMaxShadowSize, rect.bottom - f);
        getWrappedDrawable().setBounds((int) this.contentBounds.left, (int) this.contentBounds.top, (int) this.contentBounds.right, (int) this.contentBounds.bottom);
        buildShadowCorners();
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void setMaxShadowSize(float f) {
        setShadowSize(this.rawShadowSize, f);
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getMinWidth() {
        float f = this.rawMaxShadowSize;
        return (java.lang.Math.max(f, this.cornerRadius + (f / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * 2.0f);
    }

    public float getMinHeight() {
        float f = this.rawMaxShadowSize;
        return (java.lang.Math.max(f, this.cornerRadius + ((f * SHADOW_MULTIPLIER) / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * SHADOW_MULTIPLIER * 2.0f);
    }
}
