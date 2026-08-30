package com.applovin.mediation.adapters;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdapterNativeAd extends com.applovin.mediation.nativeAds.MaxNativeAd {
    private final com.applovin.mediation.adapters.AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterNativeAd(com.applovin.mediation.adapters.AppLovinMediationAdapter appLovinMediationAdapter, com.applovin.mediation.nativeAds.MaxNativeAd.Builder builder) {
        super(builder);
        this.parentAdapter = appLovinMediationAdapter;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAd
    public boolean prepareForInteraction(java.util.List<android.view.View> list, android.view.ViewGroup viewGroup) {
        com.applovin.mediation.adapters.AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl = (com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl) appLovinMediationAdapter.loadedNativeAd;
        if (appLovinNativeAdImpl == null) {
            appLovinMediationAdapter.e("Failed to register native ad views: native ad is null");
            return false;
        }
        appLovinMediationAdapter.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
        appLovinNativeAdImpl.registerViewsForInteraction(list, viewGroup);
        return true;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAd
    public void prepareViewForInteraction(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView) {
        com.applovin.mediation.adapters.AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl = (com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl) appLovinMediationAdapter.loadedNativeAd;
        if (appLovinNativeAdImpl == null) {
            appLovinMediationAdapter.e("Failed to register native ad view for interaction. Native ad is null");
            return;
        }
        appLovinMediationAdapter.d("Preparing view for interaction: " + maxNativeAdView);
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
            this.parentAdapter.d("Adding title TextView: " + maxNativeAdView.getTitleTextView());
            arrayList.add(maxNativeAdView.getTitleTextView());
        }
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(getAdvertiser()) && maxNativeAdView.getAdvertiserTextView() != null) {
            this.parentAdapter.d("Adding advertiser TextView: " + maxNativeAdView.getAdvertiserTextView());
            arrayList.add(maxNativeAdView.getAdvertiserTextView());
        }
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
            this.parentAdapter.d("Adding body TextView: " + maxNativeAdView.getBodyTextView());
            arrayList.add(maxNativeAdView.getBodyTextView());
        }
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
            this.parentAdapter.d("Adding CTA button: " + maxNativeAdView.getCallToActionButton());
            this.parentAdapter.d("CTA button is clickable: " + maxNativeAdView.getCallToActionButton().isClickable());
            this.parentAdapter.d("CTA button is enabled: " + maxNativeAdView.getCallToActionButton().isEnabled());
            this.parentAdapter.d("CTA button has onClickListeners: " + maxNativeAdView.getCallToActionButton().hasOnClickListeners());
            arrayList.add(maxNativeAdView.getCallToActionButton());
        }
        if (getIcon() != null && maxNativeAdView.getIconImageView() != null) {
            this.parentAdapter.d("Adding icon image view: " + maxNativeAdView.getIconImageView());
            arrayList.add(maxNativeAdView.getIconImageView());
        }
        appLovinNativeAdImpl.registerViewsForInteraction(arrayList, maxNativeAdView);
    }
}
