package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f3790a;
        private final com.pgl.ssdk.o b;

        public a(long j, com.pgl.ssdk.o oVar) {
            this.f3790a = j;
            this.b = oVar;
        }

        public com.pgl.ssdk.o a() {
            return this.b;
        }

        public long b() {
            return this.f3790a;
        }
    }

    public static com.pgl.ssdk.r a(com.pgl.ssdk.o oVar) throws com.pgl.ssdk.q, java.io.IOException {
        com.pgl.ssdk.m<java.nio.ByteBuffer, java.lang.Long> mVarA = com.pgl.ssdk.n.a(oVar);
        if (mVarA == null) {
            throw new com.pgl.ssdk.q("ZIP End of Central Directory record not found");
        }
        java.nio.ByteBuffer byteBufferA = mVarA.a();
        long jLongValue = mVarA.b().longValue();
        byteBufferA.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        long jC = com.pgl.ssdk.n.c(byteBufferA);
        if (jC > jLongValue) {
            throw new com.pgl.ssdk.q("ZIP Central Directory start offset out of range: " + jC + ". ZIP End of Central Directory offset: " + jLongValue);
        }
        long jD = com.pgl.ssdk.n.d(byteBufferA);
        long j = jC + jD;
        if (j <= jLongValue) {
            return new com.pgl.ssdk.r(jC, jD, com.pgl.ssdk.n.e(byteBufferA), jLongValue, byteBufferA);
        }
        throw new com.pgl.ssdk.q("ZIP Central Directory overlaps with End of Central Directory. CD end: " + j + ", EoCD start: " + jLongValue);
    }

    public static com.pgl.ssdk.d.a a(com.pgl.ssdk.o oVar, com.pgl.ssdk.r rVar) throws com.pgl.ssdk.b, java.io.IOException {
        long jA = rVar.a();
        long jC = rVar.c() + jA;
        long jE = rVar.e();
        if (jC != jE) {
            throw new com.pgl.ssdk.b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + jC + ", EoCD start: " + jE);
        }
        if (jA >= 32) {
            java.nio.ByteBuffer byteBufferA = oVar.a(jA - 24, 24);
            java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            if (byteBufferA.getLong(8) == 2334950737559900225L && byteBufferA.getLong(16) == 3617552046287187010L) {
                long j = byteBufferA.getLong(0);
                if (j < byteBufferA.capacity() || j > 2147483639) {
                    throw new com.pgl.ssdk.b("APK Signing Block size out of range: ".concat(java.lang.String.valueOf(j)));
                }
                long j2 = (int) (8 + j);
                long j3 = jA - j2;
                if (j3 >= 0) {
                    java.nio.ByteBuffer byteBufferA2 = oVar.a(j3, 8);
                    byteBufferA2.order(byteOrder);
                    long j4 = byteBufferA2.getLong(0);
                    if (j4 == j) {
                        return new com.pgl.ssdk.d.a(j3, oVar.a(j3, j2));
                    }
                    throw new com.pgl.ssdk.b("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j);
                }
                throw new com.pgl.ssdk.b("APK Signing Block offset out of range: ".concat(java.lang.String.valueOf(j3)));
            }
            throw new com.pgl.ssdk.b("No APK Signing Block before ZIP Central Directory");
        }
        throw new com.pgl.ssdk.b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(java.lang.String.valueOf(jA)));
    }
}
