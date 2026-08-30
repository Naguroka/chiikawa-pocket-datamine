package com.google.android.material.shape;

/* JADX INFO: loaded from: classes5.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;

    @java.lang.Deprecated
    public float currentShadowAngle;

    @java.lang.Deprecated
    public float endShadowAngle;

    @java.lang.Deprecated
    public float endX;

    @java.lang.Deprecated
    public float endY;
    private final java.util.List<com.google.android.material.shape.ShapePath.PathOperation> operations = new java.util.ArrayList();
    private final java.util.List<com.google.android.material.shape.ShapePath.ShadowCompatOperation> shadowCompatOperations = new java.util.ArrayList();

    @java.lang.Deprecated
    public float startX;

    @java.lang.Deprecated
    public float startY;

    public static abstract class PathOperation {
        protected final android.graphics.Matrix matrix = new android.graphics.Matrix();

        public abstract void applyToPath(android.graphics.Matrix matrix, android.graphics.Path path);
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    public ShapePath(float f, float f2) {
        reset(f, f2);
    }

    public void reset(float f, float f2) {
        reset(f, f2, ANGLE_UP, 0.0f);
    }

    public void reset(float f, float f2, float f3, float f4) {
        setStartX(f);
        setStartY(f2);
        setEndX(f);
        setEndY(f2);
        setCurrentShadowAngle(f3);
        setEndShadowAngle((f3 + f4) % 360.0f);
        this.operations.clear();
        this.shadowCompatOperations.clear();
        this.containsIncompatibleShadowOp = false;
    }

    public void lineTo(float f, float f2) {
        com.google.android.material.shape.ShapePath.PathLineOperation pathLineOperation = new com.google.android.material.shape.ShapePath.PathLineOperation();
        pathLineOperation.x = f;
        pathLineOperation.y = f2;
        this.operations.add(pathLineOperation);
        com.google.android.material.shape.ShapePath.LineShadowOperation lineShadowOperation = new com.google.android.material.shape.ShapePath.LineShadowOperation(pathLineOperation, getEndX(), getEndY());
        addShadowCompatOperation(lineShadowOperation, lineShadowOperation.getAngle() + ANGLE_UP, lineShadowOperation.getAngle() + ANGLE_UP);
        setEndX(f);
        setEndY(f2);
    }

    public void lineTo(float f, float f2, float f3, float f4) {
        if ((java.lang.Math.abs(f - getEndX()) < 0.001f && java.lang.Math.abs(f2 - getEndY()) < 0.001f) || (java.lang.Math.abs(f - f3) < 0.001f && java.lang.Math.abs(f2 - f4) < 0.001f)) {
            lineTo(f3, f4);
            return;
        }
        com.google.android.material.shape.ShapePath.PathLineOperation pathLineOperation = new com.google.android.material.shape.ShapePath.PathLineOperation();
        pathLineOperation.x = f;
        pathLineOperation.y = f2;
        this.operations.add(pathLineOperation);
        com.google.android.material.shape.ShapePath.PathLineOperation pathLineOperation2 = new com.google.android.material.shape.ShapePath.PathLineOperation();
        pathLineOperation2.x = f3;
        pathLineOperation2.y = f4;
        this.operations.add(pathLineOperation2);
        com.google.android.material.shape.ShapePath.InnerCornerShadowOperation innerCornerShadowOperation = new com.google.android.material.shape.ShapePath.InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, getEndX(), getEndY());
        if (innerCornerShadowOperation.getSweepAngle() > 0.0f) {
            lineTo(f, f2);
            lineTo(f3, f4);
        } else {
            addShadowCompatOperation(innerCornerShadowOperation, innerCornerShadowOperation.getStartAngle() + ANGLE_UP, innerCornerShadowOperation.getEndAngle() + ANGLE_UP);
            setEndX(f3);
            setEndY(f4);
        }
    }

    public void quadToPoint(float f, float f2, float f3, float f4) {
        com.google.android.material.shape.ShapePath.PathQuadOperation pathQuadOperation = new com.google.android.material.shape.ShapePath.PathQuadOperation();
        pathQuadOperation.setControlX(f);
        pathQuadOperation.setControlY(f2);
        pathQuadOperation.setEndX(f3);
        pathQuadOperation.setEndY(f4);
        this.operations.add(pathQuadOperation);
        this.containsIncompatibleShadowOp = true;
        setEndX(f3);
        setEndY(f4);
    }

    public void cubicToPoint(float f, float f2, float f3, float f4, float f5, float f6) {
        this.operations.add(new com.google.android.material.shape.ShapePath.PathCubicOperation(f, f2, f3, f4, f5, f6));
        this.containsIncompatibleShadowOp = true;
        setEndX(f5);
        setEndY(f6);
    }

    public void addArc(float f, float f2, float f3, float f4, float f5, float f6) {
        com.google.android.material.shape.ShapePath.PathArcOperation pathArcOperation = new com.google.android.material.shape.ShapePath.PathArcOperation(f, f2, f3, f4);
        pathArcOperation.setStartAngle(f5);
        pathArcOperation.setSweepAngle(f6);
        this.operations.add(pathArcOperation);
        com.google.android.material.shape.ShapePath.ArcShadowOperation arcShadowOperation = new com.google.android.material.shape.ShapePath.ArcShadowOperation(pathArcOperation);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + ANGLE_LEFT) % 360.0f;
        }
        addShadowCompatOperation(arcShadowOperation, f5, z ? (ANGLE_LEFT + f7) % 360.0f : f7);
        double d = f7;
        setEndX(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) java.lang.Math.cos(java.lang.Math.toRadians(d)))));
        setEndY(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) java.lang.Math.sin(java.lang.Math.toRadians(d)))));
    }

    public void applyToPath(android.graphics.Matrix matrix, android.graphics.Path path) {
        int size = this.operations.size();
        for (int i = 0; i < size; i++) {
            this.operations.get(i).applyToPath(matrix, path);
        }
    }

    com.google.android.material.shape.ShapePath.ShadowCompatOperation createShadowCompatOperation(android.graphics.Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        final android.graphics.Matrix matrix2 = new android.graphics.Matrix(matrix);
        final java.util.ArrayList arrayList = new java.util.ArrayList(this.shadowCompatOperations);
        return new com.google.android.material.shape.ShapePath.ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
            @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
            public void draw(android.graphics.Matrix matrix3, com.google.android.material.shadow.ShadowRenderer shadowRenderer, int i, android.graphics.Canvas canvas) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.shape.ShapePath.ShadowCompatOperation) it.next()).draw(matrix2, shadowRenderer, i, canvas);
                }
            }
        };
    }

    private void addShadowCompatOperation(com.google.android.material.shape.ShapePath.ShadowCompatOperation shadowCompatOperation, float f, float f2) {
        addConnectingShadowIfNecessary(f);
        this.shadowCompatOperations.add(shadowCompatOperation);
        setCurrentShadowAngle(f2);
    }

    boolean containsIncompatibleShadowOp() {
        return this.containsIncompatibleShadowOp;
    }

    private void addConnectingShadowIfNecessary(float f) {
        if (getCurrentShadowAngle() == f) {
            return;
        }
        float currentShadowAngle = ((f - getCurrentShadowAngle()) + 360.0f) % 360.0f;
        if (currentShadowAngle > ANGLE_LEFT) {
            return;
        }
        com.google.android.material.shape.ShapePath.PathArcOperation pathArcOperation = new com.google.android.material.shape.ShapePath.PathArcOperation(getEndX(), getEndY(), getEndX(), getEndY());
        pathArcOperation.setStartAngle(getCurrentShadowAngle());
        pathArcOperation.setSweepAngle(currentShadowAngle);
        this.shadowCompatOperations.add(new com.google.android.material.shape.ShapePath.ArcShadowOperation(pathArcOperation));
        setCurrentShadowAngle(f);
    }

    float getStartX() {
        return this.startX;
    }

    float getStartY() {
        return this.startY;
    }

    float getEndX() {
        return this.endX;
    }

    float getEndY() {
        return this.endY;
    }

    private float getCurrentShadowAngle() {
        return this.currentShadowAngle;
    }

    private float getEndShadowAngle() {
        return this.endShadowAngle;
    }

    private void setStartX(float f) {
        this.startX = f;
    }

    private void setStartY(float f) {
        this.startY = f;
    }

    private void setEndX(float f) {
        this.endX = f;
    }

    private void setEndY(float f) {
        this.endY = f;
    }

    private void setCurrentShadowAngle(float f) {
        this.currentShadowAngle = f;
    }

    private void setEndShadowAngle(float f) {
        this.endShadowAngle = f;
    }

    static abstract class ShadowCompatOperation {
        static final android.graphics.Matrix IDENTITY_MATRIX = new android.graphics.Matrix();
        final android.graphics.Matrix renderMatrix = new android.graphics.Matrix();

        public abstract void draw(android.graphics.Matrix matrix, com.google.android.material.shadow.ShadowRenderer shadowRenderer, int i, android.graphics.Canvas canvas);

        ShadowCompatOperation() {
        }

        public final void draw(com.google.android.material.shadow.ShadowRenderer shadowRenderer, int i, android.graphics.Canvas canvas) {
            draw(IDENTITY_MATRIX, shadowRenderer, i, canvas);
        }
    }

    static class LineShadowOperation extends com.google.android.material.shape.ShapePath.ShadowCompatOperation {
        private final com.google.android.material.shape.ShapePath.PathLineOperation operation;
        private final float startX;
        private final float startY;

        public LineShadowOperation(com.google.android.material.shape.ShapePath.PathLineOperation pathLineOperation, float f, float f2) {
            this.operation = pathLineOperation;
            this.startX = f;
            this.startY = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(android.graphics.Matrix matrix, com.google.android.material.shadow.ShadowRenderer shadowRenderer, int i, android.graphics.Canvas canvas) {
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, (float) java.lang.Math.hypot(this.operation.y - this.startY, this.operation.x - this.startX), 0.0f);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.startX, this.startY);
            this.renderMatrix.preRotate(getAngle());
            shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i);
        }

        float getAngle() {
            return (float) java.lang.Math.toDegrees(java.lang.Math.atan((this.operation.y - this.startY) / (this.operation.x - this.startX)));
        }
    }

    static class InnerCornerShadowOperation extends com.google.android.material.shape.ShapePath.ShadowCompatOperation {
        private final com.google.android.material.shape.ShapePath.PathLineOperation operation1;
        private final com.google.android.material.shape.ShapePath.PathLineOperation operation2;
        private final float startX;
        private final float startY;

        public InnerCornerShadowOperation(com.google.android.material.shape.ShapePath.PathLineOperation pathLineOperation, com.google.android.material.shape.ShapePath.PathLineOperation pathLineOperation2, float f, float f2) {
            this.operation1 = pathLineOperation;
            this.operation2 = pathLineOperation2;
            this.startX = f;
            this.startY = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(android.graphics.Matrix matrix, com.google.android.material.shadow.ShadowRenderer shadowRenderer, int i, android.graphics.Canvas canvas) {
            com.google.android.material.shadow.ShadowRenderer shadowRenderer2;
            float sweepAngle = getSweepAngle();
            if (sweepAngle > 0.0f) {
                return;
            }
            double dHypot = java.lang.Math.hypot(this.operation1.x - this.startX, this.operation1.y - this.startY);
            double dHypot2 = java.lang.Math.hypot(this.operation2.x - this.operation1.x, this.operation2.y - this.operation1.y);
            float fMin = (float) java.lang.Math.min(i, java.lang.Math.min(dHypot, dHypot2));
            double d = fMin;
            double dTan = java.lang.Math.tan(java.lang.Math.toRadians((-sweepAngle) / 2.0f)) * d;
            if (dHypot > dTan) {
                android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.startX, this.startY);
                this.renderMatrix.preRotate(getStartAngle());
                shadowRenderer2 = shadowRenderer;
                shadowRenderer2.drawEdgeShadow(canvas, this.renderMatrix, rectF, i);
            } else {
                shadowRenderer2 = shadowRenderer;
            }
            float f = 2.0f * fMin;
            android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, 0.0f, f, f);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.operation1.x, this.operation1.y);
            this.renderMatrix.preRotate(getStartAngle());
            this.renderMatrix.preTranslate((float) ((-dTan) - d), (-2.0f) * fMin);
            shadowRenderer.drawInnerCornerShadow(canvas, this.renderMatrix, rectF2, (int) fMin, 450.0f, sweepAngle, new float[]{(float) (d + dTan), f});
            if (dHypot2 > dTan) {
                android.graphics.RectF rectF3 = new android.graphics.RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.operation1.x, this.operation1.y);
                this.renderMatrix.preRotate(getEndAngle());
                this.renderMatrix.preTranslate((float) dTan, 0.0f);
                shadowRenderer2.drawEdgeShadow(canvas, this.renderMatrix, rectF3, i);
            }
        }

        float getStartAngle() {
            return (float) java.lang.Math.toDegrees(java.lang.Math.atan((this.operation1.y - this.startY) / (this.operation1.x - this.startX)));
        }

        float getEndAngle() {
            return (float) java.lang.Math.toDegrees(java.lang.Math.atan((this.operation2.y - this.operation1.y) / (this.operation2.x - this.operation1.x)));
        }

        float getSweepAngle() {
            float endAngle = ((getEndAngle() - getStartAngle()) + 360.0f) % 360.0f;
            return endAngle <= com.google.android.material.shape.ShapePath.ANGLE_LEFT ? endAngle : endAngle - 360.0f;
        }
    }

    static class ArcShadowOperation extends com.google.android.material.shape.ShapePath.ShadowCompatOperation {
        private final com.google.android.material.shape.ShapePath.PathArcOperation operation;

        public ArcShadowOperation(com.google.android.material.shape.ShapePath.PathArcOperation pathArcOperation) {
            this.operation = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(android.graphics.Matrix matrix, com.google.android.material.shadow.ShadowRenderer shadowRenderer, int i, android.graphics.Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new android.graphics.RectF(this.operation.getLeft(), this.operation.getTop(), this.operation.getRight(), this.operation.getBottom()), i, this.operation.getStartAngle(), this.operation.getSweepAngle());
        }
    }

    public static class PathLineOperation extends com.google.android.material.shape.ShapePath.PathOperation {
        private float x;
        private float y;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(android.graphics.Matrix matrix, android.graphics.Path path) {
            android.graphics.Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.x, this.y);
            path.transform(matrix);
        }
    }

    public static class PathQuadOperation extends com.google.android.material.shape.ShapePath.PathOperation {

        @java.lang.Deprecated
        public float controlX;

        @java.lang.Deprecated
        public float controlY;

        @java.lang.Deprecated
        public float endX;

        @java.lang.Deprecated
        public float endY;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(android.graphics.Matrix matrix, android.graphics.Path path) {
            android.graphics.Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }

        private float getEndX() {
            return this.endX;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f) {
            this.endX = f;
        }

        private float getControlY() {
            return this.controlY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f) {
            this.controlY = f;
        }

        private float getEndY() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f) {
            this.endY = f;
        }

        private float getControlX() {
            return this.controlX;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f) {
            this.controlX = f;
        }
    }

    public static class PathArcOperation extends com.google.android.material.shape.ShapePath.PathOperation {
        private static final android.graphics.RectF rectF = new android.graphics.RectF();

        @java.lang.Deprecated
        public float bottom;

        @java.lang.Deprecated
        public float left;

        @java.lang.Deprecated
        public float right;

        @java.lang.Deprecated
        public float startAngle;

        @java.lang.Deprecated
        public float sweepAngle;

        @java.lang.Deprecated
        public float top;

        public PathArcOperation(float f, float f2, float f3, float f4) {
            setLeft(f);
            setTop(f2);
            setRight(f3);
            setBottom(f4);
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(android.graphics.Matrix matrix, android.graphics.Path path) {
            android.graphics.Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            android.graphics.RectF rectF2 = rectF;
            rectF2.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF2, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.top;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.bottom;
        }

        private void setLeft(float f) {
            this.left = f;
        }

        private void setTop(float f) {
            this.top = f;
        }

        private void setRight(float f) {
            this.right = f;
        }

        private void setBottom(float f) {
            this.bottom = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f) {
            this.startAngle = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f) {
            this.sweepAngle = f;
        }
    }

    public static class PathCubicOperation extends com.google.android.material.shape.ShapePath.PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float f, float f2, float f3, float f4, float f5, float f6) {
            setControlX1(f);
            setControlY1(f2);
            setControlX2(f3);
            setControlY2(f4);
            setEndX(f5);
            setEndY(f6);
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(android.graphics.Matrix matrix, android.graphics.Path path) {
            android.graphics.Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.controlX1, this.controlY1, this.controlX2, this.controlY2, this.endX, this.endY);
            path.transform(matrix);
        }

        private float getControlX1() {
            return this.controlX1;
        }

        private void setControlX1(float f) {
            this.controlX1 = f;
        }

        private float getControlY1() {
            return this.controlY1;
        }

        private void setControlY1(float f) {
            this.controlY1 = f;
        }

        private float getControlX2() {
            return this.controlX2;
        }

        private void setControlX2(float f) {
            this.controlX2 = f;
        }

        private float getControlY2() {
            return this.controlY1;
        }

        private void setControlY2(float f) {
            this.controlY2 = f;
        }

        private float getEndX() {
            return this.endX;
        }

        private void setEndX(float f) {
            this.endX = f;
        }

        private float getEndY() {
            return this.endY;
        }

        private void setEndY(float f) {
            this.endY = f;
        }
    }
}
