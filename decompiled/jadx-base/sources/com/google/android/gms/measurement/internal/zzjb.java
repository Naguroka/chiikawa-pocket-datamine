package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjb implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzd;

    zzjb(com.google.android.gms.measurement.internal.zzjp zzjpVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzd;
        zzjpVar.zza.zzL();
        return zzjpVar.zza.zzj().zzF(this.zza, this.zzb, this.zzc);
    }
}
