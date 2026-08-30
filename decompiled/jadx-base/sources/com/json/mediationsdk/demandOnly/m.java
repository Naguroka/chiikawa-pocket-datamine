package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.json.mediationsdk.AbstractAdapter f2967a;
    protected com.json.z2 b;
    protected org.json.JSONObject c;
    private com.ironsource.mediationsdk.demandOnly.m.a d;
    private java.util.Timer e;
    long f;
    protected java.lang.String g;
    protected org.json.JSONObject h;
    protected java.util.List<java.lang.String> i;
    protected java.lang.String j;
    private final java.lang.Object k = new java.lang.Object();
    private final java.lang.Object l = new java.lang.Object();
    protected final com.ironsource.mediationsdk.IronSource.AD_UNIT m;

    protected enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(com.json.z2 z2Var, com.json.mediationsdk.AbstractAdapter abstractAdapter) {
        this.b = z2Var;
        this.m = z2Var.b();
        this.f2967a = abstractAdapter;
        org.json.JSONObject jSONObjectC = z2Var.c();
        this.c = jSONObjectC;
        try {
            jSONObjectC.put(com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
        }
        this.d = com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED;
        this.e = null;
        this.g = "";
        this.h = null;
        this.i = new java.util.ArrayList();
    }

    com.ironsource.mediationsdk.demandOnly.m.a a(com.ironsource.mediationsdk.demandOnly.m.a[] aVarArr, com.ironsource.mediationsdk.demandOnly.m.a aVar) {
        com.ironsource.mediationsdk.demandOnly.m.a aVar2;
        synchronized (this.k) {
            aVar2 = this.d;
            if (java.util.Arrays.asList(aVarArr).contains(this.d)) {
                b(aVar);
            }
        }
        return aVar2;
    }

    public void a(java.lang.String str) {
        this.g = str;
    }

    protected void a(java.util.List<java.lang.String> list, java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator it = ((java.util.List) com.json.ak.a((java.util.ArrayList) list, new java.util.ArrayList())).iterator();
        while (it.hasNext()) {
            com.json.mediationsdk.d.b().a(str3, str, com.json.mediationsdk.d.b().a((java.lang.String) it.next(), str, i, str2, "", "", "", ""));
        }
    }

    void a(java.util.TimerTask timerTask) {
        synchronized (this.l) {
            p();
            java.util.Timer timer = new java.util.Timer();
            this.e = timer;
            timer.schedule(timerTask, this.f);
        }
    }

    public void a(org.json.JSONObject jSONObject) {
        this.h = jSONObject;
    }

    public void a(boolean z) {
        try {
            this.c.put("isOneFlow", z);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z + ". Error: " + e.getMessage());
        }
    }

    boolean a(com.ironsource.mediationsdk.demandOnly.m.a aVar) {
        boolean z;
        synchronized (this.k) {
            z = this.d == aVar;
        }
        return z;
    }

    boolean a(com.ironsource.mediationsdk.demandOnly.m.a aVar, com.ironsource.mediationsdk.demandOnly.m.a aVar2) {
        synchronized (this.k) {
            if (this.d != aVar) {
                return false;
            }
            b(aVar2);
            return true;
        }
    }

    void b(com.ironsource.mediationsdk.demandOnly.m.a aVar) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("DemandOnlySmash " + this.b.f() + ": current state=" + this.d + ", new state=" + aVar);
        synchronized (this.k) {
            this.d = aVar;
        }
    }

    public void b(java.lang.String str) {
        this.j = com.json.mediationsdk.d.b().c(str);
    }

    public com.json.z2 f() {
        return this.b;
    }

    public java.lang.String g() {
        return this.g;
    }

    public java.lang.String h() {
        return this.b.f();
    }

    public int i() {
        return this.b.d();
    }

    public java.util.Map<java.lang.String, java.lang.Object> j() {
        java.util.HashMap map = new java.util.HashMap();
        try {
            com.json.mediationsdk.AbstractAdapter abstractAdapter = this.f2967a;
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            com.json.mediationsdk.AbstractAdapter abstractAdapter2 = this.f2967a;
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.b.i());
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            map.put("instanceType", java.lang.Integer.valueOf(this.b.d()));
            if (!android.text.TextUtils.isEmpty(this.g)) {
                map.put("auctionId", this.g);
            }
            org.json.JSONObject jSONObject = this.h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.h);
            }
            if (!android.text.TextUtils.isEmpty(this.j)) {
                map.put("dynamicDemandSource", this.j);
            }
            if (o()) {
                map.put("isOneFlow", 1);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e);
        }
        return map;
    }

    java.lang.String k() {
        com.ironsource.mediationsdk.demandOnly.m.a aVar = this.d;
        return aVar == null ? "null" : aVar.toString();
    }

    public java.lang.String l() {
        return this.b.i();
    }

    public java.util.List<java.lang.String> m() {
        return this.i;
    }

    public boolean n() {
        return this.b.j();
    }

    public boolean o() {
        return this.c.optBoolean("isOneFlow", false);
    }

    void p() {
        synchronized (this.l) {
            java.util.Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
        }
    }
}
