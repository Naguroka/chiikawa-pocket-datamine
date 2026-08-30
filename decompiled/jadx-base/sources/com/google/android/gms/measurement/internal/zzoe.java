package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzoe implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zza;
    final /* synthetic */ java.lang.Runnable zzb;

    zzoe(com.google.android.gms.measurement.internal.zzog zzogVar, com.google.android.gms.measurement.internal.zzpv zzpvVar, java.lang.Runnable runnable) {
        this.zza = zzpvVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        zzpvVar.zzL();
        zzpvVar.zzK(this.zzb);
        zzpvVar.zzat();
    }
}
