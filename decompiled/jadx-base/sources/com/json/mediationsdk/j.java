package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class j extends com.json.mediationsdk.a<com.json.mediationsdk.adunit.adapter.listener.BannerAdListener> implements com.json.mediationsdk.sdk.BannerSmashListener {
    public j(com.json.mediationsdk.AbstractAdapter abstractAdapter, com.json.mediationsdk.model.NetworkSettings networkSettings, java.util.UUID uuid) {
        super(abstractAdapter, networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, uuid);
    }

    @Override // com.json.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject) {
        this.f2932a.destroyBanner(jSONObject);
    }

    @Override // com.json.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        java.lang.Integer num = adData.getInt("instanceType");
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = (com.json.mediationsdk.IronSourceBannerLayout) adData.getAdUnitData().get("bannerLayout");
        if (num == null || num.intValue() != 1) {
            this.f2932a.loadBannerForBidding(jSONObject, jSONObject2, adData.getServerData(), ironSourceBannerLayout, this);
        } else {
            this.f2932a.loadBanner(jSONObject, jSONObject2, ironSourceBannerLayout, this);
        }
    }

    protected boolean a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 606;
    }

    @Override // com.json.mediationsdk.a
    protected com.ironsource.mediationsdk.IronSource.AD_UNIT b() {
        return com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
    }

    @Override // com.json.mediationsdk.a
    public void d(org.json.JSONObject jSONObject) {
        this.f2932a.onBannerViewBound(jSONObject);
    }

    @Override // com.json.mediationsdk.a
    public void e(org.json.JSONObject jSONObject) {
        this.f2932a.onBannerViewWillBind(jSONObject);
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdClicked();
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdLeftApplication();
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdLoadFailed(a(ironSourceError) ? com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdLoadSuccess(view, layoutParams);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdScreenDismissed();
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdScreenPresented();
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdOpened();
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
    }
}
