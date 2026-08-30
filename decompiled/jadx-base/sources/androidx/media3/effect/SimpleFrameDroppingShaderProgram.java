package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class SimpleFrameDroppingShaderProgram extends androidx.media3.effect.PassthroughShaderProgram {
    private int framesReceived;
    private final int n;

    public SimpleFrameDroppingShaderProgram(float f, float f2) {
        int iRound = java.lang.Math.round(f / f2);
        this.n = iRound;
        androidx.media3.common.util.Assertions.checkArgument(iRound >= 1, "The input frame rate should be greater than the target frame rate.");
    }

    @Override // androidx.media3.effect.PassthroughShaderProgram, androidx.media3.effect.GlShaderProgram
    public void queueInputFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
        if (this.framesReceived % this.n == 0) {
            super.queueInputFrame(glObjectsProvider, glTextureInfo, j);
        } else {
            getInputListener().onInputFrameProcessed(glTextureInfo);
            getInputListener().onReadyToAcceptInputFrame();
        }
        this.framesReceived++;
    }

    @Override // androidx.media3.effect.PassthroughShaderProgram, androidx.media3.effect.GlShaderProgram
    public void signalEndOfCurrentInputStream() {
        super.signalEndOfCurrentInputStream();
        this.framesReceived = 0;
    }

    @Override // androidx.media3.effect.PassthroughShaderProgram, androidx.media3.effect.GlShaderProgram
    public void flush() {
        super.flush();
        this.framesReceived = 0;
    }

    @Override // androidx.media3.effect.PassthroughShaderProgram, androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        super.release();
        this.framesReceived = 0;
    }
}
