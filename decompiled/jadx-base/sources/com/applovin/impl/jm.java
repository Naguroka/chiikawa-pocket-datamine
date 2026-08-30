package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class jm extends com.applovin.impl.yl {
    private static final java.util.concurrent.atomic.AtomicBoolean k = new java.util.concurrent.atomic.AtomicBoolean();
    private final int h;
    private final java.lang.Object i;
    private com.applovin.impl.jm.b j;

    public interface b {
        void a(org.json.JSONObject jSONObject);
    }

    protected org.json.JSONObject e() {
        java.util.List<java.lang.String> adUnitIds;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.applovin.impl.sdk.j jVar = this.f1547a;
            com.applovin.impl.sj sjVar = com.applovin.impl.sj.n5;
            if (((java.lang.Boolean) jVar.a(sjVar)).booleanValue() || ((java.lang.Boolean) this.f1547a.a(sjVar)).booleanValue()) {
                jSONObject.put("rid", java.util.UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", com.applovin.sdk.AppLovinSdk.VERSION);
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", com.applovin.impl.v.b());
            jSONObject.put("init_count", this.h);
            jSONObject.put("server_installed_at", this.f1547a.a(com.applovin.impl.sj.p));
            jSONObject.put("legacy", this.f1547a.x0().get());
            if (this.f1547a.t0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f1547a.r0()) {
                jSONObject.put("first_install_v2", true);
            }
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "process_name", com.applovin.impl.yp.b(a()));
            com.applovin.impl.sdk.utils.JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", com.applovin.impl.yp.g(a()));
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "plugin_version", (java.lang.String) this.f1547a.a(com.applovin.impl.sj.K3));
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f1547a.N());
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f1547a.y());
            jSONObject.put("installed_mediation_adapters", com.applovin.impl.ze.a(this.f1547a));
            java.util.Map mapB = this.f1547a.x().B();
            jSONObject.put(com.ironsource.y8.h.V, mapB.get(com.ironsource.y8.h.V));
            jSONObject.put("app_version", mapB.get("app_version"));
            jSONObject.put("debug", mapB.get("debug"));
            jSONObject.put("tg", mapB.get("tg"));
            jSONObject.put("target_sdk", mapB.get("target_sdk"));
            if (this.f1547a.x0().get()) {
                adUnitIds = this.f1547a.f0().getInitializationAdUnitIds();
            } else {
                adUnitIds = this.f1547a.G() != null ? this.f1547a.G().getAdUnitIds() : null;
            }
            if (adUnitIds != null && adUnitIds.size() > 0) {
                java.util.List<java.lang.String> listRemoveTrimmedEmptyStrings = com.applovin.impl.sdk.utils.CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", com.applovin.impl.sdk.utils.CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY, mapB.get(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY));
            jSONObject.put("IABTCF_gdprApplies", mapB.get("IABTCF_gdprApplies"));
            java.lang.Object obj = mapB.get("IABTCF_AddtlConsent");
            if (obj instanceof java.lang.String) {
                com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (java.lang.String) obj);
            }
            jSONObject.put("consent_flow_info", this.f1547a.u().c());
            java.util.Map mapH = this.f1547a.x().H();
            jSONObject.put(com.json.ce.A, mapH.get(com.json.ce.A));
            jSONObject.put(com.json.ce.y, mapH.get(com.json.ce.y));
            jSONObject.put("locale", mapH.get("locale"));
            jSONObject.put("brand", mapH.get("brand"));
            jSONObject.put("brand_name", mapH.get("brand_name"));
            jSONObject.put("hardware", mapH.get("hardware"));
            jSONObject.put(com.json.ce.v, mapH.get(com.json.ce.v));
            jSONObject.put("revision", mapH.get("revision"));
            jSONObject.put("is_tablet", mapH.get("is_tablet"));
            jSONObject.put("screen_size_in", mapH.get("screen_size_in"));
            jSONObject.put("supported_abis", mapH.get("supported_abis"));
            if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.V3)).booleanValue()) {
                jSONObject.put("mtl", this.f1547a.e0().getLastTrimMemoryLevel());
            }
            try {
                android.app.ActivityManager activityManager = (android.app.ActivityManager) com.applovin.impl.sdk.j.m().getSystemService("activity");
                android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (java.lang.Throwable unused) {
            }
            com.applovin.impl.l0.a aVarF = this.f1547a.x().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            java.lang.Boolean boolB = com.applovin.impl.a4.c().b(a());
            if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.H3)).booleanValue() && com.applovin.impl.sdk.utils.StringUtils.isValidString(aVarF.a()) && !java.lang.Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            com.applovin.impl.sdk.k.b bVarC = this.f1547a.x().C();
            if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.A3)).booleanValue() && bVarC != null && !java.lang.Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarC.f1300a);
                jSONObject.put("idfv_scope", bVarC.b);
            }
            if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.D3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f1547a.r());
            }
            if (((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.F3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f1547a.Z());
            }
            if (this.f1547a.k0().c()) {
                jSONObject.put("test_mode", true);
            }
            java.util.List listB = this.f1547a.k0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new org.json.JSONObject(this.f1547a.f0().getExtraParameters()));
            java.util.Map mapC0 = this.f1547a.c0();
            if (!com.applovin.impl.sdk.utils.CollectionUtils.isEmpty(mapC0)) {
                jSONObject.put("segments", new org.json.JSONObject(mapC0));
            }
            if (this.h > 1) {
                com.applovin.impl.sdk.array.ArrayService arrayServiceN = this.f1547a.n();
                if (arrayServiceN.getIsDirectDownloadEnabled() != null) {
                    jSONObject.put("ah_dd_enabled", arrayServiceN.getIsDirectDownloadEnabled());
                }
                jSONObject.put("ah_sdk_version_code", arrayServiceN.getAppHubVersionCode());
                jSONObject.put("ah_random_user_token", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(arrayServiceN.getRandomUserToken()));
                jSONObject.put("ah_sdk_package_name", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(arrayServiceN.getAppHubPackageName()));
            }
        } catch (org.json.JSONException e) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Failed to create JSON body", e);
            }
            this.f1547a.D().a(this.b, "createJSONBody", e);
        }
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.applovin.impl.z3.k() && k.compareAndSet(false, true)) {
            try {
                com.google.android.gms.security.ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.j.m());
            } catch (java.lang.Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Cannot update security provider", th);
                }
            }
        }
        java.util.Map mapH = h();
        com.applovin.impl.sdk.network.a.C0055a c0055aB = com.applovin.impl.sdk.network.a.a(this.f1547a).b(g()).a(f()).b(mapH).a(e()).b(((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.z5)).booleanValue()).c("POST").a((java.lang.Object) new org.json.JSONObject()).a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.e3)).intValue()).b(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.h3)).intValue());
        com.applovin.impl.sdk.j jVar = this.f1547a;
        com.applovin.impl.sj sjVar = com.applovin.impl.sj.d3;
        com.applovin.impl.sdk.network.a aVarA = c0055aB.c(((java.lang.Integer) jVar.a(sjVar)).intValue()).e(((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.q3)).booleanValue()).a(com.applovin.impl.vi.a.a(((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.f5)).intValue())).f(true).a();
        this.f1547a.i0().a(new com.applovin.impl.jm.c(this.f1547a), com.applovin.impl.tm.b.TIMEOUT, ((long) ((java.lang.Integer) this.f1547a.a(sjVar)).intValue()) + 250);
        com.applovin.impl.jm.a aVar = new com.applovin.impl.jm.a(aVarA, this.f1547a, d());
        aVar.c(com.applovin.impl.sj.p0);
        aVar.b(com.applovin.impl.sj.q0);
        this.f1547a.i0().a(aVar);
    }

    public jm(int i, com.applovin.impl.sdk.j jVar, com.applovin.impl.jm.b bVar) {
        super("TaskFetchBasicSettings", jVar, true);
        this.i = new java.lang.Object();
        this.h = i;
        this.j = bVar;
    }

    class a extends com.applovin.impl.dn {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z) {
            super(aVar, jVar, z);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, org.json.JSONObject jSONObject, int i) {
            com.applovin.impl.jm.this.a(jSONObject);
            this.f1547a.D().a("fetchBasicSettings", str, i);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, org.json.JSONObject jSONObject) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to fetch basic SDK settings: server returned " + i);
            }
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            com.applovin.impl.jm.this.a(jSONObject);
            this.f1547a.D().a("fetchBasicSettings", str, i, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("error_message", str2));
        }
    }

    protected java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        if (!((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.o5)).booleanValue() && !((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.n5)).booleanValue()) {
            map.put("rid", java.util.UUID.randomUUID().toString());
        }
        if (!((java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.a5)).booleanValue()) {
            map.put(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1547a.a0());
        }
        java.lang.Boolean boolB = com.applovin.impl.a4.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        java.lang.Boolean boolB2 = com.applovin.impl.a4.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        java.lang.Boolean boolB3 = com.applovin.impl.a4.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    private java.lang.String g() {
        return com.applovin.impl.e4.a((java.lang.String) this.f1547a.a(com.applovin.impl.sj.p0), "5.0/i", b());
    }

    private java.lang.String f() {
        return com.applovin.impl.e4.a((java.lang.String) this.f1547a.a(com.applovin.impl.sj.q0), "5.0/i", b());
    }

    private class c extends com.applovin.impl.yl {
        public c(com.applovin.impl.sdk.j jVar) {
            super("TaskTimeoutFetchBasicSettings", jVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.jm.this.j != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "Timing out fetch basic settings...");
                }
                com.applovin.impl.jm.this.a(new org.json.JSONObject());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(org.json.JSONObject jSONObject) {
        com.applovin.impl.jm.b bVar;
        synchronized (this.i) {
            bVar = this.j;
            this.j = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
