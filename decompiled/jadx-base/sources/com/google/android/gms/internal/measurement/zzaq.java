package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaq implements com.google.android.gms.internal.measurement.zzap {
    private final java.lang.String zza;
    private final java.util.ArrayList zzb;

    public zzaq(java.lang.String str, java.util.List list) {
        this.zza = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zzb = arrayList;
        arrayList.addAll(list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzaq)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaq zzaqVar = (com.google.android.gms.internal.measurement.zzaq) obj;
        java.lang.String str = this.zza;
        if (str == null ? zzaqVar.zza == null : str.equals(zzaqVar.zza)) {
            return this.zzb.equals(zzaqVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        return ((str != null ? str.hashCode() : 0) * 31) + this.zzb.hashCode();
    }

    public final java.lang.String zzb() {
        return this.zza;
    }

    public final java.util.ArrayList zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        throw new java.lang.IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
        throw new java.lang.IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
        throw new java.lang.IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
        throw new java.lang.IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
        return null;
    }
}
