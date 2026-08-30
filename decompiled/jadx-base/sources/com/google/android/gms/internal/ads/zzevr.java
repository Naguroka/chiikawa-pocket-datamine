package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevr implements com.google.android.gms.internal.ads.zzetr {
    final com.google.android.gms.internal.ads.zzgcs zza;
    final java.util.List zzb;

    public zzevr(com.google.android.gms.internal.ads.zzbbu zzbbuVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, java.util.List list) {
        this.zza = zzgcsVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.ads.zzevs(this.zza.zzb);
            }
        });
    }
}
