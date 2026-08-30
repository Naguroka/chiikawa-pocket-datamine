package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmo zze;

    zzmj(com.google.android.gms.measurement.internal.zzmo zzmoVar, com.google.android.gms.measurement.internal.zzmh zzmhVar, com.google.android.gms.measurement.internal.zzmh zzmhVar2, long j, boolean z) {
        this.zza = zzmhVar;
        this.zzb = zzmhVar2;
        this.zzc = j;
        this.zzd = z;
        this.zze = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
