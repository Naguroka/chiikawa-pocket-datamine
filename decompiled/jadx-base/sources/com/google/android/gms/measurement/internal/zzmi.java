package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmi implements java.lang.Runnable {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmo zze;

    zzmi(com.google.android.gms.measurement.internal.zzmo zzmoVar, android.os.Bundle bundle, com.google.android.gms.measurement.internal.zzmh zzmhVar, com.google.android.gms.measurement.internal.zzmh zzmhVar2, long j) {
        this.zza = bundle;
        this.zzb = zzmhVar;
        this.zzc = zzmhVar2;
        this.zzd = j;
        this.zze = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzmo.zzq(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
