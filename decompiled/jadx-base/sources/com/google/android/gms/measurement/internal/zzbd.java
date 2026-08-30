package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbd {
    final java.lang.String zza;
    final java.lang.String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final java.lang.Long zzh;
    final java.lang.Long zzi;
    final java.lang.Long zzj;
    final java.lang.Boolean zzk;

    zzbd(java.lang.String str, java.lang.String str2, long j, long j2, long j3, long j4, long j5, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Boolean bool) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j2 >= 0);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j3 >= 0);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j5 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = l;
        this.zzi = l2;
        this.zzj = l3;
        this.zzk = bool;
    }

    final com.google.android.gms.measurement.internal.zzbd zza(java.lang.Long l, java.lang.Long l2, java.lang.Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new com.google.android.gms.measurement.internal.zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l, l2, bool);
    }

    final com.google.android.gms.measurement.internal.zzbd zzb(long j, long j2) {
        return new com.google.android.gms.measurement.internal.zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j, java.lang.Long.valueOf(j2), this.zzi, this.zzj, this.zzk);
    }

    final com.google.android.gms.measurement.internal.zzbd zzc(long j) {
        return new com.google.android.gms.measurement.internal.zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
