package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzla implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.Object zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zze;

    zzla(com.google.android.gms.measurement.internal.zzlw zzlwVar, java.lang.String str, java.lang.String str2, java.lang.Object obj, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j;
        this.zze = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzan(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
