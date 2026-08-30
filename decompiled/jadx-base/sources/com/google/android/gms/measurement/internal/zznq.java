package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zznq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzgl zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zzb;

    zznq(com.google.android.gms.measurement.internal.zznx zznxVar, com.google.android.gms.measurement.internal.zzgl zzglVar) {
        this.zza = zzglVar;
        this.zzb = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zznx zznxVar = this.zzb;
        synchronized (zznxVar) {
            zznxVar.zzb = false;
            com.google.android.gms.measurement.internal.zzny zznyVar = zznxVar.zza;
            if (!zznyVar.zzaa()) {
                zznyVar.zzu.zzaW().zzj().zza("Connected to service");
                zznyVar.zzW(this.zza);
            }
        }
    }
}
