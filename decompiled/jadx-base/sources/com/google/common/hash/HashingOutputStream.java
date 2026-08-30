package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
public final class HashingOutputStream extends java.io.FilterOutputStream {
    private final com.google.common.hash.Hasher hasher;

    public HashingOutputStream(com.google.common.hash.HashFunction hashFunction, java.io.OutputStream out) {
        super((java.io.OutputStream) com.google.common.base.Preconditions.checkNotNull(out));
        this.hasher = (com.google.common.hash.Hasher) com.google.common.base.Preconditions.checkNotNull(hashFunction.newHasher());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b) throws java.io.IOException {
        this.hasher.putByte((byte) b);
        this.out.write(b);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bytes, int off, int len) throws java.io.IOException {
        this.hasher.putBytes(bytes, off, len);
        this.out.write(bytes, off, len);
    }

    public com.google.common.hash.HashCode hash() {
        return this.hasher.hash();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.out.close();
    }
}
