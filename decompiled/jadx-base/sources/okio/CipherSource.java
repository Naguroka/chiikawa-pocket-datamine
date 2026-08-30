package okio;

/* JADX INFO: compiled from: CipherSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lokio/CipherSource;", "Lokio/Source;", "source", "Lokio/BufferedSource;", "cipher", "Ljavax/crypto/Cipher;", "(Lokio/BufferedSource;Ljavax/crypto/Cipher;)V", "blockSize", "", "buffer", "Lokio/Buffer;", "getCipher", "()Ljavax/crypto/Cipher;", "closed", "", "final", "close", "", "doFinal", "read", "", "sink", "byteCount", "refill", "timeout", "Lokio/Timeout;", "update", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CipherSource implements okio.Source {
    private final int blockSize;
    private final okio.Buffer buffer;
    private final javax.crypto.Cipher cipher;
    private boolean closed;
    private boolean final;
    private final okio.BufferedSource source;

    public CipherSource(okio.BufferedSource source, javax.crypto.Cipher cipher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.source = source;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new okio.Buffer();
        if (!(blockSize > 0)) {
            throw new java.lang.IllegalArgumentException(("Block cipher required " + cipher).toString());
        }
    }

    public final javax.crypto.Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.Source
    public long read(okio.Buffer sink, long byteCount) throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.io.IOException, javax.crypto.ShortBufferException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(byteCount >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (!(true ^ this.closed)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        refill();
        return this.buffer.read(sink, byteCount);
    }

    private final void refill() throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.io.IOException, javax.crypto.ShortBufferException {
        while (this.buffer.size() == 0 && !this.final) {
            if (this.source.exhausted()) {
                this.final = true;
                doFinal();
                return;
            }
            update();
        }
    }

    private final void update() throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.io.IOException, javax.crypto.ShortBufferException {
        okio.Segment segment = this.source.getBuffer().head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.limit - segment.pos;
        int outputSize = this.cipher.getOutputSize(i);
        while (outputSize > 8192) {
            int i2 = this.blockSize;
            if (i <= i2) {
                this.final = true;
                okio.Buffer buffer = this.buffer;
                byte[] bArrDoFinal = this.cipher.doFinal(this.source.readByteArray());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                buffer.write(bArrDoFinal);
                return;
            }
            i -= i2;
            outputSize = this.cipher.getOutputSize(i);
        }
        okio.Segment segmentWritableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int iUpdate = this.cipher.update(segment.data, segment.pos, i, segmentWritableSegment$okio.data, segmentWritableSegment$okio.pos);
        this.source.skip(i);
        segmentWritableSegment$okio.limit += iUpdate;
        okio.Buffer buffer2 = this.buffer;
        buffer2.setSize$okio(buffer2.size() + ((long) iUpdate));
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            this.buffer.head = segmentWritableSegment$okio.pop();
            okio.SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    private final void doFinal() throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.ShortBufferException {
        int outputSize = this.cipher.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        okio.Segment segmentWritableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int iDoFinal = this.cipher.doFinal(segmentWritableSegment$okio.data, segmentWritableSegment$okio.pos);
        segmentWritableSegment$okio.limit += iDoFinal;
        okio.Buffer buffer = this.buffer;
        buffer.setSize$okio(buffer.size() + ((long) iDoFinal));
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            this.buffer.head = segmentWritableSegment$okio.pop();
            okio.SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public okio.Timeout getTimeout() {
        return this.source.getTimeout();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.closed = true;
        this.source.close();
    }
}
