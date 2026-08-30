package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
class AppendableWriter extends java.io.Writer {
    private boolean closed;
    private final java.lang.Appendable target;

    AppendableWriter(java.lang.Appendable target) {
        this.target = (java.lang.Appendable) com.google.common.base.Preconditions.checkNotNull(target);
    }

    @Override // java.io.Writer
    public void write(char[] cbuf, int off, int len) throws java.io.IOException {
        checkNotClosed();
        this.target.append(new java.lang.String(cbuf, off, len));
    }

    @Override // java.io.Writer
    public void write(int c) throws java.io.IOException {
        checkNotClosed();
        this.target.append((char) c);
    }

    @Override // java.io.Writer
    public void write(java.lang.String str) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(str);
        checkNotClosed();
        this.target.append(str);
    }

    @Override // java.io.Writer
    public void write(java.lang.String str, int off, int len) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(str);
        checkNotClosed();
        this.target.append(str, off, len + off);
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
        checkNotClosed();
        java.lang.Appendable appendable = this.target;
        if (appendable instanceof java.io.Flushable) {
            ((java.io.Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.closed = true;
        java.lang.Appendable appendable = this.target;
        if (appendable instanceof java.io.Closeable) {
            ((java.io.Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char c) throws java.io.IOException {
        checkNotClosed();
        this.target.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(@javax.annotation.CheckForNull java.lang.CharSequence charSeq) throws java.io.IOException {
        checkNotClosed();
        this.target.append(charSeq);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(@javax.annotation.CheckForNull java.lang.CharSequence charSeq, int start, int end) throws java.io.IOException {
        checkNotClosed();
        this.target.append(charSeq, start, end);
        return this;
    }

    private void checkNotClosed() throws java.io.IOException {
        if (this.closed) {
            throw new java.io.IOException("Cannot write to a closed writer.");
        }
    }
}
