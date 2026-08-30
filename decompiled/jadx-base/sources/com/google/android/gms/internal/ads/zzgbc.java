package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgbc extends com.google.android.gms.internal.ads.zzgbe {
    zzgbc(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzgbo zzgboVar) {
        super(listenableFuture, zzgboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbe
    final /* bridge */ /* synthetic */ java.lang.Object zze(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzgbo zzgboVar = (com.google.android.gms.internal.ads.zzgbo) obj;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZza = zzgboVar.zza(obj2);
        com.google.android.gms.internal.ads.zzfun.zzd(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgboVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbe
    final /* synthetic */ void zzf(java.lang.Object obj) {
        zzs((com.google.common.util.concurrent.ListenableFuture) obj);
    }
}
