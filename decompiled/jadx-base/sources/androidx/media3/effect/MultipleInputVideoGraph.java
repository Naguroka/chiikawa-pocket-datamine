package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public abstract class MultipleInputVideoGraph implements androidx.media3.common.VideoGraph {
    private static final int COMPOSITOR_TEXTURE_OUTPUT_CAPACITY = 1;
    private static final int PRE_COMPOSITOR_TEXTURE_OUTPUT_CAPACITY = 2;
    private static final long RELEASE_WAIT_TIME_MS = 1000;
    private static final java.lang.String SHARED_EXECUTOR_NAME = "Effect:MultipleInputVideoGraph:Thread";
    private final java.util.List<androidx.media3.common.Effect> compositionEffects;
    private androidx.media3.common.VideoFrameProcessor compositionVideoFrameProcessor;
    private boolean compositionVideoFrameProcessorInputStreamRegistered;
    private boolean compositionVideoFrameProcessorInputStreamRegistrationCompleted;
    private boolean compositorEnded;
    private final android.util.SparseArray<androidx.media3.effect.MultipleInputVideoGraph.CompositorOutputTextureRelease> compositorOutputTextureReleases;
    private final java.util.Queue<androidx.media3.effect.MultipleInputVideoGraph.CompositorOutputTextureInfo> compositorOutputTextures;
    private final android.content.Context context;
    private final androidx.media3.common.DebugViewProvider debugViewProvider;
    private final androidx.media3.common.GlObjectsProvider glObjectsProvider;
    private volatile boolean hasProducedFrameWithTimestampZero;
    private final long initialTimestampOffsetUs;
    private final androidx.media3.common.VideoGraph.Listener listener;
    private final java.util.concurrent.Executor listenerExecutor;
    private final androidx.media3.common.ColorInfo outputColorInfo;
    private boolean released;
    private final java.util.concurrent.ExecutorService sharedExecutorService;
    private androidx.media3.effect.VideoCompositor videoCompositor;
    private final androidx.media3.effect.VideoCompositorSettings videoCompositorSettings;
    private final androidx.media3.effect.DefaultVideoFrameProcessor.Factory videoFrameProcessorFactory;
    private long lastRenderedPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
    private final android.util.SparseArray<androidx.media3.common.VideoFrameProcessor> preProcessors = new android.util.SparseArray<>();

    protected MultipleInputVideoGraph(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, java.util.List<androidx.media3.common.Effect> list, long j) {
        this.context = context;
        this.outputColorInfo = colorInfo;
        this.debugViewProvider = debugViewProvider;
        this.listener = listener;
        this.listenerExecutor = executor;
        this.videoCompositorSettings = videoCompositorSettings;
        this.compositionEffects = new java.util.ArrayList(list);
        this.initialTimestampOffsetUs = j;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = androidx.media3.common.util.Util.newSingleThreadScheduledExecutor(SHARED_EXECUTOR_NAME);
        this.sharedExecutorService = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        androidx.media3.effect.MultipleInputVideoGraph.SingleContextGlObjectsProvider singleContextGlObjectsProvider = new androidx.media3.effect.MultipleInputVideoGraph.SingleContextGlObjectsProvider();
        this.glObjectsProvider = singleContextGlObjectsProvider;
        this.videoFrameProcessorFactory = new androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder().setSdrWorkingColorSpace(2).setGlObjectsProvider(singleContextGlObjectsProvider).setExecutorService(scheduledExecutorServiceNewSingleThreadScheduledExecutor).build();
        this.compositorOutputTextures = new java.util.ArrayDeque();
        this.compositorOutputTextureReleases = new android.util.SparseArray<>();
    }

    @Override // androidx.media3.common.VideoGraph
    public void initialize() throws androidx.media3.common.VideoFrameProcessingException {
        androidx.media3.common.util.Assertions.checkState(this.preProcessors.size() == 0 && this.videoCompositor == null && this.compositionVideoFrameProcessor == null && !this.released);
        androidx.media3.effect.DefaultVideoFrameProcessor defaultVideoFrameProcessorCreate = this.videoFrameProcessorFactory.create(this.context, this.debugViewProvider, this.outputColorInfo, true, com.google.common.util.concurrent.MoreExecutors.directExecutor(), (androidx.media3.common.VideoFrameProcessor.Listener) new androidx.media3.effect.MultipleInputVideoGraph.AnonymousClass1());
        this.compositionVideoFrameProcessor = defaultVideoFrameProcessorCreate;
        defaultVideoFrameProcessorCreate.setOnInputFrameProcessedListener(new androidx.media3.common.OnInputFrameProcessedListener() { // from class: androidx.media3.effect.MultipleInputVideoGraph$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.OnInputFrameProcessedListener
            public final void onInputFrameProcessed(int i, long j) {
                this.f$0.onCompositionVideoFrameProcessorInputFrameProcessed(i, j);
            }
        });
        this.videoCompositor = new androidx.media3.effect.DefaultVideoCompositor(this.context, this.glObjectsProvider, this.videoCompositorSettings, this.sharedExecutorService, new androidx.media3.effect.VideoCompositor.Listener() { // from class: androidx.media3.effect.MultipleInputVideoGraph.2
            @Override // androidx.media3.effect.VideoCompositor.Listener
            public void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
                androidx.media3.effect.MultipleInputVideoGraph.this.handleVideoFrameProcessingException(videoFrameProcessingException);
            }

            @Override // androidx.media3.effect.VideoCompositor.Listener
            public void onEnded() {
                androidx.media3.effect.MultipleInputVideoGraph.this.onVideoCompositorEnded();
            }
        }, new androidx.media3.effect.GlTextureProducer.Listener() { // from class: androidx.media3.effect.MultipleInputVideoGraph$$ExternalSyntheticLambda1
            @Override // androidx.media3.effect.GlTextureProducer.Listener
            public final void onTextureRendered(androidx.media3.effect.GlTextureProducer glTextureProducer, androidx.media3.common.GlTextureInfo glTextureInfo, long j, long j2) {
                this.f$0.processCompositorOutputTexture(glTextureProducer, glTextureInfo, j, j2);
            }
        }, 1);
    }

    /* JADX INFO: renamed from: androidx.media3.effect.MultipleInputVideoGraph$1, reason: invalid class name */
    class AnonymousClass1 implements androidx.media3.common.VideoFrameProcessor.Listener {
        AnonymousClass1() {
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onInputStreamRegistered(int i, java.util.List<androidx.media3.common.Effect> list, androidx.media3.common.FrameInfo frameInfo) {
            androidx.media3.effect.MultipleInputVideoGraph.this.compositionVideoFrameProcessorInputStreamRegistrationCompleted = true;
            androidx.media3.effect.MultipleInputVideoGraph.this.queueCompositionOutputInternal();
        }

        /* JADX INFO: renamed from: lambda$onOutputSizeChanged$0$androidx-media3-effect-MultipleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m101xc532563a(int i, int i2) {
            androidx.media3.effect.MultipleInputVideoGraph.this.listener.onOutputSizeChanged(i, i2);
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onOutputSizeChanged(final int i, final int i2) {
            androidx.media3.effect.MultipleInputVideoGraph.this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.MultipleInputVideoGraph$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m101xc532563a(i, i2);
                }
            });
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onOutputFrameAvailableForRendering(long j) {
            if (j == 0) {
                androidx.media3.effect.MultipleInputVideoGraph.this.hasProducedFrameWithTimestampZero = true;
            }
            androidx.media3.effect.MultipleInputVideoGraph.this.lastRenderedPresentationTimeUs = j;
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
            androidx.media3.effect.MultipleInputVideoGraph.this.handleVideoFrameProcessingException(videoFrameProcessingException);
        }

        /* JADX INFO: renamed from: lambda$onEnded$1$androidx-media3-effect-MultipleInputVideoGraph$1, reason: not valid java name */
        /* synthetic */ void m100x17819a51() {
            androidx.media3.effect.MultipleInputVideoGraph.this.listener.onEnded(androidx.media3.effect.MultipleInputVideoGraph.this.lastRenderedPresentationTimeUs);
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Listener
        public void onEnded() {
            androidx.media3.effect.MultipleInputVideoGraph.this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.MultipleInputVideoGraph$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m100x17819a51();
                }
            });
        }
    }

    @Override // androidx.media3.common.VideoGraph
    public void registerInput(final int i) throws androidx.media3.common.VideoFrameProcessingException {
        androidx.media3.common.util.Assertions.checkState(!androidx.media3.common.util.Util.contains(this.preProcessors, i));
        ((androidx.media3.effect.VideoCompositor) androidx.media3.common.util.Assertions.checkNotNull(this.videoCompositor)).registerInputSource(i);
        this.preProcessors.put(i, this.videoFrameProcessorFactory.buildUpon().setTextureOutput(new androidx.media3.effect.GlTextureProducer.Listener() { // from class: androidx.media3.effect.MultipleInputVideoGraph$$ExternalSyntheticLambda2
            @Override // androidx.media3.effect.GlTextureProducer.Listener
            public final void onTextureRendered(androidx.media3.effect.GlTextureProducer glTextureProducer, androidx.media3.common.GlTextureInfo glTextureInfo, long j, long j2) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m98x9edd0dd9(i, glTextureProducer, glTextureInfo, j, j2);
            }
        }, 2).build().create(this.context, androidx.media3.common.DebugViewProvider.NONE, this.outputColorInfo, true, this.listenerExecutor, new androidx.media3.common.VideoFrameProcessor.Listener() { // from class: androidx.media3.effect.MultipleInputVideoGraph.3
            @Override // androidx.media3.common.VideoFrameProcessor.Listener
            public void onInputStreamRegistered(int i2, java.util.List<androidx.media3.common.Effect> list, androidx.media3.common.FrameInfo frameInfo) {
            }

            @Override // androidx.media3.common.VideoFrameProcessor.Listener
            public void onOutputFrameAvailableForRendering(long j) {
            }

            @Override // androidx.media3.common.VideoFrameProcessor.Listener
            public void onOutputSizeChanged(int i2, int i3) {
            }

            @Override // androidx.media3.common.VideoFrameProcessor.Listener
            public void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
                androidx.media3.effect.MultipleInputVideoGraph.this.handleVideoFrameProcessingException(videoFrameProcessingException);
            }

            @Override // androidx.media3.common.VideoFrameProcessor.Listener
            public void onEnded() {
                androidx.media3.effect.MultipleInputVideoGraph.this.onPreProcessingVideoFrameProcessorEnded(i);
            }
        }));
    }

    /* JADX INFO: renamed from: lambda$registerInput$0$androidx-media3-effect-MultipleInputVideoGraph, reason: not valid java name */
    /* synthetic */ void m98x9edd0dd9(int i, androidx.media3.effect.GlTextureProducer glTextureProducer, androidx.media3.common.GlTextureInfo glTextureInfo, long j, long j2) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        queuePreProcessingOutputToCompositor(i, glTextureProducer, glTextureInfo, j);
    }

    @Override // androidx.media3.common.VideoGraph
    public androidx.media3.common.VideoFrameProcessor getProcessor(int i) {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.preProcessors, i));
        return this.preProcessors.get(i);
    }

    @Override // androidx.media3.common.VideoGraph
    public void setOutputSurfaceInfo(androidx.media3.common.SurfaceInfo surfaceInfo) {
        ((androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkNotNull(this.compositionVideoFrameProcessor)).setOutputSurfaceInfo(surfaceInfo);
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
        for (int i = 0; i < this.preProcessors.size(); i++) {
            android.util.SparseArray<androidx.media3.common.VideoFrameProcessor> sparseArray = this.preProcessors;
            sparseArray.get(sparseArray.keyAt(i)).release();
        }
        this.preProcessors.clear();
        androidx.media3.effect.VideoCompositor videoCompositor = this.videoCompositor;
        if (videoCompositor != null) {
            videoCompositor.release();
            this.videoCompositor = null;
        }
        androidx.media3.common.VideoFrameProcessor videoFrameProcessor = this.compositionVideoFrameProcessor;
        if (videoFrameProcessor != null) {
            videoFrameProcessor.release();
            this.compositionVideoFrameProcessor = null;
        }
        this.sharedExecutorService.shutdown();
        try {
            this.sharedExecutorService.awaitTermination(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.MultipleInputVideoGraph$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m99lambda$release$1$androidxmedia3effectMultipleInputVideoGraph(e);
                }
            });
        }
        this.released = true;
    }

    /* JADX INFO: renamed from: lambda$release$1$androidx-media3-effect-MultipleInputVideoGraph, reason: not valid java name */
    /* synthetic */ void m99lambda$release$1$androidxmedia3effectMultipleInputVideoGraph(java.lang.InterruptedException interruptedException) {
        this.listener.onError(androidx.media3.common.VideoFrameProcessingException.from(interruptedException));
    }

    protected long getInitialTimestampOffsetUs() {
        return this.initialTimestampOffsetUs;
    }

    private void queuePreProcessingOutputToCompositor(int i, androidx.media3.effect.GlTextureProducer glTextureProducer, androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_VFP, androidx.media3.effect.DebugTraceUtil.EVENT_OUTPUT_TEXTURE_RENDERED, j);
        ((androidx.media3.effect.VideoCompositor) androidx.media3.common.util.Assertions.checkNotNull(this.videoCompositor)).queueInputTexture(i, glTextureProducer, glTextureInfo, this.outputColorInfo, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processCompositorOutputTexture(androidx.media3.effect.GlTextureProducer glTextureProducer, androidx.media3.common.GlTextureInfo glTextureInfo, long j, long j2) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.compositionVideoFrameProcessor);
        androidx.media3.common.util.Assertions.checkState(!this.compositorEnded);
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_COMPOSITOR, androidx.media3.effect.DebugTraceUtil.EVENT_OUTPUT_TEXTURE_RENDERED, j);
        this.compositorOutputTextures.add(new androidx.media3.effect.MultipleInputVideoGraph.CompositorOutputTextureInfo(glTextureInfo, j, null));
        this.compositorOutputTextureReleases.put(glTextureInfo.texId, new androidx.media3.effect.MultipleInputVideoGraph.CompositorOutputTextureRelease(glTextureProducer, j));
        if (!this.compositionVideoFrameProcessorInputStreamRegistered) {
            ((androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkNotNull(this.compositionVideoFrameProcessor)).registerInputStream(3, this.compositionEffects, new androidx.media3.common.FrameInfo.Builder(this.outputColorInfo, glTextureInfo.width, glTextureInfo.height).build());
            this.compositionVideoFrameProcessorInputStreamRegistered = true;
        } else {
            queueCompositionOutputInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCompositionVideoFrameProcessorInputFrameProcessed(int i, long j) {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.compositorOutputTextureReleases, i));
        this.compositorOutputTextureReleases.get(i).release();
        this.compositorOutputTextureReleases.remove(i);
        queueCompositionOutputInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPreProcessingVideoFrameProcessorEnded(int i) {
        ((androidx.media3.effect.VideoCompositor) androidx.media3.common.util.Assertions.checkNotNull(this.videoCompositor)).signalEndOfInputSource(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVideoCompositorEnded() {
        this.compositorEnded = true;
        if (this.compositorOutputTextures.isEmpty()) {
            ((androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkNotNull(this.compositionVideoFrameProcessor)).signalEndOfInput();
        } else {
            queueCompositionOutputInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueCompositionOutputInternal() {
        androidx.media3.effect.MultipleInputVideoGraph.CompositorOutputTextureInfo compositorOutputTextureInfoPeek;
        androidx.media3.common.util.Assertions.checkStateNotNull(this.compositionVideoFrameProcessor);
        if (this.compositionVideoFrameProcessorInputStreamRegistrationCompleted && (compositorOutputTextureInfoPeek = this.compositorOutputTextures.peek()) != null) {
            androidx.media3.common.util.Assertions.checkState(((androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkNotNull(this.compositionVideoFrameProcessor)).queueInputTexture(compositorOutputTextureInfoPeek.glTextureInfo.texId, compositorOutputTextureInfoPeek.presentationTimeUs));
            this.compositorOutputTextures.remove();
            if (this.compositorEnded && this.compositorOutputTextures.isEmpty()) {
                ((androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkNotNull(this.compositionVideoFrameProcessor)).signalEndOfInput();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleVideoFrameProcessingException(final java.lang.Exception exc) {
        this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.MultipleInputVideoGraph$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m97x39739ffc(exc);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$handleVideoFrameProcessingException$2$androidx-media3-effect-MultipleInputVideoGraph, reason: not valid java name */
    /* synthetic */ void m97x39739ffc(java.lang.Exception exc) {
        androidx.media3.common.VideoFrameProcessingException videoFrameProcessingExceptionFrom;
        androidx.media3.common.VideoGraph.Listener listener = this.listener;
        if (exc instanceof androidx.media3.common.VideoFrameProcessingException) {
            videoFrameProcessingExceptionFrom = (androidx.media3.common.VideoFrameProcessingException) exc;
        } else {
            videoFrameProcessingExceptionFrom = androidx.media3.common.VideoFrameProcessingException.from(exc);
        }
        listener.onError(videoFrameProcessingExceptionFrom);
    }

    private static final class CompositorOutputTextureInfo {
        public final androidx.media3.common.GlTextureInfo glTextureInfo;
        public final long presentationTimeUs;

        /* synthetic */ CompositorOutputTextureInfo(androidx.media3.common.GlTextureInfo glTextureInfo, long j, androidx.media3.effect.MultipleInputVideoGraph.AnonymousClass1 anonymousClass1) {
            this(glTextureInfo, j);
        }

        private CompositorOutputTextureInfo(androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
            this.glTextureInfo = glTextureInfo;
            this.presentationTimeUs = j;
        }
    }

    private static final class CompositorOutputTextureRelease {
        private final long presentationTimeUs;
        private final androidx.media3.effect.GlTextureProducer textureProducer;

        public CompositorOutputTextureRelease(androidx.media3.effect.GlTextureProducer glTextureProducer, long j) {
            this.textureProducer = glTextureProducer;
            this.presentationTimeUs = j;
        }

        public void release() {
            this.textureProducer.releaseOutputTexture(this.presentationTimeUs);
        }
    }

    private static final class SingleContextGlObjectsProvider implements androidx.media3.common.GlObjectsProvider {
        private final androidx.media3.common.GlObjectsProvider glObjectsProvider = new androidx.media3.effect.DefaultGlObjectsProvider();
        private android.opengl.EGLContext singleEglContext;

        @Override // androidx.media3.common.GlObjectsProvider
        public android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay eGLDisplay, int i, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
            if (this.singleEglContext == null) {
                this.singleEglContext = this.glObjectsProvider.createEglContext(eGLDisplay, i, iArr);
            }
            return this.singleEglContext;
        }

        @Override // androidx.media3.common.GlObjectsProvider
        public android.opengl.EGLSurface createEglSurface(android.opengl.EGLDisplay eGLDisplay, java.lang.Object obj, int i, boolean z) throws androidx.media3.common.util.GlUtil.GlException {
            return this.glObjectsProvider.createEglSurface(eGLDisplay, obj, i, z);
        }

        @Override // androidx.media3.common.GlObjectsProvider
        public android.opengl.EGLSurface createFocusedPlaceholderEglSurface(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException {
            return this.glObjectsProvider.createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay);
        }

        @Override // androidx.media3.common.GlObjectsProvider
        public androidx.media3.common.GlTextureInfo createBuffersForTexture(int i, int i2, int i3) throws androidx.media3.common.util.GlUtil.GlException {
            return this.glObjectsProvider.createBuffersForTexture(i, i2, i3);
        }
    }
}
