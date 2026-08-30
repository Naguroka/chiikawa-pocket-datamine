package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
final class MultiInputStream extends java.io.InputStream {

    @javax.annotation.CheckForNull
    private java.io.InputStream in;
    private java.util.Iterator<? extends com.google.common.io.ByteSource> it;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public MultiInputStream(java.util.Iterator<? extends com.google.common.io.ByteSource> it) throws java.io.IOException {
        this.it = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(it);
        advance();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        java.io.InputStream inputStream = this.in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.in = null;
            }
        }
    }

    private void advance() throws java.io.IOException {
        close();
        if (this.it.hasNext()) {
            this.in = this.it.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        java.io.InputStream inputStream = this.in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        while (true) {
            java.io.InputStream inputStream = this.in;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(b);
        while (true) {
            java.io.InputStream inputStream = this.in;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read(b, off, len);
            if (i != -1) {
                return i;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public long skip(long n) throws java.io.IOException {
        java.io.InputStream inputStream = this.in;
        if (inputStream == null || n <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(n);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.in.skip(n - 1) + 1;
    }
}
