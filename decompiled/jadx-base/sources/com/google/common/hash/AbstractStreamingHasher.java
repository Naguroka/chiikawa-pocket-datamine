package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractStreamingHasher extends com.google.common.hash.AbstractHasher {
    private final java.nio.ByteBuffer buffer;
    private final int bufferSize;
    private final int chunkSize;

    protected abstract com.google.common.hash.HashCode makeHash();

    protected abstract void process(java.nio.ByteBuffer bb);

    protected AbstractStreamingHasher(int chunkSize) {
        this(chunkSize, chunkSize);
    }

    protected AbstractStreamingHasher(int chunkSize, int bufferSize) {
        com.google.common.base.Preconditions.checkArgument(bufferSize % chunkSize == 0);
        this.buffer = java.nio.ByteBuffer.allocate(bufferSize + 7).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.bufferSize = bufferSize;
        this.chunkSize = chunkSize;
    }

    protected void processRemaining(java.nio.ByteBuffer bb) {
        com.google.common.hash.Java8Compatibility.position(bb, bb.limit());
        com.google.common.hash.Java8Compatibility.limit(bb, this.chunkSize + 7);
        while (true) {
            int iPosition = bb.position();
            int i = this.chunkSize;
            if (iPosition < i) {
                bb.putLong(0L);
            } else {
                com.google.common.hash.Java8Compatibility.limit(bb, i);
                com.google.common.hash.Java8Compatibility.flip(bb);
                process(bb);
                return;
            }
        }
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putBytes(byte[] bytes, int off, int len) {
        return putBytesInternal(java.nio.ByteBuffer.wrap(bytes, off, len).order(java.nio.ByteOrder.LITTLE_ENDIAN));
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer readBuffer) {
        java.nio.ByteOrder byteOrderOrder = readBuffer.order();
        try {
            readBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            return putBytesInternal(readBuffer);
        } finally {
            readBuffer.order(byteOrderOrder);
        }
    }

    private com.google.common.hash.Hasher putBytesInternal(java.nio.ByteBuffer readBuffer) {
        if (readBuffer.remaining() <= this.buffer.remaining()) {
            this.buffer.put(readBuffer);
            munchIfFull();
            return this;
        }
        int iPosition = this.bufferSize - this.buffer.position();
        for (int i = 0; i < iPosition; i++) {
            this.buffer.put(readBuffer.get());
        }
        munch();
        while (readBuffer.remaining() >= this.chunkSize) {
            process(readBuffer);
        }
        this.buffer.put(readBuffer);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putByte(byte b) {
        this.buffer.put(b);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putShort(short s) {
        this.buffer.putShort(s);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putChar(char c) {
        this.buffer.putChar(c);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putInt(int i) {
        this.buffer.putInt(i);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putLong(long l) {
        this.buffer.putLong(l);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.Hasher
    public final com.google.common.hash.HashCode hash() {
        munch();
        com.google.common.hash.Java8Compatibility.flip(this.buffer);
        if (this.buffer.remaining() > 0) {
            processRemaining(this.buffer);
            java.nio.ByteBuffer byteBuffer = this.buffer;
            com.google.common.hash.Java8Compatibility.position(byteBuffer, byteBuffer.limit());
        }
        return makeHash();
    }

    private void munchIfFull() {
        if (this.buffer.remaining() < 8) {
            munch();
        }
    }

    private void munch() {
        com.google.common.hash.Java8Compatibility.flip(this.buffer);
        while (this.buffer.remaining() >= this.chunkSize) {
            process(this.buffer);
        }
        this.buffer.compact();
    }
}
