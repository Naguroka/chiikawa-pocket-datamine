package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class o extends com.json.mediationsdk.a<com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener> implements com.json.mediationsdk.sdk.InterstitialSmashListener {
    public o(com.json.mediationsdk.AbstractAdapter abstractAdapter, com.json.mediationsdk.model.NetworkSettings networkSettings, java.util.UUID uuid) {
        super(abstractAdapter, networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, uuid);
    }

    @Override // com.json.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        java.lang.Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f2932a.loadInterstitialForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f2932a.loadInterstitial(jSONObject, jSONObject2, this);
        }
    }

    protected boolean a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1158;
    }

    @Override // com.json.mediationsdk.a
    protected com.ironsource.mediationsdk.IronSource.AD_UNIT b() {
        return com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
    }

    @Override // com.json.mediationsdk.a
    protected void b(org.json.JSONObject jSONObject) {
        this.f2932a.disposeInterstitialAd(jSONObject);
    }

    @Override // com.json.mediationsdk.a
    protected boolean c(org.json.JSONObject jSONObject) {
        return this.f2932a.isInterstitialReady(jSONObject);
    }

    @Override // com.json.mediationsdk.a
    protected void f(org.json.JSONObject jSONObject) {
        this.f2932a.showInterstitial(jSONObject, this);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdClicked();
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdClosed();
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdLoadFailed(a(ironSourceError) ? com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdOpened();
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdLoadSuccess();
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdShowSuccess();
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }
}
