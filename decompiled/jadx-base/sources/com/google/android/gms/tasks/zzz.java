package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
final class zzz implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.zzw zza;
    final /* synthetic */ java.util.concurrent.Callable zzb;

    zzz(com.google.android.gms.tasks.zzw zzwVar, java.util.concurrent.Callable callable) {
        this.zza = zzwVar;
        this.zzb = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zzb(this.zzb.call());
        } catch (java.lang.Exception e) {
            this.zza.zza(e);
        } catch (java.lang.Throwable th) {
            this.zza.zza(new java.lang.RuntimeException(th));
        }
    }
}
