package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class j {
    public static com.applovin.impl.sdk.j u0;
    protected static android.content.Context v0;
    private static final boolean x0;
    private static volatile com.applovin.impl.q y0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f1293a;
    private java.lang.ref.WeakReference b;
    private java.util.List c0;
    private long d;
    private com.applovin.sdk.AppLovinSdkSettings f;
    private com.applovin.mediation.MaxSegmentCollection g;
    private boolean g0;
    private java.lang.String h;
    private java.lang.String l0;
    private volatile com.applovin.sdk.AppLovinSdk m;
    private com.applovin.sdk.AppLovinSdkInitializationConfiguration m0;
    private com.applovin.sdk.AppLovinSdk.SdkInitializationListener p0;
    private com.applovin.sdk.AppLovinSdk.SdkInitializationListener q0;
    private static final java.lang.Object z0 = new java.lang.Object();
    private static final long w0 = java.lang.System.currentTimeMillis();
    private final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference j = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference k = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference l = new java.util.concurrent.atomic.AtomicReference();
    private final com.applovin.impl.sdk.n n = new com.applovin.impl.sdk.n(this);
    private final com.applovin.impl.la o = new com.applovin.impl.la(this);
    private final java.util.concurrent.atomic.AtomicReference p = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference q = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference r = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference s = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference t = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference u = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference v = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference w = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference x = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference y = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference z = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference A = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference B = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference C = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference D = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference E = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference F = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference G = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference H = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference I = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference J = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference K = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference L = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference M = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference N = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference O = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference P = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference Q = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference R = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference S = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference T = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference U = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference V = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference W = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference X = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference Y = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference Z = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference a0 = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference b0 = new java.util.concurrent.atomic.AtomicReference();
    private final java.lang.Object d0 = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicBoolean e0 = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final java.util.concurrent.atomic.AtomicBoolean f0 = new java.util.concurrent.atomic.AtomicBoolean();
    private boolean h0 = false;
    private boolean i0 = false;
    private boolean j0 = false;
    private int k0 = 0;
    private final java.lang.Object n0 = new java.lang.Object();
    private com.applovin.sdk.AppLovinSdkConfiguration o0 = new com.applovin.impl.sdk.SdkConfigurationImpl(null, this);
    private final java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.applovin.impl.yl s0 = new com.applovin.impl.jn(this, true, "scheduleAdLoadIntegrationError", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda10
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.C0();
        }
    });
    private final com.applovin.impl.yl t0 = new com.applovin.impl.jn(this, true, "sdkInit", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda11
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.D0();
        }
    });
    private final long c = java.lang.System.currentTimeMillis();

    class a implements com.applovin.impl.jm.b {
        a() {
        }

        @Override // com.applovin.impl.jm.b
        public void a(org.json.JSONObject jSONObject) {
            boolean z = jSONObject != null && jSONObject.length() > 0;
            com.applovin.impl.sdk.j.this.c(jSONObject);
            com.applovin.impl.u0.b(com.applovin.impl.sdk.j.this);
            com.applovin.impl.e4.a(jSONObject, z, com.applovin.impl.sdk.j.this);
            com.applovin.impl.sdk.j.this.M().a(com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, "smd", java.lang.Boolean.FALSE).booleanValue(), com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            com.applovin.impl.sdk.j.this.D().a();
            com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.this;
            jVar.c0 = jVar.a(jSONObject);
            if (z) {
                java.util.List<java.lang.String> listExplode = com.applovin.impl.sdk.utils.CollectionUtils.explode(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "eaaui", ""));
                com.applovin.impl.sdk.j jVar2 = com.applovin.impl.sdk.j.this;
                jVar2.o0 = new com.applovin.impl.sdk.SdkConfigurationImpl(listExplode, jVar2);
            }
            com.applovin.impl.sdk.j.this.k0().a(jSONObject);
            com.applovin.impl.sdk.j.this.b(jSONObject);
            com.applovin.impl.fc.b(((java.lang.Boolean) com.applovin.impl.sdk.j.this.a(com.applovin.impl.sj.c6)).booleanValue());
            com.applovin.impl.fc.a(((java.lang.Boolean) com.applovin.impl.sdk.j.this.a(com.applovin.impl.sj.d6)).booleanValue());
            com.applovin.impl.sdk.j.this.K0();
            if (!((java.lang.Boolean) com.applovin.impl.sdk.j.this.a(com.applovin.impl.sj.f3)).booleanValue() || z || !com.applovin.impl.e4.a(com.applovin.impl.sdk.j.m())) {
                com.applovin.impl.sdk.j.this.J0();
                return;
            }
            com.applovin.impl.sdk.j.this.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.j.this.I().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            com.applovin.impl.sdk.j.this.P0();
        }
    }

    class c implements com.applovin.impl.jm.b {
        c() {
        }

        @Override // com.applovin.impl.jm.b
        public void a(org.json.JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.length() > 0) {
                com.applovin.impl.sdk.j.this.c(jSONObject);
            }
            com.applovin.impl.sdk.j.this.e.set(false);
            com.applovin.impl.sdk.j.this.J0();
        }
    }

    static {
        try {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    com.applovin.impl.yp.c();
                }
            });
            x0 = true;
        } catch (java.lang.Throwable unused) {
            x0 = false;
        }
    }

    public j(android.content.Context context) {
        this.g0 = false;
        this.f = new com.applovin.sdk.AppLovinSdkSettings(context);
        this.g0 = true;
        if (!w0()) {
            throw new java.lang.RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://developers.applovin.com/en/android/overview/integration");
        }
        v0 = context.getApplicationContext();
        if (context instanceof android.app.Activity) {
            this.b = new java.lang.ref.WeakReference((android.app.Activity) context);
        }
        if (u0 == null) {
            u0 = this;
        } else {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Multiple SDK instances detected");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        if (i0().d()) {
            return;
        }
        I();
        if (com.applovin.impl.sdk.n.a()) {
            I().a("AppLovinSdk", "Timing out adapters init...");
        }
        i0().e();
        H0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0() {
        com.applovin.impl.tm tmVarI0 = i0();
        int i = this.k0 + 1;
        this.k0 = i;
        tmVarI0.a((com.applovin.impl.yl) new com.applovin.impl.jm(i, this, new com.applovin.impl.sdk.j.c()), com.applovin.impl.tm.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0() {
        if (y0()) {
            com.applovin.impl.ob.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0() {
        synchronized (this.d0) {
            boolean zA = com.applovin.impl.e4.a(m());
            if (!y0()) {
                I();
                if (com.applovin.impl.sdk.n.a()) {
                    I().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + N());
                }
            }
            if (!((java.lang.Boolean) a(com.applovin.impl.sj.g3)).booleanValue() || zA) {
                O0();
            }
            if (((java.lang.Boolean) a(com.applovin.impl.sj.f3)).booleanValue() && !zA) {
                I();
                if (com.applovin.impl.sdk.n.a()) {
                    I().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                P0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0() {
        if (u0()) {
            return;
        }
        this.s0.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0() {
        if (u0()) {
            return;
        }
        this.r0.set(true);
        this.t0.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0() {
        c(com.applovin.impl.uj.I);
    }

    private com.applovin.impl.sdk.q I0() {
        if (!com.applovin.impl.wh.f(v0)) {
            return null;
        }
        try {
            return new com.applovin.impl.sdk.q(this);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        java.lang.Long l = (java.lang.Long) a(com.applovin.impl.sj.o3);
        if (l.longValue() >= 0 && this.e.compareAndSet(false, true)) {
            com.applovin.impl.hr.a(l.longValue(), false, this, new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.B0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        if (!y0()) {
            e("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f0.compareAndSet(false, true)) {
            e("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else {
            if (!u().j()) {
                e("Consent flow is not enabled. Initializing SDK in MAX environment...");
                return;
            }
            u().a();
            u().b(m0(), new com.applovin.impl.sdk.j.b());
        }
    }

    private void M0() {
        android.content.Context context = v0;
        com.applovin.impl.sdk.n nVarI = I();
        com.applovin.impl.vj vjVarH0 = h0();
        com.applovin.impl.h4 h4VarU = u();
        a(context);
        e0();
        i();
        n();
        U();
        K().a(com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZING);
        com.applovin.impl.sdk.NativeCrashReporter.a(this);
        java.lang.String str = this.f1293a;
        if (str == null || str.length() != 86) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + this.f1293a + ") : " + android.util.Log.getStackTraceString(new java.lang.Throwable("")));
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(this.f1293a)) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Cross Promo SDK has been deprecated and is no longer supported");
            if (com.applovin.impl.yp.c(this)) {
                throw new java.lang.RuntimeException("Cross Promo SDK has been deprecated and is no longer supported");
            }
            return;
        }
        if (f0().getExtraParameters().containsKey("terms_flow_settings")) {
            java.lang.String str2 = "Terms flow has been removed. Please migrate to our Terms and Privacy Policy flow. For more information visit our docs: " + u().b();
            if (com.applovin.impl.yp.c(this)) {
                throw new java.lang.IllegalStateException(str2);
            }
            com.applovin.impl.sdk.n.h("AppLovinSdk", str2);
        }
        if (com.applovin.impl.yp.i()) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!com.applovin.impl.yp.b(this)) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (com.applovin.impl.yp.k(context)) {
            this.f.setVerboseLogging(true);
        }
        g0().a(com.applovin.impl.sj.l, java.lang.Boolean.valueOf(this.f.isVerboseLoggingEnabled()));
        if (com.applovin.impl.yp.c(this)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArrayA = com.applovin.impl.ze.a(this);
            for (int i = 0; i < jSONArrayA.length(); i++) {
                org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArrayA, i, (org.json.JSONObject) null);
                if (!com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, "is_supported", java.lang.Boolean.TRUE).booleanValue()) {
                    arrayList.add(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "name", "unknown"));
                }
            }
            if (!arrayList.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Please update to the latest adapter versions. Incompatible adapter(s) found: " + arrayList);
            }
        }
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        com.applovin.impl.uj ujVar = com.applovin.impl.uj.c;
        if (android.text.TextUtils.isEmpty((java.lang.String) vjVarH0.a(ujVar, (java.lang.Object) null, defaultSharedPreferences))) {
            this.i0 = true;
            vjVarH0.b(ujVar, java.lang.Boolean.toString(true), defaultSharedPreferences);
        } else {
            vjVarH0.b(ujVar, java.lang.Boolean.toString(false), defaultSharedPreferences);
        }
        com.applovin.impl.uj ujVar2 = com.applovin.impl.uj.d;
        if (((java.lang.Boolean) vjVarH0.a(ujVar2, java.lang.Boolean.FALSE)).booleanValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                nVarI.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.j0 = true;
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                nVarI.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            vjVarH0.b(ujVar2, java.lang.Boolean.TRUE);
            vjVarH0.b(com.applovin.impl.uj.o, java.lang.Boolean.valueOf(h4VarU.j()));
        }
        com.applovin.impl.uj ujVar3 = com.applovin.impl.uj.e;
        java.lang.String str3 = (java.lang.String) vjVarH0.a(ujVar3, null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str3)) {
            if (com.applovin.sdk.AppLovinSdk.VERSION_CODE > com.applovin.impl.yp.f(str3)) {
                vjVarH0.b(ujVar3, com.applovin.sdk.AppLovinSdk.VERSION);
            }
        } else {
            vjVarH0.b(ujVar3, com.applovin.sdk.AppLovinSdk.VERSION);
        }
        D().a(com.applovin.impl.ka.e, (java.lang.Object) null, (java.util.Map) null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        M0();
        if (this.f.isExceptionHandlerEnabled() && ((java.lang.Boolean) a(com.applovin.impl.sj.u)).booleanValue()) {
            com.applovin.impl.sdk.AppLovinExceptionHandler.shared().addSdk(this);
            com.applovin.impl.sdk.AppLovinExceptionHandler.shared().enable();
        }
        int i = com.applovin.impl.sdk.utils.StringUtils.parseInt(this.f.getExtraParameters().get("initialization_delay_ms"), ((java.lang.Integer) a(com.applovin.impl.sj.j4)).intValue());
        com.applovin.impl.tm tmVarI0 = i0();
        com.applovin.impl.jn jnVar = new com.applovin.impl.jn(this, true, "scheduleAdLoadIntegrationErrorAuto", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.E0();
            }
        });
        com.applovin.impl.tm.b bVar = com.applovin.impl.tm.b.CORE;
        long j = i;
        tmVarI0.a(jnVar, bVar, j);
        i0().a(new com.applovin.impl.jn(this, true, "scheduleSdkInit", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.F0();
            }
        }), bVar, j);
    }

    private java.util.Map O() {
        try {
            return com.applovin.impl.sdk.utils.JsonUtils.toStringMap(new org.json.JSONObject((java.lang.String) a(com.applovin.impl.sj.k4)));
        } catch (org.json.JSONException unused) {
            return java.util.Collections.emptyMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        com.applovin.impl.ag agVarU = U();
        agVarU.a(new com.applovin.impl.sdk.j.d(agVarU));
    }

    public static long l() {
        return w0;
    }

    public static android.content.Context m() {
        return v0;
    }

    public static boolean w0() {
        return x0;
    }

    public com.applovin.impl.sdk.l A() {
        java.lang.Object lVar = this.A.get();
        if (lVar == null) {
            synchronized (this.A) {
                lVar = this.A.get();
                if (lVar == null) {
                    lVar = new com.applovin.impl.sdk.l(this);
                    this.A.set(lVar);
                }
            }
        }
        if (lVar == this.A) {
            lVar = null;
        }
        return (com.applovin.impl.sdk.l) lVar;
    }

    public com.applovin.impl.sdk.m B() {
        java.lang.Object mVar = this.C.get();
        if (mVar == null) {
            synchronized (this.C) {
                mVar = this.C.get();
                if (mVar == null) {
                    mVar = new com.applovin.impl.sdk.m(this);
                    this.C.set(mVar);
                }
            }
        }
        if (mVar == this.C) {
            mVar = null;
        }
        return (com.applovin.impl.sdk.m) mVar;
    }

    public android.app.Activity F() {
        java.lang.ref.WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (android.app.Activity) weakReference.get();
        }
        return null;
    }

    public com.applovin.sdk.AppLovinSdkInitializationConfiguration G() {
        return this.m0;
    }

    public long H() {
        return this.c;
    }

    public void H0() {
        final com.applovin.sdk.AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (u().i() || (sdkInitializationListener = this.p0) == null) {
            return;
        }
        if (s0()) {
            this.p0 = null;
            this.q0 = null;
            K().a(com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.q0 == sdkInitializationListener) {
                return;
            }
            K().a(com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((java.lang.Boolean) a(com.applovin.impl.sj.r)).booleanValue()) {
                this.p0 = null;
            } else {
                this.q0 = sdkInitializationListener;
            }
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d(sdkInitializationListener);
            }
        }, java.lang.Math.max(0L, ((java.lang.Long) a(com.applovin.impl.sj.s)).longValue()));
    }

    public com.applovin.impl.sdk.n I() {
        return this.n;
    }

    public com.applovin.impl.mediation.d J() {
        java.lang.Object dVar = this.a0.get();
        if (dVar == null) {
            synchronized (this.a0) {
                dVar = this.a0.get();
                if (dVar == null) {
                    dVar = new com.applovin.impl.mediation.d(this);
                    this.a0.set(dVar);
                }
            }
        }
        if (dVar == this.a0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public com.applovin.impl.mediation.e K() {
        java.lang.Object eVar = this.U.get();
        if (eVar == null) {
            synchronized (this.U) {
                eVar = this.U.get();
                if (eVar == null) {
                    eVar = new com.applovin.impl.mediation.e(this);
                    this.U.set(eVar);
                }
            }
        }
        if (eVar == this.U) {
            eVar = null;
        }
        return (com.applovin.impl.mediation.e) eVar;
    }

    public com.applovin.impl.mediation.f L() {
        java.lang.Object fVar = this.T.get();
        if (fVar == null) {
            synchronized (this.T) {
                fVar = this.T.get();
                if (fVar == null) {
                    fVar = new com.applovin.impl.mediation.f(this);
                    this.T.set(fVar);
                }
            }
        }
        if (fVar == this.T) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public void L0() {
        q().a();
    }

    public java.lang.String N() {
        java.lang.String str = (java.lang.String) a(com.applovin.impl.uj.I);
        return com.applovin.impl.sdk.utils.StringUtils.isValidString(str) ? str : this.h;
    }

    public void O0() {
        synchronized (this.d0) {
            this.g0 = true;
            i0().f();
            d();
        }
    }

    public com.applovin.impl.mediation.MediationServiceImpl P() {
        java.lang.Object mediationServiceImpl = this.V.get();
        if (mediationServiceImpl == null) {
            synchronized (this.V) {
                mediationServiceImpl = this.V.get();
                if (mediationServiceImpl == null) {
                    mediationServiceImpl = new com.applovin.impl.mediation.MediationServiceImpl(this);
                    this.V.set(mediationServiceImpl);
                }
            }
        }
        if (mediationServiceImpl == this.V) {
            mediationServiceImpl = null;
        }
        return (com.applovin.impl.mediation.MediationServiceImpl) mediationServiceImpl;
    }

    public void Q0() {
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Resetting SDK state...");
        com.applovin.impl.ca caVarC = C();
        com.applovin.impl.ba baVar = com.applovin.impl.ba.l;
        long jB = caVarC.b(baVar);
        g0().a();
        g0().e();
        C().a();
        C().b(baVar, jB + 1);
        if (this.e0.compareAndSet(true, false)) {
            O0();
        } else {
            this.e0.set(true);
        }
    }

    public void R0() {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.l0)) {
            return;
        }
        this.l0 = com.applovin.sdk.AppLovinMediationProvider.MAX;
        I();
        if (com.applovin.impl.sdk.n.a()) {
            I().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public com.applovin.impl.sdk.o S() {
        java.lang.Object oVar = this.Z.get();
        if (oVar == null) {
            synchronized (this.Z) {
                oVar = this.Z.get();
                if (oVar == null) {
                    oVar = new com.applovin.impl.sdk.o(this);
                    this.Z.set(oVar);
                }
            }
        }
        if (oVar == this.Z) {
            oVar = null;
        }
        return (com.applovin.impl.sdk.o) oVar;
    }

    public void S0() {
        v().n();
    }

    public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService T() {
        java.lang.Object appLovinNativeAdService = this.j.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.j) {
                appLovinNativeAdService = this.j.get();
                if (appLovinNativeAdService == null) {
                    appLovinNativeAdService = new com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService(this);
                    this.j.set(appLovinNativeAdService);
                }
            }
        }
        if (appLovinNativeAdService == this.j) {
            appLovinNativeAdService = null;
        }
        return (com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService) appLovinNativeAdService;
    }

    public void T0() {
        a((java.util.Map) null);
    }

    public void U0() {
        if (com.applovin.sdk.AppLovinMediationProvider.ADMOB.equalsIgnoreCase(this.h) && ((java.lang.Boolean) a(com.applovin.impl.sj.L3)).booleanValue()) {
            java.lang.String str = (java.lang.String) a(com.applovin.impl.sj.K3);
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str2 = com.applovin.sdk.AppLovinSdk.VERSION;
            if (str.startsWith(sb.append(str2).append(".").toString())) {
                return;
            }
            final java.lang.String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
            com.applovin.impl.sdk.n.h("AppLovinSdk", str3);
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(true, new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.d(str3);
                }
            });
        }
    }

    public com.applovin.impl.sdk.network.b W() {
        java.lang.Object bVar = this.R.get();
        if (bVar == null) {
            synchronized (this.R) {
                bVar = this.R.get();
                if (bVar == null) {
                    bVar = new com.applovin.impl.sdk.network.b(this);
                    this.R.set(bVar);
                }
            }
        }
        if (bVar == this.R) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public com.applovin.impl.sdk.network.PostbackServiceImpl X() {
        java.lang.Object postbackServiceImpl = this.Q.get();
        if (postbackServiceImpl == null) {
            synchronized (this.Q) {
                postbackServiceImpl = this.Q.get();
                if (postbackServiceImpl == null) {
                    postbackServiceImpl = new com.applovin.impl.sdk.network.PostbackServiceImpl(this);
                    this.Q.set(postbackServiceImpl);
                }
            }
        }
        if (postbackServiceImpl == this.Q) {
            postbackServiceImpl = null;
        }
        return (com.applovin.impl.sdk.network.PostbackServiceImpl) postbackServiceImpl;
    }

    public com.applovin.impl.sdk.q Y() {
        java.lang.Object objI0 = this.v.get();
        if (objI0 == null) {
            synchronized (this.v) {
                objI0 = this.v.get();
                if (objI0 == null) {
                    objI0 = I0();
                    if (objI0 == null) {
                        objI0 = this.v;
                    }
                    this.v.set(objI0);
                }
            }
        }
        if (objI0 == this.v) {
            objI0 = null;
        }
        return (com.applovin.impl.sdk.q) objI0;
    }

    public java.lang.String Z() {
        return o0().a();
    }

    public java.lang.String a0() {
        return this.f1293a;
    }

    public com.applovin.impl.mediation.MaxSegmentCollectionImpl b0() {
        return (com.applovin.impl.mediation.MaxSegmentCollectionImpl) this.g;
    }

    public java.util.Map c0() {
        com.applovin.impl.mediation.MaxSegmentCollectionImpl maxSegmentCollectionImplB0 = b0();
        if (maxSegmentCollectionImplB0 == null) {
            return null;
        }
        return maxSegmentCollectionImplB0.getJsonData();
    }

    public com.applovin.impl.sdk.SessionTracker e0() {
        java.lang.Object sessionTracker = this.B.get();
        if (sessionTracker == null) {
            synchronized (this.B) {
                sessionTracker = this.B.get();
                if (sessionTracker == null) {
                    sessionTracker = new com.applovin.impl.sdk.SessionTracker(this);
                    this.B.set(sessionTracker);
                }
            }
        }
        if (sessionTracker == this.B) {
            sessionTracker = null;
        }
        return (com.applovin.impl.sdk.SessionTracker) sessionTracker;
    }

    public com.applovin.sdk.AppLovinSdkSettings f0() {
        return this.f;
    }

    public com.applovin.impl.sdk.d g() {
        java.lang.Object dVar = this.P.get();
        if (dVar == null) {
            synchronized (this.P) {
                dVar = this.P.get();
                if (dVar == null) {
                    dVar = new com.applovin.impl.sdk.d(this);
                    this.P.set(dVar);
                }
            }
        }
        if (dVar == this.P) {
            dVar = null;
        }
        return (com.applovin.impl.sdk.d) dVar;
    }

    public com.applovin.impl.sdk.e h() {
        java.lang.Object eVar = this.y.get();
        if (eVar == null) {
            synchronized (this.y) {
                eVar = this.y.get();
                if (eVar == null) {
                    eVar = new com.applovin.impl.sdk.e(this);
                    this.y.set(eVar);
                }
            }
        }
        if (eVar == this.y) {
            eVar = null;
        }
        return (com.applovin.impl.sdk.e) eVar;
    }

    public com.applovin.impl.sdk.AppLovinAdServiceImpl j() {
        java.lang.Object appLovinAdServiceImpl = this.i.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.i) {
                appLovinAdServiceImpl = this.i.get();
                if (appLovinAdServiceImpl == null) {
                    appLovinAdServiceImpl = new com.applovin.impl.sdk.AppLovinAdServiceImpl(this);
                    this.i.set(appLovinAdServiceImpl);
                }
            }
        }
        if (appLovinAdServiceImpl == this.i) {
            appLovinAdServiceImpl = null;
        }
        return (com.applovin.impl.sdk.AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public com.applovin.impl.sdk.g k() {
        java.lang.Object gVar = this.D.get();
        if (gVar == null) {
            synchronized (this.D) {
                gVar = this.D.get();
                if (gVar == null) {
                    gVar = new com.applovin.impl.sdk.g(this);
                    this.D.set(gVar);
                }
            }
        }
        if (gVar == this.D) {
            gVar = null;
        }
        return (com.applovin.impl.sdk.g) gVar;
    }

    public long l0() {
        if (this.d == 0) {
            return -1L;
        }
        return java.lang.System.currentTimeMillis() - this.d;
    }

    public android.app.Activity m0() {
        android.app.Activity activityB = a(m()).b();
        return activityB != null ? activityB : F();
    }

    public com.applovin.impl.sdk.array.ArrayService n() {
        java.lang.Object arrayService = this.N.get();
        if (arrayService == null) {
            synchronized (this.N) {
                arrayService = this.N.get();
                if (arrayService == null) {
                    arrayService = new com.applovin.impl.sdk.array.ArrayService(this);
                    this.N.set(arrayService);
                }
            }
        }
        if (arrayService == this.N) {
            arrayService = null;
        }
        return (com.applovin.impl.sdk.array.ArrayService) arrayService;
    }

    public java.lang.String n0() {
        return o0().c();
    }

    public com.applovin.impl.sdk.h o() {
        java.lang.Object hVar = this.I.get();
        if (hVar == null) {
            synchronized (this.I) {
                hVar = this.I.get();
                if (hVar == null) {
                    hVar = new com.applovin.impl.sdk.h(this);
                    this.I.set(hVar);
                }
            }
        }
        if (hVar == this.I) {
            hVar = null;
        }
        return (com.applovin.impl.sdk.h) hVar;
    }

    public com.applovin.impl.privacy.cmp.CmpServiceImpl p() {
        java.lang.Object cmpServiceImpl = this.l.get();
        if (cmpServiceImpl == null) {
            synchronized (this.l) {
                cmpServiceImpl = this.l.get();
                if (cmpServiceImpl == null) {
                    cmpServiceImpl = new com.applovin.impl.privacy.cmp.CmpServiceImpl(this);
                    this.l.set(cmpServiceImpl);
                }
            }
        }
        if (cmpServiceImpl == this.l) {
            cmpServiceImpl = null;
        }
        return (com.applovin.impl.privacy.cmp.CmpServiceImpl) cmpServiceImpl;
    }

    public com.applovin.impl.sdk.i q() {
        java.lang.Object iVar = this.G.get();
        if (iVar == null) {
            synchronized (this.G) {
                iVar = this.G.get();
                if (iVar == null) {
                    iVar = new com.applovin.impl.sdk.i(this);
                    this.G.set(iVar);
                }
            }
        }
        if (iVar == this.G) {
            iVar = null;
        }
        return (com.applovin.impl.sdk.i) iVar;
    }

    public com.applovin.sdk.AppLovinSdk q0() {
        return this.m;
    }

    public java.lang.String r() {
        return o0().b();
    }

    public boolean r0() {
        return this.j0;
    }

    public com.applovin.sdk.AppLovinSdkConfiguration s() {
        return this.o0;
    }

    public boolean s0() {
        boolean z;
        synchronized (this.d0) {
            z = this.h0;
        }
        return z;
    }

    public boolean t0() {
        return this.i0;
    }

    public java.lang.String toString() {
        return "CoreSdk{sdkKey='" + this.f1293a + "', enabled=" + this.h0 + ", isFirstSession=" + this.i0 + '}';
    }

    public boolean u0() {
        boolean z;
        synchronized (this.n0) {
            z = this.m0 != null;
        }
        return z;
    }

    public boolean v0() {
        boolean z;
        synchronized (this.d0) {
            z = this.g0;
        }
        return z;
    }

    public com.applovin.impl.sdk.k x() {
        java.lang.Object kVar = this.u.get();
        if (kVar == null) {
            synchronized (this.u) {
                kVar = this.u.get();
                if (kVar == null) {
                    kVar = new com.applovin.impl.sdk.k(this);
                    this.u.set(kVar);
                }
            }
        }
        if (kVar == this.u) {
            kVar = null;
        }
        return (com.applovin.impl.sdk.k) kVar;
    }

    public java.util.concurrent.atomic.AtomicBoolean x0() {
        return this.r0;
    }

    public java.lang.String y() {
        return this.l0;
    }

    public boolean y0() {
        return com.applovin.impl.sdk.utils.StringUtils.containsIgnoreCase(N(), com.applovin.sdk.AppLovinMediationProvider.MAX);
    }

    public com.applovin.impl.sdk.EventServiceImpl z() {
        java.lang.Object eventServiceImpl = this.k.get();
        if (eventServiceImpl == null) {
            synchronized (this.k) {
                eventServiceImpl = this.k.get();
                if (eventServiceImpl == null) {
                    eventServiceImpl = new com.applovin.impl.sdk.EventServiceImpl(this);
                    this.k.set(eventServiceImpl);
                }
            }
        }
        if (eventServiceImpl == this.k) {
            eventServiceImpl = null;
        }
        return (com.applovin.impl.sdk.EventServiceImpl) eventServiceImpl;
    }

    public boolean z0() {
        return com.applovin.impl.yp.a("com.unity3d.player.UnityPlayerActivity");
    }

    private void d() {
        com.applovin.impl.tm tmVarI0 = i0();
        int i = this.k0 + 1;
        this.k0 = i;
        tmVarI0.a((com.applovin.impl.yl) new com.applovin.impl.jm(i, this, new com.applovin.impl.sdk.j.a()), com.applovin.impl.tm.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(java.lang.String str) {
        I();
        if (com.applovin.impl.sdk.n.a()) {
            I().a("AppLovinSdk", str);
        }
        i0().a(new com.applovin.impl.sm(this));
    }

    public com.applovin.impl.sdk.a f() {
        java.lang.Object aVar = this.z.get();
        if (aVar == null) {
            synchronized (this.z) {
                aVar = this.z.get();
                if (aVar == null) {
                    aVar = new com.applovin.impl.sdk.a(this);
                    this.z.set(aVar);
                }
            }
        }
        if (aVar == this.z) {
            aVar = null;
        }
        return (com.applovin.impl.sdk.a) aVar;
    }

    public void g(final java.lang.String str) {
        com.applovin.impl.sdk.n.g("AppLovinSdk", "Setting plugin version: " + str);
        if (com.applovin.impl.yp.h()) {
            com.applovin.impl.yp.a(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(str);
                }
            });
        } else {
            g0().a(com.applovin.impl.sj.K3, str);
        }
    }

    public void h(final java.lang.String str) {
        I();
        if (com.applovin.impl.sdk.n.a()) {
            I().a("AppLovinSdk", "Setting user id: " + str);
        }
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str) && str.length() > com.applovin.impl.yp.b(8)) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + com.applovin.impl.yp.b(8) + " maximum)");
        }
        if (com.applovin.impl.yp.h()) {
            com.applovin.impl.yp.a(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(str);
                }
            });
        } else {
            o0().a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(java.lang.String str) {
        if (!com.applovin.impl.yp.c(this)) {
            java.util.HashMap map = new java.util.HashMap();
            map.put("details", com.applovin.sdk.AppLovinMediationProvider.ADMOB);
            map.put("error_message", str);
            D().a(com.applovin.impl.ka.V, "adapterVersionMismatch", (java.util.Map) map);
            return;
        }
        throw new java.lang.IllegalStateException(str);
    }

    public void f(java.lang.String str) {
        I();
        if (com.applovin.impl.sdk.n.a()) {
            I().a("AppLovinSdk", "setMediationProvider(mediationProvider=" + str + ")");
        }
        if (str != null && (str.isEmpty() || str.length() > 64 || !com.applovin.impl.sdk.utils.StringUtils.isAlphaNumeric(str))) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return;
        }
        this.h = str;
        if (com.applovin.impl.yp.h()) {
            com.applovin.impl.yp.a(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.G0();
                }
            });
        } else {
            c(com.applovin.impl.uj.I);
        }
    }

    public com.applovin.impl.q e() {
        return a(v0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(com.applovin.sdk.AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        I();
        if (com.applovin.impl.sdk.n.a()) {
            I().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.o0);
    }

    public com.applovin.impl.la D() {
        return this.o;
    }

    public com.applovin.impl.tm i0() {
        java.lang.Object tmVar = this.p.get();
        if (tmVar == null) {
            synchronized (this.p) {
                tmVar = this.p.get();
                if (tmVar == null) {
                    tmVar = new com.applovin.impl.tm(this);
                    this.p.set(tmVar);
                }
            }
        }
        if (tmVar == this.p) {
            tmVar = null;
        }
        return (com.applovin.impl.tm) tmVar;
    }

    public com.applovin.impl.tj g0() {
        java.lang.Object tjVar = this.q.get();
        if (tjVar == null) {
            synchronized (this.q) {
                tjVar = this.q.get();
                if (tjVar == null) {
                    tjVar = new com.applovin.impl.tj(this);
                    this.q.set(tjVar);
                }
            }
        }
        if (tjVar == this.q) {
            tjVar = null;
        }
        return (com.applovin.impl.tj) tjVar;
    }

    public com.applovin.impl.d4 t() {
        java.lang.Object d4Var = this.r.get();
        if (d4Var == null) {
            synchronized (this.r) {
                d4Var = this.r.get();
                if (d4Var == null) {
                    d4Var = new com.applovin.impl.d4(this);
                    this.r.set(d4Var);
                }
            }
        }
        if (d4Var == this.r) {
            d4Var = null;
        }
        return (com.applovin.impl.d4) d4Var;
    }

    public com.applovin.impl.ca C() {
        java.lang.Object caVar = this.s.get();
        if (caVar == null) {
            synchronized (this.s) {
                caVar = this.s.get();
                if (caVar == null) {
                    caVar = new com.applovin.impl.ca(this);
                    this.s.set(caVar);
                }
            }
        }
        if (caVar == this.s) {
            caVar = null;
        }
        return (com.applovin.impl.ca) caVar;
    }

    public com.applovin.impl.xe Q() {
        java.lang.Object xeVar = this.t.get();
        if (xeVar == null) {
            synchronized (this.t) {
                xeVar = this.t.get();
                if (xeVar == null) {
                    xeVar = new com.applovin.impl.xe(this);
                    this.t.set(xeVar);
                }
            }
        }
        if (xeVar == this.t) {
            xeVar = null;
        }
        return (com.applovin.impl.xe) xeVar;
    }

    public com.applovin.impl.vj h0() {
        java.lang.Object vjVar = this.w.get();
        if (vjVar == null) {
            synchronized (this.w) {
                vjVar = this.w.get();
                if (vjVar == null) {
                    vjVar = new com.applovin.impl.vj(this);
                    this.w.set(vjVar);
                }
            }
        }
        if (vjVar == this.w) {
            vjVar = null;
        }
        return (com.applovin.impl.vj) vjVar;
    }

    public com.applovin.impl.wp o0() {
        java.lang.Object wpVar = this.x.get();
        if (wpVar == null) {
            synchronized (this.x) {
                wpVar = this.x.get();
                if (wpVar == null) {
                    wpVar = new com.applovin.impl.wp(this);
                    this.x.set(wpVar);
                }
            }
        }
        if (wpVar == this.x) {
            wpVar = null;
        }
        return (com.applovin.impl.wp) wpVar;
    }

    public com.applovin.impl.qr p0() {
        java.lang.Object qrVar = this.E.get();
        if (qrVar == null) {
            synchronized (this.E) {
                qrVar = this.E.get();
                if (qrVar == null) {
                    qrVar = new com.applovin.impl.qr(this);
                    this.E.set(qrVar);
                }
            }
        }
        if (qrVar == this.E) {
            qrVar = null;
        }
        return (com.applovin.impl.qr) qrVar;
    }

    public com.applovin.impl.ag U() {
        java.lang.Object agVar = this.F.get();
        if (agVar == null) {
            synchronized (this.F) {
                agVar = this.F.get();
                if (agVar == null) {
                    agVar = new com.applovin.impl.ag(m());
                    this.F.set(agVar);
                }
            }
        }
        if (agVar == this.F) {
            agVar = null;
        }
        return (com.applovin.impl.ag) agVar;
    }

    public com.applovin.impl.oj d0() {
        java.lang.Object ojVar = this.H.get();
        if (ojVar == null) {
            synchronized (this.H) {
                ojVar = this.H.get();
                if (ojVar == null) {
                    ojVar = new com.applovin.impl.oj(this);
                    this.H.set(ojVar);
                }
            }
        }
        if (ojVar == this.H) {
            ojVar = null;
        }
        return (com.applovin.impl.oj) ojVar;
    }

    public com.applovin.impl.h4 u() {
        java.lang.Object h4Var = this.J.get();
        if (h4Var == null) {
            synchronized (this.J) {
                h4Var = this.J.get();
                if (h4Var == null) {
                    h4Var = new com.applovin.impl.h4(this);
                    this.J.set(h4Var);
                }
            }
        }
        if (h4Var == this.J) {
            h4Var = null;
        }
        return (com.applovin.impl.h4) h4Var;
    }

    public com.applovin.impl.qn j0() {
        java.lang.Object qnVar = this.K.get();
        if (qnVar == null) {
            synchronized (this.K) {
                qnVar = this.K.get();
                if (qnVar == null) {
                    qnVar = new com.applovin.impl.qn(this);
                    this.K.set(qnVar);
                }
            }
        }
        if (qnVar == this.K) {
            qnVar = null;
        }
        return (com.applovin.impl.qn) qnVar;
    }

    public com.applovin.impl.x4 v() {
        java.lang.Object x4Var = this.L.get();
        if (x4Var == null) {
            synchronized (this.L) {
                x4Var = this.L.get();
                if (x4Var == null) {
                    x4Var = new com.applovin.impl.x4(this);
                    this.L.set(x4Var);
                }
            }
        }
        if (x4Var == this.L) {
            x4Var = null;
        }
        return (com.applovin.impl.x4) x4Var;
    }

    public com.applovin.impl.pg V() {
        java.lang.Object pgVar = this.M.get();
        if (pgVar == null) {
            synchronized (this.M) {
                pgVar = this.M.get();
                if (pgVar == null) {
                    pgVar = new com.applovin.impl.pg(this);
                    this.M.set(pgVar);
                }
            }
        }
        if (pgVar == this.M) {
            pgVar = null;
        }
        return (com.applovin.impl.pg) pgVar;
    }

    public com.applovin.impl.c5 w() {
        java.lang.Object c5Var = this.O.get();
        if (c5Var == null) {
            synchronized (this.O) {
                c5Var = this.O.get();
                if (c5Var == null) {
                    c5Var = new com.applovin.impl.c5(this);
                    this.O.set(c5Var);
                }
            }
        }
        if (c5Var == this.O) {
            c5Var = null;
        }
        return (com.applovin.impl.c5) c5Var;
    }

    public com.applovin.impl.v i() {
        java.lang.Object vVar = this.S.get();
        if (vVar == null) {
            synchronized (this.S) {
                vVar = this.S.get();
                if (vVar == null) {
                    vVar = new com.applovin.impl.v(this);
                    this.S.set(vVar);
                }
            }
        }
        if (vVar == this.S) {
            vVar = null;
        }
        return (com.applovin.impl.v) vVar;
    }

    public com.applovin.impl.cd E() {
        java.lang.Object cdVar = this.W.get();
        if (cdVar == null) {
            synchronized (this.W) {
                cdVar = this.W.get();
                if (cdVar == null) {
                    cdVar = new com.applovin.impl.cd(this);
                    this.W.set(cdVar);
                }
            }
        }
        if (cdVar == this.W) {
            cdVar = null;
        }
        return (com.applovin.impl.cd) cdVar;
    }

    public com.applovin.impl.ye R() {
        java.lang.Object yeVar = this.X.get();
        if (yeVar == null) {
            synchronized (this.X) {
                yeVar = this.X.get();
                if (yeVar == null) {
                    yeVar = new com.applovin.impl.ye();
                    this.X.set(yeVar);
                }
            }
        }
        if (yeVar == this.X) {
            yeVar = null;
        }
        return (com.applovin.impl.ye) yeVar;
    }

    public com.applovin.impl.te M() {
        java.lang.Object teVar = this.Y.get();
        if (teVar == null) {
            synchronized (this.Y) {
                teVar = this.Y.get();
                if (teVar == null) {
                    teVar = new com.applovin.impl.te(this);
                    this.Y.set(teVar);
                }
            }
        }
        if (teVar == this.Y) {
            teVar = null;
        }
        return (com.applovin.impl.te) teVar;
    }

    public com.applovin.impl.wn k0() {
        java.lang.Object wnVar = this.b0.get();
        if (wnVar == null) {
            synchronized (this.b0) {
                wnVar = this.b0.get();
                if (wnVar == null) {
                    wnVar = new com.applovin.impl.wn(this);
                    this.b0.set(wnVar);
                }
            }
        }
        if (wnVar == this.b0) {
            wnVar = null;
        }
        return (com.applovin.impl.wn) wnVar;
    }

    class b implements com.applovin.impl.h4.b {
        b() {
        }

        @Override // com.applovin.impl.h4.b
        public void a(com.applovin.impl.h4.a aVar) {
            com.applovin.impl.sdk.j.this.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.j.this.I().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + aVar);
            }
            if (aVar.b()) {
                com.applovin.impl.sdk.j.this.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.j.this.I().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
                }
                com.applovin.impl.sdk.j.this.O0();
                com.applovin.impl.sdk.j.this.L0();
                return;
            }
            com.applovin.impl.sdk.j.this.e("Initializing SDK in MAX environment...");
        }
    }

    class d implements com.applovin.impl.ag.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.ag f1297a;

        @Override // com.applovin.impl.ag.a
        public void a() {
            com.applovin.impl.sdk.j.this.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.j.this.I().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (com.applovin.impl.sdk.j.this.d0) {
                if (!com.applovin.impl.sdk.j.this.g0) {
                    com.applovin.impl.sdk.j.this.O0();
                }
            }
            this.f1297a.b(this);
        }

        @Override // com.applovin.impl.ag.a
        public void b() {
        }

        d(com.applovin.impl.ag agVar) {
            this.f1297a = agVar;
        }
    }

    public java.lang.Object a(com.applovin.impl.sj sjVar) {
        return g0().a(sjVar);
    }

    public java.util.List c(com.applovin.impl.sj sjVar) {
        return g0().c(sjVar);
    }

    public java.util.List b(com.applovin.impl.sj sjVar) {
        return g0().b(sjVar);
    }

    public java.lang.Object a(com.applovin.impl.uj ujVar) {
        return a(ujVar, (java.lang.Object) null);
    }

    public void c(com.applovin.impl.uj ujVar) {
        h0().b(ujVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(org.json.JSONObject jSONObject) {
        this.d = java.lang.System.currentTimeMillis();
        com.applovin.impl.e4.c(jSONObject, this);
        com.applovin.impl.e4.b(jSONObject, this);
        com.applovin.impl.e4.a(jSONObject, this);
        com.applovin.impl.pe.f(jSONObject, this);
        com.applovin.impl.pe.d(jSONObject, this);
        com.applovin.impl.pe.e(jSONObject, this);
        com.applovin.impl.pe.g(jSONObject, this);
    }

    public void c() {
        synchronized (this.d0) {
            if (!this.g0 && !this.h0) {
                O0();
            }
        }
    }

    public java.lang.Object b(com.applovin.impl.uj ujVar) {
        return h0().a(ujVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.applovin.sdk.AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.o0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(java.lang.String str) {
        o0().a(str);
    }

    public java.lang.Object a(com.applovin.impl.uj ujVar, java.lang.Object obj) {
        return h0().a(ujVar, obj);
    }

    public void b(com.applovin.impl.uj ujVar, java.lang.Object obj) {
        h0().b(ujVar, obj);
    }

    public static void b(android.content.Context context) {
        if (context == null) {
            return;
        }
        v0 = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.sdk.AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.o0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(com.applovin.sdk.AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        M0();
        this.f.attachAppLovinSdk(this);
        java.lang.String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            com.applovin.impl.sdk.n.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            g0().a(com.applovin.impl.sj.K3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((java.lang.Boolean) a(com.applovin.impl.sj.u)).booleanValue()) {
            com.applovin.impl.sdk.AppLovinExceptionHandler.shared().addSdk(this);
            com.applovin.impl.sdk.AppLovinExceptionHandler.shared().enable();
        }
        com.applovin.impl.tm tmVarI0 = i0();
        com.applovin.impl.yl ylVar = this.s0;
        com.applovin.impl.tm.b bVar = com.applovin.impl.tm.b.CORE;
        tmVarI0.a(ylVar, bVar);
        i0().a(this.t0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(org.json.JSONObject jSONObject) {
        java.util.Iterator it = com.applovin.impl.sdk.utils.JsonUtils.getList(jSONObject, "error_messages", java.util.Collections.emptyList()).iterator();
        while (it.hasNext()) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", (java.lang.String) it.next());
        }
    }

    public java.lang.String b() {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.l0)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map mapO = O();
        java.util.List listC = c(com.applovin.impl.sj.m4);
        java.lang.Boolean bool = (java.lang.Boolean) a(com.applovin.impl.sj.n4);
        if (mapO.isEmpty() && !bool.booleanValue()) {
            return null;
        }
        try {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            java.lang.Integer numValueOf = (java.lang.Integer) a(com.applovin.impl.sj.l4);
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                if (numValueOf.intValue() <= 0) {
                    break;
                }
                java.lang.String className = stackTraceElement.getClassName();
                java.util.Iterator it = listC.iterator();
                do {
                    if (!it.hasNext()) {
                        for (java.util.Map.Entry entry : mapO.entrySet()) {
                            if (className.startsWith((java.lang.String) entry.getKey())) {
                                this.l0 = (java.lang.String) entry.getValue();
                                I();
                                if (com.applovin.impl.sdk.n.a()) {
                                    I().a("AppLovinSdk", "Detected mediation provider: " + this.l0);
                                }
                                return null;
                            }
                        }
                        if (bool.booleanValue()) {
                            arrayList.add(className);
                        }
                        numValueOf = java.lang.Integer.valueOf(numValueOf.intValue() - 1);
                        break;
                    }
                } while (!className.startsWith((java.lang.String) it.next()));
            }
        } catch (java.lang.Throwable th) {
            D().a("AppLovinSdk", "detectMediationProvider", th);
        }
        this.l0 = "unknown";
        I();
        if (com.applovin.impl.sdk.n.a()) {
            I().k("AppLovinSdk", "Unable to detect mediation provider");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.lang.String strJoin = com.applovin.impl.sdk.utils.StringUtils.join(",", arrayList);
        if (!((java.lang.Boolean) a(com.applovin.impl.sj.o4)).booleanValue()) {
            return strJoin;
        }
        D().a(com.applovin.impl.ka.d, "detectMediationProvider", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("details", strJoin));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(java.lang.String str) {
        g0().a(com.applovin.impl.sj.K3, str);
    }

    public boolean a(com.applovin.impl.sj sjVar, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        return b(sjVar).contains(maxAdFormat);
    }

    public void a(com.applovin.impl.oe oeVar) {
        if (i0().d()) {
            return;
        }
        java.util.List listC = c(com.applovin.impl.ue.D6);
        if (listC.size() <= 0 || !K().a().containsAll(listC)) {
            return;
        }
        I();
        if (com.applovin.impl.sdk.n.a()) {
            I().a("AppLovinSdk", "All required adapters initialized");
        }
        i0().e();
        H0();
    }

    public void a(com.applovin.sdk.AppLovinSdk appLovinSdk) {
        this.m = appLovinSdk;
    }

    public static java.lang.String a(java.lang.String str) {
        return a(str, (java.util.List) null);
    }

    public static java.lang.String a(int i) {
        return a(i, (java.util.List) null);
    }

    public static java.lang.String a(java.lang.String str, java.util.List list) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        android.content.Context contextM = m();
        return a(contextM.getResources().getIdentifier(str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, contextM.getPackageName()), list);
    }

    public static java.lang.String a(int i, java.util.List list) {
        java.lang.String string = m().getResources().getString(i);
        return list != null ? java.lang.String.format(string, list.toArray()) : string;
    }

    public static com.applovin.impl.q a(android.content.Context context) {
        if (y0 == null) {
            synchronized (z0) {
                if (y0 == null) {
                    y0 = new com.applovin.impl.q(context);
                }
            }
        }
        return y0;
    }

    public void a(final com.applovin.sdk.AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final com.applovin.sdk.AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (this.r0.get()) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Invalid initialization process: please remove the applovin.sdk.key entry from your AndroidManifest.xml and set your SDK key with the AppLovinSdkInitializationConfiguration object. Then initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or APIs.");
            D().a(com.applovin.impl.ka.V, "legacy_init_already");
            if (com.applovin.impl.yp.c(this)) {
                throw new java.lang.IllegalStateException("Invalid initialization process: please remove the applovin.sdk.key entry from your AndroidManifest.xml and set your SDK key with the AppLovinSdkInitializationConfiguration object. Then initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or APIs.");
            }
            return;
        }
        synchronized (this.n0) {
            if (this.m0 != null) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.m0 + ". Ignoring the provided initialization configuration.");
                if (!s0() || sdkInitializationListener == null) {
                    return;
                }
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(sdkInitializationListener);
                    }
                });
                return;
            }
            this.m0 = appLovinSdkInitializationConfiguration;
            this.p0 = sdkInitializationListener;
            this.f1293a = appLovinSdkInitializationConfiguration.getSdkKey();
            this.h = appLovinSdkInitializationConfiguration.getMediationProvider();
            this.g = appLovinSdkInitializationConfiguration.getSegmentCollection();
            com.applovin.impl.yp.a(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(appLovinSdkInitializationConfiguration);
                }
            });
        }
    }

    public void a(java.lang.String str, com.applovin.sdk.AppLovinSdkSettings appLovinSdkSettings) {
        x0().set(true);
        this.f1293a = str;
        this.f = appLovinSdkSettings;
        if (android.text.TextUtils.isEmpty(str)) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Called with an invalid SDK key from: " + android.util.Log.getStackTraceString(new java.lang.Throwable("")));
        }
        com.applovin.impl.yp.a(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.N0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.List a(org.json.JSONObject jSONObject) {
        java.util.List listAsList = java.util.Arrays.asList(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "eaf", "").split(","));
        java.util.ArrayList arrayList = new java.util.ArrayList(listAsList.size());
        java.util.Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            com.applovin.mediation.MaxAdFormat fromString = com.applovin.mediation.MaxAdFormat.formatFromString((java.lang.String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    public void a(boolean z) {
        synchronized (this.d0) {
            this.g0 = false;
            this.h0 = z;
        }
        if (z) {
            java.util.List listC = c(com.applovin.impl.ue.D6);
            if (listC.isEmpty()) {
                i0().e();
                H0();
                return;
            }
            java.lang.Long l = (java.lang.Long) a(com.applovin.impl.ue.E6);
            com.applovin.impl.jn jnVar = new com.applovin.impl.jn(this, true, "timeoutInitAdapters", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.A0();
                }
            });
            I();
            if (com.applovin.impl.sdk.n.a()) {
                I().a("AppLovinSdk", "Waiting for required adapters to init: " + listC + " - timing out in " + l + "ms...");
            }
            i0().a(jnVar, com.applovin.impl.tm.b.TIMEOUT, l.longValue(), true);
        }
    }

    public boolean a(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        java.util.List list = this.c0;
        return (list == null || list.size() <= 0 || this.c0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        java.lang.String str = (java.lang.String) h0().a(com.applovin.impl.uj.e, null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            if (com.applovin.sdk.AppLovinSdk.VERSION_CODE < com.applovin.impl.yp.f(str)) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Current version (" + com.applovin.sdk.AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public void a(java.util.Map map) {
        M().a(map);
    }

    public void a(java.lang.String str, java.lang.Object obj, android.content.SharedPreferences.Editor editor) {
        h0().a(str, obj, editor);
    }

    public java.lang.Object a(java.lang.String str, java.lang.Object obj, java.lang.Class cls, android.content.SharedPreferences sharedPreferences) {
        return com.applovin.impl.vj.a(str, obj, cls, sharedPreferences);
    }

    public void a(android.content.SharedPreferences sharedPreferences) {
        h0().a(sharedPreferences);
    }

    public void a(final com.applovin.sdk.AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!s0()) {
            this.p0 = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(sdkInitializationListener);
                }
            });
        }
    }
}
