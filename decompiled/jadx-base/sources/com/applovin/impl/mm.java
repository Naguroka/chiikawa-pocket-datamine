package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class mm extends com.applovin.impl.yl {
    private final com.applovin.impl.d4.e h;

    private org.json.JSONObject e() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", com.applovin.impl.ze.a(this.f1547a));
        com.applovin.impl.l0.a aVarF = this.f1547a.x().f();
        com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        return jSONObject;
    }

    public mm(com.applovin.impl.d4.e eVar, com.applovin.impl.sdk.j jVar) {
        super("TaskFetchMediationDebuggerInfo", jVar, true);
        this.h = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map mapF = f();
        org.json.JSONObject jSONObjectE = e();
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.q5)).booleanValue() || ((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.n5)).booleanValue()) {
            com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObjectE, (java.util.Map<java.lang.String, ?>) mapF);
            mapF = null;
        }
        com.applovin.impl.mm.a aVar = new com.applovin.impl.mm.a(com.applovin.impl.sdk.network.a.a(this.f1547a).c("POST").b(com.applovin.impl.pe.i(this.f1547a)).a(com.applovin.impl.pe.h(this.f1547a)).b(mapF).a(jSONObjectE).a((java.lang.Object) new org.json.JSONObject()).c(((java.lang.Long) this.f1547a.a(com.applovin.impl.ue.J6)).intValue()).a(com.applovin.impl.vi.a.a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.h5)).intValue())).a(), this.f1547a, d());
        aVar.c(com.applovin.impl.ue.F6);
        aVar.b(com.applovin.impl.ue.G6);
        this.f1547a.i0().a(aVar);
    }

    class a extends com.applovin.impl.dn {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z) {
            super(aVar, jVar, z);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, org.json.JSONObject jSONObject) {
            com.applovin.impl.mm.this.h.a(str, i, str2, jSONObject);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, org.json.JSONObject jSONObject, int i) {
            com.applovin.impl.mm.this.h.a(str, jSONObject, i);
        }
    }

    protected java.util.Map f() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("sdk_version", com.applovin.sdk.AppLovinSdk.VERSION);
        if (!((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.a5)).booleanValue()) {
            map.put(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1547a.a0());
        }
        java.util.Map mapB = this.f1547a.x().B();
        map.put(com.ironsource.y8.h.V, java.lang.String.valueOf(mapB.get(com.ironsource.y8.h.V)));
        map.put("app_version", java.lang.String.valueOf(mapB.get("app_version")));
        java.util.Map mapH = this.f1547a.x().H();
        map.put(com.json.ce.A, java.lang.String.valueOf(mapH.get(com.json.ce.A)));
        map.put(com.json.ce.y, java.lang.String.valueOf(mapH.get(com.json.ce.y)));
        return map;
    }
}
