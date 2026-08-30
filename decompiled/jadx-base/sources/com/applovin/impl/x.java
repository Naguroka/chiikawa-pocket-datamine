package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends com.applovin.impl.re implements com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a, com.applovin.mediation.MaxRewardedAdListener, com.applovin.mediation.MaxAdViewAdListener, com.applovin.mediation.MaxAdRevenueListener, com.applovin.impl.o0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f1480a;
    private com.applovin.impl.z b;
    private com.applovin.impl.ir c;
    private com.applovin.impl.y d;
    private com.applovin.mediation.ads.MaxAdView f;
    private com.applovin.mediation.ads.MaxInterstitialAd g;
    private com.applovin.mediation.ads.MaxAppOpenAd h;
    private com.applovin.mediation.ads.MaxRewardedInterstitialAd i;
    private com.applovin.mediation.ads.MaxRewardedAd j;
    private com.applovin.mediation.nativeAds.MaxNativeAdView k;
    private com.applovin.mediation.nativeAds.MaxNativeAdLoader l;
    private com.applovin.mediation.MaxAd m;
    private com.applovin.impl.d0 n;
    private java.util.List o;
    private android.widget.ListView p;
    private android.view.View q;
    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton r;
    private android.widget.TextView s;
    private com.applovin.impl.o0 t;

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.yp.a(com.json.ju.f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.yp.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.yp.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.yp.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.yp.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.yp.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxReward maxReward) {
        com.applovin.impl.yp.a("onUserRewarded", maxAd, this);
    }

    public void initialize(final com.applovin.impl.z zVar, final com.applovin.impl.a0 a0Var, com.applovin.impl.ir irVar, final com.applovin.impl.sdk.j jVar) {
        java.util.List listA;
        this.f1480a = jVar;
        this.b = zVar;
        this.c = irVar;
        this.o = jVar.k0().b();
        com.applovin.impl.y yVar = new com.applovin.impl.y(zVar, a0Var, irVar, this);
        this.d = yVar;
        yVar.a(new com.applovin.impl.dc.a() { // from class: com.applovin.impl.x$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.dc.a
            public final void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar) {
                this.f$0.a(jVar, zVar, a0Var, kbVar, ccVar);
            }
        });
        b();
        if (zVar.f().f()) {
            if ((irVar != null && !irVar.b().d().C()) || (listA = jVar.M().a(zVar.c())) == null || listA.isEmpty()) {
                return;
            }
            this.t = new com.applovin.impl.o0(listA, zVar.a(), this);
        }
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f1480a;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.d.k());
        this.p = (android.widget.ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.q = findViewById(com.applovin.sdk.R.id.ad_presenter_view);
        this.r = (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton) findViewById(com.applovin.sdk.R.id.ad_control_button);
        this.s = (android.widget.TextView) findViewById(com.applovin.sdk.R.id.status_textview);
        this.p.setAdapter((android.widget.ListAdapter) this.d);
        this.s.setText(a());
        this.s.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        this.r.setOnClickListener(this);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.q.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.c != null) {
            this.f1480a.k0().a(this.o);
        }
        com.applovin.mediation.ads.MaxAdView maxAdView = this.f;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        com.applovin.mediation.ads.MaxInterstitialAd maxInterstitialAd = this.g;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        com.applovin.mediation.ads.MaxAppOpenAd maxAppOpenAd = this.h;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        com.applovin.mediation.ads.MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.i;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        com.applovin.mediation.ads.MaxRewardedAd maxRewardedAd = this.j;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        com.applovin.mediation.nativeAds.MaxNativeAdLoader maxNativeAdLoader = this.l;
        if (maxNativeAdLoader != null) {
            com.applovin.mediation.MaxAd maxAd = this.m;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.l.destroy();
        }
    }

    class a extends com.applovin.mediation.nativeAds.MaxNativeAdListener {
        a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView, com.applovin.mediation.MaxAd maxAd) {
            if (com.applovin.impl.x.this.m != null) {
                com.applovin.impl.x.this.l.destroy(com.applovin.impl.x.this.m);
            }
            com.applovin.impl.x.this.m = maxAd;
            if (maxNativeAdView != null) {
                com.applovin.impl.x.this.k = maxNativeAdView;
            } else {
                com.applovin.impl.x xVar = com.applovin.impl.x.this;
                com.applovin.impl.sdk.j unused = com.applovin.impl.x.this.f1480a;
                xVar.k = new com.applovin.mediation.nativeAds.MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAdView.MEDIUM_TEMPLATE_1, com.applovin.impl.sdk.j.m());
                com.applovin.impl.x.this.l.render(com.applovin.impl.x.this.k, maxAd);
            }
            com.applovin.impl.x.this.onAdLoaded(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
            com.applovin.impl.x.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.x.this.onAdClicked(maxAd);
        }
    }

    private void b() {
        java.lang.String strC = this.b.c();
        if (this.b.a().isAdViewAd()) {
            com.applovin.mediation.ads.MaxAdView maxAdView = new com.applovin.mediation.ads.MaxAdView(strC, this.b.a(), this.f1480a.q0(), this);
            this.f = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.f.setExtraParameter("disable_precache", com.json.mediationsdk.metadata.a.g);
            this.f.setExtraParameter("allow_pause_auto_refresh_immediately", com.json.mediationsdk.metadata.a.g);
            this.f.stopAutoRefresh();
            this.f.setListener(this);
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == this.b.a()) {
            com.applovin.mediation.ads.MaxInterstitialAd maxInterstitialAd = new com.applovin.mediation.ads.MaxInterstitialAd(strC, this.f1480a.q0(), this);
            this.g = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.g.setListener(this);
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.APP_OPEN == this.b.a()) {
            com.applovin.mediation.ads.MaxAppOpenAd maxAppOpenAd = new com.applovin.mediation.ads.MaxAppOpenAd(strC, this.f1480a.q0());
            this.h = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.h.setListener(this);
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL == this.b.a()) {
            com.applovin.mediation.ads.MaxRewardedInterstitialAd maxRewardedInterstitialAd = new com.applovin.mediation.ads.MaxRewardedInterstitialAd(strC, this.f1480a.q0(), this);
            this.i = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.i.setListener(this);
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.REWARDED == this.b.a()) {
            com.applovin.mediation.ads.MaxRewardedAd maxRewardedAd = com.applovin.mediation.ads.MaxRewardedAd.getInstance(strC, this.f1480a.q0(), this);
            this.j = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.j.setListener(this);
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.NATIVE == this.b.a()) {
            com.applovin.mediation.nativeAds.MaxNativeAdLoader maxNativeAdLoader = new com.applovin.mediation.nativeAds.MaxNativeAdLoader(strC, this.f1480a.q0(), this);
            this.l = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.l.setNativeAdListener(new com.applovin.impl.x.a());
            this.l.setRevenueListener(this);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton adControlButton) {
        if (this.f1480a.k0().c()) {
            com.applovin.impl.yp.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.d.j() != this.b.f()) {
            com.applovin.impl.yp.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        com.applovin.mediation.MaxAdFormat maxAdFormatA = this.b.a();
        com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b bVar = com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOADING);
            com.applovin.impl.o0 o0Var = this.t;
            if (o0Var != null) {
                o0Var.a();
                return;
            } else {
                a(maxAdFormatA);
                return;
            }
        }
        if (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatA.isAdViewAd() && maxAdFormatA != com.applovin.mediation.MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(maxAdFormatA);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(com.applovin.mediation.MaxAd maxAd) {
        this.s.setText(maxAd.getNetworkName() + " ad loaded");
        this.r.setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f, maxAd.getFormat().getSize());
        } else if (com.applovin.mediation.MaxAdFormat.NATIVE == this.b.a()) {
            a(this.k, com.applovin.mediation.MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError) {
        this.r.setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD);
        this.s.setText("");
        com.applovin.impl.yp.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.impl.o0.a
    public void onAdResponseLoaded(com.amazon.device.ads.DTBAdResponse dTBAdResponse, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.NATIVE == maxAdFormat) {
            this.l.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.impl.o0.a
    public void onAdLoadFailed(com.amazon.device.ads.AdError adError, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (com.applovin.mediation.MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED == maxAdFormat) {
            this.j.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (com.applovin.mediation.MaxAdFormat.NATIVE == maxAdFormat) {
            this.l.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void b(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.f, maxAdFormat.getSize());
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == this.b.a()) {
            this.g.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.APP_OPEN == this.b.a()) {
            this.h.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL == this.b.a()) {
            this.i.showAd("[Mediation Debugger Live Ad]");
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED == this.b.a()) {
            this.j.showAd("[Mediation Debugger Live Ad]");
        } else if (com.applovin.mediation.MaxAdFormat.NATIVE == this.b.a()) {
            a(this.k, com.applovin.mediation.MaxAdFormat.MREC.getSize());
        }
    }

    private java.lang.String a() {
        if (this.f1480a.k0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        return this.d.j() != this.b.f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.cc ccVar, com.applovin.impl.z zVar, com.applovin.impl.a0 a0Var, com.applovin.impl.sdk.j jVar, com.applovin.mediation.MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(zVar, a0Var, ((com.applovin.impl.y.b) ccVar).v(), jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.j jVar, final com.applovin.impl.z zVar, final com.applovin.impl.a0 a0Var, com.applovin.impl.kb kbVar, final com.applovin.impl.cc ccVar) {
        if (ccVar instanceof com.applovin.impl.y.b) {
            com.applovin.impl.r.a(this, com.applovin.mediation.MaxDebuggerAdUnitDetailActivity.class, jVar.e(), new com.applovin.impl.r.b() { // from class: com.applovin.impl.x$$ExternalSyntheticLambda2
                @Override // com.applovin.impl.r.b
                public final void a(android.app.Activity activity) {
                    com.applovin.impl.x.a(ccVar, zVar, a0Var, jVar, (com.applovin.mediation.MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
        this.r.setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD);
        this.s.setText("");
        if (204 == maxError.getCode()) {
            com.applovin.impl.yp.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
        } else {
            com.applovin.impl.yp.a("", "Failed to load with error code: " + maxError.getCode(), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.content.DialogInterface dialogInterface) {
        this.n = null;
    }

    private void a(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        if (this.c != null) {
            this.f1480a.k0().a(this.c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f.setPlacement("[Mediation Debugger Live Ad]");
            this.f.loadAd();
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == this.b.a()) {
            this.g.loadAd();
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.APP_OPEN == this.b.a()) {
            this.h.loadAd();
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL == this.b.a()) {
            this.i.loadAd();
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.REWARDED == this.b.a()) {
            this.j.loadAd();
        } else if (com.applovin.mediation.MaxAdFormat.NATIVE == this.b.a()) {
            this.l.setPlacement("[Mediation Debugger Live Ad]");
            this.l.loadAd();
        } else {
            com.applovin.impl.yp.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(android.view.ViewGroup viewGroup, com.applovin.sdk.AppLovinSdkUtils.Size size) {
        if (this.n != null) {
            return;
        }
        com.applovin.impl.d0 d0Var = new com.applovin.impl.d0(viewGroup, size, this);
        this.n = d0Var;
        d0Var.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.applovin.impl.x$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                this.f$0.a(dialogInterface);
            }
        });
        this.n.show();
    }
}
