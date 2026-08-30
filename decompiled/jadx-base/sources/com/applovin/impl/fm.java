package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class fm extends com.applovin.impl.yl {
    private static org.json.JSONObject m;
    private static final java.lang.Object n = new java.lang.Object();
    private static final java.util.Map o = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.lang.String h;
    private final com.applovin.mediation.MaxAdFormat i;
    private final java.util.Map j;
    private final android.content.Context k;
    private final com.applovin.impl.fm.b l;

    public interface b {
        void a(org.json.JSONArray jSONArray);
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONArray jSONArray;
        try {
            synchronized (n) {
                jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(m, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (o.size() > 0) {
                    b(jSONArray, m);
                    return;
                } else {
                    a(jSONArray, m);
                    return;
                }
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.k(this.b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) this.f1547a.a(com.applovin.impl.uj.F, com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON));
            org.json.JSONArray jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (o.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (java.lang.Throwable) null);
        } catch (java.lang.InterruptedException e) {
            a("Failed to wait for signals", e);
            this.f1547a.D().a("TaskCollectSignals", "waitForSignals", e);
        } catch (org.json.JSONException e2) {
            a("Failed to parse signals JSON", e2);
            this.f1547a.D().a("TaskCollectSignals", "parseSignalsJSON", e2);
        } catch (java.lang.Throwable th) {
            a("Failed to collect signals", th);
            this.f1547a.D().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    public fm(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.util.Map map, android.content.Context context, com.applovin.impl.sdk.j jVar, com.applovin.impl.fm.b bVar) {
        super("TaskCollectSignals", jVar);
        this.h = str;
        this.i = maxAdFormat;
        this.j = map;
        this.k = context;
        this.l = bVar;
    }

    private void a(final com.applovin.impl.zj zjVar, final com.applovin.impl.yj.a aVar) {
        if (zjVar.r()) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.fm$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(zjVar, aVar);
                }
            });
        } else {
            this.f1547a.P().collectSignal(this.h, this.i, zjVar, this.k, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.zj zjVar, com.applovin.impl.yj.a aVar) {
        this.f1547a.P().collectSignal(this.h, this.i, zjVar, this.k, aVar);
    }

    private void b(org.json.JSONArray jSONArray, org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.Set set = (java.util.Set) o.get(this.h);
        if (set != null && !set.isEmpty()) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (set.contains(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject2, "name", null))) {
                    jSONArray2.put(jSONObject2);
                }
            }
            a(jSONArray2, jSONObject);
            return;
        }
        a("No signal providers found for ad unit: " + this.h, (java.lang.Throwable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements com.applovin.impl.yj.a, java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.fm.b f791a;
        private final java.lang.Object b;
        private int c;
        private final java.util.concurrent.atomic.AtomicBoolean d;
        private final java.util.Collection f;
        private final com.applovin.impl.sdk.j g;
        private final com.applovin.impl.sdk.n h;

        private c(int i, com.applovin.impl.fm.b bVar, com.applovin.impl.sdk.j jVar) {
            this.c = i;
            this.f791a = bVar;
            this.g = jVar;
            this.h = jVar.I();
            this.b = new java.lang.Object();
            this.f = new java.util.ArrayList(i);
            this.d = new java.util.concurrent.atomic.AtomicBoolean();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.compareAndSet(false, true)) {
                a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            java.util.ArrayList<com.applovin.impl.yj> arrayList;
            synchronized (this.b) {
                arrayList = new java.util.ArrayList(this.f);
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (com.applovin.impl.yj yjVar : arrayList) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    com.applovin.impl.zj zjVarF = yjVar.f();
                    jSONObject.put("name", zjVarF.c());
                    jSONObject.put("class", zjVarF.b());
                    jSONObject.put("adapter_version", yjVar.a());
                    jSONObject.put("sdk_version", yjVar.d());
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    com.applovin.mediation.MaxError maxErrorC = yjVar.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", yjVar.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", yjVar.b());
                    jSONObject2.put("is_cached", yjVar.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.n.a()) {
                        this.h.a("TaskCollectSignals", "Collected signal from " + zjVarF);
                    }
                } catch (org.json.JSONException e) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.h.a("TaskCollectSignals", "Failed to create signal data", e);
                    }
                    this.g.D().a("TaskCollectSignals", "createSignalsData", e);
                }
            }
            a(jSONArray);
        }

        private void a(org.json.JSONArray jSONArray) {
            com.applovin.impl.fm.b bVar = this.f791a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }

        @Override // com.applovin.impl.yj.a
        public void a(com.applovin.impl.yj yjVar) {
            boolean z;
            synchronized (this.b) {
                this.f.add(yjVar);
                int i = this.c - 1;
                this.c = i;
                z = i < 1;
            }
            if (z && this.d.compareAndSet(false, true)) {
                if (com.applovin.impl.yp.h() && ((java.lang.Boolean) this.g.a(com.applovin.impl.sj.R)).booleanValue()) {
                    this.g.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.g, "handleSignalCollectionCompleted", new java.lang.Runnable() { // from class: com.applovin.impl.fm$c$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a();
                        }
                    }), com.applovin.impl.tm.b.MEDIATION);
                } else {
                    a();
                }
            }
        }
    }

    private void a(org.json.JSONArray jSONArray, org.json.JSONObject jSONObject) throws org.json.JSONException {
        com.applovin.impl.fm.c cVar = new com.applovin.impl.fm.c(jSONArray.length(), this.l, this.f1547a);
        this.f1547a.i0().a(new com.applovin.impl.jn(this.f1547a, "timeoutCollectSignal", cVar), com.applovin.impl.tm.b.TIMEOUT, ((java.lang.Long) this.f1547a.a(com.applovin.impl.ue.M6)).longValue());
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new com.applovin.impl.zj(this.j, jSONArray.getJSONObject(i), jSONObject, this.f1547a), cVar);
        }
    }

    public static void a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        try {
            org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (org.json.JSONObject) null);
            if (jSONObject2 != null) {
                for (java.lang.String str : com.applovin.impl.sdk.utils.JsonUtils.toList(jSONObject2.names())) {
                    o.put(str, new java.util.HashSet(com.applovin.impl.sdk.utils.JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e);
            jVar.D().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e);
        }
    }

    private void a(java.lang.String str, java.lang.Throwable th) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "No signals collected: " + str, th);
        }
        com.applovin.impl.fm.b bVar = this.l;
        if (bVar != null) {
            bVar.a(new org.json.JSONArray());
        }
    }

    public static void a(org.json.JSONObject jSONObject) {
        synchronized (n) {
            m = jSONObject;
        }
    }
}
