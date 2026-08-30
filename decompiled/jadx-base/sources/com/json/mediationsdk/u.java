package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class u implements com.json.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface, com.json.mediationsdk.adunit.adapter.AdapterDebugInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface, com.json.mediationsdk.sdk.BannerSmashListener, com.json.v7, com.json.mediationsdk.sdk.InterstitialSmashListener, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener, com.json.mediationsdk.sdk.RewardedVideoSmashListener, com.json.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.mediationsdk.AbstractAdapter f3021a;
    private java.lang.ref.WeakReference<com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener> b;

    public u(com.json.mediationsdk.AbstractAdapter abstractAdapter) {
        this.f3021a = abstractAdapter;
    }

    @Override // com.json.v7
    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        org.json.JSONObject jSONObjectA = com.json.hk.a(adData.getConfiguration());
        org.json.JSONObject jSONObjectA2 = com.json.hk.a(adData.getAdUnitData());
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = (com.ironsource.mediationsdk.IronSource.AD_UNIT) adData.getAdUnitData().get("adUnit");
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f3021a.getRewardedVideoBiddingData(jSONObjectA, jSONObjectA2);
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f3021a.getInterstitialBiddingData(jSONObjectA, jSONObjectA2);
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            return this.f3021a.getBannerBiddingData(jSONObjectA, jSONObjectA2);
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD) {
            return this.f3021a.getNativeAdBiddingData(jSONObjectA, jSONObjectA2);
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
        return null;
    }

    void a() {
        java.lang.String pluginType = com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginType();
        if (android.text.TextUtils.isEmpty(pluginType)) {
            return;
        }
        this.f3021a.setPluginData(pluginType);
    }

    @Override // com.json.v7
    public void a(com.json.mediationsdk.adunit.adapter.utility.AdData adData, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        org.json.JSONObject jSONObjectA = com.json.hk.a(adData.getConfiguration());
        org.json.JSONObject jSONObjectA2 = com.json.hk.a(adData.getAdUnitData());
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = (com.ironsource.mediationsdk.IronSource.AD_UNIT) adData.getAdUnitData().get("adUnit");
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f3021a.collectRewardedVideoBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            this.f3021a.collectInterstitialBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            this.f3021a.collectBannerBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
        } else if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD) {
            this.f3021a.collectNativeAdBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public java.lang.String getAdapterVersion() {
        return this.f3021a.getVersion();
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public com.json.mediationsdk.LoadWhileShowSupportState getBannerLoadWhileShowSupportedState(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        return this.f3021a.getBannerLoadWhileShowSupportState(networkSettings.getBannerSettings());
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public com.json.mediationsdk.LoadWhileShowSupportState getLoadWhileShowSupportedState(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        return this.f3021a.getLoadWhileShowSupportState(networkSettings.getRewardedVideoSettings());
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public java.lang.String getNetworkSDKVersion() {
        return this.f3021a.getCoreSDKVersion();
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(com.json.mediationsdk.adunit.adapter.utility.AdData adData, android.content.Context context, com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener) {
        this.b = new java.lang.ref.WeakReference<>(networkInitializationListener);
        java.lang.String str = (java.lang.String) adData.getAdUnitData().get("userId");
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = (com.ironsource.mediationsdk.IronSource.AD_UNIT) adData.getAdUnitData().get("adUnit");
        a();
        org.json.JSONObject jSONObjectA = com.json.hk.a(adData.getConfiguration());
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f3021a.initRewardedVideoWithCallback("", str, jSONObjectA, this);
            return;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            java.lang.Integer num = adData.getInt("instanceType");
            if (num == null || num.intValue() != 1) {
                this.f3021a.initInterstitialForBidding("", str, jSONObjectA, this);
                return;
            } else {
                this.f3021a.initInterstitial("", str, jSONObjectA, this);
                return;
            }
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            java.lang.Integer num2 = adData.getInt("instanceType");
            if (num2 == null || num2.intValue() != 1) {
                this.f3021a.initBannerForBidding("", str, jSONObjectA, this);
                return;
            } else {
                this.f3021a.initBanners("", str, jSONObjectA, this);
                return;
            }
        }
        if (ad_unit != com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
            return;
        }
        java.lang.Integer num3 = adData.getInt("instanceType");
        if (num3 == null || num3.intValue() != 1) {
            this.f3021a.initNativeAdForBidding("", str, jSONObjectA, this);
        } else {
            this.f3021a.initNativeAds("", str, jSONObjectA, this);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        return this.f3021a.isUsingActivityBeforeImpression(ad_unit);
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface
    public void setAPSData(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, org.json.JSONObject jSONObject) {
        com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapterInterface = this.f3021a;
        if (bannerAdapterInterface instanceof com.json.mediationsdk.SetAPSInterface) {
            ((com.json.mediationsdk.SetAPSInterface) bannerAdapterInterface).setAPSData(ad_unit, jSONObject);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z) {
        this.f3021a.setAdapterDebug(java.lang.Boolean.valueOf(z));
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z) {
        this.f3021a.setConsent(z);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(java.lang.String str, java.util.List<java.lang.String> list) {
        this.f3021a.setMetaData(str, list);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(com.json.mediationsdk.AdapterNetworkData adapterNetworkData) {
        this.f3021a.setNetworkData(adapterNetworkData);
    }
}
