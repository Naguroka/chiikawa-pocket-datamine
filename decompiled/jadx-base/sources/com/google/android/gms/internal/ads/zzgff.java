package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgff {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgmx zzb = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzgfc
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            return com.google.android.gms.internal.ads.zzguq.zzb((com.google.android.gms.internal.ads.zzgfb) zzgdxVar);
        }
    }, com.google.android.gms.internal.ads.zzgfb.class, com.google.android.gms.internal.ads.zzgdn.class);
    private static final com.google.android.gms.internal.ads.zzgdy zzc = com.google.android.gms.internal.ads.zzgli.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", com.google.android.gms.internal.ads.zzgdn.class, com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, com.google.android.gms.internal.ads.zzgqk.zzh());
    private static final com.google.android.gms.internal.ads.zzgmb zzd = new com.google.android.gms.internal.ads.zzgmb() { // from class: com.google.android.gms.internal.ads.zzgfd
    };
    private static final com.google.android.gms.internal.ads.zzglz zze = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzgfe
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgfk zzgfkVar = (com.google.android.gms.internal.ads.zzgfk) zzgekVar;
            int i = com.google.android.gms.internal.ads.zzgff.zza;
            if (zzgfkVar.zzb() != 16 && zzgfkVar.zzb() != 32) {
                throw new java.security.GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            com.google.android.gms.internal.ads.zzgez zzgezVar = new com.google.android.gms.internal.ads.zzgez(null);
            zzgezVar.zzd(zzgfkVar);
            zzgezVar.zzc(num);
            zzgezVar.zza(com.google.android.gms.internal.ads.zzgvp.zzc(zzgfkVar.zzb()));
            zzgezVar.zzb(com.google.android.gms.internal.ads.zzgvp.zzc(zzgfkVar.zzc()));
            return zzgezVar.zze();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        int i = zzf;
        if (!com.google.android.gms.internal.ads.zzgks.zza(i)) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = com.google.android.gms.internal.ads.zzgiw.zza;
        com.google.android.gms.internal.ads.zzgiw.zze(com.google.android.gms.internal.ads.zzgmk.zzc());
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zzb);
        com.google.android.gms.internal.ads.zzgmg zzgmgVarZzb = com.google.android.gms.internal.ads.zzgmg.zzb();
        java.util.HashMap map = new java.util.HashMap();
        map.put("AES128_CTR_HMAC_SHA256", com.google.android.gms.internal.ads.zzgie.zze);
        com.google.android.gms.internal.ads.zzgfg zzgfgVar = new com.google.android.gms.internal.ads.zzgfg(null);
        zzgfgVar.zza(16);
        zzgfgVar.zzc(32);
        zzgfgVar.zze(16);
        zzgfgVar.zzd(16);
        zzgfgVar.zzb(com.google.android.gms.internal.ads.zzgfh.zzc);
        zzgfgVar.zzf(com.google.android.gms.internal.ads.zzgfi.zzc);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzgfgVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", com.google.android.gms.internal.ads.zzgie.zzf);
        com.google.android.gms.internal.ads.zzgfg zzgfgVar2 = new com.google.android.gms.internal.ads.zzgfg(null);
        zzgfgVar2.zza(32);
        zzgfgVar2.zzc(32);
        zzgfgVar2.zze(32);
        zzgfgVar2.zzd(16);
        zzgfgVar2.zzb(com.google.android.gms.internal.ads.zzgfh.zzc);
        zzgfgVar2.zzf(com.google.android.gms.internal.ads.zzgfi.zzc);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzgfgVar2.zzg());
        zzgmgVarZzb.zzd(java.util.Collections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.zzgmc.zza().zzb(zzd, com.google.android.gms.internal.ads.zzgfk.class);
        com.google.android.gms.internal.ads.zzgma.zzb().zzc(zze, com.google.android.gms.internal.ads.zzgfk.class);
        com.google.android.gms.internal.ads.zzgkz.zzc().zzf(zzc, i, true);
    }
}
