package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class lm extends com.applovin.impl.yl {
    private final java.lang.String h;
    private final com.applovin.mediation.MaxAdFormat i;
    private final java.util.Map j;
    private final java.util.Map k;
    private final java.util.Map l;
    private final org.json.JSONArray m;
    private final android.content.Context n;
    private final com.applovin.impl.mediation.ads.a.InterfaceC0040a o;

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Fetching next ad for " + this.i.getLabel() + " ad unit " + this.h);
        }
        com.applovin.impl.ob.a();
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.S3)).booleanValue() && com.applovin.impl.yp.j() && com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "User is connected to a VPN");
        }
        this.f1547a.D().a(com.applovin.impl.ka.B, this.i, this.h, (com.applovin.mediation.MaxError) null);
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.C4)).booleanValue()) {
            com.applovin.impl.xe xeVarQ = this.f1547a.Q();
            com.applovin.impl.ve veVar = com.applovin.impl.ve.c;
            xeVarQ.a(veVar, com.applovin.impl.we.a(this.h));
            xeVarQ.a(veVar, com.applovin.impl.we.a(this.i));
        }
        com.applovin.impl.yp.a(this.f1547a, this.b);
        com.applovin.impl.ca caVarC = this.f1547a.C();
        caVarC.c(com.applovin.impl.ba.s);
        com.applovin.impl.ba baVar = com.applovin.impl.ba.g;
        if (caVarC.b(baVar) == 0) {
            caVarC.b(baVar, java.lang.System.currentTimeMillis());
        }
        try {
            org.json.JSONObject jSONObjectG = g();
            java.util.HashMap map = new java.util.HashMap();
            if (!((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.p5)).booleanValue() && !((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.n5)).booleanValue()) {
                map.put("rid", java.util.UUID.randomUUID().toString());
            }
            if (!((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.a5)).booleanValue()) {
                map.put(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1547a.a0());
            }
            if (this.f1547a.k0().c()) {
                map.put("test_mode", "1");
            }
            java.util.List listB = this.f1547a.k0().b();
            java.lang.String str = this.f1547a.f0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                java.lang.String strM = kotlin.UByte$$ExternalSyntheticBackport0.m(",", listB);
                map.put("filter_ad_network", strM);
                if (!this.f1547a.k0().c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f1547a.k0().d()) {
                    map.put("force_ad_network", strM);
                }
            } else if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            a(caVarC);
            com.applovin.impl.lm.a aVar = new com.applovin.impl.lm.a(com.applovin.impl.sdk.network.a.a(this.f1547a).c("POST").a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((java.lang.Boolean) this.f1547a.a(com.applovin.impl.ue.N7)).booleanValue()).a((java.lang.Object) new org.json.JSONObject()).c(((java.lang.Long) this.f1547a.a(com.applovin.impl.ue.I6)).intValue()).a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.Y2)).intValue()).b(((java.lang.Long) this.f1547a.a(com.applovin.impl.ue.H6)).intValue()).a(com.applovin.impl.vi.a.a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.g5)).intValue())).f(true).a(), this.f1547a);
            aVar.c(com.applovin.impl.ue.F6);
            aVar.b(com.applovin.impl.ue.G6);
            this.f1547a.i0().a(aVar);
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Unable to fetch ad for Ad Unit ID: " + this.h, th);
            }
            a("", 0, th.getMessage());
        }
    }

    public lm(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.util.Map map, java.util.Map map2, java.util.Map map3, org.json.JSONArray jSONArray, android.content.Context context, com.applovin.impl.sdk.j jVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        super("TaskFetchMediatedAd", jVar, str);
        this.h = str;
        this.i = maxAdFormat;
        this.j = map;
        this.k = map2;
        this.l = map3;
        this.m = jSONArray;
        this.n = context;
        this.o = interfaceC0040a;
    }

    class a extends com.applovin.impl.dn {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, org.json.JSONObject jSONObject) {
            com.applovin.impl.lm.this.a(str, i, str2);
            this.f1547a.D().a("fetchMediatedAd", str, i, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("error_message", str2));
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, org.json.JSONObject jSONObject, int i) {
            if (i != 200) {
                com.applovin.impl.lm.this.a(str, i, null);
                return;
            }
            com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.m.a());
            com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.m.b());
            java.util.HashMap map = new java.util.HashMap(6);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("url", com.applovin.impl.sdk.utils.StringUtils.getHost(str), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("code", java.lang.String.valueOf(i), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_unit_id", com.applovin.impl.lm.this.h, map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.applovin.impl.lm.this.i.getLabel(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("latency_ms", java.lang.String.valueOf(this.m.a()), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("response_size", java.lang.String.valueOf(this.m.b()), map);
            this.f1547a.D().a(com.applovin.impl.ka.C, (java.util.Map) map);
            com.applovin.impl.lm.this.b(jSONObject);
        }
    }

    private java.lang.String f() {
        return com.applovin.impl.pe.b(this.f1547a);
    }

    private java.lang.String e() {
        return com.applovin.impl.pe.a(this.f1547a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(org.json.JSONObject jSONObject) {
        try {
            com.applovin.impl.e4.c(jSONObject, this.f1547a);
            com.applovin.impl.e4.b(jSONObject, this.f1547a);
            com.applovin.impl.e4.a(jSONObject, this.f1547a);
            com.applovin.impl.pe.f(jSONObject, this.f1547a);
            com.applovin.impl.pe.d(jSONObject, this.f1547a);
            com.applovin.impl.pe.e(jSONObject, this.f1547a);
            com.applovin.impl.pe.g(jSONObject, this.f1547a);
            com.applovin.impl.u0.b(this.f1547a);
            com.applovin.mediation.MaxAdFormat fromString = com.applovin.mediation.MaxAdFormat.formatFromString(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, null));
            if (this.i == fromString) {
                a(jSONObject);
                return;
            }
            java.lang.String label = fromString != null ? fromString.getLabel() : "UNKNOWN";
            java.lang.String str = "Incorrect format (" + label + ") loaded for (" + this.i.getLabel() + ") ad. Please verify if the ad unit ID (" + this.h + ") is assigned to the correct ad format.";
            if (com.applovin.impl.yp.a(this.i, fromString)) {
                com.applovin.impl.sdk.n.j(this.b, str);
                a(jSONObject);
                return;
            }
            com.applovin.impl.p6.a(str, new java.lang.Object[0]);
            com.applovin.impl.sdk.n.h(this.b, str);
            this.o.onAdLoadFailed(this.h, new com.applovin.mediation.adapter.MaxAdapterError(com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            java.util.HashMap<java.lang.String, java.lang.String> mapHashMap = com.applovin.impl.sdk.utils.CollectionUtils.hashMap("ad_unit_id", this.h);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("name", this.i.getLabel(), mapHashMap);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f1547a.D().a(com.applovin.impl.ka.V, "incompatible_ad_format", (java.util.Map) mapHashMap);
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Unable to process mediated ad response for ad unit " + this.h, th);
            }
            throw new java.lang.RuntimeException("Unable to process ad: " + th);
        }
    }

    private org.json.JSONObject g() throws org.json.JSONException {
        java.util.Map mapA = this.f1547a.x().a(null, false, true);
        mapA.putAll(this.l);
        org.json.JSONObject jSONObject = new org.json.JSONObject(mapA);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private void a(org.json.JSONObject jSONObject) {
        com.applovin.impl.yl xmVar;
        if (this.f1547a.a(com.applovin.impl.ue.A7, this.i)) {
            xmVar = new com.applovin.impl.wm(this.h, this.i, this.j, jSONObject, this.n, this.f1547a, this.o);
        } else {
            xmVar = new com.applovin.impl.xm(this.h, this.i, this.j, jSONObject, this.n, this.f1547a, this.o);
        }
        com.applovin.impl.yl ylVar = xmVar;
        long j = com.applovin.impl.sdk.utils.JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j > 0) {
            this.f1547a.i0().a(ylVar, com.applovin.impl.tm.b.MEDIATION, j, true);
        } else {
            this.f1547a.i0().a(ylVar);
        }
    }

    private void h(org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONArray jSONArray = this.m;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("AppLovin-Ad-Unit-Id", this.h);
        map.put("AppLovin-Ad-Format", this.i.getLabel());
        com.applovin.impl.sdk.utils.CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", this.k.get("retry_attempt"), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", this.k.get("retry_delay_sec"), map);
        return map;
    }

    private void c(org.json.JSONObject jSONObject) {
        org.json.JSONObject andResetCustomPostBodyData = this.f1547a.P().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !com.applovin.impl.yp.f(com.applovin.impl.sdk.j.m())) {
            return;
        }
        com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(org.json.JSONObject jSONObject) {
        if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.C4)).booleanValue()) {
            com.applovin.impl.xe xeVarQ = this.f1547a.Q();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            com.applovin.impl.ve veVar = com.applovin.impl.ve.c;
            com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObject3, (java.util.Map<java.lang.String, ?>) xeVarQ.a(veVar, com.applovin.impl.we.a.AD_UNIT_ID));
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObject4, (java.util.Map<java.lang.String, ?>) xeVarQ.a(veVar, com.applovin.impl.we.a.AD_FORMAT));
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObject5, (java.util.Map<java.lang.String, ?>) xeVarQ.a(com.applovin.impl.ve.d, com.applovin.impl.we.a.AD));
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private void f(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("disabled", new org.json.JSONArray(this.f1547a.L().a()));
            jSONObject2.put("installed", com.applovin.impl.ze.a(this.f1547a));
            jSONObject2.put("initialized", this.f1547a.K().b());
            jSONObject2.put("initialized_classnames", new org.json.JSONArray((java.util.Collection) this.f1547a.K().a()));
            jSONObject2.put("loaded_classnames", new org.json.JSONArray(this.f1547a.L().c()));
            jSONObject2.put("failed_classnames", new org.json.JSONArray(this.f1547a.L().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (java.lang.Exception e) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Failed to populate adapter classNames", e);
            }
            throw new java.lang.RuntimeException("Failed to populate classNames: " + e);
        }
    }

    private void e(org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("ad_unit_id", this.h);
        jSONObject2.put(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, this.i.getLabel());
        java.util.Map map = com.applovin.impl.sdk.utils.CollectionUtils.map(this.k);
        com.applovin.impl.sdk.o oVarS = this.f1547a.S();
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("previous_request_id", oVarS.b(this.h), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("previous_loaded_request_id", oVarS.a(this.h), map);
        com.applovin.impl.sdk.o.a aVarC = oVarS.c(this.h);
        if (aVarC != null) {
            if (java.lang.Boolean.parseBoolean(this.f1547a.f0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarC.a());
                map.put("previous_winning_network_name", aVarC.c());
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("second_previous_winning_network", aVarC.d(), map);
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("second_previous_winning_network_name", aVarC.e(), map);
            }
        }
        jSONObject2.put("extra_parameters", com.applovin.impl.sdk.utils.CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, int i, java.lang.String str2) {
        com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "Unable to fetch ad for ad unit " + this.h + ": server returned " + i);
        }
        if (i == -800) {
            this.f1547a.C().c(com.applovin.impl.ba.t);
        }
        if (i == -1009) {
            maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-1009, str2);
        } else if (i == -1001) {
            maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-1001, str2);
        } else if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new com.applovin.impl.mediation.MaxErrorImpl(-1);
        }
        java.util.HashMap map = new java.util.HashMap(5);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("url", com.applovin.impl.sdk.utils.StringUtils.getHost(str), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("code", java.lang.String.valueOf(i), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_message", str2, map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_unit_id", this.h, map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, this.i.getLabel(), map);
        this.f1547a.D().a(com.applovin.impl.ka.D, (java.util.Map) map);
        com.applovin.impl.fc.a(this.o, this.h, maxErrorImpl);
    }

    private void g(org.json.JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new org.json.JSONObject(this.f1547a.f0().getExtraParameters()));
    }
}
