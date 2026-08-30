package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgnk {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzgnj();

    static /* synthetic */ java.security.SecureRandom zza() {
        java.security.SecureRandom secureRandomZzc = zzc();
        secureRandomZzc.nextLong();
        return secureRandomZzc;
    }

    public static byte[] zzb(int i) {
        byte[] bArr = new byte[i];
        ((java.security.SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    private static java.security.SecureRandom zzc() {
        java.security.Provider providerZza = com.google.android.gms.internal.ads.zzgku.zza();
        if (providerZza != null) {
            try {
                return java.security.SecureRandom.getInstance("SHA1PRNG", providerZza);
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        java.security.Provider provider = null;
        try {
            provider = (java.security.Provider) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
        }
        if (provider != null) {
            try {
                return java.security.SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (java.security.GeneralSecurityException unused3) {
            }
        }
        return new java.security.SecureRandom();
    }
}
