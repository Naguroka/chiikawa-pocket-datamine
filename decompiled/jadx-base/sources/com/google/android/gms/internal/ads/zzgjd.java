package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgjd {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzgjc();

    public static java.security.spec.AlgorithmParameterSpec zza(byte[] bArr, int i, int i2) {
        java.lang.Integer numValueOf = !java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        return new javax.crypto.spec.GCMParameterSpec(128, bArr, i, 12);
    }

    public static javax.crypto.Cipher zzb() {
        return (javax.crypto.Cipher) zza.get();
    }

    public static javax.crypto.SecretKey zzc(byte[] bArr) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgvm.zza(bArr.length);
        return new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }
}
