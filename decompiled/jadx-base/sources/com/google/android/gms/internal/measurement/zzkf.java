package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkf {

    @javax.annotation.Nullable
    final android.net.Uri zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final boolean zzd;
    final boolean zze;

    public zzkf(android.net.Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzkf(@javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable android.net.Uri uri, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, @javax.annotation.Nullable com.google.common.base.Function function) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z;
        this.zze = z3;
    }

    public final com.google.android.gms.internal.measurement.zzkf zza() {
        return new com.google.android.gms.internal.measurement.zzkf(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }

    public final com.google.android.gms.internal.measurement.zzkf zzb() {
        java.lang.String str = this.zzb;
        if (str.isEmpty()) {
            return new com.google.android.gms.internal.measurement.zzkf(null, this.zza, str, this.zzc, true, false, this.zze, false, null);
        }
        throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final com.google.android.gms.internal.measurement.zzki zzc(java.lang.String str, double d) {
        java.lang.Double dValueOf = java.lang.Double.valueOf(-3.0d);
        int i = com.google.android.gms.internal.measurement.zzki.zzc;
        return new com.google.android.gms.internal.measurement.zzkd(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final com.google.android.gms.internal.measurement.zzki zzd(java.lang.String str, long j) {
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        int i = com.google.android.gms.internal.measurement.zzki.zzc;
        return new com.google.android.gms.internal.measurement.zzkb(this, str, lValueOf, true);
    }

    public final com.google.android.gms.internal.measurement.zzki zze(java.lang.String str, java.lang.String str2) {
        int i = com.google.android.gms.internal.measurement.zzki.zzc;
        return new com.google.android.gms.internal.measurement.zzke(this, str, str2, true);
    }

    public final com.google.android.gms.internal.measurement.zzki zzf(java.lang.String str, boolean z) {
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        int i = com.google.android.gms.internal.measurement.zzki.zzc;
        return new com.google.android.gms.internal.measurement.zzkc(this, str, boolValueOf, true);
    }
}
