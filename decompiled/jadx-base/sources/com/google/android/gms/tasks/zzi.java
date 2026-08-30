package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzi implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzj zzb;

    zzi(com.google.android.gms.tasks.zzj zzjVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        this.zzb = zzjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zzb) {
            com.google.android.gms.tasks.zzj zzjVar = this.zzb;
            if (zzjVar.zzc != null) {
                zzjVar.zzc.onComplete(this.zza);
            }
        }
    }
}
