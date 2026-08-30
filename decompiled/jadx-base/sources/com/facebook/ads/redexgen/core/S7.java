package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class S7 {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{77, 87, 73, 87, 74, 41, 50, 59, 87, 75, 62, 5, 10, 9, 7, 14, 75, 31, 4, 75, 13, 2, 5, 15, 75, 29, 10, 7, 2, 15, 75, 8, 14, 25, 31, 2, 13, 2, 8, 10, 31, 14, 75, 4, 25, 75, 27, 30, 9, 7, 2, 8, 75, 0, 14, 18, 69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A03(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.util.Set<java.lang.String> set, java.util.Set<java.lang.String> set2) throws java.lang.Exception {
        java.lang.String strA00 = A00(5, 5, 16);
        if (android.os.Build.VERSION.SDK_INT == 15) {
            if (A00(0, 5, 19).equals(android.os.Build.VERSION.RELEASE)) {
                return;
            }
        }
        try {
            for (java.security.cert.Certificate certificate : httpsURLConnection.getServerCertificates()) {
                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
                java.lang.String strA01 = A01(x509Certificate.getEncoded(), strA00);
                if (set != null && set.contains(strA01)) {
                    return;
                }
                java.lang.String strA02 = A01(x509Certificate.getPublicKey().getEncoded(), strA00);
                if (set2 != null && set2.contains(strA02)) {
                    return;
                }
            }
            throw new java.security.cert.CertificateException(A00(10, 47, 1));
        } catch (java.lang.Exception e) {
            throw e;
        }
    }

    public static java.lang.String A01(byte[] bArr, java.lang.String str) throws java.security.NoSuchAlgorithmException {
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance(str);
        digest.reset();
        return android.util.Base64.encodeToString(digest.digest(bArr), 0);
    }
}
