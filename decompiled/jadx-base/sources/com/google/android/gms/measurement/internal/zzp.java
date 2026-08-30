package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzp implements com.google.android.gms.measurement.internal.zzkb {
    public final com.google.android.gms.internal.measurement.zzde zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    zzp(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzde zzdeVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzdeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkb
    public final void interceptEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        try {
            this.zza.zzf(str, str2, bundle, j);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.measurement.internal.zzio zzioVar = this.zzb.zza;
            if (zzioVar != null) {
                zzioVar.zzaW().zzk().zzb("Event interceptor threw exception", e);
            }
        }
    }
}
