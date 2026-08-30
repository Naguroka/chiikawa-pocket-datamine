package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeez implements com.google.android.gms.internal.ads.zzecw {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdow zzb;
    private final com.google.android.gms.internal.ads.zzdfu zzc;
    private final com.google.android.gms.internal.ads.zzfcj zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzbjs zzg;
    private final boolean zzh = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziM)).booleanValue();
    private final com.google.android.gms.internal.ads.zzebv zzi;
    private final com.google.android.gms.internal.ads.zzdrq zzj;
    private final com.google.android.gms.internal.ads.zzdrw zzk;

    public zzeez(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfcj zzfcjVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdfu zzdfuVar, com.google.android.gms.internal.ads.zzdow zzdowVar, com.google.android.gms.internal.ads.zzbjs zzbjsVar, com.google.android.gms.internal.ads.zzebv zzebvVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = context;
        this.zzd = zzfcjVar;
        this.zzc = zzdfuVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdowVar;
        this.zzg = zzbjsVar;
        this.zzi = zzebvVar;
        this.zzj = zzdrqVar;
        this.zzk = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        final com.google.android.gms.internal.ads.zzdpa zzdpaVar = new com.google.android.gms.internal.ads.zzdpa();
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeeu
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc(zzfboVar, zzfcaVar, zzdpaVar, obj);
            }
        }, this.zze);
        java.util.Objects.requireNonNull(zzdpaVar);
        listenableFutureZzn.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeev
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
        final com.google.android.gms.internal.ads.zzeez zzeezVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            this.zzj.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        final com.google.android.gms.internal.ads.zzcex zzcexVarZza = this.zzb.zza(this.zzd.zze, zzfboVar, zzfcaVar.zzb.zzb);
        zzcexVarZza.zzac(zzfboVar.zzW);
        zzdpaVar.zza(this.zza, zzcexVarZza.zzF());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            this.zzj.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        final com.google.android.gms.internal.ads.zzder zzderVarZze = this.zzc.zze(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, null), new com.google.android.gms.internal.ads.zzdeu(new com.google.android.gms.internal.ads.zzeey(this.zza, this.zzf, zzcabVar, zzfboVar, zzcexVarZza, this.zzd, this.zzh, this.zzg, this.zzi, this.zzk), zzcexVarZza));
        zzcabVar.zzc(zzderVarZze);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            zzeezVar = this;
            zzeezVar.zzj.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        } else {
            zzeezVar = this;
        }
        zzderVarZze.zzc().zzo(new com.google.android.gms.internal.ads.zzcwn() { // from class: com.google.android.gms.internal.ads.zzeew
            @Override // com.google.android.gms.internal.ads.zzcwn
            public final void zzr() {
                com.google.android.gms.internal.ads.zzcex zzcexVar = zzcexVarZza;
                if (zzcexVar.zzN() != null) {
                    zzcexVar.zzN().zzs();
                }
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
        java.lang.String strZzb = zzfboVar.zzs.zza;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzff)).booleanValue() && zzderVarZze.zzl().zze(true)) {
            strZzb = com.google.android.gms.internal.ads.zzcgi.zzb(strZzb, com.google.android.gms.internal.ads.zzcgi.zza(zzfboVar));
        }
        zzderVarZze.zzi().zzi(zzcexVarZza, true, zzeezVar.zzh ? zzeezVar.zzg : null, zzeezVar.zzj.zza());
        zzderVarZze.zzi();
        return com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzdov.zzj(zzcexVarZza, zzfboVar.zzs.zzb, strZzb, zzeezVar.zzj.zza()), new com.google.android.gms.internal.ads.zzfuc(zzeezVar) { // from class: com.google.android.gms.internal.ads.zzeex
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.zzcex zzcexVar = zzcexVarZza;
                if (zzfboVar.zzM) {
                    zzcexVar.zzah();
                }
                com.google.android.gms.internal.ads.zzder zzderVar = zzderVarZze;
                zzcexVar.zzab();
                zzcexVar.onPause();
                return zzderVar.zzg();
            }
        }, zzeezVar.zze);
    }
}
