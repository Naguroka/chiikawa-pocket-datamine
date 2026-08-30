package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f575a;
    private final java.lang.String b;
    private final com.applovin.impl.kr c;
    private final java.util.List d;
    private final java.util.List e;
    private boolean f = false;

    a0(org.json.JSONObject jSONObject, java.util.Map map, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.sdk.j jVar) {
        this.f575a = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "name", "");
        this.b = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "experiment", null);
        this.c = a(jSONObject);
        this.d = a("bidders", jSONObject, map, maxAdFormat, jVar);
        this.e = a(com.json.mediationsdk.d.h, jSONObject, map, maxAdFormat, jVar);
    }

    public java.lang.String c() {
        return this.f575a;
    }

    public java.lang.String b() {
        return this.b;
    }

    public com.applovin.impl.kr d() {
        return this.c;
    }

    public java.util.List a() {
        return this.d;
    }

    public java.util.List e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    private java.util.List a(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map map, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.je jeVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, str, new org.json.JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            if (jSONObject2 != null && (jeVar = (com.applovin.impl.je) map.get(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (jeVar.C()) {
                    this.f = true;
                }
                arrayList.add(new com.applovin.impl.ir(jSONObject2, maxAdFormat, jeVar, jVar));
            }
        }
        return arrayList;
    }

    private com.applovin.impl.kr a(org.json.JSONObject jSONObject) {
        return new com.applovin.impl.kr(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "targeting"));
    }
}
