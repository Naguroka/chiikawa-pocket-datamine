package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfqt implements com.google.android.gms.internal.ads.zzfqs {
    private zzfqt() {
        throw null;
    }

    /* synthetic */ zzfqt(com.google.android.gms.internal.ads.zzfqu zzfquVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final java.util.concurrent.ExecutorService zza(int i) {
        return zzc(1, java.util.concurrent.Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final java.util.concurrent.ExecutorService zzb(java.util.concurrent.ThreadFactory threadFactory, int i) {
        return zzc(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final java.util.concurrent.ExecutorService zzc(int i, java.util.concurrent.ThreadFactory threadFactory, int i2) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i, i, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
