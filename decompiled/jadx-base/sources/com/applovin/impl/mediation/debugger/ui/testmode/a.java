package com.applovin.impl.mediation.debugger.ui.testmode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends com.applovin.impl.re implements com.applovin.mediation.MaxRewardedAdListener, com.applovin.mediation.MaxAdViewAdListener, com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a, com.applovin.mediation.MaxAdRevenueListener, com.applovin.impl.o0.a {
    private java.util.Map A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.je f1058a;
    private com.applovin.impl.sdk.j b;
    private com.applovin.mediation.ads.MaxAdView c;
    private com.applovin.mediation.ads.MaxAdView d;
    private com.applovin.mediation.ads.MaxInterstitialAd f;
    private com.applovin.mediation.ads.MaxAppOpenAd g;
    private com.applovin.mediation.ads.MaxRewardedInterstitialAd h;
    private com.applovin.mediation.ads.MaxRewardedAd i;
    private com.applovin.mediation.MaxAd j;
    private com.applovin.mediation.nativeAds.MaxNativeAdLoader k;
    private java.util.List l;
    private java.lang.String m;
    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton n;
    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton o;
    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton p;
    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton q;
    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton r;
    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton s;
    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton t;
    private android.widget.Button u;
    private android.widget.Button v;
    private android.widget.FrameLayout w;
    private android.widget.FrameLayout x;
    private android.widget.Switch y;
    private android.widget.Switch z;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    class C0042a extends com.applovin.mediation.nativeAds.MaxNativeAdListener {
        C0042a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(com.applovin.mediation.MaxAd maxAd) {
            com.applovin.impl.mediation.debugger.ui.testmode.a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
            com.applovin.impl.mediation.debugger.ui.testmode.a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView, com.applovin.mediation.MaxAd maxAd) {
            if (com.applovin.impl.mediation.debugger.ui.testmode.a.this.j != null) {
                com.applovin.impl.mediation.debugger.ui.testmode.a.this.k.destroy(com.applovin.impl.mediation.debugger.ui.testmode.a.this.j);
            }
            com.applovin.impl.mediation.debugger.ui.testmode.a.this.j = maxAd;
            com.applovin.impl.mediation.debugger.ui.testmode.a.this.x.removeAllViews();
            com.applovin.impl.mediation.debugger.ui.testmode.a.this.x.addView(maxNativeAdView);
            com.applovin.impl.mediation.debugger.ui.testmode.a.this.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(android.view.View view) {
        this.d.removeAllViews();
        this.o.setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD);
    }

    private void e() {
        java.util.List listR = this.f1058a.r();
        com.applovin.mediation.MaxAdFormat maxAdFormat = com.applovin.mediation.MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(com.applovin.sdk.R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        java.lang.String str = "test_mode_rewarded_" + this.f1058a.m();
        this.m = str;
        com.applovin.mediation.ads.MaxRewardedAd maxRewardedAd = com.applovin.mediation.ads.MaxRewardedAd.getInstance(str, this.b.q0(), this);
        this.i = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
        this.i.setListener(this);
        com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton adControlButton = (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton) findViewById(com.applovin.sdk.R.id.rewarded_control_button);
        this.s = adControlButton;
        adControlButton.setOnClickListener(this);
        this.s.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.re
    protected com.applovin.impl.sdk.j getSdk() {
        return this.b;
    }

    public java.lang.String getTestModeNetwork(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        return (this.f1058a.x() == null || !this.f1058a.x().containsKey(maxAdFormat)) ? this.f1058a.m() : (java.lang.String) this.f1058a.x().get(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.yp.a(com.json.ju.f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.yp.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD);
        com.applovin.impl.yp.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
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

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
        com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD);
        com.applovin.impl.yp.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(com.applovin.mediation.MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.o0.a
    public void onAdResponseLoaded(com.amazon.device.ads.DTBAdResponse dTBAdResponse, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        if (com.applovin.mediation.MaxAdFormat.BANNER == maxAdFormat || com.applovin.mediation.MaxAdFormat.LEADER == maxAdFormat) {
            this.c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.MREC == maxAdFormat) {
            this.d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (com.applovin.mediation.MaxAdFormat.NATIVE == maxAdFormat) {
            this.k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.impl.yp.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton adControlButton) {
        com.applovin.mediation.MaxAdFormat format = adControlButton.getFormat();
        com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b bVar = com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOADING);
        java.util.Map map = this.A;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((com.applovin.impl.o0) this.A.get(format)).a();
        }
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.f1058a == null) {
            com.applovin.impl.sdk.n.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f1058a.g() + " Test Ads");
        this.l = this.b.k0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(com.applovin.sdk.R.id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(com.applovin.sdk.R.id.app_open_ad_control_view).setVisibility(8);
        this.u = (android.widget.Button) findViewById(com.applovin.sdk.R.id.show_mrec_button);
        this.v = (android.widget.Button) findViewById(com.applovin.sdk.R.id.show_native_button);
        if (this.f1058a.H() && this.f1058a.r().contains(com.applovin.mediation.MaxAdFormat.MREC)) {
            this.x.setVisibility(8);
            this.u.setBackgroundColor(-1);
            this.v.setBackgroundColor(-3355444);
            this.u.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.a(view);
                }
            });
            this.v.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.b(view);
                }
            });
        } else {
            this.u.setVisibility(8);
            this.v.setVisibility(8);
        }
        this.y = (android.widget.Switch) findViewById(com.applovin.sdk.R.id.native_banner_switch);
        this.z = (android.widget.Switch) findViewById(com.applovin.sdk.R.id.native_mrec_switch);
        if (this.f1058a.I()) {
            this.y.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.c(view);
                }
            });
            this.z.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.d(view);
                }
            });
        } else {
            this.y.setVisibility(8);
            this.z.setVisibility(8);
        }
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.f1058a.e()) && this.f1058a.d() != null && this.f1058a.d().size() > 0) {
            com.amazon.device.ads.AdRegistration.getInstance(this.f1058a.e(), this);
            com.amazon.device.ads.AdRegistration.enableTesting(true);
            com.amazon.device.ads.AdRegistration.enableLogging(true);
            java.util.HashMap map = new java.util.HashMap(this.f1058a.d().size());
            for (com.applovin.mediation.MaxAdFormat maxAdFormat : this.f1058a.d().keySet()) {
                map.put(maxAdFormat, new com.applovin.impl.o0((com.applovin.impl.p0) this.f1058a.d().get(maxAdFormat), maxAdFormat, this));
            }
            this.A = map;
        }
        try {
            setRequestedOrientation(7);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.re, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.b.k0().a(this.l);
        com.applovin.mediation.ads.MaxAdView maxAdView = this.c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        com.applovin.mediation.ads.MaxAdView maxAdView2 = this.d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        com.applovin.mediation.ads.MaxInterstitialAd maxInterstitialAd = this.f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        com.applovin.mediation.ads.MaxRewardedAd maxRewardedAd = this.i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        com.applovin.mediation.nativeAds.MaxNativeAdLoader maxNativeAdLoader = this.k;
        if (maxNativeAdLoader != null) {
            com.applovin.mediation.MaxAd maxAd = this.j;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.k.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxReward maxReward) {
        com.applovin.impl.yp.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.view.View view) {
        this.x.setVisibility(0);
        this.w.setVisibility(8);
        this.v.setBackgroundColor(-1);
        this.u.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(android.view.View view) {
        this.c.removeAllViews();
        this.n.setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.View view) {
        this.w.setVisibility(0);
        this.x.setVisibility(8);
        this.u.setBackgroundColor(-1);
        this.v.setBackgroundColor(-3355444);
    }

    private void d() {
        this.x = (android.widget.FrameLayout) findViewById(com.applovin.sdk.R.id.native_ad_view_container);
        if (this.f1058a.H()) {
            com.applovin.mediation.nativeAds.MaxNativeAdLoader maxNativeAdLoader = new com.applovin.mediation.nativeAds.MaxNativeAdLoader("test_mode_native", this.b.q0(), this);
            this.k = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.k.setNativeAdListener(new com.applovin.impl.mediation.debugger.ui.testmode.a.C0042a());
            this.k.setRevenueListener(this);
            com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton adControlButton = (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton) findViewById(com.applovin.sdk.R.id.native_control_button);
            this.t = adControlButton;
            adControlButton.setOnClickListener(this);
            this.t.setFormat(com.applovin.mediation.MaxAdFormat.NATIVE);
            return;
        }
        findViewById(com.applovin.sdk.R.id.native_control_view).setVisibility(8);
        this.x.setVisibility(8);
    }

    private void c() {
        this.w = (android.widget.FrameLayout) findViewById(com.applovin.sdk.R.id.mrec_ad_view_container);
        java.util.List listR = this.f1058a.r();
        com.applovin.mediation.MaxAdFormat maxAdFormat = com.applovin.mediation.MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            com.applovin.mediation.ads.MaxAdView maxAdView = new com.applovin.mediation.ads.MaxAdView("test_mode_mrec", maxAdFormat, this.b.q0(), this);
            this.d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.d.setExtraParameter("disable_precache", com.json.mediationsdk.metadata.a.g);
            this.d.setExtraParameter("allow_pause_auto_refresh_immediately", com.json.mediationsdk.metadata.a.g);
            this.d.stopAutoRefresh();
            this.d.setListener(this);
            this.w.addView(this.d, new android.widget.FrameLayout.LayoutParams(-1, -1));
            com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton adControlButton = (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton) findViewById(com.applovin.sdk.R.id.mrec_control_button);
            this.o = adControlButton;
            adControlButton.setOnClickListener(this);
            this.o.setFormat(maxAdFormat);
            return;
        }
        findViewById(com.applovin.sdk.R.id.mrec_control_view).setVisibility(8);
        this.w.setVisibility(8);
    }

    @Override // com.applovin.impl.o0.a
    public void onAdLoadFailed(com.amazon.device.ads.AdError adError, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        if (com.applovin.mediation.MaxAdFormat.BANNER != maxAdFormat && com.applovin.mediation.MaxAdFormat.LEADER != maxAdFormat) {
            if (com.applovin.mediation.MaxAdFormat.MREC == maxAdFormat) {
                this.d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (com.applovin.mediation.MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.h.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (com.applovin.mediation.MaxAdFormat.REWARDED == maxAdFormat) {
                this.i.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (com.applovin.mediation.MaxAdFormat.NATIVE == maxAdFormat) {
                this.k.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void b() {
        java.util.List listR = this.f1058a.r();
        com.applovin.mediation.MaxAdFormat maxAdFormat = com.applovin.mediation.MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            com.applovin.mediation.ads.MaxInterstitialAd maxInterstitialAd = new com.applovin.mediation.ads.MaxInterstitialAd("test_mode_interstitial", this.b.q0(), this);
            this.f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.f.setListener(this);
            com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton adControlButton = (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton) findViewById(com.applovin.sdk.R.id.interstitial_control_button);
            this.p = adControlButton;
            adControlButton.setOnClickListener(this);
            this.p.setFormat(maxAdFormat);
            return;
        }
        findViewById(com.applovin.sdk.R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        com.applovin.mediation.MaxAdFormat maxAdFormat;
        java.lang.String str;
        boolean zIsTablet = com.applovin.sdk.AppLovinSdkUtils.isTablet(this);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.applovin.sdk.R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = com.applovin.mediation.MaxAdFormat.LEADER;
            ((android.widget.TextView) findViewById(com.applovin.sdk.R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = com.applovin.mediation.MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f1058a.r().contains(maxAdFormat)) {
            com.applovin.mediation.ads.MaxAdView maxAdView = new com.applovin.mediation.ads.MaxAdView(str, maxAdFormat, this.b.q0(), this);
            this.c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.c.setExtraParameter("disable_auto_retries", com.json.mediationsdk.metadata.a.g);
            this.c.setExtraParameter("disable_precache", com.json.mediationsdk.metadata.a.g);
            this.c.setExtraParameter("allow_pause_auto_refresh_immediately", com.json.mediationsdk.metadata.a.g);
            this.c.stopAutoRefresh();
            this.c.setListener(this);
            frameLayout.addView(this.c, new android.widget.FrameLayout.LayoutParams(com.applovin.sdk.AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), com.applovin.sdk.AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton adControlButton = (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton) findViewById(com.applovin.sdk.R.id.banner_control_button);
            this.n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.n.setFormat(maxAdFormat);
            return;
        }
        findViewById(com.applovin.sdk.R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.showAd();
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.showAd();
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.h.showAd();
        } else if (com.applovin.mediation.MaxAdFormat.REWARDED == maxAdFormat) {
            this.i.showAd();
        }
    }

    private void a(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.mediation.MaxAdFormat maxAdFormat2 = com.applovin.mediation.MaxAdFormat.BANNER;
        boolean z = (maxAdFormat2 == maxAdFormat || com.applovin.mediation.MaxAdFormat.LEADER == maxAdFormat) && this.y.isChecked();
        com.applovin.mediation.MaxAdFormat maxAdFormat3 = com.applovin.mediation.MaxAdFormat.MREC;
        boolean z2 = maxAdFormat3 == maxAdFormat && this.z.isChecked();
        if (!z && !z2) {
            this.b.k0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.b.k0().a(this.f1058a.w());
        }
        if (maxAdFormat2 == maxAdFormat || com.applovin.mediation.MaxAdFormat.LEADER == maxAdFormat) {
            this.c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.d.loadAd();
            this.u.callOnClick();
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f.loadAd();
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.g.loadAd();
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.h.loadAd();
            return;
        }
        if (com.applovin.mediation.MaxAdFormat.REWARDED == maxAdFormat) {
            this.i.loadAd();
        } else if (com.applovin.mediation.MaxAdFormat.NATIVE == maxAdFormat) {
            this.k.loadAd();
            this.v.callOnClick();
        }
    }

    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton a(java.lang.String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.o;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.p;
            }
            if (str.equals("test_mode_app_open")) {
                return this.q;
            }
            if (str.equals("test_mode_rewarded_interstitial")) {
                return this.r;
            }
            if (str.equals(this.m)) {
                return this.s;
            }
            if (str.equals("test_mode_native")) {
                return this.t;
            }
            throw new java.lang.IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.n;
    }

    public void initialize(com.applovin.impl.je jeVar) {
        this.f1058a = jeVar;
        this.b = jeVar.o();
    }
}
