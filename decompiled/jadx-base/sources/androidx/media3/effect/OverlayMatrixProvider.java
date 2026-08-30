package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
class OverlayMatrixProvider {
    protected static final int MATRIX_OFFSET = 0;
    private androidx.media3.common.util.Size backgroundSize;
    private final float[] aspectRatioMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
    private final float[] backgroundFrameAnchorMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
    private final float[] overlayFrameAnchorMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
    private final float[] rotateMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
    private final float[] scaleMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
    private final float[] scaleMatrixInv = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
    private final float[] overlayAspectRatioMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
    private final float[] overlayAspectRatioMatrixInv = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
    private final float[] transformationMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();

    public void configure(androidx.media3.common.util.Size size) {
        this.backgroundSize = size;
    }

    public float[] getTransformationMatrix(androidx.media3.common.util.Size size, androidx.media3.effect.OverlaySettings overlaySettings) {
        reset();
        android.util.Pair<java.lang.Float, java.lang.Float> pair = overlaySettings.backgroundFrameAnchor;
        android.opengl.Matrix.translateM(this.backgroundFrameAnchorMatrix, 0, ((java.lang.Float) pair.first).floatValue(), ((java.lang.Float) pair.second).floatValue(), 0.0f);
        androidx.media3.common.util.Assertions.checkStateNotNull(this.backgroundSize);
        android.opengl.Matrix.scaleM(this.aspectRatioMatrix, 0, size.getWidth() / this.backgroundSize.getWidth(), size.getHeight() / this.backgroundSize.getHeight(), 1.0f);
        android.util.Pair<java.lang.Float, java.lang.Float> pair2 = overlaySettings.scale;
        android.opengl.Matrix.scaleM(this.scaleMatrix, 0, ((java.lang.Float) pair2.first).floatValue(), ((java.lang.Float) pair2.second).floatValue(), 1.0f);
        android.opengl.Matrix.invertM(this.scaleMatrixInv, 0, this.scaleMatrix, 0);
        android.util.Pair<java.lang.Float, java.lang.Float> pair3 = overlaySettings.overlayFrameAnchor;
        android.opengl.Matrix.translateM(this.overlayFrameAnchorMatrix, 0, ((java.lang.Float) pair3.first).floatValue() * (-1.0f), ((java.lang.Float) pair3.second).floatValue() * (-1.0f), 0.0f);
        android.opengl.Matrix.rotateM(this.rotateMatrix, 0, overlaySettings.rotationDegrees, 0.0f, 0.0f, 1.0f);
        android.opengl.Matrix.scaleM(this.overlayAspectRatioMatrix, 0, size.getHeight() / size.getWidth(), 1.0f, 1.0f);
        android.opengl.Matrix.invertM(this.overlayAspectRatioMatrixInv, 0, this.overlayAspectRatioMatrix, 0);
        float[] fArr = this.transformationMatrix;
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr, 0, this.backgroundFrameAnchorMatrix, 0);
        float[] fArr2 = this.transformationMatrix;
        android.opengl.Matrix.multiplyMM(fArr2, 0, fArr2, 0, this.aspectRatioMatrix, 0);
        float[] fArr3 = this.transformationMatrix;
        android.opengl.Matrix.multiplyMM(fArr3, 0, fArr3, 0, this.scaleMatrix, 0);
        float[] fArr4 = this.transformationMatrix;
        android.opengl.Matrix.multiplyMM(fArr4, 0, fArr4, 0, this.overlayFrameAnchorMatrix, 0);
        float[] fArr5 = this.transformationMatrix;
        android.opengl.Matrix.multiplyMM(fArr5, 0, fArr5, 0, this.scaleMatrixInv, 0);
        float[] fArr6 = this.transformationMatrix;
        android.opengl.Matrix.multiplyMM(fArr6, 0, fArr6, 0, this.overlayAspectRatioMatrix, 0);
        float[] fArr7 = this.transformationMatrix;
        android.opengl.Matrix.multiplyMM(fArr7, 0, fArr7, 0, this.rotateMatrix, 0);
        float[] fArr8 = this.transformationMatrix;
        android.opengl.Matrix.multiplyMM(fArr8, 0, fArr8, 0, this.overlayAspectRatioMatrixInv, 0);
        float[] fArr9 = this.transformationMatrix;
        android.opengl.Matrix.multiplyMM(fArr9, 0, fArr9, 0, this.scaleMatrix, 0);
        return this.transformationMatrix;
    }

    private void reset() {
        androidx.media3.common.util.GlUtil.setToIdentity(this.aspectRatioMatrix);
        androidx.media3.common.util.GlUtil.setToIdentity(this.backgroundFrameAnchorMatrix);
        androidx.media3.common.util.GlUtil.setToIdentity(this.overlayFrameAnchorMatrix);
        androidx.media3.common.util.GlUtil.setToIdentity(this.scaleMatrix);
        androidx.media3.common.util.GlUtil.setToIdentity(this.scaleMatrixInv);
        androidx.media3.common.util.GlUtil.setToIdentity(this.rotateMatrix);
        androidx.media3.common.util.GlUtil.setToIdentity(this.overlayAspectRatioMatrix);
        androidx.media3.common.util.GlUtil.setToIdentity(this.overlayAspectRatioMatrixInv);
        androidx.media3.common.util.GlUtil.setToIdentity(this.transformationMatrix);
    }
}
