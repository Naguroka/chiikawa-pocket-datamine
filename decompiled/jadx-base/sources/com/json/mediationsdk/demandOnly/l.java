package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
public class l extends com.json.mediationsdk.demandOnly.m implements com.ironsource.mediationsdk.demandOnly.n.b, com.json.mediationsdk.sdk.RewardedVideoSmashListener, com.json.x4 {
    private com.json.fb n;
    private com.json.fb o;
    private com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener p;
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
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("load timed out state=" + com.json.mediationsdk.demandOnly.l.this.k());
            com.json.mediationsdk.demandOnly.l.this.a(new com.json.mediationsdk.logger.IronSourceError(1055, "load timed out"));
        }
    }

    l(java.lang.String str, java.lang.String str2, com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j, com.json.mediationsdk.AbstractAdapter abstractAdapter, com.json.mediationsdk.e eVar) {
        super(new com.json.z2(networkSettings, networkSettings.getRewardedVideoSettings(), com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.s = new com.ironsource.mediationsdk.demandOnly.p.b();
        this.t = com.json.im.S().k();
        this.u = com.json.im.M().e();
        this.p = iSDemandOnlyRewardedVideoListener;
        this.f = j;
        this.r = eVar;
        this.f2967a.initRewardedVideoForDemandOnly(str, str2, this.c, this);
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
        com.json.wq.i().a(new com.json.wb(i, new org.json.JSONObject(mapJ)));
    }

    private void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(1213, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(1200, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(java.util.List<java.lang.String> list, java.lang.String str) {
        a(list, h(), i(), this.j, str);
    }

    private void c(com.json.mediationsdk.demandOnly.o oVar) {
        this.n = new com.json.fb();
        a(s());
        if (!n()) {
            a(new com.json.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.j.a.LOAD_ERROR, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            com.ironsource.mediationsdk.d.a aVar = (com.ironsource.mediationsdk.d.a) oVar.a(new com.json.kb());
            com.json.j5 j5VarA = new com.json.mediationsdk.demandOnly.a.C0238a(aVar.h()).a(h());
            if (j5VarA == null) {
                com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildLoadFailedError = com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(com.ironsource.mediationsdk.demandOnly.j.a.LOAD_ERROR, (java.lang.Object[][]) null);
                a(ironSourceErrorBuildLoadFailedError);
                return;
            }
            java.lang.String strK = j5VarA.k();
            if (strK == null) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("serverData is null");
                a(new com.json.mediationsdk.logger.IronSourceError(1062, "No available ad to load"));
                return;
            }
            b(strK);
            a(aVar.a());
            a(aVar.f());
            a(81002, (java.lang.Object[][]) null);
            this.q.a(j5VarA.b());
            this.o = new com.json.fb();
            this.f2967a.loadRewardedVideoForBidding(this.c, null, strK, this);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            a(com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e.getMessage()));
        }
    }

    private void c(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new com.json.mediationsdk.logger.IronSourceError(1062, "No available ad to load"));
            } else {
                a(81002, (java.lang.Object[][]) null);
                this.f2967a.loadRewardedVideoForBidding(this.c, null, str, this);
            }
        }
    }

    private com.json.mediationsdk.logger.IronSourceError q() {
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS)) {
            return new com.json.mediationsdk.logger.IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing");
        }
        return a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS) ? new com.json.mediationsdk.logger.IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new com.json.mediationsdk.logger.IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private com.json.mediationsdk.i r() {
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
        java.util.Map<java.lang.String, java.lang.Object> rewardedVideoBiddingData = this.f2967a.getRewardedVideoBiddingData(this.c, new org.json.JSONObject());
        if (rewardedVideoBiddingData != null) {
            c5Var.b(rewardedVideoBiddingData);
        }
        iVar.a(c5Var);
        return iVar;
    }

    private java.util.TimerTask s() {
        return new com.ironsource.mediationsdk.demandOnly.l.a();
    }

    private void t() {
        this.o = new com.json.fb();
        this.f2967a.loadRewardedVideo(this.c, null, this);
    }

    private void u() {
        if (!this.r.a()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new com.json.mediationsdk.logger.IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(81500, (java.lang.Object[][]) null);
        com.json.mediationsdk.i iVarR = r();
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("auction waterfallString = " + iVarR.getWaterfallString());
        a(81510, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, iVarR.getWaterfallString()}});
        this.r.a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), iVarR, this);
    }

    private void v() {
        this.g = null;
        this.h = null;
        this.j = null;
        this.q = new com.json.z4();
    }

    private void w() {
        this.n = new com.json.fb();
        a(s());
        if (n()) {
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildLoadFailedError = com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(com.ironsource.mediationsdk.demandOnly.j.a.LOAD_ERROR, (java.lang.Object[][]) null);
            a(ironSourceErrorBuildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.json.p4
    public void a(int i, java.lang.String str, int i2, java.lang.String str2, long j) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(81300, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i)}, new java.lang.Object[]{"reason", str}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            a(new com.json.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.demandOnly.j.a.INSTANCE_LOAD_AUCTION_FAILED, "No available ad to load"));
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
        a(81301, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}});
        a(81302, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, c0238a.b()}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS)) {
            if (!c0238a.isEmpty()) {
                c(strK);
                return;
            }
            com.json.mediationsdk.logger.IronSourceError ironSourceError = new com.json.mediationsdk.logger.IronSourceError(1058, "There is no available ad to load");
            ironLog.error("rewardedVideo - empty waterfall");
            a(ironSourceError);
        }
    }

    void a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED)) {
            a(ironSourceError, com.json.fb.a(this.n));
            a(this.q.b(), com.json.mediationsdk.utils.IronSourceUtils.getCurrentMethodName());
            this.p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
        }
    }

    @Override // com.json.p4
    public void a(java.util.List<com.json.j5> list, java.lang.String str, com.json.j5 j5Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean zIsRewardedVideoAvailable = false;
        if (!a(com.ironsource.mediationsdk.demandOnly.m.a.LOADED)) {
            a(1211, (java.lang.Object[][]) null);
            return false;
        }
        try {
            zIsRewardedVideoAvailable = this.f2967a.isRewardedVideoAvailable(this.c);
            a(zIsRewardedVideoAvailable ? 1210 : 1211, (java.lang.Object[][]) null);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception=" + e.getMessage());
        }
        return zIsRewardedVideoAvailable;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void b(com.json.mediationsdk.demandOnly.o oVar) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("state=" + k());
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar2 = com.ironsource.mediationsdk.demandOnly.m.a.LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar3 = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a aVarA = a(new com.ironsource.mediationsdk.demandOnly.m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            a(new com.json.mediationsdk.logger.IronSourceError(1053, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(1001, (java.lang.Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("state=" + k());
        com.ironsource.mediationsdk.demandOnly.m.a aVar = com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar2 = com.ironsource.mediationsdk.demandOnly.m.a.LOADED;
        com.ironsource.mediationsdk.demandOnly.m.a aVar3 = com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS;
        com.ironsource.mediationsdk.demandOnly.m.a aVarA = a(new com.ironsource.mediationsdk.demandOnly.m.a[]{aVar, aVar2}, aVar3);
        if (aVarA != aVar && aVarA != aVar2) {
            this.p.onRewardedVideoAdLoadFailed(l(), new com.json.mediationsdk.logger.IronSourceError(1053, aVarA == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(1001, (java.lang.Object[][]) null);
        w();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void e() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(1201, (java.lang.Object[][]) null);
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOADED, com.ironsource.mediationsdk.demandOnly.m.a.SHOW_IN_PROGRESS)) {
            this.f2967a.showRewardedVideo(this.c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1006, new java.lang.Object[0][]);
        this.p.onRewardedVideoAdClicked(l());
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED);
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1203, new java.lang.Object[][]{new java.lang.Object[]{"sessionDepth", java.lang.Integer.valueOf(this.t.a(this.m))}});
        this.u.b(this.m);
        this.p.onRewardedVideoAdClosed(l());
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1005, new java.lang.Object[0][]);
        a(this.q.a(), com.json.mediationsdk.utils.IronSourceUtils.getCurrentMethodName());
        this.p.onRewardedVideoAdOpened(l());
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        java.util.Map<java.lang.String, java.lang.Object> mapJ = j();
        if (!android.text.TextUtils.isEmpty(com.json.mediationsdk.p.m().l())) {
            mapJ.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_DYNAMIC_USER_ID, com.json.mediationsdk.p.m().l());
        }
        if (com.json.mediationsdk.p.m().s() != null) {
            for (java.lang.String str : com.json.mediationsdk.p.m().s().keySet()) {
                mapJ.put(androidx.media3.datasource.cache.ContentMetadata.KEY_CUSTOM_PREFIX + str, com.json.mediationsdk.p.m().s().get(str));
            }
        }
        com.json.mediationsdk.model.Placement placementA = com.json.mediationsdk.p.m().h().c().getRewardedVideoConfigurations().a();
        if (placementA != null) {
            mapJ.put("placement", placementA.getCom.ironsource.op.d java.lang.String());
            mapJ.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, placementA.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String());
            mapJ.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, java.lang.Integer.valueOf(placementA.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT java.lang.String()));
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("defaultPlacement is null");
        }
        com.json.wb wbVar = new com.json.wb(1010, new org.json.JSONObject(mapJ));
        wbVar.a(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_TRANS_ID, com.json.mediationsdk.utils.IronSourceUtils.getTransId(wbVar.d(), h()));
        com.json.wq.i().a(wbVar);
        this.p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED);
        a(1202, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1206, new java.lang.Object[0][]);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(com.ironsource.mediationsdk.demandOnly.j.c.INSTANCE_LOAD_FAILED, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(com.ironsource.mediationsdk.demandOnly.j.c.INSTANCE_LOAD_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.o))}});
        if (a(com.ironsource.mediationsdk.demandOnly.m.a.LOAD_IN_PROGRESS, com.ironsource.mediationsdk.demandOnly.m.a.LOADED)) {
            a(1002, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.n))}});
            a(this.q.c(), com.json.mediationsdk.utils.IronSourceUtils.getCurrentMethodName());
            this.p.onRewardedVideoAdLoadSuccess(l());
        }
    }
}
