package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgch extends com.google.android.gms.internal.ads.zzgcj {
    public static com.google.android.gms.internal.ads.zzgcf zza(java.lang.Iterable iterable) {
        return new com.google.android.gms.internal.ads.zzgcf(false, com.google.android.gms.internal.ads.zzfxn.zzk(iterable), null);
    }

    public static com.google.android.gms.internal.ads.zzgcf zzb(java.lang.Iterable iterable) {
        return new com.google.android.gms.internal.ads.zzgcf(true, com.google.android.gms.internal.ads.zzfxn.zzk(iterable), null);
    }

    @java.lang.SafeVarargs
    public static com.google.android.gms.internal.ads.zzgcf zzc(com.google.common.util.concurrent.ListenableFuture... listenableFutureArr) {
        return new com.google.android.gms.internal.ads.zzgcf(true, com.google.android.gms.internal.ads.zzfxn.zzm(listenableFutureArr), null);
    }

    public static com.google.common.util.concurrent.ListenableFuture zzd(java.lang.Iterable iterable) {
        return new com.google.android.gms.internal.ads.zzgbp(com.google.android.gms.internal.ads.zzfxn.zzk(iterable), true);
    }

    public static com.google.common.util.concurrent.ListenableFuture zze(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Class cls, com.google.android.gms.internal.ads.zzfuc zzfucVar, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzgav zzgavVar = new com.google.android.gms.internal.ads.zzgav(listenableFuture, cls, zzfucVar);
        listenableFuture.addListener(zzgavVar, com.google.android.gms.internal.ads.zzgcz.zzd(executor, zzgavVar));
        return zzgavVar;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzf(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Class cls, com.google.android.gms.internal.ads.zzgbo zzgboVar, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzgau zzgauVar = new com.google.android.gms.internal.ads.zzgau(listenableFuture, cls, zzgboVar);
        listenableFuture.addListener(zzgauVar, com.google.android.gms.internal.ads.zzgcz.zzd(executor, zzgauVar));
        return zzgauVar;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzh(java.lang.Object obj) {
        return obj == null ? com.google.android.gms.internal.ads.zzgcl.zza : new com.google.android.gms.internal.ads.zzgcl(obj);
    }

    public static com.google.common.util.concurrent.ListenableFuture zzi() {
        return com.google.android.gms.internal.ads.zzgcl.zza;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzj(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzgdi zzgdiVar = new com.google.android.gms.internal.ads.zzgdi(callable);
        executor.execute(zzgdiVar);
        return zzgdiVar;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzk(com.google.android.gms.internal.ads.zzgbn zzgbnVar, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzgdi zzgdiVar = new com.google.android.gms.internal.ads.zzgdi(zzgbnVar);
        executor.execute(zzgdiVar);
        return zzgdiVar;
    }

    @java.lang.SafeVarargs
    public static com.google.common.util.concurrent.ListenableFuture zzl(com.google.common.util.concurrent.ListenableFuture... listenableFutureArr) {
        return new com.google.android.gms.internal.ads.zzgbp(com.google.android.gms.internal.ads.zzfxn.zzm(listenableFutureArr), false);
    }

    public static com.google.common.util.concurrent.ListenableFuture zzm(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfuc zzfucVar, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzgbd zzgbdVar = new com.google.android.gms.internal.ads.zzgbd(listenableFuture, zzfucVar);
        listenableFuture.addListener(zzgbdVar, com.google.android.gms.internal.ads.zzgcz.zzd(executor, zzgbdVar));
        return zzgbdVar;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzn(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzgbo zzgboVar, java.util.concurrent.Executor executor) {
        int i = com.google.android.gms.internal.ads.zzgbe.zzc;
        executor.getClass();
        com.google.android.gms.internal.ads.zzgbc zzgbcVar = new com.google.android.gms.internal.ads.zzgbc(listenableFuture, zzgboVar);
        listenableFuture.addListener(zzgbcVar, com.google.android.gms.internal.ads.zzgcz.zzd(executor, zzgbcVar));
        return zzgbcVar;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzo(com.google.common.util.concurrent.ListenableFuture listenableFuture, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : com.google.android.gms.internal.ads.zzgdf.zzf(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static java.lang.Object zzp(java.util.concurrent.Future future) throws java.util.concurrent.ExecutionException {
        if (future.isDone()) {
            return com.google.android.gms.internal.ads.zzgdk.zza(future);
        }
        throw new java.lang.IllegalStateException(com.google.android.gms.internal.ads.zzfve.zzb("Future was expected to be done: %s", future));
    }

    public static java.lang.Object zzq(java.util.concurrent.Future future) {
        try {
            return com.google.android.gms.internal.ads.zzgdk.zza(future);
        } catch (java.util.concurrent.ExecutionException e) {
            if (e.getCause() instanceof java.lang.Error) {
                throw new com.google.android.gms.internal.ads.zzgbw((java.lang.Error) e.getCause());
            }
            throw new com.google.android.gms.internal.ads.zzgdj(e.getCause());
        }
    }

    public static com.google.common.util.concurrent.ListenableFuture zzg(java.lang.Throwable th) {
        th.getClass();
        return new com.google.android.gms.internal.ads.zzgck(th);
    }

    public static void zzr(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzgcd zzgcdVar, java.util.concurrent.Executor executor) {
        zzgcdVar.getClass();
        listenableFuture.addListener(new com.google.android.gms.internal.ads.zzgce(listenableFuture, zzgcdVar), executor);
    }
}
