package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzffv {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgf zza;
    private final java.lang.Object zzb;
    private final java.util.List zzc;

    /* synthetic */ zzffv(com.google.android.gms.internal.ads.zzfgf zzfgfVar, java.lang.Object obj, java.util.List list, com.google.android.gms.internal.ads.zzfge zzfgeVar) {
        this.zza = zzfgfVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final com.google.android.gms.internal.ads.zzfgd zza(java.util.concurrent.Callable callable) {
        com.google.android.gms.internal.ads.zzgcf zzgcfVarZzb = com.google.android.gms.internal.ads.zzgch.zzb(this.zzc);
        com.google.common.util.concurrent.ListenableFuture listenableFutureZza = zzgcfVarZzb.zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzffu
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return null;
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
        com.google.common.util.concurrent.ListenableFuture listenableFutureZza2 = zzgcfVarZzb.zza(callable, this.zza.zzb);
        return new com.google.android.gms.internal.ads.zzfgd(this.zza, this.zzb, listenableFutureZza, this.zzc, listenableFutureZza2);
    }
}
