package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGlShaderProgram implements androidx.media3.effect.GlShaderProgram {
    protected final androidx.media3.effect.TexturePool outputTexturePool;
    private androidx.media3.effect.GlShaderProgram.InputListener inputListener = new androidx.media3.effect.GlShaderProgram.InputListener() { // from class: androidx.media3.effect.BaseGlShaderProgram.1
    };
    private androidx.media3.effect.GlShaderProgram.OutputListener outputListener = new androidx.media3.effect.GlShaderProgram.OutputListener() { // from class: androidx.media3.effect.BaseGlShaderProgram.2
    };
    private androidx.media3.effect.GlShaderProgram.ErrorListener errorListener = new androidx.media3.effect.GlShaderProgram.ErrorListener() { // from class: androidx.media3.effect.BaseGlShaderProgram$$ExternalSyntheticLambda2
        @Override // androidx.media3.effect.GlShaderProgram.ErrorListener
        public final void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
            androidx.media3.effect.BaseGlShaderProgram.lambda$new$0(videoFrameProcessingException);
        }
    };
    private java.util.concurrent.Executor errorListenerExecutor = com.google.common.util.concurrent.MoreExecutors.directExecutor();
    private int inputWidth = -1;
    private int inputHeight = -1;

    static /* synthetic */ void lambda$new$0(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
    }

    public abstract androidx.media3.common.util.Size configure(int i, int i2) throws androidx.media3.common.VideoFrameProcessingException;

    public abstract void drawFrame(int i, long j) throws androidx.media3.common.VideoFrameProcessingException;

    public boolean shouldClearTextureBuffer() {
        return true;
    }

    public BaseGlShaderProgram(boolean z, int i) {
        this.outputTexturePool = new androidx.media3.effect.TexturePool(z, i);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setInputListener(androidx.media3.effect.GlShaderProgram.InputListener inputListener) {
        this.inputListener = inputListener;
        for (int i = 0; i < this.outputTexturePool.freeTextureCount(); i++) {
            inputListener.onReadyToAcceptInputFrame();
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setOutputListener(androidx.media3.effect.GlShaderProgram.OutputListener outputListener) {
        this.outputListener = outputListener;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setErrorListener(java.util.concurrent.Executor executor, androidx.media3.effect.GlShaderProgram.ErrorListener errorListener) {
        this.errorListenerExecutor = executor;
        this.errorListener = errorListener;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void queueInputFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
        try {
            if (this.inputWidth != glTextureInfo.width || this.inputHeight != glTextureInfo.height || !this.outputTexturePool.isConfigured()) {
                this.inputWidth = glTextureInfo.width;
                this.inputHeight = glTextureInfo.height;
                androidx.media3.common.util.Size sizeConfigure = configure(glTextureInfo.width, glTextureInfo.height);
                this.outputTexturePool.ensureConfigured(glObjectsProvider, sizeConfigure.getWidth(), sizeConfigure.getHeight());
            }
            androidx.media3.common.GlTextureInfo glTextureInfoUseTexture = this.outputTexturePool.useTexture();
            androidx.media3.common.util.GlUtil.focusFramebufferUsingCurrentContext(glTextureInfoUseTexture.fboId, glTextureInfoUseTexture.width, glTextureInfoUseTexture.height);
            if (shouldClearTextureBuffer()) {
                androidx.media3.common.util.GlUtil.clearFocusedBuffers();
            }
            drawFrame(glTextureInfo.texId, j);
            this.inputListener.onInputFrameProcessed(glTextureInfo);
            this.outputListener.onOutputFrameAvailable(glTextureInfoUseTexture, j);
        } catch (androidx.media3.common.VideoFrameProcessingException | androidx.media3.common.util.GlUtil.GlException e) {
            this.errorListenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.BaseGlShaderProgram$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m62xcc033467(e);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$queueInputFrame$1$androidx-media3-effect-BaseGlShaderProgram, reason: not valid java name */
    /* synthetic */ void m62xcc033467(java.lang.Exception exc) {
        this.errorListener.onError(androidx.media3.common.VideoFrameProcessingException.from(exc));
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void releaseOutputFrame(androidx.media3.common.GlTextureInfo glTextureInfo) {
        if (this.outputTexturePool.isUsingTexture(glTextureInfo)) {
            this.outputTexturePool.freeTexture(glTextureInfo);
            this.inputListener.onReadyToAcceptInputFrame();
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void signalEndOfCurrentInputStream() {
        this.outputListener.onCurrentOutputStreamEnded();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void flush() {
        this.outputTexturePool.freeAllTextures();
        this.inputListener.onFlush();
        for (int i = 0; i < this.outputTexturePool.capacity(); i++) {
            this.inputListener.onReadyToAcceptInputFrame();
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        try {
            this.outputTexturePool.deleteAllTextures();
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    protected final androidx.media3.effect.GlShaderProgram.InputListener getInputListener() {
        return this.inputListener;
    }

    protected final androidx.media3.effect.GlShaderProgram.OutputListener getOutputListener() {
        return this.outputListener;
    }

    protected final void onError(final java.lang.Exception exc) {
        this.errorListenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.BaseGlShaderProgram$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m61lambda$onError$2$androidxmedia3effectBaseGlShaderProgram(exc);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onError$2$androidx-media3-effect-BaseGlShaderProgram, reason: not valid java name */
    /* synthetic */ void m61lambda$onError$2$androidxmedia3effectBaseGlShaderProgram(java.lang.Exception exc) {
        this.errorListener.onError(androidx.media3.common.VideoFrameProcessingException.from(exc));
    }
}
