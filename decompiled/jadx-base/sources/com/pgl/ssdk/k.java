package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class k {
    public static java.util.List<com.pgl.ssdk.e> a(com.pgl.ssdk.o oVar, com.pgl.ssdk.c.a aVar) throws java.io.IOException, com.pgl.ssdk.f.a {
        return b(com.pgl.ssdk.f.a(oVar, aVar, 1896449818).f3793a);
    }

    public static java.util.List<com.pgl.ssdk.e> b(java.nio.ByteBuffer byteBuffer) {
        try {
            java.nio.ByteBuffer byteBufferA = com.pgl.ssdk.f.a(byteBuffer);
            if (!byteBufferA.hasRemaining()) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (byteBufferA.hasRemaining()) {
                try {
                    arrayList.add(a(com.pgl.ssdk.f.a(byteBufferA)));
                } catch (com.pgl.ssdk.a | java.nio.BufferUnderflowException unused) {
                    return null;
                } catch (java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused2) {
                }
            }
            return arrayList;
        } catch (com.pgl.ssdk.a unused3) {
            return null;
        }
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    private static com.pgl.ssdk.e a(java.nio.ByteBuffer byteBuffer) throws java.security.NoSuchAlgorithmException, com.pgl.ssdk.a, java.security.cert.CertificateException {
        java.nio.ByteBuffer byteBufferA = com.pgl.ssdk.f.a(byteBuffer);
        byteBufferA.get(new byte[byteBufferA.remaining()]);
        byteBufferA.flip();
        byteBufferA.position(0);
        com.pgl.ssdk.f.a(byteBufferA);
        byte[] bArrB = com.pgl.ssdk.f.b(com.pgl.ssdk.f.a(byteBufferA));
        try {
            java.security.cert.Certificate certificateGenerateCertificate = java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new java.io.ByteArrayInputStream(bArrB));
            if (certificateGenerateCertificate instanceof java.security.cert.X509Certificate) {
                return new com.pgl.ssdk.e(java.lang.String.valueOf(((java.security.cert.X509Certificate) certificateGenerateCertificate).getSubjectDN()), bArrB);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
