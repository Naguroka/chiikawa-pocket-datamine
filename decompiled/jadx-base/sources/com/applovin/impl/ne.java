package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ne implements com.applovin.mediation.MaxAdListener, com.applovin.mediation.MaxRewardedAdListener, com.applovin.mediation.MaxAdViewAdListener, com.applovin.mediation.MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0040a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.a.InterfaceC0040a f1094a;

    public ne(com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        this.f1094a = interfaceC0040a;
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.fc.d(this.f1094a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.fc.b(this.f1094a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxReward maxReward) {
        com.applovin.impl.fc.a(this.f1094a, maxAd, maxReward);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.fc.c(this.f1094a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.fc.e(this.f1094a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.fc.a((com.applovin.mediation.MaxAdListener) this.f1094a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.fc.a((com.applovin.mediation.MaxAdRevenueListener) this.f1094a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError) {
        com.applovin.impl.fc.a(this.f1094a, maxAd, maxError);
    }

    @Override // com.applovin.mediation.MaxAdRequestListener
    public void onAdRequestStarted(java.lang.String str) {
        com.applovin.impl.fc.a(this.f1094a, str);
    }
}
