package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgma {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzglz zzb = new com.google.android.gms.internal.ads.zzglz() { // from class: com.google.android.gms.internal.ads.zzgly
        @Override // com.google.android.gms.internal.ads.zzglz
        public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
            int i = com.google.android.gms.internal.ads.zzgma.zza;
            com.google.android.gms.internal.ads.zzgsp zzgspVarZzc = ((com.google.android.gms.internal.ads.zzgll) zzgekVar).zzb().zzc();
            com.google.android.gms.internal.ads.zzgdy zzgdyVarZzb = com.google.android.gms.internal.ads.zzgkz.zzc().zzb(zzgspVarZzc.zzi());
            if (!com.google.android.gms.internal.ads.zzgkz.zzc().zze(zzgspVarZzc.zzi())) {
                throw new java.security.GeneralSecurityException("Creating new keys is not allowed.");
            }
            com.google.android.gms.internal.ads.zzgsl zzgslVarZza = zzgdyVarZzb.zza(zzgspVarZzc.zzh());
            return new com.google.android.gms.internal.ads.zzglk(com.google.android.gms.internal.ads.zzgnh.zza(zzgslVarZza.zzg(), zzgslVarZza.zzf(), zzgslVarZza.zzb(), zzgspVarZzc.zzg(), num), com.google.android.gms.internal.ads.zzgdw.zza());
        }
    };
    private static final com.google.android.gms.internal.ads.zzgma zzc = zze();
    private final java.util.Map zzd = new java.util.HashMap();

    public static com.google.android.gms.internal.ads.zzgma zzb() {
        return zzc;
    }

    private final synchronized com.google.android.gms.internal.ads.zzgdx zzd(com.google.android.gms.internal.ads.zzgek zzgekVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzglz zzglzVar;
        zzglzVar = (com.google.android.gms.internal.ads.zzglz) this.zzd.get(zzgekVar.getClass());
        if (zzglzVar == null) {
            throw new java.security.GeneralSecurityException("Cannot create a new key for parameters " + zzgekVar.toString() + ": no key creator for this class was registered.");
        }
        return zzglzVar.zza(zzgekVar, num);
    }

    private static com.google.android.gms.internal.ads.zzgma zze() {
        com.google.android.gms.internal.ads.zzgma zzgmaVar = new com.google.android.gms.internal.ads.zzgma();
        try {
            zzgmaVar.zzc(zzb, com.google.android.gms.internal.ads.zzgll.class);
            return zzgmaVar;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException("unexpected error.", e);
        }
    }

    public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgek zzgekVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return zzd(zzgekVar, num);
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzglz zzglzVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzglz zzglzVar2 = (com.google.android.gms.internal.ads.zzglz) this.zzd.get(cls);
        if (zzglzVar2 != null && !zzglzVar2.equals(zzglzVar)) {
            throw new java.security.GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
        }
        this.zzd.put(cls, zzglzVar);
    }
}
