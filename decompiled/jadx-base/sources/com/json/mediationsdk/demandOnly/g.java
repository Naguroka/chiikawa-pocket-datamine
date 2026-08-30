package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
public class g extends com.json.mediationsdk.demandOnly.m implements com.ironsource.mediationsdk.demandOnly.n.a, com.json.mediationsdk.sdk.InterstitialSmashListener, com.json.x4 {
    private com.json.fb n;
    private com.json.fb o;
    private com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener p;
    private com.json.z4 q;
    private com.json.mediationsdk.e r;
    private com.json.mediationsdk.demandOnly.p s;
    private final com.json.vh t;
    private final com.ironsource.vh.a u;

    class a extends java.util.TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("load timed out state=" + com.json.mediationsdk.demandOnly.g.this.k());
            com.json.mediationsdk.demandOnly.g.this.a(new com.json.mediationsdk.logger.IronSourceError(1052, "load timed out"));
        }
    }

    class b extends java.util.TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("load timed out state=" + com.json.mediationsdk.demandOnly.g.this.k());
            com.json.mediationsdk.demandOnly.g.this.a(new com.json.mediationsdk.logger.IronSourceError(1052, "load timed out"));
        }
    }

    public g(java.lang.String str, java.lang.String str2, com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j, com.json.mediationsdk.AbstractAdapter abstractAdapter, com.json.mediationsdk.e eVar) {
        super(new com.json.z2(networkSettings, networkSettings.getInterstitialSettings(), com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.s = new com.ironsource.mediationsdk.demandOnly.p.b();
        this.t = com.json.im.S().k();
        this.u = com.json.im.M().e();
        this.p = iSDemandOnlyInterstitialListener;
        this.f = j;
        this.r = eVar;
        this.f2967a.initInterstitial(str, str2, this.c, this);
    }

    private void a(int i, java.lang.Object[][] objArr) {
        java.util.Map<java.lang.String, java.lang.Object> mapJ = j();
        if (objArr != null) {
            try {
                for (java.lang.Object[] objArr2 : objArr) {
                    mapJ.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("Exception: " + android.util.Log.getStackTraceString(e));
            }
        }
        com.json.jj.i().a(new com.json.wb(i, new org.json.JSONObject(mapJ)));
    }

    private void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1158) {
            a(2213, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(2200, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(java.util.List<java.lang.String> list, java.lang.String str) {
        a(list, h(), i(), this.j, str);
    }

    private void c(com.json.mediationsdk.demandOnly.o oVar) {
        this.n = new com.json.fb();
        a(new com.ironsource.mediationsdk.demandOnly.g.a());
        if (!n()) {
            a(new com.json.mediationsdk.logger.IronSourceError(2303, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar = (com.ironsource.mediationsdk.d.a) oVar.a(new com.json.kb());
            com.json.j5 j5VarA = new com.json.mediationsdk.demandOnly.a.C0238a(aVar.h()).a(h());
            if (j5VarA == null) {
                com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildLoadFailedError = com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(2303, (java.lang.Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            java.lang.String strK = j5VarA.k();
            if (strK == null) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("serverData is null");
                a(new com.json.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.e.a.ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar.a());
            a(aVar.f());
            a(82002, (java.lang.Object[][]) null);
            this.q.a(j5VarA.b());
            this.o = new com.json.fb();
            this.f2967a.loadInterstitialForBidding(this.c, null, strK, this);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            a(com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e.getMessage()));
        }
    }

    private void c(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new com.json.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.e.a.ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA, "No available ad to load"));
            } else {
                a(82002, (java.lang.Object[][]) null);
                this.f2967a.loadInterstitialForBidding(this.c, null, str, this);
            }
        }
    }

    private com.json.mediationsdk.i q() {
        java.lang.String str = i() + h();
        com.json.mediationsdk.i iVar = new com.json.mediationsdk.i(this.m);
        iVar.b(com.json.mediationsdk.utils.IronSourceUtils.isEncryptedResponse());
        iVar.a(true);
        iVar.c(true);
        iVar.d(str);
        iVar.c(l());
        iVar.a(this.t.a(this.m));
        com.json.c5 c5Var = new com.json.c5(h(), false);
        c5Var.a(this.s.getPlumbus());
        java.util.Map<java.lang.String, java.lang.Object> interstitialBiddingData = this.f2967a.getInterstitialBiddingData(this.c, new org.json.JSONObject());
        if (interstitialBiddingData != null) {
            c5Var.b(interstitialBiddingData);
        }
        iVar.a(c5Var);
        return iVar;
    }

    private void r() {
        this.o = new com.json.fb();
        this.f2967a.loadInterstitial(this.c, null, this);
    }

    private void s() {
        if (!this.r.a()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            a(new com.json.mediationsdk.logger.IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(82500, (java.lang.Object[][]) null);
        com.json.mediationsdk.i iVarQ = q();
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("auction waterfallString = " + iVarQ.getWaterfallString());
        a(82510, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, iVarQ.getWaterfallString()}});
        this.r.a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), iVarQ, this);
    }

    private void t() {
        this.g = null;
        this.h = null;
        this.j = null;
        this.q = new com.json.z4();
    }

    private void u() {
        this.n = new com.json.fb();
        a(new com.ironsource.mediationsdk.demandOnly.g.b());
        if (n()) {
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildLoadFailedError = com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            a(2303, (java.lang.Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            s();
        } else {
            r();
        }
    }

    @Override // com.json.p4
    public void a(int i, java.lang.String str, int i2, java.lang.String str2, long j) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(82300, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i)}, new java.lang.Object[]{"reason", str}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            a(new com.json.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.e.a.ERROR_INSTANCE_LOAD_AUCTION_FAILED, "No available ad to load"));
        }
    }

    @Override // com.json.x4
    public void a(com.ironsource.mediationsdk.d.a aVar, int i, long j, int i2, java.lang.String str) {
        java.lang.String strK;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.h = aVar.f();
        this.s = aVar.a(l());
        com.json.mediationsdk.demandOnly.a.C0238a c0238a = new com.json.mediationsdk.demandOnly.a.C0238a(aVar.h());
        if (c0238a.isEmpty()) {
            strK = "";
        } else {
            com.json.j5 j5Var = c0238a.get(0);
            this.q.a(j5Var.b());
            this.q.c(j5Var.h());
            this.q.b(j5Var.g());
            strK = j5Var.k();
            b(strK);
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            a(88002, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i2)}, new java.lang.Object[]{"reason", str}});
        }
        a(82301, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}});
        a(82302, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, c0238a.b()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (!c0238a.isEmpty()) {
                c(strK);
                return;
            }
            com.json.mediationsdk.logger.IronSourceError ironSourceError = new com.json.mediationsdk.logger.IronSourceError(1158, "There is no available ad to load");
            ironLog.error("interstitial - empty waterfall");
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void a(com.json.mediationsdk.demandOnly.o oVar) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("state=" + k());
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar2 = com.ironsource.mediationsdk.demandOnly.m.a.LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar3 = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a aVarA = a(new com.ironsource.mediationsdk.demandOnly.m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            a(new com.json.mediationsdk.logger.IronSourceError(1050, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(2002, (java.lang.Object[][]) null);
        c(oVar);
    }

    void a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED)) {
            a(ironSourceError, com.json.fb.a(this.n));
            a(this.q.b(), com.json.mediationsdk.utils.IronSourceUtils.getCurrentMethodName());
            this.p.onInterstitialAdLoadFailed(l(), ironSourceError);
        }
    }

    @Override // com.json.p4
    public void a(java.util.List<com.json.j5> list, java.lang.String str, com.json.j5 j5Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public boolean a() {
        boolean zIsInterstitialReady = false;
        if (!a(com.ironsource.mediationsdk.demandOnly.m.a.LOADED)) {
            a(2212, (java.lang.Object[][]) null);
            return false;
        }
        try {
            zIsInterstitialReady = this.f2967a.isInterstitialReady(this.c);
            a(zIsInterstitialReady ? 2211 : 2212, (java.lang.Object[][]) null);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception=" + e.getMessage());
        }
        return zIsInterstitialReady;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void b() {
        com.json.mediationsdk.logger.IronSourceError ironSourceError;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(2201, (java.lang.Object[][]) null);
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar2 = com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS;
        if (a(aVar, aVar2)) {
            this.f2967a.showInterstitial(this.c, this);
            return;
        }
        if (a(aVar2)) {
            ironSourceError = new com.json.mediationsdk.logger.IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing");
        } else {
            ironSourceError = a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS) ? new com.json.mediationsdk.logger.IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new com.json.mediationsdk.logger.IronSourceError(1066, "showInterstitial error: no available ads to show");
        }
        onInterstitialAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void c() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("state=" + k());
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar2 = com.ironsource.mediationsdk.demandOnly.m.a.LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar3 = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a aVarA = a(new com.ironsource.mediationsdk.demandOnly.m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            this.p.onInterstitialAdLoadFailed(l(), new com.json.mediationsdk.logger.IronSourceError(1050, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(2002, (java.lang.Object[][]) null);
        u();
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(2006, new java.lang.Object[0][]);
        this.p.onInterstitialAdClicked(l());
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        b(com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED);
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(2204, new java.lang.Object[][]{new java.lang.Object[]{"sessionDepth", java.lang.Integer.valueOf(this.t.a(this.m))}});
        this.u.b(this.m);
        this.p.onInterstitialAdClosed(l());
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + h() + " state=" + k());
        a(com.ironsource.mediationsdk.demandOnly.e.c.TROUBLESHOOTING_INSTANCE_LOAD_FAILED, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(2005, new java.lang.Object[0][]);
        a(this.q.a(), com.json.mediationsdk.utils.IronSourceUtils.getCurrentMethodName());
        this.p.onInterstitialAdOpened(l());
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(com.ironsource.mediationsdk.demandOnly.e.c.TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.o))}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.LOADED)) {
            a(2003, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.n))}});
            a(this.q.c(), com.json.mediationsdk.utils.IronSourceUtils.getCurrentMethodName());
            this.p.onInterstitialAdReady(l());
        }
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED);
        a(2203, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.p.onInterstitialAdShowFailed(l(), ironSourceError);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(2210, new java.lang.Object[0][]);
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }
}
