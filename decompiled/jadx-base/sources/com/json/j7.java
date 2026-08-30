package com.json;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j7<Listener extends com.json.g2> extends com.json.n7<Listener> implements com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener {

    class a extends com.json.dr {
        a() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.j7.this.P();
        }
    }

    class b extends com.json.dr {
        b() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.j7.this.S();
        }
    }

    class c extends com.json.dr {
        c() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.j7.this.Q();
        }
    }

    class d extends com.json.dr {
        d() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.j7.this.T();
        }
    }

    class e extends com.json.dr {
        e() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.j7.this.R();
        }
    }

    class f extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2813a;
        final /* synthetic */ java.lang.String b;

        f(int i, java.lang.String str) {
            this.f2813a = i;
            this.b = str;
        }

        @Override // com.json.dr
        public void a() {
            com.json.j7.this.b(this.f2813a, this.b);
        }
    }

    public j7(com.json.pp ppVar, com.json.j1 j1Var, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter, com.json.z2 z2Var, com.json.j5 j5Var, Listener listener) {
        super(ppVar, j1Var, baseAdAdapter, z2Var, j5Var, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.q) {
            if (this.e != com.ironsource.n7.h.SHOWING) {
                ironLog.error("unexpected ad closed for " + k() + " - state = " + this.e);
                com.json.b2 b2Var = this.d;
                if (b2Var != null) {
                    b2Var.k.k("unexpected ad closed - state = " + this.e);
                }
                return;
            }
            a(com.ironsource.n7.h.NONE);
            if (this.d != null) {
                java.lang.String str = "";
                if (this.f3063a.a() == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
                    java.lang.String strD = ((com.json.g2) this.b).d();
                    str = "otherInstanceAvailable = " + (strD.length() > 0 ? "true|" + strD : "false");
                }
                this.d.j.a(j(), str);
            }
            ((com.json.g2) this.b).a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        com.json.b2 b2Var = this.d;
        if (b2Var != null) {
            b2Var.j.d(j());
        }
        ((com.json.g2) this.b).c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        com.json.b2 b2Var = this.d;
        if (b2Var != null) {
            b2Var.j.l(j());
        }
        ((com.json.g2) this.b).b((com.json.j7<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        com.json.b2 b2Var = this.d;
        if (b2Var != null) {
            b2Var.j.i(j());
        }
        ((com.json.g2) this.b).d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        com.json.b2 b2Var = this.d;
        if (b2Var != null) {
            b2Var.j.k(j());
        }
    }

    static java.lang.String a(com.ironsource.n7.h hVar, int i, java.lang.String str) {
        return java.lang.String.format(java.util.Locale.ENGLISH, "unexpected show failed, state - %s, error - %d %s", hVar, java.lang.Integer.valueOf(i), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        com.ironsource.n7.h hVar = this.e;
        if (hVar == com.ironsource.n7.h.SHOWING) {
            a(com.ironsource.n7.h.FAILED);
            com.json.b2 b2Var = this.d;
            if (b2Var != null) {
                b2Var.j.a(j(), i, str, "");
            }
            ((com.json.g2) this.b).a(new com.json.mediationsdk.logger.IronSourceError(i, str), (com.json.j7<?>) this);
            return;
        }
        java.lang.String strA = a(hVar, i, str);
        ironLog.error(a(strA));
        com.json.b2 b2Var2 = this.d;
        if (b2Var2 != null) {
            b2Var2.k.s(strA);
        }
    }

    @Override // com.json.n7
    public boolean B() {
        if (this.k == null || !y()) {
            return false;
        }
        try {
            java.lang.Object obj = this.c;
            if (obj instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) {
                return ((com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) obj).isAdAvailable(this.k);
            }
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
            com.json.b2 b2Var = this.d;
            if (b2Var != null) {
                b2Var.k.g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "isReadyToShow - exception = " + th.getMessage() + " - state = " + this.e;
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            com.json.b2 b2Var2 = this.d;
            if (b2Var2 != null) {
                b2Var2.k.g(str);
            }
        }
    }

    public void a(android.app.Activity activity, com.json.mediationsdk.model.Placement placement) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + placement.getCom.ironsource.op.d java.lang.String()));
        try {
            this.g = placement;
            a(com.ironsource.n7.h.SHOWING);
            this.d.j.a(activity, j());
            java.lang.Object obj = this.c;
            if (obj instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) {
                ((com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) obj).showAd(this.k, this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                com.json.b2 b2Var = this.d;
                if (b2Var != null) {
                    b2Var.k.g("showAd - adapter not instance of AdapterAdFullScreenInterface");
                }
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            a(com.ironsource.n7.h.FAILED);
            java.lang.String str = "showAd - exception = " + th.getMessage() + " - state = " + this.e;
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            com.json.b2 b2Var2 = this.d;
            if (b2Var2 != null) {
                b2Var2.k.g(str);
            }
            onAdShowFailed(com.json.x1.h(this.f3063a.a()), str);
        }
    }

    public void b(boolean z) {
        com.json.b2 b2Var = this.d;
        if (b2Var != null) {
            b2Var.j.a(z);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (u().c()) {
            u().a(new com.ironsource.j7.a());
        } else {
            P();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (u().c()) {
            u().a(new com.ironsource.j7.c());
        } else {
            Q();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i, java.lang.String str) {
        if (u().c()) {
            u().a(new com.ironsource.j7.f(i, str));
        } else {
            b(i, str);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        if (u().c()) {
            u().a(new com.ironsource.j7.e());
        } else {
            R();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (u().c()) {
            u().a(new com.ironsource.j7.b());
        } else {
            S();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (u().c()) {
            u().a(new com.ironsource.j7.d());
        } else {
            T();
        }
    }
}
