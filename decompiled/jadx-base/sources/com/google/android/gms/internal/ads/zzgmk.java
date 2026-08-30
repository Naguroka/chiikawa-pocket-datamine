package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgmk {
    private static final com.google.android.gms.internal.ads.zzgmk zza = (com.google.android.gms.internal.ads.zzgmk) com.google.android.gms.internal.ads.zzgnt.zza(new com.google.android.gms.internal.ads.zzgns() { // from class: com.google.android.gms.internal.ads.zzgmi
        @Override // com.google.android.gms.internal.ads.zzgns
        public final java.lang.Object zza() throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgmk zzgmkVar = new com.google.android.gms.internal.ads.zzgmk();
            zzgmkVar.zzg(new com.google.android.gms.internal.ads.zzgle(com.google.android.gms.internal.ads.zzglk.class, com.google.android.gms.internal.ads.zzgnh.class, new com.google.android.gms.internal.ads.zzglf() { // from class: com.google.android.gms.internal.ads.zzgmj
                @Override // com.google.android.gms.internal.ads.zzglf
                public final com.google.android.gms.internal.ads.zzgnm zza(com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgeo zzgeoVar) {
                    return ((com.google.android.gms.internal.ads.zzglk) zzgdxVar).zza(zzgeoVar);
                }
            }));
            return zzgmkVar;
        }
    });
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(new com.google.android.gms.internal.ads.zzgnr(new com.google.android.gms.internal.ads.zzgnn(), null));

    public static com.google.android.gms.internal.ads.zzgmk zzc() {
        return zza;
    }

    public final com.google.android.gms.internal.ads.zzgdx zza(com.google.android.gms.internal.ads.zzgnm zzgnmVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzgnr) this.zzb.get()).zza(zzgnmVar, zzgeoVar);
    }

    public final com.google.android.gms.internal.ads.zzgek zzb(com.google.android.gms.internal.ads.zzgnm zzgnmVar) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzgnr) this.zzb.get()).zzb(zzgnmVar);
    }

    public final com.google.android.gms.internal.ads.zzgnm zzd(com.google.android.gms.internal.ads.zzgdx zzgdxVar, java.lang.Class cls, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzgeo zzgeoVar) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzgnr) this.zzb.get()).zzc(zzgdxVar, cls, zzgeoVar);
    }

    public final com.google.android.gms.internal.ads.zzgnm zze(com.google.android.gms.internal.ads.zzgek zzgekVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzgnr) this.zzb.get()).zzd(zzgekVar, cls);
    }

    public final synchronized void zzf(com.google.android.gms.internal.ads.zzgld zzgldVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgnn zzgnnVar = new com.google.android.gms.internal.ads.zzgnn((com.google.android.gms.internal.ads.zzgnr) this.zzb.get());
        zzgnnVar.zza(zzgldVar);
        this.zzb.set(new com.google.android.gms.internal.ads.zzgnr(zzgnnVar, null));
    }

    public final synchronized void zzg(com.google.android.gms.internal.ads.zzglh zzglhVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgnn zzgnnVar = new com.google.android.gms.internal.ads.zzgnn((com.google.android.gms.internal.ads.zzgnr) this.zzb.get());
        zzgnnVar.zzb(zzglhVar);
        this.zzb.set(new com.google.android.gms.internal.ads.zzgnr(zzgnnVar, null));
    }

    public final synchronized void zzh(com.google.android.gms.internal.ads.zzgmp zzgmpVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgnn zzgnnVar = new com.google.android.gms.internal.ads.zzgnn((com.google.android.gms.internal.ads.zzgnr) this.zzb.get());
        zzgnnVar.zzc(zzgmpVar);
        this.zzb.set(new com.google.android.gms.internal.ads.zzgnr(zzgnnVar, null));
    }

    public final synchronized void zzi(com.google.android.gms.internal.ads.zzgmt zzgmtVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzgnn zzgnnVar = new com.google.android.gms.internal.ads.zzgnn((com.google.android.gms.internal.ads.zzgnr) this.zzb.get());
        zzgnnVar.zzd(zzgmtVar);
        this.zzb.set(new com.google.android.gms.internal.ads.zzgnr(zzgnnVar, null));
    }

    public final boolean zzj(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
        return ((com.google.android.gms.internal.ads.zzgnr) this.zzb.get()).zzi(zzgnmVar);
    }

    public final boolean zzk(com.google.android.gms.internal.ads.zzgnm zzgnmVar) {
        return ((com.google.android.gms.internal.ads.zzgnr) this.zzb.get()).zzj(zzgnmVar);
    }
}
