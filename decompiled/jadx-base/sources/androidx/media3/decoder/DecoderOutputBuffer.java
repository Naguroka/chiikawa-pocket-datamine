package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecoderOutputBuffer extends androidx.media3.decoder.Buffer {
    public boolean shouldBeSkipped;
    public int skippedOutputBufferCount;
    public long timeUs;

    public interface Owner<S extends androidx.media3.decoder.DecoderOutputBuffer> {
        void releaseOutputBuffer(S s);
    }

    public abstract void release();

    @Override // androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.timeUs = 0L;
        this.skippedOutputBufferCount = 0;
        this.shouldBeSkipped = false;
    }
}
