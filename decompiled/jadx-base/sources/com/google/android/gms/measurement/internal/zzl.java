package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzl implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zze;

    zzl(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar, java.lang.String str, java.lang.String str2, boolean z) {
        this.zza = zzcyVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z;
        this.zze = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza.zzu().zzK(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
