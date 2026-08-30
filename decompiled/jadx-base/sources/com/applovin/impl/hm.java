package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hm extends com.applovin.impl.yl {
    protected final com.applovin.impl.h0 h;
    private final java.lang.String i;

    protected abstract com.applovin.impl.yl a(org.json.JSONObject jSONObject);

    protected abstract java.lang.String e();

    protected abstract java.lang.String f();

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.vi.a aVarA;
        java.util.Map map;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Fetching next ad of zone: " + this.h);
        }
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.S3)).booleanValue() && com.applovin.impl.yp.j() && com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "User is connected to a VPN");
        }
        com.applovin.impl.yp.a(this.f1547a, this.b);
        org.json.JSONObject jSONObject = null;
        this.f1547a.D().a(com.applovin.impl.ka.f, this.h, (com.applovin.impl.sdk.AppLovinError) null);
        com.applovin.impl.ca caVarC = this.f1547a.C();
        caVarC.c(com.applovin.impl.ba.d);
        com.applovin.impl.ba baVar = com.applovin.impl.ba.g;
        if (caVarC.b(baVar) == 0) {
            caVarC.b(baVar, java.lang.System.currentTimeMillis());
        }
        try {
            org.json.JSONObject andResetCustomPostBody = this.f1547a.j().getAndResetCustomPostBody();
            java.lang.String str = "POST";
            if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.j3)).booleanValue()) {
                com.applovin.impl.vi.a aVarA2 = com.applovin.impl.vi.a.a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.i5)).intValue());
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(this.f1547a.x().a(h(), false, true));
                map = new java.util.HashMap();
                if (!((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.r5)).booleanValue() && !((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.n5)).booleanValue()) {
                    map.put("rid", java.util.UUID.randomUUID().toString());
                }
                if (!((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.a5)).booleanValue()) {
                    map.put(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1547a.a0());
                }
                com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObject2, andResetCustomPostBody);
                aVarA = aVarA2;
                jSONObject = jSONObject2;
            } else {
                aVarA = com.applovin.impl.vi.a.a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.j5)).intValue());
                java.util.Map mapA = com.applovin.impl.yp.a(this.f1547a.x().a(h(), false, false));
                if (andResetCustomPostBody != null) {
                    jSONObject = andResetCustomPostBody;
                } else {
                    str = "GET";
                }
                map = mapA;
            }
            if (com.applovin.impl.yp.f(a())) {
                map.putAll(this.f1547a.j().getAndResetCustomQueryParams());
            }
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.i)) {
                map.put("sts", this.i);
            }
            a(caVarC);
            com.applovin.impl.sdk.network.a.C0055a c0055aF = com.applovin.impl.sdk.network.a.a(this.f1547a).b(f()).a(e()).b(map).c(str).a(g()).a((java.lang.Object) new org.json.JSONObject()).a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.Y2)).intValue()).c(((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.Z2)).booleanValue()).d(((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.a3)).booleanValue()).c(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.X2)).intValue()).a(aVarA).f(true);
            if (jSONObject != null) {
                c0055aF.a(jSONObject);
                c0055aF.b(((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.B5)).booleanValue());
            }
            com.applovin.impl.hm.a aVar = new com.applovin.impl.hm.a(c0055aF.a(), this.f1547a);
            aVar.c(com.applovin.impl.sj.r0);
            aVar.b(com.applovin.impl.sj.s0);
            this.f1547a.i0().a(aVar);
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Unable to fetch ad for zone id: " + this.h, th);
            }
            a(0, th.getMessage());
        }
    }

    public hm(com.applovin.impl.h0 h0Var, java.lang.String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
        this.h = h0Var;
        this.i = jVar.b();
    }

    class a extends com.applovin.impl.dn {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, org.json.JSONObject jSONObject) {
            com.applovin.impl.hm.this.a(i, str2);
            this.f1547a.D().a("fetchAd", str, i, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("error_message", str2));
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, org.json.JSONObject jSONObject, int i) {
            if (i == 200) {
                com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.m.a());
                com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.m.b());
                java.util.HashMap map = new java.util.HashMap(5);
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("url", com.applovin.impl.sdk.utils.StringUtils.getHost(str), map);
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("code", java.lang.String.valueOf(i), map);
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_zone_id", com.applovin.impl.hm.this.h.e(), map);
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("latency_ms", java.lang.String.valueOf(this.m.a()), map);
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("response_size", java.lang.String.valueOf(this.m.b()), map);
                this.f1547a.D().a(com.applovin.impl.ka.g, (java.util.Map) map);
                com.applovin.impl.hm.this.b(jSONObject);
                return;
            }
            com.applovin.impl.hm.this.a(i, com.applovin.mediation.adapter.MaxAdapterError.NO_FILL.getErrorMessage());
        }
    }

    private java.util.Map g() {
        java.util.HashMap map = new java.util.HashMap(3);
        map.put("AppLovin-Zone-Id", this.h.e());
        if (this.h.f() != null) {
            map.put("AppLovin-Ad-Size", this.h.f().getLabel());
        }
        if (this.h.g() != null) {
            map.put("AppLovin-Ad-Type", this.h.g().getLabel());
        }
        return map;
    }

    protected java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap(4);
        map.put(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.ZONE_ID, this.h.e());
        if (this.h.f() != null) {
            map.put("size", this.h.f().getLabel());
        }
        if (this.h.g() != null) {
            map.put("require", this.h.g().getLabel());
        }
        return map;
    }

    protected void b(org.json.JSONObject jSONObject) {
        com.applovin.impl.e4.c(jSONObject, this.f1547a);
        com.applovin.impl.e4.b(jSONObject, this.f1547a);
        com.applovin.impl.e4.a(jSONObject, this.f1547a);
        com.applovin.impl.h0.a(jSONObject);
        this.f1547a.i0().a(a(jSONObject));
    }

    private void a(com.applovin.impl.ca caVar) {
        com.applovin.impl.ba baVar = com.applovin.impl.ba.g;
        long jB = caVar.b(baVar);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis - jB > java.util.concurrent.TimeUnit.MINUTES.toMillis(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.u3)).intValue())) {
            caVar.b(baVar, jCurrentTimeMillis);
            caVar.a(com.applovin.impl.ba.h);
            caVar.a(com.applovin.impl.ba.i);
        }
    }

    protected void a(int i, java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "Unable to fetch " + this.h + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f1547a.C().c(com.applovin.impl.ba.m);
        }
        this.f1547a.D().a(com.applovin.impl.ka.h, this.h, new com.applovin.impl.sdk.AppLovinError(i, str));
    }
}
