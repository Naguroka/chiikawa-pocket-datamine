package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class x9 extends com.applovin.impl.n9 {
    @Override // com.applovin.impl.n9
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public x9(com.applovin.impl.sdk.ad.b bVar, android.app.Activity activity, com.applovin.impl.sdk.j jVar) {
        super(bVar, activity, jVar);
    }

    public void a(android.widget.ImageView imageView, com.applovin.impl.adview.g gVar, com.applovin.impl.adview.g gVar2, com.applovin.impl.o oVar, com.applovin.impl.adview.k kVar, com.applovin.adview.AppLovinAdView appLovinAdView, android.view.ViewGroup viewGroup) {
        this.d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.c.l(), (this.c.I0() ? 3 : 5) | 48, gVar);
        }
        if (gVar2 != null) {
            a(this.c.l(), (this.c.A0() ? 3 : 5) | 48, gVar2);
        }
        if (imageView != null) {
            int iDpToPx = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.q2)).intValue());
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(iDpToPx, iDpToPx, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.s2)).intValue());
            int iDpToPx2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.r2)).intValue());
            layoutParams.setMargins(iDpToPx2, iDpToPx2, iDpToPx2, iDpToPx2);
            this.d.addView(imageView, layoutParams);
        }
        if (oVar != null) {
            this.d.addView(oVar, this.e);
        }
        if (kVar != null) {
            this.d.addView(kVar, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        if (viewGroup != null) {
            viewGroup.addView(this.d);
        } else {
            this.b.setContentView(this.d);
        }
    }
}
