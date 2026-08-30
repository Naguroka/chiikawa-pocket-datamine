package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzoi implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzop zzb;

    zzoi(com.google.android.gms.measurement.internal.zzop zzopVar, long j) {
        this.zza = j;
        this.zzb = zzopVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzop.zzj(this.zzb, this.zza);
    }
}
