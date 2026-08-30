package com.google.android.gms.common.providers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zza implements com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory {
    zza() {
    }

    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor() {
        com.google.android.gms.internal.common.zzg.zza();
        return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1));
    }
}
