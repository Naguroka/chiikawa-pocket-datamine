package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
public final class HashingInputStream extends java.io.FilterInputStream {
    private final com.google.common.hash.Hasher hasher;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int readlimit) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public HashingInputStream(com.google.common.hash.HashFunction hashFunction, java.io.InputStream in) {
        super((java.io.InputStream) com.google.common.base.Preconditions.checkNotNull(in));
        this.hasher = (com.google.common.hash.Hasher) com.google.common.base.Preconditions.checkNotNull(hashFunction.newHasher());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int i = this.in.read();
        if (i != -1) {
            this.hasher.putByte((byte) i);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bytes, int off, int len) throws java.io.IOException {
        int i = this.in.read(bytes, off, len);
        if (i != -1) {
            this.hasher.putBytes(bytes, off, i);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
        throw new java.io.IOException("reset not supported");
    }

    public com.google.common.hash.HashCode hash() {
        return this.hasher.hash();
    }
}
