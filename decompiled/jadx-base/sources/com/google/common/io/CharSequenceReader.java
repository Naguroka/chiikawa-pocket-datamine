package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
final class CharSequenceReader extends java.io.Reader {
    private int mark;
    private int pos;

    @javax.annotation.CheckForNull
    private java.lang.CharSequence seq;

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    public CharSequenceReader(java.lang.CharSequence seq) {
        this.seq = (java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(seq);
    }

    private void checkOpen() throws java.io.IOException {
        if (this.seq == null) {
            throw new java.io.IOException("reader closed");
        }
    }

    private boolean hasRemaining() {
        return remaining() > 0;
    }

    private int remaining() {
        java.util.Objects.requireNonNull(this.seq);
        return this.seq.length() - this.pos;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(java.nio.CharBuffer target) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(target);
        checkOpen();
        java.util.Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int iMin = java.lang.Math.min(target.remaining(), remaining());
        for (int i = 0; i < iMin; i++) {
            java.lang.CharSequence charSequence = this.seq;
            int i2 = this.pos;
            this.pos = i2 + 1;
            target.put(charSequence.charAt(i2));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() throws java.io.IOException {
        int iCharAt;
        checkOpen();
        java.util.Objects.requireNonNull(this.seq);
        if (hasRemaining()) {
            java.lang.CharSequence charSequence = this.seq;
            int i = this.pos;
            this.pos = i + 1;
            iCharAt = charSequence.charAt(i);
        } else {
            iCharAt = -1;
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cbuf, int off, int len) throws java.io.IOException {
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, cbuf.length);
        checkOpen();
        java.util.Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int iMin = java.lang.Math.min(len, remaining());
        for (int i = 0; i < iMin; i++) {
            java.lang.CharSequence charSequence = this.seq;
            int i2 = this.pos;
            this.pos = i2 + 1;
            cbuf[off + i] = charSequence.charAt(i2);
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized long skip(long n) throws java.io.IOException {
        int iMin;
        com.google.common.base.Preconditions.checkArgument(n >= 0, "n (%s) may not be negative", n);
        checkOpen();
        iMin = (int) java.lang.Math.min(remaining(), n);
        this.pos += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws java.io.IOException {
        checkOpen();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void mark(int readAheadLimit) throws java.io.IOException {
        com.google.common.base.Preconditions.checkArgument(readAheadLimit >= 0, "readAheadLimit (%s) may not be negative", readAheadLimit);
        checkOpen();
        this.mark = this.pos;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws java.io.IOException {
        checkOpen();
        this.pos = this.mark;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
        this.seq = null;
    }
}
