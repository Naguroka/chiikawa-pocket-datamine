package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
public interface PrimitiveSink {
    com.google.common.hash.PrimitiveSink putBoolean(boolean b);

    com.google.common.hash.PrimitiveSink putByte(byte b);

    com.google.common.hash.PrimitiveSink putBytes(java.nio.ByteBuffer bytes);

    com.google.common.hash.PrimitiveSink putBytes(byte[] bytes);

    com.google.common.hash.PrimitiveSink putBytes(byte[] bytes, int off, int len);

    com.google.common.hash.PrimitiveSink putChar(char c);

    com.google.common.hash.PrimitiveSink putDouble(double d);

    com.google.common.hash.PrimitiveSink putFloat(float f);

    com.google.common.hash.PrimitiveSink putInt(int i);

    com.google.common.hash.PrimitiveSink putLong(long l);

    com.google.common.hash.PrimitiveSink putShort(short s);

    com.google.common.hash.PrimitiveSink putString(java.lang.CharSequence charSequence, java.nio.charset.Charset charset);

    com.google.common.hash.PrimitiveSink putUnencodedChars(java.lang.CharSequence charSequence);
}
