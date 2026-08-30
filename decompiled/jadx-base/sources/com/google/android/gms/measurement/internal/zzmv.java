package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmv implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzd;

    zzmv(com.google.android.gms.measurement.internal.zzny zznyVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) {
        this.zza = atomicReference;
        this.zzb = zzrVar;
        this.zzc = z;
        this.zzd = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    com.google.android.gms.measurement.internal.zzny zznyVar = this.zzd;
                    com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
                    if (zzglVar == null) {
                        zznyVar.zzu.zzaW().zze().zza("Failed to get all user properties; not connected to service");
                        atomicReference2.notify();
                        return;
                    }
                    com.google.android.gms.measurement.internal.zzr zzrVar = this.zzb;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                    atomicReference2.set(zzglVar.zzh(zzrVar, this.zzc));
                    zznyVar.zzag();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (android.os.RemoteException e) {
                    this.zzd.zzu.zzaW().zze().zzb("Failed to get all user properties; remote exception", e);
                    atomicReference = this.zza;
                }
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
