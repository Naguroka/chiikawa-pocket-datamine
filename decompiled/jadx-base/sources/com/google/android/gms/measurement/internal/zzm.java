package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzp zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    zzm(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.measurement.internal.zzp zzpVar) {
        this.zza = zzpVar;
        this.zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzq().zzah(this.zza);
    }
}
