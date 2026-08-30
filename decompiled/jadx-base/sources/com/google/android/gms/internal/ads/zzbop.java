package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbop {
    private final com.google.android.gms.internal.ads.zzbns zza;
    private com.google.common.util.concurrent.ListenableFuture zzb;

    zzbop(com.google.android.gms.internal.ads.zzbns zzbnsVar) {
        this.zza = zzbnsVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
            this.zzb = zzcabVar;
            this.zza.zzb(null).zzj(new com.google.android.gms.internal.ads.zzcaf() { // from class: com.google.android.gms.internal.ads.zzbom
                @Override // com.google.android.gms.internal.ads.zzcaf
                public final void zza(java.lang.Object obj) {
                    zzcabVar.zzc((com.google.android.gms.internal.ads.zzbnt) obj);
                }
            }, new com.google.android.gms.internal.ads.zzcad() { // from class: com.google.android.gms.internal.ads.zzbon
                @Override // com.google.android.gms.internal.ads.zzcad
                public final void zza() {
                    zzcabVar.zzd(new com.google.android.gms.internal.ads.zzbnv("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final com.google.android.gms.internal.ads.zzbos zza(java.lang.String str, com.google.android.gms.internal.ads.zzbnz zzbnzVar, com.google.android.gms.internal.ads.zzbny zzbnyVar) {
        zzd();
        return new com.google.android.gms.internal.ads.zzbos(this.zzb, "google.afma.activeView.handleUpdate", zzbnzVar, zzbnyVar);
    }

    public final void zzb(final java.lang.String str, final com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        zzd();
        this.zzb = com.google.android.gms.internal.ads.zzgch.zzn(this.zzb, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzboo
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzbnt zzbntVar = (com.google.android.gms.internal.ads.zzbnt) obj;
                zzbntVar.zzq(str, zzbjpVar);
                return com.google.android.gms.internal.ads.zzgch.zzh(zzbntVar);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    public final void zzc(final java.lang.String str, final com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        this.zzb = com.google.android.gms.internal.ads.zzgch.zzm(this.zzb, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzbol
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzbnt zzbntVar = (com.google.android.gms.internal.ads.zzbnt) obj;
                zzbntVar.zzr(str, zzbjpVar);
                return zzbntVar;
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }
}
