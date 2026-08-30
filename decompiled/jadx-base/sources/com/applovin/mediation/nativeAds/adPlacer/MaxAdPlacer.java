package com.applovin.mediation.nativeAds.adPlacer;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdPlacer implements com.applovin.impl.dd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.sdk.AppLovinSdkUtils.Size f1596a;
    private com.applovin.mediation.nativeAds.MaxNativeAdViewBinder b;
    private final com.applovin.impl.yc c;
    private final com.applovin.impl.dd d;
    private com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener e;
    protected final com.applovin.impl.sdk.n logger;
    protected final com.applovin.impl.sdk.j sdk;

    public interface Listener {
        void onAdClicked(com.applovin.mediation.MaxAd maxAd);

        void onAdLoaded(int i);

        void onAdRemoved(int i);

        void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd);
    }

    public MaxAdPlacer(com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings maxAdPlacerSettings, android.content.Context context) {
        this(maxAdPlacerSettings, com.applovin.sdk.AppLovinSdk.getInstance(context), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, java.util.Collection collection) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i);
        }
        this.c.a(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.c.a();
        this.d.a();
    }

    public void clearAds() {
        a(this.c.b(), new java.lang.Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    public java.util.Collection<java.lang.Integer> clearTrailingAds(final int i) {
        final java.util.Collection<java.lang.Integer> collectionE = this.c.e(i);
        if (!collectionE.isEmpty()) {
            a(collectionE, new java.lang.Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(i, collectionE);
                }
            });
        }
        return collectionE;
    }

    public void destroy() {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.d.c();
    }

    public long getAdItemId(int i) {
        if (isFilledPosition(i)) {
            return -java.lang.System.identityHashCode(this.c.a(i));
        }
        return 0L;
    }

    public com.applovin.sdk.AppLovinSdkUtils.Size getAdSize(int i, int i2) {
        if (isFilledPosition(i)) {
            com.applovin.sdk.AppLovinSdkUtils.Size size = this.f1596a;
            boolean z = size != com.applovin.sdk.AppLovinSdkUtils.Size.ZERO;
            int iMin = java.lang.Math.min(z ? size.getWidth() : 360, i2);
            com.applovin.impl.ie ieVar = (com.applovin.impl.ie) this.c.a(i);
            if ("small_template_1".equalsIgnoreCase(ieVar.r0())) {
                return new com.applovin.sdk.AppLovinSdkUtils.Size(iMin, z ? this.f1596a.getHeight() : 120);
            }
            if (com.applovin.mediation.nativeAds.MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(ieVar.r0())) {
                return new com.applovin.sdk.AppLovinSdkUtils.Size(iMin, (int) (((double) iMin) / (z ? ((double) this.f1596a.getWidth()) / ((double) this.f1596a.getHeight()) : 1.2d)));
            }
            if (z) {
                return this.f1596a;
            }
            if (ieVar.o0() != null) {
                android.view.View mainView = ieVar.o0().getMainView();
                return new com.applovin.sdk.AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return com.applovin.sdk.AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i) {
        return this.c.b(i);
    }

    public int getAdjustedPosition(int i) {
        return this.c.c(i);
    }

    public int getOriginalPosition(int i) {
        return this.c.d(i);
    }

    public void insertItem(int i) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i);
        }
        this.c.f(i);
    }

    public boolean isAdPosition(int i) {
        return this.c.g(i);
    }

    public boolean isFilledPosition(int i) {
        return this.c.h(i);
    }

    public void loadAds() {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.d.e();
    }

    public void moveItem(int i, int i2) {
        this.c.b(i, i2);
    }

    @Override // com.applovin.impl.dd.a
    public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener listener = this.e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.dd.a
    public void onNativeAdClicked(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener listener = this.e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.dd.a
    public void onNativeAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.dd.a
    public void onNativeAdLoaded() {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(final int i) {
        a(isFilledPosition(i) ? java.util.Collections.singletonList(java.lang.Integer.valueOf(i)) : java.util.Collections.emptyList(), new java.lang.Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i);
            }
        });
    }

    public void renderAd(int i, android.view.ViewGroup viewGroup) {
        com.applovin.mediation.MaxAd maxAdA = this.c.a(i);
        if (maxAdA == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i);
                return;
            }
            return;
        }
        com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdViewO0 = ((com.applovin.impl.ie) maxAdA).o0();
        if (maxNativeAdViewO0 != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i);
            }
        } else if (this.b == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                return;
            }
            return;
        } else {
            maxNativeAdViewO0 = new com.applovin.mediation.nativeAds.MaxNativeAdView(this.b, viewGroup.getContext());
            if (this.d.a(maxNativeAdViewO0, maxAdA)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i);
                }
            } else if (com.applovin.impl.sdk.n.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i);
            }
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof com.applovin.mediation.nativeAds.MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewO0.getParent() != null) {
            ((android.view.ViewGroup) maxNativeAdViewO0.getParent()).removeView(maxNativeAdViewO0);
        }
        viewGroup.addView(maxNativeAdViewO0, -1, -1);
    }

    public void setAdSize(int i, int i2) {
        this.f1596a = new com.applovin.sdk.AppLovinSdkUtils.Size(i, i2);
    }

    public void setListener(com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener listener) {
        this.e = listener;
    }

    public void setNativeAdViewBinder(com.applovin.mediation.nativeAds.MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i, int i2) {
        this.c.c(i, i2);
        if (i == -1 || i2 == -1) {
            return;
        }
        a();
    }

    public MaxAdPlacer(com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings maxAdPlacerSettings, com.applovin.sdk.AppLovinSdk appLovinSdk, android.content.Context context) {
        this.f1596a = com.applovin.sdk.AppLovinSdkUtils.Size.ZERO;
        com.applovin.impl.sdk.j jVarA = appLovinSdk.a();
        this.sdk = jVarA;
        com.applovin.impl.sdk.n nVarI = jVarA.I();
        this.logger = nVarI;
        this.c = new com.applovin.impl.yc(maxAdPlacerSettings);
        this.d = new com.applovin.impl.dd(maxAdPlacerSettings, context, this);
        if (com.applovin.impl.sdk.n.a()) {
            nVarI.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i);
        }
        this.c.i(i);
    }

    private void a() {
        int iC;
        while (this.d.d() && (iC = this.c.c()) != -1) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + iC);
            }
            this.c.a(this.d.b(), iC);
            com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener listener = this.e;
            if (listener != null) {
                listener.onAdLoaded(iC);
            }
        }
    }

    private void a(java.util.Collection collection, java.lang.Runnable runnable) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.d.a(this.c.a(((java.lang.Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.e != null) {
            java.util.Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.e.onAdRemoved(((java.lang.Integer) it2.next()).intValue());
            }
        }
    }
}
