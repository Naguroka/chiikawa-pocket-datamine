package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzi {
    public static com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zziz zzizVar) {
        if (zzizVar == null) {
            return com.google.android.gms.internal.measurement.zzap.zzf;
        }
        int iZzj = zzizVar.zzj() - 1;
        if (iZzj == 1) {
            return zzizVar.zzi() ? new com.google.android.gms.internal.measurement.zzat(zzizVar.zzd()) : com.google.android.gms.internal.measurement.zzap.zzm;
        }
        if (iZzj == 2) {
            return zzizVar.zzh() ? new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzizVar.zza())) : new com.google.android.gms.internal.measurement.zzah(null);
        }
        if (iZzj == 3) {
            return zzizVar.zzg() ? new com.google.android.gms.internal.measurement.zzaf(java.lang.Boolean.valueOf(zzizVar.zzf())) : new com.google.android.gms.internal.measurement.zzaf(null);
        }
        if (iZzj != 4) {
            throw new java.lang.IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        java.util.List listZze = zzizVar.zze();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listZze.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((com.google.android.gms.internal.measurement.zziz) it.next()));
        }
        return new com.google.android.gms.internal.measurement.zzaq(zzizVar.zzc(), arrayList);
    }

    public static com.google.android.gms.internal.measurement.zzap zzb(java.lang.Object obj) {
        if (obj == null) {
            return com.google.android.gms.internal.measurement.zzap.zzg;
        }
        if (obj instanceof java.lang.String) {
            return new com.google.android.gms.internal.measurement.zzat((java.lang.String) obj);
        }
        if (obj instanceof java.lang.Double) {
            return new com.google.android.gms.internal.measurement.zzah((java.lang.Double) obj);
        }
        if (obj instanceof java.lang.Long) {
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(((java.lang.Long) obj).doubleValue()));
        }
        if (obj instanceof java.lang.Integer) {
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(((java.lang.Integer) obj).doubleValue()));
        }
        if (obj instanceof java.lang.Boolean) {
            return new com.google.android.gms.internal.measurement.zzaf((java.lang.Boolean) obj);
        }
        if (!(obj instanceof java.util.Map)) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Invalid value type");
            }
            com.google.android.gms.internal.measurement.zzae zzaeVar = new com.google.android.gms.internal.measurement.zzae();
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zzaeVar.zzq(zzaeVar.zzc(), zzb(it.next()));
            }
            return zzaeVar;
        }
        com.google.android.gms.internal.measurement.zzam zzamVar = new com.google.android.gms.internal.measurement.zzam();
        java.util.Map map = (java.util.Map) obj;
        for (java.lang.Object string : map.keySet()) {
            com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzb(map.get(string));
            if (string != null) {
                if (!(string instanceof java.lang.String)) {
                    string = string.toString();
                }
                zzamVar.zzr((java.lang.String) string, zzapVarZzb);
            }
        }
        return zzamVar;
    }
}
