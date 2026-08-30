package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class xm extends com.applovin.impl.yl {
    private static final java.util.concurrent.atomic.AtomicBoolean q = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.lang.String h;
    private final com.applovin.mediation.MaxAdFormat i;
    private final org.json.JSONObject j;
    private final java.util.List k;
    private final com.applovin.impl.mediation.ads.a.InterfaceC0040a l;
    private final java.lang.ref.WeakReference m;
    private final java.lang.String n;
    private long o;
    private final java.util.List p;

    @Override // java.lang.Runnable
    public void run() {
        final com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl;
        this.o = android.os.SystemClock.elapsedRealtime();
        int i = 0;
        if (this.j.optBoolean("is_testing", false) && !this.f1547a.k0().c() && q.compareAndSet(false, true)) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.xm$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e();
                }
            });
        }
        if (this.k.size() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Starting waterfall for " + this.i.getLabel() + " ad unit " + this.h + " with " + this.k.size() + " ad(s)...");
            }
            this.f1547a.i0().a(new com.applovin.impl.xm.b(i, this.k));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.k(this.b, "No ads were returned from the server for " + this.i.getLabel() + " ad unit " + this.h);
        }
        com.applovin.impl.yp.a(this.h, this.i, this.j, this.f1547a);
        org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(this.j, "settings", new org.json.JSONObject());
        long j = com.applovin.impl.sdk.utils.JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (com.applovin.impl.ze.a(this.j, this.h, this.f1547a)) {
            maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(com.applovin.mediation.MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + this.h + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (com.applovin.impl.yp.c(this.f1547a) && ((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.g6)).booleanValue()) {
                j = 0;
            }
        } else {
            maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(j);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.applovin.impl.xm$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(maxErrorImpl);
            }
        };
        if (com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, "alfdcs_iba", java.lang.Boolean.FALSE).booleanValue()) {
            com.applovin.impl.x1.a(millis, this.f1547a, runnable);
        } else {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }

    xm(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.util.Map map, org.json.JSONObject jSONObject, android.content.Context context, com.applovin.impl.sdk.j jVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        super("TaskProcessMediationWaterfall", jVar, str);
        this.h = str;
        this.i = maxAdFormat;
        this.j = jSONObject;
        this.l = interfaceC0040a;
        this.m = new java.lang.ref.WeakReference(context);
        this.n = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "mcode", "");
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "ads", new org.json.JSONArray());
        this.k = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.k.add(com.applovin.impl.fe.a(i, map, com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null), jSONObject, jVar));
        }
        this.p = new java.util.ArrayList(this.k.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        com.applovin.impl.yp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f1547a.m0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.fe feVar) {
        this.f1547a.S().c(feVar);
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.o;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d(this.b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + feVar.c() + " for " + this.i.getLabel() + " ad unit " + this.h);
        }
        feVar.a(new com.applovin.impl.mediation.MaxAdWaterfallInfoImpl(feVar, jElapsedRealtime, this.p, this.n));
        com.applovin.impl.fc.f(this.l, feVar);
    }

    private class b extends com.applovin.impl.yl {
        private final long h;
        private final int i;
        private final com.applovin.impl.fe j;
        private final java.util.List k;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(java.lang.String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Loading ad " + (this.i + 1) + " of " + this.k.size() + " from " + this.j.c() + " for " + com.applovin.impl.xm.this.i.getLabel() + " ad unit " + com.applovin.impl.xm.this.h);
            }
            b("started to load ad");
            android.content.Context context = (android.content.Context) com.applovin.impl.xm.this.m.get();
            android.app.Activity activityM0 = context instanceof android.app.Activity ? (android.app.Activity) context : this.f1547a.m0();
            this.f1547a.S().b(this.j);
            this.f1547a.P().loadThirdPartyMediatedAd(com.applovin.impl.xm.this.h, this.j, activityM0, new com.applovin.impl.xm.b.a(com.applovin.impl.xm.this.l));
        }

        private b(int i, java.util.List list) {
            super(com.applovin.impl.xm.this.b, com.applovin.impl.xm.this.f1547a, com.applovin.impl.xm.this.h);
            this.h = android.os.SystemClock.elapsedRealtime();
            this.i = i;
            this.j = (com.applovin.impl.fe) list.get(i);
            this.k = list;
        }

        class a extends com.applovin.impl.ne {
            a(com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
                super(interfaceC0040a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(com.applovin.mediation.MaxAd maxAd) {
                com.applovin.impl.xm.b.this.b("loaded ad");
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - com.applovin.impl.xm.b.this.h;
                com.applovin.impl.sdk.n unused = com.applovin.impl.xm.b.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.xm.b.this.c.a(com.applovin.impl.xm.b.this.b, "Ad loaded in " + jElapsedRealtime + "ms for " + com.applovin.impl.xm.this.i.getLabel() + " ad unit " + com.applovin.impl.xm.this.h);
                }
                com.applovin.impl.fe feVar = (com.applovin.impl.fe) maxAd;
                com.applovin.impl.xm.b.this.a(feVar, com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i = com.applovin.impl.xm.b.this.i;
                while (true) {
                    i++;
                    if (i >= com.applovin.impl.xm.b.this.k.size()) {
                        com.applovin.impl.xm.this.b(feVar);
                        return;
                    } else {
                        com.applovin.impl.xm.b bVar = com.applovin.impl.xm.b.this;
                        bVar.a((com.applovin.impl.fe) bVar.k.get(i), com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - com.applovin.impl.xm.b.this.h;
                com.applovin.impl.sdk.n unused = com.applovin.impl.xm.b.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.xm.b.this.c.a(com.applovin.impl.xm.b.this.b, "Ad failed to load in " + jElapsedRealtime + " ms for " + com.applovin.impl.xm.this.i.getLabel() + " ad unit " + com.applovin.impl.xm.this.h + " with error: " + maxError);
                }
                com.applovin.impl.xm.b.this.b("failed to load ad: " + maxError.getCode());
                com.applovin.impl.xm.b bVar = com.applovin.impl.xm.b.this;
                bVar.a(bVar.j, com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (com.applovin.impl.xm.b.this.i < com.applovin.impl.xm.b.this.k.size() - 1) {
                    com.applovin.impl.xm.b bVar2 = com.applovin.impl.xm.b.this;
                    com.applovin.impl.xm.b.this.f1547a.i0().a((com.applovin.impl.yl) new com.applovin.impl.xm.b(bVar2.i + 1, com.applovin.impl.xm.b.this.k), com.applovin.impl.tm.b.MEDIATION);
                } else {
                    com.applovin.impl.xm.this.b(new com.applovin.impl.mediation.MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.fe feVar, com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState adLoadState, long j, com.applovin.mediation.MaxError maxError) {
            com.applovin.impl.xm.this.p.add(new com.applovin.impl.mediation.MaxNetworkResponseInfoImpl(adLoadState, com.applovin.impl.ze.a(feVar.b()), feVar.F(), feVar.X(), j, feVar.B(), maxError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(com.applovin.mediation.MaxError maxError) {
        if (maxError.getCode() == 204) {
            this.f1547a.C().c(com.applovin.impl.ba.u);
        } else if (maxError.getCode() == -5001) {
            this.f1547a.C().c(com.applovin.impl.ba.v);
        } else {
            this.f1547a.C().c(com.applovin.impl.ba.w);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.p.size());
        for (com.applovin.mediation.MaxNetworkResponseInfo maxNetworkResponseInfo : this.p) {
            if (maxNetworkResponseInfo.getAdLoadState() == com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("======FAILED AD LOADS======\n");
            int i = 0;
            while (i < arrayList.size()) {
                com.applovin.mediation.MaxNetworkResponseInfo maxNetworkResponseInfo2 = (com.applovin.mediation.MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i).append(") ").append(maxNetworkResponseInfo2.getMediatedNetwork().getName()).append("\n..code: ").append(maxNetworkResponseInfo2.getError().getCode()).append("\n..message: ").append(maxNetworkResponseInfo2.getError().getMessage()).append("\n");
            }
            ((com.applovin.impl.mediation.MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.o;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d(this.b, "Waterfall failed in " + jElapsedRealtime + "ms for " + this.i.getLabel() + " ad unit " + this.h + " with error: " + maxError);
        }
        ((com.applovin.impl.mediation.MaxErrorImpl) maxError).setWaterfall(new com.applovin.impl.mediation.MaxAdWaterfallInfoImpl(null, com.applovin.impl.sdk.utils.JsonUtils.getString(this.j, "waterfall_name", ""), com.applovin.impl.sdk.utils.JsonUtils.getString(this.j, "waterfall_test_name", ""), jElapsedRealtime, this.p, com.applovin.impl.sdk.utils.JsonUtils.optList(com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(this.j, "mwf_info_urls", null), java.util.Collections.EMPTY_LIST), this.n));
        com.applovin.impl.fc.a(this.l, this.h, maxError);
    }
}
