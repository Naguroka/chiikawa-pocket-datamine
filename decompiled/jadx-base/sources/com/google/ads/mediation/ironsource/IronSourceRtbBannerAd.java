package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceRtbBannerAd implements com.google.android.gms.ads.mediation.MediationBannerAd, com.unity3d.ironsourceads.banner.BannerAdLoaderListener, com.unity3d.ironsourceads.banner.BannerAdViewListener {
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback adLifecycleCallback;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> adLoadCallback;
    private final com.google.android.gms.ads.AdSize adSize;
    private final java.lang.String bidToken;
    private final android.content.Context context;
    private final java.lang.String instanceID;
    private android.widget.FrameLayout ironSourceAdView;
    private final java.lang.String watermark;

    public IronSourceRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        this.instanceID = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "");
        this.context = mediationBannerAdConfiguration.getContext();
        this.adSize = mediationBannerAdConfiguration.getAdSize();
        this.adLoadCallback = mediationAdLoadCallback;
        this.watermark = mediationBannerAdConfiguration.getWatermark();
        this.bidToken = mediationBannerAdConfiguration.getBidResponse();
    }

    public void loadRtbAd() {
        if (android.text.TextUtils.isEmpty(this.instanceID)) {
            this.adLoadCallback.onFailure(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.buildAdErrorAdapterDomain(101, "Missing or invalid instance ID."));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.applovin.mediation.AppLovinExtras.Keys.KEY_WATERMARK, this.watermark);
        android.content.Context context = this.context;
        com.unity3d.ironsourceads.banner.BannerAdRequest bannerAdRequestBuild = new com.unity3d.ironsourceads.banner.BannerAdRequest.Builder(context, this.instanceID, this.bidToken, com.google.ads.mediation.ironsource.IronSourceAdapterUtils.getAdSizeFromGoogleAdSize(context, this.adSize)).withExtraParams(bundle).build();
        this.ironSourceAdView = new android.widget.FrameLayout(this.context);
        com.unity3d.ironsourceads.banner.BannerAdLoader.loadAd(bannerAdRequestBuild, this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        return this.ironSourceAdView;
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
    public void onBannerAdLoaded(com.unity3d.ironsourceads.banner.BannerAdView bannerAdView) {
        if (this.ironSourceAdView == null || this.adLoadCallback == null) {
            return;
        }
        bannerAdView.setListener(this);
        this.ironSourceAdView.addView(bannerAdView);
        this.adLifecycleCallback = this.adLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
    public void onBannerAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        if (this.adLoadCallback == null) {
            return;
        }
        this.adLoadCallback.onFailure(new com.google.android.gms.ads.AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), com.google.ads.mediation.ironsource.IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN));
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
    public void onBannerAdClicked(com.unity3d.ironsourceads.banner.BannerAdView bannerAdView) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.adLifecycleCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.onAdOpened();
        this.adLifecycleCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
    public void onBannerAdShown(com.unity3d.ironsourceads.banner.BannerAdView bannerAdView) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.adLifecycleCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
