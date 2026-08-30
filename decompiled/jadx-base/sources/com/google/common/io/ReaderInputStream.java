package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
final class ReaderInputStream extends java.io.InputStream {
    private java.nio.ByteBuffer byteBuffer;
    private java.nio.CharBuffer charBuffer;
    private boolean doneFlushing;
    private boolean draining;
    private final java.nio.charset.CharsetEncoder encoder;
    private boolean endOfInput;
    private final java.io.Reader reader;
    private final byte[] singleByte;

    ReaderInputStream(java.io.Reader reader, java.nio.charset.Charset charset, int bufferSize) {
        this(reader, charset.newEncoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE), bufferSize);
    }

    ReaderInputStream(java.io.Reader reader, java.nio.charset.CharsetEncoder encoder, int bufferSize) {
        this.singleByte = new byte[1];
        this.reader = (java.io.Reader) com.google.common.base.Preconditions.checkNotNull(reader);
        this.encoder = (java.nio.charset.CharsetEncoder) com.google.common.base.Preconditions.checkNotNull(encoder);
        com.google.common.base.Preconditions.checkArgument(bufferSize > 0, "bufferSize must be positive: %s", bufferSize);
        encoder.reset();
        java.nio.CharBuffer charBufferAllocate = java.nio.CharBuffer.allocate(bufferSize);
        this.charBuffer = charBufferAllocate;
        com.google.common.io.Java8Compatibility.flip(charBufferAllocate);
        this.byteBuffer = java.nio.ByteBuffer.allocate(bufferSize);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.reader.close();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (read(this.singleByte) == 1) {
            return com.google.common.primitives.UnsignedBytes.toInt(this.singleByte[0]);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws java.io.IOException {
        java.nio.charset.CoderResult coderResultEncode;
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, b.length);
        if (len == 0) {
            return 0;
        }
        boolean z = this.endOfInput;
        int iDrain = 0;
        while (true) {
            if (this.draining) {
                iDrain += drain(b, off + iDrain, len - iDrain);
                if (iDrain == len || this.doneFlushing) {
                    break;
                }
                this.draining = false;
                com.google.common.io.Java8Compatibility.clear(this.byteBuffer);
            }
            while (true) {
                if (this.doneFlushing) {
                    coderResultEncode = java.nio.charset.CoderResult.UNDERFLOW;
                } else if (z) {
                    coderResultEncode = this.encoder.flush(this.byteBuffer);
                } else {
                    coderResultEncode = this.encoder.encode(this.charBuffer, this.byteBuffer, this.endOfInput);
                }
                if (coderResultEncode.isOverflow()) {
                    startDraining(true);
                    break;
                }
                if (coderResultEncode.isUnderflow()) {
                    if (z) {
                        this.doneFlushing = true;
                        startDraining(false);
                        break;
                    }
                    if (this.endOfInput) {
                        z = true;
                    } else {
                        readMoreChars();
                    }
                } else if (coderResultEncode.isError()) {
                    coderResultEncode.throwException();
                    return 0;
                }
            }
        }
        if (iDrain > 0) {
            return iDrain;
        }
        return -1;
    }

    private static java.nio.CharBuffer grow(java.nio.CharBuffer buf) {
        java.nio.CharBuffer charBufferWrap = java.nio.CharBuffer.wrap(java.util.Arrays.copyOf(buf.array(), buf.capacity() * 2));
        com.google.common.io.Java8Compatibility.position(charBufferWrap, buf.position());
        com.google.common.io.Java8Compatibility.limit(charBufferWrap, buf.limit());
        return charBufferWrap;
    }

    private void readMoreChars() throws java.io.IOException {
        if (availableCapacity(this.charBuffer) == 0) {
            if (this.charBuffer.position() > 0) {
                com.google.common.io.Java8Compatibility.flip(this.charBuffer.compact());
            } else {
                this.charBuffer = grow(this.charBuffer);
            }
        }
        int iLimit = this.charBuffer.limit();
        int i = this.reader.read(this.charBuffer.array(), iLimit, availableCapacity(this.charBuffer));
        if (i == -1) {
            this.endOfInput = true;
        } else {
            com.google.common.io.Java8Compatibility.limit(this.charBuffer, iLimit + i);
        }
    }

    private static int availableCapacity(java.nio.Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private void startDraining(boolean overflow) {
        com.google.common.io.Java8Compatibility.flip(this.byteBuffer);
        if (overflow && this.byteBuffer.remaining() == 0) {
            this.byteBuffer = java.nio.ByteBuffer.allocate(this.byteBuffer.capacity() * 2);
        } else {
            this.draining = true;
        }
    }

    private int drain(byte[] b, int off, int len) {
        int iMin = java.lang.Math.min(len, this.byteBuffer.remaining());
        this.byteBuffer.get(b, off, iMin);
        return iMin;
    }
}
