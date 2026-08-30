package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzna implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzc;

    zzna(com.google.android.gms.measurement.internal.zzny zznyVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = atomicReference;
        this.zzb = zzrVar;
        this.zzc = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    com.google.android.gms.measurement.internal.zzny zznyVar = this.zzc;
                    com.google.android.gms.measurement.internal.zzio zzioVar = zznyVar.zzu;
                    if (!zzioVar.zzm().zzh().zzr(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE)) {
                        zzioVar.zzaW().zzl().zza("Analytics storage consent denied; will not get app instance id");
                        zznyVar.zzu.zzq().zzac(null);
                        zzioVar.zzm().zze.zzb(null);
                        atomicReference2.set(null);
                        atomicReference2.notify();
                        return;
                    }
                    com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
                    if (zzglVar == null) {
                        zzioVar.zzaW().zze().zza("Failed to get app instance id");
                        atomicReference2.notify();
                        return;
                    }
                    com.google.android.gms.measurement.internal.zzr zzrVar = this.zzb;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                    atomicReference2.set(zzglVar.zzf(zzrVar));
                    java.lang.String str = (java.lang.String) atomicReference2.get();
                    if (str != null) {
                        zznyVar.zzu.zzq().zzac(str);
                        zzioVar.zzm().zze.zzb(str);
                    }
                    zznyVar.zzag();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (android.os.RemoteException e) {
                    this.zzc.zzu.zzaW().zze().zzb("Failed to get app instance id", e);
                    atomicReference = this.zza;
                }
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
