package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzp zzb;

    zzo(com.google.android.gms.tasks.zzp zzpVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.google.android.gms.tasks.Task taskThen = this.zzb.zzb.then(this.zza.getResult());
            if (taskThen == null) {
                this.zzb.onFailure(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            taskThen.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
            taskThen.addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
            taskThen.addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.zza, this.zzb);
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            if (e.getCause() instanceof java.lang.Exception) {
                this.zzb.onFailure((java.lang.Exception) e.getCause());
            } else {
                this.zzb.onFailure(e);
            }
        } catch (java.util.concurrent.CancellationException unused) {
            this.zzb.onCanceled();
        } catch (java.lang.Exception e2) {
            this.zzb.onFailure(e2);
        }
    }
}
