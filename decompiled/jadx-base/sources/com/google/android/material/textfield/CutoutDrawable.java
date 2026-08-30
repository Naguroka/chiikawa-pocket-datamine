package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
class CutoutDrawable extends com.google.android.material.shape.MaterialShapeDrawable {
    private final android.graphics.RectF cutoutBounds;

    CutoutDrawable() {
        this(null);
    }

    CutoutDrawable(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        super(shapeAppearanceModel == null ? new com.google.android.material.shape.ShapeAppearanceModel() : shapeAppearanceModel);
        this.cutoutBounds = new android.graphics.RectF();
    }

    boolean hasCutout() {
        return !this.cutoutBounds.isEmpty();
    }

    void setCutout(float f, float f2, float f3, float f4) {
        if (f == this.cutoutBounds.left && f2 == this.cutoutBounds.top && f3 == this.cutoutBounds.right && f4 == this.cutoutBounds.bottom) {
            return;
        }
        this.cutoutBounds.set(f, f2, f3, f4);
        invalidateSelf();
    }

    void setCutout(android.graphics.RectF rectF) {
        setCutout(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    void removeCutout() {
        setCutout(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    protected void drawStrokeShape(android.graphics.Canvas canvas) {
        if (this.cutoutBounds.isEmpty()) {
            super.drawStrokeShape(canvas);
            return;
        }
        canvas.save();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.cutoutBounds);
        } else {
            canvas.clipRect(this.cutoutBounds, android.graphics.Region.Op.DIFFERENCE);
        }
        super.drawStrokeShape(canvas);
        canvas.restore();
    }
}
