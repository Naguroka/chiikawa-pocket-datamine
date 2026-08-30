package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    public static class a extends java.lang.Exception {
        public a(java.lang.String str) {
            super(str);
        }
    }

    public static java.nio.ByteBuffer a(java.nio.ByteBuffer byteBuffer) throws com.pgl.ssdk.a {
        return com.pgl.ssdk.g.b(byteBuffer);
    }

    public static byte[] b(java.nio.ByteBuffer byteBuffer) throws com.pgl.ssdk.a {
        return com.pgl.ssdk.g.c(byteBuffer);
    }

    public static com.pgl.ssdk.h a(com.pgl.ssdk.o oVar, com.pgl.ssdk.c.a aVar, int i) throws java.io.IOException, com.pgl.ssdk.f.a {
        try {
            return com.pgl.ssdk.g.a(oVar, aVar, i);
        } catch (com.pgl.ssdk.i e) {
            throw new com.pgl.ssdk.f.a(e.getMessage());
        }
    }
}
