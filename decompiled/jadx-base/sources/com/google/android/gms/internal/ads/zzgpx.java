package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgpx implements com.google.android.gms.internal.ads.zzgej {
    private zzgpx(com.google.android.gms.internal.ads.zzgej zzgejVar, com.google.android.gms.internal.ads.zzgtp zzgtpVar, byte[] bArr) {
    }

    public static com.google.android.gms.internal.ads.zzgej zza(com.google.android.gms.internal.ads.zzglk zzglkVar) throws java.security.GeneralSecurityException {
        byte[] bArrZzc;
        com.google.android.gms.internal.ads.zzgnh zzgnhVarZza = zzglkVar.zza(com.google.android.gms.internal.ads.zzgdw.zza());
        com.google.android.gms.internal.ads.zzgsi zzgsiVarZza = com.google.android.gms.internal.ads.zzgsl.zza();
        zzgsiVarZza.zzb(zzgnhVarZza.zzg());
        zzgsiVarZza.zzc(zzgnhVarZza.zze());
        zzgsiVarZza.zza(zzgnhVarZza.zzb());
        com.google.android.gms.internal.ads.zzgej zzgejVar = (com.google.android.gms.internal.ads.zzgej) com.google.android.gms.internal.ads.zzgen.zzb((com.google.android.gms.internal.ads.zzgsl) zzgsiVarZza.zzbr(), com.google.android.gms.internal.ads.zzgej.class);
        com.google.android.gms.internal.ads.zzgtp zzgtpVarZzc = zzgnhVarZza.zzc();
        int iOrdinal = zzgtpVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zzb(zzglkVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zza(zzglkVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zza(zzglkVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zza.zzc();
        }
        return new com.google.android.gms.internal.ads.zzgpx(zzgejVar, zzgtpVarZzc, bArrZzc);
    }
}
