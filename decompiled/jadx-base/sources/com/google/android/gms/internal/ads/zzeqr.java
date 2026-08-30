package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeqr implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;

    public zzeqr(com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        this.zza = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.ads.zzeqs(com.google.android.gms.ads.internal.zzv.zzt().zzb(), com.google.android.gms.ads.internal.zzv.zzt().zzm());
            }
        });
    }
}
