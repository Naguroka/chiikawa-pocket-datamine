package com.bykv.vk.openvk.preload.geckox.buffer.stream;

/* JADX INFO: compiled from: BufferInputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends java.io.InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f1724a;
    private long b;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f1724a = aVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        return this.f1724a.b(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        return this.f1724a.b(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        return this.f1724a.a(j);
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        long jB = this.f1724a.b() - this.f1724a.c();
        if (jB > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jB;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.b = i;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws java.io.IOException {
        this.f1724a.b(this.b);
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        return this.f1724a.d();
    }
}
