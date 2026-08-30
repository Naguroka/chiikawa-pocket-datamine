package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class TexIdTextureManager extends androidx.media3.effect.TextureManager {
    private androidx.media3.effect.FrameConsumptionManager frameConsumptionManager;
    private androidx.media3.common.OnInputFrameProcessedListener frameProcessedListener;
    private final androidx.media3.common.GlObjectsProvider glObjectsProvider;
    private androidx.media3.common.FrameInfo inputFrameInfo;

    @Override // androidx.media3.effect.TextureManager
    public void release() {
    }

    public TexIdTextureManager(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor) {
        super(videoFrameProcessingTaskExecutor);
        this.glObjectsProvider = glObjectsProvider;
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onReadyToAcceptInputFrame() {
        androidx.media3.common.util.Assertions.checkNotNull(this.frameConsumptionManager);
        androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = this.videoFrameProcessingTaskExecutor;
        final androidx.media3.effect.FrameConsumptionManager frameConsumptionManager = this.frameConsumptionManager;
        java.util.Objects.requireNonNull(frameConsumptionManager);
        videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.TexIdTextureManager$$ExternalSyntheticLambda2
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() {
                frameConsumptionManager.onReadyToAcceptInputFrame();
            }
        });
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onInputFrameProcessed(final androidx.media3.common.GlTextureInfo glTextureInfo) {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.TexIdTextureManager$$ExternalSyntheticLambda3
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m108x4089f4fb(glTextureInfo);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onInputFrameProcessed$0$androidx-media3-effect-TexIdTextureManager, reason: not valid java name */
    /* synthetic */ void m108x4089f4fb(androidx.media3.common.GlTextureInfo glTextureInfo) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        ((androidx.media3.common.OnInputFrameProcessedListener) androidx.media3.common.util.Assertions.checkNotNull(this.frameProcessedListener)).onInputFrameProcessed(glTextureInfo.texId, androidx.media3.common.util.GlUtil.createGlSyncFence());
    }

    @Override // androidx.media3.effect.TextureManager
    public void setSamplingGlShaderProgram(androidx.media3.effect.GlShaderProgram glShaderProgram) {
        this.frameConsumptionManager = new androidx.media3.effect.FrameConsumptionManager(this.glObjectsProvider, glShaderProgram, this.videoFrameProcessingTaskExecutor);
    }

    @Override // androidx.media3.effect.TextureManager
    public void queueInputTexture(final int i, final long j) {
        final androidx.media3.common.FrameInfo frameInfo = (androidx.media3.common.FrameInfo) androidx.media3.common.util.Assertions.checkNotNull(this.inputFrameInfo);
        androidx.media3.common.util.Assertions.checkNotNull(this.frameProcessedListener);
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.TexIdTextureManager$$ExternalSyntheticLambda1
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m109x6f71c964(i, frameInfo, j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$queueInputTexture$1$androidx-media3-effect-TexIdTextureManager, reason: not valid java name */
    /* synthetic */ void m109x6f71c964(int i, androidx.media3.common.FrameInfo frameInfo, long j) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        ((androidx.media3.effect.FrameConsumptionManager) androidx.media3.common.util.Assertions.checkNotNull(this.frameConsumptionManager)).queueInputFrame(new androidx.media3.common.GlTextureInfo(i, -1, -1, frameInfo.width, frameInfo.height), j);
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_VFP, androidx.media3.effect.DebugTraceUtil.EVENT_QUEUE_TEXTURE, j, "%dx%d", java.lang.Integer.valueOf(frameInfo.width), java.lang.Integer.valueOf(frameInfo.height));
    }

    @Override // androidx.media3.effect.TextureManager
    public void setOnInputFrameProcessedListener(androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener) {
        this.frameProcessedListener = onInputFrameProcessedListener;
    }

    @Override // androidx.media3.effect.TextureManager
    public void setInputFrameInfo(androidx.media3.common.FrameInfo frameInfo) {
        this.inputFrameInfo = frameInfo;
    }

    @Override // androidx.media3.effect.TextureManager
    public int getPendingFrameCount() {
        return ((androidx.media3.effect.FrameConsumptionManager) androidx.media3.common.util.Assertions.checkNotNull(this.frameConsumptionManager)).getPendingFrameCount();
    }

    @Override // androidx.media3.effect.TextureManager
    public void signalEndOfCurrentInputStream() {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.TexIdTextureManager$$ExternalSyntheticLambda0
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m110x4d1e00ea();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$signalEndOfCurrentInputStream$2$androidx-media3-effect-TexIdTextureManager, reason: not valid java name */
    /* synthetic */ void m110x4d1e00ea() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        ((androidx.media3.effect.FrameConsumptionManager) androidx.media3.common.util.Assertions.checkNotNull(this.frameConsumptionManager)).signalEndOfCurrentStream();
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_TEX_ID_TEXTURE_MANAGER, androidx.media3.effect.DebugTraceUtil.EVENT_SIGNAL_EOS, Long.MIN_VALUE);
    }

    @Override // androidx.media3.effect.TextureManager
    protected synchronized void flush() throws androidx.media3.common.VideoFrameProcessingException {
        ((androidx.media3.effect.FrameConsumptionManager) androidx.media3.common.util.Assertions.checkNotNull(this.frameConsumptionManager)).onFlush();
        super.flush();
    }
}
