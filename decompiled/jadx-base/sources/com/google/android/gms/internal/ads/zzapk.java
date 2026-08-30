package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzapk implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzapm zzc;

    zzapk(com.google.android.gms.internal.ads.zzapm zzapmVar, java.lang.String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzapmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        com.google.android.gms.internal.ads.zzapm zzapmVar = this.zzc;
        zzapmVar.zza.zzb(zzapmVar.toString());
    }
}
