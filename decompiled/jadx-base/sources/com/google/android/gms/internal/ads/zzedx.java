package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzedx implements com.google.android.gms.internal.ads.zzecw {
    private final com.google.android.gms.internal.ads.zzcpq zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdow zzc;
    private final com.google.android.gms.internal.ads.zzfcj zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.internal.ads.zzfuc zzf;
    private final com.google.android.gms.internal.ads.zzdrq zzg;

    public zzedx(com.google.android.gms.internal.ads.zzcpq zzcpqVar, android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdow zzdowVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzfuc zzfucVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        this.zzb = context;
        this.zza = zzcpqVar;
        this.zze = executor;
        this.zzc = zzdowVar;
        this.zzd = zzfcjVar;
        this.zzf = zzfucVar;
        this.zzg = zzdrqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        return com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc(zzfcaVar, zzfboVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzfbt zzfbtVar = zzfboVar.zzs;
        return (zzfbtVar == null || zzfbtVar.zza == null) ? false : true;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, java.lang.Object obj) throws java.lang.Exception {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            this.zzg.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        com.google.android.gms.ads.internal.client.zzs zzsVarZza = com.google.android.gms.internal.ads.zzfcp.zza(this.zzb, zzfboVar.zzu);
        final com.google.android.gms.internal.ads.zzcex zzcexVarZza = this.zzc.zza(zzsVarZza, zzfboVar, zzfcaVar.zzb.zzb);
        zzcexVarZza.zzac(zzfboVar.zzW);
        android.view.View viewZza = (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhJ)).booleanValue() && zzfboVar.zzag) ? com.google.android.gms.internal.ads.zzcql.zza(this.zzb, zzcexVarZza.zzF(), zzfboVar) : new com.google.android.gms.internal.ads.zzdoz(this.zzb, zzcexVarZza.zzF(), (com.google.android.gms.ads.internal.util.zzau) this.zzf.apply(zzfboVar));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            this.zzg.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzcpq zzcpqVar = this.zza;
        com.google.android.gms.internal.ads.zzcrp zzcrpVar = new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, null);
        java.util.Objects.requireNonNull(zzcexVarZza);
        final com.google.android.gms.internal.ads.zzcon zzconVarZza = zzcpqVar.zza(zzcrpVar, new com.google.android.gms.internal.ads.zzcot(viewZza, zzcexVarZza, new com.google.android.gms.internal.ads.zzcqx() { // from class: com.google.android.gms.internal.ads.zzedr
            @Override // com.google.android.gms.internal.ads.zzcqx
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                return zzcexVarZza.zzq();
            }
        }, com.google.android.gms.internal.ads.zzfcp.zzb(zzsVarZza)));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            this.zzg.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        zzconVarZza.zzh().zzi(zzcexVarZza, false, null, this.zzg.zza());
        zzconVarZza.zzc().zzo(new com.google.android.gms.internal.ads.zzcwn() { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // com.google.android.gms.internal.ads.zzcwn
            public final void zzr() {
                com.google.android.gms.internal.ads.zzcex zzcexVar = zzcexVarZza;
                if (zzcexVar.zzN() != null) {
                    zzcexVar.zzN().zzs();
                }
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
        java.lang.String strZzb = zzfboVar.zzs.zza;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzff)).booleanValue() && zzconVarZza.zzi().zze(true)) {
            strZzb = com.google.android.gms.internal.ads.zzcgi.zzb(strZzb, com.google.android.gms.internal.ads.zzcgi.zza(zzfboVar));
        }
        zzconVarZza.zzh();
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzj = com.google.android.gms.internal.ads.zzdov.zzj(zzcexVarZza, zzfboVar.zzs.zzb, strZzb, this.zzg.zza());
        if (zzfboVar.zzM) {
            java.util.Objects.requireNonNull(zzcexVarZza);
            listenableFutureZzj.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzedt
                @Override // java.lang.Runnable
                public final void run() {
                    zzcexVarZza.zzah();
                }
            }, this.zze);
        }
        listenableFutureZzj.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzedu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzcexVarZza);
            }
        }, this.zze);
        return com.google.android.gms.internal.ads.zzgch.zzm(listenableFutureZzj, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzedv
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj2) {
                return zzconVarZza.zza();
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        zzcexVar.zzab();
        com.google.android.gms.internal.ads.zzfcj zzfcjVar = this.zzd;
        com.google.android.gms.internal.ads.zzcfz zzcfzVarZzq = zzcexVar.zzq();
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzfcjVar.zza;
        if (zzgaVar != null && zzcfzVarZzq != null) {
            zzcfzVarZzq.zzs(zzgaVar);
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbr)).booleanValue() || zzcexVar.isAttachedToWindow()) {
            return;
        }
        zzcexVar.onPause();
        zzcexVar.zzav(true);
    }
}
