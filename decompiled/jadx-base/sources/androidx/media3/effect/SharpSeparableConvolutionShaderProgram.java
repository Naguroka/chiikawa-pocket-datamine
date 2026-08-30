package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class SharpSeparableConvolutionShaderProgram extends androidx.media3.effect.SeparableConvolutionShaderProgram {
    private final androidx.media3.common.util.GlProgram sharpTransformGlProgram;
    private final float[] sharpTransformMatrixValues;

    public SharpSeparableConvolutionShaderProgram(android.content.Context context, boolean z, androidx.media3.effect.SeparableConvolution separableConvolution, float f, float f2) throws androidx.media3.common.VideoFrameProcessingException {
        super(context, z, separableConvolution, 1.0f / f, 1.0f / f2);
        try {
            this.sharpTransformGlProgram = new androidx.media3.common.util.GlProgram(context, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_copy_es2.glsl");
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(f, f2);
            this.sharpTransformMatrixValues = androidx.media3.effect.MatrixUtils.getGlMatrixArray(matrix);
        } catch (androidx.media3.common.util.GlUtil.GlException | java.io.IOException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.effect.SeparableConvolutionShaderProgram
    protected void onBlurRendered(androidx.media3.common.GlTextureInfo glTextureInfo) throws androidx.media3.common.util.GlUtil.GlException {
        float[] fArrCreate4x4IdentityMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
        this.sharpTransformGlProgram.use();
        this.sharpTransformGlProgram.setSamplerTexIdUniform("uTexSampler", glTextureInfo.texId, 0);
        this.sharpTransformGlProgram.setFloatsUniform("uTexTransformationMatrix", fArrCreate4x4IdentityMatrix);
        this.sharpTransformGlProgram.setFloatsUniform("uTransformationMatrix", this.sharpTransformMatrixValues);
        this.sharpTransformGlProgram.setBufferAttribute("aFramePosition", androidx.media3.common.util.GlUtil.getNormalizedCoordinateBounds(), 4);
        this.sharpTransformGlProgram.bindAttributesAndUniforms();
    }

    @Override // androidx.media3.effect.SeparableConvolutionShaderProgram, androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        super.release();
        try {
            this.sharpTransformGlProgram.delete();
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }
}
