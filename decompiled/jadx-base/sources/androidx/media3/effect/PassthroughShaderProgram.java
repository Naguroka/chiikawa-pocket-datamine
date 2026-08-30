package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public class PassthroughShaderProgram implements androidx.media3.effect.GlShaderProgram {
    private androidx.media3.effect.GlShaderProgram.InputListener inputListener = new androidx.media3.effect.GlShaderProgram.InputListener() { // from class: androidx.media3.effect.PassthroughShaderProgram.1
    };
    private androidx.media3.effect.GlShaderProgram.OutputListener outputListener = new androidx.media3.effect.GlShaderProgram.OutputListener() { // from class: androidx.media3.effect.PassthroughShaderProgram.2
    };
    private androidx.media3.effect.GlShaderProgram.ErrorListener errorListener = new androidx.media3.effect.GlShaderProgram.ErrorListener() { // from class: androidx.media3.effect.PassthroughShaderProgram$$ExternalSyntheticLambda0
        @Override // androidx.media3.effect.GlShaderProgram.ErrorListener
        public final void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
            androidx.media3.effect.PassthroughShaderProgram.lambda$new$0(videoFrameProcessingException);
        }
    };
    private java.util.concurrent.Executor errorListenerExecutor = com.google.common.util.concurrent.MoreExecutors.directExecutor();
    private int texIdInUse = -1;

    static /* synthetic */ void lambda$new$0(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setInputListener(androidx.media3.effect.GlShaderProgram.InputListener inputListener) {
        this.inputListener = inputListener;
        if (this.texIdInUse == -1) {
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
        this.texIdInUse = glTextureInfo.texId;
        this.outputListener.onOutputFrameAvailable(glTextureInfo, j);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void releaseOutputFrame(androidx.media3.common.GlTextureInfo glTextureInfo) {
        androidx.media3.common.util.Assertions.checkState(glTextureInfo.texId == this.texIdInUse);
        this.texIdInUse = -1;
        this.inputListener.onInputFrameProcessed(glTextureInfo);
        this.inputListener.onReadyToAcceptInputFrame();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void signalEndOfCurrentInputStream() {
        this.outputListener.onCurrentOutputStreamEnded();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void flush() {
        this.texIdInUse = -1;
        this.inputListener.onFlush();
        this.inputListener.onReadyToAcceptInputFrame();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        this.texIdInUse = -1;
    }

    protected final androidx.media3.effect.GlShaderProgram.InputListener getInputListener() {
        return this.inputListener;
    }

    protected final void onError(final java.lang.Exception exc) {
        this.errorListenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.PassthroughShaderProgram$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m102lambda$onError$1$androidxmedia3effectPassthroughShaderProgram(exc);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onError$1$androidx-media3-effect-PassthroughShaderProgram, reason: not valid java name */
    /* synthetic */ void m102lambda$onError$1$androidxmedia3effectPassthroughShaderProgram(java.lang.Exception exc) {
        this.errorListener.onError(androidx.media3.common.VideoFrameProcessingException.from(exc));
    }
}
