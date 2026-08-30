package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class i {
    private static final java.lang.String c = "i";
    private static final java.lang.String d = "getDeviceData";
    private static final java.lang.String e = "deviceDataFunction";
    private static final java.lang.String f = "deviceDataParams";
    private static final java.lang.String g = "success";
    private static final java.lang.String h = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f3321a;
    private final com.json.Cif b = com.json.im.S().f();

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f3322a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private b() {
        }
    }

    public i(android.content.Context context) {
        this.f3321a = context;
    }

    private com.json.br a() {
        com.json.br brVar = new com.json.br();
        brVar.b(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.i0), com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.c())));
        brVar.b(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.j0), com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.h(this.f3321a))));
        brVar.b(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.k0), com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.H(this.f3321a))));
        brVar.b(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.l0), com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.l(this.f3321a))));
        brVar.b(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.m0), com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.c(this.f3321a))));
        brVar.b(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.n0), com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.d(this.f3321a))));
        return brVar;
    }

    private com.ironsource.sdk.controller.i.b a(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        com.ironsource.sdk.controller.i.b bVar = new com.ironsource.sdk.controller.i.b();
        bVar.f3322a = jSONObject.optString(e);
        bVar.b = jSONObject.optJSONObject(f);
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    void a(java.lang.String str, com.json.mk mkVar) throws java.lang.Exception {
        com.ironsource.sdk.controller.i.b bVarA = a(str);
        if (d.equals(bVarA.f3322a)) {
            mkVar.a(true, bVarA.c, a());
        } else {
            com.json.sdk.utils.Logger.i(c, "unhandled API request " + str);
        }
    }
}
