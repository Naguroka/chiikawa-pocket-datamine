package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpw zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zzb;

    zzpk(com.google.android.gms.measurement.internal.zzpv zzpvVar, com.google.android.gms.measurement.internal.zzpw zzpwVar) {
        this.zza = zzpwVar;
        this.zzb = zzpvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzb;
        com.google.android.gms.measurement.internal.zzpv.zzH(zzpvVar, this.zza);
        zzpvVar.zzam();
    }
}
