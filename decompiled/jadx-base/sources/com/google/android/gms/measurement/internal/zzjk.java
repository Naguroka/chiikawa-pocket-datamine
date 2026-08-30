package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbh zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zzjk(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzbh zzbhVar, java.lang.String str) {
        this.zza = zzbhVar;
        this.zzb = str;
        this.zzc = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzc;
        zzjpVar.zza.zzL();
        zzjpVar.zza.zzT(this.zza, this.zzb);
    }
}
