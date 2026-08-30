package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class cq implements com.applovin.impl.hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f693a;

    public java.lang.String toString() {
        return "VastAdVerification{verifications='" + this.f693a + "'}";
    }

    private cq(java.util.List list) {
        this.f693a = list;
    }

    public static com.applovin.impl.cq a(com.applovin.impl.es esVar, com.applovin.impl.cq cqVar, com.applovin.impl.eq eqVar, com.applovin.impl.sdk.j jVar) {
        java.util.List arrayList;
        try {
            if (cqVar != null) {
                arrayList = cqVar.b();
            } else {
                arrayList = new java.util.ArrayList();
            }
            java.util.Iterator it = esVar.a("Verification").iterator();
            while (it.hasNext()) {
                com.applovin.impl.bq bqVarA = com.applovin.impl.bq.a((com.applovin.impl.es) it.next(), eqVar, jVar);
                if (bqVarA != null) {
                    arrayList.add(bqVarA);
                }
            }
            return new com.applovin.impl.cq(arrayList);
        } catch (java.lang.Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            jVar.D().a("VastAdVerifications", th);
            return null;
        }
    }

    public java.util.List b() {
        return this.f693a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.applovin.impl.cq) {
            return this.f693a.equals(((com.applovin.impl.cq) obj).f693a);
        }
        return false;
    }

    public int hashCode() {
        return this.f693a.hashCode();
    }

    static com.applovin.impl.cq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "verifications", new org.json.JSONArray());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            com.applovin.impl.bq bqVarA = com.applovin.impl.bq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null), jVar);
            if (bqVarA != null) {
                arrayList.add(bqVarA);
            }
        }
        return new com.applovin.impl.cq(arrayList);
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (this.f693a != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = this.f693a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.applovin.impl.bq) it.next()).a());
            }
            com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
