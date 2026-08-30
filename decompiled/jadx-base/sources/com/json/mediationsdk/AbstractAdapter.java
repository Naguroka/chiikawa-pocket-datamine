package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractAdapter implements com.json.mediationsdk.sdk.RewardedVideoAdapterInterface, com.json.mediationsdk.sdk.InterstitialAdapterInterface, com.json.mediationsdk.sdk.BannerAdapterInterface, com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface {
    private static java.lang.Boolean mAdapterDebug;
    private java.lang.String mPluginType;
    private final java.lang.String mProviderName;
    private java.lang.String mProviderNetworkKey;
    private final java.util.Map<com.ironsource.mediationsdk.IronSource.AD_UNIT, com.json.mediationsdk.sdk.AdUnitAdapterInterface> mAdUnitAdapters = new java.util.HashMap();
    protected com.json.mediationsdk.LoadWhileShowSupportState mLWSSupportState = com.json.mediationsdk.LoadWhileShowSupportState.NONE;
    protected com.json.mediationsdk.LoadWhileShowSupportState mBannerLoadWhileShowSupportState = com.json.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;

    public AbstractAdapter(java.lang.String str) {
        this.mProviderName = str;
    }

    private com.json.mediationsdk.sdk.BannerAdapterInterface getBannerAdapter() {
        return (com.json.mediationsdk.sdk.BannerAdapterInterface) this.mAdUnitAdapters.get(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER);
    }

    private com.json.mediationsdk.sdk.InterstitialAdapterInterface getInterstitialAdapter() {
        return (com.json.mediationsdk.sdk.InterstitialAdapterInterface) this.mAdUnitAdapters.get(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL);
    }

    private com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface getNativeAdAdapter() {
        return (com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface) this.mAdUnitAdapters.get(com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD);
    }

    private com.json.mediationsdk.sdk.RewardedVideoAdapterInterface getRewardedVideoAdapter() {
        return (com.json.mediationsdk.sdk.RewardedVideoAdapterInterface) this.mAdUnitAdapters.get(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    public static void postBackgroundThread(java.lang.Runnable runnable) {
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postAdapterBackgroundTask(runnable);
    }

    public static void postOnUIThread(java.lang.Runnable runnable) {
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable);
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
        if (bannerAdapter != null) {
            bannerAdapter.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> bannerBiddingData = getBannerBiddingData(jSONObject, jSONObject2);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        com.json.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapter = getInterstitialAdapter();
        if (interstitialAdapter != null) {
            interstitialAdapter.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> interstitialBiddingData = getInterstitialBiddingData(jSONObject, jSONObject2);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void collectNativeAdBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface nativeAdAdapter = getNativeAdAdapter();
        if (nativeAdAdapter != null) {
            nativeAdAdapter.collectNativeAdBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> nativeAdBiddingData = getNativeAdBiddingData(jSONObject, jSONObject2);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapter = getRewardedVideoAdapter();
        if (rewardedVideoAdapter != null) {
            rewardedVideoAdapter.collectRewardedVideoBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(jSONObject, jSONObject2);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyBanner(org.json.JSONObject jSONObject) {
        com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
        if (bannerAdapter != null) {
            bannerAdapter.destroyBanner(jSONObject);
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(org.json.JSONObject jSONObject) {
        com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface nativeAdAdapter = getNativeAdAdapter();
        if (nativeAdAdapter != null) {
            nativeAdAdapter.destroyNativeAd(jSONObject);
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialAdapterInterface
    public void disposeInterstitialAd(org.json.JSONObject jSONObject) {
        com.json.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapter = getInterstitialAdapter();
        if (interstitialAdapter != null) {
            interstitialAdapter.disposeInterstitialAd(jSONObject);
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void disposeRewardedVideoAd(org.json.JSONObject jSONObject) {
        com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapter = getRewardedVideoAdapter();
        if (rewardedVideoAdapter != null) {
            rewardedVideoAdapter.disposeRewardedVideoAd(jSONObject);
        }
    }

    public void earlyInit(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int i) {
        com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
        if (bannerAdapter != null) {
            return bannerAdapter.getAdaptiveHeight(i);
        }
        return -1;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getBannerBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
        if (bannerAdapter != null) {
            return bannerAdapter.getBannerBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public com.json.mediationsdk.LoadWhileShowSupportState getBannerLoadWhileShowSupportState(org.json.JSONObject jSONObject) {
        return this.mBannerLoadWhileShowSupportState;
    }

    public abstract java.lang.String getCoreSDKVersion();

    public java.lang.String getDynamicUserId() {
        return com.json.mediationsdk.p.m().l();
    }

    public java.util.Map<java.lang.String, java.lang.Object> getInterstitialBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.json.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapter = getInterstitialAdapter();
        if (interstitialAdapter != null) {
            return interstitialAdapter.getInterstitialBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public com.json.mediationsdk.LoadWhileShowSupportState getLoadWhileShowSupportState(org.json.JSONObject jSONObject) {
        return this.mLWSSupportState;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getNativeAdBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface nativeAdAdapter = getNativeAdAdapter();
        if (nativeAdAdapter != null) {
            return nativeAdAdapter.getNativeAdBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public java.lang.String getPluginType() {
        return this.mPluginType;
    }

    public java.lang.String getProviderName() {
        return this.mProviderName;
    }

    public java.lang.String getProviderNetworkKey() {
        return this.mProviderNetworkKey;
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getRewardedVideoBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapter = getRewardedVideoAdapter();
        if (rewardedVideoAdapter != null) {
            return rewardedVideoAdapter.getRewardedVideoBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public abstract java.lang.String getVersion();

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapter = getRewardedVideoAdapter();
            if (rewardedVideoAdapter != null) {
                rewardedVideoAdapter.initAndLoadRewardedVideo(str, str2, jSONObject, jSONObject2, rewardedVideoSmashListener);
            } else if (rewardedVideoSmashListener != null) {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        } catch (java.lang.Error e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    public void initBannerForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        try {
            com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
            if (bannerAdapter != null) {
                bannerAdapter.initBannerForBidding(str, str2, jSONObject, bannerSmashListener);
            } else if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(new com.json.mediationsdk.logger.IronSourceError(510, "method not implemented"));
            }
        } catch (java.lang.Error e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            bannerSmashListener.onBannerInitFailed(new com.json.mediationsdk.logger.IronSourceError(510, "error - " + e.getMessage()));
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        try {
            com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
            if (bannerAdapter != null) {
                bannerAdapter.initBanners(str, str2, jSONObject, bannerSmashListener);
            } else if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(new com.json.mediationsdk.logger.IronSourceError(510, "method not implemented"));
            }
        } catch (java.lang.Error e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            bannerSmashListener.onBannerInitFailed(new com.json.mediationsdk.logger.IronSourceError(510, "error - " + e.getMessage()));
        }
    }

    public void initInterstitial(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        try {
            com.json.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapter = getInterstitialAdapter();
            if (interstitialAdapter != null) {
                interstitialAdapter.initInterstitial(str, str2, jSONObject, interstitialSmashListener);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new com.json.mediationsdk.logger.IronSourceError(510, "method not implemented"));
            }
        } catch (java.lang.Error e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            interstitialSmashListener.onInterstitialInitFailed(new com.json.mediationsdk.logger.IronSourceError(510, "error - " + e.getMessage()));
        }
    }

    public void initInterstitialForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        try {
            com.json.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapter = getInterstitialAdapter();
            if (interstitialAdapter != null) {
                interstitialAdapter.initInterstitialForBidding(str, str2, jSONObject, interstitialSmashListener);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new com.json.mediationsdk.logger.IronSourceError(510, "method not implemented"));
            }
        } catch (java.lang.Error e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            interstitialSmashListener.onInterstitialInitFailed(new com.json.mediationsdk.logger.IronSourceError(510, "error - " + e.getMessage()));
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener) {
        com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface nativeAdAdapter = getNativeAdAdapter();
        if (nativeAdAdapter != null) {
            nativeAdAdapter.initNativeAdForBidding(str, str2, jSONObject, nativeAdSmashListener);
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAds(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener) {
        com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface nativeAdAdapter = getNativeAdAdapter();
        if (nativeAdAdapter != null) {
            nativeAdAdapter.initNativeAds(str, str2, jSONObject, nativeAdSmashListener);
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapter = getRewardedVideoAdapter();
        if (rewardedVideoAdapter != null) {
            rewardedVideoAdapter.initRewardedVideoForDemandOnly(str, str2, jSONObject, rewardedVideoSmashListener);
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapter = getRewardedVideoAdapter();
            if (rewardedVideoAdapter != null) {
                rewardedVideoAdapter.initRewardedVideoWithCallback(str, str2, jSONObject, rewardedVideoSmashListener);
            } else if (rewardedVideoSmashListener != null) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(new com.json.mediationsdk.logger.IronSourceError(510, "method not implemented"));
            }
        } catch (java.lang.Error e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoInitFailed(new com.json.mediationsdk.logger.IronSourceError(510, "error - " + e.getMessage()));
        }
    }

    protected boolean isAdaptersDebugEnabled() {
        java.lang.Boolean bool = mAdapterDebug;
        return bool != null && bool.booleanValue();
    }

    public boolean isInterstitialReady(org.json.JSONObject jSONObject) {
        com.json.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapter = getInterstitialAdapter();
        if (interstitialAdapter != null) {
            return interstitialAdapter.isInterstitialReady(jSONObject);
        }
        return false;
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(org.json.JSONObject jSONObject) {
        com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapter = getRewardedVideoAdapter();
        if (rewardedVideoAdapter != null) {
            return rewardedVideoAdapter.isRewardedVideoAvailable(jSONObject);
        }
        return false;
    }

    public boolean isUsingActivityBeforeImpression(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        return true;
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
        if (bannerAdapter != null) {
            bannerAdapter.loadBanner(jSONObject, jSONObject2, ironSourceBannerLayout, bannerSmashListener);
        }
    }

    public void loadBannerForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
        if (bannerAdapter != null) {
            bannerAdapter.loadBannerForBidding(jSONObject, jSONObject2, str, ironSourceBannerLayout, bannerSmashListener);
        }
    }

    public void loadBannerForDemandOnlyForBidding(org.json.JSONObject jSONObject, java.lang.String str, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
        if (bannerAdapter != null) {
            bannerAdapter.loadBannerForDemandOnlyForBidding(jSONObject, str, iSDemandOnlyBannerLayout, bannerSmashListener);
        }
    }

    public void loadInterstitial(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        com.json.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapter = getInterstitialAdapter();
        if (interstitialAdapter != null) {
            interstitialAdapter.loadInterstitial(jSONObject, jSONObject2, interstitialSmashListener);
        }
    }

    public void loadInterstitialForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        com.json.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapter = getInterstitialAdapter();
        if (interstitialAdapter != null) {
            interstitialAdapter.loadInterstitialForBidding(jSONObject, jSONObject2, str, interstitialSmashListener);
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAd(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener) {
        com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface nativeAdAdapter = getNativeAdAdapter();
        if (nativeAdAdapter != null) {
            nativeAdAdapter.loadNativeAd(jSONObject, jSONObject2, nativeAdSmashListener);
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener) {
        com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface nativeAdAdapter = getNativeAdAdapter();
        if (nativeAdAdapter != null) {
            nativeAdAdapter.loadNativeAdForBidding(jSONObject, jSONObject2, str, nativeAdSmashListener);
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapter = getRewardedVideoAdapter();
        if (rewardedVideoAdapter != null) {
            rewardedVideoAdapter.loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapter = getRewardedVideoAdapter();
        if (rewardedVideoAdapter != null) {
            rewardedVideoAdapter.loadRewardedVideoForBidding(jSONObject, jSONObject2, str, rewardedVideoSmashListener);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(org.json.JSONObject jSONObject) {
        com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
        if (bannerAdapter != null) {
            bannerAdapter.onBannerViewBound(jSONObject);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(org.json.JSONObject jSONObject) {
        com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapter = getBannerAdapter();
        if (bannerAdapter != null) {
            bannerAdapter.onBannerViewWillBind(jSONObject);
        }
    }

    @Override // com.json.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(java.lang.String str) {
        java.util.Iterator<com.json.mediationsdk.sdk.AdUnitAdapterInterface> it = this.mAdUnitAdapters.values().iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed(str);
        }
    }

    @Override // com.json.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        java.util.Iterator<com.json.mediationsdk.sdk.AdUnitAdapterInterface> it = this.mAdUnitAdapters.values().iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
    }

    @Override // com.json.mediationsdk.sdk.ReleaseMemoryAdapterInterface
    public void releaseMemory(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, org.json.JSONObject jSONObject) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + ad_unit);
        com.json.mediationsdk.sdk.AdUnitAdapterInterface adUnitAdapterInterface = this.mAdUnitAdapters.get(ad_unit);
        if (adUnitAdapterInterface == null) {
            ironLog.verbose(ad_unit + " adapter is null");
        } else {
            adUnitAdapterInterface.releaseMemory(ad_unit, jSONObject);
        }
    }

    protected void setAdapterDebug(java.lang.Boolean bool) {
        mAdapterDebug = bool;
    }

    protected void setBannerAdapter(com.json.mediationsdk.sdk.BannerAdapterInterface bannerAdapterInterface) {
        this.mAdUnitAdapters.put(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, bannerAdapterInterface);
    }

    protected void setConsent(boolean z) {
    }

    protected void setInterstitialAdapter(com.json.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapterInterface) {
        this.mAdUnitAdapters.put(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, interstitialAdapterInterface);
    }

    protected void setMetaData(java.lang.String str, java.util.List<java.lang.String> list) {
    }

    protected void setNativeAdAdapter(com.json.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface nativeAdAdapterInterface) {
        this.mAdUnitAdapters.put(com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD, nativeAdAdapterInterface);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(com.json.mediationsdk.AdapterNetworkData adapterNetworkData) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("setNetworkData not implemented | adapter=" + getClass().getSimpleName() + ", networkData=" + adapterNetworkData);
    }

    public void setNewConsent(boolean z) {
        setConsent(z);
    }

    public void setPluginData(java.lang.String str) {
        this.mPluginType = str;
    }

    public void setProviderNetworkKey(java.lang.String str) {
        this.mProviderNetworkKey = str;
    }

    protected void setRewardedVideoAdapter(com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapterInterface) {
        this.mAdUnitAdapters.put(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, rewardedVideoAdapterInterface);
    }

    public void showInterstitial(org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        com.json.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapter = getInterstitialAdapter();
        if (interstitialAdapter != null) {
            interstitialAdapter.showInterstitial(jSONObject, interstitialSmashListener);
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(org.json.JSONObject jSONObject, com.json.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.json.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapter = getRewardedVideoAdapter();
        if (rewardedVideoAdapter != null) {
            rewardedVideoAdapter.showRewardedVideo(jSONObject, rewardedVideoSmashListener);
        }
    }
}
