package com.facebook.ads.internal.util.common;

/* JADX INFO: loaded from: classes4.dex */
public class FbValidationUtils {
    public static final java.lang.String DEBUG_FB_PACKAGE = "com.facebook.wakizashi";
    public static final java.lang.String FB4A_SHA256_HASH = "4/nh4M+Z0OVqBVumXiQbM5n3zqUkMmsM3W7BMn7Q/cE=";
    public static final java.lang.String FB_PACKAGE = "com.facebook.katana";

    public static java.lang.String getSigningCertificate(android.content.pm.PackageInfo packageInfo) {
        if (packageInfo == null) {
            return "";
        }
        try {
            android.content.pm.Signature[] signatureArr = packageInfo.signatures;
            return signatureArr.length == 0 ? "" : calculateSHA256Fingerprint(signatureArr[0].toByteArray());
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static java.lang.String calculateSHA256Fingerprint(byte[] bArr) throws java.security.NoSuchAlgorithmException {
        return android.util.Base64.encodeToString(java.security.MessageDigest.getInstance("SHA256").digest(bArr), 2);
    }

    public static boolean isFbSigningCertificateValid(java.lang.String str) {
        return isFbSigningCertificateValid(str, FB4A_SHA256_HASH);
    }

    public static boolean isFbSigningCertificateValid(java.lang.String str, java.lang.String str2) {
        return str2.equals(str);
    }
}
