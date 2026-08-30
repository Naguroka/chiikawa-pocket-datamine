package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    zzj(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.zza = zzcyVar;
        this.zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzu().zzD(this.zza);
    }
}
