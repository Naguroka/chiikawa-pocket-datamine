package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzin implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzke zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzio zzb;

    zzin(com.google.android.gms.measurement.internal.zzio zzioVar, com.google.android.gms.measurement.internal.zzke zzkeVar) {
        this.zza = zzkeVar;
        this.zzb = zzioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzb;
        com.google.android.gms.measurement.internal.zzke zzkeVar = this.zza;
        com.google.android.gms.measurement.internal.zzio.zzC(zzioVar, zzkeVar);
        zzioVar.zzH(zzkeVar.zzg);
    }
}
