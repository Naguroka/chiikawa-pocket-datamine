package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class in extends com.applovin.impl.yl {
    protected abstract void a(org.json.JSONObject jSONObject);

    protected abstract java.lang.String f();

    protected abstract int g();

    protected in(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
    }

    class a extends com.applovin.impl.dn {
        final /* synthetic */ com.applovin.impl.d4.e n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, com.applovin.impl.d4.e eVar) {
            super(aVar, jVar);
            this.n = eVar;
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, org.json.JSONObject jSONObject) {
            this.n.a(str, i, str2, jSONObject);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, org.json.JSONObject jSONObject, int i) {
            this.n.a(str, jSONObject, i);
        }
    }

    protected org.json.JSONObject e() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String strC = this.f1547a.o0().c();
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.C3)).booleanValue() && com.applovin.impl.sdk.utils.StringUtils.isValidString(strC)) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "cuid", strC);
        }
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.E3)).booleanValue()) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "compass_random_token", this.f1547a.r());
        }
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.G3)).booleanValue()) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "applovin_random_token", this.f1547a.Z());
        }
        a(jSONObject);
        return jSONObject;
    }

    protected void a(int i) {
        com.applovin.impl.e4.a(i, this.f1547a);
    }

    void a(org.json.JSONObject jSONObject, com.applovin.impl.d4.e eVar) {
        java.util.Map mapC = com.applovin.impl.e4.c(this.f1547a);
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.u5)).booleanValue() || ((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.n5)).booleanValue()) {
            com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObject, (java.util.Map<java.lang.String, ?>) mapC);
            mapC = null;
        }
        com.applovin.impl.in.a aVar = new com.applovin.impl.in.a(com.applovin.impl.sdk.network.a.a(this.f1547a).b(com.applovin.impl.e4.b(f(), this.f1547a)).a(com.applovin.impl.e4.a(f(), this.f1547a)).b(mapC).a(jSONObject).c("POST").b(((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.D5)).booleanValue()).a((java.lang.Object) new org.json.JSONObject()).a(g()).a(com.applovin.impl.vi.a.a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.m5)).intValue())).a(), this.f1547a, eVar);
        aVar.c(com.applovin.impl.sj.t0);
        aVar.b(com.applovin.impl.sj.u0);
        this.f1547a.i0().a(aVar);
    }
}
