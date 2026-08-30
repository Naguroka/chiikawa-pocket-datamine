package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbh zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzd;

    zzk(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar, com.google.android.gms.measurement.internal.zzbh zzbhVar, java.lang.String str) {
        this.zza = zzcyVar;
        this.zzb = zzbhVar;
        this.zzc = str;
        this.zzd = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzu().zzN(this.zza, this.zzb, this.zzc);
    }
}
