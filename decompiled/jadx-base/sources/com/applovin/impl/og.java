package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class og extends com.applovin.impl.lg {
    public og(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.lg
    protected com.iab.omid.library.applovin.adsession.AdSessionConfiguration a() {
        try {
            return com.iab.omid.library.applovin.adsession.AdSessionConfiguration.createAdSessionConfiguration(com.iab.omid.library.applovin.adsession.CreativeType.NATIVE_DISPLAY, com.iab.omid.library.applovin.adsession.ImpressionType.BEGIN_TO_RENDER, com.iab.omid.library.applovin.adsession.Owner.NATIVE, com.iab.omid.library.applovin.adsession.Owner.NONE, false);
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.lg
    protected com.iab.omid.library.applovin.adsession.AdSessionContext a(android.webkit.WebView webView) {
        try {
            return com.iab.omid.library.applovin.adsession.AdSessionContext.createNativeAdSessionContext(this.b.V().b(), this.b.V().a(), this.f993a.getOpenMeasurementVerificationScriptResources(), this.f993a.getOpenMeasurementContentUrl(), this.f993a.getOpenMeasurementCustomReferenceData());
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
