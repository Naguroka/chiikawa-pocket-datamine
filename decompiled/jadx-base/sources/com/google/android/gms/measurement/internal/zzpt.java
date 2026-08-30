package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpt {
    private final com.google.android.gms.measurement.internal.zzpv zza;
    private int zzb = 1;
    private long zzc = zzd();

    public zzpt(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        this.zza = zzpvVar;
    }

    private final long zzd() {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpvVar);
        long jLongValue = ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzu.zza(null)).longValue();
        long jLongValue2 = ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzv.zza(null)).longValue();
        for (int i = 1; i < this.zzb; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return zzpvVar.zzaU().currentTimeMillis() + java.lang.Math.min(jLongValue, jLongValue2);
    }

    public final void zzb() {
        this.zzb++;
        this.zzc = zzd();
    }

    public final boolean zzc() {
        return this.zza.zzaU().currentTimeMillis() >= this.zzc;
    }
}
