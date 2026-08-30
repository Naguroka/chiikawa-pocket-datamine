package com.google.ads.mediation.facebook;

/* JADX INFO: loaded from: classes4.dex */
public class FacebookRewardedInterstitialAd extends com.google.ads.mediation.facebook.FacebookRewardedAd {
    public FacebookRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.facebook.MetaFactory metaFactory) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, metaFactory);
    }

    @Override // com.google.ads.mediation.facebook.FacebookRewardedAd
    com.facebook.ads.AdExperienceType getAdExperienceType() {
        return com.facebook.ads.AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL;
    }
}
