package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class o0 implements com.amazon.device.ads.DTBAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.mediation.MaxAdFormat f1106a;
    private final com.applovin.impl.o0.a b;
    private com.amazon.device.ads.DTBAdRequest c;

    public interface a {
        void onAdLoadFailed(com.amazon.device.ads.AdError adError, com.applovin.mediation.MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(com.amazon.device.ads.DTBAdResponse dTBAdResponse, com.applovin.mediation.MaxAdFormat maxAdFormat);
    }

    public o0(com.applovin.impl.p0 p0Var, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.o0.a aVar) {
        this(java.util.Arrays.asList(p0Var.a()), maxAdFormat, aVar);
    }

    public void a() {
        com.amazon.device.ads.DTBAdRequest dTBAdRequest = this.c;
        if (dTBAdRequest == null) {
            this.b.onAdLoadFailed(null, this.f1106a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public o0(java.util.List list, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.o0.a aVar) {
        this.f1106a = maxAdFormat;
        this.b = aVar;
        try {
            com.amazon.device.ads.DTBAdSize[] dTBAdSizeArr = new com.amazon.device.ads.DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                java.lang.Object obj = list.get(i);
                if (obj instanceof com.amazon.device.ads.DTBAdSize) {
                    dTBAdSizeArr[i] = (com.amazon.device.ads.DTBAdSize) obj;
                }
            }
            com.amazon.device.ads.DTBAdRequest dTBAdRequest = new com.amazon.device.ads.DTBAdRequest();
            this.c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void onSuccess(com.amazon.device.ads.DTBAdResponse dTBAdResponse) {
        this.b.onAdResponseLoaded(dTBAdResponse, this.f1106a);
    }

    public void onFailure(com.amazon.device.ads.AdError adError) {
        this.b.onAdLoadFailed(adError, this.f1106a);
    }
}
