package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzam implements com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzal {
    final java.util.Map zza = new java.util.HashMap();

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzam) {
            return this.zza.equals(((com.google.android.gms.internal.measurement.zzam) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.util.Map map = this.zza;
        if (!map.isEmpty()) {
            for (java.lang.String str : map.keySet()) {
                sb.append(java.lang.String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final java.util.List zzb() {
        return new java.util.ArrayList(this.zza.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        return "toString".equals(str) ? new com.google.android.gms.internal.measurement.zzat(toString()) : com.google.android.gms.internal.measurement.zzaj.zza(this, new com.google.android.gms.internal.measurement.zzat(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
        com.google.android.gms.internal.measurement.zzam zzamVar = new com.google.android.gms.internal.measurement.zzam();
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof com.google.android.gms.internal.measurement.zzal) {
                zzamVar.zza.put((java.lang.String) entry.getKey(), (com.google.android.gms.internal.measurement.zzap) entry.getValue());
            } else {
                zzamVar.zza.put((java.lang.String) entry.getKey(), ((com.google.android.gms.internal.measurement.zzap) entry.getValue()).zzd());
            }
        }
        return zzamVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final com.google.android.gms.internal.measurement.zzap zzf(java.lang.String str) {
        java.util.Map map = this.zza;
        return map.containsKey(str) ? (com.google.android.gms.internal.measurement.zzap) map.get(str) : zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
        return java.lang.Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
        return com.google.android.gms.internal.measurement.zzaj.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(java.lang.String str, com.google.android.gms.internal.measurement.zzap zzapVar) {
        if (zzapVar == null) {
            this.zza.remove(str);
        } else {
            this.zza.put(str, zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(java.lang.String str) {
        return this.zza.containsKey(str);
    }
}
