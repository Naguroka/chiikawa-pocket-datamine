package com.google.ads.mediation.unity;

/* JADX INFO: loaded from: classes4.dex */
class UnityBannerViewWrapper {
    private final com.unity3d.services.banners.BannerView bannerView;

    UnityBannerViewWrapper(com.unity3d.services.banners.BannerView bannerView) {
        this.bannerView = bannerView;
    }

    public void setListener(com.unity3d.services.banners.BannerView.IListener iListener) {
        this.bannerView.setListener(iListener);
    }

    public void load(com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions) {
        this.bannerView.load(unityAdsLoadOptions);
    }

    public com.unity3d.services.banners.BannerView getBannerView() {
        return this.bannerView;
    }
}
