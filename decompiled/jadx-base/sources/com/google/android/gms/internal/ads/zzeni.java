package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeni implements com.google.android.gms.internal.ads.zzetr {
    final com.google.android.gms.internal.ads.zzbzm zza;
    com.google.android.gms.appset.AppSetIdClient zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.internal.ads.zzgcs zzd;
    private final android.content.Context zze;

    zzeni(android.content.Context context, com.google.android.gms.internal.ads.zzbzm zzbzmVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdb)).booleanValue()) {
            this.zzb = com.google.android.gms.appset.AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzmVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcX)).booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdc)).booleanValue()) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcY)).booleanValue()) {
                    return com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzfrj.zza(this.zzb.getAppSetIdInfo(), null), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzenf
                        @Override // com.google.android.gms.internal.ads.zzfuc
                        public final java.lang.Object apply(java.lang.Object obj) {
                            com.google.android.gms.appset.AppSetIdInfo appSetIdInfo = (com.google.android.gms.appset.AppSetIdInfo) obj;
                            return new com.google.android.gms.internal.ads.zzenj(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, com.google.android.gms.internal.ads.zzbzw.zzg);
                }
                com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> taskZza = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdb)).booleanValue() ? com.google.android.gms.internal.ads.zzfdn.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZza == null) {
                    return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzenj(null, -1));
                }
                com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzfrj.zza(taskZza, null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeng
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        com.google.android.gms.appset.AppSetIdInfo appSetIdInfo = (com.google.android.gms.appset.AppSetIdInfo) obj;
                        return appSetIdInfo == null ? com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzenj(null, -1)) : com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzenj(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, com.google.android.gms.internal.ads.zzbzw.zzg);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcZ)).booleanValue()) {
                    listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzo(listenableFutureZzn, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzda)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzc);
                }
                return com.google.android.gms.internal.ads.zzgch.zze(listenableFutureZzn, java.lang.Exception.class, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzenh
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final java.lang.Object apply(java.lang.Object obj) {
                        this.zza.zza.zzw((java.lang.Exception) obj, "AppSetIdInfoSignal");
                        return new com.google.android.gms.internal.ads.zzenj(null, -1);
                    }
                }, this.zzd);
            }
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzenj(null, -1));
    }
}
