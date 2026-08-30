package com.google.android.material.transition;

/* JADX INFO: loaded from: classes5.dex */
class MaskEvaluator {
    private com.google.android.material.shape.ShapeAppearanceModel currentShapeAppearanceModel;
    private final android.graphics.Path path = new android.graphics.Path();
    private final android.graphics.Path startPath = new android.graphics.Path();
    private final android.graphics.Path endPath = new android.graphics.Path();
    private final com.google.android.material.shape.ShapeAppearancePathProvider pathProvider = com.google.android.material.shape.ShapeAppearancePathProvider.getInstance();

    MaskEvaluator() {
    }

    void evaluate(float f, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel2, android.graphics.RectF rectF, android.graphics.RectF rectF2, android.graphics.RectF rectF3, com.google.android.material.transition.MaterialContainerTransform.ProgressThresholds progressThresholds) {
        com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModelLerp = com.google.android.material.transition.TransitionUtils.lerp(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.getStart(), progressThresholds.getEnd(), f);
        this.currentShapeAppearanceModel = shapeAppearanceModelLerp;
        this.pathProvider.calculatePath(shapeAppearanceModelLerp, 1.0f, rectF2, this.startPath);
        this.pathProvider.calculatePath(this.currentShapeAppearanceModel, 1.0f, rectF3, this.endPath);
        this.path.op(this.startPath, this.endPath, android.graphics.Path.Op.UNION);
    }

    void clip(android.graphics.Canvas canvas) {
        canvas.clipPath(this.path);
    }

    android.graphics.Path getPath() {
        return this.path;
    }

    com.google.android.material.shape.ShapeAppearanceModel getCurrentShapeAppearanceModel() {
        return this.currentShapeAppearanceModel;
    }
}
