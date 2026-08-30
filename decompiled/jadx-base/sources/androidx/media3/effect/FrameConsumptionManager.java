package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class FrameConsumptionManager implements androidx.media3.effect.GlShaderProgram.InputListener {
    private final java.util.Queue<android.util.Pair<androidx.media3.common.GlTextureInfo, java.lang.Long>> availableFrames = new java.util.ArrayDeque();
    private final androidx.media3.effect.GlShaderProgram consumingGlShaderProgram;
    private int consumingGlShaderProgramInputCapacity;
    private final androidx.media3.common.GlObjectsProvider glObjectsProvider;
    private final androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;

    public FrameConsumptionManager(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.effect.GlShaderProgram glShaderProgram, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor) {
        this.glObjectsProvider = glObjectsProvider;
        this.consumingGlShaderProgram = glShaderProgram;
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public synchronized void onReadyToAcceptInputFrame() {
        final android.util.Pair<androidx.media3.common.GlTextureInfo, java.lang.Long> pairPoll = this.availableFrames.poll();
        if (pairPoll == null) {
            this.consumingGlShaderProgramInputCapacity++;
            return;
        }
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.FrameConsumptionManager$$ExternalSyntheticLambda2
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m95xd81ce908(pairPoll);
            }
        });
        android.util.Pair<androidx.media3.common.GlTextureInfo, java.lang.Long> pairPeek = this.availableFrames.peek();
        if (pairPeek != null && ((java.lang.Long) pairPeek.second).longValue() == Long.MIN_VALUE) {
            androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = this.videoFrameProcessingTaskExecutor;
            androidx.media3.effect.GlShaderProgram glShaderProgram = this.consumingGlShaderProgram;
            java.util.Objects.requireNonNull(glShaderProgram);
            videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.FrameConsumptionManager$$ExternalSyntheticLambda0(glShaderProgram));
            this.availableFrames.remove();
        }
    }

    /* JADX INFO: renamed from: lambda$onReadyToAcceptInputFrame$0$androidx-media3-effect-FrameConsumptionManager, reason: not valid java name */
    /* synthetic */ void m95xd81ce908(android.util.Pair pair) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        this.consumingGlShaderProgram.queueInputFrame(this.glObjectsProvider, (androidx.media3.common.GlTextureInfo) pair.first, ((java.lang.Long) pair.second).longValue());
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public synchronized void onFlush() {
        this.consumingGlShaderProgramInputCapacity = 0;
        this.availableFrames.clear();
    }

    public synchronized void queueInputFrame(final androidx.media3.common.GlTextureInfo glTextureInfo, final long j) {
        if (this.consumingGlShaderProgramInputCapacity > 0) {
            this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.FrameConsumptionManager$$ExternalSyntheticLambda1
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                    this.f$0.m96x6311f25d(glTextureInfo, j);
                }
            });
            this.consumingGlShaderProgramInputCapacity--;
        } else {
            this.availableFrames.add(android.util.Pair.create(glTextureInfo, java.lang.Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: lambda$queueInputFrame$1$androidx-media3-effect-FrameConsumptionManager, reason: not valid java name */
    /* synthetic */ void m96x6311f25d(androidx.media3.common.GlTextureInfo glTextureInfo, long j) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        this.consumingGlShaderProgram.queueInputFrame(this.glObjectsProvider, glTextureInfo, j);
    }

    public synchronized void signalEndOfCurrentStream() {
        if (!this.availableFrames.isEmpty()) {
            this.availableFrames.add(android.util.Pair.create(androidx.media3.common.GlTextureInfo.UNSET, Long.MIN_VALUE));
        } else {
            androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = this.videoFrameProcessingTaskExecutor;
            androidx.media3.effect.GlShaderProgram glShaderProgram = this.consumingGlShaderProgram;
            java.util.Objects.requireNonNull(glShaderProgram);
            videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.FrameConsumptionManager$$ExternalSyntheticLambda0(glShaderProgram));
        }
    }

    public synchronized int getPendingFrameCount() {
        return this.availableFrames.size();
    }
}
