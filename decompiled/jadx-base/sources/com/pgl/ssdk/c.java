package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public static class a extends com.pgl.ssdk.r {
        public a(long j, long j2, int i, long j3, java.nio.ByteBuffer byteBuffer) {
            super(j, j2, i, j3, byteBuffer);
        }
    }

    public static com.pgl.ssdk.c.a a(com.pgl.ssdk.o oVar) throws com.pgl.ssdk.q, java.io.IOException {
        com.pgl.ssdk.r rVarA = com.pgl.ssdk.d.a(oVar);
        return new com.pgl.ssdk.c.a(rVarA.a(), rVarA.c(), rVarA.b(), rVarA.e(), rVarA.d());
    }
}
