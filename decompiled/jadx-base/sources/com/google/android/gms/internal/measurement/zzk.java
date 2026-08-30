package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzk extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzab zza;

    public zzk(com.google.android.gms.internal.measurement.zzab zzabVar) {
        super("internal.eventLogger");
        this.zza = zzabVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzh.zzh(this.zzd, 3, list);
        java.lang.String strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
        long jZza = (long) com.google.android.gms.internal.measurement.zzh.zza(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue());
        com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2));
        this.zza.zze(strZzi, jZza, zzapVarZzb instanceof com.google.android.gms.internal.measurement.zzam ? com.google.android.gms.internal.measurement.zzh.zzg((com.google.android.gms.internal.measurement.zzam) zzapVarZzb) : new java.util.HashMap());
        return com.google.android.gms.internal.measurement.zzap.zzf;
    }
}
