package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevb implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzbzm zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.android.gms.internal.ads.zzgcs zzc;

    zzevb(java.lang.String str, com.google.android.gms.internal.ads.zzbam zzbamVar, com.google.android.gms.internal.ads.zzbzm zzbzmVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        this.zza = zzbzmVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcX)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdc)).booleanValue()) {
                com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzfrj.zza(com.google.android.gms.tasks.Tasks.forResult(null), null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeuz
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        com.google.android.gms.appset.AppSetIdInfo appSetIdInfo = (com.google.android.gms.appset.AppSetIdInfo) obj;
                        return appSetIdInfo == null ? com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzevc(null, -1)) : com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzevc(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzc);
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbdy.zza.zze()).booleanValue()) {
                    listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzo(listenableFutureZzn, ((java.lang.Long) com.google.android.gms.internal.ads.zzbdy.zzb.zze()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzb);
                }
                return com.google.android.gms.internal.ads.zzgch.zze(listenableFutureZzn, java.lang.Exception.class, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzeva
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return this.zza.zzc((java.lang.Exception) obj);
                    }
                }, this.zzc);
            }
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzevc(null, -1));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzevc zzc(java.lang.Exception exc) {
        this.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new com.google.android.gms.internal.ads.zzevc(null, -1);
    }
}
