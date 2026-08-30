package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends com.google.android.gms.internal.measurement.zzai {
    final java.util.Map zza;
    private final com.google.android.gms.internal.measurement.zzj zzb;

    public zzw(com.google.android.gms.internal.measurement.zzj zzjVar) {
        super("require");
        this.zza = new java.util.HashMap();
        this.zzb = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzap zzapVar;
        com.google.android.gms.internal.measurement.zzh.zzh("require", 1, list);
        java.lang.String strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
        java.util.Map map = this.zza;
        if (map.containsKey(strZzi)) {
            return (com.google.android.gms.internal.measurement.zzap) map.get(strZzi);
        }
        java.util.Map map2 = this.zzb.zza;
        if (map2.containsKey(strZzi)) {
            try {
                zzapVar = (com.google.android.gms.internal.measurement.zzap) ((java.util.concurrent.Callable) map2.get(strZzi)).call();
            } catch (java.lang.Exception unused) {
                throw new java.lang.IllegalStateException("Failed to create API implementation: ".concat(java.lang.String.valueOf(strZzi)));
            }
        } else {
            zzapVar = com.google.android.gms.internal.measurement.zzap.zzf;
        }
        if (zzapVar instanceof com.google.android.gms.internal.measurement.zzai) {
            this.zza.put(strZzi, (com.google.android.gms.internal.measurement.zzai) zzapVar);
        }
        return zzapVar;
    }
}
