package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzag implements com.google.android.gms.internal.measurement.zzap {
    private final com.google.android.gms.internal.measurement.zzap zza;
    private final java.lang.String zzb;

    public zzag() {
        this.zza = zzf;
        this.zzb = "return";
    }

    public zzag(java.lang.String str) {
        this.zza = zzf;
        this.zzb = str;
    }

    public zzag(java.lang.String str, com.google.android.gms.internal.measurement.zzap zzapVar) {
        this.zza = zzapVar;
        this.zzb = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzag)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzag zzagVar = (com.google.android.gms.internal.measurement.zzag) obj;
        return this.zzb.equals(zzagVar.zzb) && this.zza.equals(zzagVar.zza);
    }

    public final int hashCode() {
        return (this.zzb.hashCode() * 31) + this.zza.hashCode();
    }

    public final com.google.android.gms.internal.measurement.zzap zzb() {
        return this.zza;
    }

    public final java.lang.String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        throw new java.lang.IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
        return new com.google.android.gms.internal.measurement.zzag(this.zzb, this.zza.zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
        throw new java.lang.IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
        throw new java.lang.IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
        throw new java.lang.IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
        return null;
    }
}
