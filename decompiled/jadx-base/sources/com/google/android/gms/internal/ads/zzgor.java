package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgor {
    private static final com.google.android.gms.internal.ads.zzgmx zza = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzgon
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            return new com.google.android.gms.internal.ads.zzgpr((com.google.android.gms.internal.ads.zzgom) zzgdxVar);
        }
    }, com.google.android.gms.internal.ads.zzgom.class, com.google.android.gms.internal.ads.zzgog.class);
    private static final com.google.android.gms.internal.ads.zzgmx zzb = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzgoo
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            return com.google.android.gms.internal.ads.zzgvl.zzb((com.google.android.gms.internal.ads.zzgom) zzgdxVar);
        }
    }, com.google.android.gms.internal.ads.zzgom.class, com.google.android.gms.internal.ads.zzgej.class);
    private static final com.google.android.gms.internal.ads.zzgdy zzc = com.google.android.gms.internal.ads.zzgli.zzd("type.googleapis.com/google.crypto.tink.HmacKey", com.google.android.gms.internal.ads.zzgej.class, com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, com.google.android.gms.internal.ads.zzgsb.zzi());
    private static final com.google.android.gms.internal.ads.zzgmb zzd = new com.google.android.gms.internal.ads.zzgmb() { // from class: com.google.android.gms.internal.ads.zzgop
    };
    private static final com.google.android.gms.internal.ads.zzglz zze = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzgoq
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) {
            com.google.android.gms.internal.ads.zzgow zzgowVar = (com.google.android.gms.internal.ads.zzgow) zzgekVar;
            com.google.android.gms.internal.ads.zzgok zzgokVar = new com.google.android.gms.internal.ads.zzgok(null);
            zzgokVar.zzc(zzgowVar);
            zzgokVar.zzb(com.google.android.gms.internal.ads.zzgvp.zzc(zzgowVar.zzc()));
            zzgokVar.zza(num);
            return zzgokVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        int i = zzf;
        if (!com.google.android.gms.internal.ads.zzgks.zza(i)) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = com.google.android.gms.internal.ads.zzgpw.zza;
        com.google.android.gms.internal.ads.zzgpw.zze(com.google.android.gms.internal.ads.zzgmk.zzc());
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zza);
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zzb);
        com.google.android.gms.internal.ads.zzgmg zzgmgVarZzb = com.google.android.gms.internal.ads.zzgmg.zzb();
        java.util.HashMap map = new java.util.HashMap();
        map.put("HMAC_SHA256_128BITTAG", com.google.android.gms.internal.ads.zzgpj.zza);
        com.google.android.gms.internal.ads.zzgos zzgosVar = new com.google.android.gms.internal.ads.zzgos(null);
        zzgosVar.zzb(32);
        zzgosVar.zzc(16);
        zzgosVar.zzd(com.google.android.gms.internal.ads.zzgou.zzd);
        zzgosVar.zza(com.google.android.gms.internal.ads.zzgot.zzc);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzgosVar.zze());
        com.google.android.gms.internal.ads.zzgos zzgosVar2 = new com.google.android.gms.internal.ads.zzgos(null);
        zzgosVar2.zzb(32);
        zzgosVar2.zzc(32);
        zzgosVar2.zzd(com.google.android.gms.internal.ads.zzgou.zza);
        zzgosVar2.zza(com.google.android.gms.internal.ads.zzgot.zzc);
        map.put("HMAC_SHA256_256BITTAG", zzgosVar2.zze());
        com.google.android.gms.internal.ads.zzgos zzgosVar3 = new com.google.android.gms.internal.ads.zzgos(null);
        zzgosVar3.zzb(32);
        zzgosVar3.zzc(32);
        zzgosVar3.zzd(com.google.android.gms.internal.ads.zzgou.zzd);
        zzgosVar3.zza(com.google.android.gms.internal.ads.zzgot.zzc);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzgosVar3.zze());
        com.google.android.gms.internal.ads.zzgos zzgosVar4 = new com.google.android.gms.internal.ads.zzgos(null);
        zzgosVar4.zzb(64);
        zzgosVar4.zzc(16);
        zzgosVar4.zzd(com.google.android.gms.internal.ads.zzgou.zza);
        zzgosVar4.zza(com.google.android.gms.internal.ads.zzgot.zze);
        map.put("HMAC_SHA512_128BITTAG", zzgosVar4.zze());
        com.google.android.gms.internal.ads.zzgos zzgosVar5 = new com.google.android.gms.internal.ads.zzgos(null);
        zzgosVar5.zzb(64);
        zzgosVar5.zzc(16);
        zzgosVar5.zzd(com.google.android.gms.internal.ads.zzgou.zzd);
        zzgosVar5.zza(com.google.android.gms.internal.ads.zzgot.zze);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzgosVar5.zze());
        com.google.android.gms.internal.ads.zzgos zzgosVar6 = new com.google.android.gms.internal.ads.zzgos(null);
        zzgosVar6.zzb(64);
        zzgosVar6.zzc(32);
        zzgosVar6.zzd(com.google.android.gms.internal.ads.zzgou.zza);
        zzgosVar6.zza(com.google.android.gms.internal.ads.zzgot.zze);
        map.put("HMAC_SHA512_256BITTAG", zzgosVar6.zze());
        com.google.android.gms.internal.ads.zzgos zzgosVar7 = new com.google.android.gms.internal.ads.zzgos(null);
        zzgosVar7.zzb(64);
        zzgosVar7.zzc(32);
        zzgosVar7.zzd(com.google.android.gms.internal.ads.zzgou.zzd);
        zzgosVar7.zza(com.google.android.gms.internal.ads.zzgot.zze);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzgosVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", com.google.android.gms.internal.ads.zzgpj.zzb);
        com.google.android.gms.internal.ads.zzgos zzgosVar8 = new com.google.android.gms.internal.ads.zzgos(null);
        zzgosVar8.zzb(64);
        zzgosVar8.zzc(64);
        zzgosVar8.zzd(com.google.android.gms.internal.ads.zzgou.zzd);
        zzgosVar8.zza(com.google.android.gms.internal.ads.zzgot.zze);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzgosVar8.zze());
        zzgmgVarZzb.zzd(java.util.Collections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.zzgma.zzb().zzc(zze, com.google.android.gms.internal.ads.zzgow.class);
        com.google.android.gms.internal.ads.zzgmc.zza().zzb(zzd, com.google.android.gms.internal.ads.zzgow.class);
        com.google.android.gms.internal.ads.zzgkz.zzc().zzf(zzc, i, true);
    }
}
