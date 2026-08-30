package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgip {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgmx zzb = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzgim
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            com.google.android.gms.internal.ads.zzgil zzgilVar = (com.google.android.gms.internal.ads.zzgil) zzgdxVar;
            int i = com.google.android.gms.internal.ads.zzgip.zza;
            return com.google.android.gms.internal.ads.zzgkk.zzc() ? com.google.android.gms.internal.ads.zzgkk.zzb(zzgilVar) : com.google.android.gms.internal.ads.zzgvn.zzb(zzgilVar);
        }
    }, com.google.android.gms.internal.ads.zzgil.class, com.google.android.gms.internal.ads.zzgdn.class);
    private static final com.google.android.gms.internal.ads.zzgdy zzc = com.google.android.gms.internal.ads.zzgli.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", com.google.android.gms.internal.ads.zzgdn.class, com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, com.google.android.gms.internal.ads.zzgue.zzg());
    private static final com.google.android.gms.internal.ads.zzgmb zzd = new com.google.android.gms.internal.ads.zzgmb() { // from class: com.google.android.gms.internal.ads.zzgin
    };
    private static final com.google.android.gms.internal.ads.zzglz zze = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzgio
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) {
            int i = com.google.android.gms.internal.ads.zzgip.zza;
            return com.google.android.gms.internal.ads.zzgil.zza(((com.google.android.gms.internal.ads.zzgir) zzgekVar).zzb(), com.google.android.gms.internal.ads.zzgvp.zzc(32), num);
        }
    };

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzgkp.zza;
        com.google.android.gms.internal.ads.zzgkp.zze(com.google.android.gms.internal.ads.zzgmk.zzc());
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zzb);
        com.google.android.gms.internal.ads.zzgmg zzgmgVarZzb = com.google.android.gms.internal.ads.zzgmg.zzb();
        java.util.HashMap map = new java.util.HashMap();
        map.put("XCHACHA20_POLY1305", com.google.android.gms.internal.ads.zzgir.zzc(com.google.android.gms.internal.ads.zzgiq.zza));
        map.put("XCHACHA20_POLY1305_RAW", com.google.android.gms.internal.ads.zzgir.zzc(com.google.android.gms.internal.ads.zzgiq.zzc));
        zzgmgVarZzb.zzd(java.util.Collections.unmodifiableMap(map));
        com.google.android.gms.internal.ads.zzgma.zzb().zzc(zze, com.google.android.gms.internal.ads.zzgir.class);
        com.google.android.gms.internal.ads.zzgmc.zza().zzb(zzd, com.google.android.gms.internal.ads.zzgir.class);
        com.google.android.gms.internal.ads.zzgkz.zzc().zzd(zzc, true);
    }
}
