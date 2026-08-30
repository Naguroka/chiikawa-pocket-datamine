package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public class TimestampAdjustmentShaderProgram implements androidx.media3.effect.GlShaderProgram {
    private androidx.media3.common.GlTextureInfo inputTexture;
    private final androidx.media3.effect.TimestampAdjustment.TimestampMap timestampMap;
    private androidx.media3.effect.GlShaderProgram.InputListener inputListener = new androidx.media3.effect.GlShaderProgram.InputListener() { // from class: androidx.media3.effect.TimestampAdjustmentShaderProgram.1
    };
    private androidx.media3.effect.GlShaderProgram.OutputListener outputListener = new androidx.media3.effect.GlShaderProgram.OutputListener() { // from class: androidx.media3.effect.TimestampAdjustmentShaderProgram.2
    };
    private final java.util.concurrent.atomic.AtomicInteger pendingCallbacksCount = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicBoolean pendingEndOfStream = new java.util.concurrent.atomic.AtomicBoolean();

    @Override // androidx.media3.effect.GlShaderProgram
    public void setErrorListener(java.util.concurrent.Executor executor, androidx.media3.effect.GlShaderProgram.ErrorListener errorListener) {
    }

    public TimestampAdjustmentShaderProgram(androidx.media3.effect.TimestampAdjustment.TimestampMap timestampMap) {
        this.timestampMap = timestampMap;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setInputListener(androidx.media3.effect.GlShaderProgram.InputListener inputListener) {
        this.inputListener = inputListener;
        if (this.inputTexture == null) {
            inputListener.onReadyToAcceptInputFrame();
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void setOutputListener(androidx.media3.effect.GlShaderProgram.OutputListener outputListener) {
        this.outputListener = outputListener;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void queueInputFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
        this.inputTexture = glTextureInfo;
        this.timestampMap.calculateOutputTimeUs(j, new androidx.media3.common.util.TimestampConsumer() { // from class: androidx.media3.effect.TimestampAdjustmentShaderProgram$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.TimestampConsumer
            public final void onTimestamp(long j2) {
                this.f$0.onOutputTimeAvailable(j2);
            }
        });
        this.pendingCallbacksCount.incrementAndGet();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void signalEndOfCurrentInputStream() {
        if (this.pendingCallbacksCount.get() == 0) {
            this.outputListener.onCurrentOutputStreamEnded();
        } else {
            this.pendingEndOfStream.set(true);
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void releaseOutputFrame(androidx.media3.common.GlTextureInfo glTextureInfo) {
        androidx.media3.common.util.Assertions.checkState(glTextureInfo.texId == ((androidx.media3.common.GlTextureInfo) androidx.media3.common.util.Assertions.checkNotNull(this.inputTexture)).texId);
        this.inputListener.onInputFrameProcessed(glTextureInfo);
        this.inputListener.onReadyToAcceptInputFrame();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void flush() {
        throw new java.lang.UnsupportedOperationException("This effect is not supported for previewing.");
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        this.inputTexture = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOutputTimeAvailable(long j) {
        this.outputListener.onOutputFrameAvailable((androidx.media3.common.GlTextureInfo) androidx.media3.common.util.Assertions.checkNotNull(this.inputTexture), j);
        if (this.pendingEndOfStream.get()) {
            this.outputListener.onCurrentOutputStreamEnded();
            this.pendingEndOfStream.set(false);
        }
        this.pendingCallbacksCount.decrementAndGet();
    }
}
