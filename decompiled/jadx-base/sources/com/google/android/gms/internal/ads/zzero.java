package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzero implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;

    public zzero(com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        this.zza = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzern
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", com.google.android.gms.ads.internal.zzv.zzp().zzb());
                return new com.google.android.gms.internal.ads.zzerp(bundle);
            }
        });
    }
}
