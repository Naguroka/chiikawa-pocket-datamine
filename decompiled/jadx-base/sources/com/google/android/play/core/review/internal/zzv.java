package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzv {
    public static java.lang.String zza(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return android.util.Base64.encodeToString(messageDigest.digest(), 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
