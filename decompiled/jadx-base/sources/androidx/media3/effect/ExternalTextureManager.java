package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class ExternalTextureManager extends androidx.media3.effect.TextureManager {
    private static final float EPSILON = 1.0E-9f;
    private static final long SURFACE_TEXTURE_TIMEOUT_MS;
    private static final long SURFACE_TEXTURE_WAIT_DELAY_MS = 10;
    private static final java.lang.String TAG = "ExtTexMgr";
    private static final java.lang.String TIMER_THREAD_NAME = "ExtTexMgr:Timer";
    private static final int[] TRANSFORMATION_MATRIX_EXPECTED_ZERO_INDICES = {2, 3, 6, 7, 8, 9, 11, 14};
    private int availableFrameCount;
    private androidx.media3.common.FrameInfo currentFrame;
    private boolean currentInputStreamEnded;
    private final boolean experimentalAdjustSurfaceTextureTransformationMatrix;
    private androidx.media3.effect.ExternalShaderProgram externalShaderProgram;
    private int externalShaderProgramInputCapacity;
    private final int externalTexId;
    private long firstTryToRemoveAllFramesTimeMs;
    private java.util.concurrent.Future<?> forceSignalEndOfStreamFuture;
    private final androidx.media3.common.GlObjectsProvider glObjectsProvider;
    private androidx.media3.common.FrameInfo lastRegisteredFrame;
    private final java.util.Queue<androidx.media3.common.FrameInfo> pendingFrames;
    private final boolean repeatLastRegisteredFrame;
    private final java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
    private boolean shouldRejectIncomingFrames;
    private final android.view.Surface surface;
    private final android.graphics.SurfaceTexture surfaceTexture;
    private final float[] textureTransformMatrix;

    static {
        SURFACE_TEXTURE_TIMEOUT_MS = androidx.media3.common.util.Util.isRunningOnEmulator() ? 10000L : 500L;
    }

    public ExternalTextureManager(androidx.media3.common.GlObjectsProvider glObjectsProvider, final androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, boolean z, boolean z2) throws androidx.media3.common.VideoFrameProcessingException {
        super(videoFrameProcessingTaskExecutor);
        this.glObjectsProvider = glObjectsProvider;
        this.repeatLastRegisteredFrame = z;
        this.experimentalAdjustSurfaceTextureTransformationMatrix = z2;
        try {
            int iCreateExternalTexture = androidx.media3.common.util.GlUtil.createExternalTexture();
            this.externalTexId = iCreateExternalTexture;
            android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(iCreateExternalTexture);
            this.surfaceTexture = surfaceTexture;
            this.textureTransformMatrix = new float[16];
            this.pendingFrames = new java.util.concurrent.ConcurrentLinkedQueue();
            this.scheduledExecutorService = androidx.media3.common.util.Util.newSingleThreadScheduledExecutor(TIMER_THREAD_NAME);
            surfaceTexture.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda7
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                    this.f$0.m79lambda$new$1$androidxmedia3effectExternalTextureManager(videoFrameProcessingTaskExecutor, surfaceTexture2);
                }
            });
            this.surface = new android.view.Surface(surfaceTexture);
            this.firstTryToRemoveAllFramesTimeMs = androidx.media3.common.C.TIME_UNSET;
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-media3-effect-ExternalTextureManager, reason: not valid java name */
    /* synthetic */ void m79lambda$new$1$androidxmedia3effectExternalTextureManager(androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, android.graphics.SurfaceTexture surfaceTexture) {
        videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda10
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m78lambda$new$0$androidxmedia3effectExternalTextureManager();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-effect-ExternalTextureManager, reason: not valid java name */
    /* synthetic */ void m78lambda$new$0$androidxmedia3effectExternalTextureManager() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_VFP, androidx.media3.effect.DebugTraceUtil.EVENT_SURFACE_TEXTURE_INPUT, androidx.media3.common.C.TIME_UNSET);
        if (this.shouldRejectIncomingFrames) {
            this.surfaceTexture.updateTexImage();
            androidx.media3.common.util.Log.w(TAG, "Dropping frame received on SurfaceTexture after forcing EOS: " + (this.surfaceTexture.getTimestamp() / 1000));
        } else {
            if (this.currentInputStreamEnded) {
                restartForceSignalEndOfStreamTimer();
            }
            this.availableFrameCount++;
            maybeQueueFrameToExternalShaderProgram();
        }
    }

    @Override // androidx.media3.effect.TextureManager
    public void releaseAllRegisteredFrames() {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda0
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m85xd9f562e8(countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            androidx.media3.common.util.Log.w(TAG, "Interrupted when waiting for MediaCodec frames to arrive.");
        }
    }

    @Override // androidx.media3.effect.TextureManager
    public void setSamplingGlShaderProgram(final androidx.media3.effect.GlShaderProgram glShaderProgram) {
        androidx.media3.common.util.Assertions.checkState(glShaderProgram instanceof androidx.media3.effect.ExternalShaderProgram);
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda4
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m87xe2ab1d78(glShaderProgram);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setSamplingGlShaderProgram$3$androidx-media3-effect-ExternalTextureManager, reason: not valid java name */
    /* synthetic */ void m87xe2ab1d78(androidx.media3.effect.GlShaderProgram glShaderProgram) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        this.externalShaderProgramInputCapacity = 0;
        this.externalShaderProgram = (androidx.media3.effect.ExternalShaderProgram) glShaderProgram;
    }

    @Override // androidx.media3.effect.TextureManager
    public void setDefaultBufferSize(int i, int i2) {
        this.surfaceTexture.setDefaultBufferSize(i, i2);
    }

    @Override // androidx.media3.effect.TextureManager
    public android.view.Surface getInputSurface() {
        return this.surface;
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onReadyToAcceptInputFrame() {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda2
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m81xb7144978();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onReadyToAcceptInputFrame$4$androidx-media3-effect-ExternalTextureManager, reason: not valid java name */
    /* synthetic */ void m81xb7144978() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        this.externalShaderProgramInputCapacity++;
        maybeQueueFrameToExternalShaderProgram();
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onInputFrameProcessed(androidx.media3.common.GlTextureInfo glTextureInfo) {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda11
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m80xd8e0a5fb();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onInputFrameProcessed$5$androidx-media3-effect-ExternalTextureManager, reason: not valid java name */
    /* synthetic */ void m80xd8e0a5fb() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        this.currentFrame = null;
        if (this.currentInputStreamEnded && this.pendingFrames.isEmpty()) {
            this.currentInputStreamEnded = false;
            ((androidx.media3.effect.ExternalShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.externalShaderProgram)).signalEndOfCurrentInputStream();
            androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_EXTERNAL_TEXTURE_MANAGER, androidx.media3.effect.DebugTraceUtil.EVENT_SIGNAL_EOS, Long.MIN_VALUE);
            cancelForceSignalEndOfStreamTimer();
            return;
        }
        maybeQueueFrameToExternalShaderProgram();
    }

    @Override // androidx.media3.effect.TextureManager
    public void registerInputFrame(androidx.media3.common.FrameInfo frameInfo) {
        this.lastRegisteredFrame = frameInfo;
        if (!this.repeatLastRegisteredFrame) {
            this.pendingFrames.add(frameInfo);
        }
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda1
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m82x42da3db0();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$registerInputFrame$6$androidx-media3-effect-ExternalTextureManager, reason: not valid java name */
    /* synthetic */ void m82x42da3db0() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        this.shouldRejectIncomingFrames = false;
    }

    @Override // androidx.media3.effect.TextureManager
    public int getPendingFrameCount() {
        return this.pendingFrames.size();
    }

    @Override // androidx.media3.effect.TextureManager
    public void signalEndOfCurrentInputStream() {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda3
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m88x99395fac();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$signalEndOfCurrentInputStream$7$androidx-media3-effect-ExternalTextureManager, reason: not valid java name */
    /* synthetic */ void m88x99395fac() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        if (this.pendingFrames.isEmpty() && this.currentFrame == null) {
            ((androidx.media3.effect.ExternalShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.externalShaderProgram)).signalEndOfCurrentInputStream();
            androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_EXTERNAL_TEXTURE_MANAGER, androidx.media3.effect.DebugTraceUtil.EVENT_SIGNAL_EOS, Long.MIN_VALUE);
            cancelForceSignalEndOfStreamTimer();
        } else {
            this.currentInputStreamEnded = true;
            restartForceSignalEndOfStreamTimer();
        }
    }

    @Override // androidx.media3.effect.TextureManager
    public void release() {
        this.surfaceTexture.release();
        this.surface.release();
        this.scheduledExecutorService.shutdownNow();
    }

    @Override // androidx.media3.effect.TextureManager
    protected void flush() throws androidx.media3.common.VideoFrameProcessingException {
        this.externalShaderProgramInputCapacity = 0;
        this.currentFrame = null;
        this.pendingFrames.clear();
        this.lastRegisteredFrame = null;
        super.flush();
    }

    private void restartForceSignalEndOfStreamTimer() {
        cancelForceSignalEndOfStreamTimer();
        this.forceSignalEndOfStreamFuture = this.scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m86x5cba97a3();
            }
        }, SURFACE_TEXTURE_TIMEOUT_MS, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: lambda$restartForceSignalEndOfStreamTimer$8$androidx-media3-effect-ExternalTextureManager, reason: not valid java name */
    /* synthetic */ void m86x5cba97a3() {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda6
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() {
                this.f$0.forceSignalEndOfStream();
            }
        });
    }

    private void cancelForceSignalEndOfStreamTimer() {
        java.util.concurrent.Future<?> future = this.forceSignalEndOfStreamFuture;
        if (future != null) {
            future.cancel(false);
        }
        this.forceSignalEndOfStreamFuture = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void forceSignalEndOfStream() {
        androidx.media3.common.util.Log.w(TAG, androidx.media3.common.util.Util.formatInvariant("Forcing EOS after missing %d frames for %d ms, with available frame count: %d", java.lang.Integer.valueOf(this.pendingFrames.size()), java.lang.Long.valueOf(SURFACE_TEXTURE_TIMEOUT_MS), java.lang.Integer.valueOf(this.availableFrameCount)));
        this.currentInputStreamEnded = false;
        this.currentFrame = null;
        this.shouldRejectIncomingFrames = true;
        removeAllSurfaceTextureFrames();
        this.pendingFrames.clear();
        signalEndOfCurrentInputStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: releaseAllFramesFromMediaCodec, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m85xd9f562e8(final java.util.concurrent.CountDownLatch countDownLatch) {
        removeAllSurfaceTextureFrames();
        if (this.pendingFrames.isEmpty() || (this.firstTryToRemoveAllFramesTimeMs != androidx.media3.common.C.TIME_UNSET && androidx.media3.common.util.SystemClock.DEFAULT.currentTimeMillis() - this.firstTryToRemoveAllFramesTimeMs >= SURFACE_TEXTURE_TIMEOUT_MS)) {
            this.firstTryToRemoveAllFramesTimeMs = androidx.media3.common.C.TIME_UNSET;
            countDownLatch.countDown();
        } else {
            if (this.firstTryToRemoveAllFramesTimeMs == androidx.media3.common.C.TIME_UNSET) {
                this.firstTryToRemoveAllFramesTimeMs = androidx.media3.common.util.SystemClock.DEFAULT.currentTimeMillis();
            }
            this.scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m83x6c537d25(countDownLatch);
                }
            }, SURFACE_TEXTURE_WAIT_DELAY_MS, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: lambda$releaseAllFramesFromMediaCodec$10$androidx-media3-effect-ExternalTextureManager, reason: not valid java name */
    /* synthetic */ void m83x6c537d25(final java.util.concurrent.CountDownLatch countDownLatch) {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.ExternalTextureManager$$ExternalSyntheticLambda5
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m84x2f2d1589(countDownLatch);
            }
        });
    }

    private void removeAllSurfaceTextureFrames() {
        while (true) {
            int i = this.availableFrameCount;
            if (i <= 0) {
                return;
            }
            this.availableFrameCount = i - 1;
            this.surfaceTexture.updateTexImage();
            this.pendingFrames.remove();
        }
    }

    private void maybeQueueFrameToExternalShaderProgram() {
        if (this.externalShaderProgramInputCapacity == 0 || this.availableFrameCount == 0 || this.currentFrame != null) {
            return;
        }
        this.surfaceTexture.updateTexImage();
        this.availableFrameCount--;
        androidx.media3.common.FrameInfo frameInfo = (androidx.media3.common.FrameInfo) (this.repeatLastRegisteredFrame ? androidx.media3.common.util.Assertions.checkNotNull(this.lastRegisteredFrame) : this.pendingFrames.element());
        this.currentFrame = frameInfo;
        this.externalShaderProgramInputCapacity--;
        this.surfaceTexture.getTransformMatrix(this.textureTransformMatrix);
        long timestamp = (this.surfaceTexture.getTimestamp() / 1000) + frameInfo.offsetToAddUs;
        if (this.experimentalAdjustSurfaceTextureTransformationMatrix) {
            removeSurfaceTextureScaleFromTransformMatrix(this.textureTransformMatrix, timestamp, frameInfo.width, frameInfo.height);
        }
        ((androidx.media3.effect.ExternalShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.externalShaderProgram)).setTextureTransformMatrix(this.textureTransformMatrix);
        ((androidx.media3.effect.ExternalShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.externalShaderProgram)).queueInputFrame(this.glObjectsProvider, new androidx.media3.common.GlTextureInfo(this.externalTexId, -1, -1, frameInfo.width, frameInfo.height), timestamp);
        if (!this.repeatLastRegisteredFrame) {
            androidx.media3.common.util.Assertions.checkStateNotNull(this.pendingFrames.remove());
        }
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_VFP, androidx.media3.effect.DebugTraceUtil.EVENT_QUEUE_FRAME, timestamp);
    }

    private static void removeSurfaceTextureScaleFromTransformMatrix(float[] fArr, long j, int i, int i2) {
        byte b;
        byte b2;
        boolean z = true;
        boolean z2 = (fArr.length != 16) | false;
        for (int i3 : TRANSFORMATION_MATRIX_EXPECTED_ZERO_INDICES) {
            z2 |= java.lang.Math.abs(fArr[i3]) > EPSILON;
        }
        boolean z3 = z2 | (java.lang.Math.abs(fArr[10] - 1.0f) > EPSILON) | (java.lang.Math.abs(fArr[15] - 1.0f) > EPSILON);
        byte b3 = 12;
        byte b4 = 4;
        if (java.lang.Math.abs(fArr[0]) > EPSILON && java.lang.Math.abs(fArr[5]) > EPSILON) {
            z = (java.lang.Math.abs(fArr[4]) > EPSILON) | z3 | (java.lang.Math.abs(fArr[1]) > EPSILON);
            b2 = 13;
            b4 = 5;
            b = 0;
        } else if (java.lang.Math.abs(fArr[1]) <= EPSILON || java.lang.Math.abs(fArr[4]) <= EPSILON) {
            b = -1;
            b2 = -1;
            b3 = -1;
            b4 = -1;
        } else {
            z = z3 | (java.lang.Math.abs(fArr[0]) > EPSILON) | (java.lang.Math.abs(fArr[5]) > EPSILON);
            b2 = 12;
            b3 = 13;
            b = 1;
        }
        if (z) {
            androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_EXTERNAL_TEXTURE_MANAGER, androidx.media3.effect.DebugTraceUtil.EVENT_SURFACE_TEXTURE_TRANSFORM_FIX, j, "Unable to apply SurfaceTexture fix", new java.lang.Object[0]);
            return;
        }
        float f = fArr[b];
        float f2 = fArr[b3];
        if (java.lang.Math.abs(f) + EPSILON < 1.0f) {
            float fCopySign = java.lang.Math.copySign(guessScaleWithoutSurfaceTextureTrim(java.lang.Math.abs(f), i), f);
            androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_EXTERNAL_TEXTURE_MANAGER, androidx.media3.effect.DebugTraceUtil.EVENT_SURFACE_TEXTURE_TRANSFORM_FIX, j, "Width scale adjusted.", new java.lang.Object[0]);
            fArr[b] = fCopySign;
            fArr[b3] = ((f - fCopySign) * 0.5f) + f2;
        }
        float f3 = fArr[b4];
        float f4 = fArr[b2];
        if (java.lang.Math.abs(f3) + EPSILON < 1.0f) {
            float fCopySign2 = java.lang.Math.copySign(guessScaleWithoutSurfaceTextureTrim(java.lang.Math.abs(f3), i2), f3);
            androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_EXTERNAL_TEXTURE_MANAGER, androidx.media3.effect.DebugTraceUtil.EVENT_SURFACE_TEXTURE_TRANSFORM_FIX, j, "Height scale adjusted.", new java.lang.Object[0]);
            fArr[b4] = fCopySign2;
            fArr[b2] = ((f3 - fCopySign2) * 0.5f) + f4;
        }
    }

    private static float guessScaleWithoutSurfaceTextureTrim(float f, int i) {
        float f2 = 1.0f;
        float f3 = 1.0f;
        for (int i2 = 2; i2 <= 256; i2 *= 2) {
            int i3 = (((i + i2) - 1) / i2) * i2;
            for (int i4 = 0; i4 <= 2; i4++) {
                float f4 = i;
                float f5 = i3;
                float f6 = (f4 - i4) / f5;
                if (java.lang.Math.abs(f6 - f) < java.lang.Math.abs(f2 - f)) {
                    f3 = f4 / f5;
                    f2 = f6;
                }
            }
        }
        return java.lang.Math.abs(f2 - f) > EPSILON ? f : f3;
    }
}
