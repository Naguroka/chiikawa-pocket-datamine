package com.applovin.adview;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinFullscreenActivity extends android.app.Activity implements com.applovin.impl.s6 {
    public static com.applovin.impl.sb parentInterstitialWrapper;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f504a;
    private com.applovin.impl.o9 b;
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(true);
    private com.applovin.impl.adview.activity.a d;
    private com.applovin.adview.AppLovinFullscreenActivity.b f;
    private boolean g;
    private com.applovin.impl.x1 h;
    private long i;

    private static class b implements android.window.OnBackInvokedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Runnable f506a;

        protected b(java.lang.Runnable runnable) {
            this.f506a = runnable;
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            this.f506a.run();
        }
    }

    private void b() {
        com.applovin.impl.sdk.j jVar = this.f504a;
        if (jVar == null || !((java.lang.Boolean) jVar.a(com.applovin.impl.sj.h2)).booleanValue()) {
            return;
        }
        final java.lang.Long l = (java.lang.Long) this.f504a.a(com.applovin.impl.sj.i2);
        this.h = com.applovin.impl.x1.a(l.longValue(), true, this.f504a, new java.lang.Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.applovin.impl.o9 o9Var = this.b;
        if (o9Var != null) {
            o9Var.s();
        }
        if (com.applovin.impl.yp.e(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // com.applovin.impl.s6
    public void dismiss() {
        if (com.applovin.impl.z3.l() && this.f != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f);
            this.f = null;
        }
        com.applovin.impl.o9 o9Var = this.b;
        if (o9Var != null) {
            o9Var.f();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.applovin.impl.o9 o9Var = this.b;
        if (o9Var != null) {
            o9Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            com.applovin.impl.sdk.n.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss();
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        android.view.View viewFindViewById = findViewById(android.R.id.content);
        viewFindViewById.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        java.lang.String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.applovin.impl.sb sbVar = parentInterstitialWrapper;
            if (sbVar != null && sbVar.f() != null) {
                com.applovin.impl.sb.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", null, this);
            }
            finish();
            return;
        }
        com.applovin.impl.sdk.j jVarA = com.applovin.sdk.AppLovinSdk.getInstance(stringExtra, new com.applovin.sdk.AppLovinSdkSettings(this), this).a();
        this.f504a = jVarA;
        this.g = ((java.lang.Boolean) jVarA.a(com.applovin.impl.sj.z2)).booleanValue();
        viewFindViewById.setFitsSystemWindows(true);
        com.applovin.impl.r.a(this.g, this);
        if (com.applovin.impl.z3.l() && ((java.lang.Boolean) this.f504a.a(com.applovin.impl.sj.Q5)).booleanValue()) {
            this.f = new com.applovin.adview.AppLovinFullscreenActivity.b(new java.lang.Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f);
        }
        a();
        b();
        com.applovin.impl.sb sbVar2 = parentInterstitialWrapper;
        if (sbVar2 != null) {
            com.applovin.impl.o9.a(sbVar2.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.f504a, this, new com.applovin.adview.AppLovinFullscreenActivity.a());
            return;
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.applovin.impl.adview.activity.FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f504a);
        this.d = aVar;
        bindService(intent, aVar, 1);
        if (com.applovin.impl.z3.j()) {
            java.lang.String str = this.f504a.f0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str) && java.lang.Boolean.parseBoolean(str)) {
                return;
            }
            try {
                android.webkit.WebView.setDataDirectorySuffix(java.lang.String.valueOf(android.os.Process.myPid()));
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        com.applovin.impl.sdk.j jVar = this.f504a;
        if (jVar != null && ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.g2)).booleanValue()) {
            this.f504a.h0().b(com.applovin.impl.uj.M);
            this.f504a.h0().b(com.applovin.impl.uj.O);
            this.f504a.h0().b(com.applovin.impl.uj.P);
        }
        if (this.h != null) {
            this.f504a.h0().b(com.applovin.impl.uj.N);
            this.h.a();
            this.h = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (java.lang.Throwable unused) {
            }
        }
        com.applovin.impl.o9 o9Var = this.b;
        if (o9Var != null) {
            if (!o9Var.j()) {
                this.b.f();
            }
            this.b.t();
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        com.applovin.impl.o9 o9Var = this.b;
        if (o9Var != null) {
            o9Var.a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.applovin.impl.o9 o9Var = this.b;
        if (o9Var != null) {
            o9Var.u();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        com.applovin.impl.o9 o9Var;
        try {
            super.onResume();
            if (this.c.get() || (o9Var = this.b) == null) {
                return;
            }
            o9Var.v();
        } catch (java.lang.IllegalArgumentException e) {
            this.f504a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f504a.I().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            this.f504a.D().a("AppLovinFullscreenActivity", com.ironsource.y8.h.u0, e);
            dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.applovin.impl.o9 o9Var = this.b;
        if (o9Var != null) {
            o9Var.w();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.b != null) {
            if (!this.c.getAndSet(false) || (this.b instanceof com.applovin.impl.t9)) {
                this.b.b(z);
            }
            if (z) {
                com.applovin.impl.r.a(this.g, this);
            }
        }
        super.onWindowFocusChanged(z);
    }

    private void a() {
        com.applovin.impl.sb sbVar;
        com.applovin.impl.sdk.j jVar = this.f504a;
        if (jVar == null || !((java.lang.Boolean) jVar.a(com.applovin.impl.sj.g2)).booleanValue() || (sbVar = parentInterstitialWrapper) == null || sbVar.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b bVarF = parentInterstitialWrapper.f();
        java.util.List listG = bVarF.g();
        if (com.applovin.impl.sdk.utils.CollectionUtils.isEmpty(listG)) {
            return;
        }
        com.applovin.impl.s sVar = (com.applovin.impl.s) listG.get(0);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", sVar.c());
        com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", sVar.a());
        this.f504a.h0().b(com.applovin.impl.uj.O, jSONObject.toString());
        this.f504a.h0().b(com.applovin.impl.uj.M, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        this.f504a.h0().b(com.applovin.impl.uj.P, com.applovin.impl.sdk.utils.CollectionUtils.toJsonString(com.applovin.impl.la.a(bVarF), com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.Long l) {
        this.i += l.longValue();
        this.f504a.h0().b(com.applovin.impl.uj.N, java.lang.Long.valueOf(this.i));
    }

    class a implements com.applovin.impl.o9.d {
        a() {
        }

        @Override // com.applovin.impl.o9.d
        public void a(com.applovin.impl.o9 o9Var) {
            com.applovin.adview.AppLovinFullscreenActivity.this.b = o9Var;
            o9Var.y();
        }

        @Override // com.applovin.impl.o9.d
        public void a(java.lang.String str, java.lang.Throwable th) {
            com.applovin.impl.sb.a(com.applovin.adview.AppLovinFullscreenActivity.parentInterstitialWrapper.f(), com.applovin.adview.AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, com.applovin.adview.AppLovinFullscreenActivity.this);
        }
    }

    public void setPresenter(com.applovin.impl.o9 o9Var) {
        this.b = o9Var;
    }
}
