package com.bykv.vk.openvk.preload.geckox.buffer.stream;

/* JADX INFO: loaded from: classes3.dex */
public class BufferOutputStream extends com.bykv.vk.openvk.preload.geckox.buffer.stream.b {
    private com.bykv.vk.openvk.preload.geckox.buffer.a mBuffer;

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
    }

    public BufferOutputStream(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.mBuffer = aVar;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        this.mBuffer.a(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        this.mBuffer.a(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.mBuffer.a(bArr, i, i2);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j, int i) throws java.io.IOException {
        synchronized (this) {
            this.mBuffer.b(j);
            this.mBuffer.a(i);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j, byte[] bArr) throws java.io.IOException {
        synchronized (this) {
            this.mBuffer.b(j);
            this.mBuffer.a(bArr);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j, byte[] bArr, int i, int i2) throws java.io.IOException {
        synchronized (this) {
            this.mBuffer.b(j);
            this.mBuffer.a(bArr, i, i2);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        flush();
    }
}
