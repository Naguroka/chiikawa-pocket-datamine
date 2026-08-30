package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class ThumbnailStripShaderProgram extends androidx.media3.effect.BaseGlShaderProgram {
    private static final java.lang.String FRAGMENT_SHADER_PATH = "shaders/fragment_shader_copy_es2.glsl";
    private static final java.lang.String VERTEX_SHADER_PATH = "shaders/vertex_shader_thumbnail_strip_es2.glsl";
    private boolean clearedGlBuffer;
    private final androidx.media3.common.util.GlProgram glProgram;
    private final androidx.media3.effect.ThumbnailStripEffect thumbnailStripEffect;

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public boolean shouldClearTextureBuffer() {
        return false;
    }

    public ThumbnailStripShaderProgram(android.content.Context context, boolean z, androidx.media3.effect.ThumbnailStripEffect thumbnailStripEffect) throws androidx.media3.common.VideoFrameProcessingException {
        super(z, 1);
        this.thumbnailStripEffect = thumbnailStripEffect;
        try {
            androidx.media3.common.util.GlProgram glProgram = new androidx.media3.common.util.GlProgram(context, VERTEX_SHADER_PATH, FRAGMENT_SHADER_PATH);
            this.glProgram = glProgram;
            glProgram.setBufferAttribute("aFramePosition", androidx.media3.common.util.GlUtil.getNormalizedCoordinateBounds(), 4);
        } catch (androidx.media3.common.util.GlUtil.GlException | java.io.IOException e) {
            throw androidx.media3.common.VideoFrameProcessingException.from(e);
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public androidx.media3.common.util.Size configure(int i, int i2) {
        return new androidx.media3.common.util.Size(this.thumbnailStripEffect.stripWidth, this.thumbnailStripEffect.stripHeight);
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public void drawFrame(int i, long j) throws androidx.media3.common.VideoFrameProcessingException {
        if (!this.clearedGlBuffer) {
            try {
                androidx.media3.common.util.GlUtil.clearFocusedBuffers();
                this.clearedGlBuffer = true;
            } catch (androidx.media3.common.util.GlUtil.GlException e) {
                throw new androidx.media3.common.VideoFrameProcessingException(e, j);
            }
        }
        long jMsToUs = androidx.media3.common.util.Util.msToUs(this.thumbnailStripEffect.getNextTimestampMs());
        if (this.thumbnailStripEffect.isDone() || j < jMsToUs) {
            return;
        }
        try {
            this.glProgram.use();
            this.glProgram.setSamplerTexIdUniform("uTexSampler", i, 0);
            this.glProgram.setIntUniform("uIndex", this.thumbnailStripEffect.getNextThumbnailIndex());
            this.glProgram.setIntUniform("uCount", this.thumbnailStripEffect.getNumberOfThumbnails());
            this.glProgram.bindAttributesAndUniforms();
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            this.thumbnailStripEffect.onThumbnailDrawn();
        } catch (androidx.media3.common.util.GlUtil.GlException e2) {
            throw new androidx.media3.common.VideoFrameProcessingException(e2, j);
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram, androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        super.release();
        try {
            this.glProgram.delete();
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }
}
