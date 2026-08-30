package com.applovin.mediation.adapters;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdapterNativeListener implements com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener, com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener {
    private final com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener listener;
    private final com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters parameters;
    private final com.applovin.mediation.adapters.AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterNativeListener(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, com.applovin.mediation.adapters.AppLovinMediationAdapter appLovinMediationAdapter, com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        this.parameters = maxAdapterResponseParameters;
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxNativeAdAdapterListener;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener
    public void onNativeAdClicked(com.applovin.impl.sdk.nativeAd.AppLovinNativeAd appLovinNativeAd) {
        this.parentAdapter.d("Native ad clicked");
        this.listener.onNativeAdClicked();
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
    public void onNativeAdLoadFailed(com.applovin.impl.sdk.AppLovinError appLovinError) {
        this.parentAdapter.d("Native ad failed to load with error: " + appLovinError);
        this.listener.onNativeAdLoadFailed(com.applovin.mediation.adapters.AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
    public void onNativeAdLoaded(com.applovin.impl.sdk.nativeAd.AppLovinNativeAd appLovinNativeAd) {
        this.parentAdapter.d("Native ad loaded: " + appLovinNativeAd);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(com.applovin.impl.sdk.utils.BundleUtils.getString("template", "", this.parameters.getServerParameters())) && android.text.TextUtils.isEmpty(appLovinNativeAd.getTitle())) {
            this.parentAdapter.e("Native ad does not have required assets: " + appLovinNativeAd);
            this.listener.onNativeAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
            return;
        }
        com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl = (com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl) appLovinNativeAd;
        appLovinNativeAdImpl.setEventListener(this);
        com.applovin.mediation.adapters.AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.loadedNativeAd = appLovinNativeAd;
        this.listener.onNativeAdLoaded(new com.applovin.mediation.adapters.AppLovinAdapterNativeAd(appLovinMediationAdapter, new com.applovin.mediation.nativeAds.MaxNativeAd.Builder().setAdFormat(com.applovin.mediation.MaxAdFormat.NATIVE).setTitle(appLovinNativeAd.getTitle()).setAdvertiser(appLovinNativeAd.getAdvertiser()).setBody(appLovinNativeAd.getBody()).setCallToAction(appLovinNativeAd.getCallToAction()).setIcon(new com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage(appLovinNativeAd.getIconUri())).setOptionsView(appLovinNativeAd.getOptionsView()).setMediaView(appLovinNativeAd.getMediaView()).setMainImage(new com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage(appLovinNativeAdImpl.getMainImageUri())).setMediaContentAspectRatio(appLovinNativeAdImpl.getMainImageAspectRatio()).setStarRating(appLovinNativeAd.getStarRating())), null);
    }
}
