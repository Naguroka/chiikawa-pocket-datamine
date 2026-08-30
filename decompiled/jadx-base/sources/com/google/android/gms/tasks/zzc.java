package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzc implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzd zzb;

    zzc(com.google.android.gms.tasks.zzd zzdVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        this.zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.isCanceled()) {
            this.zzb.zzc.zzc();
            return;
        }
        try {
            this.zzb.zzc.zzb(this.zzb.zzb.then(this.zza));
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            if (e.getCause() instanceof java.lang.Exception) {
                this.zzb.zzc.zza((java.lang.Exception) e.getCause());
            } else {
                this.zzb.zzc.zza(e);
            }
        } catch (java.lang.Exception e2) {
            this.zzb.zzc.zza(e2);
        }
    }
}
