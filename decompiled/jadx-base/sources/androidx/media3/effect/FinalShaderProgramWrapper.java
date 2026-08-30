package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class FinalShaderProgramWrapper implements androidx.media3.effect.GlShaderProgram, androidx.media3.effect.GlTextureProducer {
    private static final int SURFACE_INPUT_CAPACITY = 1;
    private static final java.lang.String TAG = "FinalShaderWrapper";
    private final android.content.Context context;
    private android.view.SurfaceView debugSurfaceView;
    private androidx.media3.effect.FinalShaderProgramWrapper.SurfaceViewWrapper debugSurfaceViewWrapper;
    private final androidx.media3.common.DebugViewProvider debugViewProvider;
    private androidx.media3.effect.DefaultShaderProgram defaultShaderProgram;
    private final android.opengl.EGLContext eglContext;
    private final android.opengl.EGLDisplay eglDisplay;
    private int inputHeight;
    private int inputWidth;
    private boolean isInputStreamEndedWithPendingAvailableFrames;
    private boolean matrixTransformationsChanged;
    private androidx.media3.effect.FinalShaderProgramWrapper.OnInputStreamProcessedListener onInputStreamProcessedListener;
    private final androidx.media3.common.ColorInfo outputColorInfo;
    private android.opengl.EGLSurface outputEglSurface;
    private int outputHeight;
    private androidx.media3.common.util.Size outputSizeBeforeSurfaceTransformation;
    private androidx.media3.common.SurfaceInfo outputSurfaceInfo;
    private boolean outputSurfaceInfoChanged;
    private final androidx.media3.effect.TexturePool outputTexturePool;
    private final androidx.media3.common.util.LongArrayQueue outputTextureTimestamps;
    private int outputWidth;
    private final boolean renderFramesAutomatically;
    private final int sdrWorkingColorSpace;
    private final androidx.media3.common.util.LongArrayQueue syncObjects;
    private final androidx.media3.effect.GlTextureProducer.Listener textureOutputListener;
    private final androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;
    private final androidx.media3.common.VideoFrameProcessor.Listener videoFrameProcessorListener;
    private final java.util.concurrent.Executor videoFrameProcessorListenerExecutor;
    private final java.util.List<androidx.media3.effect.GlMatrixTransformation> matrixTransformations = new java.util.ArrayList();
    private final java.util.List<androidx.media3.effect.RgbMatrix> rgbMatrices = new java.util.ArrayList();
    private androidx.media3.effect.GlShaderProgram.InputListener inputListener = new androidx.media3.effect.GlShaderProgram.InputListener() { // from class: androidx.media3.effect.FinalShaderProgramWrapper.1
    };
    private final java.util.Queue<android.util.Pair<androidx.media3.common.GlTextureInfo, java.lang.Long>> availableFrames = new java.util.concurrent.ConcurrentLinkedQueue();

    interface OnInputStreamProcessedListener {
        void onInputStreamProcessed();
    }

    public FinalShaderProgramWrapper(android.content.Context context, android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.ColorInfo colorInfo, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, java.util.concurrent.Executor executor, androidx.media3.common.VideoFrameProcessor.Listener listener, androidx.media3.effect.GlTextureProducer.Listener listener2, int i, int i2, boolean z) {
        this.context = context;
        this.eglDisplay = eGLDisplay;
        this.eglContext = eGLContext;
        this.debugViewProvider = debugViewProvider;
        this.outputColorInfo = colorInfo;
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
        this.videoFrameProcessorListenerExecutor = executor;
        this.videoFrameProcessorListener = listener;
        this.textureOutputListener = listener2;
        this.sdrWorkingColorSpace = i2;
        this.renderFramesAutomatically = z;
        this.outputTexturePool = new androidx.media3.effect.TexturePool(androidx.media3.common.ColorInfo.isTransferHdr(colorInfo), i);
        this.outputTextureTimestamps = new androidx.media3.common.util.LongArrayQueue(i);
        this.syncObjects = new androidx.media3.common.util.LongArrayQueue(i);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setInputListener(androidx.media3.effect.GlShaderProgram.InputListener inputListener) {
        this.inputListener = inputListener;
        for (int i = 0; i < getInputCapacity(); i++) {
            inputListener.onReadyToAcceptInputFrame();
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setOutputListener(androidx.media3.effect.GlShaderProgram.OutputListener outputListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setErrorListener(java.util.concurrent.Executor executor, androidx.media3.effect.GlShaderProgram.ErrorListener errorListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void setOnInputStreamProcessedListener(androidx.media3.effect.FinalShaderProgramWrapper.OnInputStreamProcessedListener onInputStreamProcessedListener) {
        this.onInputStreamProcessedListener = onInputStreamProcessedListener;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void signalEndOfCurrentInputStream() {
        if (this.availableFrames.isEmpty()) {
            ((androidx.media3.effect.FinalShaderProgramWrapper.OnInputStreamProcessedListener) androidx.media3.common.util.Assertions.checkNotNull(this.onInputStreamProcessedListener)).onInputStreamProcessed();
            this.isInputStreamEndedWithPendingAvailableFrames = false;
        } else {
            androidx.media3.common.util.Assertions.checkState(!this.renderFramesAutomatically);
            this.isInputStreamEndedWithPendingAvailableFrames = true;
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void queueInputFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, final long j) {
        this.videoFrameProcessorListenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m90xc3ae7029(j);
            }
        });
        if (this.textureOutputListener == null) {
            if (this.renderFramesAutomatically) {
                renderFrame(glObjectsProvider, glTextureInfo, j, j * 1000);
            } else {
                this.availableFrames.add(android.util.Pair.create(glTextureInfo, java.lang.Long.valueOf(j)));
            }
            this.inputListener.onReadyToAcceptInputFrame();
            return;
        }
        androidx.media3.common.util.Assertions.checkState(this.outputTexturePool.freeTextureCount() > 0);
        renderFrame(glObjectsProvider, glTextureInfo, j, j * 1000);
    }

    /* JADX INFO: renamed from: lambda$queueInputFrame$0$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m90xc3ae7029(long j) {
        this.videoFrameProcessorListener.onOutputFrameAvailableForRendering(j);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void releaseOutputFrame(androidx.media3.common.GlTextureInfo glTextureInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.effect.GlTextureProducer
    public void releaseOutputTexture(final long j) {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda4
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m91x4945a9af(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: releaseOutputTextureInternal, reason: merged with bridge method [inline-methods] */
    public void m91x4945a9af(long j) throws androidx.media3.common.util.GlUtil.GlException {
        androidx.media3.common.util.Assertions.checkState(this.textureOutputListener != null);
        while (this.outputTexturePool.freeTextureCount() < this.outputTexturePool.capacity() && this.outputTextureTimestamps.element() <= j) {
            this.outputTexturePool.freeTexture();
            this.outputTextureTimestamps.remove();
            androidx.media3.common.util.GlUtil.deleteSyncObject(this.syncObjects.remove());
            this.inputListener.onReadyToAcceptInputFrame();
        }
    }

    public void setMatrixTransformations(java.util.List<androidx.media3.effect.GlMatrixTransformation> list, java.util.List<androidx.media3.effect.RgbMatrix> list2) {
        this.matrixTransformations.clear();
        this.matrixTransformations.addAll(list);
        this.rgbMatrices.clear();
        this.rgbMatrices.addAll(list2);
        this.matrixTransformationsChanged = true;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void flush() {
        if (this.textureOutputListener != null) {
            this.outputTexturePool.freeAllTextures();
            this.outputTextureTimestamps.clear();
            this.syncObjects.clear();
        }
        this.availableFrames.clear();
        this.isInputStreamEndedWithPendingAvailableFrames = false;
        androidx.media3.effect.DefaultShaderProgram defaultShaderProgram = this.defaultShaderProgram;
        if (defaultShaderProgram != null) {
            defaultShaderProgram.flush();
        }
        this.inputListener.onFlush();
        for (int i = 0; i < getInputCapacity(); i++) {
            this.inputListener.onReadyToAcceptInputFrame();
        }
    }

    private int getInputCapacity() {
        if (this.textureOutputListener == null) {
            return 1;
        }
        return this.outputTexturePool.freeTextureCount();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public synchronized void release() throws androidx.media3.common.VideoFrameProcessingException {
        androidx.media3.effect.DefaultShaderProgram defaultShaderProgram = this.defaultShaderProgram;
        if (defaultShaderProgram != null) {
            defaultShaderProgram.release();
        }
        try {
            this.outputTexturePool.deleteAllTextures();
            androidx.media3.common.util.GlUtil.destroyEglSurface(this.eglDisplay, this.outputEglSurface);
            androidx.media3.common.util.GlUtil.checkGlError();
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    public void renderOutputFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, long j) {
        if (this.textureOutputListener != null) {
            return;
        }
        androidx.media3.common.util.Assertions.checkState(!this.renderFramesAutomatically);
        android.util.Pair<androidx.media3.common.GlTextureInfo, java.lang.Long> pairRemove = this.availableFrames.remove();
        renderFrame(glObjectsProvider, (androidx.media3.common.GlTextureInfo) pairRemove.first, ((java.lang.Long) pairRemove.second).longValue(), j);
        if (this.availableFrames.isEmpty() && this.isInputStreamEndedWithPendingAvailableFrames) {
            ((androidx.media3.effect.FinalShaderProgramWrapper.OnInputStreamProcessedListener) androidx.media3.common.util.Assertions.checkNotNull(this.onInputStreamProcessedListener)).onInputStreamProcessed();
            this.isInputStreamEndedWithPendingAvailableFrames = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    public synchronized void setOutputSurfaceInfo(androidx.media3.common.SurfaceInfo surfaceInfo) {
        androidx.media3.common.SurfaceInfo surfaceInfo2;
        boolean z;
        androidx.media3.common.SurfaceInfo surfaceInfo3;
        if (this.textureOutputListener != null) {
            return;
        }
        if (androidx.media3.common.util.Util.areEqual(this.outputSurfaceInfo, surfaceInfo)) {
            return;
        }
        if (surfaceInfo != null && (surfaceInfo3 = this.outputSurfaceInfo) != null && !surfaceInfo3.surface.equals(surfaceInfo.surface)) {
            try {
                androidx.media3.common.util.GlUtil.destroyEglSurface(this.eglDisplay, this.outputEglSurface);
            } catch (androidx.media3.common.util.GlUtil.GlException e) {
                this.videoFrameProcessorListenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m94xc87a44c9(e);
                    }
                });
            }
            this.outputEglSurface = null;
            surfaceInfo2 = this.outputSurfaceInfo;
            if (surfaceInfo2 == null) {
                z = true;
            } else {
                z = true;
            }
            this.outputSurfaceInfoChanged = z;
            this.outputSurfaceInfo = surfaceInfo;
            return;
        }
        surfaceInfo2 = this.outputSurfaceInfo;
        if (surfaceInfo2 == null && surfaceInfo != null && surfaceInfo2.width == surfaceInfo.width && this.outputSurfaceInfo.height == surfaceInfo.height && this.outputSurfaceInfo.orientationDegrees == surfaceInfo.orientationDegrees) {
            z = false;
        } else {
            z = true;
        }
        this.outputSurfaceInfoChanged = z;
        this.outputSurfaceInfo = surfaceInfo;
        return;
        throw th;
    }

    /* JADX INFO: renamed from: lambda$setOutputSurfaceInfo$2$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m94xc87a44c9(androidx.media3.common.util.GlUtil.GlException glException) {
        this.videoFrameProcessorListener.onError(androidx.media3.common.VideoFrameProcessingException.from(glException));
    }

    private synchronized void renderFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, final long j, long j2) {
        try {
            if (j2 != -2) {
                try {
                    if (ensureConfigured(glObjectsProvider, glTextureInfo.width, glTextureInfo.height)) {
                        if (this.outputSurfaceInfo != null) {
                            renderFrameToOutputSurface(glTextureInfo, j, j2);
                        } else if (this.textureOutputListener != null) {
                            renderFrameToOutputTexture(glTextureInfo, j);
                        }
                        if (this.debugSurfaceViewWrapper != null && this.defaultShaderProgram != null) {
                            renderFrameToDebugSurface(glObjectsProvider, glTextureInfo, j);
                        }
                        this.inputListener.onInputFrameProcessed(glTextureInfo);
                        return;
                    }
                } catch (androidx.media3.common.VideoFrameProcessingException | androidx.media3.common.util.GlUtil.GlException e) {
                    this.videoFrameProcessorListenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m92x93ad1e63(e, j);
                        }
                    });
                }
            }
            this.inputListener.onInputFrameProcessed(glTextureInfo);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: lambda$renderFrame$3$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m92x93ad1e63(java.lang.Exception exc, long j) {
        this.videoFrameProcessorListener.onError(androidx.media3.common.VideoFrameProcessingException.from(exc, j));
    }

    private synchronized void renderFrameToOutputSurface(androidx.media3.common.GlTextureInfo glTextureInfo, long j, long j2) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLSurface eGLSurface = (android.opengl.EGLSurface) androidx.media3.common.util.Assertions.checkNotNull(this.outputEglSurface);
        androidx.media3.common.SurfaceInfo surfaceInfo = (androidx.media3.common.SurfaceInfo) androidx.media3.common.util.Assertions.checkNotNull(this.outputSurfaceInfo);
        androidx.media3.effect.DefaultShaderProgram defaultShaderProgram = (androidx.media3.effect.DefaultShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.defaultShaderProgram);
        androidx.media3.common.util.GlUtil.focusEglSurface(this.eglDisplay, this.eglContext, eGLSurface, surfaceInfo.width, surfaceInfo.height);
        androidx.media3.common.util.GlUtil.clearFocusedBuffers();
        defaultShaderProgram.drawFrame(glTextureInfo.texId, j);
        android.opengl.EGLDisplay eGLDisplay = this.eglDisplay;
        if (j2 == -1) {
            j2 = java.lang.System.nanoTime();
        }
        android.opengl.EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j2);
        android.opengl.EGL14.eglSwapBuffers(this.eglDisplay, eGLSurface);
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_VFP, androidx.media3.effect.DebugTraceUtil.EVENT_RENDERED_TO_OUTPUT_SURFACE, j);
    }

    private void renderFrameToOutputTexture(androidx.media3.common.GlTextureInfo glTextureInfo, long j) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        androidx.media3.common.GlTextureInfo glTextureInfoUseTexture = this.outputTexturePool.useTexture();
        this.outputTextureTimestamps.add(j);
        androidx.media3.common.util.GlUtil.focusFramebufferUsingCurrentContext(glTextureInfoUseTexture.fboId, glTextureInfoUseTexture.width, glTextureInfoUseTexture.height);
        androidx.media3.common.util.GlUtil.clearFocusedBuffers();
        ((androidx.media3.effect.DefaultShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.defaultShaderProgram)).drawFrame(glTextureInfo.texId, j);
        long jCreateGlSyncFence = androidx.media3.common.util.GlUtil.createGlSyncFence();
        this.syncObjects.add(jCreateGlSyncFence);
        ((androidx.media3.effect.GlTextureProducer.Listener) androidx.media3.common.util.Assertions.checkNotNull(this.textureOutputListener)).onTextureRendered(this, glTextureInfoUseTexture, j, jCreateGlSyncFence);
    }

    private synchronized boolean ensureConfigured(androidx.media3.common.GlObjectsProvider glObjectsProvider, int i, int i2) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        int width;
        int height;
        boolean z = (this.inputWidth == i && this.inputHeight == i2 && this.outputSizeBeforeSurfaceTransformation != null) ? false : true;
        if (z) {
            this.inputWidth = i;
            this.inputHeight = i2;
            final androidx.media3.common.util.Size sizeConfigureAndGetOutputSize = androidx.media3.effect.MatrixUtils.configureAndGetOutputSize(i, i2, this.matrixTransformations);
            if (!androidx.media3.common.util.Util.areEqual(this.outputSizeBeforeSurfaceTransformation, sizeConfigureAndGetOutputSize)) {
                this.outputSizeBeforeSurfaceTransformation = sizeConfigureAndGetOutputSize;
                this.videoFrameProcessorListenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m89x40df21e3(sizeConfigureAndGetOutputSize);
                    }
                });
            }
        }
        androidx.media3.common.util.Assertions.checkNotNull(this.outputSizeBeforeSurfaceTransformation);
        if (this.outputSurfaceInfo == null) {
            androidx.media3.common.util.GlUtil.destroyEglSurface(this.eglDisplay, this.outputEglSurface);
            this.outputEglSurface = null;
        }
        androidx.media3.common.SurfaceInfo surfaceInfo = this.outputSurfaceInfo;
        if (surfaceInfo == null && this.textureOutputListener == null) {
            androidx.media3.effect.DefaultShaderProgram defaultShaderProgram = this.defaultShaderProgram;
            if (defaultShaderProgram != null) {
                defaultShaderProgram.release();
                this.defaultShaderProgram = null;
            }
            androidx.media3.common.util.Log.w(TAG, "Output surface and size not set, dropping frame.");
            return false;
        }
        if (surfaceInfo == null) {
            width = this.outputSizeBeforeSurfaceTransformation.getWidth();
        } else {
            width = surfaceInfo.width;
        }
        this.outputWidth = width;
        androidx.media3.common.SurfaceInfo surfaceInfo2 = this.outputSurfaceInfo;
        if (surfaceInfo2 == null) {
            height = this.outputSizeBeforeSurfaceTransformation.getHeight();
        } else {
            height = surfaceInfo2.height;
        }
        this.outputHeight = height;
        androidx.media3.common.SurfaceInfo surfaceInfo3 = this.outputSurfaceInfo;
        if (surfaceInfo3 != null && this.outputEglSurface == null) {
            this.outputEglSurface = glObjectsProvider.createEglSurface(this.eglDisplay, surfaceInfo3.surface, this.outputColorInfo.colorTransfer, this.renderFramesAutomatically);
        }
        if (this.textureOutputListener != null) {
            this.outputTexturePool.ensureConfigured(glObjectsProvider, this.outputWidth, this.outputHeight);
        }
        android.view.SurfaceView debugPreviewSurfaceView = this.debugViewProvider.getDebugPreviewSurfaceView(this.outputWidth, this.outputHeight);
        if (debugPreviewSurfaceView != null && !androidx.media3.common.util.Util.areEqual(this.debugSurfaceView, debugPreviewSurfaceView)) {
            this.debugSurfaceViewWrapper = new androidx.media3.effect.FinalShaderProgramWrapper.SurfaceViewWrapper(this.eglDisplay, this.eglContext, debugPreviewSurfaceView, this.outputColorInfo.colorTransfer);
        }
        this.debugSurfaceView = debugPreviewSurfaceView;
        androidx.media3.effect.DefaultShaderProgram defaultShaderProgram2 = this.defaultShaderProgram;
        if (defaultShaderProgram2 != null && (this.outputSurfaceInfoChanged || z || this.matrixTransformationsChanged)) {
            defaultShaderProgram2.release();
            this.defaultShaderProgram = null;
            this.outputSurfaceInfoChanged = false;
            this.matrixTransformationsChanged = false;
        }
        if (this.defaultShaderProgram == null) {
            androidx.media3.common.SurfaceInfo surfaceInfo4 = this.outputSurfaceInfo;
            this.defaultShaderProgram = createDefaultShaderProgram(surfaceInfo4 == null ? 0 : surfaceInfo4.orientationDegrees, this.outputWidth, this.outputHeight);
            this.outputSurfaceInfoChanged = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: lambda$ensureConfigured$4$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m89x40df21e3(androidx.media3.common.util.Size size) {
        this.videoFrameProcessorListener.onOutputSizeChanged(size.getWidth(), size.getHeight());
    }

    private synchronized androidx.media3.effect.DefaultShaderProgram createDefaultShaderProgram(int i, int i2, int i3) throws androidx.media3.common.VideoFrameProcessingException {
        androidx.media3.effect.DefaultShaderProgram defaultShaderProgramCreateApplyingOetf;
        com.google.common.collect.ImmutableList.Builder builderAddAll = new com.google.common.collect.ImmutableList.Builder().addAll((java.lang.Iterable) this.matrixTransformations);
        if (i != 0) {
            builderAddAll.add(new androidx.media3.effect.ScaleAndRotateTransformation.Builder().setRotationDegrees(i).build());
        }
        builderAddAll.add(androidx.media3.effect.Presentation.createForWidthAndHeight(i2, i3, 0));
        defaultShaderProgramCreateApplyingOetf = androidx.media3.effect.DefaultShaderProgram.createApplyingOetf(this.context, builderAddAll.build(), this.rgbMatrices, this.outputColorInfo, this.sdrWorkingColorSpace);
        androidx.media3.common.util.Size sizeConfigure = defaultShaderProgramCreateApplyingOetf.configure(this.inputWidth, this.inputHeight);
        androidx.media3.common.SurfaceInfo surfaceInfo = this.outputSurfaceInfo;
        if (surfaceInfo != null) {
            androidx.media3.common.SurfaceInfo surfaceInfo2 = (androidx.media3.common.SurfaceInfo) androidx.media3.common.util.Assertions.checkNotNull(surfaceInfo);
            androidx.media3.common.util.Assertions.checkState(sizeConfigure.getWidth() == surfaceInfo2.width);
            androidx.media3.common.util.Assertions.checkState(sizeConfigure.getHeight() == surfaceInfo2.height);
        }
        return defaultShaderProgramCreateApplyingOetf;
    }

    private void renderFrameToDebugSurface(androidx.media3.common.GlObjectsProvider glObjectsProvider, final androidx.media3.common.GlTextureInfo glTextureInfo, final long j) {
        final androidx.media3.effect.DefaultShaderProgram defaultShaderProgram = (androidx.media3.effect.DefaultShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.defaultShaderProgram);
        final androidx.media3.effect.FinalShaderProgramWrapper.SurfaceViewWrapper surfaceViewWrapper = (androidx.media3.effect.FinalShaderProgramWrapper.SurfaceViewWrapper) androidx.media3.common.util.Assertions.checkNotNull(this.debugSurfaceViewWrapper);
        try {
            ((androidx.media3.effect.FinalShaderProgramWrapper.SurfaceViewWrapper) androidx.media3.common.util.Assertions.checkNotNull(surfaceViewWrapper)).maybeRenderToSurfaceView(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.FinalShaderProgramWrapper$$ExternalSyntheticLambda3
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                    this.f$0.m93x1fec90ec(defaultShaderProgram, surfaceViewWrapper, glTextureInfo, j);
                }
            }, glObjectsProvider);
        } catch (androidx.media3.common.VideoFrameProcessingException | androidx.media3.common.util.GlUtil.GlException e) {
            androidx.media3.common.util.Log.d(TAG, "Error rendering to debug preview", e);
        }
    }

    /* JADX INFO: renamed from: lambda$renderFrameToDebugSurface$5$androidx-media3-effect-FinalShaderProgramWrapper, reason: not valid java name */
    /* synthetic */ void m93x1fec90ec(androidx.media3.effect.DefaultShaderProgram defaultShaderProgram, androidx.media3.effect.FinalShaderProgramWrapper.SurfaceViewWrapper surfaceViewWrapper, androidx.media3.common.GlTextureInfo glTextureInfo, long j) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        androidx.media3.common.util.GlUtil.clearFocusedBuffers();
        if (this.sdrWorkingColorSpace == 2) {
            int outputColorTransfer = defaultShaderProgram.getOutputColorTransfer();
            defaultShaderProgram.setOutputColorTransfer(surfaceViewWrapper.outputColorTransfer);
            defaultShaderProgram.drawFrame(glTextureInfo.texId, j);
            defaultShaderProgram.setOutputColorTransfer(outputColorTransfer);
            return;
        }
        defaultShaderProgram.drawFrame(glTextureInfo.texId, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class SurfaceViewWrapper implements android.view.SurfaceHolder.Callback {
        private final android.opengl.EGLContext eglContext;
        private final android.opengl.EGLDisplay eglDisplay;
        private android.opengl.EGLSurface eglSurface;
        private int height;
        public final int outputColorTransfer;
        private android.view.Surface surface;
        private int width;

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        }

        public SurfaceViewWrapper(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.view.SurfaceView surfaceView, int i) {
            this.eglDisplay = eGLDisplay;
            this.eglContext = eGLContext;
            if (i == 7 && androidx.media3.common.util.Util.SDK_INT < 34) {
                i = 6;
            }
            this.outputColorTransfer = i;
            surfaceView.getHolder().addCallback(this);
            this.surface = surfaceView.getHolder().getSurface();
            this.width = surfaceView.getWidth();
            this.height = surfaceView.getHeight();
        }

        @Override // android.view.SurfaceHolder.Callback
        public synchronized void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.width = i2;
            this.height = i3;
            android.view.Surface surface = surfaceHolder.getSurface();
            android.view.Surface surface2 = this.surface;
            if (surface2 == null || !surface2.equals(surface)) {
                this.surface = surface;
                this.eglSurface = null;
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public synchronized void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
            this.surface = null;
            this.eglSurface = null;
            this.width = -1;
            this.height = -1;
        }

        public synchronized void maybeRenderToSurfaceView(androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task task, androidx.media3.common.GlObjectsProvider glObjectsProvider) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
            android.view.Surface surface = this.surface;
            if (surface == null) {
                return;
            }
            if (this.eglSurface == null) {
                this.eglSurface = glObjectsProvider.createEglSurface(this.eglDisplay, surface, this.outputColorTransfer, false);
            }
            android.opengl.EGLSurface eGLSurface = this.eglSurface;
            androidx.media3.common.util.GlUtil.focusEglSurface(this.eglDisplay, this.eglContext, eGLSurface, this.width, this.height);
            task.run();
            android.opengl.EGL14.eglSwapBuffers(this.eglDisplay, eGLSurface);
            android.opengl.GLES20.glFinish();
        }
    }
}
