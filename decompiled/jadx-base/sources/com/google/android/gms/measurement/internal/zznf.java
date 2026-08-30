package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zznf implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzb;

    zznf(com.google.android.gms.measurement.internal.zzny zznyVar, com.google.android.gms.measurement.internal.zzmh zzmhVar) {
        this.zza = zzmhVar;
        this.zzb = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzny zznyVar = this.zzb;
        com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
        if (zzglVar == null) {
            zznyVar.zzu.zzaW().zze().zza("Failed to send current screen to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzmh zzmhVar = this.zza;
            if (zzmhVar == null) {
                zzglVar.zzw(0L, null, null, zznyVar.zzu.zzaT().getPackageName());
            } else {
                zzglVar.zzw(zzmhVar.zzc, zzmhVar.zza, zzmhVar.zzb, zznyVar.zzu.zzaT().getPackageName());
            }
            zznyVar.zzag();
        } catch (android.os.RemoteException e) {
            this.zzb.zzu.zzaW().zze().zzb("Failed to send current screen to the service", e);
        }
    }
}
