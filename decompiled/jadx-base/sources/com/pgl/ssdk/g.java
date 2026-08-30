package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f3792a = "0123456789abcdef".toCharArray();

    public static com.pgl.ssdk.h a(com.pgl.ssdk.o oVar, com.pgl.ssdk.r rVar, int i) throws com.pgl.ssdk.i, java.io.IOException {
        try {
            com.pgl.ssdk.d.a aVarA = com.pgl.ssdk.d.a(oVar, rVar);
            long jB = aVarA.b();
            com.pgl.ssdk.o oVarA = aVarA.a();
            java.nio.ByteBuffer byteBufferA = oVarA.a(0L, (int) oVarA.a());
            byteBufferA.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            return new com.pgl.ssdk.h(a(byteBufferA, i), jB, rVar.a(), rVar.e(), rVar.d());
        } catch (com.pgl.ssdk.b e) {
            throw new com.pgl.ssdk.i(e.getMessage(), e);
        }
    }

    private static java.nio.ByteBuffer b(java.nio.ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("size: ".concat(java.lang.String.valueOf(i)));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new java.nio.BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static byte[] c(java.nio.ByteBuffer byteBuffer) throws com.pgl.ssdk.a {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new com.pgl.ssdk.a("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new com.pgl.ssdk.a("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static java.nio.ByteBuffer b(java.nio.ByteBuffer byteBuffer) throws com.pgl.ssdk.a {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return b(byteBuffer, i);
                }
                throw new com.pgl.ssdk.a("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
            }
            throw new java.lang.IllegalArgumentException("Negative length");
        }
        throw new com.pgl.ssdk.a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    public static java.nio.ByteBuffer a(java.nio.ByteBuffer byteBuffer, int i) throws com.pgl.ssdk.i {
        a(byteBuffer);
        java.nio.ByteBuffer byteBufferA = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i2 = 0;
        while (byteBufferA.hasRemaining()) {
            i2++;
            if (byteBufferA.remaining() >= 8) {
                long j = byteBufferA.getLong();
                if (j >= 4 && j <= 2147483647L) {
                    int i3 = (int) j;
                    int iPosition = byteBufferA.position() + i3;
                    if (i3 <= byteBufferA.remaining()) {
                        if (byteBufferA.getInt() == i) {
                            return b(byteBufferA, i3 - 4);
                        }
                        byteBufferA.position(iPosition);
                    } else {
                        throw new com.pgl.ssdk.i("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferA.remaining());
                    }
                } else {
                    throw new com.pgl.ssdk.i("APK Signing Block entry #" + i2 + " size out of range: " + j);
                }
            } else {
                throw new com.pgl.ssdk.i("Insufficient data to read size of APK Signing Block entry #".concat(java.lang.String.valueOf(i2)));
            }
        }
        throw new com.pgl.ssdk.i("No APK Signature Scheme block in APK Signing Block with ID: ".concat(java.lang.String.valueOf(i)));
    }

    public static void a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static java.nio.ByteBuffer a(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("start: ".concat(java.lang.String.valueOf(i)));
        }
        if (i2 >= i) {
            int iCapacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int iLimit = byteBuffer.limit();
                int iPosition = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(i);
                    java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBufferSlice.order(byteBuffer.order());
                    return byteBufferSlice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(iLimit);
                    byteBuffer.position(iPosition);
                }
            }
            throw new java.lang.IllegalArgumentException("end > capacity: " + i2 + " > " + iCapacity);
        }
        throw new java.lang.IllegalArgumentException("end < start: " + i2 + " < " + i);
    }
}
