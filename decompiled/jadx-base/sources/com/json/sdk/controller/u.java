package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class u {
    private static final java.lang.String d = "u";
    private static final java.lang.String e = "updateToken";
    private static final java.lang.String f = "getToken";
    private static final java.lang.String g = "functionName";
    private static final java.lang.String h = "functionParams";
    private static final java.lang.String i = "success";
    private static final java.lang.String j = "fail";
    private android.content.Context b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.ln f3353a = new com.json.ln();
    private com.json.yu c = new com.json.yu();

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f3354a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private b() {
        }
    }

    public u(android.content.Context context) {
        this.b = context;
    }

    private com.ironsource.sdk.controller.u.b a(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        com.ironsource.sdk.controller.u.b bVar = new com.ironsource.sdk.controller.u.b();
        bVar.f3354a = jSONObject.optString("functionName");
        bVar.b = jSONObject.optJSONObject("functionParams");
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString("fail");
        return bVar;
    }

    private void a(com.ironsource.sdk.controller.u.b bVar, com.json.mk mkVar) {
        try {
            org.json.JSONObject jSONObjectA = this.c.a();
            java.util.Iterator<java.lang.String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object obj = jSONObjectA.get(next);
                if (obj instanceof java.lang.String) {
                    jSONObjectA.put(next, com.json.environment.StringUtils.encodeURI((java.lang.String) obj));
                }
            }
            mkVar.a(true, bVar.c, jSONObjectA);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            mkVar.a(false, bVar.d, e2.getMessage());
        }
    }

    void a(java.lang.String str, com.json.mk mkVar) throws java.lang.Exception {
        com.ironsource.sdk.controller.u.b bVarA = a(str);
        if (e.equals(bVarA.f3354a)) {
            a(bVarA.b, bVarA, mkVar);
        } else if (f.equals(bVarA.f3354a)) {
            a(bVarA, mkVar);
        } else {
            com.json.sdk.utils.Logger.i(d, "unhandled API request " + str);
        }
    }

    public void a(org.json.JSONObject jSONObject, com.ironsource.sdk.controller.u.b bVar, com.json.mk mkVar) {
        com.json.br brVar = new com.json.br();
        try {
            this.f3353a.a(jSONObject);
            mkVar.a(true, bVar.c, brVar);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            com.json.sdk.utils.Logger.i(d, "updateToken exception " + e2.getMessage());
            mkVar.a(false, bVar.d, brVar);
        }
    }
}
