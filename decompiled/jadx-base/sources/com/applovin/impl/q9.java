package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class q9 extends com.applovin.impl.n9 {
    @Override // com.applovin.impl.n9
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public q9(com.applovin.impl.sdk.ad.b bVar, android.app.Activity activity, com.applovin.impl.sdk.j jVar) {
        super(bVar, activity, jVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, com.applovin.adview.AppLovinAdView appLovinAdView, android.view.ViewGroup viewGroup) {
        this.d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.c.l(), (this.c.A0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.d.addView(kVar, this.e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.d);
        } else {
            this.b.setContentView(this.d);
        }
    }
}
