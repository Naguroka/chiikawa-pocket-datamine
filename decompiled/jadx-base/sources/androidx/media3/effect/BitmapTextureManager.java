package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class BitmapTextureManager extends androidx.media3.effect.TextureManager {
    private boolean currentInputStreamEnded;
    private androidx.media3.common.GlTextureInfo currentSdrGlTextureInfo;
    private int downstreamShaderProgramCapacity;
    private final androidx.media3.common.GlObjectsProvider glObjectsProvider;
    private boolean isNextFrameInTexture;
    private final java.util.Queue<androidx.media3.effect.BitmapTextureManager.BitmapFrameSequenceInfo> pendingBitmaps;
    private androidx.media3.effect.RepeatingGainmapShaderProgram repeatingGainmapShaderProgram;
    private final boolean signalRepeatingSequence;

    @Override // androidx.media3.effect.TextureManager
    public int getPendingFrameCount() {
        return 0;
    }

    public BitmapTextureManager(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, boolean z) {
        super(videoFrameProcessingTaskExecutor);
        this.glObjectsProvider = glObjectsProvider;
        this.pendingBitmaps = new java.util.concurrent.LinkedBlockingQueue();
        this.signalRepeatingSequence = z;
    }

    @Override // androidx.media3.effect.TextureManager
    public void setSamplingGlShaderProgram(androidx.media3.effect.GlShaderProgram glShaderProgram) {
        androidx.media3.common.util.Assertions.checkState(glShaderProgram instanceof androidx.media3.effect.RepeatingGainmapShaderProgram);
        this.downstreamShaderProgramCapacity = 0;
        this.repeatingGainmapShaderProgram = (androidx.media3.effect.RepeatingGainmapShaderProgram) glShaderProgram;
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public void onReadyToAcceptInputFrame() {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.BitmapTextureManager$$ExternalSyntheticLambda0
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m63x5ebd0098();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onReadyToAcceptInputFrame$0$androidx-media3-effect-BitmapTextureManager, reason: not valid java name */
    /* synthetic */ void m63x5ebd0098() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        this.downstreamShaderProgramCapacity++;
        maybeQueueToShaderProgram();
    }

    @Override // androidx.media3.effect.TextureManager
    public void queueInputBitmap(final android.graphics.Bitmap bitmap, final androidx.media3.common.FrameInfo frameInfo, final androidx.media3.common.util.TimestampIterator timestampIterator) {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.BitmapTextureManager$$ExternalSyntheticLambda3
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m64xfa552d11(bitmap, frameInfo, timestampIterator);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$queueInputBitmap$1$androidx-media3-effect-BitmapTextureManager, reason: not valid java name */
    /* synthetic */ void m64xfa552d11(android.graphics.Bitmap bitmap, androidx.media3.common.FrameInfo frameInfo, androidx.media3.common.util.TimestampIterator timestampIterator) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        setupBitmap(bitmap, frameInfo, timestampIterator);
        this.currentInputStreamEnded = false;
    }

    @Override // androidx.media3.effect.TextureManager
    public void signalEndOfCurrentInputStream() {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.BitmapTextureManager$$ExternalSyntheticLambda2
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m66x7939514b();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$signalEndOfCurrentInputStream$2$androidx-media3-effect-BitmapTextureManager, reason: not valid java name */
    /* synthetic */ void m66x7939514b() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        if (this.pendingBitmaps.isEmpty()) {
            ((androidx.media3.effect.RepeatingGainmapShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.repeatingGainmapShaderProgram)).signalEndOfCurrentInputStream();
            androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_BITMAP_TEXTURE_MANAGER, androidx.media3.effect.DebugTraceUtil.EVENT_SIGNAL_EOS, Long.MIN_VALUE);
        } else {
            this.currentInputStreamEnded = true;
        }
    }

    @Override // androidx.media3.effect.TextureManager
    public void release() {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.BitmapTextureManager$$ExternalSyntheticLambda1
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m65lambda$release$3$androidxmedia3effectBitmapTextureManager();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$release$3$androidx-media3-effect-BitmapTextureManager, reason: not valid java name */
    /* synthetic */ void m65lambda$release$3$androidxmedia3effectBitmapTextureManager() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        androidx.media3.common.GlTextureInfo glTextureInfo = this.currentSdrGlTextureInfo;
        if (glTextureInfo != null) {
            glTextureInfo.release();
        }
        this.pendingBitmaps.clear();
    }

    private void setupBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.FrameInfo frameInfo, androidx.media3.common.util.TimestampIterator timestampIterator) throws androidx.media3.common.VideoFrameProcessingException {
        androidx.media3.common.util.Assertions.checkArgument(timestampIterator.hasNext(), "Bitmap queued but no timestamps provided.");
        this.pendingBitmaps.add(new androidx.media3.effect.BitmapTextureManager.BitmapFrameSequenceInfo(bitmap, frameInfo, timestampIterator));
        maybeQueueToShaderProgram();
    }

    private void maybeQueueToShaderProgram() throws androidx.media3.common.VideoFrameProcessingException {
        if (this.pendingBitmaps.isEmpty() || this.downstreamShaderProgramCapacity == 0) {
            return;
        }
        androidx.media3.effect.BitmapTextureManager.BitmapFrameSequenceInfo bitmapFrameSequenceInfoElement = this.pendingBitmaps.element();
        androidx.media3.common.FrameInfo frameInfo = bitmapFrameSequenceInfoElement.frameInfo;
        androidx.media3.common.util.TimestampIterator timestampIterator = bitmapFrameSequenceInfoElement.inStreamOffsetsUs;
        androidx.media3.common.util.Assertions.checkState(bitmapFrameSequenceInfoElement.inStreamOffsetsUs.hasNext());
        long next = bitmapFrameSequenceInfoElement.frameInfo.offsetToAddUs + timestampIterator.next();
        if (!this.isNextFrameInTexture) {
            this.isNextFrameInTexture = true;
            updateCurrentGlTextureInfo(frameInfo, bitmapFrameSequenceInfoElement.bitmap);
        }
        this.downstreamShaderProgramCapacity--;
        ((androidx.media3.effect.RepeatingGainmapShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.repeatingGainmapShaderProgram)).queueInputFrame(this.glObjectsProvider, (androidx.media3.common.GlTextureInfo) androidx.media3.common.util.Assertions.checkNotNull(this.currentSdrGlTextureInfo), next);
        androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_VFP, androidx.media3.effect.DebugTraceUtil.EVENT_QUEUE_BITMAP, next, "%dx%d", java.lang.Integer.valueOf(frameInfo.width), java.lang.Integer.valueOf(frameInfo.height));
        if (bitmapFrameSequenceInfoElement.inStreamOffsetsUs.hasNext()) {
            return;
        }
        this.isNextFrameInTexture = false;
        this.pendingBitmaps.remove().bitmap.recycle();
        if (this.pendingBitmaps.isEmpty() && this.currentInputStreamEnded) {
            ((androidx.media3.effect.RepeatingGainmapShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.repeatingGainmapShaderProgram)).signalEndOfCurrentInputStream();
            androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_BITMAP_TEXTURE_MANAGER, androidx.media3.effect.DebugTraceUtil.EVENT_SIGNAL_EOS, Long.MIN_VALUE);
            this.currentInputStreamEnded = false;
        }
    }

    @Override // androidx.media3.effect.TextureManager
    protected void flush() throws androidx.media3.common.VideoFrameProcessingException {
        this.pendingBitmaps.clear();
        this.isNextFrameInTexture = false;
        this.currentInputStreamEnded = false;
        this.downstreamShaderProgramCapacity = 0;
        androidx.media3.common.GlTextureInfo glTextureInfo = this.currentSdrGlTextureInfo;
        if (glTextureInfo != null) {
            try {
                glTextureInfo.release();
                this.currentSdrGlTextureInfo = null;
            } catch (androidx.media3.common.util.GlUtil.GlException e) {
                throw androidx.media3.common.VideoFrameProcessingException.from(e);
            }
        }
        super.flush();
    }

    private void updateCurrentGlTextureInfo(androidx.media3.common.FrameInfo frameInfo, android.graphics.Bitmap bitmap) throws androidx.media3.common.VideoFrameProcessingException {
        try {
            androidx.media3.common.GlTextureInfo glTextureInfo = this.currentSdrGlTextureInfo;
            if (glTextureInfo != null) {
                glTextureInfo.release();
            }
            this.currentSdrGlTextureInfo = new androidx.media3.common.GlTextureInfo(androidx.media3.common.util.GlUtil.createTexture(bitmap), -1, -1, frameInfo.width, frameInfo.height);
            if (androidx.media3.common.util.Util.SDK_INT >= 34 && bitmap.hasGainmap()) {
                ((androidx.media3.effect.RepeatingGainmapShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.repeatingGainmapShaderProgram)).setGainmap((android.graphics.Gainmap) androidx.media3.common.util.Assertions.checkNotNull(bitmap.getGainmap()));
            }
            if (this.signalRepeatingSequence) {
                ((androidx.media3.effect.RepeatingGainmapShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.repeatingGainmapShaderProgram)).signalNewRepeatingFrameSequence();
            }
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw androidx.media3.common.VideoFrameProcessingException.from(e);
        }
    }

    private static final class BitmapFrameSequenceInfo {
        public final android.graphics.Bitmap bitmap;
        private final androidx.media3.common.FrameInfo frameInfo;
        private final androidx.media3.common.util.TimestampIterator inStreamOffsetsUs;

        public BitmapFrameSequenceInfo(android.graphics.Bitmap bitmap, androidx.media3.common.FrameInfo frameInfo, androidx.media3.common.util.TimestampIterator timestampIterator) {
            this.bitmap = bitmap;
            this.frameInfo = frameInfo;
            this.inStreamOffsetsUs = timestampIterator;
        }
    }
}
