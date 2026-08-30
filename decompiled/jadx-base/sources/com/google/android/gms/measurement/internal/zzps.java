package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzps {
    final java.lang.String zza;
    long zzb;

    private zzps(com.google.android.gms.measurement.internal.zzpv zzpvVar, java.lang.String str) {
        this.zza = str;
        this.zzb = zzpvVar.zzaU().elapsedRealtime();
    }
}
