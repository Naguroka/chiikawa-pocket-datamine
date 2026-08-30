package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f1122a;
    private final org.json.JSONObject b;
    protected final org.json.JSONObject d;
    private final java.util.Map g;
    private final com.applovin.impl.tl h;
    protected final com.applovin.impl.tl i;
    private java.lang.String j;
    private java.lang.String k;
    private final java.lang.Object c = new java.lang.Object();
    protected final java.lang.Object f = new java.lang.Object();

    public java.lang.String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public oe(java.util.Map map, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new java.lang.IllegalArgumentException("No full response specified");
        }
        if (jSONObject != null) {
            this.f1122a = jVar;
            if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.i6)).booleanValue()) {
                this.h = new com.applovin.impl.tl(jSONObject2);
                this.i = new com.applovin.impl.tl(jSONObject);
                this.b = null;
                this.d = null;
            } else {
                this.b = jSONObject2;
                this.d = jSONObject;
                this.h = null;
                this.i = null;
            }
            this.g = map;
            return;
        }
        throw new java.lang.IllegalArgumentException("No ad object specified");
    }

    public org.json.JSONObject g() {
        org.json.JSONObject jSONObject;
        com.applovin.impl.tl tlVar = this.h;
        if (tlVar != null) {
            return tlVar.a();
        }
        synchronized (this.c) {
            jSONObject = this.b;
        }
        return jSONObject;
    }

    protected org.json.JSONObject a() {
        org.json.JSONObject jSONObject;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.a();
        }
        synchronized (this.f) {
            jSONObject = this.d;
        }
        return jSONObject;
    }

    public java.lang.String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public java.lang.String b() {
        return a("class", (java.lang.String) null);
    }

    protected java.lang.Boolean a(java.lang.String str, java.lang.Boolean bool) {
        java.lang.Boolean bool2;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.a(str, bool);
        }
        synchronized (this.f) {
            bool2 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.d, str, bool);
        }
        return bool2;
    }

    public java.lang.String c() {
        return a("name", (java.lang.String) null);
    }

    public java.lang.String k() {
        return c().split("_")[0];
    }

    public boolean p() {
        return a("is_testing", java.lang.Boolean.FALSE).booleanValue();
    }

    public java.lang.Boolean n() {
        java.lang.String str = this.f1122a.f0().getExtraParameters().get("huc");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return java.lang.Boolean.valueOf(str);
        }
        if (c("huc")) {
            return a("huc", java.lang.Boolean.FALSE);
        }
        return b("huc", (java.lang.Boolean) null);
    }

    public java.lang.Boolean o() {
        java.lang.String str = this.f1122a.f0().getExtraParameters().get("dns");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return java.lang.Boolean.valueOf(str);
        }
        if (c("dns")) {
            return a("dns", java.lang.Boolean.FALSE);
        }
        return b("dns", (java.lang.Boolean) null);
    }

    public java.lang.String d() {
        if (c("consent_string")) {
            return a("consent_string", (java.lang.String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (java.lang.String) null);
        }
        return this.f1122a.j0().k();
    }

    public boolean r() {
        return a("run_on_ui_thread", java.lang.Boolean.TRUE).booleanValue();
    }

    public java.util.Map i() {
        return this.g;
    }

    public android.os.Bundle l() {
        android.os.Bundle bundle;
        if (e("server_parameters") instanceof org.json.JSONObject) {
            com.applovin.impl.tl tlVar = this.i;
            if (tlVar != null) {
                bundle = (android.os.Bundle) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.oe$$ExternalSyntheticLambda0
                    @Override // androidx.arch.core.util.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.applovin.impl.oe.a((com.applovin.impl.tl) obj);
                    }
                });
            } else {
                bundle = com.applovin.impl.sdk.utils.JsonUtils.toBundle(a("server_parameters", (org.json.JSONObject) null));
            }
        } else {
            bundle = new android.os.Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f1122a.f0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    protected java.lang.Boolean b(java.lang.String str, java.lang.Boolean bool) {
        java.lang.Boolean bool2;
        com.applovin.impl.tl tlVar = this.h;
        if (tlVar != null) {
            return tlVar.a(str, bool);
        }
        synchronized (this.c) {
            bool2 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.b, str, bool);
        }
        return bool2;
    }

    public android.os.Bundle f() {
        return com.applovin.impl.sdk.utils.BundleUtils.getBundle("custom_parameters", new android.os.Bundle(), l());
    }

    private int j() {
        return a("mute_state", b("mute_state", ((java.lang.Integer) this.f1122a.a(com.applovin.impl.ue.q7)).intValue()));
    }

    public long m() {
        return a("adapter_timeout_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.N6)).longValue());
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public boolean s() {
        return a("eagerly_initialize", java.lang.Boolean.TRUE).booleanValue();
    }

    protected boolean d(java.lang.String str) {
        boolean zHas;
        com.applovin.impl.tl tlVar = this.h;
        if (tlVar != null) {
            return tlVar.a(str);
        }
        synchronized (this.c) {
            zHas = this.b.has(str);
        }
        return zHas;
    }

    public java.lang.String getPlacement() {
        return this.j;
    }

    public java.lang.String e() {
        return this.k;
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", java.lang.Boolean.FALSE).booleanValue();
    }

    protected boolean c(java.lang.String str) {
        boolean zHas;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.a(str);
        }
        synchronized (this.f) {
            zHas = this.d.has(str);
        }
        return zHas;
    }

    protected double a(java.lang.String str, float f) {
        double d;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.a(str, f);
        }
        synchronized (this.f) {
            d = com.applovin.impl.sdk.utils.JsonUtils.getDouble(this.d, str, f);
        }
        return d;
    }

    public void g(java.lang.String str) {
        this.j = str;
    }

    protected float b(java.lang.String str, float f) {
        float f2;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.a(str, f);
        }
        synchronized (this.f) {
            f2 = com.applovin.impl.sdk.utils.JsonUtils.getFloat(this.d, str, f);
        }
        return f2;
    }

    protected int b(java.lang.String str, int i) {
        int i2;
        com.applovin.impl.tl tlVar = this.h;
        if (tlVar != null) {
            return tlVar.a(str, i);
        }
        synchronized (this.c) {
            i2 = com.applovin.impl.sdk.utils.JsonUtils.getInt(this.b, str, i);
        }
        return i2;
    }

    protected java.lang.Object e(java.lang.String str) {
        java.lang.Object objOpt;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.b(str);
        }
        synchronized (this.f) {
            objOpt = this.d.opt(str);
        }
        return objOpt;
    }

    protected int a(java.lang.String str, int i) {
        int i2;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.a(str, i);
        }
        synchronized (this.f) {
            i2 = com.applovin.impl.sdk.utils.JsonUtils.getInt(this.d, str, i);
        }
        return i2;
    }

    protected void c(java.lang.String str, int i) {
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            tlVar.b(str, i);
            return;
        }
        synchronized (this.f) {
            com.applovin.impl.sdk.utils.JsonUtils.putInt(this.d, str, i);
        }
    }

    protected org.json.JSONArray b(java.lang.String str, org.json.JSONArray jSONArray) {
        org.json.JSONArray jSONArray2;
        com.applovin.impl.tl tlVar = this.h;
        if (tlVar != null) {
            return tlVar.a(str, jSONArray);
        }
        synchronized (this.c) {
            jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(this.b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void f(java.lang.String str) {
        this.k = str;
    }

    protected org.json.JSONArray a(java.lang.String str, org.json.JSONArray jSONArray) {
        org.json.JSONArray jSONArray2;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.a(str, jSONArray);
        }
        synchronized (this.f) {
            jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(this.d, str, jSONArray);
        }
        return jSONArray2;
    }

    protected long b(java.lang.String str, long j) {
        long j2;
        com.applovin.impl.tl tlVar = this.h;
        if (tlVar != null) {
            return tlVar.a(str, j);
        }
        synchronized (this.c) {
            j2 = com.applovin.impl.sdk.utils.JsonUtils.getLong(this.b, str, j);
        }
        return j2;
    }

    protected void c(java.lang.String str, long j) {
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            tlVar.b(str, j);
            return;
        }
        synchronized (this.f) {
            com.applovin.impl.sdk.utils.JsonUtils.putLong(this.d, str, j);
        }
    }

    protected org.json.JSONObject a(java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.a(str, jSONObject);
        }
        synchronized (this.f) {
            jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(this.d, str, jSONObject);
        }
        return jSONObject2;
    }

    protected void c(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            tlVar.b(str, str2);
            return;
        }
        synchronized (this.f) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(this.d, str, str2);
        }
    }

    protected long a(java.lang.String str, long j) {
        long j2;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.a(str, j);
        }
        synchronized (this.f) {
            j2 = com.applovin.impl.sdk.utils.JsonUtils.getLong(this.d, str, j);
        }
        return j2;
    }

    public java.util.List b(java.lang.String str) {
        java.util.List listOptList;
        java.util.List listOptList2;
        if (str != null) {
            com.applovin.impl.tl tlVar = this.h;
            if (tlVar != null) {
                listOptList = tlVar.b(str, java.util.Collections.emptyList());
            } else {
                listOptList = com.applovin.impl.sdk.utils.JsonUtils.optList(b(str, new org.json.JSONArray()), java.util.Collections.emptyList());
            }
            com.applovin.impl.tl tlVar2 = this.i;
            if (tlVar2 != null) {
                listOptList2 = tlVar2.b(str, java.util.Collections.emptyList());
            } else {
                listOptList2 = com.applovin.impl.sdk.utils.JsonUtils.optList(a(str, new org.json.JSONArray()), java.util.Collections.emptyList());
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(listOptList.size() + listOptList2.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new java.lang.IllegalArgumentException("No key specified");
    }

    protected java.lang.String b(java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        com.applovin.impl.tl tlVar = this.h;
        if (tlVar != null) {
            return tlVar.a(str, str2);
        }
        synchronized (this.c) {
            string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, str, str2);
        }
        return string;
    }

    public java.lang.String a(java.lang.String str) {
        java.lang.String strA = a(str, "");
        return com.applovin.impl.sdk.utils.StringUtils.isValidString(strA) ? strA : b(str, "");
    }

    protected java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return tlVar.a(str, str2);
        }
        synchronized (this.f) {
            string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.d, str, str2);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ android.os.Bundle a(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.toBundle(tlVar.a("server_parameters", (org.json.JSONObject) null));
    }

    protected void a(java.lang.String str, java.lang.Object obj) {
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            tlVar.a(str, obj);
            return;
        }
        synchronized (this.f) {
            com.applovin.impl.sdk.utils.JsonUtils.putObject(this.d, str, obj);
        }
    }
}
