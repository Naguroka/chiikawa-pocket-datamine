package com.google.android.gms.common.providers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class PooledExecutorsProvider {
    private static com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface PooledExecutorFactory {
        @java.lang.Deprecated
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    @java.lang.Deprecated
    public static synchronized com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory getInstance() {
        if (zza == null) {
            zza = new com.google.android.gms.common.providers.zza();
        }
        return zza;
    }
}
