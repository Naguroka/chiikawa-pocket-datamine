package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class SamplerOverlayMatrixProvider extends androidx.media3.effect.OverlayMatrixProvider {
    private final float[] transformationMatrixInv = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();

    @Override // androidx.media3.effect.OverlayMatrixProvider
    public float[] getTransformationMatrix(androidx.media3.common.util.Size size, androidx.media3.effect.OverlaySettings overlaySettings) {
        android.opengl.Matrix.invertM(this.transformationMatrixInv, 0, super.getTransformationMatrix(size, overlaySettings), 0);
        return this.transformationMatrixInv;
    }
}
