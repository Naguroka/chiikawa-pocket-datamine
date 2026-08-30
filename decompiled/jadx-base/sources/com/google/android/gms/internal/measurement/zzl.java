package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzl extends com.google.android.gms.internal.measurement.zzam {
    private final com.google.android.gms.internal.measurement.zzab zzb;

    public zzl(com.google.android.gms.internal.measurement.zzab zzabVar) {
        this.zzb = zzabVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    @Override // com.google.android.gms.internal.measurement.zzam, com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        byte b;
        switch (str) {
            case "getEventName":
                b = 0;
                break;
            case "getTimestamp":
                b = 3;
                break;
            case "getParamValue":
                b = 1;
                break;
            case "getParams":
                b = 2;
                break;
            case "setParamValue":
                b = 5;
                break;
            case "setEventName":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            com.google.android.gms.internal.measurement.zzh.zzh("getEventName", 0, list);
            return new com.google.android.gms.internal.measurement.zzat(this.zzb.zzb().zze());
        }
        if (b == 1) {
            com.google.android.gms.internal.measurement.zzh.zzh("getParamValue", 1, list);
            return com.google.android.gms.internal.measurement.zzi.zzb(this.zzb.zzb().zzc(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi()));
        }
        if (b == 2) {
            com.google.android.gms.internal.measurement.zzh.zzh("getParams", 0, list);
            java.util.Map mapZzf = this.zzb.zzb().zzf();
            com.google.android.gms.internal.measurement.zzam zzamVar = new com.google.android.gms.internal.measurement.zzam();
            for (java.lang.String str2 : mapZzf.keySet()) {
                zzamVar.zzr(str2, com.google.android.gms.internal.measurement.zzi.zzb(mapZzf.get(str2)));
            }
            return zzamVar;
        }
        if (b == 3) {
            com.google.android.gms.internal.measurement.zzh.zzh("getTimestamp", 0, list);
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(this.zzb.zzb().zza()));
        }
        if (b != 4) {
            if (b != 5) {
                return super.zzcz(str, zzgVar, list);
            }
            com.google.android.gms.internal.measurement.zzh.zzh("setParamValue", 2, list);
            java.lang.String strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
            com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
            this.zzb.zzb().zzh(strZzi, com.google.android.gms.internal.measurement.zzh.zzf(zzapVarZzb));
            return zzapVarZzb;
        }
        com.google.android.gms.internal.measurement.zzh.zzh("setEventName", 1, list);
        com.google.android.gms.internal.measurement.zzap zzapVarZzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0));
        if (zzf.equals(zzapVarZzb2) || zzg.equals(zzapVarZzb2)) {
            throw new java.lang.IllegalArgumentException("Illegal event name");
        }
        this.zzb.zzb().zzg(zzapVarZzb2.zzi());
        return new com.google.android.gms.internal.measurement.zzat(zzapVarZzb2.zzi());
    }
}
