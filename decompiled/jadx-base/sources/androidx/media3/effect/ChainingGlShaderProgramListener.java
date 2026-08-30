package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class ChainingGlShaderProgramListener implements androidx.media3.effect.GlShaderProgram.InputListener, androidx.media3.effect.GlShaderProgram.OutputListener {
    private final androidx.media3.effect.FrameConsumptionManager frameConsumptionManager;
    private final androidx.media3.effect.GlShaderProgram producingGlShaderProgram;
    private final androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;

    public ChainingGlShaderProgramListener(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.effect.GlShaderProgram glShaderProgram, androidx.media3.effect.GlShaderProgram glShaderProgram2, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor) {
        this.producingGlShaderProgram = glShaderProgram;
        this.frameConsumptionManager = new androidx.media3.effect.FrameConsumptionManager(glObjectsProvider, glShaderProgram2, videoFrameProcessingTaskExecutor);
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public synchronized void onReadyToAcceptInputFrame() {
        this.frameConsumptionManager.onReadyToAcceptInputFrame();
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onInputFrameProcessed(final androidx.media3.common.GlTextureInfo glTextureInfo) {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ChainingGlShaderProgramListener$$ExternalSyntheticLambda1
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m67xbbe1aa34(glTextureInfo);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onInputFrameProcessed$0$androidx-media3-effect-ChainingGlShaderProgramListener, reason: not valid java name */
    /* synthetic */ void m67xbbe1aa34(androidx.media3.common.GlTextureInfo glTextureInfo) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        this.producingGlShaderProgram.releaseOutputFrame(glTextureInfo);
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public synchronized void onFlush() {
        this.frameConsumptionManager.onFlush();
        androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = this.videoFrameProcessingTaskExecutor;
        final androidx.media3.effect.GlShaderProgram glShaderProgram = this.producingGlShaderProgram;
        java.util.Objects.requireNonNull(glShaderProgram);
        videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ChainingGlShaderProgramListener$$ExternalSyntheticLambda0
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() {
                glShaderProgram.flush();
            }
        });
    }

    @Override // androidx.media3.effect.GlShaderProgram.OutputListener
    public synchronized void onOutputFrameAvailable(androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
        this.frameConsumptionManager.queueInputFrame(glTextureInfo, j);
    }

    @Override // androidx.media3.effect.GlShaderProgram.OutputListener
    public synchronized void onCurrentOutputStreamEnded() {
        this.frameConsumptionManager.signalEndOfCurrentStream();
    }
}
