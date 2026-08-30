package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbib implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.admanager.AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbic zzc;

    zzbib(com.google.android.gms.internal.ads.zzbic zzbicVar, com.google.android.gms.ads.admanager.AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbyVar;
        this.zzc = zzbicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zza.zzb(this.zzb)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not bind.");
            return;
        }
        com.google.android.gms.internal.ads.zzbic zzbicVar = this.zzc;
        zzbicVar.zza.onAdManagerAdViewLoaded(this.zza);
    }
}
