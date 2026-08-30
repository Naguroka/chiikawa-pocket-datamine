package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzkv implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzkv(com.google.android.gms.measurement.internal.zzlw zzlwVar, boolean z) {
        this.zza = z;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzb;
        com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVar.zzu;
        boolean zZzJ = zzioVar.zzJ();
        boolean zZzI = zzioVar.zzI();
        boolean z = this.zza;
        zzioVar.zzF(z);
        if (zZzI == z) {
            zzioVar.zzaW().zzj().zzb("Default data collection state already set to", java.lang.Boolean.valueOf(z));
        }
        if (zzioVar.zzJ() == zZzJ || zzioVar.zzJ() != zzioVar.zzI()) {
            zzioVar.zzaW().zzl().zzc("Default data collection is different than actual status", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(zZzJ));
        }
        zzlwVar.zzat();
    }
}
