package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzm extends com.google.android.gms.internal.measurement.zzai {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzm(com.google.android.gms.internal.measurement.zzn zznVar, java.lang.String str, com.google.android.gms.internal.measurement.zzo zzoVar) {
        super("getValue");
        this.zza = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzh.zzh("getValue", 2, list);
        com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
        com.google.android.gms.internal.measurement.zzap zzapVarZzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
        java.lang.String strZza = this.zza.zza(zzapVarZzb.zzi());
        return strZza != null ? new com.google.android.gms.internal.measurement.zzat(strZza) : zzapVarZzb2;
    }
}
