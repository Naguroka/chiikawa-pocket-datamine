package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class vj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.json.ge f3502a = new com.json.ge();

    public void a(int i) {
        this.f3502a.a(com.json.ce.Y, java.lang.Integer.valueOf(i));
    }

    public void a(android.content.Context context) {
        this.f3502a.a(context);
    }

    public void a(com.json.bg bgVar) {
        try {
            java.util.HashMap map = new java.util.HashMap();
            map.put(com.json.ce.x, bgVar.a());
            map.put(com.json.ce.w, bgVar.b());
            map.put(com.json.ce.M, bgVar.c());
            this.f3502a.a(map);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
        }
    }

    public void a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.json.mediationsdk.WaterfallConfiguration waterfallConfiguration) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (waterfallConfiguration != null) {
            try {
                jSONObject.put(com.json.ce.j1, waterfallConfiguration.getFloor());
                jSONObject.put(com.json.ce.k1, waterfallConfiguration.getCeiling());
            } catch (org.json.JSONException e) {
                com.json.l9.d().a(e);
            }
        }
        if (jSONObject.length() == 0) {
            this.f3502a.a(com.json.ce.i1, com.json.u2.a(ad_unit));
        } else {
            this.f3502a.a(com.json.ce.i1, jSONObject, com.json.u2.a(ad_unit));
        }
    }

    public void a(java.lang.Boolean bool) {
        this.f3502a.a(com.json.ce.J0, bool);
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f3502a.a(com.json.ce.E0, str);
    }

    public void a(org.json.JSONObject jSONObject) {
        this.f3502a.a(com.json.ce.s, (java.lang.Object) jSONObject);
    }

    public void a(boolean z) {
        this.f3502a.a(com.json.ce.G0, java.lang.Boolean.valueOf(z));
    }

    public void b(int i) {
        if (i >= 0) {
            this.f3502a.a(com.json.ce.I0, java.lang.Integer.valueOf(i));
        }
    }

    public void b(java.lang.String str) {
        this.f3502a.a(com.json.ce.z0, str);
    }

    public void b(org.json.JSONObject jSONObject) {
        this.f3502a.a(com.json.ce.U0, (java.lang.Object) jSONObject);
    }

    public void b(boolean z) {
        this.f3502a.a("gpi", java.lang.Boolean.valueOf(z));
    }

    public void c(int i) {
        this.f3502a.a(com.json.ce.W, java.lang.Integer.valueOf(i));
    }

    public void c(java.lang.String str) {
        this.f3502a.a(com.json.ce.B0, str);
    }

    public void d(java.lang.String str) {
        this.f3502a.a(com.json.mediationsdk.metadata.a.i, str);
    }

    public void e(java.lang.String str) {
        this.f3502a.a(com.json.ce.P0, str);
    }

    public void f(java.lang.String str) {
        this.f3502a.a(com.json.ce.u, str);
    }

    public void g(java.lang.String str) {
        this.f3502a.a(com.json.ce.E, str);
    }

    public void h(java.lang.String str) {
        this.f3502a.a("sid", str);
    }

    public void i(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f3502a.a(com.json.ce.V, str);
    }
}
