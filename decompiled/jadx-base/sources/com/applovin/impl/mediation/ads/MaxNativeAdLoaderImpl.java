package com.applovin.impl.mediation.ads;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.a.InterfaceC0051a, com.applovin.impl.v.b {
    public static final java.lang.String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.c f1044a;
    private java.lang.String b;
    private java.lang.String c;
    private com.applovin.impl.mediation.d.b d;
    private final java.lang.Object e;
    private com.applovin.mediation.nativeAds.MaxNativeAdListener f;
    private final java.util.Map g;
    private final java.util.Set h;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.mediation.nativeAds.MaxNativeAd f1045a;
        final /* synthetic */ java.util.List b;
        final /* synthetic */ android.view.ViewGroup c;

        a(com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd, java.util.List list, android.view.ViewGroup viewGroup) {
            this.f1045a = maxNativeAd;
            this.b = list;
            this.c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1045a.prepareForInteraction(this.b, this.c)) {
                return;
            }
            com.applovin.impl.sdk.n.h(com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements com.applovin.impl.mediation.ads.a.InterfaceC0040a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            com.applovin.impl.ie ieVar = (com.applovin.impl.ie) maxAd;
            ieVar.g(com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.b);
            ieVar.f(com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.c);
            com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.sdk.v().d(ieVar);
            synchronized (com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.e) {
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.h.add(ieVar);
            }
            com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdViewA = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.a(ieVar.M());
            if (maxNativeAdViewA == null) {
                com.applovin.impl.sdk.n nVar2 = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No custom view provided, checking template");
                }
                java.lang.String strR0 = ieVar.r0();
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strR0)) {
                    com.applovin.impl.sdk.n nVar3 = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl3.logger.a(maxNativeAdLoaderImpl3.tag, "Using template: " + strR0 + "...");
                    }
                    maxNativeAdViewA = new com.applovin.mediation.nativeAds.MaxNativeAdView(strR0, com.applovin.impl.sdk.j.m());
                }
            }
            if (maxNativeAdViewA != null) {
                a(maxNativeAdViewA);
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA, ieVar, ieVar.getNativeAd());
                com.applovin.impl.sdk.n nVar4 = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + maxNativeAdViewA + ", nativeAd=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.f);
                }
                com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.f, maxNativeAdViewA, maxAd, true);
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.a(ieVar);
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA);
                return;
            }
            com.applovin.impl.sdk.n nVar5 = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl5 = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl5.logger.a(maxNativeAdLoaderImpl5.tag, "No native ad view to render. Returning the native ad to be rendered later.");
            }
            com.applovin.impl.sdk.n nVar6 = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl6 = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl6.logger.a(maxNativeAdLoaderImpl6.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.f);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.f, (com.applovin.mediation.nativeAds.MaxNativeAdView) null, maxAd, true);
            com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.a(ieVar);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.f);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(com.applovin.mediation.MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(com.applovin.mediation.MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
            com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.a(((com.applovin.impl.mediation.MaxErrorImpl) maxError).getLoadTag());
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.f);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final com.applovin.mediation.MaxAd maxAd) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(java.lang.String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.revenueListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        /* synthetic */ c(com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.a aVar) {
            this();
        }

        private void a(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView) {
            com.applovin.impl.ie ieVarB;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (ieVarB = adViewTracker.b()) == null) {
                return;
            }
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.destroy(ieVarB);
        }
    }

    public MaxNativeAdLoaderImpl(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        super(str, com.applovin.mediation.MaxAdFormat.NATIVE, "MaxNativeAdLoader", jVar);
        this.f1044a = new com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.c(this, null);
        this.d = com.applovin.impl.mediation.d.b.PUBLISHER_INITIATED;
        this.e = new java.lang.Object();
        this.g = new java.util.HashMap();
        this.h = new java.util.HashSet();
        jVar.i().a(this);
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f = null;
        this.sdk.i().b(this);
        synchronized (this.e) {
            this.g.clear();
            this.h.clear();
        }
        super.destroy();
    }

    public java.lang.String getPlacement() {
        return this.b;
    }

    public void handleNativeAdViewRendered(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.mediation.nativeAds.MaxNativeAd nativeAd = ((com.applovin.impl.ie) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.c();
        } else if (com.applovin.impl.sdk.n.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f1044a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        java.lang.String lowerCase = java.util.UUID.randomUUID().toString().toLowerCase(java.util.Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.P().loadAd(this.adUnitId, lowerCase, com.applovin.mediation.MaxAdFormat.NATIVE, this.d, this.localExtraParameters, this.extraParameters, com.applovin.impl.sdk.j.m(), this.f1044a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0051a
    public void onAdExpired(com.applovin.impl.i8 i8Var) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + i8Var + "), listener=" + this.f);
        }
        com.applovin.impl.fc.b(this.f, (com.applovin.mediation.MaxAd) i8Var, true);
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.ie ieVar;
        java.util.Iterator it = this.h.iterator();
        do {
            if (!it.hasNext()) {
                ieVar = null;
                break;
            }
            ieVar = (com.applovin.impl.ie) it.next();
        } while (!ieVar.R().equalsIgnoreCase(str));
        if (ieVar != null) {
            ieVar.h(str2);
            com.applovin.impl.fc.b(this.adReviewListener, str2, ieVar);
            synchronized (this.e) {
                this.h.remove(ieVar);
            }
        }
    }

    public void registerClickableViews(java.util.List<android.view.View> list, android.view.ViewGroup viewGroup, com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.ie ieVar = (com.applovin.impl.ie) maxAd;
        com.applovin.mediation.nativeAds.MaxNativeAd nativeAd = ieVar.getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        ieVar.a(viewGroup);
        this.sdk.v().d(ieVar);
        a((com.applovin.impl.fe) ieVar);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(ieVar, viewGroup, this.f1044a, this.sdk));
        com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.a aVar = new com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.sdk, "renderMaxNativeAd", aVar), com.applovin.impl.tm.b.MEDIATION);
        }
    }

    public boolean render(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView, com.applovin.mediation.MaxAd maxAd) {
        if (!(maxAd instanceof com.applovin.impl.ie)) {
            com.applovin.impl.sdk.n.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            com.applovin.impl.sdk.n.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        com.applovin.impl.ie ieVar = (com.applovin.impl.ie) maxAd;
        com.applovin.mediation.nativeAds.MaxNativeAd nativeAd = ieVar.getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((java.lang.Boolean) this.sdk.a(com.applovin.impl.ue.i7)).booleanValue()) {
            com.applovin.impl.sdk.n.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, ieVar, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(java.lang.String str) {
        com.applovin.impl.yp.b(str, this.tag);
        this.c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(java.lang.String str, java.lang.Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof com.applovin.impl.mediation.d.b)) {
            this.d = (com.applovin.impl.mediation.d.b) obj;
        }
    }

    public void setNativeAdListener(com.applovin.mediation.nativeAds.MaxNativeAdListener maxNativeAdListener) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f = maxNativeAdListener;
    }

    public void setPlacement(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f + ", revenueListener=" + this.revenueListener + '}';
    }

    public void destroy(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof com.applovin.impl.ie) {
            com.applovin.impl.ie ieVar = (com.applovin.impl.ie) maxAd;
            if (ieVar.u0()) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Native ad (" + ieVar + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.e) {
                this.h.remove(ieVar);
            }
            com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdViewO0 = ieVar.o0();
            if (maxNativeAdViewO0 != null && (adViewTracker = maxNativeAdViewO0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                maxNativeAdViewO0.recycle();
            }
            com.applovin.mediation.nativeAds.MaxNativeAd nativeAd = ieVar.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(ieVar);
            this.sdk.P().destroyAd(ieVar);
            this.sdk.J().c(this.adUnitId, ieVar.M());
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.mediation.nativeAds.MaxNativeAdView f1046a;
        final /* synthetic */ com.applovin.impl.ie b;
        final /* synthetic */ com.applovin.mediation.nativeAds.MaxNativeAd c;

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.f1046a);
            }
            this.f1046a.render(this.b, com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.f1044a, com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.this.sdk);
            this.c.setNativeAdView(this.f1046a);
            if (this.c.prepareForInteraction(this.f1046a.getClickableViews(), this.f1046a)) {
                return;
            }
            this.c.prepareViewForInteraction(this.f1046a);
        }

        b(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView, com.applovin.impl.ie ieVar, com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd) {
            this.f1046a = maxNativeAdView;
            this.b = ieVar;
            this.c = maxNativeAd;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView, com.applovin.impl.ie ieVar, com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd) {
        ieVar.a(maxNativeAdView);
        a((com.applovin.impl.fe) ieVar);
        com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.b bVar = new com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.b(maxNativeAdView, ieVar, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.sdk, "renderMaxNativeAd", bVar), com.applovin.impl.tm.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.ie ieVar) {
        if (ieVar.q0().get()) {
            return;
        }
        this.sdk.f().a(ieVar, this);
    }

    private void a(java.lang.String str, com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.e) {
            this.g.put(str, maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.mediation.nativeAds.MaxNativeAdView a(java.lang.String str) {
        com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.e) {
            maxNativeAdView = (com.applovin.mediation.nativeAds.MaxNativeAdView) this.g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (com.applovin.impl.z3.e()) {
                if (maxNativeAdView.isAttachedToWindow()) {
                    adViewTracker.c();
                }
            } else if (maxNativeAdView.getParent() != null) {
                adViewTracker.c();
            }
        }
    }
}
