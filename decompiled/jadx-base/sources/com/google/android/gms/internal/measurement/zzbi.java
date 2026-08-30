package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbi extends com.google.android.gms.internal.measurement.zzaw {
    protected zzbi() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.ADD);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.DIVIDE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.MODULUS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.MULTIPLY);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.NEGATE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.POST_DECREMENT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.POST_INCREMENT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.PRE_DECREMENT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.PRE_INCREMENT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzbl zzblVar = com.google.android.gms.internal.measurement.zzbl.ADD;
        int iOrdinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        if (iOrdinal == 0) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.ADD.name(), 2, list);
            com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
            com.google.android.gms.internal.measurement.zzap zzapVarZzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
            if (!(zzapVarZzb instanceof com.google.android.gms.internal.measurement.zzal) && !(zzapVarZzb instanceof com.google.android.gms.internal.measurement.zzat) && !(zzapVarZzb2 instanceof com.google.android.gms.internal.measurement.zzal) && !(zzapVarZzb2 instanceof com.google.android.gms.internal.measurement.zzat)) {
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzapVarZzb.zzh().doubleValue() + zzapVarZzb2.zzh().doubleValue()));
            }
            return new com.google.android.gms.internal.measurement.zzat(java.lang.String.valueOf(zzapVarZzb.zzi()).concat(java.lang.String.valueOf(zzapVarZzb2.zzi())));
        }
        if (iOrdinal == 21) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.DIVIDE.name(), 2, list);
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue() / zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue()));
        }
        if (iOrdinal == 59) {
            com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.SUBTRACT.name(), 2, list);
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue() + new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue())).zzh().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            com.google.android.gms.internal.measurement.zzh.zzh(str, 2, list);
            com.google.android.gms.internal.measurement.zzap zzapVarZzb3 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
            zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
            return zzapVarZzb3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            com.google.android.gms.internal.measurement.zzh.zzh(str, 1, list);
            return zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.MODULUS.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue() % zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue()));
            case 45:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.MULTIPLY.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue() * zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue()));
            case 46:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.NEGATE.name(), 1, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue()));
            default:
                return super.zzb(str);
        }
    }
}
