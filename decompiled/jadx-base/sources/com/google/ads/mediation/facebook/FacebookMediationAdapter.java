package com.google.ads.mediation.facebook;

/* JADX INFO: loaded from: classes4.dex */
public class FacebookMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final java.lang.String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final java.lang.String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final java.lang.String KEY_ID = "id";
    public static final java.lang.String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final java.lang.String PLACEMENT_PARAMETER = "pubid";
    public static final java.lang.String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final java.lang.String TAG = "FacebookMediationAdapter";
    private com.google.ads.mediation.facebook.rtb.FacebookRtbBannerAd banner;
    private com.google.ads.mediation.facebook.rtb.FacebookRtbInterstitialAd interstitial;
    private final com.google.ads.mediation.facebook.MetaFactory metaFactory;
    private com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd nativeAd;
    private com.google.ads.mediation.facebook.FacebookRewardedAd rewardedAd;
    private com.google.ads.mediation.facebook.FacebookRewardedInterstitialAd rewardedInterstitialAd;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public FacebookMediationAdapter() {
        this.metaFactory = new com.google.ads.mediation.facebook.MetaFactory();
    }

    FacebookMediationAdapter(com.google.ads.mediation.facebook.MetaFactory metaFactory) {
        this.metaFactory = metaFactory;
    }

    public static com.google.android.gms.ads.AdError getAdError(com.facebook.ads.AdError adError) {
        return new com.google.android.gms.ads.AdError(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads");
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        java.lang.String adapterVersion = com.google.ads.mediation.facebook.FacebookAdapterUtils.getAdapterVersion();
        java.lang.String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length >= 4) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(strArrSplit[0]), java.lang.Integer.parseInt(strArrSplit[1]), (java.lang.Integer.parseInt(strArrSplit[2]) * 100) + java.lang.Integer.parseInt(strArrSplit[3]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected adapter version format: %s.Returning 0.0.0 for adapter version.", adapterVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        java.lang.String sdkVersion = com.google.ads.mediation.facebook.FacebookSdkWrapper.getSdkVersion();
        java.lang.String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(strArrSplit[0]), java.lang.Integer.parseInt(strArrSplit[1]), java.lang.Integer.parseInt(strArrSplit[2]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected SDK version format: %s.Returning 0.0.0 for SDK version.", sdkVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, final com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.google.android.gms.ads.mediation.MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String placementID = getPlacementID(it.next().getServerParameters());
            if (!android.text.TextUtils.isEmpty(placementID)) {
                arrayList.add(placementID);
            }
        }
        if (arrayList.isEmpty()) {
            initializationCompleteCallback.onInitializationFailed("Initialization failed. No placement IDs found.");
        } else {
            com.google.ads.mediation.facebook.FacebookInitializer.getInstance().initialize(context, arrayList, new com.google.ads.mediation.facebook.FacebookInitializer.Listener() { // from class: com.google.ads.mediation.facebook.FacebookMediationAdapter.1
                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeSuccess() {
                    initializationCompleteCallback.onInitializationSucceeded();
                }

                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    initializationCompleteCallback.onInitializationFailed(adError.getMessage());
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData rtbSignalData, com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(com.facebook.ads.BidderTokenProvider.getBidderToken(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.facebook.rtb.FacebookRtbBannerAd facebookRtbBannerAd = new com.google.ads.mediation.facebook.rtb.FacebookRtbBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, this.metaFactory);
        this.banner = facebookRtbBannerAd;
        facebookRtbBannerAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.facebook.rtb.FacebookRtbInterstitialAd facebookRtbInterstitialAd = new com.google.ads.mediation.facebook.rtb.FacebookRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.metaFactory);
        this.interstitial = facebookRtbInterstitialAd;
        facebookRtbInterstitialAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.facebook.FacebookRewardedAd facebookRewardedAd = new com.google.ads.mediation.facebook.FacebookRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.metaFactory);
        this.rewardedAd = facebookRewardedAd;
        facebookRewardedAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd facebookRtbNativeAd = new com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.metaFactory);
        this.nativeAd = facebookRtbNativeAd;
        facebookRtbNativeAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.facebook.FacebookRewardedInterstitialAd facebookRewardedInterstitialAd = new com.google.ads.mediation.facebook.FacebookRewardedInterstitialAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.metaFactory);
        this.rewardedInterstitialAd = facebookRewardedInterstitialAd;
        facebookRewardedInterstitialAd.render();
    }

    public static java.lang.String getPlacementID(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(RTB_PLACEMENT_PARAMETER);
        return string == null ? bundle.getString("pubid") : string;
    }

    public static void setMixedAudience(com.google.android.gms.ads.mediation.MediationAdConfiguration mediationAdConfiguration) {
        if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 1) {
            com.facebook.ads.AdSettings.setMixedAudience(true);
        } else if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 0) {
            com.facebook.ads.AdSettings.setMixedAudience(false);
        }
    }
}
