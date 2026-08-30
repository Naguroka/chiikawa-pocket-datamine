package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzedh implements com.google.android.gms.internal.ads.zzecw {
    private final com.google.android.gms.internal.ads.zzcoa zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdow zzc;
    private final com.google.android.gms.internal.ads.zzfcj zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzbjs zzg;
    private final boolean zzh = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziM)).booleanValue();
    private final com.google.android.gms.internal.ads.zzebv zzi;
    private final com.google.android.gms.internal.ads.zzdrq zzj;
    private final com.google.android.gms.internal.ads.zzdrw zzk;

    public zzedh(com.google.android.gms.internal.ads.zzcoa zzcoaVar, android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdow zzdowVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbjs zzbjsVar, com.google.android.gms.internal.ads.zzebv zzebvVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zzb = context;
        this.zza = zzcoaVar;
        this.zze = executor;
        this.zzc = zzdowVar;
        this.zzd = zzfcjVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzbjsVar;
        this.zzi = zzebvVar;
        this.zzj = zzdrqVar;
        this.zzk = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        final com.google.android.gms.internal.ads.zzdpa zzdpaVar = new com.google.android.gms.internal.ads.zzdpa();
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzedd
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc(zzfboVar, zzfcaVar, zzdpaVar, obj);
            }
        }, this.zze);
        java.util.Objects.requireNonNull(zzdpaVar);
        listenableFutureZzn.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzede
            @Override // java.lang.Runnable
            public final void run() {
                zzdpaVar.zzb();
            }
        }, this.zze);
        return listenableFutureZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzfbt zzfbtVar = zzfboVar.zzs;
        return (zzfbtVar == null || zzfbtVar.zza == null) ? false : true;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzdpa zzdpaVar, java.lang.Object obj) throws java.lang.Exception {
        final com.google.android.gms.internal.ads.zzedh zzedhVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            this.zzj.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        final com.google.android.gms.internal.ads.zzcex zzcexVarZza = this.zzc.zza(this.zzd.zze, zzfboVar, zzfcaVar.zzb.zzb);
        zzcexVarZza.zzac(zzfboVar.zzW);
        zzdpaVar.zza(this.zzb, zzcexVarZza.zzF());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            this.zzj.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        final com.google.android.gms.internal.ads.zzcnx zzcnxVarZza = this.zza.zza(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, null), new com.google.android.gms.internal.ads.zzdeu(new com.google.android.gms.internal.ads.zzedj(this.zzf, zzcabVar, zzfboVar, zzcexVarZza, this.zzd, this.zzh, this.zzg, this.zzi, this.zzk), zzcexVarZza), new com.google.android.gms.internal.ads.zzcny(zzfboVar.zzaa));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            zzedhVar = this;
            zzedhVar.zzj.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        } else {
            zzedhVar = this;
        }
        zzcnxVarZza.zzh().zzi(zzcexVarZza, false, zzedhVar.zzh ? zzedhVar.zzg : null, zzedhVar.zzj.zza());
        zzcabVar.zzc(zzcnxVarZza);
        zzcnxVarZza.zzc().zzo(new com.google.android.gms.internal.ads.zzcwn() { // from class: com.google.android.gms.internal.ads.zzedf
            @Override // com.google.android.gms.internal.ads.zzcwn
            public final void zzr() {
                com.google.android.gms.internal.ads.zzcex zzcexVar = zzcexVarZza;
                if (zzcexVar.zzN() != null) {
                    zzcexVar.zzN().zzs();
                }
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
        java.lang.String strZzb = zzfboVar.zzs.zza;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzff)).booleanValue() && zzcnxVarZza.zzi().zze(true)) {
            strZzb = com.google.android.gms.internal.ads.zzcgi.zzb(strZzb, com.google.android.gms.internal.ads.zzcgi.zza(zzfboVar));
        }
        zzcnxVarZza.zzh();
        return com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzdov.zzj(zzcexVarZza, zzfboVar.zzs.zzb, strZzb, zzedhVar.zzj.zza()), new com.google.android.gms.internal.ads.zzfuc(zzedhVar) { // from class: com.google.android.gms.internal.ads.zzedg
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.zzcex zzcexVar = zzcexVarZza;
                if (zzfboVar.zzM) {
                    zzcexVar.zzah();
                }
                com.google.android.gms.internal.ads.zzcnx zzcnxVar = zzcnxVarZza;
                zzcexVar.zzab();
                zzcexVar.onPause();
                return zzcnxVar.zza();
            }
        }, zzedhVar.zze);
    }
}
