package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1136a;
    private final com.amazon.device.ads.DTBAdSize b;

    private enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public p0(java.lang.String str, org.json.JSONObject jSONObject, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        this.f1136a = str;
        this.b = a(com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "type", a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    public com.amazon.device.ads.DTBAdSize a() {
        return this.b;
    }

    private com.applovin.impl.p0.a a(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? com.applovin.impl.p0.a.DISPLAY : com.applovin.impl.p0.a.INTERSTITIAL;
    }

    private com.amazon.device.ads.DTBAdSize a(int i, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str) {
        try {
            if (com.applovin.impl.p0.a.VIDEO.ordinal() == i) {
                return new com.amazon.device.ads.DTBAdSize.DTBVideo(320, 480, str);
            }
            if (com.applovin.impl.p0.a.DISPLAY.ordinal() == i) {
                return new com.amazon.device.ads.DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (com.applovin.impl.p0.a.INTERSTITIAL.ordinal() == i) {
                return new com.amazon.device.ads.DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
