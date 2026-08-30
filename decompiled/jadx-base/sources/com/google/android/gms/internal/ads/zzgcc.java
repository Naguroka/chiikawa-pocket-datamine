package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgcc extends com.google.android.gms.internal.ads.zzgca implements com.google.common.util.concurrent.ListenableFuture {
    protected zzgcc() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgca
    protected /* bridge */ /* synthetic */ java.util.concurrent.Future zzb() {
        throw null;
    }

    protected abstract com.google.common.util.concurrent.ListenableFuture zzc();
}
