package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class ColorLutShaderProgram extends androidx.media3.effect.BaseGlShaderProgram {
    private static final java.lang.String FRAGMENT_SHADER_PATH = "shaders/fragment_shader_lut_es2.glsl";
    private static final java.lang.String VERTEX_SHADER_PATH = "shaders/vertex_shader_transformation_es2.glsl";
    private final androidx.media3.effect.ColorLut colorLut;
    private final androidx.media3.common.util.GlProgram glProgram;

    public ColorLutShaderProgram(android.content.Context context, androidx.media3.effect.ColorLut colorLut, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        super(z, 1);
        androidx.media3.common.util.Assertions.checkArgument(!z, "ColorLutShaderProgram does not support HDR colors.");
        this.colorLut = colorLut;
        try {
            androidx.media3.common.util.GlProgram glProgram = new androidx.media3.common.util.GlProgram(context, VERTEX_SHADER_PATH, FRAGMENT_SHADER_PATH);
            this.glProgram = glProgram;
            glProgram.setBufferAttribute("aFramePosition", androidx.media3.common.util.GlUtil.getNormalizedCoordinateBounds(), 4);
            float[] fArrCreate4x4IdentityMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
            glProgram.setFloatsUniform("uTransformationMatrix", fArrCreate4x4IdentityMatrix);
            glProgram.setFloatsUniform("uTexTransformationMatrix", fArrCreate4x4IdentityMatrix);
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
            this.glProgram.setSamplerTexIdUniform("uColorLut", this.colorLut.getLutTextureId(j), 1);
            this.glProgram.setFloatUniform("uColorLutLength", this.colorLut.getLength(j));
            this.glProgram.bindAttributesAndUniforms();
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram, androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        super.release();
        try {
            this.colorLut.release();
            this.glProgram.delete();
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }
}
