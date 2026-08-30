package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzau implements com.google.android.gms.internal.measurement.zzap {
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof com.google.android.gms.internal.measurement.zzau;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        throw new java.lang.IllegalStateException(java.lang.String.format("Undefined has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
        return com.google.android.gms.internal.measurement.zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
        return java.lang.Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
        return com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
        return null;
    }
}
