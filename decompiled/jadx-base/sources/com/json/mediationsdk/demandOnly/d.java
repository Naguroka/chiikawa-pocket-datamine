package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
public class d extends com.json.mediationsdk.demandOnly.m implements com.json.mediationsdk.sdk.BannerSmashListener, com.json.x4 {
    private com.json.fb n;
    private com.json.fb o;
    private java.lang.String p;
    private java.lang.String q;
    private com.json.z4 r;
    private com.json.mediationsdk.e s;
    private com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout t;
    private final com.json.vh u;
    private final com.ironsource.vh.a v;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.i f2952a;

        a(com.json.mediationsdk.i iVar) {
            this.f2952a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.demandOnly.d.this.a(83500, (java.lang.Object[][]) null);
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("auction waterfallString = " + this.f2952a.getWaterfallString());
            com.json.mediationsdk.demandOnly.d.this.a(83510, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, this.f2952a.getWaterfallString()}});
            com.json.mediationsdk.demandOnly.d.this.s.a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), this.f2952a, com.json.mediationsdk.demandOnly.d.this);
        }
    }

    class b extends java.util.TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("load timed out state=" + com.json.mediationsdk.demandOnly.d.this.k());
            com.json.mediationsdk.demandOnly.d.this.a(new com.json.mediationsdk.logger.IronSourceError(608, "load timed out"));
        }
    }

    public d(java.lang.String str, java.lang.String str2, com.json.mediationsdk.model.NetworkSettings networkSettings, long j, com.json.mediationsdk.AbstractAdapter abstractAdapter, com.json.mediationsdk.e eVar) {
        super(new com.json.z2(networkSettings, networkSettings.getBannerSettings(), com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.u = com.json.im.S().k();
        this.v = com.json.im.M().e();
        this.f = j;
        this.p = str;
        this.q = str2;
        this.r = new com.json.z4();
        this.f2967a.initBannerForBidding(str, str2, this.c, this);
        this.s = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, java.lang.Object[][] objArr) {
        java.util.Map<java.lang.String, java.lang.Object> mapJ = j();
        if (objArr != null) {
            try {
                for (java.lang.Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        mapJ.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
        com.json.jj.i().a(new com.json.wb(i, new org.json.JSONObject(mapJ)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, com.json.fb.a(this.n));
            a(this.r.b(), com.json.mediationsdk.utils.IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 606) {
            a(3306, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}});
        } else {
            a(3300, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}});
        }
    }

    private void a(java.util.List<java.lang.String> list, java.lang.String str) {
        a(list, h(), i(), this.j, str);
    }

    private void c(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new com.json.mediationsdk.logger.IronSourceError(618, "No available ad to load"));
            } else {
                a(83302, (java.lang.Object[][]) null);
                this.o = new com.json.fb();
                this.f2967a.initBannerForBidding(this.p, this.q, this.c, this);
                this.f2967a.loadBannerForDemandOnlyForBidding(this.c, str, this.t, this);
            }
        }
    }

    private boolean t() {
        com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.mediationsdk.demandOnly.d.a(q()));
    }

    private void v() {
        this.g = null;
        this.h = null;
        this.r = new com.json.z4();
    }

    private void w() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        a(new com.ironsource.mediationsdk.demandOnly.d.b());
    }

    @Override // com.json.p4
    public void a(int i, java.lang.String str, int i2, java.lang.String str2, long j) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_AUCTION_FAILED, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i)}, new java.lang.Object[]{"reason", str}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            a(new com.json.mediationsdk.logger.IronSourceError(621, "No available ad to load"));
        }
    }

    @Override // com.json.x4
    public void a(com.ironsource.mediationsdk.d.a aVar, int i, long j, int i2, java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.h = aVar.f();
        com.json.mediationsdk.demandOnly.a.C0238a c0238a = new com.json.mediationsdk.demandOnly.a.C0238a(aVar.h());
        if (!android.text.TextUtils.isEmpty(str)) {
            a(88002, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i2)}, new java.lang.Object[]{"reason", str}});
        }
        a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}});
        a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, c0238a.b()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (c0238a.isEmpty()) {
                com.json.mediationsdk.logger.IronSourceError ironSourceError = new com.json.mediationsdk.logger.IronSourceError(3306, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            com.json.j5 j5Var = c0238a.get(0);
            this.r.a(j5Var.b());
            this.r.c(j5Var.h());
            this.r.b(j5Var.g());
            java.lang.String strK = j5Var.k();
            b(strK);
            c(strK);
        }
    }

    public void a(com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new java.lang.Object[][]{new java.lang.Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        com.ironsource.mediationsdk.demandOnly.m.a[] aVarArr = {com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED, com.ironsource.mediationsdk.demandOnly.m.a.LOADED};
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a aVarA = a(aVarArr, aVar);
        if (aVarA == aVar || aVarA == com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new java.lang.Object[][]{new java.lang.Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            java.lang.String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new com.json.mediationsdk.logger.IronSourceError(619, str));
            a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new java.lang.Object[][]{new java.lang.Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (java.lang.Object[][]) null);
        if (!o()) {
            ironLog.verbose("can't load banner when isOneFlow = false");
            a(new com.json.mediationsdk.logger.IronSourceError(1063, "Missing configuration settings"));
            return;
        }
        this.t = iSDemandOnlyBannerLayout;
        this.n = new com.json.fb();
        w();
        if (this.s.a()) {
            u();
        } else {
            ironLog.verbose("can't load the banner the auction isn't enabled");
            a(new com.json.mediationsdk.logger.IronSourceError(1063, "Missing server configuration"));
        }
    }

    public void a(com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, com.json.mediationsdk.demandOnly.o oVar) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new java.lang.Object[][]{new java.lang.Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        com.ironsource.mediationsdk.demandOnly.m.a[] aVarArr = {com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED, com.ironsource.mediationsdk.demandOnly.m.a.LOADED};
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a aVarA = a(aVarArr, aVar);
        if (aVarA == aVar || aVarA == com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new java.lang.Object[][]{new java.lang.Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            java.lang.String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new com.json.mediationsdk.logger.IronSourceError(619, str));
            a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING, new java.lang.Object[][]{new java.lang.Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (java.lang.Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new com.json.mediationsdk.logger.IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.t = iSDemandOnlyBannerLayout;
        if (!n()) {
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildLoadFailedError = com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (java.lang.Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar2 = (com.ironsource.mediationsdk.d.a) oVar.a(new com.json.kb());
            com.json.j5 j5VarA = new com.json.mediationsdk.demandOnly.a.C0238a(aVar2.h()).a(h());
            if (j5VarA == null) {
                com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildLoadFailedError2 = com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (java.lang.Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError2);
                return;
            }
            java.lang.String strK = j5VarA.k();
            if (strK == null) {
                ironLog.error("serverData is null");
                a(new com.json.mediationsdk.logger.IronSourceError(618, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar2.a());
            a(aVar2.f());
            a(83302, (java.lang.Object[][]) null);
            this.r.a(j5VarA.b());
            this.n = new com.json.fb();
            w();
            this.f2967a.initBannerForBidding(this.p, this.q, this.c, this);
            this.f2967a.loadBannerForDemandOnlyForBidding(this.c, strK, iSDemandOnlyBannerLayout, this);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            a(com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e.getMessage()));
        }
    }

    @Override // com.json.p4
    public void a(java.util.List<com.json.j5> list, java.lang.String str, com.json.j5 j5Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.json.mediationsdk.demandOnly.m
    public java.util.Map<java.lang.String, java.lang.Object> j() {
        java.util.HashMap map = new java.util.HashMap();
        try {
            if (t()) {
                map.put("reason", "banner is destroyed");
            } else {
                com.json.mediationsdk.l.a(map, this.t.getSize());
            }
            com.json.mediationsdk.AbstractAdapter abstractAdapter = this.f2967a;
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            com.json.mediationsdk.AbstractAdapter abstractAdapter2 = this.f2967a;
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.b.i());
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (o()) {
                map.put("isOneFlow", 1);
            }
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            map.put("instanceType", java.lang.Integer.valueOf(this.b.d()));
            if (!android.text.TextUtils.isEmpty(this.g)) {
                map.put("auctionId", this.g);
            }
            org.json.JSONObject jSONObject = this.h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.h);
            }
            if (!android.text.TextUtils.isEmpty(this.j)) {
                map.put("dynamicDemandSource", this.j);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Instance: " + h() + " " + e.getMessage());
        }
        return map;
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s());
        a(3008, (java.lang.Object[][]) null);
        if (t()) {
            return;
        }
        this.t.getListener().a(l());
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s());
        a(3304, (java.lang.Object[][]) null);
        if (t()) {
            return;
        }
        this.t.getListener().b(l());
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s());
        a(83300, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("smash = " + s());
        com.json.vh vhVar = this.u;
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        int iA = vhVar.a(ad_unit);
        a(com.ironsource.mediationsdk.demandOnly.b.c.TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{"sessionDepth", java.lang.Integer.valueOf(iA)}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.o))}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.LOADED)) {
            p();
            if (!t()) {
                this.t.a(view, layoutParams);
            }
            a(3005, new java.lang.Object[][]{new java.lang.Object[]{"sessionDepth", java.lang.Integer.valueOf(iA)}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.n))}});
            this.v.b(ad_unit);
            a(this.r.c(), com.json.mediationsdk.utils.IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.t.getListener().c(l());
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOADED, com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS)) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s());
            a(3009, (java.lang.Object[][]) null);
            a(this.r.a(), com.json.mediationsdk.utils.IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.t.getListener().d(l());
        }
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s() + " " + ironSourceError.toString());
    }

    @Override // com.json.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("smash - " + s());
    }

    com.json.mediationsdk.i q() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(h());
        java.lang.String str = "" + i() + h();
        com.json.mediationsdk.i iVar = new com.json.mediationsdk.i(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER);
        iVar.a(arrayList);
        iVar.d(str);
        iVar.c(l());
        iVar.b(com.json.mediationsdk.utils.IronSourceUtils.isEncryptedResponse());
        iVar.a(true);
        iVar.c(true);
        iVar.a(this.t.getSize());
        return iVar;
    }

    public void r() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        a(new com.ironsource.mediationsdk.demandOnly.m.a[]{com.ironsource.mediationsdk.demandOnly.m.a.LOADED, com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS}, com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED);
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        p();
        com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.t = null;
        com.json.mediationsdk.AbstractAdapter abstractAdapter = this.f2967a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.c);
        }
        a(3305, (java.lang.Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public java.lang.String s() {
        return this.b.h().isMultipleInstances() ? this.b.h().getProviderTypeForReflection() : this.b.h().getProviderName();
    }
}
