package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractHasher implements com.google.common.hash.Hasher {
    AbstractHasher() {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putBoolean(boolean z) {
        return putByte(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putDouble(double d) {
        return putLong(java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putFloat(float f) {
        return putInt(java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putUnencodedChars(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            putChar(charSequence.charAt(i));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putString(java.lang.CharSequence charSequence, java.nio.charset.Charset charset) {
        return putBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(byte[] bytes) {
        return putBytes(bytes, 0, bytes.length);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(byte[] bytes, int off, int len) {
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, bytes.length);
        for (int i = 0; i < len; i++) {
            putByte(bytes[off + i]);
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer b) {
        if (b.hasArray()) {
            putBytes(b.array(), b.arrayOffset() + b.position(), b.remaining());
            com.google.common.hash.Java8Compatibility.position(b, b.limit());
        } else {
            for (int iRemaining = b.remaining(); iRemaining > 0; iRemaining--) {
                putByte(b.get());
            }
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putShort(short s) {
        putByte((byte) s);
        putByte((byte) (s >>> 8));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putInt(int i) {
        putByte((byte) i);
        putByte((byte) (i >>> 8));
        putByte((byte) (i >>> 16));
        putByte((byte) (i >>> 24));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putLong(long l) {
        for (int i = 0; i < 64; i += 8) {
            putByte((byte) (l >>> i));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putChar(char c) {
        putByte((byte) c);
        putByte((byte) (c >>> '\b'));
        return this;
    }

    @Override // com.google.common.hash.Hasher
    public <T> com.google.common.hash.Hasher putObject(@com.google.common.hash.ParametricNullness T instance, com.google.common.hash.Funnel<? super T> funnel) {
        funnel.funnel(instance, this);
        return this;
    }
}
