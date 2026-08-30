package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgcu implements java.util.concurrent.Executor {
    final /* synthetic */ java.util.concurrent.Executor zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgax zzb;

    zzgcu(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzgax zzgaxVar) {
        this.zza = executor;
        this.zzb = zzgaxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }
}
