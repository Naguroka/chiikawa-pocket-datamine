package com.applovin.impl.mediation.ads;

/* JADX INFO: loaded from: classes3.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.a.InterfaceC0051a, com.applovin.impl.v.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b f1040a;
    private final java.lang.ref.WeakReference b;
    private final com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c c;
    private final com.applovin.impl.mediation.b d;
    private final java.lang.Object e;
    private com.applovin.impl.he f;
    private com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d g;
    private final java.util.concurrent.atomic.AtomicBoolean h;
    private final java.util.concurrent.atomic.AtomicBoolean i;
    private boolean j;
    private boolean k;
    private java.lang.String l;
    private java.lang.String m;
    private java.lang.ref.WeakReference n;
    private java.lang.ref.WeakReference o;
    private java.lang.ref.WeakReference p;

    public interface b {
        android.app.Activity getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements com.applovin.mediation.MaxAdListener, com.applovin.mediation.MaxRewardedAdListener, com.applovin.mediation.MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0040a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.mediation.MaxAd maxAd) {
            if (com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.k) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.d();
                return;
            }
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener);
            }
            com.applovin.impl.fc.f(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final com.applovin.mediation.MaxAd maxAd, final com.applovin.mediation.MaxError maxError) {
            final boolean z = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.k;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.k = false;
            final com.applovin.impl.he heVar = (com.applovin.impl.he) maxAd;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.IDLE, new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    this.f$0.a(maxAd, z, heVar, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(com.applovin.mediation.MaxAd maxAd) {
            final com.applovin.impl.he heVar = (com.applovin.impl.he) maxAd;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.k = false;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk.f().a(heVar);
            java.lang.Integer num = (java.lang.Integer) com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk.a(com.applovin.impl.ue.G7);
            if (num.intValue() > 0) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk.i0().b(new com.applovin.impl.jn(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new java.lang.Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(heVar);
                    }
                }), com.applovin.impl.tm.b.TIMEOUT, java.util.concurrent.TimeUnit.SECONDS.toMillis(num.intValue()));
            }
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener);
            }
            com.applovin.impl.fc.c(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.k = false;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.IDLE, new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    this.f$0.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final java.lang.String str, final com.applovin.mediation.MaxError maxError) {
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.c();
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.IDLE, new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda5
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    this.f$0.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.he heVar;
            synchronized (com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.e) {
                heVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.f;
            }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk.B().a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adUnitId);
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.a((com.applovin.impl.he) maxAd);
            if (!com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.h.compareAndSet(true, false)) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.READY, new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda3
                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public final void a() {
                        this.f$0.b(maxAd);
                    }
                });
                return;
            }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.i.compareAndSet(true, false)) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.d();
            }
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + heVar + ", newAd=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.expirationListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.expirationListener, (com.applovin.mediation.MaxAd) heVar, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(java.lang.String str) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.requestListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.revenueListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxReward maxReward) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }

        /* synthetic */ c(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl, com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.mediation.MaxAd maxAd, boolean z, com.applovin.impl.he heVar, com.applovin.mediation.MaxError maxError) {
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.a(maxAd);
            if (!z && heVar.u0() && com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk.J().d(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adUnitId)) {
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(true, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a();
                    }
                });
                return;
            }
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.impl.he heVar) {
            if (heVar.w().get()) {
                return;
            }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk.D().a(com.applovin.impl.ka.L, heVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(java.lang.String str, com.applovin.mediation.MaxError maxError) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener);
            }
            com.applovin.impl.fc.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.a(maxAd);
            com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener);
            }
            com.applovin.impl.fc.e(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.k = true;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.loadAd();
        }
    }

    public enum d {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface e {
        void a();

        default void a(com.applovin.mediation.MaxError maxError) {
        }
    }

    public MaxFullscreenAdImpl(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b bVar, java.lang.String str2, com.applovin.impl.sdk.j jVar, android.content.Context context) {
        super(str, maxAdFormat, str2, jVar);
        this.e = new java.lang.Object();
        this.f = null;
        this.g = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.IDLE;
        this.h = new java.util.concurrent.atomic.AtomicBoolean();
        this.i = new java.util.concurrent.atomic.AtomicBoolean();
        this.n = new java.lang.ref.WeakReference(null);
        this.o = new java.lang.ref.WeakReference(null);
        this.p = new java.lang.ref.WeakReference(null);
        this.f1040a = bVar;
        this.c = new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.c(this, null);
        this.d = new com.applovin.impl.mediation.b(jVar);
        this.b = new java.lang.ref.WeakReference(context);
        jVar.i().a(this);
        com.applovin.impl.sdk.n.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED, new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
            public final void a() {
                this.f$0.b();
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.e) {
            com.applovin.impl.he heVar = this.f;
            z = heVar != null && heVar.a0() && this.g == com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.READY;
        }
        if (!z) {
            this.sdk.B().c(this.adUnitId);
        }
        return z;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.mediation.d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0051a
    public void onAdExpired(com.applovin.impl.i8 i8Var) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.h.set(true);
        com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b bVar = this.f1040a;
        android.app.Activity activity = bVar != null ? bVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            c();
            this.c.onAdLoadFailed(this.adUnitId, com.applovin.mediation.adapter.MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.P().loadAd(this.adUnitId, null, this.adFormat, com.applovin.impl.mediation.d.b.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.c);
        }
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.he heVar = this.f;
        if (heVar == null || !heVar.R().equalsIgnoreCase(str)) {
            return;
        }
        this.f.h(str2);
        com.applovin.impl.fc.b(this.adReviewListener, str2, this.f);
    }

    public void showAd(final java.lang.String str, final java.lang.String str2, final android.app.Activity activity) {
        com.applovin.impl.he heVar;
        java.util.List listB = this.sdk.k0().b();
        if (this.sdk.k0().d() && listB != null && (heVar = this.f) != null && !listB.contains(heVar.c())) {
            final java.lang.String str3 = "Attempting to show ad from <" + this.f.c() + "> which is not in the list of selected ad networks " + listB;
            com.applovin.impl.sdk.n.h(this.tag, str3);
            a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.IDLE, new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda4
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    this.f$0.b(str3);
                }
            });
        } else {
            if (activity == null) {
                activity = this.sdk.m0();
            }
            if (a(activity, str)) {
                a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.SHOWING, new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda5
                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public final void a() {
                        this.f$0.a(str, str2, activity);
                    }
                });
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(this.tag).append("{adUnitId='").append(this.adUnitId).append("', adListener=");
        java.lang.Object obj = this.adListener;
        if (obj == this.f1040a) {
            obj = "this";
        }
        return sbAppend.append(obj).append(", revenueListener=").append(this.revenueListener).append(", requestListener").append(this.requestListener).append(", adReviewListener").append(this.adReviewListener).append(", isReady=").append(isReady()).append('}').toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        synchronized (this.e) {
            if (this.f != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f + "...");
                }
                this.sdk.P().destroyAd(this.f);
            }
        }
        this.sdk.i().b(this);
        this.d.a();
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(java.lang.String str) {
        com.applovin.impl.he heVar = this.f;
        a((com.applovin.mediation.MaxAd) heVar);
        com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + heVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        com.applovin.impl.fc.a(this.adListener, (com.applovin.mediation.MaxAd) heVar, (com.applovin.mediation.MaxError) maxErrorImpl, true);
        this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, heVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        android.app.Activity activityM0 = (android.app.Activity) this.n.get();
        if (activityM0 == null) {
            activityM0 = this.sdk.m0();
        }
        android.app.Activity activity = activityM0;
        if (this.j) {
            showAd(this.l, this.m, (android.view.ViewGroup) this.o.get(), (androidx.lifecycle.Lifecycle) this.p.get(), activity);
        } else {
            showAd(this.l, this.m, activity);
        }
    }

    public void loadAd(com.applovin.impl.mediation.d.b bVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.g == com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED) {
            boolean zC = com.applovin.impl.yp.c(this.sdk);
            this.sdk.D().a(com.applovin.impl.ka.V, "attemptingToLoadDestroyedAd", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new java.lang.IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b bVar2 = this.f1040a;
            a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.LOADING, new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a(bVar2 != null ? bVar2.getActivity() : null, (android.content.Context) this.b.get(), bVar));
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.f + "), listener=" + this.adListener);
            }
            com.applovin.impl.fc.f(this.adListener, (com.applovin.mediation.MaxAd) this.f, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.applovin.impl.he heVar;
        if (this.h.compareAndSet(true, false)) {
            synchronized (this.e) {
                heVar = this.f;
                this.f = null;
            }
            this.sdk.P().destroyAd(heVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    class a implements com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f1041a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ com.applovin.impl.mediation.d.b c;

        a(android.app.Activity activity, android.content.Context context, com.applovin.impl.mediation.d.b bVar) {
            this.f1041a = activity;
            this.b = context;
            this.c = bVar;
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
        public void a() {
            android.content.Context contextM0 = this.f1041a;
            if (contextM0 == null && (contextM0 = this.b) == null) {
                contextM0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk.m0() != null ? com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk.m0() : com.applovin.impl.sdk.j.m();
            }
            android.content.Context context = contextM0;
            com.applovin.impl.mediation.MediationServiceImpl mediationServiceImplP = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk.P();
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
            mediationServiceImplP.loadAd(maxFullscreenAdImpl.adUnitId, null, maxFullscreenAdImpl.adFormat, this.c, maxFullscreenAdImpl.localExtraParameters, maxFullscreenAdImpl.extraParameters, context, maxFullscreenAdImpl.c);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
        public void a(com.applovin.mediation.MaxError maxError) {
            if (((java.lang.Boolean) com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.sdk.a(com.applovin.impl.ue.F7)).booleanValue()) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adUnitId + ", error=" + maxError + "), listener=" + com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this.adListener);
                }
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl maxFullscreenAdImpl2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.this;
                com.applovin.impl.fc.a(maxFullscreenAdImpl2.adListener, maxFullscreenAdImpl2.adUnitId, maxError, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(java.lang.String str) {
        com.applovin.impl.he heVar = this.f;
        a((com.applovin.mediation.MaxAd) heVar);
        com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + heVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        com.applovin.impl.fc.a(this.adListener, (com.applovin.mediation.MaxAd) heVar, (com.applovin.mediation.MaxError) maxErrorImpl, true);
        this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, heVar);
    }

    public void showAd(final java.lang.String str, final java.lang.String str2, final android.view.ViewGroup viewGroup, final androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity) {
        com.applovin.impl.he heVar;
        if (viewGroup != null && lifecycle != null) {
            if (!viewGroup.isShown() && ((java.lang.Boolean) this.sdk.a(com.applovin.impl.ue.x7)).booleanValue()) {
                com.applovin.impl.sdk.n.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                com.applovin.impl.fc.a(this.adListener, (com.applovin.mediation.MaxAd) this.f, (com.applovin.mediation.MaxError) maxErrorImpl, true);
                this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
                return;
            }
            java.util.List listB = this.sdk.k0().b();
            if (this.sdk.k0().d() && listB != null && (heVar = this.f) != null && !listB.contains(heVar.c())) {
                final java.lang.String str3 = "Attempting to show ad from <" + this.f.c() + "> which is not in the list of selected ad networks " + listB;
                com.applovin.impl.sdk.n.h(this.tag, str3);
                a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.IDLE, new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda1
                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public final void a() {
                        this.f$0.c(str3);
                    }
                });
                return;
            } else {
                if (activity == null) {
                    activity = this.sdk.m0();
                }
                final android.app.Activity activity2 = activity;
                if (a(activity2, str)) {
                    a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.SHOWING, new com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda2
                        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                        public final void a() {
                            this.f$0.a(str, str2, activity2, viewGroup, lifecycle);
                        }
                    });
                    return;
                }
                return;
            }
        }
        com.applovin.impl.sdk.n.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl2 = new com.applovin.impl.mediation.MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
        }
        com.applovin.impl.fc.a(this.adListener, (com.applovin.mediation.MaxAd) this.f, (com.applovin.mediation.MaxError) maxErrorImpl2, true);
        this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.he heVar) {
        if (this.sdk.f().a(heVar, this)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + heVar);
            }
            this.f = heVar;
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
            }
            onAdExpired(heVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str, java.lang.String str2, android.app.Activity activity) {
        a(str, str2);
        this.j = false;
        this.n = new java.lang.ref.WeakReference(activity);
        this.sdk.P().showFullscreenAd(this.f, activity, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str, java.lang.String str2, android.app.Activity activity, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle) {
        a(str, str2);
        this.j = true;
        this.n = new java.lang.ref.WeakReference(activity);
        this.o = new java.lang.ref.WeakReference(viewGroup);
        this.p = new java.lang.ref.WeakReference(lifecycle);
        this.sdk.P().showFullscreenAd(this.f, viewGroup, lifecycle, activity, this.c);
    }

    private boolean a(android.app.Activity activity, final java.lang.String str) {
        if (activity == null && com.applovin.mediation.MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new java.lang.IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.g == com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED) {
            boolean zC = com.applovin.impl.yp.c(this.sdk);
            this.sdk.D().a(com.applovin.impl.ka.V, "attemptingToShowDestroyedAd", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new java.lang.IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            java.lang.String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            com.applovin.impl.sdk.n.h(this.tag, str2);
            com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-24, str2);
            com.applovin.impl.kf kfVar = new com.applovin.impl.kf(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + kfVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            com.applovin.impl.fc.a(this.adListener, (com.applovin.mediation.MaxAd) kfVar, (com.applovin.mediation.MaxError) maxErrorImpl, true);
            if (this.f != null) {
                this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
            }
            return false;
        }
        java.lang.Long l = (java.lang.Long) this.sdk.a(com.applovin.impl.ue.k7);
        java.lang.Long l2 = (java.lang.Long) this.sdk.a(com.applovin.impl.ue.d7);
        if (l.longValue() > 0 && (this.f.getTimeToLiveMillis() < l2.longValue() || this.h.get())) {
            this.i.set(true);
            this.sdk.i0().a(new com.applovin.impl.jn(this.sdk, "handleShowOnLoadTimeoutError", new java.lang.Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(str);
                }
            }), com.applovin.impl.tm.b.TIMEOUT, l.longValue());
            return false;
        }
        if (com.applovin.impl.yp.a(com.applovin.impl.sdk.j.m()) != 0 && this.sdk.f0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!com.applovin.impl.yp.c(this.sdk)) {
                if (((java.lang.Boolean) this.sdk.a(com.applovin.impl.ue.w7)).booleanValue()) {
                    com.applovin.impl.sdk.n.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl2 = new com.applovin.impl.mediation.MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (com.applovin.impl.sdk.n.a()) {
                        this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                    }
                    com.applovin.impl.fc.a(this.adListener, (com.applovin.mediation.MaxAd) this.f, (com.applovin.mediation.MaxError) maxErrorImpl2, true);
                    this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f);
                    return false;
                }
            } else {
                throw new java.lang.IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.B().d() && !this.sdk.B().c()) {
            return true;
        }
        com.applovin.impl.sdk.n.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl3 = new com.applovin.impl.mediation.MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
        }
        com.applovin.impl.fc.a(this.adListener, (com.applovin.mediation.MaxAd) this.f, (com.applovin.mediation.MaxError) maxErrorImpl3, true);
        this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str) {
        if (this.i.compareAndSet(true, false)) {
            com.applovin.impl.sdk.n.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.B().c(this.adUnitId);
            com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            com.applovin.impl.kf kfVar = new com.applovin.impl.kf(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + kfVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            com.applovin.impl.fc.a(this.adListener, (com.applovin.mediation.MaxAd) kfVar, (com.applovin.mediation.MaxError) maxErrorImpl, true);
            if (this.f != null) {
                this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
            }
        }
    }

    private void a(java.lang.String str, java.lang.String str2) {
        this.d.e(this.f);
        this.f.g(str);
        this.f.f(str2);
        this.l = str;
        this.m = str2;
        this.sdk.v().d(this.f);
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f + "...");
        }
        a((com.applovin.impl.fe) this.f);
    }

    private void a() {
        com.applovin.impl.he heVar;
        synchronized (this.e) {
            heVar = this.f;
            this.f = null;
        }
        this.sdk.P().destroyAd(heVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d dVar, com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e eVar) {
        com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl;
        boolean z;
        com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl2 = new com.applovin.impl.mediation.MaxErrorImpl(-1);
        com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d dVar2 = this.g;
        synchronized (this.e) {
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d dVar3 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.IDLE;
            if (dVar2 == dVar3) {
                if (dVar == com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.LOADING || dVar == com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED) {
                    z = true;
                } else {
                    if (dVar == com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.SHOWING) {
                        com.applovin.impl.sdk.n.h(this.tag, "No ad is loading or loaded");
                    } else if (com.applovin.impl.sdk.n.a()) {
                        this.logger.b(this.tag, "Unable to transition to: " + dVar);
                    }
                    z = false;
                }
            } else {
                com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d dVar4 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.LOADING;
                if (dVar2 == dVar4) {
                    if (dVar != dVar3) {
                        if (dVar == dVar4) {
                            maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-26, "An ad is already loading");
                            com.applovin.impl.sdk.n.h(this.tag, maxErrorImpl.getMessage());
                            maxErrorImpl2 = maxErrorImpl;
                        } else if (dVar != com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.READY) {
                            if (dVar == com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.SHOWING) {
                                com.applovin.impl.sdk.n.h(this.tag, "An ad is not ready to be shown yet");
                            } else if (dVar != com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                }
                            }
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d dVar5 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.READY;
                    if (dVar2 == dVar5) {
                        if (dVar != dVar3) {
                            if (dVar == dVar4) {
                                com.applovin.impl.sdk.n.h(this.tag, "An ad is already loaded");
                            } else if (dVar == dVar5) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.logger.b(this.tag, "An ad is already marked as ready");
                                }
                            } else if (dVar != com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.SHOWING && dVar != com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d dVar6 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.SHOWING;
                        if (dVar2 == dVar6) {
                            if (dVar != dVar3) {
                                if (dVar == dVar4) {
                                    maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-27, "Can not load another ad while the ad is showing");
                                    com.applovin.impl.sdk.n.h(this.tag, maxErrorImpl.getMessage());
                                    maxErrorImpl2 = maxErrorImpl;
                                } else if (dVar == dVar5) {
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.logger.b(this.tag, "An ad is already showing, ignoring");
                                    }
                                } else if (dVar == dVar6) {
                                    com.applovin.impl.sdk.n.h(this.tag, "The ad is already showing, not showing another one");
                                } else if (dVar != com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED) {
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                    }
                                }
                            }
                            z = true;
                        } else if (dVar2 == com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED) {
                            com.applovin.impl.sdk.n.h(this.tag, "No operations are allowed on a destroyed instance");
                        } else if (com.applovin.impl.sdk.n.a()) {
                            this.logger.b(this.tag, "Unknown state: " + this.g);
                        }
                        z = false;
                    }
                }
                throw th;
            }
            if (z) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Transitioning from " + this.g + " to " + dVar + "...");
                }
                this.g = dVar;
            } else if (com.applovin.impl.sdk.n.a()) {
                this.logger.k(this.tag, "Not allowed to transition from " + this.g + " to " + dVar);
            }
        }
        if (z) {
            eVar.a();
        } else {
            eVar.a(maxErrorImpl2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.mediation.MaxAd maxAd) {
        this.sdk.f().a((com.applovin.impl.he) maxAd);
        this.d.a();
        a();
        this.sdk.S().a((com.applovin.impl.fe) maxAd);
    }
}
