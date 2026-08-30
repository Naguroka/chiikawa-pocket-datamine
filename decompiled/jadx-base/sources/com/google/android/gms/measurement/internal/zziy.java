package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zziy implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zze;

    zziy(com.google.android.gms.measurement.internal.zzjp zzjpVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
        this.zze = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.zza;
        if (str == null) {
            com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zze;
            zzjpVar.zza.zzaj(this.zzb, null);
        } else {
            com.google.android.gms.measurement.internal.zzmh zzmhVar = new com.google.android.gms.measurement.internal.zzmh(this.zzc, str, this.zzd);
            com.google.android.gms.measurement.internal.zzjp zzjpVar2 = this.zze;
            zzjpVar2.zza.zzaj(this.zzb, zzmhVar);
        }
    }
}
