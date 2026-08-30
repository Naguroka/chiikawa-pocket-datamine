package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgbb extends java.util.concurrent.AbstractExecutorService implements com.google.android.gms.internal.ads.zzgcs {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzgdi.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return (com.google.common.util.concurrent.ListenableFuture) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Runnable runnable) {
        return (com.google.common.util.concurrent.ListenableFuture) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final com.google.common.util.concurrent.ListenableFuture zzb(java.util.concurrent.Callable callable) {
        return (com.google.common.util.concurrent.ListenableFuture) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable callable) {
        return new com.google.android.gms.internal.ads.zzgdi(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return (com.google.common.util.concurrent.ListenableFuture) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return (com.google.common.util.concurrent.ListenableFuture) super.submit(callable);
    }
}
