package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public enum AdExperienceType {
    AD_EXPERIENCE_TYPE_REWARDED("ad_experience_config_rewarded"),
    AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL("ad_experience_config_rewarded_interstitial"),
    AD_EXPERIENCE_TYPE_INTERSTITIAL("ad_experience_config_interstitial");

    private java.lang.String adExperienceType;

    AdExperienceType(java.lang.String str) {
        this.adExperienceType = str;
    }

    public java.lang.String getAdExperienceType() {
        return this.adExperienceType;
    }
}
