package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjn implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zzjn(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = bundle;
        this.zzc = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzc;
        zzjpVar.zza.zzL();
        return zzjpVar.zza.zzF(this.zza, this.zzb);
    }
}
