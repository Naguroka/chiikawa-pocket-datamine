package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
abstract class TextureManager implements androidx.media3.effect.GlShaderProgram.InputListener {
    private final java.lang.Object lock = new java.lang.Object();
    private androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task onFlushCompleteTask;
    protected final androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;

    public abstract int getPendingFrameCount();

    public abstract void release() throws androidx.media3.common.VideoFrameProcessingException;

    public void releaseAllRegisteredFrames() {
    }

    public void setInputFrameInfo(androidx.media3.common.FrameInfo frameInfo) {
    }

    public abstract void setSamplingGlShaderProgram(androidx.media3.effect.GlShaderProgram glShaderProgram);

    public abstract void signalEndOfCurrentInputStream();

    public TextureManager(androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor) {
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
    }

    public void setDefaultBufferSize(int i, int i2) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void queueInputBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.FrameInfo frameInfo, androidx.media3.common.util.TimestampIterator timestampIterator) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void queueInputTexture(int i, long j) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void setOnInputFrameProcessedListener(androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    public android.view.Surface getInputSurface() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void registerInputFrame(androidx.media3.common.FrameInfo frameInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void setOnFlushCompleteListener(androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task task) {
        synchronized (this.lock) {
            this.onFlushCompleteTask = task;
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram.InputListener
    public final void onFlush() {
        this.videoFrameProcessingTaskExecutor.submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.TextureManager$$ExternalSyntheticLambda0
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException {
                this.f$0.flush();
            }
        });
    }

    protected void flush() throws androidx.media3.common.VideoFrameProcessingException {
        synchronized (this.lock) {
            androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task task = this.onFlushCompleteTask;
            if (task != null) {
                this.videoFrameProcessingTaskExecutor.submitWithHighPriority(task);
            }
        }
    }
}
