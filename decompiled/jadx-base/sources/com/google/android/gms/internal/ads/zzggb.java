package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggb {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgmx zzb = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzgfy
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            return com.google.android.gms.internal.ads.zzgun.zzb((com.google.android.gms.internal.ads.zzgfx) zzgdxVar);
        }
    }, com.google.android.gms.internal.ads.zzgfx.class, com.google.android.gms.internal.ads.zzgdn.class);
    private static final com.google.android.gms.internal.ads.zzgdy zzc = com.google.android.gms.internal.ads.zzgli.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", com.google.android.gms.internal.ads.zzgdn.class, com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, com.google.android.gms.internal.ads.zzgri.zzg());
    private static final com.google.android.gms.internal.ads.zzgmb zzd = new com.google.android.gms.internal.ads.zzgmb() { // from class: com.google.android.gms.internal.ads.zzgfz
    };
    private static final com.google.android.gms.internal.ads.zzglz zze = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzgga
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzggf zzggfVar = (com.google.android.gms.internal.ads.zzggf) zzgekVar;
            int i = com.google.android.gms.internal.ads.zzggb.zza;
            if (zzggfVar.zzb() == 24) {
                throw new java.security.GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            com.google.android.gms.internal.ads.zzgfv zzgfvVar = new com.google.android.gms.internal.ads.zzgfv(null);
            zzgfvVar.zzc(zzggfVar);
            zzgfvVar.zza(num);
            zzgfvVar.zzb(com.google.android.gms.internal.ads.zzgvp.zzc(zzggfVar.zzb()));
            return zzgfvVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        int i = zzf;
        if (!com.google.android.gms.internal.ads.zzgks.zza(i)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = com.google.android.gms.internal.ads.zzgji.zza;
        com.google.android.gms.internal.ads.zzgji.zze(com.google.android.gms.internal.ads.zzgmk.zzc());
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zzb);
        com.google.android.gms.internal.ads.zzgmg zzgmgVarZzb = com.google.android.gms.internal.ads.zzgmg.zzb();
        java.util.HashMap map = new java.util.HashMap();
        map.put("AES128_GCM", com.google.android.gms.internal.ads.zzgie.zza);
        com.google.android.gms.internal.ads.zzggc zzggcVar = new com.google.android.gms.internal.ads.zzggc(null);
        zzggcVar.zza(12);
        zzggcVar.zzb(16);
        zzggcVar.zzc(16);
        zzggcVar.zzd(com.google.android.gms.internal.ads.zzggd.zzc);
        map.put("AES128_GCM_RAW", zzggcVar.zze());
        map.put("AES256_GCM", com.google.android.gms.internal.ads.zzgie.zzb);
        com.google.android.gms.internal.ads.zzggc zzggcVar2 = new com.google.android.gms.internal.ads.zzggc(null);
        zzggcVar2.zza(12);
        zzggcVar2.zzb(32);
        zzggcVar2.zzc(16);
        zzggcVar2.zzd(com.google.android.gms.internal.ads.zzggd.zzc);
        map.put("AES256_GCM_RAW", zzggcVar2.zze());
        zzgmgVarZzb.zzd(java.util.Collections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.zzgmc.zza().zzb(zzd, com.google.android.gms.internal.ads.zzggf.class);
        com.google.android.gms.internal.ads.zzgma.zzb().zzc(zze, com.google.android.gms.internal.ads.zzggf.class);
        com.google.android.gms.internal.ads.zzgkz.zzc().zzf(zzc, i, true);
    }
}
