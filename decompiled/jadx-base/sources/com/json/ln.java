package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ln {
    private final com.json.Cif b = com.json.im.S().f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.json.ge f2895a = new com.json.ge();

    public void a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject(com.json.sdk.utils.IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f2895a.a("debug", jSONObject);
        }
    }

    public void a(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            this.f2895a.a(com.json.ce.n, java.lang.Boolean.valueOf(this.b.a((android.app.Activity) context)));
        }
    }

    public void a(com.ironsource.zg.c cVar) {
        this.f2895a.a(com.json.ce.n1, java.lang.Integer.valueOf(cVar.ordinal()));
    }

    public void a(java.util.List<java.lang.String> list) {
        this.f2895a.a(com.json.ce.q1, list);
    }

    public void a(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        for (java.util.Map.Entry<java.lang.String, org.json.JSONObject> entry : map.entrySet()) {
            this.f2895a.a(entry.getKey(), (java.lang.Object) entry.getValue());
        }
    }

    public void a(org.json.JSONObject jSONObject) {
        this.f2895a.a(com.json.ce.l, jSONObject);
    }

    public void a(boolean z) {
        this.f2895a.a(com.json.ce.H0, java.lang.Boolean.valueOf(z));
    }

    public void b() {
        java.lang.String controllerConfig = com.json.sdk.utils.SDKUtils.getControllerConfig();
        if (android.text.TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f2895a.a(com.json.ce.i, new org.json.JSONObject(controllerConfig).opt(com.ironsource.y8.a.q));
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public void b(android.content.Context context) {
        this.f2895a.a("gpi", java.lang.Boolean.valueOf(com.json.zo.d(context)));
    }

    public void c() {
        this.f2895a.a("uxt", java.lang.Boolean.valueOf(com.json.sdk.utils.IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f2895a.a(com.json.ce.M, "8.6.1");
    }

    public void e() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.ce.x, com.json.Cdo.f);
        map.put(com.json.ce.w, com.json.Cdo.e);
        this.f2895a.a(map);
    }
}
