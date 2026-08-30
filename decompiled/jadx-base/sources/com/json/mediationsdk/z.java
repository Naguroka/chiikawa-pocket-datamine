package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class z extends com.json.mediationsdk.a<com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener> implements com.json.mediationsdk.sdk.RewardedVideoSmashListener {
    public z(com.json.mediationsdk.AbstractAdapter abstractAdapter, com.json.mediationsdk.model.NetworkSettings networkSettings, java.util.UUID uuid) {
        super(abstractAdapter, networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, uuid);
    }

    private boolean a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1057;
    }

    @Override // com.json.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        java.lang.Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f2932a.loadRewardedVideoForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f2932a.loadRewardedVideo(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.json.mediationsdk.a
    protected com.ironsource.mediationsdk.IronSource.AD_UNIT b() {
        return com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    @Override // com.json.mediationsdk.a
    protected void b(org.json.JSONObject jSONObject) {
        this.f2932a.disposeRewardedVideoAd(jSONObject);
    }

    protected boolean b(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1058;
    }

    @Override // com.json.mediationsdk.a
    protected boolean c(org.json.JSONObject jSONObject) {
        return this.f2932a.isRewardedVideoAvailable(jSONObject);
    }

    @Override // com.json.mediationsdk.a
    protected void f(org.json.JSONObject jSONObject) {
        this.f2932a.showRewardedVideo(jSONObject, this);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdClicked();
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdClosed();
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdEnded();
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdOpened();
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdShowSuccess();
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdRewarded();
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdStarted();
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdVisible();
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a("available = " + z));
        if (this.b.get() != null) {
            if (z) {
                ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdLoadSuccess();
            } else {
                ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdLoadFailed(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, "");
            }
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType;
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            if (b(ironSourceError)) {
                adapterErrorType = com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL;
            } else {
                adapterErrorType = a(ironSourceError) ? com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            }
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdLoadFailed(adapterErrorType, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.json.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdLoadSuccess();
        }
    }
}
