package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzax {
    final java.util.Map zza = new java.util.HashMap();
    final com.google.android.gms.internal.measurement.zzbj zzb = new com.google.android.gms.internal.measurement.zzbj();

    public zzax() {
        zzb(new com.google.android.gms.internal.measurement.zzav());
        zzb(new com.google.android.gms.internal.measurement.zzay());
        zzb(new com.google.android.gms.internal.measurement.zzaz());
        zzb(new com.google.android.gms.internal.measurement.zzbc());
        zzb(new com.google.android.gms.internal.measurement.zzbh());
        zzb(new com.google.android.gms.internal.measurement.zzbi());
        zzb(new com.google.android.gms.internal.measurement.zzbk());
    }

    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg zzgVar, com.google.android.gms.internal.measurement.zzap zzapVar) {
        com.google.android.gms.internal.measurement.zzh.zzc(zzgVar);
        if (!(zzapVar instanceof com.google.android.gms.internal.measurement.zzaq)) {
            return zzapVar;
        }
        com.google.android.gms.internal.measurement.zzaq zzaqVar = (com.google.android.gms.internal.measurement.zzaq) zzapVar;
        java.util.ArrayList arrayListZzc = zzaqVar.zzc();
        java.lang.String strZzb = zzaqVar.zzb();
        java.util.Map map = this.zza;
        return (map.containsKey(strZzb) ? (com.google.android.gms.internal.measurement.zzaw) map.get(strZzb) : this.zzb).zza(strZzb, zzgVar, arrayListZzc);
    }

    final void zzb(com.google.android.gms.internal.measurement.zzaw zzawVar) {
        java.util.Iterator it = zzawVar.zza.iterator();
        while (it.hasNext()) {
            this.zza.put(((com.google.android.gms.internal.measurement.zzbl) it.next()).zzb().toString(), zzawVar);
        }
    }
}
