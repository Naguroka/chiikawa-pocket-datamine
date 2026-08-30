package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgeq {
    public static com.google.android.gms.internal.ads.zzgek zza(byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            com.google.android.gms.internal.ads.zzgsp zzgspVarZzf = com.google.android.gms.internal.ads.zzgsp.zzf(bArr, com.google.android.gms.internal.ads.zzgxb.zza());
            com.google.android.gms.internal.ads.zzgmk zzgmkVarZzc = com.google.android.gms.internal.ads.zzgmk.zzc();
            com.google.android.gms.internal.ads.zzgni zzgniVarZza = com.google.android.gms.internal.ads.zzgni.zza(zzgspVarZzf);
            return !zzgmkVarZzc.zzk(zzgniVarZza) ? new com.google.android.gms.internal.ads.zzgll(zzgniVarZza) : zzgmkVarZzc.zzb(zzgniVarZza);
        } catch (java.io.IOException e) {
            throw new java.security.GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(com.google.android.gms.internal.ads.zzgek zzgekVar) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzgni) com.google.android.gms.internal.ads.zzgmk.zzc().zze(zzgekVar, com.google.android.gms.internal.ads.zzgni.class)).zzc().zzaV();
    }
}
