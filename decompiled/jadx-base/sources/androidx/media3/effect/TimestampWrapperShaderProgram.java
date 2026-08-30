package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class TimestampWrapperShaderProgram implements androidx.media3.effect.GlShaderProgram, androidx.media3.effect.GlShaderProgram.InputListener {
    private final androidx.media3.effect.GlShaderProgram copyShaderProgram;
    private final long endTimeUs;
    private int pendingCopyGlShaderProgramFrames;
    private int pendingWrappedGlShaderProgramFrames;
    private final long startTimeUs;
    private final androidx.media3.effect.GlShaderProgram wrappedShaderProgram;
    private final androidx.media3.effect.TimestampWrapperShaderProgram.WrappedShaderProgramInputListener wrappedShaderProgramInputListener;

    public TimestampWrapperShaderProgram(android.content.Context context, boolean z, androidx.media3.effect.TimestampWrapper timestampWrapper) throws androidx.media3.common.VideoFrameProcessingException {
        this.startTimeUs = timestampWrapper.startTimeUs;
        this.endTimeUs = timestampWrapper.endTimeUs;
        androidx.media3.effect.GlShaderProgram glShaderProgram = timestampWrapper.glEffect.toGlShaderProgram(context, z);
        this.wrappedShaderProgram = glShaderProgram;
        androidx.media3.effect.TimestampWrapperShaderProgram.WrappedShaderProgramInputListener wrappedShaderProgramInputListener = new androidx.media3.effect.TimestampWrapperShaderProgram.WrappedShaderProgramInputListener();
        this.wrappedShaderProgramInputListener = wrappedShaderProgramInputListener;
        glShaderProgram.setInputListener(wrappedShaderProgramInputListener);
        this.copyShaderProgram = new androidx.media3.effect.FrameCache(wrappedShaderProgramInputListener.readyFrameCount).toGlShaderProgram(context, z);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setInputListener(androidx.media3.effect.GlShaderProgram.InputListener inputListener) {
        this.wrappedShaderProgramInputListener.setListener(inputListener);
        this.wrappedShaderProgramInputListener.setToForwardingMode(true);
        this.copyShaderProgram.setInputListener(inputListener);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setOutputListener(androidx.media3.effect.GlShaderProgram.OutputListener outputListener) {
        this.wrappedShaderProgram.setOutputListener(outputListener);
        this.copyShaderProgram.setOutputListener(outputListener);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setErrorListener(java.util.concurrent.Executor executor, androidx.media3.effect.GlShaderProgram.ErrorListener errorListener) {
        this.wrappedShaderProgram.setErrorListener(executor, errorListener);
        this.copyShaderProgram.setErrorListener(executor, errorListener);
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void queueInputFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
        if (this.startTimeUs <= j && j <= this.endTimeUs) {
            this.pendingWrappedGlShaderProgramFrames++;
            this.wrappedShaderProgram.queueInputFrame(glObjectsProvider, glTextureInfo, j);
        } else {
            this.pendingCopyGlShaderProgramFrames++;
            this.copyShaderProgram.queueInputFrame(glObjectsProvider, glTextureInfo, j);
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void releaseOutputFrame(androidx.media3.common.GlTextureInfo glTextureInfo) {
        if (this.pendingCopyGlShaderProgramFrames > 0) {
            this.copyShaderProgram.releaseOutputFrame(glTextureInfo);
            this.pendingCopyGlShaderProgramFrames--;
        } else {
            if (this.pendingWrappedGlShaderProgramFrames > 0) {
                this.wrappedShaderProgram.releaseOutputFrame(glTextureInfo);
                this.pendingWrappedGlShaderProgramFrames--;
                return;
            }
            throw new java.lang.IllegalArgumentException("Output texture not contained in either shader.");
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void signalEndOfCurrentInputStream() {
        this.wrappedShaderProgram.signalEndOfCurrentInputStream();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void flush() {
        this.wrappedShaderProgramInputListener.setToForwardingMode(false);
        this.wrappedShaderProgram.flush();
        this.wrappedShaderProgramInputListener.setToForwardingMode(true);
        this.copyShaderProgram.flush();
        this.pendingCopyGlShaderProgramFrames = 0;
        this.pendingWrappedGlShaderProgramFrames = 0;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        this.copyShaderProgram.release();
        this.wrappedShaderProgram.release();
    }

    private static final class WrappedShaderProgramInputListener implements androidx.media3.effect.GlShaderProgram.InputListener {
        private boolean forwardCalls;
        private androidx.media3.effect.GlShaderProgram.InputListener listener;
        public int readyFrameCount;

        @Override // androidx.media3.effect.GlShaderProgram.InputListener
        public void onFlush() {
        }

        private WrappedShaderProgramInputListener() {
        }

        @Override // androidx.media3.effect.GlShaderProgram.InputListener
        public void onReadyToAcceptInputFrame() {
            androidx.media3.effect.GlShaderProgram.InputListener inputListener = this.listener;
            if (inputListener == null) {
                this.readyFrameCount++;
            }
            if (this.forwardCalls) {
                ((androidx.media3.effect.GlShaderProgram.InputListener) androidx.media3.common.util.Assertions.checkNotNull(inputListener)).onReadyToAcceptInputFrame();
            }
        }

        @Override // androidx.media3.effect.GlShaderProgram.InputListener
        public void onInputFrameProcessed(androidx.media3.common.GlTextureInfo glTextureInfo) {
            ((androidx.media3.effect.GlShaderProgram.InputListener) androidx.media3.common.util.Assertions.checkNotNull(this.listener)).onInputFrameProcessed(glTextureInfo);
        }

        public void setListener(androidx.media3.effect.GlShaderProgram.InputListener inputListener) {
            this.listener = inputListener;
        }

        public void setToForwardingMode(boolean z) {
            androidx.media3.common.util.Assertions.checkState((z && this.listener == null) ? false : true);
            this.forwardCalls = z;
        }
    }
}
