package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LN {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"5C7rQEQBWVsJnjqAAZN8QBBHoCwRHOvI", "Z88WY3x8uhcakMWroAcOyZwbMrMcyrD2", "GaS", "RG8mqKBY9oxpM4ff8ZCXkeRJBSL2fzwW", "fRGWN", "iBM9tWQPO6zus77B3DN", "tCaEdKrWlrqf6UeRmfN", "xklax2dJWvUCBWRx1N6eQvQBJ1IZxl6t"};
    public static final java.lang.String A02;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 62);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-73, -5, 1, -5, -4, -19, -11, -73, -23, -8, -8, -73, -37, -3, -8, -19, -6, -3, -5, -19, -6, -74, -23, -8, -13, -99, -121, -1, -16, 3, -9, 13, 2, -5, -21, -77, -119, -112, -117, -108, 1, -1, 8, -1, 12, 3, -3, -1, 1, 42, 27, 41, 42, -29, 33, 27, 47, 41};
    }

    static {
        A05();
        A02 = com.facebook.ads.redexgen.core.LN.class.getSimpleName();
    }

    public static com.facebook.ads.redexgen.core.LM A00(com.facebook.ads.redexgen.core.C7j c7j) {
        try {
            boolean isRooted = A07() || A06() || A08(A01(47, 2, 78));
            return isRooted ? com.facebook.ads.redexgen.core.LM.A03 : com.facebook.ads.redexgen.core.LM.A05;
        } catch (java.lang.Throwable t) {
            c7j.A07().AA0(A01(40, 7, 92), com.facebook.ads.redexgen.core.C8E.A1M, new com.facebook.ads.redexgen.core.C8F(t));
            return com.facebook.ads.redexgen.core.LM.A04;
        }
    }

    public static java.lang.String A02(android.content.Context context, java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        android.content.pm.PackageManager pm = context.getPackageManager();
        if (pm == null) {
            return A01(0, 0, 69);
        }
        android.content.pm.Signature[] signatureArr = pm.getPackageInfo(str, 64).signatures;
        if (A01[7].length() != 32) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[6] = "ikpGaBwLfx1blWCv8PE";
        strArr[5] = "NCTJdZrpEYM5ZpFC5qB";
        for (android.content.pm.Signature signature : signatureArr) {
            sb.append(com.facebook.ads.redexgen.core.LS.A04(java.security.MessageDigest.getInstance(A01(31, 4, 124)).digest(A04(signature).getEncoded())));
            sb.append(A01(26, 1, 14));
        }
        return sb.toString();
    }

    public static java.lang.String A03(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        try {
            return A02(c7j, str);
        } catch (java.lang.Exception e) {
            c7j.A07().AA0(A01(40, 7, 92), com.facebook.ads.redexgen.core.C8E.A1M, new com.facebook.ads.redexgen.core.C8F(e));
            return null;
        }
    }

    public static java.security.PublicKey A04(android.content.pm.Signature signature) throws java.security.cert.CertificateException {
        return java.security.cert.CertificateFactory.getInstance(A01(35, 5, 29)).generateCertificate(new java.io.ByteArrayInputStream(signature.toByteArray())).getPublicKey();
    }

    public static boolean A06() {
        java.lang.String str = android.os.Build.TAGS;
        if (str != null) {
            java.lang.String buildTags = A01(49, 9, 120);
            if (str.contains(buildTags)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A07() {
        java.io.File superUserApk = new java.io.File(A01(0, 25, 74));
        return superUserApk.exists();
    }

    public static boolean A08(java.lang.String str) {
        for (java.lang.String str2 : java.lang.System.getenv(A01(27, 4, 113)).split(A01(25, 1, 37))) {
            java.io.File file = new java.io.File(str2);
            if (file.exists() && file.isDirectory()) {
                java.io.File[] fileArrListFiles = file.listFiles();
                java.lang.String[] strArr = A01;
                if (strArr[1].charAt(17) != strArr[3].charAt(17)) {
                    java.lang.String[] strArr2 = A01;
                    strArr2[6] = "JMsPqsjcaxLCD34xTC2";
                    strArr2[5] = "FbRxT8DL2tHORlKIcuM";
                    if (fileArrListFiles == null) {
                        continue;
                    } else {
                        for (java.io.File file2 : fileArrListFiles) {
                            boolean zEquals = file2.getName().equals(str);
                            if (A01[7].length() != 32) {
                                throw new java.lang.RuntimeException();
                            }
                            java.lang.String[] strArr3 = A01;
                            strArr3[1] = "YF7GaC3noAI93Jw6Jae3mccsHUmdiEJo";
                            strArr3[3] = "xQd2jFuSOpS96vzWuZJNzWBfXSKKA4my";
                            if (zEquals) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new java.lang.RuntimeException();
                }
            }
        }
        return false;
    }
}
