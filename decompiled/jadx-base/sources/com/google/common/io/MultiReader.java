package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
class MultiReader extends java.io.Reader {

    @javax.annotation.CheckForNull
    private java.io.Reader current;
    private final java.util.Iterator<? extends com.google.common.io.CharSource> it;

    MultiReader(java.util.Iterator<? extends com.google.common.io.CharSource> readers) throws java.io.IOException {
        this.it = readers;
        advance();
    }

    private void advance() throws java.io.IOException {
        close();
        if (this.it.hasNext()) {
            this.current = this.it.next().openStream();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cbuf, int off, int len) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(cbuf);
        java.io.Reader reader = this.current;
        if (reader == null) {
            return -1;
        }
        int i = reader.read(cbuf, off, len);
        if (i != -1) {
            return i;
        }
        advance();
        return read(cbuf, off, len);
    }

    @Override // java.io.Reader
    public long skip(long n) throws java.io.IOException {
        com.google.common.base.Preconditions.checkArgument(n >= 0, "n is negative");
        if (n > 0) {
            while (true) {
                java.io.Reader reader = this.current;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(n);
                if (jSkip > 0) {
                    return jSkip;
                }
                advance();
            }
        }
        return 0L;
    }

    @Override // java.io.Reader
    public boolean ready() throws java.io.IOException {
        java.io.Reader reader = this.current;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        java.io.Reader reader = this.current;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.current = null;
            }
        }
    }
}
