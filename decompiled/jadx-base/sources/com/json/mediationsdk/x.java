package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class x extends com.json.mediationsdk.y implements com.json.mediationsdk.sdk.BannerSmashListener, com.ironsource.mt.a, com.json.v7 {
    private com.json.mediationsdk.k h;
    private com.json.mt i;
    private com.ironsource.mediationsdk.x.a j;
    private com.json.rp k;
    private com.json.mediationsdk.IronSourceBannerLayout l;
    private java.lang.String m;
    private org.json.JSONObject n;
    private int o;
    private java.lang.String p;
    private com.json.e7 q;
    private final java.lang.Object r;
    private com.json.fb s;
    private boolean t;
    private boolean u;
    private org.json.JSONObject v;

    protected enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    x(com.json.mediationsdk.k kVar, com.json.rp rpVar, com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.AbstractAdapter abstractAdapter, int i, java.lang.String str, org.json.JSONObject jSONObject, int i2, java.lang.String str2, boolean z) {
        super(new com.json.z2(networkSettings, networkSettings.getBannerSettings(), com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.r = new java.lang.Object();
        this.j = com.ironsource.mediationsdk.x.a.NONE;
        this.h = kVar;
        this.i = new com.json.mt(kVar.e());
        this.k = rpVar;
        this.f = i;
        this.m = str;
        this.o = i2;
        this.p = str2;
        this.n = jSONObject;
        this.t = z;
        this.v = null;
        if (r()) {
            u();
        }
    }

    x(com.json.mediationsdk.k kVar, com.json.rp rpVar, com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.AbstractAdapter abstractAdapter, int i, boolean z) {
        this(kVar, rpVar, networkSettings, abstractAdapter, i, "", null, 0, "", z);
    }

    private void A() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        a(com.ironsource.mediationsdk.x.a.INIT_IN_PROGRESS);
        F();
        try {
            if (this.f3034a != null) {
                if (p()) {
                    this.f3034a.initBannerForBidding(this.h.a(), this.h.i(), this.d, this);
                } else {
                    this.f3034a.initBanners(this.h.a(), this.h.i(), this.d, this);
                }
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Exception while trying to init banner from " + this.f3034a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            onBannerInitFailed(new com.json.mediationsdk.logger.IronSourceError(612, th.getLocalizedMessage()));
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.errorCode_initFailed)}, new java.lang.Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z;
        synchronized (this.r) {
            z = this.j == com.ironsource.mediationsdk.x.a.DESTROYED;
        }
        return z;
    }

    private boolean C() {
        boolean z;
        synchronized (this.r) {
            z = this.j == com.ironsource.mediationsdk.x.a.LOADED;
        }
        return z;
    }

    private void F() {
        if (this.f3034a == null) {
            return;
        }
        try {
            java.lang.String pluginType = com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginType();
            if (android.text.TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f3034a.setPluginData(pluginType);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.f3034a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.errorCode_internal)}, new java.lang.Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private void a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        boolean z = ironSourceError.getErrorCode() == 606;
        boolean z2 = this.t;
        if (z) {
            a(z2 ? com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : 3306, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.s))}});
        } else {
            a(z2 ? com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : 3300, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.s))}});
        }
        com.json.rp rpVar = this.k;
        if (rpVar != null) {
            rpVar.a(ironSourceError, this, z);
        }
    }

    private void a(com.ironsource.mediationsdk.x.a aVar) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(y() + "state = " + aVar.name());
        synchronized (this.r) {
            this.j = aVar;
        }
    }

    private void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(f());
        if (!a(com.ironsource.mediationsdk.x.a.READY_TO_LOAD, com.ironsource.mediationsdk.x.a.LOADING)) {
            ironLog.error("wrong state - state = " + this.j);
            return;
        }
        this.s = new com.json.fb();
        a(this.t ? com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD : 3002);
        if (this.f3034a != null) {
            try {
                if (p()) {
                    this.f3034a.loadBannerForBidding(this.d, this.v, str, this.l, this);
                } else {
                    this.f3034a.loadBanner(this.d, this.v, this.l, this);
                }
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("Exception while trying to load banner from " + this.f3034a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
                onBannerAdLoadFailed(new com.json.mediationsdk.logger.IronSourceError(605, th.getLocalizedMessage()));
                a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.errorCode_loadException)}, new java.lang.Object[]{"reason", th.getLocalizedMessage()}});
            }
        }
    }

    private boolean a(com.ironsource.mediationsdk.x.a aVar, com.ironsource.mediationsdk.x.a aVar2) {
        boolean z;
        synchronized (this.r) {
            if (this.j == aVar) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(y() + "set state from '" + this.j + "' to '" + aVar2 + "'");
                this.j = aVar2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private boolean b(int i) {
        return i == 3005 || i == 3002 || i == 3012 || i == 3015 || i == 3008 || i == 3305 || i == 3300 || i == 3306 || i == 3307 || i == 3302 || i == 3303 || i == 3304 || i == 3009;
    }

    private void u() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.u = true;
        A();
    }

    public void D() {
        this.f3034a.onBannerViewBound(this.b.h().getBannerSettings());
    }

    public void E() {
        this.f3034a.onBannerViewWillBind(this.b.h().getBannerSettings());
    }

    @Override // com.json.v7
    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        com.json.mediationsdk.AbstractAdapter abstractAdapter;
        org.json.JSONObject jSONObjectA = adData != null ? com.json.hk.a(adData.getAdUnitData()) : null;
        if (!p() || (abstractAdapter = this.f3034a) == null) {
            return null;
        }
        return abstractAdapter.getBannerBiddingData(this.d, jSONObjectA);
    }

    @Override // com.ironsource.mt.a
    public void a() {
        com.json.mediationsdk.logger.IronSourceError ironSourceError;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(f());
        com.ironsource.mediationsdk.x.a aVar = com.ironsource.mediationsdk.x.a.INIT_IN_PROGRESS;
        com.ironsource.mediationsdk.x.a aVar2 = com.ironsource.mediationsdk.x.a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new com.json.mediationsdk.logger.IronSourceError(607, "Timed out");
        } else if (!a(com.ironsource.mediationsdk.x.a.LOADING, aVar2)) {
            ironLog.error("unexpected state - " + this.j);
            return;
        } else {
            ironLog.verbose("load timed out");
            ironSourceError = new com.json.mediationsdk.logger.IronSourceError(608, "Timed out");
        }
        a(ironSourceError);
    }

    public void a(int i) {
        a(i, (java.lang.Object[][]) null);
    }

    public void a(int i, java.lang.Object[][] objArr) {
        java.util.Map<java.lang.String, java.lang.Object> mapM = m();
        if (B()) {
            mapM.put("reason", "banner is destroyed");
        } else {
            com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = this.l;
            if (ironSourceBannerLayout != null) {
                com.json.mediationsdk.l.a(mapM, ironSourceBannerLayout.getSize());
            }
        }
        if (!android.text.TextUtils.isEmpty(this.m)) {
            mapM.put("auctionId", this.m);
        }
        org.json.JSONObject jSONObject = this.n;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.n);
        }
        com.json.e7 e7Var = this.q;
        if (e7Var != null) {
            mapM.put("placement", e7Var.getCom.ironsource.op.d java.lang.String());
        }
        if (b(i)) {
            com.json.jj.i().a(mapM, this.o, this.p);
        }
        mapM.put("sessionDepth", java.lang.Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (java.lang.Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + android.util.Log.getStackTraceString(e));
            }
        }
        com.json.jj.i().a(new com.json.wb(i, new org.json.JSONObject(mapM)));
    }

    public void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, com.json.e7 e7Var, java.lang.String str, org.json.JSONObject jSONObject) {
        com.json.rp rpVar;
        com.json.mediationsdk.logger.IronSourceError ironSourceError;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(f());
        this.q = e7Var;
        this.v = jSONObject;
        if (!com.json.mediationsdk.l.c(ironSourceBannerLayout)) {
            java.lang.String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            rpVar = this.k;
            ironSourceError = new com.json.mediationsdk.logger.IronSourceError(610, str2);
        } else {
            if (this.f3034a != null) {
                this.l = ironSourceBannerLayout;
                this.i.a((com.ironsource.mt.a) this);
                try {
                    if (p()) {
                        a(str, this.v);
                    } else {
                        A();
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    com.json.l9.d().a(th);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception = " + th.getLocalizedMessage());
                    onBannerAdLoadFailed(new com.json.mediationsdk.logger.IronSourceError(605, th.getLocalizedMessage()));
                    return;
                }
            }
            ironLog.verbose("mAdapter is null");
            rpVar = this.k;
            ironSourceError = new com.json.mediationsdk.logger.IronSourceError(611, "mAdapter is null");
        }
        rpVar.a(ironSourceError, this, false);
    }

    @Override // com.json.v7
    public void a(com.json.mediationsdk.adunit.adapter.utility.AdData adData, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f3034a.collectBannerBiddingData(this.d, adData != null ? com.json.hk.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.f3034a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
        }
    }

    @Override // com.json.mediationsdk.y
    public com.ironsource.mediationsdk.IronSource.AD_UNIT d() {
        return com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
    }

    @Override // com.json.mediationsdk.y
    public java.lang.String k() {
        return "ProgBannerSmash";
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        a(3008);
        com.json.rp rpVar = this.k;
        if (rpVar != null) {
            rpVar.b(this);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        a(3304);
        com.json.rp rpVar = this.k;
        if (rpVar != null) {
            rpVar.c(this);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(y() + "error = " + ironSourceError);
        this.i.e();
        if (a(com.ironsource.mediationsdk.x.a.LOADING, com.ironsource.mediationsdk.x.a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        this.i.e();
        if (!a(com.ironsource.mediationsdk.x.a.LOADING, com.ironsource.mediationsdk.x.a.LOADED)) {
            a(this.t ? com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        a(this.t ? com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : 3005, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.s))}});
        com.json.rp rpVar = this.k;
        if (rpVar != null) {
            rpVar.a(this, view, layoutParams);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN);
        com.json.rp rpVar = this.k;
        if (rpVar != null) {
            rpVar.e(this);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN);
        com.json.rp rpVar = this.k;
        if (rpVar != null) {
            rpVar.d(this);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(f());
        if (!C()) {
            ironLog.warning("wrong state - mState = " + this.j);
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1}, new java.lang.Object[]{"reason", "Wrong State - " + this.j}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, c()}});
            return;
        }
        a(3009);
        com.json.rp rpVar = this.k;
        if (rpVar != null) {
            rpVar.a(this);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.i.e();
        if (!a(com.ironsource.mediationsdk.x.a.INIT_IN_PROGRESS, com.ironsource.mediationsdk.x.a.NONE)) {
            ironLog.warning("wrong state - mState = " + this.j);
            return;
        }
        com.json.rp rpVar = this.k;
        if (rpVar != null) {
            rpVar.a(ironSourceError, this, false);
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(f());
        if (a(com.ironsource.mediationsdk.x.a.INIT_IN_PROGRESS, com.ironsource.mediationsdk.x.a.READY_TO_LOAD)) {
            if (this.u) {
                this.u = false;
            } else {
                if (p()) {
                    return;
                }
                if (com.json.mediationsdk.l.c(this.l)) {
                    a((java.lang.String) null, this.v);
                } else {
                    this.k.a(new com.json.mediationsdk.logger.IronSourceError(605, this.l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    @Override // com.json.mediationsdk.y
    public void q() {
        this.i.d();
        super.q();
    }

    public void t() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(f());
        a(3305);
        a(com.ironsource.mediationsdk.x.a.DESTROYED);
        com.json.mediationsdk.AbstractAdapter abstractAdapter = this.f3034a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.b.h().getBannerSettings());
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.f3034a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.errorCode_destroy)}, new java.lang.Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    public java.lang.String v() {
        return !android.text.TextUtils.isEmpty(this.b.h().getAdSourceNameForEvents()) ? this.b.h().getAdSourceNameForEvents() : i();
    }

    public com.json.mediationsdk.AbstractAdapter w() {
        return this.f3034a;
    }

    public java.lang.String x() {
        return this.m;
    }

    public java.lang.String y() {
        return java.lang.String.format("%s - ", f());
    }

    public java.lang.String z() {
        return this.b.i();
    }
}
