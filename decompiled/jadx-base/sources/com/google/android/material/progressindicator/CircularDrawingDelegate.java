package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
final class CircularDrawingDelegate extends com.google.android.material.progressindicator.DrawingDelegate<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> {
    private float adjustedRadius;
    private int arcDirectionFactor;
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    public CircularDrawingDelegate(com.google.android.material.progressindicator.CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.arcDirectionFactor = 1;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(android.graphics.Canvas canvas, android.graphics.Rect rect, float f) {
        float fWidth = rect.width() / getPreferredWidth();
        float fHeight = rect.height() / getPreferredHeight();
        float f2 = (((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorSize / 2.0f) + ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorInset;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.arcDirectionFactor = ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorDirection == 0 ? 1 : -1;
        this.displayedTrackThickness = ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).trackThickness * f;
        this.displayedCornerRadius = ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).trackCornerRadius * f;
        this.adjustedRadius = (((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorSize - ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
        if ((this.drawable.isShowing() && ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (this.drawable.isHiding() && ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
            this.adjustedRadius += ((1.0f - f) * ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
        } else if ((this.drawable.isShowing() && ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (this.drawable.isHiding() && ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
            this.adjustedRadius -= ((1.0f - f) * ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillIndicator(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.displayedTrackThickness);
        int i2 = this.arcDirectionFactor;
        float f3 = f * 360.0f * i2;
        float f4 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * i2;
        float f5 = this.adjustedRadius;
        canvas.drawArc(new android.graphics.RectF(-f5, -f5, f5, f5), f3, f4, false, paint);
        if (this.displayedCornerRadius <= 0.0f || java.lang.Math.abs(f4) >= 360.0f) {
            return;
        }
        paint.setStyle(android.graphics.Paint.Style.FILL);
        drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f3);
        drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f3 + f4);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        int iCompositeARGBWithAlpha = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).trackColor, this.drawable.getAlpha());
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iCompositeARGBWithAlpha);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f = this.adjustedRadius;
        canvas.drawArc(new android.graphics.RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    private int getSize() {
        return ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorSize + (((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorInset * 2);
    }

    private void drawRoundedEnd(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.adjustedRadius;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new android.graphics.RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }
}
