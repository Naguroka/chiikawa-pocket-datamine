package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzkd implements com.google.android.gms.measurement.internal.zzgw {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzio zza;

    zzkd(com.google.android.gms.measurement.internal.zzke zzkeVar, com.google.android.gms.measurement.internal.zzio zzioVar) {
        this.zza = zzioVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final boolean zza() {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza;
        return zzioVar.zzL() && android.util.Log.isLoggable(zzioVar.zzaW().zzr(), 3);
    }
}
