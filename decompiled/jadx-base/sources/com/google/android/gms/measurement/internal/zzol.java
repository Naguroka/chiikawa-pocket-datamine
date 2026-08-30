package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzol {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzop zza;
    private com.google.android.gms.measurement.internal.zzok zzb;

    zzol(com.google.android.gms.measurement.internal.zzop zzopVar) {
        this.zza = zzopVar;
    }

    final void zza(long j) {
        com.google.android.gms.measurement.internal.zzop zzopVar = this.zza;
        this.zzb = new com.google.android.gms.measurement.internal.zzok(this, zzopVar.zzu.zzaU().currentTimeMillis(), j);
        zzopVar.zzd.postDelayed(this.zzb, 2000L);
    }

    final void zzb() {
        com.google.android.gms.measurement.internal.zzop zzopVar = this.zza;
        zzopVar.zzg();
        com.google.android.gms.measurement.internal.zzok zzokVar = this.zzb;
        if (zzokVar != null) {
            zzopVar.zzd.removeCallbacks(zzokVar);
        }
        com.google.android.gms.measurement.internal.zzio zzioVar = zzopVar.zzu;
        zzioVar.zzm().zzn.zza(false);
        zzopVar.zzm(false);
        if (zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaZ)) {
            com.google.android.gms.measurement.internal.zzio zzioVar2 = zzopVar.zzu;
            if (zzioVar2.zzq().zzap()) {
                zzioVar.zzaW().zzj().zza("Retrying trigger URI registration in foreground");
                zzioVar2.zzq().zzU();
            }
        }
    }
}
