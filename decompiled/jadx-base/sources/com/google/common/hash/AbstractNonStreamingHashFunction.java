package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractNonStreamingHashFunction extends com.google.common.hash.AbstractHashFunction {
    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public abstract com.google.common.hash.HashCode hashBytes(byte[] input, int off, int len);

    AbstractNonStreamingHashFunction() {
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        return newHasher(32);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher(int expectedInputSize) {
        com.google.common.base.Preconditions.checkArgument(expectedInputSize >= 0);
        return new com.google.common.hash.AbstractNonStreamingHashFunction.BufferingHasher(expectedInputSize);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashInt(int input) {
        return hashBytes(java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(input).array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashLong(long input) {
        return hashBytes(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(input).array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence input) {
        int length = input.length();
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(length * 2).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            byteBufferOrder.putChar(input.charAt(i));
        }
        return hashBytes(byteBufferOrder.array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashString(java.lang.CharSequence input, java.nio.charset.Charset charset) {
        return hashBytes(input.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(java.nio.ByteBuffer input) {
        return newHasher(input.remaining()).putBytes(input).hash();
    }

    private final class BufferingHasher extends com.google.common.hash.AbstractHasher {
        final com.google.common.hash.AbstractNonStreamingHashFunction.ExposedByteArrayOutputStream stream;

        BufferingHasher(int expectedInputSize) {
            this.stream = new com.google.common.hash.AbstractNonStreamingHashFunction.ExposedByteArrayOutputStream(expectedInputSize);
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putByte(byte b) {
            this.stream.write(b);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putBytes(byte[] bytes, int off, int len) {
            this.stream.write(bytes, off, len);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer bytes) {
            this.stream.write(bytes);
            return this;
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
            return com.google.common.hash.AbstractNonStreamingHashFunction.this.hashBytes(this.stream.byteArray(), 0, this.stream.length());
        }
    }

    private static final class ExposedByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        ExposedByteArrayOutputStream(int expectedInputSize) {
            super(expectedInputSize);
        }

        void write(java.nio.ByteBuffer input) {
            int iRemaining = input.remaining();
            if (this.count + iRemaining > this.buf.length) {
                this.buf = java.util.Arrays.copyOf(this.buf, this.count + iRemaining);
            }
            input.get(this.buf, this.count, iRemaining);
            this.count += iRemaining;
        }

        byte[] byteArray() {
            return this.buf;
        }

        int length() {
            return this.count;
        }
    }
}
