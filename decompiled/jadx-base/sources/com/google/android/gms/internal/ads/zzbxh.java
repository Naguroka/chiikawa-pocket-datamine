package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbxh extends com.google.android.gms.internal.ads.zzbwr {
    private com.google.android.gms.ads.FullScreenContentCallback zza;
    private com.google.android.gms.ads.OnUserEarnedRewardListener zzb;

    public final void zzb(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
    }

    public final void zzc(com.google.android.gms.ads.OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzb = onUserEarnedRewardListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zze() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzf() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzg() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzh(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzj() {
        com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback = this.zza;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzk(com.google.android.gms.internal.ads.zzbwm zzbwmVar) {
        com.google.android.gms.ads.OnUserEarnedRewardListener onUserEarnedRewardListener = this.zzb;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new com.google.android.gms.internal.ads.zzbwz(zzbwmVar));
        }
    }
}
