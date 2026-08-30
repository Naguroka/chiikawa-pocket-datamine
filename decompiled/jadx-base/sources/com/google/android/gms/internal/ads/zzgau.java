package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgau extends com.google.android.gms.internal.ads.zzgaw {
    zzgau(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Class cls, com.google.android.gms.internal.ads.zzgbo zzgboVar) {
        super(listenableFuture, cls, zzgboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    final /* bridge */ /* synthetic */ java.lang.Object zze(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzgbo zzgboVar = (com.google.android.gms.internal.ads.zzgbo) obj;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZza = zzgboVar.zza(th);
        com.google.android.gms.internal.ads.zzfun.zzd(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgboVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    final /* synthetic */ void zzf(java.lang.Object obj) {
        zzs((com.google.common.util.concurrent.ListenableFuture) obj);
    }
}
