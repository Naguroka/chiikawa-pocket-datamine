package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
class FrameCacheGlShaderProgram extends androidx.media3.effect.BaseGlShaderProgram {
    private static final java.lang.String FRAGMENT_SHADER_TRANSFORMATION_ES2_PATH = "shaders/fragment_shader_transformation_es2.glsl";
    private static final java.lang.String VERTEX_SHADER_TRANSFORMATION_ES2_PATH = "shaders/vertex_shader_transformation_es2.glsl";
    private final androidx.media3.common.util.GlProgram copyProgram;

    public FrameCacheGlShaderProgram(android.content.Context context, int i, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        super(z, i);
        try {
            androidx.media3.common.util.GlProgram glProgram = new androidx.media3.common.util.GlProgram(context, VERTEX_SHADER_TRANSFORMATION_ES2_PATH, FRAGMENT_SHADER_TRANSFORMATION_ES2_PATH);
            this.copyProgram = glProgram;
            float[] fArrCreate4x4IdentityMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
            glProgram.setFloatsUniform("uTexTransformationMatrix", fArrCreate4x4IdentityMatrix);
            glProgram.setFloatsUniform("uTransformationMatrix", fArrCreate4x4IdentityMatrix);
            glProgram.setFloatsUniform("uRgbMatrix", fArrCreate4x4IdentityMatrix);
            glProgram.setBufferAttribute("aFramePosition", androidx.media3.common.util.GlUtil.getNormalizedCoordinateBounds(), 4);
        } catch (androidx.media3.common.util.GlUtil.GlException | java.io.IOException e) {
            throw androidx.media3.common.VideoFrameProcessingException.from(e);
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public androidx.media3.common.util.Size configure(int i, int i2) {
        return new androidx.media3.common.util.Size(i, i2);
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public void drawFrame(int i, long j) throws androidx.media3.common.VideoFrameProcessingException {
        try {
            this.copyProgram.use();
            this.copyProgram.setSamplerTexIdUniform("uTexSampler", i, 0);
            this.copyProgram.bindAttributesAndUniforms();
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw androidx.media3.common.VideoFrameProcessingException.from(e);
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram, androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        super.release();
        try {
            this.copyProgram.delete();
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }
}
