package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcsd {
    private final com.google.android.gms.internal.ads.zzdxl zza;
    private final com.google.android.gms.internal.ads.zzfcj zzb;
    private final com.google.android.gms.internal.ads.zzfgn zzc;
    private final com.google.android.gms.internal.ads.zzcky zzd;
    private final com.google.android.gms.internal.ads.zzegx zze;
    private final com.google.android.gms.internal.ads.zzdba zzf;
    private com.google.android.gms.internal.ads.zzfca zzg;
    private final com.google.android.gms.internal.ads.zzdyt zzh;
    private final com.google.android.gms.internal.ads.zzcuw zzi;
    private final java.util.concurrent.Executor zzj;
    private final com.google.android.gms.internal.ads.zzdye zzk;
    private final com.google.android.gms.internal.ads.zzedb zzl;

    zzcsd(com.google.android.gms.internal.ads.zzdxl zzdxlVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzfgn zzfgnVar, com.google.android.gms.internal.ads.zzcky zzckyVar, com.google.android.gms.internal.ads.zzegx zzegxVar, com.google.android.gms.internal.ads.zzdba zzdbaVar, com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzdyt zzdytVar, com.google.android.gms.internal.ads.zzcuw zzcuwVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdye zzdyeVar, com.google.android.gms.internal.ads.zzedb zzedbVar) {
        this.zza = zzdxlVar;
        this.zzb = zzfcjVar;
        this.zzc = zzfgnVar;
        this.zzd = zzckyVar;
        this.zze = zzegxVar;
        this.zzf = zzdbaVar;
        this.zzg = zzfcaVar;
        this.zzh = zzdytVar;
        this.zzi = zzcuwVar;
        this.zzj = executor;
        this.zzk = zzdyeVar;
        this.zzl = zzedbVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(java.lang.Throwable th) {
        return com.google.android.gms.internal.ads.zzfdk.zzb(th, this.zzl);
    }

    public final com.google.android.gms.internal.ads.zzdba zzc() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfca zzd(com.google.android.gms.internal.ads.zzfca zzfcaVar) throws java.lang.Exception {
        this.zzd.zza(zzfcaVar);
        return zzfcaVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zze(final com.google.android.gms.internal.ads.zzfed zzfedVar) {
        com.google.android.gms.internal.ads.zzfft zzfftVarZza = this.zzc.zzb(com.google.android.gms.internal.ads.zzfgh.GET_CACHE_KEY, this.zzi.zzc()).zzf(new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzcrz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzf(zzfedVar, (com.google.android.gms.internal.ads.zzbvk) obj);
            }
        }).zza();
        com.google.android.gms.internal.ads.zzgch.zzr(zzfftVarZza, new com.google.android.gms.internal.ads.zzcsb(this), this.zzj);
        return zzfftVarZza;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzfed zzfedVar, com.google.android.gms.internal.ads.zzbvk zzbvkVar) throws java.lang.Exception {
        zzbvkVar.zzi = zzfedVar;
        return this.zzh.zza(zzbvkVar);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzg(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        com.google.android.gms.internal.ads.zzfft zzfftVarZza = this.zzc.zzb(com.google.android.gms.internal.ads.zzfgh.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbvkVar)).zza();
        com.google.android.gms.internal.ads.zzgch.zzr(zzfftVarZza, new com.google.android.gms.internal.ads.zzcsc(this), this.zzj);
        return zzfftVarZza;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzh(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        com.google.android.gms.internal.ads.zzfgd zzfgdVarZzf = this.zzc.zzb(com.google.android.gms.internal.ads.zzfgh.RENDERER, listenableFuture).zze(new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzcry
            @Override // com.google.android.gms.internal.ads.zzffr
            public final java.lang.Object zza(java.lang.Object obj) throws java.lang.Exception {
                com.google.android.gms.internal.ads.zzfca zzfcaVar = (com.google.android.gms.internal.ads.zzfca) obj;
                this.zza.zzd(zzfcaVar);
                return zzfcaVar;
            }
        }).zzf(this.zze);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfx)).booleanValue()) {
            zzfgdVarZzf = zzfgdVarZzf.zzi(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfy)).intValue(), java.util.concurrent.TimeUnit.SECONDS);
        }
        return zzfgdVarZzf.zza();
    }

    public final com.google.common.util.concurrent.ListenableFuture zzi() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzb.zzd;
        if (zzmVar.zzx == null && zzmVar.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        com.google.android.gms.internal.ads.zzfgn zzfgnVar = this.zzc;
        com.google.android.gms.internal.ads.zzdxl zzdxlVar = this.zza;
        return com.google.android.gms.internal.ads.zzffx.zzc(zzdxlVar.zza(), com.google.android.gms.internal.ads.zzfgh.PRELOADED_LOADER, zzfgnVar).zza();
    }

    public final com.google.common.util.concurrent.ListenableFuture zzj(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            com.google.android.gms.internal.ads.zzfgn zzfgnVar = this.zzc;
            return com.google.android.gms.internal.ads.zzffx.zzc(com.google.android.gms.internal.ads.zzgch.zzh(this.zzg), com.google.android.gms.internal.ads.zzfgh.SERVER_TRANSACTION, zzfgnVar).zza();
        }
        com.google.android.gms.ads.internal.zzv.zzc().zzj();
        com.google.android.gms.internal.ads.zzfgd zzfgdVarZzb = this.zzc.zzb(com.google.android.gms.internal.ads.zzfgh.SERVER_TRANSACTION, listenableFuture);
        final com.google.android.gms.internal.ads.zzdye zzdyeVar = this.zzk;
        java.util.Objects.requireNonNull(zzdyeVar);
        return zzfgdVarZzb.zzf(new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzcsa
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return zzdyeVar.zzb((com.google.android.gms.internal.ads.zzbvk) obj);
            }
        }).zza();
    }

    public final void zzk(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        this.zzg = zzfcaVar;
    }
}
