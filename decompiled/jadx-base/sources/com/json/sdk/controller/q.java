package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class q {
    private static final java.lang.String b = "q";
    private static final java.lang.String c = "getPermissions";
    private static final java.lang.String d = "isPermissionGranted";
    private static final java.lang.String e = "permissions";
    private static final java.lang.String f = "permission";
    private static final java.lang.String g = "status";
    private static final java.lang.String h = "functionName";
    private static final java.lang.String i = "functionParams";
    private static final java.lang.String j = "success";
    private static final java.lang.String k = "fail";
    private static final java.lang.String l = "unhandledPermission";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f3347a;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f3348a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private b() {
        }
    }

    public q(android.content.Context context) {
        this.f3347a = context;
    }

    private com.ironsource.sdk.controller.q.b a(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        com.ironsource.sdk.controller.q.b bVar = new com.ironsource.sdk.controller.q.b();
        bVar.f3348a = jSONObject.optString("functionName");
        bVar.b = jSONObject.optJSONObject("functionParams");
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    void a(java.lang.String str, com.json.mk mkVar) throws java.lang.Exception {
        com.ironsource.sdk.controller.q.b bVarA = a(str);
        if (c.equals(bVarA.f3348a)) {
            a(bVarA.b, bVarA, mkVar);
        } else if (d.equals(bVarA.f3348a)) {
            b(bVarA.b, bVarA, mkVar);
        } else {
            com.json.sdk.utils.Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
        }
    }

    public void a(org.json.JSONObject jSONObject, com.ironsource.sdk.controller.q.b bVar, com.json.mk mkVar) {
        com.json.br brVar = new com.json.br();
        try {
            brVar.a(e, com.json.z3.a(this.f3347a, jSONObject.getJSONArray(e)));
            mkVar.a(true, bVar.c, brVar);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            com.json.sdk.utils.Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            brVar.b("errMsg", e2.getMessage());
            mkVar.a(false, bVar.d, brVar);
        }
    }

    public void b(org.json.JSONObject jSONObject, com.ironsource.sdk.controller.q.b bVar, com.json.mk mkVar) {
        java.lang.String str;
        boolean z;
        com.json.br brVar = new com.json.br();
        try {
            java.lang.String string = jSONObject.getString(f);
            brVar.b(f, string);
            if (com.json.z3.d(this.f3347a, string)) {
                brVar.b("status", java.lang.String.valueOf(com.json.z3.c(this.f3347a, string)));
                str = bVar.c;
                z = true;
            } else {
                brVar.b("status", l);
                str = bVar.d;
                z = false;
            }
            mkVar.a(z, str, brVar);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            brVar.b("errMsg", e2.getMessage());
            mkVar.a(false, bVar.d, brVar);
        }
    }
}
