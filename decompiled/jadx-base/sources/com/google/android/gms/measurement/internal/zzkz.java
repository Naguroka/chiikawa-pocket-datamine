package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzkz implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ android.os.Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ java.lang.String zzh;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzi;

    zzkz(com.google.android.gms.measurement.internal.zzlw zzlwVar, java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, java.lang.String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = bundle;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = str3;
        this.zzi = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zzT(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
