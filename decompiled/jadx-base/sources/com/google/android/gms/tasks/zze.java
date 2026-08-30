package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zze implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzf zzb;

    zze(com.google.android.gms.tasks.zzf zzfVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        this.zzb = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.google.android.gms.tasks.Task task = (com.google.android.gms.tasks.Task) this.zzb.zzb.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            task.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
            task.addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
            task.addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
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
