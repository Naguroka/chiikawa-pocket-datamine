package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class hq implements com.applovin.impl.hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f858a;
    private final java.lang.String b;

    public java.lang.String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f858a + "', javascriptResourceUrl='" + this.b + "'}";
    }

    private hq(java.lang.String str, java.lang.String str2) {
        this.f858a = str;
        this.b = str2;
    }

    public static com.applovin.impl.hq a(com.applovin.impl.es esVar, com.applovin.impl.sdk.j jVar) {
        if (esVar == null) {
            throw new java.lang.IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            try {
                return new com.applovin.impl.hq((java.lang.String) esVar.a().get("apiFramework"), esVar.d());
            } catch (java.lang.Throwable th) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("VastJavaScriptResource", "Error occurred while initializing", th);
                }
                jVar.D().a("VastJavaScriptResource", th);
                return null;
            }
        }
        throw new java.lang.IllegalArgumentException("No sdk specified.");
    }

    public java.lang.String b() {
        return this.f858a;
    }

    public java.lang.String c() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.applovin.impl.hq hqVar = (com.applovin.impl.hq) obj;
        java.lang.String str = this.f858a;
        if (str == null ? hqVar.f858a != null : !str.equals(hqVar.f858a)) {
            return false;
        }
        java.lang.String str2 = this.b;
        java.lang.String str3 = hqVar.b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        java.lang.String str = this.f858a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public static com.applovin.impl.hq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        return new com.applovin.impl.hq(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "api_framework", null), com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "api_framework", this.f858a);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "javascript_resource_url", this.b);
        return jSONObject;
    }
}
