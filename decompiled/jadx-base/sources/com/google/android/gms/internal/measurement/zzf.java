package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzf {
    final com.google.android.gms.internal.measurement.zzax zza;
    final com.google.android.gms.internal.measurement.zzg zzb;
    final com.google.android.gms.internal.measurement.zzg zzc;
    final com.google.android.gms.internal.measurement.zzj zzd;

    public zzf() {
        com.google.android.gms.internal.measurement.zzax zzaxVar = new com.google.android.gms.internal.measurement.zzax();
        this.zza = zzaxVar;
        com.google.android.gms.internal.measurement.zzg zzgVar = new com.google.android.gms.internal.measurement.zzg(null, zzaxVar);
        this.zzc = zzgVar;
        this.zzb = zzgVar.zza();
        com.google.android.gms.internal.measurement.zzj zzjVar = new com.google.android.gms.internal.measurement.zzj();
        this.zzd = zzjVar;
        zzgVar.zzg("require", new com.google.android.gms.internal.measurement.zzw(zzjVar));
        zzjVar.zza("internal.platform", new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return new com.google.android.gms.internal.measurement.zzy();
            }
        });
        zzgVar.zzg("runtime.counter", new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(0.0d)));
    }

    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg zzgVar, com.google.android.gms.internal.measurement.zziz... zzizVarArr) {
        com.google.android.gms.internal.measurement.zzap zzapVarZza = com.google.android.gms.internal.measurement.zzap.zzf;
        for (com.google.android.gms.internal.measurement.zziz zzizVar : zzizVarArr) {
            zzapVarZza = com.google.android.gms.internal.measurement.zzi.zza(zzizVar);
            com.google.android.gms.internal.measurement.zzh.zzc(this.zzc);
            if ((zzapVarZza instanceof com.google.android.gms.internal.measurement.zzaq) || (zzapVarZza instanceof com.google.android.gms.internal.measurement.zzao)) {
                zzapVarZza = this.zza.zza(zzgVar, zzapVarZza);
            }
        }
        return zzapVarZza;
    }
}
