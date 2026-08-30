package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgav extends com.google.android.gms.internal.ads.zzgaw {
    zzgav(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Class cls, com.google.android.gms.internal.ads.zzfuc zzfucVar) {
        super(listenableFuture, cls, zzfucVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    final /* synthetic */ java.lang.Object zze(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Exception {
        return ((com.google.android.gms.internal.ads.zzfuc) obj).apply(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    final void zzf(java.lang.Object obj) {
        zzc(obj);
    }
}
