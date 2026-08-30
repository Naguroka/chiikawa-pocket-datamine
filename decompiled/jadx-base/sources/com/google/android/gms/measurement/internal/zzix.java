package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzix implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzb;

    zzix(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzrVar;
        this.zzb = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzb;
        zzjpVar.zza.zzL();
        zzjpVar.zza.zzab(this.zza);
    }
}
