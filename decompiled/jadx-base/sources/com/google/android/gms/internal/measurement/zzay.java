package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzay extends com.google.android.gms.internal.measurement.zzaw {
    public zzay() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.EQUALS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.GREATER_THAN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.GREATER_THAN_EQUALS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.IDENTITY_EQUALS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.IDENTITY_NOT_EQUALS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.LESS_THAN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.LESS_THAN_EQUALS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbl.NOT_EQUALS);
    }

    private static boolean zzc(com.google.android.gms.internal.measurement.zzap zzapVar, com.google.android.gms.internal.measurement.zzap zzapVar2) {
        if (zzapVar.getClass().equals(zzapVar2.getClass())) {
            if ((zzapVar instanceof com.google.android.gms.internal.measurement.zzau) || (zzapVar instanceof com.google.android.gms.internal.measurement.zzan)) {
                return true;
            }
            if (zzapVar instanceof com.google.android.gms.internal.measurement.zzah) {
                return (java.lang.Double.isNaN(zzapVar.zzh().doubleValue()) || java.lang.Double.isNaN(zzapVar2.zzh().doubleValue()) || zzapVar.zzh().doubleValue() != zzapVar2.zzh().doubleValue()) ? false : true;
            }
            if (zzapVar instanceof com.google.android.gms.internal.measurement.zzat) {
                return zzapVar.zzi().equals(zzapVar2.zzi());
            }
            if (zzapVar instanceof com.google.android.gms.internal.measurement.zzaf) {
                return zzapVar.zzg().equals(zzapVar2.zzg());
            }
            return zzapVar == zzapVar2;
        }
        if (((zzapVar instanceof com.google.android.gms.internal.measurement.zzau) || (zzapVar instanceof com.google.android.gms.internal.measurement.zzan)) && ((zzapVar2 instanceof com.google.android.gms.internal.measurement.zzau) || (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzan))) {
            return true;
        }
        boolean z = zzapVar instanceof com.google.android.gms.internal.measurement.zzah;
        if (z && (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzat)) {
            return zzc(zzapVar, new com.google.android.gms.internal.measurement.zzah(zzapVar2.zzh()));
        }
        boolean z2 = zzapVar instanceof com.google.android.gms.internal.measurement.zzat;
        if (z2 && (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzah)) {
            return zzc(new com.google.android.gms.internal.measurement.zzah(zzapVar.zzh()), zzapVar2);
        }
        if (zzapVar instanceof com.google.android.gms.internal.measurement.zzaf) {
            return zzc(new com.google.android.gms.internal.measurement.zzah(zzapVar.zzh()), zzapVar2);
        }
        if (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzaf) {
            return zzc(zzapVar, new com.google.android.gms.internal.measurement.zzah(zzapVar2.zzh()));
        }
        if ((z2 || z) && (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzal)) {
            return zzc(zzapVar, new com.google.android.gms.internal.measurement.zzat(zzapVar2.zzi()));
        }
        if ((zzapVar instanceof com.google.android.gms.internal.measurement.zzal) && ((zzapVar2 instanceof com.google.android.gms.internal.measurement.zzat) || (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzah))) {
            return zzc(new com.google.android.gms.internal.measurement.zzat(zzapVar.zzi()), zzapVar2);
        }
        return false;
    }

    private static boolean zzd(com.google.android.gms.internal.measurement.zzap zzapVar, com.google.android.gms.internal.measurement.zzap zzapVar2) {
        if (zzapVar instanceof com.google.android.gms.internal.measurement.zzal) {
            zzapVar = new com.google.android.gms.internal.measurement.zzat(zzapVar.zzi());
        }
        if (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzal) {
            zzapVar2 = new com.google.android.gms.internal.measurement.zzat(zzapVar2.zzi());
        }
        if ((zzapVar instanceof com.google.android.gms.internal.measurement.zzat) && (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzat)) {
            return zzapVar.zzi().compareTo(zzapVar2.zzi()) < 0;
        }
        double dDoubleValue = zzapVar.zzh().doubleValue();
        double dDoubleValue2 = zzapVar2.zzh().doubleValue();
        return (java.lang.Double.isNaN(dDoubleValue) || java.lang.Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || java.lang.Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean zze(com.google.android.gms.internal.measurement.zzap zzapVar, com.google.android.gms.internal.measurement.zzap zzapVar2) {
        if (zzapVar instanceof com.google.android.gms.internal.measurement.zzal) {
            zzapVar = new com.google.android.gms.internal.measurement.zzat(zzapVar.zzi());
        }
        if (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzal) {
            zzapVar2 = new com.google.android.gms.internal.measurement.zzat(zzapVar2.zzi());
        }
        return (((zzapVar instanceof com.google.android.gms.internal.measurement.zzat) && (zzapVar2 instanceof com.google.android.gms.internal.measurement.zzat)) || !(java.lang.Double.isNaN(zzapVar.zzh().doubleValue()) || java.lang.Double.isNaN(zzapVar2.zzh().doubleValue()))) && !zzd(zzapVar2, zzapVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        boolean zZzc;
        boolean zZzc2;
        com.google.android.gms.internal.measurement.zzh.zzh(com.google.android.gms.internal.measurement.zzh.zze(str).name(), 2, list);
        com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
        com.google.android.gms.internal.measurement.zzap zzapVarZzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
        int iOrdinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zZzc2 = zzc(zzapVarZzb, zzapVarZzb2);
            } else if (iOrdinal == 42) {
                zZzc = zzd(zzapVarZzb, zzapVarZzb2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zZzc = zzd(zzapVarZzb2, zzapVarZzb);
                        break;
                    case 38:
                        zZzc = zze(zzapVarZzb2, zzapVarZzb);
                        break;
                    case 39:
                        zZzc = com.google.android.gms.internal.measurement.zzh.zzl(zzapVarZzb, zzapVarZzb2);
                        break;
                    case 40:
                        zZzc2 = com.google.android.gms.internal.measurement.zzh.zzl(zzapVarZzb, zzapVarZzb2);
                        break;
                    default:
                        return super.zzb(str);
                }
            } else {
                zZzc = zze(zzapVarZzb, zzapVarZzb2);
            }
            zZzc = !zZzc2;
        } else {
            zZzc = zzc(zzapVarZzb, zzapVarZzb2);
        }
        return zZzc ? com.google.android.gms.internal.measurement.zzap.zzk : com.google.android.gms.internal.measurement.zzap.zzl;
    }
}
