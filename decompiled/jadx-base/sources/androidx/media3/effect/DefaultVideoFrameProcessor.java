package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultVideoFrameProcessor implements androidx.media3.common.VideoFrameProcessor {
    private static final java.lang.String TAG = "DefaultFrameProcessor";
    public static final int WORKING_COLOR_SPACE_DEFAULT = 0;
    public static final int WORKING_COLOR_SPACE_LINEAR = 2;
    public static final int WORKING_COLOR_SPACE_ORIGINAL = 1;
    private final android.content.Context context;
    private final android.opengl.EGLContext eglContext;
    private final android.opengl.EGLDisplay eglDisplay;
    private final androidx.media3.effect.FinalShaderProgramWrapper finalShaderProgramWrapper;
    private final androidx.media3.common.GlObjectsProvider glObjectsProvider;
    private volatile boolean inputStreamEnded;
    private final androidx.media3.common.util.ConditionVariable inputStreamRegisteredCondition;
    private final androidx.media3.effect.InputSwitcher inputSwitcher;
    private final androidx.media3.common.VideoFrameProcessor.Listener listener;
    private final java.util.concurrent.Executor listenerExecutor;
    private volatile androidx.media3.common.FrameInfo nextInputFrameInfo;
    private final androidx.media3.common.ColorInfo outputColorInfo;
    private androidx.media3.effect.DefaultVideoFrameProcessor.InputStreamInfo pendingInputStreamInfo;
    private boolean registeredFirstInputStream;
    private final boolean renderFramesAutomatically;
    private final androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;
    private final java.util.List<androidx.media3.common.Effect> activeEffects = new java.util.ArrayList();
    private final java.lang.Object lock = new java.lang.Object();
    private final java.util.List<androidx.media3.effect.GlShaderProgram> intermediateGlShaderPrograms = new java.util.ArrayList();

    public interface ReleaseOutputTextureCallback {
        void release(long j);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface WorkingColorSpace {
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.effect");
    }

    public static final class Factory implements androidx.media3.common.VideoFrameProcessor.Factory {
        private static final java.lang.String THREAD_NAME = "Effect:DefaultVideoFrameProcessor:GlThread";
        private final java.util.concurrent.ExecutorService executorService;
        private final boolean experimentalAdjustSurfaceTextureTransformationMatrix;
        private final boolean experimentalRepeatInputBitmapWithoutResampling;
        private final androidx.media3.common.GlObjectsProvider glObjectsProvider;
        private final boolean repeatLastRegisteredFrame;
        private final int sdrWorkingColorSpace;
        private final int textureOutputCapacity;
        private final androidx.media3.effect.GlTextureProducer.Listener textureOutputListener;

        public static final class Builder {
            private java.util.concurrent.ExecutorService executorService;
            private boolean experimentalAdjustSurfaceTextureTransformationMatrix;
            private boolean experimentalRepeatInputBitmapWithoutResampling;
            private androidx.media3.common.GlObjectsProvider glObjectsProvider;
            private boolean requireRegisteringAllInputFrames;
            private int sdrWorkingColorSpace;
            private int textureOutputCapacity;
            private androidx.media3.effect.GlTextureProducer.Listener textureOutputListener;

            public Builder() {
                this.sdrWorkingColorSpace = 0;
                this.requireRegisteringAllInputFrames = true;
            }

            private Builder(androidx.media3.effect.DefaultVideoFrameProcessor.Factory factory) {
                this.sdrWorkingColorSpace = factory.sdrWorkingColorSpace;
                this.executorService = factory.executorService;
                this.glObjectsProvider = factory.glObjectsProvider;
                this.textureOutputListener = factory.textureOutputListener;
                this.textureOutputCapacity = factory.textureOutputCapacity;
                this.requireRegisteringAllInputFrames = !factory.repeatLastRegisteredFrame;
                this.experimentalAdjustSurfaceTextureTransformationMatrix = factory.experimentalAdjustSurfaceTextureTransformationMatrix;
                this.experimentalRepeatInputBitmapWithoutResampling = factory.experimentalRepeatInputBitmapWithoutResampling;
            }

            public androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder setSdrWorkingColorSpace(int i) {
                this.sdrWorkingColorSpace = i;
                return this;
            }

            public androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder setRequireRegisteringAllInputFrames(boolean z) {
                this.requireRegisteringAllInputFrames = z;
                return this;
            }

            public androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder setGlObjectsProvider(androidx.media3.common.GlObjectsProvider glObjectsProvider) {
                this.glObjectsProvider = glObjectsProvider;
                return this;
            }

            public androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder setExecutorService(java.util.concurrent.ExecutorService executorService) {
                this.executorService = executorService;
                return this;
            }

            public androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder setTextureOutput(androidx.media3.effect.GlTextureProducer.Listener listener, int i) {
                this.textureOutputListener = listener;
                androidx.media3.common.util.Assertions.checkArgument(i >= 1);
                this.textureOutputCapacity = i;
                return this;
            }

            public androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder setExperimentalAdjustSurfaceTextureTransformationMatrix(boolean z) {
                this.experimentalAdjustSurfaceTextureTransformationMatrix = z;
                return this;
            }

            public androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder setExperimentalRepeatInputBitmapWithoutResampling(boolean z) {
                this.experimentalRepeatInputBitmapWithoutResampling = z;
                return this;
            }

            public androidx.media3.effect.DefaultVideoFrameProcessor.Factory build() {
                int i = this.sdrWorkingColorSpace;
                boolean z = !this.requireRegisteringAllInputFrames;
                androidx.media3.common.GlObjectsProvider defaultGlObjectsProvider = this.glObjectsProvider;
                if (defaultGlObjectsProvider == null) {
                    defaultGlObjectsProvider = new androidx.media3.effect.DefaultGlObjectsProvider();
                }
                return new androidx.media3.effect.DefaultVideoFrameProcessor.Factory(i, z, defaultGlObjectsProvider, this.executorService, this.textureOutputListener, this.textureOutputCapacity, this.experimentalAdjustSurfaceTextureTransformationMatrix, this.experimentalRepeatInputBitmapWithoutResampling);
            }
        }

        private Factory(int i, boolean z, androidx.media3.common.GlObjectsProvider glObjectsProvider, java.util.concurrent.ExecutorService executorService, androidx.media3.effect.GlTextureProducer.Listener listener, int i2, boolean z2, boolean z3) {
            this.sdrWorkingColorSpace = i;
            this.repeatLastRegisteredFrame = z;
            this.glObjectsProvider = glObjectsProvider;
            this.executorService = executorService;
            this.textureOutputListener = listener;
            this.textureOutputCapacity = i2;
            this.experimentalAdjustSurfaceTextureTransformationMatrix = z2;
            this.experimentalRepeatInputBitmapWithoutResampling = z3;
        }

        public androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder buildUpon() {
            return new androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder();
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Factory
        public androidx.media3.effect.DefaultVideoFrameProcessor create(final android.content.Context context, final androidx.media3.common.DebugViewProvider debugViewProvider, final androidx.media3.common.ColorInfo colorInfo, final boolean z, final java.util.concurrent.Executor executor, final androidx.media3.common.VideoFrameProcessor.Listener listener) throws androidx.media3.common.VideoFrameProcessingException {
            java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = this.executorService;
            boolean z2 = executorServiceNewSingleThreadExecutor == null;
            if (executorServiceNewSingleThreadExecutor == null) {
                executorServiceNewSingleThreadExecutor = androidx.media3.common.util.Util.newSingleThreadExecutor(THREAD_NAME);
            }
            java.util.Objects.requireNonNull(listener);
            final androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = new androidx.media3.effect.VideoFrameProcessingTaskExecutor(executorServiceNewSingleThreadExecutor, z2, new androidx.media3.effect.VideoFrameProcessingTaskExecutor.ErrorListener() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$Factory$$ExternalSyntheticLambda0
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.ErrorListener
                public final void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
                    listener.onError(videoFrameProcessingException);
                }
            });
            try {
                return (androidx.media3.effect.DefaultVideoFrameProcessor) executorServiceNewSingleThreadExecutor.submit(new java.util.concurrent.Callable() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$Factory$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return this.f$0.m76x7d446e8(context, debugViewProvider, colorInfo, z, videoFrameProcessingTaskExecutor, executor, listener);
                    }
                }).get();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                throw new androidx.media3.common.VideoFrameProcessingException(e);
            } catch (java.util.concurrent.ExecutionException e2) {
                throw new androidx.media3.common.VideoFrameProcessingException(e2);
            }
        }

        /* JADX INFO: renamed from: lambda$create$0$androidx-media3-effect-DefaultVideoFrameProcessor$Factory, reason: not valid java name */
        /* synthetic */ androidx.media3.effect.DefaultVideoFrameProcessor m76x7d446e8(android.content.Context context, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.ColorInfo colorInfo, boolean z, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, java.util.concurrent.Executor executor, androidx.media3.common.VideoFrameProcessor.Listener listener) throws java.lang.Exception {
            return androidx.media3.effect.DefaultVideoFrameProcessor.createOpenGlObjectsAndFrameProcessor(context, debugViewProvider, colorInfo, this.sdrWorkingColorSpace, z, videoFrameProcessingTaskExecutor, executor, listener, this.glObjectsProvider, this.textureOutputListener, this.textureOutputCapacity, this.repeatLastRegisteredFrame, this.experimentalAdjustSurfaceTextureTransformationMatrix, this.experimentalRepeatInputBitmapWithoutResampling);
        }
    }

    private DefaultVideoFrameProcessor(android.content.Context context, androidx.media3.common.GlObjectsProvider glObjectsProvider, android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, androidx.media3.effect.InputSwitcher inputSwitcher, final androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, final androidx.media3.common.VideoFrameProcessor.Listener listener, final java.util.concurrent.Executor executor, androidx.media3.effect.FinalShaderProgramWrapper finalShaderProgramWrapper, boolean z, androidx.media3.common.ColorInfo colorInfo) {
        this.context = context;
        this.glObjectsProvider = glObjectsProvider;
        this.eglDisplay = eGLDisplay;
        this.eglContext = eGLContext;
        this.inputSwitcher = inputSwitcher;
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
        this.listener = listener;
        this.listenerExecutor = executor;
        this.renderFramesAutomatically = z;
        this.outputColorInfo = colorInfo;
        this.finalShaderProgramWrapper = finalShaderProgramWrapper;
        androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable();
        this.inputStreamRegisteredCondition = conditionVariable;
        conditionVariable.open();
        finalShaderProgramWrapper.setOnInputStreamProcessedListener(new androidx.media3.effect.FinalShaderProgramWrapper.OnInputStreamProcessedListener() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda1
            @Override // androidx.media3.effect.FinalShaderProgramWrapper.OnInputStreamProcessedListener
            public final void onInputStreamProcessed() {
                this.f$0.m72lambda$new$1$androidxmedia3effectDefaultVideoFrameProcessor(executor, listener, videoFrameProcessingTaskExecutor);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m72lambda$new$1$androidxmedia3effectDefaultVideoFrameProcessor(java.util.concurrent.Executor executor, final androidx.media3.common.VideoFrameProcessor.Listener listener, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor) {
        if (this.inputStreamEnded) {
            java.util.Objects.requireNonNull(listener);
            executor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    listener.onEnded();
                }
            });
            androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_VFP, androidx.media3.effect.DebugTraceUtil.EVENT_SIGNAL_ENDED, Long.MIN_VALUE);
        } else {
            synchronized (this.lock) {
                final androidx.media3.effect.DefaultVideoFrameProcessor.InputStreamInfo inputStreamInfo = this.pendingInputStreamInfo;
                if (inputStreamInfo != null) {
                    videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda6
                        @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                        public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                            this.f$0.m71lambda$new$0$androidxmedia3effectDefaultVideoFrameProcessor(inputStreamInfo);
                        }
                    });
                    this.pendingInputStreamInfo = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m71lambda$new$0$androidxmedia3effectDefaultVideoFrameProcessor(androidx.media3.effect.DefaultVideoFrameProcessor.InputStreamInfo inputStreamInfo) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        configureEffects(inputStreamInfo, false);
    }

    public androidx.media3.effect.VideoFrameProcessingTaskExecutor getTaskExecutor() {
        return this.videoFrameProcessingTaskExecutor;
    }

    public void setInputDefaultBufferSize(int i, int i2) {
        this.inputSwitcher.setInputDefaultBufferSize(i, i2);
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public boolean queueInputBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator) {
        boolean z = false;
        if (!this.inputStreamRegisteredCondition.isOpen()) {
            return false;
        }
        if (androidx.media3.common.ColorInfo.isTransferHdr(this.outputColorInfo)) {
            if (androidx.media3.common.util.Util.SDK_INT >= 34 && bitmap.hasGainmap()) {
                z = true;
            }
            androidx.media3.common.util.Assertions.checkArgument(z, "VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.");
        }
        androidx.media3.common.FrameInfo frameInfo = (androidx.media3.common.FrameInfo) androidx.media3.common.util.Assertions.checkNotNull(this.nextInputFrameInfo);
        this.inputSwitcher.activeTextureManager().queueInputBitmap(bitmap, new androidx.media3.common.FrameInfo.Builder(frameInfo).setOffsetToAddUs(frameInfo.offsetToAddUs).build(), timestampIterator);
        return true;
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public boolean queueInputTexture(int i, long j) {
        if (!this.inputStreamRegisteredCondition.isOpen()) {
            return false;
        }
        this.inputSwitcher.activeTextureManager().queueInputTexture(i, j);
        return true;
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void setOnInputFrameProcessedListener(androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener) {
        this.inputSwitcher.setOnInputFrameProcessedListener(onInputFrameProcessedListener);
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public android.view.Surface getInputSurface() {
        return this.inputSwitcher.getInputSurface();
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void registerInputStream(int i, java.util.List<androidx.media3.common.Effect> list, androidx.media3.common.FrameInfo frameInfo) {
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_VFP, androidx.media3.effect.DebugTraceUtil.EVENT_REGISTER_NEW_INPUT_STREAM, frameInfo.offsetToAddUs, "InputType %s - %dx%d", getInputTypeString(i), java.lang.Integer.valueOf(frameInfo.width), java.lang.Integer.valueOf(frameInfo.height));
        this.nextInputFrameInfo = adjustForPixelWidthHeightRatio(frameInfo);
        try {
            this.inputStreamRegisteredCondition.block();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m73x7604a15(e);
                }
            });
        }
        synchronized (this.lock) {
            final androidx.media3.effect.DefaultVideoFrameProcessor.InputStreamInfo inputStreamInfo = new androidx.media3.effect.DefaultVideoFrameProcessor.InputStreamInfo(i, list, frameInfo);
            if (!this.registeredFirstInputStream) {
                this.registeredFirstInputStream = true;
                this.inputStreamRegisteredCondition.close();
                this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda2
                    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                    public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                        this.f$0.m74x4aeb67d6(inputStreamInfo);
                    }
                });
            } else {
                this.pendingInputStreamInfo = inputStreamInfo;
                this.inputStreamRegisteredCondition.close();
                this.inputSwitcher.activeTextureManager().signalEndOfCurrentInputStream();
            }
        }
    }

    /* JADX INFO: renamed from: lambda$registerInputStream$2$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m73x7604a15(java.lang.InterruptedException interruptedException) {
        this.listener.onError(androidx.media3.common.VideoFrameProcessingException.from(interruptedException));
    }

    /* JADX INFO: renamed from: lambda$registerInputStream$3$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m74x4aeb67d6(androidx.media3.effect.DefaultVideoFrameProcessor.InputStreamInfo inputStreamInfo) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        configureEffects(inputStreamInfo, true);
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public boolean registerInputFrame() {
        androidx.media3.common.util.Assertions.checkState(!this.inputStreamEnded);
        androidx.media3.common.util.Assertions.checkStateNotNull(this.nextInputFrameInfo, "registerInputStream must be called before registering input frames");
        if (!this.inputStreamRegisteredCondition.isOpen()) {
            return false;
        }
        this.inputSwitcher.activeTextureManager().registerInputFrame(this.nextInputFrameInfo);
        return true;
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public int getPendingInputFrameCount() {
        if (this.inputSwitcher.hasActiveInput()) {
            return this.inputSwitcher.activeTextureManager().getPendingFrameCount();
        }
        return 0;
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void setOutputSurfaceInfo(androidx.media3.common.SurfaceInfo surfaceInfo) {
        this.finalShaderProgramWrapper.setOutputSurfaceInfo(surfaceInfo);
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void renderOutputFrame(final long j) {
        androidx.media3.common.util.Assertions.checkState(!this.renderFramesAutomatically, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        this.videoFrameProcessingTaskExecutor.submitWithHighPriority(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda7
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m75x31657506(j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$renderOutputFrame$4$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m75x31657506(long j) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        this.finalShaderProgramWrapper.renderOutputFrame(this.glObjectsProvider, j);
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void signalEndOfInput() {
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_VFP, androidx.media3.effect.DebugTraceUtil.EVENT_RECEIVE_END_OF_ALL_INPUT, Long.MIN_VALUE);
        androidx.media3.common.util.Assertions.checkState(!this.inputStreamEnded);
        this.inputStreamEnded = true;
        this.inputSwitcher.signalEndOfInputStream();
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void flush() {
        if (this.inputSwitcher.hasActiveInput()) {
            try {
                this.videoFrameProcessingTaskExecutor.flush();
                final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                androidx.media3.effect.TextureManager textureManagerActiveTextureManager = this.inputSwitcher.activeTextureManager();
                textureManagerActiveTextureManager.releaseAllRegisteredFrames();
                java.util.Objects.requireNonNull(countDownLatch);
                textureManagerActiveTextureManager.setOnFlushCompleteListener(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda9
                    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                    public final void run() {
                        countDownLatch.countDown();
                    }
                });
                androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = this.videoFrameProcessingTaskExecutor;
                final androidx.media3.effect.FinalShaderProgramWrapper finalShaderProgramWrapper = this.finalShaderProgramWrapper;
                java.util.Objects.requireNonNull(finalShaderProgramWrapper);
                videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda10
                    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                    public final void run() {
                        finalShaderProgramWrapper.flush();
                    }
                });
                countDownLatch.await();
                textureManagerActiveTextureManager.setOnFlushCompleteListener(null);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    @Override // androidx.media3.common.VideoFrameProcessor
    public void release() {
        try {
            this.videoFrameProcessingTaskExecutor.release(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda3
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                public final void run() {
                    this.f$0.releaseGlObjects();
                }
            });
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.lang.IllegalStateException(e);
        }
    }

    private androidx.media3.common.FrameInfo adjustForPixelWidthHeightRatio(androidx.media3.common.FrameInfo frameInfo) {
        if (frameInfo.pixelWidthHeightRatio > 1.0f) {
            return new androidx.media3.common.FrameInfo.Builder(frameInfo).setWidth((int) (frameInfo.width * frameInfo.pixelWidthHeightRatio)).setPixelWidthHeightRatio(1.0f).build();
        }
        return frameInfo.pixelWidthHeightRatio < 1.0f ? new androidx.media3.common.FrameInfo.Builder(frameInfo).setHeight((int) (frameInfo.height / frameInfo.pixelWidthHeightRatio)).setPixelWidthHeightRatio(1.0f).build() : frameInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.effect.DefaultVideoFrameProcessor createOpenGlObjectsAndFrameProcessor(android.content.Context context, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.ColorInfo colorInfo, int i, boolean z, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, java.util.concurrent.Executor executor, androidx.media3.common.VideoFrameProcessor.Listener listener, androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.effect.GlTextureProducer.Listener listener2, int i2, boolean z2, boolean z3, boolean z4) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        int[] iArr;
        android.opengl.EGLDisplay defaultEglDisplay = androidx.media3.common.util.GlUtil.getDefaultEglDisplay();
        if (androidx.media3.common.ColorInfo.isTransferHdr(colorInfo)) {
            iArr = androidx.media3.common.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
        } else {
            iArr = androidx.media3.common.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_8888;
        }
        android.opengl.EGLContext eGLContextCreateFocusedEglContextWithFallback = createFocusedEglContextWithFallback(glObjectsProvider, defaultEglDisplay, iArr);
        androidx.media3.common.ColorInfo colorInfoBuild = (androidx.media3.common.ColorInfo.isTransferHdr(colorInfo) || i == 2) ? colorInfo.buildUpon().setColorTransfer(1).setHdrStaticInfo(null).build() : colorInfo;
        java.util.Objects.requireNonNull(listener);
        return new androidx.media3.effect.DefaultVideoFrameProcessor(context, glObjectsProvider, defaultEglDisplay, eGLContextCreateFocusedEglContextWithFallback, new androidx.media3.effect.InputSwitcher(context, colorInfoBuild, glObjectsProvider, videoFrameProcessingTaskExecutor, executor, new androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda4(listener), i, z2, z3, z4), videoFrameProcessingTaskExecutor, listener, executor, new androidx.media3.effect.FinalShaderProgramWrapper(context, defaultEglDisplay, eGLContextCreateFocusedEglContextWithFallback, debugViewProvider, colorInfo, videoFrameProcessingTaskExecutor, executor, listener, listener2, i2, i, z), z, colorInfo);
    }

    private static com.google.common.collect.ImmutableList<androidx.media3.effect.GlShaderProgram> createGlShaderPrograms(android.content.Context context, java.util.List<androidx.media3.common.Effect> list, androidx.media3.common.ColorInfo colorInfo, androidx.media3.effect.FinalShaderProgramWrapper finalShaderProgramWrapper) throws androidx.media3.common.VideoFrameProcessingException {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        com.google.common.collect.ImmutableList.Builder builder2 = new com.google.common.collect.ImmutableList.Builder();
        com.google.common.collect.ImmutableList.Builder builder3 = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.common.Effect effect = list.get(i);
            androidx.media3.common.util.Assertions.checkArgument(effect instanceof androidx.media3.effect.GlEffect, "DefaultVideoFrameProcessor only supports GlEffects");
            androidx.media3.effect.GlEffect glEffect = (androidx.media3.effect.GlEffect) effect;
            if (glEffect instanceof androidx.media3.effect.GlMatrixTransformation) {
                builder2.add((androidx.media3.effect.GlMatrixTransformation) glEffect);
            } else if (glEffect instanceof androidx.media3.effect.RgbMatrix) {
                builder3.add((androidx.media3.effect.RgbMatrix) glEffect);
            } else {
                com.google.common.collect.ImmutableList immutableListBuild = builder2.build();
                com.google.common.collect.ImmutableList immutableListBuild2 = builder3.build();
                boolean zIsTransferHdr = androidx.media3.common.ColorInfo.isTransferHdr(colorInfo);
                if (!immutableListBuild.isEmpty() || !immutableListBuild2.isEmpty()) {
                    builder.add(androidx.media3.effect.DefaultShaderProgram.create(context, immutableListBuild, immutableListBuild2, zIsTransferHdr));
                    builder2 = new com.google.common.collect.ImmutableList.Builder();
                    builder3 = new com.google.common.collect.ImmutableList.Builder();
                }
                builder.add(glEffect.toGlShaderProgram(context, zIsTransferHdr));
            }
        }
        finalShaderProgramWrapper.setMatrixTransformations(builder2.build(), builder3.build());
        return builder.build();
    }

    private static void chainShaderProgramsWithListeners(androidx.media3.common.GlObjectsProvider glObjectsProvider, java.util.List<androidx.media3.effect.GlShaderProgram> list, androidx.media3.effect.FinalShaderProgramWrapper finalShaderProgramWrapper, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, androidx.media3.common.VideoFrameProcessor.Listener listener, java.util.concurrent.Executor executor) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        arrayList.add(finalShaderProgramWrapper);
        int i = 0;
        while (i < arrayList.size() - 1) {
            androidx.media3.effect.GlShaderProgram glShaderProgram = (androidx.media3.effect.GlShaderProgram) arrayList.get(i);
            i++;
            androidx.media3.effect.GlShaderProgram glShaderProgram2 = (androidx.media3.effect.GlShaderProgram) arrayList.get(i);
            androidx.media3.effect.ChainingGlShaderProgramListener chainingGlShaderProgramListener = new androidx.media3.effect.ChainingGlShaderProgramListener(glObjectsProvider, glShaderProgram, glShaderProgram2, videoFrameProcessingTaskExecutor);
            glShaderProgram.setOutputListener(chainingGlShaderProgramListener);
            java.util.Objects.requireNonNull(listener);
            glShaderProgram.setErrorListener(executor, new androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda4(listener));
            glShaderProgram2.setInputListener(chainingGlShaderProgramListener);
        }
    }

    private static java.lang.String getInputTypeString(int i) {
        if (i == 1) {
            return "Surface";
        }
        if (i == 2) {
            return "Bitmap";
        }
        if (i == 3) {
            return "Texture ID";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(i));
    }

    private void configureEffects(final androidx.media3.effect.DefaultVideoFrameProcessor.InputStreamInfo inputStreamInfo, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        checkColors(inputStreamInfo.frameInfo.colorInfo, this.outputColorInfo);
        if (z || !this.activeEffects.equals(inputStreamInfo.effects)) {
            if (!this.intermediateGlShaderPrograms.isEmpty()) {
                for (int i = 0; i < this.intermediateGlShaderPrograms.size(); i++) {
                    this.intermediateGlShaderPrograms.get(i).release();
                }
                this.intermediateGlShaderPrograms.clear();
            }
            this.intermediateGlShaderPrograms.addAll(createGlShaderPrograms(this.context, inputStreamInfo.effects, this.outputColorInfo, this.finalShaderProgramWrapper));
            this.inputSwitcher.setDownstreamShaderProgram((androidx.media3.effect.GlShaderProgram) com.google.common.collect.Iterables.getFirst(this.intermediateGlShaderPrograms, this.finalShaderProgramWrapper));
            chainShaderProgramsWithListeners(this.glObjectsProvider, this.intermediateGlShaderPrograms, this.finalShaderProgramWrapper, this.videoFrameProcessingTaskExecutor, this.listener, this.listenerExecutor);
            this.activeEffects.clear();
            this.activeEffects.addAll(inputStreamInfo.effects);
        }
        this.inputSwitcher.switchToInput(inputStreamInfo.inputType, inputStreamInfo.frameInfo);
        this.inputStreamRegisteredCondition.open();
        this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.DefaultVideoFrameProcessor$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m70x192e2b67(inputStreamInfo);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$configureEffects$5$androidx-media3-effect-DefaultVideoFrameProcessor, reason: not valid java name */
    /* synthetic */ void m70x192e2b67(androidx.media3.effect.DefaultVideoFrameProcessor.InputStreamInfo inputStreamInfo) {
        this.listener.onInputStreamRegistered(inputStreamInfo.inputType, inputStreamInfo.effects, inputStreamInfo.frameInfo);
    }

    private static void checkColors(androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.ColorInfo colorInfo2) throws androidx.media3.common.VideoFrameProcessingException {
        if (androidx.media3.common.ColorInfo.isTransferHdr(colorInfo)) {
            androidx.media3.common.util.Assertions.checkArgument(colorInfo.colorSpace == 6);
        }
        if (androidx.media3.common.ColorInfo.isTransferHdr(colorInfo) || androidx.media3.common.ColorInfo.isTransferHdr(colorInfo2)) {
            try {
                if (androidx.media3.common.util.GlUtil.getContextMajorVersion() != 3) {
                    throw new androidx.media3.common.VideoFrameProcessingException("OpenGL ES 3.0 context support is required for HDR input or output.");
                }
            } catch (androidx.media3.common.util.GlUtil.GlException e) {
                throw androidx.media3.common.VideoFrameProcessingException.from(e);
            }
        }
        androidx.media3.common.util.Assertions.checkArgument(colorInfo.isDataSpaceValid());
        androidx.media3.common.util.Assertions.checkArgument(colorInfo.colorTransfer != 1);
        androidx.media3.common.util.Assertions.checkArgument(colorInfo2.isDataSpaceValid());
        androidx.media3.common.util.Assertions.checkArgument(colorInfo2.colorTransfer != 1);
        if (androidx.media3.common.ColorInfo.isTransferHdr(colorInfo) != androidx.media3.common.ColorInfo.isTransferHdr(colorInfo2)) {
            androidx.media3.common.util.Assertions.checkArgument(isSupportedToneMapping(colorInfo, colorInfo2) || isUltraHdr(colorInfo, colorInfo2));
        }
    }

    private static boolean isSupportedToneMapping(androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.ColorInfo colorInfo2) {
        return colorInfo.colorSpace == 6 && colorInfo2.colorSpace != 6 && androidx.media3.common.ColorInfo.isTransferHdr(colorInfo) && (colorInfo2.colorTransfer == 10 || colorInfo2.colorTransfer == 3);
    }

    private static boolean isUltraHdr(androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.ColorInfo colorInfo2) {
        return colorInfo.equals(androidx.media3.common.ColorInfo.SRGB_BT709_FULL) && colorInfo2.colorSpace == 6 && androidx.media3.common.ColorInfo.isTransferHdr(colorInfo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseGlObjects() {
        try {
            try {
                this.inputSwitcher.release();
                for (int i = 0; i < this.intermediateGlShaderPrograms.size(); i++) {
                    this.intermediateGlShaderPrograms.get(i).release();
                }
                this.finalShaderProgramWrapper.release();
            } catch (java.lang.Exception e) {
                androidx.media3.common.util.Log.e(TAG, "Error releasing shader program", e);
            }
        } finally {
            try {
                androidx.media3.common.util.GlUtil.destroyEglContext(this.eglDisplay, this.eglContext);
            } catch (androidx.media3.common.util.GlUtil.GlException e2) {
                androidx.media3.common.util.Log.e(TAG, "Error releasing GL context", e2);
            }
        }
    }

    private static android.opengl.EGLContext createFocusedEglContextWithFallback(androidx.media3.common.GlObjectsProvider glObjectsProvider, android.opengl.EGLDisplay eGLDisplay, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        if (androidx.media3.common.util.Util.SDK_INT < 29) {
            return createFocusedEglContext(glObjectsProvider, eGLDisplay, 2, iArr);
        }
        try {
            return createFocusedEglContext(glObjectsProvider, eGLDisplay, 3, iArr);
        } catch (androidx.media3.common.util.GlUtil.GlException unused) {
            return createFocusedEglContext(glObjectsProvider, eGLDisplay, 2, iArr);
        }
    }

    private static android.opengl.EGLContext createFocusedEglContext(androidx.media3.common.GlObjectsProvider glObjectsProvider, android.opengl.EGLDisplay eGLDisplay, int i, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLContext eGLContextCreateEglContext = glObjectsProvider.createEglContext(eGLDisplay, i, iArr);
        glObjectsProvider.createFocusedPlaceholderEglSurface(eGLContextCreateEglContext, eGLDisplay);
        return eGLContextCreateEglContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class InputStreamInfo {
        public final java.util.List<androidx.media3.common.Effect> effects;
        public final androidx.media3.common.FrameInfo frameInfo;
        public final int inputType;

        public InputStreamInfo(int i, java.util.List<androidx.media3.common.Effect> list, androidx.media3.common.FrameInfo frameInfo) {
            this.inputType = i;
            this.effects = list;
            this.frameInfo = frameInfo;
        }
    }
}
