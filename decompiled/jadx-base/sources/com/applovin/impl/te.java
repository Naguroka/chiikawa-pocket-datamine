package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class te implements com.applovin.impl.d4.e {
    private static java.lang.ref.WeakReference m;
    private static final java.util.concurrent.atomic.AtomicBoolean n = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1362a;
    private final com.applovin.impl.sdk.n b;
    private final android.content.Context c;
    private final com.applovin.impl.se d;
    private boolean h;
    private boolean j;
    private java.util.Map k;
    private final com.applovin.impl.y0 l;
    private final java.util.Map f = new java.util.HashMap();
    private final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean();
    private int i = 2;

    public java.lang.String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        java.lang.ref.WeakReference weakReference = m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public te(com.applovin.impl.sdk.j jVar) {
        this.f1362a = jVar;
        this.b = jVar.I();
        android.content.Context contextM = com.applovin.impl.sdk.j.m();
        this.c = contextM;
        com.applovin.impl.se seVar = new com.applovin.impl.se(contextM);
        this.d = seVar;
        this.l = new com.applovin.impl.y0(jVar, seVar);
    }

    public void e() {
        if (this.g.compareAndSet(false, true)) {
            this.f1362a.i0().a((com.applovin.impl.yl) new com.applovin.impl.mm(this, this.f1362a), com.applovin.impl.tm.b.OTHER);
        }
    }

    public boolean g() {
        return this.h;
    }

    public void h() {
        a((java.util.Map) null);
    }

    class a extends com.applovin.impl.p {
        a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            if (activity instanceof com.applovin.mediation.MaxDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Started mediation debugger");
                if (!com.applovin.impl.te.this.c() || com.applovin.impl.te.m.get() != activity) {
                    com.applovin.mediation.MaxDebuggerActivity maxDebuggerActivity = (com.applovin.mediation.MaxDebuggerActivity) activity;
                    java.lang.ref.WeakReference unused = com.applovin.impl.te.m = new java.lang.ref.WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(com.applovin.impl.te.this.d, com.applovin.impl.te.this.f1362a.e());
                }
                com.applovin.impl.te.n.set(false);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            if (activity instanceof com.applovin.mediation.MaxDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Mediation debugger destroyed");
                java.lang.ref.WeakReference unused = com.applovin.impl.te.m = null;
            }
        }
    }

    private void f() {
        this.f1362a.e().a(new com.applovin.impl.te.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        android.app.Activity activityM0 = this.f1362a.m0();
        if (activityM0 != null && !activityM0.isFinishing()) {
            new android.app.AlertDialog.Builder(activityM0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new android.content.DialogInterface.OnClickListener() { // from class: com.applovin.impl.te$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    this.f$0.a(dialogInterface, i);
                }
            }).setNegativeButton("DISMISS", (android.content.DialogInterface.OnClickListener) null).create().show();
        } else {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        }
    }

    private java.util.List a(org.json.JSONObject jSONObject, java.util.List list, com.applovin.impl.sdk.j jVar) {
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "ad_units", new org.json.JSONArray());
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.z(jSONObject2, this.f, jVar));
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    public java.util.List a(java.lang.String str) {
        java.util.Map map = this.k;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (java.util.List) this.k.get(str);
    }

    private java.util.List a(java.util.List list, com.applovin.impl.sdk.j jVar) {
        java.util.List<java.lang.String> adUnitIds;
        if (jVar.x0().get()) {
            adUnitIds = jVar.f0().getInitializationAdUnitIds();
        } else {
            adUnitIds = jVar.G() != null ? jVar.G().getAdUnitIds() : null;
        }
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(adUnitIds.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.applovin.impl.z zVar = (com.applovin.impl.z) it.next();
                if (adUnitIds.contains(zVar.c())) {
                    arrayList.add(zVar);
                }
            }
            return arrayList;
        }
        return java.util.Collections.emptyList();
    }

    private java.util.List a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "networks", new org.json.JSONArray());
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            if (jSONObject2 != null) {
                com.applovin.impl.je jeVar = new com.applovin.impl.je(jSONObject2, jVar);
                arrayList.add(jeVar);
                this.f.put(jeVar.b(), jeVar);
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    private java.util.List a(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : com.applovin.impl.sdk.utils.JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new java.util.ArrayList())) {
            com.applovin.impl.x0 x0Var = new com.applovin.impl.x0(str);
            if (x0Var.h()) {
                arrayList.add(x0Var);
            } else if (com.applovin.impl.sdk.n.a()) {
                this.b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.content.DialogInterface dialogInterface, int i) {
        h();
    }

    private void a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.je jeVar = (com.applovin.impl.je) it.next();
            if (jeVar.A() && jeVar.q() == com.applovin.impl.je.a.INVALID_INTEGRATION) {
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.te$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d();
                    }
                }, java.util.concurrent.TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    @Override // com.applovin.impl.d4.e
    public void a(java.lang.String str, org.json.JSONObject jSONObject, int i) {
        java.util.List listA = a(jSONObject, this.f1362a);
        java.util.List listA2 = a(jSONObject, listA, this.f1362a);
        java.util.List listA3 = a(listA2, this.f1362a);
        java.util.List listA4 = a(jSONObject);
        org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "alert", (org.json.JSONObject) null);
        this.d.a(listA, listA2, listA3, listA4, com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject2, com.ironsource.y8.h.D0, null), com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject2, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, null), com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "account_id", null), com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, "complies_with_google_families_policy", null), com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", java.lang.Boolean.TRUE).booleanValue(), this.f1362a);
        if (!listA4.isEmpty()) {
            this.l.a();
        }
        if (g()) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.te$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.h();
                }
            }, java.util.concurrent.TimeUnit.SECONDS.toMillis(this.i));
        } else {
            a(listA);
        }
    }

    public void a(boolean z, int i) {
        this.h = z;
        this.i = i;
    }

    public void a(java.util.Map map) {
        this.k = map;
        e();
        if (!c() && n.compareAndSet(false, true)) {
            if (!this.j) {
                f();
                this.j = true;
            }
            android.content.Intent intent = new android.content.Intent(this.c, (java.lang.Class<?>) com.applovin.mediation.MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.n.g("AppLovinSdk", "Starting mediation debugger...");
            this.c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    @Override // com.applovin.impl.d4.e
    public void a(java.lang.String str, int i, java.lang.String str2, org.json.JSONObject jSONObject) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.d.a(null, null, null, null, null, null, null, null, false, this.f1362a);
        this.g.set(false);
    }
}
