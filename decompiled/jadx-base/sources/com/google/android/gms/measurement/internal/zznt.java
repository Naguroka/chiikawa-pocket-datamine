package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zznt implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zza;

    zznt(com.google.android.gms.measurement.internal.zznx zznxVar) {
        this.zza = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzny zznyVar = this.zza.zza;
        com.google.android.gms.measurement.internal.zzio zzioVar = zznyVar.zzu;
        android.content.Context contextZzaT = zzioVar.zzaT();
        zzioVar.zzaV();
        com.google.android.gms.measurement.internal.zzny.zzx(zznyVar, new android.content.ComponentName(contextZzaT, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
