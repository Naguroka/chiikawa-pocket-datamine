package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzai implements com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzal {
    protected final java.lang.String zzd;
    protected final java.util.Map zze = new java.util.HashMap();

    public zzai(java.lang.String str) {
        this.zzd = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzai)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzai zzaiVar = (com.google.android.gms.internal.measurement.zzai) obj;
        java.lang.String str = this.zzd;
        if (str != null) {
            return str.equals(zzaiVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zzd;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list);

    public final java.lang.String zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        return "toString".equals(str) ? new com.google.android.gms.internal.measurement.zzat(this.zzd) : com.google.android.gms.internal.measurement.zzaj.zza(this, new com.google.android.gms.internal.measurement.zzat(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public com.google.android.gms.internal.measurement.zzap zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final com.google.android.gms.internal.measurement.zzap zzf(java.lang.String str) {
        java.util.Map map = this.zze;
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
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
        return com.google.android.gms.internal.measurement.zzaj.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(java.lang.String str, com.google.android.gms.internal.measurement.zzap zzapVar) {
        if (zzapVar == null) {
            this.zze.remove(str);
        } else {
            this.zze.put(str, zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(java.lang.String str) {
        return this.zze.containsKey(str);
    }
}
