package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class g {
    private final com.applovin.impl.sdk.j b;
    private final com.applovin.impl.sdk.n c;
    private final java.lang.String d;
    private final com.applovin.impl.oe e;
    private final java.lang.String f;
    private com.applovin.mediation.adapter.MaxAdapter g;
    private java.lang.String h;
    private com.applovin.impl.fe i;
    private android.view.View j;
    private com.applovin.mediation.nativeAds.MaxNativeAd k;
    private com.applovin.mediation.nativeAds.MaxNativeAdView l;
    private android.view.ViewGroup m;
    private com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters o;
    private final boolean s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f1063a = new android.os.Handler(android.os.Looper.getMainLooper());
    private final com.applovin.impl.mediation.g.d n = new com.applovin.impl.mediation.g.d(this, null);
    private final java.util.concurrent.atomic.AtomicBoolean p = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final java.util.concurrent.atomic.AtomicBoolean q = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean r = new java.util.concurrent.atomic.AtomicBoolean(false);

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.mediation.adapter.MaxAdapter maxAdapter = com.applovin.impl.mediation.g.this.g;
            if (maxAdapter != null) {
                com.applovin.impl.mediation.g.this.g = null;
                maxAdapter.onDestroy();
            } else {
                com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", "Mediation adapter '" + com.applovin.impl.mediation.g.this.f + "' is already destroyed");
                }
            }
            com.applovin.impl.mediation.g.this.j = null;
            com.applovin.impl.mediation.g.this.k = null;
            com.applovin.impl.mediation.g.this.l = null;
            com.applovin.impl.mediation.g.this.m = null;
        }
    }

    public interface c {
        void a(com.applovin.mediation.MaxError maxError);

        void onSignalCollected(java.lang.String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class d implements com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener, com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener, com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener, com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.applovin.impl.mediation.MediationServiceImpl.d f1066a;

        private d() {
        }

        private void b(java.lang.String str, final android.os.Bundle bundle) {
            if (com.applovin.impl.mediation.g.this.i.w().compareAndSet(false, true)) {
                a(str, this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.j(bundle);
                    }
                });
            }
        }

        private void c(java.lang.String str, final android.os.Bundle bundle) {
            if (!com.applovin.impl.mediation.g.this.i.w().get()) {
                com.applovin.impl.mediation.g.this.r.set(true);
                a(str, this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.k(bundle);
                    }
                });
            } else {
                com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.g.this.c.b("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": blocking ad loaded callback for " + com.applovin.impl.mediation.g.this.i + " since onAdHidden() has been called");
                }
                com.applovin.impl.mediation.g.this.b.q().a(com.applovin.impl.mediation.g.this.i, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(android.os.Bundle bundle) {
            this.f1066a.a(com.applovin.impl.mediation.g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(android.os.Bundle bundle) {
            this.f1066a.a(com.applovin.impl.mediation.g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(android.os.Bundle bundle) {
            this.f1066a.a(com.applovin.impl.mediation.g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(android.os.Bundle bundle) {
            this.f1066a.a(com.applovin.impl.mediation.g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(android.os.Bundle bundle) {
            this.f1066a.c(com.applovin.impl.mediation.g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(android.os.Bundle bundle) {
            this.f1066a.c(com.applovin.impl.mediation.g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(android.os.Bundle bundle) {
            this.f1066a.e(com.applovin.impl.mediation.g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(android.os.Bundle bundle) {
            if (com.applovin.impl.mediation.g.this.q.compareAndSet(false, true)) {
                this.f1066a.f(com.applovin.impl.mediation.g.this.i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(android.view.View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(android.os.Bundle bundle) {
            if (com.applovin.impl.mediation.g.this.i.Y()) {
                return;
            }
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd, android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": native ad loaded with extra info: " + bundle);
            }
            com.applovin.impl.mediation.g.this.k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            onRewardedInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoadFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(com.applovin.mediation.MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        /* synthetic */ d(com.applovin.impl.mediation.g gVar, com.applovin.impl.mediation.g.a aVar) {
            this();
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(android.os.Bundle bundle) {
            if (com.applovin.impl.mediation.g.this.i.Y()) {
                return;
            }
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(final android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(android.view.View view, android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": adview ad loaded with extra info: " + bundle);
            }
            com.applovin.impl.mediation.g.this.j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(final android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.d(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(final android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.f(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked(final android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded interstitial ad clicked with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdClicked", this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.g(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError maxAdapterError, android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.k("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded interstitial ad hidden with extra info: " + bundle);
            }
            b("onRewardedInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(android.os.Bundle bundle) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            }
            c("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(final com.applovin.mediation.MaxReward maxReward, final android.os.Bundle bundle) {
            if (com.applovin.impl.mediation.g.this.i instanceof com.applovin.impl.he) {
                final com.applovin.impl.he heVar = (com.applovin.impl.he) com.applovin.impl.mediation.g.this.i;
                if (heVar.p0().compareAndSet(false, true)) {
                    com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.mediation.g.this.c.d("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a(heVar, maxReward, bundle);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(android.os.Bundle bundle) {
            this.f1066a.d(com.applovin.impl.mediation.g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(android.os.Bundle bundle) {
            this.f1066a.a(com.applovin.impl.mediation.g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.impl.he heVar, com.applovin.mediation.MaxReward maxReward, android.os.Bundle bundle) {
            this.f1066a.a(heVar, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.mediation.MediationServiceImpl.d dVar) {
            if (dVar != null) {
                this.f1066a = dVar;
                return;
            }
            throw new java.lang.IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(java.lang.String str, final com.applovin.mediation.MaxError maxError) {
            if (com.applovin.impl.mediation.g.this.i.w().get()) {
                com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.g.this.c.b("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": blocking ad load failed callback for " + com.applovin.impl.mediation.g.this.i + " since onAdHidden() has been called");
                }
                com.applovin.impl.mediation.g.this.b.q().a(com.applovin.impl.mediation.g.this.i, str);
                return;
            }
            a(str, this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(maxError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.mediation.MaxError maxError) {
            if (com.applovin.impl.mediation.g.this.q.compareAndSet(false, true)) {
                this.f1066a.onAdLoadFailed(com.applovin.impl.mediation.g.this.h, maxError);
            }
        }

        private void a(java.lang.String str, final android.os.Bundle bundle) {
            if (com.applovin.impl.mediation.g.this.i.w().get()) {
                com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.g.this.c.b("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": blocking ad displayed callback for " + com.applovin.impl.mediation.g.this.i + " since onAdHidden() has been called");
                }
                com.applovin.impl.mediation.g.this.b.q().a(com.applovin.impl.mediation.g.this.i, str);
                return;
            }
            if (!((java.lang.Boolean) com.applovin.impl.mediation.g.this.b.a(com.applovin.impl.ue.K7)).booleanValue()) {
                if (com.applovin.impl.mediation.g.this.i.u().compareAndSet(false, true)) {
                    a(str, this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.i(bundle);
                        }
                    });
                    return;
                }
                return;
            }
            a(str, this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.h(bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(java.lang.String str, final com.applovin.mediation.MaxError maxError, final android.os.Bundle bundle) {
            if (com.applovin.impl.mediation.g.this.i.w().get()) {
                com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.g.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mediation.g.this.c.b("MediationAdapterWrapper", com.applovin.impl.mediation.g.this.f + ": blocking ad display failed callback for " + com.applovin.impl.mediation.g.this.i + " since onAdHidden() has been called");
                }
                com.applovin.impl.mediation.g.this.b.q().a(com.applovin.impl.mediation.g.this.i, str);
                return;
            }
            a(str, this.f1066a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(maxError, bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.mediation.MaxError maxError, android.os.Bundle bundle) {
            this.f1066a.a(com.applovin.impl.mediation.g.this.i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(android.os.Bundle bundle) {
            this.f1066a.a(com.applovin.impl.mediation.g.this.i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f1066a.onAdCollapsed(com.applovin.impl.mediation.g.this.i);
        }

        private void a(final java.lang.String str, final com.applovin.mediation.MaxAdListener maxAdListener, final java.lang.Runnable runnable) {
            com.applovin.impl.mediation.g.this.f1063a.post(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$d$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(runnable, maxAdListener, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(java.lang.Runnable runnable, com.applovin.mediation.MaxAdListener maxAdListener, java.lang.String str) {
            try {
                runnable.run();
            } catch (java.lang.Throwable th) {
                com.applovin.impl.sdk.n.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + (maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                com.applovin.impl.mediation.g.this.b.D().a("MediationAdapterWrapper", str, th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("adapter_class", com.applovin.impl.mediation.g.this.e.b()));
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.g$g, reason: collision with other inner class name */
    private class C0043g extends com.applovin.impl.yl {
        private final java.lang.ref.WeakReference h;

        /* synthetic */ C0043g(com.applovin.impl.mediation.g gVar, com.applovin.impl.mediation.g.a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.mediation.g.this.q.get()) {
                return;
            }
            if (com.applovin.impl.mediation.g.this.i.Z()) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, com.applovin.impl.mediation.g.this.f + " is timing out, considering JS Tag ad loaded: " + com.applovin.impl.mediation.g.this.i);
                }
                b(com.applovin.impl.mediation.g.this.i);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, com.applovin.impl.mediation.g.this.f + " is timing out " + com.applovin.impl.mediation.g.this.i + "...");
            }
            b(com.applovin.impl.mediation.g.this.i);
            com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-5101, "Adapter timed out");
            com.applovin.impl.mediation.g.d dVar = (com.applovin.impl.mediation.g.d) this.h.get();
            if (dVar != null) {
                dVar.a(this.b, maxErrorImpl);
            }
        }

        private C0043g() {
            super("TaskTimeoutMediatedAd", com.applovin.impl.mediation.g.this.b);
            this.h = new java.lang.ref.WeakReference(com.applovin.impl.mediation.g.this.n);
        }

        private void b(com.applovin.impl.fe feVar) {
            if (feVar != null) {
                this.f1547a.R().a(feVar);
            }
        }
    }

    private class h extends com.applovin.impl.yl {
        private final com.applovin.impl.mediation.g.f h;

        /* synthetic */ h(com.applovin.impl.mediation.g gVar, com.applovin.impl.mediation.g.f fVar, com.applovin.impl.mediation.g.a aVar) {
            this(fVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.h.c.get()) {
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, com.applovin.impl.mediation.g.this.f + " is timing out " + this.h.f1068a + "...");
            }
            com.applovin.impl.mediation.g.this.a(new com.applovin.impl.mediation.MaxErrorImpl(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + com.applovin.impl.mediation.g.this.f + ") timed out"), this.h);
        }

        private h(com.applovin.impl.mediation.g.f fVar) {
            super("TaskTimeoutSignalCollection", com.applovin.impl.mediation.g.this.b);
            this.h = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        com.applovin.impl.mediation.g.b bVar = new com.applovin.impl.mediation.g.b();
        if (((java.lang.Boolean) this.b.a(com.applovin.impl.ue.M7)).booleanValue()) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    public java.lang.String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f + "'}";
    }

    public android.view.View d() {
        return this.j;
    }

    public com.applovin.mediation.nativeAds.MaxNativeAd e() {
        return this.k;
    }

    public com.applovin.mediation.nativeAds.MaxNativeAdView f() {
        return this.l;
    }

    public android.view.ViewGroup h() {
        return this.m;
    }

    public java.lang.String i() {
        com.applovin.mediation.adapter.MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.d, th);
            this.b.D().a("MediationAdapterWrapper", "sdk_version", th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("sdk_version");
            this.b.L().a(this.e.b(), "sdk_version", this.i);
            return null;
        }
    }

    public boolean j() {
        return this.q.get() && this.r.get();
    }

    public boolean k() {
        return this.p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter) this.g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity) {
        ((com.applovin.mediation.adapters.MediationAdapterBase) this.g).loadNativeAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxInterstitialAdapter) this.g).showInterstitialAd(this.o, activity, this.n);
    }

    public java.lang.String g() {
        return this.d;
    }

    g(com.applovin.impl.oe oeVar, com.applovin.mediation.adapter.MaxAdapter maxAdapter, boolean z, com.applovin.impl.sdk.j jVar) {
        if (oeVar == null) {
            throw new java.lang.IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new java.lang.IllegalArgumentException("No adapter specified");
        }
        if (jVar != null) {
            this.d = oeVar.c();
            this.g = maxAdapter;
            this.b = jVar;
            this.c = jVar.I();
            this.e = oeVar;
            this.f = maxAdapter.getClass().getSimpleName();
            this.s = z;
            return;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified");
    }

    public void c(final com.applovin.impl.fe feVar, final android.app.Activity activity) {
        java.lang.Runnable runnable;
        if (b(feVar, activity)) {
            if (feVar.Y()) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(feVar, activity);
                    }
                };
            } else if (feVar.getFormat() == com.applovin.mediation.MaxAdFormat.INTERSTITIAL) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(activity);
                    }
                };
            } else if (feVar.getFormat() == com.applovin.mediation.MaxAdFormat.APP_OPEN) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(activity);
                    }
                };
            } else if (feVar.getFormat() == com.applovin.mediation.MaxAdFormat.REWARDED) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(activity);
                    }
                };
            } else if (feVar.getFormat() == com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(activity);
                    }
                };
            } else {
                throw new java.lang.IllegalStateException("Failed to show " + feVar + ": " + feVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, feVar);
        }
    }

    public com.applovin.impl.mediation.MediationServiceImpl.d c() {
        return this.n.f1066a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxRewardedAdapter) this.g).loadRewardedAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter) this.g).showRewardedInterstitialAd(this.o, activity, this.n);
    }

    private boolean b(com.applovin.impl.fe feVar, android.app.Activity activity) {
        if (feVar != null) {
            if (feVar.A() == null) {
                com.applovin.impl.sdk.n.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.n.a("ad_show", new com.applovin.impl.mediation.MaxErrorImpl(-1, "Adapter has been garbage collected"), (android.os.Bundle) null);
                return false;
            }
            if (feVar.A() == this) {
                if (activity == null && com.applovin.mediation.MaxAdFormat.APP_OPEN != feVar.getFormat()) {
                    throw new java.lang.IllegalArgumentException("No activity specified");
                }
                if (!this.p.get()) {
                    java.lang.String str = "Mediation adapter '" + this.f + "' is disabled. Showing ads with this adapter is disabled.";
                    com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str);
                    this.n.a("ad_show", new com.applovin.impl.mediation.MaxErrorImpl(-1, str), (android.os.Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new java.lang.IllegalStateException("Mediation adapter '" + this.f + "' does not have an ad loaded. Please load an ad first");
            }
            throw new java.lang.IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new java.lang.IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxAppOpenAdapter) this.g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxRewardedAdapter) this.g).showRewardedAd(this.o, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxRewardedAdViewAdapter) this.g).showRewardedAd(this.o, viewGroup, lifecycle, activity, this.n);
    }

    public java.lang.String b() {
        com.applovin.mediation.adapter.MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.d, th);
            this.b.D().a("MediationAdapterWrapper", "adapter_version", th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("adapter_version");
            this.b.L().a(this.e.b(), "adapter_version", this.i);
            return null;
        }
    }

    private void b(java.lang.String str, java.lang.Runnable runnable) {
        a(str, (com.applovin.mediation.MaxAdFormat) null, runnable);
    }

    void a(final com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final com.applovin.impl.zj zjVar, final android.app.Activity activity, com.applovin.impl.mediation.g.c cVar) {
        if (cVar != null) {
            if (!this.p.get()) {
                com.applovin.impl.sdk.n.h("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is disabled. Signal collection ads with this adapter is disabled.");
                cVar.a(new com.applovin.impl.mediation.MaxErrorImpl("The adapter (" + this.f + ") is disabled"));
                return;
            }
            final com.applovin.impl.mediation.g.f fVar = new com.applovin.impl.mediation.g.f(zjVar, cVar);
            com.applovin.mediation.adapter.MaxAdapter maxAdapter = this.g;
            if (maxAdapter instanceof com.applovin.mediation.adapter.MaxSignalProvider) {
                final com.applovin.mediation.adapter.MaxSignalProvider maxSignalProvider = (com.applovin.mediation.adapter.MaxSignalProvider) maxAdapter;
                b("collect_signal", new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(zjVar, fVar, maxSignalProvider, maxAdapterSignalCollectionParameters, activity);
                    }
                });
                return;
            } else {
                a(new com.applovin.impl.mediation.MaxErrorImpl(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "The adapter (" + this.f + ") does not support signal collection"), fVar);
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("No callback specified");
    }

    class a implements com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.zj f1064a;
        final /* synthetic */ com.applovin.impl.mediation.g.f b;

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(java.lang.String str) {
            if (this.f1064a.x() && android.text.TextUtils.isEmpty(str)) {
                com.applovin.impl.mediation.g.this.a(new com.applovin.impl.mediation.MaxErrorImpl("Signal is not a valid string"), this.b);
            } else {
                com.applovin.impl.mediation.g.this.a(str, this.b);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(java.lang.String str) {
            com.applovin.impl.mediation.g.this.a(new com.applovin.impl.mediation.MaxErrorImpl(str), this.b);
        }

        a(com.applovin.impl.zj zjVar, com.applovin.impl.mediation.g.f fVar) {
            this.f1064a = zjVar;
            this.b = fVar;
        }
    }

    private void a(final java.lang.Runnable runnable, com.applovin.impl.fe feVar) {
        a("show_ad", feVar.getFormat(), new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.zj f1068a;
        private final com.applovin.impl.mediation.g.c b;
        private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();

        f(com.applovin.impl.zj zjVar, com.applovin.impl.mediation.g.c cVar) {
            this.f1068a = zjVar;
            this.b = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.j f1067a;
        private final com.applovin.impl.oe b;
        private final long c;
        private final com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener d;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.mediation.adapter.MaxAdapter.InitializationStatus initializationStatus, java.lang.String str) {
            this.f1067a.K().a(this.b, android.os.SystemClock.elapsedRealtime() - this.c, initializationStatus, str);
            com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener onCompletionListener = this.d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(final com.applovin.mediation.adapter.MaxAdapter.InitializationStatus initializationStatus, final java.lang.String str) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$e$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(initializationStatus, str);
                }
            }, this.b.h());
        }

        public e(com.applovin.impl.sdk.j jVar, com.applovin.impl.oe oeVar, long j, com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f1067a = jVar;
            this.b = oeVar;
            this.c = j;
            this.d = onCompletionListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.zj zjVar, com.applovin.impl.mediation.g.f fVar, com.applovin.mediation.adapter.MaxSignalProvider maxSignalProvider, com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, android.app.Activity activity) {
        a(zjVar, fVar);
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new com.applovin.impl.mediation.g.a(zjVar, fVar));
        } catch (java.lang.Throwable th) {
            com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl("Failed signal collection for " + this.d + " due to: " + th);
            com.applovin.impl.sdk.n.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            a(maxErrorImpl, fVar);
            this.b.D().a("MediationAdapterWrapper", "collect_signal", th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("collect_signal");
            this.b.L().a(this.e.b(), "collect_signal", this.i);
        }
        if (!fVar.c.get() && zjVar.m() == 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("MediationAdapterWrapper", "Failing signal collection " + zjVar + " since it has 0 timeout");
            }
            a(new com.applovin.impl.mediation.MaxErrorImpl(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + this.f + ") has 0 timeout"), fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.fe feVar, java.lang.Runnable runnable) {
        a(this.e, feVar);
        try {
            runnable.run();
        } catch (java.lang.Throwable th) {
            java.lang.String str = "Failed to start loading ad for " + this.d + " due to: " + th;
            com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str);
            this.n.a("load_ad", new com.applovin.impl.mediation.MaxErrorImpl(-1, str));
            this.b.D().a("MediationAdapterWrapper", "load_ad", th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("load_ad");
            this.b.L().a(this.e.b(), "load_ad", this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.fe feVar, android.app.Activity activity) {
        this.b.E().a((com.applovin.impl.he) feVar, activity, this.n);
    }

    public void a(java.lang.String str, final com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, final com.applovin.impl.fe feVar, final android.app.Activity activity, com.applovin.impl.mediation.MediationServiceImpl.d dVar) {
        final java.lang.Runnable runnable;
        if (feVar != null) {
            if (!this.p.get()) {
                java.lang.String str2 = "Mediation adapter '" + this.f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str2);
                dVar.onAdLoadFailed(str, new com.applovin.impl.mediation.MaxErrorImpl(-1, str2));
                return;
            }
            this.o = maxAdapterResponseParameters;
            this.n.a(dVar);
            final com.applovin.mediation.MaxAdFormat maxAdFormatI = feVar.Y() ? feVar.I() : feVar.getFormat();
            if (maxAdFormatI == com.applovin.mediation.MaxAdFormat.INTERSTITIAL) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (maxAdFormatI == com.applovin.mediation.MaxAdFormat.APP_OPEN) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda13
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (maxAdFormatI == com.applovin.mediation.MaxAdFormat.REWARDED) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda14
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (maxAdFormatI == com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (maxAdFormatI == com.applovin.mediation.MaxAdFormat.NATIVE) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda16
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.e(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (maxAdFormatI.isAdViewAd()) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda17
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(maxAdapterResponseParameters, maxAdFormatI, activity);
                    }
                };
            } else {
                throw new java.lang.IllegalStateException("Failed to load " + feVar + ": " + feVar.getFormat() + " (" + feVar.I() + ") is not a supported ad format");
            }
            a("load_ad", maxAdFormatI, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(feVar, runnable);
                }
            });
            return;
        }
        throw new java.lang.IllegalArgumentException("No mediated ad specified");
    }

    private void a(com.applovin.impl.oe oeVar, com.applovin.impl.fe feVar) {
        a(new com.applovin.impl.mediation.g.C0043g(this, null), oeVar, feVar);
    }

    private void a(com.applovin.impl.oe oeVar, com.applovin.impl.mediation.g.f fVar) {
        a(new com.applovin.impl.mediation.g.h(this, fVar, null), oeVar, (com.applovin.impl.fe) null);
    }

    private void a(com.applovin.impl.yl ylVar, com.applovin.impl.oe oeVar, com.applovin.impl.fe feVar) {
        long jM = oeVar.m();
        if (jM <= 0) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.c;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Non-positive timeout set for ");
                if (feVar != null) {
                    oeVar = feVar;
                }
                nVar.a("MediationAdapterWrapper", sb.append(oeVar).append(", not scheduling a timeout").toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar2 = this.c;
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Setting timeout ").append(jM).append("ms for ");
            if (feVar != null) {
                oeVar = feVar;
            }
            nVar2.a("MediationAdapterWrapper", sbAppend.append(oeVar).toString());
        }
        this.b.i0().a(ylVar, com.applovin.impl.tm.b.TIMEOUT, jM);
    }

    void a(java.lang.String str, com.applovin.impl.fe feVar) {
        this.h = str;
        this.i = feVar;
    }

    public void a(com.applovin.impl.fe feVar, final android.view.ViewGroup viewGroup, final androidx.lifecycle.Lifecycle lifecycle, final android.app.Activity activity) {
        java.lang.Runnable runnable;
        if (b(feVar, activity)) {
            if (feVar.getFormat() == com.applovin.mediation.MaxAdFormat.INTERSTITIAL) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(viewGroup, lifecycle, activity);
                    }
                };
            } else if (feVar.getFormat() == com.applovin.mediation.MaxAdFormat.REWARDED) {
                runnable = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(viewGroup, lifecycle, activity);
                    }
                };
            } else {
                throw new java.lang.IllegalStateException("Failed to show " + feVar + ": " + feVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, feVar);
        }
    }

    void a(final com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters maxAdapterInitializationParameters, final android.app.Activity activity, final com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener onCompletionListener) {
        b(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(onCompletionListener, maxAdapterInitializationParameters, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener onCompletionListener, com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters maxAdapterInitializationParameters, android.app.Activity activity) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("MediationAdapterWrapper", "Initializing " + this.f + " on thread: " + java.lang.Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.e.r());
        }
        this.g.initialize(maxAdapterInitializationParameters, activity, new com.applovin.impl.mediation.g.e(this.b, this.e, jElapsedRealtime, onCompletionListener));
    }

    public void a(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView) {
        this.l = maxNativeAdView;
    }

    public void a(android.view.ViewGroup viewGroup) {
        this.m = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxInterstitialAdapter) this.g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters maxAdapterResponseParameters, com.applovin.mediation.MaxAdFormat maxAdFormat, android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxAdViewAdapter) this.g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxAppOpenAdapter) this.g).showAppOpenAd(this.o, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity) {
        ((com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter) this.g).showInterstitialAd(this.o, viewGroup, lifecycle, activity, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.Throwable th) {
            java.lang.String str = "Failed to start displaying ad for " + this.d + " due to: " + th;
            com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str);
            this.n.a("show_ad", new com.applovin.impl.mediation.MaxErrorImpl(-1, str), (android.os.Bundle) null);
            this.b.D().a("MediationAdapterWrapper", "show_ad", th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("show_ad");
            this.b.L().a(this.e.b(), "show_ad", this.i);
        }
    }

    void a() {
        if (this.s) {
            return;
        }
        b("destroy", new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, com.applovin.impl.mediation.g.f fVar) {
        if (!fVar.c.compareAndSet(false, true) || fVar.b == null) {
            return;
        }
        fVar.b.onSignalCollected(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.mediation.MaxError maxError, com.applovin.impl.mediation.g.f fVar) {
        if (!fVar.c.compareAndSet(false, true) || fVar.b == null) {
            return;
        }
        fVar.b.a(maxError);
    }

    private void a(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("MediationAdapterWrapper", "Marking " + this.f + " as disabled due to: " + str);
        }
        this.p.set(false);
    }

    private void a(final java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, final java.lang.Runnable runnable) {
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.applovin.impl.mediation.g$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, runnable);
            }
        };
        if (a(str, maxAdFormat)) {
            this.f1063a.post(runnable2);
            return;
        }
        com.applovin.impl.jn jnVar = new com.applovin.impl.jn(this.b, str + ":" + this.e.c(), runnable2);
        if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.b0)).booleanValue()) {
            this.b.i0().a(jnVar, this.e);
        } else {
            this.b.i0().a(jnVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str, java.lang.Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("MediationAdapterWrapper", this.f + ": running " + str + "...");
            }
            runnable.run();
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("MediationAdapterWrapper", this.f + ": finished " + str + "");
            }
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("MediationAdapterWrapper", "Failed operation " + str + " for " + this.d, th);
            a("fail_" + str);
            if (!str.equals("destroy")) {
                this.b.L().a(this.e.b(), str, this.i);
            }
            java.util.HashMap<java.lang.String, java.lang.String> mapHashMap = com.applovin.impl.sdk.utils.CollectionUtils.hashMap("is_wrapper", com.json.mediationsdk.metadata.a.g);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("adapter_class", this.e.b(), mapHashMap);
            this.b.D().a("MediationAdapterWrapper", str, th, mapHashMap);
        }
    }

    private boolean a(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        java.lang.Boolean boolShouldShowAdsOnUiThread;
        com.applovin.mediation.adapter.MaxAdapter maxAdapter = this.g;
        if (maxAdapter == null) {
            return this.e.r();
        }
        if (com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            java.lang.Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            java.lang.Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            java.lang.Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null && (boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat)) != null) {
            return boolShouldShowAdsOnUiThread.booleanValue();
        }
        return this.e.r();
    }
}
