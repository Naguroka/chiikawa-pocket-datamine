package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class nm extends com.applovin.impl.pm {
    private final com.applovin.impl.w k;

    @Override // com.applovin.impl.hm
    protected java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("adtoken", this.k.b());
        map.put("adtoken_prefix", this.k.d());
        return map;
    }

    public nm(com.applovin.impl.w wVar, com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(com.applovin.impl.h0.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, jVar);
        this.k = wVar;
    }
}
