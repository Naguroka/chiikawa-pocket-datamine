package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzl zzb;

    zzk(com.google.android.gms.tasks.zzl zzlVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        this.zzb = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zzb) {
            com.google.android.gms.tasks.zzl zzlVar = this.zzb;
            if (zzlVar.zzc != null) {
                zzlVar.zzc.onFailure((java.lang.Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza.getException()));
            }
        }
    }
}
