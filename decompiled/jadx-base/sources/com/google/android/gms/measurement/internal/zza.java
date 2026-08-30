package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zza implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzd zzc;

    zza(com.google.android.gms.measurement.internal.zzd zzdVar, java.lang.String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzd.zza(this.zzc, this.zza, this.zzb);
    }
}
