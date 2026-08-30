package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bj extends java.io.InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.InputStream f2153a;
    private long b;

    bj(java.io.InputStream inputStream, long j) {
        this.f2153a = inputStream;
        this.b = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        super.close();
        this.f2153a.close();
        this.b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        this.b = j - 1;
        return this.f2153a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.f2153a.read(bArr, i, (int) java.lang.Math.min(i2, j));
        if (i3 != -1) {
            this.b -= (long) i3;
        }
        return i3;
    }
}
