package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class AndroidUtilsLight {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = -1;

    @java.lang.Deprecated
    public static byte[] getPackageCertificateHashBytes(android.content.Context context, java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        java.security.MessageDigest messageDigestZza;
        android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 64);
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1 || (messageDigestZza = zza("SHA1")) == null) {
            return null;
        }
        return messageDigestZza.digest(packageInfo.signatures[0].toByteArray());
    }

    public static java.security.MessageDigest zza(java.lang.String str) {
        for (int i = 0; i < 2; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
