package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzghd {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgdy zzb = com.google.android.gms.internal.ads.zzgli.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", com.google.android.gms.internal.ads.zzgdn.class, com.google.android.gms.internal.ads.zzgsj.SYMMETRIC, com.google.android.gms.internal.ads.zzgtl.zzg());
    private static final com.google.android.gms.internal.ads.zzglz zzc = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzghb
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) {
            return com.google.android.gms.internal.ads.zzghm.zza((com.google.android.gms.internal.ads.zzghr) zzgekVar, num);
        }
    };
    private static final com.google.android.gms.internal.ads.zzgmx zzd = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzghc
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzghm zzghmVar = (com.google.android.gms.internal.ads.zzghm) zzgdxVar;
            int i = com.google.android.gms.internal.ads.zzghd.zza;
            java.lang.String strZzd = zzghmVar.zzb().zzd();
            com.google.android.gms.internal.ads.zzgeu zzgeuVarZzb = zzghmVar.zzb().zzb();
            com.google.android.gms.internal.ads.zzgdn zzgdnVarZzb = com.google.android.gms.internal.ads.zzgei.zza(strZzd).zzb();
            int i2 = com.google.android.gms.internal.ads.zzgha.zza;
            try {
                return com.google.android.gms.internal.ads.zzgkc.zzc(new com.google.android.gms.internal.ads.zzgha(com.google.android.gms.internal.ads.zzgsp.zzf(com.google.android.gms.internal.ads.zzgeq.zzb(zzgeuVarZzb), com.google.android.gms.internal.ads.zzgxb.zza()), zzgdnVarZzb), zzghmVar.zzc());
            } catch (com.google.android.gms.internal.ads.zzgyg e) {
                throw new java.security.GeneralSecurityException(e);
            }
        }
    }, com.google.android.gms.internal.ads.zzghm.class, com.google.android.gms.internal.ads.zzgdn.class);

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzghw.zza;
        com.google.android.gms.internal.ads.zzghw.zze(com.google.android.gms.internal.ads.zzgmk.zzc());
        com.google.android.gms.internal.ads.zzgma.zzb().zzc(zzc, com.google.android.gms.internal.ads.zzghr.class);
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zzd);
        com.google.android.gms.internal.ads.zzgkz.zzc().zzd(zzb, true);
    }
}
