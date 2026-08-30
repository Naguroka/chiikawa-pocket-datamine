package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbxi extends com.google.android.gms.internal.ads.zzbwv {
    private final com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback zza;
    private final com.google.android.gms.internal.ads.zzbxj zzb;

    public zzbxi(com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, com.google.android.gms.internal.ads.zzbxj zzbxjVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() {
        com.google.android.gms.internal.ads.zzbxj zzbxjVar;
        com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbxjVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbxjVar);
    }
}
