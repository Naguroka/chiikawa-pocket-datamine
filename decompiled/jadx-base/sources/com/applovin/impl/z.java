package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class z implements java.lang.Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1551a;
    private final java.lang.String b;
    private final com.applovin.mediation.MaxAdFormat c;
    private final com.applovin.impl.a0 d;
    private final java.util.List f;

    public java.lang.String e() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n---------- ");
        sb.append(this.b).append(" ----------\nIdentifier - ").append(this.f1551a).append("\nFormat     - ").append(b());
        return sb.toString();
    }

    public z(org.json.JSONObject jSONObject, java.util.Map map, com.applovin.impl.sdk.j jVar) {
        this.f1551a = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "name", "");
        this.b = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "display_name", "");
        this.c = com.applovin.mediation.MaxAdFormat.formatFromString(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "format", null));
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "waterfalls", new org.json.JSONArray());
        this.f = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            if (jSONObject2 != null) {
                this.f.add(new com.applovin.impl.a0(jSONObject2, map, this.c, jVar));
            }
        }
        this.d = this.f.isEmpty() ? null : (com.applovin.impl.a0) this.f.get(0);
    }

    public java.lang.String c() {
        return this.f1551a;
    }

    public java.lang.String d() {
        return this.b;
    }

    public java.lang.String b() {
        com.applovin.mediation.MaxAdFormat maxAdFormat = this.c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public com.applovin.impl.a0 f() {
        return this.d;
    }

    public java.util.List g() {
        return this.f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.applovin.impl.z zVar) {
        return this.b.compareToIgnoreCase(zVar.b);
    }

    public com.applovin.mediation.MaxAdFormat a() {
        return this.c;
    }
}
