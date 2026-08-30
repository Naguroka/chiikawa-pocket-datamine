package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzn zzb;

    zzm(com.google.android.gms.tasks.zzn zznVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zzb) {
            com.google.android.gms.tasks.zzn zznVar = this.zzb;
            if (zznVar.zzc != null) {
                zznVar.zzc.onSuccess(this.zza.getResult());
            }
        }
    }
}
