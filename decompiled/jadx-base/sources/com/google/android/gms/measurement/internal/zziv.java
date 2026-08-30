package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zziv implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzb;

    zziv(com.google.android.gms.measurement.internal.zzjp zzjpVar, java.lang.String str) {
        this.zza = str;
        this.zzb = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzb;
        zzjpVar.zza.zzL();
        return zzjpVar.zza.zzj().zzE(this.zza);
    }
}
