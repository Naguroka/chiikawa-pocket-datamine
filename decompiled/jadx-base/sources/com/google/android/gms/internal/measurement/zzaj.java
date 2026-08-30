package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzaj {
    public static com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzal zzalVar, com.google.android.gms.internal.measurement.zzap zzapVar, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        if (zzalVar.zzt(zzapVar.zzi())) {
            com.google.android.gms.internal.measurement.zzap zzapVarZzf = zzalVar.zzf(zzapVar.zzi());
            if (zzapVarZzf instanceof com.google.android.gms.internal.measurement.zzai) {
                return ((com.google.android.gms.internal.measurement.zzai) zzapVarZzf).zza(zzgVar, list);
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not a function", zzapVar.zzi()));
        }
        if (!"hasOwnProperty".equals(zzapVar.zzi())) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Object has no function %s", zzapVar.zzi()));
        }
        com.google.android.gms.internal.measurement.zzh.zzh("hasOwnProperty", 1, list);
        return zzalVar.zzt(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi()) ? com.google.android.gms.internal.measurement.zzap.zzk : com.google.android.gms.internal.measurement.zzap.zzl;
    }

    public static java.util.Iterator zzb(java.util.Map map) {
        return new com.google.android.gms.internal.measurement.zzak(map.keySet().iterator());
    }
}
