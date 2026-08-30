package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbh zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zzjj(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzbh zzbhVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzbhVar;
        this.zzb = zzrVar;
        this.zzc = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzbh zzbhVar = this.zza;
        com.google.android.gms.measurement.internal.zzr zzrVar = this.zzb;
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzc;
        zzjpVar.zzJ(zzjpVar.zzb(zzbhVar, zzrVar), zzrVar);
    }
}
