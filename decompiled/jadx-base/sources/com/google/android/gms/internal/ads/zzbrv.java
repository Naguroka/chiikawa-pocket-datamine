package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbrv implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrw zzb;

    zzbrv(com.google.android.gms.internal.ads.zzbrw zzbrwVar, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = zzbrwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.zzj();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzb.zza, this.zza, true, null);
    }
}
