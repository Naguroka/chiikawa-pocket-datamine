package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
public interface HashFunction {
    int bits();

    com.google.common.hash.HashCode hashBytes(java.nio.ByteBuffer input);

    com.google.common.hash.HashCode hashBytes(byte[] input);

    com.google.common.hash.HashCode hashBytes(byte[] input, int off, int len);

    com.google.common.hash.HashCode hashInt(int input);

    com.google.common.hash.HashCode hashLong(long input);

    <T> com.google.common.hash.HashCode hashObject(@com.google.common.hash.ParametricNullness T instance, com.google.common.hash.Funnel<? super T> funnel);

    com.google.common.hash.HashCode hashString(java.lang.CharSequence input, java.nio.charset.Charset charset);

    com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence input);

    com.google.common.hash.Hasher newHasher();

    com.google.common.hash.Hasher newHasher(int expectedInputSize);
}
