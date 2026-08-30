package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgmc {
    private static final com.google.android.gms.internal.ads.zzgmc zza = new com.google.android.gms.internal.ads.zzgmc();
    private final java.util.Map zzb = new java.util.HashMap();

    public static com.google.android.gms.internal.ads.zzgmc zza() {
        return zza;
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzgmb zzgmbVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgmb zzgmbVar2 = (com.google.android.gms.internal.ads.zzgmb) this.zzb.get(cls);
        if (zzgmbVar2 != null && !zzgmbVar2.equals(zzgmbVar)) {
            throw new java.security.GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.zzb.put(cls, zzgmbVar);
    }
}
