package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class y implements com.ironsource.uh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.json.mediationsdk.AbstractAdapter f3034a;
    protected com.json.z2 b;
    private boolean c;
    protected org.json.JSONObject d;
    protected java.lang.String e;
    protected int f;
    protected java.lang.Long g = null;

    y(com.json.z2 z2Var, com.json.mediationsdk.AbstractAdapter abstractAdapter) {
        this.b = z2Var;
        this.f3034a = abstractAdapter;
        this.d = z2Var.c();
    }

    private void a(java.lang.String str, int i) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, k() + " " + c() + " : " + str, i);
    }

    public void a(java.lang.String str) {
        a(str, 0);
    }

    public void a(boolean z) {
        this.c = z;
    }

    @Override // com.ironsource.uh.b
    public int b() {
        return this.b.e();
    }

    public void b(java.lang.String str) {
        a(str, 3);
    }

    @Override // com.ironsource.uh.b
    public java.lang.String c() {
        return this.b.f();
    }

    public void c(java.lang.String str) {
        this.e = com.json.mediationsdk.d.b().c(str);
    }

    public abstract com.ironsource.mediationsdk.IronSource.AD_UNIT d();

    public java.lang.Long e() {
        return this.g;
    }

    public java.lang.String f() {
        return java.lang.String.format("%s %s", i(), java.lang.Integer.valueOf(hashCode()));
    }

    public int g() {
        return this.b.d();
    }

    public boolean h() {
        return this.c;
    }

    public java.lang.String i() {
        return this.b.h().isMultipleInstances() ? this.b.h().getProviderTypeForReflection() : this.b.h().getProviderName();
    }

    public java.lang.String j() {
        return this.b.g();
    }

    public abstract java.lang.String k();

    public int l() {
        return 1;
    }

    public java.util.Map<java.lang.String, java.lang.Object> m() {
        java.util.HashMap map = new java.util.HashMap();
        try {
            com.json.mediationsdk.AbstractAdapter abstractAdapter = this.f3034a;
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            com.json.mediationsdk.AbstractAdapter abstractAdapter2 = this.f3034a;
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.b.i());
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            map.put("instanceType", java.lang.Integer.valueOf(p() ? 2 : 1));
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, java.lang.Integer.valueOf(l()));
            if (!android.text.TextUtils.isEmpty(this.e)) {
                map.put("dynamicDemandSource", this.e);
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th);
        }
        return map;
    }

    public int n() {
        return this.f;
    }

    public boolean o() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f3034a.isUsingActivityBeforeImpression(d())) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th.getLocalizedMessage());
            return true;
        }
    }

    public boolean p() {
        return this.b.j();
    }

    public void q() {
        try {
            com.json.mediationsdk.AbstractAdapter abstractAdapter = this.f3034a;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.b.b(), this.d);
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception - " + th.getMessage());
        }
        this.f3034a = null;
    }

    public boolean r() {
        if (o()) {
            return false;
        }
        return p() || s();
    }

    public boolean s() {
        return this.b.k();
    }
}
