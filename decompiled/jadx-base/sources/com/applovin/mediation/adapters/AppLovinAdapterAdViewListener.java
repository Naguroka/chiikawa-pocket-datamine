package com.applovin.mediation.adapters;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdapterAdViewListener implements com.applovin.impl.qb, com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener, com.applovin.adview.AppLovinAdViewEventListener {
    private final com.applovin.mediation.MaxAdFormat adFormat;
    private final com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener listener;
    private final com.applovin.mediation.adapters.AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterAdViewListener(com.applovin.mediation.adapters.AppLovinMediationAdapter appLovinMediationAdapter, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener maxAdViewAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.adFormat = maxAdFormat;
        this.listener = maxAdViewAdapterListener;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log(this.adFormat.getLabel() + " ad clicked");
        this.listener.onAdViewAdClicked(com.applovin.mediation.adapters.AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        this.parentAdapter.log(this.adFormat.getLabel() + " ad collapsed");
        this.listener.onAdViewAdCollapsed();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log(this.adFormat.getLabel() + " ad shown");
        this.listener.onAdViewAdDisplayed();
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.adview.AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        this.parentAdapter.log(this.adFormat.getLabel() + " failed to display with error code: " + appLovinAdViewDisplayErrorCode);
        this.listener.onAdViewAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log(this.adFormat.getLabel() + " ad hidden");
        this.listener.onAdViewAdHidden(com.applovin.mediation.adapters.AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        this.parentAdapter.log(this.adFormat.getLabel() + " ad left application");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.adview.AppLovinAdView appLovinAdView) {
        this.parentAdapter.log(this.adFormat.getLabel() + " ad expanded");
        this.listener.onAdViewAdExpanded();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(final com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.log(this.adFormat.getLabel() + " ad loaded");
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.mediation.adapters.AppLovinAdapterAdViewListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m684x4399a473(appLovinAd);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new com.applovin.impl.sdk.AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.qb
    public void failedToReceiveAdV2(com.applovin.impl.sdk.AppLovinError appLovinError) {
        com.applovin.mediation.adapter.MaxAdapterError maxError = com.applovin.mediation.adapters.AppLovinMediationAdapter.toMaxError(appLovinError);
        this.parentAdapter.log(this.adFormat.getLabel() + " ad failed to load with error: " + maxError);
        this.listener.onAdViewAdLoadFailed(maxError);
    }

    /* JADX INFO: renamed from: lambda$adReceived$0$com-applovin-mediation-adapters-AppLovinAdapterAdViewListener, reason: not valid java name */
    /* synthetic */ void m684x4399a473(com.applovin.sdk.AppLovinAd appLovinAd) {
        this.parentAdapter.loadedAdView = new com.applovin.adview.AppLovinAdView(this.parentAdapter.getWrappingSdk(), appLovinAd.getSize(), this.parentAdapter.getApplicationContext());
        this.parentAdapter.loadedAdView.setAdDisplayListener(this);
        this.parentAdapter.loadedAdView.setAdClickListener(this);
        this.parentAdapter.loadedAdView.setAdViewEventListener(this);
        this.listener.onAdViewAdLoaded(this.parentAdapter.loadedAdView);
        this.parentAdapter.loadedAdView.renderAd(appLovinAd);
    }
}
