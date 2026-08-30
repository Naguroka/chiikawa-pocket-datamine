package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzc implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzd zzb;

    zzc(com.google.android.gms.measurement.internal.zzd zzdVar, long j) {
        this.zza = j;
        this.zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzj(this.zza);
    }
}
