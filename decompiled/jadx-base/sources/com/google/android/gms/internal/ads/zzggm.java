package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggm {
    private static final com.google.android.gms.internal.ads.zzgmx zza = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzggj
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            return com.google.android.gms.internal.ads.zzgkr.zzb((com.google.android.gms.internal.ads.zzggi) zzgdxVar);
        }
    }, com.google.android.gms.internal.ads.zzggi.class, com.google.android.gms.internal.ads.zzgdn.class);
    private static final com.google.android.gms.internal.ads.zzglz zzb = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzggk
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) {
            com.google.android.gms.internal.ads.zzggq zzggqVar = (com.google.android.gms.internal.ads.zzggq) zzgekVar;
            com.google.android.gms.internal.ads.zzggg zzgggVar = new com.google.android.gms.internal.ads.zzggg(null);
            zzgggVar.zzc(zzggqVar);
            zzgggVar.zza(num);
            zzgggVar.zzb(com.google.android.gms.internal.ads.zzgvp.zzc(zzggqVar.zzb()));
            return zzgggVar.zzd();
        }
    };
    private static final com.google.android.gms.internal.ads.zzgmb zzc = new com.google.android.gms.internal.ads.zzgmb() { // from class: com.google.android.gms.internal.ads.zzggl
    };
    private static final com.google.android.gms.internal.ads.zzgdy zzd = com.google.android.gms.internal.ads.zzgli.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", com.google.android.gms.internal.ads.zzgdn.class, com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, com.google.android.gms.internal.ads.zzgro.zzg());

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzgjn.zza;
        com.google.android.gms.internal.ads.zzgjn.zze(com.google.android.gms.internal.ads.zzgmk.zzc());
        if (zzb()) {
            com.google.android.gms.internal.ads.zzgmh.zza().zze(zza);
            com.google.android.gms.internal.ads.zzgmg zzgmgVarZzb = com.google.android.gms.internal.ads.zzgmg.zzb();
            java.util.HashMap map = new java.util.HashMap();
            com.google.android.gms.internal.ads.zzggn zzggnVar = new com.google.android.gms.internal.ads.zzggn(null);
            zzggnVar.zza(16);
            zzggnVar.zzb(com.google.android.gms.internal.ads.zzggo.zza);
            map.put("AES128_GCM_SIV", zzggnVar.zzc());
            com.google.android.gms.internal.ads.zzggn zzggnVar2 = new com.google.android.gms.internal.ads.zzggn(null);
            zzggnVar2.zza(16);
            zzggnVar2.zzb(com.google.android.gms.internal.ads.zzggo.zzc);
            map.put("AES128_GCM_SIV_RAW", zzggnVar2.zzc());
            com.google.android.gms.internal.ads.zzggn zzggnVar3 = new com.google.android.gms.internal.ads.zzggn(null);
            zzggnVar3.zza(32);
            zzggnVar3.zzb(com.google.android.gms.internal.ads.zzggo.zza);
            map.put("AES256_GCM_SIV", zzggnVar3.zzc());
            com.google.android.gms.internal.ads.zzggn zzggnVar4 = new com.google.android.gms.internal.ads.zzggn(null);
            zzggnVar4.zza(32);
            zzggnVar4.zzb(com.google.android.gms.internal.ads.zzggo.zzc);
            map.put("AES256_GCM_SIV_RAW", zzggnVar4.zzc());
            zzgmgVarZzb.zzd(java.util.Collections.unmodifiableMap(map));
            com.google.android.gms.internal.ads.zzgmc.zza().zzb(zzc, com.google.android.gms.internal.ads.zzggq.class);
            com.google.android.gms.internal.ads.zzgma.zzb().zzc(zzb, com.google.android.gms.internal.ads.zzggq.class);
            com.google.android.gms.internal.ads.zzgkz.zzc().zzd(zzd, true);
        }
    }

    private static boolean zzb() {
        try {
            javax.crypto.Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException unused) {
            return false;
        }
    }
}
