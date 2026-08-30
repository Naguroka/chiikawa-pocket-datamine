package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevn implements com.google.android.gms.internal.ads.zzetr {
    public zzevn(com.google.android.gms.internal.ads.zzbza zzbzaVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(null);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfJ)).booleanValue()) {
            listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzh2 = com.google.android.gms.internal.ads.zzgch.zzh(null);
        return com.google.android.gms.internal.ads.zzgch.zzc(listenableFutureZzh, listenableFutureZzh2).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzevm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.ads.zzevo((java.lang.String) listenableFutureZzh.get(), (java.lang.String) listenableFutureZzh2.get());
            }
        }, com.google.android.gms.internal.ads.zzbzw.zza);
    }
}
