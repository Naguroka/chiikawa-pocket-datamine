package com.json;

/* JADX INFO: loaded from: classes5.dex */
public final class qj implements com.json.cr, com.json.s9, com.json.r9, com.json.p9, com.json.q9, com.json.wj, com.json.ko {
    private static final java.lang.String m = "IronSourceAdsPublisherAgent";
    private static com.json.qj n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.sdk.controller.e f3204a;
    private java.lang.String b;
    private java.lang.String c;
    private com.json.ta d;
    private com.json.ln e;
    private com.json.b9 g;
    private boolean f = false;
    private com.json.sdk.controller.FeaturesManager h = com.json.sdk.controller.FeaturesManager.getInstance();
    private com.ironsource.wh.a i = com.json.im.M().g();
    private com.ironsource.m0.a j = com.json.im.M().E();
    private com.json.m0 k = com.json.im.S().F();
    private com.json.xg l = com.json.im.S().z();

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3205a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.json.sa c;

        a(java.lang.String str, java.lang.String str2, com.json.sa saVar) {
            this.f3205a = str;
            this.b = str2;
            this.c = saVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.qj.this.f3204a.a(this.f3205a, this.b, this.c, (com.json.s9) com.json.qj.this);
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f3206a;

        b(org.json.JSONObject jSONObject) {
            this.f3206a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.qj.this.f3204a.a(this.f3206a, (com.json.s9) com.json.qj.this);
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3207a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.json.sa c;

        c(java.lang.String str, java.lang.String str2, com.json.sa saVar) {
            this.f3207a = str;
            this.b = str2;
            this.c = saVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.qj.this.f3204a.a(this.f3207a, this.b, this.c, (com.json.r9) com.json.qj.this);
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3208a;

        d(java.lang.String str) {
            this.f3208a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.qj.this.f3204a.a(this.f3208a, com.json.qj.this);
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f3209a;

        e(org.json.JSONObject jSONObject) {
            this.f3209a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.qj.this.f3204a.a(this.f3209a, (com.json.r9) com.json.qj.this);
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mj f3210a;
        final /* synthetic */ java.util.Map b;

        f(com.json.mj mjVar, java.util.Map map) {
            this.f3210a = mjVar;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.zg.e eVar = this.f3210a.i() ? com.ironsource.zg.e.Banner : com.ironsource.zg.e.Interstitial;
            com.json.sa saVarA = com.json.qj.this.d.a(eVar, this.f3210a);
            com.json.bh bhVar = new com.json.bh();
            bhVar.a(com.json.zb.x, java.lang.Boolean.valueOf(this.f3210a.j())).a(com.json.zb.G, java.lang.Boolean.valueOf(this.f3210a.m())).a(com.json.zb.v, this.f3210a.g()).a(com.json.zb.w, com.json.xj.a(this.f3210a)).a(com.json.zb.I, java.lang.Long.valueOf(com.json.j0.f2778a.b(this.f3210a.e())));
            com.json.gh.a(com.json.ar.h, bhVar.a());
            if (eVar == com.ironsource.zg.e.Banner) {
                com.json.qj.this.f3204a.a(com.json.qj.this.b, com.json.qj.this.c, saVarA, (com.json.q9) com.json.qj.this);
                com.json.qj.this.f3204a.a(saVarA, this.b, (com.json.q9) com.json.qj.this);
            } else {
                com.json.qj.this.f3204a.a(com.json.qj.this.b, com.json.qj.this.c, saVarA, (com.json.r9) com.json.qj.this);
                com.json.qj.this.f3204a.b(saVarA, this.b, com.json.qj.this);
            }
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.sa f3211a;
        final /* synthetic */ java.util.Map b;

        g(com.json.sa saVar, java.util.Map map) {
            this.f3211a = saVar;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.qj.this.f3204a.a(this.f3211a, this.b, (com.json.r9) com.json.qj.this);
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mj f3212a;

        h(com.json.mj mjVar) {
            this.f3212a = mjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.zg.e eVar = this.f3212a.i() ? com.ironsource.zg.e.Banner : com.ironsource.zg.e.Interstitial;
            com.json.sa saVarA = com.json.qj.this.d.a(eVar, this.f3212a);
            com.json.bh bhVar = new com.json.bh();
            bhVar.a(com.json.zb.x, java.lang.Boolean.valueOf(this.f3212a.j())).a(com.json.zb.v, this.f3212a.g()).a(com.json.zb.w, com.json.xj.a(this.f3212a)).a("isMultipleAdObjects", java.lang.Boolean.valueOf(this.f3212a.l()));
            com.json.gh.a(com.json.ar.m, bhVar.a());
            if (eVar == com.ironsource.zg.e.Banner) {
                com.json.qj.this.f3204a.a(saVarA);
            } else {
                saVarA.a(false);
                com.json.qj.this.f3204a.b(saVarA);
            }
        }
    }

    private qj(android.content.Context context, int i) {
        c(context);
    }

    qj(java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.b = str;
        this.c = str2;
        c(context);
    }

    private com.json.fo a(com.json.sa saVar) {
        if (saVar == null) {
            return null;
        }
        return (com.json.fo) saVar.i();
    }

    public static synchronized com.json.qj a(android.content.Context context, int i) throws java.lang.Exception {
        com.json.sdk.utils.Logger.i(m, "getInstance()");
        if (n == null) {
            n = new com.json.qj(context, i);
        }
        return n;
    }

    public static com.json.wj a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return a(str, str2, context);
    }

    public static synchronized com.json.wj a(java.lang.String str, java.lang.String str2, android.content.Context context) {
        if (n == null) {
            com.json.gh.a(com.json.ar.f2514a);
            n = new com.json.qj(str, str2, context);
        }
        return n;
    }

    private java.util.Map<java.lang.String, java.lang.String> a(java.util.Map<java.lang.String, java.lang.String> map) {
        map.put("adm", com.json.sdk.utils.SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    private com.json.ho b(com.json.sa saVar) {
        if (saVar == null) {
            return null;
        }
        return (com.json.ho) saVar.i();
    }

    public static synchronized com.json.qj b(android.content.Context context) throws java.lang.Exception {
        return a(context, 0);
    }

    private void b(com.json.mj mjVar, java.util.Map<java.lang.String, java.lang.String> map) {
        com.json.sdk.utils.Logger.d(m, "loadOnNewInstance " + mjVar.e());
        this.f3204a.a(new com.ironsource.qj.f(mjVar, map));
    }

    private com.json.mo c(com.json.sa saVar) {
        if (saVar == null) {
            return null;
        }
        return (com.json.mo) saVar.i();
    }

    private void c(android.content.Context context) {
        try {
            com.json.sdk.utils.SDKUtils.getNetworkConfiguration();
            com.json.dk.a(context);
            com.json.sdk.utils.IronSourceStorageUtils.initializeCacheDirectory(context, new com.json.nt(com.json.sdk.utils.SDKUtils.getNetworkConfiguration().optJSONObject(com.ironsource.y8.a.k)));
            com.json.dk.e().d(com.json.sdk.utils.SDKUtils.getSDKVersion());
            this.d = new com.json.ta();
            com.json.b9 b9Var = new com.json.b9();
            this.g = b9Var;
            if (context instanceof android.app.Activity) {
                b9Var.a((android.app.Activity) context);
            }
            int debugMode = this.h.getDebugMode();
            this.e = new com.json.ln();
            this.f3204a = new com.json.sdk.controller.e(context, this.g, this.d, com.json.cg.f2559a, debugMode, this.h.getDataManagerConfig(), this.b, this.c, this.e);
            com.json.sdk.utils.Logger.enableLogging(debugMode);
            com.json.sdk.utils.Logger.i(m, "C'tor");
            a(context);
            this.e.d();
            this.e.e();
            this.e.a(context);
            this.e.b();
            this.e.a();
            this.e.b(context);
            this.e.c();
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    private void c(com.json.mj mjVar, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            map = a(map);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.bh bhVarA = new com.json.bh().a(com.json.zb.A, e2.getMessage()).a(com.json.zb.x, java.lang.Boolean.valueOf(mjVar.j())).a(com.json.zb.G, java.lang.Boolean.valueOf(mjVar.m())).a(com.json.zb.v, mjVar.g()).a(com.json.zb.w, com.json.xj.a(mjVar)).a(com.json.zb.I, java.lang.Long.valueOf(com.json.j0.f2778a.b(mjVar.e())));
            com.json.j0.f2778a.a(mjVar.e());
            com.json.gh.a(com.json.ar.k, bhVarA.a());
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            com.json.sdk.utils.Logger.d(m, "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
        }
        b(mjVar, map);
    }

    private com.json.sa d(com.ironsource.zg.e eVar, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return this.d.a(eVar, str);
    }

    @Override // com.json.wj
    public com.json.sdk.controller.e a() {
        return this.f3204a;
    }

    @Override // com.json.cr, com.json.wj
    public void a(android.app.Activity activity) {
        try {
            com.json.sdk.utils.Logger.i(m, "release()");
            com.json.wa.g();
            this.g.b();
            this.f3204a.a((android.content.Context) activity);
            this.f3204a.destroy();
            this.f3204a = null;
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
        }
        n = null;
    }

    @Override // com.json.yj
    public void a(android.app.Activity activity, com.json.mj mjVar, java.util.Map<java.lang.String, java.lang.String> map) {
        this.g.a(activity);
        com.json.sdk.utils.Logger.i(m, "showAd " + mjVar.e());
        com.json.sa saVarA = this.d.a(com.ironsource.zg.e.Interstitial, mjVar.e());
        if (saVarA == null) {
            return;
        }
        this.f3204a.a(new com.ironsource.qj.g(saVarA, map));
    }

    public void a(android.content.Context context) {
        this.f = false;
        java.lang.Boolean boolC = this.l.c(com.ironsource.y8.a.g);
        if (boolC == null) {
            boolC = java.lang.Boolean.FALSE;
        }
        boolean zBooleanValue = boolC.booleanValue();
        this.f = zBooleanValue;
        if (zBooleanValue) {
            try {
                ((android.app.Application) context).registerActivityLifecycleCallbacks(new com.json.i(this));
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                com.json.bh bhVar = new com.json.bh();
                bhVar.a(com.json.zb.y, th.getMessage());
                com.json.gh.a(com.json.ar.u, bhVar.a());
            }
        }
    }

    @Override // com.json.yj
    public void a(com.json.mj mjVar, java.util.Map<java.lang.String, java.lang.String> map) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        map.put(com.ironsource.y8.h.y0, java.lang.String.valueOf(jCurrentTimeMillis));
        com.json.j0.f2778a.a(mjVar.e(), jCurrentTimeMillis);
        com.json.bh bhVar = new com.json.bh();
        bhVar.a(com.json.zb.x, java.lang.Boolean.valueOf(mjVar.j())).a(com.json.zb.G, java.lang.Boolean.valueOf(mjVar.m())).a(com.json.zb.v, mjVar.g()).a(com.json.zb.w, com.json.xj.a(mjVar)).a(com.json.zb.I, java.lang.Long.valueOf(jCurrentTimeMillis));
        com.json.gh.a(com.json.ar.f, bhVar.a());
        com.json.sdk.utils.Logger.d(m, "loadAd " + mjVar.e());
        com.json.l0 l0Var = new com.json.l0(mjVar);
        this.j.a(l0Var);
        this.j.a(new org.json.JSONObject(map), com.json.k1.LOAD_REQUEST, l0Var.c());
        if (c(mjVar)) {
            this.i.a(new com.json.ts(l0Var));
        }
        if (mjVar.k()) {
            c(mjVar, map);
        } else {
            b(mjVar, map);
        }
    }

    @Override // com.json.p9
    public void a(com.ironsource.zg.e eVar, java.lang.String str) {
        com.json.ho hoVarB;
        com.json.sa saVarD = d(eVar, str);
        if (saVarD != null) {
            if (eVar == com.ironsource.zg.e.RewardedVideo) {
                com.json.mo moVarC = c(saVarD);
                if (moVarC != null) {
                    moVarC.c();
                    return;
                }
                return;
            }
            if (eVar != com.ironsource.zg.e.Interstitial || (hoVarB = b(saVarD)) == null) {
                return;
            }
            hoVarB.onInterstitialClose();
        }
    }

    @Override // com.json.p9
    public void a(com.ironsource.zg.e eVar, java.lang.String str, com.json.w2 w2Var) {
        com.json.fo foVarA;
        com.json.sa saVarD = d(eVar, str);
        if (saVarD != null) {
            saVarD.b(2);
            if (eVar == com.ironsource.zg.e.RewardedVideo) {
                com.json.mo moVarC = c(saVarD);
                if (moVarC != null) {
                    moVarC.a(w2Var);
                    return;
                }
                return;
            }
            if (eVar == com.ironsource.zg.e.Interstitial) {
                com.json.ho hoVarB = b(saVarD);
                if (hoVarB != null) {
                    hoVarB.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != com.ironsource.zg.e.Banner || (foVarA = a(saVarD)) == null) {
                return;
            }
            foVarA.onBannerInitSuccess();
        }
    }

    @Override // com.json.p9
    public void a(com.ironsource.zg.e eVar, java.lang.String str, java.lang.String str2) {
        com.json.fo foVarA;
        com.json.sa saVarD = d(eVar, str);
        com.json.bh bhVarA = new com.json.bh().a(com.json.zb.v, str).a(com.json.zb.w, eVar).a(com.json.zb.A, str2);
        if (saVarD != null) {
            com.json.j0 j0Var = com.json.j0.f2778a;
            bhVarA.a(com.json.zb.I, java.lang.Long.valueOf(j0Var.b(saVarD.h())));
            bhVarA.a(com.json.zb.x, java.lang.Boolean.valueOf(com.json.hh.a(saVarD)));
            j0Var.a(saVarD.h());
            saVarD.b(3);
            if (eVar == com.ironsource.zg.e.RewardedVideo) {
                com.json.mo moVarC = c(saVarD);
                if (moVarC != null) {
                    moVarC.b(str2);
                }
            } else if (eVar == com.ironsource.zg.e.Interstitial) {
                com.json.ho hoVarB = b(saVarD);
                if (hoVarB != null) {
                    hoVarB.onInterstitialInitFailed(str2);
                }
            } else if (eVar == com.ironsource.zg.e.Banner && (foVarA = a(saVarD)) != null) {
                foVarA.onBannerLoadFail(str2);
            }
        }
        com.json.gh.a(com.json.ar.i, bhVarA.a());
    }

    @Override // com.json.p9
    public void a(com.ironsource.zg.e eVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        com.json.fo foVarA;
        com.json.sa saVarD = d(eVar, str);
        if (saVarD == null || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            com.json.sdk.utils.Logger.i(m, "Received Event Notification: " + str2 + " for demand source: " + saVarD.f());
            if (eVar == com.ironsource.zg.e.Interstitial) {
                com.json.ho hoVarB = b(saVarD);
                if (hoVarB != null) {
                    jSONObject.put("demandSourceName", str);
                    hoVarB.onInterstitialEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar == com.ironsource.zg.e.RewardedVideo) {
                com.json.mo moVarC = c(saVarD);
                if (moVarC != null) {
                    jSONObject.put("demandSourceName", str);
                    moVarC.a(str2, jSONObject);
                }
            } else if (eVar == com.ironsource.zg.e.Banner && (foVarA = a(saVarD)) != null) {
                jSONObject.put("demandSourceName", str);
                if (str2.equalsIgnoreCase("impressions")) {
                    foVarA.onBannerShowSuccess();
                }
            }
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.json.s9
    public void a(java.lang.String str, int i) {
        com.json.mo moVarC;
        com.json.sa saVarD = d(com.ironsource.zg.e.RewardedVideo, str);
        if (saVarD == null || (moVarC = c(saVarD)) == null) {
            return;
        }
        moVarC.a(i);
    }

    @Override // com.json.q9
    public void a(java.lang.String str, com.json.qg qgVar) {
        com.json.fo foVarA;
        com.json.sa saVarD = d(com.ironsource.zg.e.Banner, str);
        if (saVarD == null || (foVarA = a(saVarD)) == null) {
            return;
        }
        foVarA.onBannerLoadSuccess(saVarD.c(), qgVar);
    }

    @Override // com.json.q9
    public void a(java.lang.String str, java.lang.String str2) {
        com.json.fo foVarA;
        com.json.sa saVarD = d(com.ironsource.zg.e.Banner, str);
        if (saVarD == null || (foVarA = a(saVarD)) == null) {
            return;
        }
        foVarA.onBannerLoadFail(str2);
    }

    @Override // com.json.cr
    public void a(java.lang.String str, java.lang.String str2, int i) {
        com.ironsource.zg.e productType;
        com.json.sa saVarA;
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || (productType = com.json.sdk.utils.SDKUtils.getProductType(str)) == null || (saVarA = this.d.a(productType, str2)) == null) {
            return;
        }
        saVarA.c(i);
    }

    @Override // com.json.cr
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, com.json.ho hoVar) {
        this.b = str;
        this.c = str2;
        this.f3204a.a(new com.ironsource.qj.c(str, str2, this.d.a(com.ironsource.zg.e.Interstitial, str3, map, hoVar)));
    }

    @Override // com.json.cr
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, com.json.mo moVar) {
        this.b = str;
        this.c = str2;
        this.f3204a.a(new com.ironsource.qj.a(str, str2, this.d.a(com.ironsource.zg.e.RewardedVideo, str3, map, moVar)));
    }

    @Override // com.json.r9
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.ironsource.zg.e eVar = com.ironsource.zg.e.Interstitial;
        com.json.sa saVarD = d(eVar, str);
        com.json.bh bhVarA = new com.json.bh().a(com.json.zb.v, str);
        if (saVarD != null) {
            com.json.mj mjVarC = saVarD.c();
            this.j.a(jSONObject, com.json.k1.LOAD_SUCCESS, mjVarC.e());
            if (c(mjVarC)) {
                this.i.a(new com.json.us(this.k.a(mjVarC.e())));
            }
            com.json.bh bhVarA2 = bhVarA.a(com.json.zb.w, com.json.hh.a(saVarD, eVar)).a(com.json.zb.x, java.lang.Boolean.valueOf(com.json.hh.a(saVarD)));
            com.json.j0 j0Var = com.json.j0.f2778a;
            bhVarA2.a(com.json.zb.I, java.lang.Long.valueOf(j0Var.b(saVarD.h())));
            j0Var.a(saVarD.h());
            com.json.ho hoVarB = b(saVarD);
            if (hoVarB != null) {
                hoVarB.onInterstitialLoadSuccess(saVarD.c());
            }
        }
        com.json.gh.a(com.json.ar.l, bhVarA.a());
    }

    @Override // com.json.cr
    public void a(org.json.JSONObject jSONObject) {
        this.f3204a.a(new com.ironsource.qj.b(jSONObject));
    }

    @Override // com.json.yj
    public boolean a(com.json.mj mjVar) {
        com.json.sdk.utils.Logger.d(m, "isAdAvailable " + mjVar.e());
        com.json.sa saVarA = this.d.a(com.ironsource.zg.e.Interstitial, mjVar.e());
        if (saVarA == null) {
            return false;
        }
        return saVarA.d();
    }

    @Override // com.json.cr
    public boolean a(java.lang.String str) {
        return this.f3204a.a(str);
    }

    @Override // com.json.ko
    public void b(android.app.Activity activity) {
        try {
            this.f3204a.d();
            this.f3204a.a((android.content.Context) activity);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.json.yj
    public void b(android.app.Activity activity, com.json.mj mjVar, java.util.Map<java.lang.String, java.lang.String> map) {
        this.g.a(activity);
        a(mjVar, map);
    }

    @Override // com.json.yj
    public void b(com.json.mj mjVar) {
        com.json.sdk.utils.Logger.d(m, "destroyInstance " + mjVar.e());
        if (c(mjVar)) {
            this.j.a(com.json.k1.DESTROYED, mjVar.e());
            this.i.a(new com.json.ss(this.k.a(mjVar.e())));
        }
        this.f3204a.a(new com.ironsource.qj.h(mjVar));
    }

    @Override // com.json.p9
    public void b(com.ironsource.zg.e eVar, java.lang.String str) {
        com.json.mo moVarC;
        com.json.sa saVarD = d(eVar, str);
        if (saVarD != null) {
            if (eVar == com.ironsource.zg.e.Interstitial) {
                com.json.ho hoVarB = b(saVarD);
                if (hoVarB != null) {
                    hoVarB.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != com.ironsource.zg.e.RewardedVideo || (moVarC = c(saVarD)) == null) {
                return;
            }
            moVarC.a();
        }
    }

    @Override // com.json.r9
    public void b(java.lang.String str) {
        com.json.sa saVarD = d(com.ironsource.zg.e.Interstitial, str);
        if (saVarD != null) {
            com.json.mj mjVarC = saVarD.c();
            this.j.a(com.json.k1.SHOW_SUCCESS, mjVarC.e());
            if (c(mjVarC)) {
                this.i.a(new com.json.ws(this.k.a(mjVarC.e())));
            }
            com.json.ho hoVarB = b(saVarD);
            if (hoVarB != null) {
                hoVarB.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.json.r9
    public void b(java.lang.String str, java.lang.String str2) {
        com.json.sa saVarD = d(com.ironsource.zg.e.Interstitial, str);
        if (saVarD != null) {
            com.json.mj mjVarC = saVarD.c();
            this.j.a(com.json.k1.SHOW_FAIL, mjVarC.e());
            if (c(mjVarC)) {
                this.i.a(new com.json.vs(this.k.a(mjVarC.e())));
            }
            com.json.ho hoVarB = b(saVarD);
            if (hoVarB != null) {
                hoVarB.onInterstitialShowFailed(str2);
            }
        }
    }

    @Override // com.json.cr
    public void b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        java.lang.String strOptString = jSONObject.optString("demandSourceName");
        if (android.text.TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f3204a.a(new com.ironsource.qj.d(strOptString));
    }

    @Override // com.json.ko
    public void c(android.app.Activity activity) {
        this.g.a(activity);
        this.f3204a.f();
        this.f3204a.b(activity);
    }

    @Override // com.json.p9
    public void c(com.ironsource.zg.e eVar, java.lang.String str) {
        com.json.fo foVarA;
        com.json.sa saVarD = d(eVar, str);
        if (saVarD != null) {
            if (eVar == com.ironsource.zg.e.RewardedVideo) {
                com.json.mo moVarC = c(saVarD);
                if (moVarC != null) {
                    moVarC.d();
                    return;
                }
                return;
            }
            if (eVar == com.ironsource.zg.e.Interstitial) {
                com.json.ho hoVarB = b(saVarD);
                if (hoVarB != null) {
                    hoVarB.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != com.ironsource.zg.e.Banner || (foVarA = a(saVarD)) == null) {
                return;
            }
            foVarA.onBannerClick();
        }
    }

    @Override // com.json.s9
    public void c(java.lang.String str) {
        com.json.mo moVarC;
        com.json.sa saVarD = d(com.ironsource.zg.e.RewardedVideo, str);
        if (saVarD == null || (moVarC = c(saVarD)) == null) {
            return;
        }
        moVarC.b();
    }

    @Override // com.json.r9
    public void c(java.lang.String str, java.lang.String str2) {
        com.ironsource.zg.e eVar = com.ironsource.zg.e.Interstitial;
        com.json.sa saVarD = d(eVar, str);
        com.json.bh bhVar = new com.json.bh();
        bhVar.a(com.json.zb.A, str2).a(com.json.zb.v, str);
        if (saVarD != null) {
            com.json.bh bhVarA = bhVar.a(com.json.zb.w, com.json.hh.a(saVarD, eVar)).a(com.json.zb.y, saVarD.e() == 2 ? com.json.zb.E : com.json.zb.F).a(com.json.zb.x, java.lang.Boolean.valueOf(com.json.hh.a(saVarD)));
            com.json.j0 j0Var = com.json.j0.f2778a;
            bhVarA.a(com.json.zb.I, java.lang.Long.valueOf(j0Var.b(saVarD.h())));
            j0Var.a(saVarD.h());
            com.json.ho hoVarB = b(saVarD);
            if (hoVarB != null) {
                hoVarB.onInterstitialLoadFailed(str2);
            }
        }
        com.json.gh.a(com.json.ar.g, bhVar.a());
    }

    @Override // com.json.cr
    public void c(org.json.JSONObject jSONObject) {
        this.f3204a.a(new com.ironsource.qj.e(jSONObject));
    }

    public boolean c(com.json.mj mjVar) {
        return mjVar.l() && !mjVar.i() && a(mjVar);
    }

    @Override // com.json.s9
    public void d(java.lang.String str, java.lang.String str2) {
        com.json.mo moVarC;
        com.json.sa saVarD = d(com.ironsource.zg.e.RewardedVideo, str);
        if (saVarD == null || (moVarC = c(saVarD)) == null) {
            return;
        }
        moVarC.a(str2);
    }

    @Override // com.json.r9
    public void onInterstitialAdRewarded(java.lang.String str, int i) {
        com.json.sa saVarD = d(com.ironsource.zg.e.Interstitial, str);
        com.json.ho hoVarB = b(saVarD);
        if (saVarD == null || hoVarB == null) {
            return;
        }
        hoVarB.onInterstitialAdRewarded(str, i);
    }

    @Override // com.json.cr, com.json.wj
    public void onPause(android.app.Activity activity) {
        if (this.f) {
            return;
        }
        b(activity);
    }

    @Override // com.json.cr, com.json.wj
    public void onResume(android.app.Activity activity) {
        if (this.f) {
            return;
        }
        c(activity);
    }
}
