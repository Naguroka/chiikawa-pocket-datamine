package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggu {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgmx zzb = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzggs
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            com.google.android.gms.internal.ads.zzggr zzggrVar = (com.google.android.gms.internal.ads.zzggr) zzgdxVar;
            int i = com.google.android.gms.internal.ads.zzggu.zza;
            return com.google.android.gms.internal.ads.zzgjp.zze() ? com.google.android.gms.internal.ads.zzgjp.zzb(zzggrVar) : com.google.android.gms.internal.ads.zzgup.zzb(zzggrVar);
        }
    }, com.google.android.gms.internal.ads.zzggr.class, com.google.android.gms.internal.ads.zzgdn.class);
    private static final com.google.android.gms.internal.ads.zzglz zzc = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzggt
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) {
            int i = com.google.android.gms.internal.ads.zzggu.zza;
            return com.google.android.gms.internal.ads.zzggr.zza(((com.google.android.gms.internal.ads.zzggw) zzgekVar).zzb(), com.google.android.gms.internal.ads.zzgvp.zzc(32), num);
        }
    };
    private static final com.google.android.gms.internal.ads.zzgdy zzd = com.google.android.gms.internal.ads.zzgli.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", com.google.android.gms.internal.ads.zzgdn.class, com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, com.google.android.gms.internal.ads.zzgru.zzg());

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzgju.zza;
        com.google.android.gms.internal.ads.zzgju.zze(com.google.android.gms.internal.ads.zzgmk.zzc());
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zzb);
        com.google.android.gms.internal.ads.zzgma.zzb().zzc(zzc, com.google.android.gms.internal.ads.zzggw.class);
        com.google.android.gms.internal.ads.zzgmg zzgmgVarZzb = com.google.android.gms.internal.ads.zzgmg.zzb();
        java.util.HashMap map = new java.util.HashMap();
        map.put("CHACHA20_POLY1305", com.google.android.gms.internal.ads.zzggw.zzc(com.google.android.gms.internal.ads.zzggv.zza));
        map.put("CHACHA20_POLY1305_RAW", com.google.android.gms.internal.ads.zzggw.zzc(com.google.android.gms.internal.ads.zzggv.zzc));
        zzgmgVarZzb.zzd(java.util.Collections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.zzgkz.zzc().zzd(zzd, true);
    }
}
