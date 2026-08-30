package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzggz {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgmx zzb = com.google.android.gms.internal.ads.zzgmx.zzb(new com.google.android.gms.internal.ads.zzgmv() { // from class: com.google.android.gms.internal.ads.zzggx
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final java.lang.Object zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
            com.google.android.gms.internal.ads.zzghe zzgheVar = (com.google.android.gms.internal.ads.zzghe) zzgdxVar;
            int i = com.google.android.gms.internal.ads.zzggz.zza;
            return com.google.android.gms.internal.ads.zzgkc.zzc(com.google.android.gms.internal.ads.zzgei.zza(zzgheVar.zzb().zzd()).zzb(), zzgheVar.zzc());
        }
    }, com.google.android.gms.internal.ads.zzghe.class, com.google.android.gms.internal.ads.zzgdn.class);
    private static final com.google.android.gms.internal.ads.zzgdy zzc = com.google.android.gms.internal.ads.zzgli.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", com.google.android.gms.internal.ads.zzgdn.class, com.google.android.gms.internal.ads.zzgsj.REMOTE, com.google.android.gms.internal.ads.zzgtf.zzg());
    private static final com.google.android.gms.internal.ads.zzglz zzd = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzggy
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) {
            return com.google.android.gms.internal.ads.zzghe.zza((com.google.android.gms.internal.ads.zzghg) zzgekVar, num);
        }
    };

    public static void zza(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzgks.zza(1)) {
            throw new java.security.GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i = com.google.android.gms.internal.ads.zzghl.zza;
        com.google.android.gms.internal.ads.zzghl.zze(com.google.android.gms.internal.ads.zzgmk.zzc());
        com.google.android.gms.internal.ads.zzgmh.zza().zze(zzb);
        com.google.android.gms.internal.ads.zzgma.zzb().zzc(zzd, com.google.android.gms.internal.ads.zzghg.class);
        com.google.android.gms.internal.ads.zzgkz.zzc().zzd(zzc, true);
    }
}
