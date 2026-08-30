package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class wm extends com.applovin.impl.yl {
    private static final java.util.concurrent.atomic.AtomicBoolean z = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.lang.String h;
    private final com.applovin.mediation.MaxAdFormat i;
    private final org.json.JSONObject j;
    private final com.applovin.impl.mediation.ads.a.InterfaceC0040a k;
    private final java.lang.ref.WeakReference l;
    private final java.lang.String m;
    private final java.util.Queue n;
    private final java.lang.Object o;
    private final java.util.Queue p;
    private final java.lang.Object q;
    private final int r;
    private long s;
    private final java.util.List t;
    private final java.util.concurrent.atomic.AtomicBoolean u;
    private final java.util.concurrent.atomic.AtomicBoolean v;
    private final java.util.concurrent.atomic.AtomicBoolean w;
    private com.applovin.impl.fe x;
    private com.applovin.impl.go y;

    private enum c {
        BIDDING,
        TAG
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl;
        this.s = android.os.SystemClock.elapsedRealtime();
        if (this.j.optBoolean("is_testing", false) && !this.f1547a.k0().c() && z.compareAndSet(false, true)) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.wm$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e();
                }
            });
        }
        if (this.r != 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Starting waterfall for " + this.i.getLabel() + " ad unit " + this.h + " with " + this.r + " ad(s)...");
            }
            d(com.applovin.impl.wm.c.TAG);
            d(com.applovin.impl.wm.c.BIDDING);
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
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.applovin.impl.wm$$ExternalSyntheticLambda1
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

    public wm(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.util.Map map, org.json.JSONObject jSONObject, android.content.Context context, com.applovin.impl.sdk.j jVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        super("TaskProcessMediationWaterfallV2", jVar, str);
        this.n = new java.util.LinkedList();
        this.o = new java.lang.Object();
        this.p = new java.util.LinkedList();
        this.q = new java.lang.Object();
        this.u = new java.util.concurrent.atomic.AtomicBoolean();
        this.v = new java.util.concurrent.atomic.AtomicBoolean();
        this.w = new java.util.concurrent.atomic.AtomicBoolean();
        this.h = str;
        this.i = maxAdFormat;
        this.j = jSONObject;
        this.k = interfaceC0040a;
        this.l = new java.lang.ref.WeakReference(context);
        this.m = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "mCode", "");
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "ads", new org.json.JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            com.applovin.impl.fe feVarA = com.applovin.impl.fe.a(i, map, com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null), jSONObject, jVar);
            if (feVarA.X()) {
                this.p.add(feVarA);
            } else {
                this.n.add(feVarA);
            }
        }
        int size = this.n.size() + this.p.size();
        this.r = size;
        this.t = new java.util.ArrayList(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        com.applovin.impl.yp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f1547a.m0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(com.applovin.impl.wm.c cVar) {
        com.applovin.impl.fe feVarA = a(cVar);
        if (feVarA == null) {
            b(cVar);
            return false;
        }
        this.f1547a.i0().a((com.applovin.impl.yl) new com.applovin.impl.wm.b(feVarA, cVar), com.applovin.impl.tm.b.MEDIATION);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.applovin.impl.fe c(com.applovin.impl.wm.c cVar) {
        return a(cVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b extends com.applovin.impl.yl {
        private final java.lang.String h;
        private final long i;
        private final com.applovin.impl.fe j;
        private final com.applovin.impl.wm.c k;
        private final int l;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(java.lang.String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.h, "Loading ad " + this.l + " of " + com.applovin.impl.wm.this.r + " from " + this.j.c() + " for " + com.applovin.impl.wm.this.i + " ad unit " + com.applovin.impl.wm.this.h);
            }
            b("started to load ad");
            android.content.Context context = (android.content.Context) com.applovin.impl.wm.this.l.get();
            android.app.Activity activityM0 = context instanceof android.app.Activity ? (android.app.Activity) context : this.f1547a.m0();
            this.f1547a.S().b(this.j);
            this.f1547a.P().loadThirdPartyMediatedAd(com.applovin.impl.wm.this.h, this.j, activityM0, new com.applovin.impl.wm.b.a(com.applovin.impl.wm.this.k));
        }

        private b(com.applovin.impl.fe feVar, com.applovin.impl.wm.c cVar) {
            super(com.applovin.impl.wm.this.b, com.applovin.impl.wm.this.f1547a, com.applovin.impl.wm.this.h);
            this.h = this.b + ":" + cVar;
            this.i = android.os.SystemClock.elapsedRealtime();
            this.j = feVar;
            this.k = cVar;
            this.l = feVar.J() + 1;
        }

        class a extends com.applovin.impl.ne {
            a(com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
                super(interfaceC0040a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(com.applovin.mediation.MaxAd maxAd) {
                boolean z;
                long jE;
                com.applovin.impl.fe feVar;
                com.applovin.impl.wm.b.this.b("loaded ad");
                com.applovin.impl.fe feVar2 = (com.applovin.impl.fe) maxAd;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - com.applovin.impl.wm.b.this.i;
                com.applovin.impl.sdk.n unused = com.applovin.impl.wm.b.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.wm.b.this.c.a(com.applovin.impl.wm.b.this.h, "Ad (" + com.applovin.impl.wm.b.this.l + ") loaded in " + jElapsedRealtime + "ms for " + com.applovin.impl.wm.this.i + " ad unit " + com.applovin.impl.wm.this.h);
                }
                com.applovin.impl.wm.this.a(feVar2, com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                com.applovin.impl.wm.b bVar = com.applovin.impl.wm.b.this;
                com.applovin.impl.wm.this.b(bVar.k);
                if (com.applovin.impl.wm.c.BIDDING == com.applovin.impl.wm.b.this.k) {
                    z = com.applovin.impl.wm.this.v.get();
                    jE = feVar2.S();
                } else {
                    z = com.applovin.impl.wm.this.u.get();
                    jE = feVar2.E();
                }
                if (!z && jE != 0) {
                    com.applovin.impl.wm.this.x = feVar2;
                    if (jE < 0) {
                        return;
                    }
                    com.applovin.impl.wm.b bVar2 = com.applovin.impl.wm.b.this;
                    com.applovin.impl.wm.this.y = com.applovin.impl.go.a(jE, bVar2.f1547a, new java.lang.Runnable() { // from class: com.applovin.impl.wm$b$a$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a();
                        }
                    });
                    return;
                }
                if (com.applovin.impl.wm.b.this.b(feVar2)) {
                    feVar = feVar2;
                    feVar2 = com.applovin.impl.wm.this.x;
                } else {
                    feVar = com.applovin.impl.wm.this.x;
                }
                com.applovin.impl.wm.this.a(feVar2, feVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void a() {
                com.applovin.impl.wm wmVar = com.applovin.impl.wm.this;
                wmVar.b(wmVar.x);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - com.applovin.impl.wm.b.this.i;
                com.applovin.impl.sdk.n unused = com.applovin.impl.wm.b.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.wm.b.this.c.a(com.applovin.impl.wm.b.this.h, "Ad (" + com.applovin.impl.wm.b.this.l + ") failed to load in " + jElapsedRealtime + "ms for " + com.applovin.impl.wm.this.i + " ad unit " + str + " with error: " + maxError);
                }
                com.applovin.impl.wm.b.this.b("failed to load ad: " + maxError.getCode());
                com.applovin.impl.wm.b bVar = com.applovin.impl.wm.b.this;
                com.applovin.impl.wm.this.a(bVar.j, com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (com.applovin.impl.wm.this.w.get()) {
                    return;
                }
                if (com.applovin.impl.wm.this.x != null) {
                    com.applovin.impl.wm.b bVar2 = com.applovin.impl.wm.b.this;
                    if (com.applovin.impl.wm.b.this.b(com.applovin.impl.wm.this.c(bVar2.k))) {
                        com.applovin.impl.wm wmVar = com.applovin.impl.wm.this;
                        wmVar.b(wmVar.x);
                        return;
                    }
                }
                com.applovin.impl.wm.b bVar3 = com.applovin.impl.wm.b.this;
                if ((!com.applovin.impl.wm.this.d(bVar3.k)) && com.applovin.impl.wm.this.v.get() && com.applovin.impl.wm.this.u.get()) {
                    com.applovin.impl.wm.this.b(new com.applovin.impl.mediation.MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(com.applovin.impl.fe feVar) {
            if (com.applovin.impl.wm.this.x == null) {
                return false;
            }
            if (feVar == null) {
                return true;
            }
            double dN = com.applovin.impl.wm.this.x.N();
            double dN2 = feVar.N();
            if (dN < 0.0d || dN2 < 0.0d) {
                return com.applovin.impl.wm.this.x.J() < feVar.J();
            }
            return dN > dN2;
        }
    }

    private void g() {
        a(this.n);
        a(this.p);
    }

    private void f() {
        com.applovin.impl.go goVar = this.y;
        if (goVar == null) {
            return;
        }
        goVar.a();
        this.y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.fe feVar) {
        a(feVar, (com.applovin.impl.fe) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.wm.c cVar) {
        if (com.applovin.impl.wm.c.BIDDING == cVar) {
            this.u.compareAndSet(false, true);
        } else if (com.applovin.impl.wm.c.TAG == cVar) {
            this.v.compareAndSet(false, true);
        }
    }

    private com.applovin.impl.fe a(com.applovin.impl.wm.c cVar) {
        return a(cVar, false);
    }

    private com.applovin.impl.fe a(com.applovin.impl.wm.c cVar, boolean z2) {
        java.lang.Object objPoll;
        com.applovin.impl.fe feVar;
        java.lang.Object objPoll2;
        com.applovin.impl.fe feVar2;
        if (cVar == com.applovin.impl.wm.c.BIDDING) {
            synchronized (this.q) {
                try {
                    if (z2) {
                        objPoll2 = this.p.peek();
                    } else {
                        objPoll2 = this.p.poll();
                    }
                    feVar2 = (com.applovin.impl.fe) objPoll2;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return feVar2;
        }
        synchronized (this.o) {
            try {
                if (z2) {
                    objPoll = this.n.peek();
                } else {
                    objPoll = this.n.poll();
                }
                feVar = (com.applovin.impl.fe) objPoll;
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        return feVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.fe feVar, com.applovin.impl.fe feVar2) {
        if (this.w.compareAndSet(false, true)) {
            f();
            g();
            this.f1547a.S().a(feVar, feVar2);
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.s;
            if (com.applovin.impl.sdk.n.a()) {
                this.c.d(this.b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + feVar.c() + " for " + this.i + " ad unit " + this.h);
            }
            feVar.a(new com.applovin.impl.mediation.MaxAdWaterfallInfoImpl(feVar, jElapsedRealtime, this.t, this.m));
            com.applovin.impl.fc.f(this.k, feVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(com.applovin.mediation.MaxError maxError) {
        int i = 0;
        if (this.w.compareAndSet(false, true)) {
            if (maxError.getCode() == 204) {
                this.f1547a.C().c(com.applovin.impl.ba.u);
            } else if (maxError.getCode() == -5001) {
                this.f1547a.C().c(com.applovin.impl.ba.v);
            } else {
                this.f1547a.C().c(com.applovin.impl.ba.w);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.t.size());
            for (com.applovin.mediation.MaxNetworkResponseInfo maxNetworkResponseInfo : this.t) {
                if (maxNetworkResponseInfo.getAdLoadState() == com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                    arrayList.add(maxNetworkResponseInfo);
                }
            }
            if (arrayList.size() > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("======FAILED AD LOADS======\n");
                while (i < arrayList.size()) {
                    com.applovin.mediation.MaxNetworkResponseInfo maxNetworkResponseInfo2 = (com.applovin.mediation.MaxNetworkResponseInfo) arrayList.get(i);
                    i++;
                    sb.append(i).append(") ").append(maxNetworkResponseInfo2.getMediatedNetwork().getName()).append("\n..code: ").append(maxNetworkResponseInfo2.getError().getCode()).append("\n..message: ").append(maxNetworkResponseInfo2.getError().getMessage()).append("\n");
                }
                ((com.applovin.impl.mediation.MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
            }
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.s;
            if (com.applovin.impl.sdk.n.a()) {
                this.c.d(this.b, "Waterfall failed in " + jElapsedRealtime + "ms for " + this.i + " ad unit " + this.h + " with error: " + maxError);
            }
            ((com.applovin.impl.mediation.MaxErrorImpl) maxError).setWaterfall(new com.applovin.impl.mediation.MaxAdWaterfallInfoImpl(null, com.applovin.impl.sdk.utils.JsonUtils.getString(this.j, "waterfall_name", ""), com.applovin.impl.sdk.utils.JsonUtils.getString(this.j, "waterfall_test_name", ""), jElapsedRealtime, this.t, com.applovin.impl.sdk.utils.JsonUtils.optList(com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(this.j, "mwf_info_urls", null), java.util.Collections.EMPTY_LIST), this.m));
            com.applovin.impl.fc.a(this.k, this.h, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.fe feVar, com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState adLoadState, long j, com.applovin.mediation.MaxError maxError) {
        this.t.add(new com.applovin.impl.mediation.MaxNetworkResponseInfoImpl(adLoadState, com.applovin.impl.ze.a(feVar.b()), feVar.F(), feVar.X(), j, feVar.B(), maxError));
    }

    private void a(java.util.Queue queue) {
        java.util.Iterator it = queue.iterator();
        while (it.hasNext()) {
            a((com.applovin.impl.fe) it.next(), com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
        }
    }
}
