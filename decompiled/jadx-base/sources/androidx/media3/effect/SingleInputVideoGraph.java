package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public abstract class SingleInputVideoGraph implements androidx.media3.common.VideoGraph {
    private final android.content.Context context;
    private final androidx.media3.common.DebugViewProvider debugViewProvider;
    private volatile boolean hasProducedFrameWithTimestampZero;
    private final long initialTimestampOffsetUs;
    private int inputIndex;
    private boolean isEnded;
    private final androidx.media3.common.VideoGraph.Listener listener;
    private final java.util.concurrent.Executor listenerExecutor;
    private final androidx.media3.common.ColorInfo outputColorInfo;
    private androidx.media3.common.SurfaceInfo outputSurfaceInfo;
    private final androidx.media3.effect.Presentation presentation;
    private boolean released;
    private final boolean renderFramesAutomatically;
    private androidx.media3.common.VideoFrameProcessor videoFrameProcessor;
    private final androidx.media3.common.VideoFrameProcessor.Factory videoFrameProcessorFactory;

    @Override // androidx.media3.common.VideoGraph
    public void initialize() {
    }

    public SingleInputVideoGraph(android.content.Context context, androidx.media3.common.VideoFrameProcessor.Factory factory, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.VideoGraph.Listener listener, androidx.media3.common.DebugViewProvider debugViewProvider, java.util.concurrent.Executor executor, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, boolean z, androidx.media3.effect.Presentation presentation, long j) {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.effect.VideoCompositorSettings.DEFAULT.equals(videoCompositorSettings), "SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings");
        this.context = context;
        this.videoFrameProcessorFactory = factory;
        this.outputColorInfo = colorInfo;
        this.listener = listener;
        this.debugViewProvider = debugViewProvider;
        this.listenerExecutor = executor;
        this.renderFramesAutomatically = z;
        this.presentation = presentation;
        this.initialTimestampOffsetUs = j;
        this.inputIndex = -1;
    }

    @Override // androidx.media3.common.VideoGraph
    public void registerInput(int i) throws androidx.media3.common.VideoFrameProcessingException {
        androidx.media3.common.util.Assertions.checkStateNotNull(java.lang.Boolean.valueOf(this.videoFrameProcessor == null && !this.released));
        androidx.media3.common.util.Assertions.checkState(this.inputIndex == -1);
        this.inputIndex = i;
        androidx.media3.common.VideoFrameProcessor videoFrameProcessorCreate = this.videoFrameProcessorFactory.create(this.context, this.debugViewProvider, this.outputColorInfo, this.renderFramesAutomatically, com.google.common.util.concurrent.MoreExecutors.directExecutor(), new androidx.media3.effect.SingleInputVideoGraph.AnonymousClass1());
        this.videoFrameProcessor = videoFrameProcessorCreate;
        androidx.media3.common.SurfaceInfo surfaceInfo = this.outputSurfaceInfo;
        if (surfaceInfo != null) {
            videoFrameProcessorCreate.setOutputSurfaceInfo(surfaceInfo);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.effect.SingleInputVideoGraph$1, reason: invalid class name */
    class AnonymousClass1 implements androidx.media3.common.VideoFrameProcessor.Listener {
        private long lastProcessedFramePresentationTimeUs;

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onInputStreamRegistered(int i, java.util.List<androidx.media3.common.Effect> list, androidx.media3.common.FrameInfo frameInfo) {
        }

        AnonymousClass1() {
        }

        /* JADX INFO: renamed from: lambda$onOutputSizeChanged$0$androidx-media3-effect-SingleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m107xade93702(int i, int i2) {
            androidx.media3.effect.SingleInputVideoGraph.this.listener.onOutputSizeChanged(i, i2);
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onOutputSizeChanged(final int i, final int i2) {
            androidx.media3.effect.SingleInputVideoGraph.this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.SingleInputVideoGraph$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m107xade93702(i, i2);
                }
            });
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onOutputFrameAvailableForRendering(final long j) {
            if (androidx.media3.effect.SingleInputVideoGraph.this.isEnded) {
                onError(new androidx.media3.common.VideoFrameProcessingException("onOutputFrameAvailableForRendering() received after onEnded()"));
                return;
            }
            if (j == 0) {
                androidx.media3.effect.SingleInputVideoGraph.this.hasProducedFrameWithTimestampZero = true;
            }
            this.lastProcessedFramePresentationTimeUs = j;
            androidx.media3.effect.SingleInputVideoGraph.this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.SingleInputVideoGraph$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m106xef658d3b(j);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onOutputFrameAvailableForRendering$1$androidx-media3-effect-SingleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m106xef658d3b(long j) {
            androidx.media3.effect.SingleInputVideoGraph.this.listener.onOutputFrameAvailableForRendering(j);
        }

        /* JADX INFO: renamed from: lambda$onError$2$androidx-media3-effect-SingleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m105lambda$onError$2$androidxmedia3effectSingleInputVideoGraph$1(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
            androidx.media3.effect.SingleInputVideoGraph.this.listener.onError(videoFrameProcessingException);
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onError(final androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
            androidx.media3.effect.SingleInputVideoGraph.this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.SingleInputVideoGraph$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m105lambda$onError$2$androidxmedia3effectSingleInputVideoGraph$1(videoFrameProcessingException);
                }
            });
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onEnded() {
            if (!androidx.media3.effect.SingleInputVideoGraph.this.isEnded) {
                androidx.media3.effect.SingleInputVideoGraph.this.isEnded = true;
                androidx.media3.effect.SingleInputVideoGraph.this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.SingleInputVideoGraph$1$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m104lambda$onEnded$3$androidxmedia3effectSingleInputVideoGraph$1();
                    }
                });
            } else {
                onError(new androidx.media3.common.VideoFrameProcessingException("onEnded() received multiple times"));
            }
        }

        /* JADX INFO: renamed from: lambda$onEnded$3$androidx-media3-effect-SingleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m104lambda$onEnded$3$androidxmedia3effectSingleInputVideoGraph$1() {
            androidx.media3.effect.SingleInputVideoGraph.this.listener.onEnded(this.lastProcessedFramePresentationTimeUs);
        }
    }

    @Override // androidx.media3.common.VideoGraph
    public androidx.media3.common.VideoFrameProcessor getProcessor(int i) {
        int i2 = this.inputIndex;
        androidx.media3.common.util.Assertions.checkArgument(i2 != -1 && i2 == i);
        return (androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkStateNotNull(this.videoFrameProcessor);
    }

    @Override // androidx.media3.common.VideoGraph
    public void setOutputSurfaceInfo(androidx.media3.common.SurfaceInfo surfaceInfo) {
        this.outputSurfaceInfo = surfaceInfo;
        androidx.media3.common.VideoFrameProcessor videoFrameProcessor = this.videoFrameProcessor;
        if (videoFrameProcessor != null) {
            videoFrameProcessor.setOutputSurfaceInfo(surfaceInfo);
        }
    }

    @Override // androidx.media3.common.VideoGraph
    public boolean hasProducedFrameWithTimestampZero() {
        return this.hasProducedFrameWithTimestampZero;
    }

    @Override // androidx.media3.common.VideoGraph
    public void release() {
        if (this.released) {
            return;
        }
        androidx.media3.common.VideoFrameProcessor videoFrameProcessor = this.videoFrameProcessor;
        if (videoFrameProcessor != null) {
            videoFrameProcessor.release();
            this.videoFrameProcessor = null;
        }
        this.released = true;
    }

    protected int getInputIndex() {
        return this.inputIndex;
    }

    protected long getInitialTimestampOffsetUs() {
        return this.initialTimestampOffsetUs;
    }

    protected androidx.media3.effect.Presentation getPresentation() {
        return this.presentation;
    }
}
