package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgfq {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgmx zzb = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzgfo
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            return com.google.android.gms.internal.ads.zzgum.zzb((com.google.android.gms.internal.ads.zzgfn) zzgdxVar);
        }
    }, com.google.android.gms.internal.ads.zzgfn.class, com.google.android.gms.internal.ads.zzgdn.class);
    private static final com.google.android.gms.internal.ads.zzgdy zzc = com.google.android.gms.internal.ads.zzgli.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", com.google.android.gms.internal.ads.zzgdn.class, com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, com.google.android.gms.internal.ads.zzgqz.zzh());
    private static final com.google.android.gms.internal.ads.zzglz zzd = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzgfp
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgfu zzgfuVar = (com.google.android.gms.internal.ads.zzgfu) zzgekVar;
            int i = com.google.android.gms.internal.ads.zzgfq.zza;
            if (zzgfuVar.zzc() == 24) {
                throw new java.security.GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            com.google.android.gms.internal.ads.zzgfl zzgflVar = new com.google.android.gms.internal.ads.zzgfl(null);
            zzgflVar.zzc(zzgfuVar);
            zzgflVar.zza(num);
            zzgflVar.zzb(com.google.android.gms.internal.ads.zzgvp.zzc(zzgfuVar.zzc()));
            return zzgflVar.zzd();
        }
    };

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzgjb.zza;
        com.google.android.gms.internal.ads.zzgjb.zze(com.google.android.gms.internal.ads.zzgmk.zzc());
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zzb);
        com.google.android.gms.internal.ads.zzgmg zzgmgVarZzb = com.google.android.gms.internal.ads.zzgmg.zzb();
        java.util.HashMap map = new java.util.HashMap();
        map.put("AES128_EAX", com.google.android.gms.internal.ads.zzgie.zzc);
        com.google.android.gms.internal.ads.zzgfr zzgfrVar = new com.google.android.gms.internal.ads.zzgfr(null);
        zzgfrVar.zza(16);
        zzgfrVar.zzb(16);
        zzgfrVar.zzc(16);
        zzgfrVar.zzd(com.google.android.gms.internal.ads.zzgfs.zzc);
        map.put("AES128_EAX_RAW", zzgfrVar.zze());
        map.put("AES256_EAX", com.google.android.gms.internal.ads.zzgie.zzd);
        com.google.android.gms.internal.ads.zzgfr zzgfrVar2 = new com.google.android.gms.internal.ads.zzgfr(null);
        zzgfrVar2.zza(16);
        zzgfrVar2.zzb(32);
        zzgfrVar2.zzc(16);
        zzgfrVar2.zzd(com.google.android.gms.internal.ads.zzgfs.zzc);
        map.put("AES256_EAX_RAW", zzgfrVar2.zze());
        zzgmgVarZzb.zzd(java.util.Collections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.zzgma.zzb().zzc(zzd, com.google.android.gms.internal.ads.zzgfu.class);
        com.google.android.gms.internal.ads.zzgkz.zzc().zzd(zzc, true);
    }
}
