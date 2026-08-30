package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pm extends com.applovin.impl.hm {
    private final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener j;

    public pm(com.applovin.impl.h0 h0Var, java.lang.String str, com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(h0Var, str, jVar);
        this.j = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.hm
    protected java.lang.String f() {
        return com.applovin.impl.e4.e(this.f1547a);
    }

    @Override // com.applovin.impl.hm
    protected java.lang.String e() {
        return com.applovin.impl.e4.d(this.f1547a);
    }

    @Override // com.applovin.impl.hm
    protected void a(int i, java.lang.String str) {
        super.a(i, str);
        this.j.onNativeAdLoadFailed(new com.applovin.impl.sdk.AppLovinError(i, str));
    }

    @Override // com.applovin.impl.hm
    protected com.applovin.impl.yl a(org.json.JSONObject jSONObject) {
        return new com.applovin.impl.ym(jSONObject, this.j, this.f1547a);
    }
}
