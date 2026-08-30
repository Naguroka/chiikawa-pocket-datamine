package com.applovin.mediation.hybridAds;

/* JADX INFO: loaded from: classes3.dex */
public class MaxHybridMRecAdActivity extends com.applovin.impl.ad {
    private android.view.View f;

    @Override // com.applovin.impl.ad, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        a(this.f, "MaxHybridMRecAdActivity");
    }

    public void a(com.applovin.impl.bd bdVar, android.view.View view, com.applovin.impl.sdk.j jVar, com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener) {
        super.a(bdVar, jVar, maxAdapterListener);
        this.f = view;
    }
}
