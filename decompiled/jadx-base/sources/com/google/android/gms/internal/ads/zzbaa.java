package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbaa extends com.google.android.gms.internal.ads.zzbaj {
    private com.google.android.gms.ads.FullScreenContentCallback zza;

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzb() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzc() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zze() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzf() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    public final void zzg(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
    }
}
