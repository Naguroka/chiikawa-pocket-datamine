package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class qm extends com.applovin.impl.om {
    private final com.applovin.impl.w k;

    @Override // com.applovin.impl.hm
    protected java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("adtoken", this.k.b());
        map.put("adtoken_prefix", this.k.d());
        return map;
    }

    public qm(com.applovin.impl.w wVar, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(com.applovin.impl.h0.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", jVar);
        this.k = wVar;
    }
}
