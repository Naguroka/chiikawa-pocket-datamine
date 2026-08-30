package com.google.ads.mediation.facebook.rtb;

/* JADX INFO: loaded from: classes4.dex */
public class FacebookRtbNativeAd extends com.google.android.gms.ads.mediation.UnifiedNativeAdMapper {
    private final com.google.android.gms.ads.mediation.MediationNativeAdConfiguration adConfiguration;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> callback;
    private com.facebook.ads.MediaView mediaView;
    private final com.google.ads.mediation.facebook.MetaFactory metaFactory;
    private com.facebook.ads.NativeAdBase nativeAdBase;
    private com.google.android.gms.ads.mediation.MediationNativeAdCallback nativeAdCallback;

    private interface NativeAdMapperListener {
        void onMappingFailed(com.google.android.gms.ads.AdError adError);

        void onMappingSuccess();
    }

    public FacebookRtbNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback, com.google.ads.mediation.facebook.MetaFactory metaFactory) {
        this.callback = mediationAdLoadCallback;
        this.adConfiguration = mediationNativeAdConfiguration;
        this.metaFactory = metaFactory;
    }

    public void render() {
        java.lang.String placementID = com.google.ads.mediation.facebook.FacebookMediationAdapter.getPlacementID(this.adConfiguration.getServerParameters());
        if (android.text.TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            android.util.Log.e(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError.getMessage());
            this.callback.onFailure(adError);
            return;
        }
        com.google.ads.mediation.facebook.FacebookMediationAdapter.setMixedAudience(this.adConfiguration);
        this.mediaView = this.metaFactory.createMediaView(this.adConfiguration.getContext());
        try {
            this.nativeAdBase = com.facebook.ads.NativeAdBase.fromBidPayload(this.adConfiguration.getContext(), placementID, this.adConfiguration.getBidResponse());
            if (!android.text.TextUtils.isEmpty(this.adConfiguration.getWatermark())) {
                this.nativeAdBase.setExtraHints(new com.facebook.ads.ExtraHints.Builder().mediationData(this.adConfiguration.getWatermark()).build());
            }
            com.facebook.ads.NativeAdBase nativeAdBase = this.nativeAdBase;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeListener(this.adConfiguration.getContext(), this.nativeAdBase)).withBid(this.adConfiguration.getBidResponse()).withMediaCacheFlag(com.facebook.ads.NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(109, "Failed to create native ad from bid payload: " + e.getMessage(), "com.google.ads.mediation.facebook");
            android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError2.getMessage());
            this.callback.onFailure(adError2);
        }
    }

    private class NativeListener implements com.facebook.ads.AdListener, com.facebook.ads.NativeAdListener {
        private final java.lang.ref.WeakReference<android.content.Context> context;
        private final com.facebook.ads.NativeAdBase nativeAd;

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(com.facebook.ads.Ad ad) {
        }

        NativeListener(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase) {
            this.nativeAd = nativeAdBase;
            this.context = new java.lang.ref.WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(com.facebook.ads.Ad ad) {
            com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.nativeAdCallback.reportAdClicked();
            com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.nativeAdCallback.onAdOpened();
            com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.nativeAdCallback.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(com.facebook.ads.Ad ad) {
            if (ad != this.nativeAd) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Ad Loaded is not a Native Ad.", "com.google.ads.mediation.facebook");
                android.util.Log.e(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError.getMessage());
                com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.callback.onFailure(adError);
                return;
            }
            android.content.Context context = this.context.get();
            if (context == null) {
                com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(107, "Context is null.", "com.google.ads.mediation.facebook");
                android.util.Log.e(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError2.getMessage());
                com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.callback.onFailure(adError2);
                return;
            }
            com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.mapNativeAd(context, new com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeAdMapperListener() { // from class: com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeListener.1
                @Override // com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeAdMapperListener
                public void onMappingSuccess() {
                    com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.nativeAdCallback = (com.google.android.gms.ads.mediation.MediationNativeAdCallback) com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.callback.onSuccess(com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this);
                }

                @Override // com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeAdMapperListener
                public void onMappingFailed(com.google.android.gms.ads.AdError adError3) {
                    android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError3.getMessage());
                    com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.callback.onFailure(adError3);
                }
            });
        }

        @Override // com.facebook.ads.AdListener
        public void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
            com.google.android.gms.ads.AdError adError2 = com.google.ads.mediation.facebook.FacebookMediationAdapter.getAdError(adError);
            android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError2.getMessage());
            com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.callback.onFailure(adError2);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(com.facebook.ads.Ad ad) {
            android.util.Log.d(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    public void mapNativeAd(android.content.Context context, com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeAdMapperListener nativeAdMapperListener) {
        if (!containsRequiredFieldsForUnifiedNativeAd(this.nativeAdBase)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", "com.google.ads.mediation.facebook");
            android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, adError.getMessage());
            nativeAdMapperListener.onMappingFailed(adError);
            return;
        }
        setHeadline(this.nativeAdBase.getAdHeadline());
        if (this.nativeAdBase.getAdCoverImage() != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.FacebookAdapterNativeAdImage(android.net.Uri.parse(this.nativeAdBase.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.nativeAdBase.getAdBodyText());
        if (this.nativeAdBase.getPreloadedIconViewDrawable() == null) {
            if (this.nativeAdBase.getAdIcon() == null) {
                setIcon(new com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.FacebookAdapterNativeAdImage());
            } else {
                setIcon(new com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.FacebookAdapterNativeAdImage(android.net.Uri.parse(this.nativeAdBase.getAdIcon().getUrl())));
            }
        } else {
            setIcon(new com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.FacebookAdapterNativeAdImage(this.nativeAdBase.getPreloadedIconViewDrawable()));
        }
        setCallToAction(this.nativeAdBase.getAdCallToAction());
        setAdvertiser(this.nativeAdBase.getAdvertiserName());
        this.mediaView.setListener(new com.facebook.ads.MediaViewListener() { // from class: com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.1
            @Override // com.facebook.ads.MediaViewListener
            public void onEnterFullscreen(com.facebook.ads.MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onExitFullscreen(com.facebook.ads.MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onFullscreenBackground(com.facebook.ads.MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onFullscreenForeground(com.facebook.ads.MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onPause(com.facebook.ads.MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onPlay(com.facebook.ads.MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onVolumeChange(com.facebook.ads.MediaView mediaView, float f) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onComplete(com.facebook.ads.MediaView mediaView) {
                if (com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.nativeAdCallback != null) {
                    com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.this.nativeAdCallback.onVideoComplete();
                }
            }
        });
        setHasVideoContent(true);
        setMediaView(this.mediaView);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("id", this.nativeAdBase.getId());
        bundle.putCharSequence(com.google.ads.mediation.facebook.FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.nativeAdBase.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new com.facebook.ads.AdOptionsView(context, this.nativeAdBase, null));
        nativeAdMapperListener.onMappingSuccess();
    }

    private boolean containsRequiredFieldsForUnifiedNativeAd(com.facebook.ads.NativeAdBase nativeAdBase) {
        boolean z = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        if (nativeAdBase instanceof com.facebook.ads.NativeBannerAd) {
            return z;
        }
        return (!z || nativeAdBase.getAdCoverImage() == null || this.mediaView == null) ? false : true;
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(android.view.View view, java.util.Map<java.lang.String, android.view.View> map, java.util.Map<java.lang.String, android.view.View> map2) {
        setOverrideClickHandling(true);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.values());
        android.view.View view2 = map.get("3003");
        com.facebook.ads.NativeAdBase nativeAdBase = this.nativeAdBase;
        if (nativeAdBase instanceof com.facebook.ads.NativeBannerAd) {
            if (view2 == null) {
                android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            } else if (!(view2 instanceof android.widget.ImageView)) {
                android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, java.lang.String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
                return;
            } else {
                ((com.facebook.ads.NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (android.widget.ImageView) view2, arrayList);
                return;
            }
        }
        if (nativeAdBase instanceof com.facebook.ads.NativeAd) {
            com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
            if (view2 instanceof android.widget.ImageView) {
                nativeAd.registerViewForInteraction(view, this.mediaView, (android.widget.ImageView) view2, arrayList);
                return;
            } else {
                android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
                nativeAd.registerViewForInteraction(view, this.mediaView, arrayList);
                return;
            }
        }
        android.util.Log.w(com.google.ads.mediation.facebook.FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(android.view.View view) {
        com.facebook.ads.NativeAdBase nativeAdBase = this.nativeAdBase;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }

    private class FacebookAdapterNativeAdImage extends com.google.android.gms.ads.formats.NativeAd.Image {
        private android.graphics.drawable.Drawable drawable;
        private android.net.Uri uri;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        public FacebookAdapterNativeAdImage() {
        }

        public FacebookAdapterNativeAdImage(android.net.Uri uri) {
            this.uri = uri;
        }

        public FacebookAdapterNativeAdImage(android.graphics.drawable.Drawable drawable) {
            this.drawable = drawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public android.graphics.drawable.Drawable getDrawable() {
            return this.drawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public android.net.Uri getUri() {
            return this.uri;
        }
    }
}
