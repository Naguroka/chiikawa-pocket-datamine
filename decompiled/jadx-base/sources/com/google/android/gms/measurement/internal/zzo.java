package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    zzo(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.zza = zzcyVar;
        this.zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService = this.zzb;
        appMeasurementDynamiteService.zza.zzw().zzT(this.zza, appMeasurementDynamiteService.zza.zzI());
    }
}
