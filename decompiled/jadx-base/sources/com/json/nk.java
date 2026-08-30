package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class nk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f3094a;
    private org.json.JSONObject b;
    private java.lang.String c;
    private java.lang.String d;

    public nk(org.json.JSONObject jSONObject) {
        this.f3094a = jSONObject.optString(com.ironsource.y8.f.b);
        this.b = jSONObject.optJSONObject(com.ironsource.y8.f.c);
        this.c = jSONObject.optString("success");
        this.d = jSONObject.optString(com.ironsource.y8.f.e);
    }

    public java.lang.String a() {
        return this.d;
    }

    public java.lang.String b() {
        return this.f3094a;
    }

    public org.json.JSONObject c() {
        return this.b;
    }

    public java.lang.String d() {
        return this.c;
    }

    public org.json.JSONObject e() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.y8.f.b, this.f3094a);
            jSONObject.put(com.ironsource.y8.f.c, this.b);
            jSONObject.put("success", this.c);
            jSONObject.put(com.ironsource.y8.f.e, this.d);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
