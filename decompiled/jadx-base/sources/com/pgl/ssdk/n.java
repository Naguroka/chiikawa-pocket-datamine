package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public static com.pgl.ssdk.m<java.nio.ByteBuffer, java.lang.Long> a(com.pgl.ssdk.o oVar) throws java.io.IOException {
        if (oVar.a() < 22) {
            return null;
        }
        com.pgl.ssdk.m<java.nio.ByteBuffer, java.lang.Long> mVarA = a(oVar, 0);
        return mVarA != null ? mVarA : a(oVar, 65535);
    }

    private static int b(java.nio.ByteBuffer byteBuffer) {
        a(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i = iCapacity - 22;
        int iMin = java.lang.Math.min(i, 65535);
        for (int i2 = 0; i2 <= iMin; i2++) {
            int i3 = i - i2;
            if (byteBuffer.getInt(i3) == 101010256 && a(byteBuffer, i3 + 20) == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static long c(java.nio.ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 16);
    }

    public static long d(java.nio.ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 12);
    }

    public static int e(java.nio.ByteBuffer byteBuffer) {
        a(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 10);
    }

    private static com.pgl.ssdk.m<java.nio.ByteBuffer, java.lang.Long> a(com.pgl.ssdk.o oVar, int i) throws java.io.IOException {
        if (i >= 0 && i <= 65535) {
            long jA = oVar.a();
            if (jA < 22) {
                return null;
            }
            int iMin = ((int) java.lang.Math.min(i, jA - 22)) + 22;
            long j = jA - ((long) iMin);
            java.nio.ByteBuffer byteBufferA = oVar.a(j, iMin);
            java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            int iB = b(byteBufferA);
            if (iB == -1) {
                return null;
            }
            byteBufferA.position(iB);
            java.nio.ByteBuffer byteBufferSlice = byteBufferA.slice();
            byteBufferSlice.order(byteOrder);
            return com.pgl.ssdk.m.a(byteBufferSlice, java.lang.Long.valueOf(j + ((long) iB)));
        }
        throw new java.lang.IllegalArgumentException("maxCommentSize: ".concat(java.lang.String.valueOf(i)));
    }

    static long b(java.nio.ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
    }

    static void a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int a(java.nio.ByteBuffer byteBuffer, int i) {
        return byteBuffer.getShort(i) & kotlin.UShort.MAX_VALUE;
    }
}
