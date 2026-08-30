package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractByteHasher extends com.google.common.hash.AbstractHasher {
    private final java.nio.ByteBuffer scratch = java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN);

    protected abstract void update(byte b);

    AbstractByteHasher() {
    }

    protected void update(byte[] b) {
        update(b, 0, b.length);
    }

    protected void update(byte[] b, int off, int len) {
        for (int i = off; i < off + len; i++) {
            update(b[i]);
        }
    }

    protected void update(java.nio.ByteBuffer b) {
        if (b.hasArray()) {
            update(b.array(), b.arrayOffset() + b.position(), b.remaining());
            com.google.common.hash.Java8Compatibility.position(b, b.limit());
        } else {
            for (int iRemaining = b.remaining(); iRemaining > 0; iRemaining--) {
                update(b.get());
            }
        }
    }

    private com.google.common.hash.Hasher update(int bytes) {
        try {
            update(this.scratch.array(), 0, bytes);
            return this;
        } finally {
            com.google.common.hash.Java8Compatibility.clear(this.scratch);
        }
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putByte(byte b) {
        update(b);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(byte[] bytes) {
        com.google.common.base.Preconditions.checkNotNull(bytes);
        update(bytes);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(byte[] bytes, int off, int len) {
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, bytes.length);
        update(bytes, off, len);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer bytes) {
        update(bytes);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putShort(short s) {
        this.scratch.putShort(s);
        return update(2);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putInt(int i) {
        this.scratch.putInt(i);
        return update(4);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putLong(long l) {
        this.scratch.putLong(l);
        return update(8);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putChar(char c) {
        this.scratch.putChar(c);
        return update(2);
    }
}
