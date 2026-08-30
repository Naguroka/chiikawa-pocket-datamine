package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class jq implements com.applovin.impl.hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f932a;
    private java.lang.String b;

    private jq() {
    }

    public java.lang.String toString() {
        return "VastSystemInfo{name='" + this.f932a + "', version='" + this.b + "'}";
    }

    public static com.applovin.impl.jq a(com.applovin.impl.es esVar, com.applovin.impl.jq jqVar, com.applovin.impl.sdk.j jVar) {
        if (esVar == null) {
            throw new java.lang.IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            if (jqVar == null) {
                try {
                    jqVar = new com.applovin.impl.jq();
                } catch (java.lang.Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("VastSystemInfo", "Error occurred while initializing", th);
                    }
                    jVar.D().a("VastSystemInfo", th);
                    return null;
                }
            }
            if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(jqVar.f932a)) {
                java.lang.String strD = esVar.d();
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strD)) {
                    jqVar.f932a = strD;
                }
            }
            if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(jqVar.b)) {
                java.lang.String str = (java.lang.String) esVar.a().get("version");
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                    jqVar.b = str;
                }
            }
            return jqVar;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified.");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.jq)) {
            return false;
        }
        com.applovin.impl.jq jqVar = (com.applovin.impl.jq) obj;
        java.lang.String str = this.f932a;
        if (str == null ? jqVar.f932a != null : !str.equals(jqVar.f932a)) {
            return false;
        }
        java.lang.String str2 = this.b;
        java.lang.String str3 = jqVar.b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        java.lang.String str = this.f932a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public static com.applovin.impl.jq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        com.applovin.impl.jq jqVar = new com.applovin.impl.jq();
        jqVar.f932a = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "name", null);
        jqVar.b = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "version", null);
        return jqVar;
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "name", this.f932a);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "version", this.b);
        return jSONObject;
    }
}
