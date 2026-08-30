package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbc extends com.google.android.gms.internal.measurement.zzaw {
    protected zzbc() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.AND);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.NOT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzbl zzblVar = com.google.android.gms.internal.measurement.zzbl.ADD;
        int iOrdinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        if (iOrdinal == 1) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.AND.name(), 2, list);
            com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
            return !zzapVarZzb.zzg().booleanValue() ? zzapVarZzb : zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
        }
        if (iOrdinal == 47) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.NOT.name(), 1, list);
            return new com.google.android.gms.internal.measurement.zzaf(java.lang.Boolean.valueOf(!zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzg().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.zzb(str);
        }
        com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.OR.name(), 2, list);
        com.google.android.gms.internal.measurement.zzap zzapVarZzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
        return zzapVarZzb2.zzg().booleanValue() ? zzapVarZzb2 : zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
    }
}
