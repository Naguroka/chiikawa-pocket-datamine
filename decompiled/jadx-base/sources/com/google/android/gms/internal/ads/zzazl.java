package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public abstract class zzazl {
    private static java.security.MessageDigest zzb;
    protected final java.lang.Object zza = new java.lang.Object();

    abstract byte[] zzb(java.lang.String str);

    protected final java.security.MessageDigest zza() {
        synchronized (this.zza) {
            java.security.MessageDigest messageDigest = zzb;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzb = java.security.MessageDigest.getInstance("MD5");
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return zzb;
        }
    }
}
