package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpr {
    com.google.android.gms.internal.measurement.zzhx zza;
    java.util.List zzb;
    java.util.List zzc;
    long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zze;

    /* synthetic */ zzpr(com.google.android.gms.measurement.internal.zzpv zzpvVar, com.google.android.gms.measurement.internal.zzpu zzpuVar) {
        this.zze = zzpvVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzhm zzhmVar) {
        return ((zzhmVar.zzd() / 1000) / 60) / 60;
    }

    public final boolean zza(long j, com.google.android.gms.internal.measurement.zzhm zzhmVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhmVar);
        if (this.zzc == null) {
            this.zzc = new java.util.ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new java.util.ArrayList();
        }
        if (!this.zzc.isEmpty() && zzb((com.google.android.gms.internal.measurement.zzhm) this.zzc.get(0)) != zzb(zzhmVar)) {
            return false;
        }
        long jZzcf = this.zzd + ((long) zzhmVar.zzcf());
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zze;
        if (!zzpvVar.zzi().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbq)) {
            zzpvVar.zzi();
            if (jZzcf >= com.google.android.gms.measurement.internal.zzam.zzG()) {
                return false;
            }
        } else if (!this.zzc.isEmpty()) {
            zzpvVar.zzi();
            if (jZzcf >= com.google.android.gms.measurement.internal.zzam.zzG()) {
                return false;
            }
        }
        this.zzd = jZzcf;
        this.zzc.add(zzhmVar);
        this.zzb.add(java.lang.Long.valueOf(j));
        int size = this.zzc.size();
        zzpvVar.zzi();
        return size < java.lang.Math.max(1, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzgi.zzj.zza(null)).intValue());
    }
}
