package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class AbstractHashFunction implements com.google.common.hash.HashFunction {
    AbstractHashFunction() {
    }

    @Override // com.google.common.hash.HashFunction
    public <T> com.google.common.hash.HashCode hashObject(@com.google.common.hash.ParametricNullness T instance, com.google.common.hash.Funnel<? super T> funnel) {
        return newHasher().putObject(instance, funnel).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence input) {
        return newHasher(input.length() * 2).putUnencodedChars(input).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashString(java.lang.CharSequence input, java.nio.charset.Charset charset) {
        return newHasher().putString(input, charset).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashInt(int input) {
        return newHasher(4).putInt(input).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashLong(long input) {
        return newHasher(8).putLong(input).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(byte[] input) {
        return hashBytes(input, 0, input.length);
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(byte[] input, int off, int len) {
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, input.length);
        return newHasher(len).putBytes(input, off, len).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(java.nio.ByteBuffer input) {
        return newHasher(input.remaining()).putBytes(input).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher(int expectedInputSize) {
        com.google.common.base.Preconditions.checkArgument(expectedInputSize >= 0, "expectedInputSize must be >= 0 but was %s", expectedInputSize);
        return newHasher();
    }
}
