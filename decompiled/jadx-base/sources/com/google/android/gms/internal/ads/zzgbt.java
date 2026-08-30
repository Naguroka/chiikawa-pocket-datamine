package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzgbt extends com.google.android.gms.internal.ads.zzgcp {
    private final java.util.concurrent.Executor zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgbu zzb;

    zzgbt(com.google.android.gms.internal.ads.zzgbu zzgbuVar, java.util.concurrent.Executor executor) {
        this.zzb = zzgbuVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzc(java.lang.Object obj);

    @Override // com.google.android.gms.internal.ads.zzgcp
    final void zzd(java.lang.Throwable th) {
        this.zzb.zza = null;
        if (th instanceof java.util.concurrent.ExecutionException) {
            this.zzb.zzd(((java.util.concurrent.ExecutionException) th).getCause());
        } else if (th instanceof java.util.concurrent.CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final void zze(java.lang.Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    final void zzf() {
        try {
            this.zza.execute(this);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final boolean zzg() {
        return this.zzb.isDone();
    }
}
