package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbzw {
    public static final com.google.android.gms.internal.ads.zzgcs zza;
    public static final com.google.android.gms.internal.ads.zzgcs zzb;
    public static final com.google.android.gms.internal.ads.zzgcs zzc;
    public static final java.util.concurrent.ScheduledExecutorService zzd;
    public static final com.google.android.gms.internal.ads.zzgct zze;
    public static final com.google.android.gms.internal.ads.zzgcs zzf;
    public static final com.google.android.gms.internal.ads.zzgcs zzg;

    /* JADX WARN: Code duplicated, block: B:14:0x009b  */
    static {
        java.util.concurrent.ExecutorService threadPoolExecutor;
        java.util.concurrent.ExecutorService executorServiceZzc;
        java.util.concurrent.ExecutorService executorServiceZzb;
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
            com.google.android.gms.internal.ads.zzfqv.zza();
            threadPoolExecutor = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool(new com.google.android.gms.internal.ads.zzbzs(androidx.webkit.Profile.DEFAULT_PROFILE_NAME)));
        } else {
            if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(com.google.android.gms.internal.ads.zzbcl.zzlf) != null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(com.google.android.gms.internal.ads.zzbcl.zzlf)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(com.google.android.gms.internal.ads.zzbcl.zzlg) != null) {
                        if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(com.google.android.gms.internal.ads.zzbcl.zzlh) != null) {
                            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = new java.util.concurrent.ThreadPoolExecutor(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(com.google.android.gms.internal.ads.zzbcl.zzlg)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(com.google.android.gms.internal.ads.zzbcl.zzlg)).intValue(), 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.zzbzs(androidx.webkit.Profile.DEFAULT_PROFILE_NAME));
                            threadPoolExecutor2.allowCoreThreadTimeOut(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(com.google.android.gms.internal.ads.zzbcl.zzlh)).booleanValue());
                            threadPoolExecutor = threadPoolExecutor2;
                        } else {
                            threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.google.android.gms.internal.ads.zzbzs(androidx.webkit.Profile.DEFAULT_PROFILE_NAME));
                        }
                    } else {
                        threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.google.android.gms.internal.ads.zzbzs(androidx.webkit.Profile.DEFAULT_PROFILE_NAME));
                    }
                } else {
                    threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.google.android.gms.internal.ads.zzbzs(androidx.webkit.Profile.DEFAULT_PROFILE_NAME));
                }
            } else {
                threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.google.android.gms.internal.ads.zzbzs(androidx.webkit.Profile.DEFAULT_PROFILE_NAME));
            }
        }
        com.google.android.gms.internal.ads.zzbzv zzbzvVar = null;
        zza = new com.google.android.gms.internal.ads.zzbzu(threadPoolExecutor, zzbzvVar);
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
            executorServiceZzc = com.google.android.gms.internal.ads.zzfqv.zza().zzc(5, new com.google.android.gms.internal.ads.zzbzs("Loader"), 1);
        } else {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor3 = new java.util.concurrent.ThreadPoolExecutor(5, 5, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.zzbzs("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor3;
        }
        zzb = new com.google.android.gms.internal.ads.zzbzu(executorServiceZzc, zzbzvVar);
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
            executorServiceZzb = com.google.android.gms.internal.ads.zzfqv.zza().zzb(new com.google.android.gms.internal.ads.zzbzs("Activeview"), 1);
        } else {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor4 = new java.util.concurrent.ThreadPoolExecutor(1, 1, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.zzbzs("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorServiceZzb = threadPoolExecutor4;
        }
        zzc = new com.google.android.gms.internal.ads.zzbzu(executorServiceZzb, zzbzvVar);
        com.google.android.gms.internal.ads.zzbzr zzbzrVar = new com.google.android.gms.internal.ads.zzbzr(3, new com.google.android.gms.internal.ads.zzbzs("Schedule"));
        zzd = zzbzrVar;
        zze = com.google.android.gms.internal.ads.zzgcz.zzb(zzbzrVar);
        zzf = new com.google.android.gms.internal.ads.zzbzu(new com.google.android.gms.internal.ads.zzbzt(), zzbzvVar);
        zzg = new com.google.android.gms.internal.ads.zzbzu(com.google.android.gms.internal.ads.zzgcz.zzc(), zzbzvVar);
    }
}
