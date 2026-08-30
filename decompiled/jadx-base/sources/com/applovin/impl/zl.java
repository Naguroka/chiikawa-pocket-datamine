package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class zl extends com.applovin.impl.yl {
    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d(this.b, "Submitting user data...");
        }
        java.util.Map mapC = com.applovin.impl.e4.c(this.f1547a);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        c(jSONObject);
        b(jSONObject);
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.t5)).booleanValue() || ((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.n5)).booleanValue()) {
            com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObject, (java.util.Map<java.lang.String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    zl(com.applovin.impl.sdk.j jVar) {
        super("TaskApiSubmitData", jVar);
    }

    private void c(org.json.JSONObject jSONObject) {
        com.applovin.impl.sdk.k kVarX = this.f1547a.x();
        java.util.Map mapM = kVarX.m();
        com.applovin.impl.yp.a(com.json.ce.A, "type", mapM);
        com.applovin.impl.yp.a("api_level", "sdk_version", mapM);
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject, "device_info", new org.json.JSONObject(mapM));
        java.util.Map mapB = kVarX.B();
        com.applovin.impl.yp.a("sdk_version", "applovin_sdk_version", mapB);
        com.applovin.impl.yp.a("ia", "installed_at", mapB);
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject, "app_info", new org.json.JSONObject(mapB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "results", new org.json.JSONArray()), 0, new org.json.JSONObject());
        this.f1547a.g0().a(com.applovin.impl.sj.g, com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f1547a.g0().a(com.applovin.impl.sj.k, com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject2, "device_token", ""));
        com.applovin.impl.e4.a(jSONObject2, this.f1547a);
        this.f1547a.C().b();
    }

    private void b(org.json.JSONObject jSONObject) {
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.B4)).booleanValue()) {
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObjectIfValid(jSONObject, "stats", this.f1547a.C().c());
        }
    }

    class a extends com.applovin.impl.dn {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, org.json.JSONObject jSONObject) {
            com.applovin.impl.e4.a(i, this.f1547a);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, org.json.JSONObject jSONObject, int i) {
            com.applovin.impl.zl.this.a(jSONObject);
        }
    }

    private void a(java.util.Map map, org.json.JSONObject jSONObject) {
        com.applovin.impl.zl.a aVar = new com.applovin.impl.zl.a(com.applovin.impl.sdk.network.a.a(this.f1547a).b(com.applovin.impl.e4.b("2.0/device", this.f1547a)).a(com.applovin.impl.e4.a("2.0/device", this.f1547a)).b(map).a(jSONObject).c("POST").b(((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.A5)).booleanValue()).a((java.lang.Object) new org.json.JSONObject()).a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.b3)).intValue()).a(com.applovin.impl.vi.a.a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.l5)).intValue())).a(), this.f1547a);
        aVar.c(com.applovin.impl.sj.t0);
        aVar.b(com.applovin.impl.sj.u0);
        this.f1547a.i0().a(aVar);
    }
}
