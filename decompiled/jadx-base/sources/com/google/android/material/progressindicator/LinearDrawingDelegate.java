package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
final class LinearDrawingDelegate extends com.google.android.material.progressindicator.DrawingDelegate<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float trackLength;

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    public LinearDrawingDelegate(com.google.android.material.progressindicator.LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(android.graphics.Canvas canvas, android.graphics.Rect rect, float f) {
        this.trackLength = rect.width();
        float f2 = ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + java.lang.Math.max(0.0f, (rect.height() - ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f));
        if (((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.drawable.isShowing() && ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (this.drawable.isHiding() && ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.drawable.isShowing() || this.drawable.isHiding()) {
            canvas.translate(0.0f, (((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).trackThickness * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.trackLength;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        this.displayedTrackThickness = ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).trackThickness * f;
        this.displayedCornerRadius = ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).trackCornerRadius * f;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.trackLength;
        float f4 = this.displayedCornerRadius;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f5 = this.displayedTrackThickness;
        android.graphics.RectF rectF = new android.graphics.RectF(((-f3) / 2.0f) + (f * (f3 - (f4 * 2.0f))), (-f5) / 2.0f, ((-f3) / 2.0f) + (f2 * (f3 - (f4 * 2.0f))) + (f4 * 2.0f), f5 / 2.0f);
        float f6 = this.displayedCornerRadius;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        int iCompositeARGBWithAlpha = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).trackColor, this.drawable.getAlpha());
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iCompositeARGBWithAlpha);
        float f = this.trackLength;
        float f2 = this.displayedTrackThickness;
        android.graphics.RectF rectF = new android.graphics.RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.displayedCornerRadius;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }
}
