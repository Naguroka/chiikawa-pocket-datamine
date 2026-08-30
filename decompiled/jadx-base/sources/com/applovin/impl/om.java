package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class om extends com.applovin.impl.hm {
    private final com.applovin.sdk.AppLovinAdLoadListener j;

    public om(com.applovin.impl.h0 h0Var, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        this(h0Var, appLovinAdLoadListener, "TaskFetchNextAd", jVar);
    }

    @Override // com.applovin.impl.hm
    protected java.lang.String f() {
        return com.applovin.impl.e4.b(this.f1547a);
    }

    @Override // com.applovin.impl.hm
    protected java.lang.String e() {
        return com.applovin.impl.e4.a(this.f1547a);
    }

    @Override // com.applovin.impl.hm
    protected void a(int i, java.lang.String str) {
        super.a(i, str);
        com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (appLovinAdLoadListener instanceof com.applovin.impl.qb) {
            ((com.applovin.impl.qb) this.j).failedToReceiveAdV2(new com.applovin.impl.sdk.AppLovinError(i, str));
        } else {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    public om(com.applovin.impl.h0 h0Var, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, java.lang.String str, com.applovin.impl.sdk.j jVar) {
        super(h0Var, str, jVar);
        this.j = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.hm
    protected com.applovin.impl.yl a(org.json.JSONObject jSONObject) {
        return new com.applovin.impl.um(jSONObject, this.h, this.j, this.f1547a);
    }
}
