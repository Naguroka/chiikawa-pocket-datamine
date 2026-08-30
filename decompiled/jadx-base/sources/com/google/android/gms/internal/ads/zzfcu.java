package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfcu implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfcv zza;
    final /* synthetic */ int zzb;

    zzfcu(com.google.android.gms.internal.ads.zzfcv zzfcvVar, int i) {
        this.zzb = i;
        this.zza = zzfcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        int i = this.zzb;
        this.zza.zzb((java.lang.String) obj, i);
    }
}
