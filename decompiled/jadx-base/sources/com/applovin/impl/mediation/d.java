package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1051a;
    private final java.util.Map b = new java.util.HashMap(4);
    private final java.lang.Object c = new java.lang.Object();
    private final java.util.Map d = new java.util.HashMap(4);
    private final java.lang.Object e = new java.lang.Object();
    private final java.util.Map f = new java.util.HashMap();
    private final java.lang.Object g = new java.lang.Object();

    class a implements com.applovin.impl.fm.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f1052a;
        final /* synthetic */ java.util.Map b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ com.applovin.mediation.MaxAdFormat d;
        final /* synthetic */ java.util.Map e;
        final /* synthetic */ java.util.Map f;
        final /* synthetic */ android.content.Context g;
        final /* synthetic */ com.applovin.impl.mediation.ads.a.InterfaceC0040a h;

        a(long j, java.util.Map map, java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.util.Map map2, java.util.Map map3, android.content.Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
            this.f1052a = j;
            this.b = map;
            this.c = str;
            this.d = maxAdFormat;
            this.e = map2;
            this.f = map3;
            this.g = context;
            this.h = interfaceC0040a;
        }

        @Override // com.applovin.impl.fm.b
        public void a(org.json.JSONArray jSONArray) {
            this.b.put("sct_ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f1052a));
            this.b.put("calfc", java.lang.Integer.valueOf(com.applovin.impl.mediation.d.this.b(this.c)));
            com.applovin.impl.lm lmVar = new com.applovin.impl.lm(this.c, this.d, this.e, this.f, this.b, jSONArray, this.g, com.applovin.impl.mediation.d.this.f1051a, this.h);
            if (((java.lang.Boolean) com.applovin.impl.mediation.d.this.f1051a.a(com.applovin.impl.ue.E7)).booleanValue()) {
                com.applovin.impl.mediation.d.this.f1051a.i0().a((com.applovin.impl.yl) lmVar, com.applovin.impl.tm.b.MEDIATION);
            } else {
                com.applovin.impl.mediation.d.this.f1051a.i0().a(lmVar);
            }
        }
    }

    public enum b {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH("refresh"),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1053a;

        b(java.lang.String str) {
            this.f1053a = str;
        }

        public java.lang.String b() {
            return this.f1053a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements com.applovin.impl.mediation.ads.a.InterfaceC0040a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.j f1054a;
        private final java.lang.ref.WeakReference b;
        private final com.applovin.impl.mediation.d c;
        private final com.applovin.impl.mediation.d.C0041d d;
        private final com.applovin.mediation.MaxAdFormat f;
        private final java.util.Map g;
        private final java.util.Map h;
        private final java.util.Map i;
        private final int j;
        private long k;
        private long l;

        /* synthetic */ c(java.util.Map map, java.util.Map map2, java.util.Map map3, com.applovin.impl.mediation.d.C0041d c0041d, com.applovin.mediation.MaxAdFormat maxAdFormat, long j, long j2, com.applovin.impl.mediation.d dVar, com.applovin.impl.sdk.j jVar, android.content.Context context, com.applovin.impl.mediation.d.a aVar) {
            this(map, map2, map3, c0041d, maxAdFormat, j, j2, dVar, jVar, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, java.lang.String str) {
            this.h.put("retry_delay_sec", java.lang.Integer.valueOf(i));
            this.h.put("retry_attempt", java.lang.Integer.valueOf(this.d.d));
            android.content.Context contextM = (android.content.Context) this.b.get();
            if (contextM == null) {
                contextM = com.applovin.impl.sdk.j.m();
            }
            this.i.put("art", com.applovin.impl.mediation.d.b.EXPONENTIAL_RETRY.b());
            this.i.put("era", java.lang.Integer.valueOf(this.d.d));
            this.l = java.lang.System.currentTimeMillis();
            this.c.a(str, this.f, this.g, this.h, this.i, contextM, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(com.applovin.mediation.MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(com.applovin.mediation.MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(com.applovin.mediation.MaxAd maxAd) {
            throw new java.lang.IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final java.lang.String str, com.applovin.mediation.MaxError maxError) {
            this.c.c(str);
            if (((java.lang.Boolean) this.f1054a.a(com.applovin.impl.ue.v7)).booleanValue() && this.d.c.get()) {
                this.f1054a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1054a.I().a("MediationAdLoadManager", "Ad failed to load but its load state was destroyed");
                    return;
                }
                return;
            }
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.k;
            com.applovin.impl.mediation.MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (com.applovin.impl.mediation.MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f1054a.P().processWaterfallInfoPostback(str, this.f, maxAdWaterfallInfoImpl, maxError, this.l, jElapsedRealtime);
            }
            boolean z = maxError.getCode() == -5603 && com.applovin.impl.yp.c(this.f1054a) && ((java.lang.Boolean) this.f1054a.a(com.applovin.impl.sj.g6)).booleanValue();
            if (this.f1054a.a(com.applovin.impl.ue.u7, this.f) && this.d.d < this.j && !z) {
                com.applovin.impl.mediation.d.C0041d.f(this.d);
                final int iPow = (int) java.lang.Math.pow(2.0d, this.d.d);
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.d$c$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(iPow, str);
                    }
                }, java.util.concurrent.TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.d.d = 0;
            this.d.b.set(false);
            if (this.d.e != null) {
                com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl = (com.applovin.impl.mediation.MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.d.f1055a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                com.applovin.impl.fc.a(this.d.e, str, maxError);
                this.d.e = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(com.applovin.mediation.MaxAd maxAd) {
            if (((java.lang.Boolean) this.f1054a.a(com.applovin.impl.ue.v7)).booleanValue() && this.d.c.get()) {
                this.f1054a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1054a.I().a("MediationAdLoadManager", "Ad loaded but its load state was destroyed");
                }
                this.f1054a.P().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.fe feVar = (com.applovin.impl.fe) maxAd;
            feVar.i(this.d.f1055a);
            feVar.a(android.os.SystemClock.elapsedRealtime() - this.k);
            com.applovin.impl.mediation.MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (com.applovin.impl.mediation.MaxAdWaterfallInfoImpl) feVar.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f1054a.P().processWaterfallInfoPostback(feVar.getAdUnitId(), this.f, maxAdWaterfallInfoImpl, null, this.l, feVar.getRequestLatencyMillis());
            }
            this.c.a(maxAd.getAdUnitId());
            this.d.d = 0;
            if (this.d.e == null) {
                this.c.a(feVar);
                this.d.b.set(false);
                return;
            }
            feVar.A().c().a(this.d.e);
            this.d.e.onAdLoaded(feVar);
            if (feVar.P().endsWith("load")) {
                this.d.e.onAdRevenuePaid(feVar);
            }
            this.d.e = null;
            if ((!this.f1054a.c(com.applovin.impl.ue.s7).contains(maxAd.getAdUnitId()) && !this.f1054a.a(com.applovin.impl.ue.r7, maxAd.getFormat())) || this.f1054a.k0().c() || this.f1054a.k0().d()) {
                this.d.b.set(false);
                return;
            }
            android.content.Context contextM = (android.content.Context) this.b.get();
            if (contextM == null) {
                contextM = com.applovin.impl.sdk.j.m();
            }
            this.k = android.os.SystemClock.elapsedRealtime();
            this.l = java.lang.System.currentTimeMillis();
            this.i.put("art", com.applovin.impl.mediation.d.b.SEQUENTIAL_OR_PRECACHE.b());
            this.c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.g, this.h, this.i, contextM, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(java.lang.String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
        }

        private c(java.util.Map map, java.util.Map map2, java.util.Map map3, com.applovin.impl.mediation.d.C0041d c0041d, com.applovin.mediation.MaxAdFormat maxAdFormat, long j, long j2, com.applovin.impl.mediation.d dVar, com.applovin.impl.sdk.j jVar, android.content.Context context) {
            this.f1054a = jVar;
            this.b = new java.lang.ref.WeakReference(context);
            this.c = dVar;
            this.d = c0041d;
            this.f = maxAdFormat;
            this.h = map2;
            this.g = map;
            this.i = map3;
            this.k = j;
            this.l = j2;
            if (com.applovin.impl.sdk.utils.CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.j = -1;
            } else if (maxAdFormat.isAdViewAd() && com.applovin.impl.sdk.utils.CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.j = java.lang.Math.min(2, ((java.lang.Integer) jVar.a(com.applovin.impl.ue.t7)).intValue());
            } else {
                this.j = ((java.lang.Integer) jVar.a(com.applovin.impl.ue.t7)).intValue();
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.d$d, reason: collision with other inner class name */
    private static class C0041d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1055a;
        private final java.util.concurrent.atomic.AtomicBoolean b;
        private final java.util.concurrent.atomic.AtomicBoolean c;
        private int d;
        private volatile com.applovin.impl.mediation.ads.a.InterfaceC0040a e;

        /* synthetic */ C0041d(java.lang.String str, com.applovin.impl.mediation.d.a aVar) {
            this(str);
        }

        static /* synthetic */ int f(com.applovin.impl.mediation.d.C0041d c0041d) {
            int i = c0041d.d;
            c0041d.d = i + 1;
            return i;
        }

        private C0041d(java.lang.String str) {
            this.b = new java.util.concurrent.atomic.AtomicBoolean();
            this.c = new java.util.concurrent.atomic.AtomicBoolean();
            this.f1055a = str;
        }
    }

    public d(com.applovin.impl.sdk.j jVar) {
        this.f1051a = jVar;
    }

    private java.lang.String b(java.lang.String str, java.lang.String str2) {
        return str + (str2 != null ? "-" + str2 : "");
    }

    public void c(java.lang.String str, java.lang.String str2) {
        synchronized (this.c) {
            java.lang.String strB = b(str, str2);
            a(str, str2).c.set(true);
            this.b.remove(strB);
        }
    }

    public boolean d(java.lang.String str) {
        boolean z;
        synchronized (this.e) {
            z = this.d.get(str) != null;
        }
        return z;
    }

    public int b(java.lang.String str) {
        int iIntValue;
        synchronized (this.g) {
            java.lang.Integer num = (java.lang.Integer) this.f.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    public void c(java.lang.String str) {
        synchronized (this.g) {
            this.f1051a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1051a.I().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            java.lang.Integer num = (java.lang.Integer) this.f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        }
    }

    private com.applovin.impl.fe e(java.lang.String str) {
        com.applovin.impl.fe feVar;
        synchronized (this.e) {
            feVar = (com.applovin.impl.fe) this.d.get(str);
            this.d.remove(str);
        }
        return feVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.fe feVar) {
        synchronized (this.e) {
            if (this.d.containsKey(feVar.getAdUnitId())) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Ad in cache already: " + feVar.getAdUnitId());
            }
            this.d.put(feVar.getAdUnitId(), feVar);
        }
    }

    public void a(java.lang.String str, java.lang.String str2, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.mediation.d.b bVar, java.util.Map map, java.util.Map map2, android.content.Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        com.applovin.impl.fe feVarE = (this.f1051a.k0().d() || com.applovin.impl.yp.f(com.applovin.impl.sdk.j.m())) ? null : e(str);
        if (feVarE != null) {
            feVarE.i(str2);
            feVarE.A().c().a(interfaceC0040a);
            interfaceC0040a.onAdLoaded(feVarE);
            if (feVarE.P().endsWith("load")) {
                interfaceC0040a.onAdRevenuePaid(feVarE);
            }
        }
        com.applovin.impl.mediation.d.C0041d c0041dA = a(str, str2);
        if (!c0041dA.b.compareAndSet(false, true)) {
            if (c0041dA.e != null && c0041dA.e != interfaceC0040a) {
                com.applovin.impl.sdk.n.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            c0041dA.e = interfaceC0040a;
            return;
        }
        if (feVarE == null) {
            c0041dA.e = interfaceC0040a;
        }
        java.util.Map mapSynchronizedMap = java.util.Collections.synchronizedMap(new java.util.HashMap());
        mapSynchronizedMap.put("art", bVar.b());
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new com.applovin.impl.mediation.d.c(map, map2, mapSynchronizedMap, c0041dA, maxAdFormat, android.os.SystemClock.elapsedRealtime(), java.lang.System.currentTimeMillis(), this, this.f1051a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.util.Map map, java.util.Map map2, java.util.Map map3, android.content.Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        this.f1051a.i0().a((com.applovin.impl.yl) new com.applovin.impl.fm(str, maxAdFormat, map, context, this.f1051a, new com.applovin.impl.mediation.d.a(android.os.SystemClock.elapsedRealtime(), map3, str, maxAdFormat, map, map2, context, interfaceC0040a)), com.applovin.impl.tm.b.MEDIATION);
    }

    private com.applovin.impl.mediation.d.C0041d a(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.mediation.d.C0041d c0041d;
        synchronized (this.c) {
            java.lang.String strB = b(str, str2);
            c0041d = (com.applovin.impl.mediation.d.C0041d) this.b.get(strB);
            if (c0041d == null) {
                c0041d = new com.applovin.impl.mediation.d.C0041d(str2, null);
                this.b.put(strB, c0041d);
            }
        }
        return c0041d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str) {
        synchronized (this.g) {
            this.f1051a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1051a.I().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f.remove(str);
        }
    }
}
