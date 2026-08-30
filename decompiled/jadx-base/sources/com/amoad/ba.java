package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class ba extends android.view.animation.Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f267a = 0.0f;
    private final float b = 360.0f;
    private final float c;
    private final float d;
    private android.graphics.Camera e;

    ba(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        float f2 = this.f267a;
        float f3 = f2 + ((this.b - f2) * f);
        float f4 = this.c;
        float f5 = this.d;
        android.graphics.Camera camera = this.e;
        android.graphics.Matrix matrix = transformation.getMatrix();
        camera.save();
        float f6 = -f5;
        camera.translate(0.0f, 0.0f, (f3 < 180.0f ? f3 / 360.0f : (360.0f - f3) / 360.0f) * 2.3f * java.lang.Math.max(f4, f6));
        camera.rotateY(f3);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-f4, f6);
        matrix.postTranslate(f4, f5);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.e = new android.graphics.Camera();
    }
}
