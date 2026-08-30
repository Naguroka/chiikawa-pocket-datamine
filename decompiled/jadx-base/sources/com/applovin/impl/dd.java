package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class dd extends com.applovin.mediation.nativeAds.MaxNativeAdListener implements com.applovin.mediation.MaxAdRevenueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f720a;
    private final com.applovin.mediation.nativeAds.MaxNativeAdLoader b;
    private final java.util.Queue c = new java.util.LinkedList();
    private boolean d = false;
    private final java.lang.Object f = new java.lang.Object();
    private com.applovin.impl.dd.a g;

    public interface a {
        void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd);

        void onNativeAdClicked(com.applovin.mediation.MaxAd maxAd);

        void onNativeAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError);

        void onNativeAdLoaded();
    }

    public dd(com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings maxAdPlacerSettings, android.content.Context context, com.applovin.impl.dd.a aVar) {
        this.f720a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.g = aVar;
        com.applovin.mediation.nativeAds.MaxNativeAdLoader maxNativeAdLoader = new com.applovin.mediation.nativeAds.MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, com.applovin.impl.mediation.d.b.NATIVE_AD_PLACER);
    }

    public void c() {
        this.g = null;
        a();
        this.b.destroy();
    }

    public boolean d() {
        boolean z;
        synchronized (this.f) {
            z = !this.c.isEmpty();
        }
        return z;
    }

    public void e() {
        synchronized (this.f) {
            if (!this.d && this.c.size() < this.f720a) {
                this.d = true;
                this.b.loadAd();
            }
        }
    }

    public com.applovin.mediation.MaxAd b() {
        com.applovin.mediation.MaxAd maxAd;
        synchronized (this.f) {
            maxAd = null;
            while (!this.c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = (com.applovin.mediation.MaxAd) this.c.remove();
            }
            e();
        }
        return maxAd;
    }

    public void a() {
        synchronized (this.f) {
            java.util.Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a((com.applovin.mediation.MaxAd) it.next());
            }
            this.c.clear();
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView, com.applovin.mediation.MaxAd maxAd) {
        synchronized (this.f) {
            this.c.add(maxAd);
            this.d = false;
            e();
        }
        com.applovin.impl.dd.a aVar = this.g;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
        com.applovin.impl.dd.a aVar = this.g;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.dd.a aVar = this.g;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.dd.a aVar = this.g;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    public void a(com.applovin.mediation.MaxAd maxAd) {
        this.b.destroy(maxAd);
    }

    public boolean a(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView, com.applovin.mediation.MaxAd maxAd) {
        return this.b.render(maxNativeAdView, maxAd);
    }
}
