package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public class SimpleDecoderOutputBuffer extends androidx.media3.decoder.DecoderOutputBuffer {
    public java.nio.ByteBuffer data;
    private final androidx.media3.decoder.DecoderOutputBuffer.Owner<androidx.media3.decoder.SimpleDecoderOutputBuffer> owner;

    public SimpleDecoderOutputBuffer(androidx.media3.decoder.DecoderOutputBuffer.Owner<androidx.media3.decoder.SimpleDecoderOutputBuffer> owner) {
        this.owner = owner;
    }

    public java.nio.ByteBuffer init(long j, int i) {
        this.timeUs = j;
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    public java.nio.ByteBuffer grow(int i) {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.data);
        androidx.media3.common.util.Assertions.checkArgument(i >= byteBuffer.limit());
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i);
        this.data = byteBufferOrder;
        return byteBufferOrder;
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    public void release() {
        this.owner.releaseOutputBuffer(this);
    }
}
