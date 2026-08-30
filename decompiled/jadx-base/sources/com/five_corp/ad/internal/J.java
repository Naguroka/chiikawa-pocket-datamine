package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class J {
    public static java.lang.String a(java.lang.String str) {
        byte[] bArrDigest;
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            bArrDigest = messageDigest.digest();
        } catch (java.lang.IllegalArgumentException | java.security.NoSuchAlgorithmException unused) {
            bArrDigest = null;
        }
        java.lang.String strEncodeToString = bArrDigest != null ? android.util.Base64.encodeToString(bArrDigest, 11) : null;
        return strEncodeToString != null ? strEncodeToString : str.replaceAll("[^a-zA-Z0-9]", "_");
    }
}
