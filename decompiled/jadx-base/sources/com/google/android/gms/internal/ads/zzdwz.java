package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdwz {
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;
    private final com.google.android.gms.internal.ads.zzgcs zzc;
    private final com.google.android.gms.internal.ads.zzdxu zzd;
    private final com.google.android.gms.internal.ads.zzhel zze;

    public zzdwz(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar2, com.google.android.gms.internal.ads.zzdxu zzdxuVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgcsVar;
        this.zzc = zzgcsVar2;
        this.zzd = zzdxuVar;
        this.zze = zzhelVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.internal.ads.zzdyi zza(com.google.android.gms.internal.ads.zzbvk zzbvkVar) throws java.lang.Exception {
        return (com.google.android.gms.internal.ads.zzdyi) this.zzd.zza(zzbvkVar).get(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfy)).intValue(), java.util.concurrent.TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzbvk zzbvkVar, int i, java.lang.Throwable th) throws java.lang.Exception {
        android.os.Bundle bundle;
        if (zzbvkVar != null && (bundle = zzbvkVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return com.google.android.gms.internal.ads.zzgch.zzn(((com.google.android.gms.internal.ads.zzdzl) this.zze.zzb()).zzd(zzbvkVar, i), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdww
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzdyi((java.io.InputStream) obj, zzbvkVar));
            }
        }, this.zzb);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzb;
        java.lang.String str = zzbvkVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(str)) {
            listenableFutureZzb = com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzdyh(1));
        } else {
            listenableFutureZzb = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhn)).booleanValue() ? this.zzc.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdwx
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.zza.zza(zzbvkVar);
                }
            }) : this.zzd.zza(zzbvkVar);
        }
        final int callingUid = android.os.Binder.getCallingUid();
        return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzf((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzo(com.google.android.gms.internal.ads.zzgby.zzu(listenableFutureZzb), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfy)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.zza), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdwy
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzb(zzbvkVar, callingUid, (java.lang.Throwable) obj);
            }
        }, this.zzb);
    }
}
