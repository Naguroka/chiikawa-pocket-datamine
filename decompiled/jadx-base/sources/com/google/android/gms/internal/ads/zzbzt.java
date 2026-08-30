package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbzt implements java.util.concurrent.Executor {
    private final android.os.Handler zza = new com.google.android.gms.ads.internal.util.zzf(android.os.Looper.getMainLooper());

    zzbzt() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            this.zza.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzN(com.google.android.gms.ads.internal.zzv.zzp().zzd(), th);
            throw th;
        }
    }
}
