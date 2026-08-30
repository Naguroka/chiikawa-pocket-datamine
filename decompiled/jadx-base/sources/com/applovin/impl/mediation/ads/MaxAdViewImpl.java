package com.applovin.impl.mediation.ads;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.f.a, com.applovin.impl.br.a, com.applovin.impl.v.b {
    private boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f1038a;
    private final com.applovin.mediation.ads.MaxAdView b;
    private final java.lang.String c;
    private final android.view.View d;
    private long e;
    private com.applovin.impl.ge f;
    private java.lang.String g;
    private java.lang.String h;
    private final com.applovin.impl.mediation.ads.MaxAdViewImpl.b i;
    private final com.applovin.impl.mediation.ads.MaxAdViewImpl.d j;
    private final com.applovin.impl.sdk.f k;
    private final com.applovin.impl.ar l;
    private final com.applovin.impl.br m;
    private final java.lang.Object n;
    private final java.lang.Object o;
    private com.applovin.impl.ge p;
    private boolean q;
    private boolean r;
    private final java.util.concurrent.atomic.AtomicBoolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    private class b extends com.applovin.impl.mediation.ads.MaxAdViewImpl.c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener, str, maxError, true);
            com.applovin.impl.mediation.ads.MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(com.applovin.mediation.MaxAd maxAd) {
            if (com.applovin.impl.mediation.ads.MaxAdViewImpl.this.a()) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                com.applovin.impl.mediation.ads.MaxAdViewImpl.this.sdk.P().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.ge geVar = (com.applovin.impl.ge) maxAd;
            geVar.g(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.g);
            geVar.f(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.h);
            if (geVar.y() == null) {
                com.applovin.impl.mediation.ads.MaxAdViewImpl.this.sdk.P().destroyAd(geVar);
                onAdLoadFailed(geVar.getAdUnitId(), new com.applovin.impl.mediation.MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (geVar.s0()) {
                long jN0 = geVar.n0();
                com.applovin.impl.mediation.ads.MaxAdViewImpl.this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxAdViewImpl.this.sdk.I().a(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + jN0 + " milliseconds from now for '" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adUnitId + "'...");
                }
                com.applovin.impl.mediation.ads.MaxAdViewImpl.this.k.a(jN0);
                if (com.applovin.impl.mediation.ads.MaxAdViewImpl.this.k.g() || com.applovin.impl.mediation.ads.MaxAdViewImpl.this.r) {
                    com.applovin.impl.sdk.n nVar2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    com.applovin.impl.mediation.ads.MaxAdViewImpl.this.k.j();
                }
            }
            com.applovin.impl.sdk.n nVar3 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl3 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                maxAdViewImpl3.logger.a(maxAdViewImpl3.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener);
            }
            com.applovin.impl.fc.f(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener, maxAd, true);
            com.applovin.impl.mediation.ads.MaxAdViewImpl.this.d(geVar);
        }
    }

    private abstract class c implements com.applovin.mediation.MaxAdListener, com.applovin.mediation.MaxAdViewAdListener, com.applovin.mediation.MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0040a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1039a;

        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(com.applovin.mediation.MaxAd maxAd) {
            if (maxAd.equals(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.p)) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener);
                }
                com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(com.applovin.mediation.MaxAd maxAd) {
            if (maxAd.equals(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.p)) {
                if ((com.applovin.impl.mediation.ads.MaxAdViewImpl.this.p.t0() || com.applovin.impl.mediation.ads.MaxAdViewImpl.this.y) && this.f1039a) {
                    this.f1039a = false;
                    com.applovin.impl.mediation.ads.MaxAdViewImpl.this.startAutoRefresh();
                }
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener);
                }
                com.applovin.impl.fc.b(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError) {
            if (maxAd.equals(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.p)) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener);
                }
                com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(com.applovin.mediation.MaxAd maxAd) {
            if (maxAd.equals(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.p)) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener);
                }
                com.applovin.impl.fc.c(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(com.applovin.mediation.MaxAd maxAd) {
            if (maxAd.equals(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.p)) {
                if ((com.applovin.impl.mediation.ads.MaxAdViewImpl.this.p.t0() || com.applovin.impl.mediation.ads.MaxAdViewImpl.this.y) && !com.applovin.impl.mediation.ads.MaxAdViewImpl.this.k.g()) {
                    this.f1039a = true;
                    com.applovin.impl.mediation.ads.MaxAdViewImpl.this.stopAutoRefresh();
                }
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener);
                }
                com.applovin.impl.fc.d(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(com.applovin.mediation.MaxAd maxAd) {
            if (maxAd.equals(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.p)) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener);
                }
                com.applovin.impl.fc.e(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(java.lang.String str) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.requestListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.revenueListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    private class d extends com.applovin.impl.mediation.ads.MaxAdViewImpl.c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            com.applovin.impl.mediation.ads.MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(com.applovin.mediation.MaxAd maxAd) {
            if (com.applovin.impl.mediation.ads.MaxAdViewImpl.this.u) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Ad with ad unit ID '" + com.applovin.impl.mediation.ads.MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                com.applovin.impl.mediation.ads.MaxAdViewImpl.this.sdk.P().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.sdk.n nVar2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxAdViewImpl maxAdViewImpl2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Successfully precached ad for refresh");
            }
            if (((java.lang.Boolean) com.applovin.impl.mediation.ads.MaxAdViewImpl.this.sdk.a(com.applovin.impl.ue.X6)).booleanValue()) {
                com.applovin.impl.mediation.ads.MaxAdViewImpl.this.b(maxAd);
            } else {
                com.applovin.impl.mediation.ads.MaxAdViewImpl.this.a(maxAd);
            }
        }
    }

    public MaxAdViewImpl(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.mediation.ads.MaxAdView maxAdView, android.view.View view, com.applovin.impl.sdk.j jVar, android.content.Context context) {
        super(str, maxAdFormat, "MaxAdView", jVar);
        this.c = java.util.UUID.randomUUID().toString().toLowerCase(java.util.Locale.US);
        this.e = Long.MAX_VALUE;
        this.n = new java.lang.Object();
        this.o = new java.lang.Object();
        this.p = null;
        this.s = new java.util.concurrent.atomic.AtomicBoolean();
        this.u = false;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("No context specified");
        }
        this.f1038a = context.getApplicationContext();
        this.b = maxAdView;
        this.d = view;
        this.i = new com.applovin.impl.mediation.ads.MaxAdViewImpl.b();
        this.j = new com.applovin.impl.mediation.ads.MaxAdViewImpl.d();
        this.k = new com.applovin.impl.sdk.f(jVar, this);
        this.l = new com.applovin.impl.ar(maxAdView, jVar);
        this.m = new com.applovin.impl.br(maxAdView, jVar, this);
        jVar.i().a(this);
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        g();
        if (this.f != null) {
            this.sdk.P().destroyAd(this.f);
        }
        synchronized (this.n) {
            this.u = true;
        }
        this.k.a();
        this.sdk.i().b(this);
        this.sdk.J().c(this.adUnitId, this.c);
        super.destroy();
    }

    public com.applovin.mediation.MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public java.lang.String getPlacement() {
        return this.g;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.mediation.d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        if (((java.lang.Boolean) this.sdk.a(com.applovin.impl.ue.X6)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.ge geVar = this.p;
        if (geVar != null && geVar.R().equalsIgnoreCase(str)) {
            this.p.h(str2);
            com.applovin.impl.fc.b(this.adReviewListener, str2, this.p);
            return;
        }
        com.applovin.impl.ge geVar2 = this.f;
        if (geVar2 == null || !geVar2.R().equalsIgnoreCase(str)) {
            return;
        }
        this.f.h(str2);
    }

    @Override // com.applovin.impl.br.a
    public void onLogVisibilityImpression() {
        a(this.p, this.l.a(this.p));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((java.lang.Boolean) this.sdk.a(com.applovin.impl.ue.U6)).booleanValue() && this.k.h()) {
            if (com.applovin.impl.zq.b(i)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.k.d();
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.k.c();
            }
        }
    }

    public void setCustomData(java.lang.String str) {
        if (this.p != null && com.applovin.impl.sdk.n.a()) {
            this.logger.k(this.tag, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        com.applovin.impl.yp.b(str, this.tag);
        this.h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(java.lang.String str, java.lang.String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(java.lang.String str) {
        if (this.p != null && com.applovin.impl.sdk.n.a()) {
            this.logger.k(this.tag, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.g = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.e = i;
    }

    public void startAutoRefresh() {
        this.r = false;
        if (!this.k.g()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
            }
        } else {
            this.k.m();
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.k.b() + "ms");
            }
        }
    }

    public void stopAutoRefresh() {
        if (this.p != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.k.b() + "ms");
            }
            this.k.j();
        } else if (this.v || ((java.lang.Boolean) this.sdk.a(com.applovin.impl.ue.W6)).booleanValue()) {
            this.r = true;
        } else {
            com.applovin.impl.sdk.n.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("MaxAdView{adUnitId='").append(this.adUnitId).append("', adListener=");
        java.lang.Object obj = this.adListener;
        if (obj == this.b) {
            obj = "this";
        }
        return sbAppend.append(obj).append(", isDestroyed=").append(a()).append('}').toString();
    }

    private void e() {
        this.s.set(false);
        if (this.f != null) {
            h();
            return;
        }
        if (!b()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(com.applovin.impl.mediation.d.b.REFRESH);
        } else if (this.q) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(com.applovin.impl.mediation.d.b.REFRESH);
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.s.set(true);
        }
    }

    private void f() {
        boolean z;
        boolean z2;
        synchronized (this.o) {
            z = false;
            this.s.set(false);
            z2 = this.f != null;
            if (!z2) {
                if (b()) {
                    if (!this.q) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                        }
                        this.s.set(true);
                    } else if (com.applovin.impl.sdk.n.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                    }
                } else if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Refreshing ad from network...");
                }
                z = true;
            }
        }
        if (z2) {
            h();
        } else if (z) {
            loadAd(com.applovin.impl.mediation.d.b.REFRESH);
        }
    }

    private void g() {
        com.applovin.impl.ge geVar;
        com.applovin.mediation.ads.MaxAdView maxAdView = this.b;
        if (maxAdView != null) {
            com.applovin.impl.e0.a(maxAdView, this.d);
        }
        this.m.b();
        synchronized (this.n) {
            geVar = this.p;
        }
        if (geVar != null) {
            this.sdk.P().destroyAd(geVar);
        }
    }

    private void h() {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f + "...");
        }
        this.i.onAdLoaded(this.f);
        this.f = null;
    }

    public void loadAd(com.applovin.impl.mediation.d.b bVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z = this.v || ((java.lang.Boolean) this.sdk.a(com.applovin.impl.ue.W6)).booleanValue();
        if (z && !this.k.g() && this.k.h()) {
            com.applovin.impl.sdk.n.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(this.k.b()) + " seconds.");
            return;
        }
        if (!z) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(bVar, this.i);
        } else if (this.f != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            h();
        } else if (this.t) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.s.set(true);
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(bVar, this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final com.applovin.impl.ge geVar) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(geVar);
            }
        });
    }

    private void d() {
        if (b()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.t = true;
            this.sdk.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.sdk, "loadMaxAdForPrecacheRequest", new java.lang.Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            }), com.applovin.impl.tm.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final com.applovin.impl.ge geVar) {
        android.view.View viewY = geVar.y();
        java.lang.String str = viewY == null ? "MaxAdView does not have a loaded ad view" : null;
        com.applovin.mediation.ads.MaxAdView maxAdView = this.b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, str);
            }
            com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-1, str);
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + geVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            com.applovin.impl.fc.a(this.adListener, (com.applovin.mediation.MaxAd) geVar, (com.applovin.mediation.MaxError) maxErrorImpl, true);
            this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, geVar);
            return;
        }
        g();
        a((com.applovin.impl.fe) geVar);
        if (geVar.m0()) {
            this.m.a(geVar);
        }
        maxAdView.setDescendantFocusability(org.objectweb.asm.Opcodes.ASM6);
        if (geVar.o0() != Long.MAX_VALUE) {
            this.d.setBackgroundColor((int) geVar.o0());
        } else {
            long j = this.e;
            if (j != Long.MAX_VALUE) {
                this.d.setBackgroundColor((int) j);
            } else {
                this.d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewY);
        a(viewY, geVar);
        this.sdk.v().d(geVar);
        c(geVar);
        synchronized (this.n) {
            this.p = geVar;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.P().processRawAdImpression(geVar, this.i);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.p.getAdReviewCreativeId())) {
            com.applovin.impl.fc.a(this.adReviewListener, this.p.getAdReviewCreativeId(), (com.applovin.mediation.MaxAd) this.p, true);
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(geVar);
            }
        }, geVar.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.mediation.MaxAd maxAd) {
        boolean zCompareAndSet;
        this.t = false;
        synchronized (this.o) {
            zCompareAndSet = this.s.compareAndSet(true, false);
            if (!zCompareAndSet) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Saving precache ad...");
                }
                com.applovin.impl.ge geVar = (com.applovin.impl.ge) maxAd;
                this.f = geVar;
                geVar.g(this.g);
                this.f.f(this.h);
            }
        }
        if (zCompareAndSet) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.i.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.x) {
            return false;
        }
        return ((java.lang.Boolean) this.sdk.a(com.applovin.impl.ue.c7)).booleanValue();
    }

    private void c(com.applovin.impl.ge geVar) {
        int height = this.b.getHeight();
        int width = this.b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = com.applovin.sdk.AppLovinSdkUtils.pxToDp(this.f1038a, height);
            int iPxToDp2 = com.applovin.sdk.AppLovinSdkUtils.pxToDp(this.f1038a, width);
            com.applovin.mediation.MaxAdFormat format = geVar.getFormat();
            int height2 = (this.A ? format.getAdaptiveSize(iPxToDp2, this.b.getContext()) : format.getSize()).getHeight();
            int iMin = java.lang.Math.min(format.getSize().getWidth(), com.applovin.impl.z3.b(this.f1038a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                java.lang.String str = "\n**************************************************\n`MaxAdView` size " + iPxToDp2 + "x" + iPxToDp + " dp smaller than required " + (this.A ? "adaptive " : "") + "size: " + iMin + "x" + height2 + " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n";
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.b("AppLovinSdk", str);
                }
            }
        }
    }

    private void a(android.view.View view, com.applovin.impl.ge geVar) {
        int iR0 = geVar.r0();
        int iP0 = geVar.p0();
        int iDpToPx = iR0 == -1 ? -1 : com.applovin.sdk.AppLovinSdkUtils.dpToPx(view.getContext(), iR0);
        int iDpToPx2 = iP0 != -1 ? com.applovin.sdk.AppLovinSdkUtils.dpToPx(view.getContext(), iP0) : -1;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Pinning ad view to MAX ad view with width: " + iDpToPx + " and height: " + iDpToPx2 + ".");
            }
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            for (int i : com.applovin.impl.zq.a(this.b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(com.applovin.impl.mediation.d.b.SEQUENTIAL_OR_PRECACHE, this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.ge geVar) {
        long jA = this.l.a(geVar);
        if (!geVar.m0()) {
            a(geVar, jA);
        }
        a(jA);
    }

    private void a(final com.applovin.impl.mediation.d.b bVar, final com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (a()) {
            boolean zC = com.applovin.impl.yp.c(this.sdk);
            this.sdk.D().a(com.applovin.impl.ka.V, "attemptingToLoadDestroyedAdView", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("details", "debug=" + zC));
            if (!zC) {
                com.applovin.impl.sdk.n.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            }
            throw new java.lang.IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(true, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(interfaceC0040a, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a, com.applovin.impl.mediation.d.b bVar) {
        com.applovin.impl.ge geVar = this.p;
        if (geVar != null) {
            long jA = this.l.a(geVar);
            this.extraParameters.put("visible_ad_ad_unit_id", this.p.getAdUnitId());
            this.extraParameters.put("viewability_flags", java.lang.Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = com.applovin.sdk.AppLovinSdkUtils.pxToDp(this.b.getContext(), this.b.getWidth());
        int iPxToDp2 = com.applovin.sdk.AppLovinSdkUtils.pxToDp(this.b.getContext(), this.b.getHeight());
        this.extraParameters.put("viewport_width", java.lang.Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", java.lang.Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", java.lang.Boolean.valueOf(this.k.g() || this.r));
        this.extraParameters.put("auto_retries_disabled", java.lang.Boolean.valueOf(this.w));
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(java.util.Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0040a + "...");
        }
        this.sdk.P().loadAd(this.adUnitId, this.c, this.adFormat, bVar, this.localExtraParameters, this.extraParameters, this.f1038a, interfaceC0040a);
    }

    private void a(java.lang.String str, java.lang.String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.v = java.lang.Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Updated disable auto-retries to: " + str2);
            }
            this.w = java.lang.Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Updated precached disabled to: " + str2);
            }
            this.x = java.lang.Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.y = java.lang.Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Updated force precache to: " + str2);
            }
            this.z = java.lang.Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Updated is adaptive banner to: " + str2);
            }
            this.A = java.lang.Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.mediation.MaxError maxError) {
        if (a()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(com.applovin.impl.ue.Q6).contains(java.lang.String.valueOf(maxError.getCode()))) {
            this.sdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.sdk.I().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.r && !this.k.g()) {
            this.q = true;
            this.t = false;
            long jLongValue = ((java.lang.Long) this.sdk.a(com.applovin.impl.ue.P6)).longValue();
            if (jLongValue >= 0) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().a(this.tag, "Scheduling failed banner ad refresh " + jLongValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.k.a(jLongValue);
                return;
            }
            return;
        }
        if (this.t) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.t = false;
        }
        if (this.s.get()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
            }
            com.applovin.impl.fc.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(com.applovin.impl.ge geVar, long j) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.P().processViewabilityAdImpressionPostback(geVar, j, this.i);
    }

    private void a(long j) {
        if (com.applovin.impl.yp.a(j, ((java.lang.Long) this.sdk.a(com.applovin.impl.ue.b7)).longValue()) && !this.z) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + java.lang.Long.toBinaryString(j) + ", undesired: " + java.lang.Long.toBinaryString(j));
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.q = true;
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.q = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.mediation.MaxAd maxAd) {
        this.t = false;
        if (this.s.compareAndSet(true, false)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.i.onAdLoaded(maxAd);
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Saving precache ad...");
            }
            com.applovin.impl.ge geVar = (com.applovin.impl.ge) maxAd;
            this.f = geVar;
            geVar.g(this.g);
            this.f.f(this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z;
        synchronized (this.n) {
            z = this.u;
        }
        return z;
    }
}
