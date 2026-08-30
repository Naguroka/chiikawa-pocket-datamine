package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgob {
    private static final com.google.android.gms.internal.ads.zzglz zza = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzgny
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) {
            return com.google.android.gms.internal.ads.zzgob.zzb((com.google.android.gms.internal.ads.zzgof) zzgekVar, num);
        }
    };
    private static final com.google.android.gms.internal.ads.zzgmx zzb = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzgnz
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            return com.google.android.gms.internal.ads.zzgob.zzc((com.google.android.gms.internal.ads.zzgnx) zzgdxVar);
        }
    }, com.google.android.gms.internal.ads.zzgnx.class, com.google.android.gms.internal.ads.zzgog.class);
    private static final com.google.android.gms.internal.ads.zzgmx zzc = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzgoa
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            return com.google.android.gms.internal.ads.zzgob.zza((com.google.android.gms.internal.ads.zzgnx) zzgdxVar);
        }
    }, com.google.android.gms.internal.ads.zzgnx.class, com.google.android.gms.internal.ads.zzgej.class);
    private static final com.google.android.gms.internal.ads.zzgdy zzd = com.google.android.gms.internal.ads.zzgli.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", com.google.android.gms.internal.ads.zzgej.class, com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, com.google.android.gms.internal.ads.zzgqb.zzh());

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgej zza(com.google.android.gms.internal.ads.zzgnx zzgnxVar) throws java.security.GeneralSecurityException {
        zze(zzgnxVar.zzb());
        return com.google.android.gms.internal.ads.zzgvl.zza(zzgnxVar);
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgnx zzb(com.google.android.gms.internal.ads.zzgof zzgofVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        zze(zzgofVar);
        com.google.android.gms.internal.ads.zzgnv zzgnvVar = new com.google.android.gms.internal.ads.zzgnv(null);
        zzgnvVar.zzc(zzgofVar);
        zzgnvVar.zza(com.google.android.gms.internal.ads.zzgvp.zzc(zzgofVar.zzc()));
        zzgnvVar.zzb(num);
        return zzgnvVar.zzd();
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgog zzc(com.google.android.gms.internal.ads.zzgnx zzgnxVar) throws java.security.GeneralSecurityException {
        zze(zzgnxVar.zzb());
        return new com.google.android.gms.internal.ads.zzgpq(zzgnxVar);
    }

    public static void zzd(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzgpo.zza;
        com.google.android.gms.internal.ads.zzgpo.zze(com.google.android.gms.internal.ads.zzgmk.zzc());
        com.google.android.gms.internal.ads.zzgma.zzb().zzc(zza, com.google.android.gms.internal.ads.zzgof.class);
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zzb);
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zzc);
        com.google.android.gms.internal.ads.zzgmg zzgmgVarZzb = com.google.android.gms.internal.ads.zzgmg.zzb();
        java.util.HashMap map = new java.util.HashMap();
        map.put("AES_CMAC", com.google.android.gms.internal.ads.zzgpj.zzc);
        map.put("AES256_CMAC", com.google.android.gms.internal.ads.zzgpj.zzc);
        com.google.android.gms.internal.ads.zzgoc zzgocVar = new com.google.android.gms.internal.ads.zzgoc(null);
        zzgocVar.zza(32);
        zzgocVar.zzb(16);
        zzgocVar.zzc(com.google.android.gms.internal.ads.zzgod.zzd);
        map.put("AES256_CMAC_RAW", zzgocVar.zzd());
        zzgmgVarZzb.zzd(java.util.Collections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.zzgkz.zzc().zzd(zzd, true);
    }

    private static void zze(com.google.android.gms.internal.ads.zzgof zzgofVar) throws java.security.GeneralSecurityException {
        if (zzgofVar.zzc() != 32) {
            throw new java.security.GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
