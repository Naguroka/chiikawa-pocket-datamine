package com.google.android.gms.common.util.concurrent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class HandlerExecutor implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    public HandlerExecutor(android.os.Looper looper) {
        this.zza = new com.google.android.gms.internal.common.zzh(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.post(runnable);
    }
}
