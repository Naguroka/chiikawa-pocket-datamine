package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zznj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzb;

    zznj(com.google.android.gms.measurement.internal.zzny zznyVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzrVar;
        this.zzb = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzny zznyVar = this.zzb;
        com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
        if (zzglVar == null) {
            zznyVar.zzu.zzaW().zze().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
            zzglVar.zzz(zzrVar);
            zznyVar.zzag();
        } catch (android.os.RemoteException e) {
            this.zzb.zzu.zzaW().zze().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
