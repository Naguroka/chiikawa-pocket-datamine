package com.applovin.mediation.nativeAds;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAd extends com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final java.lang.String advertiser;
    private final java.lang.String body;
    private final java.lang.String callToAction;
    private final com.applovin.mediation.MaxAdFormat format;
    private final com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage icon;
    private final android.view.View iconView;
    private boolean isExpired;
    private final com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final android.view.View mediaView;
    private com.applovin.mediation.nativeAds.MaxNativeAdView nativeAdView;
    private final android.view.View optionsView;
    private final java.lang.Double starRating;
    private final java.lang.String title;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.applovin.mediation.MaxAdFormat f1590a;
        private java.lang.String b;
        private java.lang.String c;
        private java.lang.String d;
        private java.lang.String e;
        private com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage f;
        private android.view.View g;
        private android.view.View h;
        private android.view.View i;
        private com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage j;
        private float k;
        private java.lang.Double l;

        public com.applovin.mediation.nativeAds.MaxNativeAd build() {
            return new com.applovin.mediation.nativeAds.MaxNativeAd(this);
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setAdFormat(com.applovin.mediation.MaxAdFormat maxAdFormat) {
            this.f1590a = maxAdFormat;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setAdvertiser(java.lang.String str) {
            this.c = str;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setBody(java.lang.String str) {
            this.d = str;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setCallToAction(java.lang.String str) {
            this.e = str;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setIcon(com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage maxNativeAdImage) {
            this.f = maxNativeAdImage;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setIconView(android.view.View view) {
            this.g = view;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setMainImage(com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage maxNativeAdImage) {
            this.j = maxNativeAdImage;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setMediaContentAspectRatio(float f) {
            this.k = f;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setMediaView(android.view.View view) {
            this.i = view;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setOptionsView(android.view.View view) {
            this.h = view;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setStarRating(java.lang.Double d) {
            this.l = d;
            return this;
        }

        public com.applovin.mediation.nativeAds.MaxNativeAd.Builder setTitle(java.lang.String str) {
            this.b = str;
            return this;
        }
    }

    public MaxNativeAd(com.applovin.mediation.nativeAds.MaxNativeAd.Builder builder) {
        this.format = builder.f1590a;
        this.title = builder.b;
        this.advertiser = builder.c;
        this.body = builder.d;
        this.callToAction = builder.e;
        this.icon = builder.f;
        this.iconView = builder.g;
        this.optionsView = builder.h;
        this.mediaView = builder.i;
        this.mainImage = builder.j;
        this.mediaContentAspectRatio = builder.k;
        java.lang.Double d = builder.l;
        this.starRating = (d == null || d.doubleValue() < 3.0d) ? null : d;
    }

    public final java.lang.String getAdvertiser() {
        return this.advertiser;
    }

    public final java.lang.String getBody() {
        return this.body;
    }

    public final java.lang.String getCallToAction() {
        return this.callToAction;
    }

    public final com.applovin.mediation.MaxAdFormat getFormat() {
        return this.format;
    }

    public final com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final android.view.View getIconView() {
        return this.iconView;
    }

    public final com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final android.view.View getMediaView() {
        return this.mediaView;
    }

    public final android.view.View getOptionsView() {
        return this.optionsView;
    }

    public final java.lang.Double getStarRating() {
        return this.starRating;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        android.widget.Button callToActionButton;
        com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(java.util.List<android.view.View> list, android.view.ViewGroup viewGroup) {
        return false;
    }

    @java.lang.Deprecated
    public void prepareViewForInteraction(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    public static class MaxNativeAdImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.graphics.drawable.Drawable f1591a;
        private android.net.Uri b;

        public MaxNativeAdImage(android.graphics.drawable.Drawable drawable) {
            this.f1591a = drawable;
        }

        public android.graphics.drawable.Drawable getDrawable() {
            return this.f1591a;
        }

        public android.net.Uri getUri() {
            return this.b;
        }

        public MaxNativeAdImage(android.net.Uri uri) {
            this.b = uri;
        }
    }
}
