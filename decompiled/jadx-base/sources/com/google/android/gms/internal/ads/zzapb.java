package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzapb implements java.util.concurrent.Executor {
    final /* synthetic */ android.os.Handler zza;

    zzapb(com.google.android.gms.internal.ads.zzapd zzapdVar, android.os.Handler handler) {
        this.zza = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.post(runnable);
    }
}
