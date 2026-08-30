package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbxc extends com.google.android.gms.internal.ads.zzbwv {
    private final com.google.android.gms.ads.rewarded.RewardedAdLoadCallback zza;
    private final com.google.android.gms.ads.rewarded.RewardedAd zzb;

    public zzbxc(com.google.android.gms.ads.rewarded.RewardedAdLoadCallback rewardedAdLoadCallback, com.google.android.gms.ads.rewarded.RewardedAd rewardedAd) {
        this.zza = rewardedAdLoadCallback;
        this.zzb = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() {
        com.google.android.gms.ads.rewarded.RewardedAdLoadCallback rewardedAdLoadCallback = this.zza;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.zzb);
        }
    }
}
