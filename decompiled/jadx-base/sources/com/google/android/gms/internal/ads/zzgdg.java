package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgdg extends com.google.android.gms.internal.ads.zzgcp {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgdi zza;
    private final com.google.android.gms.internal.ads.zzgbn zzb;

    zzgdg(com.google.android.gms.internal.ads.zzgdi zzgdiVar, com.google.android.gms.internal.ads.zzgbn zzgbnVar) {
        this.zza = zzgdiVar;
        this.zzb = zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final /* bridge */ /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzgbn zzgbnVar = this.zzb;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZza = zzgbnVar.zza();
        com.google.android.gms.internal.ads.zzfun.zzd(listenableFutureZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgbnVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final java.lang.String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final void zzd(java.lang.Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final /* synthetic */ void zze(java.lang.Object obj) {
        this.zza.zzs((com.google.common.util.concurrent.ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final boolean zzg() {
        return this.zza.isDone();
    }
}
