package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultVideoCompositor implements androidx.media3.effect.VideoCompositor {
    private static final java.lang.String TAG = "DefaultVideoCompositor";
    private static final java.lang.String THREAD_NAME = "Effect:DefaultVideoCompositor:GlThread";
    private boolean allInputsEnded;
    private final androidx.media3.effect.DefaultVideoCompositor.CompositorGlProgram compositorGlProgram;
    private androidx.media3.common.ColorInfo configuredColorInfo;
    private android.opengl.EGLContext eglContext;
    private android.opengl.EGLDisplay eglDisplay;
    private final androidx.media3.common.GlObjectsProvider glObjectsProvider;
    private final androidx.media3.effect.VideoCompositor.Listener listener;
    private final androidx.media3.effect.TexturePool outputTexturePool;
    private final androidx.media3.common.util.LongArrayQueue outputTextureTimestamps;
    private android.opengl.EGLSurface placeholderEglSurface;
    private final androidx.media3.effect.VideoCompositorSettings settings;
    private final androidx.media3.common.util.LongArrayQueue syncObjects;
    private final androidx.media3.effect.GlTextureProducer.Listener textureOutputListener;
    private final androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;
    private int primaryInputIndex = -1;
    private final android.util.SparseArray<androidx.media3.effect.DefaultVideoCompositor.InputSource> inputSources = new android.util.SparseArray<>();

    private static final class InputSource {
        public final java.util.Queue<androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo> frameInfos = new java.util.ArrayDeque();
        public boolean isInputEnded;
    }

    public DefaultVideoCompositor(android.content.Context context, androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, java.util.concurrent.ExecutorService executorService, final androidx.media3.effect.VideoCompositor.Listener listener, androidx.media3.effect.GlTextureProducer.Listener listener2, int i) {
        this.listener = listener;
        this.textureOutputListener = listener2;
        this.glObjectsProvider = glObjectsProvider;
        this.settings = videoCompositorSettings;
        this.compositorGlProgram = new androidx.media3.effect.DefaultVideoCompositor.CompositorGlProgram(context);
        this.outputTexturePool = new androidx.media3.effect.TexturePool(false, i);
        this.outputTextureTimestamps = new androidx.media3.common.util.LongArrayQueue(i);
        this.syncObjects = new androidx.media3.common.util.LongArrayQueue(i);
        boolean z = executorService == null;
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = z ? androidx.media3.common.util.Util.newSingleThreadExecutor(THREAD_NAME) : (java.util.concurrent.ExecutorService) androidx.media3.common.util.Assertions.checkNotNull(executorService);
        java.util.Objects.requireNonNull(listener);
        androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor = new androidx.media3.effect.VideoFrameProcessingTaskExecutor(executorServiceNewSingleThreadExecutor, z, new androidx.media3.effect.VideoFrameProcessingTaskExecutor.ErrorListener() { // from class: androidx.media3.effect.DefaultVideoCompositor$$ExternalSyntheticLambda4
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.ErrorListener
            public final void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
                listener.onError(videoFrameProcessingException);
            }
        });
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
        videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoCompositor$$ExternalSyntheticLambda5
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.util.GlUtil.GlException {
                this.f$0.setupGlObjects();
            }
        });
    }

    @Override // androidx.media3.effect.VideoCompositor
    public synchronized void registerInputSource(int i) {
        androidx.media3.common.util.Assertions.checkState(!androidx.media3.common.util.Util.contains(this.inputSources, i));
        this.inputSources.put(i, new androidx.media3.effect.DefaultVideoCompositor.InputSource());
        if (this.primaryInputIndex == -1) {
            this.primaryInputIndex = i;
        }
    }

    @Override // androidx.media3.effect.VideoCompositor
    public synchronized void signalEndOfInputSource(int i) {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.inputSources, i));
        boolean z = false;
        androidx.media3.common.util.Assertions.checkState(this.primaryInputIndex != -1);
        this.inputSources.get(i).isInputEnded = true;
        int i2 = 0;
        while (true) {
            if (i2 >= this.inputSources.size()) {
                z = true;
                break;
            } else if (!this.inputSources.valueAt(i2).isInputEnded) {
                break;
            } else {
                i2++;
            }
        }
        this.allInputsEnded = z;
        if (this.inputSources.get(this.primaryInputIndex).frameInfos.isEmpty()) {
            if (i == this.primaryInputIndex) {
                releaseExcessFramesInAllSecondaryStreams();
            }
            if (z) {
                this.listener.onEnded();
                return;
            }
        }
        if (i != this.primaryInputIndex && this.inputSources.get(i).frameInfos.size() == 1) {
            this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.DefaultVideoCompositor$$ExternalSyntheticLambda1(this));
        }
    }

    @Override // androidx.media3.effect.VideoCompositor
    public synchronized void queueInputTexture(int i, androidx.media3.effect.GlTextureProducer glTextureProducer, androidx.media3.common.GlTextureInfo glTextureInfo, androidx.media3.common.ColorInfo colorInfo, long j) {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.inputSources, i));
        androidx.media3.effect.DefaultVideoCompositor.InputSource inputSource = this.inputSources.get(i);
        boolean z = true;
        androidx.media3.common.util.Assertions.checkState(!inputSource.isInputEnded);
        if (androidx.media3.common.ColorInfo.isTransferHdr(colorInfo)) {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkStateNotNull(java.lang.Boolean.valueOf(z), "HDR input is not supported.");
        if (this.configuredColorInfo == null) {
            this.configuredColorInfo = colorInfo;
        }
        androidx.media3.common.util.Assertions.checkState(this.configuredColorInfo.equals(colorInfo), "Mixing different ColorInfos is not supported.");
        inputSource.frameInfos.add(new androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo(glTextureProducer, glTextureInfo, j, this.settings.getOverlaySettings(i, j)));
        if (i == this.primaryInputIndex) {
            releaseExcessFramesInAllSecondaryStreams();
        } else {
            releaseExcessFramesInSecondaryStream(inputSource);
        }
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.DefaultVideoCompositor$$ExternalSyntheticLambda1(this));
    }

    @Override // androidx.media3.effect.VideoCompositor
    public synchronized void release() {
        androidx.media3.common.util.Assertions.checkState(this.allInputsEnded);
        try {
            this.videoFrameProcessingTaskExecutor.release(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoCompositor$$ExternalSyntheticLambda0
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

    @Override // androidx.media3.effect.GlTextureProducer
    public void releaseOutputTexture(final long j) {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.DefaultVideoCompositor$$ExternalSyntheticLambda3
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m68xf71d0bd5(j);
            }
        });
    }

    private synchronized void releaseExcessFramesInAllSecondaryStreams() {
        for (int i = 0; i < this.inputSources.size(); i++) {
            if (this.inputSources.keyAt(i) != this.primaryInputIndex) {
                releaseExcessFramesInSecondaryStream(this.inputSources.valueAt(i));
            }
        }
    }

    private synchronized void releaseExcessFramesInSecondaryStream(androidx.media3.effect.DefaultVideoCompositor.InputSource inputSource) {
        androidx.media3.effect.DefaultVideoCompositor.InputSource inputSource2 = this.inputSources.get(this.primaryInputIndex);
        if (inputSource2.frameInfos.isEmpty() && inputSource2.isInputEnded) {
            releaseFrames(inputSource, inputSource.frameInfos.size());
            return;
        }
        androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo inputFrameInfoPeek = inputSource2.frameInfos.peek();
        final long j = inputFrameInfoPeek != null ? inputFrameInfoPeek.presentationTimeUs : androidx.media3.common.C.TIME_UNSET;
        releaseFrames(inputSource, java.lang.Math.max(com.google.common.collect.Iterables.size(com.google.common.collect.Iterables.filter(inputSource.frameInfos, new com.google.common.base.Predicate() { // from class: androidx.media3.effect.DefaultVideoCompositor$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                return androidx.media3.effect.DefaultVideoCompositor.lambda$releaseExcessFramesInSecondaryStream$1(j, (androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo) obj);
            }
        })) - 1, 0));
    }

    static /* synthetic */ boolean lambda$releaseExcessFramesInSecondaryStream$1(long j, androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo inputFrameInfo) {
        return inputFrameInfo.presentationTimeUs <= j;
    }

    private synchronized void releaseFrames(androidx.media3.effect.DefaultVideoCompositor.InputSource inputSource, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo inputFrameInfoRemove = inputSource.frameInfos.remove();
            inputFrameInfoRemove.textureProducer.releaseOutputTexture(inputFrameInfoRemove.presentationTimeUs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupGlObjects() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLDisplay defaultEglDisplay = androidx.media3.common.util.GlUtil.getDefaultEglDisplay();
        this.eglDisplay = defaultEglDisplay;
        android.opengl.EGLContext eGLContextCreateEglContext = this.glObjectsProvider.createEglContext(defaultEglDisplay, 2, androidx.media3.common.util.GlUtil.EGL_CONFIG_ATTRIBUTES_RGBA_8888);
        this.eglContext = eGLContextCreateEglContext;
        this.placeholderEglSurface = this.glObjectsProvider.createFocusedPlaceholderEglSurface(eGLContextCreateEglContext, this.eglDisplay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void maybeComposite() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        com.google.common.collect.ImmutableList<androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo> framesToComposite = getFramesToComposite();
        if (framesToComposite.isEmpty()) {
            return;
        }
        androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo inputFrameInfo = framesToComposite.get(this.primaryInputIndex);
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < framesToComposite.size(); i++) {
            androidx.media3.common.GlTextureInfo glTextureInfo = framesToComposite.get(i).texture;
            builder.add(new androidx.media3.common.util.Size(glTextureInfo.width, glTextureInfo.height));
        }
        androidx.media3.common.util.Size outputSize = this.settings.getOutputSize(builder.build());
        this.outputTexturePool.ensureConfigured(this.glObjectsProvider, outputSize.getWidth(), outputSize.getHeight());
        androidx.media3.common.GlTextureInfo glTextureInfoUseTexture = this.outputTexturePool.useTexture();
        long j = inputFrameInfo.presentationTimeUs;
        this.outputTextureTimestamps.add(j);
        this.compositorGlProgram.drawFrame(framesToComposite, glTextureInfoUseTexture);
        long jCreateGlSyncFence = androidx.media3.common.util.GlUtil.createGlSyncFence();
        this.syncObjects.add(jCreateGlSyncFence);
        this.textureOutputListener.onTextureRendered(this, glTextureInfoUseTexture, j, jCreateGlSyncFence);
        androidx.media3.effect.DefaultVideoCompositor.InputSource inputSource = this.inputSources.get(this.primaryInputIndex);
        releaseFrames(inputSource, 1);
        releaseExcessFramesInAllSecondaryStreams();
        if (this.allInputsEnded && inputSource.frameInfos.isEmpty()) {
            this.listener.onEnded();
        }
    }

    private synchronized com.google.common.collect.ImmutableList<androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo> getFramesToComposite() {
        if (this.outputTexturePool.freeTextureCount() == 0) {
            return com.google.common.collect.ImmutableList.of();
        }
        for (int i = 0; i < this.inputSources.size(); i++) {
            if (this.inputSources.valueAt(i).frameInfos.isEmpty()) {
                return com.google.common.collect.ImmutableList.of();
            }
        }
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo inputFrameInfoElement = this.inputSources.get(this.primaryInputIndex).frameInfos.element();
        builder.add(inputFrameInfoElement);
        for (int i2 = 0; i2 < this.inputSources.size(); i2++) {
            if (this.inputSources.keyAt(i2) != this.primaryInputIndex) {
                androidx.media3.effect.DefaultVideoCompositor.InputSource inputSourceValueAt = this.inputSources.valueAt(i2);
                if (inputSourceValueAt.frameInfos.size() == 1 && !inputSourceValueAt.isInputEnded) {
                    return com.google.common.collect.ImmutableList.of();
                }
                java.util.Iterator<androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo> it = inputSourceValueAt.frameInfos.iterator();
                long j = Long.MAX_VALUE;
                androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo inputFrameInfo = null;
                while (it.hasNext()) {
                    androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo next = it.next();
                    long j2 = next.presentationTimeUs;
                    long jAbs = java.lang.Math.abs(j2 - inputFrameInfoElement.presentationTimeUs);
                    if (jAbs < j) {
                        inputFrameInfo = next;
                        j = jAbs;
                    }
                    if (j2 > inputFrameInfoElement.presentationTimeUs || (!it.hasNext() && inputSourceValueAt.isInputEnded)) {
                        builder.add((androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo) androidx.media3.common.util.Assertions.checkNotNull(inputFrameInfo));
                        break;
                    }
                }
            }
        }
        com.google.common.collect.ImmutableList<androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo> immutableListBuild = builder.build();
        if (immutableListBuild.size() == this.inputSources.size()) {
            return immutableListBuild;
        }
        return com.google.common.collect.ImmutableList.of();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: releaseOutputTextureInternal, reason: merged with bridge method [inline-methods] */
    public synchronized void m68xf71d0bd5(long j) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        while (this.outputTexturePool.freeTextureCount() < this.outputTexturePool.capacity() && this.outputTextureTimestamps.element() <= j) {
            this.outputTexturePool.freeTexture();
            this.outputTextureTimestamps.remove();
            androidx.media3.common.util.GlUtil.deleteSyncObject(this.syncObjects.remove());
        }
        maybeComposite();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseGlObjects() {
        try {
            try {
                try {
                    this.compositorGlProgram.release();
                    this.outputTexturePool.deleteAllTextures();
                    androidx.media3.common.util.GlUtil.destroyEglSurface(this.eglDisplay, this.placeholderEglSurface);
                    androidx.media3.common.util.GlUtil.destroyEglContext(this.eglDisplay, this.eglContext);
                } catch (androidx.media3.common.util.GlUtil.GlException e) {
                    androidx.media3.common.util.Log.e(TAG, "Error releasing GL resources", e);
                    androidx.media3.common.util.GlUtil.destroyEglContext(this.eglDisplay, this.eglContext);
                }
            } catch (androidx.media3.common.util.GlUtil.GlException e2) {
                androidx.media3.common.util.Log.e(TAG, "Error releasing GL context", e2);
            }
        } catch (java.lang.Throwable th) {
            try {
                androidx.media3.common.util.GlUtil.destroyEglContext(this.eglDisplay, this.eglContext);
            } catch (androidx.media3.common.util.GlUtil.GlException e3) {
                androidx.media3.common.util.Log.e(TAG, "Error releasing GL context", e3);
            }
            throw th;
        }
    }

    private static final class CompositorGlProgram {
        private static final java.lang.String FRAGMENT_SHADER_PATH = "shaders/fragment_shader_alpha_scale_es2.glsl";
        private static final java.lang.String TAG = "CompositorGlProgram";
        private static final java.lang.String VERTEX_SHADER_PATH = "shaders/vertex_shader_transformation_es2.glsl";
        private final android.content.Context context;
        private androidx.media3.common.util.GlProgram glProgram;
        private final androidx.media3.effect.OverlayMatrixProvider overlayMatrixProvider = new androidx.media3.effect.OverlayMatrixProvider();

        public CompositorGlProgram(android.content.Context context) {
            this.context = context;
        }

        public void drawFrame(java.util.List<androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo> list, androidx.media3.common.GlTextureInfo glTextureInfo) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
            ensureConfigured();
            androidx.media3.common.util.GlUtil.focusFramebufferUsingCurrentContext(glTextureInfo.fboId, glTextureInfo.width, glTextureInfo.height);
            this.overlayMatrixProvider.configure(new androidx.media3.common.util.Size(glTextureInfo.width, glTextureInfo.height));
            androidx.media3.common.util.GlUtil.clearFocusedBuffers();
            ((androidx.media3.common.util.GlProgram) androidx.media3.common.util.Assertions.checkNotNull(this.glProgram)).use();
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            androidx.media3.common.util.GlUtil.checkGlError();
            for (int size = list.size() - 1; size >= 0; size--) {
                blendOntoFocusedTexture(list.get(size));
            }
            android.opengl.GLES20.glDisable(3042);
            androidx.media3.common.util.GlUtil.checkGlError();
        }

        public void release() {
            try {
                androidx.media3.common.util.GlProgram glProgram = this.glProgram;
                if (glProgram != null) {
                    glProgram.delete();
                }
            } catch (androidx.media3.common.util.GlUtil.GlException e) {
                androidx.media3.common.util.Log.e(TAG, "Error releasing GL Program", e);
            }
        }

        private void ensureConfigured() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
            if (this.glProgram != null) {
                return;
            }
            try {
                androidx.media3.common.util.GlProgram glProgram = new androidx.media3.common.util.GlProgram(this.context, VERTEX_SHADER_PATH, FRAGMENT_SHADER_PATH);
                this.glProgram = glProgram;
                glProgram.setBufferAttribute("aFramePosition", androidx.media3.common.util.GlUtil.getNormalizedCoordinateBounds(), 4);
                this.glProgram.setFloatsUniform("uTexTransformationMatrix", androidx.media3.common.util.GlUtil.create4x4IdentityMatrix());
            } catch (java.io.IOException e) {
                throw new androidx.media3.common.VideoFrameProcessingException(e);
            }
        }

        private void blendOntoFocusedTexture(androidx.media3.effect.DefaultVideoCompositor.InputFrameInfo inputFrameInfo) throws androidx.media3.common.util.GlUtil.GlException {
            androidx.media3.common.util.GlProgram glProgram = (androidx.media3.common.util.GlProgram) androidx.media3.common.util.Assertions.checkNotNull(this.glProgram);
            androidx.media3.common.GlTextureInfo glTextureInfo = inputFrameInfo.texture;
            glProgram.setSamplerTexIdUniform("uTexSampler", glTextureInfo.texId, 0);
            glProgram.setFloatsUniform("uTransformationMatrix", this.overlayMatrixProvider.getTransformationMatrix(new androidx.media3.common.util.Size(glTextureInfo.width, glTextureInfo.height), inputFrameInfo.overlaySettings));
            glProgram.setFloatUniform("uAlphaScale", inputFrameInfo.overlaySettings.alphaScale);
            glProgram.bindAttributesAndUniforms();
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            androidx.media3.common.util.GlUtil.checkGlError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class InputFrameInfo {
        public final androidx.media3.effect.OverlaySettings overlaySettings;
        public final long presentationTimeUs;
        public final androidx.media3.common.GlTextureInfo texture;
        public final androidx.media3.effect.GlTextureProducer textureProducer;

        public InputFrameInfo(androidx.media3.effect.GlTextureProducer glTextureProducer, androidx.media3.common.GlTextureInfo glTextureInfo, long j, androidx.media3.effect.OverlaySettings overlaySettings) {
            this.textureProducer = glTextureProducer;
            this.texture = glTextureInfo;
            this.presentationTimeUs = j;
            this.overlaySettings = overlaySettings;
        }
    }
}
