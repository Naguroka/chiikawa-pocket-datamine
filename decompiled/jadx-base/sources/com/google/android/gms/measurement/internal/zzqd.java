package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzqd {
    final java.lang.String zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final long zzd;
    final java.lang.Object zze;

    zzqd(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
        this.zze = obj;
    }
}
