package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgcf {
    private final boolean zza;
    private final com.google.android.gms.internal.ads.zzfxn zzb;

    /* synthetic */ zzgcf(boolean z, com.google.android.gms.internal.ads.zzfxn zzfxnVar, com.google.android.gms.internal.ads.zzgcg zzgcgVar) {
        this.zza = z;
        this.zzb = zzfxnVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.zzgbu(this.zzb, this.zza, executor, callable);
    }
}
