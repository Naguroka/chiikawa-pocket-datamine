package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class bq implements com.applovin.impl.hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f659a;
    private final java.util.List b;
    private final java.lang.String c;
    private final java.util.Set d;

    public java.lang.String toString() {
        return "VastAdVerification{vendorId='" + this.f659a + "'javascriptResources='" + this.b + "'verificationParameters='" + this.c + "'errorEventTrackers='" + this.d + "'}";
    }

    private bq(java.lang.String str, java.util.List list, java.lang.String str2, java.util.Set set) {
        this.f659a = str;
        this.b = list;
        this.c = str2;
        this.d = set;
    }

    public static com.applovin.impl.bq a(com.applovin.impl.es esVar, com.applovin.impl.eq eqVar, com.applovin.impl.sdk.j jVar) {
        try {
            java.lang.String str = (java.lang.String) esVar.a().get("vendor");
            com.applovin.impl.es esVarB = esVar.b("VerificationParameters");
            java.lang.String strD = esVarB != null ? esVarB.d() : null;
            java.util.List listA = esVar.a("JavaScriptResource");
            java.util.ArrayList arrayList = new java.util.ArrayList(listA.size());
            java.util.Iterator it = listA.iterator();
            while (it.hasNext()) {
                com.applovin.impl.hq hqVarA = com.applovin.impl.hq.a((com.applovin.impl.es) it.next(), jVar);
                if (hqVarA != null) {
                    arrayList.add(hqVarA);
                }
            }
            java.util.HashMap map = new java.util.HashMap();
            com.applovin.impl.mq.a(esVar, map, eqVar, jVar);
            return new com.applovin.impl.bq(str, arrayList, strD, (java.util.Set) map.get("verificationNotExecuted"));
        } catch (java.lang.Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("VastAdVerification", "Error occurred while initializing", th);
            }
            jVar.D().a("VastAdVerification", th);
            return null;
        }
    }

    public java.lang.String d() {
        return this.f659a;
    }

    public java.util.List c() {
        return this.b;
    }

    public java.lang.String e() {
        return this.c;
    }

    public java.util.Set b() {
        return this.d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.applovin.impl.bq bqVar = (com.applovin.impl.bq) obj;
        java.lang.String str = this.f659a;
        if (str == null ? bqVar.f659a != null : !str.equals(bqVar.f659a)) {
            return false;
        }
        java.util.List list = this.b;
        if (list == null ? bqVar.b != null : !list.equals(bqVar.b)) {
            return false;
        }
        java.lang.String str2 = this.c;
        if (str2 == null ? bqVar.c != null : !str2.equals(bqVar.c)) {
            return false;
        }
        java.util.Set set = this.d;
        java.util.Set set2 = bqVar.d;
        if (set != null) {
            return set.equals(set2);
        }
        return set2 == null;
    }

    public int hashCode() {
        java.lang.String str = this.f659a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.util.List list = this.b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        java.lang.String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.util.Set set = this.d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public static com.applovin.impl.bq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "vendor_id", null);
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "javascript_resources", new org.json.JSONArray());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            com.applovin.impl.hq hqVarA = com.applovin.impl.hq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null), jVar);
            if (hqVarA != null) {
                arrayList.add(hqVarA);
            }
        }
        java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "verification_parameters", null);
        org.json.JSONArray jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new org.json.JSONArray());
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            com.applovin.impl.kq kqVarA = com.applovin.impl.kq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray2, i2, (org.json.JSONObject) null), jVar);
            if (kqVarA != null) {
                hashSet.add(kqVarA);
            }
        }
        return new com.applovin.impl.bq(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "vendor_id", this.f659a);
        if (this.b != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.applovin.impl.hq) it.next()).a());
            }
            com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "verification_parameters", this.c);
        if (this.d != null) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((com.applovin.impl.kq) it2.next()).a());
            }
            com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
