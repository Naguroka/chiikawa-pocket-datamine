package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class dq implements com.applovin.impl.hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f739a;
    private int b;
    private android.net.Uri c;
    private com.applovin.impl.iq d;
    private final java.util.Set f = new java.util.HashSet();
    private final java.util.Map g = new java.util.HashMap();

    public java.lang.String toString() {
        return "VastCompanionAd{width=" + this.f739a + ", height=" + this.b + ", destinationUri=" + this.c + ", nonVideoResource=" + this.d + ", clickTrackers=" + this.f + ", eventTrackers=" + this.g + '}';
    }

    private dq() {
    }

    public static com.applovin.impl.dq a(com.applovin.impl.es esVar, com.applovin.impl.dq dqVar, com.applovin.impl.eq eqVar, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.es esVarC;
        if (esVar == null) {
            throw new java.lang.IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            if (dqVar == null) {
                try {
                    dqVar = new com.applovin.impl.dq();
                } catch (java.lang.Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("VastCompanionAd", "Error occurred while initializing", th);
                    }
                    jVar.D().a("VastCompanionAd", th);
                    return null;
                }
            }
            if (dqVar.f739a == 0 && dqVar.b == 0) {
                int i = com.applovin.impl.sdk.utils.StringUtils.parseInt((java.lang.String) esVar.a().get("width"));
                int i2 = com.applovin.impl.sdk.utils.StringUtils.parseInt((java.lang.String) esVar.a().get("height"));
                if (i > 0 && i2 > 0) {
                    dqVar.f739a = i;
                    dqVar.b = i2;
                }
            }
            dqVar.d = com.applovin.impl.iq.a(esVar, dqVar.d, jVar);
            if (dqVar.c == null && (esVarC = esVar.c("CompanionClickThrough")) != null) {
                java.lang.String strD = esVarC.d();
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strD)) {
                    dqVar.c = android.net.Uri.parse(strD);
                }
            }
            com.applovin.impl.mq.a(esVar.a("CompanionClickTracking"), dqVar.f, eqVar, jVar);
            com.applovin.impl.mq.a(esVar, dqVar.g, eqVar, jVar);
            return dqVar;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified.");
    }

    public android.net.Uri c() {
        return this.c;
    }

    public com.applovin.impl.iq e() {
        return this.d;
    }

    public java.util.Set b() {
        return this.f;
    }

    public java.util.Map d() {
        return this.g;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.dq)) {
            return false;
        }
        com.applovin.impl.dq dqVar = (com.applovin.impl.dq) obj;
        if (this.f739a != dqVar.f739a || this.b != dqVar.b) {
            return false;
        }
        android.net.Uri uri = this.c;
        if (uri == null ? dqVar.c != null : !uri.equals(dqVar.c)) {
            return false;
        }
        com.applovin.impl.iq iqVar = this.d;
        if (iqVar == null ? dqVar.d != null : !iqVar.equals(dqVar.d)) {
            return false;
        }
        java.util.Set set = this.f;
        if (set == null ? dqVar.f != null : !set.equals(dqVar.f)) {
            return false;
        }
        java.util.Map map = this.g;
        java.util.Map map2 = dqVar.g;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public int hashCode() {
        int i = ((this.f739a * 31) + this.b) * 31;
        android.net.Uri uri = this.c;
        int iHashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        com.applovin.impl.iq iqVar = this.d;
        int iHashCode2 = (iHashCode + (iqVar != null ? iqVar.hashCode() : 0)) * 31;
        java.util.Set set = this.f;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        java.util.Map map = this.g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public static com.applovin.impl.dq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        int i = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "height", 0);
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "destination_uri", null);
        android.net.Uri uri = com.applovin.impl.sdk.utils.StringUtils.isValidString(string) ? android.net.Uri.parse(string) : null;
        com.applovin.impl.iq iqVarA = com.applovin.impl.iq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "non_video_resource", (org.json.JSONObject) null), jVar);
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "click_trackers", new org.json.JSONArray());
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            com.applovin.impl.kq kqVarA = com.applovin.impl.kq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i3, (org.json.JSONObject) null), jVar);
            if (kqVarA != null) {
                hashSet.add(kqVarA);
            }
        }
        com.applovin.impl.dq dqVar = new com.applovin.impl.dq();
        dqVar.f739a = i;
        dqVar.b = i2;
        dqVar.c = uri;
        dqVar.d = iqVarA;
        dqVar.f.addAll(hashSet);
        return dqVar;
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject, "width", this.f739a);
        com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject, "height", this.b);
        android.net.Uri uri = this.c;
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        com.applovin.impl.iq iqVar = this.d;
        com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "non_video_resource", iqVar != null ? iqVar.a() : null);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            jSONArray.put(((com.applovin.impl.kq) it.next()).a());
        }
        com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
