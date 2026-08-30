package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class r extends com.json.mediationsdk.y implements com.json.mediationsdk.sdk.RewardedVideoSmashListener, com.json.v7 {
    private com.ironsource.mediationsdk.r.b h;
    private com.json.uk i;
    private java.util.Timer j;
    private int k;
    private java.lang.String l;
    private java.lang.String m;
    private com.json.mediationsdk.model.Placement n;
    private long o;
    private java.lang.String p;
    private org.json.JSONObject q;
    private int r;
    private java.lang.String s;
    private final java.lang.Object t;
    private final java.lang.Object u;
    private long v;
    private final com.ironsource.vh.a w;

    class a extends java.util.TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i;
            boolean z;
            com.ironsource.mediationsdk.r.b bVar = com.json.mediationsdk.r.this.h;
            com.ironsource.mediationsdk.r.b bVar2 = com.ironsource.mediationsdk.r.b.LOAD_IN_PROGRESS;
            java.lang.String str = "Rewarded Video - load instance time out";
            if (bVar == bVar2 || com.json.mediationsdk.r.this.h == com.ironsource.mediationsdk.r.b.INIT_IN_PROGRESS) {
                if (com.json.mediationsdk.r.this.h == bVar2) {
                    i = 1025;
                } else {
                    i = 1032;
                    str = "Rewarded Video - init instance time out";
                }
                com.json.mediationsdk.r.this.a(com.ironsource.mediationsdk.r.b.NOT_LOADED);
                z = true;
            } else {
                i = 510;
                z = false;
            }
            com.json.mediationsdk.r.this.a(str);
            if (!z) {
                com.json.mediationsdk.r.this.a(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.mediationsdk.r.this.v())}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, com.json.mediationsdk.r.this.h.name()}});
                return;
            }
            com.json.mediationsdk.r.this.a(1200, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i)}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.mediationsdk.r.this.v())}});
            com.json.mediationsdk.r.this.a(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i)}, new java.lang.Object[]{"reason", str}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.mediationsdk.r.this.v())}});
            com.json.mediationsdk.r.this.i.c(com.json.mediationsdk.r.this);
        }
    }

    protected enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public r(com.json.mediationsdk.r rVar, com.json.uk ukVar, com.json.mediationsdk.AbstractAdapter abstractAdapter, int i, java.lang.String str, org.json.JSONObject jSONObject, int i2, java.lang.String str2) {
        this(rVar.l, rVar.m, rVar.b.h(), ukVar, rVar.k, abstractAdapter, i);
        this.p = str;
        this.q = jSONObject;
        this.r = i2;
        this.s = str2;
    }

    public r(java.lang.String str, java.lang.String str2, com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.uk ukVar, int i, com.json.mediationsdk.AbstractAdapter abstractAdapter, int i2) {
        super(new com.json.z2(networkSettings, networkSettings.getRewardedVideoSettings(), com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.t = new java.lang.Object();
        this.u = new java.lang.Object();
        this.w = com.json.im.M().e();
        this.l = str;
        this.m = str2;
        this.i = ukVar;
        this.j = null;
        this.k = i;
        this.f = i2;
        this.h = com.ironsource.mediationsdk.r.b.NO_INIT;
        this.v = 0L;
        if (r()) {
            t();
        }
    }

    private void C() {
        try {
            java.lang.String pluginType = com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginType();
            if (android.text.TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f3034a.setPluginData(pluginType);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            a("setCustomParams() " + th.getMessage());
        }
    }

    private void D() {
        synchronized (this.u) {
            java.util.Timer timer = new java.util.Timer();
            this.j = timer;
            timer.schedule(new com.ironsource.mediationsdk.r.a(), this.k * 1000);
        }
    }

    private void E() {
        synchronized (this.u) {
            java.util.Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
        }
    }

    private void a(int i, java.lang.Object[][] objArr, boolean z) {
        com.json.mediationsdk.model.Placement placement;
        java.util.Map<java.lang.String, java.lang.Object> mapM = m();
        if (!android.text.TextUtils.isEmpty(this.p)) {
            mapM.put("auctionId", this.p);
        }
        org.json.JSONObject jSONObject = this.q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.q);
        }
        if (z && (placement = this.n) != null && !android.text.TextUtils.isEmpty(placement.getCom.ironsource.op.d java.lang.String())) {
            mapM.put("placement", this.n.getCom.ironsource.op.d java.lang.String());
        }
        if (c(i)) {
            com.json.wq.i().a(mapM, this.r, this.s);
        }
        mapM.put("sessionDepth", java.lang.Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (java.lang.Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, c() + " smash: RV sendProviderEvent " + android.util.Log.getStackTraceString(e), 3);
            }
        }
        com.json.wq.i().a(new com.json.wb(i, new org.json.JSONObject(mapM)));
        if (i == 1203) {
            this.w.b(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.ironsource.mediationsdk.r.b bVar) {
        a("current state=" + this.h + ", new state=" + bVar);
        synchronized (this.t) {
            this.h = bVar;
        }
    }

    private void b(int i) {
        b(i, null);
    }

    private boolean c(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1212 || i == 1213 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    private void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        a(com.ironsource.mediationsdk.r.b.INIT_IN_PROGRESS);
        C();
        try {
            this.f3034a.initRewardedVideoWithCallback(this.l, this.m, this.d, this);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            b("initForBidding exception: " + th.getLocalizedMessage());
            onRewardedVideoInitFailed(new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long v() {
        return new java.util.Date().getTime() - this.o;
    }

    public boolean A() {
        if (this.h != com.ironsource.mediationsdk.r.b.LOADED) {
            return false;
        }
        try {
            return this.f3034a.isRewardedVideoAvailable(this.d);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            b("isReadyToShow exception: " + th.getLocalizedMessage());
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new java.lang.Object[]{"reason", th.getLocalizedMessage()}});
            return false;
        }
    }

    public void B() {
        a(com.json.mediationsdk.utils.IronSourceConstants.RV_CAP_SESSION);
    }

    @Override // com.json.v7
    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        org.json.JSONObject jSONObjectA = adData != null ? com.json.hk.a(adData.getAdUnitData()) : null;
        if (p()) {
            return this.f3034a.getRewardedVideoBiddingData(this.d, jSONObjectA);
        }
        return null;
    }

    public void a(int i) {
        a(i, null, false);
    }

    public void a(int i, java.lang.Object[][] objArr) {
        a(i, objArr, false);
    }

    @Override // com.json.v7
    public void a(com.json.mediationsdk.adunit.adapter.utility.AdData adData, com.json.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        a(1020);
        try {
            this.f3034a.collectRewardedVideoBiddingData(this.d, adData != null ? com.json.hk.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            b("collectBiddingData exception: " + th.getLocalizedMessage());
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a(com.json.mediationsdk.model.Placement placement) {
        E();
        a("showVideo()");
        this.n = placement;
        a(com.ironsource.mediationsdk.r.b.SHOW_IN_PROGRESS);
        b(1201);
        try {
            this.f3034a.showRewardedVideo(this.d, this);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            b("showVideo exception: " + th.getLocalizedMessage());
            onRewardedVideoAdShowFailed(new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.r.b bVar;
        com.ironsource.mediationsdk.r.b bVar2;
        a("loadVideo() auctionId: " + this.p + " state: " + this.h);
        this.g = null;
        a(false);
        synchronized (this.t) {
            bVar = this.h;
            bVar2 = com.ironsource.mediationsdk.r.b.LOAD_IN_PROGRESS;
            if (bVar != bVar2 && bVar != com.ironsource.mediationsdk.r.b.SHOW_IN_PROGRESS) {
                a(bVar2);
            }
        }
        if (bVar == bVar2) {
            a(com.json.mediationsdk.utils.IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 5003}, new java.lang.Object[]{"reason", "load during load"}});
            return;
        }
        if (bVar == com.ironsource.mediationsdk.r.b.SHOW_IN_PROGRESS) {
            a(com.json.mediationsdk.utils.IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 5004}, new java.lang.Object[]{"reason", "load during show"}});
            return;
        }
        D();
        this.o = new java.util.Date().getTime();
        a(1001);
        try {
            if (p()) {
                this.f3034a.loadRewardedVideoForBidding(this.d, jSONObject, str, this);
            } else {
                C();
                this.f3034a.initAndLoadRewardedVideo(this.l, this.m, this.d, jSONObject, this);
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            b("loadVideo exception: " + th.getLocalizedMessage());
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(p() ? com.json.mediationsdk.utils.IronSourceConstants.errorCode_loadException : com.json.mediationsdk.utils.IronSourceConstants.errorCode_initFailed)}, new java.lang.Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    public void b(int i, java.lang.Object[][] objArr) {
        a(i, objArr, true);
    }

    public void b(boolean z) {
        java.lang.Object[][] objArr = new java.lang.Object[1][];
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? com.json.mediationsdk.metadata.a.g : "false";
        objArr[0] = objArr2;
        b(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr);
    }

    @Override // com.json.mediationsdk.y
    public com.ironsource.mediationsdk.IronSource.AD_UNIT d() {
        return com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    @Override // com.json.mediationsdk.y
    public java.lang.String k() {
        return "LWSProgRvSmash";
    }

    @Override // com.json.mediationsdk.y
    public int l() {
        return 2;
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.i.b(this, this.n);
        b(1006);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.t) {
            if (this.h != com.ironsource.mediationsdk.r.b.SHOW_IN_PROGRESS) {
                b(1203);
                a(com.json.mediationsdk.utils.IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.errorCode_adClosed)}, new java.lang.Object[]{"reason", "adClosed: " + this.h}});
            } else {
                a(com.ironsource.mediationsdk.r.b.ENDED);
                this.v = new java.util.Date().getTime();
                this.i.b(this);
            }
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.i.f(this);
        b(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_ENDED);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.i.d(this);
        b(1005);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        a("onRewardedVideoAdRewarded");
        long time = new java.util.Date().getTime();
        this.i.a(this, this.n);
        java.util.Map<java.lang.String, java.lang.Object> mapM = m();
        com.json.mediationsdk.model.Placement placement = this.n;
        if (placement != null) {
            mapM.put("placement", placement.getCom.ironsource.op.d java.lang.String());
            mapM.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, this.n.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String());
            mapM.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, java.lang.Integer.valueOf(this.n.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT java.lang.String()));
        }
        if (!android.text.TextUtils.isEmpty(com.json.mediationsdk.p.m().l())) {
            mapM.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_DYNAMIC_USER_ID, com.json.mediationsdk.p.m().l());
        }
        if (com.json.mediationsdk.p.m().s() != null) {
            for (java.lang.String str : com.json.mediationsdk.p.m().s().keySet()) {
                mapM.put(androidx.media3.datasource.cache.ContentMetadata.KEY_CUSTOM_PREFIX + str, com.json.mediationsdk.p.m().s().get(str));
            }
        }
        if (!android.text.TextUtils.isEmpty(this.p)) {
            mapM.put("auctionId", this.p);
        }
        org.json.JSONObject jSONObject = this.q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.q);
        }
        if (c(1010)) {
            com.json.wq.i().a(mapM, this.r, this.s);
        }
        mapM.put("sessionDepth", java.lang.Integer.valueOf(this.f));
        com.json.wb wbVar = new com.json.wb(1010, new org.json.JSONObject(mapM));
        wbVar.a(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_TRANS_ID, com.json.mediationsdk.utils.IronSourceUtils.getTransId(wbVar.d(), c()));
        long j = this.v;
        if (j != 0) {
            long j2 = time - j;
            a("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            wbVar.a("duration", java.lang.Long.valueOf(j2));
        }
        com.json.wq.i().a(wbVar);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        b(1202, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.t) {
            if (this.h != com.ironsource.mediationsdk.r.b.SHOW_IN_PROGRESS) {
                a(com.json.mediationsdk.utils.IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.errorCode_showFailed)}, new java.lang.Object[]{"reason", "showFailed: " + this.h}});
            } else {
                a(com.ironsource.mediationsdk.r.b.ENDED);
                this.i.a(ironSourceError, this);
            }
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.i.a(this);
        b(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_STARTED);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        b(1206);
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.h.name());
        synchronized (this.t) {
            if (this.h == com.ironsource.mediationsdk.r.b.LOAD_IN_PROGRESS) {
                a(z ? com.ironsource.mediationsdk.r.b.LOADED : com.ironsource.mediationsdk.r.b.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                a(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, this.h.name()}});
                return;
            } else {
                a(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(v())}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, this.h.name()}});
                return;
            }
        }
        E();
        a(z ? 1002 : 1200, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(v())}});
        if (z) {
            this.i.e(this);
        } else {
            this.i.c(this);
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        E();
        a(1200, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(v())}});
        a(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(v())}});
        synchronized (this.t) {
            if (this.h != com.ironsource.mediationsdk.r.b.INIT_IN_PROGRESS) {
                a(com.json.mediationsdk.utils.IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.errorCode_initFailed)}, new java.lang.Object[]{"reason", "initFailed: " + this.h}});
            } else {
                a(com.ironsource.mediationsdk.r.b.NO_INIT);
                this.i.c(this);
            }
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.t) {
            if (this.h != com.ironsource.mediationsdk.r.b.INIT_IN_PROGRESS) {
                a(com.json.mediationsdk.utils.IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.errorCode_initSuccess)}, new java.lang.Object[]{"reason", "initSuccess: " + this.h}});
            } else {
                a(com.ironsource.mediationsdk.r.b.NOT_LOADED);
            }
        }
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(1213, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.g = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(v())}});
    }

    @Override // com.json.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    public java.lang.String u() {
        return this.p;
    }

    public com.json.mediationsdk.LoadWhileShowSupportState w() {
        try {
            return this.f3034a.getLoadWhileShowSupportState(this.d);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            b("Exception while calling adapter.getLoadWhileShowSupportState() - " + th.getLocalizedMessage());
            return com.json.mediationsdk.LoadWhileShowSupportState.NONE;
        }
    }

    public com.json.mediationsdk.model.Placement x() {
        return this.n;
    }

    public boolean y() {
        return this.h == com.ironsource.mediationsdk.r.b.LOADED;
    }

    public boolean z() {
        com.ironsource.mediationsdk.r.b bVar = this.h;
        return bVar == com.ironsource.mediationsdk.r.b.INIT_IN_PROGRESS || bVar == com.ironsource.mediationsdk.r.b.LOAD_IN_PROGRESS;
    }
}
