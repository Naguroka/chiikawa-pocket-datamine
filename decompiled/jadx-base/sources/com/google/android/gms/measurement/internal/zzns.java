package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzns implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzgl zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zzb;

    zzns(com.google.android.gms.measurement.internal.zznx zznxVar, com.google.android.gms.measurement.internal.zzgl zzglVar) {
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
                zznyVar.zzu.zzaW().zzd().zza("Connected to remote service");
                zznyVar.zzW(this.zza);
            }
        }
        com.google.android.gms.measurement.internal.zzny zznyVar2 = this.zzb.zza;
        if (!zznyVar2.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbo) || zznyVar2.zze == null) {
            return;
        }
        zznyVar2.zze.shutdownNow();
        zznyVar2.zze = null;
    }
}
