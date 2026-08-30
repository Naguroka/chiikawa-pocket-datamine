package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdwg {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;
    private final com.google.android.gms.internal.ads.zzdxo zzc;
    private final com.google.android.gms.internal.ads.zzhel zzd;

    public zzdwg(com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar2, com.google.android.gms.internal.ads.zzdxo zzdxoVar, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        this.zza = zzgcsVar;
        this.zzb = zzgcsVar2;
        this.zzc = zzdxoVar;
        this.zzd = zzhelVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.internal.ads.zzdyi zza(com.google.android.gms.internal.ads.zzbvk zzbvkVar) throws java.lang.Exception {
        return (com.google.android.gms.internal.ads.zzdyi) this.zzc.zza(zzbvkVar).get(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfy)).intValue(), java.util.concurrent.TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzbvk zzbvkVar, int i, com.google.android.gms.internal.ads.zzdyh zzdyhVar) throws java.lang.Exception {
        android.os.Bundle bundle;
        if (zzbvkVar != null && (bundle = zzbvkVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return com.google.android.gms.internal.ads.zzgch.zzn(((com.google.android.gms.internal.ads.zzdzl) this.zzd.zzb()).zzc(zzbvkVar, i), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdwc
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzdyi((java.io.InputStream) obj, zzbvkVar));
            }
        }, this.zzb);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        java.lang.String str = zzbvkVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzg = com.google.android.gms.ads.internal.util.zzs.zzD(str) ? com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzdyh(1)) : com.google.android.gms.internal.ads.zzgch.zzf(this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdwd
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zza(zzbvkVar);
            }
        }), java.util.concurrent.ExecutionException.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdwe
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                java.util.concurrent.ExecutionException executionException = (java.util.concurrent.ExecutionException) obj;
                java.lang.Throwable cause = executionException.getCause();
                java.util.concurrent.ExecutionException cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return com.google.android.gms.internal.ads.zzgch.zzg(cause2);
            }
        }, this.zzb);
        final int callingUid = android.os.Binder.getCallingUid();
        return com.google.android.gms.internal.ads.zzgch.zzf(listenableFutureZzg, com.google.android.gms.internal.ads.zzdyh.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdwf
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzb(zzbvkVar, callingUid, (com.google.android.gms.internal.ads.zzdyh) obj);
            }
        }, this.zzb);
    }
}
