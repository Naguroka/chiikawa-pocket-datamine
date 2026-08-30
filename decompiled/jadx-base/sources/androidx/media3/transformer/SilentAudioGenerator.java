package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class SilentAudioGenerator {
    private static final int DEFAULT_BUFFER_SIZE_FRAMES = 1024;
    public final androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat;
    private final java.nio.ByteBuffer internalBuffer;
    private final java.util.concurrent.atomic.AtomicLong remainingBytesToOutput;

    public SilentAudioGenerator(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        this.audioFormat = audioFormat;
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(audioFormat.bytesPerFrame * 1024).order(java.nio.ByteOrder.nativeOrder());
        this.internalBuffer = byteBufferOrder;
        byteBufferOrder.flip();
        this.remainingBytesToOutput = new java.util.concurrent.atomic.AtomicLong();
    }

    public void addSilence(long j) {
        this.remainingBytesToOutput.addAndGet(((long) this.audioFormat.bytesPerFrame) * androidx.media3.common.util.Util.durationUsToSampleCount(j, this.audioFormat.sampleRate));
    }

    public java.nio.ByteBuffer getBuffer() {
        long j = this.remainingBytesToOutput.get();
        if (!this.internalBuffer.hasRemaining()) {
            this.internalBuffer.clear();
            if (j < this.internalBuffer.capacity()) {
                this.internalBuffer.limit((int) j);
            }
            this.remainingBytesToOutput.addAndGet(-this.internalBuffer.remaining());
        }
        return this.internalBuffer;
    }

    public boolean hasRemaining() {
        return this.internalBuffer.hasRemaining() || this.remainingBytesToOutput.get() > 0;
    }

    public void flush() {
        this.remainingBytesToOutput.set(0L);
        this.internalBuffer.position(0);
        this.internalBuffer.limit(0);
    }
}
