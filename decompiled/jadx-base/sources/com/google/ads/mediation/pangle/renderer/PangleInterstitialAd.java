package com.google.ads.mediation.pangle.renderer;

/* JADX INFO: loaded from: classes4.dex */
public class PangleInterstitialAd implements com.google.android.gms.ads.mediation.MediationInterstitialAd {
    private final com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration adConfiguration;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> adLoadCallback;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
    private com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd pagInterstitialAd;
    private final com.google.ads.mediation.pangle.PangleFactory pangleFactory;
    private final com.google.ads.mediation.pangle.PangleInitializer pangleInitializer;
    private final com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig;
    private final com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper;

    public PangleInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.pangle.PangleInitializer pangleInitializer, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PangleFactory pangleFactory, com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig) {
        this.adConfiguration = mediationInterstitialAdConfiguration;
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
            com.google.android.gms.ads.AdError adErrorCreateAdapterError = com.google.ads.mediation.pangle.PangleConstants.createAdapterError(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            android.util.Log.e(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.adLoadCallback.onFailure(adErrorCreateAdapterError);
        } else {
            final java.lang.String bidResponse = this.adConfiguration.getBidResponse();
            this.pangleInitializer.initialize(this.adConfiguration.getContext(), serverParameters.getString(com.google.ads.mediation.pangle.PangleConstants.APP_ID), new com.google.ads.mediation.pangle.PangleInitializer.Listener() { // from class: com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.1
                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeSuccess() {
                    com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest pAGInterstitialRequestCreatePagInterstitialRequest = com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.pangleFactory.createPagInterstitialRequest();
                    pAGInterstitialRequestCreatePagInterstitialRequest.setAdString(bidResponse);
                    com.google.ads.mediation.pangle.PangleRequestHelper.setWatermarkString(pAGInterstitialRequestCreatePagInterstitialRequest, bidResponse, com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.adConfiguration);
                    com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.pangleSdkWrapper.loadInterstitialAd(string, pAGInterstitialRequestCreatePagInterstitialRequest, new com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.1.1
                        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
                        public void onError(int i, java.lang.String str) {
                            com.google.android.gms.ads.AdError adErrorCreateSdkError = com.google.ads.mediation.pangle.PangleConstants.createSdkError(i, str);
                            android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adErrorCreateSdkError.toString());
                            com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.adLoadCallback.onFailure(adErrorCreateSdkError);
                        }

                        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                        public void onAdLoaded(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd pAGInterstitialAd) {
                            com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.interstitialAdCallback = (com.google.android.gms.ads.mediation.MediationInterstitialAdCallback) com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.adLoadCallback.onSuccess(com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this);
                            com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.pagInterstitialAd = pAGInterstitialAd;
                        }
                    });
                }

                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adError.toString());
                    com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.adLoadCallback.onFailure(adError);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        this.pagInterstitialAd.setAdInteractionListener(new com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                if (com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.interstitialAdCallback != null) {
                    com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.interstitialAdCallback.onAdOpened();
                    com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.interstitialAdCallback.reportAdImpression();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                if (com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.interstitialAdCallback != null) {
                    com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.interstitialAdCallback.reportAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
                if (com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.interstitialAdCallback != null) {
                    com.google.ads.mediation.pangle.renderer.PangleInterstitialAd.this.interstitialAdCallback.onAdClosed();
                }
            }
        });
        if (context instanceof android.app.Activity) {
            this.pagInterstitialAd.show((android.app.Activity) context);
        } else {
            this.pagInterstitialAd.show(null);
        }
    }
}
