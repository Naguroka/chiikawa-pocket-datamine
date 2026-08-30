package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAudioProcessor implements androidx.media3.common.audio.AudioProcessor {
    private boolean inputEnded;
    private java.nio.ByteBuffer buffer = EMPTY_BUFFER;
    private java.nio.ByteBuffer outputBuffer = EMPTY_BUFFER;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat pendingInputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat pendingOutputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    protected androidx.media3.common.audio.AudioProcessor.AudioFormat inputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    protected androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;

    protected void onFlush() {
    }

    protected void onQueueEndOfStream() {
    }

    protected void onReset() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = onConfigure(audioFormat);
        return isActive() ? this.pendingOutputAudioFormat : androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.pendingOutputAudioFormat != androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.inputEnded = true;
        onQueueEndOfStream();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public java.nio.ByteBuffer getOutput() {
        java.nio.ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.inputEnded && this.outputBuffer == EMPTY_BUFFER;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.outputBuffer = EMPTY_BUFFER;
        this.inputEnded = false;
        this.inputAudioFormat = this.pendingInputAudioFormat;
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        onFlush();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.buffer = EMPTY_BUFFER;
        this.pendingInputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.pendingOutputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.inputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        onReset();
    }

    protected final java.nio.ByteBuffer replaceOutputBuffer(int i) {
        if (this.buffer.capacity() < i) {
            this.buffer = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        java.nio.ByteBuffer byteBuffer = this.buffer;
        this.outputBuffer = byteBuffer;
        return byteBuffer;
    }

    protected final boolean hasPendingOutput() {
        return this.outputBuffer.hasRemaining();
    }

    protected androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        return androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }
}
