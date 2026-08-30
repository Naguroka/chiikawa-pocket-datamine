package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class CountingInputStream extends java.io.FilterInputStream {
    private long count;
    private long mark;

    public CountingInputStream(java.io.InputStream in) {
        super((java.io.InputStream) com.google.common.base.Preconditions.checkNotNull(in));
        this.mark = -1L;
    }

    public long getCount() {
        return this.count;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int i = this.in.read();
        if (i != -1) {
            this.count++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] b, int off, int len) throws java.io.IOException {
        int i = this.in.read(b, off, len);
        if (i != -1) {
            this.count += (long) i;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long n) throws java.io.IOException {
        long jSkip = this.in.skip(n);
        this.count += jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int readlimit) {
        this.in.mark(readlimit);
        this.mark = this.count;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
        if (!this.in.markSupported()) {
            throw new java.io.IOException("Mark not supported");
        }
        if (this.mark == -1) {
            throw new java.io.IOException("Mark not set");
        }
        this.in.reset();
        this.count = this.mark;
    }
}
