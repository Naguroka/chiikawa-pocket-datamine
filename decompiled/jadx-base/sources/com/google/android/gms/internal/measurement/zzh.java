package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzh {
    public static double zza(double d) {
        if (java.lang.Double.isNaN(d)) {
            return 0.0d;
        }
        if (java.lang.Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * java.lang.Math.floor(java.lang.Math.abs(d));
    }

    public static int zzb(double d) {
        if (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * java.lang.Math.floor(java.lang.Math.abs(d))) % 4.294967296E9d);
    }

    public static int zzc(com.google.android.gms.internal.measurement.zzg zzgVar) {
        int iZzb = zzb(zzgVar.zzd("runtime.counter").zzh().doubleValue() + 1.0d);
        if (iZzb > 1000000) {
            throw new java.lang.IllegalStateException("Instructions allowed exceeded");
        }
        zzgVar.zzg("runtime.counter", new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(iZzb)));
        return iZzb;
    }

    public static long zzd(double d) {
        return ((long) zzb(d)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
    }

    public static com.google.android.gms.internal.measurement.zzbl zze(java.lang.String str) {
        com.google.android.gms.internal.measurement.zzbl zzblVarZza = null;
        if (str != null && !str.isEmpty()) {
            zzblVarZza = com.google.android.gms.internal.measurement.zzbl.zza(java.lang.Integer.parseInt(str));
        }
        if (zzblVarZza != null) {
            return zzblVarZza;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Unsupported commandId %s", str));
    }

    public static java.lang.Object zzf(com.google.android.gms.internal.measurement.zzap zzapVar) {
        if (com.google.android.gms.internal.measurement.zzap.zzg.equals(zzapVar)) {
            return null;
        }
        if (com.google.android.gms.internal.measurement.zzap.zzf.equals(zzapVar)) {
            return "";
        }
        if (zzapVar instanceof com.google.android.gms.internal.measurement.zzam) {
            return zzg((com.google.android.gms.internal.measurement.zzam) zzapVar);
        }
        if (!(zzapVar instanceof com.google.android.gms.internal.measurement.zzae)) {
            return !zzapVar.zzh().isNaN() ? zzapVar.zzh() : zzapVar.zzi();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((com.google.android.gms.internal.measurement.zzae) zzapVar).iterator();
        while (it.hasNext()) {
            java.lang.Object objZzf = zzf((com.google.android.gms.internal.measurement.zzap) it.next());
            if (objZzf != null) {
                arrayList.add(objZzf);
            }
        }
        return arrayList;
    }

    public static java.util.Map zzg(com.google.android.gms.internal.measurement.zzam zzamVar) {
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str : zzamVar.zzb()) {
            java.lang.Object objZzf = zzf(zzamVar.zzf(str));
            if (objZzf != null) {
                map.put(str, objZzf);
            }
        }
        return map;
    }

    public static void zzh(java.lang.String str, int i, java.util.List list) {
        if (list.size() != i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s operation requires %s parameters found %s", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(list.size())));
        }
    }

    public static void zzi(java.lang.String str, int i, java.util.List list) {
        if (list.size() < i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s operation requires at least %s parameters found %s", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(list.size())));
        }
    }

    public static void zzj(java.lang.String str, int i, java.util.List list) {
        if (list.size() > i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s operation requires at most %s parameters found %s", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(list.size())));
        }
    }

    public static boolean zzk(com.google.android.gms.internal.measurement.zzap zzapVar) {
        if (zzapVar == null) {
            return false;
        }
        java.lang.Double dZzh = zzapVar.zzh();
        return !dZzh.isNaN() && dZzh.doubleValue() >= 0.0d && dZzh.equals(java.lang.Double.valueOf(java.lang.Math.floor(dZzh.doubleValue())));
    }

    public static boolean zzl(com.google.android.gms.internal.measurement.zzap zzapVar, com.google.android.gms.internal.measurement.zzap zzapVar2) {
        if (!zzapVar.getClass().equals(zzapVar2.getClass())) {
            return false;
        }
        if ((zzapVar instanceof com.google.android.gms.internal.measurement.zzau) || (zzapVar instanceof com.google.android.gms.internal.measurement.zzan)) {
            return true;
        }
        if (zzapVar instanceof com.google.android.gms.internal.measurement.zzah) {
            if (java.lang.Double.isNaN(zzapVar.zzh().doubleValue()) || java.lang.Double.isNaN(zzapVar2.zzh().doubleValue())) {
                return false;
            }
            return zzapVar.zzh().equals(zzapVar2.zzh());
        }
        if (zzapVar instanceof com.google.android.gms.internal.measurement.zzat) {
            return zzapVar.zzi().equals(zzapVar2.zzi());
        }
        if (zzapVar instanceof com.google.android.gms.internal.measurement.zzaf) {
            return zzapVar.zzg().equals(zzapVar2.zzg());
        }
        return zzapVar == zzapVar2;
    }
}
