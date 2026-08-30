package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdvn extends com.google.android.gms.ads.rewarded.RewardedAdLoadCallback {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdvs zzc;

    zzdvn(com.google.android.gms.internal.ads.zzdvs zzdvsVar, java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdvsVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        this.zzc.zzm(com.google.android.gms.internal.ads.zzdvs.zzl(loadAdError), this.zzb);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(com.google.android.gms.ads.rewarded.RewardedAd rewardedAd) {
        java.lang.String str = this.zzb;
        this.zzc.zzg(this.zza, rewardedAd, str);
    }
}
