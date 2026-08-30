package com.bytedance.sdk.component.IL.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends java.io.InputStream {
    java.net.HttpURLConnection IL;
    java.io.InputStream bg;

    public ldr(java.io.InputStream inputStream, java.net.HttpURLConnection httpURLConnection) {
        this.bg = inputStream;
        this.IL = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        java.io.InputStream inputStream = this.bg;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        java.io.InputStream inputStream = this.bg;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        java.io.InputStream inputStream = this.bg;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        java.io.InputStream inputStream = this.bg;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        java.io.InputStream inputStream = this.bg;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        java.io.InputStream inputStream = this.bg;
        if (inputStream != null) {
            inputStream.close();
            this.bg = null;
        }
        java.net.HttpURLConnection httpURLConnection = this.IL;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.IL = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        java.io.InputStream inputStream = this.bg;
        if (inputStream != null) {
            inputStream.mark(i);
        }
    }

    @Override // java.io.InputStream
    public void reset() throws java.io.IOException {
        java.io.InputStream inputStream = this.bg;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        java.io.InputStream inputStream = this.bg;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }
}
