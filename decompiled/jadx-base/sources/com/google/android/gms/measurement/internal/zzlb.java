package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlb implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzlb(com.google.android.gms.measurement.internal.zzlw zzlwVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zza = atomicReference;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzb;
                atomicReference.set(java.lang.Boolean.valueOf(zzlwVar.zzu.zzf().zzx(zzlwVar.zzu.zzh().zzm(), com.google.android.gms.measurement.internal.zzgi.zzZ)));
                this.zza.notify();
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
