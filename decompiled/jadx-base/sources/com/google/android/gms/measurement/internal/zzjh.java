package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjh implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzb;

    zzjh(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzrVar;
        this.zzb = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzb;
        zzjpVar.zza.zzL();
        com.google.android.gms.measurement.internal.zzpv zzpvVar = zzjpVar.zza;
        zzpvVar.zzaX().zzg();
        zzpvVar.zzM();
        com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzrVar.zza);
        zzpvVar.zzak(zzrVar);
        zzpvVar.zzai(zzrVar);
    }
}
