package com.json;

/* JADX INFO: loaded from: classes5.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2597a = "eventId";
    private final java.lang.String b = com.ironsource.aa.a.d;
    private final java.lang.String c = "InterstitialEvents";
    private final java.lang.String d = "events";
    private final java.lang.String e = "events";
    org.json.JSONObject f;
    int g;
    private java.lang.String h;

    e() {
    }

    private java.lang.String a(int i) {
        return i != 2 ? "events" : "InterstitialEvents";
    }

    protected abstract java.lang.String a();

    public abstract java.lang.String a(java.util.ArrayList<com.json.wb> arrayList, org.json.JSONObject jSONObject);

    java.lang.String a(org.json.JSONArray jSONArray) {
        try {
            if (this.f != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f.toString());
                jSONObject.put(com.ironsource.aa.a.d, com.json.mediationsdk.utils.IronSourceUtils.getTimestamp());
                jSONObject.put(a(this.g), jSONArray);
                return jSONObject.toString();
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
        }
        return "";
    }

    org.json.JSONObject a(com.json.wb wbVar) {
        try {
            java.lang.String strA = wbVar.a();
            org.json.JSONObject jSONObject = !android.text.TextUtils.isEmpty(strA) ? new org.json.JSONObject(strA) : new org.json.JSONObject();
            jSONObject.put("eventId", wbVar.c());
            jSONObject.put(com.ironsource.aa.a.d, wbVar.d());
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    void a(java.lang.String str) {
        this.h = str;
    }

    java.lang.String b() {
        return android.text.TextUtils.isEmpty(this.h) ? a() : this.h;
    }

    public abstract java.lang.String c();
}
