package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class DefaultFrameDroppingShaderProgram extends androidx.media3.effect.FrameCacheGlShaderProgram {
    private int framesReceived;
    private long lastQueuedPresentationTimeUs;
    private long previousPresentationTimeUs;
    private androidx.media3.common.GlTextureInfo previousTexture;
    private final long targetFrameDeltaUs;
    private final boolean useHdr;

    public DefaultFrameDroppingShaderProgram(android.content.Context context, boolean z, float f) throws androidx.media3.common.VideoFrameProcessingException {
        super(context, 1, z);
        this.useHdr = z;
        this.targetFrameDeltaUs = (long) (1000000.0f / f);
        this.lastQueuedPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.previousPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram, androidx.media3.effect.GlShaderProgram
    public void queueInputFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
        int i = this.framesReceived + 1;
        this.framesReceived = i;
        if (i == 1) {
            copyTextureToPreviousFrame(glObjectsProvider, glTextureInfo, j);
            queuePreviousFrame(glObjectsProvider);
            getInputListener().onInputFrameProcessed(glTextureInfo);
            getInputListener().onReadyToAcceptInputFrame();
            return;
        }
        if (shouldQueuePreviousFrame(j)) {
            queuePreviousFrame(glObjectsProvider);
        }
        copyTextureToPreviousFrame(glObjectsProvider, glTextureInfo, j);
        getInputListener().onInputFrameProcessed(glTextureInfo);
        if (this.outputTexturePool.freeTextureCount() > 0) {
            getInputListener().onReadyToAcceptInputFrame();
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram, androidx.media3.effect.GlShaderProgram
    public void signalEndOfCurrentInputStream() {
        super.signalEndOfCurrentInputStream();
        reset();
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram, androidx.media3.effect.GlShaderProgram
    public void flush() {
        super.flush();
        reset();
    }

    @Override // androidx.media3.effect.FrameCacheGlShaderProgram, androidx.media3.effect.BaseGlShaderProgram, androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        super.release();
        try {
            androidx.media3.common.GlTextureInfo glTextureInfo = this.previousTexture;
            if (glTextureInfo != null) {
                glTextureInfo.release();
            }
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    private void reset() {
        try {
            androidx.media3.common.GlTextureInfo glTextureInfo = this.previousTexture;
            if (glTextureInfo != null) {
                glTextureInfo.release();
            }
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            onError(e);
        }
        this.lastQueuedPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.previousPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.framesReceived = 0;
    }

    private void copyTextureToPreviousFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
        try {
            if (this.previousTexture == null) {
                this.previousTexture = glObjectsProvider.createBuffersForTexture(androidx.media3.common.util.GlUtil.createTexture(glTextureInfo.width, glTextureInfo.height, this.useHdr), glTextureInfo.width, glTextureInfo.height);
            }
            androidx.media3.common.GlTextureInfo glTextureInfoCreateBuffersForTexture = (androidx.media3.common.GlTextureInfo) androidx.media3.common.util.Assertions.checkNotNull(this.previousTexture);
            if (glTextureInfoCreateBuffersForTexture.height != glTextureInfo.height || glTextureInfoCreateBuffersForTexture.width != glTextureInfo.width) {
                glTextureInfoCreateBuffersForTexture.release();
                glTextureInfoCreateBuffersForTexture = glObjectsProvider.createBuffersForTexture(androidx.media3.common.util.GlUtil.createTexture(glTextureInfo.width, glTextureInfo.height, this.useHdr), glTextureInfo.width, glTextureInfo.height);
            }
            androidx.media3.common.util.GlUtil.focusFramebufferUsingCurrentContext(glTextureInfoCreateBuffersForTexture.fboId, glTextureInfoCreateBuffersForTexture.width, glTextureInfoCreateBuffersForTexture.height);
            androidx.media3.common.util.GlUtil.clearFocusedBuffers();
            drawFrame(glTextureInfo.texId, j);
            this.previousPresentationTimeUs = j;
            this.previousTexture = glTextureInfoCreateBuffersForTexture;
        } catch (androidx.media3.common.VideoFrameProcessingException | androidx.media3.common.util.GlUtil.GlException e) {
            onError(e);
        }
    }

    private boolean shouldQueuePreviousFrame(long j) {
        if (this.framesReceived == 2) {
            return false;
        }
        long j2 = this.previousPresentationTimeUs;
        long j3 = this.lastQueuedPresentationTimeUs;
        return java.lang.Math.abs((j2 - j3) - this.targetFrameDeltaUs) < java.lang.Math.abs((j - j3) - this.targetFrameDeltaUs);
    }

    private void queuePreviousFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider) {
        try {
            androidx.media3.common.GlTextureInfo glTextureInfo = (androidx.media3.common.GlTextureInfo) androidx.media3.common.util.Assertions.checkNotNull(this.previousTexture);
            androidx.media3.common.util.Size sizeConfigure = configure(glTextureInfo.width, glTextureInfo.height);
            this.outputTexturePool.ensureConfigured(glObjectsProvider, sizeConfigure.getWidth(), sizeConfigure.getHeight());
            androidx.media3.common.GlTextureInfo glTextureInfoUseTexture = this.outputTexturePool.useTexture();
            androidx.media3.common.util.GlUtil.focusFramebufferUsingCurrentContext(glTextureInfoUseTexture.fboId, glTextureInfoUseTexture.width, glTextureInfoUseTexture.height);
            androidx.media3.common.util.GlUtil.clearFocusedBuffers();
            drawFrame(glTextureInfo.texId, this.previousPresentationTimeUs);
            getOutputListener().onOutputFrameAvailable(glTextureInfoUseTexture, this.previousPresentationTimeUs);
            this.lastQueuedPresentationTimeUs = this.previousPresentationTimeUs;
        } catch (androidx.media3.common.VideoFrameProcessingException | androidx.media3.common.util.GlUtil.GlException e) {
            onError(e);
        }
    }
}
