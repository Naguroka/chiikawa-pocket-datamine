package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzg implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.zzh zza;

    zzg(com.google.android.gms.tasks.zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzb) {
            com.google.android.gms.tasks.zzh zzhVar = this.zza;
            if (zzhVar.zzc != null) {
                zzhVar.zzc.onCanceled();
            }
        }
    }
}
