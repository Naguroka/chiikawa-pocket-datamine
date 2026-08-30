package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zznn implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zze;

    zznn(com.google.android.gms.measurement.internal.zzny zznyVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzrVar;
        this.zze = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    com.google.android.gms.measurement.internal.zzny zznyVar = this.zze;
                    com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
                    if (zzglVar == null) {
                        zznyVar.zzu.zzaW().zze().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.zzb, this.zzc);
                        atomicReference2.set(java.util.Collections.emptyList());
                        atomicReference2.notify();
                        return;
                    }
                    if (android.text.TextUtils.isEmpty(null)) {
                        com.google.android.gms.measurement.internal.zzr zzrVar = this.zzd;
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                        atomicReference2.set(zzglVar.zzi(this.zzb, this.zzc, zzrVar));
                    } else {
                        atomicReference2.set(zzglVar.zzj(null, this.zzb, this.zzc));
                    }
                    zznyVar.zzag();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (android.os.RemoteException e) {
                    this.zze.zzu.zzaW().zze().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.zzb, e);
                    this.zza.set(java.util.Collections.emptyList());
                    atomicReference = this.zza;
                }
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
