package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1060a;
    private final com.applovin.impl.sdk.n b;
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.Set d = new java.util.HashSet();
    private final java.lang.Object e = new java.lang.Object();
    private final org.json.JSONArray f = new org.json.JSONArray();
    private final java.util.LinkedHashMap g = new java.util.LinkedHashMap();
    private final java.lang.Object h = new java.lang.Object();
    private final java.util.Map i = new java.util.HashMap();
    private final java.util.Map j = new java.util.HashMap();
    private final java.lang.Object k = new java.lang.Object();
    private java.util.List l;

    public e(com.applovin.impl.sdk.j jVar) {
        this.f1060a = jVar;
        this.b = jVar.I();
    }

    public void b(com.applovin.impl.oe oeVar, android.app.Activity activity) {
        java.util.List list;
        if (((java.lang.Boolean) this.f1060a.a(com.applovin.impl.ue.J7)).booleanValue()) {
            a(oeVar, activity);
            return;
        }
        if (((java.lang.Boolean) this.f1060a.a(com.applovin.impl.ue.I7)).booleanValue()) {
            com.applovin.impl.oe oeVar2 = (com.applovin.impl.oe) this.i.get(oeVar.b());
            if (oeVar2 != null) {
                oeVar = oeVar2;
            }
        } else {
            if (this.f1060a.k0().c() && (list = this.l) != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        oeVar = null;
                        break;
                    }
                    com.applovin.impl.oe oeVar3 = (com.applovin.impl.oe) it.next();
                    if (oeVar3.b().equals(oeVar.b())) {
                        oeVar = oeVar3;
                        break;
                    }
                }
            }
            if (oeVar == null) {
                return;
            }
        }
        com.applovin.impl.mediation.g gVarA = this.f1060a.L().a(oeVar);
        if (gVarA != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.d("MediationAdapterInitializationManager", "Initializing adapter " + oeVar);
            }
            c(oeVar);
            gVarA.a(com.applovin.impl.mediation.MaxAdapterParametersImpl.a(oeVar), activity, (com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener) null);
            return;
        }
        com.applovin.impl.sdk.n.h("MediationAdapterInitializationManager", "Mediation adapter could not be initialized, double check that the adapter is included in your build. Adapter spec: " + oeVar);
    }

    void a(com.applovin.impl.oe oeVar, long j, com.applovin.mediation.adapter.MaxAdapter.InitializationStatus initializationStatus, java.lang.String str) {
        boolean z;
        if (initializationStatus == null || initializationStatus == com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.h) {
            z = !b(oeVar);
            if (z) {
                this.g.put(oeVar.b(), java.lang.Integer.valueOf(initializationStatus.getCode()));
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "class", oeVar.b());
                com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "init_status", java.lang.String.valueOf(initializationStatus.getCode()));
                com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "init_time_ms", j);
                com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "error_message", org.json.JSONObject.quote(str));
                this.f.put(jSONObject);
            }
        }
        if (z) {
            this.f1060a.a(oeVar);
            this.f1060a.P().processAdapterInitializationPostback(oeVar, j, initializationStatus, str);
            this.f1060a.q().a(initializationStatus, oeVar.b());
        }
    }

    private void c(com.applovin.impl.oe oeVar) {
        java.lang.String strB = oeVar.b();
        synchronized (this.e) {
            if (this.d.contains(strB)) {
                return;
            }
            this.d.add(strB);
            this.f1060a.D().a(com.applovin.impl.ka.w, com.applovin.impl.la.a(oeVar));
        }
    }

    public boolean c() {
        return this.c.get();
    }

    boolean b(com.applovin.impl.oe oeVar) {
        boolean zContainsKey;
        synchronized (this.h) {
            zContainsKey = this.g.containsKey(oeVar.b());
        }
        return zContainsKey;
    }

    public org.json.JSONArray b() {
        org.json.JSONArray jSONArrayShallowCopy;
        synchronized (this.h) {
            jSONArrayShallowCopy = com.applovin.impl.sdk.utils.JsonUtils.shallowCopy(this.f);
        }
        return jSONArrayShallowCopy;
    }

    private com.applovin.impl.oe a(com.applovin.impl.oe oeVar) {
        java.util.List<com.applovin.impl.oe> list;
        if (((java.lang.Boolean) this.f1060a.a(com.applovin.impl.ue.I7)).booleanValue()) {
            com.applovin.impl.oe oeVar2 = (com.applovin.impl.oe) this.i.get(oeVar.b());
            return oeVar2 != null ? oeVar2 : oeVar;
        }
        if (!this.f1060a.k0().c() || (list = this.l) == null) {
            return oeVar;
        }
        for (com.applovin.impl.oe oeVar3 : list) {
            if (oeVar3.b().equals(oeVar.b())) {
                return oeVar3;
            }
        }
        return null;
    }

    public com.applovin.impl.fi a(com.applovin.impl.oe oeVar, android.app.Activity activity) {
        com.applovin.impl.oe oeVarA = a(oeVar);
        if (oeVarA == null) {
            return com.applovin.impl.fi.a("AdapterInitialization:" + oeVar.c(), com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        java.lang.String strB = oeVar.b();
        synchronized (this.k) {
            com.applovin.impl.fi fiVar = (com.applovin.impl.fi) this.j.get(strB);
            if (fiVar != null && (!fiVar.d() || !oeVarA.q())) {
                return fiVar;
            }
            final com.applovin.impl.fi fiVar2 = new com.applovin.impl.fi("AdapterInitialization:" + oeVar.c());
            this.j.put(strB, fiVar2);
            com.applovin.impl.mediation.g gVarA = this.f1060a.L().a(oeVarA);
            if (gVarA == null) {
                fiVar2.a("Adapter implementation not found");
                return fiVar2;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.b.d("MediationAdapterInitializationManager", "Initializing adapter " + oeVarA);
            }
            c(oeVarA);
            gVarA.a(com.applovin.impl.mediation.MaxAdapterParametersImpl.a(oeVarA), activity, new com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.e$$ExternalSyntheticLambda0
                @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                public final void onCompletion(com.applovin.mediation.adapter.MaxAdapter.InitializationStatus initializationStatus, java.lang.String str) {
                    com.applovin.impl.mediation.e.a(fiVar2, initializationStatus, str);
                }
            });
            com.applovin.impl.an.a(oeVarA.m(), fiVar2, "The adapter (" + oeVar.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f1060a);
            return fiVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.fi fiVar, com.applovin.mediation.adapter.MaxAdapter.InitializationStatus initializationStatus, java.lang.String str) {
        if (initializationStatus != null && initializationStatus != com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                fiVar.a(str);
                return;
            } else {
                fiVar.b(initializationStatus);
                return;
            }
        }
        com.applovin.impl.p6.a("Adapters should never report a null or INITIALIZING status.", new java.lang.Object[0]);
        fiVar.a("Adapter reported INITIALIZING");
    }

    public void a(android.app.Activity activity) {
        if (this.c.compareAndSet(false, true)) {
            java.lang.String str = (java.lang.String) this.f1060a.a(com.applovin.impl.uj.G);
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    java.util.List<com.applovin.impl.oe> listA = a(com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, this.f1060a.k0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new org.json.JSONArray()), jSONObject);
                    this.l = listA;
                    for (com.applovin.impl.oe oeVar : listA) {
                        this.i.put(oeVar.b(), oeVar);
                    }
                    long j = com.applovin.impl.sdk.utils.StringUtils.parseLong(this.f1060a.f0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    com.applovin.impl.am amVar = new com.applovin.impl.am(listA, activity, this.f1060a);
                    if (j > 0) {
                        this.f1060a.i0().a(amVar, com.applovin.impl.tm.b.MEDIATION, j);
                    } else {
                        this.f1060a.i0().a(amVar);
                    }
                } catch (org.json.JSONException e) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                    com.applovin.impl.p6.a((java.lang.Throwable) e);
                }
            }
        }
    }

    public java.lang.Integer a(java.lang.String str) {
        java.lang.Integer num;
        synchronized (this.h) {
            num = (java.lang.Integer) this.g.get(str);
        }
        return num;
    }

    public java.util.Set a() {
        java.util.HashSet hashSet;
        synchronized (this.h) {
            hashSet = new java.util.HashSet(this.g.keySet());
        }
        return hashSet;
    }

    private java.util.List a(org.json.JSONArray jSONArray, org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new com.applovin.impl.oe(java.util.Collections.EMPTY_MAP, com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null), jSONObject, this.f1060a));
        }
        return arrayList;
    }

    public void a(com.applovin.mediation.adapter.MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.h) {
            this.g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", java.lang.Integer.valueOf(initializationStatus.getCode()));
        }
        this.f1060a.q().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
