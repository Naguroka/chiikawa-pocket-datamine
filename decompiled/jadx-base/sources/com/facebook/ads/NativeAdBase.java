package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NativeAdBase implements com.facebook.ads.Ad {
    final com.facebook.ads.internal.api.NativeAdBaseApi mNativeAdBaseApi;

    public enum MediaCacheFlag {
        NONE,
        ALL
    }

    public interface NativeAdLoadConfigBuilder extends com.facebook.ads.Ad.LoadConfigBuilder {
        public static final int UNKNOWN_IMAGE_SIZE = -1;

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        com.facebook.ads.NativeAdBase.NativeLoadAdConfig build();

        com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder withAdListener(com.facebook.ads.NativeAdListener nativeAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder withBid(java.lang.String str);

        com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder withMediaCacheFlag(com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag);

        com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder withPreloadedIconView(int i, int i2);
    }

    public interface NativeLoadAdConfig extends com.facebook.ads.Ad.LoadAdConfig {
    }

    @java.lang.Deprecated
    public boolean isNativeConfigEnabled() {
        return false;
    }

    public static com.facebook.ads.NativeAdBase fromBidPayload(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdBaseFromBidPayload(context, str, str2);
    }

    public static class Image {
        private final com.facebook.ads.internal.api.NativeAdImageApi mNativeAdImageApi;

        Image(com.facebook.ads.internal.api.NativeAdImageApi nativeAdImageApi) {
            this.mNativeAdImageApi = nativeAdImageApi;
        }

        public int getWidth() {
            return this.mNativeAdImageApi.getWidth();
        }

        public int getHeight() {
            return this.mNativeAdImageApi.getHeight();
        }

        public java.lang.String getUrl() {
            return this.mNativeAdImageApi.getUrl();
        }

        public static com.facebook.ads.NativeAdBase.Image fromJSONObject(org.json.JSONObject jSONObject) {
            com.facebook.ads.internal.api.NativeAdImageApi nativeAdImageApiCreateNativeAdImageApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdImageApi(jSONObject);
            if (nativeAdImageApiCreateNativeAdImageApi == null) {
                return null;
            }
            return new com.facebook.ads.NativeAdBase.Image(nativeAdImageApiCreateNativeAdImageApi);
        }
    }

    public static class Rating {
        private final com.facebook.ads.internal.api.NativeAdRatingApi mNativeAdRatingApi;

        Rating(com.facebook.ads.internal.api.NativeAdRatingApi nativeAdRatingApi) {
            this.mNativeAdRatingApi = nativeAdRatingApi;
        }

        public double getValue() {
            return this.mNativeAdRatingApi.getValue();
        }

        public double getScale() {
            return this.mNativeAdRatingApi.getScale();
        }

        public static com.facebook.ads.NativeAdBase.Rating fromJSONObject(org.json.JSONObject jSONObject) {
            com.facebook.ads.internal.api.NativeAdRatingApi nativeAdRatingApiCreateNativeAdRatingApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdRatingApi(jSONObject);
            if (nativeAdRatingApiCreateNativeAdRatingApi == null) {
                return null;
            }
            return new com.facebook.ads.NativeAdBase.Rating(nativeAdRatingApiCreateNativeAdRatingApi);
        }
    }

    public enum NativeComponentTag {
        AD_ICON,
        AD_TITLE,
        AD_COVER_IMAGE,
        AD_SUBTITLE,
        AD_BODY,
        AD_CALL_TO_ACTION,
        AD_SOCIAL_CONTEXT,
        AD_CHOICES_ICON,
        AD_OPTIONS_VIEW,
        AD_MEDIA;

        public static void tagView(android.view.View view, com.facebook.ads.NativeAdBase.NativeComponentTag nativeComponentTag) {
            com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(view.getContext()).createNativeComponentTagApi().tagView(view, nativeComponentTag);
        }
    }

    public NativeAdBase(android.content.Context context, java.lang.String str) {
        this.mNativeAdBaseApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdBaseApi(context, str);
    }

    public NativeAdBase(com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        this.mNativeAdBaseApi = nativeAdBaseApi;
    }

    NativeAdBase(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase) {
        this.mNativeAdBaseApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdBaseApi(nativeAdBase.mNativeAdBaseApi);
    }

    public com.facebook.ads.internal.api.NativeAdBaseApi getInternalNativeAd() {
        return this.mNativeAdBaseApi;
    }

    @Override // com.facebook.ads.Ad
    @java.lang.Deprecated
    public void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.mNativeAdBaseApi.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        this.mNativeAdBaseApi.loadAd();
    }

    public void loadAd(com.facebook.ads.NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        this.mNativeAdBaseApi.loadAd(nativeLoadAdConfig);
    }

    public void downloadMedia() {
        this.mNativeAdBaseApi.downloadMedia();
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mNativeAdBaseApi.destroy();
    }

    @Override // com.facebook.ads.Ad
    public java.lang.String getPlacementId() {
        return this.mNativeAdBaseApi.getPlacementId();
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mNativeAdBaseApi.isAdInvalidated();
    }

    public boolean isAdLoaded() {
        return this.mNativeAdBaseApi.isAdLoaded();
    }

    public boolean hasCallToAction() {
        return this.mNativeAdBaseApi.hasCallToAction();
    }

    public com.facebook.ads.NativeAdBase.Image getAdIcon() {
        if (this.mNativeAdBaseApi.getAdIcon() == null) {
            return null;
        }
        return new com.facebook.ads.NativeAdBase.Image(this.mNativeAdBaseApi.getAdIcon());
    }

    public com.facebook.ads.NativeAdBase.Image getAdCoverImage() {
        if (this.mNativeAdBaseApi.getAdCoverImage() == null) {
            return null;
        }
        return new com.facebook.ads.NativeAdBase.Image(this.mNativeAdBaseApi.getAdCoverImage());
    }

    @java.lang.Deprecated
    public com.facebook.ads.NativeAdViewAttributes getAdViewAttributes() {
        return new com.facebook.ads.NativeAdViewAttributes();
    }

    public java.lang.String getAdvertiserName() {
        return this.mNativeAdBaseApi.getAdvertiserName();
    }

    public java.lang.String getAdHeadline() {
        return this.mNativeAdBaseApi.getAdHeadline();
    }

    public java.lang.String getAdBodyText() {
        return this.mNativeAdBaseApi.getAdBodyText();
    }

    public java.lang.String getAdUntrimmedBodyText() {
        return this.mNativeAdBaseApi.getAdUntrimmedBodyText();
    }

    public java.lang.String getAdCallToAction() {
        return this.mNativeAdBaseApi.getAdCallToAction();
    }

    public java.lang.String getAdSocialContext() {
        return this.mNativeAdBaseApi.getAdSocialContext();
    }

    public java.lang.String getAdLinkDescription() {
        return this.mNativeAdBaseApi.getAdLinkDescription();
    }

    public java.lang.String getSponsoredTranslation() {
        return this.mNativeAdBaseApi.getSponsoredTranslation();
    }

    public java.lang.String getAdTranslation() {
        return this.mNativeAdBaseApi.getAdTranslation();
    }

    public java.lang.String getPromotedTranslation() {
        return this.mNativeAdBaseApi.getPromotedTranslation();
    }

    @java.lang.Deprecated
    public com.facebook.ads.NativeAdBase.Rating getAdStarRating() {
        if (this.mNativeAdBaseApi.getAdStarRating() == null) {
            return null;
        }
        return new com.facebook.ads.NativeAdBase.Rating(this.mNativeAdBaseApi.getAdStarRating());
    }

    public java.lang.String getId() {
        return this.mNativeAdBaseApi.getId();
    }

    public com.facebook.ads.NativeAdBase.Image getAdChoicesIcon() {
        if (this.mNativeAdBaseApi.getAdChoicesIcon() == null) {
            return null;
        }
        return new com.facebook.ads.NativeAdBase.Image(this.mNativeAdBaseApi.getAdChoicesIcon());
    }

    public java.lang.String getAdChoicesImageUrl() {
        return this.mNativeAdBaseApi.getAdChoicesImageUrl();
    }

    public float getAspectRatio() {
        return this.mNativeAdBaseApi.getAspectRatio();
    }

    public java.lang.String getAdChoicesLinkUrl() {
        return this.mNativeAdBaseApi.getAdChoicesLinkUrl();
    }

    public java.lang.String getAdChoicesText() {
        return this.mNativeAdBaseApi.getAdChoicesText();
    }

    public android.graphics.drawable.Drawable getPreloadedIconViewDrawable() {
        return this.mNativeAdBaseApi.getPreloadedIconViewDrawable();
    }

    public void onCtaBroadcast() {
        this.mNativeAdBaseApi.onCtaBroadcast();
    }

    public void unregisterView() {
        this.mNativeAdBaseApi.unregisterView();
    }

    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.mNativeAdBaseApi.setOnTouchListener(onTouchListener);
    }

    public com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mNativeAdBaseApi.buildLoadAdConfig(this);
    }
}
