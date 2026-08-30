package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbf extends com.google.android.gms.ads.internal.client.zzcs {
    private final com.google.android.gms.ads.FullScreenContentCallback zza;

    public zzbf(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzb() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzc() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zze() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzct
    public final void zzf() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
