package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f674a;

    public cd(com.applovin.impl.sdk.j jVar) {
        this.f674a = jVar;
    }

    public void a(com.applovin.impl.he heVar, android.app.Activity activity, com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener) {
        com.applovin.impl.yp.b();
        if (activity == null) {
            activity = this.f674a.e().b();
        }
        if (heVar.getNativeAd() != null) {
            this.f674a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f674a.I().a("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f674a.e().a(new com.applovin.impl.cd.b(heVar, this.f674a, maxAdapterListener));
            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity.class));
            return;
        }
        if (heVar.y() != null) {
            this.f674a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f674a.I().a("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f674a.e().a(new com.applovin.impl.cd.a(heVar, this.f674a, maxAdapterListener));
            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) com.applovin.mediation.hybridAds.MaxHybridMRecAdActivity.class));
            return;
        }
        if (maxAdapterListener instanceof com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) {
            ((com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError.AD_DISPLAY_FAILED);
        } else {
            if (maxAdapterListener instanceof com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) {
                ((com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(com.applovin.mediation.adapter.MaxAdapterError.AD_DISPLAY_FAILED);
                return;
            }
            throw new java.lang.IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
        }
    }

    private static class b extends com.applovin.impl.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.he f676a;
        private final com.applovin.impl.sdk.j b;
        private final com.applovin.mediation.adapter.listeners.MaxAdapterListener c;

        public b(com.applovin.impl.he heVar, com.applovin.impl.sdk.j jVar, com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener) {
            this.f676a = heVar;
            this.b = jVar;
            this.c = maxAdapterListener;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            if (activity instanceof com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity) {
                ((com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity) activity).a(this.f676a.H(), this.f676a.getNativeAd(), this.b, this.c);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            if ((activity instanceof com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity) && !activity.isChangingConfigurations() && this.f676a.w().get()) {
                this.b.e().b(this);
            }
        }
    }

    private static class a extends com.applovin.impl.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.he f675a;
        private final com.applovin.impl.sdk.j b;
        private final com.applovin.mediation.adapter.listeners.MaxAdapterListener c;

        public a(com.applovin.impl.he heVar, com.applovin.impl.sdk.j jVar, com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener) {
            this.f675a = heVar;
            this.b = jVar;
            this.c = maxAdapterListener;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            if (activity instanceof com.applovin.mediation.hybridAds.MaxHybridMRecAdActivity) {
                ((com.applovin.mediation.hybridAds.MaxHybridMRecAdActivity) activity).a(this.f675a.H(), this.f675a.y(), this.b, this.c);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            if ((activity instanceof com.applovin.mediation.hybridAds.MaxHybridMRecAdActivity) && !activity.isChangingConfigurations() && this.f675a.w().get()) {
                this.b.e().b(this);
            }
        }
    }
}
