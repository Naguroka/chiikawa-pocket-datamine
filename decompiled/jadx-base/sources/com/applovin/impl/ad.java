package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ad extends android.app.Activity implements com.applovin.impl.zc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.applovin.impl.sdk.j f590a;
    protected com.applovin.impl.zc b;
    protected com.applovin.impl.bd c = new com.applovin.impl.bd(null);
    private com.applovin.mediation.adapter.listeners.MaxAdapterListener d;

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(android.R.id.content);
        viewGroup.setBackgroundColor(this.c.a());
        com.applovin.impl.sdk.j jVar = this.f590a;
        com.applovin.impl.r.a(jVar != null ? ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.z2)).booleanValue() : true, this);
        com.applovin.impl.zc zcVar = new com.applovin.impl.zc(this.c, this);
        this.b = zcVar;
        zcVar.setListener(this);
        this.b.setVisibility(4);
        viewGroup.addView(this.b);
        com.applovin.impl.zq.a(this.b, this.c.b());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) {
                ((com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else if (maxAdapterListener instanceof com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) {
                ((com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            } else {
                throw new java.lang.IllegalStateException("Failed to fire hidden callback (" + this.d + "): neither interstitial nor app open ad");
            }
        }
        super.onDestroy();
    }

    protected void a(android.view.View view, java.lang.String str) {
        if (view == null) {
            a(str);
            return;
        }
        ((android.view.ViewGroup) findViewById(android.R.id.content)).addView(view);
        this.b.bringToFront();
        com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener instanceof com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) {
            ((com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
        } else {
            if (maxAdapterListener instanceof com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) {
                ((com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
                return;
            }
            throw new java.lang.IllegalStateException("Failed to fire display callback (" + this.d + "): neither interstitial nor app open ad");
        }
    }

    private void a(java.lang.String str) {
        com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = new com.applovin.mediation.adapter.MaxAdapterError(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Null hybrid ad view (" + str + ")");
        com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener instanceof com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) {
            ((com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(maxAdapterError);
        } else if (maxAdapterListener instanceof com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) {
            ((com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(maxAdapterError);
        } else {
            throw new java.lang.IllegalStateException("Failed to fire display failed callback (" + this.d + "): neither interstitial nor app open ad");
        }
        finish();
    }

    protected void a(com.applovin.impl.bd bdVar, com.applovin.impl.sdk.j jVar, com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener) {
        this.f590a = jVar;
        this.c = bdVar;
        this.d = maxAdapterListener;
    }

    @Override // com.applovin.impl.zc.a
    public void a(com.applovin.impl.zc zcVar) {
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
