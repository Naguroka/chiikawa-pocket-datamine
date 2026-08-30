package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzav extends com.google.android.gms.internal.measurement.zzaw {
    public zzav() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.BITWISE_AND);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.BITWISE_LEFT_SHIFT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.BITWISE_NOT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.BITWISE_OR);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.BITWISE_RIGHT_SHIFT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzbl zzblVar = com.google.android.gms.internal.measurement.zzbl.ADD;
        switch (com.google.android.gms.internal.measurement.zzh.zze(str).ordinal()) {
            case 4:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.BITWISE_AND.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzb(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue()) & com.google.android.gms.internal.measurement.zzh.zzb(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue())));
            case 5:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzb(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue()) << ((int) (com.google.android.gms.internal.measurement.zzh.zzd(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue()) & 31))));
            case 6:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.BITWISE_NOT.name(), 1, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(~com.google.android.gms.internal.measurement.zzh.zzb(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue())));
            case 7:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.BITWISE_OR.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzb(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue()) | com.google.android.gms.internal.measurement.zzh.zzb(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue())));
            case 8:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzb(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue()) >> ((int) (com.google.android.gms.internal.measurement.zzh.zzd(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue()) & 31))));
            case 9:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzd(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue()) >>> ((int) (com.google.android.gms.internal.measurement.zzh.zzd(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue()) & 31))));
            case 10:
                com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzbl.BITWISE_XOR.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzb(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue()) ^ com.google.android.gms.internal.measurement.zzh.zzb(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzh().doubleValue())));
            default:
                return super.zzb(str);
        }
    }
}
