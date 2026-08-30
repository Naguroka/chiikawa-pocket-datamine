package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class AlphaScaleShaderProgram extends androidx.media3.effect.BaseGlShaderProgram {
    private static final java.lang.String FRAGMENT_SHADER_PATH = "shaders/fragment_shader_alpha_scale_es2.glsl";
    private static final java.lang.String VERTEX_SHADER_PATH = "shaders/vertex_shader_transformation_es2.glsl";
    private final androidx.media3.common.util.GlProgram glProgram;

    public AlphaScaleShaderProgram(android.content.Context context, boolean z, float f) throws androidx.media3.common.VideoFrameProcessingException {
        super(z, 1);
        try {
            androidx.media3.common.util.GlProgram glProgram = new androidx.media3.common.util.GlProgram(context, VERTEX_SHADER_PATH, FRAGMENT_SHADER_PATH);
            this.glProgram = glProgram;
            glProgram.setBufferAttribute("aFramePosition", androidx.media3.common.util.GlUtil.getNormalizedCoordinateBounds(), 4);
            float[] fArrCreate4x4IdentityMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
            glProgram.setFloatsUniform("uTransformationMatrix", fArrCreate4x4IdentityMatrix);
            glProgram.setFloatsUniform("uTexTransformationMatrix", fArrCreate4x4IdentityMatrix);
            glProgram.setFloatUniform("uAlphaScale", f);
        } catch (androidx.media3.common.util.GlUtil.GlException | java.io.IOException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public androidx.media3.common.util.Size configure(int i, int i2) {
        return new androidx.media3.common.util.Size(i, i2);
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public void drawFrame(int i, long j) throws androidx.media3.common.VideoFrameProcessingException {
        try {
            this.glProgram.use();
            this.glProgram.setSamplerTexIdUniform("uTexSampler", i, 0);
            this.glProgram.bindAttributesAndUniforms();
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e, j);
        }
    }
}
