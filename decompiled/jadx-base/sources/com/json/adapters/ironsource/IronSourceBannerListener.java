package com.json.adapters.ironsource;

/* JADX INFO: loaded from: classes5.dex */
class IronSourceBannerListener implements com.json.fo {
    private java.lang.ref.WeakReference<com.json.adapters.ironsource.IronSourceAdapter> mAdapter;
    private final java.lang.String mDemandSourceName;
    private final com.json.mediationsdk.sdk.BannerSmashListener mListener;

    IronSourceBannerListener(com.json.adapters.ironsource.IronSourceAdapter ironSourceAdapter, com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener, java.lang.String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new java.lang.ref.WeakReference<>(ironSourceAdapter);
    }

    @Override // com.json.fo
    public void onBannerClick() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " bannerListener");
        this.mListener.onBannerAdClicked();
    }

    @Override // com.json.fo
    public void onBannerInitFailed(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " bannerListener");
    }

    @Override // com.json.fo
    public void onBannerInitSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " bannerListener");
    }

    @Override // com.json.fo
    public void onBannerLoadFail(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " bannerListener");
        this.mListener.onBannerAdLoadFailed(com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    @Override // com.json.fo
    public void onBannerLoadSuccess(com.json.mj mjVar, com.json.qg qgVar) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " bannerListener");
        if (this.mAdapter.get() != null) {
            if (qgVar == null) {
                this.mListener.onBannerAdLoadFailed(com.json.mediationsdk.utils.ErrorBuilder.adContainerIsNull(this.mAdapter.get().getProviderName()));
                return;
            }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.json.mj>> concurrentHashMap = this.mAdapter.get().mDemandSourceToBnAd;
            if (concurrentHashMap.get(this.mDemandSourceName) == null) {
                concurrentHashMap.put(this.mDemandSourceName, new java.util.ArrayList<>());
            }
            concurrentHashMap.get(this.mDemandSourceName).add(mjVar);
            com.json.og size = qgVar.getSize();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(size.c(), size.a());
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(qgVar, layoutParams);
        }
    }

    @Override // com.json.fo
    public void onBannerShowSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " onBannerShowSuccess");
        com.json.mediationsdk.sdk.BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
