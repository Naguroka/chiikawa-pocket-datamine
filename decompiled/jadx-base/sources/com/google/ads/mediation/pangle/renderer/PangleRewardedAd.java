package com.google.ads.mediation.pangle.renderer;

/* JADX INFO: loaded from: classes4.dex */
public class PangleRewardedAd implements com.google.android.gms.ads.mediation.MediationRewardedAd {
    private final com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration adConfiguration;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> adLoadCallback;
    private com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd pagRewardedAd;
    private final com.google.ads.mediation.pangle.PangleFactory pangleFactory;
    private final com.google.ads.mediation.pangle.PangleInitializer pangleInitializer;
    private final com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig;
    private final com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;

    public PangleRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.pangle.PangleInitializer pangleInitializer, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PangleFactory pangleFactory, com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig) {
        this.adConfiguration = mediationRewardedAdConfiguration;
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
            com.google.android.gms.ads.AdError adErrorCreateAdapterError = com.google.ads.mediation.pangle.PangleConstants.createAdapterError(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            android.util.Log.e(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.adLoadCallback.onFailure(adErrorCreateAdapterError);
        } else {
            final java.lang.String bidResponse = this.adConfiguration.getBidResponse();
            this.pangleInitializer.initialize(this.adConfiguration.getContext(), serverParameters.getString(com.google.ads.mediation.pangle.PangleConstants.APP_ID), new com.google.ads.mediation.pangle.PangleInitializer.Listener() { // from class: com.google.ads.mediation.pangle.renderer.PangleRewardedAd.1
                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeSuccess() {
                    com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest pAGRewardedRequestCreatePagRewardedRequest = com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.pangleFactory.createPagRewardedRequest();
                    pAGRewardedRequestCreatePagRewardedRequest.setAdString(bidResponse);
                    com.google.ads.mediation.pangle.PangleRequestHelper.setWatermarkString(pAGRewardedRequestCreatePagRewardedRequest, bidResponse, com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.adConfiguration);
                    com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.pangleSdkWrapper.loadRewardedAd(string, pAGRewardedRequestCreatePagRewardedRequest, new com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleRewardedAd.1.1
                        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
                        public void onError(int i, java.lang.String str) {
                            com.google.android.gms.ads.AdError adErrorCreateSdkError = com.google.ads.mediation.pangle.PangleConstants.createSdkError(i, str);
                            android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adErrorCreateSdkError.toString());
                            com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.adLoadCallback.onFailure(adErrorCreateSdkError);
                        }

                        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                        public void onAdLoaded(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd pAGRewardedAd) {
                            com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.rewardedAdCallback = (com.google.android.gms.ads.mediation.MediationRewardedAdCallback) com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.adLoadCallback.onSuccess(com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this);
                            com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.pagRewardedAd = pAGRewardedAd;
                        }
                    });
                }

                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adError.toString());
                    com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.adLoadCallback.onFailure(adError);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        this.pagRewardedAd.setAdInteractionListener(new com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleRewardedAd.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                if (com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.rewardedAdCallback != null) {
                    com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.rewardedAdCallback.onAdOpened();
                    com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.rewardedAdCallback.reportAdImpression();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                if (com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.rewardedAdCallback != null) {
                    com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.rewardedAdCallback.reportAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
                if (com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.rewardedAdCallback != null) {
                    com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.rewardedAdCallback.onAdClosed();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
            public void onUserEarnedReward(final com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem pAGRewardItem) {
                com.google.android.gms.ads.rewarded.RewardItem rewardItem = new com.google.android.gms.ads.rewarded.RewardItem() { // from class: com.google.ads.mediation.pangle.renderer.PangleRewardedAd.2.1
                    @Override // com.google.android.gms.ads.rewarded.RewardItem
                    public java.lang.String getType() {
                        return pAGRewardItem.getRewardName();
                    }

                    @Override // com.google.android.gms.ads.rewarded.RewardItem
                    public int getAmount() {
                        return pAGRewardItem.getRewardAmount();
                    }
                };
                if (com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.rewardedAdCallback != null) {
                    com.google.ads.mediation.pangle.renderer.PangleRewardedAd.this.rewardedAdCallback.onUserEarnedReward(rewardItem);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
            public void onUserEarnedRewardFail(int i, java.lang.String str) {
                android.util.Log.d(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, com.google.ads.mediation.pangle.PangleConstants.createSdkError(i, java.lang.String.format("Failed to reward user: %s", str)).toString());
            }
        });
        if (context instanceof android.app.Activity) {
            this.pagRewardedAd.show((android.app.Activity) context);
        } else {
            this.pagRewardedAd.show(null);
        }
    }
}
