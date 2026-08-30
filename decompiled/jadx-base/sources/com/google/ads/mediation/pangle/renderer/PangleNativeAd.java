package com.google.ads.mediation.pangle.renderer;

/* JADX INFO: loaded from: classes4.dex */
public class PangleNativeAd extends com.google.android.gms.ads.mediation.UnifiedNativeAdMapper {
    static final java.lang.String ASSET_ID_ADCHOICES_TEXT_VIEW = "3012";
    static final double PANGLE_SDK_IMAGE_SCALE = 1.0d;
    private final com.google.android.gms.ads.mediation.MediationNativeAdConfiguration adConfiguration;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> adLoadCallback;
    private com.google.android.gms.ads.mediation.MediationNativeAdCallback callback;
    private com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pagNativeAd;
    private final com.google.ads.mediation.pangle.PangleFactory pangleFactory;
    private final com.google.ads.mediation.pangle.PangleInitializer pangleInitializer;
    private final com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig;
    private final com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper;

    public PangleNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback, com.google.ads.mediation.pangle.PangleInitializer pangleInitializer, com.google.ads.mediation.pangle.PangleSdkWrapper pangleSdkWrapper, com.google.ads.mediation.pangle.PangleFactory pangleFactory, com.google.ads.mediation.pangle.PanglePrivacyConfig panglePrivacyConfig) {
        this.adConfiguration = mediationNativeAdConfiguration;
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
            com.google.android.gms.ads.AdError adErrorCreateAdapterError = com.google.ads.mediation.pangle.PangleConstants.createAdapterError(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            android.util.Log.e(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.adLoadCallback.onFailure(adErrorCreateAdapterError);
        } else {
            final java.lang.String bidResponse = this.adConfiguration.getBidResponse();
            this.pangleInitializer.initialize(this.adConfiguration.getContext(), serverParameters.getString(com.google.ads.mediation.pangle.PangleConstants.APP_ID), new com.google.ads.mediation.pangle.PangleInitializer.Listener() { // from class: com.google.ads.mediation.pangle.renderer.PangleNativeAd.1
                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeSuccess() {
                    com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest pAGNativeRequestCreatePagNativeRequest = com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.pangleFactory.createPagNativeRequest();
                    pAGNativeRequestCreatePagNativeRequest.setAdString(bidResponse);
                    com.google.ads.mediation.pangle.PangleRequestHelper.setWatermarkString(pAGNativeRequestCreatePagNativeRequest, bidResponse, com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.adConfiguration);
                    com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.pangleSdkWrapper.loadNativeAd(string, pAGNativeRequestCreatePagNativeRequest, new com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleNativeAd.1.1
                        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
                        public void onError(int i, java.lang.String str) {
                            com.google.android.gms.ads.AdError adErrorCreateSdkError = com.google.ads.mediation.pangle.PangleConstants.createSdkError(i, str);
                            android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adErrorCreateSdkError.toString());
                            com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.adLoadCallback.onFailure(adErrorCreateSdkError);
                        }

                        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                        public void onAdLoaded(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
                            com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.mapNativeAd(pAGNativeAd);
                            com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.callback = (com.google.android.gms.ads.mediation.MediationNativeAdCallback) com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.adLoadCallback.onSuccess(com.google.ads.mediation.pangle.renderer.PangleNativeAd.this);
                        }
                    });
                }

                @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    android.util.Log.w(com.google.ads.mediation.pangle.PangleMediationAdapter.TAG, adError.toString());
                    com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.adLoadCallback.onFailure(adError);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mapNativeAd(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
        this.pagNativeAd = pAGNativeAd;
        com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
        setHeadline(nativeAdData.getTitle());
        setBody(nativeAdData.getDescription());
        setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            setIcon(new com.google.ads.mediation.pangle.renderer.PangleNativeAd.PangleNativeMappedImage(null, android.net.Uri.parse(nativeAdData.getIcon().getImageUrl()), PANGLE_SDK_IMAGE_SCALE));
        }
        setOverrideClickHandling(true);
        setMediaView(nativeAdData.getMediaView());
        setAdChoicesContent(nativeAdData.getAdLogoView());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(android.view.View view, java.util.Map<java.lang.String, android.view.View> map, java.util.Map<java.lang.String, android.view.View> map2) {
        java.util.HashMap map3 = new java.util.HashMap(map);
        map3.remove("3011");
        map3.remove(ASSET_ID_ADCHOICES_TEXT_VIEW);
        android.view.View view2 = (android.view.View) map3.get("3002");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.pagNativeAd.registerViewForInteraction((android.view.ViewGroup) view, new java.util.ArrayList(map3.values()), arrayList, (android.view.View) null, new com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleNativeAd.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                if (com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.callback != null) {
                    com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.callback.reportAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                if (com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.callback != null) {
                    com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.callback.reportAdImpression();
                }
            }
        });
        getAdChoicesContent().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.ads.mediation.pangle.renderer.PangleNativeAd.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view3) {
                com.google.ads.mediation.pangle.renderer.PangleNativeAd.this.pagNativeAd.showPrivacyActivity();
            }
        });
    }

    public class PangleNativeMappedImage extends com.google.android.gms.ads.formats.NativeAd.Image {
        private final android.graphics.drawable.Drawable drawable;
        private final android.net.Uri imageUri;
        private final double scale;

        private PangleNativeMappedImage(android.graphics.drawable.Drawable drawable, android.net.Uri uri, double d) {
            this.drawable = drawable;
            this.imageUri = uri;
            this.scale = d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public android.graphics.drawable.Drawable getDrawable() {
            return this.drawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public android.net.Uri getUri() {
            return this.imageUri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.scale;
        }
    }
}
