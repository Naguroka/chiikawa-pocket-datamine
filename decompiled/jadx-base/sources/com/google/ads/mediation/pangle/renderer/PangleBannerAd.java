package com.google.ads.mediation.pangle.renderer;

/* JADX INFO: loaded from: classes4.dex */
public class PangleBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener {
    public static final java.lang.String ERROR_MESSAGE_BANNER_SIZE_MISMATCH = "Failed to request banner ad from Pangle. Invalid banner size.";
    private final com.google.android.gms.ads.mediation.MediationBannerAdConfiguration adConfiguration;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> adLoadCallback;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback bannerAdCallback;
    private final com.google.ads.mediation.pangle.PangleFactory pangleFactory;
    private final com.google.ads.mediation.pangle.PangleInitializer pangleInitializer;
    private final com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig;
    private final com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper;
    android.widget.FrameLayout wrappedAdView;

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    public PangleBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.pangle.PangleInitializer pangleInitializer, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PangleFactory pangleFactory, com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig) {
        this.adConfiguration = mediationBannerAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.pangleInitializer = pangleInitializer;
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = pangleFactory;
        this.panglePrivacyConfig = panglePrivacyConfig;
    }

    public void render() {
        this.panglePrivacyConfig.setCoppa(this.adConfiguration.taggedForChildDirectedTreatment());
        android.os.Bundle serverParameters = this.adConfiguration.getServerParameters();
        final java.lang.String string = serverParameters.getString(com.google.ads.mediation.pangle.PangleConstants.PLACEMENT_ID);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adErrorCreateAdapterError = com.google.ads.mediation.pangle.PangleConstants.createAdapterError(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            android.util.Log.e(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.adLoadCallback.onFailure(adErrorCreateAdapterError);
        } else {
            final java.lang.String bidResponse = this.adConfiguration.getBidResponse();
            final android.content.Context context = this.adConfiguration.getContext();
            this.pangleInitializer.initialize(context, serverParameters.getString(com.google.ads.mediation.pangle.PangleConstants.APP_ID), new com.google.ads.mediation.pangle.PangleInitializer.Listener() { // from class: com.google.ads.mediation.pangle.renderer.PangleBannerAd.1
                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeSuccess() {
                    com.google.android.gms.ads.AdSize adSizeFindClosestSize = com.google.android.gms.ads.MediationUtils.findClosestSize(context, com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.adConfiguration.getAdSize(), com.google.ads.mediation.pangle.renderer.PangleBannerAd.getSupportedBannerSizes());
                    if (adSizeFindClosestSize == null) {
                        com.google.android.gms.ads.AdError adErrorCreateAdapterError2 = com.google.ads.mediation.pangle.PangleConstants.createAdapterError(102, com.google.ads.mediation.pangle.renderer.PangleBannerAd.ERROR_MESSAGE_BANNER_SIZE_MISMATCH);
                        android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adErrorCreateAdapterError2.toString());
                        com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.adLoadCallback.onFailure(adErrorCreateAdapterError2);
                    } else {
                        com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.wrappedAdView = new android.widget.FrameLayout(context);
                        com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest pAGBannerRequestCreatePagBannerRequest = com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.pangleFactory.createPagBannerRequest(new com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight()));
                        pAGBannerRequestCreatePagBannerRequest.setAdString(bidResponse);
                        com.google.ads.mediation.pangle.PangleRequestHelper.setWatermarkString(pAGBannerRequestCreatePagBannerRequest, bidResponse, com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.adConfiguration);
                        com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.pangleSdkWrapper.loadBannerAd(string, pAGBannerRequestCreatePagBannerRequest, new com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleBannerAd.1.1
                            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
                            public void onError(int i, java.lang.String str) {
                                com.google.android.gms.ads.AdError adErrorCreateSdkError = com.google.ads.mediation.pangle.PangleConstants.createSdkError(i, str);
                                android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adErrorCreateSdkError.toString());
                                com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.adLoadCallback.onFailure(adErrorCreateSdkError);
                            }

                            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                            public void onAdLoaded(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd pAGBannerAd) {
                                pAGBannerAd.setAdInteractionListener(com.google.ads.mediation.pangle.renderer.PangleBannerAd.this);
                                com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.wrappedAdView.addView(pAGBannerAd.getBannerView());
                                com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.bannerAdCallback = (com.google.android.gms.ads.mediation.MediationBannerAdCallback) com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.adLoadCallback.onSuccess(com.google.ads.mediation.pangle.renderer.PangleBannerAd.this);
                            }
                        });
                    }
                }

                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adError.toString());
                    com.google.ads.mediation.pangle.renderer.PangleBannerAd.this.adLoadCallback.onFailure(adError);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        return this.wrappedAdView;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    static java.util.List<com.google.android.gms.ads.AdSize> getSupportedBannerSizes() {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(new com.google.android.gms.ads.AdSize(320, 50));
        arrayList.add(new com.google.android.gms.ads.AdSize(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 250));
        arrayList.add(new com.google.android.gms.ads.AdSize(728, 90));
        return arrayList;
    }
}
