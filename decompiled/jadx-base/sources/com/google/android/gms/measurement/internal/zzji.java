package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzji implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzb;

    zzji(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzrVar;
        this.zzb = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzb;
        zzjpVar.zza.zzL();
        return new com.google.android.gms.measurement.internal.zzap(zzjpVar.zza.zzd(this.zza.zza));
    }
}
